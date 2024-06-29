import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class89 extends class320 {

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1358 = 0;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "[I")
    public int[] field1388 = new int[10];

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public int field1377 = 0;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public int field1366 = -1;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public int field1389 = 0;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field1360 = 0;

    @OriginalMember(owner = "client!wl", name = "mb", descriptor = "I")
    public int field1410 = 0;

    @OriginalMember(owner = "client!wl", name = "tb", descriptor = "I")
    public int field1417 = -1;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public int field1394 = 0;

    @OriginalMember(owner = "client!wl", name = "fb", descriptor = "[I")
    public int[] field1403 = new int[4];

    @OriginalMember(owner = "client!wl", name = "wb", descriptor = "I")
    public int field1420 = 0;

    @OriginalMember(owner = "client!wl", name = "qb", descriptor = "I")
    public int field1414 = 0;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public int field1398 = 0;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public int field1367 = 0;

    @OriginalMember(owner = "client!wl", name = "sb", descriptor = "I")
    private int field1416 = 1;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "[Lrj;")
    public class18[] field1385 = new class18[12];

    @OriginalMember(owner = "client!wl", name = "Jb", descriptor = "I")
    private int field1433 = 0;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
    public int field1397 = 0;

    @OriginalMember(owner = "client!wl", name = "Db", descriptor = "I")
    private int field1427 = 0;

    @OriginalMember(owner = "client!wl", name = "yb", descriptor = "I")
    public int field1422 = -1;

    @OriginalMember(owner = "client!wl", name = "ib", descriptor = "I")
    public int field1406 = 0;

    @OriginalMember(owner = "client!wl", name = "lb", descriptor = "Z")
    private boolean field1409 = false;

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "I")
    public int field1401 = 0;

    @OriginalMember(owner = "client!wl", name = "vb", descriptor = "[I")
    public int[] field1419 = new int[4];

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "[I")
    public int[] field1390 = new int[4];

    @OriginalMember(owner = "client!wl", name = "Hb", descriptor = "[B")
    public byte[] field1431 = new byte[10];

    @OriginalMember(owner = "client!wl", name = "hb", descriptor = "I")
    public int field1405 = -1;

    @OriginalMember(owner = "client!wl", name = "Kb", descriptor = "I")
    public int field1434 = 0;

    @OriginalMember(owner = "client!wl", name = "jb", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public int field1384 = 32;

    @OriginalMember(owner = "client!wl", name = "Pb", descriptor = "Z")
    public boolean field1439 = false;

    @OriginalMember(owner = "client!wl", name = "Lb", descriptor = "I")
    public int field1435 = 0;

    @OriginalMember(owner = "client!wl", name = "Nb", descriptor = "Z")
    public boolean field1437 = false;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field1365 = 0;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public int field1373 = 0;

    @OriginalMember(owner = "client!wl", name = "Zb", descriptor = "I")
    public int field1449 = 0;

    @OriginalMember(owner = "client!wl", name = "ac", descriptor = "Z")
    public boolean field1450 = false;

    @OriginalMember(owner = "client!wl", name = "bc", descriptor = "Ljava/lang/String;")
    public String field1451 = null;

    @OriginalMember(owner = "client!wl", name = "Qb", descriptor = "I")
    public int field1440 = 0;

    @OriginalMember(owner = "client!wl", name = "Gb", descriptor = "I")
    public int field1430 = -1;

    @OriginalMember(owner = "client!wl", name = "Vb", descriptor = "I")
    public int field1445 = 0;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "[I")
    public int[] field1386 = new int[10];

    @OriginalMember(owner = "client!wl", name = "jc", descriptor = "I")
    public int field1459 = 0;

    @OriginalMember(owner = "client!wl", name = "Rb", descriptor = "Z")
    public boolean field1441 = true;

    @OriginalMember(owner = "client!wl", name = "gc", descriptor = "I")
    public int field1456 = 0;

    @OriginalMember(owner = "client!wl", name = "zb", descriptor = "I")
    public int field1423 = 100;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public int field1392 = -32768;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field1362 = 0;

    @OriginalMember(owner = "client!wl", name = "hc", descriptor = "I")
    public int field1457 = -1000;

    @OriginalMember(owner = "client!wl", name = "ic", descriptor = "I")
    public int field1458 = -1;

    @OriginalMember(owner = "client!wl", name = "Ub", descriptor = "I")
    private int field1444 = 0;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "Z")
    private boolean field1379 = false;

    @OriginalMember(owner = "client!wl", name = "dc", descriptor = "I")
    public int field1453 = -1;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field1370 = -1;

    @OriginalMember(owner = "client!wl", name = "kc", descriptor = "I")
    public int field1460 = 0;

    @OriginalMember(owner = "client!wl", name = "Ob", descriptor = "I")
    public int field1438 = 0;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    private int field1380 = 0;

    @OriginalMember(owner = "client!wl", name = "mc", descriptor = "I")
    public int field1462 = 0;

    @OriginalMember(owner = "client!wl", name = "Fb", descriptor = "I")
    private int field1429 = 0;

    @OriginalMember(owner = "client!wl", name = "nc", descriptor = "I")
    private int field1463 = 0;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1364 = -1;

    @OriginalMember(owner = "client!wl", name = "xb", descriptor = "Ljava/lang/String;")
    public static String field1421 = "Please wait...";

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!wl", name = "gb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!wl", name = "kb", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!wl", name = "nb", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!wl", name = "ob", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!wl", name = "pb", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!wl", name = "rb", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!wl", name = "Ab", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!wl", name = "Bb", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!wl", name = "Cb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!wl", name = "Eb", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!wl", name = "Ib", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!wl", name = "Mb", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!wl", name = "Sb", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!wl", name = "Tb", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!wl", name = "Wb", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!wl", name = "Yb", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!wl", name = "cc", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!wl", name = "fc", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!wl", name = "lc", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!wl", name = "ec", descriptor = "Lmf;")
    public class47 field1454;

    @OriginalMember(owner = "client!wl", name = "ub", descriptor = "Lgk;")
    public static class7 field1418;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "Ljava/lang/Object;")
    public Object field1381;

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "Ljava/lang/Thread;")
    public static Thread field1400;

    @OriginalMember(owner = "client!wl", name = "Xb", descriptor = "[I")
    public static int[] field1447;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 4)
    public static final void method630(int arg0) {
        field1402++;
        if (class277.field4293 == 0 || class277.field4293 == 5) {
            return;
        }
        try {
            if ((++class4.field30) > 2000) {
                if (class127.field2032 != null) {
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                }
                if (class320.field5002 >= 1) {
                    class307.field4839 = -5;
                    class277.field4293 = 0;
                    return;
                }
                if (class42.field754 == class215.field3418) {
                    class42.field754 = class309.field4866;
                } else {
                    class42.field754 = class215.field3418;
                }
                class277.field4293 = 1;
                class4.field30 = 0;
                class320.field5002++;
            }
            if (class277.field4293 == 1) {
                class178.field2785 = class83.field1235.method2224(class42.field754, class92.field1521, -85);
                class277.field4293 = 2;
            }
            if (class277.field4293 == 2) {
                if (class178.field2785.field387 == 2) {
                    throw new IOException();
                }
                if (class178.field2785.field387 != 1) {
                    return;
                }
                class127.field2032 = new class16((Socket) class178.field2785.field391, class83.field1235);
                class178.field2785 = null;
                long var1 = class6.field75 = class36.method281(107, class68.field1095);
                class269.field4191.field1667 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class269.field4191.method772((byte) -67, 14);
                class269.field4191.method772((byte) -115, var3);
                class127.field2032.method136(2, class269.field4191.field1661, (byte) -4, 0);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                int var4 = class127.field2032.method138(-5380);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                if (var4 != 0) {
                    class307.field4839 = var4;
                    class277.field4293 = 0;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                }
                class277.field4293 = 3;
            }
            if (class277.field4293 == 3) {
                if (class127.field2032.method137((byte) 86) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class127.field2032.method139(class267.field4132.field1661, -3, 8, 0);
                class267.field4132.field1667 = 0;
                class57.field919 = class267.field4132.method723(21649);
                var5[2] = (int) (class57.field919 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class269.field4191.field1667 = 0;
                var5[3] = (int) class57.field919;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class269.field4191.method772((byte) -89, 10);
                class269.field4191.method784(-67, var5[0]);
                class269.field4191.method784(67, var5[1]);
                class269.field4191.method784(55, var5[2]);
                class269.field4191.method784(95, var5[3]);
                class269.field4191.method760(class36.method281(60, class68.field1095), true);
                class269.field4191.method754((byte) -85, class202.field3181);
                class269.field4191.method750(class127.field2019, class256.field3958, (byte) 120);
                class268.field4160.field1667 = 0;
                if (class22.field394 == 40) {
                    class268.field4160.method772((byte) -94, 18);
                } else {
                    class268.field4160.method772((byte) -71, 16);
                }
                class268.field4160.method728(class269.field4191.field1667 + (class307.method2123((byte) -122, class232.field3677) + 159), 1234856744);
                class268.field4160.method784(-120, 533);
                class268.field4160.method772((byte) -96, class168.field2602);
                class268.field4160.method772((byte) -68, class177.field2778 ? 1 : 0);
                class268.field4160.method772((byte) -76, 1);
                class268.field4160.method772((byte) -72, class242.method1719(0));
                class268.field4160.method728(class180.field2880, 1234856744);
                class268.field4160.method728(class73.field1127, 1234856744);
                class268.field4160.method772((byte) -124, class141.field2240);
                class232.method1677(class268.field4160, 48);
                class268.field4160.method754((byte) -64, class232.field3677);
                class268.field4160.method784(59, class132.field2118);
                class268.field4160.method784(97, class36.method292((byte) 106));
                class70.field1104 = true;
                class268.field4160.method728(class247.field3822, 1234856744);
                class268.field4160.method784(-78, class137.field2175.method493(-9424));
                class268.field4160.method784(75, class224.field3604.method493(-9424));
                class268.field4160.method784(-37, class78.field1200.method493(-9424));
                class268.field4160.method784(118, class115.field1881.method493(-9424));
                class268.field4160.method784(-60, class285.field4372.method493(-9424));
                class268.field4160.method784(-53, class224.field3602.method493(-9424));
                class268.field4160.method784(110, class111.field1842.method493(-9424));
                class268.field4160.method784(125, class55.field878.method493(-9424));
                class268.field4160.method784(-82, class210.field3356.method493(-9424));
                class268.field4160.method784(-65, class176.field2769.method493(-9424));
                class268.field4160.method784(65, class206.field3262.method493(-9424));
                class268.field4160.method784(-93, class207.field3272.method493(-9424));
                class268.field4160.method784(126, class178.field2787.method493(-9424));
                class268.field4160.method784(108, class292.field4534.method493(-9424));
                class268.field4160.method784(-116, class168.field2611.method493(-9424));
                class268.field4160.method784(60, class13.field252.method493(-9424));
                class268.field4160.method784(-40, class29.field467.method493(-9424));
                class268.field4160.method784(-92, class175.field2761.method493(-9424));
                class268.field4160.method784(77, class100.field1650.method493(-9424));
                class268.field4160.method784(-66, class51.field815.method493(-9424));
                class268.field4160.method784(62, class311.field4895.method493(-9424));
                class268.field4160.method784(-55, class177.field2777.method493(-9424));
                class268.field4160.method784(58, class141.field2242.method493(-9424));
                class268.field4160.method784(63, class219.field3510.method493(-9424));
                class268.field4160.method784(-128, class226.field3612.method493(-9424));
                class268.field4160.method784(-118, class308.field4854.method493(-9424));
                class268.field4160.method784(55, class46.field791.method493(-9424));
                class268.field4160.method784(85, class136.field2157.method493(-9424));
                class268.field4160.method743(class269.field4191.field1661, class269.field4191.field1667, 0, -128);
                class127.field2032.method136(class268.field4160.field1667, class268.field4160.field1661, (byte) -4, 0);
                class269.field4191.method242(0, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class267.field4132.method242(0, var5);
                class277.field4293 = 4;
            }
            if (arg0 > -114) {
                method644((byte) -28, (class101) null);
            }
            if (class277.field4293 == 4) {
                if (class127.field2032.method137((byte) 106) < 1) {
                    return;
                }
                int var7 = class127.field2032.method138(-5380);
                if (var7 == 21) {
                    class277.field4293 = 7;
                } else if (var7 == 29) {
                    class277.field4293 = 10;
                } else if (var7 == 1) {
                    class277.field4293 = 5;
                    class307.field4839 = var7;
                    return;
                } else if (var7 == 2) {
                    class277.field4293 = 8;
                } else if (var7 == 15) {
                    class307.field4839 = var7;
                    class277.field4293 = 0;
                    return;
                } else if (var7 == 23 && class320.field5002 < 1) {
                    class4.field30 = 0;
                    class320.field5002++;
                    class277.field4293 = 1;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                } else {
                    class307.field4839 = var7;
                    class277.field4293 = 0;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                }
            }
            if (class277.field4293 == 6) {
                class269.field4191.field1667 = 0;
                class269.field4191.method246(false, 17);
                class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                class277.field4293 = 4;
                return;
            }
            if (class277.field4293 == 7) {
                if (class127.field2032.method137((byte) 75) >= 1) {
                    class328.field5072 = (class127.field2032.method138(-5380) + 3) * 60;
                    class307.field4839 = 21;
                    class277.field4293 = 0;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                }
                return;
            }
            if (class277.field4293 == 10) {
                if (class127.field2032.method137((byte) 83) < 1) {
                    return;
                }
                class162.field2541 = class127.field2032.method138(-5380);
                class307.field4839 = 29;
                class277.field4293 = 0;
                class127.field2032.method131(-11918);
                class127.field2032 = null;
                return;
            }
            if (class277.field4293 == 8) {
                if (class127.field2032.method137((byte) 115) < 14) {
                    return;
                }
                class127.field2032.method139(class267.field4132.field1661, -3, 14, 0);
                class267.field4132.field1667 = 0;
                class235.field3699 = class267.field4132.method741(104);
                class243.field3765 = class267.field4132.method741(26);
                class17.field322 = class267.field4132.method741(112) == 1;
                class100.field1645 = class267.field4132.method741(28) == 1;
                class108.field1799 = class267.field4132.method741(45) == 1;
                class53.field833 = class267.field4132.method741(83) == 1;
                class198.field3130 = class267.field4132.method741(82) == 1;
                class60.field943 = class267.field4132.method731(false);
                class53.field828 = class267.field4132.method741(34) == 1;
                class295.field4672 = class267.field4132.method741(49) == 1;
                class205.method1499(class295.field4672, (byte) -49);
                class217.method1571((byte) 101, class295.field4672);
                if (!class177.field2778) {
                    if ((!class17.field322 || class108.field1799) && !class53.field828) {
                        try {
                            class49.method379(class83.field1235.field5052, (byte) 51, "unzap");
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class49.method379(class83.field1235.field5052, (byte) 51, "zap");
                        } catch (Throwable var11) {
                        }
                    }
                }
                class51.field813 = class267.field4132.method241(255);
                class45.field779 = class267.field4132.method731(false);
                class277.field4293 = 9;
            }
            if (class277.field4293 == 9) {
                if (class127.field2032.method137((byte) 63) < class45.field779) {
                    return;
                }
                class267.field4132.field1667 = 0;
                class127.field2032.method139(class267.field4132.field1661, -3, class45.field779, 0);
                class277.field4293 = 0;
                class307.field4839 = 2;
                class137.method1054(111);
                class111.field1847 = -1;
                class189.method1409(0, false);
                class51.field813 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class127.field2032 != null) {
                class127.field2032.method131(-11918);
                class127.field2032 = null;
            }
            if (class320.field5002 >= 1) {
                class307.field4839 = -4;
                class277.field4293 = 0;
            } else {
                class4.field30 = 0;
                class320.field5002++;
                class277.field4293 = 1;
                if (class42.field754 == class215.field3418) {
                    class42.field754 = class309.field4866;
                } else {
                    class42.field754 = class215.field3418;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILfa;)V", line = 384)
    public final void method631(int arg0, class199 arg1) {
        field1391++;
        class63 var3 = this.method640(-88);
        if (arg0 != -25822) {
            method632((class269) null, 5, (byte) 111, 19, false, -30);
        }
        if (var3.field972 == 0 && var3.field991 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (this.field1439 && this.field1362 != 0) {
            if (this.field1362 < 0) {
                var4 = -var3.field972;
            } else {
                var4 = var3.field972;
            }
            var5 = var3.field991;
        }
        if (this.field1407 != var4) {
            if (this.field1380 > 0 && this.field1433 < var4) {
                int var6 = this.field1380 * this.field1380 / (var3.field986 * 2);
                int var7 = var4 - this.field1433;
                if (var6 <= var7) {
                    this.field1379 = true;
                    int var8 = var3.field1005 * var3.field1005 / (var3.field986 * 2);
                    int var9 = var4 - var8;
                    this.field1444 = (this.field1433 + var4 - var6) / 2;
                    if (var9 > this.field1444) {
                        this.field1444 = var9;
                    }
                } else {
                    this.field1379 = false;
                }
            } else if (this.field1380 < 0 && var4 < this.field1433) {
                int var10 = this.field1380 * this.field1380 / (var3.field986 * 2);
                int var11 = var4 - this.field1433;
                if (var10 <= var11) {
                    this.field1379 = true;
                    int var12 = var3.field1005 * var3.field1005 / (var3.field986 * 2);
                    this.field1444 = (var4 + var10 + this.field1433) / 2;
                    int var13 = var4 + var12;
                    if (this.field1444 > var13) {
                        this.field1444 = var13;
                    }
                } else {
                    this.field1379 = false;
                }
            } else {
                this.field1379 = false;
            }
            this.field1407 = var4;
        }
        if (this.field1380 == 0) {
            int var14 = this.field1407 - this.field1433;
            if (-var3.field986 < var14 && var3.field986 > var14) {
                this.field1433 = this.field1407;
            } else {
                this.field1379 = true;
                int var15 = var3.field1005 * var3.field1005 / (var3.field986 * 2);
                this.field1444 = (this.field1433 + this.field1407) / 2;
                if (var14 >= 0) {
                    this.field1380 = var3.field986;
                    int var16 = this.field1407 - var15;
                    if (this.field1444 < var16) {
                        this.field1444 = var16;
                    }
                } else {
                    this.field1380 = -var3.field986;
                    int var17 = this.field1407 + var15;
                    if (this.field1444 > var17) {
                        this.field1444 = var17;
                    }
                }
            }
        } else if (this.field1380 <= 0) {
            if (this.field1444 >= this.field1433) {
                this.field1379 = false;
            }
            if (!this.field1379) {
                this.field1380 += var3.field986;
                if (this.field1380 > 0) {
                    this.field1380 = 0;
                }
            } else if (this.field1380 > (-var3.field1005)) {
                this.field1380 -= var3.field986;
            }
        } else {
            if (this.field1444 <= this.field1433) {
                this.field1379 = false;
            }
            if (!this.field1379) {
                this.field1380 -= var3.field986;
                if (this.field1380 < 0) {
                    this.field1380 = 0;
                }
            } else if (var3.field1005 > this.field1380) {
                this.field1380 += var3.field986;
            }
        }
        this.field1433 += this.field1380;
        if (this.field1433 != 0) {
            int var18 = this.field1433 >> 5 & 0x7FF;
            int var19 = arg1.method207() / 2;
            arg1.method1119(0, -var19, 0);
            arg1.method1129(var18);
            arg1.method1119(0, var19, 0);
        }
        if (this.field1463 != var5) {
            if (this.field1427 > 0 && var5 > this.field1429) {
                int var20 = this.field1427 * this.field1427 / (var3.field984 * 2);
                int var21 = var5 - this.field1429;
                if (var20 <= var21) {
                    this.field1409 = true;
                    int var22 = var3.field981 * var3.field981 / (var3.field984 * 2);
                    this.field1360 = (this.field1429 + var5 - var20) / 2;
                    int var23 = var5 - var22;
                    if (this.field1360 < var23) {
                        this.field1360 = var23;
                    }
                } else {
                    this.field1409 = false;
                }
            } else if (this.field1427 < 0 && var5 < this.field1429) {
                int var24 = this.field1427 * this.field1427 / (var3.field984 * 2);
                int var25 = var5 - this.field1429;
                if (var25 < var24) {
                    this.field1409 = false;
                } else {
                    this.field1360 = (this.field1429 + var24 + var5) / 2;
                    this.field1409 = true;
                    int var26 = var3.field981 * var3.field981 / (var3.field984 * 2);
                    int var27 = var5 + var26;
                    if (var27 < this.field1360) {
                        this.field1360 = var27;
                    }
                }
            } else {
                this.field1409 = false;
            }
            this.field1463 = var5;
        }
        if (this.field1427 == 0) {
            int var28 = this.field1463 - this.field1429;
            if (var28 > (-var3.field984) && var28 < var3.field984) {
                this.field1429 = this.field1463;
            } else {
                this.field1409 = true;
                this.field1360 = (this.field1463 + this.field1429) / 2;
                int var29 = var3.field981 * var3.field981 / (var3.field984 * 2);
                if (var28 < 0) {
                    int var30 = this.field1463 + var29;
                    this.field1427 = -var3.field984;
                    if (var30 < this.field1360) {
                        this.field1360 = var30;
                    }
                } else {
                    this.field1427 = var3.field984;
                    int var31 = this.field1463 - var29;
                    if (this.field1360 < var31) {
                        this.field1360 = var31;
                    }
                }
            }
        } else if (this.field1427 <= 0) {
            if (this.field1360 >= this.field1429) {
                this.field1409 = false;
            }
            if (!this.field1409) {
                this.field1427 += var3.field984;
                if (this.field1427 > 0) {
                    this.field1427 = 0;
                }
            } else if (this.field1427 > (-var3.field981)) {
                this.field1427 -= var3.field984;
            }
        } else {
            if (this.field1429 >= this.field1360) {
                this.field1409 = false;
            }
            if (!this.field1409) {
                this.field1427 -= var3.field984;
                if (this.field1427 < 0) {
                    this.field1427 = 0;
                }
            } else if (this.field1427 < var3.field981) {
                this.field1427 += var3.field984;
            }
        }
        this.field1429 += this.field1427;
        if (this.field1429 == 0) {
            return;
        }
        int var32 = (this.field1429 & 0xFFE2) >> 5;
        int var33 = arg1.method207() / 2;
        arg1.method1119(0, -var33, 0);
        arg1.method1132(var32);
        arg1.method1119(0, var33, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljh;IBIZI)V", line = 734)
    public static final void method632(class269 arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < 87) {
            method642(59, 39, (String) null, -18, -29);
        }
        field1412++;
        if (class293.field4617 >= 50 || arg0.field4173 == null || arg0.field4173.length <= arg5 || arg0.field4173[arg5] == null) {
            return;
        }
        int var6 = arg0.field4173[arg5][0];
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 8;
        if (arg0.field4173[arg5].length > 1) {
            int var9 = (int) (Math.random() * (double) arg0.field4173[arg5].length);
            if (var9 > 0) {
                var8 = arg0.field4173[arg5][var9];
            }
        }
        int var10 = (var6 & 0xE2) >> 5;
        if (var7 == 0) {
            if (arg4) {
                class151.method1158(var8, var10, false, 0);
            }
        } else if (class14.field263 != 0) {
            class320.field4991[class293.field4617] = var8;
            class26.field429[class293.field4617] = var10;
            class264.field4094[class293.field4617] = 0;
            int var11 = (arg1 - 64) / 128;
            class40.field716[class293.field4617] = null;
            int var12 = (arg3 - 64) / 128;
            class71.field1115[class293.field4617] = (var11 << 16) + (var12 << 8) + var7;
            class293.field4617++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 794)
    public final void method633(int arg0) {
        this.field1434 = arg0;
        field1393++;
        this.field1365 = 0;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 817)
    public static final void method634(int arg0) {
        if (class302.field4752 != null) {
            class128 var1 = class302.field4752;
            synchronized (class302.field4752) {
                class302.field4752 = null;
            }
        }
        field1382++;
        if (arg0 != 2) {
            field1421 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 870)
    public static final void method635(boolean arg0) {
        if (class213.field3400 != null) {
            class213.field3400.method90(31201);
        }
        if (class243.field3763 != null) {
            class243.field3763.method90(31201);
        }
        class291.method2040(2, arg0, class151.field2424, 22050);
        field1455++;
        class213.field3400 = class247.method1754(0, 22050, class83.field1235, 0, class2.field7);
        class213.field3400.method91(class61.field955, (byte) -53);
        class243.field3763 = class247.method1754(1, 2048, class83.field1235, 0, class2.field7);
        class243.field3763.method91(class128.field2045, (byte) -125);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZII)V", line = 892)
    public final void method636(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1386[0];
        field1399++;
        if (!arg0) {
            this.field1460 = -86;
        }
        int var5 = this.field1388[0];
        if (this.field1458 != -1 && class6.method28(this.field1458, 2).field4188 == 1) {
            this.field1458 = -1;
        }
        if (this.field1365 < 9) {
            this.field1365++;
        }
        for (int var6 = this.field1365; var6 > 0; var6--) {
            this.field1386[var6] = this.field1386[var6 - 1];
            this.field1388[var6] = this.field1388[var6 - 1];
            this.field1431[var6] = this.field1431[var6 - 1];
        }
        this.field1431[0] = (byte) arg1;
        if (arg2 == 0) {
            var5++;
            var4--;
        }
        if (arg2 == 1) {
            var5++;
        }
        if (arg2 == 2) {
            var5++;
            var4++;
        }
        if (arg2 == 3) {
            var4--;
        }
        if (arg2 == 4) {
            var4++;
        }
        if (arg2 == 5) {
            var5--;
            var4--;
        }
        if (arg2 == 6) {
            var5--;
        }
        if (arg2 == 7) {
            var5--;
            var4++;
        }
        this.field1386[0] = var4;
        this.field1388[0] = var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I", line = 973)
    public final int method637(byte arg0) {
        field1368++;
        if (this.field1392 == -32768) {
            return 200;
        } else {
            if (arg0 < 25) {
                this.field1425 = 57;
            }
            return -this.field1392;
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 1000)
    public static void method638(int arg0) {
        field1400 = null;
        field1421 = null;
        field1418 = null;
        field1447 = null;
        if (arg0 < 106) {
            method642(-76, 27, (String) null, 41, -36);
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)Z", line = 1031)
    public boolean method199(int arg0) {
        field1404++;
        return arg0 != 58;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIZ)V", line = 1061)
    public final void method639(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field1458 != -1 && class6.method28(this.field1458, 2).field4188 == 1) {
            this.field1458 = -1;
        }
        field1375++;
        if (!arg4) {
            int var6 = arg3 - this.field1386[0];
            int var7 = arg1 - this.field1388[0];
            if (var6 >= -8 && var6 <= 8 && var7 >= -8 && var7 <= 8) {
                if (this.field1365 < 9) {
                    this.field1365++;
                }
                for (int var8 = this.field1365; var8 > 0; var8--) {
                    this.field1386[var8] = this.field1386[var8 - 1];
                    this.field1388[var8] = this.field1388[var8 - 1];
                    this.field1431[var8] = this.field1431[var8 - 1];
                }
                this.field1386[0] = arg3;
                this.field1388[0] = arg1;
                this.field1431[0] = 1;
                return;
            }
        }
        this.field1386[0] = arg3;
        this.field1388[0] = arg1;
        this.field1434 = 0;
        this.field1365 = 0;
        if (arg0 != 21696) {
            this.field1396 = 50;
        }
        this.field1369 = this.field1388[0] * 128 + arg2 * 64;
        this.field1442 = this.field1386[0] * 128 + (arg2 * 64);
        this.field1389 = 0;
        if (class265.field4126 && class19.field356 == this) {
            class232.method1678(arg0 ^ 0xFFFFAB12);
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I", line = 1160)
    public int method200(int arg0) {
        if (arg0 != -1) {
            method644((byte) -99, (class101) null);
        }
        field1374++;
        return this.field1416;
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)Lbk;", line = 1178)
    public final class63 method640(int arg0) {
        field1426++;
        int var2 = this.method198(499);
        int var3 = 29 / ((66 - arg0) / 48);
        return var2 == -1 ? class85.field1285 : class65.method497(1886497452, var2);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBLfa;)V", line = 1198)
    public final void method641(int arg0, byte arg1, class199 arg2) {
        class249.field3845 = 0;
        class267.field4141 = 0;
        field1408++;
        if (arg1 != -100) {
            return;
        }
        class74.field1139 = 0;
        class63 var4 = this.method640(115);
        int var5 = var4.field996;
        int var6 = var4.field982;
        if (var5 == 0 || var6 == 0) {
            return;
        }
        int var7 = class174.field2732[arg0];
        int var8 = -var5 / 2;
        int var9 = class174.field2731[arg0];
        int var10 = -var6 / 2;
        int var11 = var5 / 2;
        int var12 = -var6 / 2;
        int var13 = var7 * var10 - (var8 * var9) >> 16;
        int var14 = var7 * var8 + var9 * var10 >> 16;
        int var15 = class48.method374(this.field1369 + var13, this.field1442 + var14, 88, class41.field734);
        int var16 = var7 * var12 - (var9 * var11) >> 16;
        int var17 = var7 * var11 + var9 * var12 >> 16;
        int var18 = -var5 / 2;
        int var19 = class48.method374(this.field1369 + var16, this.field1442 - -var17, 106, class41.field734);
        int var20 = var6 / 2;
        int var21 = var7 * var18 + var9 * var20 >> 16;
        int var22 = var7 * var20 - var9 * var18 >> 16;
        int var23 = class48.method374(this.field1369 + var22, this.field1442 + var21, 102, class41.field734);
        int var24 = var5 / 2;
        int var25 = var6 / 2;
        int var26 = var7 * var24 + var9 * var25 >> 16;
        int var27 = var7 * var25 - (var9 * var24) >> 16;
        int var28 = class48.method374(this.field1369 + var27, this.field1442 + var26, arg1 + 205, class41.field734);
        int var29 = var28 <= var23 ? var28 : var23;
        int var30 = var15 >= var19 ? var19 : var15;
        int var31 = var19 < var28 ? var19 : var28;
        int var32 = var23 <= var15 ? var23 : var15;
        class74.field1139 = (int) (Math.atan2((double) (var30 - var29), (double) var6) * 325.95D) & 0x7FF;
        if (class74.field1139 != 0) {
            arg2.method1132(class74.field1139);
        }
        class249.field3845 = (int) (Math.atan2((double) (var32 - var31), (double) var5) * 325.95D) & 0x7FF;
        if (class249.field3845 != 0) {
            arg2.method1129(class249.field3845);
        }
        class267.field4141 = var15 + var28;
        if (class267.field4141 > (var19 + var23)) {
            class267.field4141 = var19 + var23;
        }
        class267.field4141 = (class267.field4141 >> 1) - this.field1425;
        if (class267.field4141 != 0) {
            arg2.method1119(0, class267.field4141, 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 1337)
    public static final void method642(int arg0, int arg1, String arg2, int arg3, int arg4) {
        class292 var5 = class41.method330(arg4, arg1, -1);
        field1363++;
        if (var5 == null) {
            return;
        }
        if (var5.field4452 != null) {
            class88 var6 = new class88();
            var6.field1353 = arg2;
            var6.field1357 = var5;
            var6.field1340 = var5.field4452;
            var6.field1342 = arg3;
            class228.method1656(var6, (byte) -58);
        }
        boolean var7 = true;
        if (var5.field4477 > 0) {
            var7 = class328.method2245(var5, -125);
        }
        if (!var7 || !client.method1786(var5).method342(arg3 - 1, 1)) {
            return;
        }
        if (arg3 == 1) {
            class10.field163++;
            class269.field4191.method246(false, 117);
            class269.field4191.method784(107, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 2) {
            class39.field695++;
            class269.field4191.method246(false, 160);
            class269.field4191.method784(-87, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 3) {
            class9.field138++;
            class269.field4191.method246(false, 180);
            class269.field4191.method784(112, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg0 <= 7) {
            return;
        }
        if (arg3 == 4) {
            class269.field4191.method246(false, 175);
            class269.field4191.method784(-103, arg4);
            class269.field4191.method728(arg1, 1234856744);
            class307.field4824++;
        }
        if (arg3 == 5) {
            class269.field4191.method246(false, 227);
            class240.field3728++;
            class269.field4191.method784(84, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 6) {
            class269.field4191.method246(false, 123);
            class16.field300++;
            class269.field4191.method784(112, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 7) {
            class269.field4191.method246(false, 230);
            class203.field3222++;
            class269.field4191.method784(86, arg4);
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 8) {
            class269.field4191.method246(false, 231);
            class269.field4191.method784(-78, arg4);
            class269.field4191.method728(arg1, 1234856744);
            class10.field161++;
        }
        if (arg3 == 9) {
            class269.field4191.method246(false, 166);
            class269.field4191.method784(77, arg4);
            class255.field3949++;
            class269.field4191.method728(arg1, 1234856744);
        }
        if (arg3 == 10) {
            class269.field4191.method246(false, 68);
            class269.field4191.method784(67, arg4);
            class239.field3720++;
            class269.field4191.method728(arg1, 1234856744);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V", line = 1470)
    public final void method643(int arg0, byte arg1) {
        int var3 = -71 % ((arg1 + 21) / 45);
        this.field1416 = arg0;
        field1383++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLpe;)V", line = 1552)
    public static final void method644(byte arg0, class101 arg1) {
        field1432++;
        if ((arg1.field1661.length - arg1.field1667) < 1) {
            return;
        }
        int var2 = arg1.method741(118);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field1661.length - arg1.field1667 < var3) {
            return;
        }
        class329.field5093 = arg1.method741(44);
        if (class329.field5093 < 1) {
            class329.field5093 = 1;
        } else if (class329.field5093 > 4) {
            class329.field5093 = 4;
        }
        class306.method2116(arg1.method741(28) == 1, -19689);
        class128.field2040 = arg1.method741(74) == 1;
        class289.field4406 = arg1.method741(49) == 1;
        class298.field4704 = arg1.method741(52) == 1;
        class65.field1055 = arg1.method741(39) == 1;
        class29.field474 = arg1.method741(48) == 1;
        class217.field3474 = arg1.method741(56) == 1;
        class11.field219 = arg1.method741(124) == 1;
        class245.field3780 = arg1.method741(88);
        if (class245.field3780 > 2) {
            class245.field3780 = 2;
        }
        if (var2 >= 2) {
            class302.field4753 = arg1.method741(42) == 1;
        } else {
            class302.field4753 = arg1.method741(123) == 1;
            arg1.method741(83);
        }
        if (arg0 < 29) {
            method645(91, -80, -102);
        }
        class6.field61 = arg1.method741(115) == 1;
        class307.field4846 = arg1.method741(97) == 1;
        class12.field239 = arg1.method741(34);
        if (class12.field239 > 2) {
            class12.field239 = 2;
        }
        class141.field2240 = class12.field239;
        class151.field2424 = arg1.method741(21) == 1;
        class191.field3064 = arg1.method741(24);
        if (class191.field3064 > 127) {
            class191.field3064 = 127;
        }
        class288.field4397 = arg1.method741(73);
        class14.field263 = arg1.method741(30);
        if (class14.field263 > 127) {
            class14.field263 = 127;
        }
        if (var2 >= 1) {
            class107.field1786 = arg1.method731(false);
            class247.field3825 = arg1.method731(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method741(104);
        }
        if (var2 >= 4) {
            int var4 = arg1.method741(63);
            if (class95.field1567 < 96) {
                var4 = 0;
            }
            class47.method370(var4);
        }
        if (var2 >= 5) {
            class34.field566 = arg1.method775(103);
        }
        if (var2 >= 6) {
            class54.field860 = arg1.method741(127);
        }
        if (var2 >= 7) {
            class247.field3820 = arg1.method741(76) == 1;
        }
        if (var2 >= 8) {
            class39.field707 = arg1.method741(70) == 1;
        }
        if (var2 >= 9) {
            class60.field945 = arg1.method741(14);
        }
        if (var2 >= 10) {
            class22.field393 = arg1.method741(69) != 0;
        }
        if (var2 >= 11) {
            class212.field3387 = arg1.method741(116) != 0;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Lag;", line = 1714)
    public static final class114 method645(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4219;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)V", line = 1738)
    public final void method646(int arg0, int arg1, int arg2, int arg3) {
        field1361++;
        if (arg3 != 27023) {
            this.field1448 = -47;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.field1403[var5] <= arg0) {
                this.field1390[var5] = arg1;
                this.field1419[var5] = arg2;
                this.field1403[var5] = arg0 + 70;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)I")
    public abstract int method198(int arg0);
}
