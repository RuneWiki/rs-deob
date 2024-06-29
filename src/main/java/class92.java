import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[B")
    public byte[] field1487 = new byte[4096];

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[Z")
    public boolean[] field1491 = new boolean[256];

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[[I")
    public int[][] field1489 = new int[6][258];

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
    public byte[] field1493 = new byte[256];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[[I")
    public int[][] field1486 = new int[6][258];

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field1497 = 0;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[[I")
    public int[][] field1494 = new int[6][258];

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field1495 = 0;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
    public int[] field1514 = new int[256];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
    public int[] field1501 = new int[257];

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[B")
    public byte[] field1510 = new byte[18002];

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "[Z")
    public boolean[] field1503 = new boolean[16];

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
    public int[] field1502 = new int[16];

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[B")
    public byte[] field1519 = new byte[18002];

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "[I")
    public int[] field1518 = new int[6];

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "[[B")
    public byte[][] field1526 = new byte[6][258];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
    public static byte[][][] field1492 = new byte[4][104][104];

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[[B")
    public static byte[][] field1505 = new byte[250][];

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1499 = 255;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lna;")
    public static class26 field1498 = class69.method505("runes", (byte) -119);

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lna;")
    public static class26 field1512 = class69.method505("::", (byte) -124);

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lna;")
    public static class26 field1525 = class69.method505("gelb:", (byte) -123);

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "B")
    public byte field1490;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[B")
    public byte[] field1496;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[B")
    public byte[] field1507;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 18)
    public static final void method707(int arg0) {
        field1488++;
        if (class229.field3640 < class324.field5568) {
            class229.field3640 = (float) ((double) class229.field3640 / 30.0D + (double) class229.field3640);
            if (class324.field5568 < class229.field3640) {
                class229.field3640 = class324.field5568;
            }
            class265.method1868((byte) 87);
        } else if (class324.field5568 < class229.field3640) {
            class229.field3640 = (float) ((double) class229.field3640 - (double) class229.field3640 / 30.0D);
            if (class324.field5568 > class229.field3640) {
                class229.field3640 = class324.field5568;
            }
            class265.method1868((byte) 87);
        }
        if (class165.field2566 != -1 && class18.field253 != -1) {
            int var1 = class165.field2566 - class118.field1860;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class18.field253 - class69.field1069;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class69.field1069 -= -var2;
            class118.field1860 += var1;
            if (var1 == 0 && var2 == 0) {
                class165.field2566 = -1;
                class18.field253 = -1;
            }
            class265.method1868((byte) 87);
        }
        if (arg0 != 4) {
            field1512 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 73)
    public static void method708(int arg0) {
        field1525 = null;
        if (arg0 == 2) {
            field1505 = (byte[][]) null;
            field1498 = null;
            field1512 = null;
            field1492 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 125)
    public static final void method709(byte arg0) {
        class31.field520 = class250.field4087;
        class63.field1002 = class107.field1690;
        class121.field1889 = class187.field2939;
        class177.field2787 = class216.field3391;
        class322.field5540 = class192.field3004;
        class218.field3477 = class98.field1599;
        class218.field3480 = class138.field2119;
        class307.field5289 = class327.field5664;
        class198.field3078 = class59.field958;
        class71.field1100 = class158.field2471;
        class201.field3134 = class45.field716;
        class264.field4321 = class14.field226;
        class252.field4146 = class203.field3154;
        class230.field3655 = class72.field1121;
        class236.field3759 = class57.field932;
        class24.field346 = class159.field2478;
        class210.field3259 = class251.field4104;
        class109.field1744 = class324.field5582;
        class107.field1680 = class56.field911;
        if (arg0 != 121) {
            method707(-68);
        }
        class277.field4640 = class64.field1022;
        class244.field4015 = class207.field3220;
        class284.field4744 = class291.field4849;
        class264.field4318 = class22.field309;
        class38.field629 = class132.field2006;
        class96.field1573 = class254.field4153;
        class55.field871 = class218.field3476;
        class27.field450 = class292.field4869;
        class198.field3070 = class59.field958;
        class304.field5238 = class72.field1102;
        client.field4112 = class317.field5434;
        class277.field4637 = class97.field1583;
        class324.field5577 = class215.field3356;
        class79.field1250 = class136.field2092;
        class313.field5345 = class265.field4346;
        class292.field4864 = class57.field931;
        class205.field3208 = class132.field2004;
        class265.field4339 = class250.field4083;
        class137.field2104 = class45.field703;
        class307.field5285 = class27.field445;
        field1504++;
        class300.field5178 = class112.field1760;
        class76.field1161 = class232.field3668;
        class12.field178 = class20.field288;
        class26.field402 = class155.field2421;
        class109.field1735 = class47.field757;
        class61.field989 = class46.field722;
        class95.field1554 = class69.field1070;
        class215.field3347 = class250.field4096;
        class281.field4692 = class137.field2100;
        class103.field1656 = class40.field660;
        class190.field2974 = class233.field3702;
        class4.field46 = class147.field2305;
        class166.field2576 = class117.field1834;
        class207.field3221 = class82.field1289;
        class315.field5398 = class40.field659;
        class47.field767 = class193.field3008;
        class236.field3743 = class300.field5177;
        class142.field2180 = class250.field4088;
        class202.field3139 = class64.field1021;
        class63.field1000 = class264.field4336;
        class325.field5622 = class83.field1362;
        class9.field108 = class233.field3695;
        class196.field3046 = class78.field1202;
        class284.field4745 = class280.field4660;
        class327.field5667 = class316.field5405;
        class259.field4231 = class117.field1843;
        class203.field3181 = class322.field5538;
        class212.field3293 = class192.field3000;
        class45.field708 = class205.field3212;
        class154.field2406 = class71.field1099;
        class193.field3011 = class235.field3725;
        class57.field927 = class191.field2991;
        class132.field2005 = class36.field588;
        class322.field5543 = class64.field1010;
        class132.field2008 = class36.field588;
        class12.field167 = class64.field1008;
        class157.field2448 = class230.field3644;
        class254.field4155 = class187.field2956;
        class82.field1312 = class212.field3286;
        class39.field640 = class127.field1970;
        class155.field2419 = class280.field4663;
        class45.field715 = class205.field3212;
        class217.field3469 = class198.field3072;
        class320.field5505 = class97.field1582;
        class115.field1810 = class78.field1221;
        class25.field365 = class76.field1154;
        class121.field1886 = class325.field5633;
        class21.field293 = class78.field1203;
        class110.field1755 = class223.field3530;
        class322.field5541 = class82.field1327;
        class269.field4438 = class215.field3360;
    }
}
