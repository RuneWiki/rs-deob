import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class293 {

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[Lba;")
    private static class123[] field4415 = new class123[50];

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "[[I")
    private static int[][] field4418 = new int[5][5000];

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "[I")
    private static int[] field4428 = new int[1000];

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "[I")
    private static int[] field4430 = new int[5];

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    private static int field4433 = 0;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field4432 = new String[1000];

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4413 = Calendar.getInstance();

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "[I")
    private static int[] field4435 = new int[3];

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field4434 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "Luc;")
    public static class51 field4436 = new class51(4);

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lsj;")
    private static class248 field4411;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "Lsj;")
    private static class248 field4426;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lbg;")
    private static class84 field4416;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "[I")
    private static int[] field4423;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field4417;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public static final void method1985(int arg0, int arg1, int arg2) {
        class335 var3 = class453.method2818(true, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field4423 = new int[var3.field4963];
        field4417 = new String[var3.field4966];
        if (var3.field4973 == 15 || var3.field4973 == 17 || var3.field4973 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class123.field1585 != null) {
                var4 = class123.field1585.field3503;
                var5 = class123.field1585.field3507;
            }
            field4423[0] = class277.field4060 - var4;
            field4423[1] = class217.field3032 - var5;
        }
        method1987(var3, 200000);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
    public static void method1986() {
        field4423 = null;
        field4417 = null;
        field4430 = null;
        field4418 = null;
        field4428 = null;
        field4432 = null;
        field4415 = null;
        field4426 = null;
        field4411 = null;
        field4416 = null;
        field4413 = null;
        field4434 = null;
        field4435 = null;
        field4436 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lqg;I)V")
    private static final void method1987(class335 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field4969;
        int[] var6 = arg0.field4964;
        byte var7 = -1;
        field4433 = 0;
        try {
            int var8 = 0;
            label4411: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var607 = var5[var4];
                if (var607 < 100) {
                    if (var607 == 0) {
                        field4428[var2++] = var6[var4];
                        continue;
                    }
                    if (var607 == 1) {
                        int var9 = var6[var4];
                        field4428[var2++] = class100.field1325[var9];
                        continue;
                    }
                    if (var607 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class359.method2358(field4428[var2], -1, var10);
                        continue;
                    }
                    if (var607 == 3) {
                        field4432[var3++] = arg0.field4960[var4];
                        continue;
                    }
                    if (var607 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var607 == 7) {
                        var2 -= 2;
                        if (field4428[var2 + 1] != field4428[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 8) {
                        var2 -= 2;
                        if (field4428[var2 + 1] == field4428[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 9) {
                        var2 -= 2;
                        if (field4428[var2] < field4428[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 10) {
                        var2 -= 2;
                        if (field4428[var2] > field4428[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 21) {
                        if (field4433 == 0) {
                            return;
                        }
                        class123 var11 = field4415[--field4433];
                        arg0 = var11.field1595;
                        var5 = arg0.field4969;
                        var6 = arg0.field4964;
                        var4 = var11.field1594;
                        field4423 = var11.field1591;
                        field4417 = var11.field1587;
                        continue;
                    }
                    if (var607 == 25) {
                        int var12 = var6[var4];
                        field4428[var2++] = class69.method578(var12, 15967);
                        continue;
                    }
                    if (var607 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class193.method1286(-92, field4428[var2], var13);
                        continue;
                    }
                    if (var607 == 31) {
                        var2 -= 2;
                        if (field4428[var2] <= field4428[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 32) {
                        var2 -= 2;
                        if (field4428[var2] >= field4428[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 33) {
                        field4428[var2++] = field4423[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var607 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field4423[var10001] = field4428[var2];
                        continue;
                    }
                    if (var607 == 35) {
                        field4432[var3++] = field4417[var6[var4]];
                        continue;
                    }
                    if (var607 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field4417[var10001] = field4432[var3];
                        continue;
                    }
                    if (var607 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class211.method1382(-1, var14, field4432, var3);
                        field4432[var3++] = var15;
                        continue;
                    }
                    if (var607 == 38) {
                        var2--;
                        continue;
                    }
                    if (var607 == 39) {
                        var3--;
                        continue;
                    }
                    if (var607 == 40) {
                        int var16 = var6[var4];
                        class335 var17 = class271.method1799(0, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field4963];
                        String[] var19 = new String[var17.field4966];
                        for (int var20 = 0; var20 < var17.field4967; var20++) {
                            var18[var20] = field4428[var2 + var20 - var17.field4967];
                        }
                        for (int var21 = 0; var21 < var17.field4970; var21++) {
                            var19[var21] = field4432[var3 + var21 - var17.field4970];
                        }
                        var2 -= var17.field4967;
                        var3 -= var17.field4970;
                        class123 var22 = new class123();
                        var22.field1595 = arg0;
                        var22.field1594 = var4;
                        var22.field1591 = field4423;
                        var22.field1587 = field4417;
                        if (field4433 >= field4415.length) {
                            throw new RuntimeException();
                        }
                        field4415[field4433++] = var22;
                        arg0 = var17;
                        var5 = var17.field4969;
                        var6 = var17.field4964;
                        var4 = -1;
                        field4423 = var18;
                        field4417 = var19;
                        continue;
                    }
                    if (var607 == 42) {
                        field4428[var2++] = class216.field3014[var6[var4]];
                        continue;
                    }
                    if (var607 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class216.field3014[var23] = field4428[var2];
                        class140.method977(56, var23);
                        class320.field4757 |= class28.field476[var23];
                        continue;
                    }
                    if (var607 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field4428[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field4430[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4411;
                                }
                                field4418[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field4428[var2];
                        if (var30 >= 0 && var30 < field4430[var29]) {
                            field4428[var2++] = field4418[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field4428[var2];
                        if (var32 >= 0 && var32 < field4430[var31]) {
                            field4418[var31][var32] = field4428[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 47) {
                        String var33 = class178.field2391[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field4432[var3++] = var33;
                        continue;
                    }
                    if (var607 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class178.field2391[var34] = field4432[var3];
                        class142.method984(-126, var34);
                        continue;
                    }
                    if (var607 == 51) {
                        class453 var35 = arg0.field4974[var6[var4]];
                        var2--;
                        class17 var36 = (class17) var35.method2826(false, (long) field4428[var2]);
                        if (var36 != null) {
                            var4 += var36.field274;
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
                if (var607 < 300) {
                    if (var607 == 100) {
                        var2 -= 3;
                        int var38 = field4428[var2];
                        int var39 = field4428[var2 + 1];
                        int var40 = field4428[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class248 var41 = class27.method224(65535, var38);
                        if (var41.field3528 == null) {
                            var41.field3528 = new class248[var40 + 1];
                        }
                        if (var41.field3528.length <= var40) {
                            class248[] var42 = new class248[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3528.length; var43++) {
                                var42[var43] = var41.field3528[var43];
                            }
                            var41.field3528 = var42;
                        }
                        if (var40 > 0 && var41.field3528[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class248 var44 = new class248();
                        var44.field3555 = var39;
                        var44.field3584 = var44.field3636 = var41.field3636;
                        var44.field3505 = var40;
                        var44.field3537 = true;
                        var41.field3528[var40] = var44;
                        if (var37) {
                            field4411 = var44;
                        } else {
                            field4426 = var44;
                        }
                        class92.method744(20491, var41);
                        continue;
                    }
                    if (var607 == 101) {
                        class248 var45 = var37 ? field4411 : field4426;
                        if (var45.field3505 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class248 var46 = class27.method224(65535, var45.field3636);
                        var46.field3528[var45.field3505] = null;
                        class92.method744(20491, var46);
                        continue;
                    }
                    if (var607 == 102) {
                        var2--;
                        class248 var47 = class27.method224(65535, field4428[var2]);
                        var47.field3528 = null;
                        class92.method744(20491, var47);
                        continue;
                    }
                    if (var607 == 200) {
                        var2 -= 2;
                        int var48 = field4428[var2];
                        int var49 = field4428[var2 + 1];
                        class248 var50 = class416.method2626(211655864, var48, var49);
                        if (var50 != null && var49 != -1) {
                            field4428[var2++] = 1;
                            if (var37) {
                                field4411 = var50;
                            } else {
                                field4426 = var50;
                            }
                            continue;
                        }
                        field4428[var2++] = 0;
                        continue;
                    }
                    if (var607 == 201) {
                        var2--;
                        int var51 = field4428[var2];
                        class248 var52 = class27.method224(65535, var51);
                        if (var52 == null) {
                            field4428[var2++] = 0;
                        } else {
                            field4428[var2++] = 1;
                            if (var37) {
                                field4411 = var52;
                            } else {
                                field4426 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var607 < 500) {
                    if (var607 == 403) {
                        var2 -= 2;
                        int var53 = field4428[var2];
                        int var54 = field4428[var2 + 1];
                        for (int var55 = 0; var55 < class398.field5836.length; var55++) {
                            if (class398.field5836[var55] == var53) {
                                class383.field5609.field4644.method2738(-15802, var55, var54);
                                continue label4411;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class243.field3410.length) {
                                continue label4411;
                            }
                            if (class243.field3410[var56] == var53) {
                                class383.field5609.field4644.method2738(-15802, var56, var54);
                                continue label4411;
                            }
                            var56++;
                        }
                    }
                    if (var607 == 404) {
                        var2 -= 2;
                        int var57 = field4428[var2];
                        int var58 = field4428[var2 + 1];
                        class383.field5609.field4644.method2731(var57, false, var58);
                        continue;
                    }
                    if (var607 == 410) {
                        var2--;
                        boolean var59 = field4428[var2] != 0;
                        class383.field5609.field4644.method2733(var59, 192620016);
                        continue;
                    }
                } else if (var607 >= 1000 && var607 < 1100 || var607 >= 2000 && var607 < 2100) {
                    class248 var60;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var60 = class27.method224(65535, field4428[var2]);
                    } else {
                        var60 = var37 ? field4411 : field4426;
                    }
                    if (var607 == 1000) {
                        var2 -= 4;
                        var60.field3599 = field4428[var2];
                        var60.field3508 = field4428[var2 + 1];
                        int var61 = field4428[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field4428[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3524 = (byte) var61;
                        var60.field3546 = (byte) var62;
                        class92.method744(20491, var60);
                        class397.method2549(var60, (byte) 119);
                        if (var60.field3505 == -1) {
                            class133.method955(var60.field3636, (byte) 48);
                        }
                        continue;
                    }
                    if (var607 == 1001) {
                        var2 -= 4;
                        var60.field3567 = field4428[var2];
                        var60.field3661 = field4428[var2 + 1];
                        var60.field3561 = 0;
                        var60.field3553 = 0;
                        int var63 = field4428[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field4428[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3545 = (byte) var63;
                        var60.field3658 = (byte) var64;
                        class92.method744(20491, var60);
                        class397.method2549(var60, (byte) 119);
                        if (var60.field3555 == 0) {
                            class185.method1215(-1, false, var60);
                        }
                        continue;
                    }
                    if (var607 == 1003) {
                        var2--;
                        boolean var65 = field4428[var2] == 1;
                        if (var60.field3605 != var65) {
                            var60.field3605 = var65;
                            class92.method744(20491, var60);
                        }
                        if (var60.field3505 == -1) {
                            class181.method1188(var60.field3636, (byte) -92);
                        }
                        continue;
                    }
                    if (var607 == 1004) {
                        var2 -= 2;
                        var60.field3630 = field4428[var2];
                        var60.field3533 = field4428[var2 + 1];
                        class92.method744(20491, var60);
                        class397.method2549(var60, (byte) 119);
                        if (var60.field3555 == 0) {
                            class185.method1215(-1, false, var60);
                        }
                        continue;
                    }
                    if (var607 == 1005) {
                        var2--;
                        var60.field3617 = field4428[var2] == 1;
                        continue;
                    }
                } else if (var607 >= 1100 && var607 < 1200 || var607 >= 2100 && var607 < 2200) {
                    class248 var66;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var66 = class27.method224(65535, field4428[var2]);
                    } else {
                        var66 = var37 ? field4411 : field4426;
                    }
                    if (var607 == 1100) {
                        var2 -= 2;
                        var66.field3559 = field4428[var2];
                        if (var66.field3559 > var66.field3591 - var66.field3531) {
                            var66.field3559 = var66.field3591 - var66.field3531;
                        }
                        if (var66.field3559 < 0) {
                            var66.field3559 = 0;
                        }
                        var66.field3499 = field4428[var2 + 1];
                        if (var66.field3499 > var66.field3568 - var66.field3564) {
                            var66.field3499 = var66.field3568 - var66.field3564;
                        }
                        if (var66.field3499 < 0) {
                            var66.field3499 = 0;
                        }
                        class92.method744(20491, var66);
                        if (var66.field3505 == -1) {
                            class228.method1488(-120, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1101) {
                        var2--;
                        var66.field3483 = field4428[var2];
                        class92.method744(20491, var66);
                        if (var66.field3505 == -1) {
                            class169.method1129((byte) -86, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1102) {
                        var2--;
                        var66.field3656 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1103) {
                        var2--;
                        var66.field3632 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1104) {
                        var2--;
                        var66.field3487 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1105) {
                        var2--;
                        int var67 = field4428[var2];
                        if (var66.field3668 != var67) {
                            var66.field3668 = var67;
                            class92.method744(20491, var66);
                        }
                        if (var66.field3505 == -1) {
                            class406.method2573(-79, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1106) {
                        var2--;
                        var66.field3530 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1107) {
                        var2--;
                        var66.field3552 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1108) {
                        var66.field3535 = 1;
                        var2--;
                        var66.field3638 = field4428[var2];
                        class92.method744(20491, var66);
                        if (var66.field3505 == -1) {
                            class142.method987((byte) 89, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1109) {
                        var2 -= 6;
                        var66.field3579 = field4428[var2];
                        var66.field3652 = field4428[var2 + 1];
                        var66.field3607 = field4428[var2 + 2];
                        var66.field3548 = field4428[var2 + 3];
                        var66.field3621 = field4428[var2 + 4];
                        var66.field3523 = field4428[var2 + 5];
                        class92.method744(20491, var66);
                        if (var66.field3505 == -1) {
                            class133.method954(var66.field3636, true);
                            class149.method1027(98, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1110) {
                        var2--;
                        int var68 = field4428[var2];
                        if (var66.field3600 != var68) {
                            var66.field3600 = var68;
                            var66.field3622 = 0;
                            var66.field3606 = 1;
                            var66.field3662 = 0;
                            class92.method744(20491, var66);
                        }
                        if (var66.field3505 == -1) {
                            class223.method1456(var66.field3636, -13734);
                        }
                        continue;
                    }
                    if (var607 == 1111) {
                        var2--;
                        var66.field3484 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1112) {
                        var3--;
                        String var69 = field4432[var3];
                        if (!var69.equals(var66.field3588)) {
                            var66.field3588 = var69;
                            class92.method744(20491, var66);
                        }
                        if (var66.field3505 == -1) {
                            class333.method2176((byte) 117, var66.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1113) {
                        var2--;
                        var66.field3514 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1114) {
                        var2 -= 3;
                        var66.field3659 = field4428[var2];
                        var66.field3560 = field4428[var2 + 1];
                        var66.field3644 = field4428[var2 + 2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1115) {
                        var2--;
                        var66.field3569 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1116) {
                        var2--;
                        var66.field3542 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1117) {
                        var2--;
                        var66.field3587 = field4428[var2];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1118) {
                        var2--;
                        var66.field3525 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1119) {
                        var2--;
                        var66.field3581 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1120) {
                        var2 -= 2;
                        var66.field3591 = field4428[var2];
                        var66.field3568 = field4428[var2 + 1];
                        class92.method744(20491, var66);
                        if (var66.field3555 == 0) {
                            class185.method1215(-1, false, var66);
                        }
                        continue;
                    }
                    if (var607 == 1121) {
                        var2 -= 2;
                        var66.field3601 = (short) field4428[var2];
                        var66.field3520 = (short) field4428[var2 + 1];
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1122) {
                        var2--;
                        var66.field3631 = field4428[var2] == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1123) {
                        var2--;
                        var66.field3523 = field4428[var2];
                        class92.method744(20491, var66);
                        if (var66.field3505 == -1) {
                            class133.method954(var66.field3636, true);
                        }
                        continue;
                    }
                    if (var607 == 1124) {
                        var2--;
                        int var70 = field4428[var2];
                        var66.field3556 = var70 == 1;
                        class92.method744(20491, var66);
                        continue;
                    }
                    if (var607 == 1125) {
                        var2 -= 2;
                        var66.field3669 = field4428[var2];
                        var66.field3510 = field4428[var2 + 1];
                        class92.method744(20491, var66);
                        continue;
                    }
                } else if (!(var607 < 1200 || var607 >= 1300) || !(var607 < 2200 || var607 >= 2300)) {
                    class248 var71;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var71 = class27.method224(65535, field4428[var2]);
                    } else {
                        var71 = var37 ? field4411 : field4426;
                    }
                    class92.method744(20491, var71);
                    if (var607 == 1200 || var607 == 1205 || var607 == 1208 || var607 == 1209 || var607 == 1212 || var607 == 1213) {
                        var2 -= 2;
                        int var72 = field4428[var2];
                        int var73 = field4428[var2 + 1];
                        if (var71.field3505 == -1) {
                            class78.method620(30000, var71.field3636);
                            class133.method954(var71.field3636, true);
                            class149.method1027(109, var71.field3636);
                        }
                        if (var72 == -1) {
                            var71.field3535 = 1;
                            var71.field3638 = -1;
                            var71.field3494 = -1;
                            continue;
                        }
                        var71.field3494 = var72;
                        var71.field3538 = var73;
                        if (var607 == 1208 || var607 == 1209) {
                            var71.field3609 = true;
                        } else {
                            var71.field3609 = false;
                        }
                        class159 var74 = class129.method915(126, var72);
                        var71.field3607 = var74.field2011;
                        var71.field3548 = var74.field2074;
                        var71.field3621 = var74.field2013;
                        var71.field3579 = var74.field2020;
                        var71.field3652 = var74.field2023;
                        var71.field3523 = var74.field2056;
                        if (var607 == 1205 || var607 == 1209) {
                            var71.field3608 = 0;
                        } else if (var607 == 1212 || var607 == 1213) {
                            var71.field3608 = 1;
                        } else {
                            var71.field3608 = 2;
                        }
                        if (var71.field3561 > 0) {
                            var71.field3523 = var71.field3523 * 32 / var71.field3561;
                        } else if (var71.field3567 > 0) {
                            var71.field3523 = var71.field3523 * 32 / var71.field3567;
                        }
                        continue;
                    }
                    if (var607 == 1201) {
                        var71.field3535 = 2;
                        var2--;
                        var71.field3638 = field4428[var2];
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 119, var71.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1202) {
                        var71.field3535 = 3;
                        var71.field3638 = -1;
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 106, var71.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1203) {
                        var71.field3535 = 6;
                        var2--;
                        var71.field3638 = field4428[var2];
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 109, var71.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1204) {
                        var71.field3535 = 5;
                        var2--;
                        var71.field3638 = field4428[var2];
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 125, var71.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1206) {
                        var2 -= 4;
                        var71.field3527 = field4428[var2];
                        var71.field3539 = field4428[var2 + 1];
                        var71.field3515 = field4428[var2 + 2];
                        var71.field3501 = field4428[var2 + 3];
                        class92.method744(20491, var71);
                        continue;
                    }
                    if (var607 == 1207) {
                        var2 -= 2;
                        var71.field3576 = field4428[var2];
                        var71.field3544 = field4428[var2 + 1];
                        class92.method744(20491, var71);
                        continue;
                    }
                    if (var607 == 1210) {
                        var2 -= 4;
                        var71.field3638 = field4428[var2];
                        var71.field3643 = field4428[var2 + 1];
                        if (field4428[var2 + 2] == 1) {
                            var71.field3535 = 9;
                        } else {
                            var71.field3535 = 8;
                        }
                        if (field4428[var2 + 3] == 1) {
                            var71.field3609 = true;
                        } else {
                            var71.field3609 = false;
                        }
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 76, var71.field3636);
                        }
                        continue;
                    }
                    if (var607 == 1211) {
                        var71.field3535 = 5;
                        var71.field3638 = 2047;
                        var71.field3643 = 0;
                        if (var71.field3505 == -1) {
                            class142.method987((byte) 70, var71.field3636);
                        }
                        continue;
                    }
                } else if ((var607 < 1300 || var607 >= 1400) && (var607 < 2300 || var607 >= 2400)) {
                    if (var607 >= 1400 && var607 < 1500 || var607 >= 2400 && var607 < 2500) {
                        class248 var81;
                        if (var607 >= 2000) {
                            var607 -= 1000;
                            var2--;
                            var81 = class27.method224(65535, field4428[var2]);
                        } else {
                            var81 = var37 ? field4411 : field4426;
                        }
                        var3--;
                        String var82 = field4432[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field4428[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field4428[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field4432[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field4428[var2]);
                            }
                        }
                        var2--;
                        int var87 = field4428[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var607 == 1400) {
                            var81.field3550 = var85;
                        } else if (var607 == 1401) {
                            var81.field3626 = var85;
                        } else if (var607 == 1402) {
                            var81.field3629 = var85;
                        } else if (var607 == 1403) {
                            var81.field3657 = var85;
                        } else if (var607 == 1404) {
                            var81.field3603 = var85;
                        } else if (var607 == 1405) {
                            var81.field3489 = var85;
                        } else if (var607 == 1406) {
                            var81.field3639 = var85;
                        } else if (var607 == 1407) {
                            var81.field3482 = var85;
                            var81.field3493 = var83;
                        } else if (var607 == 1408) {
                            var81.field3498 = var85;
                        } else if (var607 == 1409) {
                            var81.field3532 = var85;
                        } else if (var607 == 1410) {
                            var81.field3500 = var85;
                        } else if (var607 == 1411) {
                            var81.field3572 = var85;
                        } else if (var607 == 1412) {
                            var81.field3671 = var85;
                        } else if (var607 == 1414) {
                            var81.field3637 = var85;
                            var81.field3491 = var83;
                        } else if (var607 == 1415) {
                            var81.field3562 = var85;
                            var81.field3593 = var83;
                        } else if (var607 == 1416) {
                            var81.field3509 = var85;
                        } else if (var607 == 1417) {
                            var81.field3653 = var85;
                        } else if (var607 == 1418) {
                            var81.field3647 = var85;
                        } else if (var607 == 1419) {
                            var81.field3635 = var85;
                        } else if (var607 == 1420) {
                            var81.field3518 = var85;
                        } else if (var607 == 1421) {
                            var81.field3620 = var85;
                        } else if (var607 == 1422) {
                            var81.field3504 = var85;
                        } else if (var607 == 1423) {
                            var81.field3663 = var85;
                        } else if (var607 == 1424) {
                            var81.field3497 = var85;
                        } else if (var607 == 1425) {
                            var81.field3570 = var85;
                        } else if (var607 == 1426) {
                            var81.field3554 = var85;
                        } else if (var607 == 1427) {
                            var81.field3648 = var85;
                        } else if (var607 == 1428) {
                            var81.field3589 = var85;
                            var81.field3583 = var83;
                        } else if (var607 == 1429) {
                            var81.field3598 = var85;
                            var81.field3597 = var83;
                        }
                        var81.field3536 = true;
                        continue;
                    }
                    if (var607 < 1600) {
                        class248 var88 = var37 ? field4411 : field4426;
                        if (var607 == 1500) {
                            field4428[var2++] = var88.field3503;
                            continue;
                        }
                        if (var607 == 1501) {
                            field4428[var2++] = var88.field3507;
                            continue;
                        }
                        if (var607 == 1502) {
                            field4428[var2++] = var88.field3531;
                            continue;
                        }
                        if (var607 == 1503) {
                            field4428[var2++] = var88.field3564;
                            continue;
                        }
                        if (var607 == 1504) {
                            field4428[var2++] = var88.field3605 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 1505) {
                            field4428[var2++] = var88.field3584;
                            continue;
                        }
                    } else if (var607 < 1700) {
                        class248 var89 = var37 ? field4411 : field4426;
                        if (var607 == 1600) {
                            field4428[var2++] = var89.field3559;
                            continue;
                        }
                        if (var607 == 1601) {
                            field4428[var2++] = var89.field3499;
                            continue;
                        }
                        if (var607 == 1602) {
                            field4432[var3++] = var89.field3588;
                            continue;
                        }
                        if (var607 == 1603) {
                            field4428[var2++] = var89.field3591;
                            continue;
                        }
                        if (var607 == 1604) {
                            field4428[var2++] = var89.field3568;
                            continue;
                        }
                        if (var607 == 1605) {
                            field4428[var2++] = var89.field3523;
                            continue;
                        }
                        if (var607 == 1606) {
                            field4428[var2++] = var89.field3607;
                            continue;
                        }
                        if (var607 == 1607) {
                            field4428[var2++] = var89.field3621;
                            continue;
                        }
                        if (var607 == 1608) {
                            field4428[var2++] = var89.field3548;
                            continue;
                        }
                        if (var607 == 1609) {
                            field4428[var2++] = var89.field3632;
                            continue;
                        }
                        if (var607 == 1610) {
                            field4428[var2++] = var89.field3579;
                            continue;
                        }
                        if (var607 == 1611) {
                            field4428[var2++] = var89.field3652;
                            continue;
                        }
                        if (var607 == 1612) {
                            field4428[var2++] = var89.field3668;
                            continue;
                        }
                    } else if (var607 < 1800) {
                        class248 var90 = var37 ? field4411 : field4426;
                        if (var607 == 1700) {
                            field4428[var2++] = var90.field3494;
                            continue;
                        }
                        if (var607 == 1701) {
                            if (var90.field3494 == -1) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var90.field3538;
                            }
                            continue;
                        }
                        if (var607 == 1702) {
                            field4428[var2++] = var90.field3505;
                            continue;
                        }
                    } else if (var607 < 1900) {
                        class248 var91 = var37 ? field4411 : field4426;
                        if (var607 == 1800) {
                            field4428[var2++] = client.method402(var91).method1469(-2703);
                            continue;
                        }
                        if (var607 == 1801) {
                            var2--;
                            int var92 = field4428[var2];
                            int var608 = var92 - 1;
                            if (var91.field3486 != null && var608 < var91.field3486.length && var91.field3486[var608] != null) {
                                field4432[var3++] = var91.field3486[var608];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 1802) {
                            if (var91.field3585 == null) {
                                field4432[var3++] = "";
                            } else {
                                field4432[var3++] = var91.field3585;
                            }
                            continue;
                        }
                    } else if (var607 < 2600) {
                        var2--;
                        class248 var93 = class27.method224(65535, field4428[var2]);
                        if (var607 == 2500) {
                            field4428[var2++] = var93.field3503;
                            continue;
                        }
                        if (var607 == 2501) {
                            field4428[var2++] = var93.field3507;
                            continue;
                        }
                        if (var607 == 2502) {
                            field4428[var2++] = var93.field3531;
                            continue;
                        }
                        if (var607 == 2503) {
                            field4428[var2++] = var93.field3564;
                            continue;
                        }
                        if (var607 == 2504) {
                            field4428[var2++] = var93.field3605 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 2505) {
                            field4428[var2++] = var93.field3584;
                            continue;
                        }
                    } else if (var607 < 2700) {
                        var2--;
                        class248 var94 = class27.method224(65535, field4428[var2]);
                        if (var607 == 2600) {
                            field4428[var2++] = var94.field3559;
                            continue;
                        }
                        if (var607 == 2601) {
                            field4428[var2++] = var94.field3499;
                            continue;
                        }
                        if (var607 == 2602) {
                            field4432[var3++] = var94.field3588;
                            continue;
                        }
                        if (var607 == 2603) {
                            field4428[var2++] = var94.field3591;
                            continue;
                        }
                        if (var607 == 2604) {
                            field4428[var2++] = var94.field3568;
                            continue;
                        }
                        if (var607 == 2605) {
                            field4428[var2++] = var94.field3523;
                            continue;
                        }
                        if (var607 == 2606) {
                            field4428[var2++] = var94.field3607;
                            continue;
                        }
                        if (var607 == 2607) {
                            field4428[var2++] = var94.field3621;
                            continue;
                        }
                        if (var607 == 2608) {
                            field4428[var2++] = var94.field3548;
                            continue;
                        }
                        if (var607 == 2609) {
                            field4428[var2++] = var94.field3632;
                            continue;
                        }
                        if (var607 == 2610) {
                            field4428[var2++] = var94.field3579;
                            continue;
                        }
                        if (var607 == 2611) {
                            field4428[var2++] = var94.field3652;
                            continue;
                        }
                        if (var607 == 2612) {
                            field4428[var2++] = var94.field3668;
                            continue;
                        }
                    } else if (var607 < 2800) {
                        if (var607 == 2700) {
                            var2--;
                            class248 var95 = class27.method224(65535, field4428[var2]);
                            field4428[var2++] = var95.field3494;
                            continue;
                        }
                        if (var607 == 2701) {
                            var2--;
                            class248 var96 = class27.method224(65535, field4428[var2]);
                            if (var96.field3494 == -1) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var96.field3538;
                            }
                            continue;
                        }
                        if (var607 == 2702) {
                            var2--;
                            int var97 = field4428[var2];
                            class28 var98 = (class28) class242.field3402.method2826(false, (long) var97);
                            if (var98 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = 1;
                            }
                            continue;
                        }
                        if (var607 == 2703) {
                            var2--;
                            class248 var99 = class27.method224(65535, field4428[var2]);
                            if (var99.field3528 == null) {
                                field4428[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field3528.length;
                            for (int var101 = 0; var101 < var99.field3528.length; var101++) {
                                if (var99.field3528[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field4428[var2++] = var100;
                            continue;
                        }
                        if (var607 == 2704 || var607 == 2705) {
                            var2 -= 2;
                            int var102 = field4428[var2];
                            int var103 = field4428[var2 + 1];
                            class28 var104 = (class28) class242.field3402.method2826(false, (long) var102);
                            if (var104 != null && var104.field482 == var103) {
                                field4428[var2++] = 1;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                    } else if (var607 < 2900) {
                        var2--;
                        class248 var105 = class27.method224(65535, field4428[var2]);
                        if (var607 == 2800) {
                            field4428[var2++] = client.method402(var105).method1469(-2703);
                            continue;
                        }
                        if (var607 == 2801) {
                            var2--;
                            int var106 = field4428[var2];
                            int var609 = var106 - 1;
                            if (var105.field3486 != null && var609 < var105.field3486.length && var105.field3486[var609] != null) {
                                field4432[var3++] = var105.field3486[var609];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 2802) {
                            if (var105.field3585 == null) {
                                field4432[var3++] = "";
                            } else {
                                field4432[var3++] = var105.field3585;
                            }
                            continue;
                        }
                    } else if (var607 < 3200) {
                        if (var607 == 3100) {
                            var3--;
                            String var107 = field4432[var3];
                            class295.method1996(var107, (byte) -62);
                            continue;
                        }
                        if (var607 == 3101) {
                            var2 -= 2;
                            class185.method1204(field4428[var2 + 1], class383.field5609, (byte) 114, field4428[var2]);
                            continue;
                        }
                        if (var607 == 3103) {
                            class452.method2810((byte) 91, true);
                            continue;
                        }
                        if (var607 == 3104) {
                            var3--;
                            String var108 = field4432[var3];
                            int var109 = 0;
                            if (class15.method119(62, var108)) {
                                var109 = class212.method1392(true, var108);
                            }
                            field4412++;
                            class140.field1797.method1833(-20379, 232);
                            class140.field1797.method2240((byte) -88, var109);
                            continue;
                        }
                        if (var607 == 3105) {
                            var3--;
                            String var110 = field4432[var3];
                            field4419++;
                            class140.field1797.method1833(-20379, 26);
                            class140.field1797.method2204(var110.length() + 1, 8);
                            class140.field1797.method2214(var110, -97);
                            continue;
                        }
                        if (var607 == 3106) {
                            var3--;
                            String var111 = field4432[var3];
                            field4425++;
                            class140.field1797.method1833(-20379, 37);
                            class140.field1797.method2204(var111.length() + 1, 8);
                            class140.field1797.method2214(var111, -54);
                            continue;
                        }
                        if (var607 == 3107) {
                            var2--;
                            int var112 = field4428[var2];
                            var3--;
                            String var113 = field4432[var3];
                            class199.method1312(var113, var112, -1);
                            continue;
                        }
                        if (var607 == 3108) {
                            var2 -= 3;
                            int var114 = field4428[var2];
                            int var115 = field4428[var2 + 1];
                            int var116 = field4428[var2 + 2];
                            class248 var117 = class27.method224(65535, var116);
                            class429.method2676((byte) -128, var117, var114, var115);
                            continue;
                        }
                        if (var607 == 3109) {
                            var2 -= 2;
                            int var118 = field4428[var2];
                            int var119 = field4428[var2 + 1];
                            class248 var120 = var37 ? field4411 : field4426;
                            class429.method2676((byte) -127, var120, var118, var119);
                            continue;
                        }
                        if (var607 == 3110) {
                            var2--;
                            int var121 = field4428[var2];
                            field4422++;
                            class140.field1797.method1833(-20379, 141);
                            class140.field1797.method2250(false, var121);
                            continue;
                        }
                        if (var607 == 3111) {
                            var2 -= 2;
                            int var122 = field4428[var2];
                            int var123 = field4428[var2 + 1];
                            class28 var124 = (class28) class242.field3402.method2826(false, (long) var122);
                            if (var124 != null) {
                                class93.method751(var124, var124.field482 != var123, (byte) -97, true);
                            }
                            class297.method2011(true, 3, var122, (byte) -120, var123);
                            continue;
                        }
                        if (var607 == 3112) {
                            var2--;
                            int var125 = field4428[var2];
                            class28 var126 = (class28) class242.field3402.method2826(false, (long) var125);
                            if (var126 != null && var126.field483 == 3) {
                                class93.method751(var126, true, (byte) -61, true);
                            }
                            continue;
                        }
                    } else if (var607 < 3300) {
                        if (var607 == 3200) {
                            var2 -= 3;
                            class230.method1494(255, field4428[var2], field4428[var2 + 1], true, field4428[var2 + 2]);
                            continue;
                        }
                        if (var607 == 3201) {
                            var2--;
                            class138.method968(255, field4428[var2], (byte) 61);
                            continue;
                        }
                        if (var607 == 3202) {
                            var2 -= 2;
                            class211.method1380(255, field4428[var2], -1, field4428[var2 + 1]);
                            continue;
                        }
                    } else if (var607 < 3400) {
                        if (var607 == 3300) {
                            field4428[var2++] = class231.field3179;
                            continue;
                        }
                        if (var607 == 3301) {
                            var2 -= 2;
                            int var127 = field4428[var2];
                            int var128 = field4428[var2 + 1];
                            field4428[var2++] = class450.method2778(var127, (byte) 72, var128);
                            continue;
                        }
                        if (var607 == 3302) {
                            var2 -= 2;
                            int var129 = field4428[var2];
                            int var130 = field4428[var2 + 1];
                            field4428[var2++] = class279.method1830((byte) 27, var130, var129);
                            continue;
                        }
                        if (var607 == 3303) {
                            var2 -= 2;
                            int var131 = field4428[var2];
                            int var132 = field4428[var2 + 1];
                            field4428[var2++] = class354.method2331(var131, 141, var132);
                            continue;
                        }
                        if (var607 == 3304) {
                            var2--;
                            int var133 = field4428[var2];
                            field4428[var2++] = class338.method2201(var133, 86).field5467;
                            continue;
                        }
                        if (var607 == 3305) {
                            var2--;
                            int var134 = field4428[var2];
                            field4428[var2++] = class337.field4977[var134];
                            continue;
                        }
                        if (var607 == 3306) {
                            var2--;
                            int var135 = field4428[var2];
                            field4428[var2++] = class60.field922[var135];
                            continue;
                        }
                        if (var607 == 3307) {
                            var2--;
                            int var136 = field4428[var2];
                            field4428[var2++] = class100.field1324[var136];
                            continue;
                        }
                        if (var607 == 3308) {
                            int var137 = class268.field3973;
                            int var138 = (class383.field5609.field5921 >> 7) + class236.field3292;
                            int var139 = (class383.field5609.field5930 >> 7) + class90.field1223;
                            field4428[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var607 == 3309) {
                            var2--;
                            int var140 = field4428[var2];
                            field4428[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3310) {
                            var2--;
                            int var141 = field4428[var2];
                            field4428[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var607 == 3311) {
                            var2--;
                            int var142 = field4428[var2];
                            field4428[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3312) {
                            field4428[var2++] = class190.field2652 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3313) {
                            var2 -= 2;
                            int var143 = field4428[var2] + 32768;
                            int var144 = field4428[var2 + 1];
                            field4428[var2++] = class450.method2778(var143, (byte) 72, var144);
                            continue;
                        }
                        if (var607 == 3314) {
                            var2 -= 2;
                            int var145 = field4428[var2] + 32768;
                            int var146 = field4428[var2 + 1];
                            field4428[var2++] = class279.method1830((byte) 27, var146, var145);
                            continue;
                        }
                        if (var607 == 3315) {
                            var2 -= 2;
                            int var147 = field4428[var2] + 32768;
                            int var148 = field4428[var2 + 1];
                            field4428[var2++] = class354.method2331(var147, 141, var148);
                            continue;
                        }
                        if (var607 == 3316) {
                            if (class7.field93 >= 2) {
                                field4428[var2++] = class7.field93;
                            } else {
                                field4428[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 3317) {
                            field4428[var2++] = class21.field383;
                            continue;
                        }
                        if (var607 == 3318) {
                            field4428[var2++] = class13.field209;
                            continue;
                        }
                        if (var607 == 3321) {
                            field4428[var2++] = class382.field5593;
                            continue;
                        }
                        if (var607 == 3322) {
                            field4428[var2++] = class257.field3771;
                            continue;
                        }
                        if (var607 == 3323) {
                            if (class352.field5222 >= 5 && class352.field5222 <= 9) {
                                field4428[var2++] = 1;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3324) {
                            if (class352.field5222 >= 5 && class352.field5222 <= 9) {
                                field4428[var2++] = class352.field5222;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3325) {
                            field4428[var2++] = class326.field4828 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3326) {
                            field4428[var2++] = class383.field5609.field4661;
                            continue;
                        }
                        if (var607 == 3327) {
                            field4428[var2++] = class383.field5609.field4644.field6341 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3328) {
                            field4428[var2++] = class181.field2419 && !class379.field5553 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3329) {
                            field4428[var2++] = class406.field5916 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3330) {
                            var2--;
                            int var149 = field4428[var2];
                            field4428[var2++] = class72.method591(118, var149);
                            continue;
                        }
                        if (var607 == 3331) {
                            var2 -= 2;
                            int var150 = field4428[var2];
                            int var151 = field4428[var2 + 1];
                            field4428[var2++] = class435.method2716(false, -55, var151, var150);
                            continue;
                        }
                        if (var607 == 3332) {
                            var2 -= 2;
                            int var152 = field4428[var2];
                            int var153 = field4428[var2 + 1];
                            field4428[var2++] = class435.method2716(true, -34, var153, var152);
                            continue;
                        }
                        if (var607 == 3333) {
                            field4428[var2++] = class247.field3477;
                            continue;
                        }
                        if (var607 == 3335) {
                            field4428[var2++] = class387.field5669;
                            continue;
                        }
                        if (var607 == 3336) {
                            var2 -= 4;
                            int var154 = field4428[var2];
                            int var155 = field4428[var2 + 1];
                            int var156 = field4428[var2 + 2];
                            int var157 = field4428[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field4428[var2++] = var160;
                            continue;
                        }
                        if (var607 == 3337) {
                            field4428[var2++] = class430.field6250;
                            continue;
                        }
                        if (var607 == 3338) {
                            field4428[var2++] = class119.method865(1);
                            continue;
                        }
                    } else if (var607 < 3500) {
                        if (var607 == 3400) {
                            var2 -= 2;
                            int var161 = field4428[var2];
                            int var162 = field4428[var2 + 1];
                            class244 var163 = class93.method752((byte) 22, var161);
                            field4432[var3++] = var163.method1588((byte) 85, var162);
                            continue;
                        }
                        if (var607 == 3408) {
                            var2 -= 4;
                            int var164 = field4428[var2];
                            int var165 = field4428[var2 + 1];
                            int var166 = field4428[var2 + 2];
                            int var167 = field4428[var2 + 3];
                            class244 var168 = class93.method752((byte) 22, var166);
                            if (var168.field3426 == var164 && var168.field3422 == var165) {
                                if (var165 == 115) {
                                    field4432[var3++] = var168.method1588((byte) 85, var167);
                                } else {
                                    field4428[var2++] = var168.method1592(var167, 0);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var607 == 3409) {
                            var2 -= 3;
                            int var169 = field4428[var2];
                            int var170 = field4428[var2 + 1];
                            int var171 = field4428[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class244 var172 = class93.method752((byte) 22, var170);
                            if (var172.field3422 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field4428[var2++] = var172.method1593(123, var171) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3410) {
                            var2--;
                            int var173 = field4428[var2];
                            var3--;
                            String var174 = field4432[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class244 var175 = class93.method752((byte) 22, var173);
                            if (var175.field3422 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field4428[var2++] = var175.method1590(0, var174) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3411) {
                            var2--;
                            int var176 = field4428[var2];
                            class244 var177 = class93.method752((byte) 22, var176);
                            field4428[var2++] = var177.field3425.method2824((byte) 110);
                            continue;
                        }
                    } else if (var607 < 3700) {
                        if (var607 == 3600) {
                            if (class297.field4480 == 0) {
                                field4428[var2++] = -2;
                            } else if (class297.field4480 == 1) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = class391.field5714;
                            }
                            continue;
                        }
                        if (var607 == 3601) {
                            var2--;
                            int var178 = field4428[var2];
                            if (class297.field4480 == 2 && var178 < class391.field5714) {
                                field4432[var3++] = class30.field488[var178];
                                if (class96.field1302[var178] == null) {
                                    field4432[var3++] = "";
                                } else {
                                    field4432[var3++] = class96.field1302[var178];
                                }
                                continue;
                            }
                            field4432[var3++] = "";
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3602) {
                            var2--;
                            int var179 = field4428[var2];
                            if (class297.field4480 == 2 && var179 < class391.field5714) {
                                field4428[var2++] = class362.field5368[var179];
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3603) {
                            var2--;
                            int var180 = field4428[var2];
                            if (class297.field4480 == 2 && var180 < class391.field5714) {
                                field4428[var2++] = class39.field587[var180];
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3604) {
                            var3--;
                            String var181 = field4432[var3];
                            var2--;
                            int var182 = field4428[var2];
                            class53.method383(var181, var182, 115);
                            continue;
                        }
                        if (var607 == 3605) {
                            var3--;
                            String var183 = field4432[var3];
                            class298.method2020(var183, -2717);
                            continue;
                        }
                        if (var607 == 3606) {
                            var3--;
                            String var184 = field4432[var3];
                            class203.method1348(var184, 9241);
                            continue;
                        }
                        if (var607 == 3607) {
                            var3--;
                            String var185 = field4432[var3];
                            class254.method1643(-676617432, var185, false);
                            continue;
                        }
                        if (var607 == 3608) {
                            var3--;
                            String var186 = field4432[var3];
                            class109.method819(var186, (byte) -65);
                            continue;
                        }
                        if (var607 == 3609) {
                            var3--;
                            String var187 = field4432[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field4428[var2++] = class107.method811(var187, 65535) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3610) {
                            var2--;
                            int var188 = field4428[var2];
                            if (class297.field4480 == 2 && var188 < class391.field5714) {
                                field4432[var3++] = class264.field3887[var188];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3611) {
                            if (class8.field114 == null) {
                                field4432[var3++] = "";
                            } else {
                                field4432[var3++] = class222.method1452(-107, class8.field114);
                            }
                            continue;
                        }
                        if (var607 == 3612) {
                            if (class8.field114 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = class402.field5873;
                            }
                            continue;
                        }
                        if (var607 == 3613) {
                            var2--;
                            int var189 = field4428[var2];
                            if (class8.field114 != null && var189 < class402.field5873) {
                                field4432[var3++] = class43.field637[var189].field1007;
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3614) {
                            var2--;
                            int var190 = field4428[var2];
                            if (class8.field114 != null && var190 < class402.field5873) {
                                field4428[var2++] = class43.field637[var190].field1010;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3615) {
                            var2--;
                            int var191 = field4428[var2];
                            if (class8.field114 != null && var191 < class402.field5873) {
                                field4428[var2++] = class43.field637[var191].field998;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3616) {
                            field4428[var2++] = class357.field5293;
                            continue;
                        }
                        if (var607 == 3617) {
                            var3--;
                            String var192 = field4432[var3];
                            class136.method965(-114, var192);
                            continue;
                        }
                        if (var607 == 3618) {
                            field4428[var2++] = class297.field4478;
                            continue;
                        }
                        if (var607 == 3619) {
                            var3--;
                            String var193 = field4432[var3];
                            class337.method2193(var193, (byte) -123);
                            continue;
                        }
                        if (var607 == 3620) {
                            class138.method969(true);
                            continue;
                        }
                        if (var607 == 3621) {
                            if (class297.field4480 == 0) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = class184.field2479;
                            }
                            continue;
                        }
                        if (var607 == 3622) {
                            var2--;
                            int var194 = field4428[var2];
                            if (class297.field4480 != 0 && var194 < class184.field2479) {
                                field4432[var3++] = class373.field5504[var194];
                                if (class335.field4962[var194] == null) {
                                    field4432[var3++] = "";
                                } else {
                                    field4432[var3++] = class335.field4962[var194];
                                }
                                continue;
                            }
                            field4432[var3++] = "";
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3623) {
                            var3--;
                            String var195 = field4432[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field4428[var2++] = class322.method2123(var195, (byte) -94) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3624) {
                            var2--;
                            int var196 = field4428[var2];
                            if (class43.field637 != null && var196 < class402.field5873 && class43.field637[var196].field996.equalsIgnoreCase(class383.field5609.field4650)) {
                                field4428[var2++] = 1;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3625) {
                            if (class57.field859 == null) {
                                field4432[var3++] = "";
                            } else {
                                field4432[var3++] = class57.field859;
                            }
                            continue;
                        }
                        if (var607 == 3626) {
                            var2--;
                            int var197 = field4428[var2];
                            if (class8.field114 != null && var197 < class402.field5873) {
                                field4432[var3++] = class43.field637[var197].field1001;
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3627) {
                            var2--;
                            int var198 = field4428[var2];
                            if (class297.field4480 == 2 && var198 >= 0 && var198 < class391.field5714) {
                                field4428[var2++] = class320.field4759[var198] ? 1 : 0;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3628) {
                            var3--;
                            String var199 = field4432[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field4428[var2++] = class195.method1294(-1, var199);
                            continue;
                        }
                        if (var607 == 3629) {
                            field4428[var2++] = class197.field2716;
                            continue;
                        }
                        if (var607 == 3630) {
                            var3--;
                            String var200 = field4432[var3];
                            class254.method1643(-676617432, var200, true);
                            continue;
                        }
                        if (var607 == 3631) {
                            var2--;
                            int var201 = field4428[var2];
                            field4428[var2++] = class400.field5862[var201] ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3632) {
                            var2--;
                            int var202 = field4428[var2];
                            if (class8.field114 != null && var202 < class402.field5873) {
                                field4432[var3++] = class43.field637[var202].field996;
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 3633) {
                            var2--;
                            int var203 = field4428[var2];
                            if (class297.field4480 != 0 && var203 < class184.field2479) {
                                field4432[var3++] = class7.field89[var203];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                    } else if (var607 < 4000) {
                        if (var607 == 3903) {
                            var2--;
                            int var204 = field4428[var2];
                            field4428[var2++] = class351.field5214[var204].method2677((byte) 113);
                            continue;
                        }
                        if (var607 == 3904) {
                            var2--;
                            int var205 = field4428[var2];
                            field4428[var2++] = class351.field5214[var205].field6228;
                            continue;
                        }
                        if (var607 == 3905) {
                            var2--;
                            int var206 = field4428[var2];
                            field4428[var2++] = class351.field5214[var206].field6230;
                            continue;
                        }
                        if (var607 == 3906) {
                            var2--;
                            int var207 = field4428[var2];
                            field4428[var2++] = class351.field5214[var207].field6238;
                            continue;
                        }
                        if (var607 == 3907) {
                            var2--;
                            int var208 = field4428[var2];
                            field4428[var2++] = class351.field5214[var208].field6235;
                            continue;
                        }
                        if (var607 == 3908) {
                            var2--;
                            int var209 = field4428[var2];
                            field4428[var2++] = class351.field5214[var209].field6241;
                            continue;
                        }
                        if (var607 == 3910) {
                            var2--;
                            int var210 = field4428[var2];
                            int var211 = class351.field5214[var210].method2678(4154);
                            field4428[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3911) {
                            var2--;
                            int var212 = field4428[var2];
                            int var213 = class351.field5214[var212].method2678(4154);
                            field4428[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3912) {
                            var2--;
                            int var214 = field4428[var2];
                            int var215 = class351.field5214[var214].method2678(4154);
                            field4428[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3913) {
                            var2--;
                            int var216 = field4428[var2];
                            int var217 = class351.field5214[var216].method2678(4154);
                            field4428[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 4100) {
                        if (var607 == 4000) {
                            var2 -= 2;
                            int var218 = field4428[var2];
                            int var219 = field4428[var2 + 1];
                            field4428[var2++] = var218 + var219;
                            continue;
                        }
                        if (var607 == 4001) {
                            var2 -= 2;
                            int var220 = field4428[var2];
                            int var221 = field4428[var2 + 1];
                            field4428[var2++] = var220 - var221;
                            continue;
                        }
                        if (var607 == 4002) {
                            var2 -= 2;
                            int var222 = field4428[var2];
                            int var223 = field4428[var2 + 1];
                            field4428[var2++] = var222 * var223;
                            continue;
                        }
                        if (var607 == 4003) {
                            var2 -= 2;
                            int var224 = field4428[var2];
                            int var225 = field4428[var2 + 1];
                            field4428[var2++] = var224 / var225;
                            continue;
                        }
                        if (var607 == 4004) {
                            var2--;
                            int var226 = field4428[var2];
                            field4428[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var607 == 4005) {
                            var2--;
                            int var227 = field4428[var2];
                            field4428[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var607 == 4006) {
                            var2 -= 5;
                            int var228 = field4428[var2];
                            int var229 = field4428[var2 + 1];
                            int var230 = field4428[var2 + 2];
                            int var231 = field4428[var2 + 3];
                            int var232 = field4428[var2 + 4];
                            field4428[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var607 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field4428[var2];
                            long var235 = (long) field4428[var2 + 1];
                            field4428[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var607 == 4008) {
                            var2 -= 2;
                            int var237 = field4428[var2];
                            int var238 = field4428[var2 + 1];
                            field4428[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var607 == 4009) {
                            var2 -= 2;
                            int var239 = field4428[var2];
                            int var240 = field4428[var2 + 1];
                            field4428[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var607 == 4010) {
                            var2 -= 2;
                            int var241 = field4428[var2];
                            int var242 = field4428[var2 + 1];
                            field4428[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 4011) {
                            var2 -= 2;
                            int var243 = field4428[var2];
                            int var244 = field4428[var2 + 1];
                            field4428[var2++] = var243 % var244;
                            continue;
                        }
                        if (var607 == 4012) {
                            var2 -= 2;
                            int var245 = field4428[var2];
                            int var246 = field4428[var2 + 1];
                            if (var245 == 0) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var607 == 4013) {
                            var2 -= 2;
                            int var247 = field4428[var2];
                            int var248 = field4428[var2 + 1];
                            if (var247 == 0) {
                                field4428[var2++] = 0;
                            } else if (var248 == 0) {
                                field4428[var2++] = Integer.MAX_VALUE;
                            } else {
                                field4428[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var607 == 4014) {
                            var2 -= 2;
                            int var249 = field4428[var2];
                            int var250 = field4428[var2 + 1];
                            field4428[var2++] = var249 & var250;
                            continue;
                        }
                        if (var607 == 4015) {
                            var2 -= 2;
                            int var251 = field4428[var2];
                            int var252 = field4428[var2 + 1];
                            field4428[var2++] = var251 | var252;
                            continue;
                        }
                        if (var607 == 4016) {
                            var2 -= 2;
                            int var253 = field4428[var2];
                            int var254 = field4428[var2 + 1];
                            field4428[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var607 == 4017) {
                            var2 -= 2;
                            int var255 = field4428[var2];
                            int var256 = field4428[var2 + 1];
                            field4428[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var607 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field4428[var2];
                            long var259 = (long) field4428[var2 + 1];
                            long var261 = (long) field4428[var2 + 2];
                            field4428[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var607 < 4200) {
                        if (var607 == 4100) {
                            var3--;
                            String var263 = field4432[var3];
                            var2--;
                            int var264 = field4428[var2];
                            field4432[var3++] = var263 + var264;
                            continue;
                        }
                        if (var607 == 4101) {
                            var3 -= 2;
                            String var265 = field4432[var3];
                            String var266 = field4432[var3 + 1];
                            field4432[var3++] = var265 + var266;
                            continue;
                        }
                        if (var607 == 4102) {
                            var3--;
                            String var267 = field4432[var3];
                            var2--;
                            int var268 = field4428[var2];
                            field4432[var3++] = var267 + class415.method2621(var268, (byte) -21, true);
                            continue;
                        }
                        if (var607 == 4103) {
                            var3--;
                            String var269 = field4432[var3];
                            field4432[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var607 == 4104) {
                            var2--;
                            int var270 = field4428[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field4413.setTime(new Date(var271));
                            int var273 = field4413.get(5);
                            int var274 = field4413.get(2);
                            int var275 = field4413.get(1);
                            field4432[var3++] = var273 + "-" + field4434[var274] + "-" + var275;
                            continue;
                        }
                        if (var607 == 4105) {
                            var3 -= 2;
                            String var276 = field4432[var3];
                            String var277 = field4432[var3 + 1];
                            if (class383.field5609.field4644 != null && class383.field5609.field4644.field6341) {
                                field4432[var3++] = var277;
                                continue;
                            }
                            field4432[var3++] = var276;
                            continue;
                        }
                        if (var607 == 4106) {
                            var2--;
                            int var278 = field4428[var2];
                            field4432[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var607 == 4107) {
                            var3 -= 2;
                            field4428[var2++] = class387.method2510(-106, field4432[var3 + 1], class387.field5669, field4432[var3]);
                            continue;
                        }
                        if (var607 == 4108) {
                            var3--;
                            String var279 = field4432[var3];
                            var2 -= 2;
                            int var280 = field4428[var2];
                            int var281 = field4428[var2 + 1];
                            class431 var282 = class290.method1970(var281, 0, -1, class341.field5043);
                            field4428[var2++] = var282.method2694(var280, var279, class109.field1428, -86);
                            continue;
                        }
                        if (var607 == 4109) {
                            var3--;
                            String var283 = field4432[var3];
                            var2 -= 2;
                            int var284 = field4428[var2];
                            int var285 = field4428[var2 + 1];
                            class431 var286 = class290.method1970(var285, 0, -1, class341.field5043);
                            field4428[var2++] = var286.method2700(class109.field1428, (byte) -21, var283, var284);
                            continue;
                        }
                        if (var607 == 4110) {
                            var3 -= 2;
                            String var287 = field4432[var3];
                            String var288 = field4432[var3 + 1];
                            var2--;
                            if (field4428[var2] == 1) {
                                field4432[var3++] = var287;
                            } else {
                                field4432[var3++] = var288;
                            }
                            continue;
                        }
                        if (var607 == 4111) {
                            var3--;
                            String var289 = field4432[var3];
                            field4432[var3++] = class43.method304((byte) 23, var289);
                            continue;
                        }
                        if (var607 == 4112) {
                            var3--;
                            String var290 = field4432[var3];
                            var2--;
                            int var291 = field4428[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field4432[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var607 == 4113) {
                            var2--;
                            int var292 = field4428[var2];
                            field4428[var2++] = class117.method857((char) var292, (byte) -72) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4114) {
                            var2--;
                            int var293 = field4428[var2];
                            field4428[var2++] = class204.method1352(-98, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4115) {
                            var2--;
                            int var294 = field4428[var2];
                            field4428[var2++] = class7.method44(-103, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4116) {
                            var2--;
                            int var295 = field4428[var2];
                            field4428[var2++] = class114.method845(-75, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4117) {
                            var3--;
                            String var296 = field4432[var3];
                            if (var296 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var607 == 4118) {
                            var3--;
                            String var297 = field4432[var3];
                            var2 -= 2;
                            int var298 = field4428[var2];
                            int var299 = field4428[var2 + 1];
                            field4432[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var607 == 4119) {
                            var3--;
                            String var300 = field4432[var3];
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
                            field4432[var3++] = var301.toString();
                            continue;
                        }
                        if (var607 == 4120) {
                            var3--;
                            String var305 = field4432[var3];
                            var2 -= 2;
                            int var306 = field4428[var2];
                            int var307 = field4428[var2 + 1];
                            field4428[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var607 == 4121) {
                            var3 -= 2;
                            String var308 = field4432[var3];
                            String var309 = field4432[var3 + 1];
                            var2--;
                            int var310 = field4428[var2];
                            field4428[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var607 == 4122) {
                            var2--;
                            int var311 = field4428[var2];
                            field4428[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var607 == 4123) {
                            var2--;
                            int var312 = field4428[var2];
                            field4428[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var607 == 4124) {
                            var2--;
                            boolean var313 = field4428[var2] != 0;
                            var2--;
                            int var314 = field4428[var2];
                            field4432[var3++] = class290.method1978((byte) 34, (long) var314, class387.field5669, 0, var313);
                            continue;
                        }
                    } else if (var607 < 4300) {
                        if (var607 == 4200) {
                            var2--;
                            int var315 = field4428[var2];
                            field4432[var3++] = class129.method915(126, var315).field2068;
                            continue;
                        }
                        if (var607 == 4201) {
                            var2 -= 2;
                            int var316 = field4428[var2];
                            int var317 = field4428[var2 + 1];
                            class159 var318 = class129.method915(126, var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field2046[var317 - 1] != null) {
                                field4432[var3++] = var318.field2046[var317 - 1];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 4202) {
                            var2 -= 2;
                            int var319 = field4428[var2];
                            int var320 = field4428[var2 + 1];
                            class159 var321 = class129.method915(127, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field2035[var320 - 1] != null) {
                                field4432[var3++] = var321.field2035[var320 - 1];
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 4203) {
                            var2--;
                            int var322 = field4428[var2];
                            field4428[var2++] = class129.method915(126, var322).field2037;
                            continue;
                        }
                        if (var607 == 4204) {
                            var2--;
                            int var323 = field4428[var2];
                            field4428[var2++] = class129.method915(126, var323).field2000 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4205) {
                            var2--;
                            int var324 = field4428[var2];
                            class159 var325 = class129.method915(127, var324);
                            if (var325.field2062 == -1 && var325.field2070 >= 0) {
                                field4428[var2++] = var325.field2070;
                                continue;
                            }
                            field4428[var2++] = var324;
                            continue;
                        }
                        if (var607 == 4206) {
                            var2--;
                            int var326 = field4428[var2];
                            class159 var327 = class129.method915(127, var326);
                            if (var327.field2062 >= 0 && var327.field2070 >= 0) {
                                field4428[var2++] = var327.field2070;
                                continue;
                            }
                            field4428[var2++] = var326;
                            continue;
                        }
                        if (var607 == 4207) {
                            var2--;
                            int var328 = field4428[var2];
                            field4428[var2++] = class129.method915(127, var328).field2059 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4208) {
                            var2 -= 2;
                            int var329 = field4428[var2];
                            int var330 = field4428[var2 + 1];
                            class154 var331 = class410.method2595(-22867, var330);
                            if (var331.method1039(-116)) {
                                field4432[var3++] = class129.method915(126, var329).method1065(97, var330, var331.field1963);
                            } else {
                                field4428[var2++] = class129.method915(127, var329).method1058(0, var330, var331.field1960);
                            }
                            continue;
                        }
                        if (var607 == 4210) {
                            var3--;
                            String var332 = field4432[var3];
                            var2--;
                            int var333 = field4428[var2];
                            class53.method384(var333 == 1, var332, 124);
                            field4428[var2++] = class47.field711;
                            continue;
                        }
                        if (var607 == 4211) {
                            if (class267.field3960 != null && class290.field4341 < class47.field711) {
                                field4428[var2++] = class267.field3960[class290.field4341++] & 0xFFFF;
                                continue;
                            }
                            field4428[var2++] = -1;
                            continue;
                        }
                        if (var607 == 4212) {
                            class290.field4341 = 0;
                            continue;
                        }
                    } else if (var607 < 4400) {
                        if (var607 == 4300) {
                            var2 -= 2;
                            int var334 = field4428[var2];
                            int var335 = field4428[var2 + 1];
                            class154 var336 = class410.method2595(-22867, var335);
                            if (var336.method1039(-116)) {
                                field4432[var3++] = class43.method309((byte) 2, var334).method1259(var336.field1963, 31234, var335);
                            } else {
                                field4428[var2++] = class43.method309((byte) 2, var334).method1258(-1, var335, var336.field1960);
                            }
                            continue;
                        }
                    } else if (var607 < 4500) {
                        if (var607 == 4400) {
                            var2 -= 2;
                            int var337 = field4428[var2];
                            int var338 = field4428[var2 + 1];
                            class154 var339 = class410.method2595(-22867, var338);
                            if (var339.method1039(-116)) {
                                field4432[var3++] = class372.method2447(var337, (byte) 68).method1388(var339.field1963, var338, 256);
                            } else {
                                field4428[var2++] = class372.method2447(var337, (byte) -10).method1395(var339.field1960, var338, 7025);
                            }
                            continue;
                        }
                    } else if (var607 < 4600) {
                        if (var607 == 4500) {
                            var2 -= 2;
                            int var340 = field4428[var2];
                            int var341 = field4428[var2 + 1];
                            class154 var342 = class410.method2595(-22867, var341);
                            if (var342.method1039(-116)) {
                                field4432[var3++] = class238.method1546(var340, (byte) -20).method528(var341, var342.field1963, 0);
                            } else {
                                field4428[var2++] = class238.method1546(var340, (byte) -20).method531(var342.field1960, var341, -182510783);
                            }
                            continue;
                        }
                    } else if (var607 < 4700) {
                        if (var607 == 4600) {
                            var2--;
                            int var343 = field4428[var2];
                            field4428[var2++] = class163.method1105(true, var343).field4384;
                            continue;
                        }
                    } else if (var607 < 5100) {
                        if (var607 == 5000) {
                            field4428[var2++] = class387.field5666;
                            continue;
                        }
                        if (var607 == 5001) {
                            var2 -= 3;
                            class387.field5666 = field4428[var2];
                            class25.field451 = field4428[var2 + 1];
                            class421.field6115 = field4428[var2 + 2];
                            field4421++;
                            class140.field1797.method1833(-20379, 60);
                            class140.field1797.method2204(class387.field5666, 8);
                            class140.field1797.method2204(class25.field451, 8);
                            class140.field1797.method2204(class421.field6115, 8);
                            continue;
                        }
                        if (var607 == 5002) {
                            var3--;
                            String var344 = field4432[var3];
                            var2 -= 2;
                            int var345 = field4428[var2];
                            int var346 = field4428[var2 + 1];
                            field4427++;
                            class140.field1797.method1833(-20379, 91);
                            class140.field1797.method2204(class9.method61((byte) -117, var344) + 2, 8);
                            class140.field1797.method2214(var344, -111);
                            class140.field1797.method2204(var345 - 1, 8);
                            class140.field1797.method2204(var346, 8);
                            continue;
                        }
                        if (var607 == 5003) {
                            var2--;
                            int var347 = field4428[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class278.field4080[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field4432[var3++] = var348;
                            continue;
                        }
                        if (var607 == 5004) {
                            var2--;
                            int var349 = field4428[var2];
                            int var350 = -1;
                            if (var349 < 100 && class278.field4080[var349] != null) {
                                var350 = class31.field510[var349];
                            }
                            field4428[var2++] = var350;
                            continue;
                        }
                        if (var607 == 5005) {
                            field4428[var2++] = class25.field451;
                            continue;
                        }
                        if (var607 == 5008) {
                            var3--;
                            String var351 = field4432[var3];
                            if (class7.field93 == 0 && (class181.field2419 && !class379.field5553 || class406.field5916)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class264.field3895)) {
                                var353 = 0;
                                var351 = var351.substring(class264.field3895.length());
                            } else if (var352.startsWith(class370.field5464)) {
                                var353 = 1;
                                var351 = var351.substring(class370.field5464.length());
                            } else if (var352.startsWith(class359.field5312)) {
                                var353 = 2;
                                var351 = var351.substring(class359.field5312.length());
                            } else if (var352.startsWith(class77.field1059)) {
                                var353 = 3;
                                var351 = var351.substring(class77.field1059.length());
                            } else if (var352.startsWith(class382.field5605)) {
                                var353 = 4;
                                var351 = var351.substring(class382.field5605.length());
                            } else if (var352.startsWith(class240.field3369)) {
                                var353 = 5;
                                var351 = var351.substring(class240.field3369.length());
                            } else if (var352.startsWith(class359.field5333)) {
                                var353 = 6;
                                var351 = var351.substring(class359.field5333.length());
                            } else if (var352.startsWith(class252.field3693)) {
                                var353 = 7;
                                var351 = var351.substring(class252.field3693.length());
                            } else if (var352.startsWith(class57.field858)) {
                                var353 = 8;
                                var351 = var351.substring(class57.field858.length());
                            } else if (var352.startsWith(class41.field629)) {
                                var353 = 9;
                                var351 = var351.substring(class41.field629.length());
                            } else if (var352.startsWith(class212.field2939)) {
                                var353 = 10;
                                var351 = var351.substring(class212.field2939.length());
                            } else if (var352.startsWith(class350.field5205)) {
                                var353 = 11;
                                var351 = var351.substring(class350.field5205.length());
                            } else if (class387.field5669 != 0) {
                                if (var352.startsWith(class320.field4761)) {
                                    var353 = 0;
                                    var351 = var351.substring(class320.field4761.length());
                                } else if (var352.startsWith(class143.field1810)) {
                                    var353 = 1;
                                    var351 = var351.substring(class143.field1810.length());
                                } else if (var352.startsWith(class255.field3715)) {
                                    var353 = 2;
                                    var351 = var351.substring(class255.field3715.length());
                                } else if (var352.startsWith(class122.field1583)) {
                                    var353 = 3;
                                    var351 = var351.substring(class122.field1583.length());
                                } else if (var352.startsWith(class128.field1667)) {
                                    var353 = 4;
                                    var351 = var351.substring(class128.field1667.length());
                                } else if (var352.startsWith(class110.field1433)) {
                                    var353 = 5;
                                    var351 = var351.substring(class110.field1433.length());
                                } else if (var352.startsWith(class399.field5848)) {
                                    var353 = 6;
                                    var351 = var351.substring(class399.field5848.length());
                                } else if (var352.startsWith(class101.field1327)) {
                                    var353 = 7;
                                    var351 = var351.substring(class101.field1327.length());
                                } else if (var352.startsWith(class249.field3683)) {
                                    var353 = 8;
                                    var351 = var351.substring(class249.field3683.length());
                                } else if (var352.startsWith(class398.field5822)) {
                                    var353 = 9;
                                    var351 = var351.substring(class398.field5822.length());
                                } else if (var352.startsWith(class21.field377)) {
                                    var353 = 10;
                                    var351 = var351.substring(class21.field377.length());
                                } else if (var352.startsWith(class234.field3258)) {
                                    var353 = 11;
                                    var351 = var351.substring(class234.field3258.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class235.field3279)) {
                                var355 = 1;
                                var351 = var351.substring(class235.field3279.length());
                            } else if (var354.startsWith(class372.field5489)) {
                                var355 = 2;
                                var351 = var351.substring(class372.field5489.length());
                            } else if (var354.startsWith(class133.field1737)) {
                                var355 = 3;
                                var351 = var351.substring(class133.field1737.length());
                            } else if (var354.startsWith(class387.field5656)) {
                                var355 = 4;
                                var351 = var351.substring(class387.field5656.length());
                            } else if (var354.startsWith(class289.field4337)) {
                                var355 = 5;
                                var351 = var351.substring(class289.field4337.length());
                            } else if (class387.field5669 != 0) {
                                if (var354.startsWith(class248.field3641)) {
                                    var355 = 1;
                                    var351 = var351.substring(class248.field3641.length());
                                } else if (var354.startsWith(class423.field6161)) {
                                    var355 = 2;
                                    var351 = var351.substring(class423.field6161.length());
                                } else if (var354.startsWith(class190.field2649)) {
                                    var355 = 3;
                                    var351 = var351.substring(class190.field2649.length());
                                } else if (var354.startsWith(class8.field110)) {
                                    var355 = 4;
                                    var351 = var351.substring(class8.field110.length());
                                } else if (var354.startsWith(class431.field6271)) {
                                    var355 = 5;
                                    var351 = var351.substring(class431.field6271.length());
                                }
                            }
                            field4424++;
                            class140.field1797.method1833(-20379, 99);
                            class140.field1797.method2204(0, 8);
                            int var356 = class140.field1797.field5049;
                            class140.field1797.method2204(var353, 8);
                            class140.field1797.method2204(var355, 8);
                            class240.method1554(class140.field1797, -1, var351);
                            class140.field1797.method2251(class140.field1797.field5049 - var356, (byte) -61);
                            continue;
                        }
                        if (var607 == 5009) {
                            var3 -= 2;
                            String var357 = field4432[var3];
                            String var358 = field4432[var3 + 1];
                            if (class7.field93 != 0 || (!class181.field2419 || class379.field5553) && !class406.field5916) {
                                field4414++;
                                class140.field1797.method1833(-20379, 236);
                                class140.field1797.method2204(0, 8);
                                int var359 = class140.field1797.field5049;
                                class140.field1797.method2214(var357, -111);
                                class240.method1554(class140.field1797, -1, var358);
                                class140.field1797.method2251(class140.field1797.field5049 - var359, (byte) -61);
                            }
                            continue;
                        }
                        if (var607 == 5010) {
                            var2--;
                            int var360 = field4428[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class356.field5271[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field4432[var3++] = var361;
                            continue;
                        }
                        if (var607 == 5011) {
                            var2--;
                            int var362 = field4428[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class24.field431[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field4432[var3++] = var363;
                            continue;
                        }
                        if (var607 == 5012) {
                            var2--;
                            int var364 = field4428[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class43.field634[var364];
                            }
                            field4428[var2++] = var365;
                            continue;
                        }
                        if (var607 == 5015) {
                            String var366;
                            if (class383.field5609 == null || class383.field5609.field4671 == null) {
                                var366 = class427.field6216;
                            } else {
                                var366 = class383.field5609.method2078(2047, true);
                            }
                            field4432[var3++] = var366;
                            continue;
                        }
                        if (var607 == 5016) {
                            field4428[var2++] = class421.field6115;
                            continue;
                        }
                        if (var607 == 5017) {
                            field4428[var2++] = class440.field6371;
                            continue;
                        }
                        if (var607 == 5018) {
                            var2--;
                            int var367 = field4428[var2];
                            int var368 = 0;
                            if (var367 < 100 && class278.field4080[var367] != null) {
                                var368 = class31.field510[var367];
                            }
                            field4428[var2++] = var368;
                            continue;
                        }
                        if (var607 == 5019) {
                            var2--;
                            int var369 = field4428[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class232.field3225[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field4432[var3++] = var370;
                            continue;
                        }
                        if (var607 == 5020) {
                            String var371;
                            if (class383.field5609 == null || class383.field5609.field4671 == null) {
                                var371 = class427.field6216;
                            } else {
                                var371 = class383.field5609.method2081(false, 1);
                            }
                            field4432[var3++] = var371;
                            continue;
                        }
                        if (var607 == 5050) {
                            var2--;
                            int var372 = field4428[var2];
                            field4432[var3++] = class131.method943(var372, (byte) 123).field4895;
                            continue;
                        }
                        if (var607 == 5051) {
                            var2--;
                            int var373 = field4428[var2];
                            class333 var374 = class131.method943(var373, (byte) 98);
                            if (var374.field4889 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var374.field4889.length;
                            }
                            continue;
                        }
                        if (var607 == 5052) {
                            var2 -= 2;
                            int var375 = field4428[var2];
                            int var376 = field4428[var2 + 1];
                            class333 var377 = class131.method943(var375, (byte) 87);
                            int var378 = var377.field4889[var376];
                            field4428[var2++] = var378;
                            continue;
                        }
                        if (var607 == 5053) {
                            var2--;
                            int var379 = field4428[var2];
                            class333 var380 = class131.method943(var379, (byte) 127);
                            if (var380.field4892 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var380.field4892.length;
                            }
                            continue;
                        }
                        if (var607 == 5054) {
                            var2 -= 2;
                            int var381 = field4428[var2];
                            int var382 = field4428[var2 + 1];
                            field4428[var2++] = class131.method943(var381, (byte) 112).field4892[var382];
                            continue;
                        }
                        if (var607 == 5055) {
                            var2--;
                            int var383 = field4428[var2];
                            field4432[var3++] = class208.method1367(-10186, var383).method790(27196);
                            continue;
                        }
                        if (var607 == 5056) {
                            var2--;
                            int var384 = field4428[var2];
                            class104 var385 = class208.method1367(-10186, var384);
                            if (var385.field1348 == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var385.field1348.length;
                            }
                            continue;
                        }
                        if (var607 == 5057) {
                            var2 -= 2;
                            int var386 = field4428[var2];
                            int var387 = field4428[var2 + 1];
                            field4428[var2++] = class208.method1367(-10186, var386).field1348[var387];
                            continue;
                        }
                        if (var607 == 5058) {
                            field4416 = new class84();
                            var2--;
                            field4416.field1159 = field4428[var2];
                            field4416.field1164 = class208.method1367(-10186, field4416.field1159);
                            field4416.field1162 = new int[field4416.field1164.method788((byte) -102)];
                            continue;
                        }
                        if (var607 == 5059) {
                            field4431++;
                            class140.field1797.method1833(-20379, 5);
                            class140.field1797.method2204(0, 8);
                            int var388 = class140.field1797.field5049;
                            class140.field1797.method2204(0, 8);
                            class140.field1797.method2250(false, field4416.field1159);
                            field4416.field1164.method793(-55, class140.field1797, field4416.field1162);
                            class140.field1797.method2251(class140.field1797.field5049 - var388, (byte) -61);
                            continue;
                        }
                        if (var607 == 5060) {
                            var3--;
                            String var389 = field4432[var3];
                            field4429++;
                            class140.field1797.method1833(-20379, 142);
                            class140.field1797.method2204(0, 8);
                            int var390 = class140.field1797.field5049;
                            class140.field1797.method2214(var389, -110);
                            class140.field1797.method2250(false, field4416.field1159);
                            field4416.field1164.method793(-92, class140.field1797, field4416.field1162);
                            class140.field1797.method2251(class140.field1797.field5049 - var390, (byte) -61);
                            continue;
                        }
                        if (var607 == 5061) {
                            field4431++;
                            class140.field1797.method1833(-20379, 5);
                            class140.field1797.method2204(0, 8);
                            int var391 = class140.field1797.field5049;
                            class140.field1797.method2204(1, 8);
                            class140.field1797.method2250(false, field4416.field1159);
                            field4416.field1164.method793(-94, class140.field1797, field4416.field1162);
                            class140.field1797.method2251(class140.field1797.field5049 - var391, (byte) -61);
                            continue;
                        }
                        if (var607 == 5062) {
                            var2 -= 2;
                            int var392 = field4428[var2];
                            int var393 = field4428[var2 + 1];
                            field4428[var2++] = class131.method943(var392, (byte) 102).field4901[var393];
                            continue;
                        }
                        if (var607 == 5063) {
                            var2 -= 2;
                            int var394 = field4428[var2];
                            int var395 = field4428[var2 + 1];
                            field4428[var2++] = class131.method943(var394, (byte) 100).field4888[var395];
                            continue;
                        }
                        if (var607 == 5064) {
                            var2 -= 2;
                            int var396 = field4428[var2];
                            int var397 = field4428[var2 + 1];
                            if (var397 == -1) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = class131.method943(var396, (byte) 125).method2179((char) var397, (byte) -111);
                            }
                            continue;
                        }
                        if (var607 == 5065) {
                            var2 -= 2;
                            int var398 = field4428[var2];
                            int var399 = field4428[var2 + 1];
                            if (var399 == -1) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = class131.method943(var398, (byte) 126).method2181((char) var399, -29513);
                            }
                            continue;
                        }
                        if (var607 == 5066) {
                            var2--;
                            int var400 = field4428[var2];
                            field4428[var2++] = class208.method1367(-10186, var400).method788((byte) 76);
                            continue;
                        }
                        if (var607 == 5067) {
                            var2 -= 2;
                            int var401 = field4428[var2];
                            int var402 = field4428[var2 + 1];
                            int var403 = class208.method1367(-10186, var401).method786((byte) -118, var402);
                            field4428[var2++] = var403;
                            continue;
                        }
                        if (var607 == 5068) {
                            var2 -= 2;
                            int var404 = field4428[var2];
                            int var405 = field4428[var2 + 1];
                            field4416.field1162[var404] = var405;
                            continue;
                        }
                        if (var607 == 5069) {
                            var2 -= 2;
                            int var406 = field4428[var2];
                            int var407 = field4428[var2 + 1];
                            field4416.field1162[var406] = var407;
                            continue;
                        }
                        if (var607 == 5070) {
                            var2 -= 3;
                            int var408 = field4428[var2];
                            int var409 = field4428[var2 + 1];
                            int var410 = field4428[var2 + 2];
                            class104 var411 = class208.method1367(-10186, var408);
                            if (var411.method786((byte) 106, var409) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field4428[var2++] = var411.method789(var410, -120, var409);
                            continue;
                        }
                        if (var607 == 5071) {
                            var3--;
                            String var412 = field4432[var3];
                            var2--;
                            boolean var413 = field4428[var2] == 1;
                            class77.method618(0, var413, var412);
                            field4428[var2++] = class47.field711;
                            continue;
                        }
                        if (var607 == 5072) {
                            if (class267.field3960 != null && class290.field4341 < class47.field711) {
                                field4428[var2++] = class267.field3960[class290.field4341++] & 0xFFFF;
                                continue;
                            }
                            field4428[var2++] = -1;
                            continue;
                        }
                        if (var607 == 5073) {
                            class290.field4341 = 0;
                            continue;
                        }
                    } else if (var607 < 5200) {
                        if (var607 == 5100) {
                            if (class277.field4063[86]) {
                                field4428[var2++] = 1;
                            } else {
                                field4428[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5101) {
                            if (class277.field4063[82]) {
                                field4428[var2++] = 1;
                            } else {
                                field4428[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5102) {
                            if (class277.field4063[81]) {
                                field4428[var2++] = 1;
                            } else {
                                field4428[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var607 < 5300) {
                        if (var607 == 5200) {
                            var2--;
                            class136.method963(field4428[var2], -3809);
                            continue;
                        }
                        if (var607 == 5201) {
                            field4428[var2++] = class133.method952(false);
                            continue;
                        }
                        if (var607 == 5205) {
                            var2--;
                            class69.method580(field4428[var2], -1, -1, 89, false);
                            continue;
                        }
                        if (var607 == 5206) {
                            var2--;
                            int var414 = field4428[var2];
                            class379 var415 = class200.method1324(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = var415.field5547;
                            }
                            continue;
                        }
                        if (var607 == 5207) {
                            var2--;
                            class379 var416 = class200.method1330(field4428[var2]);
                            if (var416 != null && var416.field5542 != null) {
                                field4432[var3++] = var416.field5542;
                                continue;
                            }
                            field4432[var3++] = "";
                            continue;
                        }
                        if (var607 == 5208) {
                            field4428[var2++] = class30.field487;
                            field4428[var2++] = class27.field466;
                            continue;
                        }
                        if (var607 == 5209) {
                            field4428[var2++] = class297.field4487 + class200.field2782;
                            field4428[var2++] = class85.field1184 + class200.field2789;
                            continue;
                        }
                        if (var607 == 5210) {
                            var2--;
                            int var417 = field4428[var2];
                            class379 var418 = class200.method1330(var417);
                            if (var418 == null) {
                                field4428[var2++] = 0;
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var418.field5537 >> 14 & 0x3FFF;
                                field4428[var2++] = var418.field5537 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var607 == 5211) {
                            var2--;
                            int var419 = field4428[var2];
                            class379 var420 = class200.method1330(var419);
                            if (var420 == null) {
                                field4428[var2++] = 0;
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var420.field5533 - var420.field5538;
                                field4428[var2++] = var420.field5551 - var420.field5541;
                            }
                            continue;
                        }
                        if (var607 == 5212) {
                            class27 var421 = class266.method1778((byte) -92);
                            if (var421 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = var421.field462;
                                int var422 = var421.field461 << 28 | class200.field2782 + var421.field464 << 14 | class200.field2789 + var421.field467;
                                field4428[var2++] = var422;
                            }
                            continue;
                        }
                        if (var607 == 5213) {
                            class27 var423 = class164.method1110(-24377);
                            if (var423 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = var423.field462;
                                int var424 = var423.field461 << 28 | class200.field2782 + var423.field464 << 14 | class200.field2789 + var423.field467;
                                field4428[var2++] = var424;
                            }
                            continue;
                        }
                        if (var607 == 5214) {
                            var2--;
                            int var425 = field4428[var2];
                            class379 var426 = class123.method880(22137);
                            if (var426 != null) {
                                boolean var427 = var426.method2471(var425 >> 14 & 0x3FFF, var425 & 0x3FFF, field4435, var425 >> 28 & 0x3, 0);
                                if (var427) {
                                    class354.method2333(field4435[2], field4435[1], 15748);
                                }
                            }
                            continue;
                        }
                        if (var607 == 5215) {
                            var2 -= 2;
                            int var428 = field4428[var2];
                            int var429 = field4428[var2 + 1];
                            class173 var430 = class200.method1336(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class379 var432 = (class379) var430.method1157(61); var432 != null; var432 = (class379) var430.method1151((byte) 72)) {
                                if (var432.field5547 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field4428[var2++] = 1;
                            } else {
                                field4428[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5218) {
                            var2--;
                            int var433 = field4428[var2];
                            class379 var434 = class200.method1330(var433);
                            if (var434 == null) {
                                field4428[var2++] = -1;
                            } else {
                                field4428[var2++] = var434.field5540;
                            }
                            continue;
                        }
                        if (var607 == 5220) {
                            field4428[var2++] = class31.field512 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5221) {
                            var2--;
                            int var435 = field4428[var2];
                            class354.method2333(var435 & 0x3FFF, var435 >> 14 & 0x3FFF, 15748);
                            continue;
                        }
                        if (var607 == 5222) {
                            class379 var436 = class123.method880(22137);
                            if (var436 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = -1;
                            } else {
                                boolean var437 = var436.method2469(class297.field4487 + class200.field2782, class85.field1184 + class200.field2789, (byte) -99, field4435);
                                if (var437) {
                                    field4428[var2++] = field4435[1];
                                    field4428[var2++] = field4435[2];
                                } else {
                                    field4428[var2++] = -1;
                                    field4428[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5223) {
                            var2 -= 2;
                            int var438 = field4428[var2];
                            int var439 = field4428[var2 + 1];
                            class69.method580(var438, var439 >> 14 & 0x3FFF, var439 & 0x3FFF, -49, false);
                            continue;
                        }
                        if (var607 == 5224) {
                            var2--;
                            int var440 = field4428[var2];
                            class379 var441 = class123.method880(22137);
                            if (var441 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = -1;
                            } else {
                                boolean var442 = var441.method2471(var440 >> 14 & 0x3FFF, var440 & 0x3FFF, field4435, var440 >> 28 & 0x3, 0);
                                if (var442) {
                                    field4428[var2++] = field4435[1];
                                    field4428[var2++] = field4435[2];
                                } else {
                                    field4428[var2++] = -1;
                                    field4428[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5225) {
                            var2--;
                            int var443 = field4428[var2];
                            class379 var444 = class123.method880(22137);
                            if (var444 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = -1;
                            } else {
                                boolean var445 = var444.method2469(var443 >> 14 & 0x3FFF, var443 & 0x3FFF, (byte) -99, field4435);
                                if (var445) {
                                    field4428[var2++] = field4435[1];
                                    field4428[var2++] = field4435[2];
                                } else {
                                    field4428[var2++] = -1;
                                    field4428[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5226) {
                            var2--;
                            class418.method2631(50, field4428[var2]);
                            continue;
                        }
                        if (var607 == 5227) {
                            var2 -= 2;
                            int var446 = field4428[var2];
                            int var447 = field4428[var2 + 1];
                            class69.method580(var446, var447 >> 14 & 0x3FFF, var447 & 0x3FFF, 72, true);
                            continue;
                        }
                        if (var607 == 5228) {
                            var2--;
                            class273.field4012 = field4428[var2] == 1;
                            continue;
                        }
                        if (var607 == 5229) {
                            field4428[var2++] = class273.field4012 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5230) {
                            var2--;
                            int var448 = field4428[var2];
                            class345.method2286(-29128, var448);
                            continue;
                        }
                        if (var607 == 5231) {
                            var2 -= 2;
                            int var449 = field4428[var2];
                            boolean var450 = field4428[var2 + 1] == 1;
                            if (class328.field4842 == null) {
                                continue;
                            }
                            class418 var451 = class328.field4842.method2826(false, (long) var449);
                            if (var451 != null && !var450) {
                                var451.method2632(true);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class418 var452 = new class418();
                                class328.field4842.method2815(-1, (long) var449, var452);
                            }
                            continue;
                        }
                        if (var607 == 5232) {
                            var2--;
                            int var453 = field4428[var2];
                            if (class328.field4842 == null) {
                                field4428[var2++] = 0;
                            } else {
                                class418 var454 = class328.field4842.method2826(false, (long) var453);
                                field4428[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5233) {
                            var2 -= 2;
                            int var455 = field4428[var2];
                            boolean var456 = field4428[var2 + 1] == 1;
                            if (class247.field3476 == null) {
                                continue;
                            }
                            class418 var457 = class247.field3476.method2826(false, (long) var455);
                            if (var457 != null && !var456) {
                                var457.method2632(true);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class418 var458 = new class418();
                                class247.field3476.method2815(-1, (long) var455, var458);
                            }
                            continue;
                        }
                        if (var607 == 5234) {
                            var2--;
                            int var459 = field4428[var2];
                            if (class247.field3476 == null) {
                                field4428[var2++] = 0;
                            } else {
                                class418 var460 = class247.field3476.method2826(false, (long) var459);
                                field4428[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5235) {
                            field4428[var2++] = class200.field2758 == null ? -1 : class200.field2758.field5547;
                            continue;
                        }
                    } else if (var607 < 5400) {
                        if (var607 == 5300) {
                            var2 -= 2;
                            int var461 = field4428[var2];
                            int var462 = field4428[var2 + 1];
                            class246.method1611(-43, false, 3, var462, var461);
                            field4428[var2++] = class211.field2872 == null ? 0 : 1;
                            continue;
                        }
                        if (var607 == 5301) {
                            if (class211.field2872 != null) {
                                class246.method1611(-43, false, class195.field2700, -1, -1);
                            }
                            continue;
                        }
                        if (var607 == 5302) {
                            class131[] var463 = class197.method1305(true);
                            field4428[var2++] = var463.length;
                            continue;
                        }
                        if (var607 == 5303) {
                            var2--;
                            int var464 = field4428[var2];
                            class131[] var465 = class197.method1305(true);
                            field4428[var2++] = var465[var464].field1720;
                            field4428[var2++] = var465[var464].field1715;
                            continue;
                        }
                        if (var607 == 5305) {
                            int var466 = class289.field4338;
                            int var467 = class197.field2724;
                            int var468 = -1;
                            class131[] var469 = class197.method1305(true);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class131 var471 = var469[var470];
                                if (var471.field1720 == var466 && var471.field1715 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field4428[var2++] = var468;
                            continue;
                        }
                        if (var607 == 5306) {
                            field4428[var2++] = class340.method2203((byte) 54);
                            continue;
                        }
                        if (var607 == 5307) {
                            var2--;
                            int var472 = field4428[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class246.method1611(-43, false, var472, -1, -1);
                            }
                            continue;
                        }
                        if (var607 == 5308) {
                            field4428[var2++] = class195.field2700;
                            continue;
                        }
                        if (var607 == 5309) {
                            var2--;
                            int var473 = field4428[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class195.field2700 = var473;
                                class212.method1398(-34, class63.field948);
                            }
                            continue;
                        }
                    } else if (var607 < 5500) {
                        if (var607 == 5400) {
                            var3 -= 2;
                            String var474 = field4432[var3];
                            String var475 = field4432[var3 + 1];
                            var2--;
                            int var476 = field4428[var2];
                            field4420++;
                            class140.field1797.method1833(-20379, 67);
                            class140.field1797.method2204(class9.method61((byte) -117, var474) + class9.method61((byte) -117, var475) + 1, 8);
                            class140.field1797.method2214(var474, -92);
                            class140.field1797.method2214(var475, -116);
                            class140.field1797.method2204(var476, 8);
                            continue;
                        }
                        if (var607 == 5401) {
                            var2 -= 2;
                            class388.field5681[field4428[var2]] = (short) class335.method2188((byte) -95, field4428[var2 + 1]);
                            client.method400(1);
                            class117.method856(1107);
                            class350.method2312(-128);
                            class294.method1992(6);
                            class274.method1812(-1695);
                            continue;
                        }
                        if (var607 == 5405) {
                            var2 -= 2;
                            int var477 = field4428[var2];
                            int var478 = field4428[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class166.field2248[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var607 == 5406) {
                            var2 -= 7;
                            int var479 = field4428[var2];
                            int var480 = field4428[var2 + 1] << 1;
                            int var481 = field4428[var2 + 2];
                            int var482 = field4428[var2 + 3];
                            int var483 = field4428[var2 + 4];
                            int var484 = field4428[var2 + 5];
                            int var485 = field4428[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class166.field2248[var479] != null && var480 >= 0 && var480 < class166.field2248[var479].length) {
                                class166.field2248[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class166.field2248[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var607 == 5407) {
                            var2--;
                            int var486 = class166.field2248[field4428[var2]].length >> 1;
                            field4428[var2++] = var486;
                            continue;
                        }
                        if (var607 == 5411) {
                            if (class211.field2872 != null) {
                                class246.method1611(-43, false, class195.field2700, -1, -1);
                            }
                            if (class428.field6222 == null) {
                                String var487 = class348.field5188 == null ? class453.method2814(-27903) : class348.field5188;
                                class360.method2370(class397.field5796 == 1, class63.field948, var487, false, (byte) 45);
                            } else {
                                class322.method2119((byte) -112);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var607 == 5419) {
                            String var488 = "";
                            if (class403.field5877 != null) {
                                if (class403.field5877.field3105 == null) {
                                    var488 = class106.method800(7, class403.field5877.field3103);
                                } else {
                                    var488 = (String) class403.field5877.field3105;
                                }
                            }
                            field4432[var3++] = var488;
                            continue;
                        }
                        if (var607 == 5420) {
                            field4428[var2++] = class364.field5387 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5421) {
                            if (class211.field2872 != null) {
                                class246.method1611(-43, false, class195.field2700, -1, -1);
                            }
                            var3--;
                            String var489 = field4432[var3];
                            var2--;
                            boolean var490 = field4428[var2] == 1;
                            String var491 = class453.method2814(-27903) + var489;
                            class360.method2370(class397.field5796 == 1, class63.field948, var491, var490, (byte) 45);
                            continue;
                        }
                        if (var607 == 5422) {
                            var3 -= 2;
                            String var492 = field4432[var3];
                            String var493 = field4432[var3 + 1];
                            var2--;
                            int var494 = field4428[var2];
                            if (var492.length() > 0) {
                                if (class16.field271 == null) {
                                    class16.field271 = new String[class256.field3746[class396.field5783]];
                                }
                                class16.field271[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class179.field2401 == null) {
                                    class179.field2401 = new String[class256.field3746[class396.field5783]];
                                }
                                class179.field2401[var494] = var493;
                            }
                            continue;
                        }
                        if (var607 == 5423) {
                            var3--;
                            System.out.println(field4432[var3]);
                            continue;
                        }
                        if (var607 == 5424) {
                            var2 -= 11;
                            class301.field4542 = field4428[var2];
                            class278.field4083 = field4428[var2 + 1];
                            class165.field2236 = field4428[var2 + 2];
                            class212.field2915 = field4428[var2 + 3];
                            class118.field1536 = field4428[var2 + 4];
                            class209.field2845 = field4428[var2 + 5];
                            class15.field250 = field4428[var2 + 6];
                            class236.field3295 = field4428[var2 + 7];
                            class73.field1031 = field4428[var2 + 8];
                            class176.field2384 = field4428[var2 + 9];
                            class387.field5663 = field4428[var2 + 10];
                            class118.field1532.method1205((byte) -48, class118.field1536);
                            class118.field1532.method1205((byte) -48, class209.field2845);
                            class118.field1532.method1205((byte) -48, class15.field250);
                            class118.field1532.method1205((byte) -48, class236.field3295);
                            class118.field1532.method1205((byte) -48, class73.field1031);
                            class190.field2644 = null;
                            class281.field4135 = null;
                            class271.field3997 = null;
                            class57.field864 = null;
                            class147.field1880 = null;
                            class431.field6266 = null;
                            class420.field6111 = null;
                            class430.field6247 = null;
                            class167.field2266 = true;
                            continue;
                        }
                        if (var607 == 5425) {
                            class157.method1045((byte) 64);
                            class167.field2266 = false;
                            continue;
                        }
                        if (var607 == 5426) {
                            var2 -= 2;
                            class38.field571 = field4428[var2];
                            class357.field5289 = field4428[var2 + 1];
                            continue;
                        }
                        if (var607 == 5427) {
                            var2 -= 2;
                            class407.field5935 = field4428[var2];
                            class387.field5664 = field4428[var2 + 1];
                            continue;
                        }
                        if (var607 == 5428) {
                            var2 -= 2;
                            int var495 = field4428[var2];
                            int var496 = field4428[var2 + 1];
                            field4428[var2++] = class447.method2777(var495, var496, 80) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5429) {
                            var3--;
                            class185.method1237(field4432[var3], false, -120);
                            continue;
                        }
                    } else if (var607 < 5600) {
                        if (var607 == 5500) {
                            var2 -= 4;
                            int var497 = field4428[var2];
                            int var498 = field4428[var2 + 1];
                            int var499 = field4428[var2 + 2];
                            int var500 = field4428[var2 + 3];
                            class356.method2337((var497 >> 14 & 0x3FFF) - class236.field3292, (byte) 120, false, var499, var500, (var497 & 0x3FFF) - class90.field1223, var498);
                            continue;
                        }
                        if (var607 == 5501) {
                            var2 -= 4;
                            int var501 = field4428[var2];
                            int var502 = field4428[var2 + 1];
                            int var503 = field4428[var2 + 2];
                            int var504 = field4428[var2 + 3];
                            class393.method2527(var503, 109, (var501 & 0x3FFF) - class90.field1223, var504, var502, (var501 >> 14 & 0x3FFF) - class236.field3292);
                            continue;
                        }
                        if (var607 == 5502) {
                            var2 -= 6;
                            int var505 = field4428[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class17.field280 = var505;
                            int var506 = field4428[var2 + 1];
                            if (var506 + 1 >= class166.field2248[class17.field280].length >> 1) {
                                throw new RuntimeException();
                            }
                            class438.field6360 = var506;
                            class377.field5523 = 0;
                            class418.field6095 = field4428[var2 + 2];
                            class57.field860 = field4428[var2 + 3];
                            int var507 = field4428[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class112.field1441 = var507;
                            int var508 = field4428[var2 + 5];
                            if (var508 + 1 >= class166.field2248[class112.field1441].length >> 1) {
                                throw new RuntimeException();
                            }
                            class136.field1770 = var508;
                            class212.field2884 = 3;
                            continue;
                        }
                        if (var607 == 5503) {
                            class24.method214((byte) 121);
                            continue;
                        }
                        if (var607 == 5504) {
                            var2 -= 2;
                            class237.method1541(field4428[var2], -89, 0, field4428[var2 + 1]);
                            continue;
                        }
                        if (var607 == 5505) {
                            field4428[var2++] = (int) class39.field588 >> 3;
                            continue;
                        }
                        if (var607 == 5506) {
                            field4428[var2++] = (int) class247.field3479 >> 3;
                            continue;
                        }
                        if (var607 == 5507) {
                            class269.method1793(237);
                            continue;
                        }
                        if (var607 == 5508) {
                            class1.method4((byte) 125);
                            continue;
                        }
                        if (var607 == 5509) {
                            class351.method2318(-191);
                            continue;
                        }
                        if (var607 == 5510) {
                            class397.method2550(-65);
                            continue;
                        }
                        if (var607 == 5511) {
                            var2--;
                            int var509 = field4428[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class236.field3292;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class351.field5217) {
                                var512 = class351.field5217;
                            }
                            int var513 = var511 - class90.field1223;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class143.field1815) {
                                var513 = class143.field1815;
                            }
                            class334.field4904 = var512 * 128 + 64;
                            class7.field96 = var513 * 128 + 64;
                            class212.field2884 = 4;
                            continue;
                        }
                        if (var607 == 5512) {
                            class186.method1240((byte) 88);
                            continue;
                        }
                    } else if (var607 < 5700) {
                        if (var607 == 5600) {
                            var3 -= 2;
                            String var514 = field4432[var3];
                            String var515 = field4432[var3 + 1];
                            var2--;
                            int var516 = field4428[var2];
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0 && class258.field3804 == 0) {
                                class112.method828(var516, var514, true, var515);
                            }
                            continue;
                        }
                        if (var607 == 5601) {
                            class81.method633(false);
                            continue;
                        }
                        if (var607 == 5602) {
                            if (class395.field5738 == 0) {
                                class241.field3371 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5603) {
                            var2 -= 4;
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0 && class258.field3804 == 0) {
                                class25.method219(field4428[var2 + 1], field4428[var2], field4428[var2 + 2], field4428[var2 + 3], 102);
                            }
                            continue;
                        }
                        if (var607 == 5604) {
                            var3--;
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0 && class258.field3804 == 0) {
                                class124.method882((byte) -70, class337.method2194(field4432[var3], 1));
                            }
                            continue;
                        }
                        if (var607 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0 && class258.field3804 == 0) {
                                class160.method1076(23950, field4432[var3 + 1], field4428[var2 + 6] == 1, field4428[var2 + 5] == 1, class337.method2194(field4432[var3], 1), field4428[var2 + 1], field4428[var2], field4432[var3 + 2], field4428[var2 + 3], field4428[var2 + 4] == 1, field4428[var2 + 2]);
                            }
                            continue;
                        }
                        if (var607 == 5606) {
                            if (class17.field279 == 0) {
                                class8.field111 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5607) {
                            field4428[var2++] = class241.field3371;
                            continue;
                        }
                        if (var607 == 5608) {
                            field4428[var2++] = class305.field4567;
                            continue;
                        }
                        if (var607 == 5609) {
                            field4428[var2++] = class8.field111;
                            continue;
                        }
                        if (var607 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field4432[var3++] = class139.field1793.length > var517 ? class222.method1452(58, class139.field1793[var517]) : "";
                            }
                            class139.field1793 = null;
                            continue;
                        }
                        if (var607 == 5611) {
                            field4428[var2++] = class370.field5465;
                            continue;
                        }
                    } else if (var607 < 6100) {
                        if (var607 == 6001) {
                            var2--;
                            int var518 = field4428[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class378.field5531 = var518;
                            class194.method1289(-3664);
                            class212.method1398(-110, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6002) {
                            var2--;
                            class7.method40(field4428[var2] == 1, -29254);
                            class93.method747(100);
                            class194.method1289(-3664);
                            class67.method571((byte) -6);
                            class212.method1398(-110, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6003) {
                            var2--;
                            class232.field3223 = field4428[var2] == 1;
                            class67.method571((byte) -6);
                            class212.method1398(-124, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6005) {
                            var2--;
                            class24.field434 = field4428[var2] == 1;
                            class194.method1289(-3664);
                            class212.method1398(-97, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6006) {
                            var2--;
                            class397.field5799 = field4428[var2] == 1;
                            class126.field1647.method433(!class397.field5799);
                            class212.method1398(-31, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6007) {
                            var2--;
                            class116.field1508 = field4428[var2];
                            class212.method1398(-54, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6008) {
                            var2--;
                            class407.field5937 = field4428[var2] == 1;
                            class212.method1398(-28, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6009) {
                            var2--;
                            class423.field6169 = field4428[var2] == 1;
                            class194.method1289(-3664);
                            class212.method1398(-49, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6010) {
                            var2--;
                            class354.field5256 = field4428[var2] == 1;
                            class212.method1398(-101, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6011) {
                            var2--;
                            int var519 = field4428[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class330.field4863 = var519;
                            class194.method1289(-3664);
                            class212.method1398(-88, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6012) {
                            var2--;
                            class273.field4015 = field4428[var2] == 1;
                            class74.method602((byte) 108);
                            class212.method1398(-46, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6014) {
                            var2--;
                            class452.field6560 = field4428[var2] == 1;
                            class194.method1289(-3664);
                            class212.method1398(-84, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6015) {
                            var2--;
                            class1.field10 = field4428[var2] == 1;
                            class194.method1289(-3664);
                            class212.method1398(-67, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6016) {
                            var2--;
                            int var520 = field4428[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class104.field1359 = var520;
                            class66.method568(100);
                            class212.method1398(-51, class63.field948);
                            continue;
                        }
                        if (var607 == 6017) {
                            var2--;
                            class338.field4993 = field4428[var2] == 1;
                            class229.method1492(11593);
                            class212.method1398(-97, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6018) {
                            var2--;
                            int var521 = field4428[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class227.field3128 = var521;
                            class212.method1398(-116, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6019) {
                            var2--;
                            int var522 = field4428[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class154.field1961 != var522) {
                                if (class154.field1961 == 0 && class400.field5855 != -1) {
                                    class232.method1510(var522, -10668, false, 0, class388.field5677, class400.field5855);
                                    class60.field919 = false;
                                } else if (var522 == 0) {
                                    class24.method215((byte) -31);
                                    class60.field919 = false;
                                } else {
                                    class68.method576((byte) 72, var522);
                                }
                                class154.field1961 = var522;
                            }
                            class212.method1398(-122, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6020) {
                            var2--;
                            int var523 = field4428[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class389.field5692 = var523;
                            class212.method1398(-97, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6021) {
                            var2--;
                            class258.field3805 = field4428[var2] == 1;
                            class67.method571((byte) -6);
                            continue;
                        }
                        if (var607 == 6023) {
                            var2--;
                            int var524 = field4428[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class393.field5727 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class199.method1313(111, var524);
                            class212.method1398(-65, class63.field948);
                            class113.field1470 = false;
                            field4428[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 6024) {
                            var2--;
                            int var526 = field4428[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class355.field5263 = var526;
                            class212.method1398(-42, class63.field948);
                            continue;
                        }
                        if (var607 == 6025) {
                            var2--;
                            int var527 = field4428[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class249.field3681 = var527;
                            class212.method1398(-122, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                        if (var607 == 6027) {
                            var2--;
                            int var528 = field4428[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class390.method2518(var528 == 1, -117);
                            continue;
                        }
                        if (var607 == 6028) {
                            var2--;
                            class389.field5689 = field4428[var2] != 0;
                            class212.method1398(-92, class63.field948);
                            continue;
                        }
                        if (var607 == 6029) {
                            var2--;
                            class116.field1508 = field4428[var2];
                            class212.method1398(-124, class63.field948);
                            continue;
                        }
                        if (var607 == 6030) {
                            var2--;
                            class257.field3775 = field4428[var2] != 0;
                            class212.method1398(-86, class63.field948);
                            class194.method1289(-3664);
                            continue;
                        }
                        if (var607 == 6031) {
                            var2--;
                            int var529 = field4428[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class169.method1127((byte) -87, var529);
                            continue;
                        }
                        if (var607 == 6032) {
                            var2--;
                            int var530 = field4428[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class325.field4817 = var530;
                            class212.method1398(-70, class63.field948);
                            class113.field1470 = false;
                            continue;
                        }
                    } else if (var607 < 6200) {
                        if (var607 == 6101) {
                            field4428[var2++] = class378.field5531;
                            continue;
                        }
                        if (var607 == 6102) {
                            field4428[var2++] = class226.method1467(0) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6103) {
                            field4428[var2++] = class232.field3223 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6105) {
                            field4428[var2++] = class24.field434 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6106) {
                            field4428[var2++] = class397.field5799 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6107) {
                            field4428[var2++] = class116.field1508;
                            continue;
                        }
                        if (var607 == 6108) {
                            field4428[var2++] = class407.field5937 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6109) {
                            field4428[var2++] = class423.field6169 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6110) {
                            field4428[var2++] = class354.field5256 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6111) {
                            field4428[var2++] = class330.field4863;
                            continue;
                        }
                        if (var607 == 6112) {
                            field4428[var2++] = class273.field4015 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6114) {
                            field4428[var2++] = class452.field6560 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6115) {
                            field4428[var2++] = class1.field10 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6116) {
                            field4428[var2++] = class104.field1359;
                            continue;
                        }
                        if (var607 == 6117) {
                            field4428[var2++] = class338.field4993 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6118) {
                            field4428[var2++] = class227.field3128;
                            continue;
                        }
                        if (var607 == 6119) {
                            field4428[var2++] = class154.field1961;
                            continue;
                        }
                        if (var607 == 6120) {
                            field4428[var2++] = class389.field5692;
                            continue;
                        }
                        if (var607 == 6121) {
                            field4428[var2++] = class126.field1647.method496() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6123) {
                            field4428[var2++] = class190.method1265(23620);
                            continue;
                        }
                        if (var607 == 6124) {
                            field4428[var2++] = class355.field5263;
                            continue;
                        }
                        if (var607 == 6125) {
                            field4428[var2++] = class249.field3681;
                            continue;
                        }
                        if (var607 == 6126) {
                            field4428[var2++] = class126.field1647.method469() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6127) {
                            field4428[var2++] = class256.field3747 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6128) {
                            field4428[var2++] = class389.field5689 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6129) {
                            field4428[var2++] = class116.field1508;
                            continue;
                        }
                        if (var607 == 6130) {
                            field4428[var2++] = class257.field3775 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6131) {
                            field4428[var2++] = class397.field5796;
                            continue;
                        }
                        if (var607 == 6132) {
                            field4428[var2++] = class325.field4817;
                            continue;
                        }
                        if (var607 == 6133) {
                            field4428[var2++] = class364.field5387 == 1 || class364.field5387 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6300) {
                        if (var607 == 6200) {
                            var2 -= 2;
                            class1.field2 = (short) field4428[var2];
                            if (class1.field2 <= 0) {
                                class1.field2 = 256;
                            }
                            class39.field581 = (short) field4428[var2 + 1];
                            if (class39.field581 <= 0) {
                                class39.field581 = 205;
                            }
                            continue;
                        }
                        if (var607 == 6201) {
                            var2 -= 2;
                            class369.field5451 = (short) field4428[var2];
                            if (class369.field5451 <= 0) {
                                class369.field5451 = 256;
                            }
                            class246.field3465 = (short) field4428[var2 + 1];
                            if (class246.field3465 <= 0) {
                                class246.field3465 = 320;
                            }
                            continue;
                        }
                        if (var607 == 6202) {
                            var2 -= 4;
                            class331.field4876 = (short) field4428[var2];
                            if (class331.field4876 <= 0) {
                                class331.field4876 = 1;
                            }
                            class378.field5528 = (short) field4428[var2 + 1];
                            if (class378.field5528 <= 0) {
                                class378.field5528 = 32767;
                            } else if (class378.field5528 < class331.field4876) {
                                class378.field5528 = class331.field4876;
                            }
                            class95.field1281 = (short) field4428[var2 + 2];
                            if (class95.field1281 <= 0) {
                                class95.field1281 = 1;
                            }
                            class159.field1998 = (short) field4428[var2 + 3];
                            if (class159.field1998 <= 0) {
                                class159.field1998 = 32767;
                            } else if (class159.field1998 < class95.field1281) {
                                class159.field1998 = class95.field1281;
                            }
                            continue;
                        }
                        if (var607 == 6203) {
                            class47.method335(-1, class427.field6213.field3564, 0, 0, class427.field6213.field3531, false);
                            field4428[var2++] = class366.field5406;
                            field4428[var2++] = class383.field5611;
                            continue;
                        }
                        if (var607 == 6204) {
                            field4428[var2++] = class369.field5451;
                            field4428[var2++] = class246.field3465;
                            continue;
                        }
                        if (var607 == 6205) {
                            field4428[var2++] = class1.field2;
                            field4428[var2++] = class39.field581;
                            continue;
                        }
                    } else if (var607 < 6400) {
                        if (var607 == 6300) {
                            field4428[var2++] = (int) (class98.method768((byte) 106) / 60000L);
                            continue;
                        }
                        if (var607 == 6301) {
                            field4428[var2++] = (int) (class98.method768((byte) -125) / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6302) {
                            var2 -= 3;
                            int var531 = field4428[var2];
                            int var532 = field4428[var2 + 1];
                            int var533 = field4428[var2 + 2];
                            field4413.clear();
                            field4413.set(11, 12);
                            field4413.set(var533, var532, var531);
                            field4428[var2++] = (int) (field4413.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6303) {
                            field4413.clear();
                            field4413.setTime(new Date(class98.method768((byte) -98)));
                            field4428[var2++] = field4413.get(1);
                            continue;
                        }
                        if (var607 == 6304) {
                            var2--;
                            int var534 = field4428[var2];
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
                            field4428[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6500) {
                        if (var607 == 6405) {
                            field4428[var2++] = class248.method1635(18908) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6406) {
                            field4428[var2++] = class320.method2110((byte) -108) ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6600) {
                        if (var607 == 6500) {
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0) {
                                field4428[var2++] = class241.method1557(true) == -1 ? 0 : 1;
                                continue;
                            }
                            field4428[var2++] = 1;
                            continue;
                        }
                        if (var607 == 6501) {
                            class184 var536 = class453.method2816(1679);
                            if (var536 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = 0;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var536.field2478;
                                field4428[var2++] = var536.field5950;
                                field4432[var3++] = var536.field2474;
                                class322 var537 = var536.method1197(-1);
                                field4428[var2++] = var537.field4791;
                                field4432[var3++] = var537.field4792;
                                field4428[var2++] = var536.field5945;
                                field4428[var2++] = var536.field2466;
                            }
                            continue;
                        }
                        if (var607 == 6502) {
                            class184 var538 = class212.method1402(4751);
                            if (var538 == null) {
                                field4428[var2++] = -1;
                                field4428[var2++] = 0;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var538.field2478;
                                field4428[var2++] = var538.field5950;
                                field4432[var3++] = var538.field2474;
                                class322 var539 = var538.method1197(-1);
                                field4428[var2++] = var539.field4791;
                                field4432[var3++] = var539.field4792;
                                field4428[var2++] = var538.field5945;
                                field4428[var2++] = var538.field2466;
                            }
                            continue;
                        }
                        if (var607 == 6503) {
                            var2--;
                            int var540 = field4428[var2];
                            if (class381.field5579 == 10 && class24.field433 == 0 && class395.field5738 == 0 && class17.field279 == 0) {
                                field4428[var2++] = class106.method807(true, var540) ? 1 : 0;
                                continue;
                            }
                            field4428[var2++] = 0;
                            continue;
                        }
                        if (var607 == 6504) {
                            var2--;
                            class241.field3377 = field4428[var2];
                            class212.method1398(-113, class63.field948);
                            continue;
                        }
                        if (var607 == 6505) {
                            field4428[var2++] = class241.field3377;
                            continue;
                        }
                        if (var607 == 6506) {
                            var2--;
                            int var541 = field4428[var2];
                            class184 var542 = class158.method1049(var541, -21426);
                            if (var542 == null) {
                                field4428[var2++] = -1;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4432[var3++] = "";
                                field4428[var2++] = 0;
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = var542.field5950;
                                field4432[var3++] = var542.field2474;
                                class322 var543 = var542.method1197(-1);
                                field4428[var2++] = var543.field4791;
                                field4432[var3++] = var543.field4792;
                                field4428[var2++] = var542.field5945;
                                field4428[var2++] = var542.field2466;
                            }
                            continue;
                        }
                        if (var607 == 6507) {
                            var2 -= 4;
                            int var544 = field4428[var2];
                            boolean var545 = field4428[var2 + 1] == 1;
                            int var546 = field4428[var2 + 2];
                            boolean var547 = field4428[var2 + 3] == 1;
                            class264.method1764(-11366, var545, var546, var544, var547);
                            continue;
                        }
                        if (var607 == 6508) {
                            class269.method1796((byte) 60);
                            continue;
                        }
                        if (var607 == 6509) {
                            if (class381.field5579 == 10) {
                                var2--;
                                if (field4428[var2] == 1) {
                                    if (class427.field6212 == null) {
                                        class427.field6212 = new class435();
                                    }
                                } else if (class427.field6212 != null) {
                                    class427.field6212.method2722(27277);
                                    class427.field6212 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var607 < 6700) {
                        if (var607 == 6600) {
                            var2--;
                            class331.field4880 = field4428[var2] == 1;
                            class212.method1398(-75, class63.field948);
                            continue;
                        }
                        if (var607 == 6601) {
                            field4428[var2++] = class331.field4880 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6800 && class173.field2353 == 2) {
                        if (var607 == 6700) {
                            int var548 = class242.field3402.method2824((byte) 109);
                            if (class233.field3246 != -1) {
                                var548++;
                            }
                            field4428[var2++] = var548;
                            continue;
                        }
                        if (var607 == 6701) {
                            var2--;
                            int var549 = field4428[var2];
                            if (class233.field3246 != -1) {
                                if (var549 == 0) {
                                    field4428[var2++] = class233.field3246;
                                    continue;
                                }
                                var549--;
                            }
                            class28 var550 = (class28) class242.field3402.method2812(15710);
                            while (var549-- > 0) {
                                var550 = (class28) class242.field3402.method2819((byte) 82);
                            }
                            field4428[var2++] = var550.field482;
                            continue;
                        }
                        if (var607 == 6702) {
                            var2--;
                            int var551 = field4428[var2];
                            if (class4.field71[var551] == null) {
                                field4432[var3++] = "";
                            } else {
                                String var552 = class4.field71[var551][0].field3578;
                                if (var552 == null) {
                                    field4432[var3++] = "";
                                } else {
                                    field4432[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var607 == 6703) {
                            var2--;
                            int var553 = field4428[var2];
                            if (class4.field71[var553] == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = class4.field71[var553].length;
                            }
                            continue;
                        }
                        if (var607 == 6704) {
                            var2 -= 2;
                            int var554 = field4428[var2];
                            int var555 = field4428[var2 + 1];
                            if (class4.field71[var554] == null) {
                                field4432[var3++] = "";
                            } else {
                                String var556 = class4.field71[var554][var555].field3578;
                                if (var556 == null) {
                                    field4432[var3++] = "";
                                } else {
                                    field4432[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var607 == 6705) {
                            var2 -= 2;
                            int var557 = field4428[var2];
                            int var558 = field4428[var2 + 1];
                            if (class4.field71[var557] == null) {
                                field4428[var2++] = 0;
                            } else {
                                field4428[var2++] = class4.field71[var557][var558].field3565;
                            }
                            continue;
                        }
                        if (var607 == 6706) {
                            continue;
                        }
                        if (var607 == 6707) {
                            var2 -= 3;
                            int var559 = field4428[var2];
                            int var560 = field4428[var2 + 1];
                            int var561 = field4428[var2 + 2];
                            class305.method2038(var561, var559 << 16 | var560, (byte) 66, "", 1);
                            continue;
                        }
                        if (var607 == 6708) {
                            var2 -= 3;
                            int var562 = field4428[var2];
                            int var563 = field4428[var2 + 1];
                            int var564 = field4428[var2 + 2];
                            class305.method2038(var564, var562 << 16 | var563, (byte) 41, "", 2);
                            continue;
                        }
                        if (var607 == 6709) {
                            var2 -= 3;
                            int var565 = field4428[var2];
                            int var566 = field4428[var2 + 1];
                            int var567 = field4428[var2 + 2];
                            class305.method2038(var567, var565 << 16 | var566, (byte) -103, "", 3);
                            continue;
                        }
                        if (var607 == 6710) {
                            var2 -= 3;
                            int var568 = field4428[var2];
                            int var569 = field4428[var2 + 1];
                            int var570 = field4428[var2 + 2];
                            class305.method2038(var570, var568 << 16 | var569, (byte) -82, "", 4);
                            continue;
                        }
                        if (var607 == 6711) {
                            var2 -= 3;
                            int var571 = field4428[var2];
                            int var572 = field4428[var2 + 1];
                            int var573 = field4428[var2 + 2];
                            class305.method2038(var573, var571 << 16 | var572, (byte) 110, "", 5);
                            continue;
                        }
                        if (var607 == 6712) {
                            var2 -= 3;
                            int var574 = field4428[var2];
                            int var575 = field4428[var2 + 1];
                            int var576 = field4428[var2 + 2];
                            class305.method2038(var576, var574 << 16 | var575, (byte) -93, "", 6);
                            continue;
                        }
                        if (var607 == 6713) {
                            var2 -= 3;
                            int var577 = field4428[var2];
                            int var578 = field4428[var2 + 1];
                            int var579 = field4428[var2 + 2];
                            class305.method2038(var579, var577 << 16 | var578, (byte) -94, "", 7);
                            continue;
                        }
                        if (var607 == 6714) {
                            var2 -= 3;
                            int var580 = field4428[var2];
                            int var581 = field4428[var2 + 1];
                            int var582 = field4428[var2 + 2];
                            class305.method2038(var582, var580 << 16 | var581, (byte) 67, "", 8);
                            continue;
                        }
                        if (var607 == 6715) {
                            var2 -= 3;
                            int var583 = field4428[var2];
                            int var584 = field4428[var2 + 1];
                            int var585 = field4428[var2 + 2];
                            class305.method2038(var585, var583 << 16 | var584, (byte) -99, "", 9);
                            continue;
                        }
                        if (var607 == 6716) {
                            var2 -= 3;
                            int var586 = field4428[var2];
                            int var587 = field4428[var2 + 1];
                            int var588 = field4428[var2 + 2];
                            class305.method2038(var588, var586 << 16 | var587, (byte) 106, "", 10);
                            continue;
                        }
                        if (var607 == 6717) {
                            var2 -= 3;
                            int var589 = field4428[var2];
                            int var590 = field4428[var2 + 1];
                            int var591 = field4428[var2 + 2];
                            class248 var592 = class416.method2626(211655864, var589 << 16 | var590, var591);
                            class303.method2036((byte) -22);
                            class226 var593 = client.method402(var592);
                            class28.method233(var591, var593.method1469(-2703), (byte) 23, var592.field3573, var589 << 16 | var590, var593.field3118, var592.field3649);
                            continue;
                        }
                    } else if (var607 < 6900) {
                        if (var607 == 6800) {
                            var2--;
                            int var594 = field4428[var2];
                            class170 var595 = class174.method1160(-28930, var594);
                            if (var595.field2320 == null) {
                                field4432[var3++] = "";
                            } else {
                                field4432[var3++] = var595.field2320;
                            }
                            continue;
                        }
                        if (var607 == 6801) {
                            var2--;
                            int var596 = field4428[var2];
                            class170 var597 = class174.method1160(-28930, var596);
                            field4428[var2++] = var597.field2328;
                            continue;
                        }
                        if (var607 == 6802) {
                            var2--;
                            int var598 = field4428[var2];
                            class170 var599 = class174.method1160(-28930, var598);
                            field4428[var2++] = var599.field2303;
                            continue;
                        }
                        if (var607 == 6803) {
                            var2--;
                            int var600 = field4428[var2];
                            class170 var601 = class174.method1160(-28930, var600);
                            field4428[var2++] = var601.field2299;
                            continue;
                        }
                    }
                } else {
                    class248 var75;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var75 = class27.method224(65535, field4428[var2]);
                    } else {
                        var75 = var37 ? field4411 : field4426;
                    }
                    if (var607 == 1300) {
                        var2--;
                        int var76 = field4428[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1617(field4432[var3], false, var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var607 == 1301) {
                        var2 -= 2;
                        int var77 = field4428[var2];
                        int var78 = field4428[var2 + 1];
                        var75.field3592 = class416.method2626(211655864, var77, var78);
                        continue;
                    }
                    if (var607 == 1302) {
                        var2--;
                        var75.field3566 = field4428[var2] == 1;
                        continue;
                    }
                    if (var607 == 1303) {
                        var2--;
                        var75.field3650 = field4428[var2];
                        continue;
                    }
                    if (var607 == 1304) {
                        var2--;
                        var75.field3613 = field4428[var2];
                        continue;
                    }
                    if (var607 == 1305) {
                        var3--;
                        var75.field3585 = field4432[var3];
                        continue;
                    }
                    if (var607 == 1306) {
                        var3--;
                        var75.field3502 = field4432[var3];
                        continue;
                    }
                    if (var607 == 1307) {
                        var75.field3486 = null;
                        continue;
                    }
                    if (var607 == 1308) {
                        var2--;
                        var75.field3649 = field4428[var2];
                        var2--;
                        var75.field3573 = field4428[var2];
                        continue;
                    }
                    if (var607 == 1309) {
                        var2--;
                        int var79 = field4428[var2];
                        var2--;
                        int var80 = field4428[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1623(var80 - 1, (byte) -4, var79);
                        }
                        continue;
                    }
                    if (var607 == 1310) {
                        var3--;
                        var75.field3672 = field4432[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var606) {
            if (arg0.field4961 == null) {
                class266.method1780(1, "CS2 - scr:" + arg0.field6091 + " op:" + var7, var606);
            } else {
                class295.method1996("Clientscript error in: " + arg0.field4961, (byte) -62);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field4961).append("\n");
                for (int var604 = field4433 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field4415[var604].field1595.field4961).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var606.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class266.method1780(1, var603.toString(), var606);
                class17.method129(var603.toString(), (byte) -5);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static final void method1988(int arg0) {
        if (arg0 == -1 || !class338.method2195(arg0, 6173)) {
            return;
        }
        class248[] var1 = class4.field71[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class248 var3 = var1[var2];
            if (var3.field3665 != null) {
                class452 var4 = new class452();
                var4.field6571 = var3;
                var4.field6570 = var3.field3665;
                method1990(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lvk;)V")
    public static final void method1989(class452 arg0) {
        method1990(arg0, 200000);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lvk;I)V")
    private static final void method1990(class452 arg0, int arg1) {
        Object[] var2 = arg0.field6570;
        int var3 = (Integer) var2[0];
        class335 var4 = class271.method1799(0, var3);
        if (var4 == null) {
            return;
        }
        field4423 = new int[var4.field4963];
        int var5 = 0;
        field4417 = new String[var4.field4966];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6572;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6565;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6571 == null ? -1 : arg0.field6571.field3636;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6573;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6571 == null ? -1 : arg0.field6571.field3505;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6569 == null ? -1 : arg0.field6569.field3636;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6569 == null ? -1 : arg0.field6569.field3505;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6561;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6557;
                }
                field4423[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6558;
                }
                field4417[var6++] = var9;
            }
        }
        method1987(var4, arg1);
    }
}
