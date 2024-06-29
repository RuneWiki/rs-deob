import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class177 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "[Ljava/lang/String;")
    private static String[] field2417 = new String[1000];

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    private static int field2420 = 0;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[Lch;")
    private static class271[] field2430 = new class271[50];

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "[I")
    private static int[] field2421 = new int[5];

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "[[I")
    private static int[][] field2432 = new int[5][5000];

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "[I")
    private static int[] field2436 = new int[1000];

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2423 = Calendar.getInstance();

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field2440 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[I")
    private static int[] field2442 = new int[3];

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "Lbj;")
    public static class131 field2441 = new class131(4);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Lgk;")
    private static class279 field2425;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "Lms;")
    private static class453 field2433;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "Lms;")
    private static class453 field2434;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "[I")
    private static int[] field2426;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field2419;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static final void method1164(int arg0) {
        if (arg0 == -1 || !class16.method238(arg0, 21)) {
            return;
        }
        class453[] var1 = class143.field2057[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class453 var3 = var1[var2];
            if (var3.field6423 != null) {
                class7 var4 = new class7();
                var4.field95 = var3;
                var4.field97 = var3.field6423;
                method1169(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
    public static void method1165() {
        field2426 = null;
        field2419 = null;
        field2421 = null;
        field2432 = null;
        field2436 = null;
        field2417 = null;
        field2430 = null;
        field2434 = null;
        field2433 = null;
        field2425 = null;
        field2423 = null;
        field2440 = null;
        field2442 = null;
        field2441 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
    public static final void method1166(int arg0, int arg1, int arg2) {
        class253 var3 = class28.method305(false, arg1, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field2426 = new int[var3.field3569];
        field2419 = new String[var3.field3566];
        if (var3.field3564 == 15 || var3.field3564 == 17 || var3.field3564 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class437.field6152 != null) {
                var4 = class437.field6152.field6363;
                var5 = class437.field6152.field6418;
            }
            field2426[0] = class239.field3410.method1071((byte) -12) - var4;
            field2426[1] = class239.field3410.method1068((byte) -71) - var5;
        }
        method1167(var3, 200000);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lks;I)V")
    private static final void method1167(class253 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field3557;
        int[] var6 = arg0.field3571;
        byte var7 = -1;
        field2420 = 0;
        try {
            int var8 = 0;
            label4487: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var621 = var5[var4];
                if (var621 < 100) {
                    if (var621 == 0) {
                        field2436[var2++] = var6[var4];
                        continue;
                    }
                    if (var621 == 1) {
                        int var9 = var6[var4];
                        field2436[var2++] = class297.field4156[var9];
                        continue;
                    }
                    if (var621 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class117.method811((byte) 114, field2436[var2], var10);
                        continue;
                    }
                    if (var621 == 3) {
                        field2417[var3++] = arg0.field3565[var4];
                        continue;
                    }
                    if (var621 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var621 == 7) {
                        var2 -= 2;
                        if (field2436[var2 + 1] != field2436[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 8) {
                        var2 -= 2;
                        if (field2436[var2 + 1] == field2436[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 9) {
                        var2 -= 2;
                        if (field2436[var2] < field2436[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 10) {
                        var2 -= 2;
                        if (field2436[var2] > field2436[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 21) {
                        if (field2420 == 0) {
                            return;
                        }
                        class271 var11 = field2430[--field2420];
                        arg0 = var11.field3760;
                        var5 = arg0.field3557;
                        var6 = arg0.field3571;
                        var4 = var11.field3763;
                        field2426 = var11.field3766;
                        field2419 = var11.field3761;
                        continue;
                    }
                    if (var621 == 25) {
                        int var12 = var6[var4];
                        field2436[var2++] = class386.method2445((byte) -97, var12);
                        continue;
                    }
                    if (var621 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class327.method2107((byte) -105, var13, field2436[var2]);
                        continue;
                    }
                    if (var621 == 31) {
                        var2 -= 2;
                        if (field2436[var2] <= field2436[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 32) {
                        var2 -= 2;
                        if (field2436[var2] >= field2436[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 33) {
                        field2436[var2++] = field2426[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var621 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field2426[var10001] = field2436[var2];
                        continue;
                    }
                    if (var621 == 35) {
                        field2417[var3++] = field2419[var6[var4]];
                        continue;
                    }
                    if (var621 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field2419[var10001] = field2417[var3];
                        continue;
                    }
                    if (var621 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class206.method1341(var14, field2417, -12229, var3);
                        field2417[var3++] = var15;
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
                        class253 var17 = class411.method2576(var16, 0);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field3569];
                        String[] var19 = new String[var17.field3566];
                        for (int var20 = 0; var20 < var17.field3570; var20++) {
                            var18[var20] = field2436[var2 + var20 - var17.field3570];
                        }
                        for (int var21 = 0; var21 < var17.field3558; var21++) {
                            var19[var21] = field2417[var3 + var21 - var17.field3558];
                        }
                        var2 -= var17.field3570;
                        var3 -= var17.field3558;
                        class271 var22 = new class271();
                        var22.field3760 = arg0;
                        var22.field3763 = var4;
                        var22.field3766 = field2426;
                        var22.field3761 = field2419;
                        if (field2420 >= field2430.length) {
                            throw new RuntimeException();
                        }
                        field2430[field2420++] = var22;
                        arg0 = var17;
                        var5 = var17.field3557;
                        var6 = var17.field3571;
                        var4 = -1;
                        field2426 = var18;
                        field2419 = var19;
                        continue;
                    }
                    if (var621 == 42) {
                        field2436[var2++] = class389.field5580[var6[var4]];
                        continue;
                    }
                    if (var621 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class389.field5580[var23] = field2436[var2];
                        class284.method1854(var23, -100001);
                        class290.field4075 |= class15.field291[var23];
                        continue;
                    }
                    if (var621 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field2436[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field2421[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4487;
                                }
                                field2432[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field2436[var2];
                        if (var30 >= 0 && var30 < field2421[var29]) {
                            field2436[var2++] = field2432[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field2436[var2];
                        if (var32 >= 0 && var32 < field2421[var31]) {
                            field2432[var31][var32] = field2436[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 47) {
                        String var33 = class35.field545[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field2417[var3++] = var33;
                        continue;
                    }
                    if (var621 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class35.field545[var34] = field2417[var3];
                        class54.method442((byte) 41, var34);
                        continue;
                    }
                    if (var621 == 51) {
                        class129 var35 = arg0.field3567[var6[var4]];
                        var2--;
                        class406 var36 = (class406) var35.method886((long) field2436[var2], 25651);
                        if (var36 != null) {
                            var4 += var36.field5773;
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
                        int var38 = field2436[var2];
                        int var39 = field2436[var2 + 1];
                        int var40 = field2436[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class453 var41 = class442.method2767(var38, -1229996208);
                        if (var41.field6382 == null) {
                            var41.field6382 = new class453[var40 + 1];
                        }
                        if (var41.field6382.length <= var40) {
                            class453[] var42 = new class453[var40 + 1];
                            for (int var43 = 0; var43 < var41.field6382.length; var43++) {
                                var42[var43] = var41.field6382[var43];
                            }
                            var41.field6382 = var42;
                        }
                        if (var40 > 0 && var41.field6382[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class453 var44 = new class453();
                        var44.field6356 = var39;
                        var44.field6470 = var44.field6314 = var41.field6314;
                        var44.field6406 = var40;
                        var41.field6382[var40] = var44;
                        if (var37) {
                            field2433 = var44;
                        } else {
                            field2434 = var44;
                        }
                        class404.method2531(26878, var41);
                        continue;
                    }
                    if (var621 == 101) {
                        class453 var45 = var37 ? field2433 : field2434;
                        if (var45.field6406 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class453 var46 = class442.method2767(var45.field6314, -1229996208);
                        var46.field6382[var45.field6406] = null;
                        class404.method2531(26878, var46);
                        continue;
                    }
                    if (var621 == 102) {
                        var2--;
                        class453 var47 = class442.method2767(field2436[var2], -1229996208);
                        var47.field6382 = null;
                        class404.method2531(26878, var47);
                        continue;
                    }
                    if (var621 == 200) {
                        var2 -= 2;
                        int var48 = field2436[var2];
                        int var49 = field2436[var2 + 1];
                        class453 var50 = class143.method983(-1, var48, var49);
                        if (var50 != null && var49 != -1) {
                            field2436[var2++] = 1;
                            if (var37) {
                                field2433 = var50;
                            } else {
                                field2434 = var50;
                            }
                            continue;
                        }
                        field2436[var2++] = 0;
                        continue;
                    }
                    if (var621 == 201) {
                        var2--;
                        int var51 = field2436[var2];
                        class453 var52 = class442.method2767(var51, -1229996208);
                        if (var52 == null) {
                            field2436[var2++] = 0;
                        } else {
                            field2436[var2++] = 1;
                            if (var37) {
                                field2433 = var52;
                            } else {
                                field2434 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var621 < 500) {
                    if (var621 == 403) {
                        var2 -= 2;
                        int var53 = field2436[var2];
                        int var54 = field2436[var2 + 1];
                        for (int var55 = 0; var55 < class80.field1147.length; var55++) {
                            if (class80.field1147[var55] == var53) {
                                class412.field5841.field1934.method917(65535, var55, var54);
                                continue label4487;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class149.field2113.length) {
                                continue label4487;
                            }
                            if (class149.field2113[var56] == var53) {
                                class412.field5841.field1934.method917(65535, var56, var54);
                                continue label4487;
                            }
                            var56++;
                        }
                    }
                    if (var621 == 404) {
                        var2 -= 2;
                        int var57 = field2436[var2];
                        int var58 = field2436[var2 + 1];
                        class412.field5841.field1934.method926((byte) 116, var58, var57);
                        continue;
                    }
                    if (var621 == 410) {
                        var2--;
                        boolean var59 = field2436[var2] != 0;
                        class412.field5841.field1934.method925((byte) -88, var59);
                        continue;
                    }
                } else if (!(var621 < 1000 || var621 >= 1100) || !(var621 < 2000 || var621 >= 2100)) {
                    class453 var60;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var60 = class442.method2767(field2436[var2], -1229996208);
                    } else {
                        var60 = var37 ? field2433 : field2434;
                    }
                    if (var621 == 1000) {
                        var2 -= 4;
                        var60.field6393 = field2436[var2];
                        var60.field6457 = field2436[var2 + 1];
                        int var61 = field2436[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field2436[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field6358 = (byte) var61;
                        var60.field6413 = (byte) var62;
                        class404.method2531(26878, var60);
                        class437.method2747(var60, (byte) -35);
                        if (var60.field6406 == -1) {
                            class454.method2823(11, var60.field6314);
                        }
                        continue;
                    }
                    if (var621 == 1001) {
                        var2 -= 4;
                        var60.field6350 = field2436[var2];
                        var60.field6383 = field2436[var2 + 1];
                        var60.field6405 = 0;
                        var60.field6338 = 0;
                        int var63 = field2436[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field2436[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field6400 = (byte) var63;
                        var60.field6353 = (byte) var64;
                        class404.method2531(26878, var60);
                        class437.method2747(var60, (byte) -35);
                        if (var60.field6356 == 0) {
                            class224.method1496(false, (byte) 117, var60);
                        }
                        continue;
                    }
                    if (var621 == 1003) {
                        var2--;
                        boolean var65 = field2436[var2] == 1;
                        if (var60.field6409 != var65) {
                            var60.field6409 = var65;
                            class404.method2531(26878, var60);
                        }
                        if (var60.field6406 == -1) {
                            class5.method34(var60.field6314, (byte) 94);
                        }
                        continue;
                    }
                    if (var621 == 1004) {
                        var2 -= 2;
                        var60.field6424 = field2436[var2];
                        var60.field6455 = field2436[var2 + 1];
                        class404.method2531(26878, var60);
                        class437.method2747(var60, (byte) -35);
                        if (var60.field6356 == 0) {
                            class224.method1496(false, (byte) 115, var60);
                        }
                        continue;
                    }
                    if (var621 == 1005) {
                        var2--;
                        var60.field6439 = field2436[var2] == 1;
                        continue;
                    }
                } else if (!(var621 < 1100 || var621 >= 1200) || !(var621 < 2100 || var621 >= 2200)) {
                    class453 var66;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var66 = class442.method2767(field2436[var2], -1229996208);
                    } else {
                        var66 = var37 ? field2433 : field2434;
                    }
                    if (var621 == 1100) {
                        var2 -= 2;
                        var66.field6444 = field2436[var2];
                        if (var66.field6444 > var66.field6434 - var66.field6342) {
                            var66.field6444 = var66.field6434 - var66.field6342;
                        }
                        if (var66.field6444 < 0) {
                            var66.field6444 = 0;
                        }
                        var66.field6344 = field2436[var2 + 1];
                        if (var66.field6344 > var66.field6377 - var66.field6447) {
                            var66.field6344 = var66.field6377 - var66.field6447;
                        }
                        if (var66.field6344 < 0) {
                            var66.field6344 = 0;
                        }
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class260.method1708((byte) 126, var66.field6314);
                        }
                        continue;
                    }
                    if (var621 == 1101) {
                        var2--;
                        var66.field6320 = field2436[var2];
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class428.method2704(true, var66.field6314);
                        }
                        continue;
                    }
                    if (var621 == 1102) {
                        var2--;
                        var66.field6440 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1103) {
                        var2--;
                        var66.field6333 = field2436[var2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1104) {
                        var2--;
                        var66.field6335 = field2436[var2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1105) {
                        var2--;
                        int var67 = field2436[var2];
                        if (var66.field6348 != var67) {
                            var66.field6348 = var67;
                            class404.method2531(26878, var66);
                        }
                        if (var66.field6406 == -1) {
                            class328.method2114(var66.field6314, 14);
                        }
                        continue;
                    }
                    if (var621 == 1106) {
                        var2--;
                        var66.field6459 = field2436[var2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1107) {
                        var2--;
                        var66.field6417 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1108) {
                        var66.field6445 = 1;
                        var2--;
                        var66.field6323 = field2436[var2];
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class130.method894(var66.field6314, (byte) 100);
                        }
                        continue;
                    }
                    if (var621 == 1109) {
                        var2 -= 6;
                        var66.field6380 = field2436[var2];
                        var66.field6469 = field2436[var2 + 1];
                        var66.field6465 = field2436[var2 + 2];
                        var66.field6456 = field2436[var2 + 3];
                        var66.field6354 = field2436[var2 + 4];
                        var66.field6375 = field2436[var2 + 5];
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class244.method1656(-24707, var66.field6314);
                            class218.method1409(var66.field6314, (byte) 122);
                        }
                        continue;
                    }
                    if (var621 == 1110) {
                        var2--;
                        int var68 = field2436[var2];
                        if (var66.field6371 != var68) {
                            var66.field6371 = var68;
                            var66.field6399 = 0;
                            var66.field6427 = 1;
                            var66.field6421 = 0;
                            class404.method2531(26878, var66);
                        }
                        if (var66.field6406 == -1) {
                            class113.method796(21, var66.field6314);
                        }
                        continue;
                    }
                    if (var621 == 1111) {
                        var2--;
                        var66.field6463 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1112) {
                        var3--;
                        String var69 = field2417[var3];
                        if (!var69.equals(var66.field6397)) {
                            var66.field6397 = var69;
                            class404.method2531(26878, var66);
                        }
                        if (var66.field6406 == -1) {
                            class77.method568(var66.field6314, 152);
                        }
                        continue;
                    }
                    if (var621 == 1113) {
                        var2--;
                        var66.field6460 = field2436[var2];
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class1.method3(var66.field6314, false);
                        }
                        continue;
                    }
                    if (var621 == 1114) {
                        var2 -= 3;
                        var66.field6317 = field2436[var2];
                        var66.field6326 = field2436[var2 + 1];
                        var66.field6373 = field2436[var2 + 2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1115) {
                        var2--;
                        var66.field6468 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1116) {
                        var2--;
                        var66.field6325 = field2436[var2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1117) {
                        var2--;
                        var66.field6401 = field2436[var2];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1118) {
                        var2--;
                        var66.field6376 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1119) {
                        var2--;
                        var66.field6453 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1120) {
                        var2 -= 2;
                        var66.field6434 = field2436[var2];
                        var66.field6377 = field2436[var2 + 1];
                        class404.method2531(26878, var66);
                        if (var66.field6356 == 0) {
                            class224.method1496(false, (byte) 8, var66);
                        }
                        continue;
                    }
                    if (var621 == 1121) {
                        var2 -= 2;
                        var66.field6402 = (short) field2436[var2];
                        var66.field6428 = (short) field2436[var2 + 1];
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1122) {
                        var2--;
                        var66.field6464 = field2436[var2] == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1123) {
                        var2--;
                        var66.field6375 = field2436[var2];
                        class404.method2531(26878, var66);
                        if (var66.field6406 == -1) {
                            class244.method1656(-24707, var66.field6314);
                        }
                        continue;
                    }
                    if (var621 == 1124) {
                        var2--;
                        int var70 = field2436[var2];
                        var66.field6435 = var70 == 1;
                        class404.method2531(26878, var66);
                        continue;
                    }
                    if (var621 == 1125) {
                        var2 -= 2;
                        var66.field6388 = field2436[var2];
                        var66.field6448 = field2436[var2 + 1];
                        class404.method2531(26878, var66);
                        continue;
                    }
                } else if (var621 >= 1200 && var621 < 1300 || var621 >= 2200 && var621 < 2300) {
                    class453 var71;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var71 = class442.method2767(field2436[var2], -1229996208);
                    } else {
                        var71 = var37 ? field2433 : field2434;
                    }
                    class404.method2531(26878, var71);
                    if (var621 == 1200 || var621 == 1205 || var621 == 1208 || var621 == 1209 || var621 == 1212 || var621 == 1213) {
                        var2 -= 2;
                        int var72 = field2436[var2];
                        int var73 = field2436[var2 + 1];
                        if (var71.field6406 == -1) {
                            class143.method981(var71.field6314, 9);
                            class244.method1656(-24707, var71.field6314);
                            class218.method1409(var71.field6314, (byte) 115);
                        }
                        if (var72 == -1) {
                            var71.field6445 = 1;
                            var71.field6323 = -1;
                            var71.field6452 = -1;
                            continue;
                        }
                        var71.field6452 = var72;
                        var71.field6396 = var73;
                        if (var621 == 1208 || var621 == 1209) {
                            var71.field6379 = true;
                        } else {
                            var71.field6379 = false;
                        }
                        class360 var74 = class51.method433((byte) 87, var72);
                        var71.field6465 = var74.field4956;
                        var71.field6456 = var74.field4960;
                        var71.field6354 = var74.field4940;
                        var71.field6380 = var74.field4932;
                        var71.field6469 = var74.field4919;
                        var71.field6375 = var74.field4967;
                        if (var621 == 1205 || var621 == 1209) {
                            var71.field6368 = 0;
                        } else if (var621 == 1212 || var621 == 1213) {
                            var71.field6368 = 1;
                        } else {
                            var71.field6368 = 2;
                        }
                        if (var71.field6405 > 0) {
                            var71.field6375 = var71.field6375 * 32 / var71.field6405;
                        } else if (var71.field6350 > 0) {
                            var71.field6375 = var71.field6375 * 32 / var71.field6350;
                        }
                        continue;
                    }
                    if (var621 == 1201) {
                        var71.field6445 = 2;
                        var2--;
                        var71.field6323 = field2436[var2];
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 35);
                        }
                        continue;
                    }
                    if (var621 == 1202) {
                        var71.field6445 = 3;
                        var71.field6323 = -1;
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 87);
                        }
                        continue;
                    }
                    if (var621 == 1203) {
                        var71.field6445 = 6;
                        var2--;
                        var71.field6323 = field2436[var2];
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 18);
                        }
                        continue;
                    }
                    if (var621 == 1204) {
                        var71.field6445 = 5;
                        var2--;
                        var71.field6323 = field2436[var2];
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 114);
                        }
                        continue;
                    }
                    if (var621 == 1206) {
                        var2 -= 4;
                        var71.field6398 = field2436[var2];
                        var71.field6408 = field2436[var2 + 1];
                        var71.field6458 = field2436[var2 + 2];
                        var71.field6346 = field2436[var2 + 3];
                        class404.method2531(26878, var71);
                        continue;
                    }
                    if (var621 == 1207) {
                        var2 -= 2;
                        var71.field6337 = field2436[var2];
                        var71.field6391 = field2436[var2 + 1];
                        class404.method2531(26878, var71);
                        continue;
                    }
                    if (var621 == 1210) {
                        var2 -= 4;
                        var71.field6323 = field2436[var2];
                        var71.field6332 = field2436[var2 + 1];
                        if (field2436[var2 + 2] == 1) {
                            var71.field6445 = 9;
                        } else {
                            var71.field6445 = 8;
                        }
                        if (field2436[var2 + 3] == 1) {
                            var71.field6379 = true;
                        } else {
                            var71.field6379 = false;
                        }
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 71);
                        }
                        continue;
                    }
                    if (var621 == 1211) {
                        var71.field6445 = 5;
                        var71.field6323 = 2047;
                        var71.field6332 = 0;
                        if (var71.field6406 == -1) {
                            class130.method894(var71.field6314, (byte) 107);
                        }
                        continue;
                    }
                } else if (var621 >= 1300 && var621 < 1400 || var621 >= 2300 && var621 < 2400) {
                    class453 var75;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var75 = class442.method2767(field2436[var2], -1229996208);
                    } else {
                        var75 = var37 ? field2433 : field2434;
                    }
                    if (var621 == 1300) {
                        var2--;
                        int var76 = field2436[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method2807(var76, field2417[var3], false);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var621 == 1301) {
                        var2 -= 2;
                        int var77 = field2436[var2];
                        int var78 = field2436[var2 + 1];
                        var75.field6454 = class143.method983(-1, var77, var78);
                        continue;
                    }
                    if (var621 == 1302) {
                        var2--;
                        var75.field6385 = field2436[var2] == 1;
                        continue;
                    }
                    if (var621 == 1303) {
                        var2--;
                        var75.field6364 = field2436[var2];
                        continue;
                    }
                    if (var621 == 1304) {
                        var2--;
                        var75.field6310 = field2436[var2];
                        continue;
                    }
                    if (var621 == 1305) {
                        var3--;
                        var75.field6437 = field2417[var3];
                        continue;
                    }
                    if (var621 == 1306) {
                        var3--;
                        var75.field6313 = field2417[var3];
                        continue;
                    }
                    if (var621 == 1307) {
                        var75.field6360 = null;
                        continue;
                    }
                    if (var621 == 1308) {
                        var2--;
                        var75.field6312 = field2436[var2];
                        var2--;
                        var75.field6359 = field2436[var2];
                        continue;
                    }
                    if (var621 == 1309) {
                        var2--;
                        int var79 = field2436[var2];
                        var2--;
                        int var80 = field2436[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method2819(var79, 0, var80 - 1);
                        }
                        continue;
                    }
                    if (var621 == 1310) {
                        var3--;
                        var75.field6340 = field2417[var3];
                        continue;
                    }
                    if (var621 == 1311) {
                        var2--;
                        var75.field6410 = field2436[var2];
                        continue;
                    }
                } else {
                    if (var621 >= 1400 && var621 < 1500 || var621 >= 2400 && var621 < 2500) {
                        class453 var81;
                        if (var621 >= 2000) {
                            var621 -= 1000;
                            var2--;
                            var81 = class442.method2767(field2436[var2], -1229996208);
                        } else {
                            var81 = var37 ? field2433 : field2434;
                        }
                        var3--;
                        String var82 = field2417[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field2436[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field2436[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field2417[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field2436[var2]);
                            }
                        }
                        var2--;
                        int var87 = field2436[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var621 == 1400) {
                            var81.field6414 = var85;
                        } else if (var621 == 1401) {
                            var81.field6357 = var85;
                        } else if (var621 == 1402) {
                            var81.field6336 = var85;
                        } else if (var621 == 1403) {
                            var81.field6322 = var85;
                        } else if (var621 == 1404) {
                            var81.field6450 = var85;
                        } else if (var621 == 1405) {
                            var81.field6449 = var85;
                        } else if (var621 == 1406) {
                            var81.field6339 = var85;
                        } else if (var621 == 1407) {
                            var81.field6433 = var85;
                            var81.field6328 = var83;
                        } else if (var621 == 1408) {
                            var81.field6324 = var85;
                        } else if (var621 == 1409) {
                            var81.field6366 = var85;
                        } else if (var621 == 1410) {
                            var81.field6416 = var85;
                        } else if (var621 == 1411) {
                            var81.field6451 = var85;
                        } else if (var621 == 1412) {
                            var81.field6369 = var85;
                        } else if (var621 == 1414) {
                            var81.field6372 = var85;
                            var81.field6430 = var83;
                        } else if (var621 == 1415) {
                            var81.field6365 = var85;
                            var81.field6412 = var83;
                        } else if (var621 == 1416) {
                            var81.field6352 = var85;
                        } else if (var621 == 1417) {
                            var81.field6387 = var85;
                        } else if (var621 == 1418) {
                            var81.field6378 = var85;
                        } else if (var621 == 1419) {
                            var81.field6347 = var85;
                        } else if (var621 == 1420) {
                            var81.field6349 = var85;
                        } else if (var621 == 1421) {
                            var81.field6334 = var85;
                        } else if (var621 == 1422) {
                            var81.field6318 = var85;
                        } else if (var621 == 1423) {
                            var81.field6436 = var85;
                        } else if (var621 == 1424) {
                            var81.field6395 = var85;
                        } else if (var621 == 1425) {
                            var81.field6411 = var85;
                        } else if (var621 == 1426) {
                            var81.field6419 = var85;
                        } else if (var621 == 1427) {
                            var81.field6438 = var85;
                        } else if (var621 == 1428) {
                            var81.field6407 = var85;
                            var81.field6441 = var83;
                        } else if (var621 == 1429) {
                            var81.field6331 = var85;
                            var81.field6429 = var83;
                        }
                        var81.field6345 = true;
                        continue;
                    }
                    if (var621 < 1600) {
                        class453 var88 = var37 ? field2433 : field2434;
                        if (var621 == 1500) {
                            field2436[var2++] = var88.field6363;
                            continue;
                        }
                        if (var621 == 1501) {
                            field2436[var2++] = var88.field6418;
                            continue;
                        }
                        if (var621 == 1502) {
                            field2436[var2++] = var88.field6342;
                            continue;
                        }
                        if (var621 == 1503) {
                            field2436[var2++] = var88.field6447;
                            continue;
                        }
                        if (var621 == 1504) {
                            field2436[var2++] = var88.field6409 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 1505) {
                            field2436[var2++] = var88.field6470;
                            continue;
                        }
                    } else if (var621 < 1700) {
                        class453 var89 = var37 ? field2433 : field2434;
                        if (var621 == 1600) {
                            field2436[var2++] = var89.field6444;
                            continue;
                        }
                        if (var621 == 1601) {
                            field2436[var2++] = var89.field6344;
                            continue;
                        }
                        if (var621 == 1602) {
                            field2417[var3++] = var89.field6397;
                            continue;
                        }
                        if (var621 == 1603) {
                            field2436[var2++] = var89.field6434;
                            continue;
                        }
                        if (var621 == 1604) {
                            field2436[var2++] = var89.field6377;
                            continue;
                        }
                        if (var621 == 1605) {
                            field2436[var2++] = var89.field6375;
                            continue;
                        }
                        if (var621 == 1606) {
                            field2436[var2++] = var89.field6465;
                            continue;
                        }
                        if (var621 == 1607) {
                            field2436[var2++] = var89.field6354;
                            continue;
                        }
                        if (var621 == 1608) {
                            field2436[var2++] = var89.field6456;
                            continue;
                        }
                        if (var621 == 1609) {
                            field2436[var2++] = var89.field6333;
                            continue;
                        }
                        if (var621 == 1610) {
                            field2436[var2++] = var89.field6380;
                            continue;
                        }
                        if (var621 == 1611) {
                            field2436[var2++] = var89.field6469;
                            continue;
                        }
                        if (var621 == 1612) {
                            field2436[var2++] = var89.field6348;
                            continue;
                        }
                    } else if (var621 < 1800) {
                        class453 var90 = var37 ? field2433 : field2434;
                        if (var621 == 1700) {
                            field2436[var2++] = var90.field6452;
                            continue;
                        }
                        if (var621 == 1701) {
                            if (var90.field6452 == -1) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var90.field6396;
                            }
                            continue;
                        }
                        if (var621 == 1702) {
                            field2436[var2++] = var90.field6406;
                            continue;
                        }
                    } else if (var621 < 1900) {
                        class453 var91 = var37 ? field2433 : field2434;
                        if (var621 == 1800) {
                            field2436[var2++] = client.method1091(var91).method954(1);
                            continue;
                        }
                        if (var621 == 1801) {
                            var2--;
                            int var92 = field2436[var2];
                            int var622 = var92 - 1;
                            if (var91.field6360 != null && var622 < var91.field6360.length && var91.field6360[var622] != null) {
                                field2417[var3++] = var91.field6360[var622];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 1802) {
                            if (var91.field6437 == null) {
                                field2417[var3++] = "";
                            } else {
                                field2417[var3++] = var91.field6437;
                            }
                            continue;
                        }
                    } else if (var621 < 2600) {
                        var2--;
                        class453 var93 = class442.method2767(field2436[var2], -1229996208);
                        if (var621 == 2500) {
                            field2436[var2++] = var93.field6363;
                            continue;
                        }
                        if (var621 == 2501) {
                            field2436[var2++] = var93.field6418;
                            continue;
                        }
                        if (var621 == 2502) {
                            field2436[var2++] = var93.field6342;
                            continue;
                        }
                        if (var621 == 2503) {
                            field2436[var2++] = var93.field6447;
                            continue;
                        }
                        if (var621 == 2504) {
                            field2436[var2++] = var93.field6409 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 2505) {
                            field2436[var2++] = var93.field6470;
                            continue;
                        }
                    } else if (var621 < 2700) {
                        var2--;
                        class453 var94 = class442.method2767(field2436[var2], -1229996208);
                        if (var621 == 2600) {
                            field2436[var2++] = var94.field6444;
                            continue;
                        }
                        if (var621 == 2601) {
                            field2436[var2++] = var94.field6344;
                            continue;
                        }
                        if (var621 == 2602) {
                            field2417[var3++] = var94.field6397;
                            continue;
                        }
                        if (var621 == 2603) {
                            field2436[var2++] = var94.field6434;
                            continue;
                        }
                        if (var621 == 2604) {
                            field2436[var2++] = var94.field6377;
                            continue;
                        }
                        if (var621 == 2605) {
                            field2436[var2++] = var94.field6375;
                            continue;
                        }
                        if (var621 == 2606) {
                            field2436[var2++] = var94.field6465;
                            continue;
                        }
                        if (var621 == 2607) {
                            field2436[var2++] = var94.field6354;
                            continue;
                        }
                        if (var621 == 2608) {
                            field2436[var2++] = var94.field6456;
                            continue;
                        }
                        if (var621 == 2609) {
                            field2436[var2++] = var94.field6333;
                            continue;
                        }
                        if (var621 == 2610) {
                            field2436[var2++] = var94.field6380;
                            continue;
                        }
                        if (var621 == 2611) {
                            field2436[var2++] = var94.field6469;
                            continue;
                        }
                        if (var621 == 2612) {
                            field2436[var2++] = var94.field6348;
                            continue;
                        }
                    } else if (var621 < 2800) {
                        if (var621 == 2700) {
                            var2--;
                            class453 var95 = class442.method2767(field2436[var2], -1229996208);
                            field2436[var2++] = var95.field6452;
                            continue;
                        }
                        if (var621 == 2701) {
                            var2--;
                            class453 var96 = class442.method2767(field2436[var2], -1229996208);
                            if (var96.field6452 == -1) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var96.field6396;
                            }
                            continue;
                        }
                        if (var621 == 2702) {
                            var2--;
                            int var97 = field2436[var2];
                            class26 var98 = (class26) class454.field6477.method886((long) var97, 25651);
                            if (var98 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = 1;
                            }
                            continue;
                        }
                        if (var621 == 2703) {
                            var2--;
                            class453 var99 = class442.method2767(field2436[var2], -1229996208);
                            if (var99.field6382 == null) {
                                field2436[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field6382.length;
                            for (int var101 = 0; var101 < var99.field6382.length; var101++) {
                                if (var99.field6382[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field2436[var2++] = var100;
                            continue;
                        }
                        if (var621 == 2704 || var621 == 2705) {
                            var2 -= 2;
                            int var102 = field2436[var2];
                            int var103 = field2436[var2 + 1];
                            class26 var104 = (class26) class454.field6477.method886((long) var102, 25651);
                            if (var104 != null && var104.field463 == var103) {
                                field2436[var2++] = 1;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                    } else if (var621 < 2900) {
                        var2--;
                        class453 var105 = class442.method2767(field2436[var2], -1229996208);
                        if (var621 == 2800) {
                            field2436[var2++] = client.method1091(var105).method954(1);
                            continue;
                        }
                        if (var621 == 2801) {
                            var2--;
                            int var106 = field2436[var2];
                            int var623 = var106 - 1;
                            if (var105.field6360 != null && var623 < var105.field6360.length && var105.field6360[var623] != null) {
                                field2417[var3++] = var105.field6360[var623];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 2802) {
                            if (var105.field6437 == null) {
                                field2417[var3++] = "";
                            } else {
                                field2417[var3++] = var105.field6437;
                            }
                            continue;
                        }
                    } else if (var621 < 3200) {
                        if (var621 == 3100) {
                            var3--;
                            String var107 = field2417[var3];
                            class205.method1334(var107, (byte) 104);
                            continue;
                        }
                        if (var621 == 3101) {
                            var2 -= 2;
                            class142.method978(class412.field5841, field2436[var2 + 1], 1, field2436[var2]);
                            continue;
                        }
                        if (var621 == 3103) {
                            class125.method852(true, 118);
                            continue;
                        }
                        if (var621 == 3104) {
                            var3--;
                            String var108 = field2417[var3];
                            int var109 = 0;
                            if (class66.method513(10, var108)) {
                                var109 = class66.method512((byte) 118, var108);
                            }
                            field2438++;
                            class46.field648.method1178(63, 220);
                            class46.field648.method155(15489, var109);
                            continue;
                        }
                        if (var621 == 3105) {
                            var3--;
                            String var110 = field2417[var3];
                            field2427++;
                            class46.field648.method1178(63, 62);
                            class46.field648.method173(var110.length() + 1, 255);
                            class46.field648.method160(var110, false);
                            continue;
                        }
                        if (var621 == 3106) {
                            var3--;
                            String var111 = field2417[var3];
                            field2428++;
                            class46.field648.method1178(63, 52);
                            class46.field648.method173(var111.length() + 1, 255);
                            class46.field648.method160(var111, false);
                            continue;
                        }
                        if (var621 == 3107) {
                            var2--;
                            int var112 = field2436[var2];
                            var3--;
                            String var113 = field2417[var3];
                            class53.method438(96, var112, var113);
                            continue;
                        }
                        if (var621 == 3108) {
                            var2 -= 3;
                            int var114 = field2436[var2];
                            int var115 = field2436[var2 + 1];
                            int var116 = field2436[var2 + 2];
                            class453 var117 = class442.method2767(var116, -1229996208);
                            class352.method2225(0, var114, var117, var115);
                            continue;
                        }
                        if (var621 == 3109) {
                            var2 -= 2;
                            int var118 = field2436[var2];
                            int var119 = field2436[var2 + 1];
                            class453 var120 = var37 ? field2433 : field2434;
                            class352.method2225(0, var118, var120, var119);
                            continue;
                        }
                        if (var621 == 3110) {
                            var2--;
                            int var121 = field2436[var2];
                            field2435++;
                            class46.field648.method1178(63, 255);
                            class46.field648.method191(var121, -127);
                            continue;
                        }
                        if (var621 == 3111) {
                            var2 -= 2;
                            int var122 = field2436[var2];
                            int var123 = field2436[var2 + 1];
                            class26 var124 = (class26) class454.field6477.method886((long) var122, 25651);
                            if (var124 != null) {
                                class325.method2090(var124, var124.field463 != var123, true, -10);
                            }
                            class196.method1266(true, 3, (byte) 74, var123, var122);
                            continue;
                        }
                        if (var621 == 3112) {
                            var2--;
                            int var125 = field2436[var2];
                            class26 var126 = (class26) class454.field6477.method886((long) var125, 25651);
                            if (var126 != null && var126.field462 == 3) {
                                class325.method2090(var126, true, true, -10);
                            }
                            continue;
                        }
                    } else if (var621 < 3300) {
                        if (var621 == 3200) {
                            var2 -= 3;
                            class273.method1780(field2436[var2], 30346, 255, field2436[var2 + 1], field2436[var2 + 2]);
                            continue;
                        }
                        if (var621 == 3201) {
                            var2--;
                            class21.method278(255, (byte) -39, field2436[var2]);
                            continue;
                        }
                        if (var621 == 3202) {
                            var2 -= 2;
                            class275.method1793(255, field2436[var2 + 1], field2436[var2], (byte) -126);
                            continue;
                        }
                    } else if (var621 < 3400) {
                        if (var621 == 3300) {
                            field2436[var2++] = class276.field3837;
                            continue;
                        }
                        if (var621 == 3301) {
                            var2 -= 2;
                            int var127 = field2436[var2];
                            int var128 = field2436[var2 + 1];
                            field2436[var2++] = class392.method2475(-102, var127, var128, false);
                            continue;
                        }
                        if (var621 == 3302) {
                            var2 -= 2;
                            int var129 = field2436[var2];
                            int var130 = field2436[var2 + 1];
                            field2436[var2++] = class239.method1631(true, var130, var129, false);
                            continue;
                        }
                        if (var621 == 3303) {
                            var2 -= 2;
                            int var131 = field2436[var2];
                            int var132 = field2436[var2 + 1];
                            field2436[var2++] = class75.method556(var131, -37, false, var132);
                            continue;
                        }
                        if (var621 == 3304) {
                            var2--;
                            int var133 = field2436[var2];
                            field2436[var2++] = class148.method1003(0, var133).field4456;
                            continue;
                        }
                        if (var621 == 3305) {
                            var2--;
                            int var134 = field2436[var2];
                            field2436[var2++] = class183.field2496[var134];
                            continue;
                        }
                        if (var621 == 3306) {
                            var2--;
                            int var135 = field2436[var2];
                            field2436[var2++] = class194.field2677[var135];
                            continue;
                        }
                        if (var621 == 3307) {
                            var2--;
                            int var136 = field2436[var2];
                            field2436[var2++] = class113.field1635[var136];
                            continue;
                        }
                        if (var621 == 3308) {
                            int var137 = class142.field2034;
                            int var138 = (class412.field5841.field6262 >> 7) + class212.field2968;
                            int var139 = (class412.field5841.field6266 >> 7) + class447.field6269;
                            field2436[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var621 == 3309) {
                            var2--;
                            int var140 = field2436[var2];
                            field2436[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3310) {
                            var2--;
                            int var141 = field2436[var2];
                            field2436[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var621 == 3311) {
                            var2--;
                            int var142 = field2436[var2];
                            field2436[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3312) {
                            field2436[var2++] = class21.field393 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3313) {
                            var2 -= 2;
                            int var143 = field2436[var2];
                            int var144 = field2436[var2 + 1];
                            field2436[var2++] = class392.method2475(-34, var143, var144, true);
                            continue;
                        }
                        if (var621 == 3314) {
                            var2 -= 2;
                            int var145 = field2436[var2];
                            int var146 = field2436[var2 + 1];
                            field2436[var2++] = class239.method1631(true, var146, var145, true);
                            continue;
                        }
                        if (var621 == 3315) {
                            var2 -= 2;
                            int var147 = field2436[var2];
                            int var148 = field2436[var2 + 1];
                            field2436[var2++] = class75.method556(var147, -49, true, var148);
                            continue;
                        }
                        if (var621 == 3316) {
                            if (class105.field1435 >= 2) {
                                field2436[var2++] = class105.field1435;
                            } else {
                                field2436[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 3317) {
                            field2436[var2++] = class135.field1970;
                            continue;
                        }
                        if (var621 == 3318) {
                            field2436[var2++] = class277.field3883;
                            continue;
                        }
                        if (var621 == 3321) {
                            field2436[var2++] = class328.field4538;
                            continue;
                        }
                        if (var621 == 3322) {
                            field2436[var2++] = class64.field874;
                            continue;
                        }
                        if (var621 == 3323) {
                            if (class239.field3398 >= 5 && class239.field3398 <= 9) {
                                field2436[var2++] = 1;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3324) {
                            if (class239.field3398 >= 5 && class239.field3398 <= 9) {
                                field2436[var2++] = class239.field3398;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3325) {
                            field2436[var2++] = class349.field4802 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3326) {
                            field2436[var2++] = class412.field5841.field1946;
                            continue;
                        }
                        if (var621 == 3327) {
                            field2436[var2++] = class412.field5841.field1934.field1899 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3328) {
                            field2436[var2++] = class387.field5561 && !class74.field1068 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3329) {
                            field2436[var2++] = class292.field4086 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3330) {
                            var2--;
                            int var149 = field2436[var2];
                            field2436[var2++] = class142.method980(false, var149, (byte) -125);
                            continue;
                        }
                        if (var621 == 3331) {
                            var2 -= 2;
                            int var150 = field2436[var2];
                            int var151 = field2436[var2 + 1];
                            field2436[var2++] = class151.method1028(var150, var151, false, false, -126);
                            continue;
                        }
                        if (var621 == 3332) {
                            var2 -= 2;
                            int var152 = field2436[var2];
                            int var153 = field2436[var2 + 1];
                            field2436[var2++] = class151.method1028(var152, var153, false, true, 98);
                            continue;
                        }
                        if (var621 == 3333) {
                            field2436[var2++] = class160.field2240;
                            continue;
                        }
                        if (var621 == 3335) {
                            field2436[var2++] = class210.field2935;
                            continue;
                        }
                        if (var621 == 3336) {
                            var2 -= 4;
                            int var154 = field2436[var2];
                            int var155 = field2436[var2 + 1];
                            int var156 = field2436[var2 + 2];
                            int var157 = field2436[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field2436[var2++] = var160;
                            continue;
                        }
                        if (var621 == 3337) {
                            field2436[var2++] = class331.field4578;
                            continue;
                        }
                        if (var621 == 3338) {
                            field2436[var2++] = class334.method2145(false);
                            continue;
                        }
                    } else if (var621 < 3500) {
                        if (var621 == 3400) {
                            var2 -= 2;
                            int var161 = field2436[var2];
                            int var162 = field2436[var2 + 1];
                            class124 var163 = class277.method1808((byte) 55, var161);
                            field2417[var3++] = var163.method839(var162, (byte) -106);
                            continue;
                        }
                        if (var621 == 3408) {
                            var2 -= 4;
                            int var164 = field2436[var2];
                            int var165 = field2436[var2 + 1];
                            int var166 = field2436[var2 + 2];
                            int var167 = field2436[var2 + 3];
                            class124 var168 = class277.method1808((byte) 127, var166);
                            if (var168.field1728 == var164 && var168.field1725 == var165) {
                                if (var165 == 115) {
                                    field2417[var3++] = var168.method839(var167, (byte) -99);
                                } else {
                                    field2436[var2++] = var168.method842(var167, (byte) 100);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var621 == 3409) {
                            var2 -= 3;
                            int var169 = field2436[var2];
                            int var170 = field2436[var2 + 1];
                            int var171 = field2436[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class124 var172 = class277.method1808((byte) 50, var170);
                            if (var172.field1725 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field2436[var2++] = var172.method844(79, var171) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3410) {
                            var2--;
                            int var173 = field2436[var2];
                            var3--;
                            String var174 = field2417[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class124 var175 = class277.method1808((byte) 58, var173);
                            if (var175.field1725 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field2436[var2++] = var175.method845(-19, var174) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3411) {
                            var2--;
                            int var176 = field2436[var2];
                            class124 var177 = class277.method1808((byte) 96, var176);
                            field2436[var2++] = var177.field1719.method887((byte) 72);
                            continue;
                        }
                    } else if (var621 < 3700) {
                        if (var621 == 3600) {
                            if (class178.field2448 == 0) {
                                field2436[var2++] = -2;
                            } else if (class178.field2448 == 1) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = class272.field3777;
                            }
                            continue;
                        }
                        if (var621 == 3601) {
                            var2--;
                            int var178 = field2436[var2];
                            if (class178.field2448 == 2 && var178 < class272.field3777) {
                                field2417[var3++] = class288.field4045[var178];
                                if (class22.field398[var178] == null) {
                                    field2417[var3++] = "";
                                } else {
                                    field2417[var3++] = class22.field398[var178];
                                }
                                continue;
                            }
                            field2417[var3++] = "";
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3602) {
                            var2--;
                            int var179 = field2436[var2];
                            if (class178.field2448 == 2 && var179 < class272.field3777) {
                                field2436[var2++] = class218.field3018[var179];
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3603) {
                            var2--;
                            int var180 = field2436[var2];
                            if (class178.field2448 == 2 && var180 < class272.field3777) {
                                field2436[var2++] = class184.field2513[var180];
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3604) {
                            var3--;
                            String var181 = field2417[var3];
                            var2--;
                            int var182 = field2436[var2];
                            class393.method2483(var181, var182, 1);
                            continue;
                        }
                        if (var621 == 3605) {
                            var3--;
                            String var183 = field2417[var3];
                            class204.method1327(var183, (byte) 44);
                            continue;
                        }
                        if (var621 == 3606) {
                            var3--;
                            String var184 = field2417[var3];
                            class12.method219((byte) -124, var184);
                            continue;
                        }
                        if (var621 == 3607) {
                            var3--;
                            String var185 = field2417[var3];
                            class314.method2028(false, var185, false);
                            continue;
                        }
                        if (var621 == 3608) {
                            var3--;
                            String var186 = field2417[var3];
                            class208.method1350(var186, (byte) -26);
                            continue;
                        }
                        if (var621 == 3609) {
                            var3--;
                            String var187 = field2417[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field2436[var2++] = class3.method16(var187, 0) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3610) {
                            var2--;
                            int var188 = field2436[var2];
                            if (class178.field2448 == 2 && var188 < class272.field3777) {
                                field2417[var3++] = class73.field1044[var188];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3611) {
                            if (class349.field4806 == null) {
                                field2417[var3++] = "";
                            } else {
                                field2417[var3++] = class76.method565((byte) -67, class349.field4806);
                            }
                            continue;
                        }
                        if (var621 == 3612) {
                            if (class349.field4806 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = class316.field4319;
                            }
                            continue;
                        }
                        if (var621 == 3613) {
                            var2--;
                            int var189 = field2436[var2];
                            if (class349.field4806 != null && var189 < class316.field4319) {
                                field2417[var3++] = class121.field1700[var189].field3008;
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3614) {
                            var2--;
                            int var190 = field2436[var2];
                            if (class349.field4806 != null && var190 < class316.field4319) {
                                field2436[var2++] = class121.field1700[var190].field3010;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3615) {
                            var2--;
                            int var191 = field2436[var2];
                            if (class349.field4806 != null && var191 < class316.field4319) {
                                field2436[var2++] = class121.field1700[var191].field3014;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3616) {
                            field2436[var2++] = class292.field4087;
                            continue;
                        }
                        if (var621 == 3617) {
                            var3--;
                            String var192 = field2417[var3];
                            class217.method1403(-95, var192);
                            continue;
                        }
                        if (var621 == 3618) {
                            field2436[var2++] = class103.field1421;
                            continue;
                        }
                        if (var621 == 3619) {
                            var3--;
                            String var193 = field2417[var3];
                            class296.method1934(-49, var193);
                            continue;
                        }
                        if (var621 == 3620) {
                            class206.method1338(200);
                            continue;
                        }
                        if (var621 == 3621) {
                            if (class178.field2448 == 0) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = class197.field2709;
                            }
                            continue;
                        }
                        if (var621 == 3622) {
                            var2--;
                            int var194 = field2436[var2];
                            if (class178.field2448 != 0 && var194 < class197.field2709) {
                                field2417[var3++] = class249.field3517[var194];
                                if (class245.field3464[var194] == null) {
                                    field2417[var3++] = "";
                                } else {
                                    field2417[var3++] = class245.field3464[var194];
                                }
                                continue;
                            }
                            field2417[var3++] = "";
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3623) {
                            var3--;
                            String var195 = field2417[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field2436[var2++] = class273.method1784(var195, 0) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3624) {
                            var2--;
                            int var196 = field2436[var2];
                            if (class121.field1700 != null && var196 < class316.field4319 && class121.field1700[var196].field3011.equalsIgnoreCase(class412.field5841.field1922)) {
                                field2436[var2++] = 1;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3625) {
                            if (class33.field517 == null) {
                                field2417[var3++] = "";
                            } else {
                                field2417[var3++] = class33.field517;
                            }
                            continue;
                        }
                        if (var621 == 3626) {
                            var2--;
                            int var197 = field2436[var2];
                            if (class349.field4806 != null && var197 < class316.field4319) {
                                field2417[var3++] = class121.field1700[var197].field3017;
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3627) {
                            var2--;
                            int var198 = field2436[var2];
                            if (class178.field2448 == 2 && var198 >= 0 && var198 < class272.field3777) {
                                field2436[var2++] = class66.field990[var198] ? 1 : 0;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3628) {
                            var3--;
                            String var199 = field2417[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field2436[var2++] = class349.method2217(var199, (byte) -64);
                            continue;
                        }
                        if (var621 == 3629) {
                            field2436[var2++] = class328.field4547;
                            continue;
                        }
                        if (var621 == 3630) {
                            var3--;
                            String var200 = field2417[var3];
                            class314.method2028(true, var200, false);
                            continue;
                        }
                        if (var621 == 3631) {
                            var2--;
                            int var201 = field2436[var2];
                            field2436[var2++] = class187.field2528[var201] ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3632) {
                            var2--;
                            int var202 = field2436[var2];
                            if (class349.field4806 != null && var202 < class316.field4319) {
                                field2417[var3++] = class121.field1700[var202].field3011;
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 3633) {
                            var2--;
                            int var203 = field2436[var2];
                            if (class178.field2448 != 0 && var203 < class197.field2709) {
                                field2417[var3++] = class303.field4182[var203];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                    } else if (var621 < 4000) {
                        if (var621 == 3903) {
                            var2--;
                            int var204 = field2436[var2];
                            field2436[var2++] = class352.field4818[var204].method999((byte) 120);
                            continue;
                        }
                        if (var621 == 3904) {
                            var2--;
                            int var205 = field2436[var2];
                            field2436[var2++] = class352.field4818[var205].field2100;
                            continue;
                        }
                        if (var621 == 3905) {
                            var2--;
                            int var206 = field2436[var2];
                            field2436[var2++] = class352.field4818[var206].field2102;
                            continue;
                        }
                        if (var621 == 3906) {
                            var2--;
                            int var207 = field2436[var2];
                            field2436[var2++] = class352.field4818[var207].field2101;
                            continue;
                        }
                        if (var621 == 3907) {
                            var2--;
                            int var208 = field2436[var2];
                            field2436[var2++] = class352.field4818[var208].field2093;
                            continue;
                        }
                        if (var621 == 3908) {
                            var2--;
                            int var209 = field2436[var2];
                            field2436[var2++] = class352.field4818[var209].field2099;
                            continue;
                        }
                        if (var621 == 3910) {
                            var2--;
                            int var210 = field2436[var2];
                            int var211 = class352.field4818[var210].method998(7);
                            field2436[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3911) {
                            var2--;
                            int var212 = field2436[var2];
                            int var213 = class352.field4818[var212].method998(7);
                            field2436[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3912) {
                            var2--;
                            int var214 = field2436[var2];
                            int var215 = class352.field4818[var214].method998(7);
                            field2436[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3913) {
                            var2--;
                            int var216 = field2436[var2];
                            int var217 = class352.field4818[var216].method998(7);
                            field2436[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 4100) {
                        if (var621 == 4000) {
                            var2 -= 2;
                            int var218 = field2436[var2];
                            int var219 = field2436[var2 + 1];
                            field2436[var2++] = var218 + var219;
                            continue;
                        }
                        if (var621 == 4001) {
                            var2 -= 2;
                            int var220 = field2436[var2];
                            int var221 = field2436[var2 + 1];
                            field2436[var2++] = var220 - var221;
                            continue;
                        }
                        if (var621 == 4002) {
                            var2 -= 2;
                            int var222 = field2436[var2];
                            int var223 = field2436[var2 + 1];
                            field2436[var2++] = var222 * var223;
                            continue;
                        }
                        if (var621 == 4003) {
                            var2 -= 2;
                            int var224 = field2436[var2];
                            int var225 = field2436[var2 + 1];
                            field2436[var2++] = var224 / var225;
                            continue;
                        }
                        if (var621 == 4004) {
                            var2--;
                            int var226 = field2436[var2];
                            field2436[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var621 == 4005) {
                            var2--;
                            int var227 = field2436[var2];
                            field2436[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var621 == 4006) {
                            var2 -= 5;
                            int var228 = field2436[var2];
                            int var229 = field2436[var2 + 1];
                            int var230 = field2436[var2 + 2];
                            int var231 = field2436[var2 + 3];
                            int var232 = field2436[var2 + 4];
                            field2436[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var621 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field2436[var2];
                            long var235 = (long) field2436[var2 + 1];
                            field2436[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var621 == 4008) {
                            var2 -= 2;
                            int var237 = field2436[var2];
                            int var238 = field2436[var2 + 1];
                            field2436[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var621 == 4009) {
                            var2 -= 2;
                            int var239 = field2436[var2];
                            int var240 = field2436[var2 + 1];
                            field2436[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var621 == 4010) {
                            var2 -= 2;
                            int var241 = field2436[var2];
                            int var242 = field2436[var2 + 1];
                            field2436[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 4011) {
                            var2 -= 2;
                            int var243 = field2436[var2];
                            int var244 = field2436[var2 + 1];
                            field2436[var2++] = var243 % var244;
                            continue;
                        }
                        if (var621 == 4012) {
                            var2 -= 2;
                            int var245 = field2436[var2];
                            int var246 = field2436[var2 + 1];
                            if (var245 == 0) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var621 == 4013) {
                            var2 -= 2;
                            int var247 = field2436[var2];
                            int var248 = field2436[var2 + 1];
                            if (var247 == 0) {
                                field2436[var2++] = 0;
                            } else if (var248 == 0) {
                                field2436[var2++] = Integer.MAX_VALUE;
                            } else {
                                field2436[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var621 == 4014) {
                            var2 -= 2;
                            int var249 = field2436[var2];
                            int var250 = field2436[var2 + 1];
                            field2436[var2++] = var249 & var250;
                            continue;
                        }
                        if (var621 == 4015) {
                            var2 -= 2;
                            int var251 = field2436[var2];
                            int var252 = field2436[var2 + 1];
                            field2436[var2++] = var251 | var252;
                            continue;
                        }
                        if (var621 == 4016) {
                            var2 -= 2;
                            int var253 = field2436[var2];
                            int var254 = field2436[var2 + 1];
                            field2436[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var621 == 4017) {
                            var2 -= 2;
                            int var255 = field2436[var2];
                            int var256 = field2436[var2 + 1];
                            field2436[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var621 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field2436[var2];
                            long var259 = (long) field2436[var2 + 1];
                            long var261 = (long) field2436[var2 + 2];
                            field2436[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var621 < 4200) {
                        if (var621 == 4100) {
                            var3--;
                            String var263 = field2417[var3];
                            var2--;
                            int var264 = field2436[var2];
                            field2417[var3++] = var263 + var264;
                            continue;
                        }
                        if (var621 == 4101) {
                            var3 -= 2;
                            String var265 = field2417[var3];
                            String var266 = field2417[var3 + 1];
                            field2417[var3++] = var265 + var266;
                            continue;
                        }
                        if (var621 == 4102) {
                            var3--;
                            String var267 = field2417[var3];
                            var2--;
                            int var268 = field2436[var2];
                            field2417[var3++] = var267 + class25.method293(var268, 10, true);
                            continue;
                        }
                        if (var621 == 4103) {
                            var3--;
                            String var269 = field2417[var3];
                            field2417[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var621 == 4104) {
                            var2--;
                            int var270 = field2436[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field2423.setTime(new Date(var271));
                            int var273 = field2423.get(5);
                            int var274 = field2423.get(2);
                            int var275 = field2423.get(1);
                            field2417[var3++] = var273 + "-" + field2440[var274] + "-" + var275;
                            continue;
                        }
                        if (var621 == 4105) {
                            var3 -= 2;
                            String var276 = field2417[var3];
                            String var277 = field2417[var3 + 1];
                            if (class412.field5841.field1934 != null && class412.field5841.field1934.field1899) {
                                field2417[var3++] = var277;
                                continue;
                            }
                            field2417[var3++] = var276;
                            continue;
                        }
                        if (var621 == 4106) {
                            var2--;
                            int var278 = field2436[var2];
                            field2417[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var621 == 4107) {
                            var3 -= 2;
                            field2436[var2++] = class401.method2522(field2417[var3 + 1], 18397, class210.field2935, field2417[var3]);
                            continue;
                        }
                        if (var621 == 4108) {
                            var3--;
                            String var279 = field2417[var3];
                            var2 -= 2;
                            int var280 = field2436[var2];
                            int var281 = field2436[var2 + 1];
                            class337 var282 = class282.method1837(class260.field3643, var281, (byte) 124, 0);
                            field2436[var2++] = var282.method2158(true, var280, class278.field3900, var279);
                            continue;
                        }
                        if (var621 == 4109) {
                            var3--;
                            String var283 = field2417[var3];
                            var2 -= 2;
                            int var284 = field2436[var2];
                            int var285 = field2436[var2 + 1];
                            class337 var286 = class282.method1837(class260.field3643, var285, (byte) 126, 0);
                            field2436[var2++] = var286.method2160(class278.field3900, var284, var283, (byte) -125);
                            continue;
                        }
                        if (var621 == 4110) {
                            var3 -= 2;
                            String var287 = field2417[var3];
                            String var288 = field2417[var3 + 1];
                            var2--;
                            if (field2436[var2] == 1) {
                                field2417[var3++] = var287;
                            } else {
                                field2417[var3++] = var288;
                            }
                            continue;
                        }
                        if (var621 == 4111) {
                            var3--;
                            String var289 = field2417[var3];
                            field2417[var3++] = class128.method875(-1, var289);
                            continue;
                        }
                        if (var621 == 4112) {
                            var3--;
                            String var290 = field2417[var3];
                            var2--;
                            int var291 = field2436[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field2417[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var621 == 4113) {
                            var2--;
                            int var292 = field2436[var2];
                            field2436[var2++] = class260.method1706(8364, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4114) {
                            var2--;
                            int var293 = field2436[var2];
                            field2436[var2++] = class165.method1109(-11891, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4115) {
                            var2--;
                            int var294 = field2436[var2];
                            field2436[var2++] = class311.method1999((byte) -102, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4116) {
                            var2--;
                            int var295 = field2436[var2];
                            field2436[var2++] = class296.method1936((char) var295, -127) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4117) {
                            var3--;
                            String var296 = field2417[var3];
                            if (var296 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var621 == 4118) {
                            var3--;
                            String var297 = field2417[var3];
                            var2 -= 2;
                            int var298 = field2436[var2];
                            int var299 = field2436[var2 + 1];
                            field2417[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var621 == 4119) {
                            var3--;
                            String var300 = field2417[var3];
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
                            field2417[var3++] = var301.toString();
                            continue;
                        }
                        if (var621 == 4120) {
                            var3--;
                            String var305 = field2417[var3];
                            var2 -= 2;
                            int var306 = field2436[var2];
                            int var307 = field2436[var2 + 1];
                            field2436[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var621 == 4121) {
                            var3 -= 2;
                            String var308 = field2417[var3];
                            String var309 = field2417[var3 + 1];
                            var2--;
                            int var310 = field2436[var2];
                            field2436[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var621 == 4122) {
                            var2--;
                            int var311 = field2436[var2];
                            field2436[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var621 == 4123) {
                            var2--;
                            int var312 = field2436[var2];
                            field2436[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var621 == 4124) {
                            var2--;
                            boolean var313 = field2436[var2] != 0;
                            var2--;
                            int var314 = field2436[var2];
                            field2417[var3++] = class279.method1818(var313, class210.field2935, 0, (long) var314, 39);
                            continue;
                        }
                        if (var621 == 4125) {
                            var3--;
                            String var315 = field2417[var3];
                            var2--;
                            int var316 = field2436[var2];
                            class337 var317 = class282.method1837(class260.field3643, var316, (byte) 121, 0);
                            field2436[var2++] = var317.method2154(var315, false, class278.field3900);
                            continue;
                        }
                    } else if (var621 < 4300) {
                        if (var621 == 4200) {
                            var2--;
                            int var318 = field2436[var2];
                            field2417[var3++] = class51.method433((byte) 87, var318).field4938;
                            continue;
                        }
                        if (var621 == 4201) {
                            var2 -= 2;
                            int var319 = field2436[var2];
                            int var320 = field2436[var2 + 1];
                            class360 var321 = class51.method433((byte) 87, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field4965[var320 - 1] != null) {
                                field2417[var3++] = var321.field4965[var320 - 1];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 4202) {
                            var2 -= 2;
                            int var322 = field2436[var2];
                            int var323 = field2436[var2 + 1];
                            class360 var324 = class51.method433((byte) 87, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field4955[var323 - 1] != null) {
                                field2417[var3++] = var324.field4955[var323 - 1];
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 4203) {
                            var2--;
                            int var325 = field2436[var2];
                            field2436[var2++] = class51.method433((byte) 87, var325).field4954;
                            continue;
                        }
                        if (var621 == 4204) {
                            var2--;
                            int var326 = field2436[var2];
                            field2436[var2++] = class51.method433((byte) 87, var326).field4958 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4205) {
                            var2--;
                            int var327 = field2436[var2];
                            class360 var328 = class51.method433((byte) 87, var327);
                            if (var328.field4963 == -1 && var328.field4961 >= 0) {
                                field2436[var2++] = var328.field4961;
                                continue;
                            }
                            field2436[var2++] = var327;
                            continue;
                        }
                        if (var621 == 4206) {
                            var2--;
                            int var329 = field2436[var2];
                            class360 var330 = class51.method433((byte) 87, var329);
                            if (var330.field4963 >= 0 && var330.field4961 >= 0) {
                                field2436[var2++] = var330.field4961;
                                continue;
                            }
                            field2436[var2++] = var329;
                            continue;
                        }
                        if (var621 == 4207) {
                            var2--;
                            int var331 = field2436[var2];
                            field2436[var2++] = class51.method433((byte) 87, var331).field4942 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4208) {
                            var2 -= 2;
                            int var332 = field2436[var2];
                            int var333 = field2436[var2 + 1];
                            class116 var334 = class44.method396((byte) 70, var333);
                            if (var334.method806(-116)) {
                                field2417[var3++] = class51.method433((byte) 87, var332).method2314(128, var334.field1670, var333);
                            } else {
                                field2436[var2++] = class51.method433((byte) 87, var332).method2312(8806, var333, var334.field1668);
                            }
                            continue;
                        }
                        if (var621 == 4209) {
                            var2 -= 2;
                            int var335 = field2436[var2];
                            int var336 = field2436[var2 + 1] - 1;
                            class360 var337 = class51.method433((byte) 87, var335);
                            if (var337.field4979 == var336) {
                                field2436[var2++] = var337.field4975;
                            } else if (var337.field4918 == var336) {
                                field2436[var2++] = var337.field4906;
                            } else {
                                field2436[var2++] = -1;
                            }
                            continue;
                        }
                        if (var621 == 4210) {
                            var3--;
                            String var338 = field2417[var3];
                            var2--;
                            int var339 = field2436[var2];
                            class171.method1124((byte) -43, var339 == 1, var338);
                            field2436[var2++] = class75.field1076;
                            continue;
                        }
                        if (var621 == 4211) {
                            if (class33.field519 != null && class304.field4202 < class75.field1076) {
                                field2436[var2++] = class33.field519[class304.field4202++] & 0xFFFF;
                                continue;
                            }
                            field2436[var2++] = -1;
                            continue;
                        }
                        if (var621 == 4212) {
                            class304.field4202 = 0;
                            continue;
                        }
                    } else if (var621 < 4400) {
                        if (var621 == 4300) {
                            var2 -= 2;
                            int var340 = field2436[var2];
                            int var341 = field2436[var2 + 1];
                            class116 var342 = class44.method396((byte) 115, var341);
                            if (var342.method806(-116)) {
                                field2417[var3++] = class412.method2584(var340, true).method2110((byte) -88, var342.field1670, var341);
                            } else {
                                field2436[var2++] = class412.method2584(var340, true).method2099(var341, (byte) -69, var342.field1668);
                            }
                            continue;
                        }
                    } else if (var621 < 4500) {
                        if (var621 == 4400) {
                            var2 -= 2;
                            int var343 = field2436[var2];
                            int var344 = field2436[var2 + 1];
                            class116 var345 = class44.method396((byte) 94, var344);
                            if (var345.method806(-116)) {
                                field2417[var3++] = class375.method2395((byte) 94, var343).method494(var345.field1670, -129, var344);
                            } else {
                                field2436[var2++] = class375.method2395((byte) 75, var343).method496(0, var345.field1668, var344);
                            }
                            continue;
                        }
                    } else if (var621 < 4600) {
                        if (var621 == 4500) {
                            var2 -= 2;
                            int var346 = field2436[var2];
                            int var347 = field2436[var2 + 1];
                            class116 var348 = class44.method396((byte) -107, var347);
                            if (var348.method806(-116)) {
                                field2417[var3++] = class196.method1269(false, var346).method1388((byte) 85, var348.field1670, var347);
                            } else {
                                field2436[var2++] = class196.method1269(false, var346).method1394(var347, var348.field1668, 45);
                            }
                            continue;
                        }
                    } else if (var621 < 4700) {
                        if (var621 == 4600) {
                            var2--;
                            int var349 = field2436[var2];
                            class428 var350 = class155.method1041((byte) 88, var349);
                            if (var350.field6028 != null && var350.field6028.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field6051[0];
                                for (int var353 = 1; var353 < var350.field6028.length; var353++) {
                                    if (var350.field6051[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field6051[var353];
                                    }
                                }
                                field2436[var2++] = var350.field6028[var351];
                                continue;
                            }
                            field2436[var2++] = var350.field6055;
                            continue;
                        }
                    } else if (var621 < 5100) {
                        if (var621 == 5000) {
                            field2436[var2++] = class415.field5888;
                            continue;
                        }
                        if (var621 == 5001) {
                            var2 -= 3;
                            class415.field5888 = field2436[var2];
                            class359.field4901 = field2436[var2 + 1];
                            class197.field2706 = field2436[var2 + 2];
                            field2418++;
                            class46.field648.method1178(63, 234);
                            class46.field648.method173(class415.field5888, 255);
                            class46.field648.method173(class359.field4901, 255);
                            class46.field648.method173(class197.field2706, 255);
                            continue;
                        }
                        if (var621 == 5002) {
                            var3 -= 2;
                            String var354 = field2417[var3];
                            String var355 = field2417[var3 + 1];
                            var2 -= 2;
                            int var356 = field2436[var2];
                            int var357 = field2436[var2 + 1];
                            if (var355 == null) {
                                var355 = "";
                            }
                            if (var355.length() > 80) {
                                var355 = var355.substring(0, 80);
                            }
                            field2437++;
                            class46.field648.method1178(63, 186);
                            class46.field648.method173(class273.method1782((byte) 25, var354) + class273.method1782((byte) 25, var355) + 2, 255);
                            class46.field648.method160(var354, false);
                            class46.field648.method173(var356 - 1, 255);
                            class46.field648.method173(var357, 255);
                            class46.field648.method160(var355, false);
                            continue;
                        }
                        if (var621 == 5003) {
                            var2--;
                            int var358 = field2436[var2];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = class211.field2946[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field2417[var3++] = var359;
                            continue;
                        }
                        if (var621 == 5004) {
                            var2--;
                            int var360 = field2436[var2];
                            int var361 = -1;
                            if (var360 < 100 && class211.field2946[var360] != null) {
                                var361 = class290.field4056[var360];
                            }
                            field2436[var2++] = var361;
                            continue;
                        }
                        if (var621 == 5005) {
                            field2436[var2++] = class359.field4901;
                            continue;
                        }
                        if (var621 == 5008) {
                            var3--;
                            String var362 = field2417[var3];
                            if (class105.field1435 == 0 && (class387.field5561 && !class74.field1068 || class292.field4086)) {
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class337.field4639.method2763(-113, 0))) {
                                var364 = 0;
                                var362 = var362.substring(class337.field4639.method2763(106, 0).length());
                            } else if (var363.startsWith(class53.field736.method2763(-74, 0))) {
                                var364 = 1;
                                var362 = var362.substring(class53.field736.method2763(-92, 0).length());
                            } else if (var363.startsWith(class248.field3510.method2763(65, 0))) {
                                var364 = 2;
                                var362 = var362.substring(class248.field3510.method2763(74, 0).length());
                            } else if (var363.startsWith(class91.field1275.method2763(-101, 0))) {
                                var364 = 3;
                                var362 = var362.substring(class91.field1275.method2763(47, 0).length());
                            } else if (var363.startsWith(class380.field5429.method2763(126, 0))) {
                                var364 = 4;
                                var362 = var362.substring(class380.field5429.method2763(-125, 0).length());
                            } else if (var363.startsWith(class241.field3430.method2763(93, 0))) {
                                var364 = 5;
                                var362 = var362.substring(class241.field3430.method2763(-125, 0).length());
                            } else if (var363.startsWith(class282.field3992.method2763(118, 0))) {
                                var364 = 6;
                                var362 = var362.substring(class282.field3992.method2763(75, 0).length());
                            } else if (var363.startsWith(class48.field671.method2763(99, 0))) {
                                var364 = 7;
                                var362 = var362.substring(class48.field671.method2763(73, 0).length());
                            } else if (var363.startsWith(class144.field2058.method2763(-81, 0))) {
                                var364 = 8;
                                var362 = var362.substring(class144.field2058.method2763(52, 0).length());
                            } else if (var363.startsWith(class331.field4576.method2763(97, 0))) {
                                var364 = 9;
                                var362 = var362.substring(class331.field4576.method2763(101, 0).length());
                            } else if (var363.startsWith(class454.field6491.method2763(-123, 0))) {
                                var364 = 10;
                                var362 = var362.substring(class454.field6491.method2763(-94, 0).length());
                            } else if (var363.startsWith(class44.field628.method2763(55, 0))) {
                                var364 = 11;
                                var362 = var362.substring(class44.field628.method2763(-125, 0).length());
                            } else if (class210.field2935 != 0) {
                                if (var363.startsWith(class337.field4639.method2763(102, class210.field2935))) {
                                    var364 = 0;
                                    var362 = var362.substring(class337.field4639.method2763(-75, class210.field2935).length());
                                } else if (var363.startsWith(class53.field736.method2763(-128, class210.field2935))) {
                                    var364 = 1;
                                    var362 = var362.substring(class53.field736.method2763(-74, class210.field2935).length());
                                } else if (var363.startsWith(class248.field3510.method2763(-101, class210.field2935))) {
                                    var364 = 2;
                                    var362 = var362.substring(class248.field3510.method2763(-78, class210.field2935).length());
                                } else if (var363.startsWith(class91.field1275.method2763(-87, class210.field2935))) {
                                    var364 = 3;
                                    var362 = var362.substring(class91.field1275.method2763(41, class210.field2935).length());
                                } else if (var363.startsWith(class380.field5429.method2763(85, class210.field2935))) {
                                    var364 = 4;
                                    var362 = var362.substring(class380.field5429.method2763(62, class210.field2935).length());
                                } else if (var363.startsWith(class241.field3430.method2763(26, class210.field2935))) {
                                    var364 = 5;
                                    var362 = var362.substring(class241.field3430.method2763(-83, class210.field2935).length());
                                } else if (var363.startsWith(class282.field3992.method2763(127, class210.field2935))) {
                                    var364 = 6;
                                    var362 = var362.substring(class282.field3992.method2763(-123, class210.field2935).length());
                                } else if (var363.startsWith(class48.field671.method2763(47, class210.field2935))) {
                                    var364 = 7;
                                    var362 = var362.substring(class48.field671.method2763(61, class210.field2935).length());
                                } else if (var363.startsWith(class144.field2058.method2763(56, class210.field2935))) {
                                    var364 = 8;
                                    var362 = var362.substring(class144.field2058.method2763(120, class210.field2935).length());
                                } else if (var363.startsWith(class331.field4576.method2763(-113, class210.field2935))) {
                                    var364 = 9;
                                    var362 = var362.substring(class331.field4576.method2763(50, class210.field2935).length());
                                } else if (var363.startsWith(class454.field6491.method2763(-116, class210.field2935))) {
                                    var364 = 10;
                                    var362 = var362.substring(class454.field6491.method2763(125, class210.field2935).length());
                                } else if (var363.startsWith(class44.field628.method2763(88, class210.field2935))) {
                                    var364 = 11;
                                    var362 = var362.substring(class44.field628.method2763(72, class210.field2935).length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class155.field2185.method2763(-101, 0))) {
                                var366 = 1;
                                var362 = var362.substring(class155.field2185.method2763(53, 0).length());
                            } else if (var365.startsWith(class416.field5922.method2763(104, 0))) {
                                var366 = 2;
                                var362 = var362.substring(class416.field5922.method2763(-123, 0).length());
                            } else if (var365.startsWith(class59.field814.method2763(-122, 0))) {
                                var366 = 3;
                                var362 = var362.substring(class59.field814.method2763(40, 0).length());
                            } else if (var365.startsWith(class108.field1512.method2763(-107, 0))) {
                                var366 = 4;
                                var362 = var362.substring(class108.field1512.method2763(-74, 0).length());
                            } else if (var365.startsWith(class126.field1777.method2763(107, 0))) {
                                var366 = 5;
                                var362 = var362.substring(class126.field1777.method2763(24, 0).length());
                            } else if (class210.field2935 != 0) {
                                if (var365.startsWith(class155.field2185.method2763(86, class210.field2935))) {
                                    var366 = 1;
                                    var362 = var362.substring(class155.field2185.method2763(-99, class210.field2935).length());
                                } else if (var365.startsWith(class416.field5922.method2763(125, class210.field2935))) {
                                    var366 = 2;
                                    var362 = var362.substring(class416.field5922.method2763(-108, class210.field2935).length());
                                } else if (var365.startsWith(class59.field814.method2763(-100, class210.field2935))) {
                                    var366 = 3;
                                    var362 = var362.substring(class59.field814.method2763(122, class210.field2935).length());
                                } else if (var365.startsWith(class108.field1512.method2763(-114, class210.field2935))) {
                                    var366 = 4;
                                    var362 = var362.substring(class108.field1512.method2763(-117, class210.field2935).length());
                                } else if (var365.startsWith(class126.field1777.method2763(50, class210.field2935))) {
                                    var366 = 5;
                                    var362 = var362.substring(class126.field1777.method2763(108, class210.field2935).length());
                                }
                            }
                            field2429++;
                            class46.field648.method1178(63, 46);
                            class46.field648.method173(0, 255);
                            int var367 = class46.field648.field191;
                            class46.field648.method173(var364, 255);
                            class46.field648.method173(var366, 255);
                            class197.method1274(class46.field648, var362, -18604);
                            class46.field648.method170((byte) -9, class46.field648.field191 - var367);
                            continue;
                        }
                        if (var621 == 5009) {
                            var3 -= 2;
                            String var368 = field2417[var3];
                            String var369 = field2417[var3 + 1];
                            if (class105.field1435 != 0 || (!class387.field5561 || class74.field1068) && !class292.field4086) {
                                field2431++;
                                class46.field648.method1178(63, 57);
                                class46.field648.method173(0, 255);
                                int var370 = class46.field648.field191;
                                class46.field648.method160(var368, false);
                                class197.method1274(class46.field648, var369, -18604);
                                class46.field648.method170((byte) -9, class46.field648.field191 - var370);
                            }
                            continue;
                        }
                        if (var621 == 5010) {
                            var2--;
                            int var371 = field2436[var2];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = class347.field4757[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field2417[var3++] = var372;
                            continue;
                        }
                        if (var621 == 5011) {
                            var2--;
                            int var373 = field2436[var2];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = class364.field5134[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field2417[var3++] = var374;
                            continue;
                        }
                        if (var621 == 5012) {
                            var2--;
                            int var375 = field2436[var2];
                            int var376 = -1;
                            if (var375 < 100) {
                                var376 = class195.field2685[var375];
                            }
                            field2436[var2++] = var376;
                            continue;
                        }
                        if (var621 == 5015) {
                            String var377;
                            if (class412.field5841 == null || class412.field5841.field1937 == null) {
                                var377 = class17.field312;
                            } else {
                                var377 = class412.field5841.method931((byte) -123, true);
                            }
                            field2417[var3++] = var377;
                            continue;
                        }
                        if (var621 == 5016) {
                            field2436[var2++] = class197.field2706;
                            continue;
                        }
                        if (var621 == 5017) {
                            field2436[var2++] = class251.field3545;
                            continue;
                        }
                        if (var621 == 5018) {
                            var2--;
                            int var378 = field2436[var2];
                            int var379 = 0;
                            if (var378 < 100 && class211.field2946[var378] != null) {
                                var379 = class290.field4056[var378];
                            }
                            field2436[var2++] = var379;
                            continue;
                        }
                        if (var621 == 5019) {
                            var2--;
                            int var380 = field2436[var2];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = class453.field6327[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field2417[var3++] = var381;
                            continue;
                        }
                        if (var621 == 5020) {
                            String var382;
                            if (class412.field5841 == null || class412.field5841.field1937 == null) {
                                var382 = class17.field312;
                            } else {
                                var382 = class412.field5841.method939(false, (byte) 0);
                            }
                            field2417[var3++] = var382;
                            continue;
                        }
                        if (var621 == 5050) {
                            var2--;
                            int var383 = field2436[var2];
                            field2417[var3++] = class440.method2761((byte) 116, var383).field5359;
                            continue;
                        }
                        if (var621 == 5051) {
                            var2--;
                            int var384 = field2436[var2];
                            class376 var385 = class440.method2761((byte) 116, var384);
                            if (var385.field5363 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var385.field5363.length;
                            }
                            continue;
                        }
                        if (var621 == 5052) {
                            var2 -= 2;
                            int var386 = field2436[var2];
                            int var387 = field2436[var2 + 1];
                            class376 var388 = class440.method2761((byte) 116, var386);
                            int var389 = var388.field5363[var387];
                            field2436[var2++] = var389;
                            continue;
                        }
                        if (var621 == 5053) {
                            var2--;
                            int var390 = field2436[var2];
                            class376 var391 = class440.method2761((byte) 116, var390);
                            if (var391.field5357 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var391.field5357.length;
                            }
                            continue;
                        }
                        if (var621 == 5054) {
                            var2 -= 2;
                            int var392 = field2436[var2];
                            int var393 = field2436[var2 + 1];
                            field2436[var2++] = class440.method2761((byte) 116, var392).field5357[var393];
                            continue;
                        }
                        if (var621 == 5055) {
                            var2--;
                            int var394 = field2436[var2];
                            field2417[var3++] = class54.method443(var394, false).method2053(0);
                            continue;
                        }
                        if (var621 == 5056) {
                            var2--;
                            int var395 = field2436[var2];
                            class318 var396 = class54.method443(var395, false);
                            if (var396.field4338 == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var396.field4338.length;
                            }
                            continue;
                        }
                        if (var621 == 5057) {
                            var2 -= 2;
                            int var397 = field2436[var2];
                            int var398 = field2436[var2 + 1];
                            field2436[var2++] = class54.method443(var397, false).field4338[var398];
                            continue;
                        }
                        if (var621 == 5058) {
                            field2425 = new class279();
                            var2--;
                            field2425.field3914 = field2436[var2];
                            field2425.field3913 = class54.method443(field2425.field3914, false);
                            field2425.field3911 = new int[field2425.field3913.method2061(-81)];
                            continue;
                        }
                        if (var621 == 5059) {
                            field2422++;
                            class46.field648.method1178(63, 143);
                            class46.field648.method173(0, 255);
                            int var399 = class46.field648.field191;
                            class46.field648.method173(0, 255);
                            class46.field648.method191(field2425.field3914, -119);
                            field2425.field3913.method2062(class46.field648, field2425.field3911, 0);
                            class46.field648.method170((byte) -9, class46.field648.field191 - var399);
                            continue;
                        }
                        if (var621 == 5060) {
                            var3--;
                            String var400 = field2417[var3];
                            field2439++;
                            class46.field648.method1178(63, 201);
                            class46.field648.method173(0, 255);
                            int var401 = class46.field648.field191;
                            class46.field648.method160(var400, false);
                            class46.field648.method191(field2425.field3914, -112);
                            field2425.field3913.method2062(class46.field648, field2425.field3911, 0);
                            class46.field648.method170((byte) -9, class46.field648.field191 - var401);
                            continue;
                        }
                        if (var621 == 5061) {
                            field2422++;
                            class46.field648.method1178(63, 143);
                            class46.field648.method173(0, 255);
                            int var402 = class46.field648.field191;
                            class46.field648.method173(1, 255);
                            class46.field648.method191(field2425.field3914, -113);
                            field2425.field3913.method2062(class46.field648, field2425.field3911, 0);
                            class46.field648.method170((byte) -9, class46.field648.field191 - var402);
                            continue;
                        }
                        if (var621 == 5062) {
                            var2 -= 2;
                            int var403 = field2436[var2];
                            int var404 = field2436[var2 + 1];
                            field2436[var2++] = class440.method2761((byte) 116, var403).field5358[var404];
                            continue;
                        }
                        if (var621 == 5063) {
                            var2 -= 2;
                            int var405 = field2436[var2];
                            int var406 = field2436[var2 + 1];
                            field2436[var2++] = class440.method2761((byte) 116, var405).field5366[var406];
                            continue;
                        }
                        if (var621 == 5064) {
                            var2 -= 2;
                            int var407 = field2436[var2];
                            int var408 = field2436[var2 + 1];
                            if (var408 == -1) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = class440.method2761((byte) 116, var407).method2399((char) var408, (byte) 119);
                            }
                            continue;
                        }
                        if (var621 == 5065) {
                            var2 -= 2;
                            int var409 = field2436[var2];
                            int var410 = field2436[var2 + 1];
                            if (var410 == -1) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = class440.method2761((byte) 116, var409).method2407(512, (char) var410);
                            }
                            continue;
                        }
                        if (var621 == 5066) {
                            var2--;
                            int var411 = field2436[var2];
                            field2436[var2++] = class54.method443(var411, false).method2061(-116);
                            continue;
                        }
                        if (var621 == 5067) {
                            var2 -= 2;
                            int var412 = field2436[var2];
                            int var413 = field2436[var2 + 1];
                            int var414 = class54.method443(var412, false).method2058(-1, var413);
                            field2436[var2++] = var414;
                            continue;
                        }
                        if (var621 == 5068) {
                            var2 -= 2;
                            int var415 = field2436[var2];
                            int var416 = field2436[var2 + 1];
                            field2425.field3911[var415] = var416;
                            continue;
                        }
                        if (var621 == 5069) {
                            var2 -= 2;
                            int var417 = field2436[var2];
                            int var418 = field2436[var2 + 1];
                            field2425.field3911[var417] = var418;
                            continue;
                        }
                        if (var621 == 5070) {
                            var2 -= 3;
                            int var419 = field2436[var2];
                            int var420 = field2436[var2 + 1];
                            int var421 = field2436[var2 + 2];
                            class318 var422 = class54.method443(var419, false);
                            if (var422.method2058(-1, var420) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field2436[var2++] = var422.method2060(var420, (byte) -114, var421);
                            continue;
                        }
                        if (var621 == 5071) {
                            var3--;
                            String var423 = field2417[var3];
                            var2--;
                            boolean var424 = field2436[var2] == 1;
                            class187.method1213(var424, 16, var423);
                            field2436[var2++] = class75.field1076;
                            continue;
                        }
                        if (var621 == 5072) {
                            if (class33.field519 != null && class304.field4202 < class75.field1076) {
                                field2436[var2++] = class33.field519[class304.field4202++] & 0xFFFF;
                                continue;
                            }
                            field2436[var2++] = -1;
                            continue;
                        }
                        if (var621 == 5073) {
                            class304.field4202 = 0;
                            continue;
                        }
                    } else if (var621 < 5200) {
                        if (var621 == 5100) {
                            if (class203.field2790.method1872(86, 4463)) {
                                field2436[var2++] = 1;
                            } else {
                                field2436[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5101) {
                            if (class203.field2790.method1872(82, 4463)) {
                                field2436[var2++] = 1;
                            } else {
                                field2436[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5102) {
                            if (class203.field2790.method1872(81, 4463)) {
                                field2436[var2++] = 1;
                            } else {
                                field2436[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var621 < 5300) {
                        if (var621 == 5200) {
                            var2--;
                            class123.method831((byte) 114, field2436[var2]);
                            continue;
                        }
                        if (var621 == 5201) {
                            field2436[var2++] = class114.method797(10304);
                            continue;
                        }
                        if (var621 == 5205) {
                            var2--;
                            class195.method1259(false, -1, field2436[var2], -1, false);
                            continue;
                        }
                        if (var621 == 5206) {
                            var2--;
                            int var425 = field2436[var2];
                            class405 var426 = class354.method2268(var425 >> 14 & 0x3FFF, var425 & 0x3FFF);
                            if (var426 == null) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = var426.field5750;
                            }
                            continue;
                        }
                        if (var621 == 5207) {
                            var2--;
                            class405 var427 = class354.method2272(field2436[var2]);
                            if (var427 != null && var427.field5746 != null) {
                                field2417[var3++] = var427.field5746;
                                continue;
                            }
                            field2417[var3++] = "";
                            continue;
                        }
                        if (var621 == 5208) {
                            field2436[var2++] = class181.field2485;
                            field2436[var2++] = class34.field536;
                            continue;
                        }
                        if (var621 == 5209) {
                            field2436[var2++] = class354.field4843 + class222.field3100;
                            field2436[var2++] = class354.field4858 + class254.field3580;
                            continue;
                        }
                        if (var621 == 5210) {
                            var2--;
                            int var428 = field2436[var2];
                            class405 var429 = class354.method2272(var428);
                            if (var429 == null) {
                                field2436[var2++] = 0;
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var429.field5749 >> 14 & 0x3FFF;
                                field2436[var2++] = var429.field5749 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var621 == 5211) {
                            var2--;
                            int var430 = field2436[var2];
                            class405 var431 = class354.method2272(var430);
                            if (var431 == null) {
                                field2436[var2++] = 0;
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var431.field5761 - var431.field5756;
                                field2436[var2++] = var431.field5745 - var431.field5755;
                            }
                            continue;
                        }
                        if (var621 == 5212) {
                            class62 var432 = class163.method1079(true);
                            if (var432 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = var432.field851;
                                int var433 = var432.field854 << 28 | class354.field4843 + var432.field852 << 14 | class354.field4858 + var432.field858;
                                field2436[var2++] = var433;
                            }
                            continue;
                        }
                        if (var621 == 5213) {
                            class62 var434 = class83.method603((byte) -102);
                            if (var434 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = var434.field851;
                                int var435 = var434.field854 << 28 | class354.field4843 + var434.field852 << 14 | class354.field4858 + var434.field858;
                                field2436[var2++] = var435;
                            }
                            continue;
                        }
                        if (var621 == 5214) {
                            var2--;
                            int var436 = field2436[var2];
                            class405 var437 = class403.method2528((byte) -53);
                            if (var437 != null) {
                                boolean var438 = var437.method2539(field2442, Integer.MAX_VALUE, var436 >> 14 & 0x3FFF, var436 >> 28 & 0x3, var436 & 0x3FFF);
                                if (var438) {
                                    class316.method2048(field2442[1], 99, field2442[2]);
                                }
                            }
                            continue;
                        }
                        if (var621 == 5215) {
                            var2 -= 2;
                            int var439 = field2436[var2];
                            int var440 = field2436[var2 + 1];
                            class393 var441 = class354.method2259(var439 >> 14 & 0x3FFF, var439 & 0x3FFF);
                            boolean var442 = false;
                            for (class405 var443 = (class405) var441.method2482(-109); var443 != null; var443 = (class405) var441.method2476(1)) {
                                if (var443.field5750 == var440) {
                                    var442 = true;
                                    break;
                                }
                            }
                            if (var442) {
                                field2436[var2++] = 1;
                            } else {
                                field2436[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5218) {
                            var2--;
                            int var444 = field2436[var2];
                            class405 var445 = class354.method2272(var444);
                            if (var445 == null) {
                                field2436[var2++] = -1;
                            } else {
                                field2436[var2++] = var445.field5751;
                            }
                            continue;
                        }
                        if (var621 == 5220) {
                            field2436[var2++] = class89.field1244 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5221) {
                            var2--;
                            int var446 = field2436[var2];
                            class316.method2048(var446 >> 14 & 0x3FFF, 125, var446 & 0x3FFF);
                            continue;
                        }
                        if (var621 == 5222) {
                            class405 var447 = class403.method2528((byte) -55);
                            if (var447 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = -1;
                            } else {
                                boolean var448 = var447.method2545(field2442, true, class354.field4843 + class222.field3100, class354.field4858 + class254.field3580);
                                if (var448) {
                                    field2436[var2++] = field2442[1];
                                    field2436[var2++] = field2442[2];
                                } else {
                                    field2436[var2++] = -1;
                                    field2436[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5223) {
                            var2 -= 2;
                            int var449 = field2436[var2];
                            int var450 = field2436[var2 + 1];
                            class195.method1259(false, var450 >> 14 & 0x3FFF, var449, var450 & 0x3FFF, false);
                            continue;
                        }
                        if (var621 == 5224) {
                            var2--;
                            int var451 = field2436[var2];
                            class405 var452 = class403.method2528((byte) -75);
                            if (var452 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = -1;
                            } else {
                                boolean var453 = var452.method2539(field2442, Integer.MAX_VALUE, var451 >> 14 & 0x3FFF, var451 >> 28 & 0x3, var451 & 0x3FFF);
                                if (var453) {
                                    field2436[var2++] = field2442[1];
                                    field2436[var2++] = field2442[2];
                                } else {
                                    field2436[var2++] = -1;
                                    field2436[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5225) {
                            var2--;
                            int var454 = field2436[var2];
                            class405 var455 = class403.method2528((byte) -99);
                            if (var455 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = -1;
                            } else {
                                boolean var456 = var455.method2545(field2442, true, var454 >> 14 & 0x3FFF, var454 & 0x3FFF);
                                if (var456) {
                                    field2436[var2++] = field2442[1];
                                    field2436[var2++] = field2442[2];
                                } else {
                                    field2436[var2++] = -1;
                                    field2436[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5226) {
                            var2--;
                            class389.method2462(field2436[var2], -23063);
                            continue;
                        }
                        if (var621 == 5227) {
                            var2 -= 2;
                            int var457 = field2436[var2];
                            int var458 = field2436[var2 + 1];
                            class195.method1259(false, var458 >> 14 & 0x3FFF, var457, var458 & 0x3FFF, true);
                            continue;
                        }
                        if (var621 == 5228) {
                            var2--;
                            class377.field5388 = field2436[var2] == 1;
                            continue;
                        }
                        if (var621 == 5229) {
                            field2436[var2++] = class377.field5388 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5230) {
                            var2--;
                            int var459 = field2436[var2];
                            class453.method2805(var459, false);
                            continue;
                        }
                        if (var621 == 5231) {
                            var2 -= 2;
                            int var460 = field2436[var2];
                            boolean var461 = field2436[var2 + 1] == 1;
                            if (class126.field1780 == null) {
                                continue;
                            }
                            class390 var462 = class126.field1780.method886((long) var460, 25651);
                            if (var462 != null && !var461) {
                                var462.method2467((byte) 102);
                                continue;
                            }
                            if (var462 == null && var461) {
                                class390 var463 = new class390();
                                class126.field1780.method883((byte) -54, (long) var460, var463);
                            }
                            continue;
                        }
                        if (var621 == 5232) {
                            var2--;
                            int var464 = field2436[var2];
                            if (class126.field1780 == null) {
                                field2436[var2++] = 0;
                            } else {
                                class390 var465 = class126.field1780.method886((long) var464, 25651);
                                field2436[var2++] = var465 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5233) {
                            var2 -= 2;
                            int var466 = field2436[var2];
                            boolean var467 = field2436[var2 + 1] == 1;
                            if (class406.field5775 == null) {
                                continue;
                            }
                            class390 var468 = class406.field5775.method886((long) var466, 25651);
                            if (var468 != null && !var467) {
                                var468.method2467((byte) -55);
                                continue;
                            }
                            if (var468 == null && var467) {
                                class390 var469 = new class390();
                                class406.field5775.method883((byte) -54, (long) var466, var469);
                            }
                            continue;
                        }
                        if (var621 == 5234) {
                            var2--;
                            int var470 = field2436[var2];
                            if (class406.field5775 == null) {
                                field2436[var2++] = 0;
                            } else {
                                class390 var471 = class406.field5775.method886((long) var470, 25651);
                                field2436[var2++] = var471 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5235) {
                            field2436[var2++] = class354.field4829 == null ? -1 : class354.field4829.field5750;
                            continue;
                        }
                    } else if (var621 < 5400) {
                        if (var621 == 5300) {
                            var2 -= 2;
                            int var472 = field2436[var2];
                            int var473 = field2436[var2 + 1];
                            class388.method2460(-1538, var472, false, 3, var473);
                            field2436[var2++] = class217.field2997 == null ? 0 : 1;
                            continue;
                        }
                        if (var621 == 5301) {
                            if (class217.field2997 != null) {
                                class388.method2460(-1538, -1, false, class284.field4010, -1);
                            }
                            continue;
                        }
                        if (var621 == 5302) {
                            class2[] var474 = class304.method1963(-1);
                            field2436[var2++] = var474.length;
                            continue;
                        }
                        if (var621 == 5303) {
                            var2--;
                            int var475 = field2436[var2];
                            class2[] var476 = class304.method1963(-1);
                            field2436[var2++] = var476[var475].field22;
                            field2436[var2++] = var476[var475].field20;
                            continue;
                        }
                        if (var621 == 5305) {
                            int var477 = class53.field741;
                            int var478 = class306.field4224;
                            int var479 = -1;
                            class2[] var480 = class304.method1963(-1);
                            for (int var481 = 0; var481 < var480.length; var481++) {
                                class2 var482 = var480[var481];
                                if (var482.field22 == var477 && var482.field20 == var478) {
                                    var479 = var481;
                                    break;
                                }
                            }
                            field2436[var2++] = var479;
                            continue;
                        }
                        if (var621 == 5306) {
                            field2436[var2++] = class405.method2542(-1);
                            continue;
                        }
                        if (var621 == 5307) {
                            var2--;
                            int var483 = field2436[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class388.method2460(-1538, -1, false, var483, -1);
                            }
                            continue;
                        }
                        if (var621 == 5308) {
                            field2436[var2++] = class284.field4010;
                            continue;
                        }
                        if (var621 == 5309) {
                            var2--;
                            int var484 = field2436[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class284.field4010 = var484;
                                class271.method1775(class241.field3426, 106);
                            }
                            continue;
                        }
                    } else if (var621 < 5500) {
                        if (var621 == 5400) {
                            var3 -= 2;
                            String var485 = field2417[var3];
                            String var486 = field2417[var3 + 1];
                            var2--;
                            int var487 = field2436[var2];
                            field2424++;
                            class46.field648.method1178(63, 141);
                            class46.field648.method173(class273.method1782((byte) 25, var485) + class273.method1782((byte) 25, var486) + 1, 255);
                            class46.field648.method160(var485, false);
                            class46.field648.method160(var486, false);
                            class46.field648.method173(var487, 255);
                            continue;
                        }
                        if (var621 == 5401) {
                            var2 -= 2;
                            class310.field4250[field2436[var2]] = (short) class438.method2755(field2436[var2 + 1], -32430);
                            class121.method828(360);
                            class288.method1876(false);
                            class374.method2384((byte) -35);
                            class71.method538(-111);
                            class386.method2450((byte) -127);
                            continue;
                        }
                        if (var621 == 5405) {
                            var2 -= 2;
                            int var488 = field2436[var2];
                            int var489 = field2436[var2 + 1];
                            if (var488 >= 0 && var488 < 2) {
                                class5.field89[var488] = new int[var489 << 1][4];
                            }
                            continue;
                        }
                        if (var621 == 5406) {
                            var2 -= 7;
                            int var490 = field2436[var2];
                            int var491 = field2436[var2 + 1] << 1;
                            int var492 = field2436[var2 + 2];
                            int var493 = field2436[var2 + 3];
                            int var494 = field2436[var2 + 4];
                            int var495 = field2436[var2 + 5];
                            int var496 = field2436[var2 + 6];
                            if (var490 >= 0 && var490 < 2 && class5.field89[var490] != null && var491 >= 0 && var491 < class5.field89[var490].length) {
                                class5.field89[var490][var491] = new int[] { (var492 >> 14 & 0x3FFF) * 128, var493, (var492 & 0x3FFF) * 128, var496 };
                                class5.field89[var490][var491 + 1] = new int[] { (var494 >> 14 & 0x3FFF) * 128, var495, (var494 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var621 == 5407) {
                            var2--;
                            int var497 = class5.field89[field2436[var2]].length >> 1;
                            field2436[var2++] = var497;
                            continue;
                        }
                        if (var621 == 5411) {
                            if (class217.field2997 != null) {
                                class388.method2460(-1538, -1, false, class284.field4010, -1);
                            }
                            if (class79.field1119 == null) {
                                String var498 = class397.field5674 == null ? class394.method2494(2) : class397.field5674;
                                class159.method1060(false, class241.field3426, class326.field4462 == 1, var498, -29841);
                            } else {
                                class2.method9(-25817);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var621 == 5419) {
                            String var499 = "";
                            if (class406.field5772 != null) {
                                if (class406.field5772.field3999 == null) {
                                    var499 = class229.method1583(class406.field5772.field4002, (byte) 49);
                                } else {
                                    var499 = (String) class406.field5772.field3999;
                                }
                            }
                            field2417[var3++] = var499;
                            continue;
                        }
                        if (var621 == 5420) {
                            field2436[var2++] = class294.field4112 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5421) {
                            if (class217.field2997 != null) {
                                class388.method2460(-1538, -1, false, class284.field4010, -1);
                            }
                            var3--;
                            String var500 = field2417[var3];
                            var2--;
                            boolean var501 = field2436[var2] == 1;
                            String var502 = class394.method2494(2) + var500;
                            class159.method1060(var501, class241.field3426, class326.field4462 == 1, var502, -29841);
                            continue;
                        }
                        if (var621 == 5422) {
                            var3 -= 2;
                            String var503 = field2417[var3];
                            String var504 = field2417[var3 + 1];
                            var2--;
                            int var505 = field2436[var2];
                            if (var503.length() > 0) {
                                if (class22.field400 == null) {
                                    class22.field400 = new String[class165.field2292[class129.field1827]];
                                }
                                class22.field400[var505] = var503;
                            }
                            if (var504.length() > 0) {
                                if (class378.field5405 == null) {
                                    class378.field5405 = new String[class165.field2292[class129.field1827]];
                                }
                                class378.field5405[var505] = var504;
                            }
                            continue;
                        }
                        if (var621 == 5423) {
                            var3--;
                            System.out.println(field2417[var3]);
                            continue;
                        }
                        if (var621 == 5424) {
                            var2 -= 11;
                            class290.field4071 = field2436[var2];
                            class105.field1434 = field2436[var2 + 1];
                            class442.field6211 = field2436[var2 + 2];
                            class251.field3546 = field2436[var2 + 3];
                            class66.field988 = field2436[var2 + 4];
                            class63.field868 = field2436[var2 + 5];
                            class63.field870 = field2436[var2 + 6];
                            class133.field1895 = field2436[var2 + 7];
                            class224.field3173 = field2436[var2 + 8];
                            class378.field5398 = field2436[var2 + 9];
                            class76.field1095 = field2436[var2 + 10];
                            class212.field2969.method1759(-82, class66.field988);
                            class212.field2969.method1759(-114, class63.field868);
                            class212.field2969.method1759(-87, class63.field870);
                            class212.field2969.method1759(-112, class133.field1895);
                            class212.field2969.method1759(-125, class224.field3173);
                            class280.field3939 = null;
                            class164.field2267 = null;
                            class297.field4158 = null;
                            class436.field6138 = null;
                            class240.field3421 = null;
                            class373.field5243 = null;
                            class255.field3588 = null;
                            class161.field2246 = null;
                            class173.field2367 = true;
                            continue;
                        }
                        if (var621 == 5425) {
                            class303.method1958((byte) -123);
                            class173.field2367 = false;
                            continue;
                        }
                        if (var621 == 5426) {
                            var2 -= 2;
                            class382.field5460 = field2436[var2];
                            class341.field4666 = field2436[var2 + 1];
                            continue;
                        }
                        if (var621 == 5427) {
                            var2 -= 2;
                            class160.field2241 = field2436[var2 + 1];
                            continue;
                        }
                        if (var621 == 5428) {
                            var2 -= 2;
                            int var506 = field2436[var2];
                            int var507 = field2436[var2 + 1];
                            field2436[var2++] = class45.method398(-1, var506, var507) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5429) {
                            var3--;
                            class233.method1596(63, false, field2417[var3]);
                            continue;
                        }
                    } else if (var621 < 5600) {
                        if (var621 == 5500) {
                            var2 -= 4;
                            int var508 = field2436[var2];
                            int var509 = field2436[var2 + 1];
                            int var510 = field2436[var2 + 2];
                            int var511 = field2436[var2 + 3];
                            class206.method1337(var510, (byte) 87, (var508 & 0x3FFF) - class447.field6269, (var508 >> 14 & 0x3FFF) - class212.field2968, var509, false, var511);
                            continue;
                        }
                        if (var621 == 5501) {
                            var2 -= 4;
                            int var512 = field2436[var2];
                            int var513 = field2436[var2 + 1];
                            int var514 = field2436[var2 + 2];
                            int var515 = field2436[var2 + 3];
                            class48.method416(var514, (var512 & 0x3FFF) - class447.field6269, -47, (var512 >> 14 & 0x3FFF) - class212.field2968, var515, var513);
                            continue;
                        }
                        if (var621 == 5502) {
                            var2 -= 6;
                            int var516 = field2436[var2];
                            if (var516 >= 2) {
                                throw new RuntimeException();
                            }
                            class282.field3996 = var516;
                            int var517 = field2436[var2 + 1];
                            if (var517 + 1 >= class5.field89[class282.field3996].length >> 1) {
                                throw new RuntimeException();
                            }
                            class77.field1105 = var517;
                            class146.field2082 = 0;
                            class346.field4727 = field2436[var2 + 2];
                            class453.field6466 = field2436[var2 + 3];
                            int var518 = field2436[var2 + 4];
                            if (var518 >= 2) {
                                throw new RuntimeException();
                            }
                            class18.field322 = var518;
                            int var519 = field2436[var2 + 5];
                            if (var519 + 1 >= class5.field89[class18.field322].length >> 1) {
                                throw new RuntimeException();
                            }
                            class187.field2522 = var519;
                            class128.field1807 = 3;
                            continue;
                        }
                        if (var621 == 5503) {
                            class83.method605(64);
                            continue;
                        }
                        if (var621 == 5504) {
                            var2 -= 2;
                            class34.method335(-4, field2436[var2 + 1], field2436[var2], 0);
                            continue;
                        }
                        if (var621 == 5505) {
                            field2436[var2++] = (int) class24.field416 >> 3;
                            continue;
                        }
                        if (var621 == 5506) {
                            field2436[var2++] = (int) class333.field4599 >> 3;
                            continue;
                        }
                        if (var621 == 5507) {
                            class413.method2592(true);
                            continue;
                        }
                        if (var621 == 5508) {
                            class290.method1878(-2);
                            continue;
                        }
                        if (var621 == 5509) {
                            class388.method2458(0);
                            continue;
                        }
                        if (var621 == 5510) {
                            class311.method2001(-128);
                            continue;
                        }
                        if (var621 == 5511) {
                            var2--;
                            int var520 = field2436[var2];
                            int var521 = var520 >> 14 & 0x3FFF;
                            int var522 = var520 & 0x3FFF;
                            int var523 = var521 - class212.field2968;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class211.field2954) {
                                var523 = class211.field2954;
                            }
                            int var524 = var522 - class447.field6269;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class290.field4061) {
                                var524 = class290.field4061;
                            }
                            class51.field702 = var523 * 128 + 64;
                            class76.field1100 = var524 * 128 + 64;
                            class128.field1807 = 4;
                            continue;
                        }
                        if (var621 == 5512) {
                            class420.method2635((byte) 122);
                            continue;
                        }
                    } else if (var621 < 5700) {
                        if (var621 == 5600) {
                            var3 -= 2;
                            String var525 = field2417[var3];
                            String var526 = field2417[var3 + 1];
                            var2--;
                            int var527 = field2436[var2];
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0 && class39.field573 == 0) {
                                class211.method1392(var526, var525, (byte) -87, var527);
                            }
                            continue;
                        }
                        if (var621 == 5601) {
                            class20.method275(false);
                            continue;
                        }
                        if (var621 == 5602) {
                            if (class99.field1374 == 0) {
                                class390.field5593 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5603) {
                            var2 -= 4;
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0 && class39.field573 == 0) {
                                class273.method1781(field2436[var2 + 2], field2436[var2 + 1], field2436[var2], false, field2436[var2 + 3]);
                            }
                            continue;
                        }
                        if (var621 == 5604) {
                            var3--;
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0 && class39.field573 == 0) {
                                class16.method242(0, class67.method527(field2417[var3], (byte) -122));
                            }
                            continue;
                        }
                        if (var621 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0 && class39.field573 == 0) {
                                class143.method984(field2436[var2], 8, field2436[var2 + 5] == 1, field2436[var2 + 2], field2417[var3 + 2], field2417[var3 + 1], field2436[var2 + 6] == 1, class67.method527(field2417[var3], (byte) -126), field2436[var2 + 3], field2436[var2 + 1], field2436[var2 + 4] == 1);
                            }
                            continue;
                        }
                        if (var621 == 5606) {
                            if (class19.field367 == 0) {
                                class438.field6170 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5607) {
                            field2436[var2++] = class390.field5593;
                            continue;
                        }
                        if (var621 == 5608) {
                            field2436[var2++] = class188.field2596;
                            continue;
                        }
                        if (var621 == 5609) {
                            field2436[var2++] = class438.field6170;
                            continue;
                        }
                        if (var621 == 5610) {
                            for (int var528 = 0; var528 < 5; var528++) {
                                field2417[var3++] = class264.field3685.length > var528 ? class76.method565((byte) -72, class264.field3685[var528]) : "";
                            }
                            class264.field3685 = null;
                            continue;
                        }
                        if (var621 == 5611) {
                            field2436[var2++] = class364.field5137;
                            continue;
                        }
                    } else if (var621 < 6100) {
                        if (var621 == 6001) {
                            var2--;
                            int var529 = field2436[var2];
                            if (var529 < 1) {
                                var529 = 1;
                            }
                            if (var529 > 4) {
                                var529 = 4;
                            }
                            class361.field5000 = var529;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 27);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6002) {
                            var2--;
                            class34.method337(field2436[var2] == 1, (byte) 67);
                            class337.method2155((byte) 55);
                            class39.method367((byte) -64);
                            class163.method1077((byte) 0);
                            class271.method1775(class241.field3426, 114);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6003) {
                            var2--;
                            class61.field845 = field2436[var2] == 1;
                            class163.method1077((byte) 0);
                            class271.method1775(class241.field3426, 88);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6005) {
                            var2--;
                            class154.field2169 = field2436[var2] == 1;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 37);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6006) {
                            var2--;
                            class414.field5867 = field2436[var2] == 1;
                            class64.field949.method55(!class414.field5867);
                            class271.method1775(class241.field3426, 47);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6007) {
                            var2--;
                            class237.field3369 = field2436[var2];
                            class271.method1775(class241.field3426, 29);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6008) {
                            var2--;
                            class70.field1032 = field2436[var2] == 1;
                            class271.method1775(class241.field3426, 80);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6009) {
                            var2--;
                            class64.field886 = field2436[var2] == 1;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 118);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6010) {
                            var2--;
                            class106.field1472 = field2436[var2] == 1;
                            class271.method1775(class241.field3426, 33);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6011) {
                            var2--;
                            int var530 = field2436[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class327.field4508 = var530;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 25);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6012) {
                            var2--;
                            class312.field4271 = field2436[var2] == 1;
                            class29.method309(205);
                            class271.method1775(class241.field3426, 70);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6014) {
                            var2--;
                            class171.field2346 = field2436[var2] == 1;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 113);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6015) {
                            var2--;
                            class54.field755 = field2436[var2] == 1;
                            class39.method367((byte) -64);
                            class271.method1775(class241.field3426, 87);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6016) {
                            var2--;
                            int var531 = field2436[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class403.field5720 = var531;
                            class121.method824((byte) 108);
                            class271.method1775(class241.field3426, 109);
                            continue;
                        }
                        if (var621 == 6017) {
                            var2--;
                            class133.field1904 = field2436[var2] == 1;
                            class276.method1798(124);
                            class271.method1775(class241.field3426, 53);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6018) {
                            var2--;
                            int var532 = field2436[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 127) {
                                var532 = 127;
                            }
                            class371.field5212 = var532;
                            class271.method1775(class241.field3426, 87);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6019) {
                            var2--;
                            int var533 = field2436[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 255) {
                                var533 = 255;
                            }
                            if (class52.field731 != var533) {
                                if (class52.field731 == 0 && class434.field6125 != -1) {
                                    class170.method1122(var533, 1, 0, class362.field5004, false, class434.field6125);
                                    class429.field6078 = false;
                                } else if (var533 == 0) {
                                    class112.method790(-123);
                                    class429.field6078 = false;
                                } else {
                                    class180.method1177(var533, 62);
                                }
                                class52.field731 = var533;
                            }
                            class271.method1775(class241.field3426, 90);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6020) {
                            var2--;
                            int var534 = field2436[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 127) {
                                var534 = 127;
                            }
                            class345.field4692 = var534;
                            class271.method1775(class241.field3426, 108);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6021) {
                            var2--;
                            class114.field1638 = field2436[var2] == 1;
                            class163.method1077((byte) 0);
                            continue;
                        }
                        if (var621 == 6023) {
                            var2--;
                            int var535 = field2436[var2];
                            boolean var536 = false;
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 2) {
                                var535 = 2;
                            }
                            if (class445.field6242 < 96) {
                                var535 = 0;
                                var536 = true;
                            }
                            class244.method1654(0, var535);
                            class271.method1775(class241.field3426, 125);
                            class328.field4537 = false;
                            field2436[var2++] = var536 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 6024) {
                            var2--;
                            int var537 = field2436[var2];
                            if (var537 < 0 || var537 > 2) {
                                var537 = 0;
                            }
                            class205.field2824 = var537;
                            class271.method1775(class241.field3426, 116);
                            continue;
                        }
                        if (var621 == 6025) {
                            var2--;
                            int var538 = field2436[var2];
                            if (var538 < 0 || var538 > class386.method2446(class445.field6242, -6819)) {
                                var538 = 0;
                            }
                            class42.field614 = var538;
                            class271.method1775(class241.field3426, 53);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6027) {
                            var2--;
                            int var539 = field2436[var2];
                            if (var539 < 0 || var539 > 1) {
                                var539 = 0;
                            }
                            class173.method1137(-128, var539 == 1);
                            continue;
                        }
                        if (var621 == 6028) {
                            var2--;
                            class214.field2988 = field2436[var2] != 0;
                            class271.method1775(class241.field3426, 108);
                            continue;
                        }
                        if (var621 == 6029) {
                            var2--;
                            class237.field3369 = field2436[var2];
                            class271.method1775(class241.field3426, 81);
                            continue;
                        }
                        if (var621 == 6030) {
                            var2--;
                            class175.field2397 = field2436[var2] != 0;
                            class271.method1775(class241.field3426, 120);
                            class39.method367((byte) -64);
                            continue;
                        }
                        if (var621 == 6031) {
                            var2--;
                            int var540 = field2436[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class412.method2588(var540, 42);
                            continue;
                        }
                        if (var621 == 6032) {
                            var2--;
                            int var541 = field2436[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class251.field3544 = var541;
                            class271.method1775(class241.field3426, 64);
                            class328.field4537 = false;
                            continue;
                        }
                        if (var621 == 6033) {
                            var2--;
                            int var542 = field2436[var2];
                            if (var542 < 0 || var542 > 4) {
                                var542 = 2;
                            }
                            class411.field5840 = var542;
                            class271.method1775(class241.field3426, 42);
                            continue;
                        }
                    } else if (var621 < 6200) {
                        if (var621 == 6101) {
                            field2436[var2++] = class361.field5000;
                            continue;
                        }
                        if (var621 == 6102) {
                            field2436[var2++] = class51.method428(-1) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6103) {
                            field2436[var2++] = class61.field845 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6105) {
                            field2436[var2++] = class154.field2169 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6106) {
                            field2436[var2++] = class414.field5867 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6107) {
                            field2436[var2++] = class237.field3369;
                            continue;
                        }
                        if (var621 == 6108) {
                            field2436[var2++] = class70.field1032 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6109) {
                            field2436[var2++] = class64.field886 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6110) {
                            field2436[var2++] = class106.field1472 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6111) {
                            field2436[var2++] = class327.field4508;
                            continue;
                        }
                        if (var621 == 6112) {
                            field2436[var2++] = class312.field4271 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6114) {
                            field2436[var2++] = class171.field2346 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6115) {
                            field2436[var2++] = class54.field755 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6116) {
                            field2436[var2++] = class403.field5720;
                            continue;
                        }
                        if (var621 == 6117) {
                            field2436[var2++] = class133.field1904 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6118) {
                            field2436[var2++] = class371.field5212;
                            continue;
                        }
                        if (var621 == 6119) {
                            field2436[var2++] = class52.field731;
                            continue;
                        }
                        if (var621 == 6120) {
                            field2436[var2++] = class345.field4692;
                            continue;
                        }
                        if (var621 == 6121) {
                            field2436[var2++] = class64.field949.method102() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6123) {
                            field2436[var2++] = class39.method365((byte) 117);
                            continue;
                        }
                        if (var621 == 6124) {
                            field2436[var2++] = class205.field2824;
                            continue;
                        }
                        if (var621 == 6125) {
                            field2436[var2++] = class42.field614;
                            continue;
                        }
                        if (var621 == 6126) {
                            field2436[var2++] = class64.field949.method140() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6127) {
                            field2436[var2++] = class288.field4049 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6128) {
                            field2436[var2++] = class214.field2988 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6129) {
                            field2436[var2++] = class237.field3369;
                            continue;
                        }
                        if (var621 == 6130) {
                            field2436[var2++] = class175.field2397 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6131) {
                            field2436[var2++] = class326.field4462;
                            continue;
                        }
                        if (var621 == 6132) {
                            field2436[var2++] = class251.field3544;
                            continue;
                        }
                        if (var621 == 6133) {
                            field2436[var2++] = class294.field4112 == 1 || class294.field4112 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6134) {
                            field2436[var2++] = class386.method2446(class445.field6242, -6819);
                            continue;
                        }
                        if (var621 == 6135) {
                            field2436[var2++] = class411.field5840;
                            continue;
                        }
                    } else if (var621 < 6300) {
                        if (var621 == 6200) {
                            var2 -= 2;
                            class329.field4567 = (short) field2436[var2];
                            if (class329.field4567 <= 0) {
                                class329.field4567 = 256;
                            }
                            class29.field489 = (short) field2436[var2 + 1];
                            if (class29.field489 <= 0) {
                                class29.field489 = 205;
                            }
                            continue;
                        }
                        if (var621 == 6201) {
                            var2 -= 2;
                            class63.field869 = (short) field2436[var2];
                            if (class63.field869 <= 0) {
                                class63.field869 = 256;
                            }
                            class231.field3341 = (short) field2436[var2 + 1];
                            if (class231.field3341 <= 0) {
                                class231.field3341 = 320;
                            }
                            continue;
                        }
                        if (var621 == 6202) {
                            var2 -= 4;
                            class245.field3458 = (short) field2436[var2];
                            if (class245.field3458 <= 0) {
                                class245.field3458 = 1;
                            }
                            class204.field2812 = (short) field2436[var2 + 1];
                            if (class204.field2812 <= 0) {
                                class204.field2812 = 32767;
                            } else if (class204.field2812 < class245.field3458) {
                                class204.field2812 = class245.field3458;
                            }
                            class306.field4230 = (short) field2436[var2 + 2];
                            if (class306.field4230 <= 0) {
                                class306.field4230 = 1;
                            }
                            class275.field3832 = (short) field2436[var2 + 3];
                            if (class275.field3832 <= 0) {
                                class275.field3832 = 32767;
                            } else if (class275.field3832 < class306.field4230) {
                                class275.field3832 = class306.field4230;
                            }
                            continue;
                        }
                        if (var621 == 6203) {
                            class243.method1648(0, 0, class143.field2056.field6447, class143.field2056.field6342, false, -111);
                            field2436[var2++] = class447.field6277;
                            field2436[var2++] = class371.field5226;
                            continue;
                        }
                        if (var621 == 6204) {
                            field2436[var2++] = class63.field869;
                            field2436[var2++] = class231.field3341;
                            continue;
                        }
                        if (var621 == 6205) {
                            field2436[var2++] = class329.field4567;
                            field2436[var2++] = class29.field489;
                            continue;
                        }
                    } else if (var621 < 6400) {
                        if (var621 == 6300) {
                            field2436[var2++] = (int) (class385.method2442(-6631) / 60000L);
                            continue;
                        }
                        if (var621 == 6301) {
                            field2436[var2++] = (int) (class385.method2442(-6631) / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6302) {
                            var2 -= 3;
                            int var543 = field2436[var2];
                            int var544 = field2436[var2 + 1];
                            int var545 = field2436[var2 + 2];
                            field2423.clear();
                            field2423.set(11, 12);
                            field2423.set(var545, var544, var543);
                            field2436[var2++] = (int) (field2423.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6303) {
                            field2423.clear();
                            field2423.setTime(new Date(class385.method2442(-6631)));
                            field2436[var2++] = field2423.get(1);
                            continue;
                        }
                        if (var621 == 6304) {
                            var2--;
                            int var546 = field2436[var2];
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
                            field2436[var2++] = var547 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6500) {
                        if (var621 == 6405) {
                            field2436[var2++] = class12.method217(1) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6406) {
                            field2436[var2++] = class239.method1623((byte) -127) ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6600) {
                        if (var621 == 6500) {
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0) {
                                field2436[var2++] = class397.method2511((byte) -104) == -1 ? 0 : 1;
                                continue;
                            }
                            field2436[var2++] = 1;
                            continue;
                        }
                        if (var621 == 6501) {
                            class437 var548 = class217.method1404(true);
                            if (var548 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = 0;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var548.field6149;
                                field2436[var2++] = var548.field2635;
                                field2417[var3++] = var548.field6147;
                                class333 var549 = var548.method2745(true);
                                field2436[var2++] = var549.field4590;
                                field2417[var3++] = var549.field4596;
                                field2436[var2++] = var548.field2647;
                                field2436[var2++] = var548.field6145;
                            }
                            continue;
                        }
                        if (var621 == 6502) {
                            class437 var550 = class61.method471(-127);
                            if (var550 == null) {
                                field2436[var2++] = -1;
                                field2436[var2++] = 0;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var550.field6149;
                                field2436[var2++] = var550.field2635;
                                field2417[var3++] = var550.field6147;
                                class333 var551 = var550.method2745(true);
                                field2436[var2++] = var551.field4590;
                                field2417[var3++] = var551.field4596;
                                field2436[var2++] = var550.field2647;
                                field2436[var2++] = var550.field6145;
                            }
                            continue;
                        }
                        if (var621 == 6503) {
                            var2--;
                            int var552 = field2436[var2];
                            if (class446.field6250 == 10 && class64.field935 == 0 && class99.field1374 == 0 && class19.field367 == 0) {
                                field2436[var2++] = class381.method2426(var552, 10869) ? 1 : 0;
                                continue;
                            }
                            field2436[var2++] = 0;
                            continue;
                        }
                        if (var621 == 6504) {
                            var2--;
                            class405.field5762 = field2436[var2];
                            class271.method1775(class241.field3426, 35);
                            continue;
                        }
                        if (var621 == 6505) {
                            field2436[var2++] = class405.field5762;
                            continue;
                        }
                        if (var621 == 6506) {
                            var2--;
                            int var553 = field2436[var2];
                            class437 var554 = class302.method1949(var553, (byte) -105);
                            if (var554 == null) {
                                field2436[var2++] = -1;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2417[var3++] = "";
                                field2436[var2++] = 0;
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = var554.field2635;
                                field2417[var3++] = var554.field6147;
                                class333 var555 = var554.method2745(true);
                                field2436[var2++] = var555.field4590;
                                field2417[var3++] = var555.field4596;
                                field2436[var2++] = var554.field2647;
                                field2436[var2++] = var554.field6145;
                            }
                            continue;
                        }
                        if (var621 == 6507) {
                            var2 -= 4;
                            int var556 = field2436[var2];
                            boolean var557 = field2436[var2 + 1] == 1;
                            int var558 = field2436[var2 + 2];
                            boolean var559 = field2436[var2 + 3] == 1;
                            class260.method1707(var559, var556, -69, var558, var557);
                            continue;
                        }
                        if (var621 == 6508) {
                            class28.method306((byte) -33);
                            continue;
                        }
                        if (var621 == 6509) {
                            if (class446.field6250 == 10) {
                                var2--;
                                if (field2436[var2] == 1) {
                                    if (class200.field2763 == null) {
                                        class200.field2763 = new class206();
                                    }
                                } else if (class200.field2763 != null) {
                                    class200.field2763.method1335((byte) 90);
                                    class200.field2763 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var621 < 6700) {
                        if (var621 == 6600) {
                            var2--;
                            class133.field1916 = field2436[var2] == 1;
                            class271.method1775(class241.field3426, 97);
                            continue;
                        }
                        if (var621 == 6601) {
                            field2436[var2++] = class133.field1916 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6800 && class412.field5854 == 2) {
                        if (var621 == 6700) {
                            int var560 = class454.field6477.method887((byte) 72);
                            if (class59.field801 != -1) {
                                var560++;
                            }
                            field2436[var2++] = var560;
                            continue;
                        }
                        if (var621 == 6701) {
                            var2--;
                            int var561 = field2436[var2];
                            if (class59.field801 != -1) {
                                if (var561 == 0) {
                                    field2436[var2++] = class59.field801;
                                    continue;
                                }
                                var561--;
                            }
                            class26 var562 = (class26) class454.field6477.method885(-107);
                            while (var561-- > 0) {
                                var562 = (class26) class454.field6477.method881((byte) -68);
                            }
                            field2436[var2++] = var562.field463;
                            continue;
                        }
                        if (var621 == 6702) {
                            var2--;
                            int var563 = field2436[var2];
                            if (class143.field2057[var563] == null) {
                                field2417[var3++] = "";
                            } else {
                                String var564 = class143.field2057[var563][0].field6330;
                                if (var564 == null) {
                                    field2417[var3++] = "";
                                } else {
                                    field2417[var3++] = var564.substring(0, var564.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var621 == 6703) {
                            var2--;
                            int var565 = field2436[var2];
                            if (class143.field2057[var565] == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = class143.field2057[var565].length;
                            }
                            continue;
                        }
                        if (var621 == 6704) {
                            var2 -= 2;
                            int var566 = field2436[var2];
                            int var567 = field2436[var2 + 1];
                            if (class143.field2057[var566] == null) {
                                field2417[var3++] = "";
                            } else {
                                String var568 = class143.field2057[var566][var567].field6330;
                                if (var568 == null) {
                                    field2417[var3++] = "";
                                } else {
                                    field2417[var3++] = var568;
                                }
                            }
                            continue;
                        }
                        if (var621 == 6705) {
                            var2 -= 2;
                            int var569 = field2436[var2];
                            int var570 = field2436[var2 + 1];
                            if (class143.field2057[var569] == null) {
                                field2436[var2++] = 0;
                            } else {
                                field2436[var2++] = class143.field2057[var569][var570].field6386;
                            }
                            continue;
                        }
                        if (var621 == 6706) {
                            continue;
                        }
                        if (var621 == 6707) {
                            var2 -= 3;
                            int var571 = field2436[var2];
                            int var572 = field2436[var2 + 1];
                            int var573 = field2436[var2 + 2];
                            class41.method381(var571 << 16 | var572, 1, "", var573, (byte) -108);
                            continue;
                        }
                        if (var621 == 6708) {
                            var2 -= 3;
                            int var574 = field2436[var2];
                            int var575 = field2436[var2 + 1];
                            int var576 = field2436[var2 + 2];
                            class41.method381(var574 << 16 | var575, 2, "", var576, (byte) -123);
                            continue;
                        }
                        if (var621 == 6709) {
                            var2 -= 3;
                            int var577 = field2436[var2];
                            int var578 = field2436[var2 + 1];
                            int var579 = field2436[var2 + 2];
                            class41.method381(var577 << 16 | var578, 3, "", var579, (byte) -109);
                            continue;
                        }
                        if (var621 == 6710) {
                            var2 -= 3;
                            int var580 = field2436[var2];
                            int var581 = field2436[var2 + 1];
                            int var582 = field2436[var2 + 2];
                            class41.method381(var580 << 16 | var581, 4, "", var582, (byte) -127);
                            continue;
                        }
                        if (var621 == 6711) {
                            var2 -= 3;
                            int var583 = field2436[var2];
                            int var584 = field2436[var2 + 1];
                            int var585 = field2436[var2 + 2];
                            class41.method381(var583 << 16 | var584, 5, "", var585, (byte) -122);
                            continue;
                        }
                        if (var621 == 6712) {
                            var2 -= 3;
                            int var586 = field2436[var2];
                            int var587 = field2436[var2 + 1];
                            int var588 = field2436[var2 + 2];
                            class41.method381(var586 << 16 | var587, 6, "", var588, (byte) -113);
                            continue;
                        }
                        if (var621 == 6713) {
                            var2 -= 3;
                            int var589 = field2436[var2];
                            int var590 = field2436[var2 + 1];
                            int var591 = field2436[var2 + 2];
                            class41.method381(var589 << 16 | var590, 7, "", var591, (byte) -122);
                            continue;
                        }
                        if (var621 == 6714) {
                            var2 -= 3;
                            int var592 = field2436[var2];
                            int var593 = field2436[var2 + 1];
                            int var594 = field2436[var2 + 2];
                            class41.method381(var592 << 16 | var593, 8, "", var594, (byte) -120);
                            continue;
                        }
                        if (var621 == 6715) {
                            var2 -= 3;
                            int var595 = field2436[var2];
                            int var596 = field2436[var2 + 1];
                            int var597 = field2436[var2 + 2];
                            class41.method381(var595 << 16 | var596, 9, "", var597, (byte) -106);
                            continue;
                        }
                        if (var621 == 6716) {
                            var2 -= 3;
                            int var598 = field2436[var2];
                            int var599 = field2436[var2 + 1];
                            int var600 = field2436[var2 + 2];
                            class41.method381(var598 << 16 | var599, 10, "", var600, (byte) -119);
                            continue;
                        }
                        if (var621 == 6717) {
                            var2 -= 3;
                            int var601 = field2436[var2];
                            int var602 = field2436[var2 + 1];
                            int var603 = field2436[var2 + 2];
                            class453 var604 = class143.method983(-1, var601 << 16 | var602, var603);
                            class418.method2624(43);
                            class139 var605 = client.method1091(var604);
                            class249.method1674(var605.field1979, var601 << 16 | var602, var604.field6312, var604.field6359, var603, var605.method954(1), 3);
                            continue;
                        }
                    } else if (var621 < 6900) {
                        if (var621 == 6800) {
                            var2--;
                            int var606 = field2436[var2];
                            class25 var607 = class328.method2113(var606, (byte) -125);
                            if (var607.field446 == null) {
                                field2417[var3++] = "";
                            } else {
                                field2417[var3++] = var607.field446;
                            }
                            continue;
                        }
                        if (var621 == 6801) {
                            var2--;
                            int var608 = field2436[var2];
                            class25 var609 = class328.method2113(var608, (byte) -125);
                            field2436[var2++] = var609.field435;
                            continue;
                        }
                        if (var621 == 6802) {
                            var2--;
                            int var610 = field2436[var2];
                            class25 var611 = class328.method2113(var610, (byte) -125);
                            field2436[var2++] = var611.field431;
                            continue;
                        }
                        if (var621 == 6803) {
                            var2--;
                            int var612 = field2436[var2];
                            class25 var613 = class328.method2113(var612, (byte) -125);
                            field2436[var2++] = var613.field429;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var620) {
            if (arg0.field3562 == null) {
                StringBuffer var618 = new StringBuffer(30);
                var618.append("CS2: ").append(arg0.field5600).append(" ");
                for (int var619 = field2420 - 1; var619 >= 0; var619--) {
                    var618.append("v: ").append(field2430[var619].field3760.field5600).append(" ");
                }
                var618.append("op: ").append(var7);
                class271.method1776(-2296, var620, var618.toString());
            } else {
                class205.method1334("Clientscript error in: " + arg0.field3562, (byte) 77);
                StringBuffer var615 = new StringBuffer(30);
                var615.append("Clientscript error in: ").append(arg0.field3562).append("\n");
                for (int var616 = field2420 - 1; var616 >= 0; var616--) {
                    var615.append("via: ").append(field2430[var616].field3760.field3562).append("\n");
                }
                var615.append("Op: ").append(var7).append("\n");
                String var617 = var620.getMessage();
                if (var617 != null && var617.length() > 0) {
                    var615.append("Message: ").append(var617).append("\n");
                }
                class271.method1776(-2296, var620, var615.toString());
                class418.method2626(5998, var615.toString());
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lff;)V")
    public static final void method1168(class7 arg0) {
        method1169(arg0, 200000);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lff;I)V")
    private static final void method1169(class7 arg0, int arg1) {
        Object[] var2 = arg0.field97;
        int var3 = (Integer) var2[0];
        class253 var4 = class411.method2576(var3, 0);
        if (var4 == null) {
            return;
        }
        field2426 = new int[var4.field3569];
        int var5 = 0;
        field2419 = new String[var4.field3566];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field94;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field99;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field95 == null ? -1 : arg0.field95.field6314;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field110;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field95 == null ? -1 : arg0.field95.field6406;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field96 == null ? -1 : arg0.field96.field6314;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field96 == null ? -1 : arg0.field96.field6406;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field104;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field100;
                }
                field2426[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field103;
                }
                field2419[var6++] = var9;
            }
        }
        method1167(var4, arg1);
    }
}
