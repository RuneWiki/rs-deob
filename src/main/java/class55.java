import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[B")
    private byte[] field1344 = new byte[4];

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lbe;")
    private class13 field1362;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "J")
    private long field1356;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1346 = -1;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lic;")
    public static class59 field1343 = class59.method433(0, "Ausw-=hlen");

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lic;")
    public static class59 field1350 = class59.method433(0, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lic;")
    private static class59 field1354 = class59.method433(0, "flash3:");

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    public static boolean field1345 = true;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lic;")
    public static class59 field1348 = field1354;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lic;")
    public static class59 field1357 = field1354;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Ldd;")
    public static class26 field1363;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1366;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[B")
    private byte[] field1355;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    public static int[] field1349;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[Lic;")
    public static class59[] field1352;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[B")
    public final byte[] method407(boolean arg0) throws IOException {
        if (!arg0) {
            this.field1366 = null;
        }
        field1361++;
        if (this.field1356 < class29.method235(-329)) {
            throw new IOException("fdt");
        }
        if (this.field1353 == 0) {
            if (this.field1362.field252 == 2) {
                throw new IOException("fds");
            }
            if (this.field1362.field252 == 1) {
                this.field1353 = 1;
                this.field1366 = (DataInputStream) this.field1362.field254;
            }
        }
        if (this.field1353 == 1) {
            int var2 = this.field1366.available();
            if (var2 > 0) {
                if (var2 + this.field1365 > 4) {
                    var2 = 4 - this.field1365;
                }
                this.field1365 += this.field1366.read(this.field1344, this.field1365, var2);
                if (this.field1365 == 4) {
                    int var3 = (new class157(this.field1344)).method1175((byte) -97);
                    this.field1353 = 2;
                    this.field1355 = new byte[var3];
                }
            }
        }
        if (this.field1353 == 2) {
            int var4 = this.field1366.available();
            if (var4 > 0) {
                if (this.field1355.length < this.field1364 + var4) {
                    var4 = this.field1355.length - this.field1364;
                }
                this.field1364 += this.field1366.read(this.field1355, this.field1364, var4);
                if (this.field1355.length == this.field1364) {
                    return this.field1355;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lic;ILic;ILic;)V")
    public static final void method408(class59 arg0, int arg1, class59 arg2, int arg3, class59 arg4) {
        field1358++;
        for (int var5 = 99; var5 > 0; var5--) {
            class10.field214[var5] = class10.field214[var5 - 1];
            class127.field2883[var5] = class127.field2883[var5 - 1];
            class85.field2131[var5] = class85.field2131[var5 - 1];
            class5.field117[var5] = class5.field117[var5 - 1];
        }
        class10.field214[0] = arg1;
        class127.field2883[0] = arg2;
        class59.field1455++;
        field1360 = class94.field2400;
        if (arg3 <= 18) {
            field1354 = null;
        }
        class85.field2131[0] = arg4;
        class5.field117[0] = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method409(byte arg0) {
        field1352 = null;
        field1357 = null;
        field1350 = null;
        field1349 = null;
        field1354 = null;
        field1348 = null;
        if (arg0 > 111) {
            field1363 = null;
            field1343 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method410(byte arg0) {
        class127.field2890 = true;
        class8.field167 = 0L;
        field1351++;
        class125.field2814 = 0;
        class81.field2015 = 0;
        class60.field1472 = 0;
        class46.field1177 = 0;
        class73.field1802 = 0;
        class57.field1386 = 0;
        class84.field2101 = 0;
        class60.field1463 = 0;
        class148.field3215 = 0;
        class107.field2563 = 0;
        class145.field3170 = 0;
        class126.field2861 = 0;
        class63.field1613 = 0;
        class62.field1594 = 0;
        class79.field1964 = 0;
        class65.field1652 = 0;
        class70.field1774 = 0;
        class21.field453 = 0;
        class70.field1781 = 0;
        class3.field71 = 0;
        class73.field1822 = 0;
        class33.field875 = 0;
        class61.field1547 = 0;
        class26.field644 = 0;
        class24.field583 = 0;
        class59.field1421 = 0;
        class86.field2168 = 0;
        class40.field1034 = 0;
        class32.field856 = 0;
        class108.field2599 = 0;
        class59.field1413 = 0;
        class121.field2779 = 0;
        class116.field2732 = 0;
        class157.field3429 = 0;
        class81.field2025 = 0;
        class30.field771 = 0;
        class62.field1596 = 0;
        class26.field656 = 0;
        class68.field1728 = 0;
        class127.field2886 = 0;
        client.field506 = 0;
        class81.field2010 = 0;
        class107.field2592 = 0;
        class60.field1469 = 0;
        class94.field2394 = 0;
        class59.field1409 = 0;
        class79.field1954 = 0;
        class157.field3421 = 0;
        class26.field666 = 0;
        class149.field3253 = 0;
        class35.field934 = 0;
        class59.field1404 = 0;
        class42.field1085 = 0;
        class6.field128 = 0;
        class107.field2574 = 0;
        class64.field1629 = 0;
        class126.field2853 = 0;
        class143.field3145 = 0;
        class19.field435 = 0;
        class90.field2275 = 0;
        class107.field2561 = 0;
        class34.field903 = 0;
        class85.field2133 = 0;
        class22.field519 = 0;
        class96.field2438 = 0;
        class31.field812 = 0;
        class36.field946 = 0;
        class59.field1407 = 0;
        class30.field779 = 0;
        class87.field2186 = 0;
        class134.field2971 = 0;
        class73.field1808 = 0;
        class62.field1573 = 0;
        class59.field1402 = 0;
        class87.field2183 = 0;
        class38.field980 = 0;
        class89.field2251 = 0;
        class23.field541 = 0;
        class125.field2798 = 0;
        class43.field1093 = 0;
        class108.field2615 = 0;
        class49.field1248 = 0;
        class157.field3442 = 0;
        class126.field2871 = 0;
        class137.field3056 = 0;
        class59.field1438 = 0;
        class145.field3164 = 0;
        class153.field3310 = 0;
        class19.field396 = 0;
        class60.field1467 = 0;
        class60.field1497 = 0;
        class154.field3334 = 0;
        class53.field1316 = 0;
        class157.field3480 = 0;
        class56.field1368 = 0;
        class49.field1246 = 0;
        class89.field2233 = 0;
        class87.field2207 = 0;
        class61.field1558 = 0;
        class157.field3482 = 0;
        class16.field317 = 0;
        class157.field3447 = 0;
        class44.field1133 = 0;
        class73.field1805 = 0;
        class75.field1843 = 0;
        class32.field864 = 0;
        class41.field1055 = 0;
        class80.field1986 = 0;
        class137.field3068 = 0;
        class112.field2690 = 0;
        class49.field1250 = 0;
        class128.field2901 = 0;
        class157.field3451 = 0;
        class43.field1091 = 0;
        class59.field1414 = 0;
        class46.field1169 = 0;
        class19.field412 = 0;
        class153.field3311 = 0;
        class60.field1474 = 0;
        class3.field72 = 0;
        class41.field1048 = 0;
        class89.field2231 = 0;
        class154.field3344 = 0;
        class59.field1410 = 0;
        class17.field336 = 0;
        class47.field1198 = 0;
        class87.field2192 = 0;
        class88.field2227 = 0;
        class86.field2145 = 0;
        class4.field89 = 0;
        class89.field2252 = 0;
        class38.field985 = 0;
        class157.field3470 = 0;
        class76.field1875 = 0;
        class75.field1844 = 0;
        class26.field671 = 0;
        class4.field94 = 0;
        class73.field1825 = 0;
        class68.field1688 = 0;
        class60.field1500 = 0;
        class89.field2262 = 0;
        class5.field100 = 0;
        class83.field2056 = 0;
        class86.field2165 = 0;
        class83.field2069 = 0;
        class82.field2035 = 0;
        class51.field1265 = 0;
        class108.field2613 = 0;
        class84.field2106 = 0;
        class60.field1527 = 0;
        class155.field3357 = 0;
        class30.field780 = 0;
        class42.field1071 = 0;
        class154.field3335 = 0;
        class89.field2234 = 0;
        class136.field3028 = 0;
        class9.field188 = 0;
        class65.field1648 = 0;
        class68.field1741 = 0;
        class106.field2538 = 0;
        class60.field1517 = 0;
        class157.field3437 = 0;
        class79.field1923 = 0;
        class83.field2057 = 0;
        class38.field981 = 0;
        client.field484 = 0;
        class83.field2059 = 0;
        class107.field2570 = 0;
        class25.field613 = 0;
        class73.field1816 = 0;
        field1361 = 0;
        class60.field1516 = 0;
        class24.field584 = 0;
        class126.field2869 = 0;
        class26.field682 = 0;
        class136.field3030 = 0;
        class157.field3414 = 0;
        class31.field801 = 0;
        client.field501 = 0;
        class56.field1380 = 0;
        class157.field3478 = 0;
        class51.field1269 = 0;
        class4.field87 = 0;
        class53.field1305 = 0;
        class120.field2774 = 0;
        class96.field2435 = 0;
        class103.field2500 = 0;
        class19.field421 = 0;
        class154.field3343 = 0;
        class29.field760 = 0;
        class136.field3031 = 0;
        class82.field2028 = 0;
        client.field492 = 0;
        class40.field1033 = 0;
        class81.field2023 = 0;
        class91.field2307 = 0;
        class25.field627 = 0;
        class9.field176 = 0;
        class40.field1024 = 0;
        class59.field1411 = 0;
        class25.field618 = 0;
        class33.field881 = 0;
        class157.field3441 = 0;
        class149.field3259 = 0;
        class107.field2555 = 0;
        class157.field3467 = 0;
        class22.field517 = 0;
        class32.field866 = 0;
        class5.field107 = 0;
        class59.field1427 = 0;
        class34.field899 = 0;
        class24.field568 = 0;
        class143.field3131 = 0;
        client.field482 = 0;
        class107.field2597 = 0;
        class46.field1163 = 0;
        class91.field2304 = 0;
        class90.field2272 = 0;
        class114.field2699 = 0;
        class26.field684 = 0;
        class95.field2411 = 0;
        class59.field1447 = 0;
        class157.field3452 = 0;
        class60.field1501 = 0;
        class151.field3291 = 0;
        class134.field2970 = 0;
        class106.field2522 = 0;
        class54.field1338 = 0;
        class107.field2559 = 0;
        class19.field416 = 0;
        class79.field1977 = 0;
        class19.field393 = 0;
        class59.field1446 = 0;
        class47.field1203 = 0;
        class59.field1425 = 0;
        class116.field2723 = 0;
        class59.field1429 = 0;
        class22.field509 = 0;
        class47.field1197 = 0;
        class158.field3508 = 0;
        class52.field1288 = 0;
        class87.field2194 = 0;
        class46.field1175 = 0;
        class127.field2872 = 0;
        class18.field362 = 0;
        class49.field1249 = 0;
        class112.field2692 = 0;
        class89.field2230 = 0;
        class24.field597 = 0;
        class63.field1601 = 0;
        class46.field1156 = 0;
        class148.field3247 = 0;
        class151.field3290 = 0;
        class35.field920 = 0;
        class3.field56 = 0;
        class79.field1940 = 0;
        class25.field636 = 0;
        class91.field2315 = 0;
        class153.field3315 = 0;
        class24.field566 = 0;
        class95.field2420 = 0;
        class1.field8 = 0;
        class89.field2240 = 0;
        class53.field1304 = 0;
        class26.field651 = 0;
        class73.field1811 = 0;
        class137.field3051 = 0;
        class68.field1683 = 0;
        class60.field1460 = 0;
        class15.field297 = 0;
        class125.field2795 = 0;
        class96.field2434 = 0;
        class82.field2037 = 0;
        class24.field565 = 0;
        class54.field1331 = 0;
        class60.field1526 = 0;
        class24.field591 = 0;
        class127.field2892 = 0;
        class60.field1523 = 0;
        class158.field3488 = 0;
        class51.field1267 = 0;
        class89.field2246 = 0;
        class60.field1515 = 0;
        class137.field3065 = 0;
        class82.field2036 = 0;
        class83.field2054 = 0;
        class59.field1441 = 0;
        class18.field363 = 0;
        class7.field143 = 0;
        class49.field1223 = 0;
        class25.field635 = 0;
        class134.field2985 = 0;
        class143.field3156 = 0;
        class1.field7 = 0;
        class148.field3230 = 0;
        class98.field2446 = 0;
        class85.field2132 = 0;
        class107.field2564 = 0;
        class22.field521 = 0;
        class2.field43 = 0;
        class82.field2029 = 0;
        class49.field1241 = 0;
        class26.field687 = 0;
        class60.field1465 = 0;
        class73.field1807 = 0;
        class24.field571 = 0;
        field1351 = 0;
        class40.field1026 = 0;
        class60.field1521 = 0;
        class151.field3289 = 0;
        class107.field2571 = 0;
        class73.field1815 = 0;
        class83.field2060 = 0;
        class29.field763 = 0;
        class21.field470 = 0;
        class159.field3568 = 0;
        class143.field3142 = 0;
        class143.field3144 = 0;
        class154.field3348 = 0;
        class62.field1566 = 0;
        class107.field2593 = 0;
        class73.field1830 = 0;
        client.field480 = 0;
        class142.field3125 = 0;
        class154.field3342 = 0;
        class36.field948 = 0;
        class82.field2031 = 0;
        class29.field756 = 0;
        class19.field395 = 0;
        class63.field1605 = 0;
        class157.field3428 = 0;
        class157.field3456 = 0;
        class80.field1989 = 0;
        class53.field1310 = 0;
        class32.field874 = 0;
        class7.field146 = 0;
        class112.field2691 = 0;
        class143.field3154 = 0;
        class157.field3440 = 0;
        class18.field344 = 0;
        class38.field983 = 0;
        class139.field3098 = 0;
        class73.field1814 = 0;
        class19.field378 = 0;
        class61.field1537 = 0;
        class136.field3033 = 0;
        class121.field2786 = 0;
        class19.field383 = 0;
        class54.field1335 = 0;
        class159.field3530 = 0;
        class42.field1084 = 0;
        class43.field1110 = 0;
        class143.field3143 = 0;
        class7.field132 = 0;
        class95.field2415 = 0;
        class26.field688 = 0;
        class3.field75 = 0;
        class108.field2621 = 0;
        class116.field2729 = 0;
        class154.field3336 = 0;
        class1.field6 = 0;
        class157.field3418 = 0;
        class86.field2175 = 0;
        class32.field861 = 0;
        class82.field2051 = 0;
        class64.field1636 = 0;
        class89.field2238 = 0;
        class23.field538 = 0;
        class73.field1823 = 0;
        class84.field2100 = 0;
        class31.field815 = 0;
        class106.field2536 = 0;
        class115.field2710 = 0;
        class54.field1333 = 0;
        class143.field3130 = 0;
        class82.field2032 = 0;
        class59.field1423 = 0;
        class5.field101 = 0;
        class159.field3550 = 0;
        class107.field2568 = 0;
        class7.field141 = 0;
        class33.field884 = 0;
        class95.field2412 = 0;
        class81.field2024 = 0;
        class52.field1294 = 0;
        class26.field662 = 0;
        class18.field368 = 0;
        class157.field3445 = 0;
        class114.field2697 = 0;
        class107.field2586 = 0;
        class154.field3351 = 0;
        class143.field3137 = 0;
        class158.field3510 = 0;
        class125.field2841 = 0;
        class116.field2728 = 0;
        class137.field3050 = 0;
        class148.field3224 = 0;
        class73.field1824 = 0;
        class75.field1849 = 0;
        class25.field612 = 0;
        class143.field3152 = 0;
        class44.field1142 = 0;
        class60.field1481 = 0;
        class22.field515 = 0;
        class29.field759 = 0;
        class99.field2449 = 0;
        class134.field2974 = 0;
        class157.field3422 = 0;
        class148.field3226 = 0;
        class87.field2199 = 0;
        class35.field932 = 0;
        class40.field1032 = 0;
        class43.field1104 = 0;
        class99.field2456 = 0;
        class142.field3116 = 0;
        class83.field2068 = 0;
        class157.field3431 = 0;
        class86.field2152 = 0;
        class91.field2325 = 0;
        class86.field2172 = 0;
        class38.field987 = 0;
        class59.field1403 = 0;
        class90.field2270 = 0;
        class60.field1504 = 0;
        class57.field1389 = 0;
        if (arg0 < 56) {
            field1346 = -99;
        }
        class84.field2076 = 0;
        field1358 = 0;
        class87.field2190 = 0;
        class115.field2713 = 0;
        class121.field2787 = 0;
        class60.field1524 = 0;
        class107.field2577 = 0;
        class107.field2556 = 0;
        class3.field64 = 0;
        class157.field3438 = 0;
        class79.field1969 = 0;
        class88.field2221 = 0;
        class89.field2241 = 0;
        class26.field676 = 0;
        class36.field959 = 0;
        class86.field2178 = 0;
        class87.field2195 = 0;
        class38.field979 = 0;
        class157.field3481 = 0;
        class32.field859 = 0;
        class79.field1946 = 0;
        class65.field1653 = 0;
        class34.field902 = 0;
        class59.field1432 = 0;
        class42.field1083 = 0;
        class60.field1513 = 0;
        class157.field3458 = 0;
        class25.field617 = 0;
        class134.field2965 = 0;
        class24.field590 = 0;
        class54.field1329 = 0;
        class157.field3434 = 0;
        client.field496 = 0;
        class26.field693 = 0;
        field1347 = 0;
        class106.field2539 = 0;
        class137.field3062 = 0;
        class131.field2945 = 0;
        class88.field2218 = 0;
        class114.field2700 = 0;
        class15.field299 = 0;
        class51.field1260 = 0;
        class25.field629 = 0;
        class79.field1924 = 0;
        class40.field1035 = 0;
        class139.field3100 = 0;
        class157.field3455 = 0;
        class36.field943 = 0;
        class38.field975 = 0;
        class107.field2573 = 0;
        class139.field3101 = 0;
        class91.field2312 = 0;
        class157.field3443 = 0;
        class46.field1165 = 0;
        class147.field3187 = 0;
        class21.field451 = 0;
        class59.field1456 = 0;
        class49.field1252 = 0;
        class43.field1112 = 0;
        class148.field3232 = 0;
        class60.field1486 = 0;
        class17.field327 = 0;
        class30.field786 = 0;
        class157.field3477 = 0;
        class107.field2562 = 0;
        class60.field1518 = 0;
        class157.field3454 = 0;
        class60.field1468 = 0;
        class25.field630 = 0;
        class25.field631 = 0;
        class41.field1052 = 0;
        class157.field3466 = 0;
        class60.field1485 = 0;
        class106.field2548 = 0;
        class19.field431 = 0;
        class154.field3346 = 0;
        class106.field2525 = 0;
        class83.field2058 = 0;
        class107.field2567 = 0;
        class118.field2750 = 0;
        class89.field2235 = 0;
        class38.field984 = 0;
        class127.field2873 = 0;
        class157.field3469 = 0;
        class87.field2200 = 0;
        class60.field1514 = 0;
        class63.field1610 = 0;
        class84.field2087 = 0;
        class42.field1077 = 0;
        class43.field1102 = 0;
        class15.field294 = 0;
        class157.field3462 = 0;
        class32.field853 = 0;
        class118.field2748 = 0;
        class60.field1505 = 0;
        class157.field3472 = 0;
        class159.field3600 = 0;
        class36.field936 = 0;
        class89.field2245 = 0;
        class85.field2128 = 0;
        class159.field3525 = 0;
        class2.field44 = 0;
        class31.field788 = 0;
        class31.field817 = 0;
        class82.field2041 = 0;
        client.field504 = 0;
        class128.field2903 = 0;
        class3.field53 = 0;
        class41.field1051 = 0;
        class5.field108 = 0;
        class79.field1955 = 0;
        class61.field1560 = 0;
        class30.field777 = 0;
        class125.field2832 = 0;
        class54.field1336 = 0;
        class73.field1828 = 0;
        class157.field3417 = 0;
        class134.field2981 = 0;
        class38.field978 = 0;
        client.field493 = 0;
        class157.field3432 = 0;
        class75.field1841 = 0;
        class107.field2580 = 0;
        class60.field1502 = 0;
        class60.field1479 = 0;
        class26.field685 = 0;
        class36.field949 = 0;
        class24.field572 = 0;
        class134.field2988 = 0;
        class26.field670 = 0;
        class158.field3511 = 0;
        class157.field3448 = 0;
        class73.field1820 = 0;
        class21.field458 = 0;
        class125.field2821 = 0;
        class51.field1263 = 0;
        class73.field1810 = 0;
        class34.field901 = 0;
        class112.field2689 = 0;
        class157.field3425 = 0;
        class61.field1540 = 0;
        class147.field3202 = 0;
        class159.field3601 = 0;
        class61.field1554 = 0;
        class59.field1405 = 0;
        class143.field3138 = 0;
        class26.field686 = 0;
        class99.field2452 = 0;
        class6.field127 = 0;
        class46.field1190 = 0;
        class107.field2560 = 0;
        class76.field1864 = 0;
        class70.field1778 = 0;
        class63.field1615 = 0;
        class134.field2969 = 0;
        class149.field3260 = 0;
        class79.field1922 = 0;
        class70.field1771 = 0;
        class159.field3535 = 0;
        class70.field1782 = 0;
        class33.field885 = 0;
        class91.field2309 = 0;
        class68.field1732 = 0;
        class54.field1339 = 0;
        class77.field1883 = 0;
        class90.field2278 = 0;
        class31.field823 = 0;
        class7.field136 = 0;
        class59.field1453 = 0;
        class81.field2008 = 0;
        class148.field3212 = 0;
        class47.field1199 = 0;
        class143.field3135 = 0;
        class26.field675 = 0;
        class125.field2812 = 0;
        class159.field3561 = 0;
        class94.field2395 = 0;
        class108.field2608 = 0;
        class60.field1507 = 0;
        class83.field2073 = 0;
        class44.field1138 = 0;
        class107.field2589 = 0;
        class8.field160 = 0;
        class91.field2316 = 0;
        class59.field1433 = 0;
        class125.field2805 = 0;
        class106.field2527 = 0;
        class145.field3171 = 0;
        class61.field1536 = 0;
        class82.field2044 = 0;
        class63.field1602 = 0;
        class106.field2543 = 0;
        class41.field1045 = 0;
        class86.field2176 = 0;
        class7.field148 = 0;
        class86.field2159 = 0;
        class137.field3041 = 0;
        class29.field755 = 0;
        class152.field3295 = 0;
        class136.field3020 = 0;
        class143.field3148 = 0;
        class118.field2754 = 0;
        class41.field1054 = 0;
        class159.field3574 = 0;
        class24.field569 = 0;
        class26.field683 = 0;
        class36.field939 = 0;
        class91.field2313 = 0;
        class157.field3461 = 0;
        class108.field2618 = 0;
        class83.field2065 = 0;
        class107.field2595 = 0;
        class83.field2066 = 0;
        client.field494 = 0;
        class157.field3439 = 0;
        class114.field2696 = 0;
        class59.field1436 = 0;
        class26.field689 = 0;
        class23.field560 = 0;
        class100.field2470 = 0;
        class33.field878 = 0;
        class107.field2572 = 0;
        class36.field960 = 0;
        class61.field1534 = 0;
        class42.field1066 = 0;
        class5.field104 = 0;
        class59.field1444 = 0;
        class89.field2237 = 0;
        class157.field3424 = 0;
        class48.field1212 = 0;
        class159.field3604 = 0;
        class77.field1885 = 0;
        class159.field3589 = 0;
        class94.field2396 = 0;
        class56.field1374 = 0;
        class157.field3463 = 0;
        class59.field1408 = 0;
        class106.field2546 = 0;
        class85.field2136 = 0;
        class60.field1488 = 0;
        class63.field1608 = 0;
        class158.field3504 = 0;
        class107.field2565 = 0;
        class79.field1965 = 0;
        class108.field2609 = 0;
        class139.field3099 = 0;
        class19.field419 = 0;
        class77.field1881 = 0;
        class87.field2188 = 0;
        class42.field1086 = 0;
        class154.field3353 = 0;
        class148.field3249 = 0;
        class59.field1443 = 0;
        class62.field1593 = 0;
        client.field483 = 0;
        class4.field96 = 0;
        class47.field1205 = 0;
        class155.field3362 = 0;
        class8.field157 = 0;
        class4.field76 = 0;
        class148.field3241 = 0;
        class157.field3471 = 0;
        class61.field1542 = 0;
        class59.field1420 = 0;
        class157.field3426 = 0;
        class5.field99 = 0;
        class79.field1942 = 0;
        class157.field3413 = 0;
        class125.field2825 = 0;
        class68.field1701 = 0;
        class63.field1597 = 0;
        class136.field3034 = 0;
        class157.field3475 = 0;
        class23.field540 = 0;
        class68.field1722 = 0;
        class59.field1435 = 0;
        class147.field3198 = 0;
        class24.field593 = 0;
        class63.field1606 = 0;
        class43.field1099 = 0;
        class40.field1019 = 0;
        class84.field2109 = 0;
        class43.field1096 = 0;
        class44.field1121 = 0;
        class60.field1493 = 0;
        class152.field3297 = 0;
        class107.field2552 = 0;
        class24.field585 = 0;
        class26.field691 = 0;
        class53.field1308 = 0;
        class134.field2966 = 0;
        class106.field2537 = 0;
        class81.field2013 = 0;
        class107.field2591 = 0;
        class59.field1439 = 0;
        class157.field3479 = 0;
        class125.field2829 = 0;
        class49.field1254 = 0;
        class19.field390 = 0;
        class44.field1134 = 0;
        class116.field2726 = 0;
        class1.field16 = 0;
        class108.field2612 = 0;
        class148.field3240 = 0;
        class77.field1889 = 0;
        class52.field1289 = 0;
        class157.field3444 = 0;
        class17.field334 = 0;
        class80.field1993 = 0;
        class115.field2717 = 0;
        class26.field661 = 0;
        class40.field1016 = 0;
        class6.field126 = 0;
        class127.field2891 = 0;
        class62.field1595 = 0;
        class26.field655 = 0;
        class61.field1550 = 0;
        class107.field2576 = 0;
        class65.field1647 = 0;
        class121.field2788 = 0;
        class112.field2688 = 0;
        class84.field2089 = 0;
        class21.field467 = 0;
        class59.field1416 = 0;
        class79.field1933 = 0;
        class81.field2022 = 0;
        class46.field1160 = 0;
        class1.field18 = 0;
        class127.field2880 = 0;
        class151.field3285 = 0;
        class157.field3464 = 0;
        class159.field3631 = 0;
        class154.field3347 = 0;
        class7.field152 = 0;
        class157.field3460 = 0;
        class63.field1600 = 0;
        class91.field2303 = 0;
        class59.field1426 = 0;
        class21.field474 = 0;
        class38.field977 = 0;
        class61.field1555 = 0;
        client.field503 = 0;
        class27.field700 = 0;
        class103.field2506 = 0;
        class31.field829 = 0;
        class31.field813 = 0;
        class40.field1015 = 0;
        class33.field876 = 0;
        class40.field1028 = 0;
        class86.field2163 = 0;
        class126.field2854 = 0;
        class23.field552 = 0;
        class21.field455 = 0;
        class62.field1571 = 0;
        class63.field1604 = 0;
        class159.field3553 = 0;
        class75.field1845 = 0;
        class87.field2193 = 0;
        class54.field1330 = 0;
        class76.field1876 = 0;
        class86.field2144 = 0;
        class83.field2064 = 0;
        class82.field2033 = 0;
        class79.field1932 = 0;
        class59.field1417 = 0;
        class36.field940 = 0;
        class19.field410 = 0;
        class40.field1023 = 0;
        class147.field3185 = 0;
        class23.field542 = 0;
        class59.field1428 = 0;
        class17.field342 = 0;
        class43.field1106 = 0;
        class51.field1264 = 0;
        class60.field1487 = 0;
        class87.field2196 = 0;
        class46.field1164 = 0;
        client.field502 = 0;
        class60.field1475 = 0;
        class77.field1884 = 0;
        class157.field3476 = 0;
        class128.field2900 = 0;
        class145.field3167 = 0;
        class73.field1803 = 0;
        class136.field3035 = 0;
        class62.field1591 = 0;
        class59.field1406 = 0;
        class115.field2718 = 0;
        class157.field3474 = 0;
        class147.field3194 = 0;
        class157.field3430 = 0;
        class47.field1200 = 0;
        class73.field1818 = 0;
        class59.field1434 = 0;
        class108.field2600 = 0;
        class52.field1291 = 0;
        class1.field14 = 0;
        class108.field2620 = 0;
        class59.field1442 = 0;
        class60.field1491 = 0;
        class107.field2558 = 0;
        class61.field1541 = 0;
        class157.field3423 = 0;
        class98.field2444 = 0;
        class26.field667 = 0;
        class26.field673 = 0;
        class2.field36 = 0;
        class91.field2321 = 0;
        class25.field609 = 0;
        class136.field3029 = 0;
        class59.field1422 = 0;
        class77.field1878 = 0;
        class26.field647 = 0;
        class88.field2214 = 0;
        class6.field122 = 0;
        class107.field2575 = 0;
        class114.field2698 = 0;
        class5.field102 = 0;
        class26.field681 = 0;
        class23.field558 = 0;
        class62.field1580 = 0;
        class48.field1214 = 0;
        class59.field1437 = 0;
        class60.field1461 = 0;
        class126.field2860 = 0;
        class130.field2918 = 0;
        class130.field2930 = 0;
        class95.field2421 = 0;
        class157.field3427 = 0;
        class63.field1612 = 0;
        class56.field1379 = 0;
        class87.field2191 = 0;
        class19.field399 = 0;
        class157.field3449 = 0;
        class80.field1982 = 0;
        class24.field586 = 0;
        class125.field2808 = 0;
        class57.field1387 = 0;
        class2.field32 = 0;
        class49.field1224 = 0;
        class136.field3036 = 0;
        class60.field1522 = 0;
        class53.field1303 = 0;
        class59.field1424 = 0;
        class31.field848 = 0;
        class152.field3302 = 0;
        class44.field1140 = 0;
        class46.field1159 = 0;
        class44.field1126 = 0;
        class125.field2850 = 0;
        class40.field1027 = 0;
        class60.field1503 = 0;
        class79.field1960 = 0;
        client.field497 = 0;
        class157.field3450 = 0;
        class107.field2566 = 0;
        class62.field1584 = 0;
        class60.field1464 = 0;
        class40.field1038 = 0;
        class107.field2587 = 0;
        class145.field3162 = 0;
        class61.field1539 = 0;
        class60.field1476 = 0;
        class91.field2320 = 0;
        class142.field3122 = 0;
        class27.field701 = 0;
        class63.field1598 = 0;
        class40.field1029 = 0;
        class59.field1431 = 0;
        class8.field161 = 0;
        class10.field212 = 0;
        class24.field592 = 0;
        class85.field2134 = 0;
        class25.field641 = 0;
        class107.field2583 = 0;
        class33.field879 = 0;
        class155.field3359 = 0;
        class73.field1812 = 0;
        class16.field312 = 0;
        class6.field129 = 0;
        class76.field1867 = 0;
        class59.field1440 = 0;
        class106.field2545 = 0;
        class152.field3299 = 0;
        class46.field1183 = 0;
        class31.field797 = 0;
        class107.field2578 = 0;
        class157.field3420 = 0;
        class143.field3151 = 0;
        class16.field311 = 0;
        class62.field1586 = 0;
        class154.field3331 = 0;
        class6.field130 = 0;
        class114.field2694 = 0;
        class24.field582 = 0;
        class36.field942 = 0;
        class89.field2228 = 0;
        class10.field223 = 0;
        class43.field1095 = 0;
        class47.field1194 = 0;
        class24.field573 = 0;
        client.field487 = 0;
        class80.field1991 = 0;
        class125.field2818 = 0;
        class89.field2248 = 0;
        client.field489 = 0;
        class21.field452 = 0;
        class21.field464 = 0;
        class138.field3080 = 0;
        class62.field1579 = 0;
        class143.field3136 = 0;
        class31.field831 = 0;
        class148.field3251 = 0;
        class136.field3032 = 0;
        class106.field2550 = 0;
        class26.field663 = 0;
        class60.field1499 = 0;
        class23.field539 = 0;
        class82.field2034 = 0;
        class73.field1827 = 0;
        class154.field3339 = 0;
        class107.field2584 = 0;
        class159.field3668.field1399 = 0;
        field1345 = true;
        client.field505 = 0;
        class82.method668(false);
        class107.field2557 = 0;
        class33.field895 = 0;
        class53.field1312 = -1;
        class32.field873 = -1;
        class30.field769 = -1;
        class153.field3314 = 0;
        class120.field2759 = 0;
        class1.field28 = 0;
        class82.field2040 = -1;
        class125.field2842.field3457 = 0;
        class98.field2440 = false;
        class10.field213.field3457 = 0;
        class47.method371(0, false);
        for (int var1 = 0; var1 < 100; var1++) {
            class85.field2131[var1] = null;
        }
        class49.field1226 = (int) (Math.random() * 30.0D) - 20;
        class79.field1941 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class19.field403 = 0;
        class36.field955 = (int) (Math.random() * 110.0D) - 55;
        class43.field1092 = 0;
        class130.field2927 = (int) (Math.random() * 120.0D) - 60;
        class96.field2426 = 0;
        class16.field319 = (int) (Math.random() * 100.0D) - 50;
        class53.field1315 = 0;
        class59.field1455 = 0;
        class154.field3350 = (int) (Math.random() * 80.0D) - 40;
        class94.field2406 = -1;
        class68.field1703 = 0;
        class103.field2510 = 0;
        class34.field907 = false;
        class88.field2213 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class91.field2323[var2] = null;
            class46.field1176[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class47.field1210[var3] = null;
        }
        class159.field3650 = class91.field2323[2047] = new class49();
        class89.field2242.method680(100);
        class44.field1131.method680(122);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class23.field563[var4][var11][var12] = null;
                }
            }
        }
        class22.field525 = new class83();
        class65.field1649 = 0;
        class77.field1887 = 0;
        for (int var5 = 0; var5 < class33.field897; var5++) {
            class88 var10 = class63.method524(var5, -31647);
            if (var10 != null && var10.field2226 == 0) {
                class65.field1651[var5] = 0;
                class85.field2124[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class154.field3330.length; var6++) {
            class154.field3330[var6] = -1;
        }
        if (class126.field2866 != -1) {
            class23.method141(class126.field2866, (byte) 99);
        }
        for (class41 var7 = (class41) class33.field889.method37(-1); var7 != null; var7 = (class41) class33.field889.method36(-1)) {
            class47.method369(true, var7, 0);
        }
        class126.field2866 = -1;
        class33.field889 = new class7(8);
        class107.field2557 = 0;
        class151.field3287 = null;
        class98.field2440 = false;
        class159.field3618.method732(null, new int[5], 0, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            class22.field529[var8] = null;
            class42.field1088[var8] = false;
        }
        class4.method21((byte) 119);
        class102.field2485 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class25.field628[var9] = true;
        }
        class26.field677 = null;
        class36.field953 = null;
        class43.field1097 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lje;Ljava/net/URL;)V")
    public class55(class67 arg0, URL arg1) {
        this.field1362 = arg0.method539(arg1, (byte) 127);
        this.field1353 = 0;
        this.field1356 = class29.method235(-329) + 30000L;
    }
}
