import java.awt.event.ActionEvent;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field266 = 2301979;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lqf;")
    public static class117 field268 = class72.method514(121, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lqf;")
    public static class117 field275 = class72.method514(119, "(U2");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lqf;")
    public static class117[] field265 = new class117[5];

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lqf;")
    private static class117 field284 = class72.method514(112, "Moderator option: Mute player for 48 hours: <lt>OFF<gt>");

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lqf;")
    public static class117 field276 = class72.method514(110, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field280 = -1;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lqf;")
    private static class117 field278 = class72.method514(119, "Bad session id)3");

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lqf;")
    public static class117 field269 = field284;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
    public static boolean field267 = false;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lqf;")
    public static class117 field288 = class72.method514(127, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lqf;")
    public static class117 field271 = field278;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field279 = 3353893;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lqf;")
    private static class117 field289 = class72.method514(125, "Unable to find ");

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lqf;")
    public static class117 field270 = field289;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ldf;")
    public static class28 field272;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lma;")
    public static class84 field285;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Z")
    public static boolean field291;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "[I")
    public static int[] field283;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([Ljava/lang/Object;Lmf;IILmf;II)V")
    public static final void method145(Object[] arg0, class89 arg1, int arg2, int arg3, class89 arg4, int arg5, int arg6) {
        field277++;
        int var7 = (Integer) arg0[0];
        class65 var8 = class122.method974(var7, (byte) 111);
        if (var8 == null) {
            return;
        }
        class83.field1898 = 0;
        int var9 = 0;
        int[] var10 = var8.field1356;
        int var11 = 0;
        int var12 = -1;
        if (arg5 != 18859) {
            return;
        }
        int[] var13 = var8.field1341;
        byte var14 = -1;
        try {
            class97.field2366 = new int[var8.field1353];
            class26.field523 = new class117[var8.field1352];
            int var15 = 0;
            int var16 = 0;
            for (int var17 = 1; var17 < arg0.length; var17++) {
                if (arg0[var17] instanceof Integer) {
                    int var18 = (Integer) arg0[var17];
                    if (var18 == -2147483647) {
                        var18 = arg3;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg2;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg1 == null ? -1 : arg1.field2125;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg1 == null ? -1 : arg1.field2122;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg4 == null ? -1 : arg4.field2125;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg4 == null ? -1 : arg4.field2122;
                    }
                    class97.field2366[var15++] = var18;
                } else if (arg0[var17] instanceof class117) {
                    class26.field523[var16++] = (class117) arg0[var17];
                }
            }
            int var19 = 0;
            label1476: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var12++;
                int var208 = var10[var12];
                if (var208 < 100) {
                    if (var208 == 0) {
                        class138.field3290[var11++] = var13[var12];
                        continue;
                    }
                    if (var208 == 1) {
                        int var20 = var13[var12];
                        class138.field3290[var11++] = class23.field461[var20];
                        continue;
                    }
                    if (var208 == 2) {
                        int var21 = var13[var12];
                        var11--;
                        class23.field461[var21] = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 3) {
                        class146.field3573[var9++] = var8.field1361[var12];
                        continue;
                    }
                    if (var208 == 6) {
                        var12 += var13[var12];
                        continue;
                    }
                    if (var208 == 7) {
                        var11 -= 2;
                        if (class138.field3290[var11 + 1] != class138.field3290[var11]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 8) {
                        var11 -= 2;
                        if (class138.field3290[var11 + 1] == class138.field3290[var11]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 9) {
                        var11 -= 2;
                        if (class138.field3290[var11 + 1] > class138.field3290[var11]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 10) {
                        var11 -= 2;
                        if (class138.field3290[var11] > class138.field3290[var11 + 1]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 21) {
                        if (class83.field1898 == 0) {
                            return;
                        }
                        class139 var22 = class55.field1141[--class83.field1898];
                        class97.field2366 = var22.field3294;
                        class26.field523 = var22.field3303;
                        var8 = var22.field3312;
                        var13 = var8.field1341;
                        var12 = var22.field3315;
                        var10 = var8.field1356;
                        continue;
                    }
                    if (var208 == 25) {
                        int var23 = var13[var12];
                        class138.field3290[var11++] = class44.method306((byte) 53, var23);
                        continue;
                    }
                    if (var208 == 27) {
                        int var24 = var13[var12];
                        int var10000 = arg5 - 18930;
                        var11--;
                        class143.method1148(var10000, class138.field3290[var11], var24);
                        continue;
                    }
                    if (var208 == 31) {
                        var11 -= 2;
                        if (class138.field3290[var11] <= class138.field3290[var11 + 1]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 32) {
                        var11 -= 2;
                        if (class138.field3290[var11] >= class138.field3290[var11 + 1]) {
                            var12 += var13[var12];
                        }
                        continue;
                    }
                    if (var208 == 33) {
                        class138.field3290[var11++] = class97.field2366[var13[var12]];
                        continue;
                    }
                    int var10001;
                    if (var208 == 34) {
                        var10001 = var13[var12];
                        var11--;
                        class97.field2366[var10001] = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 35) {
                        class146.field3573[var9++] = class26.field523[var13[var12]];
                        continue;
                    }
                    if (var208 == 36) {
                        var10001 = var13[var12];
                        var9--;
                        class26.field523[var10001] = class146.field3573[var9];
                        continue;
                    }
                    if (var208 == 37) {
                        int var25 = var13[var12];
                        var9 -= var25;
                        class117 var26 = class114.method888(class146.field3573, var9, 1, var25);
                        class146.field3573[var9++] = var26;
                        continue;
                    }
                    if (var208 == 38) {
                        var11--;
                        continue;
                    }
                    if (var208 == 39) {
                        var9--;
                        continue;
                    }
                    if (var208 == 40) {
                        int var27 = var13[var12];
                        class65 var28 = class122.method974(var27, (byte) 111);
                        int[] var29 = new int[var28.field1353];
                        class117[] var30 = new class117[var28.field1352];
                        for (int var31 = 0; var31 < var28.field1348; var31++) {
                            var29[var31] = class138.field3290[var11 + var31 - var28.field1348];
                        }
                        for (int var32 = 0; var32 < var28.field1340; var32++) {
                            var30[var32] = class146.field3573[var9 + var32 - var28.field1340];
                        }
                        var11 -= var28.field1348;
                        var9 -= var28.field1340;
                        class139 var33 = new class139();
                        var33.field3312 = var8;
                        var33.field3303 = class26.field523;
                        var8 = var28;
                        var33.field3315 = var12;
                        var12 = -1;
                        var33.field3294 = class97.field2366;
                        class55.field1141[class83.field1898++] = var33;
                        var13 = var28.field1341;
                        class97.field2366 = var29;
                        class26.field523 = var30;
                        var10 = var28.field1356;
                        continue;
                    }
                    if (var208 == 42) {
                        class138.field3290[var11++] = class139.field3300[var13[var12]];
                        continue;
                    }
                    if (var208 == 43) {
                        var10001 = var13[var12];
                        var11--;
                        class139.field3300[var10001] = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 44) {
                        var11--;
                        int var34 = class138.field3290[var11];
                        int var35 = var13[var12] & 0xFFFF;
                        int var36 = var13[var12] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            byte var37 = -1;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            class99.field2407[var36] = var34;
                            int var38 = 0;
                            while (true) {
                                if (var34 <= var38) {
                                    continue label1476;
                                }
                                class70.field1468[var36][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var208 == 45) {
                        int var39 = var13[var12];
                        var11--;
                        int var40 = class138.field3290[var11];
                        if (var40 >= 0 && class99.field2407[var39] > var40) {
                            class138.field3290[var11++] = class70.field1468[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var208 == 46) {
                        int var41 = var13[var12];
                        var11 -= 2;
                        int var42 = class138.field3290[var11];
                        if (var42 >= 0 && class99.field2407[var41] > var42) {
                            class70.field1468[var41][var42] = class138.field3290[var11 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var13[var12] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var208 < 1000) {
                    if (var208 == 100) {
                        var11 -= 3;
                        int var189 = class138.field3290[var11 + 1];
                        int var190 = class138.field3290[var11];
                        int var191 = class138.field3290[var11 + 2];
                        if (var189 == 0) {
                            throw new RuntimeException();
                        }
                        class89 var192 = class104.method801(var190, -68);
                        if (var192.field2084 == null) {
                            var192.field2084 = new class89[var191 + 1];
                        }
                        if (var192.field2084.length <= var191) {
                            class89[] var193 = new class89[var191 + 1];
                            for (int var194 = 0; var194 < var192.field2084.length; var194++) {
                                var193[var194] = var192.field2084[var194];
                            }
                            var192.field2084 = var193;
                        }
                        if (var191 > 0 && var192.field2084[var191 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var191 - 1));
                        }
                        class89 var195 = new class89();
                        var195.field2102 = true;
                        var195.field2154 = var195.field2125 = var192.field2125;
                        var195.field2122 = var191;
                        var195.field2142 = var189;
                        var192.field2084[var191] = var195;
                        if (var43) {
                            class95.field2304 = var195;
                        } else {
                            class121.field2888 = var195;
                        }
                        class50.method375(false, var192);
                        continue;
                    }
                    if (var208 == 101) {
                        class89 var196 = var43 ? class95.field2304 : class121.field2888;
                        class89 var197 = class104.method801(var196.field2125, -50);
                        var197.field2084[var196.field2122] = null;
                        class50.method375(false, var197);
                        continue;
                    }
                    if (var208 == 102) {
                        var11--;
                        class89 var198 = class104.method801(class138.field3290[var11], -116);
                        var198.field2084 = null;
                        class50.method375(false, var198);
                        continue;
                    }
                    if (var208 == 200) {
                        var11 -= 2;
                        int var199 = class138.field3290[var11 + 1];
                        int var200 = class138.field3290[var11];
                        class89 var201 = class82.method643(var200, (byte) 120, var199);
                        if (var201 != null && var199 != -1) {
                            class138.field3290[var11++] = 1;
                            if (var43) {
                                class95.field2304 = var201;
                            } else {
                                class121.field2888 = var201;
                            }
                            continue;
                        }
                        class138.field3290[var11++] = 0;
                        continue;
                    }
                } else if (var208 >= 1000 && var208 < 1100 || !(var208 < 2000 || var208 >= 2100)) {
                    class89 var188;
                    if (var208 >= 2000) {
                        var208 -= 1000;
                        var11--;
                        var188 = class104.method801(class138.field3290[var11], -123);
                    } else {
                        var188 = var43 ? class95.field2304 : class121.field2888;
                    }
                    class50.method375(false, var188);
                    if (var208 == 1000) {
                        var11 -= 2;
                        var188.field2133 = class138.field3290[var11];
                        var188.field2046 = class138.field3290[var11 + 1];
                        continue;
                    }
                    if (var208 == 1001) {
                        var11 -= 2;
                        var188.field2152 = class138.field3290[var11];
                        var188.field2095 = class138.field3290[var11 + 1];
                        continue;
                    }
                    if (var208 == 1003) {
                        var11--;
                        var188.field2120 = class138.field3290[var11] == 1;
                        continue;
                    }
                } else if (var208 >= 1100 && var208 < 1200 || !(var208 < 2100 || var208 >= 2200)) {
                    class89 var44;
                    if (var208 >= 2000) {
                        var11--;
                        var44 = class104.method801(class138.field3290[var11], arg5 ^ 0xFFFFB66D);
                        var208 -= 1000;
                    } else {
                        var44 = var43 ? class95.field2304 : class121.field2888;
                    }
                    class50.method375(false, var44);
                    if (var208 == 1100) {
                        var11 -= 2;
                        var44.field2103 = class138.field3290[var11];
                        if (var44.field2103 > var44.field2145 - var44.field2152) {
                            var44.field2103 = var44.field2145 - var44.field2152;
                        }
                        if (var44.field2103 < 0) {
                            var44.field2103 = 0;
                        }
                        var44.field2043 = class138.field3290[var11 + 1];
                        if (var44.field2123 - var44.field2095 < var44.field2043) {
                            var44.field2043 = var44.field2123 - var44.field2095;
                        }
                        if (var44.field2043 < 0) {
                            var44.field2043 = 0;
                        }
                        continue;
                    }
                    if (var208 == 1101) {
                        var11--;
                        var44.field2100 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1102) {
                        var11--;
                        var44.field2028 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1103) {
                        var11--;
                        var44.field2129 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1104) {
                        var11--;
                        var44.field2085 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1105) {
                        var11--;
                        var44.field2146 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1106) {
                        var11--;
                        var44.field2044 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1107) {
                        var11--;
                        var44.field2114 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1108) {
                        var44.field2091 = 1;
                        var11--;
                        var44.field2113 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1109) {
                        var11 -= 6;
                        var44.field2071 = class138.field3290[var11];
                        var44.field2149 = class138.field3290[var11 + 1];
                        var44.field2078 = class138.field3290[var11 + 2];
                        var44.field2150 = class138.field3290[var11 + 3];
                        var44.field2138 = class138.field3290[var11 + 4];
                        var44.field2147 = class138.field3290[var11 + 5];
                        continue;
                    }
                    if (var208 == 1110) {
                        var11--;
                        int var45 = class138.field3290[var11];
                        if (var44.field2064 != var45) {
                            var44.field2111 = 0;
                            var44.field2064 = var45;
                            var44.field2083 = 0;
                        }
                        continue;
                    }
                    if (var208 == 1111) {
                        var11--;
                        var44.field2042 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1112) {
                        var9--;
                        var44.field2118 = class146.field3573[var9];
                        continue;
                    }
                    if (var208 == 1113) {
                        var11--;
                        var44.field2144 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1114) {
                        var11 -= 3;
                        var44.field2049 = class138.field3290[var11];
                        var44.field2061 = class138.field3290[var11 + 1];
                        var44.field2033 = class138.field3290[var11 + 2];
                        continue;
                    }
                    if (var208 == 1115) {
                        var11--;
                        var44.field2109 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1116) {
                        var11--;
                        var44.field2115 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1117) {
                        var11--;
                        var44.field2131 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1118) {
                        var11--;
                        var44.field2082 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1119) {
                        var11--;
                        var44.field2059 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1120) {
                        var11 -= 2;
                        var44.field2145 = class138.field3290[var11];
                        var44.field2123 = class138.field3290[var11 + 1];
                        continue;
                    }
                } else if (var208 >= 1200 && var208 < 1300 || var208 >= 2200 && var208 < 2300) {
                    class89 var46;
                    if (var208 < 2000) {
                        var46 = var43 ? class95.field2304 : class121.field2888;
                    } else {
                        var11--;
                        var46 = class104.method801(class138.field3290[var11], -112);
                        var208 -= 1000;
                    }
                    class50.method375(false, var46);
                    if (var208 == 1200) {
                        var11 -= 2;
                        int var47 = class138.field3290[var11 + 1];
                        int var48 = class138.field3290[var11];
                        var46.field2069 = var47;
                        var46.field2070 = var48;
                        class72 var49 = class27.method206(var48, (byte) 90);
                        var46.field2078 = var49.field1570;
                        var46.field2149 = var49.field1589;
                        var46.field2150 = var49.field1578;
                        var46.field2147 = var49.field1556;
                        var46.field2071 = var49.field1579;
                        var46.field2138 = var49.field1542;
                        if (var46.field2152 > 0) {
                            var46.field2147 = var46.field2147 * 32 / var46.field2152;
                        }
                        continue;
                    }
                    if (var208 == 1201) {
                        var46.field2091 = 2;
                        var11--;
                        var46.field2113 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1202) {
                        var46.field2091 = 3;
                        var46.field2113 = class141.field3395.field355.method780(512);
                        continue;
                    }
                } else if (var208 >= 1300 && var208 < 1400 || var208 >= 2300 && var208 < 2400) {
                    class89 var50;
                    if (var208 >= 2000) {
                        var11--;
                        var50 = class104.method801(class138.field3290[var11], -124);
                        var208 -= 1000;
                    } else {
                        var50 = var43 ? class95.field2304 : class121.field2888;
                    }
                    if (var208 == 1300) {
                        var11--;
                        int var51 = class138.field3290[var11] - 1;
                        if (var51 >= 0 && var51 <= 9) {
                            var9--;
                            var50.method707(var51, class146.field3573[var9], true);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var208 == 1301) {
                        var11 -= 2;
                        int var52 = class138.field3290[var11];
                        int var53 = class138.field3290[var11 + 1];
                        var50.field2056 = class82.method643(var52, (byte) 111, var53);
                        continue;
                    }
                    if (var208 == 1302) {
                        var11--;
                        var50.field2034 = class138.field3290[var11] == 1;
                        continue;
                    }
                    if (var208 == 1303) {
                        var11--;
                        var50.field2081 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1304) {
                        var11--;
                        var50.field2137 = class138.field3290[var11];
                        continue;
                    }
                    if (var208 == 1305) {
                        var9--;
                        var50.field2105 = class146.field3573[var9];
                        continue;
                    }
                    if (var208 == 1306) {
                        var9--;
                        var50.field2068 = class146.field3573[var9];
                        continue;
                    }
                } else {
                    if (var208 >= 1400 && var208 < 1500 || var208 >= 2400 && var208 < 2500) {
                        int[] var54 = null;
                        class89 var55;
                        if (var208 >= 2000) {
                            var11--;
                            var55 = class104.method801(class138.field3290[var11], arg5 ^ 0xFFFFB635);
                            var208 -= 1000;
                        } else {
                            var55 = var43 ? class95.field2304 : class121.field2888;
                        }
                        var9--;
                        class117 var56 = class146.field3573[var9];
                        if (var56.method915(arg5 ^ 0x49B0) > 0 && var56.method911(false, var56.method915(27) - 1) == 89) {
                            var11--;
                            int var57 = class138.field3290[var11];
                            if (var57 > 0) {
                                var54 = new int[var57];
                                while (var57-- > 0) {
                                    var11--;
                                    var54[var57] = class138.field3290[var11];
                                }
                            }
                            var56 = var56.method943(0, (byte) 119, var56.method915(27) - 1);
                        }
                        Object[] var58 = new Object[var56.method915(27) + 1];
                        for (int var59 = var58.length - 1; var59 >= 1; var59--) {
                            if (var56.method911(false, var59 - 1) == 115) {
                                var9--;
                                var58[var59] = class146.field3573[var9];
                            } else {
                                var11--;
                                var58[var59] = Integer.valueOf(class138.field3290[var11]);
                            }
                        }
                        var11--;
                        int var60 = class138.field3290[var11];
                        if (var60 == -1) {
                            var58 = null;
                        } else {
                            var58[0] = Integer.valueOf(var60);
                        }
                        if (var208 == 1401) {
                            var55.field2096 = var58;
                        }
                        if (var208 == 1405) {
                            var55.field2052 = var58;
                        }
                        if (var208 == 1406) {
                            var55.field2036 = var58;
                        }
                        if (var208 == 1412) {
                            var55.field2051 = var58;
                        }
                        if (var208 == 1402) {
                            var55.field2029 = var58;
                        }
                        if (var208 == 1409) {
                            var55.field2108 = var58;
                        }
                        if (var208 == 1408) {
                            var55.field2141 = var58;
                        }
                        if (var208 == 1403) {
                            var55.field2053 = var58;
                        }
                        var55.field2062 = true;
                        if (var208 == 1414) {
                            var55.field2032 = var54;
                            var55.field2159 = var58;
                        }
                        if (var208 == 1400) {
                            var55.field2143 = var58;
                        }
                        if (var208 == 1410) {
                            var55.field2086 = var58;
                        }
                        if (var208 == 1404) {
                            var55.field2055 = var58;
                        }
                        if (var208 == 1415) {
                            var55.field2128 = var58;
                            var55.field2139 = var54;
                        }
                        if (var208 == 1422) {
                            var55.field2092 = var58;
                        }
                        if (var208 == 1407) {
                            var55.field2072 = var58;
                            var55.field2099 = var54;
                        }
                        if (var208 == 1416) {
                            var55.field2134 = var58;
                        }
                        if (var208 == 1417) {
                            var55.field2117 = var58;
                        }
                        if (var208 == 1411) {
                            var55.field2090 = var58;
                        }
                        continue;
                    }
                    if (var208 < 1600) {
                        class89 var187 = var43 ? class95.field2304 : class121.field2888;
                        if (var208 == 1500) {
                            class138.field3290[var11++] = var187.field2133;
                            continue;
                        }
                        if (var208 == 1501) {
                            class138.field3290[var11++] = var187.field2046;
                            continue;
                        }
                        if (var208 == 1502) {
                            class138.field3290[var11++] = var187.field2152;
                            continue;
                        }
                        if (var208 == 1503) {
                            class138.field3290[var11++] = var187.field2095;
                            continue;
                        }
                        if (var208 == 1504) {
                            class138.field3290[var11++] = var187.field2120 ? 1 : 0;
                            continue;
                        }
                        if (var208 == 1505) {
                            class138.field3290[var11++] = var187.field2154;
                            continue;
                        }
                    } else if (var208 < 1700) {
                        class89 var186 = var43 ? class95.field2304 : class121.field2888;
                        if (var208 == 1600) {
                            class138.field3290[var11++] = var186.field2103;
                            continue;
                        }
                        if (var208 == 1601) {
                            class138.field3290[var11++] = var186.field2043;
                            continue;
                        }
                        if (var208 == 1602) {
                            class146.field3573[var9++] = var186.field2118;
                            continue;
                        }
                        if (var208 == 1603) {
                            class138.field3290[var11++] = var186.field2145;
                            continue;
                        }
                        if (var208 == 1604) {
                            class138.field3290[var11++] = var186.field2123;
                            continue;
                        }
                        if (var208 == 1605) {
                            class138.field3290[var11++] = var186.field2147;
                            continue;
                        }
                        if (var208 == 1606) {
                            class138.field3290[var11++] = var186.field2078;
                            continue;
                        }
                        if (var208 == 1607) {
                            class138.field3290[var11++] = var186.field2138;
                            continue;
                        }
                        if (var208 == 1608) {
                            class138.field3290[var11++] = var186.field2150;
                            continue;
                        }
                    } else if (var208 < 1800) {
                        class89 var185 = var43 ? class95.field2304 : class121.field2888;
                        if (var208 == 1700) {
                            class138.field3290[var11++] = var185.field2070;
                            continue;
                        }
                        if (var208 == 1701) {
                            if (var185.field2070 == -1) {
                                class138.field3290[var11++] = 0;
                            } else {
                                class138.field3290[var11++] = var185.field2069;
                            }
                            continue;
                        }
                        if (var208 == 1702) {
                            class138.field3290[var11++] = var185.field2122;
                            continue;
                        }
                    } else if (var208 < 1900) {
                        class89 var183 = var43 ? class95.field2304 : class121.field2888;
                        if (var208 == 1800) {
                            class138.field3290[var11++] = class70.method497((byte) 111, class42.method292(var183, arg5 - 24306));
                            continue;
                        }
                        if (var208 == 1801) {
                            var11--;
                            int var184 = class138.field3290[var11];
                            if (var183.field2157 != null && var184 < var183.field2157.length && var183.field2157[var184] != null) {
                                class146.field3573[var9++] = var183.field2157[var184];
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 1802) {
                            if (var183.field2105 == null) {
                                class146.field3573[var9++] = class93.field2248;
                            } else {
                                class146.field3573[var9++] = var183.field2105;
                            }
                            continue;
                        }
                    } else if (var208 < 2600) {
                        var11--;
                        class89 var182 = class104.method801(class138.field3290[var11], -79);
                        if (var208 == 2500) {
                            class138.field3290[var11++] = var182.field2133;
                            continue;
                        }
                        if (var208 == 2501) {
                            class138.field3290[var11++] = var182.field2046;
                            continue;
                        }
                        if (var208 == 2502) {
                            class138.field3290[var11++] = var182.field2152;
                            continue;
                        }
                        if (var208 == 2503) {
                            class138.field3290[var11++] = var182.field2095;
                            continue;
                        }
                        if (var208 == 2504) {
                            class138.field3290[var11++] = var182.field2120 ? 1 : 0;
                            continue;
                        }
                        if (var208 == 2505) {
                            class138.field3290[var11++] = var182.field2154;
                            continue;
                        }
                    } else if (var208 < 2700) {
                        var11--;
                        class89 var181 = class104.method801(class138.field3290[var11], -119);
                        if (var208 == 2600) {
                            class138.field3290[var11++] = var181.field2103;
                            continue;
                        }
                        if (var208 == 2601) {
                            class138.field3290[var11++] = var181.field2043;
                            continue;
                        }
                        if (var208 == 2602) {
                            class146.field3573[var9++] = var181.field2118;
                            continue;
                        }
                        if (var208 == 2603) {
                            class138.field3290[var11++] = var181.field2145;
                            continue;
                        }
                        if (var208 == 2604) {
                            class138.field3290[var11++] = var181.field2123;
                            continue;
                        }
                        if (var208 == 2605) {
                            class138.field3290[var11++] = var181.field2147;
                            continue;
                        }
                        if (var208 == 2606) {
                            class138.field3290[var11++] = var181.field2078;
                            continue;
                        }
                        if (var208 == 2607) {
                            class138.field3290[var11++] = var181.field2138;
                            continue;
                        }
                        if (var208 == 2608) {
                            class138.field3290[var11++] = var181.field2150;
                            continue;
                        }
                    } else if (var208 < 2800) {
                        var11--;
                        class89 var180 = class104.method801(class138.field3290[var11], -106);
                        if (var208 == 2700) {
                            class138.field3290[var11++] = var180.field2070;
                            continue;
                        }
                        if (var208 == 2701) {
                            if (var180.field2070 == -1) {
                                class138.field3290[var11++] = 0;
                            } else {
                                class138.field3290[var11++] = var180.field2069;
                            }
                            continue;
                        }
                    } else if (var208 < 2900) {
                        var11--;
                        class89 var61 = class104.method801(class138.field3290[var11], -121);
                        if (var208 == 2800) {
                            class138.field3290[var11++] = class70.method497((byte) 111, class42.method292(var61, -5447));
                            continue;
                        }
                        if (var208 == 2801) {
                            var11--;
                            int var62 = class138.field3290[var11];
                            if (var61.field2157 != null && var61.field2157.length > var62 && var61.field2157[var62] != null) {
                                class146.field3573[var9++] = var61.field2157[var62];
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 2802) {
                            if (var61.field2105 == null) {
                                class146.field3573[var9++] = class93.field2248;
                            } else {
                                class146.field3573[var9++] = var61.field2105;
                            }
                            continue;
                        }
                    } else if (var208 < 3200) {
                        if (var208 == 3100) {
                            var9--;
                            class117 var178 = class146.field3573[var9];
                            class93.method739(0, 0, var178, class93.field2248);
                            continue;
                        }
                        if (var208 == 3101) {
                            var11 -= 2;
                            class68.method481(class141.field3395, class138.field3290[var11 + 1], class138.field3290[var11], true);
                            continue;
                        }
                        if (var208 == 3102) {
                            var11--;
                            int var179 = class138.field3290[var11];
                            if (var179 >= 0 && class27.field529.length > var179 && class27.field529[var179] != -1) {
                                class139.field3310 = true;
                                class55.field1144 = true;
                                class64.field1281 = var179;
                            }
                            continue;
                        }
                        if (var208 == 3103) {
                            class93.method735(true);
                            continue;
                        }
                    } else if (var208 < 3300) {
                        if (var208 == 3200) {
                            var11 -= 3;
                            class103.method795((byte) -108, class138.field3290[var11], class138.field3290[var11 + 1], class138.field3290[var11 + 2]);
                            continue;
                        }
                        if (var208 == 3201) {
                            var11--;
                            class35.method270((byte) 114, class138.field3290[var11]);
                            continue;
                        }
                        if (var208 == 3202) {
                            var11 -= 2;
                            class147.method1178(-1, class138.field3290[var11 + 1], class138.field3290[var11]);
                            continue;
                        }
                    } else if (var208 < 3400) {
                        if (var208 == 3300) {
                            class138.field3290[var11++] = class43.field856;
                            continue;
                        }
                        if (var208 == 3301) {
                            var11 -= 2;
                            int var156 = class138.field3290[var11 + 1];
                            int var157 = class138.field3290[var11];
                            class138.field3290[var11++] = class62.method429(var157, var156, (byte) 9);
                            continue;
                        }
                        if (var208 == 3302) {
                            var11 -= 2;
                            int var158 = class138.field3290[var11 + 1];
                            int var159 = class138.field3290[var11];
                            class138.field3290[var11++] = class41.method290(var159, var158, 0);
                            continue;
                        }
                        if (var208 == 3303) {
                            var11 -= 2;
                            int var160 = class138.field3290[var11 + 1];
                            int var161 = class138.field3290[var11];
                            class138.field3290[var11++] = class114.method884((byte) -93, var161, var160);
                            continue;
                        }
                        if (var208 == 3304) {
                            var11--;
                            int var162 = class138.field3290[var11];
                            class138.field3290[var11++] = class77.method573(5, var162).field1072;
                            continue;
                        }
                        if (var208 == 3305) {
                            var11--;
                            int var163 = class138.field3290[var11];
                            class138.field3290[var11++] = class82.field1880[var163];
                            continue;
                        }
                        if (var208 == 3306) {
                            var11--;
                            int var164 = class138.field3290[var11];
                            class138.field3290[var11++] = class42.field826[var164];
                            continue;
                        }
                        if (var208 == 3307) {
                            var11--;
                            int var165 = class138.field3290[var11];
                            class138.field3290[var11++] = class4.field66[var165];
                            continue;
                        }
                        if (var208 == 3308) {
                            int var166 = class140.field3344;
                            int var167 = (class141.field3395.field1998 >> 7) + class133.field3153;
                            int var168 = (class141.field3395.field1960 >> 7) + class19.field312;
                            class138.field3290[var11++] = (var166 << 28) + (var167 << 14) + var168;
                            continue;
                        }
                        if (var208 == 3309) {
                            var11--;
                            int var169 = class138.field3290[var11];
                            class138.field3290[var11++] = class16.method135(var169, 268430451) >> 14;
                            continue;
                        }
                        if (var208 == 3310) {
                            var11--;
                            int var170 = class138.field3290[var11];
                            class138.field3290[var11++] = var170 >> 28;
                            continue;
                        }
                        if (var208 == 3311) {
                            var11--;
                            int var171 = class138.field3290[var11];
                            class138.field3290[var11++] = class16.method135(16383, var171);
                            continue;
                        }
                        if (var208 == 3312) {
                            class138.field3290[var11++] = class146.field3569 ? 1 : 0;
                            continue;
                        }
                        if (var208 == 3313) {
                            var11 -= 2;
                            int var172 = class138.field3290[var11] + 32768;
                            int var173 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = class62.method429(var172, var173, (byte) 9);
                            continue;
                        }
                        if (var208 == 3314) {
                            var11 -= 2;
                            int var174 = class138.field3290[var11 + 1];
                            int var175 = class138.field3290[var11] + 32768;
                            class138.field3290[var11++] = class41.method290(var175, var174, arg5 - 18859);
                            continue;
                        }
                        if (var208 == 3315) {
                            var11 -= 2;
                            int var176 = class138.field3290[var11] + 32768;
                            int var177 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = class114.method884((byte) -93, var176, var177);
                            continue;
                        }
                        if (var208 == 3320) {
                            class138.field3290[var11++] = 0;
                            continue;
                        }
                        if (var208 == 3321) {
                            class138.field3290[var11++] = class22.field420;
                            continue;
                        }
                        if (var208 == 3322) {
                            class138.field3290[var11++] = class153.field3768;
                            continue;
                        }
                    } else if (var208 < 3500) {
                        if (var208 == 3400) {
                            var11 -= 2;
                            int var146 = class138.field3290[var11 + 1];
                            int var147 = class138.field3290[var11];
                            class97 var148 = class28.method212((byte) 41, var147);
                            for (int var149 = 0; var149 < var148.field2367; var149++) {
                                if (var148.field2354[var149] == var146) {
                                    class146.field3573[var9++] = var148.field2361[var149];
                                    var148 = null;
                                    break;
                                }
                            }
                            if (var148 != null) {
                                class146.field3573[var9++] = var148.field2346;
                            }
                            continue;
                        }
                        if (var208 == 3408) {
                            var11 -= 4;
                            int var150 = class138.field3290[var11];
                            int var151 = class138.field3290[var11 + 2];
                            int var152 = class138.field3290[var11 + 1];
                            int var153 = class138.field3290[var11 + 3];
                            class97 var154 = class28.method212((byte) 41, var151);
                            if (var154.field2345 == var150 && var154.field2350 == var152) {
                                for (int var155 = 0; var155 < var154.field2367; var155++) {
                                    if (var154.field2354[var155] == var153) {
                                        if (var152 == 115) {
                                            class146.field3573[var9++] = var154.field2361[var155];
                                        } else {
                                            class138.field3290[var11++] = var154.field2358[var155];
                                        }
                                        var154 = null;
                                        break;
                                    }
                                }
                                if (var154 != null) {
                                    if (var152 == 115) {
                                        class146.field3573[var9++] = var154.field2346;
                                    } else {
                                        class138.field3290[var11++] = var154.field2347;
                                    }
                                }
                                continue;
                            }
                            if (var152 == 115) {
                                class146.field3573[var9++] = class58.field1184;
                            } else {
                                class138.field3290[var11++] = 0;
                            }
                            continue;
                        }
                    } else if (var208 < 3700) {
                        if (var208 == 3600) {
                            if (class64.field1334 == 0) {
                                class138.field3290[var11++] = -2;
                            } else if (class64.field1334 == 1) {
                                class138.field3290[var11++] = -1;
                            } else {
                                class138.field3290[var11++] = class75.field1651;
                            }
                            continue;
                        }
                        if (var208 == 3601) {
                            var11--;
                            int var138 = class138.field3290[var11];
                            if (class64.field1334 == 2 && class75.field1651 > var138) {
                                class146.field3573[var9++] = class67.field1401[var138];
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 3602) {
                            var11--;
                            int var139 = class138.field3290[var11];
                            if (class64.field1334 == 2 && class75.field1651 > var139) {
                                class138.field3290[var11++] = class50.field1063[var139];
                                continue;
                            }
                            class138.field3290[var11++] = 0;
                            continue;
                        }
                        if (var208 == 3603) {
                            var11--;
                            int var140 = class138.field3290[var11];
                            if (class64.field1334 == 2 && class75.field1651 > var140) {
                                class138.field3290[var11++] = class31.field660[var140];
                                continue;
                            }
                            class138.field3290[var11++] = 0;
                            continue;
                        }
                        if (var208 == 3604) {
                            var9--;
                            class117 var141 = class146.field3573[var9];
                            var11--;
                            int var142 = class138.field3290[var11];
                            class73.method526(var142, 23572, var141);
                            continue;
                        }
                        if (var208 == 3611) {
                            if (class97.field2363 == null) {
                                class146.field3573[var9++] = class93.field2248;
                            } else {
                                class146.field3573[var9++] = class97.field2363;
                            }
                            continue;
                        }
                        if (var208 == 3612) {
                            if (class97.field2363 == null) {
                                class138.field3290[var11++] = 0;
                            } else {
                                class138.field3290[var11++] = class62.field1244;
                            }
                            continue;
                        }
                        if (var208 == 3613) {
                            var11--;
                            int var143 = class138.field3290[var11];
                            if (class97.field2363 != null && var143 < class62.field1244) {
                                class146.field3573[var9++] = class95.field2292[var143].field893;
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 3614) {
                            var11--;
                            int var144 = class138.field3290[var11];
                            if (class97.field2363 != null && class62.field1244 > var144) {
                                class138.field3290[var11++] = class95.field2292[var144].field892;
                                continue;
                            }
                            class138.field3290[var11++] = 0;
                            continue;
                        }
                        if (var208 == 3615) {
                            var11--;
                            int var145 = class138.field3290[var11];
                            if (class97.field2363 != null && var145 < class62.field1244) {
                                class138.field3290[var11++] = class95.field2292[var145].field891;
                                continue;
                            }
                            class138.field3290[var11++] = 0;
                            continue;
                        }
                    } else if (var208 < 4100) {
                        if (var208 == 4000) {
                            var11 -= 2;
                            int var105 = class138.field3290[var11];
                            int var106 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = var105 + var106;
                            continue;
                        }
                        if (var208 == 4001) {
                            var11 -= 2;
                            int var107 = class138.field3290[var11 + 1];
                            int var108 = class138.field3290[var11];
                            class138.field3290[var11++] = var108 - var107;
                            continue;
                        }
                        if (var208 == 4002) {
                            var11 -= 2;
                            int var109 = class138.field3290[var11];
                            int var110 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = var109 * var110;
                            continue;
                        }
                        if (var208 == 4003) {
                            var11 -= 2;
                            int var111 = class138.field3290[var11 + 1];
                            int var112 = class138.field3290[var11];
                            class138.field3290[var11++] = var112 / var111;
                            continue;
                        }
                        if (var208 == 4004) {
                            var11--;
                            int var113 = class138.field3290[var11];
                            class138.field3290[var11++] = (int) ((double) var113 * Math.random());
                            continue;
                        }
                        if (var208 == 4005) {
                            var11--;
                            int var114 = class138.field3290[var11];
                            class138.field3290[var11++] = (int) ((double) (var114 + 1) * Math.random());
                            continue;
                        }
                        if (var208 == 4006) {
                            var11 -= 5;
                            int var115 = class138.field3290[var11 + 1];
                            int var116 = class138.field3290[var11];
                            int var117 = class138.field3290[var11 + 2];
                            int var118 = class138.field3290[var11 + 3];
                            int var119 = class138.field3290[var11 + 4];
                            class138.field3290[var11++] = var116 + (var115 - var116) * (-var117 + var119) / (var118 - var117);
                            continue;
                        }
                        if (var208 == 4007) {
                            var11 -= 2;
                            int var120 = class138.field3290[var11];
                            int var121 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = var120 * var121 / 100 + var120;
                            continue;
                        }
                        if (var208 == 4008) {
                            var11 -= 2;
                            int var122 = class138.field3290[var11 + 1];
                            int var123 = class138.field3290[var11];
                            class138.field3290[var11++] = class96.method763(var123, 0x1 << var122);
                            continue;
                        }
                        if (var208 == 4009) {
                            var11 -= 2;
                            int var124 = class138.field3290[var11];
                            int var125 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = class16.method135(var124, -(0x1 << var125) - 1);
                            continue;
                        }
                        if (var208 == 4010) {
                            var11 -= 2;
                            int var126 = class138.field3290[var11 + 1];
                            int var127 = class138.field3290[var11];
                            class138.field3290[var11++] = class16.method135(0x1 << var126, var127) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var208 == 4011) {
                            var11 -= 2;
                            int var128 = class138.field3290[var11 + 1];
                            int var129 = class138.field3290[var11];
                            class138.field3290[var11++] = var129 % var128;
                            continue;
                        }
                        if (var208 == 4012) {
                            var11 -= 2;
                            int var130 = class138.field3290[var11];
                            int var131 = class138.field3290[var11 + 1];
                            if (var130 == 0) {
                                class138.field3290[var11++] = 0;
                            } else {
                                class138.field3290[var11++] = (int) Math.pow((double) var130, (double) var131);
                            }
                            continue;
                        }
                        if (var208 == 4013) {
                            var11 -= 2;
                            int var132 = class138.field3290[var11];
                            int var133 = class138.field3290[var11 + 1];
                            if (var132 == 0) {
                                class138.field3290[var11++] = 0;
                            } else if (var133 == 0) {
                                class138.field3290[var11++] = Integer.MAX_VALUE;
                            } else {
                                class138.field3290[var11++] = (int) Math.pow((double) var132, 1.0D / (double) var133);
                            }
                            continue;
                        }
                        if (var208 == 4014) {
                            var11 -= 2;
                            int var134 = class138.field3290[var11];
                            int var135 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = class16.method135(var134, var135);
                            continue;
                        }
                        if (var208 == 4015) {
                            var11 -= 2;
                            int var136 = class138.field3290[var11];
                            int var137 = class138.field3290[var11 + 1];
                            class138.field3290[var11++] = class96.method763(var136, var137);
                            continue;
                        }
                    } else if (var208 < 4200) {
                        if (var208 == 4100) {
                            var9--;
                            class117 var63 = class146.field3573[var9];
                            var11--;
                            int var64 = class138.field3290[var11];
                            class146.field3573[var9++] = class73.method530((byte) -83, new class117[] { var63, class79.method614(15591, var64) });
                            continue;
                        }
                        if (var208 == 4101) {
                            var9 -= 2;
                            class117 var65 = class146.field3573[var9 + 1];
                            class117 var66 = class146.field3573[var9];
                            class146.field3573[var9++] = class73.method530((byte) -83, new class117[] { var66, var65 });
                            continue;
                        }
                        if (var208 == 4102) {
                            var9--;
                            class117 var67 = class146.field3573[var9];
                            var11--;
                            int var68 = class138.field3290[var11];
                            class146.field3573[var9++] = class73.method530((byte) -83, new class117[] { var67, class87.method690(true, var68, true) });
                            continue;
                        }
                        if (var208 == 4103) {
                            var9--;
                            class117 var69 = class146.field3573[var9];
                            class146.field3573[var9++] = var69.method925(true);
                            continue;
                        }
                        if (var208 == 4104) {
                            var11--;
                            int var70 = class138.field3290[var11];
                            long var71 = (long) var70 * 86400000L + 1014768000000L;
                            class77.field1695.setTime(new Date(var71));
                            int var73 = class77.field1695.get(5);
                            int var74 = class77.field1695.get(2);
                            int var75 = class77.field1695.get(1);
                            class146.field3573[var9++] = class73.method530((byte) -83, new class117[] { class79.method614(15591, var73), class129.field3060, class60.field1212[var74], class129.field3060, class79.method614(15591, var75) });
                            continue;
                        }
                        if (var208 == 4105) {
                            var9 -= 2;
                            class117 var76 = class146.field3573[var9 + 1];
                            class117 var77 = class146.field3573[var9];
                            if (class141.field3395.field355 != null && class141.field3395.field355.field2403) {
                                class146.field3573[var9++] = var76;
                                continue;
                            }
                            class146.field3573[var9++] = var77;
                            continue;
                        }
                        if (var208 == 4106) {
                            var11--;
                            int var78 = class138.field3290[var11];
                            class146.field3573[var9++] = class79.method614(arg5 - 3268, var78);
                            continue;
                        }
                        if (var208 == 4107) {
                            var9 -= 2;
                            class138.field3290[var11++] = class146.field3573[var9].method921(class146.field3573[var9 + 1], class138.method1074(arg5, 18909));
                            continue;
                        }
                        if (var208 == 4108) {
                            var11 -= 2;
                            var9--;
                            class117 var79 = class146.field3573[var9];
                            int var80 = class138.field3290[var11];
                            int var81 = class138.field3290[var11 + 1];
                            byte[] var82 = class120.field2871.method458(false, 0, var81);
                            class46 var83 = new class46(var82);
                            class138.field3290[var11++] = var83.method316(var79, var80);
                            continue;
                        }
                        if (var208 == 4109) {
                            var11 -= 2;
                            int var84 = class138.field3290[var11];
                            var9--;
                            class117 var85 = class146.field3573[var9];
                            int var86 = class138.field3290[var11 + 1];
                            byte[] var87 = class120.field2871.method458(false, 0, var86);
                            class46 var88 = new class46(var87);
                            class138.field3290[var11++] = var88.method328(var85, var84);
                            continue;
                        }
                        if (var208 == 4110) {
                            var9 -= 2;
                            class117 var89 = class146.field3573[var9 + 1];
                            class117 var90 = class146.field3573[var9];
                            var11--;
                            if (class138.field3290[var11] == 1) {
                                class146.field3573[var9++] = var90;
                            } else {
                                class146.field3573[var9++] = var89;
                            }
                            continue;
                        }
                    } else if (var208 < 4300) {
                        if (var208 == 4200) {
                            var11--;
                            int var91 = class138.field3290[var11];
                            class146.field3573[var9++] = class27.method206(var91, (byte) 90).field1544;
                            continue;
                        }
                        if (var208 == 4201) {
                            var11 -= 2;
                            int var92 = class138.field3290[var11 + 1];
                            int var93 = class138.field3290[var11];
                            class72 var94 = class27.method206(var93, (byte) 90);
                            if (var92 >= 1 && var92 <= 5 && var94.field1563[var92 - 1] != null) {
                                class146.field3573[var9++] = var94.field1563[var92 - 1];
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 4202) {
                            var11 -= 2;
                            int var95 = class138.field3290[var11 + 1];
                            int var96 = class138.field3290[var11];
                            class72 var97 = class27.method206(var96, (byte) 90);
                            if (var95 >= 1 && var95 <= 5 && var97.field1593[var95 - 1] != null) {
                                class146.field3573[var9++] = var97.field1593[var95 - 1];
                                continue;
                            }
                            class146.field3573[var9++] = class93.field2248;
                            continue;
                        }
                        if (var208 == 4203) {
                            var11--;
                            int var98 = class138.field3290[var11];
                            class138.field3290[var11++] = class27.method206(var98, (byte) 90).field1568;
                            continue;
                        }
                        if (var208 == 4204) {
                            var11--;
                            int var99 = class138.field3290[var11];
                            class138.field3290[var11++] = class27.method206(var99, (byte) 90).field1590 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var208 == 4205) {
                            var11--;
                            int var100 = class138.field3290[var11];
                            class72 var101 = class27.method206(var100, (byte) 90);
                            if (var101.field1551 == -1 && var101.field1547 >= 0) {
                                class138.field3290[var11++] = var101.field1547;
                                continue;
                            }
                            class138.field3290[var11++] = var100;
                            continue;
                        }
                        if (var208 == 4206) {
                            var11--;
                            int var102 = class138.field3290[var11];
                            class72 var103 = class27.method206(var102, (byte) 90);
                            if (var103.field1551 >= 0 && var103.field1547 >= 0) {
                                class138.field3290[var11++] = var103.field1547;
                                continue;
                            }
                            class138.field3290[var11++] = var102;
                            continue;
                        }
                        if (var208 == 4207) {
                            var11--;
                            int var104 = class138.field3290[var11];
                            class138.field3290[var11++] = class27.method206(var104, (byte) 90).field1581 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class117 var202 = class100.method783(30, (byte) 126);
                if (var8.field1360 != null) {
                    var202.method909(class32.field692, -12860).method909(var8.field1360, -12860);
                    for (int var203 = class83.field1898 - 1; var203 >= 0; var203--) {
                        var202.method909(class45.field882, arg5 - 31719).method909(class55.field1141[var203].field3312.field1360, -12860);
                    }
                    if (class89.field2135 != 0) {
                        class93.method739(0, 0, class73.method530((byte) -83, new class117[] { class120.field2870, var8.field1360 }), class93.field2248);
                    }
                }
                class105.method803((byte) -83, null, "CS2 - nosuchop:" + var208 + new String(var202.method940(127)));
                return;
            }
        } catch (Exception var207) {
            class117 var205 = class100.method783(30, (byte) 125);
            if (var8.field1360 != null) {
                var205.method909(class32.field692, -12860).method909(var8.field1360, arg5 - 31719);
                for (int var206 = class83.field1898 - 1; var206 >= 0; var206--) {
                    var205.method909(class45.field882, -12860).method909(class55.field1141[var206].field3312.field1360, -12860);
                }
                if (class89.field2135 != 0) {
                    class93.method739(0, 0, class73.method530((byte) -83, new class117[] { class120.field2870, var8.field1360 }), class93.field2248);
                }
            }
            class105.method803((byte) -100, var207, "CS2 - scr:" + var8.field1495 + " op:" + var14 + new String(var205.method940(119)));
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
    public static final boolean method146(int arg0, int arg1, int arg2) {
        class148 var3 = class23.method181((byte) -89, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg2 >= -106) {
            return true;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field273++;
        return var3.method1193((byte) -123, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Object;ILu;)V")
    public static final void method147(Object arg0, int arg1, class137 arg2) {
        field290++;
        if (arg2.field3275 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3275.peekEvent() != null; var3++) {
            class148.method1183(0, 1L);
        }
        if (arg0 != null) {
            arg2.field3275.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg1 != 50) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLmd;)V")
    public static final void method148(byte arg0, class87 arg1) {
        field282++;
        if (arg1.field1972 == 0) {
            return;
        }
        if (arg1.field1996 != -1 && arg1.field1996 < 32768) {
            class58 var2 = class72.field1533[arg1.field1996];
            if (var2 != null) {
                int var3 = arg1.field1998 - var2.field1998;
                int var4 = arg1.field1960 - var2.field1960;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1969 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1996 >= 32768) {
            int var5 = arg1.field1996 - 32768;
            if (class43.field857 == var5) {
                var5 = 2047;
            }
            class21 var6 = class149.field3709[var5];
            if (var6 != null) {
                int var7 = arg1.field1998 - var6.field1998;
                int var8 = arg1.field1960 - var6.field1960;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1969 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2022 != 0 || arg1.field1985 != 0) && (arg1.field1963 == 0 || arg1.field1964 > 0)) {
            int var9 = arg1.field1960 - (arg1.field1985 - class19.field312 - class19.field312) * 64;
            int var10 = arg1.field1998 - (arg1.field2022 - class133.field3153 - class133.field3153) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field1969 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field1985 = 0;
            arg1.field2022 = 0;
        }
        int var11 = -108 % ((-arg0 - 7) / 40);
        int var12 = arg1.field1969 - arg1.field1999 & 0x7FF;
        if (var12 == 0) {
            arg1.field1950 = 0;
            return;
        }
        arg1.field1950++;
        if (var12 > 1024) {
            arg1.field1999 -= arg1.field1972;
            boolean var13 = true;
            if (arg1.field1972 > var12 || var12 > 2048 - arg1.field1972) {
                arg1.field1999 = arg1.field1969;
                var13 = false;
            }
            if (arg1.field2019 == arg1.field1949 && (arg1.field1950 > 25 || var13)) {
                if (arg1.field1975 == -1) {
                    arg1.field1949 = arg1.field1982;
                } else {
                    arg1.field1949 = arg1.field1975;
                }
            }
        } else {
            arg1.field1999 += arg1.field1972;
            boolean var14 = true;
            if (arg1.field1972 > var12 || var12 > 2048 - arg1.field1972) {
                var14 = false;
                arg1.field1999 = arg1.field1969;
            }
            if (arg1.field2019 == arg1.field1949 && (arg1.field1950 > 25 || var14)) {
                if (arg1.field1946 == -1) {
                    arg1.field1949 = arg1.field1982;
                } else {
                    arg1.field1949 = arg1.field1946;
                }
            }
        }
        arg1.field1999 &= 0x7FF;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lma;III)V")
    public static final void method149(class84 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 3603) {
            field266 = 10;
        }
        field287++;
        int var4 = arg1 * arg1 + arg2 * arg2;
        if (var4 <= 4225 || var4 >= 90000) {
            class140.method1088(arg1, false, arg0, arg2);
            return;
        }
        int var5 = class48.field967 + class128.field3035 & 0x7FF;
        int var6 = class12.field180[var5];
        int var7 = var6 * 256 / (class53.field1096 + 256);
        int var8 = class12.field177[var5];
        int var9 = var8 * 256 / (class53.field1096 + 256);
        int var10 = arg1 * var9 - arg2 * var7 >> 16;
        int var11 = arg1 * var7 + arg2 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class152.field3740.method655(var14 + 84 + 4, 83 - (var15 + 20), 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method150(byte arg0) {
        field288 = null;
        field275 = null;
        field283 = null;
        field289 = null;
        field268 = null;
        field265 = null;
        field269 = null;
        if (arg0 <= 39) {
            method147(null, -86, null);
        }
        field278 = null;
        field284 = null;
        field285 = null;
        field272 = null;
        field271 = null;
        field276 = null;
        field270 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method151(int arg0) {
        field281++;
        class120.method964(1);
        class134.field3204 = true;
        class124.method982((byte) -117);
        if (arg0 != -17537) {
            field284 = null;
        }
        if (class140.field3343 != -1) {
            boolean var1 = class19.method153(1, -19850, class140.field3343, 190, 0, 261, 0);
            if (!var1) {
                class139.field3310 = true;
            }
        } else if (class27.field529[class64.field1281] != -1) {
            boolean var2 = class19.method153(1, -19850, class27.field529[class64.field1281], 190, 0, 261, 0);
            if (!var2) {
                class139.field3310 = true;
            }
        }
        if (class81.field1864 && class24.field468 == 1) {
            if (class144.field3539 == 1) {
                class53.method392(false);
            } else {
                class58.method415(117);
            }
        }
        class66.method472(false);
    }
}
