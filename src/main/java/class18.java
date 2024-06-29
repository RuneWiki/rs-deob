import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class18 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    private static int field347 = 0;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[Llh;")
    private static class451[] field350 = new class451[50];

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
    private static int[] field356 = new int[5];

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[[I")
    private static int[][] field352 = new int[5][5000];

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field360 = new String[1000];

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    private static int[] field348 = new int[1000];

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/util/Calendar;")
    private static Calendar field349 = Calendar.getInstance();

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field366 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "[I")
    private static int[] field367 = new int[3];

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "Lik;")
    public static class410 field368 = new class410(4);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lbi;")
    private static class139 field346;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lbi;")
    private static class139 field355;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lip;")
    private static class49 field353;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[I")
    private static int[] field351;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field364;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 10)
    public static final void method262(int arg0, int arg1, int arg2) {
        class213 var3 = class316.method2009(arg2, arg1, (byte) 105, arg0);
        if (var3 == null) {
            return;
        }
        field351 = new int[var3.field2948];
        field364 = new String[var3.field2946];
        if (var3.field2954 == 15 || var3.field2954 == 17 || var3.field2954 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class30.field500 != null) {
                var4 = class30.field500.field2065;
                var5 = class30.field500.field2022;
            }
            field351[0] = class391.field5490 - var4;
            field351[1] = class312.field4220 - var5;
        }
        method265(var3, 200000);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 49)
    public static final void method263(int arg0) {
        if (arg0 == -1 || !class15.method76(6, arg0)) {
            return;
        }
        class139[] var1 = class291.field3949[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class139 var3 = var1[var2];
            if (var3.field1980 != null) {
                class361 var4 = new class361();
                var4.field4903 = var3;
                var4.field4905 = var3.field1980;
                method264(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lme;I)V", line = 79)
    private static final void method264(class361 arg0, int arg1) {
        Object[] var2 = arg0.field4905;
        int var3 = (Integer) var2[0];
        class213 var4 = class118.method938(var3, -28029);
        if (var4 == null) {
            return;
        }
        field351 = new int[var4.field2948];
        int var5 = 0;
        field364 = new String[var4.field2946];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4901;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4904;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4903 == null ? -1 : arg0.field4903.field1968;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4912;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4903 == null ? -1 : arg0.field4903.field2094;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4907 == null ? -1 : arg0.field4907.field1968;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4907 == null ? -1 : arg0.field4907.field2094;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4913;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4900;
                }
                field351[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4899;
                }
                field364[var6++] = var9;
            }
        }
        method265(var4, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ldd;I)V", line = 158)
    private static final void method265(class213 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field2957;
        int[] var6 = arg0.field2959;
        byte var7 = -1;
        field347 = 0;
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
                        field348[var2++] = var6[var4];
                        continue;
                    }
                    if (var607 == 1) {
                        int var9 = var6[var4];
                        field348[var2++] = class414.field5782[var9];
                        continue;
                    }
                    if (var607 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class267.method1716(0, var10, field348[var2]);
                        continue;
                    }
                    if (var607 == 3) {
                        field360[var3++] = arg0.field2953[var4];
                        continue;
                    }
                    if (var607 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var607 == 7) {
                        var2 -= 2;
                        if (field348[var2 + 1] != field348[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 8) {
                        var2 -= 2;
                        if (field348[var2 + 1] == field348[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 9) {
                        var2 -= 2;
                        if (field348[var2] < field348[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 10) {
                        var2 -= 2;
                        if (field348[var2] > field348[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 21) {
                        if (field347 == 0) {
                            return;
                        }
                        class451 var11 = field350[--field347];
                        arg0 = var11.field6516;
                        var5 = arg0.field2957;
                        var6 = arg0.field2959;
                        var4 = var11.field6515;
                        field351 = var11.field6519;
                        field364 = var11.field6520;
                        continue;
                    }
                    if (var607 == 25) {
                        int var12 = var6[var4];
                        field348[var2++] = class218.method1490(var12, -23365);
                        continue;
                    }
                    if (var607 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class132.method1034((byte) 12, var13, field348[var2]);
                        continue;
                    }
                    if (var607 == 31) {
                        var2 -= 2;
                        if (field348[var2] <= field348[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 32) {
                        var2 -= 2;
                        if (field348[var2] >= field348[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 33) {
                        field348[var2++] = field351[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var607 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field351[var10001] = field348[var2];
                        continue;
                    }
                    if (var607 == 35) {
                        field360[var3++] = field364[var6[var4]];
                        continue;
                    }
                    if (var607 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field364[var10001] = field360[var3];
                        continue;
                    }
                    if (var607 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class318.method2021(field360, var14, var3, (byte) -109);
                        field360[var3++] = var15;
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
                        class213 var17 = class118.method938(var16, -28029);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field2948];
                        String[] var19 = new String[var17.field2946];
                        for (int var20 = 0; var20 < var17.field2955; var20++) {
                            var18[var20] = field348[var2 + var20 - var17.field2955];
                        }
                        for (int var21 = 0; var21 < var17.field2951; var21++) {
                            var19[var21] = field360[var3 + var21 - var17.field2951];
                        }
                        var2 -= var17.field2955;
                        var3 -= var17.field2951;
                        class451 var22 = new class451();
                        var22.field6516 = arg0;
                        var22.field6515 = var4;
                        var22.field6519 = field351;
                        var22.field6520 = field364;
                        if (field347 >= field350.length) {
                            throw new RuntimeException();
                        }
                        field350[field347++] = var22;
                        arg0 = var17;
                        var5 = var17.field2957;
                        var6 = var17.field2959;
                        var4 = -1;
                        field351 = var18;
                        field364 = var19;
                        continue;
                    }
                    if (var607 == 42) {
                        field348[var2++] = class331.field4511[var6[var4]];
                        continue;
                    }
                    if (var607 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class331.field4511[var23] = field348[var2];
                        class52.method502(false, var23);
                        class288.field3866 |= class257.field3475[var23];
                        continue;
                    }
                    if (var607 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field348[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field356[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4411;
                                }
                                field352[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field348[var2];
                        if (var30 >= 0 && var30 < field356[var29]) {
                            field348[var2++] = field352[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field348[var2];
                        if (var32 >= 0 && var32 < field356[var31]) {
                            field352[var31][var32] = field348[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 47) {
                        String var33 = class334.field4526[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field360[var3++] = var33;
                        continue;
                    }
                    if (var607 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class334.field4526[var34] = field360[var3];
                        class154.method1183(-1, var34);
                        continue;
                    }
                    if (var607 == 51) {
                        class71 var35 = arg0.field2947[var6[var4]];
                        var2--;
                        class193 var36 = (class193) var35.method614(-110, (long) field348[var2]);
                        if (var36 != null) {
                            var4 += var36.field2776;
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
                        int var38 = field348[var2];
                        int var39 = field348[var2 + 1];
                        int var40 = field348[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class139 var41 = class10.method57(65535, var38);
                        if (var41.field2045 == null) {
                            var41.field2045 = new class139[var40 + 1];
                        }
                        if (var41.field2045.length <= var40) {
                            class139[] var42 = new class139[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2045.length; var43++) {
                                var42[var43] = var41.field2045[var43];
                            }
                            var41.field2045 = var42;
                        }
                        if (var40 > 0 && var41.field2045[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class139 var44 = new class139();
                        var44.field2023 = var39;
                        var44.field2042 = var44.field1968 = var41.field1968;
                        var44.field2094 = var40;
                        var44.field2048 = true;
                        var41.field2045[var40] = var44;
                        if (var37) {
                            field346 = var44;
                        } else {
                            field355 = var44;
                        }
                        class10.method52(var41, (byte) -89);
                        continue;
                    }
                    if (var607 == 101) {
                        class139 var45 = var37 ? field346 : field355;
                        if (var45.field2094 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class139 var46 = class10.method57(65535, var45.field1968);
                        var46.field2045[var45.field2094] = null;
                        class10.method52(var46, (byte) -89);
                        continue;
                    }
                    if (var607 == 102) {
                        var2--;
                        class139 var47 = class10.method57(65535, field348[var2]);
                        var47.field2045 = null;
                        class10.method52(var47, (byte) -89);
                        continue;
                    }
                    if (var607 == 200) {
                        var2 -= 2;
                        int var48 = field348[var2];
                        int var49 = field348[var2 + 1];
                        class139 var50 = class44.method411(var49, true, var48);
                        if (var50 != null && var49 != -1) {
                            field348[var2++] = 1;
                            if (var37) {
                                field346 = var50;
                            } else {
                                field355 = var50;
                            }
                            continue;
                        }
                        field348[var2++] = 0;
                        continue;
                    }
                    if (var607 == 201) {
                        var2--;
                        int var51 = field348[var2];
                        class139 var52 = class10.method57(65535, var51);
                        if (var52 == null) {
                            field348[var2++] = 0;
                        } else {
                            field348[var2++] = 1;
                            if (var37) {
                                field346 = var52;
                            } else {
                                field355 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var607 < 500) {
                    if (var607 == 403) {
                        var2 -= 2;
                        int var53 = field348[var2];
                        int var54 = field348[var2 + 1];
                        for (int var55 = 0; var55 < class61.field950.length; var55++) {
                            if (class61.field950[var55] == var53) {
                                class95.field1379.field4608.method299(var54, var55, (byte) 127);
                                continue label4411;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class144.field2169.length) {
                                continue label4411;
                            }
                            if (class144.field2169[var56] == var53) {
                                class95.field1379.field4608.method299(var54, var56, (byte) 122);
                                continue label4411;
                            }
                            var56++;
                        }
                    }
                    if (var607 == 404) {
                        var2 -= 2;
                        int var57 = field348[var2];
                        int var58 = field348[var2 + 1];
                        class95.field1379.field4608.method302(var57, -117, var58);
                        continue;
                    }
                    if (var607 == 410) {
                        var2--;
                        boolean var59 = field348[var2] != 0;
                        class95.field1379.field4608.method293(var59, 30);
                        continue;
                    }
                } else if (var607 >= 1000 && var607 < 1100 || var607 >= 2000 && var607 < 2100) {
                    class139 var60;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var60 = class10.method57(65535, field348[var2]);
                    } else {
                        var60 = var37 ? field346 : field355;
                    }
                    if (var607 == 1000) {
                        var2 -= 4;
                        var60.field2114 = field348[var2];
                        var60.field2008 = field348[var2 + 1];
                        int var61 = field348[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field348[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2014 = (byte) var61;
                        var60.field2091 = (byte) var62;
                        class10.method52(var60, (byte) -89);
                        class118.method946(var60, -38);
                        if (var60.field2094 == -1) {
                            class340.method2160(var60.field1968, 4080);
                        }
                        continue;
                    }
                    if (var607 == 1001) {
                        var2 -= 4;
                        var60.field1956 = field348[var2];
                        var60.field2020 = field348[var2 + 1];
                        var60.field2115 = 0;
                        var60.field2017 = 0;
                        int var63 = field348[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field348[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2111 = (byte) var63;
                        var60.field1989 = (byte) var64;
                        class10.method52(var60, (byte) -89);
                        class118.method946(var60, -65);
                        if (var60.field2023 == 0) {
                            class441.method2738((byte) 111, var60, false);
                        }
                        continue;
                    }
                    if (var607 == 1003) {
                        var2--;
                        boolean var65 = field348[var2] == 1;
                        if (var60.field2072 != var65) {
                            var60.field2072 = var65;
                            class10.method52(var60, (byte) -89);
                        }
                        if (var60.field2094 == -1) {
                            class15.method81(var60.field1968, 16728);
                        }
                        continue;
                    }
                    if (var607 == 1004) {
                        var2 -= 2;
                        var60.field2126 = field348[var2];
                        var60.field1964 = field348[var2 + 1];
                        class10.method52(var60, (byte) -89);
                        class118.method946(var60, 96);
                        if (var60.field2023 == 0) {
                            class441.method2738((byte) 77, var60, false);
                        }
                        continue;
                    }
                    if (var607 == 1005) {
                        var2--;
                        var60.field2010 = field348[var2] == 1;
                        continue;
                    }
                } else if (var607 >= 1100 && var607 < 1200 || var607 >= 2100 && var607 < 2200) {
                    class139 var66;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var66 = class10.method57(65535, field348[var2]);
                    } else {
                        var66 = var37 ? field346 : field355;
                    }
                    if (var607 == 1100) {
                        var2 -= 2;
                        var66.field2055 = field348[var2];
                        if (var66.field2055 > var66.field1998 - var66.field2027) {
                            var66.field2055 = var66.field1998 - var66.field2027;
                        }
                        if (var66.field2055 < 0) {
                            var66.field2055 = 0;
                        }
                        var66.field1983 = field348[var2 + 1];
                        if (var66.field1983 > var66.field2086 - var66.field2011) {
                            var66.field1983 = var66.field2086 - var66.field2011;
                        }
                        if (var66.field1983 < 0) {
                            var66.field1983 = 0;
                        }
                        class10.method52(var66, (byte) -89);
                        if (var66.field2094 == -1) {
                            class189.method1363(109, var66.field1968);
                        }
                        continue;
                    }
                    if (var607 == 1101) {
                        var2--;
                        var66.field2035 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        if (var66.field2094 == -1) {
                            class184.method1344(-124, var66.field1968);
                        }
                        continue;
                    }
                    if (var607 == 1102) {
                        var2--;
                        var66.field1979 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1103) {
                        var2--;
                        var66.field2110 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1104) {
                        var2--;
                        var66.field1960 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1105) {
                        var2--;
                        int var67 = field348[var2];
                        if (var66.field2130 != var67) {
                            var66.field2130 = var67;
                            class10.method52(var66, (byte) -89);
                        }
                        if (var66.field2094 == -1) {
                            class229.method1539(var66.field1968, -1316648191);
                        }
                        continue;
                    }
                    if (var607 == 1106) {
                        var2--;
                        var66.field2131 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1107) {
                        var2--;
                        var66.field1971 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1108) {
                        var66.field2116 = 1;
                        var2--;
                        var66.field2015 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        if (var66.field2094 == -1) {
                            class165.method1225(var66.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1109) {
                        var2 -= 6;
                        var66.field2036 = field348[var2];
                        var66.field1997 = field348[var2 + 1];
                        var66.field2030 = field348[var2 + 2];
                        var66.field2117 = field348[var2 + 3];
                        var66.field1954 = field348[var2 + 4];
                        var66.field2044 = field348[var2 + 5];
                        class10.method52(var66, (byte) -89);
                        if (var66.field2094 == -1) {
                            class89.method790(var66.field1968, -63);
                            class433.method2683(var66.field1968, (byte) 91);
                        }
                        continue;
                    }
                    if (var607 == 1110) {
                        var2--;
                        int var68 = field348[var2];
                        if (var66.field1963 != var68) {
                            var66.field1963 = var68;
                            var66.field2066 = 0;
                            var66.field2104 = 1;
                            var66.field2124 = 0;
                            class10.method52(var66, (byte) -89);
                        }
                        if (var66.field2094 == -1) {
                            class264.method1699(121, var66.field1968);
                        }
                        continue;
                    }
                    if (var607 == 1111) {
                        var2--;
                        var66.field1988 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1112) {
                        var3--;
                        String var69 = field360[var3];
                        if (!var69.equals(var66.field1976)) {
                            var66.field1976 = var69;
                            class10.method52(var66, (byte) -89);
                        }
                        if (var66.field2094 == -1) {
                            class301.method1931(true, var66.field1968);
                        }
                        continue;
                    }
                    if (var607 == 1113) {
                        var2--;
                        var66.field2007 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1114) {
                        var2 -= 3;
                        var66.field2083 = field348[var2];
                        var66.field1969 = field348[var2 + 1];
                        var66.field2113 = field348[var2 + 2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1115) {
                        var2--;
                        var66.field2078 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1116) {
                        var2--;
                        var66.field2001 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1117) {
                        var2--;
                        var66.field2076 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1118) {
                        var2--;
                        var66.field1953 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1119) {
                        var2--;
                        var66.field2043 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1120) {
                        var2 -= 2;
                        var66.field1998 = field348[var2];
                        var66.field2086 = field348[var2 + 1];
                        class10.method52(var66, (byte) -89);
                        if (var66.field2023 == 0) {
                            class441.method2738((byte) 71, var66, false);
                        }
                        continue;
                    }
                    if (var607 == 1121) {
                        var2 -= 2;
                        var66.field2079 = (short) field348[var2];
                        var66.field1961 = (short) field348[var2 + 1];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1122) {
                        var2--;
                        var66.field2052 = field348[var2] == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1123) {
                        var2--;
                        var66.field2044 = field348[var2];
                        class10.method52(var66, (byte) -89);
                        if (var66.field2094 == -1) {
                            class89.method790(var66.field1968, 110);
                        }
                        continue;
                    }
                    if (var607 == 1124) {
                        var2--;
                        int var70 = field348[var2];
                        var66.field2031 = var70 == 1;
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                    if (var607 == 1125) {
                        var2 -= 2;
                        var66.field1990 = field348[var2];
                        var66.field2122 = field348[var2 + 1];
                        class10.method52(var66, (byte) -89);
                        continue;
                    }
                } else if (!(var607 < 1200 || var607 >= 1300) || !(var607 < 2200 || var607 >= 2300)) {
                    class139 var71;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var71 = class10.method57(65535, field348[var2]);
                    } else {
                        var71 = var37 ? field346 : field355;
                    }
                    class10.method52(var71, (byte) -89);
                    if (var607 == 1200 || var607 == 1205 || var607 == 1208 || var607 == 1209 || var607 == 1212 || var607 == 1213) {
                        var2 -= 2;
                        int var72 = field348[var2];
                        int var73 = field348[var2 + 1];
                        if (var71.field2094 == -1) {
                            class224.method1525(var71.field1968, true);
                            class89.method790(var71.field1968, 111);
                            class433.method2683(var71.field1968, (byte) -12);
                        }
                        if (var72 == -1) {
                            var71.field2116 = 1;
                            var71.field2015 = -1;
                            var71.field2034 = -1;
                            continue;
                        }
                        var71.field2034 = var72;
                        var71.field2003 = var73;
                        if (var607 == 1208 || var607 == 1209) {
                            var71.field2013 = true;
                        } else {
                            var71.field2013 = false;
                        }
                        class452 var74 = class234.method1569(2142, var72);
                        var71.field2030 = var74.field6566;
                        var71.field2117 = var74.field6548;
                        var71.field1954 = var74.field6584;
                        var71.field2036 = var74.field6587;
                        var71.field1997 = var74.field6594;
                        var71.field2044 = var74.field6554;
                        if (var607 == 1205 || var607 == 1209) {
                            var71.field1962 = 0;
                        } else if (var607 == 1212 || var607 == 1213) {
                            var71.field1962 = 1;
                        } else {
                            var71.field1962 = 2;
                        }
                        if (var71.field2115 > 0) {
                            var71.field2044 = var71.field2044 * 32 / var71.field2115;
                        } else if (var71.field1956 > 0) {
                            var71.field2044 = var71.field2044 * 32 / var71.field1956;
                        }
                        continue;
                    }
                    if (var607 == 1201) {
                        var71.field2116 = 2;
                        var2--;
                        var71.field2015 = field348[var2];
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1202) {
                        var71.field2116 = 3;
                        var71.field2015 = -1;
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1203) {
                        var71.field2116 = 6;
                        var2--;
                        var71.field2015 = field348[var2];
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1204) {
                        var71.field2116 = 5;
                        var2--;
                        var71.field2015 = field348[var2];
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1206) {
                        var2 -= 4;
                        var71.field1977 = field348[var2];
                        var71.field2026 = field348[var2 + 1];
                        var71.field2106 = field348[var2 + 2];
                        var71.field2112 = field348[var2 + 3];
                        class10.method52(var71, (byte) -89);
                        continue;
                    }
                    if (var607 == 1207) {
                        var2 -= 2;
                        var71.field2054 = field348[var2];
                        var71.field2074 = field348[var2 + 1];
                        class10.method52(var71, (byte) -89);
                        continue;
                    }
                    if (var607 == 1210) {
                        var2 -= 4;
                        var71.field2015 = field348[var2];
                        var71.field2004 = field348[var2 + 1];
                        if (field348[var2 + 2] == 1) {
                            var71.field2116 = 9;
                        } else {
                            var71.field2116 = 8;
                        }
                        if (field348[var2 + 3] == 1) {
                            var71.field2013 = true;
                        } else {
                            var71.field2013 = false;
                        }
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                    if (var607 == 1211) {
                        var71.field2116 = 5;
                        var71.field2015 = 2047;
                        var71.field2004 = 0;
                        if (var71.field2094 == -1) {
                            class165.method1225(var71.field1968, (byte) 60);
                        }
                        continue;
                    }
                } else if ((var607 < 1300 || var607 >= 1400) && (var607 < 2300 || var607 >= 2400)) {
                    if (var607 >= 1400 && var607 < 1500 || var607 >= 2400 && var607 < 2500) {
                        class139 var81;
                        if (var607 >= 2000) {
                            var607 -= 1000;
                            var2--;
                            var81 = class10.method57(65535, field348[var2]);
                        } else {
                            var81 = var37 ? field346 : field355;
                        }
                        var3--;
                        String var82 = field360[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field348[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field348[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field360[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field348[var2]);
                            }
                        }
                        var2--;
                        int var87 = field348[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var607 == 1400) {
                            var81.field1981 = var85;
                        } else if (var607 == 1401) {
                            var81.field2041 = var85;
                        } else if (var607 == 1402) {
                            var81.field2081 = var85;
                        } else if (var607 == 1403) {
                            var81.field2006 = var85;
                        } else if (var607 == 1404) {
                            var81.field2038 = var85;
                        } else if (var607 == 1405) {
                            var81.field2084 = var85;
                        } else if (var607 == 1406) {
                            var81.field2012 = var85;
                        } else if (var607 == 1407) {
                            var81.field2107 = var85;
                            var81.field2028 = var83;
                        } else if (var607 == 1408) {
                            var81.field2040 = var85;
                        } else if (var607 == 1409) {
                            var81.field2073 = var85;
                        } else if (var607 == 1410) {
                            var81.field1967 = var85;
                        } else if (var607 == 1411) {
                            var81.field2021 = var85;
                        } else if (var607 == 1412) {
                            var81.field1992 = var85;
                        } else if (var607 == 1414) {
                            var81.field2088 = var85;
                            var81.field2019 = var83;
                        } else if (var607 == 1415) {
                            var81.field2121 = var85;
                            var81.field2046 = var83;
                        } else if (var607 == 1416) {
                            var81.field1994 = var85;
                        } else if (var607 == 1417) {
                            var81.field1999 = var85;
                        } else if (var607 == 1418) {
                            var81.field2118 = var85;
                        } else if (var607 == 1419) {
                            var81.field1975 = var85;
                        } else if (var607 == 1420) {
                            var81.field2082 = var85;
                        } else if (var607 == 1421) {
                            var81.field1996 = var85;
                        } else if (var607 == 1422) {
                            var81.field2077 = var85;
                        } else if (var607 == 1423) {
                            var81.field2085 = var85;
                        } else if (var607 == 1424) {
                            var81.field2032 = var85;
                        } else if (var607 == 1425) {
                            var81.field1970 = var85;
                        } else if (var607 == 1426) {
                            var81.field2039 = var85;
                        } else if (var607 == 1427) {
                            var81.field2133 = var85;
                        } else if (var607 == 1428) {
                            var81.field1973 = var85;
                            var81.field2097 = var83;
                        } else if (var607 == 1429) {
                            var81.field2087 = var85;
                            var81.field2134 = var83;
                        }
                        var81.field1955 = true;
                        continue;
                    }
                    if (var607 < 1600) {
                        class139 var88 = var37 ? field346 : field355;
                        if (var607 == 1500) {
                            field348[var2++] = var88.field2065;
                            continue;
                        }
                        if (var607 == 1501) {
                            field348[var2++] = var88.field2022;
                            continue;
                        }
                        if (var607 == 1502) {
                            field348[var2++] = var88.field2027;
                            continue;
                        }
                        if (var607 == 1503) {
                            field348[var2++] = var88.field2011;
                            continue;
                        }
                        if (var607 == 1504) {
                            field348[var2++] = var88.field2072 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 1505) {
                            field348[var2++] = var88.field2042;
                            continue;
                        }
                    } else if (var607 < 1700) {
                        class139 var89 = var37 ? field346 : field355;
                        if (var607 == 1600) {
                            field348[var2++] = var89.field2055;
                            continue;
                        }
                        if (var607 == 1601) {
                            field348[var2++] = var89.field1983;
                            continue;
                        }
                        if (var607 == 1602) {
                            field360[var3++] = var89.field1976;
                            continue;
                        }
                        if (var607 == 1603) {
                            field348[var2++] = var89.field1998;
                            continue;
                        }
                        if (var607 == 1604) {
                            field348[var2++] = var89.field2086;
                            continue;
                        }
                        if (var607 == 1605) {
                            field348[var2++] = var89.field2044;
                            continue;
                        }
                        if (var607 == 1606) {
                            field348[var2++] = var89.field2030;
                            continue;
                        }
                        if (var607 == 1607) {
                            field348[var2++] = var89.field1954;
                            continue;
                        }
                        if (var607 == 1608) {
                            field348[var2++] = var89.field2117;
                            continue;
                        }
                        if (var607 == 1609) {
                            field348[var2++] = var89.field2110;
                            continue;
                        }
                        if (var607 == 1610) {
                            field348[var2++] = var89.field2036;
                            continue;
                        }
                        if (var607 == 1611) {
                            field348[var2++] = var89.field1997;
                            continue;
                        }
                        if (var607 == 1612) {
                            field348[var2++] = var89.field2130;
                            continue;
                        }
                    } else if (var607 < 1800) {
                        class139 var90 = var37 ? field346 : field355;
                        if (var607 == 1700) {
                            field348[var2++] = var90.field2034;
                            continue;
                        }
                        if (var607 == 1701) {
                            if (var90.field2034 == -1) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var90.field2003;
                            }
                            continue;
                        }
                        if (var607 == 1702) {
                            field348[var2++] = var90.field2094;
                            continue;
                        }
                    } else if (var607 < 1900) {
                        class139 var91 = var37 ? field346 : field355;
                        if (var607 == 1800) {
                            field348[var2++] = client.method1648(var91).method987(-13163);
                            continue;
                        }
                        if (var607 == 1801) {
                            var2--;
                            int var92 = field348[var2];
                            int var608 = var92 - 1;
                            if (var91.field1995 != null && var608 < var91.field1995.length && var91.field1995[var608] != null) {
                                field360[var3++] = var91.field1995[var608];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 1802) {
                            if (var91.field2096 == null) {
                                field360[var3++] = "";
                            } else {
                                field360[var3++] = var91.field2096;
                            }
                            continue;
                        }
                    } else if (var607 < 2600) {
                        var2--;
                        class139 var93 = class10.method57(65535, field348[var2]);
                        if (var607 == 2500) {
                            field348[var2++] = var93.field2065;
                            continue;
                        }
                        if (var607 == 2501) {
                            field348[var2++] = var93.field2022;
                            continue;
                        }
                        if (var607 == 2502) {
                            field348[var2++] = var93.field2027;
                            continue;
                        }
                        if (var607 == 2503) {
                            field348[var2++] = var93.field2011;
                            continue;
                        }
                        if (var607 == 2504) {
                            field348[var2++] = var93.field2072 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 2505) {
                            field348[var2++] = var93.field2042;
                            continue;
                        }
                    } else if (var607 < 2700) {
                        var2--;
                        class139 var94 = class10.method57(65535, field348[var2]);
                        if (var607 == 2600) {
                            field348[var2++] = var94.field2055;
                            continue;
                        }
                        if (var607 == 2601) {
                            field348[var2++] = var94.field1983;
                            continue;
                        }
                        if (var607 == 2602) {
                            field360[var3++] = var94.field1976;
                            continue;
                        }
                        if (var607 == 2603) {
                            field348[var2++] = var94.field1998;
                            continue;
                        }
                        if (var607 == 2604) {
                            field348[var2++] = var94.field2086;
                            continue;
                        }
                        if (var607 == 2605) {
                            field348[var2++] = var94.field2044;
                            continue;
                        }
                        if (var607 == 2606) {
                            field348[var2++] = var94.field2030;
                            continue;
                        }
                        if (var607 == 2607) {
                            field348[var2++] = var94.field1954;
                            continue;
                        }
                        if (var607 == 2608) {
                            field348[var2++] = var94.field2117;
                            continue;
                        }
                        if (var607 == 2609) {
                            field348[var2++] = var94.field2110;
                            continue;
                        }
                        if (var607 == 2610) {
                            field348[var2++] = var94.field2036;
                            continue;
                        }
                        if (var607 == 2611) {
                            field348[var2++] = var94.field1997;
                            continue;
                        }
                        if (var607 == 2612) {
                            field348[var2++] = var94.field2130;
                            continue;
                        }
                    } else if (var607 < 2800) {
                        if (var607 == 2700) {
                            var2--;
                            class139 var95 = class10.method57(65535, field348[var2]);
                            field348[var2++] = var95.field2034;
                            continue;
                        }
                        if (var607 == 2701) {
                            var2--;
                            class139 var96 = class10.method57(65535, field348[var2]);
                            if (var96.field2034 == -1) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var96.field2003;
                            }
                            continue;
                        }
                        if (var607 == 2702) {
                            var2--;
                            int var97 = field348[var2];
                            class64 var98 = (class64) class204.field2865.method614(-84, (long) var97);
                            if (var98 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = 1;
                            }
                            continue;
                        }
                        if (var607 == 2703) {
                            var2--;
                            class139 var99 = class10.method57(65535, field348[var2]);
                            if (var99.field2045 == null) {
                                field348[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field2045.length;
                            for (int var101 = 0; var101 < var99.field2045.length; var101++) {
                                if (var99.field2045[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field348[var2++] = var100;
                            continue;
                        }
                        if (var607 == 2704 || var607 == 2705) {
                            var2 -= 2;
                            int var102 = field348[var2];
                            int var103 = field348[var2 + 1];
                            class64 var104 = (class64) class204.field2865.method614(-99, (long) var102);
                            if (var104 != null && var104.field976 == var103) {
                                field348[var2++] = 1;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                    } else if (var607 < 2900) {
                        var2--;
                        class139 var105 = class10.method57(65535, field348[var2]);
                        if (var607 == 2800) {
                            field348[var2++] = client.method1648(var105).method987(-13163);
                            continue;
                        }
                        if (var607 == 2801) {
                            var2--;
                            int var106 = field348[var2];
                            int var609 = var106 - 1;
                            if (var105.field1995 != null && var609 < var105.field1995.length && var105.field1995[var609] != null) {
                                field360[var3++] = var105.field1995[var609];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 2802) {
                            if (var105.field2096 == null) {
                                field360[var3++] = "";
                            } else {
                                field360[var3++] = var105.field2096;
                            }
                            continue;
                        }
                    } else if (var607 < 3200) {
                        if (var607 == 3100) {
                            var3--;
                            String var107 = field360[var3];
                            class289.method1838(-754415328, var107);
                            continue;
                        }
                        if (var607 == 3101) {
                            var2 -= 2;
                            class165.method1231(field348[var2 + 1], field348[var2], 122, class95.field1379);
                            continue;
                        }
                        if (var607 == 3103) {
                            class173.method1289(true, 11337);
                            continue;
                        }
                        if (var607 == 3104) {
                            var3--;
                            String var108 = field360[var3];
                            int var109 = 0;
                            if (class318.method2023(true, var108)) {
                                var109 = class362.method2277(var108, -76);
                            }
                            field343++;
                            class355.field4828.method1801(207, (byte) -106);
                            class355.field4828.method1854(var109, true);
                            continue;
                        }
                        if (var607 == 3105) {
                            var3--;
                            String var110 = field360[var3];
                            field357++;
                            class355.field4828.method1801(143, (byte) -92);
                            class355.field4828.method1824(104, var110.length() + 1);
                            class355.field4828.method1827(0, var110);
                            continue;
                        }
                        if (var607 == 3106) {
                            var3--;
                            String var111 = field360[var3];
                            field365++;
                            class355.field4828.method1801(95, (byte) -100);
                            class355.field4828.method1824(70, var111.length() + 1);
                            class355.field4828.method1827(0, var111);
                            continue;
                        }
                        if (var607 == 3107) {
                            var2--;
                            int var112 = field348[var2];
                            var3--;
                            String var113 = field360[var3];
                            class124.method967(0, var112, var113);
                            continue;
                        }
                        if (var607 == 3108) {
                            var2 -= 3;
                            int var114 = field348[var2];
                            int var115 = field348[var2 + 1];
                            int var116 = field348[var2 + 2];
                            class139 var117 = class10.method57(65535, var116);
                            class228.method1536(var117, var114, 0, var115);
                            continue;
                        }
                        if (var607 == 3109) {
                            var2 -= 2;
                            int var118 = field348[var2];
                            int var119 = field348[var2 + 1];
                            class139 var120 = var37 ? field346 : field355;
                            class228.method1536(var120, var118, 0, var119);
                            continue;
                        }
                        if (var607 == 3110) {
                            var2--;
                            int var121 = field348[var2];
                            field358++;
                            class355.field4828.method1801(31, (byte) -80);
                            class355.field4828.method1877(true, var121);
                            continue;
                        }
                        if (var607 == 3111) {
                            var2 -= 2;
                            int var122 = field348[var2];
                            int var123 = field348[var2 + 1];
                            class64 var124 = (class64) class204.field2865.method614(-111, (long) var122);
                            if (var124 != null) {
                                class316.method2013(true, var124.field976 != var123, true, var124);
                            }
                            class129.method1004(true, 3, var122, -56, var123);
                            continue;
                        }
                        if (var607 == 3112) {
                            var2--;
                            int var125 = field348[var2];
                            class64 var126 = (class64) class204.field2865.method614(-94, (long) var125);
                            if (var126 != null && var126.field973 == 3) {
                                class316.method2013(true, true, true, var126);
                            }
                            continue;
                        }
                    } else if (var607 < 3300) {
                        if (var607 == 3200) {
                            var2 -= 3;
                            class280.method1778(field348[var2 + 1], 255, field348[var2 + 2], true, field348[var2]);
                            continue;
                        }
                        if (var607 == 3201) {
                            var2--;
                            class328.method2082(field348[var2], -11028, 255);
                            continue;
                        }
                        if (var607 == 3202) {
                            var2 -= 2;
                            class295.method1899(field348[var2 + 1], -9, 255, field348[var2]);
                            continue;
                        }
                    } else if (var607 < 3400) {
                        if (var607 == 3300) {
                            field348[var2++] = class414.field5793;
                            continue;
                        }
                        if (var607 == 3301) {
                            var2 -= 2;
                            int var127 = field348[var2];
                            int var128 = field348[var2 + 1];
                            field348[var2++] = class384.method2385(var128, -44, var127);
                            continue;
                        }
                        if (var607 == 3302) {
                            var2 -= 2;
                            int var129 = field348[var2];
                            int var130 = field348[var2 + 1];
                            field348[var2++] = class82.method746(-123, var130, var129);
                            continue;
                        }
                        if (var607 == 3303) {
                            var2 -= 2;
                            int var131 = field348[var2];
                            int var132 = field348[var2 + 1];
                            field348[var2++] = class55.method521((byte) 37, var132, var131);
                            continue;
                        }
                        if (var607 == 3304) {
                            var2--;
                            int var133 = field348[var2];
                            field348[var2++] = class407.method2504(-9372, var133).field886;
                            continue;
                        }
                        if (var607 == 3305) {
                            var2--;
                            int var134 = field348[var2];
                            field348[var2++] = class78.field1163[var134];
                            continue;
                        }
                        if (var607 == 3306) {
                            var2--;
                            int var135 = field348[var2];
                            field348[var2++] = class426.field6030[var135];
                            continue;
                        }
                        if (var607 == 3307) {
                            var2--;
                            int var136 = field348[var2];
                            field348[var2++] = class414.field5786[var136];
                            continue;
                        }
                        if (var607 == 3308) {
                            int var137 = class69.field1046;
                            int var138 = (class95.field1379.field3176 >> 7) + class283.field3794;
                            int var139 = (class95.field1379.field3167 >> 7) + class296.field3988;
                            field348[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var607 == 3309) {
                            var2--;
                            int var140 = field348[var2];
                            field348[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3310) {
                            var2--;
                            int var141 = field348[var2];
                            field348[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var607 == 3311) {
                            var2--;
                            int var142 = field348[var2];
                            field348[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3312) {
                            field348[var2++] = class78.field1178 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3313) {
                            var2 -= 2;
                            int var143 = field348[var2] + 32768;
                            int var144 = field348[var2 + 1];
                            field348[var2++] = class384.method2385(var144, -108, var143);
                            continue;
                        }
                        if (var607 == 3314) {
                            var2 -= 2;
                            int var145 = field348[var2] + 32768;
                            int var146 = field348[var2 + 1];
                            field348[var2++] = class82.method746(50, var146, var145);
                            continue;
                        }
                        if (var607 == 3315) {
                            var2 -= 2;
                            int var147 = field348[var2] + 32768;
                            int var148 = field348[var2 + 1];
                            field348[var2++] = class55.method521((byte) 37, var148, var147);
                            continue;
                        }
                        if (var607 == 3316) {
                            if (class447.field6482 >= 2) {
                                field348[var2++] = class447.field6482;
                            } else {
                                field348[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 3317) {
                            field348[var2++] = class322.field4364;
                            continue;
                        }
                        if (var607 == 3318) {
                            field348[var2++] = class227.field3144;
                            continue;
                        }
                        if (var607 == 3321) {
                            field348[var2++] = class64.field978;
                            continue;
                        }
                        if (var607 == 3322) {
                            field348[var2++] = class210.field2928;
                            continue;
                        }
                        if (var607 == 3323) {
                            if (class174.field2578 >= 5 && class174.field2578 <= 9) {
                                field348[var2++] = 1;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3324) {
                            if (class174.field2578 >= 5 && class174.field2578 <= 9) {
                                field348[var2++] = class174.field2578;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3325) {
                            field348[var2++] = class176.field2607 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3326) {
                            field348[var2++] = class95.field1379.field4599;
                            continue;
                        }
                        if (var607 == 3327) {
                            field348[var2++] = class95.field1379.field4608.field436 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3328) {
                            field348[var2++] = class288.field3859 && !class128.field1807 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3329) {
                            field348[var2++] = class236.field3282 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3330) {
                            var2--;
                            int var149 = field348[var2];
                            field348[var2++] = class375.method2344(var149, -24721);
                            continue;
                        }
                        if (var607 == 3331) {
                            var2 -= 2;
                            int var150 = field348[var2];
                            int var151 = field348[var2 + 1];
                            field348[var2++] = class377.method2354(var151, false, var150, (byte) 114);
                            continue;
                        }
                        if (var607 == 3332) {
                            var2 -= 2;
                            int var152 = field348[var2];
                            int var153 = field348[var2 + 1];
                            field348[var2++] = class377.method2354(var153, true, var152, (byte) 109);
                            continue;
                        }
                        if (var607 == 3333) {
                            field348[var2++] = class312.field4224;
                            continue;
                        }
                        if (var607 == 3335) {
                            field348[var2++] = class89.field1320;
                            continue;
                        }
                        if (var607 == 3336) {
                            var2 -= 4;
                            int var154 = field348[var2];
                            int var155 = field348[var2 + 1];
                            int var156 = field348[var2 + 2];
                            int var157 = field348[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field348[var2++] = var160;
                            continue;
                        }
                        if (var607 == 3337) {
                            field348[var2++] = class346.field4689;
                            continue;
                        }
                        if (var607 == 3338) {
                            field348[var2++] = class400.method2452(true);
                            continue;
                        }
                    } else if (var607 < 3500) {
                        if (var607 == 3400) {
                            var2 -= 2;
                            int var161 = field348[var2];
                            int var162 = field348[var2 + 1];
                            class169 var163 = class321.method2029(var161, 42);
                            field360[var3++] = var163.method1267(false, var162);
                            continue;
                        }
                        if (var607 == 3408) {
                            var2 -= 4;
                            int var164 = field348[var2];
                            int var165 = field348[var2 + 1];
                            int var166 = field348[var2 + 2];
                            int var167 = field348[var2 + 3];
                            class169 var168 = class321.method2029(var166, 101);
                            if (var168.field2492 == var164 && var168.field2497 == var165) {
                                if (var165 == 115) {
                                    field360[var3++] = var168.method1267(false, var167);
                                } else {
                                    field348[var2++] = var168.method1269(-6, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var607 == 3409) {
                            var2 -= 3;
                            int var169 = field348[var2];
                            int var170 = field348[var2 + 1];
                            int var171 = field348[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class169 var172 = class321.method2029(var170, 34);
                            if (var172.field2497 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field348[var2++] = var172.method1272((byte) 53, var171) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3410) {
                            var2--;
                            int var173 = field348[var2];
                            var3--;
                            String var174 = field360[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class169 var175 = class321.method2029(var173, 59);
                            if (var175.field2497 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field348[var2++] = var175.method1265(-62, var174) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3411) {
                            var2--;
                            int var176 = field348[var2];
                            class169 var177 = class321.method2029(var176, -109);
                            field348[var2++] = var177.field2504.method610(-2036);
                            continue;
                        }
                    } else if (var607 < 3700) {
                        if (var607 == 3600) {
                            if (class49.field830 == 0) {
                                field348[var2++] = -2;
                            } else if (class49.field830 == 1) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = class123.field1724;
                            }
                            continue;
                        }
                        if (var607 == 3601) {
                            var2--;
                            int var178 = field348[var2];
                            if (class49.field830 == 2 && var178 < class123.field1724) {
                                field360[var3++] = class87.field1294[var178];
                                if (class186.field2695[var178] == null) {
                                    field360[var3++] = "";
                                } else {
                                    field360[var3++] = class186.field2695[var178];
                                }
                                continue;
                            }
                            field360[var3++] = "";
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3602) {
                            var2--;
                            int var179 = field348[var2];
                            if (class49.field830 == 2 && var179 < class123.field1724) {
                                field348[var2++] = class127.field1795[var179];
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3603) {
                            var2--;
                            int var180 = field348[var2];
                            if (class49.field830 == 2 && var180 < class123.field1724) {
                                field348[var2++] = class107.field1574[var180];
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3604) {
                            var3--;
                            String var181 = field360[var3];
                            var2--;
                            int var182 = field348[var2];
                            class430.method2677(var182, var181, true);
                            continue;
                        }
                        if (var607 == 3605) {
                            var3--;
                            String var183 = field360[var3];
                            class63.method558(var183, 30);
                            continue;
                        }
                        if (var607 == 3606) {
                            var3--;
                            String var184 = field360[var3];
                            class177.method1322(-1, var184);
                            continue;
                        }
                        if (var607 == 3607) {
                            var3--;
                            String var185 = field360[var3];
                            class36.method368(var185, (byte) -108, false);
                            continue;
                        }
                        if (var607 == 3608) {
                            var3--;
                            String var186 = field360[var3];
                            class95.method812(var186, 126);
                            continue;
                        }
                        if (var607 == 3609) {
                            var3--;
                            String var187 = field360[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field348[var2++] = class101.method864(-13619, var187) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3610) {
                            var2--;
                            int var188 = field348[var2];
                            if (class49.field830 == 2 && var188 < class123.field1724) {
                                field360[var3++] = class172.field2523[var188];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3611) {
                            if (class132.field1876 == null) {
                                field360[var3++] = "";
                            } else {
                                field360[var3++] = class267.method1721(class132.field1876, (byte) -80);
                            }
                            continue;
                        }
                        if (var607 == 3612) {
                            if (class132.field1876 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = class229.field3190;
                            }
                            continue;
                        }
                        if (var607 == 3613) {
                            var2--;
                            int var189 = field348[var2];
                            if (class132.field1876 != null && var189 < class229.field3190) {
                                field360[var3++] = class264.field3555[var189].field3039;
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3614) {
                            var2--;
                            int var190 = field348[var2];
                            if (class132.field1876 != null && var190 < class229.field3190) {
                                field348[var2++] = class264.field3555[var190].field3036;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3615) {
                            var2--;
                            int var191 = field348[var2];
                            if (class132.field1876 != null && var191 < class229.field3190) {
                                field348[var2++] = class264.field3555[var191].field3045;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3616) {
                            field348[var2++] = class326.field4436;
                            continue;
                        }
                        if (var607 == 3617) {
                            var3--;
                            String var192 = field360[var3];
                            class446.method2762(99, var192);
                            continue;
                        }
                        if (var607 == 3618) {
                            field348[var2++] = class284.field3800;
                            continue;
                        }
                        if (var607 == 3619) {
                            var3--;
                            String var193 = field360[var3];
                            class78.method671(var193, (byte) 103);
                            continue;
                        }
                        if (var607 == 3620) {
                            class47.method480(-123);
                            continue;
                        }
                        if (var607 == 3621) {
                            if (class49.field830 == 0) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = class275.field3702;
                            }
                            continue;
                        }
                        if (var607 == 3622) {
                            var2--;
                            int var194 = field348[var2];
                            if (class49.field830 != 0 && var194 < class275.field3702) {
                                field360[var3++] = class268.field3607[var194];
                                if (class147.field2259[var194] == null) {
                                    field360[var3++] = "";
                                } else {
                                    field360[var3++] = class147.field2259[var194];
                                }
                                continue;
                            }
                            field360[var3++] = "";
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3623) {
                            var3--;
                            String var195 = field360[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field348[var2++] = class443.method2750(var195, (byte) 50) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3624) {
                            var2--;
                            int var196 = field348[var2];
                            if (class264.field3555 != null && var196 < class229.field3190 && class264.field3555[var196].field3037.equalsIgnoreCase(class95.field1379.field4577)) {
                                field348[var2++] = 1;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3625) {
                            if (class431.field6129 == null) {
                                field360[var3++] = "";
                            } else {
                                field360[var3++] = class431.field6129;
                            }
                            continue;
                        }
                        if (var607 == 3626) {
                            var2--;
                            int var197 = field348[var2];
                            if (class132.field1876 != null && var197 < class229.field3190) {
                                field360[var3++] = class264.field3555[var197].field3040;
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3627) {
                            var2--;
                            int var198 = field348[var2];
                            if (class49.field830 == 2 && var198 >= 0 && var198 < class123.field1724) {
                                field348[var2++] = class314.field4246[var198] ? 1 : 0;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3628) {
                            var3--;
                            String var199 = field360[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field348[var2++] = class334.method2116(122, var199);
                            continue;
                        }
                        if (var607 == 3629) {
                            field348[var2++] = class363.field5020;
                            continue;
                        }
                        if (var607 == 3630) {
                            var3--;
                            String var200 = field360[var3];
                            class36.method368(var200, (byte) -97, true);
                            continue;
                        }
                        if (var607 == 3631) {
                            var2--;
                            int var201 = field348[var2];
                            field348[var2++] = class305.field4131[var201] ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3632) {
                            var2--;
                            int var202 = field348[var2];
                            if (class132.field1876 != null && var202 < class229.field3190) {
                                field360[var3++] = class264.field3555[var202].field3037;
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 3633) {
                            var2--;
                            int var203 = field348[var2];
                            if (class49.field830 != 0 && var203 < class275.field3702) {
                                field360[var3++] = class101.field1494[var203];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                    } else if (var607 < 4000) {
                        if (var607 == 3903) {
                            var2--;
                            int var204 = field348[var2];
                            field348[var2++] = class393.field5507[var204].method792((byte) -90);
                            continue;
                        }
                        if (var607 == 3904) {
                            var2--;
                            int var205 = field348[var2];
                            field348[var2++] = class393.field5507[var205].field1310;
                            continue;
                        }
                        if (var607 == 3905) {
                            var2--;
                            int var206 = field348[var2];
                            field348[var2++] = class393.field5507[var206].field1326;
                            continue;
                        }
                        if (var607 == 3906) {
                            var2--;
                            int var207 = field348[var2];
                            field348[var2++] = class393.field5507[var207].field1319;
                            continue;
                        }
                        if (var607 == 3907) {
                            var2--;
                            int var208 = field348[var2];
                            field348[var2++] = class393.field5507[var208].field1323;
                            continue;
                        }
                        if (var607 == 3908) {
                            var2--;
                            int var209 = field348[var2];
                            field348[var2++] = class393.field5507[var209].field1318;
                            continue;
                        }
                        if (var607 == 3910) {
                            var2--;
                            int var210 = field348[var2];
                            int var211 = class393.field5507[var210].method794(17057);
                            field348[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3911) {
                            var2--;
                            int var212 = field348[var2];
                            int var213 = class393.field5507[var212].method794(17057);
                            field348[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3912) {
                            var2--;
                            int var214 = field348[var2];
                            int var215 = class393.field5507[var214].method794(17057);
                            field348[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3913) {
                            var2--;
                            int var216 = field348[var2];
                            int var217 = class393.field5507[var216].method794(17057);
                            field348[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 4100) {
                        if (var607 == 4000) {
                            var2 -= 2;
                            int var218 = field348[var2];
                            int var219 = field348[var2 + 1];
                            field348[var2++] = var218 + var219;
                            continue;
                        }
                        if (var607 == 4001) {
                            var2 -= 2;
                            int var220 = field348[var2];
                            int var221 = field348[var2 + 1];
                            field348[var2++] = var220 - var221;
                            continue;
                        }
                        if (var607 == 4002) {
                            var2 -= 2;
                            int var222 = field348[var2];
                            int var223 = field348[var2 + 1];
                            field348[var2++] = var222 * var223;
                            continue;
                        }
                        if (var607 == 4003) {
                            var2 -= 2;
                            int var224 = field348[var2];
                            int var225 = field348[var2 + 1];
                            field348[var2++] = var224 / var225;
                            continue;
                        }
                        if (var607 == 4004) {
                            var2--;
                            int var226 = field348[var2];
                            field348[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var607 == 4005) {
                            var2--;
                            int var227 = field348[var2];
                            field348[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var607 == 4006) {
                            var2 -= 5;
                            int var228 = field348[var2];
                            int var229 = field348[var2 + 1];
                            int var230 = field348[var2 + 2];
                            int var231 = field348[var2 + 3];
                            int var232 = field348[var2 + 4];
                            field348[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var607 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field348[var2];
                            long var235 = (long) field348[var2 + 1];
                            field348[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var607 == 4008) {
                            var2 -= 2;
                            int var237 = field348[var2];
                            int var238 = field348[var2 + 1];
                            field348[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var607 == 4009) {
                            var2 -= 2;
                            int var239 = field348[var2];
                            int var240 = field348[var2 + 1];
                            field348[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var607 == 4010) {
                            var2 -= 2;
                            int var241 = field348[var2];
                            int var242 = field348[var2 + 1];
                            field348[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 4011) {
                            var2 -= 2;
                            int var243 = field348[var2];
                            int var244 = field348[var2 + 1];
                            field348[var2++] = var243 % var244;
                            continue;
                        }
                        if (var607 == 4012) {
                            var2 -= 2;
                            int var245 = field348[var2];
                            int var246 = field348[var2 + 1];
                            if (var245 == 0) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var607 == 4013) {
                            var2 -= 2;
                            int var247 = field348[var2];
                            int var248 = field348[var2 + 1];
                            if (var247 == 0) {
                                field348[var2++] = 0;
                            } else if (var248 == 0) {
                                field348[var2++] = Integer.MAX_VALUE;
                            } else {
                                field348[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var607 == 4014) {
                            var2 -= 2;
                            int var249 = field348[var2];
                            int var250 = field348[var2 + 1];
                            field348[var2++] = var249 & var250;
                            continue;
                        }
                        if (var607 == 4015) {
                            var2 -= 2;
                            int var251 = field348[var2];
                            int var252 = field348[var2 + 1];
                            field348[var2++] = var251 | var252;
                            continue;
                        }
                        if (var607 == 4016) {
                            var2 -= 2;
                            int var253 = field348[var2];
                            int var254 = field348[var2 + 1];
                            field348[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var607 == 4017) {
                            var2 -= 2;
                            int var255 = field348[var2];
                            int var256 = field348[var2 + 1];
                            field348[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var607 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field348[var2];
                            long var259 = (long) field348[var2 + 1];
                            long var261 = (long) field348[var2 + 2];
                            field348[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var607 < 4200) {
                        if (var607 == 4100) {
                            var3--;
                            String var263 = field360[var3];
                            var2--;
                            int var264 = field348[var2];
                            field360[var3++] = var263 + var264;
                            continue;
                        }
                        if (var607 == 4101) {
                            var3 -= 2;
                            String var265 = field360[var3];
                            String var266 = field360[var3 + 1];
                            field360[var3++] = var265 + var266;
                            continue;
                        }
                        if (var607 == 4102) {
                            var3--;
                            String var267 = field360[var3];
                            var2--;
                            int var268 = field348[var2];
                            field360[var3++] = var267 + class272.method1742(var268, (byte) -6, true);
                            continue;
                        }
                        if (var607 == 4103) {
                            var3--;
                            String var269 = field360[var3];
                            field360[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var607 == 4104) {
                            var2--;
                            int var270 = field348[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field349.setTime(new Date(var271));
                            int var273 = field349.get(5);
                            int var274 = field349.get(2);
                            int var275 = field349.get(1);
                            field360[var3++] = var273 + "-" + field366[var274] + "-" + var275;
                            continue;
                        }
                        if (var607 == 4105) {
                            var3 -= 2;
                            String var276 = field360[var3];
                            String var277 = field360[var3 + 1];
                            if (class95.field1379.field4608 != null && class95.field1379.field4608.field436) {
                                field360[var3++] = var277;
                                continue;
                            }
                            field360[var3++] = var276;
                            continue;
                        }
                        if (var607 == 4106) {
                            var2--;
                            int var278 = field348[var2];
                            field360[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var607 == 4107) {
                            var3 -= 2;
                            field348[var2++] = class22.method286((byte) -21, field360[var3 + 1], class89.field1320, field360[var3]);
                            continue;
                        }
                        if (var607 == 4108) {
                            var3--;
                            String var279 = field360[var3];
                            var2 -= 2;
                            int var280 = field348[var2];
                            int var281 = field348[var2 + 1];
                            class323 var282 = class77.method667(0, (byte) 112, class49.field829, var281);
                            field348[var2++] = var282.method2050(var279, (byte) -85, var280, class233.field3208);
                            continue;
                        }
                        if (var607 == 4109) {
                            var3--;
                            String var283 = field360[var3];
                            var2 -= 2;
                            int var284 = field348[var2];
                            int var285 = field348[var2 + 1];
                            class323 var286 = class77.method667(0, (byte) -46, class49.field829, var285);
                            field348[var2++] = var286.method2055(var283, (byte) -97, class233.field3208, var284);
                            continue;
                        }
                        if (var607 == 4110) {
                            var3 -= 2;
                            String var287 = field360[var3];
                            String var288 = field360[var3 + 1];
                            var2--;
                            if (field348[var2] == 1) {
                                field360[var3++] = var287;
                            } else {
                                field360[var3++] = var288;
                            }
                            continue;
                        }
                        if (var607 == 4111) {
                            var3--;
                            String var289 = field360[var3];
                            field360[var3++] = class289.method1860(var289, -4107);
                            continue;
                        }
                        if (var607 == 4112) {
                            var3--;
                            String var290 = field360[var3];
                            var2--;
                            int var291 = field348[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field360[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var607 == 4113) {
                            var2--;
                            int var292 = field348[var2];
                            field348[var2++] = class183.method1340(-30253, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4114) {
                            var2--;
                            int var293 = field348[var2];
                            field348[var2++] = class421.method2597(4963, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4115) {
                            var2--;
                            int var294 = field348[var2];
                            field348[var2++] = class301.method1929((char) var294, true) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4116) {
                            var2--;
                            int var295 = field348[var2];
                            field348[var2++] = class57.method531((char) var295, (byte) 8) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4117) {
                            var3--;
                            String var296 = field360[var3];
                            if (var296 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var607 == 4118) {
                            var3--;
                            String var297 = field360[var3];
                            var2 -= 2;
                            int var298 = field348[var2];
                            int var299 = field348[var2 + 1];
                            field360[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var607 == 4119) {
                            var3--;
                            String var300 = field360[var3];
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
                            field360[var3++] = var301.toString();
                            continue;
                        }
                        if (var607 == 4120) {
                            var3--;
                            String var305 = field360[var3];
                            var2 -= 2;
                            int var306 = field348[var2];
                            int var307 = field348[var2 + 1];
                            field348[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var607 == 4121) {
                            var3 -= 2;
                            String var308 = field360[var3];
                            String var309 = field360[var3 + 1];
                            var2--;
                            int var310 = field348[var2];
                            field348[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var607 == 4122) {
                            var2--;
                            int var311 = field348[var2];
                            field348[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var607 == 4123) {
                            var2--;
                            int var312 = field348[var2];
                            field348[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var607 == 4124) {
                            var2--;
                            boolean var313 = field348[var2] != 0;
                            var2--;
                            int var314 = field348[var2];
                            field360[var3++] = class244.method1600(46, 0, var313, (long) var314, class89.field1320);
                            continue;
                        }
                    } else if (var607 < 4300) {
                        if (var607 == 4200) {
                            var2--;
                            int var315 = field348[var2];
                            field360[var3++] = class234.method1569(2142, var315).field6595;
                            continue;
                        }
                        if (var607 == 4201) {
                            var2 -= 2;
                            int var316 = field348[var2];
                            int var317 = field348[var2 + 1];
                            class452 var318 = class234.method1569(2142, var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field6545[var317 - 1] != null) {
                                field360[var3++] = var318.field6545[var317 - 1];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 4202) {
                            var2 -= 2;
                            int var319 = field348[var2];
                            int var320 = field348[var2 + 1];
                            class452 var321 = class234.method1569(2142, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field6534[var320 - 1] != null) {
                                field360[var3++] = var321.field6534[var320 - 1];
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 4203) {
                            var2--;
                            int var322 = field348[var2];
                            field348[var2++] = class234.method1569(2142, var322).field6589;
                            continue;
                        }
                        if (var607 == 4204) {
                            var2--;
                            int var323 = field348[var2];
                            field348[var2++] = class234.method1569(2142, var323).field6582 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4205) {
                            var2--;
                            int var324 = field348[var2];
                            class452 var325 = class234.method1569(2142, var324);
                            if (var325.field6529 == -1 && var325.field6581 >= 0) {
                                field348[var2++] = var325.field6581;
                                continue;
                            }
                            field348[var2++] = var324;
                            continue;
                        }
                        if (var607 == 4206) {
                            var2--;
                            int var326 = field348[var2];
                            class452 var327 = class234.method1569(2142, var326);
                            if (var327.field6529 >= 0 && var327.field6581 >= 0) {
                                field348[var2++] = var327.field6581;
                                continue;
                            }
                            field348[var2++] = var326;
                            continue;
                        }
                        if (var607 == 4207) {
                            var2--;
                            int var328 = field348[var2];
                            field348[var2++] = class234.method1569(2142, var328).field6569 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4208) {
                            var2 -= 2;
                            int var329 = field348[var2];
                            int var330 = field348[var2 + 1];
                            class287 var331 = class345.method2186(var330, (byte) 102);
                            if (var331.method1814(80)) {
                                field360[var3++] = class234.method1569(2142, var329).method2821(var331.field3842, -17456, var330);
                            } else {
                                field348[var2++] = class234.method1569(2142, var329).method2815((byte) -127, var330, var331.field3845);
                            }
                            continue;
                        }
                        if (var607 == 4210) {
                            var3--;
                            String var332 = field360[var3];
                            var2--;
                            int var333 = field348[var2];
                            class365.method2290(var332, var333 == 1, -80);
                            field348[var2++] = class97.field1406;
                            continue;
                        }
                        if (var607 == 4211) {
                            if (class358.field4858 != null && class221.field3052 < class97.field1406) {
                                field348[var2++] = class358.field4858[class221.field3052++] & 0xFFFF;
                                continue;
                            }
                            field348[var2++] = -1;
                            continue;
                        }
                        if (var607 == 4212) {
                            class221.field3052 = 0;
                            continue;
                        }
                    } else if (var607 < 4400) {
                        if (var607 == 4300) {
                            var2 -= 2;
                            int var334 = field348[var2];
                            int var335 = field348[var2 + 1];
                            class287 var336 = class345.method2186(var335, (byte) 77);
                            if (var336.method1814(105)) {
                                field360[var3++] = class330.method2102(var334, -115).method82(var335, var336.field3842, 5395);
                            } else {
                                field348[var2++] = class330.method2102(var334, -99).method79(77, var335, var336.field3845);
                            }
                            continue;
                        }
                    } else if (var607 < 4500) {
                        if (var607 == 4400) {
                            var2 -= 2;
                            int var337 = field348[var2];
                            int var338 = field348[var2 + 1];
                            class287 var339 = class345.method2186(var338, (byte) 77);
                            if (var339.method1814(69)) {
                                field360[var3++] = class10.method53(var337, true).method2328(var338, var339.field3842, (byte) 74);
                            } else {
                                field348[var2++] = class10.method53(var337, true).method2321(var339.field3845, var338, (byte) 92);
                            }
                            continue;
                        }
                    } else if (var607 < 4600) {
                        if (var607 == 4500) {
                            var2 -= 2;
                            int var340 = field348[var2];
                            int var341 = field348[var2 + 1];
                            class287 var342 = class345.method2186(var341, (byte) 106);
                            if (var342.method1814(55)) {
                                field360[var3++] = class263.method1693(var340, 26).method1186(var342.field3842, var341, -31828);
                            } else {
                                field348[var2++] = class263.method1693(var340, 26).method1191(var342.field3845, 82, var341);
                            }
                            continue;
                        }
                    } else if (var607 < 4700) {
                        if (var607 == 4600) {
                            var2--;
                            int var343 = field348[var2];
                            field348[var2++] = class265.method1706(false, var343).field6173;
                            continue;
                        }
                    } else if (var607 < 5100) {
                        if (var607 == 5000) {
                            field348[var2++] = class442.field6357;
                            continue;
                        }
                        if (var607 == 5001) {
                            var2 -= 3;
                            class442.field6357 = field348[var2];
                            class381.field5343 = field348[var2 + 1];
                            class446.field6416 = field348[var2 + 2];
                            field345++;
                            class355.field4828.method1801(123, (byte) -74);
                            class355.field4828.method1824(90, class442.field6357);
                            class355.field4828.method1824(114, class381.field5343);
                            class355.field4828.method1824(110, class446.field6416);
                            continue;
                        }
                        if (var607 == 5002) {
                            var3--;
                            String var344 = field360[var3];
                            var2 -= 2;
                            int var345 = field348[var2];
                            int var346 = field348[var2 + 1];
                            field344++;
                            class355.field4828.method1801(232, (byte) -77);
                            class355.field4828.method1824(50, class408.method2528(-46, var344) + 2);
                            class355.field4828.method1827(0, var344);
                            class355.field4828.method1824(89, var345 - 1);
                            class355.field4828.method1824(37, var346);
                            continue;
                        }
                        if (var607 == 5003) {
                            var2--;
                            int var347 = field348[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class360.field4878[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field360[var3++] = var348;
                            continue;
                        }
                        if (var607 == 5004) {
                            var2--;
                            int var349 = field348[var2];
                            int var350 = -1;
                            if (var349 < 100 && class360.field4878[var349] != null) {
                                var350 = class360.field4882[var349];
                            }
                            field348[var2++] = var350;
                            continue;
                        }
                        if (var607 == 5005) {
                            field348[var2++] = class381.field5343;
                            continue;
                        }
                        if (var607 == 5008) {
                            var3--;
                            String var351 = field360[var3];
                            if (class447.field6482 == 0 && (class288.field3859 && !class128.field1807 || class236.field3282)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class288.field3867)) {
                                var353 = 0;
                                var351 = var351.substring(class288.field3867.length());
                            } else if (var352.startsWith(class408.field5722)) {
                                var353 = 1;
                                var351 = var351.substring(class408.field5722.length());
                            } else if (var352.startsWith(class275.field3707)) {
                                var353 = 2;
                                var351 = var351.substring(class275.field3707.length());
                            } else if (var352.startsWith(class268.field3606)) {
                                var353 = 3;
                                var351 = var351.substring(class268.field3606.length());
                            } else if (var352.startsWith(class414.field5783)) {
                                var353 = 4;
                                var351 = var351.substring(class414.field5783.length());
                            } else if (var352.startsWith(class87.field1296)) {
                                var353 = 5;
                                var351 = var351.substring(class87.field1296.length());
                            } else if (var352.startsWith(class66.field997)) {
                                var353 = 6;
                                var351 = var351.substring(class66.field997.length());
                            } else if (var352.startsWith(class298.field4008)) {
                                var353 = 7;
                                var351 = var351.substring(class298.field4008.length());
                            } else if (var352.startsWith(class401.field5604)) {
                                var353 = 8;
                                var351 = var351.substring(class401.field5604.length());
                            } else if (var352.startsWith(class115.field1613)) {
                                var353 = 9;
                                var351 = var351.substring(class115.field1613.length());
                            } else if (var352.startsWith(class43.field652)) {
                                var353 = 10;
                                var351 = var351.substring(class43.field652.length());
                            } else if (var352.startsWith(class428.field6087)) {
                                var353 = 11;
                                var351 = var351.substring(class428.field6087.length());
                            } else if (class89.field1320 != 0) {
                                if (var352.startsWith(class198.field2815)) {
                                    var353 = 0;
                                    var351 = var351.substring(class198.field2815.length());
                                } else if (var352.startsWith(class243.field3361)) {
                                    var353 = 1;
                                    var351 = var351.substring(class243.field3361.length());
                                } else if (var352.startsWith(class415.field5811)) {
                                    var353 = 2;
                                    var351 = var351.substring(class415.field5811.length());
                                } else if (var352.startsWith(class345.field4681)) {
                                    var353 = 3;
                                    var351 = var351.substring(class345.field4681.length());
                                } else if (var352.startsWith(class155.field2347)) {
                                    var353 = 4;
                                    var351 = var351.substring(class155.field2347.length());
                                } else if (var352.startsWith(class448.field6493)) {
                                    var353 = 5;
                                    var351 = var351.substring(class448.field6493.length());
                                } else if (var352.startsWith(class185.field2692)) {
                                    var353 = 6;
                                    var351 = var351.substring(class185.field2692.length());
                                } else if (var352.startsWith(class398.field5577)) {
                                    var353 = 7;
                                    var351 = var351.substring(class398.field5577.length());
                                } else if (var352.startsWith(class288.field3857)) {
                                    var353 = 8;
                                    var351 = var351.substring(class288.field3857.length());
                                } else if (var352.startsWith(class14.field105)) {
                                    var353 = 9;
                                    var351 = var351.substring(class14.field105.length());
                                } else if (var352.startsWith(class105.field1551)) {
                                    var353 = 10;
                                    var351 = var351.substring(class105.field1551.length());
                                } else if (var352.startsWith(class335.field4538)) {
                                    var353 = 11;
                                    var351 = var351.substring(class335.field4538.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class386.field5437)) {
                                var355 = 1;
                                var351 = var351.substring(class386.field5437.length());
                            } else if (var354.startsWith(class91.field1349)) {
                                var355 = 2;
                                var351 = var351.substring(class91.field1349.length());
                            } else if (var354.startsWith(class258.field3487)) {
                                var355 = 3;
                                var351 = var351.substring(class258.field3487.length());
                            } else if (var354.startsWith(class132.field1886)) {
                                var355 = 4;
                                var351 = var351.substring(class132.field1886.length());
                            } else if (var354.startsWith(class145.field2214)) {
                                var355 = 5;
                                var351 = var351.substring(class145.field2214.length());
                            } else if (class89.field1320 != 0) {
                                if (var354.startsWith(class288.field3863)) {
                                    var355 = 1;
                                    var351 = var351.substring(class288.field3863.length());
                                } else if (var354.startsWith(class412.field5762)) {
                                    var355 = 2;
                                    var351 = var351.substring(class412.field5762.length());
                                } else if (var354.startsWith(class149.field2287)) {
                                    var355 = 3;
                                    var351 = var351.substring(class149.field2287.length());
                                } else if (var354.startsWith(class126.field1772)) {
                                    var355 = 4;
                                    var351 = var351.substring(class126.field1772.length());
                                } else if (var354.startsWith(class275.field3696)) {
                                    var355 = 5;
                                    var351 = var351.substring(class275.field3696.length());
                                }
                            }
                            field354++;
                            class355.field4828.method1801(90, (byte) -90);
                            class355.field4828.method1824(84, 0);
                            int var356 = class355.field4828.field3938;
                            class355.field4828.method1824(112, var353);
                            class355.field4828.method1824(116, var355);
                            class148.method1139(var351, 0, class355.field4828);
                            class355.field4828.method1857(100, class355.field4828.field3938 - var356);
                            continue;
                        }
                        if (var607 == 5009) {
                            var3 -= 2;
                            String var357 = field360[var3];
                            String var358 = field360[var3 + 1];
                            if (class447.field6482 != 0 || (!class288.field3859 || class128.field1807) && !class236.field3282) {
                                field362++;
                                class355.field4828.method1801(2, (byte) -118);
                                class355.field4828.method1824(67, 0);
                                int var359 = class355.field4828.field3938;
                                class355.field4828.method1827(0, var357);
                                class148.method1139(var358, 0, class355.field4828);
                                class355.field4828.method1857(100, class355.field4828.field3938 - var359);
                            }
                            continue;
                        }
                        if (var607 == 5010) {
                            var2--;
                            int var360 = field348[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class31.field522[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field360[var3++] = var361;
                            continue;
                        }
                        if (var607 == 5011) {
                            var2--;
                            int var362 = field348[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class316.field4294[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field360[var3++] = var363;
                            continue;
                        }
                        if (var607 == 5012) {
                            var2--;
                            int var364 = field348[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class113.field1607[var364];
                            }
                            field348[var2++] = var365;
                            continue;
                        }
                        if (var607 == 5015) {
                            String var366;
                            if (class95.field1379 == null || class95.field1379.field4614 == null) {
                                var366 = class163.field2415;
                            } else {
                                var366 = class95.field1379.method2144(true, false);
                            }
                            field360[var3++] = var366;
                            continue;
                        }
                        if (var607 == 5016) {
                            field348[var2++] = class446.field6416;
                            continue;
                        }
                        if (var607 == 5017) {
                            field348[var2++] = class413.field5779;
                            continue;
                        }
                        if (var607 == 5018) {
                            var2--;
                            int var367 = field348[var2];
                            int var368 = 0;
                            if (var367 < 100 && class360.field4878[var367] != null) {
                                var368 = class360.field4882[var367];
                            }
                            field348[var2++] = var368;
                            continue;
                        }
                        if (var607 == 5019) {
                            var2--;
                            int var369 = field348[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class399.field5587[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field360[var3++] = var370;
                            continue;
                        }
                        if (var607 == 5020) {
                            String var371;
                            if (class95.field1379 == null || class95.field1379.field4614 == null) {
                                var371 = class163.field2415;
                            } else {
                                var371 = class95.field1379.method2147(0, false);
                            }
                            field360[var3++] = var371;
                            continue;
                        }
                        if (var607 == 5050) {
                            var2--;
                            int var372 = field348[var2];
                            field360[var3++] = class377.method2352(0, var372).field599;
                            continue;
                        }
                        if (var607 == 5051) {
                            var2--;
                            int var373 = field348[var2];
                            class39 var374 = class377.method2352(0, var373);
                            if (var374.field589 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var374.field589.length;
                            }
                            continue;
                        }
                        if (var607 == 5052) {
                            var2 -= 2;
                            int var375 = field348[var2];
                            int var376 = field348[var2 + 1];
                            class39 var377 = class377.method2352(0, var375);
                            int var378 = var377.field589[var376];
                            field348[var2++] = var378;
                            continue;
                        }
                        if (var607 == 5053) {
                            var2--;
                            int var379 = field348[var2];
                            class39 var380 = class377.method2352(0, var379);
                            if (var380.field594 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var380.field594.length;
                            }
                            continue;
                        }
                        if (var607 == 5054) {
                            var2 -= 2;
                            int var381 = field348[var2];
                            int var382 = field348[var2 + 1];
                            field348[var2++] = class377.method2352(0, var381).field594[var382];
                            continue;
                        }
                        if (var607 == 5055) {
                            var2--;
                            int var383 = field348[var2];
                            field360[var3++] = class335.method2122(var383, 80).method872(false);
                            continue;
                        }
                        if (var607 == 5056) {
                            var2--;
                            int var384 = field348[var2];
                            class102 var385 = class335.method2122(var384, 90);
                            if (var385.field1512 == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var385.field1512.length;
                            }
                            continue;
                        }
                        if (var607 == 5057) {
                            var2 -= 2;
                            int var386 = field348[var2];
                            int var387 = field348[var2 + 1];
                            field348[var2++] = class335.method2122(var386, 116).field1512[var387];
                            continue;
                        }
                        if (var607 == 5058) {
                            field353 = new class49();
                            var2--;
                            field353.field833 = field348[var2];
                            field353.field834 = class335.method2122(field353.field833, 101);
                            field353.field835 = new int[field353.field834.method879((byte) -16)];
                            continue;
                        }
                        if (var607 == 5059) {
                            field359++;
                            class355.field4828.method1801(150, (byte) -67);
                            class355.field4828.method1824(113, 0);
                            int var388 = class355.field4828.field3938;
                            class355.field4828.method1824(109, 0);
                            class355.field4828.method1877(true, field353.field833);
                            field353.field834.method877(field353.field835, class355.field4828, 8290);
                            class355.field4828.method1857(100, class355.field4828.field3938 - var388);
                            continue;
                        }
                        if (var607 == 5060) {
                            var3--;
                            String var389 = field360[var3];
                            field361++;
                            class355.field4828.method1801(72, (byte) -54);
                            class355.field4828.method1824(59, 0);
                            int var390 = class355.field4828.field3938;
                            class355.field4828.method1827(0, var389);
                            class355.field4828.method1877(true, field353.field833);
                            field353.field834.method877(field353.field835, class355.field4828, 8290);
                            class355.field4828.method1857(100, class355.field4828.field3938 - var390);
                            continue;
                        }
                        if (var607 == 5061) {
                            field359++;
                            class355.field4828.method1801(150, (byte) -50);
                            class355.field4828.method1824(126, 0);
                            int var391 = class355.field4828.field3938;
                            class355.field4828.method1824(56, 1);
                            class355.field4828.method1877(true, field353.field833);
                            field353.field834.method877(field353.field835, class355.field4828, 8290);
                            class355.field4828.method1857(100, class355.field4828.field3938 - var391);
                            continue;
                        }
                        if (var607 == 5062) {
                            var2 -= 2;
                            int var392 = field348[var2];
                            int var393 = field348[var2 + 1];
                            field348[var2++] = class377.method2352(0, var392).field593[var393];
                            continue;
                        }
                        if (var607 == 5063) {
                            var2 -= 2;
                            int var394 = field348[var2];
                            int var395 = field348[var2 + 1];
                            field348[var2++] = class377.method2352(0, var394).field597[var395];
                            continue;
                        }
                        if (var607 == 5064) {
                            var2 -= 2;
                            int var396 = field348[var2];
                            int var397 = field348[var2 + 1];
                            if (var397 == -1) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = class377.method2352(0, var396).method381(false, (char) var397);
                            }
                            continue;
                        }
                        if (var607 == 5065) {
                            var2 -= 2;
                            int var398 = field348[var2];
                            int var399 = field348[var2 + 1];
                            if (var399 == -1) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = class377.method2352(0, var398).method383((char) var399, -1);
                            }
                            continue;
                        }
                        if (var607 == 5066) {
                            var2--;
                            int var400 = field348[var2];
                            field348[var2++] = class335.method2122(var400, 124).method879((byte) -16);
                            continue;
                        }
                        if (var607 == 5067) {
                            var2 -= 2;
                            int var401 = field348[var2];
                            int var402 = field348[var2 + 1];
                            int var403 = class335.method2122(var401, 112).method871(var402, 31272);
                            field348[var2++] = var403;
                            continue;
                        }
                        if (var607 == 5068) {
                            var2 -= 2;
                            int var404 = field348[var2];
                            int var405 = field348[var2 + 1];
                            field353.field835[var404] = var405;
                            continue;
                        }
                        if (var607 == 5069) {
                            var2 -= 2;
                            int var406 = field348[var2];
                            int var407 = field348[var2 + 1];
                            field353.field835[var406] = var407;
                            continue;
                        }
                        if (var607 == 5070) {
                            var2 -= 3;
                            int var408 = field348[var2];
                            int var409 = field348[var2 + 1];
                            int var410 = field348[var2 + 2];
                            class102 var411 = class335.method2122(var408, 85);
                            if (var411.method871(var409, 31272) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field348[var2++] = var411.method874(var409, false, var410);
                            continue;
                        }
                        if (var607 == 5071) {
                            var3--;
                            String var412 = field360[var3];
                            var2--;
                            boolean var413 = field348[var2] == 1;
                            class348.method2200((byte) 39, var413, var412);
                            field348[var2++] = class97.field1406;
                            continue;
                        }
                        if (var607 == 5072) {
                            if (class358.field4858 != null && class221.field3052 < class97.field1406) {
                                field348[var2++] = class358.field4858[class221.field3052++] & 0xFFFF;
                                continue;
                            }
                            field348[var2++] = -1;
                            continue;
                        }
                        if (var607 == 5073) {
                            class221.field3052 = 0;
                            continue;
                        }
                    } else if (var607 < 5200) {
                        if (var607 == 5100) {
                            if (class234.field3242[86]) {
                                field348[var2++] = 1;
                            } else {
                                field348[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5101) {
                            if (class234.field3242[82]) {
                                field348[var2++] = 1;
                            } else {
                                field348[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5102) {
                            if (class234.field3242[81]) {
                                field348[var2++] = 1;
                            } else {
                                field348[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var607 < 5300) {
                        if (var607 == 5200) {
                            var2--;
                            class67.method586(field348[var2], false);
                            continue;
                        }
                        if (var607 == 5201) {
                            field348[var2++] = class198.method1402(45);
                            continue;
                        }
                        if (var607 == 5205) {
                            var2--;
                            class275.method1762(-1, false, 0, field348[var2], -1);
                            continue;
                        }
                        if (var607 == 5206) {
                            var2--;
                            int var414 = field348[var2];
                            class40 var415 = class99.method833(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = var415.field613;
                            }
                            continue;
                        }
                        if (var607 == 5207) {
                            var2--;
                            class40 var416 = class99.method846(field348[var2]);
                            if (var416 != null && var416.field617 != null) {
                                field360[var3++] = var416.field617;
                                continue;
                            }
                            field360[var3++] = "";
                            continue;
                        }
                        if (var607 == 5208) {
                            field348[var2++] = class332.field4513;
                            field348[var2++] = class185.field2693;
                            continue;
                        }
                        if (var607 == 5209) {
                            field348[var2++] = class99.field1436 + class447.field6475;
                            field348[var2++] = class99.field1438 + class172.field2519;
                            continue;
                        }
                        if (var607 == 5210) {
                            var2--;
                            int var417 = field348[var2];
                            class40 var418 = class99.method846(var417);
                            if (var418 == null) {
                                field348[var2++] = 0;
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var418.field621 >> 14 & 0x3FFF;
                                field348[var2++] = var418.field621 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var607 == 5211) {
                            var2--;
                            int var419 = field348[var2];
                            class40 var420 = class99.method846(var419);
                            if (var420 == null) {
                                field348[var2++] = 0;
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var420.field622 - var420.field620;
                                field348[var2++] = var420.field615 - var420.field610;
                            }
                            continue;
                        }
                        if (var607 == 5212) {
                            class430 var421 = class23.method292((byte) -117);
                            if (var421 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = var421.field6119;
                                int var422 = var421.field6115 << 28 | class99.field1436 + var421.field6124 << 14 | class99.field1438 + var421.field6120;
                                field348[var2++] = var422;
                            }
                            continue;
                        }
                        if (var607 == 5213) {
                            class430 var423 = class417.method2580(4);
                            if (var423 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = var423.field6119;
                                int var424 = var423.field6115 << 28 | class99.field1436 + var423.field6124 << 14 | class99.field1438 + var423.field6120;
                                field348[var2++] = var424;
                            }
                            continue;
                        }
                        if (var607 == 5214) {
                            var2--;
                            int var425 = field348[var2];
                            class40 var426 = class323.method2046((byte) -123);
                            if (var426 != null) {
                                boolean var427 = var426.method390(field367, 63, var425 >> 28 & 0x3, var425 & 0x3FFF, var425 >> 14 & 0x3FFF);
                                if (var427) {
                                    class438.method2717(field367[2], field367[1], (byte) 94);
                                }
                            }
                            continue;
                        }
                        if (var607 == 5215) {
                            var2 -= 2;
                            int var428 = field348[var2];
                            int var429 = field348[var2 + 1];
                            class355 var430 = class99.method831(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class40 var432 = (class40) var430.method2234(9700); var432 != null; var432 = (class40) var430.method2237((byte) 98)) {
                                if (var432.field613 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field348[var2++] = 1;
                            } else {
                                field348[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5218) {
                            var2--;
                            int var433 = field348[var2];
                            class40 var434 = class99.method846(var433);
                            if (var434 == null) {
                                field348[var2++] = -1;
                            } else {
                                field348[var2++] = var434.field627;
                            }
                            continue;
                        }
                        if (var607 == 5220) {
                            field348[var2++] = class199.field2831 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5221) {
                            var2--;
                            int var435 = field348[var2];
                            class438.method2717(var435 & 0x3FFF, var435 >> 14 & 0x3FFF, (byte) 94);
                            continue;
                        }
                        if (var607 == 5222) {
                            class40 var436 = class323.method2046((byte) 97);
                            if (var436 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = -1;
                            } else {
                                boolean var437 = var436.method397(field367, class99.field1436 + class447.field6475, class99.field1438 + class172.field2519, (byte) 113);
                                if (var437) {
                                    field348[var2++] = field367[1];
                                    field348[var2++] = field367[2];
                                } else {
                                    field348[var2++] = -1;
                                    field348[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5223) {
                            var2 -= 2;
                            int var438 = field348[var2];
                            int var439 = field348[var2 + 1];
                            class275.method1762(var439 & 0x3FFF, false, 0, var438, var439 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5224) {
                            var2--;
                            int var440 = field348[var2];
                            class40 var441 = class323.method2046((byte) 51);
                            if (var441 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = -1;
                            } else {
                                boolean var442 = var441.method390(field367, 63, var440 >> 28 & 0x3, var440 & 0x3FFF, var440 >> 14 & 0x3FFF);
                                if (var442) {
                                    field348[var2++] = field367[1];
                                    field348[var2++] = field367[2];
                                } else {
                                    field348[var2++] = -1;
                                    field348[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5225) {
                            var2--;
                            int var443 = field348[var2];
                            class40 var444 = class323.method2046((byte) 95);
                            if (var444 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = -1;
                            } else {
                                boolean var445 = var444.method397(field367, var443 >> 14 & 0x3FFF, var443 & 0x3FFF, (byte) 115);
                                if (var445) {
                                    field348[var2++] = field367[1];
                                    field348[var2++] = field367[2];
                                } else {
                                    field348[var2++] = -1;
                                    field348[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5226) {
                            var2--;
                            class69.method602(field348[var2], -21664);
                            continue;
                        }
                        if (var607 == 5227) {
                            var2 -= 2;
                            int var446 = field348[var2];
                            int var447 = field348[var2 + 1];
                            class275.method1762(var447 & 0x3FFF, true, 0, var446, var447 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5228) {
                            var2--;
                            class315.field4278 = field348[var2] == 1;
                            continue;
                        }
                        if (var607 == 5229) {
                            field348[var2++] = class315.field4278 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5230) {
                            var2--;
                            int var448 = field348[var2];
                            class247.method1611(var448, (byte) 127);
                            continue;
                        }
                        if (var607 == 5231) {
                            var2 -= 2;
                            int var449 = field348[var2];
                            boolean var450 = field348[var2 + 1] == 1;
                            if (class402.field5609 == null) {
                                continue;
                            }
                            class381 var451 = class402.field5609.method614(-90, (long) var449);
                            if (var451 != null && !var450) {
                                var451.method2367(5);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class381 var452 = new class381();
                                class402.field5609.method612((long) var449, -1, var452);
                            }
                            continue;
                        }
                        if (var607 == 5232) {
                            var2--;
                            int var453 = field348[var2];
                            if (class402.field5609 == null) {
                                field348[var2++] = 0;
                            } else {
                                class381 var454 = class402.field5609.method614(-124, (long) var453);
                                field348[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5233) {
                            var2 -= 2;
                            int var455 = field348[var2];
                            boolean var456 = field348[var2 + 1] == 1;
                            if (class97.field1402 == null) {
                                continue;
                            }
                            class381 var457 = class97.field1402.method614(-114, (long) var455);
                            if (var457 != null && !var456) {
                                var457.method2367(5);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class381 var458 = new class381();
                                class97.field1402.method612((long) var455, -1, var458);
                            }
                            continue;
                        }
                        if (var607 == 5234) {
                            var2--;
                            int var459 = field348[var2];
                            if (class97.field1402 == null) {
                                field348[var2++] = 0;
                            } else {
                                class381 var460 = class97.field1402.method614(-94, (long) var459);
                                field348[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5235) {
                            field348[var2++] = class99.field1409 == null ? -1 : class99.field1409.field613;
                            continue;
                        }
                    } else if (var607 < 5400) {
                        if (var607 == 5300) {
                            var2 -= 2;
                            int var461 = field348[var2];
                            int var462 = field348[var2 + 1];
                            class81.method743((byte) -111, false, var462, 3, var461);
                            field348[var2++] = class416.field5820 == null ? 0 : 1;
                            continue;
                        }
                        if (var607 == 5301) {
                            if (class416.field5820 != null) {
                                class81.method743((byte) -127, false, -1, class102.field1513, -1);
                            }
                            continue;
                        }
                        if (var607 == 5302) {
                            class385[] var463 = class218.method1492((byte) 74);
                            field348[var2++] = var463.length;
                            continue;
                        }
                        if (var607 == 5303) {
                            var2--;
                            int var464 = field348[var2];
                            class385[] var465 = class218.method1492((byte) -81);
                            field348[var2++] = var465[var464].field5424;
                            field348[var2++] = var465[var464].field5426;
                            continue;
                        }
                        if (var607 == 5305) {
                            int var466 = class42.field638;
                            int var467 = class422.field5903;
                            int var468 = -1;
                            class385[] var469 = class218.method1492((byte) 102);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class385 var471 = var469[var470];
                                if (var471.field5424 == var466 && var471.field5426 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field348[var2++] = var468;
                            continue;
                        }
                        if (var607 == 5306) {
                            field348[var2++] = class76.method651(-96);
                            continue;
                        }
                        if (var607 == 5307) {
                            var2--;
                            int var472 = field348[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class81.method743((byte) -106, false, -1, var472, -1);
                            }
                            continue;
                        }
                        if (var607 == 5308) {
                            field348[var2++] = class102.field1513;
                            continue;
                        }
                        if (var607 == 5309) {
                            var2--;
                            int var473 = field348[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class102.field1513 = var473;
                                class447.method2786((byte) 126, class30.field502);
                            }
                            continue;
                        }
                    } else if (var607 < 5500) {
                        if (var607 == 5400) {
                            var3 -= 2;
                            String var474 = field360[var3];
                            String var475 = field360[var3 + 1];
                            var2--;
                            int var476 = field348[var2];
                            field363++;
                            class355.field4828.method1801(110, (byte) -123);
                            class355.field4828.method1824(120, class408.method2528(-74, var474) + class408.method2528(-117, var475) + 1);
                            class355.field4828.method1827(0, var474);
                            class355.field4828.method1827(0, var475);
                            class355.field4828.method1824(56, var476);
                            continue;
                        }
                        if (var607 == 5401) {
                            var2 -= 2;
                            class264.field3545[field348[var2]] = (short) class257.method1672(field348[var2 + 1], 0);
                            class153.method1177(false);
                            class44.method410((byte) 101);
                            class130.method1012((byte) 93);
                            class218.method1489(122);
                            class125.method973(0);
                            continue;
                        }
                        if (var607 == 5405) {
                            var2 -= 2;
                            int var477 = field348[var2];
                            int var478 = field348[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class286.field3836[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var607 == 5406) {
                            var2 -= 7;
                            int var479 = field348[var2];
                            int var480 = field348[var2 + 1] << 1;
                            int var481 = field348[var2 + 2];
                            int var482 = field348[var2 + 3];
                            int var483 = field348[var2 + 4];
                            int var484 = field348[var2 + 5];
                            int var485 = field348[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class286.field3836[var479] != null && var480 >= 0 && var480 < class286.field3836[var479].length) {
                                class286.field3836[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class286.field3836[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var607 == 5407) {
                            var2--;
                            int var486 = class286.field3836[field348[var2]].length >> 1;
                            field348[var2++] = var486;
                            continue;
                        }
                        if (var607 == 5411) {
                            if (class416.field5820 != null) {
                                class81.method743((byte) -120, false, -1, class102.field1513, -1);
                            }
                            if (class414.field5781 == null) {
                                String var487 = class12.field90 == null ? class37.method373((byte) -86) : class12.field90;
                                class285.method1794(var487, false, class243.field3355 == 1, class30.field502, 3);
                            } else {
                                class321.method2027(true);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var607 == 5419) {
                            String var488 = "";
                            if (class164.field2419 != null) {
                                if (class164.field2419.field3341 == null) {
                                    var488 = class346.method2189(class164.field2419.field3340, -121);
                                } else {
                                    var488 = (String) class164.field2419.field3341;
                                }
                            }
                            field360[var3++] = var488;
                            continue;
                        }
                        if (var607 == 5420) {
                            field348[var2++] = class304.field4109 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5421) {
                            if (class416.field5820 != null) {
                                class81.method743((byte) -113, false, -1, class102.field1513, -1);
                            }
                            var3--;
                            String var489 = field360[var3];
                            var2--;
                            boolean var490 = field348[var2] == 1;
                            String var491 = class37.method373((byte) -86) + var489;
                            class285.method1794(var491, var490, class243.field3355 == 1, class30.field502, 3);
                            continue;
                        }
                        if (var607 == 5422) {
                            var3 -= 2;
                            String var492 = field360[var3];
                            String var493 = field360[var3 + 1];
                            var2--;
                            int var494 = field348[var2];
                            if (var492.length() > 0) {
                                if (class194.field2784 == null) {
                                    class194.field2784 = new String[class204.field2876[class42.field640]];
                                }
                                class194.field2784[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class97.field1400 == null) {
                                    class97.field1400 = new String[class204.field2876[class42.field640]];
                                }
                                class97.field1400[var494] = var493;
                            }
                            continue;
                        }
                        if (var607 == 5423) {
                            var3--;
                            System.out.println(field360[var3]);
                            continue;
                        }
                        if (var607 == 5424) {
                            var2 -= 11;
                            class394.field5523 = field348[var2];
                            class328.field4451 = field348[var2 + 1];
                            class396.field5547 = field348[var2 + 2];
                            class372.field5210 = field348[var2 + 3];
                            class372.field5225 = field348[var2 + 4];
                            class210.field2932 = field348[var2 + 5];
                            class21.field385 = field348[var2 + 6];
                            class204.field2873 = field348[var2 + 7];
                            class59.field930 = field348[var2 + 8];
                            class328.field4454 = field348[var2 + 9];
                            class53.field863 = field348[var2 + 10];
                            class187.field2705.method2635(class372.field5225, (byte) 61);
                            class187.field2705.method2635(class210.field2932, (byte) -114);
                            class187.field2705.method2635(class21.field385, (byte) 96);
                            class187.field2705.method2635(class204.field2873, (byte) 52);
                            class187.field2705.method2635(class59.field930, (byte) 106);
                            class118.field1645 = null;
                            class269.field3628 = null;
                            class90.field1336 = null;
                            class356.field4841 = null;
                            class95.field1381 = null;
                            class360.field4893 = null;
                            class262.field3517 = null;
                            class215.field2984 = null;
                            class427.field6056 = true;
                            continue;
                        }
                        if (var607 == 5425) {
                            class115.method929(19131);
                            class427.field6056 = false;
                            continue;
                        }
                        if (var607 == 5426) {
                            var2 -= 2;
                            class24.field424 = field348[var2];
                            class82.field1210 = field348[var2 + 1];
                            continue;
                        }
                        if (var607 == 5427) {
                            var2 -= 2;
                            class336.field4552 = field348[var2];
                            class422.field5904 = field348[var2 + 1];
                            continue;
                        }
                        if (var607 == 5428) {
                            var2 -= 2;
                            int var495 = field348[var2];
                            int var496 = field348[var2 + 1];
                            field348[var2++] = class74.method644(var495, (byte) 82, var496) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5429) {
                            var3--;
                            class368.method2297(false, field360[var3], (byte) 58);
                            continue;
                        }
                    } else if (var607 < 5600) {
                        if (var607 == 5500) {
                            var2 -= 4;
                            int var497 = field348[var2];
                            int var498 = field348[var2 + 1];
                            int var499 = field348[var2 + 2];
                            int var500 = field348[var2 + 3];
                            class265.method1707(var500, (var497 & 0x3FFF) - class296.field3988, (var497 >> 14 & 0x3FFF) - class283.field3794, (byte) 34, var498, var499, false);
                            continue;
                        }
                        if (var607 == 5501) {
                            var2 -= 4;
                            int var501 = field348[var2];
                            int var502 = field348[var2 + 1];
                            int var503 = field348[var2 + 2];
                            int var504 = field348[var2 + 3];
                            class276.method1771(var503, (var501 & 0x3FFF) - class296.field3988, 3072, var502, (var501 >> 14 & 0x3FFF) - class283.field3794, var504);
                            continue;
                        }
                        if (var607 == 5502) {
                            var2 -= 6;
                            int var505 = field348[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class286.field3830 = var505;
                            int var506 = field348[var2 + 1];
                            if (var506 + 1 >= class286.field3836[class286.field3830].length >> 1) {
                                throw new RuntimeException();
                            }
                            class84.field1276 = var506;
                            class71.field1066 = 0;
                            class177.field2612 = field348[var2 + 2];
                            class406.field5638 = field348[var2 + 3];
                            int var507 = field348[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class29.field493 = var507;
                            int var508 = field348[var2 + 5];
                            if (var508 + 1 >= class286.field3836[class29.field493].length >> 1) {
                                throw new RuntimeException();
                            }
                            class68.field1028 = var508;
                            class184.field2675 = 3;
                            continue;
                        }
                        if (var607 == 5503) {
                            class29.method335(10195);
                            continue;
                        }
                        if (var607 == 5504) {
                            var2 -= 2;
                            class118.method945(field348[var2], field348[var2 + 1], 120, 0);
                            continue;
                        }
                        if (var607 == 5505) {
                            field348[var2++] = (int) class47.field810 >> 3;
                            continue;
                        }
                        if (var607 == 5506) {
                            field348[var2++] = (int) class313.field4229 >> 3;
                            continue;
                        }
                        if (var607 == 5507) {
                            class83.method749(-16);
                            continue;
                        }
                        if (var607 == 5508) {
                            class13.method66(-16);
                            continue;
                        }
                        if (var607 == 5509) {
                            class400.method2456(-120);
                            continue;
                        }
                        if (var607 == 5510) {
                            class29.method341(1);
                            continue;
                        }
                        if (var607 == 5511) {
                            var2--;
                            int var509 = field348[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class283.field3794;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class116.field1621) {
                                var512 = class116.field1621;
                            }
                            int var513 = var511 - class296.field3988;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class385.field5425) {
                                var513 = class385.field5425;
                            }
                            class267.field3598 = var512 * 128 + 64;
                            class325.field4411 = var513 * 128 + 64;
                            class184.field2675 = 4;
                            continue;
                        }
                        if (var607 == 5512) {
                            class355.method2240((byte) 53);
                            continue;
                        }
                    } else if (var607 < 5700) {
                        if (var607 == 5600) {
                            var3 -= 2;
                            String var514 = field360[var3];
                            String var515 = field360[var3 + 1];
                            var2--;
                            int var516 = field348[var2];
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0 && class257.field3472 == 0) {
                                class316.method2011(var516, 0, var515, var514);
                            }
                            continue;
                        }
                        if (var607 == 5601) {
                            class107.method896(false);
                            continue;
                        }
                        if (var607 == 5602) {
                            if (class421.field5895 == 0) {
                                class368.field5051 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5603) {
                            var2 -= 4;
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0 && class257.field3472 == 0) {
                                class57.method534(field348[var2 + 1], field348[var2 + 3], 5, field348[var2 + 2], field348[var2]);
                            }
                            continue;
                        }
                        if (var607 == 5604) {
                            var3--;
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0 && class257.field3472 == 0) {
                                class440.method2730(21, class14.method70((byte) 104, field360[var3]));
                            }
                            continue;
                        }
                        if (var607 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0 && class257.field3472 == 0) {
                                class210.method1445(field348[var2 + 6] == 1, field348[var2 + 1], field348[var2], field348[var2 + 4] == 1, field348[var2 + 3], class14.method70((byte) 76, field360[var3]), field360[var3 + 1], field348[var2 + 5] == 1, field348[var2 + 2], (byte) -93, field360[var3 + 2]);
                            }
                            continue;
                        }
                        if (var607 == 5606) {
                            if (class199.field2841 == 0) {
                                class77.field1159 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5607) {
                            field348[var2++] = class368.field5051;
                            continue;
                        }
                        if (var607 == 5608) {
                            field348[var2++] = class383.field5366;
                            continue;
                        }
                        if (var607 == 5609) {
                            field348[var2++] = class77.field1159;
                            continue;
                        }
                        if (var607 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field360[var3++] = class190.field2728.length > var517 ? class267.method1721(class190.field2728[var517], (byte) -80) : "";
                            }
                            class190.field2728 = null;
                            continue;
                        }
                        if (var607 == 5611) {
                            field348[var2++] = class12.field87;
                            continue;
                        }
                    } else if (var607 < 6100) {
                        if (var607 == 6001) {
                            var2--;
                            int var518 = field348[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class73.field1095 = var518;
                            class415.method2570((byte) -33);
                            class447.method2786((byte) 75, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6002) {
                            var2--;
                            class95.method814(field348[var2] == 1, false);
                            class100.method859(64);
                            class415.method2570((byte) -79);
                            class100.method852((byte) -36);
                            class447.method2786((byte) 93, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6003) {
                            var2--;
                            class173.field2554 = field348[var2] == 1;
                            class100.method852((byte) -36);
                            class447.method2786((byte) 91, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6005) {
                            var2--;
                            class162.field2401 = field348[var2] == 1;
                            class415.method2570((byte) -81);
                            class447.method2786((byte) 58, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6006) {
                            var2--;
                            class416.field5823 = field348[var2] == 1;
                            class249.field3415.method120(!class416.field5823);
                            class447.method2786((byte) 83, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6007) {
                            var2--;
                            class275.field3703 = field348[var2];
                            class447.method2786((byte) 124, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6008) {
                            var2--;
                            class109.field1580 = field348[var2] == 1;
                            class447.method2786((byte) 92, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6009) {
                            var2--;
                            class441.field6352 = field348[var2] == 1;
                            class415.method2570((byte) -98);
                            class447.method2786((byte) 60, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6010) {
                            var2--;
                            class61.field952 = field348[var2] == 1;
                            class447.method2786((byte) 81, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6011) {
                            var2--;
                            int var519 = field348[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class179.field2633 = var519;
                            class415.method2570((byte) -43);
                            class447.method2786((byte) 90, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6012) {
                            var2--;
                            class385.field5429 = field348[var2] == 1;
                            class122.method960(-12581);
                            class447.method2786((byte) 59, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6014) {
                            var2--;
                            class223.field3086 = field348[var2] == 1;
                            class415.method2570((byte) 77);
                            class447.method2786((byte) 82, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6015) {
                            var2--;
                            class130.field1846 = field348[var2] == 1;
                            class415.method2570((byte) 120);
                            class447.method2786((byte) 90, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6016) {
                            var2--;
                            int var520 = field348[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class31.field514 = var520;
                            class118.method944(-13129);
                            class447.method2786((byte) 89, class30.field502);
                            continue;
                        }
                        if (var607 == 6017) {
                            var2--;
                            class177.field2610 = field348[var2] == 1;
                            class266.method1712(true);
                            class447.method2786((byte) 109, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6018) {
                            var2--;
                            int var521 = field348[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class40.field626 = var521;
                            class447.method2786((byte) 61, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6019) {
                            var2--;
                            int var522 = field348[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class148.field2284 != var522) {
                                if (class148.field2284 == 0 && class96.field1386 != -1) {
                                    class138.method1086(class96.field1386, -93, class138.field1943, false, var522, 0);
                                    class166.field2473 = false;
                                } else if (var522 == 0) {
                                    class399.method2451(1);
                                    class166.field2473 = false;
                                } else {
                                    class237.method1582(-67, var522);
                                }
                                class148.field2284 = var522;
                            }
                            class447.method2786((byte) 101, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6020) {
                            var2--;
                            int var523 = field348[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class331.field4504 = var523;
                            class447.method2786((byte) 58, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6021) {
                            var2--;
                            class387.field5455 = field348[var2] == 1;
                            class100.method852((byte) -36);
                            continue;
                        }
                        if (var607 == 6023) {
                            var2--;
                            int var524 = field348[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class297.field4005 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class161.method1208(var524, 0);
                            class447.method2786((byte) 56, class30.field502);
                            class338.field4600 = false;
                            field348[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 6024) {
                            var2--;
                            int var526 = field348[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class32.field527 = var526;
                            class447.method2786((byte) 75, class30.field502);
                            continue;
                        }
                        if (var607 == 6025) {
                            var2--;
                            int var527 = field348[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class41.field630 = var527;
                            class447.method2786((byte) 107, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                        if (var607 == 6027) {
                            var2--;
                            int var528 = field348[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class170.method1278(var528 == 1, (byte) 95);
                            continue;
                        }
                        if (var607 == 6028) {
                            var2--;
                            class338.field4590 = field348[var2] != 0;
                            class447.method2786((byte) 126, class30.field502);
                            continue;
                        }
                        if (var607 == 6029) {
                            var2--;
                            class275.field3703 = field348[var2];
                            class447.method2786((byte) 102, class30.field502);
                            continue;
                        }
                        if (var607 == 6030) {
                            var2--;
                            class26.field467 = field348[var2] != 0;
                            class447.method2786((byte) 120, class30.field502);
                            class415.method2570((byte) 69);
                            continue;
                        }
                        if (var607 == 6031) {
                            var2--;
                            int var529 = field348[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class447.method2785(var529, (byte) 109);
                            continue;
                        }
                        if (var607 == 6032) {
                            var2--;
                            int var530 = field348[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class447.field6440 = var530;
                            class447.method2786((byte) 82, class30.field502);
                            class338.field4600 = false;
                            continue;
                        }
                    } else if (var607 < 6200) {
                        if (var607 == 6101) {
                            field348[var2++] = class73.field1095;
                            continue;
                        }
                        if (var607 == 6102) {
                            field348[var2++] = class339.method2153(9) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6103) {
                            field348[var2++] = class173.field2554 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6105) {
                            field348[var2++] = class162.field2401 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6106) {
                            field348[var2++] = class416.field5823 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6107) {
                            field348[var2++] = class275.field3703;
                            continue;
                        }
                        if (var607 == 6108) {
                            field348[var2++] = class109.field1580 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6109) {
                            field348[var2++] = class441.field6352 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6110) {
                            field348[var2++] = class61.field952 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6111) {
                            field348[var2++] = class179.field2633;
                            continue;
                        }
                        if (var607 == 6112) {
                            field348[var2++] = class385.field5429 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6114) {
                            field348[var2++] = class223.field3086 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6115) {
                            field348[var2++] = class130.field1846 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6116) {
                            field348[var2++] = class31.field514;
                            continue;
                        }
                        if (var607 == 6117) {
                            field348[var2++] = class177.field2610 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6118) {
                            field348[var2++] = class40.field626;
                            continue;
                        }
                        if (var607 == 6119) {
                            field348[var2++] = class148.field2284;
                            continue;
                        }
                        if (var607 == 6120) {
                            field348[var2++] = class331.field4504;
                            continue;
                        }
                        if (var607 == 6121) {
                            field348[var2++] = class249.field3415.method146() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6123) {
                            field348[var2++] = class170.method1275(false);
                            continue;
                        }
                        if (var607 == 6124) {
                            field348[var2++] = class32.field527;
                            continue;
                        }
                        if (var607 == 6125) {
                            field348[var2++] = class41.field630;
                            continue;
                        }
                        if (var607 == 6126) {
                            field348[var2++] = class249.field3415.method106() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6127) {
                            field348[var2++] = class318.field4308 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6128) {
                            field348[var2++] = class338.field4590 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6129) {
                            field348[var2++] = class275.field3703;
                            continue;
                        }
                        if (var607 == 6130) {
                            field348[var2++] = class26.field467 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6131) {
                            field348[var2++] = class243.field3355;
                            continue;
                        }
                        if (var607 == 6132) {
                            field348[var2++] = class447.field6440;
                            continue;
                        }
                        if (var607 == 6133) {
                            field348[var2++] = class304.field4109 == 1 || class304.field4109 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6300) {
                        if (var607 == 6200) {
                            var2 -= 2;
                            class15.field136 = (short) field348[var2];
                            if (class15.field136 <= 0) {
                                class15.field136 = 256;
                            }
                            class316.field4292 = (short) field348[var2 + 1];
                            if (class316.field4292 <= 0) {
                                class316.field4292 = 205;
                            }
                            continue;
                        }
                        if (var607 == 6201) {
                            var2 -= 2;
                            class415.field5812 = (short) field348[var2];
                            if (class415.field5812 <= 0) {
                                class415.field5812 = 256;
                            }
                            class7.field54 = (short) field348[var2 + 1];
                            if (class7.field54 <= 0) {
                                class7.field54 = 320;
                            }
                            continue;
                        }
                        if (var607 == 6202) {
                            var2 -= 4;
                            class102.field1510 = (short) field348[var2];
                            if (class102.field1510 <= 0) {
                                class102.field1510 = 1;
                            }
                            class38.field581 = (short) field348[var2 + 1];
                            if (class38.field581 <= 0) {
                                class38.field581 = 32767;
                            } else if (class38.field581 < class102.field1510) {
                                class38.field581 = class102.field1510;
                            }
                            class401.field5603 = (short) field348[var2 + 2];
                            if (class401.field5603 <= 0) {
                                class401.field5603 = 1;
                            }
                            class415.field5813 = (short) field348[var2 + 3];
                            if (class415.field5813 <= 0) {
                                class415.field5813 = 32767;
                            } else if (class415.field5813 < class401.field5603) {
                                class415.field5813 = class401.field5603;
                            }
                            continue;
                        }
                        if (var607 == 6203) {
                            class81.method744(class358.field4860.field2011, false, 0, class358.field4860.field2027, -21270, 0);
                            field348[var2++] = class128.field1813;
                            field348[var2++] = class285.field3814;
                            continue;
                        }
                        if (var607 == 6204) {
                            field348[var2++] = class415.field5812;
                            field348[var2++] = class7.field54;
                            continue;
                        }
                        if (var607 == 6205) {
                            field348[var2++] = class15.field136;
                            field348[var2++] = class316.field4292;
                            continue;
                        }
                    } else if (var607 < 6400) {
                        if (var607 == 6300) {
                            field348[var2++] = (int) (class108.method902((byte) -93) / 60000L);
                            continue;
                        }
                        if (var607 == 6301) {
                            field348[var2++] = (int) (class108.method902((byte) -93) / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6302) {
                            var2 -= 3;
                            int var531 = field348[var2];
                            int var532 = field348[var2 + 1];
                            int var533 = field348[var2 + 2];
                            field349.clear();
                            field349.set(11, 12);
                            field349.set(var533, var532, var531);
                            field348[var2++] = (int) (field349.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6303) {
                            field349.clear();
                            field349.setTime(new Date(class108.method902((byte) -93)));
                            field348[var2++] = field349.get(1);
                            continue;
                        }
                        if (var607 == 6304) {
                            var2--;
                            int var534 = field348[var2];
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
                            field348[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6500) {
                        if (var607 == 6405) {
                            field348[var2++] = class100.method856((byte) -63) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6406) {
                            field348[var2++] = class24.method301(-126) ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6600) {
                        if (var607 == 6500) {
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0) {
                                field348[var2++] = class420.method2593(86) == -1 ? 0 : 1;
                                continue;
                            }
                            field348[var2++] = 1;
                            continue;
                        }
                        if (var607 == 6501) {
                            class187 var536 = class190.method1368(false);
                            if (var536 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = 0;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var536.field2701;
                                field348[var2++] = var536.field1845;
                                field360[var3++] = var536.field2713;
                                class260 var537 = var536.method1354((byte) 40);
                                field348[var2++] = var537.field3506;
                                field360[var3++] = var537.field3512;
                                field348[var2++] = var536.field1850;
                                field348[var2++] = var536.field2706;
                            }
                            continue;
                        }
                        if (var607 == 6502) {
                            class187 var538 = class42.method400(50);
                            if (var538 == null) {
                                field348[var2++] = -1;
                                field348[var2++] = 0;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var538.field2701;
                                field348[var2++] = var538.field1845;
                                field360[var3++] = var538.field2713;
                                class260 var539 = var538.method1354((byte) 43);
                                field348[var2++] = var539.field3506;
                                field360[var3++] = var539.field3512;
                                field348[var2++] = var538.field1850;
                                field348[var2++] = var538.field2706;
                            }
                            continue;
                        }
                        if (var607 == 6503) {
                            var2--;
                            int var540 = field348[var2];
                            if (class166.field2472 == 10 && class420.field5882 == 0 && class421.field5895 == 0 && class199.field2841 == 0) {
                                field348[var2++] = class194.method1393(-82, var540) ? 1 : 0;
                                continue;
                            }
                            field348[var2++] = 0;
                            continue;
                        }
                        if (var607 == 6504) {
                            var2--;
                            class264.field3557 = field348[var2];
                            class447.method2786((byte) 124, class30.field502);
                            continue;
                        }
                        if (var607 == 6505) {
                            field348[var2++] = class264.field3557;
                            continue;
                        }
                        if (var607 == 6506) {
                            var2--;
                            int var541 = field348[var2];
                            class187 var542 = class32.method348(0, var541);
                            if (var542 == null) {
                                field348[var2++] = -1;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field360[var3++] = "";
                                field348[var2++] = 0;
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = var542.field1845;
                                field360[var3++] = var542.field2713;
                                class260 var543 = var542.method1354((byte) 26);
                                field348[var2++] = var543.field3506;
                                field360[var3++] = var543.field3512;
                                field348[var2++] = var542.field1850;
                                field348[var2++] = var542.field2706;
                            }
                            continue;
                        }
                        if (var607 == 6507) {
                            var2 -= 4;
                            int var544 = field348[var2];
                            boolean var545 = field348[var2 + 1] == 1;
                            int var546 = field348[var2 + 2];
                            boolean var547 = field348[var2 + 3] == 1;
                            class101.method867(72, var546, var547, var545, var544);
                            continue;
                        }
                        if (var607 == 6508) {
                            class295.method1900((byte) -100);
                            continue;
                        }
                        if (var607 == 6509) {
                            if (class166.field2472 == 10) {
                                var2--;
                                if (field348[var2] == 1) {
                                    if (class293.field3959 == null) {
                                        class293.field3959 = new class437();
                                    }
                                } else if (class293.field3959 != null) {
                                    class293.field3959.method2711(0);
                                    class293.field3959 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var607 < 6700) {
                        if (var607 == 6600) {
                            var2--;
                            class100.field1443 = field348[var2] == 1;
                            class447.method2786((byte) 67, class30.field502);
                            continue;
                        }
                        if (var607 == 6601) {
                            field348[var2++] = class100.field1443 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6800 && class395.field5539 == 2) {
                        if (var607 == 6700) {
                            int var548 = class204.field2865.method610(-2036);
                            if (class149.field2288 != -1) {
                                var548++;
                            }
                            field348[var2++] = var548;
                            continue;
                        }
                        if (var607 == 6701) {
                            var2--;
                            int var549 = field348[var2];
                            if (class149.field2288 != -1) {
                                if (var549 == 0) {
                                    field348[var2++] = class149.field2288;
                                    continue;
                                }
                                var549--;
                            }
                            class64 var550 = (class64) class204.field2865.method608(-23);
                            while (var549-- > 0) {
                                var550 = (class64) class204.field2865.method606((byte) 92);
                            }
                            field348[var2++] = var550.field976;
                            continue;
                        }
                        if (var607 == 6702) {
                            var2--;
                            int var551 = field348[var2];
                            if (class291.field3949[var551] == null) {
                                field360[var3++] = "";
                            } else {
                                String var552 = class291.field3949[var551][0].field2075;
                                if (var552 == null) {
                                    field360[var3++] = "";
                                } else {
                                    field360[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var607 == 6703) {
                            var2--;
                            int var553 = field348[var2];
                            if (class291.field3949[var553] == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = class291.field3949[var553].length;
                            }
                            continue;
                        }
                        if (var607 == 6704) {
                            var2 -= 2;
                            int var554 = field348[var2];
                            int var555 = field348[var2 + 1];
                            if (class291.field3949[var554] == null) {
                                field360[var3++] = "";
                            } else {
                                String var556 = class291.field3949[var554][var555].field2075;
                                if (var556 == null) {
                                    field360[var3++] = "";
                                } else {
                                    field360[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var607 == 6705) {
                            var2 -= 2;
                            int var557 = field348[var2];
                            int var558 = field348[var2 + 1];
                            if (class291.field3949[var557] == null) {
                                field348[var2++] = 0;
                            } else {
                                field348[var2++] = class291.field3949[var557][var558].field1993;
                            }
                            continue;
                        }
                        if (var607 == 6706) {
                            continue;
                        }
                        if (var607 == 6707) {
                            var2 -= 3;
                            int var559 = field348[var2];
                            int var560 = field348[var2 + 1];
                            int var561 = field348[var2 + 2];
                            class153.method1176("", var559 << 16 | var560, true, var561, 1);
                            continue;
                        }
                        if (var607 == 6708) {
                            var2 -= 3;
                            int var562 = field348[var2];
                            int var563 = field348[var2 + 1];
                            int var564 = field348[var2 + 2];
                            class153.method1176("", var562 << 16 | var563, true, var564, 2);
                            continue;
                        }
                        if (var607 == 6709) {
                            var2 -= 3;
                            int var565 = field348[var2];
                            int var566 = field348[var2 + 1];
                            int var567 = field348[var2 + 2];
                            class153.method1176("", var565 << 16 | var566, true, var567, 3);
                            continue;
                        }
                        if (var607 == 6710) {
                            var2 -= 3;
                            int var568 = field348[var2];
                            int var569 = field348[var2 + 1];
                            int var570 = field348[var2 + 2];
                            class153.method1176("", var568 << 16 | var569, true, var570, 4);
                            continue;
                        }
                        if (var607 == 6711) {
                            var2 -= 3;
                            int var571 = field348[var2];
                            int var572 = field348[var2 + 1];
                            int var573 = field348[var2 + 2];
                            class153.method1176("", var571 << 16 | var572, true, var573, 5);
                            continue;
                        }
                        if (var607 == 6712) {
                            var2 -= 3;
                            int var574 = field348[var2];
                            int var575 = field348[var2 + 1];
                            int var576 = field348[var2 + 2];
                            class153.method1176("", var574 << 16 | var575, true, var576, 6);
                            continue;
                        }
                        if (var607 == 6713) {
                            var2 -= 3;
                            int var577 = field348[var2];
                            int var578 = field348[var2 + 1];
                            int var579 = field348[var2 + 2];
                            class153.method1176("", var577 << 16 | var578, true, var579, 7);
                            continue;
                        }
                        if (var607 == 6714) {
                            var2 -= 3;
                            int var580 = field348[var2];
                            int var581 = field348[var2 + 1];
                            int var582 = field348[var2 + 2];
                            class153.method1176("", var580 << 16 | var581, true, var582, 8);
                            continue;
                        }
                        if (var607 == 6715) {
                            var2 -= 3;
                            int var583 = field348[var2];
                            int var584 = field348[var2 + 1];
                            int var585 = field348[var2 + 2];
                            class153.method1176("", var583 << 16 | var584, true, var585, 9);
                            continue;
                        }
                        if (var607 == 6716) {
                            var2 -= 3;
                            int var586 = field348[var2];
                            int var587 = field348[var2 + 1];
                            int var588 = field348[var2 + 2];
                            class153.method1176("", var586 << 16 | var587, true, var588, 10);
                            continue;
                        }
                        if (var607 == 6717) {
                            var2 -= 3;
                            int var589 = field348[var2];
                            int var590 = field348[var2 + 1];
                            int var591 = field348[var2 + 2];
                            class139 var592 = class44.method411(var591, true, var589 << 16 | var590);
                            class301.method1932((byte) 67);
                            class126 var593 = client.method1648(var592);
                            class194.method1390(var592.field2000, var593.method987(-13163), var591, var593.field1766, (byte) -103, var592.field1959, var589 << 16 | var590);
                            continue;
                        }
                    } else if (var607 < 6900) {
                        if (var607 == 6800) {
                            var2--;
                            int var594 = field348[var2];
                            class384 var595 = class212.method1451(var594, 36);
                            if (var595.field5400 == null) {
                                field360[var3++] = "";
                            } else {
                                field360[var3++] = var595.field5400;
                            }
                            continue;
                        }
                        if (var607 == 6801) {
                            var2--;
                            int var596 = field348[var2];
                            class384 var597 = class212.method1451(var596, 36);
                            field348[var2++] = var597.field5396;
                            continue;
                        }
                        if (var607 == 6802) {
                            var2--;
                            int var598 = field348[var2];
                            class384 var599 = class212.method1451(var598, 36);
                            field348[var2++] = var599.field5383;
                            continue;
                        }
                        if (var607 == 6803) {
                            var2--;
                            int var600 = field348[var2];
                            class384 var601 = class212.method1451(var600, 36);
                            field348[var2++] = var601.field5408;
                            continue;
                        }
                    }
                } else {
                    class139 var75;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var75 = class10.method57(65535, field348[var2]);
                    } else {
                        var75 = var37 ? field346 : field355;
                    }
                    if (var607 == 1300) {
                        var2--;
                        int var76 = field348[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1087(field360[var3], var76, -8048);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var607 == 1301) {
                        var2 -= 2;
                        int var77 = field348[var2];
                        int var78 = field348[var2 + 1];
                        var75.field2018 = class44.method411(var78, true, var77);
                        continue;
                    }
                    if (var607 == 1302) {
                        var2--;
                        var75.field2092 = field348[var2] == 1;
                        continue;
                    }
                    if (var607 == 1303) {
                        var2--;
                        var75.field1991 = field348[var2];
                        continue;
                    }
                    if (var607 == 1304) {
                        var2--;
                        var75.field2029 = field348[var2];
                        continue;
                    }
                    if (var607 == 1305) {
                        var3--;
                        var75.field2096 = field360[var3];
                        continue;
                    }
                    if (var607 == 1306) {
                        var3--;
                        var75.field2047 = field360[var3];
                        continue;
                    }
                    if (var607 == 1307) {
                        var75.field1995 = null;
                        continue;
                    }
                    if (var607 == 1308) {
                        var2--;
                        var75.field1959 = field348[var2];
                        var2--;
                        var75.field2000 = field348[var2];
                        continue;
                    }
                    if (var607 == 1309) {
                        var2--;
                        int var79 = field348[var2];
                        var2--;
                        int var80 = field348[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1098(-27212, var79, var80 - 1);
                        }
                        continue;
                    }
                    if (var607 == 1310) {
                        var3--;
                        var75.field2051 = field360[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var606) {
            if (arg0.field2960 == null) {
                class380.method2365(-2, "CS2 - scr:" + arg0.field5349 + " op:" + var7, var606);
            } else {
                class289.method1838(-754415328, "Clientscript error in: " + arg0.field2960);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field2960).append("\n");
                for (int var604 = field347 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field350[var604].field6516.field2960).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var606.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class380.method2365(-2, var603.toString(), var606);
                class285.method1796(-11011, var603.toString());
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 6969)
    public static void method266() {
        field351 = null;
        field364 = null;
        field356 = null;
        field352 = null;
        field348 = null;
        field360 = null;
        field350 = null;
        field355 = null;
        field346 = null;
        field353 = null;
        field349 = null;
        field366 = null;
        field367 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lme;)V", line = 6995)
    public static final void method267(class361 arg0) {
        method264(arg0, 200000);
    }
}
