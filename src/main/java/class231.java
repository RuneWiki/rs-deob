import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class231 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3486 = 0;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3477 = "Discard";

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3494 = "Loading config - ";

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field3479 = new int[25];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "J")
    public long field3485;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lsk;")
    public class114 field3481;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lsk;")
    public class114 field3487;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lsk;")
    public class114 field3489;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lpf;")
    public static class294 field3482;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lai;I)V")
    public static final void method1470(class88 arg0, int arg1) {
        arg0.field1399 = false;
        field3484++;
        if (arg0.field1398 != null) {
            arg0.field1398.field344 = 0;
        }
        for (class88 var2 = arg0.method257(); var2 != null; var2 = arg0.method270()) {
            method1470(var2, -256);
        }
        if (arg1 != -256) {
            method1476((byte) -116, 124);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3479 = null;
        field3494 = null;
        field3477 = null;
        field3482 = null;
        if (arg0 != 8) {
            field3480 = 71;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method1472(int arg0) {
        field3488++;
        class270.method1801(false, -80);
        boolean var1 = true;
        class83.field1331 = 0;
        for (int var2 = 0; var2 < class160.field2471.length; var2++) {
            if (class145.field2122[var2] != -1 && class160.field2471[var2] == null) {
                class160.field2471[var2] = class165.field2540.method1973(1, class145.field2122[var2], 0);
                if (class160.field2471[var2] == null) {
                    var1 = false;
                    class83.field1331++;
                }
            }
            if (class232.field3499[var2] != -1 && class54.field884[var2] == null) {
                class54.field884[var2] = class165.field2540.method1958(class106.field1618[var2], 0, 117, class232.field3499[var2]);
                if (class54.field884[var2] == null) {
                    class83.field1331++;
                    var1 = false;
                }
            }
            if (class258.field3936 != null && class186.field2826[var2] == null && class258.field3936[var2] != -1) {
                class186.field2826[var2] = class165.field2540.method1958(class106.field1618[var2], 0, 114, class258.field3936[var2]);
                if (class186.field2826[var2] == null) {
                    class83.field1331++;
                    var1 = false;
                }
            }
        }
        if (class39.field525 == null) {
            if (class64.field1011 == null || !class196.field2983.method1968(class64.field1011.field2676 + "_labels", -1)) {
                class39.field525 = new class180(0);
            } else if (class196.field2983.method1944(class64.field1011.field2676 + "_labels", -71)) {
                class39.field525 = class252.method1656(class64.field1011.field2676 + "_labels", 24730, class196.field2983);
            } else {
                var1 = false;
                class83.field1331++;
            }
        }
        if (!var1) {
            class33.field480 = 1;
            return;
        }
        boolean var3 = true;
        class90.field1416 = 0;
        for (int var4 = 0; var4 < class160.field2471.length; var4++) {
            byte[] var20 = class54.field884[var4];
            if (var20 != null) {
                int var21 = (class48.field767[var4] >> 8) * 64 - class81.field1303;
                int var22 = (class48.field767[var4] & 0xFF) * 64 - class147.field2141;
                if (class120.field1808) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class96.method623(var22, var21, (byte) -104, var20);
            }
        }
        if (!var3) {
            class33.field480 = 2;
            return;
        }
        if (class33.field480 != 0) {
            class101.method652(class126.field1904 + "<br>(100%)", -17265, true);
        }
        boolean var5 = false;
        class39.method231(false);
        class42.method280(85);
        class149.method903(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class202.field3052[var6].method201(true);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class221.field3333[var7][var18][var19] = 0;
                }
            }
        }
        class144.method881(-2, false);
        class39.method231(false);
        System.gc();
        class270.method1801(true, -113);
        class43.method286(false, (byte) -44);
        if (!class120.field1808) {
            class148.method898(false, 65536);
            class270.method1801(true, -103);
            class289.method1911(false, (byte) 101);
            if (class186.field2826 != null) {
                class239.method1515(126);
            }
        }
        if (class120.field1808) {
            class173.method1064(false, -94);
            class270.method1801(true, -124);
            class159.method990((byte) 115, false);
        }
        class42.method280(107);
        class270.method1801(true, -114);
        class155.method943(false, class120.field1808 ? class229.field3461 : null, class202.field3052, (byte) 70);
        class270.method1801(true, -59);
        int var8 = class276.field4160;
        if (class99.field1557 < var8) {
            var8 = class99.field1557;
        }
        if (var8 < class99.field1557 - 1) {
            int var9 = class99.field1557 - 1;
        }
        if (class266.method1772(-107)) {
            class13.method74(0);
        } else {
            class13.method74(class276.field4160);
        }
        class31.method205(-127);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class204.method1296(var17, var10, true);
            }
        }
        class155.method940(true);
        class39.method231(false);
        class226.method1445(-25784);
        class42.method280(81);
        if (class210.field3152 != null && class44.field706 != null && class184.field2794 == 25) {
            class244.field3646++;
            class196.field2979.method1106(247, false);
            class196.field2979.method1577((byte) 32, 1057001181);
        }
        if (!class120.field1808) {
            int var11 = (class132.field1940 + 6) / 8;
            int var12 = (class132.field1940 - 6) / 8;
            int var13 = (class177.field2721 - 6) / 8;
            int var14 = (class177.field2721 + 6) / 8;
            for (int var15 = var12 - 1; var15 <= var11 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var12 > var15 || var11 < var15 || var13 > var16 || var16 > var14) {
                        class165.field2540.method1955("m" + var15 + "_" + var16, 26544);
                        class165.field2540.method1955("l" + var15 + "_" + var16, 26544);
                    }
                }
            }
        }
        if (class184.field2794 == 28) {
            class203.method1292(10, false);
        } else {
            class203.method1292(30, false);
            if (class44.field706 != null) {
                class196.field2979.method1106(211, false);
            }
        }
        class230.method1469(false);
        if (arg0 > -99) {
            method1475((byte) 72);
        }
        class39.method231(false);
        class108.method678(1556908007);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Laf;")
    public static final class70 method1473(byte arg0, int arg1) {
        field3493++;
        class70 var2 = (class70) class234.field3519.method122((long) arg1, (byte) -91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class290.field4573.method1973(arg0 ^ 0xFFFFFFDE, 1, arg1 & 0x7FFF);
        } else {
            var3 = class204.field3071.method1973(1, 1, arg1);
        }
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method467((byte) -73, new class248(var3));
        }
        if (arg0 != -33) {
            return null;
        }
        if (arg1 >= 32768) {
            var4.method476(true);
        }
        class234.field3519.method119((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(CZ)B")
    public static final byte method1474(char arg0, boolean arg1) {
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg1) {
            return 77;
        } else {
            field3498++;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method1475(byte arg0) {
        field3492++;
        if (arg0 != 108) {
            method1474((char) 65503, true);
        }
        int var1 = class213.field3190;
        int var2 = class236.field3558;
        int var3 = class32.field470;
        int var4 = class283.field4239;
        int var5 = 6116423;
        class111.method702(var1, var2, var4, var3, var5);
        class111.method702(var1 + 1, var2 - -1, var4 - 2, 16, 0);
        class111.method701(var1 + 1, var2 + 18, var4 - 2, var3 - 19, 0);
        class192.field2953.method1024(class96.field1514, var1 + 3, var2 + 14, var5, -1);
        int var6 = class203.field3065;
        int var7 = class91.field1438;
        for (int var8 = 0; var8 < class218.field3278; var8++) {
            int var9 = (class218.field3278 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < (var1 + var4) && var6 > (var9 - 13) && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class192.field2953.method1024(class233.method1486(0, var8), var1 + 3, var9, var10, 0);
        }
        class191.method1195(class283.field4239, class213.field3190, class32.field470, (byte) 120, class236.field3558);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BI)Leg;")
    public static final class232 method1476(byte arg0, int arg1) {
        field3495++;
        if (arg0 != -104) {
            field3494 = null;
        }
        class232 var2 = (class232) class204.field3067.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class258.field3939.method1973(1, 16, arg1);
        class232 var4 = new class232();
        if (var3 != null) {
            var4.method1481(new class248(var3), arg0 + 104);
        }
        class204.field3067.method1784((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(BI)V")
    public static final void method1477(byte arg0, int arg1) {
        field3497++;
        if (arg0 != 48) {
            method1477((byte) -42, 11);
        }
        class57.field902.method1780(arg1, true);
        class264.field3989.method1780(arg1, true);
        class149.field2159.method1780(arg1, true);
    }
}
