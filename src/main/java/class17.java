import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class17 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "[I")
    private static int[] field210 = new int[5];

    @OriginalMember(owner = "client!an", name = "d", descriptor = "[I")
    private static int[] field209 = new int[1000];

    @OriginalMember(owner = "client!an", name = "k", descriptor = "[[I")
    private static int[][] field216 = new int[5][5000];

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    private static int field222 = 0;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field220 = new String[1000];

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[Lwm;")
    private static class334[] field226 = new class334[50];

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Ljava/util/Calendar;")
    private static Calendar field221 = Calendar.getInstance();

    @OriginalMember(owner = "client!an", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field230 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!an", name = "z", descriptor = "[I")
    private static int[] field231 = new int[3];

    @OriginalMember(owner = "client!an", name = "x", descriptor = "Lal;")
    public static class52 field229 = new class52(4);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lne;")
    private static class172 field212;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Lne;")
    private static class172 field223;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Luo;")
    private static class343 field225;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[I")
    private static int[] field208;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "[Ljava/lang/String;")
    private static String[] field228;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lgf;I)V", line = 14)
    private static final void method134(class150 arg0, int arg1) {
        Object[] var2 = arg0.field2352;
        int var3 = (Integer) var2[0];
        class415 var4 = class256.method1775(var3, (byte) -32);
        if (var4 == null) {
            return;
        }
        field208 = new int[var4.field6134];
        int var5 = 0;
        field228 = new String[var4.field6133];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2347;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2344;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2348 == null ? -1 : arg0.field2348.field2865;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2351;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2348 == null ? -1 : arg0.field2348.field2693;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2349 == null ? -1 : arg0.field2349.field2865;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2349 == null ? -1 : arg0.field2349.field2693;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2340;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2337;
                }
                field208[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2346;
                }
                field228[var6++] = var9;
            }
        }
        method137(var4, arg1);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lgf;)V", line = 92)
    public static final void method135(class150 arg0) {
        method134(arg0, 200000);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 95)
    public static final void method136(int arg0) {
        if (arg0 == -1 || !class178.method1225(49, arg0)) {
            return;
        }
        class172[] var1 = class203.field3266[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class172 var3 = var1[var2];
            if (var3.field2757 != null) {
                class150 var4 = new class150();
                var4.field2348 = var3;
                var4.field2352 = var3.field2757;
                method134(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lic;I)V", line = 125)
    private static final void method137(class415 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field6142;
        int[] var6 = arg0.field6140;
        byte var7 = -1;
        field222 = 0;
        try {
            int var8 = 0;
            label4471: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var620 = var5[var4];
                if (var620 < 100) {
                    if (var620 == 0) {
                        field209[var2++] = var6[var4];
                        continue;
                    }
                    if (var620 == 1) {
                        int var9 = var6[var4];
                        field209[var2++] = class403.field6014[var9];
                        continue;
                    }
                    if (var620 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class141.method1026(field209[var2], var10, 3666);
                        continue;
                    }
                    if (var620 == 3) {
                        field220[var3++] = arg0.field6147[var4];
                        continue;
                    }
                    if (var620 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var620 == 7) {
                        var2 -= 2;
                        if (field209[var2 + 1] != field209[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 8) {
                        var2 -= 2;
                        if (field209[var2 + 1] == field209[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 9) {
                        var2 -= 2;
                        if (field209[var2] < field209[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 10) {
                        var2 -= 2;
                        if (field209[var2] > field209[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 21) {
                        if (field222 == 0) {
                            return;
                        }
                        class334 var11 = field226[--field222];
                        arg0 = var11.field5212;
                        var5 = arg0.field6142;
                        var6 = arg0.field6140;
                        var4 = var11.field5210;
                        field208 = var11.field5214;
                        field228 = var11.field5216;
                        continue;
                    }
                    if (var620 == 25) {
                        int var12 = var6[var4];
                        field209[var2++] = class338.method2228(var12, -105);
                        continue;
                    }
                    if (var620 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class19.method147(field209[var2], -1, var13);
                        continue;
                    }
                    if (var620 == 31) {
                        var2 -= 2;
                        if (field209[var2] <= field209[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 32) {
                        var2 -= 2;
                        if (field209[var2] >= field209[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var620 == 33) {
                        field209[var2++] = field208[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var620 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field208[var10001] = field209[var2];
                        continue;
                    }
                    if (var620 == 35) {
                        field220[var3++] = field228[var6[var4]];
                        continue;
                    }
                    if (var620 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field228[var10001] = field220[var3];
                        continue;
                    }
                    if (var620 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class412.method2582((byte) -124, var3, var14, field220);
                        field220[var3++] = var15;
                        continue;
                    }
                    if (var620 == 38) {
                        var2--;
                        continue;
                    }
                    if (var620 == 39) {
                        var3--;
                        continue;
                    }
                    if (var620 == 40) {
                        int var16 = var6[var4];
                        class415 var17 = class256.method1775(var16, (byte) -114);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field6134];
                        String[] var19 = new String[var17.field6133];
                        for (int var20 = 0; var20 < var17.field6148; var20++) {
                            var18[var20] = field209[var2 + var20 - var17.field6148];
                        }
                        for (int var21 = 0; var21 < var17.field6149; var21++) {
                            var19[var21] = field220[var3 + var21 - var17.field6149];
                        }
                        var2 -= var17.field6148;
                        var3 -= var17.field6149;
                        class334 var22 = new class334();
                        var22.field5212 = arg0;
                        var22.field5210 = var4;
                        var22.field5214 = field208;
                        var22.field5216 = field228;
                        if (field222 >= field226.length) {
                            throw new RuntimeException();
                        }
                        field226[field222++] = var22;
                        arg0 = var17;
                        var5 = var17.field6142;
                        var6 = var17.field6140;
                        var4 = -1;
                        field208 = var18;
                        field228 = var19;
                        continue;
                    }
                    if (var620 == 42) {
                        field209[var2++] = class158.field2520[var6[var4]];
                        continue;
                    }
                    if (var620 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class158.field2520[var23] = field209[var2];
                        class183.method1249(var23, 22630);
                        class52.field636 |= class338.field5250[var23];
                        continue;
                    }
                    if (var620 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field209[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field210[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4471;
                                }
                                field216[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var620 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field209[var2];
                        if (var30 >= 0 && var30 < field210[var29]) {
                            field209[var2++] = field216[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var620 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field209[var2];
                        if (var32 >= 0 && var32 < field210[var31]) {
                            field216[var31][var32] = field209[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var620 == 47) {
                        String var33 = class186.field3054[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field220[var3++] = var33;
                        continue;
                    }
                    if (var620 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class186.field3054[var34] = field220[var3];
                        class1.method5(2, var34);
                        continue;
                    }
                    if (var620 == 51) {
                        class256 var35 = arg0.field6136[var6[var4]];
                        var2--;
                        class160 var36 = (class160) var35.method1770(-880, (long) field209[var2]);
                        if (var36 != null) {
                            var4 += var36.field2527;
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
                if (var620 < 300) {
                    if (var620 == 100) {
                        var2 -= 3;
                        int var38 = field209[var2];
                        int var39 = field209[var2 + 1];
                        int var40 = field209[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class172 var41 = class196.method1375(var38, (byte) -56);
                        if (var41.field2866 == null) {
                            var41.field2866 = new class172[var40 + 1];
                        }
                        if (var41.field2866.length <= var40) {
                            class172[] var42 = new class172[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2866.length; var43++) {
                                var42[var43] = var41.field2866[var43];
                            }
                            var41.field2866 = var42;
                        }
                        if (var40 > 0 && var41.field2866[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class172 var44 = new class172();
                        var44.field2707 = var39;
                        var44.field2735 = var44.field2865 = var41.field2865;
                        var44.field2693 = var40;
                        var44.field2712 = true;
                        var41.field2866[var40] = var44;
                        if (var37) {
                            field223 = var44;
                        } else {
                            field212 = var44;
                        }
                        class336.method2219((byte) 6, var41);
                        continue;
                    }
                    if (var620 == 101) {
                        class172 var45 = var37 ? field223 : field212;
                        if (var45.field2693 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class172 var46 = class196.method1375(var45.field2865, (byte) -56);
                        var46.field2866[var45.field2693] = null;
                        class336.method2219((byte) 6, var46);
                        continue;
                    }
                    if (var620 == 102) {
                        var2--;
                        class172 var47 = class196.method1375(field209[var2], (byte) -56);
                        var47.field2866 = null;
                        class336.method2219((byte) 6, var47);
                        continue;
                    }
                    if (var620 == 200) {
                        var2 -= 2;
                        int var48 = field209[var2];
                        int var49 = field209[var2 + 1];
                        class172 var50 = class201.method1393(var48, var49, -121);
                        if (var50 != null && var49 != -1) {
                            field209[var2++] = 1;
                            if (var37) {
                                field223 = var50;
                            } else {
                                field212 = var50;
                            }
                            continue;
                        }
                        field209[var2++] = 0;
                        continue;
                    }
                    if (var620 == 201) {
                        var2--;
                        int var51 = field209[var2];
                        class172 var52 = class196.method1375(var51, (byte) -56);
                        if (var52 == null) {
                            field209[var2++] = 0;
                        } else {
                            field209[var2++] = 1;
                            if (var37) {
                                field223 = var52;
                            } else {
                                field212 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var620 < 500) {
                    if (var620 == 403) {
                        var2 -= 2;
                        int var53 = field209[var2];
                        int var54 = field209[var2 + 1];
                        for (int var55 = 0; var55 < class433.field6399.length; var55++) {
                            if (class433.field6399[var55] == var53) {
                                class261.field4201.field3599.method1464(var54, true, var55);
                                continue label4471;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class309.field4891.length) {
                                continue label4471;
                            }
                            if (class309.field4891[var56] == var53) {
                                class261.field4201.field3599.method1464(var54, true, var56);
                                continue label4471;
                            }
                            var56++;
                        }
                    }
                    if (var620 == 404) {
                        var2 -= 2;
                        int var57 = field209[var2];
                        int var58 = field209[var2 + 1];
                        class261.field4201.field3599.method1467(-117, var57, var58);
                        continue;
                    }
                    if (var620 == 410) {
                        var2--;
                        boolean var59 = field209[var2] != 0;
                        class261.field4201.field3599.method1466(var59, -1953084273);
                        continue;
                    }
                } else if (!(var620 < 1000 || var620 >= 1100) || !(var620 < 2000 || var620 >= 2100)) {
                    class172 var60;
                    if (var620 >= 2000) {
                        var620 -= 1000;
                        var2--;
                        var60 = class196.method1375(field209[var2], (byte) -56);
                    } else {
                        var60 = var37 ? field223 : field212;
                    }
                    if (var620 == 1000) {
                        var2 -= 4;
                        var60.field2739 = field209[var2];
                        var60.field2828 = field209[var2 + 1];
                        int var61 = field209[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field209[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2835 = (byte) var61;
                        var60.field2824 = (byte) var62;
                        class336.method2219((byte) 6, var60);
                        class60.method390(var60, 123);
                        if (var60.field2693 == -1) {
                            class304.method2039(var60.field2865, (byte) -43);
                        }
                        continue;
                    }
                    if (var620 == 1001) {
                        var2 -= 4;
                        var60.field2692 = field209[var2];
                        var60.field2697 = field209[var2 + 1];
                        var60.field2785 = 0;
                        var60.field2698 = 0;
                        int var63 = field209[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field209[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2704 = (byte) var63;
                        var60.field2774 = (byte) var64;
                        class336.method2219((byte) 6, var60);
                        class60.method390(var60, 119);
                        if (var60.field2707 == 0) {
                            class68.method431(1099639664, var60, false);
                        }
                        continue;
                    }
                    if (var620 == 1003) {
                        var2--;
                        boolean var65 = field209[var2] == 1;
                        if (var60.field2809 != var65) {
                            var60.field2809 = var65;
                            class336.method2219((byte) 6, var60);
                        }
                        if (var60.field2693 == -1) {
                            class142.method1038((byte) -107, var60.field2865);
                        }
                        continue;
                    }
                    if (var620 == 1004) {
                        var2 -= 2;
                        var60.field2718 = field209[var2];
                        var60.field2731 = field209[var2 + 1];
                        class336.method2219((byte) 6, var60);
                        class60.method390(var60, 118);
                        if (var60.field2707 == 0) {
                            class68.method431(1099639664, var60, false);
                        }
                        continue;
                    }
                    if (var620 == 1005) {
                        var2--;
                        var60.field2721 = field209[var2] == 1;
                        continue;
                    }
                } else if (!(var620 < 1100 || var620 >= 1200) || !(var620 < 2100 || var620 >= 2200)) {
                    class172 var66;
                    if (var620 >= 2000) {
                        var620 -= 1000;
                        var2--;
                        var66 = class196.method1375(field209[var2], (byte) -56);
                    } else {
                        var66 = var37 ? field223 : field212;
                    }
                    if (var620 == 1100) {
                        var2 -= 2;
                        var66.field2791 = field209[var2];
                        if (var66.field2791 > var66.field2799 - var66.field2705) {
                            var66.field2791 = var66.field2799 - var66.field2705;
                        }
                        if (var66.field2791 < 0) {
                            var66.field2791 = 0;
                        }
                        var66.field2696 = field209[var2 + 1];
                        if (var66.field2696 > var66.field2830 - var66.field2834) {
                            var66.field2696 = var66.field2830 - var66.field2834;
                        }
                        if (var66.field2696 < 0) {
                            var66.field2696 = 0;
                        }
                        class336.method2219((byte) 6, var66);
                        if (var66.field2693 == -1) {
                            class441.method2714(var66.field2865, 1465);
                        }
                        continue;
                    }
                    if (var620 == 1101) {
                        var2--;
                        var66.field2772 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        if (var66.field2693 == -1) {
                            class179.method1230(var66.field2865, 6);
                        }
                        continue;
                    }
                    if (var620 == 1102) {
                        var2--;
                        var66.field2708 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1103) {
                        var2--;
                        var66.field2853 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1104) {
                        var2--;
                        var66.field2793 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1105) {
                        var2--;
                        int var67 = field209[var2];
                        if (var66.field2789 != var67) {
                            var66.field2789 = var67;
                            class336.method2219((byte) 6, var66);
                        }
                        if (var66.field2693 == -1) {
                            class258.method1784(var66.field2865, (byte) 100);
                        }
                        continue;
                    }
                    if (var620 == 1106) {
                        var2--;
                        var66.field2796 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1107) {
                        var2--;
                        var66.field2775 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1108) {
                        var66.field2779 = 1;
                        var2--;
                        var66.field2794 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        if (var66.field2693 == -1) {
                            class353.method2301(var66.field2865, -50);
                        }
                        continue;
                    }
                    if (var620 == 1109) {
                        var2 -= 6;
                        var66.field2792 = field209[var2];
                        var66.field2790 = field209[var2 + 1];
                        var66.field2771 = field209[var2 + 2];
                        var66.field2818 = field209[var2 + 3];
                        var66.field2725 = field209[var2 + 4];
                        var66.field2860 = field209[var2 + 5];
                        class336.method2219((byte) 6, var66);
                        if (var66.field2693 == -1) {
                            class62.method404(var66.field2865, (byte) -117);
                            class112.method829(10, var66.field2865);
                        }
                        continue;
                    }
                    if (var620 == 1110) {
                        var2--;
                        int var68 = field209[var2];
                        if (var66.field2840 != var68) {
                            var66.field2840 = var68;
                            var66.field2754 = 0;
                            var66.field2738 = 1;
                            var66.field2839 = 0;
                            class336.method2219((byte) 6, var66);
                        }
                        if (var66.field2693 == -1) {
                            class323.method2143((byte) -126, var66.field2865);
                        }
                        continue;
                    }
                    if (var620 == 1111) {
                        var2--;
                        var66.field2805 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1112) {
                        var3--;
                        String var69 = field220[var3];
                        if (!var69.equals(var66.field2851)) {
                            var66.field2851 = var69;
                            class336.method2219((byte) 6, var66);
                        }
                        if (var66.field2693 == -1) {
                            class430.method2666(3, var66.field2865);
                        }
                        continue;
                    }
                    if (var620 == 1113) {
                        var2--;
                        var66.field2810 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1114) {
                        var2 -= 3;
                        var66.field2802 = field209[var2];
                        var66.field2690 = field209[var2 + 1];
                        var66.field2820 = field209[var2 + 2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1115) {
                        var2--;
                        var66.field2871 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1116) {
                        var2--;
                        var66.field2857 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1117) {
                        var2--;
                        var66.field2842 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1118) {
                        var2--;
                        var66.field2836 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1119) {
                        var2--;
                        var66.field2748 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1120) {
                        var2 -= 2;
                        var66.field2799 = field209[var2];
                        var66.field2830 = field209[var2 + 1];
                        class336.method2219((byte) 6, var66);
                        if (var66.field2707 == 0) {
                            class68.method431(1099639664, var66, false);
                        }
                        continue;
                    }
                    if (var620 == 1121) {
                        var2 -= 2;
                        var66.field2776 = (short) field209[var2];
                        var66.field2694 = (short) field209[var2 + 1];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1122) {
                        var2--;
                        var66.field2702 = field209[var2] == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1123) {
                        var2--;
                        var66.field2860 = field209[var2];
                        class336.method2219((byte) 6, var66);
                        if (var66.field2693 == -1) {
                            class62.method404(var66.field2865, (byte) -100);
                        }
                        continue;
                    }
                    if (var620 == 1124) {
                        var2--;
                        int var70 = field209[var2];
                        var66.field2800 = var70 == 1;
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                    if (var620 == 1125) {
                        var2 -= 2;
                        var66.field2845 = field209[var2];
                        var66.field2760 = field209[var2 + 1];
                        class336.method2219((byte) 6, var66);
                        continue;
                    }
                } else if (var620 >= 1200 && var620 < 1300 || var620 >= 2200 && var620 < 2300) {
                    class172 var71;
                    if (var620 >= 2000) {
                        var620 -= 1000;
                        var2--;
                        var71 = class196.method1375(field209[var2], (byte) -56);
                    } else {
                        var71 = var37 ? field223 : field212;
                    }
                    class336.method2219((byte) 6, var71);
                    if (var620 == 1200 || var620 == 1205 || var620 == 1208 || var620 == 1209 || var620 == 1212 || var620 == 1213) {
                        var2 -= 2;
                        int var72 = field209[var2];
                        int var73 = field209[var2 + 1];
                        if (var71.field2693 == -1) {
                            class318.method2113(var71.field2865, 8);
                            class62.method404(var71.field2865, (byte) 106);
                            class112.method829(10, var71.field2865);
                        }
                        if (var72 == -1) {
                            var71.field2779 = 1;
                            var71.field2794 = -1;
                            var71.field2691 = -1;
                        } else {
                            var71.field2691 = var72;
                            var71.field2848 = var73;
                            if (var620 == 1208 || var620 == 1209) {
                                var71.field2826 = true;
                            } else {
                                var71.field2826 = false;
                            }
                            class97 var74 = class155.method1092(true, var72);
                            var71.field2771 = var74.field1369;
                            var71.field2818 = var74.field1304;
                            var71.field2725 = var74.field1303;
                            var71.field2792 = var74.field1341;
                            var71.field2790 = var74.field1344;
                            var71.field2860 = var74.field1302;
                            if (var620 == 1205 || var620 == 1209) {
                                var71.field2734 = 0;
                            } else if (var620 == 1212 || var620 == 1213) {
                                var71.field2734 = 1;
                            } else {
                                var71.field2734 = 2;
                            }
                            if (var71.field2785 > 0) {
                                var71.field2860 = var71.field2860 * 32 / var71.field2785;
                            } else if (var71.field2692 > 0) {
                                var71.field2860 = var71.field2860 * 32 / var71.field2692;
                            }
                        }
                        continue;
                    }
                    if (var620 == 1201) {
                        var71.field2779 = 2;
                        var2--;
                        var71.field2794 = field209[var2];
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -58);
                        }
                        continue;
                    }
                    if (var620 == 1202) {
                        var71.field2779 = 3;
                        var71.field2794 = -1;
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -36);
                        }
                        continue;
                    }
                    if (var620 == 1203) {
                        var71.field2779 = 6;
                        var2--;
                        var71.field2794 = field209[var2];
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -55);
                        }
                        continue;
                    }
                    if (var620 == 1204) {
                        var71.field2779 = 5;
                        var2--;
                        var71.field2794 = field209[var2];
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -96);
                        }
                        continue;
                    }
                    if (var620 == 1206) {
                        var2 -= 4;
                        var71.field2728 = field209[var2];
                        var71.field2864 = field209[var2 + 1];
                        var71.field2756 = field209[var2 + 2];
                        var71.field2827 = field209[var2 + 3];
                        class336.method2219((byte) 6, var71);
                        continue;
                    }
                    if (var620 == 1207) {
                        var2 -= 2;
                        var71.field2849 = field209[var2];
                        var71.field2814 = field209[var2 + 1];
                        class336.method2219((byte) 6, var71);
                        continue;
                    }
                    if (var620 == 1210) {
                        var2 -= 4;
                        var71.field2794 = field209[var2];
                        var71.field2843 = field209[var2 + 1];
                        if (field209[var2 + 2] == 1) {
                            var71.field2779 = 9;
                        } else {
                            var71.field2779 = 8;
                        }
                        if (field209[var2 + 3] == 1) {
                            var71.field2826 = true;
                        } else {
                            var71.field2826 = false;
                        }
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -62);
                        }
                        continue;
                    }
                    if (var620 == 1211) {
                        var71.field2779 = 5;
                        var71.field2794 = 2047;
                        var71.field2843 = 0;
                        if (var71.field2693 == -1) {
                            class353.method2301(var71.field2865, -112);
                        }
                        continue;
                    }
                } else if ((var620 < 1300 || var620 >= 1400) && (var620 < 2300 || var620 >= 2400)) {
                    if (var620 >= 1400 && var620 < 1500 || var620 >= 2400 && var620 < 2500) {
                        class172 var81;
                        if (var620 >= 2000) {
                            var620 -= 1000;
                            var2--;
                            var81 = class196.method1375(field209[var2], (byte) -56);
                        } else {
                            var81 = var37 ? field223 : field212;
                        }
                        var3--;
                        String var82 = field220[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field209[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field209[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field220[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field209[var2]);
                            }
                        }
                        var2--;
                        int var87 = field209[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var620 == 1400) {
                            var81.field2868 = var85;
                        } else if (var620 == 1401) {
                            var81.field2765 = var85;
                        } else if (var620 == 1402) {
                            var81.field2808 = var85;
                        } else if (var620 == 1403) {
                            var81.field2806 = var85;
                        } else if (var620 == 1404) {
                            var81.field2863 = var85;
                        } else if (var620 == 1405) {
                            var81.field2861 = var85;
                        } else if (var620 == 1406) {
                            var81.field2710 = var85;
                        } else if (var620 == 1407) {
                            var81.field2852 = var85;
                            var81.field2811 = var83;
                        } else if (var620 == 1408) {
                            var81.field2744 = var85;
                        } else if (var620 == 1409) {
                            var81.field2767 = var85;
                        } else if (var620 == 1410) {
                            var81.field2763 = var85;
                        } else if (var620 == 1411) {
                            var81.field2761 = var85;
                        } else if (var620 == 1412) {
                            var81.field2737 = var85;
                        } else if (var620 == 1414) {
                            var81.field2778 = var85;
                            var81.field2787 = var83;
                        } else if (var620 == 1415) {
                            var81.field2844 = var85;
                            var81.field2736 = var83;
                        } else if (var620 == 1416) {
                            var81.field2825 = var85;
                        } else if (var620 == 1417) {
                            var81.field2782 = var85;
                        } else if (var620 == 1418) {
                            var81.field2740 = var85;
                        } else if (var620 == 1419) {
                            var81.field2847 = var85;
                        } else if (var620 == 1420) {
                            var81.field2747 = var85;
                        } else if (var620 == 1421) {
                            var81.field2832 = var85;
                        } else if (var620 == 1422) {
                            var81.field2743 = var85;
                        } else if (var620 == 1423) {
                            var81.field2746 = var85;
                        } else if (var620 == 1424) {
                            var81.field2841 = var85;
                        } else if (var620 == 1425) {
                            var81.field2717 = var85;
                        } else if (var620 == 1426) {
                            var81.field2829 = var85;
                        } else if (var620 == 1427) {
                            var81.field2703 = var85;
                        } else if (var620 == 1428) {
                            var81.field2859 = var85;
                            var81.field2755 = var83;
                        } else if (var620 == 1429) {
                            var81.field2732 = var85;
                            var81.field2872 = var83;
                        }
                        var81.field2838 = true;
                        continue;
                    }
                    if (var620 < 1600) {
                        class172 var88 = var37 ? field223 : field212;
                        if (var620 == 1500) {
                            field209[var2++] = var88.field2766;
                            continue;
                        }
                        if (var620 == 1501) {
                            field209[var2++] = var88.field2726;
                            continue;
                        }
                        if (var620 == 1502) {
                            field209[var2++] = var88.field2705;
                            continue;
                        }
                        if (var620 == 1503) {
                            field209[var2++] = var88.field2834;
                            continue;
                        }
                        if (var620 == 1504) {
                            field209[var2++] = var88.field2809 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 1505) {
                            field209[var2++] = var88.field2735;
                            continue;
                        }
                    } else if (var620 < 1700) {
                        class172 var89 = var37 ? field223 : field212;
                        if (var620 == 1600) {
                            field209[var2++] = var89.field2791;
                            continue;
                        }
                        if (var620 == 1601) {
                            field209[var2++] = var89.field2696;
                            continue;
                        }
                        if (var620 == 1602) {
                            field220[var3++] = var89.field2851;
                            continue;
                        }
                        if (var620 == 1603) {
                            field209[var2++] = var89.field2799;
                            continue;
                        }
                        if (var620 == 1604) {
                            field209[var2++] = var89.field2830;
                            continue;
                        }
                        if (var620 == 1605) {
                            field209[var2++] = var89.field2860;
                            continue;
                        }
                        if (var620 == 1606) {
                            field209[var2++] = var89.field2771;
                            continue;
                        }
                        if (var620 == 1607) {
                            field209[var2++] = var89.field2725;
                            continue;
                        }
                        if (var620 == 1608) {
                            field209[var2++] = var89.field2818;
                            continue;
                        }
                        if (var620 == 1609) {
                            field209[var2++] = var89.field2853;
                            continue;
                        }
                        if (var620 == 1610) {
                            field209[var2++] = var89.field2792;
                            continue;
                        }
                        if (var620 == 1611) {
                            field209[var2++] = var89.field2790;
                            continue;
                        }
                        if (var620 == 1612) {
                            field209[var2++] = var89.field2789;
                            continue;
                        }
                    } else if (var620 < 1800) {
                        class172 var90 = var37 ? field223 : field212;
                        if (var620 == 1700) {
                            field209[var2++] = var90.field2691;
                            continue;
                        }
                        if (var620 == 1701) {
                            if (var90.field2691 == -1) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var90.field2848;
                            }
                            continue;
                        }
                        if (var620 == 1702) {
                            field209[var2++] = var90.field2693;
                            continue;
                        }
                    } else if (var620 < 1900) {
                        class172 var91 = var37 ? field223 : field212;
                        if (var620 == 1800) {
                            field209[var2++] = client.method1149(var91).method353(127);
                            continue;
                        }
                        if (var620 == 1801) {
                            var2--;
                            int var92 = field209[var2];
                            int var621 = var92 - 1;
                            if (var91.field2823 != null && var621 < var91.field2823.length && var91.field2823[var621] != null) {
                                field220[var3++] = var91.field2823[var621];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 1802) {
                            if (var91.field2801 == null) {
                                field220[var3++] = "";
                            } else {
                                field220[var3++] = var91.field2801;
                            }
                            continue;
                        }
                    } else if (var620 < 2600) {
                        var2--;
                        class172 var93 = class196.method1375(field209[var2], (byte) -56);
                        if (var620 == 2500) {
                            field209[var2++] = var93.field2766;
                            continue;
                        }
                        if (var620 == 2501) {
                            field209[var2++] = var93.field2726;
                            continue;
                        }
                        if (var620 == 2502) {
                            field209[var2++] = var93.field2705;
                            continue;
                        }
                        if (var620 == 2503) {
                            field209[var2++] = var93.field2834;
                            continue;
                        }
                        if (var620 == 2504) {
                            field209[var2++] = var93.field2809 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 2505) {
                            field209[var2++] = var93.field2735;
                            continue;
                        }
                    } else if (var620 < 2700) {
                        var2--;
                        class172 var94 = class196.method1375(field209[var2], (byte) -56);
                        if (var620 == 2600) {
                            field209[var2++] = var94.field2791;
                            continue;
                        }
                        if (var620 == 2601) {
                            field209[var2++] = var94.field2696;
                            continue;
                        }
                        if (var620 == 2602) {
                            field220[var3++] = var94.field2851;
                            continue;
                        }
                        if (var620 == 2603) {
                            field209[var2++] = var94.field2799;
                            continue;
                        }
                        if (var620 == 2604) {
                            field209[var2++] = var94.field2830;
                            continue;
                        }
                        if (var620 == 2605) {
                            field209[var2++] = var94.field2860;
                            continue;
                        }
                        if (var620 == 2606) {
                            field209[var2++] = var94.field2771;
                            continue;
                        }
                        if (var620 == 2607) {
                            field209[var2++] = var94.field2725;
                            continue;
                        }
                        if (var620 == 2608) {
                            field209[var2++] = var94.field2818;
                            continue;
                        }
                        if (var620 == 2609) {
                            field209[var2++] = var94.field2853;
                            continue;
                        }
                        if (var620 == 2610) {
                            field209[var2++] = var94.field2792;
                            continue;
                        }
                        if (var620 == 2611) {
                            field209[var2++] = var94.field2790;
                            continue;
                        }
                        if (var620 == 2612) {
                            field209[var2++] = var94.field2789;
                            continue;
                        }
                    } else if (var620 < 2800) {
                        if (var620 == 2700) {
                            var2--;
                            class172 var95 = class196.method1375(field209[var2], (byte) -56);
                            field209[var2++] = var95.field2691;
                            continue;
                        }
                        if (var620 == 2701) {
                            var2--;
                            class172 var96 = class196.method1375(field209[var2], (byte) -56);
                            if (var96.field2691 == -1) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var96.field2848;
                            }
                            continue;
                        }
                        if (var620 == 2702) {
                            var2--;
                            int var97 = field209[var2];
                            class196 var98 = (class196) class392.field5891.method1770(-880, (long) var97);
                            if (var98 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = 1;
                            }
                            continue;
                        }
                        if (var620 == 2703) {
                            var2--;
                            class172 var99 = class196.method1375(field209[var2], (byte) -56);
                            if (var99.field2866 == null) {
                                field209[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field2866.length;
                            for (int var101 = 0; var101 < var99.field2866.length; var101++) {
                                if (var99.field2866[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field209[var2++] = var100;
                            continue;
                        }
                        if (var620 == 2704 || var620 == 2705) {
                            var2 -= 2;
                            int var102 = field209[var2];
                            int var103 = field209[var2 + 1];
                            class196 var104 = (class196) class392.field5891.method1770(-880, (long) var102);
                            if (var104 != null && var104.field3171 == var103) {
                                field209[var2++] = 1;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                    } else if (var620 < 2900) {
                        var2--;
                        class172 var105 = class196.method1375(field209[var2], (byte) -56);
                        if (var620 == 2800) {
                            field209[var2++] = client.method1149(var105).method353(127);
                            continue;
                        }
                        if (var620 == 2801) {
                            var2--;
                            int var106 = field209[var2];
                            int var622 = var106 - 1;
                            if (var105.field2823 != null && var622 < var105.field2823.length && var105.field2823[var622] != null) {
                                field220[var3++] = var105.field2823[var622];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 2802) {
                            if (var105.field2801 == null) {
                                field220[var3++] = "";
                            } else {
                                field220[var3++] = var105.field2801;
                            }
                            continue;
                        }
                    } else if (var620 < 3200) {
                        if (var620 == 3100) {
                            var3--;
                            String var107 = field220[var3];
                            class357.method2329(var107, 0);
                            continue;
                        }
                        if (var620 == 3101) {
                            var2 -= 2;
                            class349.method2276(0, class261.field4201, field209[var2 + 1], field209[var2]);
                            continue;
                        }
                        if (var620 == 3103) {
                            class155.method1095(251, true);
                            continue;
                        }
                        if (var620 == 3104) {
                            var3--;
                            String var108 = field220[var3];
                            int var109 = 0;
                            if (class9.method99(10, var108)) {
                                var109 = class162.method1128(var108, 119);
                            }
                            field214++;
                            class11.field139.method2224(136, (byte) 0);
                            class11.field139.method1315(var109, (byte) 67);
                            continue;
                        }
                        if (var620 == 3105) {
                            var3--;
                            String var110 = field220[var3];
                            field213++;
                            class11.field139.method2224(201, (byte) 0);
                            class11.field139.method1312(var110.length() + 1, -49);
                            class11.field139.method1301(var110, 105);
                            continue;
                        }
                        if (var620 == 3106) {
                            var3--;
                            String var111 = field220[var3];
                            field217++;
                            class11.field139.method2224(156, (byte) 0);
                            class11.field139.method1312(var111.length() + 1, -41);
                            class11.field139.method1301(var111, 112);
                            continue;
                        }
                        if (var620 == 3107) {
                            var2--;
                            int var112 = field209[var2];
                            var3--;
                            String var113 = field220[var3];
                            class196.method1377(var112, 100, var113);
                            continue;
                        }
                        if (var620 == 3108) {
                            var2 -= 3;
                            int var114 = field209[var2];
                            int var115 = field209[var2 + 1];
                            int var116 = field209[var2 + 2];
                            class172 var117 = class196.method1375(var116, (byte) -56);
                            class326.method2166(true, var115, var114, var117);
                            continue;
                        }
                        if (var620 == 3109) {
                            var2 -= 2;
                            int var118 = field209[var2];
                            int var119 = field209[var2 + 1];
                            class172 var120 = var37 ? field223 : field212;
                            class326.method2166(true, var119, var118, var120);
                            continue;
                        }
                        if (var620 == 3110) {
                            var2--;
                            int var121 = field209[var2];
                            field207++;
                            class11.field139.method2224(129, (byte) 0);
                            class11.field139.method1283(8, var121);
                            continue;
                        }
                        if (var620 == 3111) {
                            var2 -= 2;
                            int var122 = field209[var2];
                            int var123 = field209[var2 + 1];
                            class196 var124 = (class196) class392.field5891.method1770(-880, (long) var122);
                            if (var124 != null) {
                                class140.method1020(var124.field3171 != var123, false, true, var124);
                            }
                            class127.method933(3, var123, (byte) 110, var122, true);
                            continue;
                        }
                        if (var620 == 3112) {
                            var2--;
                            int var125 = field209[var2];
                            class196 var126 = (class196) class392.field5891.method1770(-880, (long) var125);
                            if (var126 != null && var126.field3177 == 3) {
                                class140.method1020(true, false, true, var126);
                            }
                            continue;
                        }
                    } else if (var620 < 3300) {
                        if (var620 == 3200) {
                            var2 -= 3;
                            class426.method2641(field209[var2 + 1], field209[var2 + 2], -1, 255, field209[var2]);
                            continue;
                        }
                        if (var620 == 3201) {
                            var2--;
                            class321.method2135(255, 255, field209[var2]);
                            continue;
                        }
                        if (var620 == 3202) {
                            var2 -= 2;
                            class386.method2450(104, field209[var2], field209[var2 + 1], 255);
                            continue;
                        }
                    } else if (var620 < 3400) {
                        if (var620 == 3300) {
                            field209[var2++] = class183.field2987;
                            continue;
                        }
                        if (var620 == 3301) {
                            var2 -= 2;
                            int var127 = field209[var2];
                            int var128 = field209[var2 + 1];
                            field209[var2++] = class337.method2220(var128, 118, var127);
                            continue;
                        }
                        if (var620 == 3302) {
                            var2 -= 2;
                            int var129 = field209[var2];
                            int var130 = field209[var2 + 1];
                            field209[var2++] = class288.method1945(var129, var130, 76);
                            continue;
                        }
                        if (var620 == 3303) {
                            var2 -= 2;
                            int var131 = field209[var2];
                            int var132 = field209[var2 + 1];
                            field209[var2++] = class373.method2380(0, var132, var131);
                            continue;
                        }
                        if (var620 == 3304) {
                            var2--;
                            int var133 = field209[var2];
                            field209[var2++] = class323.method2142(var133, 125).field3004;
                            continue;
                        }
                        if (var620 == 3305) {
                            var2--;
                            int var134 = field209[var2];
                            field209[var2++] = class205.field3309[var134];
                            continue;
                        }
                        if (var620 == 3306) {
                            var2--;
                            int var135 = field209[var2];
                            field209[var2++] = class388.field5849[var135];
                            continue;
                        }
                        if (var620 == 3307) {
                            var2--;
                            int var136 = field209[var2];
                            field209[var2++] = class209.field3354[var136];
                            continue;
                        }
                        if (var620 == 3308) {
                            int var137 = class266.field4286;
                            int var138 = (class261.field4201.field724 >> 7) + class409.field6048;
                            int var139 = (class261.field4201.field722 >> 7) + class444.field6481;
                            field209[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var620 == 3309) {
                            var2--;
                            int var140 = field209[var2];
                            field209[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var620 == 3310) {
                            var2--;
                            int var141 = field209[var2];
                            field209[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var620 == 3311) {
                            var2--;
                            int var142 = field209[var2];
                            field209[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var620 == 3312) {
                            field209[var2++] = class84.field1040 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3313) {
                            var2 -= 2;
                            int var143 = field209[var2] + 32768;
                            int var144 = field209[var2 + 1];
                            field209[var2++] = class337.method2220(var144, 42, var143);
                            continue;
                        }
                        if (var620 == 3314) {
                            var2 -= 2;
                            int var145 = field209[var2] + 32768;
                            int var146 = field209[var2 + 1];
                            field209[var2++] = class288.method1945(var145, var146, 81);
                            continue;
                        }
                        if (var620 == 3315) {
                            var2 -= 2;
                            int var147 = field209[var2] + 32768;
                            int var148 = field209[var2 + 1];
                            field209[var2++] = class373.method2380(0, var148, var147);
                            continue;
                        }
                        if (var620 == 3316) {
                            if (class382.field5772 >= 2) {
                                field209[var2++] = class382.field5772;
                            } else {
                                field209[var2++] = 0;
                            }
                            continue;
                        }
                        if (var620 == 3317) {
                            field209[var2++] = class85.field1050;
                            continue;
                        }
                        if (var620 == 3318) {
                            field209[var2++] = class155.field2434;
                            continue;
                        }
                        if (var620 == 3321) {
                            field209[var2++] = class58.field735;
                            continue;
                        }
                        if (var620 == 3322) {
                            field209[var2++] = class77.field964;
                            continue;
                        }
                        if (var620 == 3323) {
                            if (class198.field3190 >= 5 && class198.field3190 <= 9) {
                                field209[var2++] = 1;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3324) {
                            if (class198.field3190 >= 5 && class198.field3190 <= 9) {
                                field209[var2++] = class198.field3190;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3325) {
                            field209[var2++] = class226.field3809 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3326) {
                            field209[var2++] = class261.field4201.field3603;
                            continue;
                        }
                        if (var620 == 3327) {
                            field209[var2++] = class261.field4201.field3599.field3343 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3328) {
                            field209[var2++] = class52.field651 && !class277.field4416 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3329) {
                            field209[var2++] = class333.field5199 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3330) {
                            var2--;
                            int var149 = field209[var2];
                            field209[var2++] = class432.method2673(120, var149);
                            continue;
                        }
                        if (var620 == 3331) {
                            var2 -= 2;
                            int var150 = field209[var2];
                            int var151 = field209[var2 + 1];
                            field209[var2++] = class330.method2189((byte) -82, var151, false, var150);
                            continue;
                        }
                        if (var620 == 3332) {
                            var2 -= 2;
                            int var152 = field209[var2];
                            int var153 = field209[var2 + 1];
                            field209[var2++] = class330.method2189((byte) -28, var153, true, var152);
                            continue;
                        }
                        if (var620 == 3333) {
                            field209[var2++] = class70.field866;
                            continue;
                        }
                        if (var620 == 3335) {
                            field209[var2++] = class205.field3298;
                            continue;
                        }
                        if (var620 == 3336) {
                            var2 -= 4;
                            int var154 = field209[var2];
                            int var155 = field209[var2 + 1];
                            int var156 = field209[var2 + 2];
                            int var157 = field209[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field209[var2++] = var160;
                            continue;
                        }
                        if (var620 == 3337) {
                            field209[var2++] = class173.field2882;
                            continue;
                        }
                        if (var620 == 3338) {
                            field209[var2++] = class367.method2361(122);
                            continue;
                        }
                    } else if (var620 < 3500) {
                        if (var620 == 3400) {
                            var2 -= 2;
                            int var161 = field209[var2];
                            int var162 = field209[var2 + 1];
                            class378 var163 = class145.method1049(-103, var161);
                            field220[var3++] = var163.method2403((byte) 58, var162);
                            continue;
                        }
                        if (var620 == 3408) {
                            var2 -= 4;
                            int var164 = field209[var2];
                            int var165 = field209[var2 + 1];
                            int var166 = field209[var2 + 2];
                            int var167 = field209[var2 + 3];
                            class378 var168 = class145.method1049(37, var166);
                            if (var168.field5712 == var164 && var168.field5708 == var165) {
                                if (var165 == 115) {
                                    field220[var3++] = var168.method2403((byte) 32, var167);
                                } else {
                                    field209[var2++] = var168.method2407(0, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var620 == 3409) {
                            var2 -= 3;
                            int var169 = field209[var2];
                            int var170 = field209[var2 + 1];
                            int var171 = field209[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class378 var172 = class145.method1049(-118, var170);
                            if (var172.field5708 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field209[var2++] = var172.method2409(-6, var171) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3410) {
                            var2--;
                            int var173 = field209[var2];
                            var3--;
                            String var174 = field220[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class378 var175 = class145.method1049(-109, var173);
                            if (var175.field5708 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field209[var2++] = var175.method2405(var174, (byte) -80) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3411) {
                            var2--;
                            int var176 = field209[var2];
                            class378 var177 = class145.method1049(118, var176);
                            field209[var2++] = var177.field5718.method1778(0);
                            continue;
                        }
                    } else if (var620 < 3700) {
                        if (var620 == 3600) {
                            if (class364.field5543 == 0) {
                                field209[var2++] = -2;
                            } else if (class364.field5543 == 1) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = class262.field4215;
                            }
                            continue;
                        }
                        if (var620 == 3601) {
                            var2--;
                            int var178 = field209[var2];
                            if (class364.field5543 == 2 && var178 < class262.field4215) {
                                field220[var3++] = class338.field5248[var178];
                                if (class70.field863[var178] == null) {
                                    field220[var3++] = "";
                                } else {
                                    field220[var3++] = class70.field863[var178];
                                }
                                continue;
                            }
                            field220[var3++] = "";
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3602) {
                            var2--;
                            int var179 = field209[var2];
                            if (class364.field5543 == 2 && var179 < class262.field4215) {
                                field209[var2++] = class236.field3948[var179];
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3603) {
                            var2--;
                            int var180 = field209[var2];
                            if (class364.field5543 == 2 && var180 < class262.field4215) {
                                field209[var2++] = class447.field6517[var180];
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3604) {
                            var3--;
                            String var181 = field220[var3];
                            var2--;
                            int var182 = field209[var2];
                            class152.method1074(var182, 205, var181);
                            continue;
                        }
                        if (var620 == 3605) {
                            var3--;
                            String var183 = field220[var3];
                            class223.method1596(var183, -126);
                            continue;
                        }
                        if (var620 == 3606) {
                            var3--;
                            String var184 = field220[var3];
                            class125.method919((byte) -114, var184);
                            continue;
                        }
                        if (var620 == 3607) {
                            var3--;
                            String var185 = field220[var3];
                            class163.method1133(false, var185, (byte) -7);
                            continue;
                        }
                        if (var620 == 3608) {
                            var3--;
                            String var186 = field220[var3];
                            class304.method2044(var186, 1);
                            continue;
                        }
                        if (var620 == 3609) {
                            var3--;
                            String var187 = field220[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field209[var2++] = class140.method1022(-98, var187) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3610) {
                            var2--;
                            int var188 = field209[var2];
                            if (class364.field5543 == 2 && var188 < class262.field4215) {
                                field220[var3++] = class57.field708[var188];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3611) {
                            if (class280.field4486 == null) {
                                field220[var3++] = "";
                            } else {
                                field220[var3++] = class37.method252(class280.field4486, 1000000);
                            }
                            continue;
                        }
                        if (var620 == 3612) {
                            if (class280.field4486 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = class108.field1507;
                            }
                            continue;
                        }
                        if (var620 == 3613) {
                            var2--;
                            int var189 = field209[var2];
                            if (class280.field4486 != null && var189 < class108.field1507) {
                                field220[var3++] = class392.field5890[var189].field5440;
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3614) {
                            var2--;
                            int var190 = field209[var2];
                            if (class280.field4486 != null && var190 < class108.field1507) {
                                field209[var2++] = class392.field5890[var190].field5439;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3615) {
                            var2--;
                            int var191 = field209[var2];
                            if (class280.field4486 != null && var191 < class108.field1507) {
                                field209[var2++] = class392.field5890[var191].field5438;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3616) {
                            field209[var2++] = class234.field3919;
                            continue;
                        }
                        if (var620 == 3617) {
                            var3--;
                            String var192 = field220[var3];
                            class385.method2443(var192, (byte) -101);
                            continue;
                        }
                        if (var620 == 3618) {
                            field209[var2++] = class396.field5926;
                            continue;
                        }
                        if (var620 == 3619) {
                            var3--;
                            String var193 = field220[var3];
                            class79.method502(81, var193);
                            continue;
                        }
                        if (var620 == 3620) {
                            class50.method312(36);
                            continue;
                        }
                        if (var620 == 3621) {
                            if (class364.field5543 == 0) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = class418.field6190;
                            }
                            continue;
                        }
                        if (var620 == 3622) {
                            var2--;
                            int var194 = field209[var2];
                            if (class364.field5543 != 0 && var194 < class418.field6190) {
                                field220[var3++] = class269.field4317[var194];
                                if (class285.field4576[var194] == null) {
                                    field220[var3++] = "";
                                } else {
                                    field220[var3++] = class285.field4576[var194];
                                }
                                continue;
                            }
                            field220[var3++] = "";
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3623) {
                            var3--;
                            String var195 = field220[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field209[var2++] = class309.method2071(84, var195) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3624) {
                            var2--;
                            int var196 = field209[var2];
                            if (class392.field5890 != null && var196 < class108.field1507 && class392.field5890[var196].field5445.equalsIgnoreCase(class261.field4201.field3588)) {
                                field209[var2++] = 1;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3625) {
                            if (class338.field5251 == null) {
                                field220[var3++] = "";
                            } else {
                                field220[var3++] = class338.field5251;
                            }
                            continue;
                        }
                        if (var620 == 3626) {
                            var2--;
                            int var197 = field209[var2];
                            if (class280.field4486 != null && var197 < class108.field1507) {
                                field220[var3++] = class392.field5890[var197].field5444;
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3627) {
                            var2--;
                            int var198 = field209[var2];
                            if (class364.field5543 == 2 && var198 >= 0 && var198 < class262.field4215) {
                                field209[var2++] = class349.field5386[var198] ? 1 : 0;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 3628) {
                            var3--;
                            String var199 = field220[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field209[var2++] = class115.method841(var199, 19027);
                            continue;
                        }
                        if (var620 == 3629) {
                            field209[var2++] = class272.field4379;
                            continue;
                        }
                        if (var620 == 3630) {
                            var3--;
                            String var200 = field220[var3];
                            class163.method1133(true, var200, (byte) -7);
                            continue;
                        }
                        if (var620 == 3631) {
                            var2--;
                            int var201 = field209[var2];
                            field209[var2++] = class396.field5927[var201] ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3632) {
                            var2--;
                            int var202 = field209[var2];
                            if (class280.field4486 != null && var202 < class108.field1507) {
                                field220[var3++] = class392.field5890[var202].field5445;
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 3633) {
                            var2--;
                            int var203 = field209[var2];
                            if (class364.field5543 != 0 && var203 < class418.field6190) {
                                field220[var3++] = class315.field4955[var203];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                    } else if (var620 < 4000) {
                        if (var620 == 3903) {
                            var2--;
                            int var204 = field209[var2];
                            field209[var2++] = class143.field2261[var204].method1387((byte) -25);
                            continue;
                        }
                        if (var620 == 3904) {
                            var2--;
                            int var205 = field209[var2];
                            field209[var2++] = class143.field2261[var205].field3204;
                            continue;
                        }
                        if (var620 == 3905) {
                            var2--;
                            int var206 = field209[var2];
                            field209[var2++] = class143.field2261[var206].field3205;
                            continue;
                        }
                        if (var620 == 3906) {
                            var2--;
                            int var207 = field209[var2];
                            field209[var2++] = class143.field2261[var207].field3215;
                            continue;
                        }
                        if (var620 == 3907) {
                            var2--;
                            int var208 = field209[var2];
                            field209[var2++] = class143.field2261[var208].field3208;
                            continue;
                        }
                        if (var620 == 3908) {
                            var2--;
                            int var209 = field209[var2];
                            field209[var2++] = class143.field2261[var209].field3202;
                            continue;
                        }
                        if (var620 == 3910) {
                            var2--;
                            int var210 = field209[var2];
                            int var211 = class143.field2261[var210].method1388((byte) 94);
                            field209[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3911) {
                            var2--;
                            int var212 = field209[var2];
                            int var213 = class143.field2261[var212].method1388((byte) -97);
                            field209[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3912) {
                            var2--;
                            int var214 = field209[var2];
                            int var215 = class143.field2261[var214].method1388((byte) 86);
                            field209[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 3913) {
                            var2--;
                            int var216 = field209[var2];
                            int var217 = class143.field2261[var216].method1388((byte) 92);
                            field209[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var620 < 4100) {
                        if (var620 == 4000) {
                            var2 -= 2;
                            int var218 = field209[var2];
                            int var219 = field209[var2 + 1];
                            field209[var2++] = var218 + var219;
                            continue;
                        }
                        if (var620 == 4001) {
                            var2 -= 2;
                            int var220 = field209[var2];
                            int var221 = field209[var2 + 1];
                            field209[var2++] = var220 - var221;
                            continue;
                        }
                        if (var620 == 4002) {
                            var2 -= 2;
                            int var222 = field209[var2];
                            int var223 = field209[var2 + 1];
                            field209[var2++] = var222 * var223;
                            continue;
                        }
                        if (var620 == 4003) {
                            var2 -= 2;
                            int var224 = field209[var2];
                            int var225 = field209[var2 + 1];
                            field209[var2++] = var224 / var225;
                            continue;
                        }
                        if (var620 == 4004) {
                            var2--;
                            int var226 = field209[var2];
                            field209[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var620 == 4005) {
                            var2--;
                            int var227 = field209[var2];
                            field209[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var620 == 4006) {
                            var2 -= 5;
                            int var228 = field209[var2];
                            int var229 = field209[var2 + 1];
                            int var230 = field209[var2 + 2];
                            int var231 = field209[var2 + 3];
                            int var232 = field209[var2 + 4];
                            field209[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var620 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field209[var2];
                            long var235 = (long) field209[var2 + 1];
                            field209[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var620 == 4008) {
                            var2 -= 2;
                            int var237 = field209[var2];
                            int var238 = field209[var2 + 1];
                            field209[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var620 == 4009) {
                            var2 -= 2;
                            int var239 = field209[var2];
                            int var240 = field209[var2 + 1];
                            field209[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var620 == 4010) {
                            var2 -= 2;
                            int var241 = field209[var2];
                            int var242 = field209[var2 + 1];
                            field209[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var620 == 4011) {
                            var2 -= 2;
                            int var243 = field209[var2];
                            int var244 = field209[var2 + 1];
                            field209[var2++] = var243 % var244;
                            continue;
                        }
                        if (var620 == 4012) {
                            var2 -= 2;
                            int var245 = field209[var2];
                            int var246 = field209[var2 + 1];
                            if (var245 == 0) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var620 == 4013) {
                            var2 -= 2;
                            int var247 = field209[var2];
                            int var248 = field209[var2 + 1];
                            if (var247 == 0) {
                                field209[var2++] = 0;
                            } else if (var248 == 0) {
                                field209[var2++] = Integer.MAX_VALUE;
                            } else {
                                field209[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var620 == 4014) {
                            var2 -= 2;
                            int var249 = field209[var2];
                            int var250 = field209[var2 + 1];
                            field209[var2++] = var249 & var250;
                            continue;
                        }
                        if (var620 == 4015) {
                            var2 -= 2;
                            int var251 = field209[var2];
                            int var252 = field209[var2 + 1];
                            field209[var2++] = var251 | var252;
                            continue;
                        }
                        if (var620 == 4016) {
                            var2 -= 2;
                            int var253 = field209[var2];
                            int var254 = field209[var2 + 1];
                            field209[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var620 == 4017) {
                            var2 -= 2;
                            int var255 = field209[var2];
                            int var256 = field209[var2 + 1];
                            field209[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var620 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field209[var2];
                            long var259 = (long) field209[var2 + 1];
                            long var261 = (long) field209[var2 + 2];
                            field209[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var620 < 4200) {
                        if (var620 == 4100) {
                            var3--;
                            String var263 = field220[var3];
                            var2--;
                            int var264 = field209[var2];
                            field220[var3++] = var263 + var264;
                            continue;
                        }
                        if (var620 == 4101) {
                            var3 -= 2;
                            String var265 = field220[var3];
                            String var266 = field220[var3 + 1];
                            field220[var3++] = var265 + var266;
                            continue;
                        }
                        if (var620 == 4102) {
                            var3--;
                            String var267 = field220[var3];
                            var2--;
                            int var268 = field209[var2];
                            field220[var3++] = var267 + class256.method1765(10, true, var268);
                            continue;
                        }
                        if (var620 == 4103) {
                            var3--;
                            String var269 = field220[var3];
                            field220[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var620 == 4104) {
                            var2--;
                            int var270 = field209[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field221.setTime(new Date(var271));
                            int var273 = field221.get(5);
                            int var274 = field221.get(2);
                            int var275 = field221.get(1);
                            field220[var3++] = var273 + "-" + field230[var274] + "-" + var275;
                            continue;
                        }
                        if (var620 == 4105) {
                            var3 -= 2;
                            String var276 = field220[var3];
                            String var277 = field220[var3 + 1];
                            if (class261.field4201.field3599 != null && class261.field4201.field3599.field3343) {
                                field220[var3++] = var277;
                                continue;
                            }
                            field220[var3++] = var276;
                            continue;
                        }
                        if (var620 == 4106) {
                            var2--;
                            int var278 = field209[var2];
                            field220[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var620 == 4107) {
                            var3 -= 2;
                            field209[var2++] = class163.method1130(class205.field3298, field220[var3 + 1], field220[var3], true);
                            continue;
                        }
                        if (var620 == 4108) {
                            var3--;
                            String var279 = field220[var3];
                            var2 -= 2;
                            int var280 = field209[var2];
                            int var281 = field209[var2 + 1];
                            class325 var282 = class107.method807(var281, 107, 0, class33.field407);
                            field209[var2++] = var282.method2159(var280, class181.field2960, 3423, var279);
                            continue;
                        }
                        if (var620 == 4109) {
                            var3--;
                            String var283 = field220[var3];
                            var2 -= 2;
                            int var284 = field209[var2];
                            int var285 = field209[var2 + 1];
                            class325 var286 = class107.method807(var285, 122, 0, class33.field407);
                            field209[var2++] = var286.method2155((byte) 18, class181.field2960, var284, var283);
                            continue;
                        }
                        if (var620 == 4110) {
                            var3 -= 2;
                            String var287 = field220[var3];
                            String var288 = field220[var3 + 1];
                            var2--;
                            if (field209[var2] == 1) {
                                field220[var3++] = var287;
                            } else {
                                field220[var3++] = var288;
                            }
                            continue;
                        }
                        if (var620 == 4111) {
                            var3--;
                            String var289 = field220[var3];
                            field220[var3++] = class348.method2272(var289, true);
                            continue;
                        }
                        if (var620 == 4112) {
                            var3--;
                            String var290 = field220[var3];
                            var2--;
                            int var291 = field209[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field220[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var620 == 4113) {
                            var2--;
                            int var292 = field209[var2];
                            field209[var2++] = class13.method123((char) var292, (byte) -62) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4114) {
                            var2--;
                            int var293 = field209[var2];
                            field209[var2++] = class318.method2112(-98, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4115) {
                            var2--;
                            int var294 = field209[var2];
                            field209[var2++] = class11.method110(23727, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4116) {
                            var2--;
                            int var295 = field209[var2];
                            field209[var2++] = class354.method2305((char) var295, (byte) -123) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4117) {
                            var3--;
                            String var296 = field220[var3];
                            if (var296 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var620 == 4118) {
                            var3--;
                            String var297 = field220[var3];
                            var2 -= 2;
                            int var298 = field209[var2];
                            int var299 = field209[var2 + 1];
                            field220[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var620 == 4119) {
                            var3--;
                            String var300 = field220[var3];
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
                            field220[var3++] = var301.toString();
                            continue;
                        }
                        if (var620 == 4120) {
                            var3--;
                            String var305 = field220[var3];
                            var2 -= 2;
                            int var306 = field209[var2];
                            int var307 = field209[var2 + 1];
                            field209[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var620 == 4121) {
                            var3 -= 2;
                            String var308 = field220[var3];
                            String var309 = field220[var3 + 1];
                            var2--;
                            int var310 = field209[var2];
                            field209[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var620 == 4122) {
                            var2--;
                            int var311 = field209[var2];
                            field209[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var620 == 4123) {
                            var2--;
                            int var312 = field209[var2];
                            field209[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var620 == 4124) {
                            var2--;
                            boolean var313 = field209[var2] != 0;
                            var2--;
                            int var314 = field209[var2];
                            field220[var3++] = class348.method2268(0, var313, 0, class205.field3298, (long) var314);
                            continue;
                        }
                        if (var620 == 4125) {
                            var3--;
                            String var315 = field220[var3];
                            var2--;
                            int var316 = field209[var2];
                            class325 var317 = class107.method807(var316, 81, 0, class33.field407);
                            field209[var2++] = var317.method2156(class181.field2960, -63, var315);
                            continue;
                        }
                    } else if (var620 < 4300) {
                        if (var620 == 4200) {
                            var2--;
                            int var318 = field209[var2];
                            field220[var3++] = class155.method1092(true, var318).field1370;
                            continue;
                        }
                        if (var620 == 4201) {
                            var2 -= 2;
                            int var319 = field209[var2];
                            int var320 = field209[var2 + 1];
                            class97 var321 = class155.method1092(true, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field1346[var320 - 1] != null) {
                                field220[var3++] = var321.field1346[var320 - 1];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 4202) {
                            var2 -= 2;
                            int var322 = field209[var2];
                            int var323 = field209[var2 + 1];
                            class97 var324 = class155.method1092(true, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field1330[var323 - 1] != null) {
                                field220[var3++] = var324.field1330[var323 - 1];
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 4203) {
                            var2--;
                            int var325 = field209[var2];
                            field209[var2++] = class155.method1092(true, var325).field1347;
                            continue;
                        }
                        if (var620 == 4204) {
                            var2--;
                            int var326 = field209[var2];
                            field209[var2++] = class155.method1092(true, var326).field1299 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4205) {
                            var2--;
                            int var327 = field209[var2];
                            class97 var328 = class155.method1092(true, var327);
                            if (var328.field1291 == -1 && var328.field1293 >= 0) {
                                field209[var2++] = var328.field1293;
                                continue;
                            }
                            field209[var2++] = var327;
                            continue;
                        }
                        if (var620 == 4206) {
                            var2--;
                            int var329 = field209[var2];
                            class97 var330 = class155.method1092(true, var329);
                            if (var330.field1291 >= 0 && var330.field1293 >= 0) {
                                field209[var2++] = var330.field1293;
                                continue;
                            }
                            field209[var2++] = var329;
                            continue;
                        }
                        if (var620 == 4207) {
                            var2--;
                            int var331 = field209[var2];
                            field209[var2++] = class155.method1092(true, var331).field1320 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 4208) {
                            var2 -= 2;
                            int var332 = field209[var2];
                            int var333 = field209[var2 + 1];
                            class309 var334 = class255.method1760(var333, 63);
                            if (var334.method2073(-116)) {
                                field220[var3++] = class155.method1092(true, var332).method730(var334.field4889, -121, var333);
                            } else {
                                field209[var2++] = class155.method1092(true, var332).method726(var334.field4893, (byte) -105, var333);
                            }
                            continue;
                        }
                        if (var620 == 4209) {
                            var2 -= 2;
                            int var335 = field209[var2];
                            int var336 = field209[var2 + 1] - 1;
                            class97 var337 = class155.method1092(true, var335);
                            if (var337.field1353 == var336) {
                                field209[var2++] = var337.field1290;
                            } else if (var337.field1334 == var336) {
                                field209[var2++] = var337.field1358;
                            } else {
                                field209[var2++] = -1;
                            }
                            continue;
                        }
                        if (var620 == 4210) {
                            var3--;
                            String var338 = field220[var3];
                            var2--;
                            int var339 = field209[var2];
                            class430.method2662((byte) 67, var338, var339 == 1);
                            field209[var2++] = class32.field400;
                            continue;
                        }
                        if (var620 == 4211) {
                            if (class81.field1008 != null && class334.field5215 < class32.field400) {
                                field209[var2++] = class81.field1008[class334.field5215++] & 0xFFFF;
                                continue;
                            }
                            field209[var2++] = -1;
                            continue;
                        }
                        if (var620 == 4212) {
                            class334.field5215 = 0;
                            continue;
                        }
                    } else if (var620 < 4400) {
                        if (var620 == 4300) {
                            var2 -= 2;
                            int var340 = field209[var2];
                            int var341 = field209[var2 + 1];
                            class309 var342 = class255.method1760(var341, 63);
                            if (var342.method2073(-116)) {
                                field220[var3++] = class395.method2493(false, var340).method1620(var342.field4889, false, var341);
                            } else {
                                field209[var2++] = class395.method2493(false, var340).method1618(var342.field4893, false, var341);
                            }
                            continue;
                        }
                    } else if (var620 < 4500) {
                        if (var620 == 4400) {
                            var2 -= 2;
                            int var343 = field209[var2];
                            int var344 = field209[var2 + 1];
                            class309 var345 = class255.method1760(var344, 63);
                            if (var345.method2073(-116)) {
                                field220[var3++] = class137.method1003(var343, -30796).method935(-28599, var345.field4889, var344);
                            } else {
                                field209[var2++] = class137.method1003(var343, -30796).method939(20177, var345.field4893, var344);
                            }
                            continue;
                        }
                    } else if (var620 < 4600) {
                        if (var620 == 4500) {
                            var2 -= 2;
                            int var346 = field209[var2];
                            int var347 = field209[var2 + 1];
                            class309 var348 = class255.method1760(var347, 63);
                            if (var348.method2073(-116)) {
                                field220[var3++] = class141.method1030(-19050, var346).method326(var348.field4889, var347, (byte) 117);
                            } else {
                                field209[var2++] = class141.method1030(-19050, var346).method327(var347, (byte) 66, var348.field4893);
                            }
                            continue;
                        }
                    } else if (var620 < 4700) {
                        if (var620 == 4600) {
                            var2--;
                            int var349 = field209[var2];
                            class349 var350 = class436.method2686(126, var349);
                            if (var350.field5414 != null && var350.field5414.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field5367[0];
                                for (int var353 = 1; var353 < var350.field5414.length; var353++) {
                                    if (var350.field5367[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field5367[var353];
                                    }
                                }
                                field209[var2++] = var350.field5414[var351];
                                continue;
                            }
                            field209[var2++] = var350.field5369;
                            continue;
                        }
                    } else if (var620 < 5100) {
                        if (var620 == 5000) {
                            field209[var2++] = class234.field3907;
                            continue;
                        }
                        if (var620 == 5001) {
                            var2 -= 3;
                            class234.field3907 = field209[var2];
                            class245.field4027 = field209[var2 + 1];
                            class421.field6221 = field209[var2 + 2];
                            field206++;
                            class11.field139.method2224(81, (byte) 0);
                            class11.field139.method1312(class234.field3907, -42);
                            class11.field139.method1312(class245.field4027, -75);
                            class11.field139.method1312(class421.field6221, -123);
                            continue;
                        }
                        if (var620 == 5002) {
                            var3--;
                            String var354 = field220[var3];
                            var2 -= 2;
                            int var355 = field209[var2];
                            int var356 = field209[var2 + 1];
                            field218++;
                            class11.field139.method2224(66, (byte) 0);
                            class11.field139.method1312(class317.method2110(true, var354) + 2, -45);
                            class11.field139.method1301(var354, 116);
                            class11.field139.method1312(var355 - 1, -94);
                            class11.field139.method1312(var356, -26);
                            continue;
                        }
                        if (var620 == 5003) {
                            var2--;
                            int var357 = field209[var2];
                            String var358 = null;
                            if (var357 < 100) {
                                var358 = class21.field262[var357];
                            }
                            if (var358 == null) {
                                var358 = "";
                            }
                            field220[var3++] = var358;
                            continue;
                        }
                        if (var620 == 5004) {
                            var2--;
                            int var359 = field209[var2];
                            int var360 = -1;
                            if (var359 < 100 && class21.field262[var359] != null) {
                                var360 = class326.field5122[var359];
                            }
                            field209[var2++] = var360;
                            continue;
                        }
                        if (var620 == 5005) {
                            field209[var2++] = class245.field4027;
                            continue;
                        }
                        if (var620 == 5008) {
                            var3--;
                            String var361 = field220[var3];
                            if (class382.field5772 == 0 && (class52.field651 && !class277.field4416 || class333.field5199)) {
                                continue;
                            }
                            String var362 = var361.toLowerCase();
                            byte var363 = 0;
                            if (var362.startsWith(class143.field2260)) {
                                var363 = 0;
                                var361 = var361.substring(class143.field2260.length());
                            } else if (var362.startsWith(class288.field4617)) {
                                var363 = 1;
                                var361 = var361.substring(class288.field4617.length());
                            } else if (var362.startsWith(class396.field5933)) {
                                var363 = 2;
                                var361 = var361.substring(class396.field5933.length());
                            } else if (var362.startsWith(class245.field4029)) {
                                var363 = 3;
                                var361 = var361.substring(class245.field4029.length());
                            } else if (var362.startsWith(class380.field5749)) {
                                var363 = 4;
                                var361 = var361.substring(class380.field5749.length());
                            } else if (var362.startsWith(class361.field5517)) {
                                var363 = 5;
                                var361 = var361.substring(class361.field5517.length());
                            } else if (var362.startsWith(class183.field2994)) {
                                var363 = 6;
                                var361 = var361.substring(class183.field2994.length());
                            } else if (var362.startsWith(class405.field6025)) {
                                var363 = 7;
                                var361 = var361.substring(class405.field6025.length());
                            } else if (var362.startsWith(class303.field4798)) {
                                var363 = 8;
                                var361 = var361.substring(class303.field4798.length());
                            } else if (var362.startsWith(class395.field5921)) {
                                var363 = 9;
                                var361 = var361.substring(class395.field5921.length());
                            } else if (var362.startsWith(class298.field4746)) {
                                var363 = 10;
                                var361 = var361.substring(class298.field4746.length());
                            } else if (var362.startsWith(class403.field6020)) {
                                var363 = 11;
                                var361 = var361.substring(class403.field6020.length());
                            } else if (class205.field3298 != 0) {
                                if (var362.startsWith(class111.field1544)) {
                                    var363 = 0;
                                    var361 = var361.substring(class111.field1544.length());
                                } else if (var362.startsWith(class56.field697)) {
                                    var363 = 1;
                                    var361 = var361.substring(class56.field697.length());
                                } else if (var362.startsWith(class238.field3969)) {
                                    var363 = 2;
                                    var361 = var361.substring(class238.field3969.length());
                                } else if (var362.startsWith(class70.field871)) {
                                    var363 = 3;
                                    var361 = var361.substring(class70.field871.length());
                                } else if (var362.startsWith(class54.field674)) {
                                    var363 = 4;
                                    var361 = var361.substring(class54.field674.length());
                                } else if (var362.startsWith(class156.field2468)) {
                                    var363 = 5;
                                    var361 = var361.substring(class156.field2468.length());
                                } else if (var362.startsWith(class190.field3101)) {
                                    var363 = 6;
                                    var361 = var361.substring(class190.field3101.length());
                                } else if (var362.startsWith(class264.field4253)) {
                                    var363 = 7;
                                    var361 = var361.substring(class264.field4253.length());
                                } else if (var362.startsWith(class163.field2555)) {
                                    var363 = 8;
                                    var361 = var361.substring(class163.field2555.length());
                                } else if (var362.startsWith(class213.field3420)) {
                                    var363 = 9;
                                    var361 = var361.substring(class213.field3420.length());
                                } else if (var362.startsWith(class409.field6059)) {
                                    var363 = 10;
                                    var361 = var361.substring(class409.field6059.length());
                                } else if (var362.startsWith(class394.field5903)) {
                                    var363 = 11;
                                    var361 = var361.substring(class394.field5903.length());
                                }
                            }
                            String var364 = var361.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class80.field1004)) {
                                var365 = 1;
                                var361 = var361.substring(class80.field1004.length());
                            } else if (var364.startsWith(class241.field4009)) {
                                var365 = 2;
                                var361 = var361.substring(class241.field4009.length());
                            } else if (var364.startsWith(class212.field3405)) {
                                var365 = 3;
                                var361 = var361.substring(class212.field3405.length());
                            } else if (var364.startsWith(class120.field1646)) {
                                var365 = 4;
                                var361 = var361.substring(class120.field1646.length());
                            } else if (var364.startsWith(class403.field6010)) {
                                var365 = 5;
                                var361 = var361.substring(class403.field6010.length());
                            } else if (class205.field3298 != 0) {
                                if (var364.startsWith(class343.field5293)) {
                                    var365 = 1;
                                    var361 = var361.substring(class343.field5293.length());
                                } else if (var364.startsWith(class52.field654)) {
                                    var365 = 2;
                                    var361 = var361.substring(class52.field654.length());
                                } else if (var364.startsWith(class173.field2891)) {
                                    var365 = 3;
                                    var361 = var361.substring(class173.field2891.length());
                                } else if (var364.startsWith(class249.field4074)) {
                                    var365 = 4;
                                    var361 = var361.substring(class249.field4074.length());
                                } else if (var364.startsWith(class117.field1627)) {
                                    var365 = 5;
                                    var361 = var361.substring(class117.field1627.length());
                                }
                            }
                            field227++;
                            class11.field139.method2224(249, (byte) 0);
                            class11.field139.method1312(0, -79);
                            int var366 = class11.field139.field3044;
                            class11.field139.method1312(var363, -29);
                            class11.field139.method1312(var365, -45);
                            class39.method265(var361, class11.field139, false);
                            class11.field139.method1297(class11.field139.field3044 - var366, -1);
                            continue;
                        }
                        if (var620 == 5009) {
                            var3 -= 2;
                            String var367 = field220[var3];
                            String var368 = field220[var3 + 1];
                            if (class382.field5772 != 0 || (!class52.field651 || class277.field4416) && !class333.field5199) {
                                field215++;
                                class11.field139.method2224(192, (byte) 0);
                                class11.field139.method1312(0, -81);
                                int var369 = class11.field139.field3044;
                                class11.field139.method1301(var367, 104);
                                class39.method265(var368, class11.field139, false);
                                class11.field139.method1297(class11.field139.field3044 - var369, -1);
                            }
                            continue;
                        }
                        if (var620 == 5010) {
                            var2--;
                            int var370 = field209[var2];
                            String var371 = null;
                            if (var370 < 100) {
                                var371 = class318.field4989[var370];
                            }
                            if (var371 == null) {
                                var371 = "";
                            }
                            field220[var3++] = var371;
                            continue;
                        }
                        if (var620 == 5011) {
                            var2--;
                            int var372 = field209[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class417.field6181[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field220[var3++] = var373;
                            continue;
                        }
                        if (var620 == 5012) {
                            var2--;
                            int var374 = field209[var2];
                            int var375 = -1;
                            if (var374 < 100) {
                                var375 = class394.field5904[var374];
                            }
                            field209[var2++] = var375;
                            continue;
                        }
                        if (var620 == 5015) {
                            String var376;
                            if (class261.field4201 == null || class261.field4201.field3601 == null) {
                                var376 = class336.field5222;
                            } else {
                                var376 = class261.field4201.method1566(true, -13847);
                            }
                            field220[var3++] = var376;
                            continue;
                        }
                        if (var620 == 5016) {
                            field209[var2++] = class421.field6221;
                            continue;
                        }
                        if (var620 == 5017) {
                            field209[var2++] = class277.field4411;
                            continue;
                        }
                        if (var620 == 5018) {
                            var2--;
                            int var377 = field209[var2];
                            int var378 = 0;
                            if (var377 < 100 && class21.field262[var377] != null) {
                                var378 = class326.field5122[var377];
                            }
                            field209[var2++] = var378;
                            continue;
                        }
                        if (var620 == 5019) {
                            var2--;
                            int var379 = field209[var2];
                            String var380 = null;
                            if (var379 < 100) {
                                var380 = class373.field5632[var379];
                            }
                            if (var380 == null) {
                                var380 = "";
                            }
                            field220[var3++] = var380;
                            continue;
                        }
                        if (var620 == 5020) {
                            String var381;
                            if (class261.field4201 == null || class261.field4201.field3601 == null) {
                                var381 = class336.field5222;
                            } else {
                                var381 = class261.field4201.method1570(false, 255);
                            }
                            field220[var3++] = var381;
                            continue;
                        }
                        if (var620 == 5050) {
                            var2--;
                            int var382 = field209[var2];
                            field220[var3++] = class72.method448((byte) -61, var382).field2088;
                            continue;
                        }
                        if (var620 == 5051) {
                            var2--;
                            int var383 = field209[var2];
                            class133 var384 = class72.method448((byte) -57, var383);
                            if (var384.field2090 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var384.field2090.length;
                            }
                            continue;
                        }
                        if (var620 == 5052) {
                            var2 -= 2;
                            int var385 = field209[var2];
                            int var386 = field209[var2 + 1];
                            class133 var387 = class72.method448((byte) -60, var385);
                            int var388 = var387.field2090[var386];
                            field209[var2++] = var388;
                            continue;
                        }
                        if (var620 == 5053) {
                            var2--;
                            int var389 = field209[var2];
                            class133 var390 = class72.method448((byte) -56, var389);
                            if (var390.field2080 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var390.field2080.length;
                            }
                            continue;
                        }
                        if (var620 == 5054) {
                            var2 -= 2;
                            int var391 = field209[var2];
                            int var392 = field209[var2 + 1];
                            field209[var2++] = class72.method448((byte) -45, var391).field2080[var392];
                            continue;
                        }
                        if (var620 == 5055) {
                            var2--;
                            int var393 = field209[var2];
                            field220[var3++] = class344.method2253((byte) 92, var393).method1239(0);
                            continue;
                        }
                        if (var620 == 5056) {
                            var2--;
                            int var394 = field209[var2];
                            class180 var395 = class344.method2253((byte) -118, var394);
                            if (var395.field2949 == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var395.field2949.length;
                            }
                            continue;
                        }
                        if (var620 == 5057) {
                            var2 -= 2;
                            int var396 = field209[var2];
                            int var397 = field209[var2 + 1];
                            field209[var2++] = class344.method2253((byte) -127, var396).field2949[var397];
                            continue;
                        }
                        if (var620 == 5058) {
                            field225 = new class343();
                            var2--;
                            field225.field5288 = field209[var2];
                            field225.field5289 = class344.method2253((byte) -112, field225.field5288);
                            field225.field5285 = new int[field225.field5289.method1241((byte) 81)];
                            continue;
                        }
                        if (var620 == 5059) {
                            field224++;
                            class11.field139.method2224(87, (byte) 0);
                            class11.field139.method1312(0, -95);
                            int var398 = class11.field139.field3044;
                            class11.field139.method1312(0, -51);
                            class11.field139.method1283(8, field225.field5288);
                            field225.field5289.method1231(field225.field5285, (byte) 82, class11.field139);
                            class11.field139.method1297(class11.field139.field3044 - var398, -1);
                            continue;
                        }
                        if (var620 == 5060) {
                            var3--;
                            String var399 = field220[var3];
                            field211++;
                            class11.field139.method2224(26, (byte) 0);
                            class11.field139.method1312(0, -93);
                            int var400 = class11.field139.field3044;
                            class11.field139.method1301(var399, 122);
                            class11.field139.method1283(8, field225.field5288);
                            field225.field5289.method1231(field225.field5285, (byte) -81, class11.field139);
                            class11.field139.method1297(class11.field139.field3044 - var400, -1);
                            continue;
                        }
                        if (var620 == 5061) {
                            field224++;
                            class11.field139.method2224(87, (byte) 0);
                            class11.field139.method1312(0, -77);
                            int var401 = class11.field139.field3044;
                            class11.field139.method1312(1, -107);
                            class11.field139.method1283(8, field225.field5288);
                            field225.field5289.method1231(field225.field5285, (byte) -94, class11.field139);
                            class11.field139.method1297(class11.field139.field3044 - var401, -1);
                            continue;
                        }
                        if (var620 == 5062) {
                            var2 -= 2;
                            int var402 = field209[var2];
                            int var403 = field209[var2 + 1];
                            field209[var2++] = class72.method448((byte) -94, var402).field2083[var403];
                            continue;
                        }
                        if (var620 == 5063) {
                            var2 -= 2;
                            int var404 = field209[var2];
                            int var405 = field209[var2 + 1];
                            field209[var2++] = class72.method448((byte) -89, var404).field2077[var405];
                            continue;
                        }
                        if (var620 == 5064) {
                            var2 -= 2;
                            int var406 = field209[var2];
                            int var407 = field209[var2 + 1];
                            if (var407 == -1) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = class72.method448((byte) -116, var406).method970((char) var407, false);
                            }
                            continue;
                        }
                        if (var620 == 5065) {
                            var2 -= 2;
                            int var408 = field209[var2];
                            int var409 = field209[var2 + 1];
                            if (var409 == -1) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = class72.method448((byte) -111, var408).method975((char) var409, true);
                            }
                            continue;
                        }
                        if (var620 == 5066) {
                            var2--;
                            int var410 = field209[var2];
                            field209[var2++] = class344.method2253((byte) 106, var410).method1241((byte) 115);
                            continue;
                        }
                        if (var620 == 5067) {
                            var2 -= 2;
                            int var411 = field209[var2];
                            int var412 = field209[var2 + 1];
                            int var413 = class344.method2253((byte) -108, var411).method1238(var412, -1);
                            field209[var2++] = var413;
                            continue;
                        }
                        if (var620 == 5068) {
                            var2 -= 2;
                            int var414 = field209[var2];
                            int var415 = field209[var2 + 1];
                            field225.field5285[var414] = var415;
                            continue;
                        }
                        if (var620 == 5069) {
                            var2 -= 2;
                            int var416 = field209[var2];
                            int var417 = field209[var2 + 1];
                            field225.field5285[var416] = var417;
                            continue;
                        }
                        if (var620 == 5070) {
                            var2 -= 3;
                            int var418 = field209[var2];
                            int var419 = field209[var2 + 1];
                            int var420 = field209[var2 + 2];
                            class180 var421 = class344.method2253((byte) -93, var418);
                            if (var421.method1238(var419, -1) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field209[var2++] = var421.method1233(var419, var420, -109);
                            continue;
                        }
                        if (var620 == 5071) {
                            var3--;
                            String var422 = field220[var3];
                            var2--;
                            boolean var423 = field209[var2] == 1;
                            class254.method1755(var423, var422, 1);
                            field209[var2++] = class32.field400;
                            continue;
                        }
                        if (var620 == 5072) {
                            if (class81.field1008 != null && class334.field5215 < class32.field400) {
                                field209[var2++] = class81.field1008[class334.field5215++] & 0xFFFF;
                                continue;
                            }
                            field209[var2++] = -1;
                            continue;
                        }
                        if (var620 == 5073) {
                            class334.field5215 = 0;
                            continue;
                        }
                    } else if (var620 < 5200) {
                        if (var620 == 5100) {
                            if (class232.field3856[86]) {
                                field209[var2++] = 1;
                            } else {
                                field209[var2++] = 0;
                            }
                            continue;
                        }
                        if (var620 == 5101) {
                            if (class232.field3856[82]) {
                                field209[var2++] = 1;
                            } else {
                                field209[var2++] = 0;
                            }
                            continue;
                        }
                        if (var620 == 5102) {
                            if (class232.field3856[81]) {
                                field209[var2++] = 1;
                            } else {
                                field209[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var620 < 5300) {
                        if (var620 == 5200) {
                            var2--;
                            class421.method2615((byte) 85, field209[var2]);
                            continue;
                        }
                        if (var620 == 5201) {
                            field209[var2++] = class391.method2465((byte) -113);
                            continue;
                        }
                        if (var620 == 5205) {
                            var2--;
                            class1.method1(field209[var2], true, -1, false, -1);
                            continue;
                        }
                        if (var620 == 5206) {
                            var2--;
                            int var424 = field209[var2];
                            class21 var425 = class400.method2521(var424 >> 14 & 0x3FFF, var424 & 0x3FFF);
                            if (var425 == null) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = var425.field279;
                            }
                            continue;
                        }
                        if (var620 == 5207) {
                            var2--;
                            class21 var426 = class400.method2524(field209[var2]);
                            if (var426 != null && var426.field267 != null) {
                                field220[var3++] = var426.field267;
                                continue;
                            }
                            field220[var3++] = "";
                            continue;
                        }
                        if (var620 == 5208) {
                            field209[var2++] = class133.field2078;
                            field209[var2++] = class291.field4650;
                            continue;
                        }
                        if (var620 == 5209) {
                            field209[var2++] = class400.field5973 + class375.field5656;
                            field209[var2++] = class400.field5974 + class144.field2270;
                            continue;
                        }
                        if (var620 == 5210) {
                            var2--;
                            int var427 = field209[var2];
                            class21 var428 = class400.method2524(var427);
                            if (var428 == null) {
                                field209[var2++] = 0;
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var428.field269 >> 14 & 0x3FFF;
                                field209[var2++] = var428.field269 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var620 == 5211) {
                            var2--;
                            int var429 = field209[var2];
                            class21 var430 = class400.method2524(var429);
                            if (var430 == null) {
                                field209[var2++] = 0;
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var430.field284 - var430.field264;
                                field209[var2++] = var430.field280 - var430.field259;
                            }
                            continue;
                        }
                        if (var620 == 5212) {
                            class222 var431 = class203.method1447(false);
                            if (var431 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = var431.field3684;
                                int var432 = var431.field3702 << 28 | class400.field5973 + var431.field3699 << 14 | class400.field5974 + var431.field3691;
                                field209[var2++] = var432;
                            }
                            continue;
                        }
                        if (var620 == 5213) {
                            class222 var433 = class313.method2098(-273);
                            if (var433 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = var433.field3684;
                                int var434 = var433.field3702 << 28 | class400.field5973 + var433.field3699 << 14 | class400.field5974 + var433.field3691;
                                field209[var2++] = var434;
                            }
                            continue;
                        }
                        if (var620 == 5214) {
                            var2--;
                            int var435 = field209[var2];
                            class21 var436 = class84.method516(18898);
                            if (var436 != null) {
                                boolean var437 = var436.method152(var435 >> 28 & 0x3, var435 >> 14 & 0x3FFF, var435 & 0x3FFF, (byte) -69, field231);
                                if (var437) {
                                    class450.method2804(field231[1], field231[2], true);
                                }
                            }
                            continue;
                        }
                        if (var620 == 5215) {
                            var2 -= 2;
                            int var438 = field209[var2];
                            int var439 = field209[var2 + 1];
                            class54 var440 = class400.method2512(var438 >> 14 & 0x3FFF, var438 & 0x3FFF);
                            boolean var441 = false;
                            for (class21 var442 = (class21) var440.method364(0); var442 != null; var442 = (class21) var440.method361(62)) {
                                if (var442.field279 == var439) {
                                    var441 = true;
                                    break;
                                }
                            }
                            if (var441) {
                                field209[var2++] = 1;
                            } else {
                                field209[var2++] = 0;
                            }
                            continue;
                        }
                        if (var620 == 5218) {
                            var2--;
                            int var443 = field209[var2];
                            class21 var444 = class400.method2524(var443);
                            if (var444 == null) {
                                field209[var2++] = -1;
                            } else {
                                field209[var2++] = var444.field261;
                            }
                            continue;
                        }
                        if (var620 == 5220) {
                            field209[var2++] = class397.field5935 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 5221) {
                            var2--;
                            int var445 = field209[var2];
                            class450.method2804(var445 >> 14 & 0x3FFF, var445 & 0x3FFF, true);
                            continue;
                        }
                        if (var620 == 5222) {
                            class21 var446 = class84.method516(18898);
                            if (var446 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = -1;
                            } else {
                                boolean var447 = var446.method150(class400.field5973 + class375.field5656, field231, class400.field5974 + class144.field2270, (byte) -116);
                                if (var447) {
                                    field209[var2++] = field231[1];
                                    field209[var2++] = field231[2];
                                } else {
                                    field209[var2++] = -1;
                                    field209[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var620 == 5223) {
                            var2 -= 2;
                            int var448 = field209[var2];
                            int var449 = field209[var2 + 1];
                            class1.method1(var448, true, var449 & 0x3FFF, false, var449 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var620 == 5224) {
                            var2--;
                            int var450 = field209[var2];
                            class21 var451 = class84.method516(18898);
                            if (var451 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = -1;
                            } else {
                                boolean var452 = var451.method152(var450 >> 28 & 0x3, var450 >> 14 & 0x3FFF, var450 & 0x3FFF, (byte) -48, field231);
                                if (var452) {
                                    field209[var2++] = field231[1];
                                    field209[var2++] = field231[2];
                                } else {
                                    field209[var2++] = -1;
                                    field209[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var620 == 5225) {
                            var2--;
                            int var453 = field209[var2];
                            class21 var454 = class84.method516(18898);
                            if (var454 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = -1;
                            } else {
                                boolean var455 = var454.method150(var453 >> 14 & 0x3FFF, field231, var453 & 0x3FFF, (byte) -73);
                                if (var455) {
                                    field209[var2++] = field231[1];
                                    field209[var2++] = field231[2];
                                } else {
                                    field209[var2++] = -1;
                                    field209[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var620 == 5226) {
                            var2--;
                            class41.method275((byte) -77, field209[var2]);
                            continue;
                        }
                        if (var620 == 5227) {
                            var2 -= 2;
                            int var456 = field209[var2];
                            int var457 = field209[var2 + 1];
                            class1.method1(var456, true, var457 & 0x3FFF, true, var457 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var620 == 5228) {
                            var2--;
                            class104.field1464 = field209[var2] == 1;
                            continue;
                        }
                        if (var620 == 5229) {
                            field209[var2++] = class104.field1464 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 5230) {
                            var2--;
                            int var458 = field209[var2];
                            class375.method2398((byte) 80, var458);
                            continue;
                        }
                        if (var620 == 5231) {
                            var2 -= 2;
                            int var459 = field209[var2];
                            boolean var460 = field209[var2 + 1] == 1;
                            if (class117.field1624 == null) {
                                continue;
                            }
                            class161 var461 = class117.field1624.method1770(-880, (long) var459);
                            if (var461 != null && !var460) {
                                var461.method1120(-127);
                                continue;
                            }
                            if (var461 == null && var460) {
                                class161 var462 = new class161();
                                class117.field1624.method1766((long) var459, var462, 111);
                            }
                            continue;
                        }
                        if (var620 == 5232) {
                            var2--;
                            int var463 = field209[var2];
                            if (class117.field1624 == null) {
                                field209[var2++] = 0;
                            } else {
                                class161 var464 = class117.field1624.method1770(-880, (long) var463);
                                field209[var2++] = var464 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var620 == 5233) {
                            var2 -= 2;
                            int var465 = field209[var2];
                            boolean var466 = field209[var2 + 1] == 1;
                            if (class345.field5316 == null) {
                                continue;
                            }
                            class161 var467 = class345.field5316.method1770(-880, (long) var465);
                            if (var467 != null && !var466) {
                                var467.method1120(-125);
                                continue;
                            }
                            if (var467 == null && var466) {
                                class161 var468 = new class161();
                                class345.field5316.method1766((long) var465, var468, -111);
                            }
                            continue;
                        }
                        if (var620 == 5234) {
                            var2--;
                            int var469 = field209[var2];
                            if (class345.field5316 == null) {
                                field209[var2++] = 0;
                            } else {
                                class161 var470 = class345.field5316.method1770(-880, (long) var469);
                                field209[var2++] = var470 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var620 == 5235) {
                            field209[var2++] = class400.field5950 == null ? -1 : class400.field5950.field279;
                            continue;
                        }
                    } else if (var620 < 5400) {
                        if (var620 == 5300) {
                            var2 -= 2;
                            int var471 = field209[var2];
                            int var472 = field209[var2 + 1];
                            class50.method319(false, var472, 3, 10371, var471);
                            field209[var2++] = class395.field5920 == null ? 0 : 1;
                            continue;
                        }
                        if (var620 == 5301) {
                            if (class395.field5920 != null) {
                                class50.method319(false, -1, class317.field4970, 10371, -1);
                            }
                            continue;
                        }
                        if (var620 == 5302) {
                            class364[] var473 = class441.method2713(-25);
                            field209[var2++] = var473.length;
                            continue;
                        }
                        if (var620 == 5303) {
                            var2--;
                            int var474 = field209[var2];
                            class364[] var475 = class441.method2713(-25);
                            field209[var2++] = var475[var474].field5540;
                            field209[var2++] = var475[var474].field5544;
                            continue;
                        }
                        if (var620 == 5305) {
                            int var476 = class343.field5286;
                            int var477 = class417.field6163;
                            int var478 = -1;
                            class364[] var479 = class441.method2713(-25);
                            for (int var480 = 0; var480 < var479.length; var480++) {
                                class364 var481 = var479[var480];
                                if (var481.field5540 == var476 && var481.field5544 == var477) {
                                    var478 = var480;
                                    break;
                                }
                            }
                            field209[var2++] = var478;
                            continue;
                        }
                        if (var620 == 5306) {
                            field209[var2++] = class199.method1386((byte) 104);
                            continue;
                        }
                        if (var620 == 5307) {
                            var2--;
                            int var482 = field209[var2];
                            if (var482 >= 1 && var482 <= 2) {
                                class50.method319(false, -1, var482, 10371, -1);
                            }
                            continue;
                        }
                        if (var620 == 5308) {
                            field209[var2++] = class317.field4970;
                            continue;
                        }
                        if (var620 == 5309) {
                            var2--;
                            int var483 = field209[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class317.field4970 = var483;
                                class306.method2062((byte) 126, class63.field822);
                            }
                            continue;
                        }
                    } else if (var620 < 5500) {
                        if (var620 == 5400) {
                            var3 -= 2;
                            String var484 = field220[var3];
                            String var485 = field220[var3 + 1];
                            var2--;
                            int var486 = field209[var2];
                            field219++;
                            class11.field139.method2224(131, (byte) 0);
                            class11.field139.method1312(class317.method2110(true, var484) + class317.method2110(true, var485) + 1, -127);
                            class11.field139.method1301(var484, 111);
                            class11.field139.method1301(var485, 126);
                            class11.field139.method1312(var486, -78);
                            continue;
                        }
                        if (var620 == 5401) {
                            var2 -= 2;
                            class156.field2456[field209[var2]] = (short) class222.method1592(87, field209[var2 + 1]);
                            class409.method2571(107);
                            class265.method1811(250);
                            class298.method2014((byte) 125);
                            class151.method1069((byte) 103);
                            class193.method1356((byte) -108);
                            continue;
                        }
                        if (var620 == 5405) {
                            var2 -= 2;
                            int var487 = field209[var2];
                            int var488 = field209[var2 + 1];
                            if (var487 >= 0 && var487 < 2) {
                                class271.field4348[var487] = new int[var488 << 1][4];
                            }
                            continue;
                        }
                        if (var620 == 5406) {
                            var2 -= 7;
                            int var489 = field209[var2];
                            int var490 = field209[var2 + 1] << 1;
                            int var491 = field209[var2 + 2];
                            int var492 = field209[var2 + 3];
                            int var493 = field209[var2 + 4];
                            int var494 = field209[var2 + 5];
                            int var495 = field209[var2 + 6];
                            if (var489 >= 0 && var489 < 2 && class271.field4348[var489] != null && var490 >= 0 && var490 < class271.field4348[var489].length) {
                                class271.field4348[var489][var490] = new int[] { (var491 >> 14 & 0x3FFF) * 128, var492, (var491 & 0x3FFF) * 128, var495 };
                                class271.field4348[var489][var490 + 1] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var620 == 5407) {
                            var2--;
                            int var496 = class271.field4348[field209[var2]].length >> 1;
                            field209[var2++] = var496;
                            continue;
                        }
                        if (var620 == 5411) {
                            if (class395.field5920 != null) {
                                class50.method319(false, -1, class317.field4970, 10371, -1);
                            }
                            if (class47.field587 == null) {
                                String var497 = class312.field4916 == null ? class141.method1028(true) : class312.field4916;
                                class312.method2092(3, class63.field822, class128.field2035 == 1, var497, false);
                            } else {
                                class8.method94(true);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var620 == 5419) {
                            String var498 = "";
                            if (class379.field5747 != null) {
                                if (class379.field5747.field305 == null) {
                                    var498 = class340.method2235(class379.field5747.field308, -108);
                                } else {
                                    var498 = (String) class379.field5747.field305;
                                }
                            }
                            field220[var3++] = var498;
                            continue;
                        }
                        if (var620 == 5420) {
                            field209[var2++] = class279.field4460 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 5421) {
                            if (class395.field5920 != null) {
                                class50.method319(false, -1, class317.field4970, 10371, -1);
                            }
                            var3--;
                            String var499 = field220[var3];
                            var2--;
                            boolean var500 = field209[var2] == 1;
                            String var501 = class141.method1028(true) + var499;
                            class312.method2092(3, class63.field822, class128.field2035 == 1, var501, var500);
                            continue;
                        }
                        if (var620 == 5422) {
                            var3 -= 2;
                            String var502 = field220[var3];
                            String var503 = field220[var3 + 1];
                            var2--;
                            int var504 = field209[var2];
                            if (var502.length() > 0) {
                                if (class252.field4108 == null) {
                                    class252.field4108 = new String[class308.field4881[class61.field787]];
                                }
                                class252.field4108[var504] = var502;
                            }
                            if (var503.length() > 0) {
                                if (class409.field6047 == null) {
                                    class409.field6047 = new String[class308.field4881[class61.field787]];
                                }
                                class409.field6047[var504] = var503;
                            }
                            continue;
                        }
                        if (var620 == 5423) {
                            var3--;
                            System.out.println(field220[var3]);
                            continue;
                        }
                        if (var620 == 5424) {
                            var2 -= 11;
                            class85.field1049 = field209[var2];
                            class102.field1430 = field209[var2 + 1];
                            class308.field4879 = field209[var2 + 2];
                            class282.field4540 = field209[var2 + 3];
                            class8.field96 = field209[var2 + 4];
                            class185.field3007 = field209[var2 + 5];
                            class284.field4551 = field209[var2 + 6];
                            class28.field325 = field209[var2 + 7];
                            class150.field2339 = field209[var2 + 8];
                            class372.field5625 = field209[var2 + 9];
                            class143.field2266 = field209[var2 + 10];
                            class223.field3727.method2762(1, class8.field96);
                            class223.field3727.method2762(1, class185.field3007);
                            class223.field3727.method2762(1, class284.field4551);
                            class223.field3727.method2762(1, class28.field325);
                            class223.field3727.method2762(1, class150.field2339);
                            class124.field1861 = null;
                            class68.field852 = null;
                            class19.field248 = null;
                            class243.field4018 = null;
                            class414.field6117 = null;
                            class329.field5147 = null;
                            class394.field5911 = null;
                            class70.field862 = null;
                            class61.field786 = true;
                            continue;
                        }
                        if (var620 == 5425) {
                            class56.method370((byte) -124);
                            class61.field786 = false;
                            continue;
                        }
                        if (var620 == 5426) {
                            var2 -= 2;
                            class216.field3506 = field209[var2];
                            class32.field398 = field209[var2 + 1];
                            continue;
                        }
                        if (var620 == 5427) {
                            var2 -= 2;
                            class71.field878 = field209[var2];
                            class216.field3522 = field209[var2 + 1];
                            continue;
                        }
                        if (var620 == 5428) {
                            var2 -= 2;
                            int var505 = field209[var2];
                            int var506 = field209[var2 + 1];
                            field209[var2++] = class40.method270(-30, var506, var505) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 5429) {
                            var3--;
                            class223.method1603(false, (byte) 66, field220[var3]);
                            continue;
                        }
                    } else if (var620 < 5600) {
                        if (var620 == 5500) {
                            var2 -= 4;
                            int var507 = field209[var2];
                            int var508 = field209[var2 + 1];
                            int var509 = field209[var2 + 2];
                            int var510 = field209[var2 + 3];
                            class297.method2003(var509, (var507 & 0x3FFF) - class444.field6481, false, (byte) 67, (var507 >> 14 & 0x3FFF) - class409.field6048, var508, var510);
                            continue;
                        }
                        if (var620 == 5501) {
                            var2 -= 4;
                            int var511 = field209[var2];
                            int var512 = field209[var2 + 1];
                            int var513 = field209[var2 + 2];
                            int var514 = field209[var2 + 3];
                            class185.method1260((var511 >> 14 & 0x3FFF) - class409.field6048, var512, 2, var514, var513, (var511 & 0x3FFF) - class444.field6481);
                            continue;
                        }
                        if (var620 == 5502) {
                            var2 -= 6;
                            int var515 = field209[var2];
                            if (var515 >= 2) {
                                throw new RuntimeException();
                            }
                            class305.field4844 = var515;
                            int var516 = field209[var2 + 1];
                            if (var516 + 1 >= class271.field4348[class305.field4844].length >> 1) {
                                throw new RuntimeException();
                            }
                            class239.field3979 = var516;
                            class417.field6173 = 0;
                            class239.field3980 = field209[var2 + 2];
                            class56.field700 = field209[var2 + 3];
                            int var517 = field209[var2 + 4];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class254.field4125 = var517;
                            int var518 = field209[var2 + 5];
                            if (var518 + 1 >= class271.field4348[class254.field4125].length >> 1) {
                                throw new RuntimeException();
                            }
                            class196.field3185 = var518;
                            class13.field194 = 3;
                            continue;
                        }
                        if (var620 == 5503) {
                            class223.method1595(true);
                            continue;
                        }
                        if (var620 == 5504) {
                            var2 -= 2;
                            class415.method2596(field209[var2], field209[var2 + 1], 81, 0);
                            continue;
                        }
                        if (var620 == 5505) {
                            field209[var2++] = (int) class316.field4958 >> 3;
                            continue;
                        }
                        if (var620 == 5506) {
                            field209[var2++] = (int) class329.field5153 >> 3;
                            continue;
                        }
                        if (var620 == 5507) {
                            class74.method477((byte) 82);
                            continue;
                        }
                        if (var620 == 5508) {
                            class255.method1762(17);
                            continue;
                        }
                        if (var620 == 5509) {
                            class292.method1969(false);
                            continue;
                        }
                        if (var620 == 5510) {
                            class94.method550(-128);
                            continue;
                        }
                        if (var620 == 5511) {
                            var2--;
                            int var519 = field209[var2];
                            int var520 = var519 >> 14 & 0x3FFF;
                            int var521 = var519 & 0x3FFF;
                            int var522 = var520 - class409.field6048;
                            if (var522 < 0) {
                                var522 = 0;
                            } else if (var522 >= class80.field1003) {
                                var522 = class80.field1003;
                            }
                            int var523 = var521 - class444.field6481;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class380.field5751) {
                                var523 = class380.field5751;
                            }
                            class144.field2269 = var522 * 128 + 64;
                            class290.field4639 = var523 * 128 + 64;
                            class13.field194 = 4;
                            continue;
                        }
                        if (var620 == 5512) {
                            class36.method233((byte) -96);
                            continue;
                        }
                    } else if (var620 < 5700) {
                        if (var620 == 5600) {
                            var3 -= 2;
                            String var524 = field220[var3];
                            String var525 = field220[var3 + 1];
                            var2--;
                            int var526 = field209[var2];
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0 && class448.field6540 == 0) {
                                class429.method2659(var524, var525, var526, -13745);
                            }
                            continue;
                        }
                        if (var620 == 5601) {
                            class361.method2341((byte) -59);
                            continue;
                        }
                        if (var620 == 5602) {
                            if (class300.field4760 == 0) {
                                class357.field5463 = -2;
                            }
                            continue;
                        }
                        if (var620 == 5603) {
                            var2 -= 4;
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0 && class448.field6540 == 0) {
                                class291.method1958(true, field209[var2 + 2], field209[var2 + 1], field209[var2 + 3], field209[var2]);
                            }
                            continue;
                        }
                        if (var620 == 5604) {
                            var3--;
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0 && class448.field6540 == 0) {
                                class264.method1807(57, class158.method1112(field220[var3], (byte) -78));
                            }
                            continue;
                        }
                        if (var620 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0 && class448.field6540 == 0) {
                                class126.method930(field209[var2 + 1], field220[var3 + 1], field209[var2 + 2], -4230, field209[var2], field209[var2 + 6] == 1, class158.method1112(field220[var3], (byte) -95), field209[var2 + 5] == 1, field220[var3 + 2], field209[var2 + 3], field209[var2 + 4] == 1);
                            }
                            continue;
                        }
                        if (var620 == 5606) {
                            if (class31.field389 == 0) {
                                class190.field3103 = -2;
                            }
                            continue;
                        }
                        if (var620 == 5607) {
                            field209[var2++] = class357.field5463;
                            continue;
                        }
                        if (var620 == 5608) {
                            field209[var2++] = class182.field2977;
                            continue;
                        }
                        if (var620 == 5609) {
                            field209[var2++] = class190.field3103;
                            continue;
                        }
                        if (var620 == 5610) {
                            for (int var527 = 0; var527 < 5; var527++) {
                                field220[var3++] = class182.field2976.length > var527 ? class37.method252(class182.field2976[var527], 1000000) : "";
                            }
                            class182.field2976 = null;
                            continue;
                        }
                        if (var620 == 5611) {
                            field209[var2++] = class318.field4987;
                            continue;
                        }
                    } else if (var620 < 6100) {
                        if (var620 == 6001) {
                            var2--;
                            int var528 = field209[var2];
                            if (var528 < 1) {
                                var528 = 1;
                            }
                            if (var528 > 4) {
                                var528 = 4;
                            }
                            class394.field5905 = var528;
                            class3.method68(25);
                            class306.method2062((byte) 121, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6002) {
                            var2--;
                            class449.method2794((byte) -86, field209[var2] == 1);
                            class345.method2254(-11424);
                            class3.method68(25);
                            class111.method825((byte) -128);
                            class306.method2062((byte) 105, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6003) {
                            var2--;
                            class216.field3514 = field209[var2] == 1;
                            class111.method825((byte) -128);
                            class306.method2062((byte) 96, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6005) {
                            var2--;
                            class341.field5267 = field209[var2] == 1;
                            class3.method68(25);
                            class306.method2062((byte) 107, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6006) {
                            var2--;
                            class311.field4905 = field209[var2] == 1;
                            class284.field4547.method596(!class311.field4905);
                            class306.method2062((byte) 96, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6007) {
                            var2--;
                            class137.field2145 = field209[var2];
                            class306.method2062((byte) 100, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6008) {
                            var2--;
                            class234.field3903 = field209[var2] == 1;
                            class306.method2062((byte) 125, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6009) {
                            var2--;
                            class256.field4149 = field209[var2] == 1;
                            class3.method68(25);
                            class306.method2062((byte) 116, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6010) {
                            var2--;
                            class183.field2984 = field209[var2] == 1;
                            class306.method2062((byte) 96, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6011) {
                            var2--;
                            int var529 = field209[var2];
                            if (var529 < 0 || var529 > 2) {
                                var529 = 0;
                            }
                            class299.field4755 = var529;
                            class3.method68(25);
                            class306.method2062((byte) 97, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6012) {
                            var2--;
                            class377.field5695 = field209[var2] == 1;
                            class415.method2593(-11);
                            class306.method2062((byte) 124, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6014) {
                            var2--;
                            class220.field3627 = field209[var2] == 1;
                            class3.method68(25);
                            class306.method2062((byte) 100, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6015) {
                            var2--;
                            class241.field3987 = field209[var2] == 1;
                            class3.method68(25);
                            class306.method2062((byte) 113, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6016) {
                            var2--;
                            int var530 = field209[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class418.field6198 = var530;
                            class267.method1822(-94);
                            class306.method2062((byte) 97, class63.field822);
                            continue;
                        }
                        if (var620 == 6017) {
                            var2--;
                            class349.field5410 = field209[var2] == 1;
                            class94.method554((byte) -5);
                            class306.method2062((byte) 105, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6018) {
                            var2--;
                            int var531 = field209[var2];
                            if (var531 < 0) {
                                var531 = 0;
                            }
                            if (var531 > 127) {
                                var531 = 127;
                            }
                            class145.field2283 = var531;
                            class306.method2062((byte) 120, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6019) {
                            var2--;
                            int var532 = field209[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 255) {
                                var532 = 255;
                            }
                            if (class232.field3867 != var532) {
                                if (class232.field3867 == 0 && class160.field2533 != -1) {
                                    class208.method1463(false, var532, class160.field2533, (byte) -124, 0, class125.field1930);
                                    class241.field3998 = false;
                                } else if (var532 == 0) {
                                    class68.method430((byte) 96);
                                    class241.field3998 = false;
                                } else {
                                    class440.method2711(var532, 74);
                                }
                                class232.field3867 = var532;
                            }
                            class306.method2062((byte) 119, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6020) {
                            var2--;
                            int var533 = field209[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class213.field3427 = var533;
                            class306.method2062((byte) 108, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6021) {
                            var2--;
                            class312.field4925 = field209[var2] == 1;
                            class111.method825((byte) -128);
                            continue;
                        }
                        if (var620 == 6023) {
                            var2--;
                            int var534 = field209[var2];
                            boolean var535 = false;
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 2) {
                                var534 = 2;
                            }
                            if (class27.field314 < 96) {
                                var534 = 0;
                                var535 = true;
                            }
                            class331.method2196(0, var534);
                            class306.method2062((byte) 113, class63.field822);
                            class444.field6477 = false;
                            field209[var2++] = var535 ? 0 : 1;
                            continue;
                        }
                        if (var620 == 6024) {
                            var2--;
                            int var536 = field209[var2];
                            if (var536 < 0 || var536 > 2) {
                                var536 = 0;
                            }
                            class86.field1103 = var536;
                            class306.method2062((byte) 106, class63.field822);
                            continue;
                        }
                        if (var620 == 6025) {
                            var2--;
                            int var537 = field209[var2];
                            if (var537 < 0 || var537 > 3) {
                                var537 = 0;
                            }
                            class386.field5835 = var537;
                            class306.method2062((byte) 107, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6027) {
                            var2--;
                            int var538 = field209[var2];
                            if (var538 < 0 || var538 > 1) {
                                var538 = 0;
                            }
                            class348.method2270(var538 == 1, -61);
                            continue;
                        }
                        if (var620 == 6028) {
                            var2--;
                            class150.field2338 = field209[var2] != 0;
                            class306.method2062((byte) 95, class63.field822);
                            continue;
                        }
                        if (var620 == 6029) {
                            var2--;
                            class137.field2145 = field209[var2];
                            class306.method2062((byte) 108, class63.field822);
                            continue;
                        }
                        if (var620 == 6030) {
                            var2--;
                            class395.field5923 = field209[var2] != 0;
                            class306.method2062((byte) 107, class63.field822);
                            class3.method68(25);
                            continue;
                        }
                        if (var620 == 6031) {
                            var2--;
                            int var539 = field209[var2];
                            if (var539 < 0 || var539 > 3) {
                                var539 = 2;
                            }
                            class221.method1586(-1009, var539);
                            continue;
                        }
                        if (var620 == 6032) {
                            var2--;
                            int var540 = field209[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class452.field6579 = var540;
                            class306.method2062((byte) 99, class63.field822);
                            class444.field6477 = false;
                            continue;
                        }
                        if (var620 == 6033) {
                            var2--;
                            int var541 = field209[var2];
                            if (var541 < 0 || var541 > 4) {
                                var541 = 2;
                            }
                            class183.field2996 = var541;
                            class306.method2062((byte) 97, class63.field822);
                            continue;
                        }
                    } else if (var620 < 6200) {
                        if (var620 == 6101) {
                            field209[var2++] = class394.field5905;
                            continue;
                        }
                        if (var620 == 6102) {
                            field209[var2++] = class117.method852(true) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6103) {
                            field209[var2++] = class216.field3514 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6105) {
                            field209[var2++] = class341.field5267 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6106) {
                            field209[var2++] = class311.field4905 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6107) {
                            field209[var2++] = class137.field2145;
                            continue;
                        }
                        if (var620 == 6108) {
                            field209[var2++] = class234.field3903 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6109) {
                            field209[var2++] = class256.field4149 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6110) {
                            field209[var2++] = class183.field2984 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6111) {
                            field209[var2++] = class299.field4755;
                            continue;
                        }
                        if (var620 == 6112) {
                            field209[var2++] = class377.field5695 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6114) {
                            field209[var2++] = class220.field3627 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6115) {
                            field209[var2++] = class241.field3987 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6116) {
                            field209[var2++] = class418.field6198;
                            continue;
                        }
                        if (var620 == 6117) {
                            field209[var2++] = class349.field5410 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6118) {
                            field209[var2++] = class145.field2283;
                            continue;
                        }
                        if (var620 == 6119) {
                            field209[var2++] = class232.field3867;
                            continue;
                        }
                        if (var620 == 6120) {
                            field209[var2++] = class213.field3427;
                            continue;
                        }
                        if (var620 == 6121) {
                            field209[var2++] = class284.field4547.method616() ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6123) {
                            field209[var2++] = class7.method88(22800);
                            continue;
                        }
                        if (var620 == 6124) {
                            field209[var2++] = class86.field1103;
                            continue;
                        }
                        if (var620 == 6125) {
                            field209[var2++] = class386.field5835;
                            continue;
                        }
                        if (var620 == 6126) {
                            field209[var2++] = class284.field4547.method710() ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6127) {
                            field209[var2++] = class99.field1381 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6128) {
                            field209[var2++] = class150.field2338 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6129) {
                            field209[var2++] = class137.field2145;
                            continue;
                        }
                        if (var620 == 6130) {
                            field209[var2++] = class395.field5923 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6131) {
                            field209[var2++] = class128.field2035;
                            continue;
                        }
                        if (var620 == 6132) {
                            field209[var2++] = class452.field6579;
                            continue;
                        }
                        if (var620 == 6133) {
                            field209[var2++] = class279.field4460 == 1 || class279.field4460 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6135) {
                            field209[var2++] = class183.field2996;
                            continue;
                        }
                    } else if (var620 < 6300) {
                        if (var620 == 6200) {
                            var2 -= 2;
                            class111.field1540 = (short) field209[var2];
                            if (class111.field1540 <= 0) {
                                class111.field1540 = 256;
                            }
                            class410.field6082 = (short) field209[var2 + 1];
                            if (class410.field6082 <= 0) {
                                class410.field6082 = 205;
                            }
                            continue;
                        }
                        if (var620 == 6201) {
                            var2 -= 2;
                            class115.field1598 = (short) field209[var2];
                            if (class115.field1598 <= 0) {
                                class115.field1598 = 256;
                            }
                            class11.field158 = (short) field209[var2 + 1];
                            if (class11.field158 <= 0) {
                                class11.field158 = 320;
                            }
                            continue;
                        }
                        if (var620 == 6202) {
                            var2 -= 4;
                            class129.field2038 = (short) field209[var2];
                            if (class129.field2038 <= 0) {
                                class129.field2038 = 1;
                            }
                            class203.field3264 = (short) field209[var2 + 1];
                            if (class203.field3264 <= 0) {
                                class203.field3264 = 32767;
                            } else if (class203.field3264 < class129.field2038) {
                                class203.field3264 = class129.field2038;
                            }
                            class111.field1543 = (short) field209[var2 + 2];
                            if (class111.field1543 <= 0) {
                                class111.field1543 = 1;
                            }
                            class185.field3001 = (short) field209[var2 + 3];
                            if (class185.field3001 <= 0) {
                                class185.field3001 = 32767;
                            } else if (class185.field3001 < class111.field1543) {
                                class185.field3001 = class111.field1543;
                            }
                            continue;
                        }
                        if (var620 == 6203) {
                            class196.method1370(0, class379.field5720.field2834, 0, 2, class379.field5720.field2705, false);
                            field209[var2++] = class185.field3000;
                            field209[var2++] = class115.field1594;
                            continue;
                        }
                        if (var620 == 6204) {
                            field209[var2++] = class115.field1598;
                            field209[var2++] = class11.field158;
                            continue;
                        }
                        if (var620 == 6205) {
                            field209[var2++] = class111.field1540;
                            field209[var2++] = class410.field6082;
                            continue;
                        }
                    } else if (var620 < 6400) {
                        if (var620 == 6300) {
                            field209[var2++] = (int) (class46.method297(27104) / 60000L);
                            continue;
                        }
                        if (var620 == 6301) {
                            field209[var2++] = (int) (class46.method297(27104) / 86400000L) - 11745;
                            continue;
                        }
                        if (var620 == 6302) {
                            var2 -= 3;
                            int var542 = field209[var2];
                            int var543 = field209[var2 + 1];
                            int var544 = field209[var2 + 2];
                            field221.clear();
                            field221.set(11, 12);
                            field221.set(var544, var543, var542);
                            field209[var2++] = (int) (field221.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var620 == 6303) {
                            field221.clear();
                            field221.setTime(new Date(class46.method297(27104)));
                            field209[var2++] = field221.get(1);
                            continue;
                        }
                        if (var620 == 6304) {
                            var2--;
                            int var545 = field209[var2];
                            boolean var546 = true;
                            if (var545 < 0) {
                                var546 = (var545 + 1) % 4 == 0;
                            } else if (var545 < 1582) {
                                var546 = var545 % 4 == 0;
                            } else if (var545 % 4 != 0) {
                                var546 = false;
                            } else if (var545 % 100 != 0) {
                                var546 = true;
                            } else if (var545 % 400 != 0) {
                                var546 = false;
                            }
                            field209[var2++] = var546 ? 1 : 0;
                            continue;
                        }
                    } else if (var620 < 6500) {
                        if (var620 == 6405) {
                            field209[var2++] = class436.method2689(-1) ? 1 : 0;
                            continue;
                        }
                        if (var620 == 6406) {
                            field209[var2++] = class3.method65(0) ? 1 : 0;
                            continue;
                        }
                    } else if (var620 < 6600) {
                        if (var620 == 6500) {
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0) {
                                field209[var2++] = class262.method1800(false) == -1 ? 0 : 1;
                                continue;
                            }
                            field209[var2++] = 1;
                            continue;
                        }
                        if (var620 == 6501) {
                            class231 var547 = class111.method821(126);
                            if (var547 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = 0;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var547.field3849;
                                field209[var2++] = var547.field4055;
                                field220[var3++] = var547.field3844;
                                class179 var548 = var547.method1640(21626);
                                field209[var2++] = var548.field2924;
                                field220[var3++] = var548.field2930;
                                field209[var2++] = var547.field4064;
                                field209[var2++] = var547.field3848;
                            }
                            continue;
                        }
                        if (var620 == 6502) {
                            class231 var549 = class107.method810(22068);
                            if (var549 == null) {
                                field209[var2++] = -1;
                                field209[var2++] = 0;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var549.field3849;
                                field209[var2++] = var549.field4055;
                                field220[var3++] = var549.field3844;
                                class179 var550 = var549.method1640(21626);
                                field209[var2++] = var550.field2924;
                                field220[var3++] = var550.field2930;
                                field209[var2++] = var549.field4064;
                                field209[var2++] = var549.field3848;
                            }
                            continue;
                        }
                        if (var620 == 6503) {
                            var2--;
                            int var551 = field209[var2];
                            if (class262.field4219 == 10 && class426.field6281 == 0 && class300.field4760 == 0 && class31.field389 == 0) {
                                field209[var2++] = class380.method2419(4, var551) ? 1 : 0;
                                continue;
                            }
                            field209[var2++] = 0;
                            continue;
                        }
                        if (var620 == 6504) {
                            var2--;
                            class13.field183 = field209[var2];
                            class306.method2062((byte) 97, class63.field822);
                            continue;
                        }
                        if (var620 == 6505) {
                            field209[var2++] = class13.field183;
                            continue;
                        }
                        if (var620 == 6506) {
                            var2--;
                            int var552 = field209[var2];
                            class231 var553 = class63.method408(var552, (byte) 102);
                            if (var553 == null) {
                                field209[var2++] = -1;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field220[var3++] = "";
                                field209[var2++] = 0;
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = var553.field4055;
                                field220[var3++] = var553.field3844;
                                class179 var554 = var553.method1640(21626);
                                field209[var2++] = var554.field2924;
                                field220[var3++] = var554.field2930;
                                field209[var2++] = var553.field4064;
                                field209[var2++] = var553.field3848;
                            }
                            continue;
                        }
                        if (var620 == 6507) {
                            var2 -= 4;
                            int var555 = field209[var2];
                            boolean var556 = field209[var2 + 1] == 1;
                            int var557 = field209[var2 + 2];
                            boolean var558 = field209[var2 + 3] == 1;
                            class450.method2798(false, var555, var556, var558, var557);
                            continue;
                        }
                        if (var620 == 6508) {
                            class252.method1751(-1);
                            continue;
                        }
                        if (var620 == 6509) {
                            if (class262.field4219 == 10) {
                                var2--;
                                if (field209[var2] == 1) {
                                    if (class316.field4957 == null) {
                                        class316.field4957 = new class250();
                                    }
                                } else if (class316.field4957 != null) {
                                    class316.field4957.method1727(-19432);
                                    class316.field4957 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var620 < 6700) {
                        if (var620 == 6600) {
                            var2--;
                            class301.field4772 = field209[var2] == 1;
                            class306.method2062((byte) 111, class63.field822);
                            continue;
                        }
                        if (var620 == 6601) {
                            field209[var2++] = class301.field4772 ? 1 : 0;
                            continue;
                        }
                    } else if (var620 < 6800 && class348.field5355 == 2) {
                        if (var620 == 6700) {
                            int var559 = class392.field5891.method1778(0);
                            if (class306.field4847 != -1) {
                                var559++;
                            }
                            field209[var2++] = var559;
                            continue;
                        }
                        if (var620 == 6701) {
                            var2--;
                            int var560 = field209[var2];
                            if (class306.field4847 != -1) {
                                if (var560 == 0) {
                                    field209[var2++] = class306.field4847;
                                    continue;
                                }
                                var560--;
                            }
                            class196 var561 = (class196) class392.field5891.method1776(true);
                            while (var560-- > 0) {
                                var561 = (class196) class392.field5891.method1773(-1);
                            }
                            field209[var2++] = var561.field3171;
                            continue;
                        }
                        if (var620 == 6702) {
                            var2--;
                            int var562 = field209[var2];
                            if (class203.field3266[var562] == null) {
                                field220[var3++] = "";
                            } else {
                                String var563 = class203.field3266[var562][0].field2850;
                                if (var563 == null) {
                                    field220[var3++] = "";
                                } else {
                                    field220[var3++] = var563.substring(0, var563.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var620 == 6703) {
                            var2--;
                            int var564 = field209[var2];
                            if (class203.field3266[var564] == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = class203.field3266[var564].length;
                            }
                            continue;
                        }
                        if (var620 == 6704) {
                            var2 -= 2;
                            int var565 = field209[var2];
                            int var566 = field209[var2 + 1];
                            if (class203.field3266[var565] == null) {
                                field220[var3++] = "";
                            } else {
                                String var567 = class203.field3266[var565][var566].field2850;
                                if (var567 == null) {
                                    field220[var3++] = "";
                                } else {
                                    field220[var3++] = var567;
                                }
                            }
                            continue;
                        }
                        if (var620 == 6705) {
                            var2 -= 2;
                            int var568 = field209[var2];
                            int var569 = field209[var2 + 1];
                            if (class203.field3266[var568] == null) {
                                field209[var2++] = 0;
                            } else {
                                field209[var2++] = class203.field3266[var568][var569].field2742;
                            }
                            continue;
                        }
                        if (var620 == 6706) {
                            continue;
                        }
                        if (var620 == 6707) {
                            var2 -= 3;
                            int var570 = field209[var2];
                            int var571 = field209[var2 + 1];
                            int var572 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var570 << 16 | var571, 1, var572);
                            continue;
                        }
                        if (var620 == 6708) {
                            var2 -= 3;
                            int var573 = field209[var2];
                            int var574 = field209[var2 + 1];
                            int var575 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var573 << 16 | var574, 2, var575);
                            continue;
                        }
                        if (var620 == 6709) {
                            var2 -= 3;
                            int var576 = field209[var2];
                            int var577 = field209[var2 + 1];
                            int var578 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var576 << 16 | var577, 3, var578);
                            continue;
                        }
                        if (var620 == 6710) {
                            var2 -= 3;
                            int var579 = field209[var2];
                            int var580 = field209[var2 + 1];
                            int var581 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var579 << 16 | var580, 4, var581);
                            continue;
                        }
                        if (var620 == 6711) {
                            var2 -= 3;
                            int var582 = field209[var2];
                            int var583 = field209[var2 + 1];
                            int var584 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var582 << 16 | var583, 5, var584);
                            continue;
                        }
                        if (var620 == 6712) {
                            var2 -= 3;
                            int var585 = field209[var2];
                            int var586 = field209[var2 + 1];
                            int var587 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var585 << 16 | var586, 6, var587);
                            continue;
                        }
                        if (var620 == 6713) {
                            var2 -= 3;
                            int var588 = field209[var2];
                            int var589 = field209[var2 + 1];
                            int var590 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var588 << 16 | var589, 7, var590);
                            continue;
                        }
                        if (var620 == 6714) {
                            var2 -= 3;
                            int var591 = field209[var2];
                            int var592 = field209[var2 + 1];
                            int var593 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var591 << 16 | var592, 8, var593);
                            continue;
                        }
                        if (var620 == 6715) {
                            var2 -= 3;
                            int var594 = field209[var2];
                            int var595 = field209[var2 + 1];
                            int var596 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var594 << 16 | var595, 9, var596);
                            continue;
                        }
                        if (var620 == 6716) {
                            var2 -= 3;
                            int var597 = field209[var2];
                            int var598 = field209[var2 + 1];
                            int var599 = field209[var2 + 2];
                            class385.method2431("", (byte) 61, var597 << 16 | var598, 10, var599);
                            continue;
                        }
                        if (var620 == 6717) {
                            var2 -= 3;
                            int var600 = field209[var2];
                            int var601 = field209[var2 + 1];
                            int var602 = field209[var2 + 2];
                            class172 var603 = class201.method1393(var600 << 16 | var601, var602, -106);
                            class11.method109(-13853);
                            class53 var604 = client.method1149(var603);
                            class450.method2800(var603.field2837, var600 << 16 | var601, var603.field2777, (byte) -52, var602, var604.method353(127), var604.field659);
                            continue;
                        }
                    } else if (var620 < 6900) {
                        if (var620 == 6800) {
                            var2--;
                            int var605 = field209[var2];
                            class324 var606 = class288.method1944(36, var605);
                            if (var606.field5070 == null) {
                                field220[var3++] = "";
                            } else {
                                field220[var3++] = var606.field5070;
                            }
                            continue;
                        }
                        if (var620 == 6801) {
                            var2--;
                            int var607 = field209[var2];
                            class324 var608 = class288.method1944(36, var607);
                            field209[var2++] = var608.field5071;
                            continue;
                        }
                        if (var620 == 6802) {
                            var2--;
                            int var609 = field209[var2];
                            class324 var610 = class288.method1944(36, var609);
                            field209[var2++] = var610.field5083;
                            continue;
                        }
                        if (var620 == 6803) {
                            var2--;
                            int var611 = field209[var2];
                            class324 var612 = class288.method1944(36, var611);
                            field209[var2++] = var612.field5091;
                            continue;
                        }
                    }
                } else {
                    class172 var75;
                    if (var620 >= 2000) {
                        var620 -= 1000;
                        var2--;
                        var75 = class196.method1375(field209[var2], (byte) -56);
                    } else {
                        var75 = var37 ? field223 : field212;
                    }
                    if (var620 == 1300) {
                        var2--;
                        int var76 = field209[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1193(field220[var3], var76, (byte) 118);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var620 == 1301) {
                        var2 -= 2;
                        int var77 = field209[var2];
                        int var78 = field209[var2 + 1];
                        var75.field2795 = class201.method1393(var77, var78, -116);
                        continue;
                    }
                    if (var620 == 1302) {
                        var2--;
                        var75.field2733 = field209[var2] == 1;
                        continue;
                    }
                    if (var620 == 1303) {
                        var2--;
                        var75.field2758 = field209[var2];
                        continue;
                    }
                    if (var620 == 1304) {
                        var2--;
                        var75.field2813 = field209[var2];
                        continue;
                    }
                    if (var620 == 1305) {
                        var3--;
                        var75.field2801 = field220[var3];
                        continue;
                    }
                    if (var620 == 1306) {
                        var3--;
                        var75.field2817 = field220[var3];
                        continue;
                    }
                    if (var620 == 1307) {
                        var75.field2823 = null;
                        continue;
                    }
                    if (var620 == 1308) {
                        var2--;
                        var75.field2837 = field209[var2];
                        var2--;
                        var75.field2777 = field209[var2];
                        continue;
                    }
                    if (var620 == 1309) {
                        var2--;
                        int var79 = field209[var2];
                        var2--;
                        int var80 = field209[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1204((byte) -120, var80 - 1, var79);
                        }
                        continue;
                    }
                    if (var620 == 1310) {
                        var3--;
                        var75.field2784 = field220[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var619) {
            if (arg0.field6138 == null) {
                StringBuffer var617 = new StringBuffer(30);
                var617.append("CS2: ").append(arg0.field2539).append(" ");
                for (int var618 = field222 - 1; var618 >= 0; var618--) {
                    var617.append("v: ").append(field226[var618].field5212.field2539).append(" ");
                }
                var617.append("op: ").append(var7);
                class272.method1845(var619, 122, var617.toString());
            } else {
                class357.method2329("Clientscript error in: " + arg0.field6138, 0);
                StringBuffer var614 = new StringBuffer(30);
                var614.append("Clientscript error in: ").append(arg0.field6138).append("\n");
                for (int var615 = field222 - 1; var615 >= 0; var615--) {
                    var614.append("via: ").append(field226[var615].field5212.field6138).append("\n");
                }
                var614.append("Op: ").append(var7).append("\n");
                String var616 = var619.getMessage();
                if (var616 != null && var616.length() > 0) {
                    var614.append("Message: ").append(var616).append("\n");
                }
                class272.method1845(var619, 123, var614.toString());
                class394.method2489((byte) 52, var614.toString());
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V", line = 7026)
    public static final void method138(int arg0, int arg1, int arg2) {
        class415 var3 = class238.method1680(arg1, arg2, true, arg0);
        if (var3 == null) {
            return;
        }
        field208 = new int[var3.field6134];
        field228 = new String[var3.field6133];
        if (var3.field6135 == 15 || var3.field6135 == 17 || var3.field6135 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class30.field367 != null) {
                var4 = class30.field367.field2766;
                var5 = class30.field367.field2726;
            }
            field208[0] = class414.field6125 - var4;
            field208[1] = class287.field4604 - var5;
        }
        method137(var3, 200000);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 7066)
    public static void method139() {
        field208 = null;
        field228 = null;
        field210 = null;
        field216 = null;
        field209 = null;
        field220 = null;
        field226 = null;
        field212 = null;
        field223 = null;
        field225 = null;
        field221 = null;
        field230 = null;
        field231 = null;
        field229 = null;
    }
}
