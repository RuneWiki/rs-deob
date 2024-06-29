import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[Z")
    public static boolean[] field947 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lmb;")
    public static class84 field956 = class79.method672(true, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lmb;")
    private static class84 field945 = class79.method672(true, "Login server offline)3");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lmb;")
    public static class84 field952 = field945;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lmb;")
    public static class84 field950 = class79.method672(true, "::");

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lmb;")
    private static class84 field960 = class79.method672(true, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lmb;")
    private static class84 field958 = class79.method672(true, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lmb;")
    public static class84 field948 = class79.method672(true, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lmb;")
    public static class84 field957 = field960;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lmb;")
    public static class84 field954 = field958;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lmb;")
    private static class84 field963 = class79.method672(true, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lmb;")
    public static class84 field951 = field963;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
    public static boolean field949;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[I")
    public static int[] field955;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method316(int arg0, int arg1) {
        field953++;
        if (arg1 <= 120) {
            field945 = null;
        }
        int[] var2 = class102.field2490.field2691;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class62.field1540[arg0][var21][var5] & 0x18) == 0) {
                    class133.field3173.method452(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class62.field1540[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class133.field3173.method452(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class102.field2490.method906();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class62.field1540[arg0][var19][var8] & 0x18) == 0) {
                    class74.method639(var8, arg0, var7, var19, var6, -27671);
                }
                if (arg0 < 3 && (class62.field1540[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class74.method639(var8, arg0 + 1, var7, var19, var6, -27671);
                }
            }
        }
        class64.field1588 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class133.field3173.method459(class13.field251, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class77.method661(var12, -88).field770;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class65.field1603[class13.field251].field1591;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var10 - 3 < var14 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class143.field3439[class64.field1588] = class128.field3088[var13];
                        client.field494[class64.field1588] = var15;
                        class107.field2595[class64.field1588] = var14;
                        class64.field1588++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    public static final void method317(boolean arg0, int arg1) {
        int var2 = -27 % ((arg1 + 18) / 39);
        for (int var3 = 0; var3 < class77.field1940; var3++) {
            class103 var4 = class69.field1673[class87.field2146[var3]];
            int var5 = (class87.field2146[var3] << 14) + 536870912;
            if (var4 != null && var4.method569((byte) -112) && arg0 == var4.field2510.field3389 && var4.field2510.method1142(-1)) {
                int var6 = var4.field3549 >> 7;
                int var7 = var4.field3535 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field3562 == 1 && (var4.field3549 & 0x7F) == 64 && (var4.field3535 & 0x7F) == 64) {
                        if (class64.field1587[var6][var7] == class20.field416) {
                            continue;
                        }
                        class64.field1587[var6][var7] = class20.field416;
                    }
                    if (!var4.field2510.field3397) {
                        var5 += Integer.MIN_VALUE;
                    }
                    class133.field3173.method494(class13.field251, var4.field3549, var4.field3535, class41.method309((byte) 64, var4.field3549 + var4.field3562 * 64 - 64, (var4.field3562 + -1) * 64 + var4.field3535, class13.field251), var4.field3562 * 64 - 4, var4, var4.field3521, var5, var4.field3544);
                }
            }
        }
        field961++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        field954 = null;
        field950 = null;
        field951 = null;
        field947 = null;
        field960 = null;
        field952 = null;
        field948 = null;
        field958 = null;
        field945 = null;
        field956 = null;
        if (arg0 != 37) {
            method317(false, 125);
        }
        field955 = null;
        field957 = null;
        field963 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
    public static final void method319(int arg0, int arg1) {
        if (arg0 != -8808784) {
            field958 = null;
        }
        for (class19 var2 = (class19) class50.field1071.method962(true); var2 != null; var2 = (class19) class50.field1071.method956(-1)) {
            if ((var2.field370 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method121(false);
            }
        }
        field946++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILia;I[Ljava/lang/Object;ZILia;)V")
    public static final void method320(int arg0, class57 arg1, int arg2, Object[] arg3, boolean arg4, int arg5, class57 arg6) {
        field962++;
        int var7 = (Integer) arg3[0];
        class120 var8 = class136.method1098(arg4, var7);
        if (!arg4) {
            method320(-72, null, 118, null, false, -94, null);
        }
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = -1;
        int[] var11 = var8.field2875;
        int[] var12 = var8.field2888;
        int var13 = 0;
        byte var14 = -1;
        try {
            class107.field2582 = new class84[var8.field2890];
            class40.field918 = new int[var8.field2886];
            int var15 = 0;
            int var16 = 0;
            for (int var17 = 1; var17 < arg3.length; var17++) {
                if (arg3[var17] instanceof Integer) {
                    int var18 = (Integer) arg3[var17];
                    if (var18 == -2147483647) {
                        var18 = arg5;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg2;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg6 == null ? -1 : arg6.field1369;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg0;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg6 == null ? -1 : arg6.field1425;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg1 == null ? -1 : arg1.field1369;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg1 == null ? -1 : arg1.field1425;
                    }
                    class40.field918[var15++] = var18;
                } else if (arg3[var17] instanceof class84) {
                    class107.field2582[var16++] = (class84) arg3[var17];
                }
            }
            int var19 = 0;
            label1241: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var183 = var11[var10];
                if (var183 < 100) {
                    if (var183 == 0) {
                        class141.field3391[var9++] = var12[var10];
                        continue;
                    }
                    if (var183 == 1) {
                        int var20 = var12[var10];
                        class141.field3391[var9++] = class141.field3416[var20];
                        continue;
                    }
                    if (var183 == 2) {
                        int var21 = var12[var10];
                        var9--;
                        class141.field3416[var21] = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 3) {
                        class20.field420[var13++] = var8.field2881[var10];
                        continue;
                    }
                    if (var183 == 6) {
                        var10 += var12[var10];
                        continue;
                    }
                    if (var183 == 7) {
                        var9 -= 2;
                        if (class141.field3391[var9 + 1] != class141.field3391[var9]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 8) {
                        var9 -= 2;
                        if (class141.field3391[var9 + 1] == class141.field3391[var9]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 9) {
                        var9 -= 2;
                        if (class141.field3391[var9 + 1] > class141.field3391[var9]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 10) {
                        var9 -= 2;
                        if (class141.field3391[var9 + 1] < class141.field3391[var9]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 21) {
                        if (class127.field3070 == 0) {
                            return;
                        }
                        class72 var22 = class115.field2746[--class127.field3070];
                        class40.field918 = var22.field1766;
                        var8 = var22.field1765;
                        var11 = var8.field2875;
                        var12 = var8.field2888;
                        class107.field2582 = var22.field1772;
                        var10 = var22.field1759;
                        continue;
                    }
                    if (var183 == 25) {
                        int var23 = var12[var10];
                        class141.field3391[var9++] = class136.method1103(-125, var23);
                        continue;
                    }
                    if (var183 == 27) {
                        int var24 = var12[var10];
                        var9--;
                        class87.method745(class141.field3391[var9], var24, (byte) -128);
                        continue;
                    }
                    if (var183 == 31) {
                        var9 -= 2;
                        if (class141.field3391[var9] <= class141.field3391[var9 + 1]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 32) {
                        var9 -= 2;
                        if (class141.field3391[var9] >= class141.field3391[var9 + 1]) {
                            var10 += var12[var10];
                        }
                        continue;
                    }
                    if (var183 == 33) {
                        class141.field3391[var9++] = class40.field918[var12[var10]];
                        continue;
                    }
                    int var10001;
                    if (var183 == 34) {
                        var10001 = var12[var10];
                        var9--;
                        class40.field918[var10001] = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 35) {
                        class20.field420[var13++] = class107.field2582[var12[var10]];
                        continue;
                    }
                    if (var183 == 36) {
                        var10001 = var12[var10];
                        var13--;
                        class107.field2582[var10001] = class20.field420[var13];
                        continue;
                    }
                    if (var183 == 37) {
                        int var25 = var12[var10];
                        var13 -= var25;
                        class84 var26 = class118.method961(var25, 0, var13, class20.field420);
                        class20.field420[var13++] = var26;
                        continue;
                    }
                    if (var183 == 38) {
                        var9--;
                        continue;
                    }
                    if (var183 == 39) {
                        var13--;
                        continue;
                    }
                    if (var183 == 40) {
                        int var27 = var12[var10];
                        class120 var28 = class136.method1098(true, var27);
                        int[] var29 = new int[var28.field2886];
                        class84[] var30 = new class84[var28.field2890];
                        for (int var31 = 0; var31 < var28.field2873; var31++) {
                            var29[var31] = class141.field3391[var9 + var31 - var28.field2873];
                        }
                        for (int var32 = 0; var32 < var28.field2885; var32++) {
                            var30[var32] = class20.field420[var13 + var32 - var28.field2885];
                        }
                        var9 -= var28.field2873;
                        var13 -= var28.field2885;
                        class72 var33 = new class72();
                        var33.field1766 = class40.field918;
                        var33.field1765 = var8;
                        var33.field1772 = class107.field2582;
                        var33.field1759 = var10;
                        var8 = var28;
                        class115.field2746[class127.field3070++] = var33;
                        var12 = var28.field2888;
                        var11 = var28.field2875;
                        class107.field2582 = var30;
                        class40.field918 = var29;
                        var10 = -1;
                        continue;
                    }
                    if (var183 == 42) {
                        class141.field3391[var9++] = class79.field1950[var12[var10]];
                        continue;
                    }
                    if (var183 == 43) {
                        var10001 = var12[var10];
                        var9--;
                        class79.field1950[var10001] = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 44) {
                        int var34 = var12[var10] & 0xFFFF;
                        var9--;
                        int var35 = class141.field3391[var9];
                        int var36 = var12[var10] >> 16;
                        if (var35 >= 0 && var35 <= 5000) {
                            class15.field318[var36] = var35;
                            byte var37 = -1;
                            if (var34 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var35 <= var38) {
                                    continue label1241;
                                }
                                class97.field2404[var36][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 45) {
                        var9--;
                        int var39 = class141.field3391[var9];
                        int var40 = var12[var10];
                        if (var39 >= 0 && var39 < class15.field318[var40]) {
                            class141.field3391[var9++] = class97.field2404[var40][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 46) {
                        var9 -= 2;
                        int var41 = var12[var10];
                        int var42 = class141.field3391[var9];
                        if (var42 >= 0 && class15.field318[var41] > var42) {
                            class97.field2404[var41][var42] = class141.field3391[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var12[var10] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var183 < 1000) {
                    if (var183 == 100) {
                        var9 -= 3;
                        int var168 = class141.field3391[var9 + 1];
                        int var169 = class141.field3391[var9];
                        int var170 = class141.field3391[var9 + 2];
                        if (var168 == 0) {
                            throw new RuntimeException();
                        }
                        class57 var171 = class97.method805(-894550512, var169);
                        if (var171.field1410 == null) {
                            var171.field1410 = new class57[var170 + 1];
                        }
                        if (var170 >= var171.field1410.length) {
                            class57[] var172 = new class57[var170 + 1];
                            for (int var173 = 0; var173 < var171.field1410.length; var173++) {
                                var172[var173] = var171.field1410[var173];
                            }
                            var171.field1410 = var172;
                        }
                        if (var170 > 0 && var171.field1410[var170 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var170 - 1));
                        }
                        class57 var174 = new class57();
                        var174.field1392 = true;
                        var174.field1443 = var174.field1369 = var171.field1369;
                        var174.field1385 = var168;
                        var174.field1425 = var170;
                        var171.field1410[var170] = var174;
                        if (var43) {
                            class133.field3167 = var174;
                        } else {
                            class54.field1242 = var174;
                        }
                        class139.method1133(var171, -104);
                        continue;
                    }
                    if (var183 == 101) {
                        class57 var175 = var43 ? class133.field3167 : class54.field1242;
                        class57 var176 = class97.method805(-894550512, var175.field1369);
                        var176.field1410[var175.field1425] = null;
                        class139.method1133(var176, -122);
                        continue;
                    }
                    if (var183 == 102) {
                        var9--;
                        class57 var177 = class97.method805(-894550512, class141.field3391[var9]);
                        var177.field1410 = null;
                        class139.method1133(var177, -104);
                        continue;
                    }
                    if (var183 == 200) {
                        var9 -= 2;
                        int var178 = class141.field3391[var9];
                        int var179 = class141.field3391[var9 + 1];
                        class57 var180 = class50.method361(var178, var179, 64);
                        if (var180 != null && var179 != -1) {
                            class141.field3391[var9++] = 1;
                            if (var43) {
                                class133.field3167 = var180;
                            } else {
                                class54.field1242 = var180;
                            }
                            continue;
                        }
                        class141.field3391[var9++] = 0;
                        continue;
                    }
                } else if (var183 >= 1000 && var183 < 1100 || var183 >= 2000 && var183 < 2100) {
                    class57 var167;
                    if (var183 >= 2000) {
                        var9--;
                        var167 = class97.method805(-894550512, class141.field3391[var9]);
                        var183 -= 1000;
                    } else {
                        var167 = var43 ? class133.field3167 : class54.field1242;
                    }
                    class139.method1133(var167, 77);
                    if (var183 == 1000) {
                        var9 -= 2;
                        var167.field1348 = class141.field3391[var9];
                        var167.field1433 = class141.field3391[var9 + 1];
                        continue;
                    }
                    if (var183 == 1001) {
                        var9 -= 2;
                        var167.field1365 = class141.field3391[var9];
                        var167.field1332 = class141.field3391[var9 + 1];
                        continue;
                    }
                    if (var183 == 1003) {
                        var9--;
                        var167.field1415 = class141.field3391[var9] == 1;
                        continue;
                    }
                } else if (var183 >= 1100 && var183 < 1200 || !(var183 < 2100 || var183 >= 2200)) {
                    class57 var44;
                    if (var183 < 2000) {
                        var44 = var43 ? class133.field3167 : class54.field1242;
                    } else {
                        var183 -= 1000;
                        var9--;
                        var44 = class97.method805(-894550512, class141.field3391[var9]);
                    }
                    class139.method1133(var44, 86);
                    if (var183 == 1100) {
                        var9 -= 2;
                        var44.field1380 = class141.field3391[var9];
                        if (var44.field1380 > var44.field1329 - var44.field1365) {
                            var44.field1380 = var44.field1329 - var44.field1365;
                        }
                        if (var44.field1380 < 0) {
                            var44.field1380 = 0;
                        }
                        var44.field1334 = class141.field3391[var9 + 1];
                        if (var44.field1314 - var44.field1332 < var44.field1334) {
                            var44.field1334 = var44.field1314 - var44.field1332;
                        }
                        if (var44.field1334 < 0) {
                            var44.field1334 = 0;
                        }
                        continue;
                    }
                    if (var183 == 1101) {
                        var9--;
                        var44.field1316 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1102) {
                        var9--;
                        var44.field1325 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1103) {
                        var9--;
                        var44.field1364 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1104) {
                        var9--;
                        var44.field1438 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1105) {
                        var9--;
                        var44.field1321 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1106) {
                        var9--;
                        var44.field1396 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1107) {
                        var9--;
                        var44.field1347 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1108) {
                        var44.field1430 = 1;
                        var9--;
                        var44.field1355 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1109) {
                        var9 -= 6;
                        var44.field1437 = class141.field3391[var9];
                        var44.field1421 = class141.field3391[var9 + 1];
                        var44.field1381 = class141.field3391[var9 + 2];
                        var44.field1319 = class141.field3391[var9 + 3];
                        var44.field1386 = class141.field3391[var9 + 4];
                        var44.field1411 = class141.field3391[var9 + 5];
                        continue;
                    }
                    if (var183 == 1110) {
                        var9--;
                        var44.field1408 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1111) {
                        var9--;
                        var44.field1368 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1112) {
                        var13--;
                        var44.field1377 = class20.field420[var13];
                        continue;
                    }
                    if (var183 == 1113) {
                        var9--;
                        var44.field1442 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1114) {
                        var9 -= 3;
                        var44.field1409 = class141.field3391[var9];
                        var44.field1322 = class141.field3391[var9 + 1];
                        var44.field1331 = class141.field3391[var9 + 2];
                        continue;
                    }
                    if (var183 == 1115) {
                        var9--;
                        var44.field1338 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1116) {
                        var9--;
                        var44.field1387 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1117) {
                        var9--;
                        var44.field1390 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1118) {
                        var9--;
                        var44.field1370 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1119) {
                        var9--;
                        var44.field1323 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1120) {
                        var9 -= 2;
                        var44.field1329 = class141.field3391[var9];
                        var44.field1314 = class141.field3391[var9 + 1];
                        continue;
                    }
                } else if (var183 >= 1200 && var183 < 1300 || var183 >= 2200 && var183 < 2300) {
                    class57 var45;
                    if (var183 >= 2000) {
                        var9--;
                        var45 = class97.method805(-894550512, class141.field3391[var9]);
                        var183 -= 1000;
                    } else {
                        var45 = var43 ? class133.field3167 : class54.field1242;
                    }
                    class139.method1133(var45, -110);
                    if (var183 == 1200) {
                        var9 -= 2;
                        int var46 = class141.field3391[var9];
                        int var47 = class141.field3391[var9 + 1];
                        var45.field1420 = var47;
                        var45.field1427 = var46;
                        class13 var48 = class98.method813(-1, var46);
                        var45.field1381 = var48.field227;
                        var45.field1421 = var48.field230;
                        var45.field1319 = var48.field258;
                        var45.field1437 = var48.field259;
                        var45.field1411 = var48.field218;
                        if (var45.field1365 > 0) {
                            var45.field1411 = var45.field1411 * 32 / var45.field1365;
                        }
                        var45.field1386 = var48.field236;
                        continue;
                    }
                    if (var183 == 1201) {
                        var45.field1430 = 2;
                        var9--;
                        var45.field1355 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1202) {
                        var45.field1430 = 3;
                        var45.field1355 = class40.field925.field1528.method423((byte) -115);
                        continue;
                    }
                } else if (var183 >= 1300 && var183 < 1400 || var183 >= 2300 && var183 < 2400) {
                    class57 var163;
                    if (var183 >= 2000) {
                        var183 -= 1000;
                        var9--;
                        var163 = class97.method805(-894550512, class141.field3391[var9]);
                    } else {
                        var163 = var43 ? class133.field3167 : class54.field1242;
                    }
                    if (var183 == 1300) {
                        var9--;
                        int var164 = class141.field3391[var9] - 1;
                        if (var164 >= 0 && var164 <= 9) {
                            var13--;
                            var163.method510(var164, arg4, class20.field420[var13]);
                            continue;
                        }
                        var13--;
                        continue;
                    }
                    if (var183 == 1301) {
                        var9 -= 2;
                        int var165 = class141.field3391[var9];
                        int var166 = class141.field3391[var9 + 1];
                        var163.field1333 = class50.method361(var165, var166, 96);
                        continue;
                    }
                    if (var183 == 1302) {
                        var9--;
                        var163.field1423 = class141.field3391[var9] == 1;
                        continue;
                    }
                    if (var183 == 1303) {
                        var9--;
                        var163.field1434 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1304) {
                        var9--;
                        var163.field1432 = class141.field3391[var9];
                        continue;
                    }
                    if (var183 == 1305) {
                        var13--;
                        var163.field1399 = class20.field420[var13];
                        continue;
                    }
                    if (var183 == 1306) {
                        var13--;
                        var163.field1405 = class20.field420[var13];
                        continue;
                    }
                } else {
                    if (var183 >= 1400 && var183 < 1500 || var183 >= 2400 && var183 < 2500) {
                        class57 var159;
                        if (var183 < 2000) {
                            var159 = var43 ? class133.field3167 : class54.field1242;
                        } else {
                            var183 -= 1000;
                            var9--;
                            var159 = class97.method805(-894550512, class141.field3391[var9]);
                        }
                        var13--;
                        class84 var160 = class20.field420[var13];
                        Object[] var161 = new Object[var160.method718(30) + 1];
                        for (int var162 = var161.length - 1; var162 >= 1; var162--) {
                            if (var160.method725(var162 - 1, -120) == 115) {
                                var13--;
                                var161[var162] = class20.field420[var13];
                            } else {
                                var9--;
                                var161[var162] = Integer.valueOf(class141.field3391[var9]);
                            }
                        }
                        var9--;
                        var161[0] = Integer.valueOf(class141.field3391[var9]);
                        if (var183 == 1407) {
                            var159.field1351 = var161;
                        }
                        if (var183 == 1404) {
                            var159.field1326 = var161;
                        }
                        if (var183 == 1400) {
                            var159.field1376 = var161;
                        }
                        if (var183 == 1410) {
                            var159.field1389 = var161;
                        }
                        if (var183 == 1408) {
                            var159.field1367 = var161;
                        }
                        if (var183 == 1406) {
                            var159.field1345 = var161;
                        }
                        if (var183 == 1414) {
                            var159.field1346 = var161;
                        }
                        if (var183 == 1417) {
                            var159.field1379 = var161;
                        }
                        if (var183 == 1411) {
                            var159.field1428 = var161;
                        }
                        if (var183 == 1413) {
                            var159.field1315 = var161;
                        }
                        if (var183 == 1402) {
                            var159.field1324 = var161;
                        }
                        if (var183 == 1416) {
                            var159.field1412 = var161;
                        }
                        if (var183 == 1412) {
                            var159.field1372 = var161;
                        }
                        var159.field1439 = true;
                        if (var183 == 1415) {
                            var159.field1341 = var161;
                        }
                        if (var183 == 1409) {
                            var159.field1397 = var161;
                        }
                        if (var183 == 1403) {
                            var159.field1388 = var161;
                        }
                        if (var183 == 1405) {
                            var159.field1354 = var161;
                        }
                        if (var183 == 1401) {
                            var159.field1373 = var161;
                        }
                        continue;
                    }
                    if (var183 < 1600) {
                        class57 var158 = var43 ? class133.field3167 : class54.field1242;
                        if (var183 == 1500) {
                            class141.field3391[var9++] = var158.field1348;
                            continue;
                        }
                        if (var183 == 1501) {
                            class141.field3391[var9++] = var158.field1433;
                            continue;
                        }
                        if (var183 == 1502) {
                            class141.field3391[var9++] = var158.field1365;
                            continue;
                        }
                        if (var183 == 1503) {
                            class141.field3391[var9++] = var158.field1332;
                            continue;
                        }
                        if (var183 == 1504) {
                            class141.field3391[var9++] = var158.field1415 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 1505) {
                            class141.field3391[var9++] = var158.field1443;
                            continue;
                        }
                    } else if (var183 < 1700) {
                        class57 var157 = var43 ? class133.field3167 : class54.field1242;
                        if (var183 == 1600) {
                            class141.field3391[var9++] = var157.field1380;
                            continue;
                        }
                        if (var183 == 1601) {
                            class141.field3391[var9++] = var157.field1334;
                            continue;
                        }
                        if (var183 == 1602) {
                            class20.field420[var13++] = var157.field1377;
                            continue;
                        }
                        if (var183 == 1603) {
                            class141.field3391[var9++] = var157.field1329;
                            continue;
                        }
                        if (var183 == 1604) {
                            class141.field3391[var9++] = var157.field1314;
                            continue;
                        }
                        if (var183 == 1605) {
                            class141.field3391[var9++] = var157.field1411;
                            continue;
                        }
                    } else if (var183 < 1800) {
                        class57 var156 = var43 ? class133.field3167 : class54.field1242;
                        if (var183 == 1700) {
                            class141.field3391[var9++] = var156.field1427;
                            continue;
                        }
                        if (var183 == 1701) {
                            if (var156.field1427 == -1) {
                                class141.field3391[var9++] = 0;
                            } else {
                                class141.field3391[var9++] = var156.field1420;
                            }
                            continue;
                        }
                        if (var183 == 1702) {
                            class141.field3391[var9++] = var156.field1425;
                            continue;
                        }
                    } else if (var183 < 1900) {
                        class57 var155 = var43 ? class133.field3167 : class54.field1242;
                        if (var183 == 1800) {
                            class141.field3391[var9++] = class19.method128((byte) -99, class91.method780(-150310624, var155));
                            continue;
                        }
                    } else if (var183 < 2600) {
                        var9--;
                        class57 var154 = class97.method805(-894550512, class141.field3391[var9]);
                        if (var183 == 2500) {
                            class141.field3391[var9++] = var154.field1348;
                            continue;
                        }
                        if (var183 == 2501) {
                            class141.field3391[var9++] = var154.field1433;
                            continue;
                        }
                        if (var183 == 2502) {
                            class141.field3391[var9++] = var154.field1365;
                            continue;
                        }
                        if (var183 == 2503) {
                            class141.field3391[var9++] = var154.field1332;
                            continue;
                        }
                        if (var183 == 2504) {
                            class141.field3391[var9++] = var154.field1415 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 2505) {
                            class141.field3391[var9++] = var154.field1443;
                            continue;
                        }
                    } else if (var183 < 2700) {
                        var9--;
                        class57 var153 = class97.method805(-894550512, class141.field3391[var9]);
                        if (var183 == 2600) {
                            class141.field3391[var9++] = var153.field1380;
                            continue;
                        }
                        if (var183 == 2601) {
                            class141.field3391[var9++] = var153.field1334;
                            continue;
                        }
                        if (var183 == 2602) {
                            class20.field420[var13++] = var153.field1377;
                            continue;
                        }
                        if (var183 == 2603) {
                            class141.field3391[var9++] = var153.field1329;
                            continue;
                        }
                        if (var183 == 2604) {
                            class141.field3391[var9++] = var153.field1314;
                            continue;
                        }
                        if (var183 == 2605) {
                            class141.field3391[var9++] = var153.field1411;
                            continue;
                        }
                    } else if (var183 < 2800) {
                        var9--;
                        class57 var49 = class97.method805(-894550512, class141.field3391[var9]);
                        if (var183 == 2700) {
                            class141.field3391[var9++] = var49.field1427;
                            continue;
                        }
                        if (var183 == 2701) {
                            if (var49.field1427 == -1) {
                                class141.field3391[var9++] = 0;
                            } else {
                                class141.field3391[var9++] = var49.field1420;
                            }
                            continue;
                        }
                    } else if (var183 < 2900) {
                        var9--;
                        class57 var152 = class97.method805(-894550512, class141.field3391[var9]);
                        if (var183 == 2800) {
                            class141.field3391[var9++] = class19.method128((byte) -37, class91.method780(-150310624, var152));
                            continue;
                        }
                    } else if (var183 < 3200) {
                        if (var183 == 3100) {
                            var13--;
                            class84 var50 = class20.field420[var13];
                            class11.method64(var50, class69.field1670, -73, 0);
                            continue;
                        }
                        if (var183 == 3101) {
                            var9 -= 2;
                            class88.method754(class141.field3391[var9 + 1], (byte) -117, class40.field925, class141.field3391[var9]);
                            continue;
                        }
                        if (var183 == 3102) {
                            var9--;
                            int var51 = class141.field3391[var9];
                            if (var51 >= 0 && class72.field1777.length > var51 && class72.field1777[var51] != -1) {
                                class68.field1654 = var51;
                                class89.field2220 = true;
                                class95.field2365 = true;
                            }
                            continue;
                        }
                        if (var183 == 3103) {
                            class133.method1069(-1);
                            continue;
                        }
                    } else if (var183 < 3300) {
                        if (var183 == 3200) {
                            var9 -= 3;
                            class89.method764(class141.field3391[var9 + 2], class141.field3391[var9], class141.field3391[var9 + 1], -7642);
                            continue;
                        }
                        if (var183 == 3201) {
                            var9--;
                            class49.method355(29726, class141.field3391[var9]);
                            continue;
                        }
                        if (var183 == 3202) {
                            var9 -= 2;
                            class33.method239(class141.field3391[var9], false, class141.field3391[var9 + 1]);
                            continue;
                        }
                    } else if (var183 < 3400) {
                        if (var183 == 3300) {
                            class141.field3391[var9++] = class5.field100;
                            continue;
                        }
                        if (var183 == 3301) {
                            var9 -= 2;
                            int var130 = class141.field3391[var9 + 1];
                            int var131 = class141.field3391[var9];
                            class141.field3391[var9++] = class47.method335(var131, (byte) 104, var130);
                            continue;
                        }
                        if (var183 == 3302) {
                            var9 -= 2;
                            int var132 = class141.field3391[var9 + 1];
                            int var133 = class141.field3391[var9];
                            class141.field3391[var9++] = class65.method593(var132, var133, -1);
                            continue;
                        }
                        if (var183 == 3303) {
                            var9 -= 2;
                            int var134 = class141.field3391[var9];
                            int var135 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = class136.method1096(var134, -35, var135);
                            continue;
                        }
                        if (var183 == 3304) {
                            var9--;
                            int var136 = class141.field3391[var9];
                            class141.field3391[var9++] = class111.method905(var136, -1).field3113;
                            continue;
                        }
                        if (var183 == 3305) {
                            var9--;
                            int var137 = class141.field3391[var9];
                            class141.field3391[var9++] = class30.field709[var137];
                            continue;
                        }
                        if (var183 == 3306) {
                            var9--;
                            int var138 = class141.field3391[var9];
                            class141.field3391[var9++] = class72.field1769[var138];
                            continue;
                        }
                        if (var183 == 3307) {
                            var9--;
                            int var139 = class141.field3391[var9];
                            class141.field3391[var9++] = class66.field1625[var139];
                            continue;
                        }
                        if (var183 == 3308) {
                            int var140 = class13.field251;
                            int var141 = (class40.field925.field3549 >> 7) + class95.field2359;
                            int var142 = (class40.field925.field3535 >> 7) + class10.field159;
                            class141.field3391[var9++] = (var140 << 28) + (var141 << 14) + var142;
                            continue;
                        }
                        if (var183 == 3309) {
                            var9--;
                            int var143 = class141.field3391[var9];
                            class141.field3391[var9++] = client.method144(16383, var143 >> 14);
                            continue;
                        }
                        if (var183 == 3310) {
                            var9--;
                            int var144 = class141.field3391[var9];
                            class141.field3391[var9++] = var144 >> 28;
                            continue;
                        }
                        if (var183 == 3311) {
                            var9--;
                            int var145 = class141.field3391[var9];
                            class141.field3391[var9++] = client.method144(16383, var145);
                            continue;
                        }
                        if (var183 == 3312) {
                            class141.field3391[var9++] = class84.field2108 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 3313) {
                            var9 -= 2;
                            int var146 = class141.field3391[var9] + 32768;
                            int var147 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = class47.method335(var146, (byte) 104, var147);
                            continue;
                        }
                        if (var183 == 3314) {
                            var9 -= 2;
                            int var148 = class141.field3391[var9] + 32768;
                            int var149 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = class65.method593(var149, var148, -1);
                            continue;
                        }
                        if (var183 == 3315) {
                            var9 -= 2;
                            int var150 = class141.field3391[var9] + 32768;
                            int var151 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = class136.method1096(var150, -46, var151);
                            continue;
                        }
                    } else if (var183 < 3700) {
                        if (var183 == 3600) {
                            if (class77.field1933 == 0) {
                                class141.field3391[var9++] = -2;
                            } else if (class77.field1933 == 1) {
                                class141.field3391[var9++] = -1;
                            } else {
                                class141.field3391[var9++] = class125.field3024;
                            }
                            continue;
                        }
                        if (var183 == 3601) {
                            var9--;
                            int var52 = class141.field3391[var9];
                            if (class77.field1933 == 2 && var52 < class125.field3024) {
                                class20.field420[var13++] = class27.field646[var52];
                                continue;
                            }
                            class20.field420[var13++] = class69.field1670;
                            continue;
                        }
                        if (var183 == 3602) {
                            var9--;
                            int var53 = class141.field3391[var9];
                            if (class77.field1933 == 2 && var53 < class125.field3024) {
                                class141.field3391[var9++] = class71.field1741[var53];
                                continue;
                            }
                            class141.field3391[var9++] = 0;
                            continue;
                        }
                        if (var183 == 3603) {
                            var9--;
                            int var54 = class141.field3391[var9];
                            if (class77.field1933 == 2 && var54 < class125.field3024) {
                                class141.field3391[var9++] = class14.field270[var54];
                                continue;
                            }
                            class141.field3391[var9++] = 0;
                            continue;
                        }
                        if (var183 == 3604) {
                            var9--;
                            int var55 = class141.field3391[var9];
                            var13--;
                            class84 var56 = class20.field420[var13];
                            class66.method596(var55, var56, -1204);
                            continue;
                        }
                    } else if (var183 < 4100) {
                        if (var183 == 4000) {
                            var9 -= 2;
                            int var97 = class141.field3391[var9];
                            int var98 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = var97 + var98;
                            continue;
                        }
                        if (var183 == 4001) {
                            var9 -= 2;
                            int var99 = class141.field3391[var9];
                            int var100 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = var99 - var100;
                            continue;
                        }
                        if (var183 == 4002) {
                            var9 -= 2;
                            int var101 = class141.field3391[var9 + 1];
                            int var102 = class141.field3391[var9];
                            class141.field3391[var9++] = var101 * var102;
                            continue;
                        }
                        if (var183 == 4003) {
                            var9 -= 2;
                            int var103 = class141.field3391[var9 + 1];
                            int var104 = class141.field3391[var9];
                            class141.field3391[var9++] = var104 / var103;
                            continue;
                        }
                        if (var183 == 4004) {
                            var9--;
                            int var105 = class141.field3391[var9];
                            class141.field3391[var9++] = (int) ((double) var105 * Math.random());
                            continue;
                        }
                        if (var183 == 4005) {
                            var9--;
                            int var106 = class141.field3391[var9];
                            class141.field3391[var9++] = (int) ((double) (var106 + 1) * Math.random());
                            continue;
                        }
                        if (var183 == 4006) {
                            var9 -= 5;
                            int var107 = class141.field3391[var9];
                            int var108 = class141.field3391[var9 + 1];
                            int var109 = class141.field3391[var9 + 2];
                            int var110 = class141.field3391[var9 + 4];
                            int var111 = class141.field3391[var9 + 3];
                            class141.field3391[var9++] = (var108 - var107) * (var110 - var109) / (var111 - var109) + var107;
                            continue;
                        }
                        if (var183 == 4007) {
                            var9 -= 2;
                            int var112 = class141.field3391[var9];
                            int var113 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = var112 * var113 / 100 + var112;
                            continue;
                        }
                        if (var183 == 4008) {
                            var9 -= 2;
                            int var114 = class141.field3391[var9 + 1];
                            int var115 = class141.field3391[var9];
                            class141.field3391[var9++] = class24.method166(0x1 << var114, var115);
                            continue;
                        }
                        if (var183 == 4009) {
                            var9 -= 2;
                            int var116 = class141.field3391[var9];
                            int var117 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = client.method144(-(0x1 << var117) - 1, var116);
                            continue;
                        }
                        if (var183 == 4010) {
                            var9 -= 2;
                            int var118 = class141.field3391[var9];
                            int var119 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = client.method144(0x1 << var119, var118) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var183 == 4011) {
                            var9 -= 2;
                            int var120 = class141.field3391[var9];
                            int var121 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = var120 % var121;
                            continue;
                        }
                        if (var183 == 4012) {
                            var9 -= 2;
                            int var122 = class141.field3391[var9];
                            int var123 = class141.field3391[var9 + 1];
                            if (var122 == 0) {
                                class141.field3391[var9++] = 0;
                            } else {
                                class141.field3391[var9++] = (int) Math.pow((double) var122, (double) var123);
                            }
                            continue;
                        }
                        if (var183 == 4013) {
                            var9 -= 2;
                            int var124 = class141.field3391[var9];
                            int var125 = class141.field3391[var9 + 1];
                            if (var124 == 0) {
                                class141.field3391[var9++] = 0;
                            } else if (var125 == 0) {
                                class141.field3391[var9++] = Integer.MAX_VALUE;
                            } else {
                                class141.field3391[var9++] = (int) Math.pow((double) var124, 1.0D / (double) var125);
                            }
                            continue;
                        }
                        if (var183 == 4014) {
                            var9 -= 2;
                            int var126 = class141.field3391[var9];
                            int var127 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = client.method144(var127, var126);
                            continue;
                        }
                        if (var183 == 4015) {
                            var9 -= 2;
                            int var128 = class141.field3391[var9];
                            int var129 = class141.field3391[var9 + 1];
                            class141.field3391[var9++] = class24.method166(var128, var129);
                            continue;
                        }
                    } else if (var183 < 4200) {
                        if (var183 == 4100) {
                            var9--;
                            int var57 = class141.field3391[var9];
                            var13--;
                            class84 var58 = class20.field420[var13];
                            class20.field420[var13++] = class51.method408(new class84[] { var58, class93.method787(22245, var57) }, 123);
                            continue;
                        }
                        if (var183 == 4101) {
                            var13 -= 2;
                            class84 var59 = class20.field420[var13];
                            class84 var60 = class20.field420[var13 + 1];
                            class20.field420[var13++] = class51.method408(new class84[] { var59, var60 }, -29);
                            continue;
                        }
                        if (var183 == 4102) {
                            var9--;
                            int var61 = class141.field3391[var9];
                            var13--;
                            class84 var62 = class20.field420[var13];
                            class20.field420[var13++] = class51.method408(new class84[] { var62, class74.method640(true, 54, var61) }, -36);
                            continue;
                        }
                        if (var183 == 4103) {
                            var13--;
                            class84 var63 = class20.field420[var13];
                            class20.field420[var13++] = var63.method728((byte) 86);
                            continue;
                        }
                        if (var183 == 4104) {
                            var9--;
                            int var64 = class141.field3391[var9];
                            long var65 = ((long) var64 + 11745L) * 86400000L;
                            class52.field1153.setTime(new Date(var65));
                            int var67 = class52.field1153.get(5);
                            int var68 = class52.field1153.get(2);
                            int var69 = class52.field1153.get(1);
                            class20.field420[var13++] = class51.method408(new class84[] { class93.method787(22245, var67), class76.field1915, class22.field534[var68], class76.field1915, class93.method787(22245, var69) }, -28);
                            continue;
                        }
                        if (var183 == 4105) {
                            var13 -= 2;
                            class84 var70 = class20.field420[var13];
                            class84 var71 = class20.field420[var13 + 1];
                            if (class40.field925.field1528 != null && class40.field925.field1528.field1170) {
                                class20.field420[var13++] = var71;
                                continue;
                            }
                            class20.field420[var13++] = var70;
                            continue;
                        }
                        if (var183 == 4106) {
                            var9--;
                            int var72 = class141.field3391[var9];
                            class20.field420[var13++] = class93.method787(22245, var72);
                            continue;
                        }
                        if (var183 == 4107) {
                            var13 -= 2;
                            class141.field3391[var9++] = class20.field420[var13].method713((byte) -100, class20.field420[var13 + 1]);
                            continue;
                        }
                        if (var183 == 4108) {
                            var9 -= 2;
                            var13--;
                            class84 var73 = class20.field420[var13];
                            int var74 = class141.field3391[var9];
                            int var75 = class141.field3391[var9 + 1];
                            byte[] var76 = class110.field2654.method986(0, var75, (byte) 67);
                            class28 var77 = new class28(var76);
                            class141.field3391[var9++] = var77.method210(var73, var74);
                            continue;
                        }
                        if (var183 == 4109) {
                            var13--;
                            class84 var78 = class20.field420[var13];
                            var9 -= 2;
                            int var79 = class141.field3391[var9 + 1];
                            int var80 = class141.field3391[var9];
                            byte[] var81 = class110.field2654.method986(0, var79, (byte) 67);
                            class28 var82 = new class28(var81);
                            class141.field3391[var9++] = var82.method209(var78, var80);
                            continue;
                        }
                    } else if (var183 < 4300) {
                        if (var183 == 4200) {
                            var9--;
                            int var83 = class141.field3391[var9];
                            class20.field420[var13++] = class98.method813(-1, var83).field215;
                            continue;
                        }
                        if (var183 == 4201) {
                            var9 -= 2;
                            int var84 = class141.field3391[var9];
                            int var85 = class141.field3391[var9 + 1];
                            class13 var86 = class98.method813(-1, var84);
                            if (var85 >= 1 && var85 <= 5 && var86.field263[var85 - 1] != null) {
                                class20.field420[var13++] = var86.field263[var85 - 1];
                                continue;
                            }
                            class20.field420[var13++] = class69.field1670;
                            continue;
                        }
                        if (var183 == 4202) {
                            var9 -= 2;
                            int var87 = class141.field3391[var9];
                            int var88 = class141.field3391[var9 + 1];
                            class13 var89 = class98.method813(-1, var87);
                            if (var88 >= 1 && var88 <= 5 && var89.field231[var88 - 1] != null) {
                                class20.field420[var13++] = var89.field231[var88 - 1];
                                continue;
                            }
                            class20.field420[var13++] = class69.field1670;
                            continue;
                        }
                        if (var183 == 4203) {
                            var9--;
                            int var90 = class141.field3391[var9];
                            class141.field3391[var9++] = class98.method813(-1, var90).field222;
                            continue;
                        }
                        if (var183 == 4204) {
                            var9--;
                            int var91 = class141.field3391[var9];
                            class141.field3391[var9++] = class98.method813(-1, var91).field257 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 4205) {
                            var9--;
                            int var92 = class141.field3391[var9];
                            class13 var93 = class98.method813(-1, var92);
                            if (var93.field266 == -1 && var93.field211 >= 0) {
                                class141.field3391[var9++] = var93.field211;
                                continue;
                            }
                            class141.field3391[var9++] = var92;
                            continue;
                        }
                        if (var183 == 4206) {
                            var9--;
                            int var94 = class141.field3391[var9];
                            class13 var95 = class98.method813(-1, var94);
                            if (var95.field266 >= 0 && var95.field211 >= 0) {
                                class141.field3391[var9++] = var95.field211;
                                continue;
                            }
                            class141.field3391[var9++] = var94;
                            continue;
                        }
                        if (var183 == 4207) {
                            var9--;
                            int var96 = class141.field3391[var9];
                            class141.field3391[var9++] = class98.method813(-1, var96).field250 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class68.method604(20233, "CS2 - nosuchop:" + var183, null);
                return;
            }
        } catch (Exception var182) {
            class68.method604(20233, "CS2 - scr:" + var8.field370 + " op:" + var14, var182);
        }
    }
}
