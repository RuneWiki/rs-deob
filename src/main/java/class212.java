import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class212 {

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "[[I")
    private static int[][] field2985 = new int[5][5000];

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "[I")
    private static int[] field2995 = new int[5];

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
    private static int[] field2998 = new int[1000];

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "[Ler;")
    private static class388[] field3003 = new class388[50];

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    private static int field2988 = 0;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "[Ljava/lang/String;")
    private static String[] field3001 = new String[1000];

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3005 = Calendar.getInstance();

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field3007 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
    private static int[] field3008 = new int[3];

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Lmq;")
    public static class104 field3006 = new class104(4);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "Lph;")
    private static class125 field2989;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Lms;")
    private static class363 field2983;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Lms;")
    private static class363 field3000;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "[I")
    private static int[] field2997;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field3004;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lni;I)V", line = 8)
    private static final void method1328(class33 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field538;
        int[] var6 = arg0.field527;
        byte var7 = -1;
        field2988 = 0;
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
                        field2998[var2++] = var6[var4];
                        continue;
                    }
                    if (var625 == 1) {
                        int var9 = var6[var4];
                        field2998[var2++] = class320.field4376.field3352[var9];
                        continue;
                    }
                    if (var625 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class320.field4376.method1494(var10, (byte) 127, field2998[var2]);
                        continue;
                    }
                    if (var625 == 3) {
                        field3001[var3++] = arg0.field529[var4];
                        continue;
                    }
                    if (var625 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var625 == 7) {
                        var2 -= 2;
                        if (field2998[var2 + 1] != field2998[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 8) {
                        var2 -= 2;
                        if (field2998[var2 + 1] == field2998[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 9) {
                        var2 -= 2;
                        if (field2998[var2] < field2998[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 10) {
                        var2 -= 2;
                        if (field2998[var2] > field2998[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 21) {
                        if (field2988 == 0) {
                            return;
                        }
                        class388 var11 = field3003[--field2988];
                        arg0 = var11.field5457;
                        var5 = arg0.field538;
                        var6 = arg0.field527;
                        var4 = var11.field5459;
                        field2997 = var11.field5461;
                        field3004 = var11.field5464;
                        continue;
                    }
                    if (var625 == 25) {
                        int var12 = var6[var4];
                        field2998[var2++] = class320.field4376.method1493((byte) 78, var12);
                        continue;
                    }
                    if (var625 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class320.field4376.method1486(var13, field2998[var2], (byte) -104);
                        continue;
                    }
                    if (var625 == 31) {
                        var2 -= 2;
                        if (field2998[var2] <= field2998[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 32) {
                        var2 -= 2;
                        if (field2998[var2] >= field2998[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 33) {
                        field2998[var2++] = field2997[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var625 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field2997[var10001] = field2998[var2];
                        continue;
                    }
                    if (var625 == 35) {
                        field3001[var3++] = field3004[var6[var4]];
                        continue;
                    }
                    if (var625 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field3004[var10001] = field3001[var3];
                        continue;
                    }
                    if (var625 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class224.method1409(field3001, var3, (byte) 60, var14);
                        field3001[var3++] = var15;
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
                        class33 var17 = class192.method1235((byte) -63, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field524];
                        String[] var19 = new String[var17.field526];
                        for (int var20 = 0; var20 < var17.field534; var20++) {
                            var18[var20] = field2998[var2 + var20 - var17.field534];
                        }
                        for (int var21 = 0; var21 < var17.field528; var21++) {
                            var19[var21] = field3001[var3 + var21 - var17.field528];
                        }
                        var2 -= var17.field534;
                        var3 -= var17.field528;
                        class388 var22 = new class388();
                        var22.field5457 = arg0;
                        var22.field5459 = var4;
                        var22.field5461 = field2997;
                        var22.field5464 = field3004;
                        if (field2988 >= field3003.length) {
                            throw new RuntimeException();
                        }
                        field3003[field2988++] = var22;
                        arg0 = var17;
                        var5 = var17.field538;
                        var6 = var17.field527;
                        var4 = -1;
                        field2997 = var18;
                        field3004 = var19;
                        continue;
                    }
                    if (var625 == 42) {
                        field2998[var2++] = class64.field975[var6[var4]];
                        continue;
                    }
                    if (var625 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class64.field975[var23] = field2998[var2];
                        class163.method994(var23, (byte) 86);
                        class146.field2067 |= class2.field19[var23];
                        continue;
                    }
                    if (var625 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field2998[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field2995[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4494;
                                }
                                field2985[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field2998[var2];
                        if (var30 >= 0 && var30 < field2995[var29]) {
                            field2998[var2++] = field2985[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field2998[var2];
                        if (var32 >= 0 && var32 < field2995[var31]) {
                            field2985[var31][var32] = field2998[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 47) {
                        String var33 = class438.field6012[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field3001[var3++] = var33;
                        continue;
                    }
                    if (var625 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class438.field6012[var34] = field3001[var3];
                        class321.method1938(var34, 2);
                        continue;
                    }
                    if (var625 == 51) {
                        class454 var35 = arg0.field531[var6[var4]];
                        var2--;
                        class128 var36 = (class128) var35.method2614((long) field2998[var2], -85);
                        if (var36 != null) {
                            var4 += var36.field1815;
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
                        int var38 = field2998[var2];
                        int var39 = field2998[var2 + 1];
                        int var40 = field2998[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class363 var41 = class292.method1804((byte) -95, var38);
                        if (var41.field5113 == null) {
                            var41.field5113 = new class363[var40 + 1];
                        }
                        if (var41.field5113.length <= var40) {
                            class363[] var42 = new class363[var40 + 1];
                            for (int var43 = 0; var43 < var41.field5113.length; var43++) {
                                var42[var43] = var41.field5113[var43];
                            }
                            var41.field5113 = var42;
                        }
                        if (var40 > 0 && var41.field5113[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class363 var44 = new class363();
                        var44.field5093 = var39;
                        var44.field5062 = var44.field5096 = var41.field5096;
                        var44.field5047 = var40;
                        var41.field5113[var40] = var44;
                        if (var37) {
                            field2983 = var44;
                        } else {
                            field3000 = var44;
                        }
                        class356.method2141(-89, var41);
                        continue;
                    }
                    if (var625 == 101) {
                        class363 var45 = var37 ? field2983 : field3000;
                        if (var45.field5047 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class363 var46 = class292.method1804((byte) -128, var45.field5096);
                        var46.field5113[var45.field5047] = null;
                        class356.method2141(-87, var46);
                        continue;
                    }
                    if (var625 == 102) {
                        var2--;
                        class363 var47 = class292.method1804((byte) -74, field2998[var2]);
                        var47.field5113 = null;
                        class356.method2141(-64, var47);
                        continue;
                    }
                    if (var625 == 200) {
                        var2 -= 2;
                        int var48 = field2998[var2];
                        int var49 = field2998[var2 + 1];
                        class363 var50 = class485.method2840(var49, var48, (byte) 21);
                        if (var50 != null && var49 != -1) {
                            field2998[var2++] = 1;
                            if (var37) {
                                field2983 = var50;
                            } else {
                                field3000 = var50;
                            }
                            continue;
                        }
                        field2998[var2++] = 0;
                        continue;
                    }
                    if (var625 == 201) {
                        var2--;
                        int var51 = field2998[var2];
                        class363 var52 = class292.method1804((byte) -114, var51);
                        if (var52 == null) {
                            field2998[var2++] = 0;
                        } else {
                            field2998[var2++] = 1;
                            if (var37) {
                                field2983 = var52;
                            } else {
                                field3000 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var625 < 500) {
                    if (var625 == 403) {
                        var2 -= 2;
                        int var53 = field2998[var2];
                        int var54 = field2998[var2 + 1];
                        for (int var55 = 0; var55 < class382.field5420.length; var55++) {
                            if (class382.field5420[var55] == var53) {
                                class2.field21.field400.method144((byte) -88, var55, class393.field5529, var54);
                                continue label4494;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class107.field1537.length) {
                                continue label4494;
                            }
                            if (class107.field1537[var56] == var53) {
                                class2.field21.field400.method144((byte) -88, var56, class393.field5529, var54);
                                continue label4494;
                            }
                            var56++;
                        }
                    }
                    if (var625 == 404) {
                        var2 -= 2;
                        int var57 = field2998[var2];
                        int var58 = field2998[var2 + 1];
                        class2.field21.field400.method149(10834, var58, var57);
                        continue;
                    }
                    if (var625 == 410) {
                        var2--;
                        boolean var59 = field2998[var2] != 0;
                        class2.field21.field400.method150(var59, (byte) 93);
                        continue;
                    }
                } else if (!(var625 < 1000 || var625 >= 1100) || !(var625 < 2000 || var625 >= 2100)) {
                    class363 var60;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var60 = class292.method1804((byte) -57, field2998[var2]);
                    } else {
                        var60 = var37 ? field2983 : field3000;
                    }
                    if (var625 == 1000) {
                        var2 -= 4;
                        var60.field5100 = field2998[var2];
                        var60.field5166 = field2998[var2 + 1];
                        int var61 = field2998[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field2998[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field5132 = (byte) var61;
                        var60.field5181 = (byte) var62;
                        class356.method2141(-108, var60);
                        class159.method962(var60, 0);
                        if (var60.field5047 == -1) {
                            class437.method2540(var60.field5096, -52);
                        }
                        continue;
                    }
                    if (var625 == 1001) {
                        var2 -= 4;
                        var60.field5127 = field2998[var2];
                        var60.field5192 = field2998[var2 + 1];
                        var60.field5060 = 0;
                        var60.field5106 = 0;
                        int var63 = field2998[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field2998[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field5135 = (byte) var63;
                        var60.field5084 = (byte) var64;
                        class356.method2141(-94, var60);
                        class159.method962(var60, 0);
                        if (var60.field5093 == 0) {
                            class265.method1674(var60, (byte) 28, false);
                        }
                        continue;
                    }
                    if (var625 == 1003) {
                        var2--;
                        boolean var65 = field2998[var2] == 1;
                        if (var60.field5179 != var65) {
                            var60.field5179 = var65;
                            class356.method2141(-123, var60);
                        }
                        if (var60.field5047 == -1) {
                            class327.method1963(var60.field5096, (byte) 108);
                        }
                        continue;
                    }
                    if (var625 == 1004) {
                        var2 -= 2;
                        var60.field5068 = field2998[var2];
                        var60.field5088 = field2998[var2 + 1];
                        class356.method2141(-88, var60);
                        class159.method962(var60, 0);
                        if (var60.field5093 == 0) {
                            class265.method1674(var60, (byte) 28, false);
                        }
                        continue;
                    }
                    if (var625 == 1005) {
                        var2--;
                        var60.field5134 = field2998[var2] == 1;
                        continue;
                    }
                } else if (var625 >= 1100 && var625 < 1200 || var625 >= 2100 && var625 < 2200) {
                    class363 var66;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var66 = class292.method1804((byte) -92, field2998[var2]);
                    } else {
                        var66 = var37 ? field2983 : field3000;
                    }
                    if (var625 == 1100) {
                        var2 -= 2;
                        var66.field5111 = field2998[var2];
                        if (var66.field5111 > var66.field5116 - var66.field5101) {
                            var66.field5111 = var66.field5116 - var66.field5101;
                        }
                        if (var66.field5111 < 0) {
                            var66.field5111 = 0;
                        }
                        var66.field5186 = field2998[var2 + 1];
                        if (var66.field5186 > var66.field5114 - var66.field5200) {
                            var66.field5186 = var66.field5114 - var66.field5200;
                        }
                        if (var66.field5186 < 0) {
                            var66.field5186 = 0;
                        }
                        class356.method2141(-111, var66);
                        if (var66.field5047 == -1) {
                            class162.method989(116, var66.field5096);
                        }
                        continue;
                    }
                    if (var625 == 1101) {
                        var2--;
                        var66.field5095 = field2998[var2];
                        class356.method2141(-64, var66);
                        if (var66.field5047 == -1) {
                            class244.method1525(var66.field5096, (byte) 16);
                        }
                        continue;
                    }
                    if (var625 == 1102) {
                        var2--;
                        var66.field5091 = field2998[var2] == 1;
                        class356.method2141(-120, var66);
                        continue;
                    }
                    if (var625 == 1103) {
                        var2--;
                        var66.field5142 = field2998[var2];
                        class356.method2141(-62, var66);
                        continue;
                    }
                    if (var625 == 1104) {
                        var2--;
                        var66.field5050 = field2998[var2];
                        class356.method2141(-93, var66);
                        continue;
                    }
                    if (var625 == 1105) {
                        var2--;
                        int var67 = field2998[var2];
                        if (var66.field5098 != var67) {
                            var66.field5098 = var67;
                            class356.method2141(-110, var66);
                        }
                        if (var66.field5047 == -1) {
                            class23.method192(var66.field5096, 24415);
                        }
                        continue;
                    }
                    if (var625 == 1106) {
                        var2--;
                        var66.field5146 = field2998[var2];
                        class356.method2141(-115, var66);
                        continue;
                    }
                    if (var625 == 1107) {
                        var2--;
                        var66.field5137 = field2998[var2] == 1;
                        class356.method2141(-98, var66);
                        continue;
                    }
                    if (var625 == 1108) {
                        var66.field5143 = 1;
                        var2--;
                        var66.field5154 = field2998[var2];
                        class356.method2141(-70, var66);
                        if (var66.field5047 == -1) {
                            class101.method646(var66.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1109) {
                        var2 -= 6;
                        var66.field5097 = field2998[var2];
                        var66.field5046 = field2998[var2 + 1];
                        var66.field5075 = field2998[var2 + 2];
                        var66.field5108 = field2998[var2 + 3];
                        var66.field5164 = field2998[var2 + 4];
                        var66.field5126 = field2998[var2 + 5];
                        class356.method2141(-119, var66);
                        if (var66.field5047 == -1) {
                            class181.method1192(var66.field5096, (byte) 88);
                            class392.method2342(true, var66.field5096);
                        }
                        continue;
                    }
                    if (var625 == 1110) {
                        var2--;
                        int var68 = field2998[var2];
                        if (var66.field5121 != var68) {
                            var66.field5121 = var68;
                            var66.field5172 = 0;
                            var66.field5152 = 1;
                            var66.field5045 = 0;
                            class356.method2141(-104, var66);
                        }
                        if (var66.field5047 == -1) {
                            class394.method2349(var66.field5096, (byte) -91);
                        }
                        continue;
                    }
                    if (var625 == 1111) {
                        var2--;
                        var66.field5120 = field2998[var2] == 1;
                        class356.method2141(-76, var66);
                        continue;
                    }
                    if (var625 == 1112) {
                        var3--;
                        String var69 = field3001[var3];
                        if (!var69.equals(var66.field5123)) {
                            var66.field5123 = var69;
                            class356.method2141(-126, var66);
                        }
                        if (var66.field5047 == -1) {
                            class262.method1622((byte) 118, var66.field5096);
                        }
                        continue;
                    }
                    if (var625 == 1113) {
                        var2--;
                        var66.field5155 = field2998[var2];
                        class356.method2141(-123, var66);
                        if (var66.field5047 == -1) {
                            class446.method2596((byte) -121, var66.field5096);
                        }
                        continue;
                    }
                    if (var625 == 1114) {
                        var2 -= 3;
                        var66.field5082 = field2998[var2];
                        var66.field5131 = field2998[var2 + 1];
                        var66.field5089 = field2998[var2 + 2];
                        class356.method2141(-80, var66);
                        continue;
                    }
                    if (var625 == 1115) {
                        var2--;
                        var66.field5151 = field2998[var2] == 1;
                        class356.method2141(-95, var66);
                        continue;
                    }
                    if (var625 == 1116) {
                        var2--;
                        var66.field5071 = field2998[var2];
                        class356.method2141(-80, var66);
                        continue;
                    }
                    if (var625 == 1117) {
                        var2--;
                        var66.field5059 = field2998[var2];
                        class356.method2141(-98, var66);
                        continue;
                    }
                    if (var625 == 1118) {
                        var2--;
                        var66.field5191 = field2998[var2] == 1;
                        class356.method2141(-127, var66);
                        continue;
                    }
                    if (var625 == 1119) {
                        var2--;
                        var66.field5189 = field2998[var2] == 1;
                        class356.method2141(-114, var66);
                        continue;
                    }
                    if (var625 == 1120) {
                        var2 -= 2;
                        var66.field5116 = field2998[var2];
                        var66.field5114 = field2998[var2 + 1];
                        class356.method2141(-108, var66);
                        if (var66.field5093 == 0) {
                            class265.method1674(var66, (byte) 28, false);
                        }
                        continue;
                    }
                    if (var625 == 1121) {
                        var2 -= 2;
                        var66.field5117 = (short) field2998[var2];
                        var66.field5067 = (short) field2998[var2 + 1];
                        class356.method2141(-99, var66);
                        continue;
                    }
                    if (var625 == 1122) {
                        var2--;
                        var66.field5064 = field2998[var2] == 1;
                        class356.method2141(-100, var66);
                        continue;
                    }
                    if (var625 == 1123) {
                        var2--;
                        var66.field5126 = field2998[var2];
                        class356.method2141(-115, var66);
                        if (var66.field5047 == -1) {
                            class181.method1192(var66.field5096, (byte) 104);
                        }
                        continue;
                    }
                    if (var625 == 1124) {
                        var2--;
                        int var70 = field2998[var2];
                        var66.field5090 = var70 == 1;
                        class356.method2141(-112, var66);
                        continue;
                    }
                    if (var625 == 1125) {
                        var2 -= 2;
                        var66.field5169 = field2998[var2];
                        var66.field5051 = field2998[var2 + 1];
                        class356.method2141(-68, var66);
                        continue;
                    }
                } else if (!(var625 < 1200 || var625 >= 1300) || !(var625 < 2200 || var625 >= 2300)) {
                    class363 var71;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var71 = class292.method1804((byte) -127, field2998[var2]);
                    } else {
                        var71 = var37 ? field2983 : field3000;
                    }
                    class356.method2141(-65, var71);
                    if (var625 == 1200 || var625 == 1205 || var625 == 1208 || var625 == 1209 || var625 == 1212 || var625 == 1213) {
                        var2 -= 2;
                        int var72 = field2998[var2];
                        int var73 = field2998[var2 + 1];
                        if (var71.field5047 == -1) {
                            class178.method1163(var71.field5096, true);
                            class181.method1192(var71.field5096, (byte) 118);
                            class392.method2342(true, var71.field5096);
                        }
                        if (var72 == -1) {
                            var71.field5143 = 1;
                            var71.field5154 = -1;
                            var71.field5195 = -1;
                            continue;
                        }
                        var71.field5195 = var72;
                        var71.field5175 = var73;
                        if (var625 == 1208 || var625 == 1209) {
                            var71.field5182 = true;
                        } else {
                            var71.field5182 = false;
                        }
                        class164 var74 = class58.field918.method344(var72, 31757);
                        var71.field5075 = var74.field2379;
                        var71.field5108 = var74.field2392;
                        var71.field5164 = var74.field2390;
                        var71.field5097 = var74.field2356;
                        var71.field5046 = var74.field2395;
                        var71.field5126 = var74.field2421;
                        if (var625 == 1205 || var625 == 1209) {
                            var71.field5063 = 0;
                        } else if (var625 == 1212 || var625 == 1213) {
                            var71.field5063 = 1;
                        } else {
                            var71.field5063 = 2;
                        }
                        if (var71.field5060 > 0) {
                            var71.field5126 = var71.field5126 * 32 / var71.field5060;
                        } else if (var71.field5127 > 0) {
                            var71.field5126 = var71.field5126 * 32 / var71.field5127;
                        }
                        continue;
                    }
                    if (var625 == 1201) {
                        var71.field5143 = 2;
                        var2--;
                        var71.field5154 = field2998[var2];
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1202) {
                        var71.field5143 = 3;
                        var71.field5154 = -1;
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1203) {
                        var71.field5143 = 6;
                        var2--;
                        var71.field5154 = field2998[var2];
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1204) {
                        var71.field5143 = 5;
                        var2--;
                        var71.field5154 = field2998[var2];
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1206) {
                        var2 -= 4;
                        var71.field5103 = field2998[var2];
                        var71.field5163 = field2998[var2 + 1];
                        var71.field5048 = field2998[var2 + 2];
                        var71.field5125 = field2998[var2 + 3];
                        class356.method2141(-100, var71);
                        continue;
                    }
                    if (var625 == 1207) {
                        var2 -= 2;
                        var71.field5076 = field2998[var2];
                        var71.field5081 = field2998[var2 + 1];
                        class356.method2141(-60, var71);
                        continue;
                    }
                    if (var625 == 1210) {
                        var2 -= 4;
                        var71.field5154 = field2998[var2];
                        var71.field5055 = field2998[var2 + 1];
                        if (field2998[var2 + 2] == 1) {
                            var71.field5143 = 9;
                        } else {
                            var71.field5143 = 8;
                        }
                        if (field2998[var2 + 3] == 1) {
                            var71.field5182 = true;
                        } else {
                            var71.field5182 = false;
                        }
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                    if (var625 == 1211) {
                        var71.field5143 = 5;
                        var71.field5154 = class327.field4523;
                        var71.field5055 = 0;
                        if (var71.field5047 == -1) {
                            class101.method646(var71.field5096, -30024);
                        }
                        continue;
                    }
                } else if (var625 >= 1300 && var625 < 1400 || var625 >= 2300 && var625 < 2400) {
                    class363 var75;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var75 = class292.method1804((byte) -126, field2998[var2]);
                    } else {
                        var75 = var37 ? field2983 : field3000;
                    }
                    if (var625 == 1300) {
                        var2--;
                        int var76 = field2998[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method2200(var76, field3001[var3], false);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var625 == 1301) {
                        var2 -= 2;
                        int var77 = field2998[var2];
                        int var78 = field2998[var2 + 1];
                        var75.field5122 = class485.method2840(var78, var77, (byte) 21);
                        continue;
                    }
                    if (var625 == 1302) {
                        var2--;
                        int var79 = field2998[var2];
                        if (class31.field506 == var79 || class15.field248 == var79 || class167.field2456 == var79) {
                            var75.field5194 = var79;
                        }
                        continue;
                    }
                    if (var625 == 1303) {
                        var2--;
                        var75.field5085 = field2998[var2];
                        continue;
                    }
                    if (var625 == 1304) {
                        var2--;
                        var75.field5073 = field2998[var2];
                        continue;
                    }
                    if (var625 == 1305) {
                        var3--;
                        var75.field5115 = field3001[var3];
                        continue;
                    }
                    if (var625 == 1306) {
                        var3--;
                        var75.field5177 = field3001[var3];
                        continue;
                    }
                    if (var625 == 1307) {
                        var75.field5196 = null;
                        continue;
                    }
                    if (var625 == 1308) {
                        var2--;
                        var75.field5083 = field2998[var2];
                        var2--;
                        var75.field5077 = field2998[var2];
                        continue;
                    }
                    if (var625 == 1309) {
                        var2--;
                        int var80 = field2998[var2];
                        var2--;
                        int var81 = field2998[var2];
                        if (var81 >= 1 && var81 <= 10) {
                            var75.method2208(var81 - 1, var80, true);
                        }
                        continue;
                    }
                    if (var625 == 1310) {
                        var3--;
                        var75.field5199 = field3001[var3];
                        continue;
                    }
                    if (var625 == 1311) {
                        var2--;
                        var75.field5065 = field2998[var2];
                        continue;
                    }
                } else {
                    if (var625 >= 1400 && var625 < 1500 || var625 >= 2400 && var625 < 2500) {
                        class363 var82;
                        if (var625 >= 2000) {
                            var625 -= 1000;
                            var2--;
                            var82 = class292.method1804((byte) -86, field2998[var2]);
                        } else {
                            var82 = var37 ? field2983 : field3000;
                        }
                        var3--;
                        String var83 = field3001[var3];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var2--;
                            int var85 = field2998[var2];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var2--;
                                    var84[var85] = field2998[var2];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var3--;
                                var86[var87] = field3001[var3];
                            } else {
                                var2--;
                                var86[var87] = Integer.valueOf(field2998[var2]);
                            }
                        }
                        var2--;
                        int var88 = field2998[var2];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var625 == 1400) {
                            var82.field5144 = var86;
                        } else if (var625 == 1401) {
                            var82.field5156 = var86;
                        } else if (var625 == 1402) {
                            var82.field5165 = var86;
                        } else if (var625 == 1403) {
                            var82.field5105 = var86;
                        } else if (var625 == 1404) {
                            var82.field5110 = var86;
                        } else if (var625 == 1405) {
                            var82.field5066 = var86;
                        } else if (var625 == 1406) {
                            var82.field5099 = var86;
                        } else if (var625 == 1407) {
                            var82.field5204 = var86;
                            var82.field5176 = var84;
                        } else if (var625 == 1408) {
                            var82.field5128 = var86;
                        } else if (var625 == 1409) {
                            var82.field5197 = var86;
                        } else if (var625 == 1410) {
                            var82.field5124 = var86;
                        } else if (var625 == 1411) {
                            var82.field5107 = var86;
                        } else if (var625 == 1412) {
                            var82.field5150 = var86;
                        } else if (var625 == 1414) {
                            var82.field5190 = var86;
                            var82.field5167 = var84;
                        } else if (var625 == 1415) {
                            var82.field5058 = var86;
                            var82.field5158 = var84;
                        } else if (var625 == 1416) {
                            var82.field5057 = var86;
                        } else if (var625 == 1417) {
                            var82.field5173 = var86;
                        } else if (var625 == 1418) {
                            var82.field5069 = var86;
                        } else if (var625 == 1419) {
                            var82.field5118 = var86;
                        } else if (var625 == 1420) {
                            var82.field5140 = var86;
                        } else if (var625 == 1421) {
                            var82.field5147 = var86;
                        } else if (var625 == 1422) {
                            var82.field5104 = var86;
                        } else if (var625 == 1423) {
                            var82.field5054 = var86;
                        } else if (var625 == 1424) {
                            var82.field5086 = var86;
                        } else if (var625 == 1425) {
                            var82.field5180 = var86;
                        } else if (var625 == 1426) {
                            var82.field5070 = var86;
                        } else if (var625 == 1427) {
                            var82.field5094 = var86;
                        } else if (var625 == 1428) {
                            var82.field5109 = var86;
                            var82.field5129 = var84;
                        } else if (var625 == 1429) {
                            var82.field5170 = var86;
                            var82.field5159 = var84;
                        }
                        var82.field5133 = true;
                        continue;
                    }
                    if (var625 < 1600) {
                        class363 var89 = var37 ? field2983 : field3000;
                        if (var625 == 1500) {
                            field2998[var2++] = var89.field5145;
                            continue;
                        }
                        if (var625 == 1501) {
                            field2998[var2++] = var89.field5183;
                            continue;
                        }
                        if (var625 == 1502) {
                            field2998[var2++] = var89.field5101;
                            continue;
                        }
                        if (var625 == 1503) {
                            field2998[var2++] = var89.field5200;
                            continue;
                        }
                        if (var625 == 1504) {
                            field2998[var2++] = var89.field5179 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 1505) {
                            field2998[var2++] = var89.field5062;
                            continue;
                        }
                    } else if (var625 < 1700) {
                        class363 var90 = var37 ? field2983 : field3000;
                        if (var625 == 1600) {
                            field2998[var2++] = var90.field5111;
                            continue;
                        }
                        if (var625 == 1601) {
                            field2998[var2++] = var90.field5186;
                            continue;
                        }
                        if (var625 == 1602) {
                            field3001[var3++] = var90.field5123;
                            continue;
                        }
                        if (var625 == 1603) {
                            field2998[var2++] = var90.field5116;
                            continue;
                        }
                        if (var625 == 1604) {
                            field2998[var2++] = var90.field5114;
                            continue;
                        }
                        if (var625 == 1605) {
                            field2998[var2++] = var90.field5126;
                            continue;
                        }
                        if (var625 == 1606) {
                            field2998[var2++] = var90.field5075;
                            continue;
                        }
                        if (var625 == 1607) {
                            field2998[var2++] = var90.field5164;
                            continue;
                        }
                        if (var625 == 1608) {
                            field2998[var2++] = var90.field5108;
                            continue;
                        }
                        if (var625 == 1609) {
                            field2998[var2++] = var90.field5142;
                            continue;
                        }
                        if (var625 == 1610) {
                            field2998[var2++] = var90.field5097;
                            continue;
                        }
                        if (var625 == 1611) {
                            field2998[var2++] = var90.field5046;
                            continue;
                        }
                        if (var625 == 1612) {
                            field2998[var2++] = var90.field5098;
                            continue;
                        }
                    } else if (var625 < 1800) {
                        class363 var91 = var37 ? field2983 : field3000;
                        if (var625 == 1700) {
                            field2998[var2++] = var91.field5195;
                            continue;
                        }
                        if (var625 == 1701) {
                            if (var91.field5195 == -1) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var91.field5175;
                            }
                            continue;
                        }
                        if (var625 == 1702) {
                            field2998[var2++] = var91.field5047;
                            continue;
                        }
                    } else if (var625 < 1900) {
                        class363 var92 = var37 ? field2983 : field3000;
                        if (var625 == 1800) {
                            field2998[var2++] = client.method2321(var92).method474((byte) -32);
                            continue;
                        }
                        if (var625 == 1801) {
                            var2--;
                            int var93 = field2998[var2];
                            int var626 = var93 - 1;
                            if (var92.field5196 != null && var626 < var92.field5196.length && var92.field5196[var626] != null) {
                                field3001[var3++] = var92.field5196[var626];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 1802) {
                            if (var92.field5115 == null) {
                                field3001[var3++] = "";
                            } else {
                                field3001[var3++] = var92.field5115;
                            }
                            continue;
                        }
                    } else if (var625 < 2600) {
                        var2--;
                        class363 var94 = class292.method1804((byte) -70, field2998[var2]);
                        if (var625 == 2500) {
                            field2998[var2++] = var94.field5145;
                            continue;
                        }
                        if (var625 == 2501) {
                            field2998[var2++] = var94.field5183;
                            continue;
                        }
                        if (var625 == 2502) {
                            field2998[var2++] = var94.field5101;
                            continue;
                        }
                        if (var625 == 2503) {
                            field2998[var2++] = var94.field5200;
                            continue;
                        }
                        if (var625 == 2504) {
                            field2998[var2++] = var94.field5179 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 2505) {
                            field2998[var2++] = var94.field5062;
                            continue;
                        }
                    } else if (var625 < 2700) {
                        var2--;
                        class363 var95 = class292.method1804((byte) -77, field2998[var2]);
                        if (var625 == 2600) {
                            field2998[var2++] = var95.field5111;
                            continue;
                        }
                        if (var625 == 2601) {
                            field2998[var2++] = var95.field5186;
                            continue;
                        }
                        if (var625 == 2602) {
                            field3001[var3++] = var95.field5123;
                            continue;
                        }
                        if (var625 == 2603) {
                            field2998[var2++] = var95.field5116;
                            continue;
                        }
                        if (var625 == 2604) {
                            field2998[var2++] = var95.field5114;
                            continue;
                        }
                        if (var625 == 2605) {
                            field2998[var2++] = var95.field5126;
                            continue;
                        }
                        if (var625 == 2606) {
                            field2998[var2++] = var95.field5075;
                            continue;
                        }
                        if (var625 == 2607) {
                            field2998[var2++] = var95.field5164;
                            continue;
                        }
                        if (var625 == 2608) {
                            field2998[var2++] = var95.field5108;
                            continue;
                        }
                        if (var625 == 2609) {
                            field2998[var2++] = var95.field5142;
                            continue;
                        }
                        if (var625 == 2610) {
                            field2998[var2++] = var95.field5097;
                            continue;
                        }
                        if (var625 == 2611) {
                            field2998[var2++] = var95.field5046;
                            continue;
                        }
                        if (var625 == 2612) {
                            field2998[var2++] = var95.field5098;
                            continue;
                        }
                    } else if (var625 < 2800) {
                        if (var625 == 2700) {
                            var2--;
                            class363 var96 = class292.method1804((byte) -116, field2998[var2]);
                            field2998[var2++] = var96.field5195;
                            continue;
                        }
                        if (var625 == 2701) {
                            var2--;
                            class363 var97 = class292.method1804((byte) -62, field2998[var2]);
                            if (var97.field5195 == -1) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var97.field5175;
                            }
                            continue;
                        }
                        if (var625 == 2702) {
                            var2--;
                            int var98 = field2998[var2];
                            class465 var99 = (class465) class231.field3258.method2614((long) var98, 29);
                            if (var99 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = 1;
                            }
                            continue;
                        }
                        if (var625 == 2703) {
                            var2--;
                            class363 var100 = class292.method1804((byte) -118, field2998[var2]);
                            if (var100.field5113 == null) {
                                field2998[var2++] = 0;
                                continue;
                            }
                            int var101 = var100.field5113.length;
                            for (int var102 = 0; var102 < var100.field5113.length; var102++) {
                                if (var100.field5113[var102] == null) {
                                    var101 = var102;
                                    break;
                                }
                            }
                            field2998[var2++] = var101;
                            continue;
                        }
                        if (var625 == 2704 || var625 == 2705) {
                            var2 -= 2;
                            int var103 = field2998[var2];
                            int var104 = field2998[var2 + 1];
                            class465 var105 = (class465) class231.field3258.method2614((long) var103, -112);
                            if (var105 != null && var105.field6527 == var104) {
                                field2998[var2++] = 1;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                    } else if (var625 < 2900) {
                        var2--;
                        class363 var106 = class292.method1804((byte) -119, field2998[var2]);
                        if (var625 == 2800) {
                            field2998[var2++] = client.method2321(var106).method474((byte) -32);
                            continue;
                        }
                        if (var625 == 2801) {
                            var2--;
                            int var107 = field2998[var2];
                            int var627 = var107 - 1;
                            if (var106.field5196 != null && var627 < var106.field5196.length && var106.field5196[var627] != null) {
                                field3001[var3++] = var106.field5196[var627];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 2802) {
                            if (var106.field5115 == null) {
                                field3001[var3++] = "";
                            } else {
                                field3001[var3++] = var106.field5115;
                            }
                            continue;
                        }
                    } else if (var625 < 3200) {
                        if (var625 == 3100) {
                            var3--;
                            String var108 = field3001[var3];
                            class465.method2743(var108, -86);
                            continue;
                        }
                        if (var625 == 3101) {
                            var2 -= 2;
                            class487.method2865(field2998[var2], field2998[var2 + 1], 40, class2.field21);
                            continue;
                        }
                        if (var625 == 3103) {
                            class245.method1531(true, true);
                            continue;
                        }
                        if (var625 == 3104) {
                            var3--;
                            String var109 = field3001[var3];
                            int var110 = 0;
                            if (class363.method2207(var109, -123)) {
                                var110 = class168.method1039(var109, false);
                            }
                            field2996++;
                            class131.method793(class78.field1183, -90);
                            class366.field5214.method2481(var110, true);
                            continue;
                        }
                        if (var625 == 3105) {
                            var3--;
                            String var111 = field3001[var3];
                            field2991++;
                            class131.method793(class139.field1978, 94);
                            class366.field5214.method2470((byte) -74, var111.length() + 1);
                            class366.field5214.method2493((byte) 77, var111);
                            continue;
                        }
                        if (var625 == 3106) {
                            var3--;
                            String var112 = field3001[var3];
                            field2992++;
                            class131.method793(class389.field5489, -34);
                            class366.field5214.method2470((byte) -74, var112.length() + 1);
                            class366.field5214.method2493((byte) -119, var112);
                            continue;
                        }
                        if (var625 == 3107) {
                            var2--;
                            int var113 = field2998[var2];
                            var3--;
                            String var114 = field3001[var3];
                            class232.method1456(0, var114, var113);
                            continue;
                        }
                        if (var625 == 3108) {
                            var2 -= 3;
                            int var115 = field2998[var2];
                            int var116 = field2998[var2 + 1];
                            int var117 = field2998[var2 + 2];
                            class363 var118 = class292.method1804((byte) -46, var117);
                            class54.method425((byte) 123, var118, var116, var115);
                            continue;
                        }
                        if (var625 == 3109) {
                            var2 -= 2;
                            int var119 = field2998[var2];
                            int var120 = field2998[var2 + 1];
                            class363 var121 = var37 ? field2983 : field3000;
                            class54.method425((byte) 99, var121, var120, var119);
                            continue;
                        }
                        if (var625 == 3110) {
                            var2--;
                            int var122 = field2998[var2];
                            field2984++;
                            class131.method793(class2.field11, -108);
                            class366.field5214.method2462(var122, (byte) -123);
                            continue;
                        }
                        if (var625 == 3111) {
                            var2 -= 2;
                            int var123 = field2998[var2];
                            int var124 = field2998[var2 + 1];
                            class465 var125 = (class465) class231.field3258.method2614((long) var123, -82);
                            if (var125 != null) {
                                class480.method2829(var125, var125.field6527 != var124, (byte) 3, true);
                            }
                            class125.method762(var123, 3, 32313, true, var124);
                            continue;
                        }
                        if (var625 == 3112) {
                            var2--;
                            int var126 = field2998[var2];
                            class465 var127 = (class465) class231.field3258.method2614((long) var126, 71);
                            if (var127 != null && var127.field6530 == 3) {
                                class480.method2829(var127, true, (byte) 3, true);
                            }
                            continue;
                        }
                    } else if (var625 < 3300) {
                        if (var625 == 3200) {
                            var2 -= 3;
                            class445.method2590(10683, field2998[var2 + 2], 255, field2998[var2], field2998[var2 + 1]);
                            continue;
                        }
                        if (var625 == 3201) {
                            var2--;
                            class56.method430(field2998[var2], 255, -79);
                            continue;
                        }
                        if (var625 == 3202) {
                            var2 -= 2;
                            class194.method1238((byte) 81, field2998[var2], field2998[var2 + 1], 255);
                            continue;
                        }
                    } else if (var625 < 3400) {
                        if (var625 == 3300) {
                            field2998[var2++] = class356.field4972;
                            continue;
                        }
                        if (var625 == 3301) {
                            var2 -= 2;
                            int var128 = field2998[var2];
                            int var129 = field2998[var2 + 1];
                            field2998[var2++] = class460.method2721(var129, var128, false, true);
                            continue;
                        }
                        if (var625 == 3302) {
                            var2 -= 2;
                            int var130 = field2998[var2];
                            int var131 = field2998[var2 + 1];
                            field2998[var2++] = class67.method475(false, var130, var131, 51);
                            continue;
                        }
                        if (var625 == 3303) {
                            var2 -= 2;
                            int var132 = field2998[var2];
                            int var133 = field2998[var2 + 1];
                            field2998[var2++] = class180.method1179(false, var133, var132, (byte) 124);
                            continue;
                        }
                        if (var625 == 3304) {
                            var2--;
                            int var134 = field2998[var2];
                            field2998[var2++] = class101.field1446.method81((byte) 111, var134).field4647;
                            continue;
                        }
                        if (var625 == 3305) {
                            var2--;
                            int var135 = field2998[var2];
                            field2998[var2++] = class67.field999[var135];
                            continue;
                        }
                        if (var625 == 3306) {
                            var2--;
                            int var136 = field2998[var2];
                            field2998[var2++] = class29.field470[var136];
                            continue;
                        }
                        if (var625 == 3307) {
                            var2--;
                            int var137 = field2998[var2];
                            field2998[var2++] = class162.field2324[var137];
                            continue;
                        }
                        if (var625 == 3308) {
                            byte var138 = class2.field21.field6766;
                            int var139 = (class2.field21.field6765 >> 7) + class153.field2204;
                            int var140 = (class2.field21.field6746 >> 7) + class325.field4472;
                            field2998[var2++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var625 == 3309) {
                            var2--;
                            int var141 = field2998[var2];
                            field2998[var2++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3310) {
                            var2--;
                            int var142 = field2998[var2];
                            field2998[var2++] = var142 >> 28;
                            continue;
                        }
                        if (var625 == 3311) {
                            var2--;
                            int var143 = field2998[var2];
                            field2998[var2++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3312) {
                            field2998[var2++] = class319.field4371 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3313) {
                            var2 -= 2;
                            int var144 = field2998[var2];
                            int var145 = field2998[var2 + 1];
                            field2998[var2++] = class460.method2721(var145, var144, true, true);
                            continue;
                        }
                        if (var625 == 3314) {
                            var2 -= 2;
                            int var146 = field2998[var2];
                            int var147 = field2998[var2 + 1];
                            field2998[var2++] = class67.method475(true, var146, var147, 19);
                            continue;
                        }
                        if (var625 == 3315) {
                            var2 -= 2;
                            int var148 = field2998[var2];
                            int var149 = field2998[var2 + 1];
                            field2998[var2++] = class180.method1179(true, var149, var148, (byte) 124);
                            continue;
                        }
                        if (var625 == 3316) {
                            if (class159.field2292 >= 2) {
                                field2998[var2++] = class159.field2292;
                            } else {
                                field2998[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 3317) {
                            field2998[var2++] = class310.field4245;
                            continue;
                        }
                        if (var625 == 3318) {
                            field2998[var2++] = class355.field4955;
                            continue;
                        }
                        if (var625 == 3321) {
                            field2998[var2++] = class334.field4584;
                            continue;
                        }
                        if (var625 == 3322) {
                            field2998[var2++] = class242.field3423;
                            continue;
                        }
                        if (var625 == 3323) {
                            if (class285.field3902 >= 5 && class285.field3902 <= 9) {
                                field2998[var2++] = 1;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3324) {
                            if (class285.field3902 >= 5 && class285.field3902 <= 9) {
                                field2998[var2++] = class285.field3902;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3325) {
                            field2998[var2++] = class9.field185 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3326) {
                            field2998[var2++] = class2.field21.field392;
                            continue;
                        }
                        if (var625 == 3327) {
                            field2998[var2++] = class2.field21.field400.field257 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3328) {
                            field2998[var2++] = class205.field2942 && !class78.field1185 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3329) {
                            field2998[var2++] = class42.field719 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3330) {
                            var2--;
                            int var150 = field2998[var2];
                            field2998[var2++] = class254.method1580(false, var150, false);
                            continue;
                        }
                        if (var625 == 3331) {
                            var2 -= 2;
                            int var151 = field2998[var2];
                            int var152 = field2998[var2 + 1];
                            field2998[var2++] = class241.method1508(-128, var152, false, var151, false);
                            continue;
                        }
                        if (var625 == 3332) {
                            var2 -= 2;
                            int var153 = field2998[var2];
                            int var154 = field2998[var2 + 1];
                            field2998[var2++] = class241.method1508(-128, var154, false, var153, true);
                            continue;
                        }
                        if (var625 == 3333) {
                            field2998[var2++] = class323.field4438;
                            continue;
                        }
                        if (var625 == 3335) {
                            field2998[var2++] = class487.field6867;
                            continue;
                        }
                        if (var625 == 3336) {
                            var2 -= 4;
                            int var155 = field2998[var2];
                            int var156 = field2998[var2 + 1];
                            int var157 = field2998[var2 + 2];
                            int var158 = field2998[var2 + 3];
                            int var159 = (var156 << 14) + var155;
                            int var160 = (var157 << 28) + var159;
                            int var161 = var158 + var160;
                            field2998[var2++] = var161;
                            continue;
                        }
                        if (var625 == 3337) {
                            field2998[var2++] = class303.field4156;
                            continue;
                        }
                        if (var625 == 3338) {
                            field2998[var2++] = class245.method1526(13712);
                            continue;
                        }
                    } else if (var625 < 3500) {
                        if (var625 == 3400) {
                            var2 -= 2;
                            int var162 = field2998[var2];
                            int var163 = field2998[var2 + 1];
                            class310 var164 = class293.field4024.method1761(var162, false);
                            field3001[var3++] = var164.method1874(false, var163);
                            continue;
                        }
                        if (var625 == 3408) {
                            var2 -= 4;
                            int var165 = field2998[var2];
                            int var166 = field2998[var2 + 1];
                            int var167 = field2998[var2 + 2];
                            int var168 = field2998[var2 + 3];
                            class310 var169 = class293.field4024.method1761(var167, false);
                            if (var169.field4242 == var165 && var169.field4227 == var166) {
                                if (var166 == 115) {
                                    field3001[var3++] = var169.method1874(false, var168);
                                } else {
                                    field2998[var2++] = var169.method1873(var168, 20916);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var625 == 3409) {
                            var2 -= 3;
                            int var170 = field2998[var2];
                            int var171 = field2998[var2 + 1];
                            int var172 = field2998[var2 + 2];
                            if (var171 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class310 var173 = class293.field4024.method1761(var171, false);
                            if (var173.field4227 != var170) {
                                throw new RuntimeException("C3409-1");
                            }
                            field2998[var2++] = var173.method1876(var172, -106) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3410) {
                            var2--;
                            int var174 = field2998[var2];
                            var3--;
                            String var175 = field3001[var3];
                            if (var174 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class310 var176 = class293.field4024.method1761(var174, false);
                            if (var176.field4227 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field2998[var2++] = var176.method1870(var175, (byte) 91) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3411) {
                            var2--;
                            int var177 = field2998[var2];
                            class310 var178 = class293.field4024.method1761(var177, false);
                            field2998[var2++] = var178.field4246.method2621(-1);
                            continue;
                        }
                    } else if (var625 < 3700) {
                        if (var625 == 3600) {
                            if (class436.field5977 == 0) {
                                field2998[var2++] = -2;
                            } else if (class436.field5977 == 1) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = class205.field2934;
                            }
                            continue;
                        }
                        if (var625 == 3601) {
                            var2--;
                            int var179 = field2998[var2];
                            if (class436.field5977 == 2 && var179 < class205.field2934) {
                                field3001[var3++] = class321.field4403[var179];
                                if (class160.field2301[var179] == null) {
                                    field3001[var3++] = "";
                                } else {
                                    field3001[var3++] = class160.field2301[var179];
                                }
                                continue;
                            }
                            field3001[var3++] = "";
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3602) {
                            var2--;
                            int var180 = field2998[var2];
                            if (class436.field5977 == 2 && var180 < class205.field2934) {
                                field2998[var2++] = class439.field6023[var180];
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3603) {
                            var2--;
                            int var181 = field2998[var2];
                            if (class436.field5977 == 2 && var181 < class205.field2934) {
                                field2998[var2++] = class135.field1887[var181];
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3604) {
                            var3--;
                            String var182 = field3001[var3];
                            var2--;
                            int var183 = field2998[var2];
                            class314.method1898(var183, -1380671224, var182);
                            continue;
                        }
                        if (var625 == 3605) {
                            var3--;
                            String var184 = field3001[var3];
                            class154.method935(0, var184);
                            continue;
                        }
                        if (var625 == 3606) {
                            var3--;
                            String var185 = field3001[var3];
                            class178.method1165(var185, (byte) 37);
                            continue;
                        }
                        if (var625 == 3607) {
                            var3--;
                            String var186 = field3001[var3];
                            class341.method2022(101, var186, false);
                            continue;
                        }
                        if (var625 == 3608) {
                            var3--;
                            String var187 = field3001[var3];
                            class475.method2794(var187, (byte) 85);
                            continue;
                        }
                        if (var625 == 3609) {
                            var3--;
                            String var188 = field3001[var3];
                            if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                                var188 = var188.substring(7);
                            }
                            field2998[var2++] = class249.method1551(var188, true) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3610) {
                            var2--;
                            int var189 = field2998[var2];
                            if (class436.field5977 == 2 && var189 < class205.field2934) {
                                field3001[var3++] = class396.field5559[var189];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3611) {
                            if (class110.field1558 == null) {
                                field3001[var3++] = "";
                            } else {
                                field3001[var3++] = class225.method1416(120, class110.field1558);
                            }
                            continue;
                        }
                        if (var625 == 3612) {
                            if (class110.field1558 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = class226.field3202;
                            }
                            continue;
                        }
                        if (var625 == 3613) {
                            var2--;
                            int var190 = field2998[var2];
                            if (class110.field1558 != null && var190 < class226.field3202) {
                                field3001[var3++] = class64.field973[var190].field6787;
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3614) {
                            var2--;
                            int var191 = field2998[var2];
                            if (class110.field1558 != null && var191 < class226.field3202) {
                                field2998[var2++] = class64.field973[var191].field6786;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3615) {
                            var2--;
                            int var192 = field2998[var2];
                            if (class110.field1558 != null && var192 < class226.field3202) {
                                field2998[var2++] = class64.field973[var192].field6790;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3616) {
                            field2998[var2++] = class374.field5290;
                            continue;
                        }
                        if (var625 == 3617) {
                            var3--;
                            String var193 = field3001[var3];
                            class459.method2717(var193, 0);
                            continue;
                        }
                        if (var625 == 3618) {
                            field2998[var2++] = class429.field5917;
                            continue;
                        }
                        if (var625 == 3619) {
                            var3--;
                            String var194 = field3001[var3];
                            class280.method1750(false, var194);
                            continue;
                        }
                        if (var625 == 3620) {
                            class117.method742(-1);
                            continue;
                        }
                        if (var625 == 3621) {
                            if (class436.field5977 == 0) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = class161.field2315;
                            }
                            continue;
                        }
                        if (var625 == 3622) {
                            var2--;
                            int var195 = field2998[var2];
                            if (class436.field5977 != 0 && var195 < class161.field2315) {
                                field3001[var3++] = class181.field2624[var195];
                                if (class20.field353[var195] == null) {
                                    field3001[var3++] = "";
                                } else {
                                    field3001[var3++] = class20.field353[var195];
                                }
                                continue;
                            }
                            field3001[var3++] = "";
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3623) {
                            var3--;
                            String var196 = field3001[var3];
                            if (var196.startsWith("<img=0>") || var196.startsWith("<img=1>")) {
                                var196 = var196.substring(7);
                            }
                            field2998[var2++] = class261.method1612(var196, false) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3624) {
                            var2--;
                            int var197 = field2998[var2];
                            if (class64.field973 != null && var197 < class226.field3202 && class64.field973[var197].field6797.equalsIgnoreCase(class2.field21.field407)) {
                                field2998[var2++] = 1;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3625) {
                            if (class211.field2982 == null) {
                                field3001[var3++] = "";
                            } else {
                                field3001[var3++] = class211.field2982;
                            }
                            continue;
                        }
                        if (var625 == 3626) {
                            var2--;
                            int var198 = field2998[var2];
                            if (class110.field1558 != null && var198 < class226.field3202) {
                                field3001[var3++] = class64.field973[var198].field6791;
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3627) {
                            var2--;
                            int var199 = field2998[var2];
                            if (class436.field5977 == 2 && var199 >= 0 && var199 < class205.field2934) {
                                field2998[var2++] = class356.field4978[var199] ? 1 : 0;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3628) {
                            var3--;
                            String var200 = field3001[var3];
                            if (var200.startsWith("<img=0>") || var200.startsWith("<img=1>")) {
                                var200 = var200.substring(7);
                            }
                            field2998[var2++] = class39.method320(var200, (byte) -119);
                            continue;
                        }
                        if (var625 == 3629) {
                            field2998[var2++] = class474.field6642;
                            continue;
                        }
                        if (var625 == 3630) {
                            var3--;
                            String var201 = field3001[var3];
                            class341.method2022(119, var201, true);
                            continue;
                        }
                        if (var625 == 3631) {
                            var2--;
                            int var202 = field2998[var2];
                            field2998[var2++] = class289.field3960[var202] ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3632) {
                            var2--;
                            int var203 = field2998[var2];
                            if (class110.field1558 != null && var203 < class226.field3202) {
                                field3001[var3++] = class64.field973[var203].field6797;
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 3633) {
                            var2--;
                            int var204 = field2998[var2];
                            if (class436.field5977 != 0 && var204 < class161.field2315) {
                                field3001[var3++] = class353.field4928[var204];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                    } else if (var625 < 4000) {
                        if (var625 == 3903) {
                            var2--;
                            int var205 = field2998[var2];
                            field2998[var2++] = class259.field3617[var205].method2595((byte) 112);
                            continue;
                        }
                        if (var625 == 3904) {
                            var2--;
                            int var206 = field2998[var2];
                            field2998[var2++] = class259.field3617[var206].field6166;
                            continue;
                        }
                        if (var625 == 3905) {
                            var2--;
                            int var207 = field2998[var2];
                            field2998[var2++] = class259.field3617[var207].field6162;
                            continue;
                        }
                        if (var625 == 3906) {
                            var2--;
                            int var208 = field2998[var2];
                            field2998[var2++] = class259.field3617[var208].field6168;
                            continue;
                        }
                        if (var625 == 3907) {
                            var2--;
                            int var209 = field2998[var2];
                            field2998[var2++] = class259.field3617[var209].field6161;
                            continue;
                        }
                        if (var625 == 3908) {
                            var2--;
                            int var210 = field2998[var2];
                            field2998[var2++] = class259.field3617[var210].field6158;
                            continue;
                        }
                        if (var625 == 3910) {
                            var2--;
                            int var211 = field2998[var2];
                            int var212 = class259.field3617[var211].method2597(123);
                            field2998[var2++] = var212 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3911) {
                            var2--;
                            int var213 = field2998[var2];
                            int var214 = class259.field3617[var213].method2597(122);
                            field2998[var2++] = var214 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3912) {
                            var2--;
                            int var215 = field2998[var2];
                            int var216 = class259.field3617[var215].method2597(124);
                            field2998[var2++] = var216 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3913) {
                            var2--;
                            int var217 = field2998[var2];
                            int var218 = class259.field3617[var217].method2597(126);
                            field2998[var2++] = var218 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 4100) {
                        if (var625 == 4000) {
                            var2 -= 2;
                            int var219 = field2998[var2];
                            int var220 = field2998[var2 + 1];
                            field2998[var2++] = var219 + var220;
                            continue;
                        }
                        if (var625 == 4001) {
                            var2 -= 2;
                            int var221 = field2998[var2];
                            int var222 = field2998[var2 + 1];
                            field2998[var2++] = var221 - var222;
                            continue;
                        }
                        if (var625 == 4002) {
                            var2 -= 2;
                            int var223 = field2998[var2];
                            int var224 = field2998[var2 + 1];
                            field2998[var2++] = var223 * var224;
                            continue;
                        }
                        if (var625 == 4003) {
                            var2 -= 2;
                            int var225 = field2998[var2];
                            int var226 = field2998[var2 + 1];
                            field2998[var2++] = var225 / var226;
                            continue;
                        }
                        if (var625 == 4004) {
                            var2--;
                            int var227 = field2998[var2];
                            field2998[var2++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var625 == 4005) {
                            var2--;
                            int var228 = field2998[var2];
                            field2998[var2++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var625 == 4006) {
                            var2 -= 5;
                            int var229 = field2998[var2];
                            int var230 = field2998[var2 + 1];
                            int var231 = field2998[var2 + 2];
                            int var232 = field2998[var2 + 3];
                            int var233 = field2998[var2 + 4];
                            field2998[var2++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var625 == 4007) {
                            var2 -= 2;
                            long var234 = (long) field2998[var2];
                            long var236 = (long) field2998[var2 + 1];
                            field2998[var2++] = (int) (var234 * var236 / 100L + var234);
                            continue;
                        }
                        if (var625 == 4008) {
                            var2 -= 2;
                            int var238 = field2998[var2];
                            int var239 = field2998[var2 + 1];
                            field2998[var2++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var625 == 4009) {
                            var2 -= 2;
                            int var240 = field2998[var2];
                            int var241 = field2998[var2 + 1];
                            field2998[var2++] = var240 & -(0x1 << var241) - 1;
                            continue;
                        }
                        if (var625 == 4010) {
                            var2 -= 2;
                            int var242 = field2998[var2];
                            int var243 = field2998[var2 + 1];
                            field2998[var2++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 4011) {
                            var2 -= 2;
                            int var244 = field2998[var2];
                            int var245 = field2998[var2 + 1];
                            field2998[var2++] = var244 % var245;
                            continue;
                        }
                        if (var625 == 4012) {
                            var2 -= 2;
                            int var246 = field2998[var2];
                            int var247 = field2998[var2 + 1];
                            if (var246 == 0) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var625 == 4013) {
                            var2 -= 2;
                            int var248 = field2998[var2];
                            int var249 = field2998[var2 + 1];
                            if (var248 == 0) {
                                field2998[var2++] = 0;
                            } else if (var249 == 0) {
                                field2998[var2++] = Integer.MAX_VALUE;
                            } else {
                                field2998[var2++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var625 == 4014) {
                            var2 -= 2;
                            int var250 = field2998[var2];
                            int var251 = field2998[var2 + 1];
                            field2998[var2++] = var250 & var251;
                            continue;
                        }
                        if (var625 == 4015) {
                            var2 -= 2;
                            int var252 = field2998[var2];
                            int var253 = field2998[var2 + 1];
                            field2998[var2++] = var252 | var253;
                            continue;
                        }
                        if (var625 == 4016) {
                            var2 -= 2;
                            int var254 = field2998[var2];
                            int var255 = field2998[var2 + 1];
                            field2998[var2++] = var254 < var255 ? var254 : var255;
                            continue;
                        }
                        if (var625 == 4017) {
                            var2 -= 2;
                            int var256 = field2998[var2];
                            int var257 = field2998[var2 + 1];
                            field2998[var2++] = var256 > var257 ? var256 : var257;
                            continue;
                        }
                        if (var625 == 4018) {
                            var2 -= 3;
                            long var258 = (long) field2998[var2];
                            long var260 = (long) field2998[var2 + 1];
                            long var262 = (long) field2998[var2 + 2];
                            field2998[var2++] = (int) (var258 * var262 / var260);
                            continue;
                        }
                    } else if (var625 < 4200) {
                        if (var625 == 4100) {
                            var3--;
                            String var264 = field3001[var3];
                            var2--;
                            int var265 = field2998[var2];
                            field3001[var3++] = var264 + var265;
                            continue;
                        }
                        if (var625 == 4101) {
                            var3 -= 2;
                            String var266 = field3001[var3];
                            String var267 = field3001[var3 + 1];
                            field3001[var3++] = var266 + var267;
                            continue;
                        }
                        if (var625 == 4102) {
                            var3--;
                            String var268 = field3001[var3];
                            var2--;
                            int var269 = field2998[var2];
                            field3001[var3++] = var268 + class112.method696(true, var269, true);
                            continue;
                        }
                        if (var625 == 4103) {
                            var3--;
                            String var270 = field3001[var3];
                            field3001[var3++] = var270.toLowerCase();
                            continue;
                        }
                        if (var625 == 4104) {
                            var2--;
                            int var271 = field2998[var2];
                            long var272 = ((long) var271 + 11745L) * 86400000L;
                            field3005.setTime(new Date(var272));
                            int var274 = field3005.get(5);
                            int var275 = field3005.get(2);
                            int var276 = field3005.get(1);
                            field3001[var3++] = var274 + "-" + field3007[var275] + "-" + var276;
                            continue;
                        }
                        if (var625 == 4105) {
                            var3 -= 2;
                            String var277 = field3001[var3];
                            String var278 = field3001[var3 + 1];
                            if (class2.field21.field400 != null && class2.field21.field400.field257) {
                                field3001[var3++] = var278;
                                continue;
                            }
                            field3001[var3++] = var277;
                            continue;
                        }
                        if (var625 == 4106) {
                            var2--;
                            int var279 = field2998[var2];
                            field3001[var3++] = Integer.toString(var279);
                            continue;
                        }
                        if (var625 == 4107) {
                            var3 -= 2;
                            field2998[var2++] = class376.method2247(field3001[var3 + 1], -28609, field3001[var3], class487.field6867);
                            continue;
                        }
                        if (var625 == 4108) {
                            var3--;
                            String var280 = field3001[var3];
                            var2 -= 2;
                            int var281 = field2998[var2];
                            int var282 = field2998[var2 + 1];
                            class76 var283 = class231.method1450(55, class441.field6048, 0, var282);
                            field2998[var2++] = var283.method525(var280, var281, (byte) -118, class145.field2027);
                            continue;
                        }
                        if (var625 == 4109) {
                            var3--;
                            String var284 = field3001[var3];
                            var2 -= 2;
                            int var285 = field2998[var2];
                            int var286 = field2998[var2 + 1];
                            class76 var287 = class231.method1450(124, class441.field6048, 0, var286);
                            field2998[var2++] = var287.method527(var284, var285, 255, class145.field2027);
                            continue;
                        }
                        if (var625 == 4110) {
                            var3 -= 2;
                            String var288 = field3001[var3];
                            String var289 = field3001[var3 + 1];
                            var2--;
                            if (field2998[var2] == 1) {
                                field3001[var3++] = var288;
                            } else {
                                field3001[var3++] = var289;
                            }
                            continue;
                        }
                        if (var625 == 4111) {
                            var3--;
                            String var290 = field3001[var3];
                            field3001[var3++] = class418.method2439(var290, (byte) 123);
                            continue;
                        }
                        if (var625 == 4112) {
                            var3--;
                            String var291 = field3001[var3];
                            var2--;
                            int var292 = field2998[var2];
                            if (var292 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field3001[var3++] = var291 + (char) var292;
                            continue;
                        }
                        if (var625 == 4113) {
                            var2--;
                            int var293 = field2998[var2];
                            field2998[var2++] = class225.method1417((char) var293, -85) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4114) {
                            var2--;
                            int var294 = field2998[var2];
                            field2998[var2++] = class54.method420(35, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4115) {
                            var2--;
                            int var295 = field2998[var2];
                            field2998[var2++] = class181.method1189((char) var295, -42) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4116) {
                            var2--;
                            int var296 = field2998[var2];
                            field2998[var2++] = class394.method2354((char) var296, 61) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4117) {
                            var3--;
                            String var297 = field3001[var3];
                            if (var297 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var297.length();
                            }
                            continue;
                        }
                        if (var625 == 4118) {
                            var3--;
                            String var298 = field3001[var3];
                            var2 -= 2;
                            int var299 = field2998[var2];
                            int var300 = field2998[var2 + 1];
                            field3001[var3++] = var298.substring(var299, var300);
                            continue;
                        }
                        if (var625 == 4119) {
                            var3--;
                            String var301 = field3001[var3];
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
                            field3001[var3++] = var302.toString();
                            continue;
                        }
                        if (var625 == 4120) {
                            var3--;
                            String var306 = field3001[var3];
                            var2 -= 2;
                            int var307 = field2998[var2];
                            int var308 = field2998[var2 + 1];
                            field2998[var2++] = var306.indexOf(var307, var308);
                            continue;
                        }
                        if (var625 == 4121) {
                            var3 -= 2;
                            String var309 = field3001[var3];
                            String var310 = field3001[var3 + 1];
                            var2--;
                            int var311 = field2998[var2];
                            field2998[var2++] = var309.indexOf(var310, var311);
                            continue;
                        }
                        if (var625 == 4122) {
                            var2--;
                            int var312 = field2998[var2];
                            field2998[var2++] = Character.toLowerCase((char) var312);
                            continue;
                        }
                        if (var625 == 4123) {
                            var2--;
                            int var313 = field2998[var2];
                            field2998[var2++] = Character.toUpperCase((char) var313);
                            continue;
                        }
                        if (var625 == 4124) {
                            var2--;
                            boolean var314 = field2998[var2] != 0;
                            var2--;
                            int var315 = field2998[var2];
                            field3001[var3++] = class105.method672((long) var315, 0, -29245, var314, class487.field6867);
                            continue;
                        }
                        if (var625 == 4125) {
                            var3--;
                            String var316 = field3001[var3];
                            var2--;
                            int var317 = field2998[var2];
                            class76 var318 = class231.method1450(57, class441.field6048, 0, var317);
                            field2998[var2++] = var318.method524(class145.field2027, var316, 104);
                            continue;
                        }
                    } else if (var625 < 4300) {
                        if (var625 == 4200) {
                            var2--;
                            int var319 = field2998[var2];
                            field3001[var3++] = class58.field918.method344(var319, 31757).field2374;
                            continue;
                        }
                        if (var625 == 4201) {
                            var2 -= 2;
                            int var320 = field2998[var2];
                            int var321 = field2998[var2 + 1];
                            class164 var322 = class58.field918.method344(var320, 31757);
                            if (var321 >= 1 && var321 <= 5 && var322.field2376[var321 - 1] != null) {
                                field3001[var3++] = var322.field2376[var321 - 1];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 4202) {
                            var2 -= 2;
                            int var323 = field2998[var2];
                            int var324 = field2998[var2 + 1];
                            class164 var325 = class58.field918.method344(var323, 31757);
                            if (var324 >= 1 && var324 <= 5 && var325.field2406[var324 - 1] != null) {
                                field3001[var3++] = var325.field2406[var324 - 1];
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 4203) {
                            var2--;
                            int var326 = field2998[var2];
                            field2998[var2++] = class58.field918.method344(var326, 31757).field2393;
                            continue;
                        }
                        if (var625 == 4204) {
                            var2--;
                            int var327 = field2998[var2];
                            field2998[var2++] = class58.field918.method344(var327, 31757).field2401 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4205) {
                            var2--;
                            int var328 = field2998[var2];
                            class164 var329 = class58.field918.method344(var328, 31757);
                            if (var329.field2419 == -1 && var329.field2357 >= 0) {
                                field2998[var2++] = var329.field2357;
                                continue;
                            }
                            field2998[var2++] = var328;
                            continue;
                        }
                        if (var625 == 4206) {
                            var2--;
                            int var330 = field2998[var2];
                            class164 var331 = class58.field918.method344(var330, 31757);
                            if (var331.field2419 >= 0 && var331.field2357 >= 0) {
                                field2998[var2++] = var331.field2357;
                                continue;
                            }
                            field2998[var2++] = var330;
                            continue;
                        }
                        if (var625 == 4207) {
                            var2--;
                            int var332 = field2998[var2];
                            field2998[var2++] = class58.field918.method344(var332, 31757).field2407 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4208) {
                            var2 -= 2;
                            int var333 = field2998[var2];
                            int var334 = field2998[var2 + 1];
                            class307 var335 = class68.field1007.method963(var334, (byte) -114);
                            if (var335.method1861((byte) 49)) {
                                field3001[var3++] = class58.field918.method344(var333, 31757).method1008(86, var334, var335.field4206);
                            } else {
                                field2998[var2++] = class58.field918.method344(var333, 31757).method997(var335.field4199, (byte) -21, var334);
                            }
                            continue;
                        }
                        if (var625 == 4209) {
                            var2 -= 2;
                            int var336 = field2998[var2];
                            int var337 = field2998[var2 + 1] - 1;
                            class164 var338 = class58.field918.method344(var336, 31757);
                            if (var338.field2360 == var337) {
                                field2998[var2++] = var338.field2415;
                            } else if (var338.field2423 == var337) {
                                field2998[var2++] = var338.field2354;
                            } else {
                                field2998[var2++] = -1;
                            }
                            continue;
                        }
                        if (var625 == 4210) {
                            var3--;
                            String var339 = field3001[var3];
                            var2--;
                            int var340 = field2998[var2];
                            class439.method2553(var339, var340 == 1, -1);
                            field2998[var2++] = class445.field6146;
                            continue;
                        }
                        if (var625 == 4211) {
                            if (class292.field4011 != null && class330.field4545 < class445.field6146) {
                                field2998[var2++] = class292.field4011[class330.field4545++] & 0xFFFF;
                                continue;
                            }
                            field2998[var2++] = -1;
                            continue;
                        }
                        if (var625 == 4212) {
                            class330.field4545 = 0;
                            continue;
                        }
                    } else if (var625 < 4400) {
                        if (var625 == 4300) {
                            var2 -= 2;
                            int var341 = field2998[var2];
                            int var342 = field2998[var2 + 1];
                            class307 var343 = class68.field1007.method963(var342, (byte) -112);
                            if (var343.method1861((byte) 31)) {
                                field3001[var3++] = class467.field6550.method1359(var341, true).method775(var342, var343.field4206, (byte) 46);
                            } else {
                                field2998[var2++] = class467.field6550.method1359(var341, true).method769(var343.field4199, var342, true);
                            }
                            continue;
                        }
                    } else if (var625 < 4500) {
                        if (var625 == 4400) {
                            var2 -= 2;
                            int var344 = field2998[var2];
                            int var345 = field2998[var2 + 1];
                            class307 var346 = class68.field1007.method963(var345, (byte) -101);
                            if (var346.method1861((byte) 118)) {
                                field3001[var3++] = class304.field4160.method2075(var344, false).method2791(var345, var346.field4206, 2);
                            } else {
                                field2998[var2++] = class304.field4160.method2075(var344, false).method2789(var346.field4199, var345, true);
                            }
                            continue;
                        }
                    } else if (var625 < 4600) {
                        if (var625 == 4500) {
                            var2 -= 2;
                            int var347 = field2998[var2];
                            int var348 = field2998[var2 + 1];
                            class307 var349 = class68.field1007.method963(var348, (byte) 109);
                            if (var349.method1861((byte) 89)) {
                                field3001[var3++] = class375.field5314.method2357(var347, (byte) -42).method2520(var348, (byte) -12, var349.field4206);
                            } else {
                                field2998[var2++] = class375.field5314.method2357(var347, (byte) -42).method2516(var348, var349.field4199, (byte) 93);
                            }
                            continue;
                        }
                    } else if (var625 < 4700) {
                        if (var625 == 4600) {
                            var2--;
                            int var350 = field2998[var2];
                            class318 var351 = class363.field5161.method2806(var350, -87);
                            if (var351.field4335 != null && var351.field4335.length > 0) {
                                int var352 = 0;
                                int var353 = var351.field4327[0];
                                for (int var354 = 1; var354 < var351.field4335.length; var354++) {
                                    if (var351.field4327[var354] > var353) {
                                        var352 = var354;
                                        var353 = var351.field4327[var354];
                                    }
                                }
                                field2998[var2++] = var351.field4335[var352];
                                continue;
                            }
                            field2998[var2++] = var351.field4339;
                            continue;
                        }
                    } else if (var625 < 5100) {
                        if (var625 == 5000) {
                            field2998[var2++] = class436.field5986;
                            continue;
                        }
                        if (var625 == 5001) {
                            var2 -= 3;
                            class436.field5986 = field2998[var2];
                            class196.field2802 = field2998[var2 + 1];
                            class148.field2090 = field2998[var2 + 2];
                            field2999++;
                            class131.method793(class75.field1133, 117);
                            class366.field5214.method2470((byte) -74, class436.field5986);
                            class366.field5214.method2470((byte) -74, class196.field2802);
                            class366.field5214.method2470((byte) -74, class148.field2090);
                            continue;
                        }
                        if (var625 == 5002) {
                            var3 -= 2;
                            String var355 = field3001[var3];
                            String var356 = field3001[var3 + 1];
                            var2 -= 2;
                            int var357 = field2998[var2];
                            int var358 = field2998[var2 + 1];
                            if (var356 == null) {
                                var356 = "";
                            }
                            if (var356.length() > 80) {
                                var356 = var356.substring(0, 80);
                            }
                            field2990++;
                            class131.method793(class336.field4606, 124);
                            class366.field5214.method2470((byte) -74, class42.method349(var355, 1) + class42.method349(var356, 1) + 2);
                            class366.field5214.method2493((byte) -121, var355);
                            class366.field5214.method2470((byte) -74, var357 - 1);
                            class366.field5214.method2470((byte) -74, var358);
                            class366.field5214.method2493((byte) -119, var356);
                            continue;
                        }
                        if (var625 == 5003) {
                            var2--;
                            int var359 = field2998[var2];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = class265.field3686[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field3001[var3++] = var360;
                            continue;
                        }
                        if (var625 == 5004) {
                            var2--;
                            int var361 = field2998[var2];
                            int var362 = -1;
                            if (var361 < 100 && class265.field3686[var361] != null) {
                                var362 = class418.field5747[var361];
                            }
                            field2998[var2++] = var362;
                            continue;
                        }
                        if (var625 == 5005) {
                            field2998[var2++] = class196.field2802;
                            continue;
                        }
                        if (var625 == 5008) {
                            var3--;
                            String var363 = field3001[var3];
                            if (class159.field2292 == 0 && (class205.field2942 && !class78.field1185 || class42.field719)) {
                                continue;
                            }
                            String var364 = var363.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class21.field364.method695(-115, 0))) {
                                var365 = 0;
                                var363 = var363.substring(class21.field364.method695(-128, 0).length());
                            } else if (var364.startsWith(class445.field6141.method695(-118, 0))) {
                                var365 = 1;
                                var363 = var363.substring(class445.field6141.method695(-119, 0).length());
                            } else if (var364.startsWith(class299.field4108.method695(-125, 0))) {
                                var365 = 2;
                                var363 = var363.substring(class299.field4108.method695(-113, 0).length());
                            } else if (var364.startsWith(class456.field6304.method695(-122, 0))) {
                                var365 = 3;
                                var363 = var363.substring(class456.field6304.method695(-115, 0).length());
                            } else if (var364.startsWith(class239.field3366.method695(-117, 0))) {
                                var365 = 4;
                                var363 = var363.substring(class239.field3366.method695(-123, 0).length());
                            } else if (var364.startsWith(class305.field4178.method695(-117, 0))) {
                                var365 = 5;
                                var363 = var363.substring(class305.field4178.method695(-121, 0).length());
                            } else if (var364.startsWith(class168.field2490.method695(-119, 0))) {
                                var365 = 6;
                                var363 = var363.substring(class168.field2490.method695(-128, 0).length());
                            } else if (var364.startsWith(class353.field4907.method695(-124, 0))) {
                                var365 = 7;
                                var363 = var363.substring(class353.field4907.method695(-114, 0).length());
                            } else if (var364.startsWith(class472.field6617.method695(-119, 0))) {
                                var365 = 8;
                                var363 = var363.substring(class472.field6617.method695(-123, 0).length());
                            } else if (var364.startsWith(class204.field2927.method695(-127, 0))) {
                                var365 = 9;
                                var363 = var363.substring(class204.field2927.method695(-123, 0).length());
                            } else if (var364.startsWith(class394.field5536.method695(-116, 0))) {
                                var365 = 10;
                                var363 = var363.substring(class394.field5536.method695(-115, 0).length());
                            } else if (var364.startsWith(class290.field3985.method695(-125, 0))) {
                                var365 = 11;
                                var363 = var363.substring(class290.field3985.method695(-117, 0).length());
                            } else if (class487.field6867 != 0) {
                                if (var364.startsWith(class21.field364.method695(-123, class487.field6867))) {
                                    var365 = 0;
                                    var363 = var363.substring(class21.field364.method695(-123, class487.field6867).length());
                                } else if (var364.startsWith(class445.field6141.method695(-117, class487.field6867))) {
                                    var365 = 1;
                                    var363 = var363.substring(class445.field6141.method695(-119, class487.field6867).length());
                                } else if (var364.startsWith(class299.field4108.method695(-118, class487.field6867))) {
                                    var365 = 2;
                                    var363 = var363.substring(class299.field4108.method695(-113, class487.field6867).length());
                                } else if (var364.startsWith(class456.field6304.method695(-118, class487.field6867))) {
                                    var365 = 3;
                                    var363 = var363.substring(class456.field6304.method695(-121, class487.field6867).length());
                                } else if (var364.startsWith(class239.field3366.method695(-120, class487.field6867))) {
                                    var365 = 4;
                                    var363 = var363.substring(class239.field3366.method695(-124, class487.field6867).length());
                                } else if (var364.startsWith(class305.field4178.method695(-121, class487.field6867))) {
                                    var365 = 5;
                                    var363 = var363.substring(class305.field4178.method695(-126, class487.field6867).length());
                                } else if (var364.startsWith(class168.field2490.method695(-114, class487.field6867))) {
                                    var365 = 6;
                                    var363 = var363.substring(class168.field2490.method695(-114, class487.field6867).length());
                                } else if (var364.startsWith(class353.field4907.method695(-113, class487.field6867))) {
                                    var365 = 7;
                                    var363 = var363.substring(class353.field4907.method695(-112, class487.field6867).length());
                                } else if (var364.startsWith(class472.field6617.method695(-126, class487.field6867))) {
                                    var365 = 8;
                                    var363 = var363.substring(class472.field6617.method695(-116, class487.field6867).length());
                                } else if (var364.startsWith(class204.field2927.method695(-120, class487.field6867))) {
                                    var365 = 9;
                                    var363 = var363.substring(class204.field2927.method695(-122, class487.field6867).length());
                                } else if (var364.startsWith(class394.field5536.method695(-117, class487.field6867))) {
                                    var365 = 10;
                                    var363 = var363.substring(class394.field5536.method695(-128, class487.field6867).length());
                                } else if (var364.startsWith(class290.field3985.method695(-115, class487.field6867))) {
                                    var365 = 11;
                                    var363 = var363.substring(class290.field3985.method695(-122, class487.field6867).length());
                                }
                            }
                            String var366 = var363.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class250.field3513.method695(-119, 0))) {
                                var367 = 1;
                                var363 = var363.substring(class250.field3513.method695(-119, 0).length());
                            } else if (var366.startsWith(class249.field3491.method695(-116, 0))) {
                                var367 = 2;
                                var363 = var363.substring(class249.field3491.method695(-128, 0).length());
                            } else if (var366.startsWith(class317.field4303.method695(-121, 0))) {
                                var367 = 3;
                                var363 = var363.substring(class317.field4303.method695(-114, 0).length());
                            } else if (var366.startsWith(class38.field655.method695(-115, 0))) {
                                var367 = 4;
                                var363 = var363.substring(class38.field655.method695(-112, 0).length());
                            } else if (var366.startsWith(class317.field4300.method695(-115, 0))) {
                                var367 = 5;
                                var363 = var363.substring(class317.field4300.method695(-128, 0).length());
                            } else if (class487.field6867 != 0) {
                                if (var366.startsWith(class250.field3513.method695(-117, class487.field6867))) {
                                    var367 = 1;
                                    var363 = var363.substring(class250.field3513.method695(-127, class487.field6867).length());
                                } else if (var366.startsWith(class249.field3491.method695(-115, class487.field6867))) {
                                    var367 = 2;
                                    var363 = var363.substring(class249.field3491.method695(-128, class487.field6867).length());
                                } else if (var366.startsWith(class317.field4303.method695(-117, class487.field6867))) {
                                    var367 = 3;
                                    var363 = var363.substring(class317.field4303.method695(-125, class487.field6867).length());
                                } else if (var366.startsWith(class38.field655.method695(-115, class487.field6867))) {
                                    var367 = 4;
                                    var363 = var363.substring(class38.field655.method695(-115, class487.field6867).length());
                                } else if (var366.startsWith(class317.field4300.method695(-122, class487.field6867))) {
                                    var367 = 5;
                                    var363 = var363.substring(class317.field4300.method695(-127, class487.field6867).length());
                                }
                            }
                            field2993++;
                            class131.method793(class214.field3035, -69);
                            class366.field5214.method2470((byte) -74, 0);
                            int var368 = class366.field5214.field5830;
                            class366.field5214.method2470((byte) -74, var365);
                            class366.field5214.method2470((byte) -74, var367);
                            class42.method350(false, var363, class366.field5214);
                            class366.field5214.method2504(class366.field5214.field5830 - var368, 1);
                            continue;
                        }
                        if (var625 == 5009) {
                            var3 -= 2;
                            String var369 = field3001[var3];
                            String var370 = field3001[var3 + 1];
                            if (class159.field2292 != 0 || (!class205.field2942 || class78.field1185) && !class42.field719) {
                                field2987++;
                                class131.method793(class138.field1964, 111);
                                class366.field5214.method2470((byte) -74, 0);
                                int var371 = class366.field5214.field5830;
                                class366.field5214.method2493((byte) -125, var369);
                                class42.method350(false, var370, class366.field5214);
                                class366.field5214.method2504(class366.field5214.field5830 - var371, 1);
                            }
                            continue;
                        }
                        if (var625 == 5010) {
                            var2--;
                            int var372 = field2998[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class48.field784[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field3001[var3++] = var373;
                            continue;
                        }
                        if (var625 == 5011) {
                            var2--;
                            int var374 = field2998[var2];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = class166.field2441[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field3001[var3++] = var375;
                            continue;
                        }
                        if (var625 == 5012) {
                            var2--;
                            int var376 = field2998[var2];
                            int var377 = -1;
                            if (var376 < 100) {
                                var377 = class133.field1881[var376];
                            }
                            field2998[var2++] = var377;
                            continue;
                        }
                        if (var625 == 5015) {
                            String var378;
                            if (class2.field21 == null || class2.field21.field413 == null) {
                                var378 = class383.field5440;
                            } else {
                                var378 = class2.field21.method207(124, true);
                            }
                            field3001[var3++] = var378;
                            continue;
                        }
                        if (var625 == 5016) {
                            field2998[var2++] = class148.field2090;
                            continue;
                        }
                        if (var625 == 5017) {
                            field2998[var2++] = class55.field889;
                            continue;
                        }
                        if (var625 == 5018) {
                            var2--;
                            int var379 = field2998[var2];
                            int var380 = 0;
                            if (var379 < 100 && class265.field3686[var379] != null) {
                                var380 = class418.field5747[var379];
                            }
                            field2998[var2++] = var380;
                            continue;
                        }
                        if (var625 == 5019) {
                            var2--;
                            int var381 = field2998[var2];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = class224.field3182[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field3001[var3++] = var382;
                            continue;
                        }
                        if (var625 == 5020) {
                            String var383;
                            if (class2.field21 == null || class2.field21.field413 == null) {
                                var383 = class383.field5440;
                            } else {
                                var383 = class2.field21.method187(false, false);
                            }
                            field3001[var3++] = var383;
                            continue;
                        }
                        if (var625 == 5050) {
                            var2--;
                            int var384 = field2998[var2];
                            field3001[var3++] = class478.method2808(0, var384).field2886;
                            continue;
                        }
                        if (var625 == 5051) {
                            var2--;
                            int var385 = field2998[var2];
                            class202 var386 = class478.method2808(0, var385);
                            if (var386.field2894 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var386.field2894.length;
                            }
                            continue;
                        }
                        if (var625 == 5052) {
                            var2 -= 2;
                            int var387 = field2998[var2];
                            int var388 = field2998[var2 + 1];
                            class202 var389 = class478.method2808(0, var387);
                            int var390 = var389.field2894[var388];
                            field2998[var2++] = var390;
                            continue;
                        }
                        if (var625 == 5053) {
                            var2--;
                            int var391 = field2998[var2];
                            class202 var392 = class478.method2808(0, var391);
                            if (var392.field2885 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var392.field2885.length;
                            }
                            continue;
                        }
                        if (var625 == 5054) {
                            var2 -= 2;
                            int var393 = field2998[var2];
                            int var394 = field2998[var2 + 1];
                            field2998[var2++] = class478.method2808(0, var393).field2885[var394];
                            continue;
                        }
                        if (var625 == 5055) {
                            var2--;
                            int var395 = field2998[var2];
                            field3001[var3++] = class148.method913(var395, -126).method2320(-1);
                            continue;
                        }
                        if (var625 == 5056) {
                            var2--;
                            int var396 = field2998[var2];
                            class389 var397 = class148.method913(var396, 106);
                            if (var397.field5467 == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var397.field5467.length;
                            }
                            continue;
                        }
                        if (var625 == 5057) {
                            var2 -= 2;
                            int var398 = field2998[var2];
                            int var399 = field2998[var2 + 1];
                            field2998[var2++] = class148.method913(var398, 98).field5467[var399];
                            continue;
                        }
                        if (var625 == 5058) {
                            field2989 = new class125();
                            var2--;
                            field2989.field1714 = field2998[var2];
                            field2989.field1715 = class148.method913(field2989.field1714, 88);
                            field2989.field1718 = new int[field2989.field1715.method2312(-89)];
                            continue;
                        }
                        if (var625 == 5059) {
                            field3002++;
                            class131.method793(client.field5513, 77);
                            class366.field5214.method2470((byte) -74, 0);
                            int var400 = class366.field5214.field5830;
                            class366.field5214.method2470((byte) -74, 0);
                            class366.field5214.method2462(field2989.field1714, (byte) -123);
                            field2989.field1715.method2316(0, class366.field5214, field2989.field1718);
                            class366.field5214.method2504(class366.field5214.field5830 - var400, 1);
                            continue;
                        }
                        if (var625 == 5060) {
                            var3--;
                            String var401 = field3001[var3];
                            field2986++;
                            class131.method793(class303.field4155, 111);
                            class366.field5214.method2470((byte) -74, 0);
                            int var402 = class366.field5214.field5830;
                            class366.field5214.method2493((byte) -126, var401);
                            class366.field5214.method2462(field2989.field1714, (byte) -123);
                            field2989.field1715.method2316(0, class366.field5214, field2989.field1718);
                            class366.field5214.method2504(class366.field5214.field5830 - var402, 1);
                            continue;
                        }
                        if (var625 == 5061) {
                            field3002++;
                            class131.method793(client.field5513, -80);
                            class366.field5214.method2470((byte) -74, 0);
                            int var403 = class366.field5214.field5830;
                            class366.field5214.method2470((byte) -74, 1);
                            class366.field5214.method2462(field2989.field1714, (byte) -123);
                            field2989.field1715.method2316(0, class366.field5214, field2989.field1718);
                            class366.field5214.method2504(class366.field5214.field5830 - var403, 1);
                            continue;
                        }
                        if (var625 == 5062) {
                            var2 -= 2;
                            int var404 = field2998[var2];
                            int var405 = field2998[var2 + 1];
                            field2998[var2++] = class478.method2808(0, var404).field2884[var405];
                            continue;
                        }
                        if (var625 == 5063) {
                            var2 -= 2;
                            int var406 = field2998[var2];
                            int var407 = field2998[var2 + 1];
                            field2998[var2++] = class478.method2808(0, var406).field2893[var407];
                            continue;
                        }
                        if (var625 == 5064) {
                            var2 -= 2;
                            int var408 = field2998[var2];
                            int var409 = field2998[var2 + 1];
                            if (var409 == -1) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = class478.method2808(0, var408).method1286(0, (char) var409);
                            }
                            continue;
                        }
                        if (var625 == 5065) {
                            var2 -= 2;
                            int var410 = field2998[var2];
                            int var411 = field2998[var2 + 1];
                            if (var411 == -1) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = class478.method2808(0, var410).method1281((char) var411, 119);
                            }
                            continue;
                        }
                        if (var625 == 5066) {
                            var2--;
                            int var412 = field2998[var2];
                            field2998[var2++] = class148.method913(var412, -88).method2312(-107);
                            continue;
                        }
                        if (var625 == 5067) {
                            var2 -= 2;
                            int var413 = field2998[var2];
                            int var414 = field2998[var2 + 1];
                            int var415 = class148.method913(var413, 92).method2319(var414, -1);
                            field2998[var2++] = var415;
                            continue;
                        }
                        if (var625 == 5068) {
                            var2 -= 2;
                            int var416 = field2998[var2];
                            int var417 = field2998[var2 + 1];
                            field2989.field1718[var416] = var417;
                            continue;
                        }
                        if (var625 == 5069) {
                            var2 -= 2;
                            int var418 = field2998[var2];
                            int var419 = field2998[var2 + 1];
                            field2989.field1718[var418] = var419;
                            continue;
                        }
                        if (var625 == 5070) {
                            var2 -= 3;
                            int var420 = field2998[var2];
                            int var421 = field2998[var2 + 1];
                            int var422 = field2998[var2 + 2];
                            class389 var423 = class148.method913(var420, -70);
                            if (var423.method2319(var421, -1) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field2998[var2++] = var423.method2311(var422, (byte) -82, var421);
                            continue;
                        }
                        if (var625 == 5071) {
                            var3--;
                            String var424 = field3001[var3];
                            var2--;
                            boolean var425 = field2998[var2] == 1;
                            class240.method1502(var424, -1, var425);
                            field2998[var2++] = class445.field6146;
                            continue;
                        }
                        if (var625 == 5072) {
                            if (class292.field4011 != null && class330.field4545 < class445.field6146) {
                                field2998[var2++] = class292.field4011[class330.field4545++] & 0xFFFF;
                                continue;
                            }
                            field2998[var2++] = -1;
                            continue;
                        }
                        if (var625 == 5073) {
                            class330.field4545 = 0;
                            continue;
                        }
                    } else if (var625 < 5200) {
                        if (var625 == 5100) {
                            if (class194.field2757.method531(86, 89)) {
                                field2998[var2++] = 1;
                            } else {
                                field2998[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5101) {
                            if (class194.field2757.method531(82, 66)) {
                                field2998[var2++] = 1;
                            } else {
                                field2998[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5102) {
                            if (class194.field2757.method531(81, 49)) {
                                field2998[var2++] = 1;
                            } else {
                                field2998[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var625 < 5300) {
                        if (var625 == 5200) {
                            var2--;
                            class305.method1851(field2998[var2], 85);
                            continue;
                        }
                        if (var625 == 5201) {
                            field2998[var2++] = class419.method2443(-114);
                            continue;
                        }
                        if (var625 == 5205) {
                            var2--;
                            class121.method756(-1, false, (byte) 29, -1, field2998[var2]);
                            continue;
                        }
                        if (var625 == 5206) {
                            var2--;
                            int var426 = field2998[var2];
                            class200 var427 = class379.method2261(var426 >> 14 & 0x3FFF, var426 & 0x3FFF);
                            if (var427 == null) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = var427.field2878;
                            }
                            continue;
                        }
                        if (var625 == 5207) {
                            var2--;
                            class200 var428 = class379.method2262(field2998[var2]);
                            if (var428 != null && var428.field2880 != null) {
                                field3001[var3++] = var428.field2880;
                                continue;
                            }
                            field3001[var3++] = "";
                            continue;
                        }
                        if (var625 == 5208) {
                            field2998[var2++] = class445.field6150;
                            field2998[var2++] = class343.field4665;
                            continue;
                        }
                        if (var625 == 5209) {
                            field2998[var2++] = class379.field5393 + class192.field2753;
                            field2998[var2++] = class417.field5743 + class379.field5379;
                            continue;
                        }
                        if (var625 == 5210) {
                            var2--;
                            int var429 = field2998[var2];
                            class200 var430 = class379.method2262(var429);
                            if (var430 == null) {
                                field2998[var2++] = 0;
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var430.field2857 >> 14 & 0x3FFF;
                                field2998[var2++] = var430.field2857 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var625 == 5211) {
                            var2--;
                            int var431 = field2998[var2];
                            class200 var432 = class379.method2262(var431);
                            if (var432 == null) {
                                field2998[var2++] = 0;
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var432.field2859 - var432.field2863;
                                field2998[var2++] = var432.field2868 - var432.field2858;
                            }
                            continue;
                        }
                        if (var625 == 5212) {
                            class163 var433 = class191.method1231(true);
                            if (var433 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = var433.field2342;
                                int var434 = var433.field2341 << 28 | class379.field5393 + var433.field2339 << 14 | class379.field5379 + var433.field2343;
                                field2998[var2++] = var434;
                            }
                            continue;
                        }
                        if (var625 == 5213) {
                            class163 var435 = class215.method1361(16);
                            if (var435 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = var435.field2342;
                                int var436 = var435.field2341 << 28 | class379.field5393 + var435.field2339 << 14 | class379.field5379 + var435.field2343;
                                field2998[var2++] = var436;
                            }
                            continue;
                        }
                        if (var625 == 5214) {
                            var2--;
                            int var437 = field2998[var2];
                            class200 var438 = class295.method1827(-476678640);
                            if (var438 != null) {
                                boolean var439 = var438.method1270(var437 & 0x3FFF, field3008, 104, var437 >> 28 & 0x3, var437 >> 14 & 0x3FFF);
                                if (var439) {
                                    class19.method162((byte) -128, field3008[1], field3008[2]);
                                }
                            }
                            continue;
                        }
                        if (var625 == 5215) {
                            var2 -= 2;
                            int var440 = field2998[var2];
                            int var441 = field2998[var2 + 1];
                            class255 var442 = class379.method2277(var440 >> 14 & 0x3FFF, var440 & 0x3FFF);
                            boolean var443 = false;
                            for (class200 var444 = (class200) var442.method1587(0); var444 != null; var444 = (class200) var442.method1583((byte) -69)) {
                                if (var444.field2878 == var441) {
                                    var443 = true;
                                    break;
                                }
                            }
                            if (var443) {
                                field2998[var2++] = 1;
                            } else {
                                field2998[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5218) {
                            var2--;
                            int var445 = field2998[var2];
                            class200 var446 = class379.method2262(var445);
                            if (var446 == null) {
                                field2998[var2++] = -1;
                            } else {
                                field2998[var2++] = var446.field2870;
                            }
                            continue;
                        }
                        if (var625 == 5220) {
                            field2998[var2++] = class430.field5926 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5221) {
                            var2--;
                            int var447 = field2998[var2];
                            class19.method162((byte) -119, var447 >> 14 & 0x3FFF, var447 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5222) {
                            class200 var448 = class295.method1827(-476678640);
                            if (var448 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = -1;
                            } else {
                                boolean var449 = var448.method1269(122, class379.field5393 + class192.field2753, class417.field5743 + class379.field5379, field3008);
                                if (var449) {
                                    field2998[var2++] = field3008[1];
                                    field2998[var2++] = field3008[2];
                                } else {
                                    field2998[var2++] = -1;
                                    field2998[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5223) {
                            var2 -= 2;
                            int var450 = field2998[var2];
                            int var451 = field2998[var2 + 1];
                            class121.method756(var451 & 0x3FFF, false, (byte) 29, var451 >> 14 & 0x3FFF, var450);
                            continue;
                        }
                        if (var625 == 5224) {
                            var2--;
                            int var452 = field2998[var2];
                            class200 var453 = class295.method1827(-476678640);
                            if (var453 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = -1;
                            } else {
                                boolean var454 = var453.method1270(var452 & 0x3FFF, field3008, 104, var452 >> 28 & 0x3, var452 >> 14 & 0x3FFF);
                                if (var454) {
                                    field2998[var2++] = field3008[1];
                                    field2998[var2++] = field3008[2];
                                } else {
                                    field2998[var2++] = -1;
                                    field2998[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5225) {
                            var2--;
                            int var455 = field2998[var2];
                            class200 var456 = class295.method1827(-476678640);
                            if (var456 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = -1;
                            } else {
                                boolean var457 = var456.method1269(123, var455 >> 14 & 0x3FFF, var455 & 0x3FFF, field3008);
                                if (var457) {
                                    field2998[var2++] = field3008[1];
                                    field2998[var2++] = field3008[2];
                                } else {
                                    field2998[var2++] = -1;
                                    field2998[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5226) {
                            var2--;
                            class68.method481(21216, field2998[var2]);
                            continue;
                        }
                        if (var625 == 5227) {
                            var2 -= 2;
                            int var458 = field2998[var2];
                            int var459 = field2998[var2 + 1];
                            class121.method756(var459 & 0x3FFF, true, (byte) 29, var459 >> 14 & 0x3FFF, var458);
                            continue;
                        }
                        if (var625 == 5228) {
                            var2--;
                            class7.field132 = field2998[var2] == 1;
                            continue;
                        }
                        if (var625 == 5229) {
                            field2998[var2++] = class7.field132 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5230) {
                            var2--;
                            int var460 = field2998[var2];
                            class290.method1784(var460, 32343);
                            continue;
                        }
                        if (var625 == 5231) {
                            var2 -= 2;
                            int var461 = field2998[var2];
                            boolean var462 = field2998[var2 + 1] == 1;
                            if (class389.field5487 == null) {
                                continue;
                            }
                            class180 var463 = class389.field5487.method2614((long) var461, 61);
                            if (var463 != null && !var462) {
                                var463.method1182(28818);
                                continue;
                            }
                            if (var463 == null && var462) {
                                class180 var464 = new class180();
                                class389.field5487.method2620((long) var461, var464, false);
                            }
                            continue;
                        }
                        if (var625 == 5232) {
                            var2--;
                            int var465 = field2998[var2];
                            if (class389.field5487 == null) {
                                field2998[var2++] = 0;
                            } else {
                                class180 var466 = class389.field5487.method2614((long) var465, -95);
                                field2998[var2++] = var466 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5233) {
                            var2 -= 2;
                            int var467 = field2998[var2];
                            boolean var468 = field2998[var2 + 1] == 1;
                            if (class255.field3565 == null) {
                                continue;
                            }
                            class180 var469 = class255.field3565.method2614((long) var467, 77);
                            if (var469 != null && !var468) {
                                var469.method1182(28818);
                                continue;
                            }
                            if (var469 == null && var468) {
                                class180 var470 = new class180();
                                class255.field3565.method2620((long) var467, var470, false);
                            }
                            continue;
                        }
                        if (var625 == 5234) {
                            var2--;
                            int var471 = field2998[var2];
                            if (class255.field3565 == null) {
                                field2998[var2++] = 0;
                            } else {
                                class180 var472 = class255.field3565.method2614((long) var471, 37);
                                field2998[var2++] = var472 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5235) {
                            field2998[var2++] = class379.field5359 == null ? -1 : class379.field5359.field2878;
                            continue;
                        }
                    } else if (var625 < 5400) {
                        if (var625 == 5300) {
                            var2 -= 2;
                            int var473 = field2998[var2];
                            int var474 = field2998[var2 + 1];
                            class356.method2139(var474, 3, (byte) 106, false, var473);
                            field2998[var2++] = class90.field1344 == null ? 0 : 1;
                            continue;
                        }
                        if (var625 == 5301) {
                            if (class90.field1344 != null) {
                                class356.method2139(-1, class411.field5693, (byte) 114, false, -1);
                            }
                            continue;
                        }
                        if (var625 == 5302) {
                            class275[] var475 = class226.method1425(true);
                            field2998[var2++] = var475.length;
                            continue;
                        }
                        if (var625 == 5303) {
                            var2--;
                            int var476 = field2998[var2];
                            class275[] var477 = class226.method1425(true);
                            field2998[var2++] = var477[var476].field3811;
                            field2998[var2++] = var477[var476].field3802;
                            continue;
                        }
                        if (var625 == 5305) {
                            int var478 = class221.field3111;
                            int var479 = class304.field4157;
                            int var480 = -1;
                            class275[] var481 = class226.method1425(true);
                            for (int var482 = 0; var482 < var481.length; var482++) {
                                class275 var483 = var481[var482];
                                if (var483.field3811 == var478 && var483.field3802 == var479) {
                                    var480 = var482;
                                    break;
                                }
                            }
                            field2998[var2++] = var480;
                            continue;
                        }
                        if (var625 == 5306) {
                            field2998[var2++] = class18.method156((byte) -119);
                            continue;
                        }
                        if (var625 == 5307) {
                            var2--;
                            int var484 = field2998[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class356.method2139(-1, var484, (byte) 122, false, -1);
                            }
                            continue;
                        }
                        if (var625 == 5308) {
                            field2998[var2++] = class411.field5693;
                            continue;
                        }
                        if (var625 == 5309) {
                            var2--;
                            int var485 = field2998[var2];
                            if (var485 >= 1 && var485 <= 2) {
                                class411.field5693 = var485;
                                class155.method941(17201, class343.field4703);
                            }
                            continue;
                        }
                    } else if (var625 < 5500) {
                        if (var625 == 5400) {
                            var3 -= 2;
                            String var486 = field3001[var3];
                            String var487 = field3001[var3 + 1];
                            var2--;
                            int var488 = field2998[var2];
                            field2994++;
                            class131.method793(class102.field1457, 56);
                            class366.field5214.method2470((byte) -74, class42.method349(var486, 1) + class42.method349(var487, 1) + 1);
                            class366.field5214.method2493((byte) 40, var486);
                            class366.field5214.method2493((byte) 100, var487);
                            class366.field5214.method2470((byte) -74, var488);
                            continue;
                        }
                        if (var625 == 5401) {
                            var2 -= 2;
                            class146.field2069[field2998[var2]] = (short) class477.method2805(field2998[var2 + 1], (byte) 108);
                            class58.field918.method335((byte) 116);
                            class58.field918.method339(-4654);
                            class467.field6550.method1363(126);
                            class480.method2825(9742);
                            continue;
                        }
                        if (var625 == 5405) {
                            var2 -= 2;
                            int var489 = field2998[var2];
                            int var490 = field2998[var2 + 1];
                            if (var489 >= 0 && var489 < 2) {
                                class386.field5444[var489] = new int[var490 << 1][4];
                            }
                            continue;
                        }
                        if (var625 == 5406) {
                            var2 -= 7;
                            int var491 = field2998[var2];
                            int var492 = field2998[var2 + 1] << 1;
                            int var493 = field2998[var2 + 2];
                            int var494 = field2998[var2 + 3];
                            int var495 = field2998[var2 + 4];
                            int var496 = field2998[var2 + 5];
                            int var497 = field2998[var2 + 6];
                            if (var491 >= 0 && var491 < 2 && class386.field5444[var491] != null && var492 >= 0 && var492 < class386.field5444[var491].length) {
                                class386.field5444[var491][var492] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128, var497 };
                                class386.field5444[var491][var492 + 1] = new int[] { (var495 >> 14 & 0x3FFF) * 128, var496, (var495 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var625 == 5407) {
                            var2--;
                            int var498 = class386.field5444[field2998[var2]].length >> 1;
                            field2998[var2++] = var498;
                            continue;
                        }
                        if (var625 == 5411) {
                            if (class90.field1344 != null) {
                                class356.method2139(-1, class411.field5693, (byte) 104, false, -1);
                            }
                            if (class240.field3384 == null) {
                                String var499 = class317.field4310 == null ? class286.method1767(12) : class317.field4310;
                                class442.method2570(class343.field4703, var499, false, false, class221.field3118 == 1);
                            } else {
                                class10.method99(97);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var625 == 5419) {
                            String var500 = "";
                            if (class268.field3724 != null) {
                                if (class268.field3724.field5791 == null) {
                                    var500 = class295.method1826(class268.field3724.field5788, -122);
                                } else {
                                    var500 = (String) class268.field3724.field5791;
                                }
                            }
                            field3001[var3++] = var500;
                            continue;
                        }
                        if (var625 == 5420) {
                            field2998[var2++] = class14.field222 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5421) {
                            if (class90.field1344 != null) {
                                class356.method2139(-1, class411.field5693, (byte) 120, false, -1);
                            }
                            var3--;
                            String var501 = field3001[var3];
                            var2--;
                            boolean var502 = field2998[var2] == 1;
                            String var503 = class286.method1767(12) + var501;
                            class442.method2570(class343.field4703, var503, false, var502, class221.field3118 == 1);
                            continue;
                        }
                        if (var625 == 5422) {
                            var3 -= 2;
                            String var504 = field3001[var3];
                            String var505 = field3001[var3 + 1];
                            var2--;
                            int var506 = field2998[var2];
                            if (var504.length() > 0) {
                                if (class90.field1342 == null) {
                                    class90.field1342 = new String[class191.field2726[class172.field2553.field4528]];
                                }
                                class90.field1342[var506] = var504;
                            }
                            if (var505.length() > 0) {
                                if (class332.field4552 == null) {
                                    class332.field4552 = new String[class191.field2726[class172.field2553.field4528]];
                                }
                                class332.field4552[var506] = var505;
                            }
                            continue;
                        }
                        if (var625 == 5423) {
                            var3--;
                            System.out.println(field3001[var3]);
                            continue;
                        }
                        if (var625 == 5424) {
                            var2 -= 11;
                            class2.field20 = field2998[var2];
                            class422.field5810 = field2998[var2 + 1];
                            class196.field2799 = field2998[var2 + 2];
                            class429.field5916 = field2998[var2 + 3];
                            class137.field1946 = field2998[var2 + 4];
                            class295.field4085 = field2998[var2 + 5];
                            class370.field5242 = field2998[var2 + 6];
                            class466.field6542 = field2998[var2 + 7];
                            class446.field6169 = field2998[var2 + 8];
                            class102.field1452 = field2998[var2 + 9];
                            class15.field259 = field2998[var2 + 10];
                            class120.field1685.method2034(class137.field1946, -28758);
                            class120.field1685.method2034(class295.field4085, -28758);
                            class120.field1685.method2034(class370.field5242, -28758);
                            class120.field1685.method2034(class466.field6542, -28758);
                            class120.field1685.method2034(class446.field6169, -28758);
                            class287.field3915 = null;
                            class227.field3213 = null;
                            class96.field1369 = null;
                            class419.field5786 = null;
                            class192.field2750 = null;
                            class115.field1626 = null;
                            class275.field3807 = null;
                            class192.field2749 = null;
                            class490.field6921 = true;
                            continue;
                        }
                        if (var625 == 5425) {
                            class137.method840((byte) -110);
                            class490.field6921 = false;
                            continue;
                        }
                        if (var625 == 5426) {
                            var2 -= 2;
                            class326.field4500 = field2998[var2];
                            class19.field314 = field2998[var2 + 1];
                            continue;
                        }
                        if (var625 == 5427) {
                            var2 -= 2;
                            class115.field1628 = field2998[var2 + 1];
                            continue;
                        }
                        if (var625 == 5428) {
                            var2 -= 2;
                            int var507 = field2998[var2];
                            int var508 = field2998[var2 + 1];
                            field2998[var2++] = class146.method906(var507, -94, var508) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5429) {
                            var3--;
                            class183.method1200(field3001[var3], false, -1);
                            continue;
                        }
                    } else if (var625 < 5600) {
                        if (var625 == 5500) {
                            var2 -= 4;
                            int var509 = field2998[var2];
                            int var510 = field2998[var2 + 1];
                            int var511 = field2998[var2 + 2];
                            int var512 = field2998[var2 + 3];
                            class129.method787(var510, -124, var512, (var509 >> 14 & 0x3FFF) - class153.field2204, (var509 & 0x3FFF) - class325.field4472, var511, false);
                            continue;
                        }
                        if (var625 == 5501) {
                            var2 -= 4;
                            int var513 = field2998[var2];
                            int var514 = field2998[var2 + 1];
                            int var515 = field2998[var2 + 2];
                            int var516 = field2998[var2 + 3];
                            class349.method2087(22434, var515, var516, (var513 & 0x3FFF) - class325.field4472, var514, (var513 >> 14 & 0x3FFF) - class153.field2204);
                            continue;
                        }
                        if (var625 == 5502) {
                            var2 -= 6;
                            int var517 = field2998[var2];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class383.field5438 = var517;
                            int var518 = field2998[var2 + 1];
                            if (var518 + 1 >= class386.field5444[class383.field5438].length >> 1) {
                                throw new RuntimeException();
                            }
                            class69.field1026 = var518;
                            class346.field4730 = 0;
                            class383.field5433 = field2998[var2 + 2];
                            class338.field4637 = field2998[var2 + 3];
                            int var519 = field2998[var2 + 4];
                            if (var519 >= 2) {
                                throw new RuntimeException();
                            }
                            class236.field3333 = var519;
                            int var520 = field2998[var2 + 5];
                            if (var520 + 1 >= class386.field5444[class236.field3333].length >> 1) {
                                throw new RuntimeException();
                            }
                            class255.field3577 = var520;
                            class375.field5312 = 3;
                            continue;
                        }
                        if (var625 == 5503) {
                            class422.method2449(-73);
                            continue;
                        }
                        if (var625 == 5504) {
                            var2 -= 2;
                            class243.method1519(field2998[var2], (byte) -125, field2998[var2 + 1], 0);
                            continue;
                        }
                        if (var625 == 5505) {
                            field2998[var2++] = (int) class356.field4959 >> 3;
                            continue;
                        }
                        if (var625 == 5506) {
                            field2998[var2++] = (int) class418.field5750 >> 3;
                            continue;
                        }
                        if (var625 == 5507) {
                            class202.method1284(-24613);
                            continue;
                        }
                        if (var625 == 5508) {
                            class275.method1723((byte) -73);
                            continue;
                        }
                        if (var625 == 5509) {
                            class30.method242((byte) -79);
                            continue;
                        }
                        if (var625 == 5510) {
                            class325.method1955(22050);
                            continue;
                        }
                        if (var625 == 5511) {
                            var2--;
                            int var521 = field2998[var2];
                            int var522 = var521 >> 14 & 0x3FFF;
                            int var523 = var521 & 0x3FFF;
                            int var524 = var522 - class153.field2204;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class200.field2875) {
                                var524 = class200.field2875;
                            }
                            int var525 = var523 - class325.field4472;
                            if (var525 < 0) {
                                var525 = 0;
                            } else if (var525 >= class422.field5811) {
                                var525 = class422.field5811;
                            }
                            class299.field4120 = var524 * 128 + 64;
                            class293.field4021 = var525 * 128 + 64;
                            class375.field5312 = 4;
                            continue;
                        }
                        if (var625 == 5512) {
                            class129.method785(0);
                            continue;
                        }
                    } else if (var625 < 5700) {
                        if (var625 == 5600) {
                            var3 -= 2;
                            String var526 = field3001[var3];
                            String var527 = field3001[var3 + 1];
                            var2--;
                            int var528 = field2998[var2];
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0 && class81.field1224 == 0) {
                                class229.method1440(var527, var528, var526, -211);
                            }
                            continue;
                        }
                        if (var625 == 5601) {
                            class32.method251(128);
                            continue;
                        }
                        if (var625 == 5602) {
                            if (class228.field3230 == 0) {
                                class353.field4917 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5603) {
                            var2 -= 4;
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0 && class81.field1224 == 0) {
                                class416.method2430(field2998[var2 + 1], 1, field2998[var2], field2998[var2 + 3], field2998[var2 + 2]);
                            }
                            continue;
                        }
                        if (var625 == 5604) {
                            var3--;
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0 && class81.field1224 == 0) {
                                class460.method2722(-102, class54.method421(field3001[var3], -16583));
                            }
                            continue;
                        }
                        if (var625 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0 && class81.field1224 == 0) {
                                class157.method951(field2998[var2 + 5] == 1, field3001[var3 + 1], field2998[var2 + 1], field2998[var2 + 4] == 1, (byte) 36, field2998[var2 + 6] == 1, field3001[var3 + 2], field2998[var2 + 3], field2998[var2], class54.method421(field3001[var3], -16583), field2998[var2 + 2]);
                            }
                            continue;
                        }
                        if (var625 == 5606) {
                            if (class73.field1058 == 0) {
                                class338.field4632 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5607) {
                            field2998[var2++] = class353.field4917;
                            continue;
                        }
                        if (var625 == 5608) {
                            field2998[var2++] = class48.field783;
                            continue;
                        }
                        if (var625 == 5609) {
                            field2998[var2++] = class338.field4632;
                            continue;
                        }
                        if (var625 == 5610) {
                            for (int var529 = 0; var529 < 5; var529++) {
                                field3001[var3++] = class435.field5972.length > var529 ? class225.method1416(-96, class435.field5972[var529]) : "";
                            }
                            class435.field5972 = null;
                            continue;
                        }
                        if (var625 == 5611) {
                            field2998[var2++] = class180.field2612;
                            continue;
                        }
                    } else if (var625 < 6100) {
                        if (var625 == 6001) {
                            var2--;
                            int var530 = field2998[var2];
                            if (var530 < 1) {
                                var530 = 1;
                            }
                            if (var530 > 4) {
                                var530 = 4;
                            }
                            class400.field5591 = var530;
                            class139.method846((byte) 88);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6002) {
                            var2--;
                            class175.method1160(field2998[var2] == 1, 116);
                            class139.method846((byte) 127);
                            class375.method2240(88);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6003) {
                            var2--;
                            class460.field6481 = field2998[var2] == 1;
                            class375.method2240(123);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6005) {
                            var2--;
                            class216.field3068 = field2998[var2] == 1;
                            class139.method846((byte) 112);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6006) {
                            var2--;
                            class80.field1205 = field2998[var2] == 1;
                            class338.field4636.method1065(!class80.field1205);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6007) {
                            var2--;
                            class181.field2629 = field2998[var2];
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6008) {
                            var2--;
                            class216.field3069 = field2998[var2] == 1;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6009) {
                            var2--;
                            class164.field2424 = field2998[var2] == 1;
                            class139.method846((byte) 86);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6010) {
                            var2--;
                            class191.field2723 = field2998[var2] == 1;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6011) {
                            var2--;
                            int var531 = field2998[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class47.field761 = var531;
                            class139.method846((byte) 115);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6012) {
                            var2--;
                            class312.field4249 = field2998[var2] == 1;
                            class319.method1927((byte) -126);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6014) {
                            var2--;
                            class327.field4526 = field2998[var2] == 1;
                            class139.method846((byte) 123);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6015) {
                            var2--;
                            class301.field4127 = field2998[var2] == 1;
                            class139.method846((byte) 105);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6016) {
                            var2--;
                            int var532 = field2998[var2];
                            if (var532 < 0 || var532 > 2) {
                                var532 = 0;
                            }
                            class211.field2977 = var532;
                            class294.method1821(true);
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6017) {
                            var2--;
                            class255.field3578 = field2998[var2] == 1;
                            class325.method1953(true);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6018) {
                            var2--;
                            int var533 = field2998[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class256.field3582 = var533;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6019) {
                            var2--;
                            int var534 = field2998[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 255) {
                                var534 = 255;
                            }
                            if (class47.field766 != var534) {
                                if (class47.field766 == 0 && class282.field3867 != -1) {
                                    class2.method8(var534, false, class282.field3867, class101.field1440, 0, (byte) 125);
                                    class7.field122 = false;
                                } else if (var534 == 0) {
                                    class303.method1841(46);
                                    class7.field122 = false;
                                } else {
                                    class340.method2014(var534, (byte) 64);
                                }
                                class47.field766 = var534;
                            }
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6020) {
                            var2--;
                            int var535 = field2998[var2];
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 127) {
                                var535 = 127;
                            }
                            class491.field6932 = var535;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6021) {
                            var2--;
                            class131.field1839 = field2998[var2] == 1;
                            class375.method2240(87);
                            continue;
                        }
                        if (var625 == 6023) {
                            var2--;
                            int var536 = field2998[var2];
                            boolean var537 = false;
                            if (var536 < 0) {
                                var536 = 0;
                            }
                            if (var536 > 2) {
                                var536 = 2;
                            }
                            if (class154.field2227 < 96) {
                                var536 = 0;
                                var537 = true;
                            }
                            class42.method351(var536, (byte) -83);
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            field2998[var2++] = var537 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 6024) {
                            var2--;
                            int var538 = field2998[var2];
                            if (var538 < 0 || var538 > 2) {
                                var538 = 0;
                            }
                            class13.field210 = var538;
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6025) {
                            var2--;
                            int var539 = field2998[var2];
                            if (var539 < 0 || var539 > class421.method2445(class154.field2227, (byte) 54)) {
                                var539 = 0;
                            }
                            class222.field3135 = var539;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6027) {
                            var2--;
                            int var540 = field2998[var2];
                            if (var540 < 0 || var540 > 1) {
                                var540 = 0;
                            }
                            class198.method1262(false, var540 == 1);
                            continue;
                        }
                        if (var625 == 6028) {
                            var2--;
                            class122.field1699 = field2998[var2] != 0;
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6029) {
                            var2--;
                            class181.field2629 = field2998[var2];
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6030) {
                            var2--;
                            class255.field3580 = field2998[var2] != 0;
                            class155.method941(17201, class343.field4703);
                            class139.method846((byte) 97);
                            continue;
                        }
                        if (var625 == 6031) {
                            var2--;
                            int var541 = field2998[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class336.method2003(5, var541);
                            continue;
                        }
                        if (var625 == 6032) {
                            var2--;
                            int var542 = field2998[var2];
                            if (var542 < 0 || var542 > 3) {
                                var542 = 2;
                            }
                            class47.field768 = var542;
                            class155.method941(17201, class343.field4703);
                            class443.field6118 = false;
                            continue;
                        }
                        if (var625 == 6033) {
                            var2--;
                            int var543 = field2998[var2];
                            if (var543 < 0 || var543 > 4) {
                                var543 = 2;
                            }
                            class205.field2933 = var543;
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                    } else if (var625 < 6200) {
                        if (var625 == 6101) {
                            field2998[var2++] = class400.field5591;
                            continue;
                        }
                        if (var625 == 6102) {
                            field2998[var2++] = class410.method2404(-1) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6103) {
                            field2998[var2++] = class460.field6481 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6105) {
                            field2998[var2++] = class216.field3068 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6106) {
                            field2998[var2++] = class80.field1205 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6107) {
                            field2998[var2++] = class181.field2629;
                            continue;
                        }
                        if (var625 == 6108) {
                            field2998[var2++] = class216.field3069 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6109) {
                            field2998[var2++] = class164.field2424 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6110) {
                            field2998[var2++] = class191.field2723 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6111) {
                            field2998[var2++] = class47.field761;
                            continue;
                        }
                        if (var625 == 6112) {
                            field2998[var2++] = class312.field4249 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6114) {
                            field2998[var2++] = class327.field4526 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6115) {
                            field2998[var2++] = class301.field4127 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6116) {
                            field2998[var2++] = class211.field2977;
                            continue;
                        }
                        if (var625 == 6117) {
                            field2998[var2++] = class255.field3578 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6118) {
                            field2998[var2++] = class256.field3582;
                            continue;
                        }
                        if (var625 == 6119) {
                            field2998[var2++] = class47.field766;
                            continue;
                        }
                        if (var625 == 6120) {
                            field2998[var2++] = class491.field6932;
                            continue;
                        }
                        if (var625 == 6121) {
                            field2998[var2++] = class338.field4636.method1132() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6123) {
                            field2998[var2++] = class344.method2059(-22511);
                            continue;
                        }
                        if (var625 == 6124) {
                            field2998[var2++] = class13.field210;
                            continue;
                        }
                        if (var625 == 6125) {
                            field2998[var2++] = class222.field3135;
                            continue;
                        }
                        if (var625 == 6126) {
                            field2998[var2++] = class338.field4636.method1082() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6127) {
                            field2998[var2++] = class163.field2336 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6128) {
                            field2998[var2++] = class122.field1699 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6129) {
                            field2998[var2++] = class181.field2629;
                            continue;
                        }
                        if (var625 == 6130) {
                            field2998[var2++] = class255.field3580 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6131) {
                            field2998[var2++] = class221.field3118;
                            continue;
                        }
                        if (var625 == 6132) {
                            field2998[var2++] = class47.field768;
                            continue;
                        }
                        if (var625 == 6133) {
                            field2998[var2++] = class14.field222 == 1 || class14.field222 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6134) {
                            field2998[var2++] = class421.method2445(class154.field2227, (byte) 82);
                            continue;
                        }
                        if (var625 == 6135) {
                            field2998[var2++] = class205.field2933;
                            continue;
                        }
                    } else if (var625 < 6300) {
                        if (var625 == 6200) {
                            var2 -= 2;
                            class410.field5691 = (short) field2998[var2];
                            if (class410.field5691 <= 0) {
                                class410.field5691 = 256;
                            }
                            class138.field1967 = (short) field2998[var2 + 1];
                            if (class138.field1967 <= 0) {
                                class138.field1967 = 205;
                            }
                            continue;
                        }
                        if (var625 == 6201) {
                            var2 -= 2;
                            class445.field6143 = (short) field2998[var2];
                            if (class445.field6143 <= 0) {
                                class445.field6143 = 256;
                            }
                            class475.field6694 = (short) field2998[var2 + 1];
                            if (class475.field6694 <= 0) {
                                class475.field6694 = 320;
                            }
                            continue;
                        }
                        if (var625 == 6202) {
                            var2 -= 4;
                            class175.field2574 = (short) field2998[var2];
                            if (class175.field2574 <= 0) {
                                class175.field2574 = 1;
                            }
                            class56.field910 = (short) field2998[var2 + 1];
                            if (class56.field910 <= 0) {
                                class56.field910 = 32767;
                            } else if (class56.field910 < class175.field2574) {
                                class56.field910 = class175.field2574;
                            }
                            class5.field105 = (short) field2998[var2 + 2];
                            if (class5.field105 <= 0) {
                                class5.field105 = 1;
                            }
                            class290.field3987 = (short) field2998[var2 + 3];
                            if (class290.field3987 <= 0) {
                                class290.field3987 = 32767;
                            } else if (class290.field3987 < class5.field105) {
                                class290.field3987 = class5.field105;
                            }
                            continue;
                        }
                        if (var625 == 6203) {
                            class411.method2409(class235.field3315.field5101, 0, false, class235.field3315.field5200, 0, -334);
                            field2998[var2++] = class205.field2950;
                            field2998[var2++] = class27.field455;
                            continue;
                        }
                        if (var625 == 6204) {
                            field2998[var2++] = class445.field6143;
                            field2998[var2++] = class475.field6694;
                            continue;
                        }
                        if (var625 == 6205) {
                            field2998[var2++] = class410.field5691;
                            field2998[var2++] = class138.field1967;
                            continue;
                        }
                    } else if (var625 < 6400) {
                        if (var625 == 6300) {
                            field2998[var2++] = (int) (class193.method1237(-9581) / 60000L);
                            continue;
                        }
                        if (var625 == 6301) {
                            field2998[var2++] = (int) (class193.method1237(-9581) / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6302) {
                            var2 -= 3;
                            int var544 = field2998[var2];
                            int var545 = field2998[var2 + 1];
                            int var546 = field2998[var2 + 2];
                            field3005.clear();
                            field3005.set(11, 12);
                            field3005.set(var546, var545, var544);
                            field2998[var2++] = (int) (field3005.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6303) {
                            field3005.clear();
                            field3005.setTime(new Date(class193.method1237(-9581)));
                            field2998[var2++] = field3005.get(1);
                            continue;
                        }
                        if (var625 == 6304) {
                            var2--;
                            int var547 = field2998[var2];
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
                            field2998[var2++] = var548 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6500) {
                        if (var625 == 6405) {
                            field2998[var2++] = class35.method275(false) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6406) {
                            field2998[var2++] = class477.method2802(217) ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6600) {
                        if (var625 == 6500) {
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0) {
                                field2998[var2++] = class462.method2732(-1) == -1 ? 0 : 1;
                                continue;
                            }
                            field2998[var2++] = 1;
                            continue;
                        }
                        if (var625 == 6501) {
                            class334 var549 = class153.method926((byte) -92);
                            if (var549 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = 0;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var549.field4576;
                                field2998[var2++] = var549.field767;
                                field3001[var3++] = var549.field4575;
                                class486 var550 = var549.method1988(-32);
                                field2998[var2++] = var550.field6855;
                                field3001[var3++] = var550.field6854;
                                field2998[var2++] = var549.field759;
                                field2998[var2++] = var549.field4577;
                            }
                            continue;
                        }
                        if (var625 == 6502) {
                            class334 var551 = class256.method1590(13892);
                            if (var551 == null) {
                                field2998[var2++] = -1;
                                field2998[var2++] = 0;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var551.field4576;
                                field2998[var2++] = var551.field767;
                                field3001[var3++] = var551.field4575;
                                class486 var552 = var551.method1988(-45);
                                field2998[var2++] = var552.field6855;
                                field3001[var3++] = var552.field6854;
                                field2998[var2++] = var551.field759;
                                field2998[var2++] = var551.field4577;
                            }
                            continue;
                        }
                        if (var625 == 6503) {
                            var2--;
                            int var553 = field2998[var2];
                            if (class478.field6764 == 10 && class22.field377 == 0 && class228.field3230 == 0 && class73.field1058 == 0) {
                                field2998[var2++] = class262.method1624(var553, (byte) 10) ? 1 : 0;
                                continue;
                            }
                            field2998[var2++] = 0;
                            continue;
                        }
                        if (var625 == 6504) {
                            var2--;
                            class312.field4253 = field2998[var2];
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6505) {
                            field2998[var2++] = class312.field4253;
                            continue;
                        }
                        if (var625 == 6506) {
                            var2--;
                            int var554 = field2998[var2];
                            class334 var555 = class58.method435((byte) 47, var554);
                            if (var555 == null) {
                                field2998[var2++] = -1;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field3001[var3++] = "";
                                field2998[var2++] = 0;
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = var555.field767;
                                field3001[var3++] = var555.field4575;
                                class486 var556 = var555.method1988(-88);
                                field2998[var2++] = var556.field6855;
                                field3001[var3++] = var556.field6854;
                                field2998[var2++] = var555.field759;
                                field2998[var2++] = var555.field4577;
                            }
                            continue;
                        }
                        if (var625 == 6507) {
                            var2 -= 4;
                            int var557 = field2998[var2];
                            boolean var558 = field2998[var2 + 1] == 1;
                            int var559 = field2998[var2 + 2];
                            boolean var560 = field2998[var2 + 3] == 1;
                            class41.method333(var560, var557, 32, var559, var558);
                            continue;
                        }
                        if (var625 == 6508) {
                            class157.method953(124);
                            continue;
                        }
                        if (var625 == 6509) {
                            if (class478.field6764 == 10) {
                                var2--;
                                class347.field4745 = field2998[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var625 < 6700) {
                        if (var625 == 6600) {
                            var2--;
                            class104.field1498 = field2998[var2] == 1;
                            class155.method941(17201, class343.field4703);
                            continue;
                        }
                        if (var625 == 6601) {
                            field2998[var2++] = class104.field1498 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6800 && class439.field6020 == class39.field669) {
                        if (var625 == 6700) {
                            int var561 = class231.field3258.method2621(-1);
                            if (class182.field2652 != -1) {
                                var561++;
                            }
                            field2998[var2++] = var561;
                            continue;
                        }
                        if (var625 == 6701) {
                            var2--;
                            int var562 = field2998[var2];
                            if (class182.field2652 != -1) {
                                if (var562 == 0) {
                                    field2998[var2++] = class182.field2652;
                                    continue;
                                }
                                var562--;
                            }
                            class465 var563 = (class465) class231.field3258.method2615((byte) -18);
                            while (var562-- > 0) {
                                var563 = (class465) class231.field3258.method2619((byte) -98);
                            }
                            field2998[var2++] = var563.field6527;
                            continue;
                        }
                        if (var625 == 6702) {
                            var2--;
                            int var564 = field2998[var2];
                            if (class39.field666[var564] == null) {
                                field3001[var3++] = "";
                            } else {
                                String var565 = class39.field666[var564][0].field5052;
                                if (var565 == null) {
                                    field3001[var3++] = "";
                                } else {
                                    field3001[var3++] = var565.substring(0, var565.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var625 == 6703) {
                            var2--;
                            int var566 = field2998[var2];
                            if (class39.field666[var566] == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = class39.field666[var566].length;
                            }
                            continue;
                        }
                        if (var625 == 6704) {
                            var2 -= 2;
                            int var567 = field2998[var2];
                            int var568 = field2998[var2 + 1];
                            if (class39.field666[var567] == null) {
                                field3001[var3++] = "";
                            } else {
                                String var569 = class39.field666[var567][var568].field5052;
                                if (var569 == null) {
                                    field3001[var3++] = "";
                                } else {
                                    field3001[var3++] = var569;
                                }
                            }
                            continue;
                        }
                        if (var625 == 6705) {
                            var2 -= 2;
                            int var570 = field2998[var2];
                            int var571 = field2998[var2 + 1];
                            if (class39.field666[var570] == null) {
                                field2998[var2++] = 0;
                            } else {
                                field2998[var2++] = class39.field666[var570][var571].field5087;
                            }
                            continue;
                        }
                        if (var625 == 6706) {
                            continue;
                        }
                        if (var625 == 6707) {
                            var2 -= 3;
                            int var572 = field2998[var2];
                            int var573 = field2998[var2 + 1];
                            int var574 = field2998[var2 + 2];
                            class233.method1469(1, var574, "", var572 << 16 | var573, 26233);
                            continue;
                        }
                        if (var625 == 6708) {
                            var2 -= 3;
                            int var575 = field2998[var2];
                            int var576 = field2998[var2 + 1];
                            int var577 = field2998[var2 + 2];
                            class233.method1469(2, var577, "", var575 << 16 | var576, 26233);
                            continue;
                        }
                        if (var625 == 6709) {
                            var2 -= 3;
                            int var578 = field2998[var2];
                            int var579 = field2998[var2 + 1];
                            int var580 = field2998[var2 + 2];
                            class233.method1469(3, var580, "", var578 << 16 | var579, 26233);
                            continue;
                        }
                        if (var625 == 6710) {
                            var2 -= 3;
                            int var581 = field2998[var2];
                            int var582 = field2998[var2 + 1];
                            int var583 = field2998[var2 + 2];
                            class233.method1469(4, var583, "", var581 << 16 | var582, 26233);
                            continue;
                        }
                        if (var625 == 6711) {
                            var2 -= 3;
                            int var584 = field2998[var2];
                            int var585 = field2998[var2 + 1];
                            int var586 = field2998[var2 + 2];
                            class233.method1469(5, var586, "", var584 << 16 | var585, 26233);
                            continue;
                        }
                        if (var625 == 6712) {
                            var2 -= 3;
                            int var587 = field2998[var2];
                            int var588 = field2998[var2 + 1];
                            int var589 = field2998[var2 + 2];
                            class233.method1469(6, var589, "", var587 << 16 | var588, 26233);
                            continue;
                        }
                        if (var625 == 6713) {
                            var2 -= 3;
                            int var590 = field2998[var2];
                            int var591 = field2998[var2 + 1];
                            int var592 = field2998[var2 + 2];
                            class233.method1469(7, var592, "", var590 << 16 | var591, 26233);
                            continue;
                        }
                        if (var625 == 6714) {
                            var2 -= 3;
                            int var593 = field2998[var2];
                            int var594 = field2998[var2 + 1];
                            int var595 = field2998[var2 + 2];
                            class233.method1469(8, var595, "", var593 << 16 | var594, 26233);
                            continue;
                        }
                        if (var625 == 6715) {
                            var2 -= 3;
                            int var596 = field2998[var2];
                            int var597 = field2998[var2 + 1];
                            int var598 = field2998[var2 + 2];
                            class233.method1469(9, var598, "", var596 << 16 | var597, 26233);
                            continue;
                        }
                        if (var625 == 6716) {
                            var2 -= 3;
                            int var599 = field2998[var2];
                            int var600 = field2998[var2 + 1];
                            int var601 = field2998[var2 + 2];
                            class233.method1469(10, var601, "", var599 << 16 | var600, 26233);
                            continue;
                        }
                        if (var625 == 6717) {
                            var2 -= 3;
                            int var602 = field2998[var2];
                            int var603 = field2998[var2 + 1];
                            int var604 = field2998[var2 + 2];
                            class363 var605 = class485.method2840(var604, var602 << 16 | var603, (byte) 21);
                            class7.method84(36);
                            class67 var606 = client.method2321(var605);
                            class254.method1578(var602 << 16 | var603, var606.field992, var604, var606.method474((byte) -32), -6, var605.field5083, var605.field5077);
                            continue;
                        }
                    } else if (var625 < 6900) {
                        if (var625 == 6800) {
                            var2--;
                            int var607 = field2998[var2];
                            class442 var608 = class292.field4009.method85(var607, true);
                            if (var608.field6068 == null) {
                                field3001[var3++] = "";
                            } else {
                                field3001[var3++] = var608.field6068;
                            }
                            continue;
                        }
                        if (var625 == 6801) {
                            var2--;
                            int var609 = field2998[var2];
                            class442 var610 = class292.field4009.method85(var609, true);
                            field2998[var2++] = var610.field6071;
                            continue;
                        }
                        if (var625 == 6802) {
                            var2--;
                            int var611 = field2998[var2];
                            class442 var612 = class292.field4009.method85(var611, true);
                            field2998[var2++] = var612.field6094;
                            continue;
                        }
                        if (var625 == 6803) {
                            var2--;
                            int var613 = field2998[var2];
                            class442 var614 = class292.field4009.method85(var613, true);
                            field2998[var2++] = var614.field6073;
                            continue;
                        }
                        if (var625 == 6804) {
                            var2 -= 2;
                            int var615 = field2998[var2];
                            int var616 = field2998[var2 + 1];
                            class307 var617 = class68.field1007.method963(var616, (byte) -43);
                            if (var617.method1861((byte) 79)) {
                                field3001[var3++] = class292.field4009.method85(var615, true).method2563(var617.field4206, (byte) -116, var616);
                            } else {
                                field2998[var2++] = class292.field4009.method85(var615, true).method2573(var617.field4199, 3, var616);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var624) {
            if (arg0.field536 == null) {
                StringBuffer var622 = new StringBuffer(30);
                var622.append("CS2: ").append(arg0.field2608).append(" ");
                for (int var623 = field2988 - 1; var623 >= 0; var623--) {
                    var622.append("v: ").append(field3003[var623].field5457.field2608).append(" ");
                }
                var622.append("op: ").append(var7);
                class181.method1190((byte) 120, var622.toString(), var624);
            } else {
                class465.method2743("Clientscript error in: " + arg0.field536, -128);
                StringBuffer var619 = new StringBuffer(30);
                var619.append("Clientscript error in: ").append(arg0.field536).append("\n");
                for (int var620 = field2988 - 1; var620 >= 0; var620--) {
                    var619.append("via: ").append(field3003[var620].field5457.field536).append("\n");
                }
                var619.append("Op: ").append(var7).append("\n");
                String var621 = var624.getMessage();
                if (var621 != null && var621.length() > 0) {
                    var619.append("Message: ").append(var621).append("\n");
                }
                class181.method1190((byte) 118, var619.toString(), var624);
                class109.method680(var619.toString(), 12245);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Llh;I)V", line = 6939)
    private static final void method1329(class32 arg0, int arg1) {
        Object[] var2 = arg0.field518;
        int var3 = (Integer) var2[0];
        class33 var4 = class192.method1235((byte) -113, var3);
        if (var4 == null) {
            return;
        }
        field2997 = new int[var4.field524];
        int var5 = 0;
        field3004 = new String[var4.field526];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field511;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field514;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field517 == null ? -1 : arg0.field517.field5096;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field519;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field517 == null ? -1 : arg0.field517.field5047;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field521 == null ? -1 : arg0.field521.field5096;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field521 == null ? -1 : arg0.field521.field5047;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field507;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field522;
                }
                field2997[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field508;
                }
                field3004[var6++] = var9;
            }
        }
        method1328(var4, arg1);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V", line = 7016)
    public static void method1330() {
        field2997 = null;
        field3004 = null;
        field2995 = null;
        field2985 = null;
        field2998 = null;
        field3001 = null;
        field3003 = null;
        field3000 = null;
        field2983 = null;
        field2989 = null;
        field3005 = null;
        field3007 = null;
        field3008 = null;
        field3006 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Llh;)V", line = 7041)
    public static final void method1331(class32 arg0) {
        method1329(arg0, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Llm;II)V", line = 7045)
    public static final void method1332(class84 arg0, int arg1, int arg2) {
        class33 var3 = class80.method553(arg0, -93, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field2997 = new int[var3.field524];
        field3004 = new String[var3.field526];
        if (class416.field5731 == var3.field539 || class409.field5675 == var3.field539 || class294.field4058 == var3.field539) {
            int var4 = 0;
            int var5 = 0;
            if (class233.field3307 != null) {
                var4 = class233.field3307.field5145;
                var5 = class233.field3307.field5183;
            }
            field2997[0] = class56.field902.method1301(13820) - var4;
            field2997[1] = class56.field902.method1305(255) - var5;
        }
        method1328(var3, 200000);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 7098)
    public static final void method1333(int arg0) {
        if (arg0 == -1 || !class56.method431(12449, arg0)) {
            return;
        }
        class363[] var1 = class39.field666[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class363 var3 = var1[var2];
            if (var3.field5078 != null) {
                class32 var4 = new class32();
                var4.field517 = var3;
                var4.field518 = var3.field5078;
                method1329(var4, 2000000);
            }
        }
    }
}
