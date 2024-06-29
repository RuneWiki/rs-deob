import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class365 {

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    private static int[] field5339 = new int[1000];

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private static int field5337 = 0;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[Ldq;")
    private static class87[] field5347 = new class87[50];

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[Ljava/lang/String;")
    private static String[] field5336 = new String[1000];

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[I")
    private static int[] field5349 = new int[5];

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[[I")
    private static int[][] field5345 = new int[5][5000];

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5348 = Calendar.getInstance();

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
    private static int[] field5352 = new int[3];

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field5354 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lwe;")
    public static class24 field5353 = new class24(4);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lro;")
    private static class249 field5329;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lro;")
    private static class249 field5335;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Llm;")
    private static class348 field5341;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    private static int[] field5334;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field5330;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 7)
    public static final void method2390(int arg0, int arg1, int arg2) {
        class384 var3 = class185.method1138(arg1, arg2, arg0, 1679818576);
        if (var3 == null) {
            return;
        }
        field5334 = new int[var3.field5745];
        field5330 = new String[var3.field5746];
        if (var3.field5738 == 15 || var3.field5738 == 17 || var3.field5738 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class204.field2952 != null) {
                var4 = class204.field2952.field3609;
                var5 = class204.field2952.field3510;
            }
            field5334[0] = class34.field555 - var4;
            field5334[1] = class316.field4522 - var5;
        }
        method2393(var3, 200000);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 34)
    public static final void method2391(int arg0) {
        if (arg0 == -1 || !class126.method864((byte) -92, arg0)) {
            return;
        }
        class249[] var1 = class119.field1607[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class249 var3 = var1[var2];
            if (var3.field3593 != null) {
                class228 var4 = new class228();
                var4.field3210 = var3;
                var4.field3215 = var3.field3593;
                method2394(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 69)
    public static void method2392() {
        field5334 = null;
        field5330 = null;
        field5349 = null;
        field5345 = null;
        field5339 = null;
        field5336 = null;
        field5347 = null;
        field5335 = null;
        field5329 = null;
        field5341 = null;
        field5348 = null;
        field5354 = null;
        field5352 = null;
        field5353 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Loo;I)V", line = 86)
    private static final void method2393(class384 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field5753;
        int[] var6 = arg0.field5740;
        byte var7 = -1;
        field5337 = 0;
        try {
            int var8 = 0;
            label4416: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var609 = var5[var4];
                if (var609 < 100) {
                    if (var609 == 0) {
                        field5339[var2++] = var6[var4];
                        continue;
                    }
                    if (var609 == 1) {
                        int var9 = var6[var4];
                        field5339[var2++] = class192.field2668[var9];
                        continue;
                    }
                    if (var609 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class236.method1445(var10, -4791, field5339[var2]);
                        continue;
                    }
                    if (var609 == 3) {
                        field5336[var3++] = arg0.field5742[var4];
                        continue;
                    }
                    if (var609 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var609 == 7) {
                        var2 -= 2;
                        if (field5339[var2 + 1] != field5339[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 8) {
                        var2 -= 2;
                        if (field5339[var2 + 1] == field5339[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 9) {
                        var2 -= 2;
                        if (field5339[var2] < field5339[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 10) {
                        var2 -= 2;
                        if (field5339[var2] > field5339[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 21) {
                        if (field5337 == 0) {
                            return;
                        }
                        class87 var11 = field5347[--field5337];
                        arg0 = var11.field1211;
                        var5 = arg0.field5753;
                        var6 = arg0.field5740;
                        var4 = var11.field1212;
                        field5334 = var11.field1210;
                        field5330 = var11.field1218;
                        continue;
                    }
                    if (var609 == 25) {
                        int var12 = var6[var4];
                        field5339[var2++] = class312.method1952(var12, -1);
                        continue;
                    }
                    if (var609 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class312.method1950(field5339[var2], var13, 4);
                        continue;
                    }
                    if (var609 == 31) {
                        var2 -= 2;
                        if (field5339[var2] <= field5339[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 32) {
                        var2 -= 2;
                        if (field5339[var2] >= field5339[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var609 == 33) {
                        field5339[var2++] = field5334[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var609 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field5334[var10001] = field5339[var2];
                        continue;
                    }
                    if (var609 == 35) {
                        field5336[var3++] = field5330[var6[var4]];
                        continue;
                    }
                    if (var609 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field5330[var10001] = field5336[var3];
                        continue;
                    }
                    if (var609 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class444.method2800(var3, field5336, var14, (byte) 124);
                        field5336[var3++] = var15;
                        continue;
                    }
                    if (var609 == 38) {
                        var2--;
                        continue;
                    }
                    if (var609 == 39) {
                        var3--;
                        continue;
                    }
                    if (var609 == 40) {
                        int var16 = var6[var4];
                        class384 var17 = class231.method1427(-25652, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field5745];
                        String[] var19 = new String[var17.field5746];
                        for (int var20 = 0; var20 < var17.field5750; var20++) {
                            var18[var20] = field5339[var2 + var20 - var17.field5750];
                        }
                        for (int var21 = 0; var21 < var17.field5743; var21++) {
                            var19[var21] = field5336[var3 + var21 - var17.field5743];
                        }
                        var2 -= var17.field5750;
                        var3 -= var17.field5743;
                        class87 var22 = new class87();
                        var22.field1211 = arg0;
                        var22.field1212 = var4;
                        var22.field1210 = field5334;
                        var22.field1218 = field5330;
                        if (field5337 >= field5347.length) {
                            throw new RuntimeException();
                        }
                        field5347[field5337++] = var22;
                        arg0 = var17;
                        var5 = var17.field5753;
                        var6 = var17.field5740;
                        var4 = -1;
                        field5334 = var18;
                        field5330 = var19;
                        continue;
                    }
                    if (var609 == 42) {
                        field5339[var2++] = class320.field4575[var6[var4]];
                        continue;
                    }
                    if (var609 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class320.field4575[var23] = field5339[var2];
                        class291.method1865(124, var23);
                        class329.field4727 |= class87.field1215[var23];
                        continue;
                    }
                    if (var609 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field5339[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field5349[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4416;
                                }
                                field5345[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field5339[var2];
                        if (var30 >= 0 && var30 < field5349[var29]) {
                            field5339[var2++] = field5345[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field5339[var2];
                        if (var32 >= 0 && var32 < field5349[var31]) {
                            field5345[var31][var32] = field5339[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var609 == 47) {
                        String var33 = class174.field2269[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field5336[var3++] = var33;
                        continue;
                    }
                    if (var609 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class174.field2269[var34] = field5336[var3];
                        class281.method1799(var34, 95);
                        continue;
                    }
                    if (var609 == 51) {
                        class143 var35 = arg0.field5737[var6[var4]];
                        var2--;
                        class231 var36 = (class231) var35.method954(61, (long) field5339[var2]);
                        if (var36 != null) {
                            var4 += var36.field3258;
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
                if (var609 < 300) {
                    if (var609 == 100) {
                        var2 -= 3;
                        int var38 = field5339[var2];
                        int var39 = field5339[var2 + 1];
                        int var40 = field5339[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class249 var41 = class107.method746(var38, -120);
                        if (var41.field3493 == null) {
                            var41.field3493 = new class249[var40 + 1];
                        }
                        if (var41.field3493.length <= var40) {
                            class249[] var42 = new class249[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3493.length; var43++) {
                                var42[var43] = var41.field3493[var43];
                            }
                            var41.field3493 = var42;
                        }
                        if (var40 > 0 && var41.field3493[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class249 var44 = new class249();
                        var44.field3637 = var39;
                        var44.field3623 = var44.field3622 = var41.field3622;
                        var44.field3517 = var40;
                        var44.field3522 = true;
                        var41.field3493[var40] = var44;
                        if (var37) {
                            field5329 = var44;
                        } else {
                            field5335 = var44;
                        }
                        class392.method2564(-109, var41);
                        continue;
                    }
                    if (var609 == 101) {
                        class249 var45 = var37 ? field5329 : field5335;
                        if (var45.field3517 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class249 var46 = class107.method746(var45.field3622, -19);
                        var46.field3493[var45.field3517] = null;
                        class392.method2564(-110, var46);
                        continue;
                    }
                    if (var609 == 102) {
                        var2--;
                        class249 var47 = class107.method746(field5339[var2], -8);
                        var47.field3493 = null;
                        class392.method2564(-97, var47);
                        continue;
                    }
                    if (var609 == 200) {
                        var2 -= 2;
                        int var48 = field5339[var2];
                        int var49 = field5339[var2 + 1];
                        class249 var50 = class358.method2355(var49, var48, (byte) -101);
                        if (var50 != null && var49 != -1) {
                            field5339[var2++] = 1;
                            if (var37) {
                                field5329 = var50;
                            } else {
                                field5335 = var50;
                            }
                            continue;
                        }
                        field5339[var2++] = 0;
                        continue;
                    }
                    if (var609 == 201) {
                        var2--;
                        int var51 = field5339[var2];
                        class249 var52 = class107.method746(var51, -125);
                        if (var52 == null) {
                            field5339[var2++] = 0;
                        } else {
                            field5339[var2++] = 1;
                            if (var37) {
                                field5329 = var52;
                            } else {
                                field5335 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var609 < 500) {
                    if (var609 == 403) {
                        var2 -= 2;
                        int var53 = field5339[var2];
                        int var54 = field5339[var2 + 1];
                        for (int var55 = 0; var55 < class33.field546.length; var55++) {
                            if (class33.field546[var55] == var53) {
                                class100.field1350.field2778.method694(108, var55, var54);
                                continue label4416;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class326.field4694.length) {
                                continue label4416;
                            }
                            if (class326.field4694[var56] == var53) {
                                class100.field1350.field2778.method694(-69, var56, var54);
                                continue label4416;
                            }
                            var56++;
                        }
                    }
                    if (var609 == 404) {
                        var2 -= 2;
                        int var57 = field5339[var2];
                        int var58 = field5339[var2 + 1];
                        class100.field1350.field2778.method695(var58, 16384, var57);
                        continue;
                    }
                    if (var609 == 410) {
                        var2--;
                        boolean var59 = field5339[var2] != 0;
                        class100.field1350.field2778.method692(703608168, var59);
                        continue;
                    }
                } else if (!(var609 < 1000 || var609 >= 1100) || !(var609 < 2000 || var609 >= 2100)) {
                    class249 var60;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var60 = class107.method746(field5339[var2], -103);
                    } else {
                        var60 = var37 ? field5329 : field5335;
                    }
                    if (var609 == 1000) {
                        var2 -= 4;
                        var60.field3612 = field5339[var2];
                        var60.field3599 = field5339[var2 + 1];
                        int var61 = field5339[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field5339[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3636 = (byte) var61;
                        var60.field3478 = (byte) var62;
                        class392.method2564(-76, var60);
                        class108.method762(var60, 0);
                        if (var60.field3517 == -1) {
                            class41.method313(11, var60.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1001) {
                        var2 -= 4;
                        var60.field3607 = field5339[var2];
                        var60.field3489 = field5339[var2 + 1];
                        var60.field3590 = 0;
                        var60.field3564 = 0;
                        int var63 = field5339[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field5339[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3523 = (byte) var63;
                        var60.field3508 = (byte) var64;
                        class392.method2564(-124, var60);
                        class108.method762(var60, 0);
                        if (var60.field3637 == 0) {
                            class272.method1743(105, var60, false);
                        }
                        continue;
                    }
                    if (var609 == 1003) {
                        var2--;
                        boolean var65 = field5339[var2] == 1;
                        if (var60.field3571 != var65) {
                            var60.field3571 = var65;
                            class392.method2564(-83, var60);
                        }
                        if (var60.field3517 == -1) {
                            class220.method1375((byte) 107, var60.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1004) {
                        var2 -= 2;
                        var60.field3605 = field5339[var2];
                        var60.field3561 = field5339[var2 + 1];
                        class392.method2564(-77, var60);
                        class108.method762(var60, 0);
                        if (var60.field3637 == 0) {
                            class272.method1743(87, var60, false);
                        }
                        continue;
                    }
                    if (var609 == 1005) {
                        var2--;
                        var60.field3596 = field5339[var2] == 1;
                        continue;
                    }
                } else if (var609 >= 1100 && var609 < 1200 || var609 >= 2100 && var609 < 2200) {
                    class249 var66;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var66 = class107.method746(field5339[var2], -9);
                    } else {
                        var66 = var37 ? field5329 : field5335;
                    }
                    if (var609 == 1100) {
                        var2 -= 2;
                        var66.field3594 = field5339[var2];
                        if (var66.field3594 > var66.field3611 - var66.field3578) {
                            var66.field3594 = var66.field3611 - var66.field3578;
                        }
                        if (var66.field3594 < 0) {
                            var66.field3594 = 0;
                        }
                        var66.field3582 = field5339[var2 + 1];
                        if (var66.field3582 > var66.field3646 - var66.field3604) {
                            var66.field3582 = var66.field3646 - var66.field3604;
                        }
                        if (var66.field3582 < 0) {
                            var66.field3582 = 0;
                        }
                        class392.method2564(-81, var66);
                        if (var66.field3517 == -1) {
                            class373.method2474(12, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1101) {
                        var2--;
                        var66.field3634 = field5339[var2];
                        class392.method2564(-108, var66);
                        if (var66.field3517 == -1) {
                            class138.method918((byte) -126, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1102) {
                        var2--;
                        var66.field3534 = field5339[var2] == 1;
                        class392.method2564(-77, var66);
                        continue;
                    }
                    if (var609 == 1103) {
                        var2--;
                        var66.field3536 = field5339[var2];
                        class392.method2564(-86, var66);
                        continue;
                    }
                    if (var609 == 1104) {
                        var2--;
                        var66.field3638 = field5339[var2];
                        class392.method2564(-104, var66);
                        continue;
                    }
                    if (var609 == 1105) {
                        var2--;
                        int var67 = field5339[var2];
                        if (var66.field3544 != var67) {
                            var66.field3544 = var67;
                            class392.method2564(-83, var66);
                        }
                        if (var66.field3517 == -1) {
                            class447.method2809(-1, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1106) {
                        var2--;
                        var66.field3548 = field5339[var2];
                        class392.method2564(-78, var66);
                        continue;
                    }
                    if (var609 == 1107) {
                        var2--;
                        var66.field3601 = field5339[var2] == 1;
                        class392.method2564(-114, var66);
                        continue;
                    }
                    if (var609 == 1108) {
                        var66.field3583 = 1;
                        var2--;
                        var66.field3526 = field5339[var2];
                        class392.method2564(-83, var66);
                        if (var66.field3517 == -1) {
                            class249.method1549((byte) -97, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1109) {
                        var2 -= 6;
                        var66.field3579 = field5339[var2];
                        var66.field3557 = field5339[var2 + 1];
                        var66.field3628 = field5339[var2 + 2];
                        var66.field3649 = field5339[var2 + 3];
                        var66.field3475 = field5339[var2 + 4];
                        var66.field3570 = field5339[var2 + 5];
                        class392.method2564(-102, var66);
                        if (var66.field3517 == -1) {
                            class431.method2741((byte) 121, var66.field3622);
                            class215.method1353(10, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1110) {
                        var2--;
                        int var68 = field5339[var2];
                        if (var66.field3610 != var68) {
                            var66.field3610 = var68;
                            var66.field3651 = 0;
                            var66.field3648 = 1;
                            var66.field3505 = 0;
                            class392.method2564(-83, var66);
                        }
                        if (var66.field3517 == -1) {
                            class126.method860(false, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1111) {
                        var2--;
                        var66.field3643 = field5339[var2] == 1;
                        class392.method2564(-87, var66);
                        continue;
                    }
                    if (var609 == 1112) {
                        var3--;
                        String var69 = field5336[var3];
                        if (!var69.equals(var66.field3524)) {
                            var66.field3524 = var69;
                            class392.method2564(-96, var66);
                        }
                        if (var66.field3517 == -1) {
                            class49.method338(-82, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1113) {
                        var2--;
                        var66.field3542 = field5339[var2];
                        class392.method2564(-124, var66);
                        continue;
                    }
                    if (var609 == 1114) {
                        var2 -= 3;
                        var66.field3479 = field5339[var2];
                        var66.field3464 = field5339[var2 + 1];
                        var66.field3531 = field5339[var2 + 2];
                        class392.method2564(-88, var66);
                        continue;
                    }
                    if (var609 == 1115) {
                        var2--;
                        var66.field3533 = field5339[var2] == 1;
                        class392.method2564(-95, var66);
                        continue;
                    }
                    if (var609 == 1116) {
                        var2--;
                        var66.field3600 = field5339[var2];
                        class392.method2564(-89, var66);
                        continue;
                    }
                    if (var609 == 1117) {
                        var2--;
                        var66.field3492 = field5339[var2];
                        class392.method2564(-90, var66);
                        continue;
                    }
                    if (var609 == 1118) {
                        var2--;
                        var66.field3586 = field5339[var2] == 1;
                        class392.method2564(-81, var66);
                        continue;
                    }
                    if (var609 == 1119) {
                        var2--;
                        var66.field3509 = field5339[var2] == 1;
                        class392.method2564(-78, var66);
                        continue;
                    }
                    if (var609 == 1120) {
                        var2 -= 2;
                        var66.field3611 = field5339[var2];
                        var66.field3646 = field5339[var2 + 1];
                        class392.method2564(-77, var66);
                        if (var66.field3637 == 0) {
                            class272.method1743(127, var66, false);
                        }
                        continue;
                    }
                    if (var609 == 1121) {
                        var2 -= 2;
                        var66.field3550 = (short) field5339[var2];
                        var66.field3587 = (short) field5339[var2 + 1];
                        class392.method2564(-102, var66);
                        continue;
                    }
                    if (var609 == 1122) {
                        var2--;
                        var66.field3589 = field5339[var2] == 1;
                        class392.method2564(-95, var66);
                        continue;
                    }
                    if (var609 == 1123) {
                        var2--;
                        var66.field3570 = field5339[var2];
                        class392.method2564(-81, var66);
                        if (var66.field3517 == -1) {
                            class431.method2741((byte) 89, var66.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1124) {
                        var2--;
                        int var70 = field5339[var2];
                        var66.field3473 = var70 == 1;
                        class392.method2564(-126, var66);
                        continue;
                    }
                    if (var609 == 1125) {
                        var2 -= 2;
                        var66.field3647 = field5339[var2];
                        var66.field3626 = field5339[var2 + 1];
                        class392.method2564(-78, var66);
                        continue;
                    }
                } else if (!(var609 < 1200 || var609 >= 1300) || !(var609 < 2200 || var609 >= 2300)) {
                    class249 var71;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var71 = class107.method746(field5339[var2], -15);
                    } else {
                        var71 = var37 ? field5329 : field5335;
                    }
                    class392.method2564(-108, var71);
                    if (var609 == 1200 || var609 == 1205 || var609 == 1208 || var609 == 1209 || var609 == 1212 || var609 == 1213) {
                        var2 -= 2;
                        int var72 = field5339[var2];
                        int var73 = field5339[var2 + 1];
                        if (var71.field3517 == -1) {
                            class26.method236(-100, var71.field3622);
                            class431.method2741((byte) -33, var71.field3622);
                            class215.method1353(10, var71.field3622);
                        }
                        if (var72 == -1) {
                            var71.field3583 = 1;
                            var71.field3526 = -1;
                            var71.field3588 = -1;
                            continue;
                        }
                        var71.field3588 = var72;
                        var71.field3472 = var73;
                        if (var609 == 1208 || var609 == 1209) {
                            var71.field3560 = true;
                        } else {
                            var71.field3560 = false;
                        }
                        class193 var74 = class166.method1031(var72, false);
                        var71.field3628 = var74.field2705;
                        var71.field3649 = var74.field2691;
                        var71.field3475 = var74.field2744;
                        var71.field3579 = var74.field2755;
                        var71.field3557 = var74.field2751;
                        var71.field3570 = var74.field2725;
                        if (var609 == 1205 || var609 == 1209) {
                            var71.field3641 = 0;
                        } else if (var609 == 1212 || var609 == 1213) {
                            var71.field3641 = 1;
                        } else {
                            var71.field3641 = 2;
                        }
                        if (var71.field3590 > 0) {
                            var71.field3570 = var71.field3570 * 32 / var71.field3590;
                        } else if (var71.field3607 > 0) {
                            var71.field3570 = var71.field3570 * 32 / var71.field3607;
                        }
                        continue;
                    }
                    if (var609 == 1201) {
                        var71.field3583 = 2;
                        var2--;
                        var71.field3526 = field5339[var2];
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1202) {
                        var71.field3583 = 3;
                        var71.field3526 = -1;
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1203) {
                        var71.field3583 = 6;
                        var2--;
                        var71.field3526 = field5339[var2];
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1204) {
                        var71.field3583 = 5;
                        var2--;
                        var71.field3526 = field5339[var2];
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1206) {
                        var2 -= 4;
                        var71.field3620 = field5339[var2];
                        var71.field3625 = field5339[var2 + 1];
                        var71.field3549 = field5339[var2 + 2];
                        var71.field3481 = field5339[var2 + 3];
                        class392.method2564(-102, var71);
                        continue;
                    }
                    if (var609 == 1207) {
                        var2 -= 2;
                        var71.field3576 = field5339[var2];
                        var71.field3467 = field5339[var2 + 1];
                        class392.method2564(-98, var71);
                        continue;
                    }
                    if (var609 == 1210) {
                        var2 -= 4;
                        var71.field3526 = field5339[var2];
                        var71.field3624 = field5339[var2 + 1];
                        if (field5339[var2 + 2] == 1) {
                            var71.field3583 = 9;
                        } else {
                            var71.field3583 = 8;
                        }
                        if (field5339[var2 + 3] == 1) {
                            var71.field3560 = true;
                        } else {
                            var71.field3560 = false;
                        }
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                    if (var609 == 1211) {
                        var71.field3583 = 5;
                        var71.field3526 = 2047;
                        var71.field3624 = 0;
                        if (var71.field3517 == -1) {
                            class249.method1549((byte) -97, var71.field3622);
                        }
                        continue;
                    }
                } else if (var609 >= 1300 && var609 < 1400 || var609 >= 2300 && var609 < 2400) {
                    class249 var75;
                    if (var609 >= 2000) {
                        var609 -= 1000;
                        var2--;
                        var75 = class107.method746(field5339[var2], -98);
                    } else {
                        var75 = var37 ? field5329 : field5335;
                    }
                    if (var609 == 1300) {
                        var2--;
                        int var76 = field5339[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1545(-37, field5336[var3], var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var609 == 1301) {
                        var2 -= 2;
                        int var77 = field5339[var2];
                        int var78 = field5339[var2 + 1];
                        var75.field3512 = class358.method2355(var78, var77, (byte) -125);
                        continue;
                    }
                    if (var609 == 1302) {
                        var2--;
                        var75.field3603 = field5339[var2] == 1;
                        continue;
                    }
                    if (var609 == 1303) {
                        var2--;
                        var75.field3502 = field5339[var2];
                        continue;
                    }
                    if (var609 == 1304) {
                        var2--;
                        var75.field3486 = field5339[var2];
                        continue;
                    }
                    if (var609 == 1305) {
                        var3--;
                        var75.field3558 = field5336[var3];
                        continue;
                    }
                    if (var609 == 1306) {
                        var3--;
                        var75.field3630 = field5336[var3];
                        continue;
                    }
                    if (var609 == 1307) {
                        var75.field3552 = null;
                        continue;
                    }
                    if (var609 == 1308) {
                        var2--;
                        var75.field3541 = field5339[var2];
                        var2--;
                        var75.field3470 = field5339[var2];
                        continue;
                    }
                    if (var609 == 1309) {
                        var2--;
                        int var79 = field5339[var2];
                        var2--;
                        int var80 = field5339[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1539(var79, var80 - 1, -30016);
                        }
                        continue;
                    }
                    if (var609 == 1310) {
                        var3--;
                        var75.field3497 = field5336[var3];
                        continue;
                    }
                } else {
                    if (var609 >= 1400 && var609 < 1500 || var609 >= 2400 && var609 < 2500) {
                        class249 var81;
                        if (var609 >= 2000) {
                            var609 -= 1000;
                            var2--;
                            var81 = class107.method746(field5339[var2], -85);
                        } else {
                            var81 = var37 ? field5329 : field5335;
                        }
                        var3--;
                        String var82 = field5336[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field5339[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field5339[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field5336[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field5339[var2]);
                            }
                        }
                        var2--;
                        int var87 = field5339[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var609 == 1400) {
                            var81.field3480 = var85;
                        } else if (var609 == 1401) {
                            var81.field3562 = var85;
                        } else if (var609 == 1402) {
                            var81.field3495 = var85;
                        } else if (var609 == 1403) {
                            var81.field3629 = var85;
                        } else if (var609 == 1404) {
                            var81.field3569 = var85;
                        } else if (var609 == 1405) {
                            var81.field3498 = var85;
                        } else if (var609 == 1406) {
                            var81.field3538 = var85;
                        } else if (var609 == 1407) {
                            var81.field3606 = var85;
                            var81.field3619 = var83;
                        } else if (var609 == 1408) {
                            var81.field3483 = var85;
                        } else if (var609 == 1409) {
                            var81.field3632 = var85;
                        } else if (var609 == 1410) {
                            var81.field3572 = var85;
                        } else if (var609 == 1411) {
                            var81.field3485 = var85;
                        } else if (var609 == 1412) {
                            var81.field3613 = var85;
                        } else if (var609 == 1414) {
                            var81.field3621 = var85;
                            var81.field3639 = var83;
                        } else if (var609 == 1415) {
                            var81.field3577 = var85;
                            var81.field3527 = var83;
                        } else if (var609 == 1416) {
                            var81.field3575 = var85;
                        } else if (var609 == 1417) {
                            var81.field3518 = var85;
                        } else if (var609 == 1418) {
                            var81.field3511 = var85;
                        } else if (var609 == 1419) {
                            var81.field3614 = var85;
                        } else if (var609 == 1420) {
                            var81.field3631 = var85;
                        } else if (var609 == 1421) {
                            var81.field3650 = var85;
                        } else if (var609 == 1422) {
                            var81.field3503 = var85;
                        } else if (var609 == 1423) {
                            var81.field3642 = var85;
                        } else if (var609 == 1424) {
                            var81.field3519 = var85;
                        } else if (var609 == 1425) {
                            var81.field3566 = var85;
                        } else if (var609 == 1426) {
                            var81.field3515 = var85;
                        } else if (var609 == 1427) {
                            var81.field3529 = var85;
                        } else if (var609 == 1428) {
                            var81.field3469 = var85;
                            var81.field3555 = var83;
                        } else if (var609 == 1429) {
                            var81.field3463 = var85;
                            var81.field3466 = var83;
                        }
                        var81.field3520 = true;
                        continue;
                    }
                    if (var609 < 1600) {
                        class249 var88 = var37 ? field5329 : field5335;
                        if (var609 == 1500) {
                            field5339[var2++] = var88.field3609;
                            continue;
                        }
                        if (var609 == 1501) {
                            field5339[var2++] = var88.field3510;
                            continue;
                        }
                        if (var609 == 1502) {
                            field5339[var2++] = var88.field3578;
                            continue;
                        }
                        if (var609 == 1503) {
                            field5339[var2++] = var88.field3604;
                            continue;
                        }
                        if (var609 == 1504) {
                            field5339[var2++] = var88.field3571 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 1505) {
                            field5339[var2++] = var88.field3623;
                            continue;
                        }
                    } else if (var609 < 1700) {
                        class249 var89 = var37 ? field5329 : field5335;
                        if (var609 == 1600) {
                            field5339[var2++] = var89.field3594;
                            continue;
                        }
                        if (var609 == 1601) {
                            field5339[var2++] = var89.field3582;
                            continue;
                        }
                        if (var609 == 1602) {
                            field5336[var3++] = var89.field3524;
                            continue;
                        }
                        if (var609 == 1603) {
                            field5339[var2++] = var89.field3611;
                            continue;
                        }
                        if (var609 == 1604) {
                            field5339[var2++] = var89.field3646;
                            continue;
                        }
                        if (var609 == 1605) {
                            field5339[var2++] = var89.field3570;
                            continue;
                        }
                        if (var609 == 1606) {
                            field5339[var2++] = var89.field3628;
                            continue;
                        }
                        if (var609 == 1607) {
                            field5339[var2++] = var89.field3475;
                            continue;
                        }
                        if (var609 == 1608) {
                            field5339[var2++] = var89.field3649;
                            continue;
                        }
                        if (var609 == 1609) {
                            field5339[var2++] = var89.field3536;
                            continue;
                        }
                        if (var609 == 1610) {
                            field5339[var2++] = var89.field3579;
                            continue;
                        }
                        if (var609 == 1611) {
                            field5339[var2++] = var89.field3557;
                            continue;
                        }
                        if (var609 == 1612) {
                            field5339[var2++] = var89.field3544;
                            continue;
                        }
                    } else if (var609 < 1800) {
                        class249 var90 = var37 ? field5329 : field5335;
                        if (var609 == 1700) {
                            field5339[var2++] = var90.field3588;
                            continue;
                        }
                        if (var609 == 1701) {
                            if (var90.field3588 == -1) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var90.field3472;
                            }
                            continue;
                        }
                        if (var609 == 1702) {
                            field5339[var2++] = var90.field3517;
                            continue;
                        }
                    } else if (var609 < 1900) {
                        class249 var91 = var37 ? field5329 : field5335;
                        if (var609 == 1800) {
                            field5339[var2++] = client.method1572(var91).method1149((byte) -79);
                            continue;
                        }
                        if (var609 == 1801) {
                            var2--;
                            int var92 = field5339[var2];
                            int var610 = var92 - 1;
                            if (var91.field3552 != null && var610 < var91.field3552.length && var91.field3552[var610] != null) {
                                field5336[var3++] = var91.field3552[var610];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 1802) {
                            if (var91.field3558 == null) {
                                field5336[var3++] = "";
                            } else {
                                field5336[var3++] = var91.field3558;
                            }
                            continue;
                        }
                    } else if (var609 < 2600) {
                        var2--;
                        class249 var93 = class107.method746(field5339[var2], -55);
                        if (var609 == 2500) {
                            field5339[var2++] = var93.field3609;
                            continue;
                        }
                        if (var609 == 2501) {
                            field5339[var2++] = var93.field3510;
                            continue;
                        }
                        if (var609 == 2502) {
                            field5339[var2++] = var93.field3578;
                            continue;
                        }
                        if (var609 == 2503) {
                            field5339[var2++] = var93.field3604;
                            continue;
                        }
                        if (var609 == 2504) {
                            field5339[var2++] = var93.field3571 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 2505) {
                            field5339[var2++] = var93.field3623;
                            continue;
                        }
                    } else if (var609 < 2700) {
                        var2--;
                        class249 var94 = class107.method746(field5339[var2], -69);
                        if (var609 == 2600) {
                            field5339[var2++] = var94.field3594;
                            continue;
                        }
                        if (var609 == 2601) {
                            field5339[var2++] = var94.field3582;
                            continue;
                        }
                        if (var609 == 2602) {
                            field5336[var3++] = var94.field3524;
                            continue;
                        }
                        if (var609 == 2603) {
                            field5339[var2++] = var94.field3611;
                            continue;
                        }
                        if (var609 == 2604) {
                            field5339[var2++] = var94.field3646;
                            continue;
                        }
                        if (var609 == 2605) {
                            field5339[var2++] = var94.field3570;
                            continue;
                        }
                        if (var609 == 2606) {
                            field5339[var2++] = var94.field3628;
                            continue;
                        }
                        if (var609 == 2607) {
                            field5339[var2++] = var94.field3475;
                            continue;
                        }
                        if (var609 == 2608) {
                            field5339[var2++] = var94.field3649;
                            continue;
                        }
                        if (var609 == 2609) {
                            field5339[var2++] = var94.field3536;
                            continue;
                        }
                        if (var609 == 2610) {
                            field5339[var2++] = var94.field3579;
                            continue;
                        }
                        if (var609 == 2611) {
                            field5339[var2++] = var94.field3557;
                            continue;
                        }
                        if (var609 == 2612) {
                            field5339[var2++] = var94.field3544;
                            continue;
                        }
                    } else if (var609 < 2800) {
                        if (var609 == 2700) {
                            var2--;
                            class249 var95 = class107.method746(field5339[var2], -58);
                            field5339[var2++] = var95.field3588;
                            continue;
                        }
                        if (var609 == 2701) {
                            var2--;
                            class249 var96 = class107.method746(field5339[var2], -74);
                            if (var96.field3588 == -1) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var96.field3472;
                            }
                            continue;
                        }
                        if (var609 == 2702) {
                            var2--;
                            int var97 = field5339[var2];
                            class158 var98 = (class158) class269.field3933.method954(109, (long) var97);
                            if (var98 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = 1;
                            }
                            continue;
                        }
                        if (var609 == 2703) {
                            var2--;
                            class249 var99 = class107.method746(field5339[var2], -98);
                            if (var99.field3493 == null) {
                                field5339[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field3493.length;
                            for (int var101 = 0; var101 < var99.field3493.length; var101++) {
                                if (var99.field3493[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field5339[var2++] = var100;
                            continue;
                        }
                        if (var609 == 2704 || var609 == 2705) {
                            var2 -= 2;
                            int var102 = field5339[var2];
                            int var103 = field5339[var2 + 1];
                            class158 var104 = (class158) class269.field3933.method954(-73, (long) var102);
                            if (var104 != null && var104.field2075 == var103) {
                                field5339[var2++] = 1;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var609 < 2900) {
                        var2--;
                        class249 var105 = class107.method746(field5339[var2], -75);
                        if (var609 == 2800) {
                            field5339[var2++] = client.method1572(var105).method1149((byte) 94);
                            continue;
                        }
                        if (var609 == 2801) {
                            var2--;
                            int var106 = field5339[var2];
                            int var611 = var106 - 1;
                            if (var105.field3552 != null && var611 < var105.field3552.length && var105.field3552[var611] != null) {
                                field5336[var3++] = var105.field3552[var611];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 2802) {
                            if (var105.field3558 == null) {
                                field5336[var3++] = "";
                            } else {
                                field5336[var3++] = var105.field3558;
                            }
                            continue;
                        }
                    } else if (var609 < 3200) {
                        if (var609 == 3100) {
                            var3--;
                            String var107 = field5336[var3];
                            class135.method908(var107, (byte) 53);
                            continue;
                        }
                        if (var609 == 3101) {
                            var2 -= 2;
                            class263.method1647(field5339[var2], (byte) 101, field5339[var2 + 1], class100.field1350);
                            continue;
                        }
                        if (var609 == 3103) {
                            class220.method1365(0, true);
                            continue;
                        }
                        if (var609 == 3104) {
                            var3--;
                            String var108 = field5336[var3];
                            int var109 = 0;
                            if (class79.method500(var108, (byte) -38)) {
                                var109 = class15.method105(var108, (byte) 20);
                            }
                            field5338++;
                            class232.field3279.method756(0, 206);
                            class232.field3279.method1704(var109, (byte) 125);
                            continue;
                        }
                        if (var609 == 3105) {
                            var3--;
                            String var110 = field5336[var3];
                            field5331++;
                            class232.field3279.method756(0, 172);
                            class232.field3279.method1707(-117, var110.length() + 1);
                            class232.field3279.method1662(var110, (byte) -117);
                            continue;
                        }
                        if (var609 == 3106) {
                            var3--;
                            String var111 = field5336[var3];
                            field5346++;
                            class232.field3279.method756(0, 197);
                            class232.field3279.method1707(21, var111.length() + 1);
                            class232.field3279.method1662(var111, (byte) -107);
                            continue;
                        }
                        if (var609 == 3107) {
                            var2--;
                            int var112 = field5339[var2];
                            var3--;
                            String var113 = field5336[var3];
                            class314.method1960(var112, var113, (byte) -116);
                            continue;
                        }
                        if (var609 == 3108) {
                            var2 -= 3;
                            int var114 = field5339[var2];
                            int var115 = field5339[var2 + 1];
                            int var116 = field5339[var2 + 2];
                            class249 var117 = class107.method746(var116, -126);
                            class433.method2752(var117, var114, var115, -117);
                            continue;
                        }
                        if (var609 == 3109) {
                            var2 -= 2;
                            int var118 = field5339[var2];
                            int var119 = field5339[var2 + 1];
                            class249 var120 = var37 ? field5329 : field5335;
                            class433.method2752(var120, var118, var119, -94);
                            continue;
                        }
                        if (var609 == 3110) {
                            var2--;
                            int var121 = field5339[var2];
                            field5351++;
                            class232.field3279.method756(0, 139);
                            class232.field3279.method1693(var121, (byte) 115);
                            continue;
                        }
                        if (var609 == 3111) {
                            var2 -= 2;
                            int var122 = field5339[var2];
                            int var123 = field5339[var2 + 1];
                            class158 var124 = (class158) class269.field3933.method954(-126, (long) var122);
                            if (var124 != null) {
                                class318.method1975(var124.field2075 != var123, 25697, var124, true);
                            }
                            class292.method1875(var123, 3, true, false, var122);
                            continue;
                        }
                        if (var609 == 3112) {
                            var2--;
                            int var125 = field5339[var2];
                            class158 var126 = (class158) class269.field3933.method954(85, (long) var125);
                            if (var126 != null && var126.field2074 == 3) {
                                class318.method1975(true, 25697, var126, true);
                            }
                            continue;
                        }
                    } else if (var609 < 3300) {
                        if (var609 == 3200) {
                            var2 -= 3;
                            class192.method1194(0, 255, field5339[var2 + 2], field5339[var2], field5339[var2 + 1]);
                            continue;
                        }
                        if (var609 == 3201) {
                            var2--;
                            class41.method315(true, field5339[var2], 255);
                            continue;
                        }
                        if (var609 == 3202) {
                            var2 -= 2;
                            class258.method1625(field5339[var2], 255, 1, field5339[var2 + 1]);
                            continue;
                        }
                    } else if (var609 < 3400) {
                        if (var609 == 3300) {
                            field5339[var2++] = class50.field698;
                            continue;
                        }
                        if (var609 == 3301) {
                            var2 -= 2;
                            int var127 = field5339[var2];
                            int var128 = field5339[var2 + 1];
                            field5339[var2++] = class297.method1888(var128, 1923345732, var127);
                            continue;
                        }
                        if (var609 == 3302) {
                            var2 -= 2;
                            int var129 = field5339[var2];
                            int var130 = field5339[var2 + 1];
                            field5339[var2++] = class75.method465(0, var129, var130);
                            continue;
                        }
                        if (var609 == 3303) {
                            var2 -= 2;
                            int var131 = field5339[var2];
                            int var132 = field5339[var2 + 1];
                            field5339[var2++] = class79.method497(true, var132, var131);
                            continue;
                        }
                        if (var609 == 3304) {
                            var2--;
                            int var133 = field5339[var2];
                            field5339[var2++] = class261.method1641(5, var133).field3454;
                            continue;
                        }
                        if (var609 == 3305) {
                            var2--;
                            int var134 = field5339[var2];
                            field5339[var2++] = class237.field3328[var134];
                            continue;
                        }
                        if (var609 == 3306) {
                            var2--;
                            int var135 = field5339[var2];
                            field5339[var2++] = class343.field5035[var135];
                            continue;
                        }
                        if (var609 == 3307) {
                            var2--;
                            int var136 = field5339[var2];
                            field5339[var2++] = class215.field3084[var136];
                            continue;
                        }
                        if (var609 == 3308) {
                            int var137 = class193.field2688;
                            int var138 = (class100.field1350.field5284 >> 7) + class184.field2482;
                            int var139 = (class100.field1350.field5298 >> 7) + class38.field620;
                            field5339[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var609 == 3309) {
                            var2--;
                            int var140 = field5339[var2];
                            field5339[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var609 == 3310) {
                            var2--;
                            int var141 = field5339[var2];
                            field5339[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var609 == 3311) {
                            var2--;
                            int var142 = field5339[var2];
                            field5339[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var609 == 3312) {
                            field5339[var2++] = class17.field208 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3313) {
                            var2 -= 2;
                            int var143 = field5339[var2] + 32768;
                            int var144 = field5339[var2 + 1];
                            field5339[var2++] = class297.method1888(var144, 1923345732, var143);
                            continue;
                        }
                        if (var609 == 3314) {
                            var2 -= 2;
                            int var145 = field5339[var2] + 32768;
                            int var146 = field5339[var2 + 1];
                            field5339[var2++] = class75.method465(0, var145, var146);
                            continue;
                        }
                        if (var609 == 3315) {
                            var2 -= 2;
                            int var147 = field5339[var2] + 32768;
                            int var148 = field5339[var2 + 1];
                            field5339[var2++] = class79.method497(true, var148, var147);
                            continue;
                        }
                        if (var609 == 3316) {
                            if (class227.field3206 >= 2) {
                                field5339[var2++] = class227.field3206;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 3317) {
                            field5339[var2++] = class127.field1688;
                            continue;
                        }
                        if (var609 == 3318) {
                            field5339[var2++] = class163.field2123;
                            continue;
                        }
                        if (var609 == 3321) {
                            field5339[var2++] = class35.field579;
                            continue;
                        }
                        if (var609 == 3322) {
                            field5339[var2++] = class280.field4126;
                            continue;
                        }
                        if (var609 == 3323) {
                            if (class125.field1668 >= 5 && class125.field1668 <= 9) {
                                field5339[var2++] = 1;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3324) {
                            if (class125.field1668 >= 5 && class125.field1668 <= 9) {
                                field5339[var2++] = class125.field1668;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3325) {
                            field5339[var2++] = class122.field1640 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3326) {
                            field5339[var2++] = class100.field1350.field2780;
                            continue;
                        }
                        if (var609 == 3327) {
                            field5339[var2++] = class100.field1350.field2778.field1379 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3328) {
                            field5339[var2++] = class261.field3808 && !class240.field3381 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3329) {
                            field5339[var2++] = class35.field570 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3330) {
                            var2--;
                            int var149 = field5339[var2];
                            field5339[var2++] = class59.method398(5, var149);
                            continue;
                        }
                        if (var609 == 3331) {
                            var2 -= 2;
                            int var150 = field5339[var2];
                            int var151 = field5339[var2 + 1];
                            field5339[var2++] = class199.method1248(var151, var150, 0, false);
                            continue;
                        }
                        if (var609 == 3332) {
                            var2 -= 2;
                            int var152 = field5339[var2];
                            int var153 = field5339[var2 + 1];
                            field5339[var2++] = class199.method1248(var153, var152, 0, true);
                            continue;
                        }
                        if (var609 == 3333) {
                            field5339[var2++] = class401.field5967;
                            continue;
                        }
                        if (var609 == 3335) {
                            field5339[var2++] = class58.field833;
                            continue;
                        }
                        if (var609 == 3336) {
                            var2 -= 4;
                            int var154 = field5339[var2];
                            int var155 = field5339[var2 + 1];
                            int var156 = field5339[var2 + 2];
                            int var157 = field5339[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field5339[var2++] = var160;
                            continue;
                        }
                        if (var609 == 3337) {
                            field5339[var2++] = class196.field2804;
                            continue;
                        }
                        if (var609 == 3338) {
                            field5339[var2++] = class318.method1978(-65536);
                            continue;
                        }
                    } else if (var609 < 3500) {
                        if (var609 == 3400) {
                            var2 -= 2;
                            int var161 = field5339[var2];
                            int var162 = field5339[var2 + 1];
                            class421 var163 = class15.method108(256, var161);
                            field5336[var3++] = var163.method2711((byte) -49, var162);
                            continue;
                        }
                        if (var609 == 3408) {
                            var2 -= 4;
                            int var164 = field5339[var2];
                            int var165 = field5339[var2 + 1];
                            int var166 = field5339[var2 + 2];
                            int var167 = field5339[var2 + 3];
                            class421 var168 = class15.method108(256, var166);
                            if (var168.field6271 == var164 && var168.field6279 == var165) {
                                if (var165 == 115) {
                                    field5336[var3++] = var168.method2711((byte) -49, var167);
                                } else {
                                    field5339[var2++] = var168.method2715(var167, 126);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var609 == 3409) {
                            var2 -= 3;
                            int var169 = field5339[var2];
                            int var170 = field5339[var2 + 1];
                            int var171 = field5339[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class421 var172 = class15.method108(256, var170);
                            if (var172.field6279 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field5339[var2++] = var172.method2709(var171, (byte) 29) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3410) {
                            var2--;
                            int var173 = field5339[var2];
                            var3--;
                            String var174 = field5336[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class421 var175 = class15.method108(256, var173);
                            if (var175.field6279 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field5339[var2++] = var175.method2705((byte) -104, var174) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3411) {
                            var2--;
                            int var176 = field5339[var2];
                            class421 var177 = class15.method108(256, var176);
                            field5339[var2++] = var177.field6282.method955(17167);
                            continue;
                        }
                    } else if (var609 < 3700) {
                        if (var609 == 3600) {
                            if (class255.field3722 == 0) {
                                field5339[var2++] = -2;
                            } else if (class255.field3722 == 1) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = class26.field463;
                            }
                            continue;
                        }
                        if (var609 == 3601) {
                            var2--;
                            int var178 = field5339[var2];
                            if (class255.field3722 == 2 && var178 < class26.field463) {
                                field5336[var3++] = class164.field2128[var178];
                                if (class124.field1654[var178] == null) {
                                    field5336[var3++] = "";
                                } else {
                                    field5336[var3++] = class124.field1654[var178];
                                }
                                continue;
                            }
                            field5336[var3++] = "";
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3602) {
                            var2--;
                            int var179 = field5339[var2];
                            if (class255.field3722 == 2 && var179 < class26.field463) {
                                field5339[var2++] = class205.field2964[var179];
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3603) {
                            var2--;
                            int var180 = field5339[var2];
                            if (class255.field3722 == 2 && var180 < class26.field463) {
                                field5339[var2++] = class355.field5210[var180];
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3604) {
                            var3--;
                            String var181 = field5336[var3];
                            var2--;
                            int var182 = field5339[var2];
                            class231.method1426(var182, 1, var181);
                            continue;
                        }
                        if (var609 == 3605) {
                            var3--;
                            String var183 = field5336[var3];
                            class268.method1730(17923, var183);
                            continue;
                        }
                        if (var609 == 3606) {
                            var3--;
                            String var184 = field5336[var3];
                            class280.method1795(var184, (byte) -105);
                            continue;
                        }
                        if (var609 == 3607) {
                            var3--;
                            String var185 = field5336[var3];
                            class371.method2441(var185, false, (byte) -122);
                            continue;
                        }
                        if (var609 == 3608) {
                            var3--;
                            String var186 = field5336[var3];
                            class166.method1033(var186, (byte) -120);
                            continue;
                        }
                        if (var609 == 3609) {
                            var3--;
                            String var187 = field5336[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field5339[var2++] = class129.method876((byte) 91, var187) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3610) {
                            var2--;
                            int var188 = field5339[var2];
                            if (class255.field3722 == 2 && var188 < class26.field463) {
                                field5336[var3++] = class272.field3994[var188];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3611) {
                            if (class168.field2213 == null) {
                                field5336[var3++] = "";
                            } else {
                                field5336[var3++] = class187.method1167(class168.field2213, (byte) -39);
                            }
                            continue;
                        }
                        if (var609 == 3612) {
                            if (class168.field2213 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = class106.field1413;
                            }
                            continue;
                        }
                        if (var609 == 3613) {
                            var2--;
                            int var189 = field5339[var2];
                            if (class168.field2213 != null && var189 < class106.field1413) {
                                field5336[var3++] = class409.field6130[var189].field4451;
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3614) {
                            var2--;
                            int var190 = field5339[var2];
                            if (class168.field2213 != null && var190 < class106.field1413) {
                                field5339[var2++] = class409.field6130[var190].field4455;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3615) {
                            var2--;
                            int var191 = field5339[var2];
                            if (class168.field2213 != null && var191 < class106.field1413) {
                                field5339[var2++] = class409.field6130[var191].field4450;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3616) {
                            field5339[var2++] = class242.field3391;
                            continue;
                        }
                        if (var609 == 3617) {
                            var3--;
                            String var192 = field5336[var3];
                            class285.method1811(0, var192);
                            continue;
                        }
                        if (var609 == 3618) {
                            field5339[var2++] = class425.field6326;
                            continue;
                        }
                        if (var609 == 3619) {
                            var3--;
                            String var193 = field5336[var3];
                            class410.method2665((byte) 126, var193);
                            continue;
                        }
                        if (var609 == 3620) {
                            class263.method1648((byte) -79);
                            continue;
                        }
                        if (var609 == 3621) {
                            if (class255.field3722 == 0) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = class244.field3409;
                            }
                            continue;
                        }
                        if (var609 == 3622) {
                            var2--;
                            int var194 = field5339[var2];
                            if (class255.field3722 != 0 && var194 < class244.field3409) {
                                field5336[var3++] = class272.field3982[var194];
                                if (class155.field2035[var194] == null) {
                                    field5336[var3++] = "";
                                } else {
                                    field5336[var3++] = class155.field2035[var194];
                                }
                                continue;
                            }
                            field5336[var3++] = "";
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3623) {
                            var3--;
                            String var195 = field5336[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field5339[var2++] = class24.method216(var195, -87) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3624) {
                            var2--;
                            int var196 = field5339[var2];
                            if (class409.field6130 != null && var196 < class106.field1413 && class409.field6130[var196].field4443.equalsIgnoreCase(class100.field1350.field2756)) {
                                field5339[var2++] = 1;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3625) {
                            if (class288.field4180 == null) {
                                field5336[var3++] = "";
                            } else {
                                field5336[var3++] = class288.field4180;
                            }
                            continue;
                        }
                        if (var609 == 3626) {
                            var2--;
                            int var197 = field5339[var2];
                            if (class168.field2213 != null && var197 < class106.field1413) {
                                field5336[var3++] = class409.field6130[var197].field4457;
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3627) {
                            var2--;
                            int var198 = field5339[var2];
                            if (class255.field3722 == 2 && var198 >= 0 && var198 < class26.field463) {
                                field5339[var2++] = class35.field566[var198] ? 1 : 0;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 3628) {
                            var3--;
                            String var199 = field5336[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field5339[var2++] = class312.method1943(0, var199);
                            continue;
                        }
                        if (var609 == 3629) {
                            field5339[var2++] = class235.field3303;
                            continue;
                        }
                        if (var609 == 3630) {
                            var3--;
                            String var200 = field5336[var3];
                            class371.method2441(var200, true, (byte) -92);
                            continue;
                        }
                        if (var609 == 3631) {
                            var2--;
                            int var201 = field5339[var2];
                            field5339[var2++] = class41.field645[var201] ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3632) {
                            var2--;
                            int var202 = field5339[var2];
                            if (class168.field2213 != null && var202 < class106.field1413) {
                                field5336[var3++] = class409.field6130[var202].field4443;
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 3633) {
                            var2--;
                            int var203 = field5339[var2];
                            if (class255.field3722 != 0 && var203 < class244.field3409) {
                                field5336[var3++] = class374.field5640[var203];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                    } else if (var609 < 4000) {
                        if (var609 == 3903) {
                            var2--;
                            int var204 = field5339[var2];
                            field5339[var2++] = class349.field5178[var204].method2595((byte) -118);
                            continue;
                        }
                        if (var609 == 3904) {
                            var2--;
                            int var205 = field5339[var2];
                            field5339[var2++] = class349.field5178[var205].field5954;
                            continue;
                        }
                        if (var609 == 3905) {
                            var2--;
                            int var206 = field5339[var2];
                            field5339[var2++] = class349.field5178[var206].field5951;
                            continue;
                        }
                        if (var609 == 3906) {
                            var2--;
                            int var207 = field5339[var2];
                            field5339[var2++] = class349.field5178[var207].field5958;
                            continue;
                        }
                        if (var609 == 3907) {
                            var2--;
                            int var208 = field5339[var2];
                            field5339[var2++] = class349.field5178[var208].field5963;
                            continue;
                        }
                        if (var609 == 3908) {
                            var2--;
                            int var209 = field5339[var2];
                            field5339[var2++] = class349.field5178[var209].field5956;
                            continue;
                        }
                        if (var609 == 3910) {
                            var2--;
                            int var210 = field5339[var2];
                            int var211 = class349.field5178[var210].method2594(true);
                            field5339[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3911) {
                            var2--;
                            int var212 = field5339[var2];
                            int var213 = class349.field5178[var212].method2594(true);
                            field5339[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3912) {
                            var2--;
                            int var214 = field5339[var2];
                            int var215 = class349.field5178[var214].method2594(true);
                            field5339[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 3913) {
                            var2--;
                            int var216 = field5339[var2];
                            int var217 = class349.field5178[var216].method2594(true);
                            field5339[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 4100) {
                        if (var609 == 4000) {
                            var2 -= 2;
                            int var218 = field5339[var2];
                            int var219 = field5339[var2 + 1];
                            field5339[var2++] = var218 + var219;
                            continue;
                        }
                        if (var609 == 4001) {
                            var2 -= 2;
                            int var220 = field5339[var2];
                            int var221 = field5339[var2 + 1];
                            field5339[var2++] = var220 - var221;
                            continue;
                        }
                        if (var609 == 4002) {
                            var2 -= 2;
                            int var222 = field5339[var2];
                            int var223 = field5339[var2 + 1];
                            field5339[var2++] = var222 * var223;
                            continue;
                        }
                        if (var609 == 4003) {
                            var2 -= 2;
                            int var224 = field5339[var2];
                            int var225 = field5339[var2 + 1];
                            field5339[var2++] = var224 / var225;
                            continue;
                        }
                        if (var609 == 4004) {
                            var2--;
                            int var226 = field5339[var2];
                            field5339[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var609 == 4005) {
                            var2--;
                            int var227 = field5339[var2];
                            field5339[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var609 == 4006) {
                            var2 -= 5;
                            int var228 = field5339[var2];
                            int var229 = field5339[var2 + 1];
                            int var230 = field5339[var2 + 2];
                            int var231 = field5339[var2 + 3];
                            int var232 = field5339[var2 + 4];
                            field5339[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var609 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field5339[var2];
                            long var235 = (long) field5339[var2 + 1];
                            field5339[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var609 == 4008) {
                            var2 -= 2;
                            int var237 = field5339[var2];
                            int var238 = field5339[var2 + 1];
                            field5339[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var609 == 4009) {
                            var2 -= 2;
                            int var239 = field5339[var2];
                            int var240 = field5339[var2 + 1];
                            field5339[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var609 == 4010) {
                            var2 -= 2;
                            int var241 = field5339[var2];
                            int var242 = field5339[var2 + 1];
                            field5339[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var609 == 4011) {
                            var2 -= 2;
                            int var243 = field5339[var2];
                            int var244 = field5339[var2 + 1];
                            field5339[var2++] = var243 % var244;
                            continue;
                        }
                        if (var609 == 4012) {
                            var2 -= 2;
                            int var245 = field5339[var2];
                            int var246 = field5339[var2 + 1];
                            if (var245 == 0) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var609 == 4013) {
                            var2 -= 2;
                            int var247 = field5339[var2];
                            int var248 = field5339[var2 + 1];
                            if (var247 == 0) {
                                field5339[var2++] = 0;
                            } else if (var248 == 0) {
                                field5339[var2++] = Integer.MAX_VALUE;
                            } else {
                                field5339[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var609 == 4014) {
                            var2 -= 2;
                            int var249 = field5339[var2];
                            int var250 = field5339[var2 + 1];
                            field5339[var2++] = var249 & var250;
                            continue;
                        }
                        if (var609 == 4015) {
                            var2 -= 2;
                            int var251 = field5339[var2];
                            int var252 = field5339[var2 + 1];
                            field5339[var2++] = var251 | var252;
                            continue;
                        }
                        if (var609 == 4016) {
                            var2 -= 2;
                            int var253 = field5339[var2];
                            int var254 = field5339[var2 + 1];
                            field5339[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var609 == 4017) {
                            var2 -= 2;
                            int var255 = field5339[var2];
                            int var256 = field5339[var2 + 1];
                            field5339[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var609 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field5339[var2];
                            long var259 = (long) field5339[var2 + 1];
                            long var261 = (long) field5339[var2 + 2];
                            field5339[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var609 < 4200) {
                        if (var609 == 4100) {
                            var3--;
                            String var263 = field5336[var3];
                            var2--;
                            int var264 = field5339[var2];
                            field5336[var3++] = var263 + var264;
                            continue;
                        }
                        if (var609 == 4101) {
                            var3 -= 2;
                            String var265 = field5336[var3];
                            String var266 = field5336[var3 + 1];
                            field5336[var3++] = var265 + var266;
                            continue;
                        }
                        if (var609 == 4102) {
                            var3--;
                            String var267 = field5336[var3];
                            var2--;
                            int var268 = field5339[var2];
                            field5336[var3++] = var267 + class91.method563(100, true, var268);
                            continue;
                        }
                        if (var609 == 4103) {
                            var3--;
                            String var269 = field5336[var3];
                            field5336[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var609 == 4104) {
                            var2--;
                            int var270 = field5339[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field5348.setTime(new Date(var271));
                            int var273 = field5348.get(5);
                            int var274 = field5348.get(2);
                            int var275 = field5348.get(1);
                            field5336[var3++] = var273 + "-" + field5354[var274] + "-" + var275;
                            continue;
                        }
                        if (var609 == 4105) {
                            var3 -= 2;
                            String var276 = field5336[var3];
                            String var277 = field5336[var3 + 1];
                            if (class100.field1350.field2778 != null && class100.field1350.field2778.field1379) {
                                field5336[var3++] = var277;
                                continue;
                            }
                            field5336[var3++] = var276;
                            continue;
                        }
                        if (var609 == 4106) {
                            var2--;
                            int var278 = field5339[var2];
                            field5336[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var609 == 4107) {
                            var3 -= 2;
                            field5339[var2++] = class18.method124(field5336[var3], 125, class58.field833, field5336[var3 + 1]);
                            continue;
                        }
                        if (var609 == 4108) {
                            var3--;
                            String var279 = field5336[var3];
                            var2 -= 2;
                            int var280 = field5339[var2];
                            int var281 = field5339[var2 + 1];
                            class165 var282 = class85.method527(class208.field2987, (byte) -35, 0, var281);
                            field5339[var2++] = var282.method1024(-71, var279, var280, class152.field1983);
                            continue;
                        }
                        if (var609 == 4109) {
                            var3--;
                            String var283 = field5336[var3];
                            var2 -= 2;
                            int var284 = field5339[var2];
                            int var285 = field5339[var2 + 1];
                            class165 var286 = class85.method527(class208.field2987, (byte) -35, 0, var285);
                            field5339[var2++] = var286.method1025((byte) -95, var284, var283, class152.field1983);
                            continue;
                        }
                        if (var609 == 4110) {
                            var3 -= 2;
                            String var287 = field5336[var3];
                            String var288 = field5336[var3 + 1];
                            var2--;
                            if (field5339[var2] == 1) {
                                field5336[var3++] = var287;
                            } else {
                                field5336[var3++] = var288;
                            }
                            continue;
                        }
                        if (var609 == 4111) {
                            var3--;
                            String var289 = field5336[var3];
                            field5336[var3++] = class297.method1886(0, var289);
                            continue;
                        }
                        if (var609 == 4112) {
                            var3--;
                            String var290 = field5336[var3];
                            var2--;
                            int var291 = field5339[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field5336[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var609 == 4113) {
                            var2--;
                            int var292 = field5339[var2];
                            field5339[var2++] = class120.method838((char) var292, (byte) 122) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4114) {
                            var2--;
                            int var293 = field5339[var2];
                            field5339[var2++] = class312.method1946((char) var293, 18768) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4115) {
                            var2--;
                            int var294 = field5339[var2];
                            field5339[var2++] = class277.method1773((char) var294, -100) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4116) {
                            var2--;
                            int var295 = field5339[var2];
                            field5339[var2++] = class35.method287((byte) 106, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4117) {
                            var3--;
                            String var296 = field5336[var3];
                            if (var296 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var609 == 4118) {
                            var3--;
                            String var297 = field5336[var3];
                            var2 -= 2;
                            int var298 = field5339[var2];
                            int var299 = field5339[var2 + 1];
                            field5336[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var609 == 4119) {
                            var3--;
                            String var300 = field5336[var3];
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
                            field5336[var3++] = var301.toString();
                            continue;
                        }
                        if (var609 == 4120) {
                            var3--;
                            String var305 = field5336[var3];
                            var2 -= 2;
                            int var306 = field5339[var2];
                            int var307 = field5339[var2 + 1];
                            field5339[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var609 == 4121) {
                            var3 -= 2;
                            String var308 = field5336[var3];
                            String var309 = field5336[var3 + 1];
                            var2--;
                            int var310 = field5339[var2];
                            field5339[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var609 == 4122) {
                            var2--;
                            int var311 = field5339[var2];
                            field5339[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var609 == 4123) {
                            var2--;
                            int var312 = field5339[var2];
                            field5339[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var609 == 4124) {
                            var2--;
                            boolean var313 = field5339[var2] != 0;
                            var2--;
                            int var314 = field5339[var2];
                            field5336[var3++] = class417.method2690(var313, (long) var314, false, class58.field833, 0);
                            continue;
                        }
                    } else if (var609 < 4300) {
                        if (var609 == 4200) {
                            var2--;
                            int var315 = field5339[var2];
                            field5336[var3++] = class166.method1031(var315, false).field2729;
                            continue;
                        }
                        if (var609 == 4201) {
                            var2 -= 2;
                            int var316 = field5339[var2];
                            int var317 = field5339[var2 + 1];
                            class193 var318 = class166.method1031(var316, false);
                            if (var317 >= 1 && var317 <= 5 && var318.field2753[var317 - 1] != null) {
                                field5336[var3++] = var318.field2753[var317 - 1];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 4202) {
                            var2 -= 2;
                            int var319 = field5339[var2];
                            int var320 = field5339[var2 + 1];
                            class193 var321 = class166.method1031(var319, false);
                            if (var320 >= 1 && var320 <= 5 && var321.field2699[var320 - 1] != null) {
                                field5336[var3++] = var321.field2699[var320 - 1];
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 4203) {
                            var2--;
                            int var322 = field5339[var2];
                            field5339[var2++] = class166.method1031(var322, false).field2686;
                            continue;
                        }
                        if (var609 == 4204) {
                            var2--;
                            int var323 = field5339[var2];
                            field5339[var2++] = class166.method1031(var323, false).field2692 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4205) {
                            var2--;
                            int var324 = field5339[var2];
                            class193 var325 = class166.method1031(var324, false);
                            if (var325.field2706 == -1 && var325.field2682 >= 0) {
                                field5339[var2++] = var325.field2682;
                                continue;
                            }
                            field5339[var2++] = var324;
                            continue;
                        }
                        if (var609 == 4206) {
                            var2--;
                            int var326 = field5339[var2];
                            class193 var327 = class166.method1031(var326, false);
                            if (var327.field2706 >= 0 && var327.field2682 >= 0) {
                                field5339[var2++] = var327.field2682;
                                continue;
                            }
                            field5339[var2++] = var326;
                            continue;
                        }
                        if (var609 == 4207) {
                            var2--;
                            int var328 = field5339[var2];
                            field5339[var2++] = class166.method1031(var328, false).field2754 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 4208) {
                            var2 -= 2;
                            int var329 = field5339[var2];
                            int var330 = field5339[var2 + 1];
                            class85 var331 = class391.method2555(var330, true);
                            if (var331.method526((byte) -40)) {
                                field5336[var3++] = class166.method1031(var329, false).method1203((byte) -106, var330, var331.field1184);
                            } else {
                                field5339[var2++] = class166.method1031(var329, false).method1208(-19, var331.field1181, var330);
                            }
                            continue;
                        }
                        if (var609 == 4210) {
                            var3--;
                            String var332 = field5336[var3];
                            var2--;
                            int var333 = field5339[var2];
                            class90.method560(var332, -1, var333 == 1);
                            field5339[var2++] = class31.field528;
                            continue;
                        }
                        if (var609 == 4211) {
                            if (class128.field1697 != null && class300.field4318 < class31.field528) {
                                field5339[var2++] = class128.field1697[class300.field4318++] & 0xFFFF;
                                continue;
                            }
                            field5339[var2++] = -1;
                            continue;
                        }
                        if (var609 == 4212) {
                            class300.field4318 = 0;
                            continue;
                        }
                    } else if (var609 < 4400) {
                        if (var609 == 4300) {
                            var2 -= 2;
                            int var334 = field5339[var2];
                            int var335 = field5339[var2 + 1];
                            class85 var336 = class391.method2555(var335, true);
                            if (var336.method526((byte) -40)) {
                                field5336[var3++] = class248.method1530(var334, 119).method2470(var336.field1184, true, var335);
                            } else {
                                field5339[var2++] = class248.method1530(var334, 69).method2464(var335, var336.field1181, 65);
                            }
                            continue;
                        }
                    } else if (var609 < 4500) {
                        if (var609 == 4400) {
                            var2 -= 2;
                            int var337 = field5339[var2];
                            int var338 = field5339[var2 + 1];
                            class85 var339 = class391.method2555(var338, true);
                            if (var339.method526((byte) -40)) {
                                field5336[var3++] = class165.method1020(var337, -48).method2633(var338, var339.field1184, (byte) 47);
                            } else {
                                field5339[var2++] = class165.method1020(var337, 31).method2625(var338, false, var339.field1181);
                            }
                            continue;
                        }
                    } else if (var609 < 4600) {
                        if (var609 == 4500) {
                            var2 -= 2;
                            int var340 = field5339[var2];
                            int var341 = field5339[var2 + 1];
                            class85 var342 = class391.method2555(var341, true);
                            if (var342.method526((byte) -40)) {
                                field5336[var3++] = class22.method186(var340, 3).method1519(var341, 0, var342.field1184);
                            } else {
                                field5339[var2++] = class22.method186(var340, 3).method1517(var342.field1181, (byte) 64, var341);
                            }
                            continue;
                        }
                    } else if (var609 < 4700) {
                        if (var609 == 4600) {
                            var2--;
                            int var343 = field5339[var2];
                            field5339[var2++] = class132.method899(var343, (byte) 120).field2456;
                            continue;
                        }
                    } else if (var609 < 5100) {
                        if (var609 == 5000) {
                            field5339[var2++] = class132.field1766;
                            continue;
                        }
                        if (var609 == 5001) {
                            var2 -= 3;
                            class132.field1766 = field5339[var2];
                            class391.field5859 = field5339[var2 + 1];
                            class11.field136 = field5339[var2 + 2];
                            field5344++;
                            class232.field3279.method756(0, 59);
                            class232.field3279.method1707(-111, class132.field1766);
                            class232.field3279.method1707(80, class391.field5859);
                            class232.field3279.method1707(-122, class11.field136);
                            continue;
                        }
                        if (var609 == 5002) {
                            var3--;
                            String var344 = field5336[var3];
                            var2 -= 2;
                            int var345 = field5339[var2];
                            int var346 = field5339[var2 + 1];
                            field5342++;
                            class232.field3279.method756(0, 118);
                            class232.field3279.method1707(4, class410.method2668((byte) -124, var344) + 2);
                            class232.field3279.method1662(var344, (byte) -127);
                            class232.field3279.method1707(-118, var345 - 1);
                            class232.field3279.method1707(33, var346);
                            continue;
                        }
                        if (var609 == 5003) {
                            var2--;
                            int var347 = field5339[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class446.field6489[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field5336[var3++] = var348;
                            continue;
                        }
                        if (var609 == 5004) {
                            var2--;
                            int var349 = field5339[var2];
                            int var350 = -1;
                            if (var349 < 100 && class446.field6489[var349] != null) {
                                var350 = class363.field5309[var349];
                            }
                            field5339[var2++] = var350;
                            continue;
                        }
                        if (var609 == 5005) {
                            field5339[var2++] = class391.field5859;
                            continue;
                        }
                        if (var609 == 5008) {
                            var3--;
                            String var351 = field5336[var3];
                            if (class227.field3206 == 0 && (class261.field3808 && !class240.field3381 || class35.field570)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class369.field5479)) {
                                var353 = 0;
                                var351 = var351.substring(class369.field5479.length());
                            } else if (var352.startsWith(class130.field1735)) {
                                var353 = 1;
                                var351 = var351.substring(class130.field1735.length());
                            } else if (var352.startsWith(class292.field4225)) {
                                var353 = 2;
                                var351 = var351.substring(class292.field4225.length());
                            } else if (var352.startsWith(class212.field3010)) {
                                var353 = 3;
                                var351 = var351.substring(class212.field3010.length());
                            } else if (var352.startsWith(class28.field491)) {
                                var353 = 4;
                                var351 = var351.substring(class28.field491.length());
                            } else if (var352.startsWith(class343.field5036)) {
                                var353 = 5;
                                var351 = var351.substring(class343.field5036.length());
                            } else if (var352.startsWith(class69.field961)) {
                                var353 = 6;
                                var351 = var351.substring(class69.field961.length());
                            } else if (var352.startsWith(class28.field493)) {
                                var353 = 7;
                                var351 = var351.substring(class28.field493.length());
                            } else if (var352.startsWith(class293.field4241)) {
                                var353 = 8;
                                var351 = var351.substring(class293.field4241.length());
                            } else if (var352.startsWith(class77.field1059)) {
                                var353 = 9;
                                var351 = var351.substring(class77.field1059.length());
                            } else if (var352.startsWith(class16.field183)) {
                                var353 = 10;
                                var351 = var351.substring(class16.field183.length());
                            } else if (var352.startsWith(class65.field922)) {
                                var353 = 11;
                                var351 = var351.substring(class65.field922.length());
                            } else if (class58.field833 != 0) {
                                if (var352.startsWith(class387.field5787)) {
                                    var353 = 0;
                                    var351 = var351.substring(class387.field5787.length());
                                } else if (var352.startsWith(class187.field2543)) {
                                    var353 = 1;
                                    var351 = var351.substring(class187.field2543.length());
                                } else if (var352.startsWith(class239.field3370)) {
                                    var353 = 2;
                                    var351 = var351.substring(class239.field3370.length());
                                } else if (var352.startsWith(class444.field6467)) {
                                    var353 = 3;
                                    var351 = var351.substring(class444.field6467.length());
                                } else if (var352.startsWith(class274.field4032)) {
                                    var353 = 4;
                                    var351 = var351.substring(class274.field4032.length());
                                } else if (var352.startsWith(class373.field5621)) {
                                    var353 = 5;
                                    var351 = var351.substring(class373.field5621.length());
                                } else if (var352.startsWith(class213.field3035)) {
                                    var353 = 6;
                                    var351 = var351.substring(class213.field3035.length());
                                } else if (var352.startsWith(class281.field4132)) {
                                    var353 = 7;
                                    var351 = var351.substring(class281.field4132.length());
                                } else if (var352.startsWith(class80.field1103)) {
                                    var353 = 8;
                                    var351 = var351.substring(class80.field1103.length());
                                } else if (var352.startsWith(class192.field2672)) {
                                    var353 = 9;
                                    var351 = var351.substring(class192.field2672.length());
                                } else if (var352.startsWith(class132.field1776)) {
                                    var353 = 10;
                                    var351 = var351.substring(class132.field1776.length());
                                } else if (var352.startsWith(class284.field4146)) {
                                    var353 = 11;
                                    var351 = var351.substring(class284.field4146.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class369.field5482)) {
                                var355 = 1;
                                var351 = var351.substring(class369.field5482.length());
                            } else if (var354.startsWith(class197.field2823)) {
                                var355 = 2;
                                var351 = var351.substring(class197.field2823.length());
                            } else if (var354.startsWith(class127.field1689)) {
                                var355 = 3;
                                var351 = var351.substring(class127.field1689.length());
                            } else if (var354.startsWith(class157.field2072)) {
                                var355 = 4;
                                var351 = var351.substring(class157.field2072.length());
                            } else if (var354.startsWith(class324.field4650)) {
                                var355 = 5;
                                var351 = var351.substring(class324.field4650.length());
                            } else if (class58.field833 != 0) {
                                if (var354.startsWith(class264.field3838)) {
                                    var355 = 1;
                                    var351 = var351.substring(class264.field3838.length());
                                } else if (var354.startsWith(class8.field78)) {
                                    var355 = 2;
                                    var351 = var351.substring(class8.field78.length());
                                } else if (var354.startsWith(class328.field4710)) {
                                    var355 = 3;
                                    var351 = var351.substring(class328.field4710.length());
                                } else if (var354.startsWith(class452.field6584)) {
                                    var355 = 4;
                                    var351 = var351.substring(class452.field6584.length());
                                } else if (var354.startsWith(class390.field5852)) {
                                    var355 = 5;
                                    var351 = var351.substring(class390.field5852.length());
                                }
                            }
                            field5343++;
                            class232.field3279.method756(0, 182);
                            class232.field3279.method1707(-11, 0);
                            int var356 = class232.field3279.field3915;
                            class232.field3279.method1707(118, var353);
                            class232.field3279.method1707(-109, var355);
                            class94.method582(class232.field3279, var351, -1996488705);
                            class232.field3279.method1669(class232.field3279.field3915 - var356, (byte) -42);
                            continue;
                        }
                        if (var609 == 5009) {
                            var3 -= 2;
                            String var357 = field5336[var3];
                            String var358 = field5336[var3 + 1];
                            if (class227.field3206 != 0 || (!class261.field3808 || class240.field3381) && !class35.field570) {
                                field5350++;
                                class232.field3279.method756(0, 123);
                                class232.field3279.method1707(-26, 0);
                                int var359 = class232.field3279.field3915;
                                class232.field3279.method1662(var357, (byte) 66);
                                class94.method582(class232.field3279, var358, -1996488705);
                                class232.field3279.method1669(class232.field3279.field3915 - var359, (byte) -42);
                            }
                            continue;
                        }
                        if (var609 == 5010) {
                            var2--;
                            int var360 = field5339[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class179.field2357[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field5336[var3++] = var361;
                            continue;
                        }
                        if (var609 == 5011) {
                            var2--;
                            int var362 = field5339[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class333.field4908[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field5336[var3++] = var363;
                            continue;
                        }
                        if (var609 == 5012) {
                            var2--;
                            int var364 = field5339[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class132.field1775[var364];
                            }
                            field5339[var2++] = var365;
                            continue;
                        }
                        if (var609 == 5015) {
                            String var366;
                            if (class100.field1350 == null || class100.field1350.field2796 == null) {
                                var366 = class38.field611;
                            } else {
                                var366 = class100.field1350.method1220(true, true);
                            }
                            field5336[var3++] = var366;
                            continue;
                        }
                        if (var609 == 5016) {
                            field5339[var2++] = class11.field136;
                            continue;
                        }
                        if (var609 == 5017) {
                            field5339[var2++] = class278.field4089;
                            continue;
                        }
                        if (var609 == 5018) {
                            var2--;
                            int var367 = field5339[var2];
                            int var368 = 0;
                            if (var367 < 100 && class446.field6489[var367] != null) {
                                var368 = class363.field5309[var367];
                            }
                            field5339[var2++] = var368;
                            continue;
                        }
                        if (var609 == 5019) {
                            var2--;
                            int var369 = field5339[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class288.field4178[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field5336[var3++] = var370;
                            continue;
                        }
                        if (var609 == 5020) {
                            String var371;
                            if (class100.field1350 == null || class100.field1350.field2796 == null) {
                                var371 = class38.field611;
                            } else {
                                var371 = class100.field1350.method1218(false, (byte) -44);
                            }
                            field5336[var3++] = var371;
                            continue;
                        }
                        if (var609 == 5050) {
                            var2--;
                            int var372 = field5339[var2];
                            field5336[var3++] = class384.method2519(23752, var372).field2349;
                            continue;
                        }
                        if (var609 == 5051) {
                            var2--;
                            int var373 = field5339[var2];
                            class179 var374 = class384.method2519(23752, var373);
                            if (var374.field2360 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var374.field2360.length;
                            }
                            continue;
                        }
                        if (var609 == 5052) {
                            var2 -= 2;
                            int var375 = field5339[var2];
                            int var376 = field5339[var2 + 1];
                            class179 var377 = class384.method2519(23752, var375);
                            int var378 = var377.field2360[var376];
                            field5339[var2++] = var378;
                            continue;
                        }
                        if (var609 == 5053) {
                            var2--;
                            int var379 = field5339[var2];
                            class179 var380 = class384.method2519(23752, var379);
                            if (var380.field2361 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var380.field2361.length;
                            }
                            continue;
                        }
                        if (var609 == 5054) {
                            var2 -= 2;
                            int var381 = field5339[var2];
                            int var382 = field5339[var2 + 1];
                            field5339[var2++] = class384.method2519(23752, var381).field2361[var382];
                            continue;
                        }
                        if (var609 == 5055) {
                            var2--;
                            int var383 = field5339[var2];
                            field5336[var3++] = class284.method1804(var383, (byte) -73).method372(1);
                            continue;
                        }
                        if (var609 == 5056) {
                            var2--;
                            int var384 = field5339[var2];
                            class53 var385 = class284.method1804(var384, (byte) -73);
                            if (var385.field784 == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var385.field784.length;
                            }
                            continue;
                        }
                        if (var609 == 5057) {
                            var2 -= 2;
                            int var386 = field5339[var2];
                            int var387 = field5339[var2 + 1];
                            field5339[var2++] = class284.method1804(var386, (byte) 126).field784[var387];
                            continue;
                        }
                        if (var609 == 5058) {
                            field5341 = new class348();
                            var2--;
                            field5341.field5174 = field5339[var2];
                            field5341.field5169 = class284.method1804(field5341.field5174, (byte) -69);
                            field5341.field5170 = new int[field5341.field5169.method364(true)];
                            continue;
                        }
                        if (var609 == 5059) {
                            field5333++;
                            class232.field3279.method756(0, 68);
                            class232.field3279.method1707(-123, 0);
                            int var388 = class232.field3279.field3915;
                            class232.field3279.method1707(-122, 0);
                            class232.field3279.method1693(field5341.field5174, (byte) 28);
                            field5341.field5169.method370(field5341.field5170, 127, class232.field3279);
                            class232.field3279.method1669(class232.field3279.field3915 - var388, (byte) -42);
                            continue;
                        }
                        if (var609 == 5060) {
                            var3--;
                            String var389 = field5336[var3];
                            field5332++;
                            class232.field3279.method756(0, 62);
                            class232.field3279.method1707(97, 0);
                            int var390 = class232.field3279.field3915;
                            class232.field3279.method1662(var389, (byte) -107);
                            class232.field3279.method1693(field5341.field5174, (byte) 32);
                            field5341.field5169.method370(field5341.field5170, 127, class232.field3279);
                            class232.field3279.method1669(class232.field3279.field3915 - var390, (byte) -42);
                            continue;
                        }
                        if (var609 == 5061) {
                            field5333++;
                            class232.field3279.method756(0, 68);
                            class232.field3279.method1707(-122, 0);
                            int var391 = class232.field3279.field3915;
                            class232.field3279.method1707(-115, 1);
                            class232.field3279.method1693(field5341.field5174, (byte) 118);
                            field5341.field5169.method370(field5341.field5170, 127, class232.field3279);
                            class232.field3279.method1669(class232.field3279.field3915 - var391, (byte) -42);
                            continue;
                        }
                        if (var609 == 5062) {
                            var2 -= 2;
                            int var392 = field5339[var2];
                            int var393 = field5339[var2 + 1];
                            field5339[var2++] = class384.method2519(23752, var392).field2356[var393];
                            continue;
                        }
                        if (var609 == 5063) {
                            var2 -= 2;
                            int var394 = field5339[var2];
                            int var395 = field5339[var2 + 1];
                            field5339[var2++] = class384.method2519(23752, var394).field2346[var395];
                            continue;
                        }
                        if (var609 == 5064) {
                            var2 -= 2;
                            int var396 = field5339[var2];
                            int var397 = field5339[var2 + 1];
                            if (var397 == -1) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = class384.method2519(23752, var396).method1108((char) var397, (byte) -122);
                            }
                            continue;
                        }
                        if (var609 == 5065) {
                            var2 -= 2;
                            int var398 = field5339[var2];
                            int var399 = field5339[var2 + 1];
                            if (var399 == -1) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = class384.method2519(23752, var398).method1105((char) var399, 119);
                            }
                            continue;
                        }
                        if (var609 == 5066) {
                            var2--;
                            int var400 = field5339[var2];
                            field5339[var2++] = class284.method1804(var400, (byte) -64).method364(true);
                            continue;
                        }
                        if (var609 == 5067) {
                            var2 -= 2;
                            int var401 = field5339[var2];
                            int var402 = field5339[var2 + 1];
                            int var403 = class284.method1804(var401, (byte) -49).method366(0, var402);
                            field5339[var2++] = var403;
                            continue;
                        }
                        if (var609 == 5068) {
                            var2 -= 2;
                            int var404 = field5339[var2];
                            int var405 = field5339[var2 + 1];
                            field5341.field5170[var404] = var405;
                            continue;
                        }
                        if (var609 == 5069) {
                            var2 -= 2;
                            int var406 = field5339[var2];
                            int var407 = field5339[var2 + 1];
                            field5341.field5170[var406] = var407;
                            continue;
                        }
                        if (var609 == 5070) {
                            var2 -= 3;
                            int var408 = field5339[var2];
                            int var409 = field5339[var2 + 1];
                            int var410 = field5339[var2 + 2];
                            class53 var411 = class284.method1804(var408, (byte) -38);
                            if (var411.method366(0, var409) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field5339[var2++] = var411.method365((byte) -86, var410, var409);
                            continue;
                        }
                        if (var609 == 5071) {
                            var3--;
                            String var412 = field5336[var3];
                            var2--;
                            boolean var413 = field5339[var2] == 1;
                            class29.method252(var413, 0, var412);
                            field5339[var2++] = class31.field528;
                            continue;
                        }
                        if (var609 == 5072) {
                            if (class128.field1697 != null && class300.field4318 < class31.field528) {
                                field5339[var2++] = class128.field1697[class300.field4318++] & 0xFFFF;
                                continue;
                            }
                            field5339[var2++] = -1;
                            continue;
                        }
                        if (var609 == 5073) {
                            class300.field4318 = 0;
                            continue;
                        }
                    } else if (var609 < 5200) {
                        if (var609 == 5100) {
                            if (class1.field5[86]) {
                                field5339[var2++] = 1;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5101) {
                            if (class1.field5[82]) {
                                field5339[var2++] = 1;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5102) {
                            if (class1.field5[81]) {
                                field5339[var2++] = 1;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var609 < 5300) {
                        if (var609 == 5200) {
                            var2--;
                            class204.method1288(-90, field5339[var2]);
                            continue;
                        }
                        if (var609 == 5201) {
                            field5339[var2++] = class79.method501((byte) -123);
                            continue;
                        }
                        if (var609 == 5205) {
                            var2--;
                            class139.method939(-1, false, -1, -106, field5339[var2]);
                            continue;
                        }
                        if (var609 == 5206) {
                            var2--;
                            int var414 = field5339[var2];
                            class177 var415 = class76.method483(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = var415.field2319;
                            }
                            continue;
                        }
                        if (var609 == 5207) {
                            var2--;
                            class177 var416 = class76.method488(field5339[var2]);
                            if (var416 != null && var416.field2314 != null) {
                                field5336[var3++] = var416.field2314;
                                continue;
                            }
                            field5336[var3++] = "";
                            continue;
                        }
                        if (var609 == 5208) {
                            field5339[var2++] = class107.field1465;
                            field5339[var2++] = class271.field3971;
                            continue;
                        }
                        if (var609 == 5209) {
                            field5339[var2++] = class76.field1041 + class169.field2222;
                            field5339[var2++] = class76.field1044 + class133.field1778;
                            continue;
                        }
                        if (var609 == 5210) {
                            var2--;
                            int var417 = field5339[var2];
                            class177 var418 = class76.method488(var417);
                            if (var418 == null) {
                                field5339[var2++] = 0;
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var418.field2329 >> 14 & 0x3FFF;
                                field5339[var2++] = var418.field2329 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var609 == 5211) {
                            var2--;
                            int var419 = field5339[var2];
                            class177 var420 = class76.method488(var419);
                            if (var420 == null) {
                                field5339[var2++] = 0;
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var420.field2332 - var420.field2322;
                                field5339[var2++] = var420.field2315 - var420.field2323;
                            }
                            continue;
                        }
                        if (var609 == 5212) {
                            class419 var421 = class214.method1347((byte) -50);
                            if (var421 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = var421.field6231;
                                int var422 = var421.field6235 << 28 | class76.field1041 + var421.field6223 << 14 | class76.field1044 + var421.field6230;
                                field5339[var2++] = var422;
                            }
                            continue;
                        }
                        if (var609 == 5213) {
                            class419 var423 = class50.method346(true);
                            if (var423 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = var423.field6231;
                                int var424 = var423.field6235 << 28 | class76.field1041 + var423.field6223 << 14 | class76.field1044 + var423.field6230;
                                field5339[var2++] = var424;
                            }
                            continue;
                        }
                        if (var609 == 5214) {
                            var2--;
                            int var425 = field5339[var2];
                            class177 var426 = class358.method2346(3);
                            if (var426 != null) {
                                boolean var427 = var426.method1079(-89, var425 >> 14 & 0x3FFF, var425 >> 28 & 0x3, var425 & 0x3FFF, field5352);
                                if (var427) {
                                    class433.method2746(field5352[1], field5352[2], (byte) 120);
                                }
                            }
                            continue;
                        }
                        if (var609 == 5215) {
                            var2 -= 2;
                            int var428 = field5339[var2];
                            int var429 = field5339[var2 + 1];
                            class199 var430 = class76.method469(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class177 var432 = (class177) var430.method1252(-18); var432 != null; var432 = (class177) var430.method1249(-99)) {
                                if (var432.field2319 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field5339[var2++] = 1;
                            } else {
                                field5339[var2++] = 0;
                            }
                            continue;
                        }
                        if (var609 == 5218) {
                            var2--;
                            int var433 = field5339[var2];
                            class177 var434 = class76.method488(var433);
                            if (var434 == null) {
                                field5339[var2++] = -1;
                            } else {
                                field5339[var2++] = var434.field2334;
                            }
                            continue;
                        }
                        if (var609 == 5220) {
                            field5339[var2++] = class424.field6305 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5221) {
                            var2--;
                            int var435 = field5339[var2];
                            class433.method2746(var435 >> 14 & 0x3FFF, var435 & 0x3FFF, (byte) 119);
                            continue;
                        }
                        if (var609 == 5222) {
                            class177 var436 = class358.method2346(3);
                            if (var436 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = -1;
                            } else {
                                boolean var437 = var436.method1085(class76.field1041 + class169.field2222, field5352, class76.field1044 + class133.field1778, (byte) -111);
                                if (var437) {
                                    field5339[var2++] = field5352[1];
                                    field5339[var2++] = field5352[2];
                                } else {
                                    field5339[var2++] = -1;
                                    field5339[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5223) {
                            var2 -= 2;
                            int var438 = field5339[var2];
                            int var439 = field5339[var2 + 1];
                            class139.method939(var439 & 0x3FFF, false, var439 >> 14 & 0x3FFF, -78, var438);
                            continue;
                        }
                        if (var609 == 5224) {
                            var2--;
                            int var440 = field5339[var2];
                            class177 var441 = class358.method2346(3);
                            if (var441 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = -1;
                            } else {
                                boolean var442 = var441.method1079(123, var440 >> 14 & 0x3FFF, var440 >> 28 & 0x3, var440 & 0x3FFF, field5352);
                                if (var442) {
                                    field5339[var2++] = field5352[1];
                                    field5339[var2++] = field5352[2];
                                } else {
                                    field5339[var2++] = -1;
                                    field5339[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5225) {
                            var2--;
                            int var443 = field5339[var2];
                            class177 var444 = class358.method2346(3);
                            if (var444 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = -1;
                            } else {
                                boolean var445 = var444.method1085(var443 >> 14 & 0x3FFF, field5352, var443 & 0x3FFF, (byte) -99);
                                if (var445) {
                                    field5339[var2++] = field5352[1];
                                    field5339[var2++] = field5352[2];
                                } else {
                                    field5339[var2++] = -1;
                                    field5339[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var609 == 5226) {
                            var2--;
                            class115.method801(field5339[var2], (byte) -127);
                            continue;
                        }
                        if (var609 == 5227) {
                            var2 -= 2;
                            int var446 = field5339[var2];
                            int var447 = field5339[var2 + 1];
                            class139.method939(var447 & 0x3FFF, true, var447 >> 14 & 0x3FFF, -116, var446);
                            continue;
                        }
                        if (var609 == 5228) {
                            var2--;
                            class258.field3766 = field5339[var2] == 1;
                            continue;
                        }
                        if (var609 == 5229) {
                            field5339[var2++] = class258.field3766 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5230) {
                            var2--;
                            int var448 = field5339[var2];
                            class248.method1532((byte) 38, var448);
                            continue;
                        }
                        if (var609 == 5231) {
                            var2 -= 2;
                            int var449 = field5339[var2];
                            boolean var450 = field5339[var2 + 1] == 1;
                            if (class71.field974 == null) {
                                continue;
                            }
                            class393 var451 = class71.field974.method954(125, (long) var449);
                            if (var451 != null && !var450) {
                                var451.method2574((byte) 124);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class393 var452 = new class393();
                                class71.field974.method956(false, (long) var449, var452);
                            }
                            continue;
                        }
                        if (var609 == 5232) {
                            var2--;
                            int var453 = field5339[var2];
                            if (class71.field974 == null) {
                                field5339[var2++] = 0;
                            } else {
                                class393 var454 = class71.field974.method954(51, (long) var453);
                                field5339[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var609 == 5233) {
                            var2 -= 2;
                            int var455 = field5339[var2];
                            boolean var456 = field5339[var2 + 1] == 1;
                            if (class215.field3087 == null) {
                                continue;
                            }
                            class393 var457 = class215.field3087.method954(98, (long) var455);
                            if (var457 != null && !var456) {
                                var457.method2574((byte) 125);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class393 var458 = new class393();
                                class215.field3087.method956(false, (long) var455, var458);
                            }
                            continue;
                        }
                        if (var609 == 5234) {
                            var2--;
                            int var459 = field5339[var2];
                            if (class215.field3087 == null) {
                                field5339[var2++] = 0;
                            } else {
                                class393 var460 = class215.field3087.method954(90, (long) var459);
                                field5339[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var609 == 5235) {
                            field5339[var2++] = class76.field1019 == null ? -1 : class76.field1019.field2319;
                            continue;
                        }
                    } else if (var609 < 5400) {
                        if (var609 == 5300) {
                            var2 -= 2;
                            int var461 = field5339[var2];
                            int var462 = field5339[var2 + 1];
                            class66.method430(3, var461, var462, false, true);
                            field5339[var2++] = class106.field1428 == null ? 0 : 1;
                            continue;
                        }
                        if (var609 == 5301) {
                            if (class106.field1428 != null) {
                                class66.method430(class161.field2107, -1, -1, false, true);
                            }
                            continue;
                        }
                        if (var609 == 5302) {
                            class432[] var463 = class82.method520((byte) 96);
                            field5339[var2++] = var463.length;
                            continue;
                        }
                        if (var609 == 5303) {
                            var2--;
                            int var464 = field5339[var2];
                            class432[] var465 = class82.method520((byte) 100);
                            field5339[var2++] = var465[var464].field6371;
                            field5339[var2++] = var465[var464].field6374;
                            continue;
                        }
                        if (var609 == 5305) {
                            int var466 = class401.field5968;
                            int var467 = class284.field4158;
                            int var468 = -1;
                            class432[] var469 = class82.method520((byte) 62);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class432 var471 = var469[var470];
                                if (var471.field6371 == var466 && var471.field6374 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field5339[var2++] = var468;
                            continue;
                        }
                        if (var609 == 5306) {
                            field5339[var2++] = class6.method51(-45);
                            continue;
                        }
                        if (var609 == 5307) {
                            var2--;
                            int var472 = field5339[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class66.method430(var472, -1, -1, false, true);
                            }
                            continue;
                        }
                        if (var609 == 5308) {
                            field5339[var2++] = class161.field2107;
                            continue;
                        }
                        if (var609 == 5309) {
                            var2--;
                            int var473 = field5339[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class161.field2107 = var473;
                                class423.method2724(class361.field5285, (byte) -7);
                            }
                            continue;
                        }
                    } else if (var609 < 5500) {
                        if (var609 == 5400) {
                            var3 -= 2;
                            String var474 = field5336[var3];
                            String var475 = field5336[var3 + 1];
                            var2--;
                            int var476 = field5339[var2];
                            field5340++;
                            class232.field3279.method756(0, 228);
                            class232.field3279.method1707(-3, class410.method2668((byte) -124, var474) + class410.method2668((byte) -106, var475) + 1);
                            class232.field3279.method1662(var474, (byte) 64);
                            class232.field3279.method1662(var475, (byte) 118);
                            class232.field3279.method1707(7, var476);
                            continue;
                        }
                        if (var609 == 5401) {
                            var2 -= 2;
                            class335.field4953[field5339[var2]] = (short) class404.method2636(94, field5339[var2 + 1]);
                            class139.method933(15020);
                            class392.method2563(false);
                            class326.method2009((byte) -114);
                            class452.method2827((byte) 86);
                            class176.method1075((byte) -125);
                            continue;
                        }
                        if (var609 == 5405) {
                            var2 -= 2;
                            int var477 = field5339[var2];
                            int var478 = field5339[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class179.field2351[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var609 == 5406) {
                            var2 -= 7;
                            int var479 = field5339[var2];
                            int var480 = field5339[var2 + 1] << 1;
                            int var481 = field5339[var2 + 2];
                            int var482 = field5339[var2 + 3];
                            int var483 = field5339[var2 + 4];
                            int var484 = field5339[var2 + 5];
                            int var485 = field5339[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class179.field2351[var479] != null && var480 >= 0 && var480 < class179.field2351[var479].length) {
                                class179.field2351[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class179.field2351[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var609 == 5407) {
                            var2--;
                            int var486 = class179.field2351[field5339[var2]].length >> 1;
                            field5339[var2++] = var486;
                            continue;
                        }
                        if (var609 == 5411) {
                            if (class106.field1428 != null) {
                                class66.method430(class161.field2107, -1, -1, false, true);
                            }
                            if (class238.field3346 == null) {
                                String var487 = class127.field1687 == null ? class324.method2002(-98) : class127.field1687;
                                class70.method442(false, var487, class265.field3854 == 1, class361.field5285, false);
                            } else {
                                class153.method993(6);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var609 == 5419) {
                            String var488 = "";
                            if (class35.field569 != null) {
                                if (class35.field569.field4262 == null) {
                                    var488 = class318.method1974(false, class35.field569.field4260);
                                } else {
                                    var488 = (String) class35.field569.field4262;
                                }
                            }
                            field5336[var3++] = var488;
                            continue;
                        }
                        if (var609 == 5420) {
                            field5339[var2++] = class2.field22 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5421) {
                            if (class106.field1428 != null) {
                                class66.method430(class161.field2107, -1, -1, false, true);
                            }
                            var3--;
                            String var489 = field5336[var3];
                            var2--;
                            boolean var490 = field5339[var2] == 1;
                            String var491 = class324.method2002(-110) + var489;
                            class70.method442(false, var491, class265.field3854 == 1, class361.field5285, var490);
                            continue;
                        }
                        if (var609 == 5422) {
                            var3 -= 2;
                            String var492 = field5336[var3];
                            String var493 = field5336[var3 + 1];
                            var2--;
                            int var494 = field5339[var2];
                            if (var492.length() > 0) {
                                if (class390.field5850 == null) {
                                    class390.field5850 = new String[class355.field5213[class126.field1679]];
                                }
                                class390.field5850[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class199.field2846 == null) {
                                    class199.field2846 = new String[class355.field5213[class126.field1679]];
                                }
                                class199.field2846[var494] = var493;
                            }
                            continue;
                        }
                        if (var609 == 5423) {
                            var3--;
                            System.out.println(field5336[var3]);
                            continue;
                        }
                        if (var609 == 5424) {
                            var2 -= 11;
                            class368.field5469 = field5339[var2];
                            class263.field3832 = field5339[var2 + 1];
                            class85.field1187 = field5339[var2 + 2];
                            class57.field817 = field5339[var2 + 3];
                            class325.field4675 = field5339[var2 + 4];
                            class424.field6310 = field5339[var2 + 5];
                            class124.field1651 = field5339[var2 + 6];
                            class100.field1359 = field5339[var2 + 7];
                            class314.field4496 = field5339[var2 + 8];
                            class311.field4454 = field5339[var2 + 9];
                            class154.field2018 = field5339[var2 + 10];
                            class247.field3446.method1451(-116, class325.field4675);
                            class247.field3446.method1451(-116, class424.field6310);
                            class247.field3446.method1451(-119, class124.field1651);
                            class247.field3446.method1451(-117, class100.field1359);
                            class247.field3446.method1451(-116, class314.field4496);
                            class32.field533 = null;
                            class101.field1360 = null;
                            class87.field1213 = null;
                            class213.field3016 = null;
                            class228.field3228 = null;
                            class24.field432 = null;
                            class318.field4543 = null;
                            class170.field2248 = null;
                            class446.field6493 = true;
                            continue;
                        }
                        if (var609 == 5425) {
                            class23.method193((byte) -103);
                            class446.field6493 = false;
                            continue;
                        }
                        if (var609 == 5426) {
                            var2 -= 2;
                            class45.field674 = field5339[var2];
                            class358.field5245 = field5339[var2 + 1];
                            continue;
                        }
                        if (var609 == 5427) {
                            var2 -= 2;
                            class274.field4033 = field5339[var2];
                            class196.field2803 = field5339[var2 + 1];
                            continue;
                        }
                        if (var609 == 5428) {
                            var2 -= 2;
                            int var495 = field5339[var2];
                            int var496 = field5339[var2 + 1];
                            field5339[var2++] = class8.method63(var495, 4, var496) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 5429) {
                            var3--;
                            class197.method1233(83, false, field5336[var3]);
                            continue;
                        }
                    } else if (var609 < 5600) {
                        if (var609 == 5500) {
                            var2 -= 4;
                            int var497 = field5339[var2];
                            int var498 = field5339[var2 + 1];
                            int var499 = field5339[var2 + 2];
                            int var500 = field5339[var2 + 3];
                            class318.method1976(false, (byte) -126, var499, var498, (var497 >> 14 & 0x3FFF) - class184.field2482, var500, (var497 & 0x3FFF) - class38.field620);
                            continue;
                        }
                        if (var609 == 5501) {
                            var2 -= 4;
                            int var501 = field5339[var2];
                            int var502 = field5339[var2 + 1];
                            int var503 = field5339[var2 + 2];
                            int var504 = field5339[var2 + 3];
                            class261.method1640((var501 & 0x3FFF) - class38.field620, var502, var504, -1260, (var501 >> 14 & 0x3FFF) - class184.field2482, var503);
                            continue;
                        }
                        if (var609 == 5502) {
                            var2 -= 6;
                            int var505 = field5339[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class104.field1402 = var505;
                            int var506 = field5339[var2 + 1];
                            if (var506 + 1 >= class179.field2351[class104.field1402].length >> 1) {
                                throw new RuntimeException();
                            }
                            class436.field6405 = var506;
                            class143.field1875 = 0;
                            class337.field4973 = field5339[var2 + 2];
                            class40.field637 = field5339[var2 + 3];
                            int var507 = field5339[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class125.field1667 = var507;
                            int var508 = field5339[var2 + 5];
                            if (var508 + 1 >= class179.field2351[class125.field1667].length >> 1) {
                                throw new RuntimeException();
                            }
                            class155.field2032 = var508;
                            class5.field48 = 3;
                            continue;
                        }
                        if (var609 == 5503) {
                            class107.method744(0);
                            continue;
                        }
                        if (var609 == 5504) {
                            var2 -= 2;
                            class33.method276(field5339[var2], field5339[var2 + 1], 0, (byte) 108);
                            continue;
                        }
                        if (var609 == 5505) {
                            field5339[var2++] = (int) class155.field2027 >> 3;
                            continue;
                        }
                        if (var609 == 5506) {
                            field5339[var2++] = (int) class170.field2244 >> 3;
                            continue;
                        }
                        if (var609 == 5507) {
                            class246.method1513(true);
                            continue;
                        }
                        if (var609 == 5508) {
                            class401.method2607(-81);
                            continue;
                        }
                        if (var609 == 5509) {
                            class106.method734(-91);
                            continue;
                        }
                        if (var609 == 5510) {
                            class376.method2495(0);
                            continue;
                        }
                        if (var609 == 5511) {
                            var2--;
                            int var509 = field5339[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class184.field2482;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class324.field4652) {
                                var512 = class324.field4652;
                            }
                            int var513 = var511 - class38.field620;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class336.field4964) {
                                var513 = class336.field4964;
                            }
                            class309.field4409 = var512 * 128 + 64;
                            class146.field1915 = var513 * 128 + 64;
                            class5.field48 = 4;
                            continue;
                        }
                        if (var609 == 5512) {
                            class91.method562((byte) -58);
                            continue;
                        }
                    } else if (var609 < 5700) {
                        if (var609 == 5600) {
                            var3 -= 2;
                            String var514 = field5336[var3];
                            String var515 = field5336[var3 + 1];
                            var2--;
                            int var516 = field5339[var2];
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0 && class373.field5609 == 0) {
                                class169.method1049(23820, var515, var516, var514);
                            }
                            continue;
                        }
                        if (var609 == 5601) {
                            class264.method1656(-6);
                            continue;
                        }
                        if (var609 == 5602) {
                            if (class88.field1227 == 0) {
                                class276.field4043 = -2;
                            }
                            continue;
                        }
                        if (var609 == 5603) {
                            var2 -= 4;
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0 && class373.field5609 == 0) {
                                class297.method1884(field5339[var2 + 3], field5339[var2], 0, field5339[var2 + 2], field5339[var2 + 1]);
                            }
                            continue;
                        }
                        if (var609 == 5604) {
                            var3--;
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0 && class373.field5609 == 0) {
                                class425.method2730(-123, class249.method1535(field5336[var3], 65535));
                            }
                            continue;
                        }
                        if (var609 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0 && class373.field5609 == 0) {
                                class353.method2325(field5336[var3 + 2], field5339[var2 + 2], field5336[var3 + 1], class249.method1535(field5336[var3], 65535), field5339[var2 + 1], field5339[var2 + 3], field5339[var2 + 5] == 1, field5339[var2], 24672, field5339[var2 + 6] == 1, field5339[var2 + 4] == 1);
                            }
                            continue;
                        }
                        if (var609 == 5606) {
                            if (class239.field3379 == 0) {
                                class293.field4244 = -2;
                            }
                            continue;
                        }
                        if (var609 == 5607) {
                            field5339[var2++] = class276.field4043;
                            continue;
                        }
                        if (var609 == 5608) {
                            field5339[var2++] = class276.field4057;
                            continue;
                        }
                        if (var609 == 5609) {
                            field5339[var2++] = class293.field4244;
                            continue;
                        }
                        if (var609 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field5336[var3++] = class190.field2650.length > var517 ? class187.method1167(class190.field2650[var517], (byte) -39) : "";
                            }
                            class190.field2650 = null;
                            continue;
                        }
                        if (var609 == 5611) {
                            field5339[var2++] = class160.field2092;
                            continue;
                        }
                    } else if (var609 < 6100) {
                        if (var609 == 6001) {
                            var2--;
                            int var518 = field5339[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class357.field5234 = var518;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6002) {
                            var2--;
                            class437.method2772(field5339[var2] == 1, -44);
                            class125.method858(0);
                            class300.method1898(1);
                            class152.method990((byte) -101);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6003) {
                            var2--;
                            class161.field2103 = field5339[var2] == 1;
                            class152.method990((byte) -101);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6005) {
                            var2--;
                            class258.field3768 = field5339[var2] == 1;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6006) {
                            var2--;
                            class449.field6561 = field5339[var2] == 1;
                            class35.field574.method2064(!class449.field6561);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6007) {
                            var2--;
                            class264.field3845 = field5339[var2];
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6008) {
                            var2--;
                            class158.field2076 = field5339[var2] == 1;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6009) {
                            var2--;
                            class261.field3804 = field5339[var2] == 1;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6010) {
                            var2--;
                            class451.field6576 = field5339[var2] == 1;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6011) {
                            var2--;
                            int var519 = field5339[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class176.field2300 = var519;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6012) {
                            var2--;
                            class417.field6217 = field5339[var2] == 1;
                            class203.method1283(61);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6014) {
                            var2--;
                            class273.field4024 = field5339[var2] == 1;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6015) {
                            var2--;
                            class413.field6165 = field5339[var2] == 1;
                            class300.method1898(1);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6016) {
                            var2--;
                            int var520 = field5339[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class369.field5483 = var520;
                            class179.method1107((byte) -115);
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6017) {
                            var2--;
                            class101.field1366 = field5339[var2] == 1;
                            class325.method2008(22050);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6018) {
                            var2--;
                            int var521 = field5339[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class23.field409 = var521;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6019) {
                            var2--;
                            int var522 = field5339[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class407.field6101 != var522) {
                                if (class407.field6101 == 0 && class280.field4128 != -1) {
                                    class297.method1883(class280.field4128, 0, var522, -127, false, class328.field4711);
                                    class164.field2139 = false;
                                } else if (var522 == 0) {
                                    class97.method639((byte) -116);
                                    class164.field2139 = false;
                                } else {
                                    class122.method845(var522, 0);
                                }
                                class407.field6101 = var522;
                            }
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6020) {
                            var2--;
                            int var523 = field5339[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class358.field5243 = var523;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6021) {
                            var2--;
                            class38.field616 = field5339[var2] == 1;
                            class152.method990((byte) -101);
                            continue;
                        }
                        if (var609 == 6023) {
                            var2--;
                            int var524 = field5339[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class160.field2099 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class313.method1956(var524, 0);
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            field5339[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var609 == 6024) {
                            var2--;
                            int var526 = field5339[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class292.field4222 = var526;
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6025) {
                            var2--;
                            int var527 = field5339[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class445.field6478 = var527;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                        if (var609 == 6027) {
                            var2--;
                            int var528 = field5339[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class97.method633(var528 == 1, 47);
                            continue;
                        }
                        if (var609 == 6028) {
                            var2--;
                            class200.field2869 = field5339[var2] != 0;
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6029) {
                            var2--;
                            class264.field3845 = field5339[var2];
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6030) {
                            var2--;
                            class363.field5313 = field5339[var2] != 0;
                            class423.method2724(class361.field5285, (byte) -7);
                            class300.method1898(1);
                            continue;
                        }
                        if (var609 == 6031) {
                            var2--;
                            int var529 = field5339[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class22.method189(var529, -106);
                            continue;
                        }
                        if (var609 == 6032) {
                            var2--;
                            int var530 = field5339[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class215.field3082 = var530;
                            class423.method2724(class361.field5285, (byte) -7);
                            class153.field2013 = false;
                            continue;
                        }
                    } else if (var609 < 6200) {
                        if (var609 == 6101) {
                            field5339[var2++] = class357.field5234;
                            continue;
                        }
                        if (var609 == 6102) {
                            field5339[var2++] = class116.method810((byte) 118) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6103) {
                            field5339[var2++] = class161.field2103 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6105) {
                            field5339[var2++] = class258.field3768 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6106) {
                            field5339[var2++] = class449.field6561 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6107) {
                            field5339[var2++] = class264.field3845;
                            continue;
                        }
                        if (var609 == 6108) {
                            field5339[var2++] = class158.field2076 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6109) {
                            field5339[var2++] = class261.field3804 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6110) {
                            field5339[var2++] = class451.field6576 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6111) {
                            field5339[var2++] = class176.field2300;
                            continue;
                        }
                        if (var609 == 6112) {
                            field5339[var2++] = class417.field6217 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6114) {
                            field5339[var2++] = class273.field4024 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6115) {
                            field5339[var2++] = class413.field6165 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6116) {
                            field5339[var2++] = class369.field5483;
                            continue;
                        }
                        if (var609 == 6117) {
                            field5339[var2++] = class101.field1366 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6118) {
                            field5339[var2++] = class23.field409;
                            continue;
                        }
                        if (var609 == 6119) {
                            field5339[var2++] = class407.field6101;
                            continue;
                        }
                        if (var609 == 6120) {
                            field5339[var2++] = class358.field5243;
                            continue;
                        }
                        if (var609 == 6121) {
                            field5339[var2++] = class35.field574.method2147() ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6123) {
                            field5339[var2++] = class135.method909(-105);
                            continue;
                        }
                        if (var609 == 6124) {
                            field5339[var2++] = class292.field4222;
                            continue;
                        }
                        if (var609 == 6125) {
                            field5339[var2++] = class445.field6478;
                            continue;
                        }
                        if (var609 == 6126) {
                            field5339[var2++] = class35.field574.method2122() ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6127) {
                            field5339[var2++] = class396.field5947 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6128) {
                            field5339[var2++] = class200.field2869 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6129) {
                            field5339[var2++] = class264.field3845;
                            continue;
                        }
                        if (var609 == 6130) {
                            field5339[var2++] = class363.field5313 ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6131) {
                            field5339[var2++] = class265.field3854;
                            continue;
                        }
                        if (var609 == 6132) {
                            field5339[var2++] = class215.field3082;
                            continue;
                        }
                        if (var609 == 6133) {
                            field5339[var2++] = class2.field22 == 1 || class2.field22 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6300) {
                        if (var609 == 6200) {
                            var2 -= 2;
                            class64.field904 = (short) field5339[var2];
                            if (class64.field904 <= 0) {
                                class64.field904 = 256;
                            }
                            class312.field4471 = (short) field5339[var2 + 1];
                            if (class312.field4471 <= 0) {
                                class312.field4471 = 205;
                            }
                            continue;
                        }
                        if (var609 == 6201) {
                            var2 -= 2;
                            class29.field501 = (short) field5339[var2];
                            if (class29.field501 <= 0) {
                                class29.field501 = 256;
                            }
                            class318.field4542 = (short) field5339[var2 + 1];
                            if (class318.field4542 <= 0) {
                                class318.field4542 = 320;
                            }
                            continue;
                        }
                        if (var609 == 6202) {
                            var2 -= 4;
                            class360.field5283 = (short) field5339[var2];
                            if (class360.field5283 <= 0) {
                                class360.field5283 = 1;
                            }
                            class349.field5177 = (short) field5339[var2 + 1];
                            if (class349.field5177 <= 0) {
                                class349.field5177 = 32767;
                            } else if (class349.field5177 < class360.field5283) {
                                class349.field5177 = class360.field5283;
                            }
                            class122.field1627 = (short) field5339[var2 + 2];
                            if (class122.field1627 <= 0) {
                                class122.field1627 = 1;
                            }
                            class392.field5865 = (short) field5339[var2 + 3];
                            if (class392.field5865 <= 0) {
                                class392.field5865 = 32767;
                            } else if (class392.field5865 < class122.field1627) {
                                class392.field5865 = class122.field1627;
                            }
                            continue;
                        }
                        if (var609 == 6203) {
                            class30.method260(class144.field1896.field3604, class144.field1896.field3578, 0, false, 0, 3516);
                            field5339[var2++] = class367.field5460;
                            field5339[var2++] = class27.field485;
                            continue;
                        }
                        if (var609 == 6204) {
                            field5339[var2++] = class29.field501;
                            field5339[var2++] = class318.field4542;
                            continue;
                        }
                        if (var609 == 6205) {
                            field5339[var2++] = class64.field904;
                            field5339[var2++] = class312.field4471;
                            continue;
                        }
                    } else if (var609 < 6400) {
                        if (var609 == 6300) {
                            field5339[var2++] = (int) (class55.method375(-3913) / 60000L);
                            continue;
                        }
                        if (var609 == 6301) {
                            field5339[var2++] = (int) (class55.method375(-3913) / 86400000L) - 11745;
                            continue;
                        }
                        if (var609 == 6302) {
                            var2 -= 3;
                            int var531 = field5339[var2];
                            int var532 = field5339[var2 + 1];
                            int var533 = field5339[var2 + 2];
                            field5348.clear();
                            field5348.set(11, 12);
                            field5348.set(var533, var532, var531);
                            field5339[var2++] = (int) (field5348.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var609 == 6303) {
                            field5348.clear();
                            field5348.setTime(new Date(class55.method375(-3913)));
                            field5339[var2++] = field5348.get(1);
                            continue;
                        }
                        if (var609 == 6304) {
                            var2--;
                            int var534 = field5339[var2];
                            boolean var535 = true;
                            if (var534 < 0) {
                                var535 = (var534 + 1) % 4 == 0;
                            } else if (var534 < 1582) {
                                var535 = var534 % 4 == 0;
                            } else if (var534 % 4 != 0) {
                                var535 = false;
                            } else if (var534 % 100 != 0) {
                                var535 = true;
                            } else if (var534 % 400 != 0) {
                                var535 = false;
                            }
                            field5339[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6500) {
                        if (var609 == 6405) {
                            field5339[var2++] = class103.method696(3) ? 1 : 0;
                            continue;
                        }
                        if (var609 == 6406) {
                            field5339[var2++] = class255.method1610(13026) ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6600) {
                        if (var609 == 6500) {
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0) {
                                field5339[var2++] = class133.method900(109) == -1 ? 0 : 1;
                                continue;
                            }
                            field5339[var2++] = 1;
                            continue;
                        }
                        if (var609 == 6501) {
                            class159 var536 = class321.method1990(true);
                            if (var536 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = 0;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var536.field2088;
                                field5339[var2++] = var536.field3449;
                                field5336[var3++] = var536.field2086;
                                class90 var537 = var536.method1007(20203);
                                field5339[var2++] = var537.field1246;
                                field5336[var3++] = var537.field1244;
                                field5339[var2++] = var536.field3444;
                                field5339[var2++] = var536.field2081;
                            }
                            continue;
                        }
                        if (var609 == 6502) {
                            class159 var538 = class439.method2780(112);
                            if (var538 == null) {
                                field5339[var2++] = -1;
                                field5339[var2++] = 0;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var538.field2088;
                                field5339[var2++] = var538.field3449;
                                field5336[var3++] = var538.field2086;
                                class90 var539 = var538.method1007(20203);
                                field5339[var2++] = var539.field1246;
                                field5336[var3++] = var539.field1244;
                                field5339[var2++] = var538.field3444;
                                field5339[var2++] = var538.field2081;
                            }
                            continue;
                        }
                        if (var609 == 6503) {
                            var2--;
                            int var540 = field5339[var2];
                            if (class137.field1815 == 10 && class384.field5748 == 0 && class88.field1227 == 0 && class239.field3379 == 0) {
                                field5339[var2++] = class332.method2198(var540, 50000) ? 1 : 0;
                                continue;
                            }
                            field5339[var2++] = 0;
                            continue;
                        }
                        if (var609 == 6504) {
                            var2--;
                            class189.field2559 = field5339[var2];
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6505) {
                            field5339[var2++] = class189.field2559;
                            continue;
                        }
                        if (var609 == 6506) {
                            var2--;
                            int var541 = field5339[var2];
                            class159 var542 = class104.method707(var541, (byte) 94);
                            if (var542 == null) {
                                field5339[var2++] = -1;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5336[var3++] = "";
                                field5339[var2++] = 0;
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = var542.field3449;
                                field5336[var3++] = var542.field2086;
                                class90 var543 = var542.method1007(20203);
                                field5339[var2++] = var543.field1246;
                                field5336[var3++] = var543.field1244;
                                field5339[var2++] = var542.field3444;
                                field5339[var2++] = var542.field2081;
                            }
                            continue;
                        }
                        if (var609 == 6507) {
                            var2 -= 4;
                            int var544 = field5339[var2];
                            boolean var545 = field5339[var2 + 1] == 1;
                            int var546 = field5339[var2 + 2];
                            boolean var547 = field5339[var2 + 3] == 1;
                            class174.method1067(var547, var545, var546, var544, (byte) 7);
                            continue;
                        }
                        if (var609 == 6508) {
                            class347.method2312(-23144);
                            continue;
                        }
                        if (var609 == 6509) {
                            if (class137.field1815 == 10) {
                                var2--;
                                if (field5339[var2] == 1) {
                                    if (class344.field5041 == null) {
                                        class344.field5041 = new class100();
                                    }
                                } else if (class344.field5041 != null) {
                                    class344.field5041.method683(-11400);
                                    class344.field5041 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var609 < 6700) {
                        if (var609 == 6600) {
                            var2--;
                            class329.field4714 = field5339[var2] == 1;
                            class423.method2724(class361.field5285, (byte) -7);
                            continue;
                        }
                        if (var609 == 6601) {
                            field5339[var2++] = class329.field4714 ? 1 : 0;
                            continue;
                        }
                    } else if (var609 < 6800 && class24.field427 == 2) {
                        if (var609 == 6700) {
                            int var548 = class269.field3933.method955(17167);
                            if (class404.field6020 != -1) {
                                var548++;
                            }
                            field5339[var2++] = var548;
                            continue;
                        }
                        if (var609 == 6701) {
                            var2--;
                            int var549 = field5339[var2];
                            if (class404.field6020 != -1) {
                                if (var549 == 0) {
                                    field5339[var2++] = class404.field6020;
                                    continue;
                                }
                                var549--;
                            }
                            class158 var550 = (class158) class269.field3933.method953(0);
                            while (var549-- > 0) {
                                var550 = (class158) class269.field3933.method951(0);
                            }
                            field5339[var2++] = var550.field2075;
                            continue;
                        }
                        if (var609 == 6702) {
                            var2--;
                            int var551 = field5339[var2];
                            if (class119.field1607[var551] == null) {
                                field5336[var3++] = "";
                            } else {
                                String var552 = class119.field1607[var551][0].field3640;
                                if (var552 == null) {
                                    field5336[var3++] = "";
                                } else {
                                    field5336[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var609 == 6703) {
                            var2--;
                            int var553 = field5339[var2];
                            if (class119.field1607[var553] == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = class119.field1607[var553].length;
                            }
                            continue;
                        }
                        if (var609 == 6704) {
                            var2 -= 2;
                            int var554 = field5339[var2];
                            int var555 = field5339[var2 + 1];
                            if (class119.field1607[var554] == null) {
                                field5336[var3++] = "";
                            } else {
                                String var556 = class119.field1607[var554][var555].field3640;
                                if (var556 == null) {
                                    field5336[var3++] = "";
                                } else {
                                    field5336[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var609 == 6705) {
                            var2 -= 2;
                            int var557 = field5339[var2];
                            int var558 = field5339[var2 + 1];
                            if (class119.field1607[var557] == null) {
                                field5339[var2++] = 0;
                            } else {
                                field5339[var2++] = class119.field1607[var557][var558].field3507;
                            }
                            continue;
                        }
                        if (var609 == 6706) {
                            continue;
                        }
                        if (var609 == 6707) {
                            var2 -= 3;
                            int var559 = field5339[var2];
                            int var560 = field5339[var2 + 1];
                            int var561 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var559 << 16 | var560, 1, var561);
                            continue;
                        }
                        if (var609 == 6708) {
                            var2 -= 3;
                            int var562 = field5339[var2];
                            int var563 = field5339[var2 + 1];
                            int var564 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var562 << 16 | var563, 2, var564);
                            continue;
                        }
                        if (var609 == 6709) {
                            var2 -= 3;
                            int var565 = field5339[var2];
                            int var566 = field5339[var2 + 1];
                            int var567 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var565 << 16 | var566, 3, var567);
                            continue;
                        }
                        if (var609 == 6710) {
                            var2 -= 3;
                            int var568 = field5339[var2];
                            int var569 = field5339[var2 + 1];
                            int var570 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var568 << 16 | var569, 4, var570);
                            continue;
                        }
                        if (var609 == 6711) {
                            var2 -= 3;
                            int var571 = field5339[var2];
                            int var572 = field5339[var2 + 1];
                            int var573 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var571 << 16 | var572, 5, var573);
                            continue;
                        }
                        if (var609 == 6712) {
                            var2 -= 3;
                            int var574 = field5339[var2];
                            int var575 = field5339[var2 + 1];
                            int var576 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var574 << 16 | var575, 6, var576);
                            continue;
                        }
                        if (var609 == 6713) {
                            var2 -= 3;
                            int var577 = field5339[var2];
                            int var578 = field5339[var2 + 1];
                            int var579 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var577 << 16 | var578, 7, var579);
                            continue;
                        }
                        if (var609 == 6714) {
                            var2 -= 3;
                            int var580 = field5339[var2];
                            int var581 = field5339[var2 + 1];
                            int var582 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var580 << 16 | var581, 8, var582);
                            continue;
                        }
                        if (var609 == 6715) {
                            var2 -= 3;
                            int var583 = field5339[var2];
                            int var584 = field5339[var2 + 1];
                            int var585 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var583 << 16 | var584, 9, var585);
                            continue;
                        }
                        if (var609 == 6716) {
                            var2 -= 3;
                            int var586 = field5339[var2];
                            int var587 = field5339[var2 + 1];
                            int var588 = field5339[var2 + 2];
                            class434.method2755((byte) 31, "", var586 << 16 | var587, 10, var588);
                            continue;
                        }
                        if (var609 == 6717) {
                            var2 -= 3;
                            int var589 = field5339[var2];
                            int var590 = field5339[var2 + 1];
                            int var591 = field5339[var2 + 2];
                            class249 var592 = class358.method2355(var591, var589 << 16 | var590, (byte) -118);
                            class312.method1951(2878);
                            class185 var593 = client.method1572(var592);
                            class273.method1748(var593.field2515, var592.field3541, var591, false, var592.field3470, var593.method1149((byte) 94), var589 << 16 | var590);
                            continue;
                        }
                    } else if (var609 < 6900) {
                        if (var609 == 6800) {
                            var2--;
                            int var594 = field5339[var2];
                            class80 var595 = class27.method248(var594, (byte) 1);
                            if (var595.field1092 == null) {
                                field5336[var3++] = "";
                            } else {
                                field5336[var3++] = var595.field1092;
                            }
                            continue;
                        }
                        if (var609 == 6801) {
                            var2--;
                            int var596 = field5339[var2];
                            class80 var597 = class27.method248(var596, (byte) 1);
                            field5339[var2++] = var597.field1123;
                            continue;
                        }
                        if (var609 == 6802) {
                            var2--;
                            int var598 = field5339[var2];
                            class80 var599 = class27.method248(var598, (byte) 1);
                            field5339[var2++] = var599.field1113;
                            continue;
                        }
                        if (var609 == 6803) {
                            var2--;
                            int var600 = field5339[var2];
                            class80 var601 = class27.method248(var600, (byte) 1);
                            field5339[var2++] = var601.field1119;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var608) {
            if (arg0.field5736 == null) {
                StringBuffer var606 = new StringBuffer(30);
                var606.append("CS2: ").append(arg0.field5903).append(" ");
                for (int var607 = field5337 - 1; var607 >= 0; var607--) {
                    var606.append("v: ").append(field5347[var607].field1211.field5903).append(" ");
                }
                var606.append("op: ").append(var7);
                class226.method1406(var606.toString(), var608, 0);
            } else {
                class135.method908("Clientscript error in: " + arg0.field5736, (byte) 53);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field5736).append("\n");
                for (int var604 = field5337 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field5347[var604].field1211.field5736).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var608.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class226.method1406(var603.toString(), var608, 0);
                class319.method1979(-80, var603.toString());
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lic;I)V", line = 6900)
    private static final void method2394(class228 arg0, int arg1) {
        Object[] var2 = arg0.field3215;
        int var3 = (Integer) var2[0];
        class384 var4 = class231.method1427(-25652, var3);
        if (var4 == null) {
            return;
        }
        field5334 = new int[var4.field5745];
        int var5 = 0;
        field5330 = new String[var4.field5746];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3213;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3219;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3210 == null ? -1 : arg0.field3210.field3622;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3209;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3210 == null ? -1 : arg0.field3210.field3517;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3214 == null ? -1 : arg0.field3214.field3622;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3214 == null ? -1 : arg0.field3214.field3517;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3226;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3217;
                }
                field5334[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3211;
                }
                field5330[var6++] = var9;
            }
        }
        method2393(var4, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lic;)V", line = 6977)
    public static final void method2395(class228 arg0) {
        method2394(arg0, 200000);
    }
}
