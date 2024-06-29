import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class57 extends class99 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public int field1418 = 5;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public int field1419 = 2;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
    public int field1428 = -1;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public int field1421 = -1;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public int field1427 = -1;

    @OriginalMember(owner = "client!j", name = "tb", descriptor = "I")
    public int field1435 = -1;

    @OriginalMember(owner = "client!j", name = "Db", descriptor = "Z")
    public boolean field1445 = false;

    @OriginalMember(owner = "client!j", name = "Jb", descriptor = "I")
    public int field1451 = -1;

    @OriginalMember(owner = "client!j", name = "Mb", descriptor = "I")
    public int field1454 = 99;

    @OriginalMember(owner = "client!j", name = "vb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1437 = Calendar.getInstance();

    @OriginalMember(owner = "client!j", name = "Ab", descriptor = "Lpd;")
    private static class94 field1442 = class28.method249(69, "Too many connections from your address)3");

    @OriginalMember(owner = "client!j", name = "wb", descriptor = "Lpd;")
    private static class94 field1438 = class28.method249(-96, "Classic");

    @OriginalMember(owner = "client!j", name = "Cb", descriptor = "Lpd;")
    public static class94 field1444 = class28.method249(-113, "@or1@");

    @OriginalMember(owner = "client!j", name = "xb", descriptor = "Lpd;")
    private static class94 field1439 = class28.method249(-113, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!j", name = "Gb", descriptor = "Lpd;")
    public static class94 field1448 = field1438;

    @OriginalMember(owner = "client!j", name = "Hb", descriptor = "Lpd;")
    public static class94 field1449 = field1439;

    @OriginalMember(owner = "client!j", name = "zb", descriptor = "Lpd;")
    public static class94 field1441 = field1442;

    @OriginalMember(owner = "client!j", name = "Ib", descriptor = "J")
    public static long field1450 = 0L;

    @OriginalMember(owner = "client!j", name = "Bb", descriptor = "I")
    public static volatile int field1443 = 0;

    @OriginalMember(owner = "client!j", name = "Eb", descriptor = "Lpd;")
    public static class94 field1446 = class28.method249(-62, "Privater Chat");

    @OriginalMember(owner = "client!j", name = "Pb", descriptor = "I")
    public static int field1457 = 1;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!j", name = "sb", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!j", name = "yb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!j", name = "Fb", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!j", name = "Kb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!j", name = "Lb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!j", name = "Nb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!j", name = "Ob", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!j", name = "Qb", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "[I")
    public int[] field1420;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "[I")
    private int[] field1432;

    @OriginalMember(owner = "client!j", name = "ub", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 3)
    public static final void method446(int arg0) {
        if (arg0 == 0) {
            class24.field630 = false;
            class115.field2912 = false;
            field1434++;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILia;II)Lia;", line = 25)
    public final class48 method447(int arg0, class48 arg1, int arg2, int arg3) {
        int var5 = this.field1425[arg2];
        field1433++;
        class39 var6 = class85.method623(var5 >> 16, -72);
        if (arg3 != 0) {
            return null;
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method370(true);
        }
        int var8 = arg0 & 0x3;
        class48 var9 = arg1.method370(!var6.method298(var7, false));
        if (var8 == 1) {
            var9.method356();
        } else if (var8 == 2) {
            var9.method367();
        } else if (var8 == 3) {
            var9.method368();
        }
        var9.method380(var6, var7);
        if (var8 == 1) {
            var9.method368();
        } else if (var8 == 2) {
            var9.method367();
        } else if (var8 == 3) {
            var9.method356();
        }
        return var9;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 71)
    public final void method448(int arg0) {
        if (this.field1421 == -1) {
            if (this.field1436 == null) {
                this.field1421 = 0;
            } else {
                this.field1421 = 2;
            }
        }
        field1430++;
        int var2 = -71 / ((arg0 - 24) / 38);
        if (this.field1428 != -1) {
            return;
        }
        if (this.field1436 == null) {
            this.field1428 = 0;
        } else {
            this.field1428 = 2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLuc;)V", line = 101)
    public final void method449(boolean arg0, class122 arg1) {
        field1422++;
        if (arg0) {
            this.method449(true, null);
        }
        while (true) {
            int var3 = arg1.method943(-1025);
            if (var3 == 0) {
                return;
            }
            this.method454(var3, arg1, -127);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lia;IILj;I)Lia;", line = 125)
    public final class48 method450(class48 arg0, int arg1, int arg2, class57 arg3, int arg4) {
        int var6 = this.field1425[arg1];
        field1458++;
        class39 var7 = class85.method623(var6 >> arg2, arg2 ^ 0x92B8697C);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method452(arg4, arg2 - 1833408208, arg0);
        }
        int var9 = arg3.field1425[arg4];
        class39 var10 = class85.method623(var9 >> 16, -102);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class48 var12 = arg0.method370(!var7.method298(var8, false));
            var12.method380(var7, var8);
            return var12;
        } else {
            class48 var13 = arg0.method370(!var7.method298(var8, false) & !var10.method298(var11, false));
            var13.method379(var7, var8, var10, var11, this.field1436);
            return var13;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 161)
    public static void method451(int arg0) {
        field1446 = null;
        field1441 = null;
        field1438 = null;
        field1437 = null;
        field1444 = null;
        field1442 = null;
        field1449 = null;
        if (arg0 == 0) {
            field1448 = null;
            field1439 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILia;)Lia;", line = 189)
    public final class48 method452(int arg0, int arg1, class48 arg2) {
        int var4 = this.field1425[arg0];
        class39 var5 = class85.method623(var4 >> 16, -57);
        int var6 = var4 & 0xFFFF;
        field1429++;
        if (arg1 != 0) {
            this.method455(52, null, 80);
        }
        if (var5 == null) {
            return arg2.method370(true);
        } else {
            class48 var7 = arg2.method370(!var5.method298(var6, false));
            var7.method380(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z", line = 214)
    public static final boolean method453(int arg0, int arg1) {
        field1452++;
        if (arg1 >= -127) {
            field1453 = -107;
        }
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILuc;I)V", line = 235)
    private final void method454(int arg0, class122 arg1, int arg2) {
        if (arg2 >= -92) {
            method451(-69);
        }
        if (arg0 == 1) {
            int var4 = arg1.method943(-1025);
            this.field1420 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1420[var5] = arg1.method938((byte) -109);
            }
            this.field1425 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1425[var6] = arg1.method938((byte) 22);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1425[var7] = (arg1.method938((byte) -124) << 16) + this.field1425[var7];
            }
        } else if (arg0 == 2) {
            this.field1435 = arg1.method938((byte) -108);
        } else if (arg0 == 3) {
            int var8 = arg1.method943(-1025);
            this.field1436 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1436[var9] = arg1.method943(-1025);
            }
            this.field1436[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field1445 = true;
        } else if (arg0 == 5) {
            this.field1418 = arg1.method943(-1025);
        } else if (arg0 == 6) {
            this.field1451 = arg1.method938((byte) 127);
        } else if (arg0 == 7) {
            this.field1427 = arg1.method938((byte) 37);
        } else if (arg0 == 8) {
            this.field1454 = arg1.method943(-1025);
        } else if (arg0 == 9) {
            this.field1428 = arg1.method943(-1025);
        } else if (arg0 == 10) {
            this.field1421 = arg1.method943(-1025);
        } else if (arg0 == 11) {
            this.field1419 = arg1.method943(-1025);
        } else if (arg0 == 12) {
            int var10 = arg1.method943(-1025);
            this.field1432 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1432[var11] = arg1.method938((byte) -96);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1432[var12] = (arg1.method938((byte) 118) << 16) + this.field1432[var12];
            }
        }
        field1426++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILia;I)Lia;", line = 353)
    public final class48 method455(int arg0, class48 arg1, int arg2) {
        if (arg0 != 10232) {
            this.field1451 = 69;
        }
        field1423++;
        int var4 = this.field1425[arg2];
        class39 var5 = class85.method623(var4 >> 16, -57);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method370(true);
        }
        class39 var7 = null;
        int var8 = 0;
        if (this.field1432 != null && this.field1432.length > arg2) {
            int var9 = this.field1432[arg2];
            var7 = class85.method623(var9 >> 16, -63);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class48 var11 = arg1.method370(!var5.method298(var6, false));
            var11.method380(var5, var6);
            return var11;
        } else {
            class48 var10 = arg1.method370(!var5.method298(var6, false) & !var7.method298(var8, false));
            var10.method380(var5, var6);
            var10.method380(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZILia;)Lia;", line = 401)
    public final class48 method456(boolean arg0, int arg1, class48 arg2) {
        field1424++;
        int var4 = this.field1425[arg1];
        class39 var5 = class85.method623(var4 >> 16, -47);
        if (arg0) {
            return null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method366(true);
        } else {
            class48 var7 = arg2.method366(!var5.method298(var6, false));
            var7.method380(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(Z)V", line = 513)
    public static final void method457(boolean arg0) {
        class28.field809 = true;
        field1440++;
        class102.field2592 = true;
        class127.field3209 = 0;
        class108.field2681.field894 = 0;
        class127.field3196 = 0L;
        class72.method538((byte) -97);
        class97.field2478 = 0;
        class90.field2335 = -1;
        class90.field2336 = -1;
        class90.field2338 = -1;
        class76.field1841 = 0;
        class62.field1516 = arg0;
        class103.field2605 = 0;
        class13.field320 = -1;
        class122.field3052 = 0;
        class113.field2874 = 0;
        class94.field2418 = 0;
        class111.field2793 = 0;
        class41.field1050 = 0;
        field1455 = 0;
        class7.field144 = 0;
        class70.field1694 = 0;
        class79.field2005 = 0;
        class39.field1005 = 0;
        client.field480 = 0;
        class86.field2160 = 0;
        class110.field2712 = 0;
        class8.field171 = 0;
        class10.field270 = 0;
        class73.field1791 = 0;
        class94.field2375 = 0;
        client.field495 = 0;
        class29.field826 = 0;
        class36.field947 = 0;
        class122.field3099 = 0;
        class28.field778 = 0;
        class111.field2763 = 0;
        class2.field51 = 0;
        class79.field1992 = 0;
        class43.field1075 = 0;
        class122.field3051 = 0;
        class134.field3281 = 0;
        class74.field1818 = 0;
        class123.field3109 = 0;
        class128.field3223 = 0;
        class26.field706 = 0;
        class112.field2818 = 0;
        class75.field1824 = 0;
        class70.field1696 = 0;
        class50.field1232 = 0;
        field1433 = 0;
        class63.field1546 = 0;
        class82.field2103 = 0;
        class94.field2399 = 0;
        class88.field2271 = 0;
        class100.field2522 = 0;
        class26.field702 = 0;
        class72.field1713 = 0;
        class94.field2403 = 0;
        class94.field2419 = 0;
        class66.field1622 = 0;
        class94.field2379 = 0;
        class76.field1854 = 0;
        class55.field1394 = 0;
        class122.field3045 = 0;
        class73.field1786 = 0;
        class28.field782 = 0;
        class134.field3298 = 0;
        class51.field1270 = 0;
        class27.field765 = 0;
        class9.field261 = 0;
        class127.field3198 = 0;
        class94.field2388 = 0;
        class110.field2743 = 0;
        class133.field3251 = 0;
        class115.field2903 = 0;
        class90.field2334 = 0;
        class134.field3271 = 0;
        class122.field3065 = 0;
        class82.field2089 = 0;
        class122.field3054 = 0;
        class97.field2464 = 0;
        class122.field3098 = 0;
        class20.field554 = 0;
        class127.field3188 = 0;
        class87.field2204 = 0;
        class77.field1954 = 0;
        class55.field1414 = 0;
        class74.field1813 = 0;
        class51.field1290 = 0;
        class55.field1408 = 0;
        class50.field1260 = 0;
        class64.field1576 = 0;
        class72.field1751 = 0;
        class64.field1570 = 0;
        class63.field1534 = 0;
        class123.field3105 = 0;
        class4.field85 = 0;
        class64.field1563 = 0;
        class82.field2095 = 0;
        class9.field258 = 0;
        class50.field1235 = 0;
        class54.field1326 = 0;
        class55.field1396 = 0;
        class128.field3210 = 0;
        class47.field1147 = 0;
        class28.field787 = 0;
        class120.field2981 = 0;
        class42.field1066 = 0;
        class113.field2871 = 0;
        class92.field2359 = 0;
        class133.field3249 = 0;
        class2.field67 = 0;
        class40.field1023 = 0;
        class33.field907 = 0;
        class72.field1731 = 0;
        class62.field1497 = 0;
        class88.field2258 = 0;
        class122.field3084 = 0;
        class23.field592 = 0;
        class134.field3274 = 0;
        field1429 = 0;
        class84.field2123 = 0;
        class112.field2815 = 0;
        class80.field2043 = 0;
        class77.field1958 = 0;
        class107.field2658 = 0;
        class45.field1111 = 0;
        class134.field3285 = 0;
        class29.field832 = 0;
        class76.field1846 = 0;
        class45.field1120 = 0;
        class120.field2995 = 0;
        class119.field2959 = 0;
        class134.field3265 = 0;
        class110.field2752 = 0;
        class133.field3253 = 0;
        class126.field3165 = 0;
        class29.field838 = 0;
        class76.field1842 = 0;
        class70.field1698 = 0;
        class88.field2260 = 0;
        class2.field62 = 0;
        class70.field1705 = 0;
        class41.field1048 = 0;
        class76.field1844 = 0;
        class123.field3112 = 0;
        class2.field55 = 0;
        class127.field3193 = 0;
        class86.field2173 = 0;
        class122.field3064 = 0;
        class79.field2018 = 0;
        class80.field2038 = 0;
        class73.field1789 = 0;
        class110.field2697 = 0;
        class1.field16 = 0;
        class47.field1142 = 0;
        class67.field1638 = 0;
        class102.field2588 = 0;
        class52.field1300 = 0;
        class14.field352 = 0;
        class52.field1302 = 0;
        class86.field2159 = 0;
        class9.field255 = 0;
        class87.field2231 = 0;
        class72.field1736 = 0;
        client.field497 = 0;
        class33.field914 = 0;
        class73.field1801 = 0;
        class135.field3314 = 0;
        class134.field3277 = 0;
        class113.field2872 = 0;
        class123.field3104 = 0;
        class39.field1009 = 0;
        class50.field1230 = 0;
        class52.field1298 = 0;
        class99.field2499 = 0;
        class67.field1644 = 0;
        class111.field2786 = 0;
        class76.field1856 = 0;
        class45.field1110 = 0;
        class122.field3078 = 0;
        class133.field3256 = 0;
        class73.field1773 = 0;
        class33.field911 = 0;
        client.field488 = 0;
        class115.field2901 = 0;
        class110.field2740 = 0;
        class39.field1011 = 0;
        class88.field2268 = 0;
        class88.field2254 = 0;
        class122.field3102 = 0;
        class90.field2342 = 0;
        class136.field3336 = 0;
        class88.field2250 = 0;
        class100.field2527 = 0;
        class92.field2366 = 0;
        class45.field1112 = 0;
        class136.field3337 = 0;
        class7.field131 = 0;
        class122.field3081 = 0;
        class94.field2383 = 0;
        class102.field2577 = 0;
        class9.field254 = 0;
        class122.field3073 = 0;
        class119.field2954 = 0;
        class64.field1562 = 0;
        class111.field2792 = 0;
        class40.field1033 = 0;
        class23.field609 = 0;
        class6.field110 = 0;
        class70.field1679 = 0;
        class43.field1080 = 0;
        class136.field3326 = 0;
        class90.field2337 = 0;
        class76.field1857 = 0;
        class70.field1689 = 0;
        class70.field1680 = 0;
        class54.field1380 = 0;
        class27.field718 = 0;
        class88.field2263 = 0;
        class128.field3211 = 0;
        class136.field3348 = 0;
        class41.field1040 = 0;
        class72.field1760 = 0;
        class27.field735 = 0;
        class27.field714 = 0;
        class30.field851 = 0;
        class94.field2434 = 0;
        class122.field3072 = 0;
        class134.field3286 = 0;
        class123.field3113 = 0;
        class75.field1825 = 0;
        class122.field3103 = 0;
        class87.field2228 = 0;
        class45.field1114 = 0;
        class97.field2468 = 0;
        class27.field733 = 0;
        class1.field45 = 0;
        class25.field683 = 0;
        field1431 = 0;
        class100.field2523 = 0;
        class94.field2392 = 0;
        class123.field3122 = 0;
        class108.field2677 = 0;
        class100.field2524 = 0;
        class115.field2904 = 0;
        class87.field2230 = 0;
        class55.field1404 = 0;
        class134.field3279 = 0;
        class69.field1672 = 0;
        class98.field2491 = 0;
        class85.field2131 = 0;
        client.field475 = 0;
        class94.field2421 = 0;
        class122.field3057 = 0;
        class9.field238 = 0;
        class135.field3309 = 0;
        class122.field3069 = 0;
        class113.field2859 = 0;
        class85.field2141 = 0;
        class73.field1780 = 0;
        class67.field1646 = 0;
        class122.field3061 = 0;
        class119.field2963 = 0;
        class134.field3263 = 0;
        class2.field64 = 0;
        class25.field688 = 0;
        class50.field1243 = 0;
        class113.field2875 = 0;
        class40.field1022 = 0;
        class70.field1682 = 0;
        class135.field3308 = 0;
        class20.field544 = 0;
        class9.field257 = 0;
        class120.field2996 = 0;
        class77.field1947 = 0;
        class88.field2236 = 0;
        class63.field1527 = 0;
        class134.field3288 = 0;
        class27.field734 = 0;
        class111.field2788 = 0;
        class99.field2501 = 0;
        class100.field2525 = 0;
        class134.field3272 = 0;
        class122.field3092 = 0;
        class113.field2843 = 0;
        class94.field2416 = 0;
        class30.field863 = 0;
        class1.field5 = 0;
        class113.field2851 = 0;
        field1452 = 0;
        field1456 = 0;
        class8.field203 = 0;
        class50.field1248 = 0;
        class92.field2363 = 0;
        class8.field173 = 0;
        class69.field1678 = 0;
        class23.field591 = 0;
        class79.field2001 = 0;
        class134.field3289 = 0;
        class122.field3060 = 0;
        class45.field1107 = 0;
        class112.field2814 = 0;
        class88.field2249 = 0;
        class85.field2149 = 0;
        class31.field883 = 0;
        class94.field2397 = 0;
        class89.field2279 = 0;
        class123.field3124 = 0;
        class29.field829 = 0;
        class86.field2158 = 0;
        class1.field37 = 0;
        class128.field3221 = 0;
        class81.field2066 = 0;
        class86.field2182 = 0;
        client.field493 = 0;
        class122.field3041 = 0;
        class134.field3294 = 0;
        class94.field2424 = 0;
        class95.field2441 = 0;
        class79.field2014 = 0;
        class43.field1073 = 0;
        class111.field2776 = 0;
        class111.field2770 = 0;
        class69.field1656 = 0;
        class19.field515 = 0;
        class30.field853 = 0;
        class80.field2033 = 0;
        class86.field2169 = 0;
        class45.field1104 = 0;
        class87.field2202 = 0;
        class122.field3083 = 0;
        class102.field2574 = 0;
        class115.field2907 = 0;
        class77.field1953 = 0;
        class94.field2387 = 0;
        class112.field2831 = 0;
        client.field481 = 0;
        class4.field83 = 0;
        class89.field2293 = 0;
        class38.field998 = 0;
        class99.field2503 = 0;
        class63.field1545 = 0;
        class45.field1109 = 0;
        class30.field861 = 0;
        class110.field2734 = 0;
        class94.field2380 = 0;
        class12.field298 = 0;
        class133.field3255 = 0;
        class94.field2433 = 0;
        class105.field2632 = 0;
        class111.field2764 = 0;
        class87.field2221 = 0;
        class135.field3315 = 0;
        class64.field1582 = 0;
        class2.field52 = 0;
        class123.field3114 = 0;
        class79.field2008 = 0;
        class79.field1994 = 0;
        class111.field2767 = 0;
        class110.field2749 = 0;
        class17.field419 = 0;
        class7.field138 = 0;
        class94.field2412 = 0;
        class128.field3219 = 0;
        class102.field2583 = 0;
        class69.field1653 = 0;
        class13.field321 = 0;
        class70.field1707 = 0;
        class94.field2374 = 0;
        class126.field3166 = 0;
        class134.field3266 = 0;
        class94.field2426 = 0;
        class13.field326 = 0;
        class42.field1058 = 0;
        class84.field2117 = 0;
        class89.field2311 = 0;
        class97.field2470 = 0;
        class50.field1229 = 0;
        class119.field2972 = 0;
        class85.field2142 = 0;
        class85.field2147 = 0;
        class20.field560 = 0;
        class99.field2500 = 0;
        class92.field2357 = 0;
        class119.field2950 = 0;
        class85.field2148 = 0;
        class122.field3082 = 0;
        class31.field890 = 0;
        class20.field541 = 0;
        class111.field2783 = 0;
        class23.field600 = 0;
        class55.field1403 = 0;
        class94.field2422 = 0;
        class128.field3230 = 0;
        class77.field1882 = 0;
        class101.field2551 = 0;
        class4.field86 = 0;
        class121.field3037 = 0;
        class89.field2314 = 0;
        class20.field532 = 0;
        class111.field2761 = 0;
        class95.field2452 = 0;
        field1430 = 0;
        class89.field2294 = 0;
        class119.field2951 = 0;
        class119.field2955 = 0;
        class80.field2036 = 0;
        class42.field1060 = 0;
        class75.field1832 = 0;
        class111.field2791 = 0;
        class128.field3227 = 0;
        class94.field2395 = 0;
        class111.field2780 = 0;
        class81.field2073 = 0;
        class121.field3035 = 0;
        class79.field2030 = 0;
        class110.field2720 = 0;
        class19.field516 = 0;
        class81.field2064 = 0;
        class94.field2408 = 0;
        class12.field300 = 0;
        class52.field1299 = 0;
        class134.field3258 = 0;
        class79.field2006 = 0;
        class85.field2139 = 0;
        class90.field2341 = 0;
        class80.field2051 = 0;
        class74.field1807 = 0;
        class6.field112 = 0;
        class51.field1272 = 0;
        class123.field3123 = 0;
        class75.field1830 = 0;
        class43.field1079 = 0;
        class107.field2653 = 0;
        class86.field2154 = 0;
        class54.field1364 = 0;
        class121.field3029 = 0;
        class110.field2714 = 0;
        class52.field1291 = 0;
        class7.field141 = 0;
        class23.field603 = 0;
        class4.field89 = 0;
        class88.field2244 = 0;
        class128.field3220 = 0;
        class119.field2957 = 0;
        class21.field570 = 0;
        class111.field2795 = 0;
        class94.field2425 = 0;
        class115.field2905 = 0;
        class122.field3089 = 0;
        class69.field1657 = 0;
        class8.field174 = 0;
        class43.field1089 = 0;
        class66.field1631 = 0;
        class42.field1064 = 0;
        class85.field2151 = 0;
        class111.field2798 = 0;
        class40.field1020 = 0;
        class105.field2616 = 0;
        class120.field3000 = 0;
        class42.field1056 = 0;
        class63.field1529 = 0;
        class51.field1277 = 0;
        class119.field2952 = 0;
        class33.field913 = 0;
        class31.field877 = 0;
        class127.field3184 = 0;
        class36.field935 = 0;
        class110.field2722 = 0;
        class94.field2429 = 0;
        class115.field2900 = 0;
        class82.field2111 = 0;
        class19.field519 = 0;
        class66.field1634 = 0;
        class13.field318 = 0;
        class41.field1053 = 0;
        class27.field751 = 0;
        class94.field2378 = 0;
        class20.field551 = 0;
        class55.field1385 = 0;
        class74.field1808 = 0;
        class70.field1695 = 0;
        class73.field1775 = 0;
        class123.field3111 = 0;
        class4.field92 = 0;
        class54.field1367 = 0;
        class27.field763 = 0;
        class2.field56 = 0;
        class20.field531 = 0;
        class89.field2283 = 0;
        class4.field74 = 0;
        class74.field1819 = 0;
        class113.field2852 = 0;
        class33.field900 = 0;
        class122.field3056 = 0;
        class89.field2288 = 0;
        class111.field2768 = 0;
        class86.field2170 = 0;
        class73.field1768 = 0;
        class72.field1756 = 0;
        class120.field3001 = 0;
        class80.field2049 = 0;
        class112.field2822 = 0;
        class90.field2348 = 0;
        class92.field2351 = 0;
        class88.field2262 = 0;
        class7.field156 = 0;
        class121.field3032 = 0;
        class123.field3106 = 0;
        class128.field3217 = 0;
        class39.field1003 = 0;
        class73.field1779 = 0;
        class73.field1776 = 0;
        class120.field2988 = 0;
        class46.field1129 = 0;
        class100.field2532 = 0;
        class75.field1833 = 0;
        class43.field1082 = 0;
        class13.field315 = 0;
        class135.field3316 = 0;
        class73.field1794 = 0;
        class66.field1615 = 0;
        class97.field2459 = 0;
        class88.field2246 = 0;
        class122.field3046 = 0;
        class41.field1055 = 0;
        class37.field960 = 0;
        class92.field2371 = 0;
        class123.field3110 = 0;
        class121.field3028 = 0;
        class122.field3090 = 0;
        class20.field529 = 0;
        class52.field1301 = 0;
        class88.field2261 = 0;
        class92.field2367 = 0;
        class87.field2203 = 0;
        class111.field2784 = 0;
        class120.field2986 = 0;
        class102.field2582 = 0;
        class119.field2958 = 0;
        class110.field2753 = 0;
        class19.field517 = 0;
        class77.field1902 = 0;
        field1422 = 0;
        class122.field3091 = 0;
        class62.field1499 = 0;
        class89.field2298 = 0;
        class111.field2779 = 0;
        class66.field1619 = 0;
        class134.field3282 = 0;
        class12.field299 = 0;
        class111.field2789 = 0;
        class37.field971 = 0;
        class113.field2858 = 0;
        class63.field1540 = 0;
        class9.field244 = 0;
        class8.field218 = 0;
        class80.field2041 = 0;
        class94.field2393 = 0;
        class23.field607 = 0;
        class13.field330 = 0;
        class122.field3055 = 0;
        class38.field997 = 0;
        class113.field2853 = 0;
        class107.field2647 = 0;
        class55.field1397 = 0;
        class134.field3284 = 0;
        class122.field3059 = 0;
        class79.field1996 = 0;
        class86.field2174 = 0;
        class122.field3038 = 0;
        class40.field1021 = 0;
        class13.field323 = 0;
        class62.field1502 = 0;
        class88.field2237 = 0;
        class79.field2000 = 0;
        class126.field3170 = 0;
        class101.field2557 = 0;
        class69.field1666 = 0;
        class25.field686 = 0;
        class117.field2937 = 0;
        class122.field3063 = 0;
        class126.field3167 = 0;
        class89.field2287 = 0;
        class69.field1665 = 0;
        class121.field3020 = 0;
        class64.field1564 = 0;
        class33.field908 = 0;
        class64.field1567 = 0;
        class55.field1400 = 0;
        class123.field3107 = 0;
        class108.field2672 = 0;
        class70.field1685 = 0;
        class79.field2015 = 0;
        client.field498 = 0;
        class1.field17 = 0;
        class134.field3261 = 0;
        class64.field1573 = 0;
        class100.field2530 = 0;
        class122.field3058 = 0;
        class122.field3086 = 0;
        class120.field2992 = 0;
        class26.field694 = 0;
        class50.field1253 = 0;
        class134.field3296 = 0;
        class9.field239 = 0;
        class127.field3202 = 0;
        class88.field2252 = 0;
        class99.field2494 = 0;
        class128.field3229 = 0;
        class50.field1252 = 0;
        class86.field2181 = 0;
        class70.field1690 = 0;
        class21.field583 = 0;
        class75.field1827 = 0;
        class94.field2423 = 0;
        class79.field2022 = 0;
        class13.field325 = 0;
        class73.field1803 = 0;
        class85.field2137 = 0;
        class77.field1901 = 0;
        class17.field413 = 0;
        class28.field773 = 0;
        class122.field3068 = 0;
        class28.field774 = 0;
        class112.field2817 = 0;
        class122.field3071 = 0;
        class27.field745 = 0;
        class94.field2377 = 0;
        class110.field2711 = 0;
        class120.field2999 = 0;
        class7.field150 = 0;
        field1458 = 0;
        class134.field3295 = 0;
        class55.field1398 = 0;
        class23.field595 = 0;
        class73.field1770 = 0;
        class51.field1288 = 0;
        class122.field3044 = 0;
        class94.field2376 = 0;
        class70.field1710 = 0;
        class31.field880 = 0;
        class40.field1027 = 0;
        class94.field2405 = 0;
        class99.field2498 = 0;
        class88.field2264 = 0;
        class14.field370 = 0;
        class45.field1103 = 0;
        class13.field316 = 0;
        class74.field1812 = 0;
        class37.field972 = 0;
        class26.field701 = 0;
        class27.field768 = 0;
        class112.field2824 = 0;
        class17.field426 = 0;
        class133.field3246 = 0;
        class23.field602 = 0;
        class64.field1568 = 0;
        class98.field2490 = 0;
        class122.field3067 = 0;
        class69.field1664 = 0;
        class17.field415 = 0;
        class133.field3252 = 0;
        class73.field1772 = 0;
        class121.field3025 = 0;
        class69.field1660 = 0;
        class102.field2570 = 0;
        class121.field3019 = 0;
        class40.field1036 = 0;
        class134.field3270 = 0;
        class40.field1025 = 0;
        class122.field3096 = 0;
        class28.field776 = 0;
        class70.field1688 = 0;
        class36.field942 = 0;
        class94.field2413 = 0;
        class85.field2136 = 0;
        class126.field3174 = 0;
        class107.field2664 = 0;
        class136.field3343 = 0;
        class69.field1668 = 0;
        class75.field1828 = 0;
        class134.field3291 = 0;
        class108.field2688 = 0;
        class110.field2756 = 0;
        class80.field2055 = 0;
        class64.field1572 = 0;
        class63.field1528 = 0;
        class14.field337 = 0;
        class122.field3049 = 0;
        class79.field1991 = 0;
        class119.field2962 = 0;
        class12.field295 = 0;
        class113.field2873 = 0;
        class4.field95 = 0;
        class112.field2827 = 0;
        class81.field2058 = 0;
        class99.field2495 = 0;
        class2.field50 = 0;
        class42.field1063 = 0;
        class47.field1150 = 0;
        class122.field3077 = 0;
        client.field483 = 0;
        class94.field2390 = 0;
        field1440 = 0;
        class111.field2769 = 0;
        class80.field2031 = 0;
        class110.field2751 = 0;
        class80.field2040 = 0;
        class82.field2098 = 0;
        class64.field1565 = 0;
        class113.field2855 = 0;
        class122.field3053 = 0;
        class105.field2635 = 0;
        class14.field371 = 0;
        class134.field3260 = 0;
        class122.field3087 = 0;
        class46.field1125 = 0;
        class67.field1643 = 0;
        class86.field2161 = 0;
        class119.field2964 = 0;
        class95.field2449 = 0;
        class111.field2807 = 0;
        class120.field2985 = 0;
        class27.field741 = 0;
        field1423 = 0;
        class47.field1145 = 0;
        class134.field3276 = 0;
        class17.field417 = 0;
        class113.field2887 = 0;
        class122.field3040 = 0;
        class123.field3125 = 0;
        class79.field2007 = 0;
        class122.field3048 = 0;
        class88.field2270 = 0;
        class128.field3226 = 0;
        class72.field1715 = 0;
        class62.field1505 = 0;
        class90.field2349 = 0;
        class102.field2578 = 0;
        client.field496 = 0;
        class19.field509 = 0;
        class33.field910 = 0;
        class82.field2104 = 0;
        class69.field1674 = 0;
        class89.field2275 = 0;
        field1434 = 0;
        class101.field2558 = 0;
        class63.field1536 = 0;
        client.field478 = 0;
        class110.field2733 = 0;
        class70.field1691 = 0;
        class111.field2803 = 0;
        class30.field868 = 0;
        class89.field2274 = 0;
        class64.field1579 = 0;
        class41.field1052 = 0;
        class100.field2529 = 0;
        class74.field1805 = 0;
        class97.field2472 = 0;
        class95.field2446 = 0;
        class45.field1119 = 0;
        class4.field90 = 0;
        class81.field2069 = 0;
        class64.field1581 = 0;
        class63.field1552 = 0;
        class69.field1676 = 0;
        class41.field1039 = 0;
        class90.field2344 = 0;
        class17.field430 = 0;
        class72.field1712 = 0;
        class21.field569 = 0;
        class2.field66 = 0;
        class107.field2654 = 0;
        class73.field1800 = 0;
        class113.field2842 = 0;
        class94.field2427 = 0;
        class27.field723 = 0;
        class26.field704 = 0;
        class111.field2794 = 0;
        class94.field2402 = 0;
        class82.field2106 = 0;
        class77.field1864 = 0;
        class72.field1752 = 0;
        class122.field3101 = 0;
        class107.field2650 = 0;
        class70.field1684 = 0;
        class43.field1074 = 0;
        class94.field2394 = 0;
        class50.field1256 = 0;
        class4.field88 = 0;
        field1424 = 0;
        class46.field1130 = 0;
        class12.field301 = 0;
        class87.field2217 = 0;
        class55.field1416 = 0;
        class122.field3080 = 0;
        class90.field2347 = 0;
        class43.field1071 = 0;
        class70.field1703 = 0;
        class122.field3076 = 0;
        class97.field2456 = 0;
        class19.field520 = 0;
        client.field472 = 0;
        class2.field65 = 0;
        class94.field2401 = 0;
        class134.field3267 = 0;
        class21.field572 = 0;
        class134.field3287 = 0;
        class94.field2410 = 0;
        class111.field2762 = 0;
        class134.field3278 = 0;
        class108.field2682 = 0;
        class76.field1847 = 0;
        class9.field252 = 0;
        class36.field939 = 0;
        field1426 = 0;
        class112.field2830 = 0;
        class94.field2385 = 0;
        class64.field1580 = 0;
        class126.field3177 = 0;
        class95.field2444 = 0;
        class37.field958 = 0;
        class43.field1076 = 0;
        class94.field2415 = 0;
        class27.field742 = 0;
        class97.field2469 = 0;
        class122.field3042 = 0;
        class55.field1392 = 0;
        class121.field3036 = 0;
        class87.field2208 = 0;
        class111.field2778 = 0;
        class107.field2662 = 0;
        class14.field366 = 0;
        class2.field57 = 0;
        class77.field1942 = 0;
        class94.field2420 = 0;
        class88.field2235 = 0;
        class122.field3094 = 0;
        class90.field2343 = 0;
        class134.field3293 = 0;
        class122.field3095 = 0;
        class128.field3228 = 0;
        class20.field559 = 0;
        client.field504 = 0;
        class1.field34 = 0;
        class50.field1237 = 0;
        class101.field2544 = 0;
        class94.field2398 = 0;
        class46.field1127 = 0;
        class105.field2623 = 0;
        class72.field1753 = 0;
        class94.field2432 = 0;
        class115.field2899 = 0;
        class63.field1533 = 0;
        class122.field3093 = 0;
        class39.field1000 = 0;
        class122.field3062 = 0;
        class113.field2860 = 0;
        class63.field1531 = 0;
        class64.field1569 = 0;
        class94.field2406 = 0;
        class31.field884 = 0;
        class76.field1851 = 0;
        class134.field3290 = 0;
        class94.field2414 = 0;
        class77.field1891 = 0;
        class27.field731 = 0;
        class86.field2164 = 0;
        class69.field1673 = 0;
        class12.field312 = 0;
        class107.field2670.field3047 = 0;
        class64.field1595 = 0;
        class99.field2502.field3047 = 0;
        class110.method795(0, false);
        for (int var1 = 0; var1 < 100; var1++) {
            class55.field1410[var1] = null;
        }
        class26.field697 = (int) (Math.random() * 100.0D) - 50;
        class25.field680 = -1;
        class25.field691 = 0;
        class31.field882 = 0;
        class113.field2886 = 0;
        class74.field1822 = (int) (Math.random() * 110.0D) - 55;
        class41.field1043 = (int) (Math.random() * 80.0D) - 40;
        class126.field3178 = 0;
        class119.field2976 = (int) (Math.random() * 120.0D) - 60;
        class50.field1244 = (int) (Math.random() * 30.0D) - 20;
        class9.field245 = 0;
        class107.field2668 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class14.field355 = 0;
        class115.field2906 = 0;
        class12.field306 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class85.field2138[var2] = null;
            class23.field613[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class28.field803[var3] = null;
        }
        class80.field2044 = class85.field2138[2047] = new class89();
        class1.field40.method888(7107);
        class102.field2564.method888(7107);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class9.field243[var4][var6][var7] = null;
                }
            }
        }
        class39.field1007 = new class119();
        class77.field1963 = 0;
        class52.field1303 = 0;
        class52.method412(class75.field1837, (byte) -22);
        class75.field1837 = -1;
        class52.method412(class115.field2925, (byte) -22);
        class115.field2925 = -1;
        class52.method412(class103.field2603, (byte) -22);
        class103.field2603 = -1;
        class52.method412(class77.field1962, (byte) -22);
        class77.field1962 = -1;
        class52.method412(class111.field2806, (byte) -22);
        class111.field2806 = -1;
        class52.method412(class45.field1108, (byte) -22);
        class45.field1108 = -1;
        class52.method412(class55.field1384, (byte) -22);
        class55.field1384 = -1;
        class134.field3262 = 0;
        class79.field1995 = false;
        class62.field1516 = false;
        class111.field2809 = -1;
        class110.field2741 = 0;
        class76.field1855 = null;
        class92.field2361 = 3;
        class66.field1629 = -1;
        class52.field1304.method518(-1, null, -19872, false, new int[5]);
        for (int var5 = 0; var5 < 5; var5++) {
            class9.field248[var5] = null;
            class110.field2702[var5] = false;
        }
        class6.method37(115);
        class8.field182 = true;
    }
}
