import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class424 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[Loe;")
    private static class110[] field6046 = new class110[50];

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[Ljava/lang/String;")
    private static String[] field6050 = new String[1000];

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[I")
    private static int[] field6057 = new int[1000];

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private static int field6058 = 0;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    private static int[] field6048 = new int[5];

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[[I")
    private static int[][] field6064 = new int[5][5000];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6045 = Calendar.getInstance();

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field6066 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "[I")
    private static int[] field6068 = new int[3];

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lub;")
    public static class15 field6065 = new class15(4);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lbr;")
    private static class223 field6049;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lbr;")
    private static class223 field6052;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lfe;")
    private static class341 field6061;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    private static int[] field6047;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field6044;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V", line = 11)
    public static final void method2653(int arg0, int arg1, int arg2) {
        class54 var3 = class75.method450(arg2, (byte) 6, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field6047 = new int[var3.field693];
        field6044 = new String[var3.field701];
        if (var3.field702 == 15 || var3.field702 == 17 || var3.field702 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class447.field6383 != null) {
                var4 = class447.field6383.field3187;
                var5 = class447.field6383.field3191;
            }
            field6047[0] = class270.field3949.method536(0) - var4;
            field6047[1] = class270.field3949.method543(7) - var5;
        }
        method2656(var3, 200000);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lpj;I)V", line = 38)
    private static final void method2654(class79 arg0, int arg1) {
        Object[] var2 = arg0.field1028;
        int var3 = (Integer) var2[0];
        class54 var4 = class100.method586((byte) 18, var3);
        if (var4 == null) {
            return;
        }
        field6047 = new int[var4.field693];
        int var5 = 0;
        field6044 = new String[var4.field701];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1011;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1024;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1018 == null ? -1 : arg0.field1018.field3227;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1016;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1018 == null ? -1 : arg0.field1018.field3344;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1022 == null ? -1 : arg0.field1022.field3227;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1022 == null ? -1 : arg0.field1022.field3344;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1026;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1025;
                }
                field6047[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1021;
                }
                field6044[var6++] = var9;
            }
        }
        method2656(var4, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lpj;)V", line = 115)
    public static final void method2655(class79 arg0) {
        method2654(arg0, 200000);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lhk;I)V", line = 124)
    private static final void method2656(class54 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field697;
        int[] var6 = arg0.field700;
        byte var7 = -1;
        field6058 = 0;
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
                        field6057[var2++] = var6[var4];
                        continue;
                    }
                    if (var621 == 1) {
                        int var9 = var6[var4];
                        field6057[var2++] = class150.field2254[var9];
                        continue;
                    }
                    if (var621 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class312.method2097(field6057[var2], var10, 0);
                        continue;
                    }
                    if (var621 == 3) {
                        field6050[var3++] = arg0.field705[var4];
                        continue;
                    }
                    if (var621 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var621 == 7) {
                        var2 -= 2;
                        if (field6057[var2 + 1] != field6057[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 8) {
                        var2 -= 2;
                        if (field6057[var2 + 1] == field6057[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 9) {
                        var2 -= 2;
                        if (field6057[var2] < field6057[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 10) {
                        var2 -= 2;
                        if (field6057[var2] > field6057[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 21) {
                        if (field6058 == 0) {
                            return;
                        }
                        class110 var11 = field6046[--field6058];
                        arg0 = var11.field1420;
                        var5 = arg0.field697;
                        var6 = arg0.field700;
                        var4 = var11.field1427;
                        field6047 = var11.field1430;
                        field6044 = var11.field1423;
                        continue;
                    }
                    if (var621 == 25) {
                        int var12 = var6[var4];
                        field6057[var2++] = class452.method2819((byte) -122, var12);
                        continue;
                    }
                    if (var621 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class269.method1838(field6057[var2], var13, (byte) -45);
                        continue;
                    }
                    if (var621 == 31) {
                        var2 -= 2;
                        if (field6057[var2] <= field6057[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 32) {
                        var2 -= 2;
                        if (field6057[var2] >= field6057[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 33) {
                        field6057[var2++] = field6047[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var621 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field6047[var10001] = field6057[var2];
                        continue;
                    }
                    if (var621 == 35) {
                        field6050[var3++] = field6044[var6[var4]];
                        continue;
                    }
                    if (var621 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field6044[var10001] = field6050[var3];
                        continue;
                    }
                    if (var621 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class434.method2712(var14, var3, field6050, true);
                        field6050[var3++] = var15;
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
                        class54 var17 = class100.method586((byte) 18, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field693];
                        String[] var19 = new String[var17.field701];
                        for (int var20 = 0; var20 < var17.field694; var20++) {
                            var18[var20] = field6057[var2 + var20 - var17.field694];
                        }
                        for (int var21 = 0; var21 < var17.field704; var21++) {
                            var19[var21] = field6050[var3 + var21 - var17.field704];
                        }
                        var2 -= var17.field694;
                        var3 -= var17.field704;
                        class110 var22 = new class110();
                        var22.field1420 = arg0;
                        var22.field1427 = var4;
                        var22.field1430 = field6047;
                        var22.field1423 = field6044;
                        if (field6058 >= field6046.length) {
                            throw new RuntimeException();
                        }
                        field6046[field6058++] = var22;
                        arg0 = var17;
                        var5 = var17.field697;
                        var6 = var17.field700;
                        var4 = -1;
                        field6047 = var18;
                        field6044 = var19;
                        continue;
                    }
                    if (var621 == 42) {
                        field6057[var2++] = class114.field1471[var6[var4]];
                        continue;
                    }
                    if (var621 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class114.field1471[var23] = field6057[var2];
                        class430.method2680(var23, 0);
                        class242.field3580 |= class442.field6334[var23];
                        continue;
                    }
                    if (var621 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field6057[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field6048[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4487;
                                }
                                field6064[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field6057[var2];
                        if (var30 >= 0 && var30 < field6048[var29]) {
                            field6057[var2++] = field6064[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field6057[var2];
                        if (var32 >= 0 && var32 < field6048[var31]) {
                            field6064[var31][var32] = field6057[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 47) {
                        String var33 = class253.field3750[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field6050[var3++] = var33;
                        continue;
                    }
                    if (var621 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class253.field3750[var34] = field6050[var3];
                        class396.method2487(var34, (byte) -30);
                        continue;
                    }
                    if (var621 == 51) {
                        class191 var35 = arg0.field692[var6[var4]];
                        var2--;
                        class24 var36 = (class24) var35.method1373((long) field6057[var2], -49);
                        if (var36 != null) {
                            var4 += var36.field299;
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
                        int var38 = field6057[var2];
                        int var39 = field6057[var2 + 1];
                        int var40 = field6057[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class223 var41 = class438.method2732(var38, 0);
                        if (var41.field3246 == null) {
                            var41.field3246 = new class223[var40 + 1];
                        }
                        if (var41.field3246.length <= var40) {
                            class223[] var42 = new class223[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3246.length; var43++) {
                                var42[var43] = var41.field3246[var43];
                            }
                            var41.field3246 = var42;
                        }
                        if (var40 > 0 && var41.field3246[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class223 var44 = new class223();
                        var44.field3208 = var39;
                        var44.field3212 = var44.field3227 = var41.field3227;
                        var44.field3344 = var40;
                        var41.field3246[var40] = var44;
                        if (var37) {
                            field6049 = var44;
                        } else {
                            field6052 = var44;
                        }
                        class245.method1701(var41, (byte) -94);
                        continue;
                    }
                    if (var621 == 101) {
                        class223 var45 = var37 ? field6049 : field6052;
                        if (var45.field3344 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class223 var46 = class438.method2732(var45.field3227, 0);
                        var46.field3246[var45.field3344] = null;
                        class245.method1701(var46, (byte) -94);
                        continue;
                    }
                    if (var621 == 102) {
                        var2--;
                        class223 var47 = class438.method2732(field6057[var2], 0);
                        var47.field3246 = null;
                        class245.method1701(var47, (byte) -94);
                        continue;
                    }
                    if (var621 == 200) {
                        var2 -= 2;
                        int var48 = field6057[var2];
                        int var49 = field6057[var2 + 1];
                        class223 var50 = class299.method2016(var49, var48, (byte) 124);
                        if (var50 != null && var49 != -1) {
                            field6057[var2++] = 1;
                            if (var37) {
                                field6049 = var50;
                            } else {
                                field6052 = var50;
                            }
                            continue;
                        }
                        field6057[var2++] = 0;
                        continue;
                    }
                    if (var621 == 201) {
                        var2--;
                        int var51 = field6057[var2];
                        class223 var52 = class438.method2732(var51, 0);
                        if (var52 == null) {
                            field6057[var2++] = 0;
                        } else {
                            field6057[var2++] = 1;
                            if (var37) {
                                field6049 = var52;
                            } else {
                                field6052 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var621 < 500) {
                    if (var621 == 403) {
                        var2 -= 2;
                        int var53 = field6057[var2];
                        int var54 = field6057[var2 + 1];
                        for (int var55 = 0; var55 < class1.field7.length; var55++) {
                            if (class1.field7[var55] == var53) {
                                class181.field2555.field1778.method2024(true, var54, var55);
                                continue label4487;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class384.field5441.length) {
                                continue label4487;
                            }
                            if (class384.field5441[var56] == var53) {
                                class181.field2555.field1778.method2024(true, var54, var56);
                                continue label4487;
                            }
                            var56++;
                        }
                    }
                    if (var621 == 404) {
                        var2 -= 2;
                        int var57 = field6057[var2];
                        int var58 = field6057[var2 + 1];
                        class181.field2555.field1778.method2030(var57, (byte) 122, var58);
                        continue;
                    }
                    if (var621 == 410) {
                        var2--;
                        boolean var59 = field6057[var2] != 0;
                        class181.field2555.field1778.method2028(false, var59);
                        continue;
                    }
                } else if (!(var621 < 1000 || var621 >= 1100) || !(var621 < 2000 || var621 >= 2100)) {
                    class223 var60;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var60 = class438.method2732(field6057[var2], 0);
                    } else {
                        var60 = var37 ? field6049 : field6052;
                    }
                    if (var621 == 1000) {
                        var2 -= 4;
                        var60.field3254 = field6057[var2];
                        var60.field3337 = field6057[var2 + 1];
                        int var61 = field6057[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field6057[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3343 = (byte) var61;
                        var60.field3216 = (byte) var62;
                        class245.method1701(var60, (byte) -94);
                        class15.method95(var60, (byte) 29);
                        if (var60.field3344 == -1) {
                            class409.method2585(var60.field3227, (byte) 125);
                        }
                        continue;
                    }
                    if (var621 == 1001) {
                        var2 -= 4;
                        var60.field3201 = field6057[var2];
                        var60.field3288 = field6057[var2 + 1];
                        var60.field3268 = 0;
                        var60.field3189 = 0;
                        int var63 = field6057[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field6057[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3259 = (byte) var63;
                        var60.field3234 = (byte) var64;
                        class245.method1701(var60, (byte) -94);
                        class15.method95(var60, (byte) 29);
                        if (var60.field3208 == 0) {
                            class380.method2420(var60, false, 0);
                        }
                        continue;
                    }
                    if (var621 == 1003) {
                        var2--;
                        boolean var65 = field6057[var2] == 1;
                        if (var60.field3316 != var65) {
                            var60.field3316 = var65;
                            class245.method1701(var60, (byte) -94);
                        }
                        if (var60.field3344 == -1) {
                            class87.method522(-3, var60.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1004) {
                        var2 -= 2;
                        var60.field3235 = field6057[var2];
                        var60.field3284 = field6057[var2 + 1];
                        class245.method1701(var60, (byte) -94);
                        class15.method95(var60, (byte) 29);
                        if (var60.field3208 == 0) {
                            class380.method2420(var60, false, 0);
                        }
                        continue;
                    }
                    if (var621 == 1005) {
                        var2--;
                        var60.field3194 = field6057[var2] == 1;
                        continue;
                    }
                } else if (!(var621 < 1100 || var621 >= 1200) || !(var621 < 2100 || var621 >= 2200)) {
                    class223 var66;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var66 = class438.method2732(field6057[var2], 0);
                    } else {
                        var66 = var37 ? field6049 : field6052;
                    }
                    if (var621 == 1100) {
                        var2 -= 2;
                        var66.field3341 = field6057[var2];
                        if (var66.field3341 > var66.field3186 - var66.field3250) {
                            var66.field3341 = var66.field3186 - var66.field3250;
                        }
                        if (var66.field3341 < 0) {
                            var66.field3341 = 0;
                        }
                        var66.field3240 = field6057[var2 + 1];
                        if (var66.field3240 > var66.field3289 - var66.field3282) {
                            var66.field3240 = var66.field3289 - var66.field3282;
                        }
                        if (var66.field3240 < 0) {
                            var66.field3240 = 0;
                        }
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class352.method2306(var66.field3227, -27638);
                        }
                        continue;
                    }
                    if (var621 == 1101) {
                        var2--;
                        var66.field3219 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class355.method2322((byte) -14, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1102) {
                        var2--;
                        var66.field3309 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1103) {
                        var2--;
                        var66.field3321 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1104) {
                        var2--;
                        var66.field3317 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1105) {
                        var2--;
                        int var67 = field6057[var2];
                        if (var66.field3339 != var67) {
                            var66.field3339 = var67;
                            class245.method1701(var66, (byte) -94);
                        }
                        if (var66.field3344 == -1) {
                            class220.method1552(1, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1106) {
                        var2--;
                        var66.field3310 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1107) {
                        var2--;
                        var66.field3218 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1108) {
                        var66.field3338 = 1;
                        var2--;
                        var66.field3305 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class269.method1829(4, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1109) {
                        var2 -= 6;
                        var66.field3206 = field6057[var2];
                        var66.field3311 = field6057[var2 + 1];
                        var66.field3237 = field6057[var2 + 2];
                        var66.field3331 = field6057[var2 + 3];
                        var66.field3275 = field6057[var2 + 4];
                        var66.field3265 = field6057[var2 + 5];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class106.method627(8, var66.field3227);
                            class96.method571(10, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1110) {
                        var2--;
                        int var68 = field6057[var2];
                        if (var66.field3199 != var68) {
                            var66.field3199 = var68;
                            var66.field3276 = 0;
                            var66.field3292 = 1;
                            var66.field3267 = 0;
                            class245.method1701(var66, (byte) -94);
                        }
                        if (var66.field3344 == -1) {
                            class85.method510(var66.field3227, 5);
                        }
                        continue;
                    }
                    if (var621 == 1111) {
                        var2--;
                        var66.field3283 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1112) {
                        var3--;
                        String var69 = field6050[var3];
                        if (!var69.equals(var66.field3325)) {
                            var66.field3325 = var69;
                            class245.method1701(var66, (byte) -94);
                        }
                        if (var66.field3344 == -1) {
                            class323.method2136(var66.field3227, false);
                        }
                        continue;
                    }
                    if (var621 == 1113) {
                        var2--;
                        var66.field3252 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class250.method1736(16, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1114) {
                        var2 -= 3;
                        var66.field3228 = field6057[var2];
                        var66.field3198 = field6057[var2 + 1];
                        var66.field3196 = field6057[var2 + 2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1115) {
                        var2--;
                        var66.field3210 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1116) {
                        var2--;
                        var66.field3293 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1117) {
                        var2--;
                        var66.field3332 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1118) {
                        var2--;
                        var66.field3229 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1119) {
                        var2--;
                        var66.field3255 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1120) {
                        var2 -= 2;
                        var66.field3186 = field6057[var2];
                        var66.field3289 = field6057[var2 + 1];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3208 == 0) {
                            class380.method2420(var66, false, 0);
                        }
                        continue;
                    }
                    if (var621 == 1121) {
                        var2 -= 2;
                        var66.field3266 = (short) field6057[var2];
                        var66.field3278 = (short) field6057[var2 + 1];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1122) {
                        var2--;
                        var66.field3333 = field6057[var2] == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1123) {
                        var2--;
                        var66.field3265 = field6057[var2];
                        class245.method1701(var66, (byte) -94);
                        if (var66.field3344 == -1) {
                            class106.method627(8, var66.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1124) {
                        var2--;
                        int var70 = field6057[var2];
                        var66.field3202 = var70 == 1;
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1125) {
                        var2 -= 2;
                        var66.field3297 = field6057[var2];
                        var66.field3224 = field6057[var2 + 1];
                        class245.method1701(var66, (byte) -94);
                        continue;
                    }
                } else if (var621 >= 1200 && var621 < 1300 || var621 >= 2200 && var621 < 2300) {
                    class223 var71;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var71 = class438.method2732(field6057[var2], 0);
                    } else {
                        var71 = var37 ? field6049 : field6052;
                    }
                    class245.method1701(var71, (byte) -94);
                    if (var621 == 1200 || var621 == 1205 || var621 == 1208 || var621 == 1209 || var621 == 1212 || var621 == 1213) {
                        var2 -= 2;
                        int var72 = field6057[var2];
                        int var73 = field6057[var2 + 1];
                        if (var71.field3344 == -1) {
                            class438.method2731(var71.field3227, 112);
                            class106.method627(8, var71.field3227);
                            class96.method571(10, var71.field3227);
                        }
                        if (var72 == -1) {
                            var71.field3338 = 1;
                            var71.field3305 = -1;
                            var71.field3304 = -1;
                            continue;
                        }
                        var71.field3304 = var72;
                        var71.field3314 = var73;
                        if (var621 == 1208 || var621 == 1209) {
                            var71.field3277 = true;
                        } else {
                            var71.field3277 = false;
                        }
                        class409 var74 = class167.method1202(true, var72);
                        var71.field3237 = var74.field5831;
                        var71.field3331 = var74.field5815;
                        var71.field3275 = var74.field5818;
                        var71.field3206 = var74.field5861;
                        var71.field3311 = var74.field5865;
                        var71.field3265 = var74.field5821;
                        if (var621 == 1205 || var621 == 1209) {
                            var71.field3248 = 0;
                        } else if (var621 == 1212 || var621 == 1213) {
                            var71.field3248 = 1;
                        } else {
                            var71.field3248 = 2;
                        }
                        if (var71.field3268 > 0) {
                            var71.field3265 = var71.field3265 * 32 / var71.field3268;
                        } else if (var71.field3201 > 0) {
                            var71.field3265 = var71.field3265 * 32 / var71.field3201;
                        }
                        continue;
                    }
                    if (var621 == 1201) {
                        var71.field3338 = 2;
                        var2--;
                        var71.field3305 = field6057[var2];
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1202) {
                        var71.field3338 = 3;
                        var71.field3305 = -1;
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1203) {
                        var71.field3338 = 6;
                        var2--;
                        var71.field3305 = field6057[var2];
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1204) {
                        var71.field3338 = 5;
                        var2--;
                        var71.field3305 = field6057[var2];
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1206) {
                        var2 -= 4;
                        var71.field3226 = field6057[var2];
                        var71.field3291 = field6057[var2 + 1];
                        var71.field3273 = field6057[var2 + 2];
                        var71.field3244 = field6057[var2 + 3];
                        class245.method1701(var71, (byte) -94);
                        continue;
                    }
                    if (var621 == 1207) {
                        var2 -= 2;
                        var71.field3251 = field6057[var2];
                        var71.field3271 = field6057[var2 + 1];
                        class245.method1701(var71, (byte) -94);
                        continue;
                    }
                    if (var621 == 1210) {
                        var2 -= 4;
                        var71.field3305 = field6057[var2];
                        var71.field3260 = field6057[var2 + 1];
                        if (field6057[var2 + 2] == 1) {
                            var71.field3338 = 9;
                        } else {
                            var71.field3338 = 8;
                        }
                        if (field6057[var2 + 3] == 1) {
                            var71.field3277 = true;
                        } else {
                            var71.field3277 = false;
                        }
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                    if (var621 == 1211) {
                        var71.field3338 = 5;
                        var71.field3305 = 2047;
                        var71.field3260 = 0;
                        if (var71.field3344 == -1) {
                            class269.method1829(4, var71.field3227);
                        }
                        continue;
                    }
                } else if (var621 >= 1300 && var621 < 1400 || var621 >= 2300 && var621 < 2400) {
                    class223 var75;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var75 = class438.method2732(field6057[var2], 0);
                    } else {
                        var75 = var37 ? field6049 : field6052;
                    }
                    if (var621 == 1300) {
                        var2--;
                        int var76 = field6057[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1570(var76, true, field6050[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var621 == 1301) {
                        var2 -= 2;
                        int var77 = field6057[var2];
                        int var78 = field6057[var2 + 1];
                        var75.field3272 = class299.method2016(var78, var77, (byte) 125);
                        continue;
                    }
                    if (var621 == 1302) {
                        var2--;
                        var75.field3253 = field6057[var2] == 1;
                        continue;
                    }
                    if (var621 == 1303) {
                        var2--;
                        var75.field3330 = field6057[var2];
                        continue;
                    }
                    if (var621 == 1304) {
                        var2--;
                        var75.field3335 = field6057[var2];
                        continue;
                    }
                    if (var621 == 1305) {
                        var3--;
                        var75.field3238 = field6050[var3];
                        continue;
                    }
                    if (var621 == 1306) {
                        var3--;
                        var75.field3245 = field6050[var3];
                        continue;
                    }
                    if (var621 == 1307) {
                        var75.field3323 = null;
                        continue;
                    }
                    if (var621 == 1308) {
                        var2--;
                        var75.field3236 = field6057[var2];
                        var2--;
                        var75.field3302 = field6057[var2];
                        continue;
                    }
                    if (var621 == 1309) {
                        var2--;
                        int var79 = field6057[var2];
                        var2--;
                        int var80 = field6057[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1568(var79, -27064, var80 - 1);
                        }
                        continue;
                    }
                    if (var621 == 1310) {
                        var3--;
                        var75.field3294 = field6050[var3];
                        continue;
                    }
                    if (var621 == 1311) {
                        var2--;
                        var75.field3185 = field6057[var2];
                        continue;
                    }
                } else {
                    if (var621 >= 1400 && var621 < 1500 || var621 >= 2400 && var621 < 2500) {
                        class223 var81;
                        if (var621 >= 2000) {
                            var621 -= 1000;
                            var2--;
                            var81 = class438.method2732(field6057[var2], 0);
                        } else {
                            var81 = var37 ? field6049 : field6052;
                        }
                        var3--;
                        String var82 = field6050[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field6057[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field6057[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field6050[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field6057[var2]);
                            }
                        }
                        var2--;
                        int var87 = field6057[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var621 == 1400) {
                            var81.field3188 = var85;
                        } else if (var621 == 1401) {
                            var81.field3336 = var85;
                        } else if (var621 == 1402) {
                            var81.field3298 = var85;
                        } else if (var621 == 1403) {
                            var81.field3328 = var85;
                        } else if (var621 == 1404) {
                            var81.field3285 = var85;
                        } else if (var621 == 1405) {
                            var81.field3296 = var85;
                        } else if (var621 == 1406) {
                            var81.field3334 = var85;
                        } else if (var621 == 1407) {
                            var81.field3209 = var85;
                            var81.field3270 = var83;
                        } else if (var621 == 1408) {
                            var81.field3193 = var85;
                        } else if (var621 == 1409) {
                            var81.field3222 = var85;
                        } else if (var621 == 1410) {
                            var81.field3287 = var85;
                        } else if (var621 == 1411) {
                            var81.field3307 = var85;
                        } else if (var621 == 1412) {
                            var81.field3318 = var85;
                        } else if (var621 == 1414) {
                            var81.field3213 = var85;
                            var81.field3313 = var83;
                        } else if (var621 == 1415) {
                            var81.field3231 = var85;
                            var81.field3247 = var83;
                        } else if (var621 == 1416) {
                            var81.field3232 = var85;
                        } else if (var621 == 1417) {
                            var81.field3301 = var85;
                        } else if (var621 == 1418) {
                            var81.field3261 = var85;
                        } else if (var621 == 1419) {
                            var81.field3249 = var85;
                        } else if (var621 == 1420) {
                            var81.field3197 = var85;
                        } else if (var621 == 1421) {
                            var81.field3280 = var85;
                        } else if (var621 == 1422) {
                            var81.field3320 = var85;
                        } else if (var621 == 1423) {
                            var81.field3279 = var85;
                        } else if (var621 == 1424) {
                            var81.field3306 = var85;
                        } else if (var621 == 1425) {
                            var81.field3262 = var85;
                        } else if (var621 == 1426) {
                            var81.field3242 = var85;
                        } else if (var621 == 1427) {
                            var81.field3215 = var85;
                        } else if (var621 == 1428) {
                            var81.field3217 = var85;
                            var81.field3257 = var83;
                        } else if (var621 == 1429) {
                            var81.field3220 = var85;
                            var81.field3286 = var83;
                        }
                        var81.field3322 = true;
                        continue;
                    }
                    if (var621 < 1600) {
                        class223 var88 = var37 ? field6049 : field6052;
                        if (var621 == 1500) {
                            field6057[var2++] = var88.field3187;
                            continue;
                        }
                        if (var621 == 1501) {
                            field6057[var2++] = var88.field3191;
                            continue;
                        }
                        if (var621 == 1502) {
                            field6057[var2++] = var88.field3250;
                            continue;
                        }
                        if (var621 == 1503) {
                            field6057[var2++] = var88.field3282;
                            continue;
                        }
                        if (var621 == 1504) {
                            field6057[var2++] = var88.field3316 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 1505) {
                            field6057[var2++] = var88.field3212;
                            continue;
                        }
                    } else if (var621 < 1700) {
                        class223 var89 = var37 ? field6049 : field6052;
                        if (var621 == 1600) {
                            field6057[var2++] = var89.field3341;
                            continue;
                        }
                        if (var621 == 1601) {
                            field6057[var2++] = var89.field3240;
                            continue;
                        }
                        if (var621 == 1602) {
                            field6050[var3++] = var89.field3325;
                            continue;
                        }
                        if (var621 == 1603) {
                            field6057[var2++] = var89.field3186;
                            continue;
                        }
                        if (var621 == 1604) {
                            field6057[var2++] = var89.field3289;
                            continue;
                        }
                        if (var621 == 1605) {
                            field6057[var2++] = var89.field3265;
                            continue;
                        }
                        if (var621 == 1606) {
                            field6057[var2++] = var89.field3237;
                            continue;
                        }
                        if (var621 == 1607) {
                            field6057[var2++] = var89.field3275;
                            continue;
                        }
                        if (var621 == 1608) {
                            field6057[var2++] = var89.field3331;
                            continue;
                        }
                        if (var621 == 1609) {
                            field6057[var2++] = var89.field3321;
                            continue;
                        }
                        if (var621 == 1610) {
                            field6057[var2++] = var89.field3206;
                            continue;
                        }
                        if (var621 == 1611) {
                            field6057[var2++] = var89.field3311;
                            continue;
                        }
                        if (var621 == 1612) {
                            field6057[var2++] = var89.field3339;
                            continue;
                        }
                    } else if (var621 < 1800) {
                        class223 var90 = var37 ? field6049 : field6052;
                        if (var621 == 1700) {
                            field6057[var2++] = var90.field3304;
                            continue;
                        }
                        if (var621 == 1701) {
                            if (var90.field3304 == -1) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var90.field3314;
                            }
                            continue;
                        }
                        if (var621 == 1702) {
                            field6057[var2++] = var90.field3344;
                            continue;
                        }
                    } else if (var621 < 1900) {
                        class223 var91 = var37 ? field6049 : field6052;
                        if (var621 == 1800) {
                            field6057[var2++] = client.method1168(var91).method488(2);
                            continue;
                        }
                        if (var621 == 1801) {
                            var2--;
                            int var92 = field6057[var2];
                            int var622 = var92 - 1;
                            if (var91.field3323 != null && var622 < var91.field3323.length && var91.field3323[var622] != null) {
                                field6050[var3++] = var91.field3323[var622];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 1802) {
                            if (var91.field3238 == null) {
                                field6050[var3++] = "";
                            } else {
                                field6050[var3++] = var91.field3238;
                            }
                            continue;
                        }
                    } else if (var621 < 2600) {
                        var2--;
                        class223 var93 = class438.method2732(field6057[var2], 0);
                        if (var621 == 2500) {
                            field6057[var2++] = var93.field3187;
                            continue;
                        }
                        if (var621 == 2501) {
                            field6057[var2++] = var93.field3191;
                            continue;
                        }
                        if (var621 == 2502) {
                            field6057[var2++] = var93.field3250;
                            continue;
                        }
                        if (var621 == 2503) {
                            field6057[var2++] = var93.field3282;
                            continue;
                        }
                        if (var621 == 2504) {
                            field6057[var2++] = var93.field3316 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 2505) {
                            field6057[var2++] = var93.field3212;
                            continue;
                        }
                    } else if (var621 < 2700) {
                        var2--;
                        class223 var94 = class438.method2732(field6057[var2], 0);
                        if (var621 == 2600) {
                            field6057[var2++] = var94.field3341;
                            continue;
                        }
                        if (var621 == 2601) {
                            field6057[var2++] = var94.field3240;
                            continue;
                        }
                        if (var621 == 2602) {
                            field6050[var3++] = var94.field3325;
                            continue;
                        }
                        if (var621 == 2603) {
                            field6057[var2++] = var94.field3186;
                            continue;
                        }
                        if (var621 == 2604) {
                            field6057[var2++] = var94.field3289;
                            continue;
                        }
                        if (var621 == 2605) {
                            field6057[var2++] = var94.field3265;
                            continue;
                        }
                        if (var621 == 2606) {
                            field6057[var2++] = var94.field3237;
                            continue;
                        }
                        if (var621 == 2607) {
                            field6057[var2++] = var94.field3275;
                            continue;
                        }
                        if (var621 == 2608) {
                            field6057[var2++] = var94.field3331;
                            continue;
                        }
                        if (var621 == 2609) {
                            field6057[var2++] = var94.field3321;
                            continue;
                        }
                        if (var621 == 2610) {
                            field6057[var2++] = var94.field3206;
                            continue;
                        }
                        if (var621 == 2611) {
                            field6057[var2++] = var94.field3311;
                            continue;
                        }
                        if (var621 == 2612) {
                            field6057[var2++] = var94.field3339;
                            continue;
                        }
                    } else if (var621 < 2800) {
                        if (var621 == 2700) {
                            var2--;
                            class223 var95 = class438.method2732(field6057[var2], 0);
                            field6057[var2++] = var95.field3304;
                            continue;
                        }
                        if (var621 == 2701) {
                            var2--;
                            class223 var96 = class438.method2732(field6057[var2], 0);
                            if (var96.field3304 == -1) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var96.field3314;
                            }
                            continue;
                        }
                        if (var621 == 2702) {
                            var2--;
                            int var97 = field6057[var2];
                            class253 var98 = (class253) class318.field4662.method1373((long) var97, -17);
                            if (var98 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = 1;
                            }
                            continue;
                        }
                        if (var621 == 2703) {
                            var2--;
                            class223 var99 = class438.method2732(field6057[var2], 0);
                            if (var99.field3246 == null) {
                                field6057[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field3246.length;
                            for (int var101 = 0; var101 < var99.field3246.length; var101++) {
                                if (var99.field3246[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field6057[var2++] = var100;
                            continue;
                        }
                        if (var621 == 2704 || var621 == 2705) {
                            var2 -= 2;
                            int var102 = field6057[var2];
                            int var103 = field6057[var2 + 1];
                            class253 var104 = (class253) class318.field4662.method1373((long) var102, 119);
                            if (var104 != null && var104.field3746 == var103) {
                                field6057[var2++] = 1;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                    } else if (var621 < 2900) {
                        var2--;
                        class223 var105 = class438.method2732(field6057[var2], 0);
                        if (var621 == 2800) {
                            field6057[var2++] = client.method1168(var105).method488(2);
                            continue;
                        }
                        if (var621 == 2801) {
                            var2--;
                            int var106 = field6057[var2];
                            int var623 = var106 - 1;
                            if (var105.field3323 != null && var623 < var105.field3323.length && var105.field3323[var623] != null) {
                                field6050[var3++] = var105.field3323[var623];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 2802) {
                            if (var105.field3238 == null) {
                                field6050[var3++] = "";
                            } else {
                                field6050[var3++] = var105.field3238;
                            }
                            continue;
                        }
                    } else if (var621 < 3200) {
                        if (var621 == 3100) {
                            var3--;
                            String var107 = field6050[var3];
                            class154.method1135(var107, (byte) -109);
                            continue;
                        }
                        if (var621 == 3101) {
                            var2 -= 2;
                            class135.method1036(class181.field2555, field6057[var2 + 1], (byte) -35, field6057[var2]);
                            continue;
                        }
                        if (var621 == 3103) {
                            class294.method1989(true, 179);
                            continue;
                        }
                        if (var621 == 3104) {
                            var3--;
                            String var108 = field6050[var3];
                            int var109 = 0;
                            if (class376.method2398(153949057, var108)) {
                                var109 = class333.method2184(-1, var108);
                            }
                            field6051++;
                            class407.field5761.method2048(2040, 95);
                            class407.field5761.method849(var109, (byte) -123);
                            continue;
                        }
                        if (var621 == 3105) {
                            var3--;
                            String var110 = field6050[var3];
                            field6062++;
                            class407.field5761.method2048(2040, 55);
                            class407.field5761.method831(var110.length() + 1, (byte) -48);
                            class407.field5761.method807((byte) 124, var110);
                            continue;
                        }
                        if (var621 == 3106) {
                            var3--;
                            String var111 = field6050[var3];
                            field6063++;
                            class407.field5761.method2048(2040, 134);
                            class407.field5761.method831(var111.length() + 1, (byte) -60);
                            class407.field5761.method807((byte) 124, var111);
                            continue;
                        }
                        if (var621 == 3107) {
                            var2--;
                            int var112 = field6057[var2];
                            var3--;
                            String var113 = field6050[var3];
                            class114.method686(27556, var112, var113);
                            continue;
                        }
                        if (var621 == 3108) {
                            var2 -= 3;
                            int var114 = field6057[var2];
                            int var115 = field6057[var2 + 1];
                            int var116 = field6057[var2 + 2];
                            class223 var117 = class438.method2732(var116, 0);
                            class316.method2111(var114, false, var115, var117);
                            continue;
                        }
                        if (var621 == 3109) {
                            var2 -= 2;
                            int var118 = field6057[var2];
                            int var119 = field6057[var2 + 1];
                            class223 var120 = var37 ? field6049 : field6052;
                            class316.method2111(var118, false, var119, var120);
                            continue;
                        }
                        if (var621 == 3110) {
                            var2--;
                            int var121 = field6057[var2];
                            field6055++;
                            class407.field5761.method2048(2040, 6);
                            class407.field5761.method799(var121, 54);
                            continue;
                        }
                        if (var621 == 3111) {
                            var2 -= 2;
                            int var122 = field6057[var2];
                            int var123 = field6057[var2 + 1];
                            class253 var124 = (class253) class318.field4662.method1373((long) var122, 121);
                            if (var124 != null) {
                                class102.method596(var124.field3746 != var123, true, var124, true);
                            }
                            class91.method541(var122, var123, 3, (byte) 7, true);
                            continue;
                        }
                        if (var621 == 3112) {
                            var2--;
                            int var125 = field6057[var2];
                            class253 var126 = (class253) class318.field4662.method1373((long) var125, 120);
                            if (var126 != null && var126.field3748 == 3) {
                                class102.method596(true, true, var126, true);
                            }
                            continue;
                        }
                    } else if (var621 < 3300) {
                        if (var621 == 3200) {
                            var2 -= 3;
                            class24.method132(field6057[var2 + 2], 255, field6057[var2 + 1], field6057[var2], -1);
                            continue;
                        }
                        if (var621 == 3201) {
                            var2--;
                            class134.method1032(field6057[var2], (byte) 41, 255);
                            continue;
                        }
                        if (var621 == 3202) {
                            var2 -= 2;
                            class24.method131(255, field6057[var2], -11494, field6057[var2 + 1]);
                            continue;
                        }
                    } else if (var621 < 3400) {
                        if (var621 == 3300) {
                            field6057[var2++] = class34.field434;
                            continue;
                        }
                        if (var621 == 3301) {
                            var2 -= 2;
                            int var127 = field6057[var2];
                            int var128 = field6057[var2 + 1];
                            field6057[var2++] = class438.method2734(var128, var127, false, false);
                            continue;
                        }
                        if (var621 == 3302) {
                            var2 -= 2;
                            int var129 = field6057[var2];
                            int var130 = field6057[var2 + 1];
                            field6057[var2++] = class347.method2275(true, var130, false, var129);
                            continue;
                        }
                        if (var621 == 3303) {
                            var2 -= 2;
                            int var131 = field6057[var2];
                            int var132 = field6057[var2 + 1];
                            field6057[var2++] = class170.method1217((byte) -68, false, var131, var132);
                            continue;
                        }
                        if (var621 == 3304) {
                            var2--;
                            int var133 = field6057[var2];
                            field6057[var2++] = class249.method1731(var133, 5).field5390;
                            continue;
                        }
                        if (var621 == 3305) {
                            var2--;
                            int var134 = field6057[var2];
                            field6057[var2++] = class276.field3978[var134];
                            continue;
                        }
                        if (var621 == 3306) {
                            var2--;
                            int var135 = field6057[var2];
                            field6057[var2++] = class435.field6211[var135];
                            continue;
                        }
                        if (var621 == 3307) {
                            var2--;
                            int var136 = field6057[var2];
                            field6057[var2++] = class448.field6396[var136];
                            continue;
                        }
                        if (var621 == 3308) {
                            int var137 = class158.field2302;
                            int var138 = (class181.field2555.field4463 >> 7) + class306.field4459;
                            int var139 = (class181.field2555.field4466 >> 7) + class342.field4959;
                            field6057[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var621 == 3309) {
                            var2--;
                            int var140 = field6057[var2];
                            field6057[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3310) {
                            var2--;
                            int var141 = field6057[var2];
                            field6057[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var621 == 3311) {
                            var2--;
                            int var142 = field6057[var2];
                            field6057[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3312) {
                            field6057[var2++] = class311.field4503 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3313) {
                            var2 -= 2;
                            int var143 = field6057[var2];
                            int var144 = field6057[var2 + 1];
                            field6057[var2++] = class438.method2734(var144, var143, false, true);
                            continue;
                        }
                        if (var621 == 3314) {
                            var2 -= 2;
                            int var145 = field6057[var2];
                            int var146 = field6057[var2 + 1];
                            field6057[var2++] = class347.method2275(true, var146, true, var145);
                            continue;
                        }
                        if (var621 == 3315) {
                            var2 -= 2;
                            int var147 = field6057[var2];
                            int var148 = field6057[var2 + 1];
                            field6057[var2++] = class170.method1217((byte) -68, true, var147, var148);
                            continue;
                        }
                        if (var621 == 3316) {
                            if (class316.field4628 >= 2) {
                                field6057[var2++] = class316.field4628;
                            } else {
                                field6057[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 3317) {
                            field6057[var2++] = class270.field3952;
                            continue;
                        }
                        if (var621 == 3318) {
                            field6057[var2++] = class426.field6087;
                            continue;
                        }
                        if (var621 == 3321) {
                            field6057[var2++] = class357.field5161;
                            continue;
                        }
                        if (var621 == 3322) {
                            field6057[var2++] = class199.field2843;
                            continue;
                        }
                        if (var621 == 3323) {
                            if (class325.field4725 >= 5 && class325.field4725 <= 9) {
                                field6057[var2++] = 1;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3324) {
                            if (class325.field4725 >= 5 && class325.field4725 <= 9) {
                                field6057[var2++] = class325.field4725;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3325) {
                            field6057[var2++] = class282.field4061 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3326) {
                            field6057[var2++] = class181.field2555.field1776;
                            continue;
                        }
                        if (var621 == 3327) {
                            field6057[var2++] = class181.field2555.field1778.field4383 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3328) {
                            field6057[var2++] = class138.field2117 && !class335.field4874 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3329) {
                            field6057[var2++] = class148.field2211 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3330) {
                            var2--;
                            int var149 = field6057[var2];
                            field6057[var2++] = class148.method1094(false, var149, (byte) 71);
                            continue;
                        }
                        if (var621 == 3331) {
                            var2 -= 2;
                            int var150 = field6057[var2];
                            int var151 = field6057[var2 + 1];
                            field6057[var2++] = class448.method2792(false, var150, (byte) -114, var151, false);
                            continue;
                        }
                        if (var621 == 3332) {
                            var2 -= 2;
                            int var152 = field6057[var2];
                            int var153 = field6057[var2 + 1];
                            field6057[var2++] = class448.method2792(false, var152, (byte) 89, var153, true);
                            continue;
                        }
                        if (var621 == 3333) {
                            field6057[var2++] = class323.field4707;
                            continue;
                        }
                        if (var621 == 3335) {
                            field6057[var2++] = class309.field4497;
                            continue;
                        }
                        if (var621 == 3336) {
                            var2 -= 4;
                            int var154 = field6057[var2];
                            int var155 = field6057[var2 + 1];
                            int var156 = field6057[var2 + 2];
                            int var157 = field6057[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field6057[var2++] = var160;
                            continue;
                        }
                        if (var621 == 3337) {
                            field6057[var2++] = class363.field5213;
                            continue;
                        }
                        if (var621 == 3338) {
                            field6057[var2++] = class245.method1709((byte) -125);
                            continue;
                        }
                    } else if (var621 < 3500) {
                        if (var621 == 3400) {
                            var2 -= 2;
                            int var161 = field6057[var2];
                            int var162 = field6057[var2 + 1];
                            class294 var163 = class445.method2772(var161, 0);
                            field6050[var3++] = var163.method1993(var162, (byte) -74);
                            continue;
                        }
                        if (var621 == 3408) {
                            var2 -= 4;
                            int var164 = field6057[var2];
                            int var165 = field6057[var2 + 1];
                            int var166 = field6057[var2 + 2];
                            int var167 = field6057[var2 + 3];
                            class294 var168 = class445.method2772(var166, 0);
                            if (var168.field4256 == var164 && var168.field4262 == var165) {
                                if (var165 == 115) {
                                    field6050[var3++] = var168.method1993(var167, (byte) -97);
                                } else {
                                    field6057[var2++] = var168.method1984(var167, 2);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var621 == 3409) {
                            var2 -= 3;
                            int var169 = field6057[var2];
                            int var170 = field6057[var2 + 1];
                            int var171 = field6057[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class294 var172 = class445.method2772(var170, 0);
                            if (var172.field4262 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field6057[var2++] = var172.method1994(true, var171) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3410) {
                            var2--;
                            int var173 = field6057[var2];
                            var3--;
                            String var174 = field6050[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class294 var175 = class445.method2772(var173, 0);
                            if (var175.field4262 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field6057[var2++] = var175.method1987(6, var174) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3411) {
                            var2--;
                            int var176 = field6057[var2];
                            class294 var177 = class445.method2772(var176, 0);
                            field6057[var2++] = var177.field4261.method1375(117);
                            continue;
                        }
                    } else if (var621 < 3700) {
                        if (var621 == 3600) {
                            if (class120.field1623 == 0) {
                                field6057[var2++] = -2;
                            } else if (class120.field1623 == 1) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = class206.field2897;
                            }
                            continue;
                        }
                        if (var621 == 3601) {
                            var2--;
                            int var178 = field6057[var2];
                            if (class120.field1623 == 2 && var178 < class206.field2897) {
                                field6050[var3++] = class56.field743[var178];
                                if (class366.field5231[var178] == null) {
                                    field6050[var3++] = "";
                                } else {
                                    field6050[var3++] = class366.field5231[var178];
                                }
                                continue;
                            }
                            field6050[var3++] = "";
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3602) {
                            var2--;
                            int var179 = field6057[var2];
                            if (class120.field1623 == 2 && var179 < class206.field2897) {
                                field6057[var2++] = class275.field3973[var179];
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3603) {
                            var2--;
                            int var180 = field6057[var2];
                            if (class120.field1623 == 2 && var180 < class206.field2897) {
                                field6057[var2++] = class206.field2904[var180];
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3604) {
                            var3--;
                            String var181 = field6050[var3];
                            var2--;
                            int var182 = field6057[var2];
                            class377.method2407(var181, var182, (byte) 76);
                            continue;
                        }
                        if (var621 == 3605) {
                            var3--;
                            String var183 = field6050[var3];
                            class246.method1719(93, var183);
                            continue;
                        }
                        if (var621 == 3606) {
                            var3--;
                            String var184 = field6050[var3];
                            class377.method2403(var184, -101);
                            continue;
                        }
                        if (var621 == 3607) {
                            var3--;
                            String var185 = field6050[var3];
                            class92.method550((byte) 80, var185, false);
                            continue;
                        }
                        if (var621 == 3608) {
                            var3--;
                            String var186 = field6050[var3];
                            class103.method601(var186, true);
                            continue;
                        }
                        if (var621 == 3609) {
                            var3--;
                            String var187 = field6050[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field6057[var2++] = class406.method2548(var187, (byte) -57) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3610) {
                            var2--;
                            int var188 = field6057[var2];
                            if (class120.field1623 == 2 && var188 < class206.field2897) {
                                field6050[var3++] = class64.field881[var188];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3611) {
                            if (class384.field5442 == null) {
                                field6050[var3++] = "";
                            } else {
                                field6050[var3++] = class215.method1506((byte) -105, class384.field5442);
                            }
                            continue;
                        }
                        if (var621 == 3612) {
                            if (class384.field5442 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = class224.field3349;
                            }
                            continue;
                        }
                        if (var621 == 3613) {
                            var2--;
                            int var189 = field6057[var2];
                            if (class384.field5442 != null && var189 < class224.field3349) {
                                field6050[var3++] = class428.field6093[var189].field4281;
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3614) {
                            var2--;
                            int var190 = field6057[var2];
                            if (class384.field5442 != null && var190 < class224.field3349) {
                                field6057[var2++] = class428.field6093[var190].field4280;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3615) {
                            var2--;
                            int var191 = field6057[var2];
                            if (class384.field5442 != null && var191 < class224.field3349) {
                                field6057[var2++] = class428.field6093[var191].field4276;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3616) {
                            field6057[var2++] = class92.field1181;
                            continue;
                        }
                        if (var621 == 3617) {
                            var3--;
                            String var192 = field6050[var3];
                            class382.method2433(-5263, var192);
                            continue;
                        }
                        if (var621 == 3618) {
                            field6057[var2++] = class382.field5423;
                            continue;
                        }
                        if (var621 == 3619) {
                            var3--;
                            String var193 = field6050[var3];
                            class386.method2454((byte) 9, var193);
                            continue;
                        }
                        if (var621 == 3620) {
                            class223.method1562(0);
                            continue;
                        }
                        if (var621 == 3621) {
                            if (class120.field1623 == 0) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = class417.field5994;
                            }
                            continue;
                        }
                        if (var621 == 3622) {
                            var2--;
                            int var194 = field6057[var2];
                            if (class120.field1623 != 0 && var194 < class417.field5994) {
                                field6050[var3++] = class137.field2109[var194];
                                if (class434.field6200[var194] == null) {
                                    field6050[var3++] = "";
                                } else {
                                    field6050[var3++] = class434.field6200[var194];
                                }
                                continue;
                            }
                            field6050[var3++] = "";
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3623) {
                            var3--;
                            String var195 = field6050[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field6057[var2++] = class101.method591(119, var195) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3624) {
                            var2--;
                            int var196 = field6057[var2];
                            if (class428.field6093 != null && var196 < class224.field3349 && class428.field6093[var196].field4273.equalsIgnoreCase(class181.field2555.field1790)) {
                                field6057[var2++] = 1;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3625) {
                            if (class408.field5790 == null) {
                                field6050[var3++] = "";
                            } else {
                                field6050[var3++] = class408.field5790;
                            }
                            continue;
                        }
                        if (var621 == 3626) {
                            var2--;
                            int var197 = field6057[var2];
                            if (class384.field5442 != null && var197 < class224.field3349) {
                                field6050[var3++] = class428.field6093[var197].field4279;
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3627) {
                            var2--;
                            int var198 = field6057[var2];
                            if (class120.field1623 == 2 && var198 >= 0 && var198 < class206.field2897) {
                                field6057[var2++] = class15.field236[var198] ? 1 : 0;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3628) {
                            var3--;
                            String var199 = field6050[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field6057[var2++] = class198.method1407(var199, 3568);
                            continue;
                        }
                        if (var621 == 3629) {
                            field6057[var2++] = class376.field5354;
                            continue;
                        }
                        if (var621 == 3630) {
                            var3--;
                            String var200 = field6050[var3];
                            class92.method550((byte) 41, var200, true);
                            continue;
                        }
                        if (var621 == 3631) {
                            var2--;
                            int var201 = field6057[var2];
                            field6057[var2++] = class398.field5595[var201] ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3632) {
                            var2--;
                            int var202 = field6057[var2];
                            if (class384.field5442 != null && var202 < class224.field3349) {
                                field6050[var3++] = class428.field6093[var202].field4273;
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 3633) {
                            var2--;
                            int var203 = field6057[var2];
                            if (class120.field1623 != 0 && var203 < class417.field5994) {
                                field6050[var3++] = class289.field4207[var203];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                    } else if (var621 < 4000) {
                        if (var621 == 3903) {
                            var2--;
                            int var204 = field6057[var2];
                            field6057[var2++] = class135.field2091[var204].method1518((byte) -46);
                            continue;
                        }
                        if (var621 == 3904) {
                            var2--;
                            int var205 = field6057[var2];
                            field6057[var2++] = class135.field2091[var205].field3135;
                            continue;
                        }
                        if (var621 == 3905) {
                            var2--;
                            int var206 = field6057[var2];
                            field6057[var2++] = class135.field2091[var206].field3128;
                            continue;
                        }
                        if (var621 == 3906) {
                            var2--;
                            int var207 = field6057[var2];
                            field6057[var2++] = class135.field2091[var207].field3126;
                            continue;
                        }
                        if (var621 == 3907) {
                            var2--;
                            int var208 = field6057[var2];
                            field6057[var2++] = class135.field2091[var208].field3127;
                            continue;
                        }
                        if (var621 == 3908) {
                            var2--;
                            int var209 = field6057[var2];
                            field6057[var2++] = class135.field2091[var209].field3130;
                            continue;
                        }
                        if (var621 == 3910) {
                            var2--;
                            int var210 = field6057[var2];
                            int var211 = class135.field2091[var210].method1516((byte) 108);
                            field6057[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3911) {
                            var2--;
                            int var212 = field6057[var2];
                            int var213 = class135.field2091[var212].method1516((byte) 69);
                            field6057[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3912) {
                            var2--;
                            int var214 = field6057[var2];
                            int var215 = class135.field2091[var214].method1516((byte) 113);
                            field6057[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3913) {
                            var2--;
                            int var216 = field6057[var2];
                            int var217 = class135.field2091[var216].method1516((byte) 92);
                            field6057[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 4100) {
                        if (var621 == 4000) {
                            var2 -= 2;
                            int var218 = field6057[var2];
                            int var219 = field6057[var2 + 1];
                            field6057[var2++] = var218 + var219;
                            continue;
                        }
                        if (var621 == 4001) {
                            var2 -= 2;
                            int var220 = field6057[var2];
                            int var221 = field6057[var2 + 1];
                            field6057[var2++] = var220 - var221;
                            continue;
                        }
                        if (var621 == 4002) {
                            var2 -= 2;
                            int var222 = field6057[var2];
                            int var223 = field6057[var2 + 1];
                            field6057[var2++] = var222 * var223;
                            continue;
                        }
                        if (var621 == 4003) {
                            var2 -= 2;
                            int var224 = field6057[var2];
                            int var225 = field6057[var2 + 1];
                            field6057[var2++] = var224 / var225;
                            continue;
                        }
                        if (var621 == 4004) {
                            var2--;
                            int var226 = field6057[var2];
                            field6057[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var621 == 4005) {
                            var2--;
                            int var227 = field6057[var2];
                            field6057[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var621 == 4006) {
                            var2 -= 5;
                            int var228 = field6057[var2];
                            int var229 = field6057[var2 + 1];
                            int var230 = field6057[var2 + 2];
                            int var231 = field6057[var2 + 3];
                            int var232 = field6057[var2 + 4];
                            field6057[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var621 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field6057[var2];
                            long var235 = (long) field6057[var2 + 1];
                            field6057[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var621 == 4008) {
                            var2 -= 2;
                            int var237 = field6057[var2];
                            int var238 = field6057[var2 + 1];
                            field6057[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var621 == 4009) {
                            var2 -= 2;
                            int var239 = field6057[var2];
                            int var240 = field6057[var2 + 1];
                            field6057[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var621 == 4010) {
                            var2 -= 2;
                            int var241 = field6057[var2];
                            int var242 = field6057[var2 + 1];
                            field6057[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 4011) {
                            var2 -= 2;
                            int var243 = field6057[var2];
                            int var244 = field6057[var2 + 1];
                            field6057[var2++] = var243 % var244;
                            continue;
                        }
                        if (var621 == 4012) {
                            var2 -= 2;
                            int var245 = field6057[var2];
                            int var246 = field6057[var2 + 1];
                            if (var245 == 0) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var621 == 4013) {
                            var2 -= 2;
                            int var247 = field6057[var2];
                            int var248 = field6057[var2 + 1];
                            if (var247 == 0) {
                                field6057[var2++] = 0;
                            } else if (var248 == 0) {
                                field6057[var2++] = Integer.MAX_VALUE;
                            } else {
                                field6057[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var621 == 4014) {
                            var2 -= 2;
                            int var249 = field6057[var2];
                            int var250 = field6057[var2 + 1];
                            field6057[var2++] = var249 & var250;
                            continue;
                        }
                        if (var621 == 4015) {
                            var2 -= 2;
                            int var251 = field6057[var2];
                            int var252 = field6057[var2 + 1];
                            field6057[var2++] = var251 | var252;
                            continue;
                        }
                        if (var621 == 4016) {
                            var2 -= 2;
                            int var253 = field6057[var2];
                            int var254 = field6057[var2 + 1];
                            field6057[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var621 == 4017) {
                            var2 -= 2;
                            int var255 = field6057[var2];
                            int var256 = field6057[var2 + 1];
                            field6057[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var621 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field6057[var2];
                            long var259 = (long) field6057[var2 + 1];
                            long var261 = (long) field6057[var2 + 2];
                            field6057[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var621 < 4200) {
                        if (var621 == 4100) {
                            var3--;
                            String var263 = field6050[var3];
                            var2--;
                            int var264 = field6057[var2];
                            field6050[var3++] = var263 + var264;
                            continue;
                        }
                        if (var621 == 4101) {
                            var3 -= 2;
                            String var265 = field6050[var3];
                            String var266 = field6050[var3 + 1];
                            field6050[var3++] = var265 + var266;
                            continue;
                        }
                        if (var621 == 4102) {
                            var3--;
                            String var267 = field6050[var3];
                            var2--;
                            int var268 = field6057[var2];
                            field6050[var3++] = var267 + class134.method1034((byte) 27, var268, true);
                            continue;
                        }
                        if (var621 == 4103) {
                            var3--;
                            String var269 = field6050[var3];
                            field6050[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var621 == 4104) {
                            var2--;
                            int var270 = field6057[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field6045.setTime(new Date(var271));
                            int var273 = field6045.get(5);
                            int var274 = field6045.get(2);
                            int var275 = field6045.get(1);
                            field6050[var3++] = var273 + "-" + field6066[var274] + "-" + var275;
                            continue;
                        }
                        if (var621 == 4105) {
                            var3 -= 2;
                            String var276 = field6050[var3];
                            String var277 = field6050[var3 + 1];
                            if (class181.field2555.field1778 != null && class181.field2555.field1778.field4383) {
                                field6050[var3++] = var277;
                                continue;
                            }
                            field6050[var3++] = var276;
                            continue;
                        }
                        if (var621 == 4106) {
                            var2--;
                            int var278 = field6057[var2];
                            field6050[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var621 == 4107) {
                            var3 -= 2;
                            field6057[var2++] = class327.method2149(field6050[var3 + 1], (byte) 113, field6050[var3], class309.field4497);
                            continue;
                        }
                        if (var621 == 4108) {
                            var3--;
                            String var279 = field6050[var3];
                            var2 -= 2;
                            int var280 = field6057[var2];
                            int var281 = field6057[var2 + 1];
                            class182 var282 = class432.method2699(0, class327.field4745, var281, (byte) -90);
                            field6057[var2++] = var282.method1299((byte) 61, var280, class120.field1622, var279);
                            continue;
                        }
                        if (var621 == 4109) {
                            var3--;
                            String var283 = field6050[var3];
                            var2 -= 2;
                            int var284 = field6057[var2];
                            int var285 = field6057[var2 + 1];
                            class182 var286 = class432.method2699(0, class327.field4745, var285, (byte) -90);
                            field6057[var2++] = var286.method1308(0, var283, class120.field1622, var284);
                            continue;
                        }
                        if (var621 == 4110) {
                            var3 -= 2;
                            String var287 = field6050[var3];
                            String var288 = field6050[var3 + 1];
                            var2--;
                            if (field6057[var2] == 1) {
                                field6050[var3++] = var287;
                            } else {
                                field6050[var3++] = var288;
                            }
                            continue;
                        }
                        if (var621 == 4111) {
                            var3--;
                            String var289 = field6050[var3];
                            field6050[var3++] = class169.method1209(var289, -37);
                            continue;
                        }
                        if (var621 == 4112) {
                            var3--;
                            String var290 = field6050[var3];
                            var2--;
                            int var291 = field6057[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field6050[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var621 == 4113) {
                            var2--;
                            int var292 = field6057[var2];
                            field6057[var2++] = class317.method2113(false, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4114) {
                            var2--;
                            int var293 = field6057[var2];
                            field6057[var2++] = class186.method1334(97, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4115) {
                            var2--;
                            int var294 = field6057[var2];
                            field6057[var2++] = class127.method767(119, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4116) {
                            var2--;
                            int var295 = field6057[var2];
                            field6057[var2++] = class214.method1494(48, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4117) {
                            var3--;
                            String var296 = field6050[var3];
                            if (var296 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var621 == 4118) {
                            var3--;
                            String var297 = field6050[var3];
                            var2 -= 2;
                            int var298 = field6057[var2];
                            int var299 = field6057[var2 + 1];
                            field6050[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var621 == 4119) {
                            var3--;
                            String var300 = field6050[var3];
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
                            field6050[var3++] = var301.toString();
                            continue;
                        }
                        if (var621 == 4120) {
                            var3--;
                            String var305 = field6050[var3];
                            var2 -= 2;
                            int var306 = field6057[var2];
                            int var307 = field6057[var2 + 1];
                            field6057[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var621 == 4121) {
                            var3 -= 2;
                            String var308 = field6050[var3];
                            String var309 = field6050[var3 + 1];
                            var2--;
                            int var310 = field6057[var2];
                            field6057[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var621 == 4122) {
                            var2--;
                            int var311 = field6057[var2];
                            field6057[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var621 == 4123) {
                            var2--;
                            int var312 = field6057[var2];
                            field6057[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var621 == 4124) {
                            var2--;
                            boolean var313 = field6057[var2] != 0;
                            var2--;
                            int var314 = field6057[var2];
                            field6050[var3++] = class214.method1498((long) var314, var313, 0, class309.field4497, true);
                            continue;
                        }
                        if (var621 == 4125) {
                            var3--;
                            String var315 = field6050[var3];
                            var2--;
                            int var316 = field6057[var2];
                            class182 var317 = class432.method2699(0, class327.field4745, var316, (byte) -90);
                            field6057[var2++] = var317.method1306(var315, class120.field1622, (byte) -116);
                            continue;
                        }
                    } else if (var621 < 4300) {
                        if (var621 == 4200) {
                            var2--;
                            int var318 = field6057[var2];
                            field6050[var3++] = class167.method1202(true, var318).field5871;
                            continue;
                        }
                        if (var621 == 4201) {
                            var2 -= 2;
                            int var319 = field6057[var2];
                            int var320 = field6057[var2 + 1];
                            class409 var321 = class167.method1202(true, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field5833[var320 - 1] != null) {
                                field6050[var3++] = var321.field5833[var320 - 1];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 4202) {
                            var2 -= 2;
                            int var322 = field6057[var2];
                            int var323 = field6057[var2 + 1];
                            class409 var324 = class167.method1202(true, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field5858[var323 - 1] != null) {
                                field6050[var3++] = var324.field5858[var323 - 1];
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 4203) {
                            var2--;
                            int var325 = field6057[var2];
                            field6057[var2++] = class167.method1202(true, var325).field5868;
                            continue;
                        }
                        if (var621 == 4204) {
                            var2--;
                            int var326 = field6057[var2];
                            field6057[var2++] = class167.method1202(true, var326).field5846 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4205) {
                            var2--;
                            int var327 = field6057[var2];
                            class409 var328 = class167.method1202(true, var327);
                            if (var328.field5840 == -1 && var328.field5845 >= 0) {
                                field6057[var2++] = var328.field5845;
                                continue;
                            }
                            field6057[var2++] = var327;
                            continue;
                        }
                        if (var621 == 4206) {
                            var2--;
                            int var329 = field6057[var2];
                            class409 var330 = class167.method1202(true, var329);
                            if (var330.field5840 >= 0 && var330.field5845 >= 0) {
                                field6057[var2++] = var330.field5845;
                                continue;
                            }
                            field6057[var2++] = var329;
                            continue;
                        }
                        if (var621 == 4207) {
                            var2--;
                            int var331 = field6057[var2];
                            field6057[var2++] = class167.method1202(true, var331).field5843 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4208) {
                            var2 -= 2;
                            int var332 = field6057[var2];
                            int var333 = field6057[var2 + 1];
                            class319 var334 = class58.method378(var333, (byte) 118);
                            if (var334.method2119(90)) {
                                field6050[var3++] = class167.method1202(true, var332).method2593(var334.field4667, 79, var333);
                            } else {
                                field6057[var2++] = class167.method1202(true, var332).method2589(var333, var334.field4668, 26624);
                            }
                            continue;
                        }
                        if (var621 == 4209) {
                            var2 -= 2;
                            int var335 = field6057[var2];
                            int var336 = field6057[var2 + 1] - 1;
                            class409 var337 = class167.method1202(true, var335);
                            if (var337.field5793 == var336) {
                                field6057[var2++] = var337.field5839;
                            } else if (var337.field5852 == var336) {
                                field6057[var2++] = var337.field5836;
                            } else {
                                field6057[var2++] = -1;
                            }
                            continue;
                        }
                        if (var621 == 4210) {
                            var3--;
                            String var338 = field6050[var3];
                            var2--;
                            int var339 = field6057[var2];
                            class445.method2773(var338, (byte) -128, var339 == 1);
                            field6057[var2++] = class324.field4722;
                            continue;
                        }
                        if (var621 == 4211) {
                            if (class297.field4327 != null && class19.field255 < class324.field4722) {
                                field6057[var2++] = class297.field4327[class19.field255++] & 0xFFFF;
                                continue;
                            }
                            field6057[var2++] = -1;
                            continue;
                        }
                        if (var621 == 4212) {
                            class19.field255 = 0;
                            continue;
                        }
                    } else if (var621 < 4400) {
                        if (var621 == 4300) {
                            var2 -= 2;
                            int var340 = field6057[var2];
                            int var341 = field6057[var2 + 1];
                            class319 var342 = class58.method378(var341, (byte) 118);
                            if (var342.method2119(37)) {
                                field6050[var3++] = class171.method1222(var340, 127).method2269(false, var341, var342.field4667);
                            } else {
                                field6057[var2++] = class171.method1222(var340, 127).method2271(125, var342.field4668, var341);
                            }
                            continue;
                        }
                    } else if (var621 < 4500) {
                        if (var621 == 4400) {
                            var2 -= 2;
                            int var343 = field6057[var2];
                            int var344 = field6057[var2 + 1];
                            class319 var345 = class58.method378(var344, (byte) 118);
                            if (var345.method2119(102)) {
                                field6050[var3++] = class398.method2496(-127, var343).method1934(84, var344, var345.field4667);
                            } else {
                                field6057[var2++] = class398.method2496(-116, var343).method1944(var344, -14260, var345.field4668);
                            }
                            continue;
                        }
                    } else if (var621 < 4600) {
                        if (var621 == 4500) {
                            var2 -= 2;
                            int var346 = field6057[var2];
                            int var347 = field6057[var2 + 1];
                            class319 var348 = class58.method378(var347, (byte) 118);
                            if (var348.method2119(56)) {
                                field6050[var3++] = class316.method2109((byte) -118, var346).method2315(var347, var348.field4667, (byte) -40);
                            } else {
                                field6057[var2++] = class316.method2109((byte) -128, var346).method2314(var347, (byte) -6, var348.field4668);
                            }
                            continue;
                        }
                    } else if (var621 < 4700) {
                        if (var621 == 4600) {
                            var2--;
                            int var349 = field6057[var2];
                            class3 var350 = class101.method590(-1179708536, var349);
                            if (var350.field46 != null && var350.field46.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field40[0];
                                for (int var353 = 1; var353 < var350.field46.length; var353++) {
                                    if (var350.field40[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field40[var353];
                                    }
                                }
                                field6057[var2++] = var350.field46[var351];
                                continue;
                            }
                            field6057[var2++] = var350.field48;
                            continue;
                        }
                    } else if (var621 < 5100) {
                        if (var621 == 5000) {
                            field6057[var2++] = class352.field5093;
                            continue;
                        }
                        if (var621 == 5001) {
                            var2 -= 3;
                            class352.field5093 = field6057[var2];
                            class58.field769 = field6057[var2 + 1];
                            class108.field1412 = field6057[var2 + 2];
                            field6043++;
                            class407.field5761.method2048(2040, 202);
                            class407.field5761.method831(class352.field5093, (byte) 114);
                            class407.field5761.method831(class58.field769, (byte) 123);
                            class407.field5761.method831(class108.field1412, (byte) 125);
                            continue;
                        }
                        if (var621 == 5002) {
                            var3 -= 2;
                            String var354 = field6050[var3];
                            String var355 = field6050[var3 + 1];
                            var2 -= 2;
                            int var356 = field6057[var2];
                            int var357 = field6057[var2 + 1];
                            if (var355 == null) {
                                var355 = "";
                            }
                            if (var355.length() > 80) {
                                var355 = var355.substring(0, 80);
                            }
                            field6053++;
                            class407.field5761.method2048(2040, 188);
                            class407.field5761.method831(class276.method1873(true, var354) + class276.method1873(true, var355) + 2, (byte) -20);
                            class407.field5761.method807((byte) 124, var354);
                            class407.field5761.method831(var356 - 1, (byte) 123);
                            class407.field5761.method831(var357, (byte) -49);
                            class407.field5761.method807((byte) 124, var355);
                            continue;
                        }
                        if (var621 == 5003) {
                            var2--;
                            int var358 = field6057[var2];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = class204.field2887[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field6050[var3++] = var359;
                            continue;
                        }
                        if (var621 == 5004) {
                            var2--;
                            int var360 = field6057[var2];
                            int var361 = -1;
                            if (var360 < 100 && class204.field2887[var360] != null) {
                                var361 = class358.field5173[var360];
                            }
                            field6057[var2++] = var361;
                            continue;
                        }
                        if (var621 == 5005) {
                            field6057[var2++] = class58.field769;
                            continue;
                        }
                        if (var621 == 5008) {
                            var3--;
                            String var362 = field6050[var3];
                            if (class316.field4628 == 0 && (class138.field2117 && !class335.field4874 || class148.field2211)) {
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class359.field5182.method2284((byte) -24, 0))) {
                                var364 = 0;
                                var362 = var362.substring(class359.field5182.method2284((byte) 118, 0).length());
                            } else if (var363.startsWith(class229.field3393.method2284((byte) -112, 0))) {
                                var364 = 1;
                                var362 = var362.substring(class229.field3393.method2284((byte) -110, 0).length());
                            } else if (var363.startsWith(class129.field1821.method2284((byte) 124, 0))) {
                                var364 = 2;
                                var362 = var362.substring(class129.field1821.method2284((byte) -6, 0).length());
                            } else if (var363.startsWith(class301.field4400.method2284((byte) 124, 0))) {
                                var364 = 3;
                                var362 = var362.substring(class301.field4400.method2284((byte) -120, 0).length());
                            } else if (var363.startsWith(class24.field301.method2284((byte) -128, 0))) {
                                var364 = 4;
                                var362 = var362.substring(class24.field301.method2284((byte) -66, 0).length());
                            } else if (var363.startsWith(class182.field2581.method2284((byte) 116, 0))) {
                                var364 = 5;
                                var362 = var362.substring(class182.field2581.method2284((byte) -87, 0).length());
                            } else if (var363.startsWith(class20.field259.method2284((byte) -126, 0))) {
                                var364 = 6;
                                var362 = var362.substring(class20.field259.method2284((byte) -88, 0).length());
                            } else if (var363.startsWith(class394.field5540.method2284((byte) -121, 0))) {
                                var364 = 7;
                                var362 = var362.substring(class394.field5540.method2284((byte) 122, 0).length());
                            } else if (var363.startsWith(class220.field3161.method2284((byte) -91, 0))) {
                                var364 = 8;
                                var362 = var362.substring(class220.field3161.method2284((byte) -69, 0).length());
                            } else if (var363.startsWith(class332.field4829.method2284((byte) 105, 0))) {
                                var364 = 9;
                                var362 = var362.substring(class332.field4829.method2284((byte) -24, 0).length());
                            } else if (var363.startsWith(client.field2340.method2284((byte) -54, 0))) {
                                var364 = 10;
                                var362 = var362.substring(client.field2340.method2284((byte) -35, 0).length());
                            } else if (var363.startsWith(class238.field3519.method2284((byte) 122, 0))) {
                                var364 = 11;
                                var362 = var362.substring(class238.field3519.method2284((byte) 90, 0).length());
                            } else if (class309.field4497 != 0) {
                                if (var363.startsWith(class359.field5182.method2284((byte) -58, class309.field4497))) {
                                    var364 = 0;
                                    var362 = var362.substring(class359.field5182.method2284((byte) 107, class309.field4497).length());
                                } else if (var363.startsWith(class229.field3393.method2284((byte) -63, class309.field4497))) {
                                    var364 = 1;
                                    var362 = var362.substring(class229.field3393.method2284((byte) -79, class309.field4497).length());
                                } else if (var363.startsWith(class129.field1821.method2284((byte) -57, class309.field4497))) {
                                    var364 = 2;
                                    var362 = var362.substring(class129.field1821.method2284((byte) -56, class309.field4497).length());
                                } else if (var363.startsWith(class301.field4400.method2284((byte) 89, class309.field4497))) {
                                    var364 = 3;
                                    var362 = var362.substring(class301.field4400.method2284((byte) 121, class309.field4497).length());
                                } else if (var363.startsWith(class24.field301.method2284((byte) 107, class309.field4497))) {
                                    var364 = 4;
                                    var362 = var362.substring(class24.field301.method2284((byte) 92, class309.field4497).length());
                                } else if (var363.startsWith(class182.field2581.method2284((byte) 116, class309.field4497))) {
                                    var364 = 5;
                                    var362 = var362.substring(class182.field2581.method2284((byte) -46, class309.field4497).length());
                                } else if (var363.startsWith(class20.field259.method2284((byte) -122, class309.field4497))) {
                                    var364 = 6;
                                    var362 = var362.substring(class20.field259.method2284((byte) 108, class309.field4497).length());
                                } else if (var363.startsWith(class394.field5540.method2284((byte) -73, class309.field4497))) {
                                    var364 = 7;
                                    var362 = var362.substring(class394.field5540.method2284((byte) -110, class309.field4497).length());
                                } else if (var363.startsWith(class220.field3161.method2284((byte) -91, class309.field4497))) {
                                    var364 = 8;
                                    var362 = var362.substring(class220.field3161.method2284((byte) -117, class309.field4497).length());
                                } else if (var363.startsWith(class332.field4829.method2284((byte) -78, class309.field4497))) {
                                    var364 = 9;
                                    var362 = var362.substring(class332.field4829.method2284((byte) -52, class309.field4497).length());
                                } else if (var363.startsWith(client.field2340.method2284((byte) -121, class309.field4497))) {
                                    var364 = 10;
                                    var362 = var362.substring(client.field2340.method2284((byte) -86, class309.field4497).length());
                                } else if (var363.startsWith(class238.field3519.method2284((byte) -89, class309.field4497))) {
                                    var364 = 11;
                                    var362 = var362.substring(class238.field3519.method2284((byte) 102, class309.field4497).length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class275.field3971.method2284((byte) -105, 0))) {
                                var366 = 1;
                                var362 = var362.substring(class275.field3971.method2284((byte) -106, 0).length());
                            } else if (var365.startsWith(class88.field1155.method2284((byte) 91, 0))) {
                                var366 = 2;
                                var362 = var362.substring(class88.field1155.method2284((byte) -14, 0).length());
                            } else if (var365.startsWith(class178.field2526.method2284((byte) 98, 0))) {
                                var366 = 3;
                                var362 = var362.substring(class178.field2526.method2284((byte) 113, 0).length());
                            } else if (var365.startsWith(class230.field3404.method2284((byte) -41, 0))) {
                                var366 = 4;
                                var362 = var362.substring(class230.field3404.method2284((byte) -73, 0).length());
                            } else if (var365.startsWith(class103.field1325.method2284((byte) -20, 0))) {
                                var366 = 5;
                                var362 = var362.substring(class103.field1325.method2284((byte) 109, 0).length());
                            } else if (class309.field4497 != 0) {
                                if (var365.startsWith(class275.field3971.method2284((byte) 115, class309.field4497))) {
                                    var366 = 1;
                                    var362 = var362.substring(class275.field3971.method2284((byte) 110, class309.field4497).length());
                                } else if (var365.startsWith(class88.field1155.method2284((byte) 107, class309.field4497))) {
                                    var366 = 2;
                                    var362 = var362.substring(class88.field1155.method2284((byte) -64, class309.field4497).length());
                                } else if (var365.startsWith(class178.field2526.method2284((byte) 98, class309.field4497))) {
                                    var366 = 3;
                                    var362 = var362.substring(class178.field2526.method2284((byte) -26, class309.field4497).length());
                                } else if (var365.startsWith(class230.field3404.method2284((byte) 100, class309.field4497))) {
                                    var366 = 4;
                                    var362 = var362.substring(class230.field3404.method2284((byte) 122, class309.field4497).length());
                                } else if (var365.startsWith(class103.field1325.method2284((byte) 118, class309.field4497))) {
                                    var366 = 5;
                                    var362 = var362.substring(class103.field1325.method2284((byte) -39, class309.field4497).length());
                                }
                            }
                            field6056++;
                            class407.field5761.method2048(2040, 3);
                            class407.field5761.method831(0, (byte) 125);
                            int var367 = class407.field5761.field1880;
                            class407.field5761.method831(var364, (byte) 122);
                            class407.field5761.method831(var366, (byte) -80);
                            class432.method2701((byte) -62, class407.field5761, var362);
                            class407.field5761.method855(class407.field5761.field1880 - var367, 1);
                            continue;
                        }
                        if (var621 == 5009) {
                            var3 -= 2;
                            String var368 = field6050[var3];
                            String var369 = field6050[var3 + 1];
                            if (class316.field4628 != 0 || (!class138.field2117 || class335.field4874) && !class148.field2211) {
                                field6059++;
                                class407.field5761.method2048(2040, 141);
                                class407.field5761.method831(0, (byte) -88);
                                int var370 = class407.field5761.field1880;
                                class407.field5761.method807((byte) 124, var368);
                                class432.method2701((byte) -38, class407.field5761, var369);
                                class407.field5761.method855(class407.field5761.field1880 - var370, 1);
                            }
                            continue;
                        }
                        if (var621 == 5010) {
                            var2--;
                            int var371 = field6057[var2];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = class301.field4399[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field6050[var3++] = var372;
                            continue;
                        }
                        if (var621 == 5011) {
                            var2--;
                            int var373 = field6057[var2];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = class305.field4451[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field6050[var3++] = var374;
                            continue;
                        }
                        if (var621 == 5012) {
                            var2--;
                            int var375 = field6057[var2];
                            int var376 = -1;
                            if (var375 < 100) {
                                var376 = class429.field6108[var375];
                            }
                            field6057[var2++] = var376;
                            continue;
                        }
                        if (var621 == 5015) {
                            String var377;
                            if (class181.field2555 == null || class181.field2555.field1784 == null) {
                                var377 = class311.field4505;
                            } else {
                                var377 = class181.field2555.method788(true, 106);
                            }
                            field6050[var3++] = var377;
                            continue;
                        }
                        if (var621 == 5016) {
                            field6057[var2++] = class108.field1412;
                            continue;
                        }
                        if (var621 == 5017) {
                            field6057[var2++] = class142.field2157;
                            continue;
                        }
                        if (var621 == 5018) {
                            var2--;
                            int var378 = field6057[var2];
                            int var379 = 0;
                            if (var378 < 100 && class204.field2887[var378] != null) {
                                var379 = class358.field5173[var378];
                            }
                            field6057[var2++] = var379;
                            continue;
                        }
                        if (var621 == 5019) {
                            var2--;
                            int var380 = field6057[var2];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = class215.field3078[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field6050[var3++] = var381;
                            continue;
                        }
                        if (var621 == 5020) {
                            String var382;
                            if (class181.field2555 == null || class181.field2555.field1784 == null) {
                                var382 = class311.field4505;
                            } else {
                                var382 = class181.field2555.method789(false, false);
                            }
                            field6050[var3++] = var382;
                            continue;
                        }
                        if (var621 == 5050) {
                            var2--;
                            int var383 = field6057[var2];
                            field6050[var3++] = class342.method2242(var383, -55).field2669;
                            continue;
                        }
                        if (var621 == 5051) {
                            var2--;
                            int var384 = field6057[var2];
                            class187 var385 = class342.method2242(var384, -101);
                            if (var385.field2671 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var385.field2671.length;
                            }
                            continue;
                        }
                        if (var621 == 5052) {
                            var2 -= 2;
                            int var386 = field6057[var2];
                            int var387 = field6057[var2 + 1];
                            class187 var388 = class342.method2242(var386, -66);
                            int var389 = var388.field2671[var387];
                            field6057[var2++] = var389;
                            continue;
                        }
                        if (var621 == 5053) {
                            var2--;
                            int var390 = field6057[var2];
                            class187 var391 = class342.method2242(var390, -121);
                            if (var391.field2673 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var391.field2673.length;
                            }
                            continue;
                        }
                        if (var621 == 5054) {
                            var2 -= 2;
                            int var392 = field6057[var2];
                            int var393 = field6057[var2 + 1];
                            field6057[var2++] = class342.method2242(var392, -25).field2673[var393];
                            continue;
                        }
                        if (var621 == 5055) {
                            var2--;
                            int var394 = field6057[var2];
                            field6050[var3++] = class23.method126(32767, var394).method389((byte) -81);
                            continue;
                        }
                        if (var621 == 5056) {
                            var2--;
                            int var395 = field6057[var2];
                            class59 var396 = class23.method126(32767, var395);
                            if (var396.field798 == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var396.field798.length;
                            }
                            continue;
                        }
                        if (var621 == 5057) {
                            var2 -= 2;
                            int var397 = field6057[var2];
                            int var398 = field6057[var2 + 1];
                            field6057[var2++] = class23.method126(32767, var397).field798[var398];
                            continue;
                        }
                        if (var621 == 5058) {
                            field6061 = new class341();
                            var2--;
                            field6061.field4935 = field6057[var2];
                            field6061.field4936 = class23.method126(32767, field6061.field4935);
                            field6061.field4933 = new int[field6061.field4936.method390(false)];
                            continue;
                        }
                        if (var621 == 5059) {
                            field6054++;
                            class407.field5761.method2048(2040, 245);
                            class407.field5761.method831(0, (byte) -51);
                            int var399 = class407.field5761.field1880;
                            class407.field5761.method831(0, (byte) 126);
                            class407.field5761.method799(field6061.field4935, -69);
                            field6061.field4936.method383(class407.field5761, (byte) -101, field6061.field4933);
                            class407.field5761.method855(class407.field5761.field1880 - var399, 1);
                            continue;
                        }
                        if (var621 == 5060) {
                            var3--;
                            String var400 = field6050[var3];
                            field6060++;
                            class407.field5761.method2048(2040, 7);
                            class407.field5761.method831(0, (byte) -42);
                            int var401 = class407.field5761.field1880;
                            class407.field5761.method807((byte) 124, var400);
                            class407.field5761.method799(field6061.field4935, 87);
                            field6061.field4936.method383(class407.field5761, (byte) 101, field6061.field4933);
                            class407.field5761.method855(class407.field5761.field1880 - var401, 1);
                            continue;
                        }
                        if (var621 == 5061) {
                            field6054++;
                            class407.field5761.method2048(2040, 245);
                            class407.field5761.method831(0, (byte) 118);
                            int var402 = class407.field5761.field1880;
                            class407.field5761.method831(1, (byte) -106);
                            class407.field5761.method799(field6061.field4935, 45);
                            field6061.field4936.method383(class407.field5761, (byte) 100, field6061.field4933);
                            class407.field5761.method855(class407.field5761.field1880 - var402, 1);
                            continue;
                        }
                        if (var621 == 5062) {
                            var2 -= 2;
                            int var403 = field6057[var2];
                            int var404 = field6057[var2 + 1];
                            field6057[var2++] = class342.method2242(var403, -72).field2664[var404];
                            continue;
                        }
                        if (var621 == 5063) {
                            var2 -= 2;
                            int var405 = field6057[var2];
                            int var406 = field6057[var2 + 1];
                            field6057[var2++] = class342.method2242(var405, -80).field2676[var406];
                            continue;
                        }
                        if (var621 == 5064) {
                            var2 -= 2;
                            int var407 = field6057[var2];
                            int var408 = field6057[var2 + 1];
                            if (var408 == -1) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = class342.method2242(var407, -38).method1342(3, (char) var408);
                            }
                            continue;
                        }
                        if (var621 == 5065) {
                            var2 -= 2;
                            int var409 = field6057[var2];
                            int var410 = field6057[var2 + 1];
                            if (var410 == -1) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = class342.method2242(var409, -102).method1337((char) var410, true);
                            }
                            continue;
                        }
                        if (var621 == 5066) {
                            var2--;
                            int var411 = field6057[var2];
                            field6057[var2++] = class23.method126(32767, var411).method390(false);
                            continue;
                        }
                        if (var621 == 5067) {
                            var2 -= 2;
                            int var412 = field6057[var2];
                            int var413 = field6057[var2 + 1];
                            int var414 = class23.method126(32767, var412).method384(var413, true);
                            field6057[var2++] = var414;
                            continue;
                        }
                        if (var621 == 5068) {
                            var2 -= 2;
                            int var415 = field6057[var2];
                            int var416 = field6057[var2 + 1];
                            field6061.field4933[var415] = var416;
                            continue;
                        }
                        if (var621 == 5069) {
                            var2 -= 2;
                            int var417 = field6057[var2];
                            int var418 = field6057[var2 + 1];
                            field6061.field4933[var417] = var418;
                            continue;
                        }
                        if (var621 == 5070) {
                            var2 -= 3;
                            int var419 = field6057[var2];
                            int var420 = field6057[var2 + 1];
                            int var421 = field6057[var2 + 2];
                            class59 var422 = class23.method126(32767, var419);
                            if (var422.method384(var420, true) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field6057[var2++] = var422.method387((byte) -113, var421, var420);
                            continue;
                        }
                        if (var621 == 5071) {
                            var3--;
                            String var423 = field6050[var3];
                            var2--;
                            boolean var424 = field6057[var2] == 1;
                            class41.method280(var423, (byte) 123, var424);
                            field6057[var2++] = class324.field4722;
                            continue;
                        }
                        if (var621 == 5072) {
                            if (class297.field4327 != null && class19.field255 < class324.field4722) {
                                field6057[var2++] = class297.field4327[class19.field255++] & 0xFFFF;
                                continue;
                            }
                            field6057[var2++] = -1;
                            continue;
                        }
                        if (var621 == 5073) {
                            class19.field255 = 0;
                            continue;
                        }
                    } else if (var621 < 5200) {
                        if (var621 == 5100) {
                            if (class16.field247.method1758(-501, 86)) {
                                field6057[var2++] = 1;
                            } else {
                                field6057[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5101) {
                            if (class16.field247.method1758(-501, 82)) {
                                field6057[var2++] = 1;
                            } else {
                                field6057[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5102) {
                            if (class16.field247.method1758(-501, 81)) {
                                field6057[var2++] = 1;
                            } else {
                                field6057[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var621 < 5300) {
                        if (var621 == 5200) {
                            var2--;
                            class34.method184(127, field6057[var2]);
                            continue;
                        }
                        if (var621 == 5201) {
                            field6057[var2++] = class199.method1412(23342);
                            continue;
                        }
                        if (var621 == 5205) {
                            var2--;
                            class317.method2112(0, -1, false, field6057[var2], -1);
                            continue;
                        }
                        if (var621 == 5206) {
                            var2--;
                            int var425 = field6057[var2];
                            class173 var426 = class176.method1260(var425 >> 14 & 0x3FFF, var425 & 0x3FFF);
                            if (var426 == null) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = var426.field2435;
                            }
                            continue;
                        }
                        if (var621 == 5207) {
                            var2--;
                            class173 var427 = class176.method1256(field6057[var2]);
                            if (var427 != null && var427.field2438 != null) {
                                field6050[var3++] = var427.field2438;
                                continue;
                            }
                            field6050[var3++] = "";
                            continue;
                        }
                        if (var621 == 5208) {
                            field6057[var2++] = class13.field196;
                            field6057[var2++] = class347.field5069;
                            continue;
                        }
                        if (var621 == 5209) {
                            field6057[var2++] = class176.field2486 + class170.field2407;
                            field6057[var2++] = class176.field2493 + class175.field2459;
                            continue;
                        }
                        if (var621 == 5210) {
                            var2--;
                            int var428 = field6057[var2];
                            class173 var429 = class176.method1256(var428);
                            if (var429 == null) {
                                field6057[var2++] = 0;
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var429.field2441 >> 14 & 0x3FFF;
                                field6057[var2++] = var429.field2441 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var621 == 5211) {
                            var2--;
                            int var430 = field6057[var2];
                            class173 var431 = class176.method1256(var430);
                            if (var431 == null) {
                                field6057[var2++] = 0;
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var431.field2436 - var431.field2443;
                                field6057[var2++] = var431.field2444 - var431.field2428;
                            }
                            continue;
                        }
                        if (var621 == 5212) {
                            class194 var432 = class408.method2572(88);
                            if (var432 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = var432.field2794;
                                int var433 = var432.field2799 << 28 | class176.field2486 + var432.field2793 << 14 | class176.field2493 + var432.field2797;
                                field6057[var2++] = var433;
                            }
                            continue;
                        }
                        if (var621 == 5213) {
                            class194 var434 = class214.method1493(64);
                            if (var434 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = var434.field2794;
                                int var435 = var434.field2799 << 28 | class176.field2486 + var434.field2793 << 14 | class176.field2493 + var434.field2797;
                                field6057[var2++] = var435;
                            }
                            continue;
                        }
                        if (var621 == 5214) {
                            var2--;
                            int var436 = field6057[var2];
                            class173 var437 = class130.method797(0);
                            if (var437 != null) {
                                boolean var438 = var437.method1229((byte) 80, field6068, var436 >> 14 & 0x3FFF, var436 >> 28 & 0x3, var436 & 0x3FFF);
                                if (var438) {
                                    class110.method672(field6068[2], field6068[1], -14256);
                                }
                            }
                            continue;
                        }
                        if (var621 == 5215) {
                            var2 -= 2;
                            int var439 = field6057[var2];
                            int var440 = field6057[var2 + 1];
                            class139 var441 = class176.method1252(var439 >> 14 & 0x3FFF, var439 & 0x3FFF);
                            boolean var442 = false;
                            for (class173 var443 = (class173) var441.method1053(122); var443 != null; var443 = (class173) var441.method1058(-86)) {
                                if (var443.field2435 == var440) {
                                    var442 = true;
                                    break;
                                }
                            }
                            if (var442) {
                                field6057[var2++] = 1;
                            } else {
                                field6057[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5218) {
                            var2--;
                            int var444 = field6057[var2];
                            class173 var445 = class176.method1256(var444);
                            if (var445 == null) {
                                field6057[var2++] = -1;
                            } else {
                                field6057[var2++] = var445.field2437;
                            }
                            continue;
                        }
                        if (var621 == 5220) {
                            field6057[var2++] = class284.field4121 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5221) {
                            var2--;
                            int var446 = field6057[var2];
                            class110.method672(var446 & 0x3FFF, var446 >> 14 & 0x3FFF, -14256);
                            continue;
                        }
                        if (var621 == 5222) {
                            class173 var447 = class130.method797(0);
                            if (var447 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = -1;
                            } else {
                                boolean var448 = var447.method1230(class176.field2486 + class170.field2407, field6068, class176.field2493 + class175.field2459, (byte) 64);
                                if (var448) {
                                    field6057[var2++] = field6068[1];
                                    field6057[var2++] = field6068[2];
                                } else {
                                    field6057[var2++] = -1;
                                    field6057[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5223) {
                            var2 -= 2;
                            int var449 = field6057[var2];
                            int var450 = field6057[var2 + 1];
                            class317.method2112(0, var450 & 0x3FFF, false, var449, var450 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var621 == 5224) {
                            var2--;
                            int var451 = field6057[var2];
                            class173 var452 = class130.method797(0);
                            if (var452 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = -1;
                            } else {
                                boolean var453 = var452.method1229((byte) 50, field6068, var451 >> 14 & 0x3FFF, var451 >> 28 & 0x3, var451 & 0x3FFF);
                                if (var453) {
                                    field6057[var2++] = field6068[1];
                                    field6057[var2++] = field6068[2];
                                } else {
                                    field6057[var2++] = -1;
                                    field6057[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5225) {
                            var2--;
                            int var454 = field6057[var2];
                            class173 var455 = class130.method797(0);
                            if (var455 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = -1;
                            } else {
                                boolean var456 = var455.method1230(var454 >> 14 & 0x3FFF, field6068, var454 & 0x3FFF, (byte) 125);
                                if (var456) {
                                    field6057[var2++] = field6068[1];
                                    field6057[var2++] = field6068[2];
                                } else {
                                    field6057[var2++] = -1;
                                    field6057[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5226) {
                            var2--;
                            class413.method2610((byte) 104, field6057[var2]);
                            continue;
                        }
                        if (var621 == 5227) {
                            var2 -= 2;
                            int var457 = field6057[var2];
                            int var458 = field6057[var2 + 1];
                            class317.method2112(0, var458 & 0x3FFF, true, var457, var458 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var621 == 5228) {
                            var2--;
                            class312.field4611 = field6057[var2] == 1;
                            continue;
                        }
                        if (var621 == 5229) {
                            field6057[var2++] = class312.field4611 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5230) {
                            var2--;
                            int var459 = field6057[var2];
                            class150.method1114(var459, (byte) 8);
                            continue;
                        }
                        if (var621 == 5231) {
                            var2 -= 2;
                            int var460 = field6057[var2];
                            boolean var461 = field6057[var2 + 1] == 1;
                            if (class408.field5788 == null) {
                                continue;
                            }
                            class425 var462 = class408.field5788.method1373((long) var460, 127);
                            if (var462 != null && !var461) {
                                var462.method2660((byte) 122);
                                continue;
                            }
                            if (var462 == null && var461) {
                                class425 var463 = new class425();
                                class408.field5788.method1376(var463, (long) var460, 107);
                            }
                            continue;
                        }
                        if (var621 == 5232) {
                            var2--;
                            int var464 = field6057[var2];
                            if (class408.field5788 == null) {
                                field6057[var2++] = 0;
                            } else {
                                class425 var465 = class408.field5788.method1373((long) var464, -63);
                                field6057[var2++] = var465 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5233) {
                            var2 -= 2;
                            int var466 = field6057[var2];
                            boolean var467 = field6057[var2 + 1] == 1;
                            if (class180.field2543 == null) {
                                continue;
                            }
                            class425 var468 = class180.field2543.method1373((long) var466, 127);
                            if (var468 != null && !var467) {
                                var468.method2660((byte) 114);
                                continue;
                            }
                            if (var468 == null && var467) {
                                class425 var469 = new class425();
                                class180.field2543.method1376(var469, (long) var466, 72);
                            }
                            continue;
                        }
                        if (var621 == 5234) {
                            var2--;
                            int var470 = field6057[var2];
                            if (class180.field2543 == null) {
                                field6057[var2++] = 0;
                            } else {
                                class425 var471 = class180.field2543.method1373((long) var470, -89);
                                field6057[var2++] = var471 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5235) {
                            field6057[var2++] = class176.field2463 == null ? -1 : class176.field2463.field2435;
                            continue;
                        }
                    } else if (var621 < 5400) {
                        if (var621 == 5300) {
                            var2 -= 2;
                            int var472 = field6057[var2];
                            int var473 = field6057[var2 + 1];
                            class240.method1641(var473, 3, false, var472, -4);
                            field6057[var2++] = class213.field3016 == null ? 0 : 1;
                            continue;
                        }
                        if (var621 == 5301) {
                            if (class213.field3016 != null) {
                                class240.method1641(-1, class220.field3168, false, -1, -4);
                            }
                            continue;
                        }
                        if (var621 == 5302) {
                            class321[] var474 = class147.method1088(75);
                            field6057[var2++] = var474.length;
                            continue;
                        }
                        if (var621 == 5303) {
                            var2--;
                            int var475 = field6057[var2];
                            class321[] var476 = class147.method1088(101);
                            field6057[var2++] = var476[var475].field4698;
                            field6057[var2++] = var476[var475].field4693;
                            continue;
                        }
                        if (var621 == 5305) {
                            int var477 = class291.field4225;
                            int var478 = class145.field2183;
                            int var479 = -1;
                            class321[] var480 = class147.method1088(-109);
                            for (int var481 = 0; var481 < var480.length; var481++) {
                                class321 var482 = var480[var481];
                                if (var482.field4698 == var477 && var482.field4693 == var478) {
                                    var479 = var481;
                                    break;
                                }
                            }
                            field6057[var2++] = var479;
                            continue;
                        }
                        if (var621 == 5306) {
                            field6057[var2++] = class436.method2717(false);
                            continue;
                        }
                        if (var621 == 5307) {
                            var2--;
                            int var483 = field6057[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class240.method1641(-1, var483, false, -1, -4);
                            }
                            continue;
                        }
                        if (var621 == 5308) {
                            field6057[var2++] = class220.field3168;
                            continue;
                        }
                        if (var621 == 5309) {
                            var2--;
                            int var484 = field6057[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class220.field3168 = var484;
                                class415.method2612(class401.field5628, 105);
                            }
                            continue;
                        }
                    } else if (var621 < 5500) {
                        if (var621 == 5400) {
                            var3 -= 2;
                            String var485 = field6050[var3];
                            String var486 = field6050[var3 + 1];
                            var2--;
                            int var487 = field6057[var2];
                            field6067++;
                            class407.field5761.method2048(2040, 167);
                            class407.field5761.method831(class276.method1873(true, var485) + class276.method1873(true, var486) + 1, (byte) -102);
                            class407.field5761.method807((byte) 124, var485);
                            class407.field5761.method807((byte) 124, var486);
                            class407.field5761.method831(var487, (byte) 115);
                            continue;
                        }
                        if (var621 == 5401) {
                            var2 -= 2;
                            class255.field3779[field6057[var2]] = (short) class142.method1067((byte) 42, field6057[var2 + 1]);
                            class8.method41(114);
                            class69.method424(-3946);
                            class334.method2187(-31407);
                            class13.method73(true);
                            class158.method1152(-118);
                            continue;
                        }
                        if (var621 == 5405) {
                            var2 -= 2;
                            int var488 = field6057[var2];
                            int var489 = field6057[var2 + 1];
                            if (var488 >= 0 && var488 < 2) {
                                class113.field1469[var488] = new int[var489 << 1][4];
                            }
                            continue;
                        }
                        if (var621 == 5406) {
                            var2 -= 7;
                            int var490 = field6057[var2];
                            int var491 = field6057[var2 + 1] << 1;
                            int var492 = field6057[var2 + 2];
                            int var493 = field6057[var2 + 3];
                            int var494 = field6057[var2 + 4];
                            int var495 = field6057[var2 + 5];
                            int var496 = field6057[var2 + 6];
                            if (var490 >= 0 && var490 < 2 && class113.field1469[var490] != null && var491 >= 0 && var491 < class113.field1469[var490].length) {
                                class113.field1469[var490][var491] = new int[] { (var492 >> 14 & 0x3FFF) * 128, var493, (var492 & 0x3FFF) * 128, var496 };
                                class113.field1469[var490][var491 + 1] = new int[] { (var494 >> 14 & 0x3FFF) * 128, var495, (var494 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var621 == 5407) {
                            var2--;
                            int var497 = class113.field1469[field6057[var2]].length >> 1;
                            field6057[var2++] = var497;
                            continue;
                        }
                        if (var621 == 5411) {
                            if (class213.field3016 != null) {
                                class240.method1641(-1, class220.field3168, false, -1, -4);
                            }
                            if (class369.field5255 == null) {
                                String var498 = class282.field4049 == null ? class309.method2075(-21977) : class282.field4049;
                                class439.method2738(false, class110.field1418 == 1, (byte) -87, class401.field5628, var498);
                            } else {
                                class365.method2358(-76);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var621 == 5419) {
                            String var499 = "";
                            if (class397.field5588 != null) {
                                if (class397.field5588.field2295 == null) {
                                    var499 = class390.method2460(class397.field5588.field2299, 16765590);
                                } else {
                                    var499 = (String) class397.field5588.field2295;
                                }
                            }
                            field6050[var3++] = var499;
                            continue;
                        }
                        if (var621 == 5420) {
                            field6057[var2++] = class219.field3149 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5421) {
                            if (class213.field3016 != null) {
                                class240.method1641(-1, class220.field3168, false, -1, -4);
                            }
                            var3--;
                            String var500 = field6050[var3];
                            var2--;
                            boolean var501 = field6057[var2] == 1;
                            String var502 = class309.method2075(-21977) + var500;
                            class439.method2738(var501, class110.field1418 == 1, (byte) -87, class401.field5628, var502);
                            continue;
                        }
                        if (var621 == 5422) {
                            var3 -= 2;
                            String var503 = field6050[var3];
                            String var504 = field6050[var3 + 1];
                            var2--;
                            int var505 = field6057[var2];
                            if (var503.length() > 0) {
                                if (class134.field2067 == null) {
                                    class134.field2067 = new String[class427.field6090[class317.field4656]];
                                }
                                class134.field2067[var505] = var503;
                            }
                            if (var504.length() > 0) {
                                if (class384.field5434 == null) {
                                    class384.field5434 = new String[class427.field6090[class317.field4656]];
                                }
                                class384.field5434[var505] = var504;
                            }
                            continue;
                        }
                        if (var621 == 5423) {
                            var3--;
                            System.out.println(field6050[var3]);
                            continue;
                        }
                        if (var621 == 5424) {
                            var2 -= 11;
                            class448.field6397 = field6057[var2];
                            class331.field4775 = field6057[var2 + 1];
                            class87.field1129 = field6057[var2 + 2];
                            class261.field3866 = field6057[var2 + 3];
                            class84.field1075 = field6057[var2 + 4];
                            class224.field3359 = field6057[var2 + 5];
                            class187.field2675 = field6057[var2 + 6];
                            class139.field2129 = field6057[var2 + 7];
                            class62.field834 = field6057[var2 + 8];
                            class390.field5483 = field6057[var2 + 9];
                            class304.field4439 = field6057[var2 + 10];
                            class15.field216.method660(class84.field1075, (byte) 111);
                            class15.field216.method660(class224.field3359, (byte) -69);
                            class15.field216.method660(class187.field2675, (byte) 46);
                            class15.field216.method660(class139.field2129, (byte) 103);
                            class15.field216.method660(class62.field834, (byte) -122);
                            class341.field4937 = null;
                            class103.field1302 = null;
                            class324.field4716 = null;
                            class413.field5909 = null;
                            class409.field5867 = null;
                            class310.field4499 = null;
                            class13.field187 = null;
                            class376.field5351 = null;
                            class19.field253 = true;
                            continue;
                        }
                        if (var621 == 5425) {
                            class255.method1770((byte) 6);
                            class19.field253 = false;
                            continue;
                        }
                        if (var621 == 5426) {
                            var2 -= 2;
                            class2.field14 = field6057[var2];
                            class165.field2363 = field6057[var2 + 1];
                            continue;
                        }
                        if (var621 == 5427) {
                            var2 -= 2;
                            class305.field4446 = field6057[var2 + 1];
                            continue;
                        }
                        if (var621 == 5428) {
                            var2 -= 2;
                            int var506 = field6057[var2];
                            int var507 = field6057[var2 + 1];
                            field6057[var2++] = class276.method1874(var507, var506, true) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5429) {
                            var3--;
                            class258.method1789(true, field6050[var3], false);
                            continue;
                        }
                    } else if (var621 < 5600) {
                        if (var621 == 5500) {
                            var2 -= 4;
                            int var508 = field6057[var2];
                            int var509 = field6057[var2 + 1];
                            int var510 = field6057[var2 + 2];
                            int var511 = field6057[var2 + 3];
                            class30.method166(var510, (var508 >> 14 & 0x3FFF) - class306.field4459, var509, -121, (var508 & 0x3FFF) - class342.field4959, false, var511);
                            continue;
                        }
                        if (var621 == 5501) {
                            var2 -= 4;
                            int var512 = field6057[var2];
                            int var513 = field6057[var2 + 1];
                            int var514 = field6057[var2 + 2];
                            int var515 = field6057[var2 + 3];
                            class419.method2640((var512 >> 14 & 0x3FFF) - class306.field4459, var515, -1025, (var512 & 0x3FFF) - class342.field4959, var513, var514);
                            continue;
                        }
                        if (var621 == 5502) {
                            var2 -= 6;
                            int var516 = field6057[var2];
                            if (var516 >= 2) {
                                throw new RuntimeException();
                            }
                            class245.field3660 = var516;
                            int var517 = field6057[var2 + 1];
                            if (var517 + 1 >= class113.field1469[class245.field3660].length >> 1) {
                                throw new RuntimeException();
                            }
                            class190.field2734 = var517;
                            class190.field2765 = 0;
                            class31.field386 = field6057[var2 + 2];
                            class255.field3777 = field6057[var2 + 3];
                            int var518 = field6057[var2 + 4];
                            if (var518 >= 2) {
                                throw new RuntimeException();
                            }
                            class194.field2801 = var518;
                            int var519 = field6057[var2 + 5];
                            if (var519 + 1 >= class113.field1469[class194.field2801].length >> 1) {
                                throw new RuntimeException();
                            }
                            class267.field3915 = var519;
                            class336.field4878 = 3;
                            continue;
                        }
                        if (var621 == 5503) {
                            class119.method730(13888);
                            continue;
                        }
                        if (var621 == 5504) {
                            var2 -= 2;
                            class137.method1049(-1, 0, field6057[var2], field6057[var2 + 1]);
                            continue;
                        }
                        if (var621 == 5505) {
                            field6057[var2++] = (int) class241.field3553 >> 3;
                            continue;
                        }
                        if (var621 == 5506) {
                            field6057[var2++] = (int) class358.field5176 >> 3;
                            continue;
                        }
                        if (var621 == 5507) {
                            class75.method449(-120);
                            continue;
                        }
                        if (var621 == 5508) {
                            class315.method2105((byte) 48);
                            continue;
                        }
                        if (var621 == 5509) {
                            class276.method1877(-27715);
                            continue;
                        }
                        if (var621 == 5510) {
                            class47.method309(-2);
                            continue;
                        }
                        if (var621 == 5511) {
                            var2--;
                            int var520 = field6057[var2];
                            int var521 = var520 >> 14 & 0x3FFF;
                            int var522 = var520 & 0x3FFF;
                            int var523 = var521 - class306.field4459;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class80.field1034) {
                                var523 = class80.field1034;
                            }
                            int var524 = var522 - class342.field4959;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class381.field5414) {
                                var524 = class381.field5414;
                            }
                            class302.field4402 = var523 * 128 + 64;
                            class165.field2348 = var524 * 128 + 64;
                            class336.field4878 = 4;
                            continue;
                        }
                        if (var621 == 5512) {
                            class62.method401(-25247);
                            continue;
                        }
                    } else if (var621 < 5700) {
                        if (var621 == 5600) {
                            var3 -= 2;
                            String var525 = field6050[var3];
                            String var526 = field6050[var3 + 1];
                            var2--;
                            int var527 = field6057[var2];
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0 && class258.field3819 == 0) {
                                class258.method1783(var527, -125, var526, var525);
                            }
                            continue;
                        }
                        if (var621 == 5601) {
                            class117.method719((byte) -13);
                            continue;
                        }
                        if (var621 == 5602) {
                            if (class215.field3080 == 0) {
                                class384.field5440 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5603) {
                            var2 -= 4;
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0 && class258.field3819 == 0) {
                                class171.method1224(-13750, field6057[var2 + 2], field6057[var2 + 3], field6057[var2 + 1], field6057[var2]);
                            }
                            continue;
                        }
                        if (var621 == 5604) {
                            var3--;
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0 && class258.field3819 == 0) {
                                class6.method30(-122, class407.method2561(field6050[var3], 102));
                            }
                            continue;
                        }
                        if (var621 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0 && class258.field3819 == 0) {
                                class334.method2190(class407.method2561(field6050[var3], 118), field6057[var2 + 2], field6057[var2 + 3], field6057[var2], field6050[var3 + 2], field6057[var2 + 1], field6057[var2 + 5] == 1, field6057[var2 + 4] == 1, field6057[var2 + 6] == 1, 113, field6050[var3 + 1]);
                            }
                            continue;
                        }
                        if (var621 == 5606) {
                            if (class415.field5926 == 0) {
                                class44.field599 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5607) {
                            field6057[var2++] = class384.field5440;
                            continue;
                        }
                        if (var621 == 5608) {
                            field6057[var2++] = class384.field5439;
                            continue;
                        }
                        if (var621 == 5609) {
                            field6057[var2++] = class44.field599;
                            continue;
                        }
                        if (var621 == 5610) {
                            for (int var528 = 0; var528 < 5; var528++) {
                                field6050[var3++] = class253.field3754.length > var528 ? class215.method1506((byte) -101, class253.field3754[var528]) : "";
                            }
                            class253.field3754 = null;
                            continue;
                        }
                        if (var621 == 5611) {
                            field6057[var2++] = class30.field368;
                            continue;
                        }
                    } else if (var621 < 6100) {
                        if (var621 == 6001) {
                            var2--;
                            int var529 = field6057[var2];
                            if (var529 < 1) {
                                var529 = 1;
                            }
                            if (var529 > 4) {
                                var529 = 4;
                            }
                            class355.field5139 = var529;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 125);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6002) {
                            var2--;
                            class238.method1625(field6057[var2] == 1, -45);
                            class228.method1590(4096);
                            class370.method2375((byte) -62);
                            class87.method521(72);
                            class415.method2612(class401.field5628, 107);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6003) {
                            var2--;
                            class181.field2561 = field6057[var2] == 1;
                            class87.method521(74);
                            class415.method2612(class401.field5628, 111);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6005) {
                            var2--;
                            class247.field3703 = field6057[var2] == 1;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 125);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6006) {
                            var2--;
                            class103.field1326 = field6057[var2] == 1;
                            class59.field786.method984(!class103.field1326);
                            class415.method2612(class401.field5628, 106);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6007) {
                            var2--;
                            class145.field2182 = field6057[var2];
                            class415.method2612(class401.field5628, 111);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6008) {
                            var2--;
                            class266.field3908 = field6057[var2] == 1;
                            class415.method2612(class401.field5628, 106);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6009) {
                            var2--;
                            class189.field2714 = field6057[var2] == 1;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 117);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6010) {
                            var2--;
                            class79.field1027 = field6057[var2] == 1;
                            class415.method2612(class401.field5628, 104);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6011) {
                            var2--;
                            int var530 = field6057[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class194.field2802 = var530;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 119);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6012) {
                            var2--;
                            class120.field1626 = field6057[var2] == 1;
                            class436.method2720(true);
                            class415.method2612(class401.field5628, 102);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6014) {
                            var2--;
                            class51.field664 = field6057[var2] == 1;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 123);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6015) {
                            var2--;
                            class125.field1678 = field6057[var2] == 1;
                            class370.method2375((byte) -62);
                            class415.method2612(class401.field5628, 115);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6016) {
                            var2--;
                            int var531 = field6057[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class233.field3451 = var531;
                            class406.method2543(-8);
                            class415.method2612(class401.field5628, 121);
                            continue;
                        }
                        if (var621 == 6017) {
                            var2--;
                            class358.field5172 = field6057[var2] == 1;
                            class275.method1867((byte) 118);
                            class415.method2612(class401.field5628, 105);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6018) {
                            var2--;
                            int var532 = field6057[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 127) {
                                var532 = 127;
                            }
                            class266.field3910 = var532;
                            class415.method2612(class401.field5628, 118);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6019) {
                            var2--;
                            int var533 = field6057[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 255) {
                                var533 = 255;
                            }
                            if (class131.field1914 != var533) {
                                if (class131.field1914 == 0 && class30.field367 != -1) {
                                    class100.method582(2, class30.field367, 0, false, class72.field942, var533);
                                    class96.field1223 = false;
                                } else if (var533 == 0) {
                                    class369.method2366(-13);
                                    class96.field1223 = false;
                                } else {
                                    class432.method2702(114, var533);
                                }
                                class131.field1914 = var533;
                            }
                            class415.method2612(class401.field5628, 102);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6020) {
                            var2--;
                            int var534 = field6057[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 127) {
                                var534 = 127;
                            }
                            class170.field2398 = var534;
                            class415.method2612(class401.field5628, 119);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6021) {
                            var2--;
                            class449.field6416 = field6057[var2] == 1;
                            class87.method521(-103);
                            continue;
                        }
                        if (var621 == 6023) {
                            var2--;
                            int var535 = field6057[var2];
                            boolean var536 = false;
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 2) {
                                var535 = 2;
                            }
                            if (class306.field4461 < 96) {
                                var535 = 0;
                                var536 = true;
                            }
                            class230.method1595(-111, var535);
                            class415.method2612(class401.field5628, 114);
                            class315.field4627 = false;
                            field6057[var2++] = var536 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 6024) {
                            var2--;
                            int var537 = field6057[var2];
                            if (var537 < 0 || var537 > 2) {
                                var537 = 0;
                            }
                            class26.field339 = var537;
                            class415.method2612(class401.field5628, 119);
                            continue;
                        }
                        if (var621 == 6025) {
                            var2--;
                            int var538 = field6057[var2];
                            if (var538 < 0 || var538 > class171.method1220(false, class306.field4461)) {
                                var538 = 0;
                            }
                            class68.field910 = var538;
                            class415.method2612(class401.field5628, 110);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6027) {
                            var2--;
                            int var539 = field6057[var2];
                            if (var539 < 0 || var539 > 1) {
                                var539 = 0;
                            }
                            class410.method2597(var539 == 1, true);
                            continue;
                        }
                        if (var621 == 6028) {
                            var2--;
                            class84.field1077 = field6057[var2] != 0;
                            class415.method2612(class401.field5628, 121);
                            continue;
                        }
                        if (var621 == 6029) {
                            var2--;
                            class145.field2182 = field6057[var2];
                            class415.method2612(class401.field5628, 124);
                            continue;
                        }
                        if (var621 == 6030) {
                            var2--;
                            class324.field4717 = field6057[var2] != 0;
                            class415.method2612(class401.field5628, 113);
                            class370.method2375((byte) -62);
                            continue;
                        }
                        if (var621 == 6031) {
                            var2--;
                            int var540 = field6057[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class358.method2335((byte) -125, var540);
                            continue;
                        }
                        if (var621 == 6032) {
                            var2--;
                            int var541 = field6057[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class374.field5319 = var541;
                            class415.method2612(class401.field5628, 126);
                            class315.field4627 = false;
                            continue;
                        }
                        if (var621 == 6033) {
                            var2--;
                            int var542 = field6057[var2];
                            if (var542 < 0 || var542 > 4) {
                                var542 = 2;
                            }
                            class70.field930 = var542;
                            class415.method2612(class401.field5628, 122);
                            continue;
                        }
                    } else if (var621 < 6200) {
                        if (var621 == 6101) {
                            field6057[var2++] = class355.field5139;
                            continue;
                        }
                        if (var621 == 6102) {
                            field6057[var2++] = class296.method2000((byte) -111) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6103) {
                            field6057[var2++] = class181.field2561 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6105) {
                            field6057[var2++] = class247.field3703 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6106) {
                            field6057[var2++] = class103.field1326 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6107) {
                            field6057[var2++] = class145.field2182;
                            continue;
                        }
                        if (var621 == 6108) {
                            field6057[var2++] = class266.field3908 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6109) {
                            field6057[var2++] = class189.field2714 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6110) {
                            field6057[var2++] = class79.field1027 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6111) {
                            field6057[var2++] = class194.field2802;
                            continue;
                        }
                        if (var621 == 6112) {
                            field6057[var2++] = class120.field1626 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6114) {
                            field6057[var2++] = class51.field664 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6115) {
                            field6057[var2++] = class125.field1678 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6116) {
                            field6057[var2++] = class233.field3451;
                            continue;
                        }
                        if (var621 == 6117) {
                            field6057[var2++] = class358.field5172 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6118) {
                            field6057[var2++] = class266.field3910;
                            continue;
                        }
                        if (var621 == 6119) {
                            field6057[var2++] = class131.field1914;
                            continue;
                        }
                        if (var621 == 6120) {
                            field6057[var2++] = class170.field2398;
                            continue;
                        }
                        if (var621 == 6121) {
                            field6057[var2++] = class59.field786.method1011() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6123) {
                            field6057[var2++] = class270.method1842((byte) -63);
                            continue;
                        }
                        if (var621 == 6124) {
                            field6057[var2++] = class26.field339;
                            continue;
                        }
                        if (var621 == 6125) {
                            field6057[var2++] = class68.field910;
                            continue;
                        }
                        if (var621 == 6126) {
                            field6057[var2++] = class59.field786.method880() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6127) {
                            field6057[var2++] = class255.field3795 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6128) {
                            field6057[var2++] = class84.field1077 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6129) {
                            field6057[var2++] = class145.field2182;
                            continue;
                        }
                        if (var621 == 6130) {
                            field6057[var2++] = class324.field4717 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6131) {
                            field6057[var2++] = class110.field1418;
                            continue;
                        }
                        if (var621 == 6132) {
                            field6057[var2++] = class374.field5319;
                            continue;
                        }
                        if (var621 == 6133) {
                            field6057[var2++] = class219.field3149 == 1 || class219.field3149 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6134) {
                            field6057[var2++] = class171.method1220(false, class306.field4461);
                            continue;
                        }
                        if (var621 == 6135) {
                            field6057[var2++] = class70.field930;
                            continue;
                        }
                    } else if (var621 < 6300) {
                        if (var621 == 6200) {
                            var2 -= 2;
                            class131.field1908 = (short) field6057[var2];
                            if (class131.field1908 <= 0) {
                                class131.field1908 = 256;
                            }
                            class287.field4186 = (short) field6057[var2 + 1];
                            if (class287.field4186 <= 0) {
                                class287.field4186 = 205;
                            }
                            continue;
                        }
                        if (var621 == 6201) {
                            var2 -= 2;
                            class74.field979 = (short) field6057[var2];
                            if (class74.field979 <= 0) {
                                class74.field979 = 256;
                            }
                            class120.field1630 = (short) field6057[var2 + 1];
                            if (class120.field1630 <= 0) {
                                class120.field1630 = 320;
                            }
                            continue;
                        }
                        if (var621 == 6202) {
                            var2 -= 4;
                            class245.field3658 = (short) field6057[var2];
                            if (class245.field3658 <= 0) {
                                class245.field3658 = 1;
                            }
                            class356.field5148 = (short) field6057[var2 + 1];
                            if (class356.field5148 <= 0) {
                                class356.field5148 = 32767;
                            } else if (class356.field5148 < class245.field3658) {
                                class356.field5148 = class245.field3658;
                            }
                            class293.field4239 = (short) field6057[var2 + 2];
                            if (class293.field4239 <= 0) {
                                class293.field4239 = 1;
                            }
                            class94.field1198 = (short) field6057[var2 + 3];
                            if (class94.field1198 <= 0) {
                                class94.field1198 = 32767;
                            } else if (class94.field1198 < class293.field4239) {
                                class94.field1198 = class293.field4239;
                            }
                            continue;
                        }
                        if (var621 == 6203) {
                            class101.method587(0, class232.field3433.field3282, false, (byte) 102, 0, class232.field3433.field3250);
                            field6057[var2++] = class308.field4484;
                            field6057[var2++] = class411.field5897;
                            continue;
                        }
                        if (var621 == 6204) {
                            field6057[var2++] = class74.field979;
                            field6057[var2++] = class120.field1630;
                            continue;
                        }
                        if (var621 == 6205) {
                            field6057[var2++] = class131.field1908;
                            field6057[var2++] = class287.field4186;
                            continue;
                        }
                    } else if (var621 < 6400) {
                        if (var621 == 6300) {
                            field6057[var2++] = (int) (class18.method107(-16145) / 60000L);
                            continue;
                        }
                        if (var621 == 6301) {
                            field6057[var2++] = (int) (class18.method107(-16145) / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6302) {
                            var2 -= 3;
                            int var543 = field6057[var2];
                            int var544 = field6057[var2 + 1];
                            int var545 = field6057[var2 + 2];
                            field6045.clear();
                            field6045.set(11, 12);
                            field6045.set(var545, var544, var543);
                            field6057[var2++] = (int) (field6045.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6303) {
                            field6045.clear();
                            field6045.setTime(new Date(class18.method107(-16145)));
                            field6057[var2++] = field6045.get(1);
                            continue;
                        }
                        if (var621 == 6304) {
                            var2--;
                            int var546 = field6057[var2];
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
                            field6057[var2++] = var547 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6500) {
                        if (var621 == 6405) {
                            field6057[var2++] = class392.method2469(667) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6406) {
                            field6057[var2++] = class9.method47((byte) 99) ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6600) {
                        if (var621 == 6500) {
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0) {
                                field6057[var2++] = class185.method1329((byte) 75) == -1 ? 0 : 1;
                                continue;
                            }
                            field6057[var2++] = 1;
                            continue;
                        }
                        if (var621 == 6501) {
                            class158 var548 = class358.method2334(-5397);
                            if (var548 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = 0;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var548.field2311;
                                field6057[var2++] = var548.field2386;
                                field6050[var3++] = var548.field2304;
                                class239 var549 = var548.method1150(28109);
                                field6057[var2++] = var549.field3530;
                                field6050[var3++] = var549.field3527;
                                field6057[var2++] = var548.field2392;
                                field6057[var2++] = var548.field2309;
                            }
                            continue;
                        }
                        if (var621 == 6502) {
                            class158 var550 = class440.method2744(-21860);
                            if (var550 == null) {
                                field6057[var2++] = -1;
                                field6057[var2++] = 0;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var550.field2311;
                                field6057[var2++] = var550.field2386;
                                field6050[var3++] = var550.field2304;
                                class239 var551 = var550.method1150(28109);
                                field6057[var2++] = var551.field3530;
                                field6050[var3++] = var551.field3527;
                                field6057[var2++] = var550.field2392;
                                field6057[var2++] = var550.field2309;
                            }
                            continue;
                        }
                        if (var621 == 6503) {
                            var2--;
                            int var552 = field6057[var2];
                            if (class423.field6041 == 10 && class120.field1624 == 0 && class215.field3080 == 0 && class415.field5926 == 0) {
                                field6057[var2++] = class409.method2591(var552, 3) ? 1 : 0;
                                continue;
                            }
                            field6057[var2++] = 0;
                            continue;
                        }
                        if (var621 == 6504) {
                            var2--;
                            class393.field5523 = field6057[var2];
                            class415.method2612(class401.field5628, 105);
                            continue;
                        }
                        if (var621 == 6505) {
                            field6057[var2++] = class393.field5523;
                            continue;
                        }
                        if (var621 == 6506) {
                            var2--;
                            int var553 = field6057[var2];
                            class158 var554 = class145.method1073(var553, 89);
                            if (var554 == null) {
                                field6057[var2++] = -1;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6050[var3++] = "";
                                field6057[var2++] = 0;
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = var554.field2386;
                                field6050[var3++] = var554.field2304;
                                class239 var555 = var554.method1150(28109);
                                field6057[var2++] = var555.field3530;
                                field6050[var3++] = var555.field3527;
                                field6057[var2++] = var554.field2392;
                                field6057[var2++] = var554.field2309;
                            }
                            continue;
                        }
                        if (var621 == 6507) {
                            var2 -= 4;
                            int var556 = field6057[var2];
                            boolean var557 = field6057[var2 + 1] == 1;
                            int var558 = field6057[var2 + 2];
                            boolean var559 = field6057[var2 + 3] == 1;
                            class393.method2473(var557, var559, (byte) 100, var558, var556);
                            continue;
                        }
                        if (var621 == 6508) {
                            class386.method2453((byte) -100);
                            continue;
                        }
                        if (var621 == 6509) {
                            if (class423.field6041 == 10) {
                                var2--;
                                if (field6057[var2] == 1) {
                                    if (class119.field1615 == null) {
                                        class119.field1615 = new class270();
                                    }
                                } else if (class119.field1615 != null) {
                                    class119.field1615.method1850(160);
                                    class119.field1615 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var621 < 6700) {
                        if (var621 == 6600) {
                            var2--;
                            class24.field304 = field6057[var2] == 1;
                            class415.method2612(class401.field5628, 119);
                            continue;
                        }
                        if (var621 == 6601) {
                            field6057[var2++] = class24.field304 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6800 && class31.field387 == 2) {
                        if (var621 == 6700) {
                            int var560 = class318.field4662.method1375(127);
                            if (class265.field3898 != -1) {
                                var560++;
                            }
                            field6057[var2++] = var560;
                            continue;
                        }
                        if (var621 == 6701) {
                            var2--;
                            int var561 = field6057[var2];
                            if (class265.field3898 != -1) {
                                if (var561 == 0) {
                                    field6057[var2++] = class265.field3898;
                                    continue;
                                }
                                var561--;
                            }
                            class253 var562 = (class253) class318.field4662.method1383(115);
                            while (var561-- > 0) {
                                var562 = (class253) class318.field4662.method1378((byte) 98);
                            }
                            field6057[var2++] = var562.field3746;
                            continue;
                        }
                        if (var621 == 6702) {
                            var2--;
                            int var563 = field6057[var2];
                            if (class186.field2657[var563] == null) {
                                field6050[var3++] = "";
                            } else {
                                String var564 = class186.field2657[var563][0].field3203;
                                if (var564 == null) {
                                    field6050[var3++] = "";
                                } else {
                                    field6050[var3++] = var564.substring(0, var564.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var621 == 6703) {
                            var2--;
                            int var565 = field6057[var2];
                            if (class186.field2657[var565] == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = class186.field2657[var565].length;
                            }
                            continue;
                        }
                        if (var621 == 6704) {
                            var2 -= 2;
                            int var566 = field6057[var2];
                            int var567 = field6057[var2 + 1];
                            if (class186.field2657[var566] == null) {
                                field6050[var3++] = "";
                            } else {
                                String var568 = class186.field2657[var566][var567].field3203;
                                if (var568 == null) {
                                    field6050[var3++] = "";
                                } else {
                                    field6050[var3++] = var568;
                                }
                            }
                            continue;
                        }
                        if (var621 == 6705) {
                            var2 -= 2;
                            int var569 = field6057[var2];
                            int var570 = field6057[var2 + 1];
                            if (class186.field2657[var569] == null) {
                                field6057[var2++] = 0;
                            } else {
                                field6057[var2++] = class186.field2657[var569][var570].field3207;
                            }
                            continue;
                        }
                        if (var621 == 6706) {
                            continue;
                        }
                        if (var621 == 6707) {
                            var2 -= 3;
                            int var571 = field6057[var2];
                            int var572 = field6057[var2 + 1];
                            int var573 = field6057[var2 + 2];
                            class382.method2432((byte) 20, var573, 1, "", var571 << 16 | var572);
                            continue;
                        }
                        if (var621 == 6708) {
                            var2 -= 3;
                            int var574 = field6057[var2];
                            int var575 = field6057[var2 + 1];
                            int var576 = field6057[var2 + 2];
                            class382.method2432((byte) 47, var576, 2, "", var574 << 16 | var575);
                            continue;
                        }
                        if (var621 == 6709) {
                            var2 -= 3;
                            int var577 = field6057[var2];
                            int var578 = field6057[var2 + 1];
                            int var579 = field6057[var2 + 2];
                            class382.method2432((byte) 26, var579, 3, "", var577 << 16 | var578);
                            continue;
                        }
                        if (var621 == 6710) {
                            var2 -= 3;
                            int var580 = field6057[var2];
                            int var581 = field6057[var2 + 1];
                            int var582 = field6057[var2 + 2];
                            class382.method2432((byte) 115, var582, 4, "", var580 << 16 | var581);
                            continue;
                        }
                        if (var621 == 6711) {
                            var2 -= 3;
                            int var583 = field6057[var2];
                            int var584 = field6057[var2 + 1];
                            int var585 = field6057[var2 + 2];
                            class382.method2432((byte) 120, var585, 5, "", var583 << 16 | var584);
                            continue;
                        }
                        if (var621 == 6712) {
                            var2 -= 3;
                            int var586 = field6057[var2];
                            int var587 = field6057[var2 + 1];
                            int var588 = field6057[var2 + 2];
                            class382.method2432((byte) 101, var588, 6, "", var586 << 16 | var587);
                            continue;
                        }
                        if (var621 == 6713) {
                            var2 -= 3;
                            int var589 = field6057[var2];
                            int var590 = field6057[var2 + 1];
                            int var591 = field6057[var2 + 2];
                            class382.method2432((byte) 36, var591, 7, "", var589 << 16 | var590);
                            continue;
                        }
                        if (var621 == 6714) {
                            var2 -= 3;
                            int var592 = field6057[var2];
                            int var593 = field6057[var2 + 1];
                            int var594 = field6057[var2 + 2];
                            class382.method2432((byte) 51, var594, 8, "", var592 << 16 | var593);
                            continue;
                        }
                        if (var621 == 6715) {
                            var2 -= 3;
                            int var595 = field6057[var2];
                            int var596 = field6057[var2 + 1];
                            int var597 = field6057[var2 + 2];
                            class382.method2432((byte) 32, var597, 9, "", var595 << 16 | var596);
                            continue;
                        }
                        if (var621 == 6716) {
                            var2 -= 3;
                            int var598 = field6057[var2];
                            int var599 = field6057[var2 + 1];
                            int var600 = field6057[var2 + 2];
                            class382.method2432((byte) 38, var600, 10, "", var598 << 16 | var599);
                            continue;
                        }
                        if (var621 == 6717) {
                            var2 -= 3;
                            int var601 = field6057[var2];
                            int var602 = field6057[var2 + 1];
                            int var603 = field6057[var2 + 2];
                            class223 var604 = class299.method2016(var603, var601 << 16 | var602, (byte) 124);
                            class63.method402(18002);
                            class83 var605 = client.method1168(var604);
                            class72.method438(var601 << 16 | var602, var603, var605.field1053, var604.field3236, var605.method488(2), var604.field3302, (byte) -85);
                            continue;
                        }
                    } else if (var621 < 6900) {
                        if (var621 == 6800) {
                            var2--;
                            int var606 = field6057[var2];
                            class297 var607 = class379.method2417(3144, var606);
                            if (var607.field4310 == null) {
                                field6050[var3++] = "";
                            } else {
                                field6050[var3++] = var607.field4310;
                            }
                            continue;
                        }
                        if (var621 == 6801) {
                            var2--;
                            int var608 = field6057[var2];
                            class297 var609 = class379.method2417(3144, var608);
                            field6057[var2++] = var609.field4307;
                            continue;
                        }
                        if (var621 == 6802) {
                            var2--;
                            int var610 = field6057[var2];
                            class297 var611 = class379.method2417(3144, var610);
                            field6057[var2++] = var611.field4298;
                            continue;
                        }
                        if (var621 == 6803) {
                            var2--;
                            int var612 = field6057[var2];
                            class297 var613 = class379.method2417(3144, var612);
                            field6057[var2++] = var613.field4287;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var620) {
            if (arg0.field696 == null) {
                StringBuffer var618 = new StringBuffer(30);
                var618.append("CS2: ").append(arg0.field6070).append(" ");
                for (int var619 = field6058 - 1; var619 >= 0; var619--) {
                    var618.append("v: ").append(field6046[var619].field1420.field6070).append(" ");
                }
                var618.append("op: ").append(var7);
                class334.method2191(true, var618.toString(), var620);
            } else {
                class154.method1135("Clientscript error in: " + arg0.field696, (byte) -115);
                StringBuffer var615 = new StringBuffer(30);
                var615.append("Clientscript error in: ").append(arg0.field696).append("\n");
                for (int var616 = field6058 - 1; var616 >= 0; var616--) {
                    var615.append("via: ").append(field6046[var616].field1420.field696).append("\n");
                }
                var615.append("Op: ").append(var7).append("\n");
                String var617 = var620.getMessage();
                if (var617 != null && var617.length() > 0) {
                    var615.append("Message: ").append(var617).append("\n");
                }
                class334.method2191(true, var615.toString(), var620);
                class295.method1999((byte) -124, var615.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 7045)
    public static final void method2657(int arg0) {
        if (arg0 == -1 || !class103.method609(arg0, 1)) {
            return;
        }
        class223[] var1 = class186.field2657[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class223 var3 = var1[var2];
            if (var3.field3319 != null) {
                class79 var4 = new class79();
                var4.field1018 = var3;
                var4.field1028 = var3.field3319;
                method2654(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 7078)
    public static void method2658() {
        field6047 = null;
        field6044 = null;
        field6048 = null;
        field6064 = null;
        field6057 = null;
        field6050 = null;
        field6046 = null;
        field6052 = null;
        field6049 = null;
        field6061 = null;
        field6045 = null;
        field6066 = null;
        field6068 = null;
        field6065 = null;
    }
}
