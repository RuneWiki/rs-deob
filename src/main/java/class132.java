import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class132 extends class470 {

    @OriginalMember(owner = "client!eea", name = "ob", descriptor = "[I")
    private int[] field1413;

    @OriginalMember(owner = "client!eea", name = "O", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!eea", name = "fb", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!eea", name = "yb", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!eea", name = "jb", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!eea", name = "xb", descriptor = "[I")
    private int[] field1422;

    @OriginalMember(owner = "client!eea", name = "Db", descriptor = "[I")
    private int[] field1428;

    @OriginalMember(owner = "client!eea", name = "ac", descriptor = "[S")
    private short[] field1451;

    @OriginalMember(owner = "client!eea", name = "Gb", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "[I")
    private int[] field1367;

    @OriginalMember(owner = "client!eea", name = "pc", descriptor = "[Loia;")
    private class88[] field1466;

    @OriginalMember(owner = "client!eea", name = "X", descriptor = "[Lnda;")
    private class555[] field1396;

    @OriginalMember(owner = "client!eea", name = "sb", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!eea", name = "S", descriptor = "[Loo;")
    private class625[] field1391;

    @OriginalMember(owner = "client!eea", name = "Lb", descriptor = "[Liha;")
    private class30[] field1436;

    @OriginalMember(owner = "client!eea", name = "jc", descriptor = "[S")
    private short[] field1460;

    @OriginalMember(owner = "client!eea", name = "Nb", descriptor = "S")
    private short field1438;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "[S")
    private short[] field1359;

    @OriginalMember(owner = "client!eea", name = "pb", descriptor = "[S")
    private short[] field1414;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "[S")
    private short[] field1369;

    @OriginalMember(owner = "client!eea", name = "zc", descriptor = "[S")
    private short[] field1476;

    @OriginalMember(owner = "client!eea", name = "J", descriptor = "S")
    private short field1382;

    @OriginalMember(owner = "client!eea", name = "ab", descriptor = "[S")
    private short[] field1399;

    @OriginalMember(owner = "client!eea", name = "N", descriptor = "[S")
    private short[] field1386;

    @OriginalMember(owner = "client!eea", name = "vb", descriptor = "[F")
    private float[] field1420;

    @OriginalMember(owner = "client!eea", name = "sc", descriptor = "[S")
    private short[] field1469;

    @OriginalMember(owner = "client!eea", name = "Z", descriptor = "[B")
    private byte[] field1398;

    @OriginalMember(owner = "client!eea", name = "Cb", descriptor = "[B")
    private byte[] field1427;

    @OriginalMember(owner = "client!eea", name = "T", descriptor = "[S")
    private short[] field1392;

    @OriginalMember(owner = "client!eea", name = "Hc", descriptor = "[S")
    private short[] field1484;

    @OriginalMember(owner = "client!eea", name = "mc", descriptor = "[S")
    private short[] field1463;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "[F")
    private float[] field1361;

    @OriginalMember(owner = "client!eea", name = "Ib", descriptor = "[S")
    private short[] field1433;

    @OriginalMember(owner = "client!eea", name = "uc", descriptor = "[I")
    private int[] field1471;

    @OriginalMember(owner = "client!eea", name = "Kb", descriptor = "[I")
    private int[] field1435;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "client!eea", name = "W", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!eea", name = "Ub", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!eea", name = "R", descriptor = "[[I")
    private int[][] field1390;

    @OriginalMember(owner = "client!eea", name = "lb", descriptor = "[[I")
    private int[][] field1410;

    @OriginalMember(owner = "client!eea", name = "Bb", descriptor = "[[I")
    private int[][] field1426;

    @OriginalMember(owner = "client!eea", name = "db", descriptor = "Z")
    private boolean field1402;

    @OriginalMember(owner = "client!eea", name = "M", descriptor = "Z")
    private boolean field1385;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "Z")
    private boolean field1374;

    @OriginalMember(owner = "client!eea", name = "K", descriptor = "Z")
    private boolean field1383;

    @OriginalMember(owner = "client!eea", name = "Dc", descriptor = "Z")
    private boolean field1480;

    @OriginalMember(owner = "client!eea", name = "Gc", descriptor = "Lln;")
    private class377 field1483;

    @OriginalMember(owner = "client!eea", name = "qc", descriptor = "Ldi;")
    private class126 field1467;

    @OriginalMember(owner = "client!eea", name = "mb", descriptor = "Ldi;")
    private class126 field1411;

    @OriginalMember(owner = "client!eea", name = "Bc", descriptor = "Ldi;")
    private class126 field1478;

    @OriginalMember(owner = "client!eea", name = "Yb", descriptor = "Ldi;")
    private class126 field1449;

    @OriginalMember(owner = "client!eea", name = "L", descriptor = "Lsca;")
    private class44 field1384;

    @OriginalMember(owner = "client!eea", name = "Sb", descriptor = "Lof;")
    public static class620 field1443 = new class620(5);

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!eea", name = "P", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!eea", name = "Q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!eea", name = "U", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!eea", name = "V", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!eea", name = "Y", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!eea", name = "bb", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!eea", name = "cb", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!eea", name = "eb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!eea", name = "gb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!eea", name = "hb", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!eea", name = "ib", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!eea", name = "kb", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!eea", name = "nb", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!eea", name = "qb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!eea", name = "rb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!eea", name = "tb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!eea", name = "ub", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!eea", name = "wb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!eea", name = "zb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!eea", name = "Ab", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!eea", name = "Eb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!eea", name = "Fb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!eea", name = "Hb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!eea", name = "Jb", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!eea", name = "Mb", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!eea", name = "Ob", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!eea", name = "Pb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!eea", name = "Qb", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!eea", name = "Rb", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!eea", name = "Tb", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!eea", name = "Vb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!eea", name = "Wb", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!eea", name = "Xb", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!eea", name = "Zb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!eea", name = "bc", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!eea", name = "cc", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!eea", name = "dc", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!eea", name = "ec", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!eea", name = "fc", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!eea", name = "hc", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!eea", name = "ic", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!eea", name = "kc", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eea", name = "lc", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!eea", name = "nc", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!eea", name = "oc", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!eea", name = "rc", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!eea", name = "tc", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!eea", name = "vc", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!eea", name = "wc", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!eea", name = "xc", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!eea", name = "yc", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!eea", name = "Ac", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!eea", name = "Cc", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!eea", name = "Ec", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!eea", name = "Fc", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!eea", name = "Ic", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!eea", name = "gc", descriptor = "Lfw;")
    private class55 field1457;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)V", line = 7)
    public final void method226(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1387; var5++) {
            int var9 = this.field1476[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3FC) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field1476[var5] = (short) class695.method3919(var12, class695.method3919(var10 << 10, var11 << 7));
        }
        field1364++;
        if (this.field1436 != null) {
            for (int var6 = 0; var6 < this.field1417; var6++) {
                class30 var7 = this.field1436[var6];
                class625 var8 = this.field1391[var6];
                var8.field8979 = class721.field10115[this.field1476[var7.field353] & 0xFFFF] & 0xFFFFFF | var8.field8979 & 0xFF000000;
            }
        }
        this.method837((byte) -14);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILdfa;ZII)Z", line = 61)
    public final boolean method191(int arg0, int arg1, class165 arg2, boolean arg3, int arg4, int arg5) {
        field1456++;
        return this.method840(arg2, arg4, arg3, arg0, 8, arg5, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "da", descriptor = "()I", line = 69)
    public final int method235() {
        field1446++;
        return this.field1438;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZBLjava/lang/String;)V", line = 79)
    public static final void method827(boolean arg0, boolean arg1, byte arg2, String arg3) {
        field1434++;
        try {
            if (arg3.equalsIgnoreCase("commands") || arg3.equalsIgnoreCase("help")) {
                class599.method3408("commands - This command", (byte) -36);
                class599.method3408("cls - Clear console", (byte) -36);
                class599.method3408("displayfps - Toggle FPS and other information", (byte) -36);
                class599.method3408("renderer - Print graphics renderer information", (byte) -36);
                class599.method3408("heap - Print java memory information", (byte) -36);
                return;
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class626.field8989 = 0;
                class185.field2210 = 0;
                return;
            }
            int var4 = -117 / ((arg2 + 21) / 48);
            if (arg3.equalsIgnoreCase("displayfps")) {
                class127.field1333 = !class127.field1333;
                if (!class127.field1333) {
                    class599.method3408("FPS off", (byte) -36);
                    return;
                }
                class599.method3408("FPS on", (byte) -36);
                return;
            }
            if (arg3.equals("renderer")) {
                class261 var5 = class275.field3370.method395();
                class599.method3408("Vendor: " + var5.field3236, (byte) -36);
                class599.method3408("Name: " + var5.field3237, (byte) -36);
                class599.method3408("Version: " + var5.field3233, (byte) -36);
                class599.method3408("Device: " + var5.field3234, (byte) -36);
                class599.method3408("Driver Version: " + var5.field3238, (byte) -36);
                return;
            }
            if (arg3.equals("heap")) {
                class599.method3408("Heap: " + class649.field9279 + "MB", (byte) -36);
                return;
            }
        } catch (Exception var47) {
            class599.method3408(class486.field6904.method2936(class489.field6978, 112), (byte) -36);
            return;
        }
        if (class342.field4425 != class237.field2829 || class58.field594 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class599.method3408("FPS: " + class429.field6239, (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class114.field1198 = !class114.field1198;
                    if (!class114.field1198) {
                        class599.method3408("Occlsion now off!", (byte) -36);
                        return;
                    }
                    class599.method3408("Occlsion now on!", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class127.field1333 = true;
                    class599.method3408("fps debug enabled", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class127.field1333 = false;
                    class599.method3408("fps debug disabled", (byte) -36);
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class599.method3408("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class463.field6618.field2979 + "Mb", (byte) -36);
                        return;
                    } catch (Throwable var41) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class262.field3249.method2787(126);
                    class599.method3408("Text coords cleared", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class64.method484(true);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class599.method3408("mem=" + var8 + "k", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class64.method484(true);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    Runtime var10 = Runtime.getRuntime();
                    int var11 = (int) ((var10.totalMemory() - var10.freeMemory()) / 1024L);
                    class599.method3408("Memory before cleanup=" + var11 + "k", (byte) -36);
                    class720.method4021(false);
                    class64.method484(true);
                    for (int var12 = 0; var12 < 10; var12++) {
                        System.gc();
                    }
                    int var13 = (int) ((var10.totalMemory() - var10.freeMemory()) / 1024L);
                    class599.method3408("Memory after cleanup=" + var13 + "k", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class599.method3408(class323.method1927(35632) ? "Libraries unloaded" : "Library unloading failed!", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class599.method3408("Dropped client connection", (byte) -36);
                    if (class392.field5397 == 10) {
                        class94.method633(-128);
                        return;
                    }
                    if (class392.field5397 == 11) {
                        class236.field2809 = true;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class76.field802.method2759((byte) -53);
                    class599.method3408("Rotated connection methods", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class227.field2592.method2019((byte) 100);
                    class599.method3408("Dropped client js5 net queue", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class227.field2592.method2007(127);
                    class599.method3408("Dropped server js5 net queue", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class289.field3549.method3217(10450);
                    class751.field10504.method1696(6407);
                    class227.field2592.method2016(0);
                    class599.method3408("Breaking new connections for 5 seconds", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class60.method461(-1);
                    class8.method33(-31239);
                    class599.method3408("Rebuilding map", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class36.field394 = class652.method3700(-1);
                    class471.field6740 = true;
                    class60.method461(-1);
                    class8.method33(-31239);
                    class599.method3408("Rebuilding map (with profiling)", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class191.method1162(-1, -1, (byte) 124, 1, false);
                    if (class735.method4098(false) == 1) {
                        class599.method3408("wm1 succeeded", (byte) -36);
                        return;
                    }
                    class599.method3408("wm1 failed", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class191.method1162(-1, -1, (byte) 127, 2, false);
                    if (class735.method4098(false) != 2) {
                        class599.method3408("wm2 failed", (byte) -36);
                        return;
                    }
                    class599.method3408("wm2 succeeded", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class191.method1162(1024, 768, (byte) 124, 3, false);
                    if (class735.method4098(false) != 3) {
                        class599.method3408("wm3 failed", (byte) -36);
                        return;
                    }
                    class599.method3408("wm3 succeeded", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class627.method3597(false, 0, -31618);
                    if (class654.field9334.field9850.method1512(-125) == 0) {
                        class599.method3408("Entered tk0", (byte) -36);
                        class654.field9334.method3924(true, class654.field9334.field9835, 0);
                        class37.method168((byte) 115);
                        class361.field4632 = false;
                        return;
                    }
                    class599.method3408("Failed to enter tk0", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class627.method3597(false, 1, -31618);
                    if (class654.field9334.field9850.method1512(22) != 1) {
                        class599.method3408("Failed to enter tk1", (byte) -36);
                        return;
                    }
                    class599.method3408("Entered tk1", (byte) -36);
                    class654.field9334.method3924(true, class654.field9334.field9835, 1);
                    class37.method168((byte) 107);
                    class361.field4632 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class627.method3597(false, 2, -31618);
                    if (class654.field9334.field9850.method1512(-126) == 2) {
                        class599.method3408("Entered tk2", (byte) -36);
                        class654.field9334.method3924(true, class654.field9334.field9835, 2);
                        class37.method168((byte) 109);
                        class361.field4632 = false;
                        return;
                    }
                    class599.method3408("Failed to enter tk2", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class627.method3597(false, 3, -31618);
                    if (class654.field9334.field9850.method1512(121) != 3) {
                        class599.method3408("Failed to enter tk3", (byte) -36);
                        return;
                    }
                    class599.method3408("Entered tk3", (byte) -36);
                    class654.field9334.method3924(true, class654.field9334.field9835, 3);
                    class37.method168((byte) 116);
                    class361.field4632 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class627.method3597(false, 5, -31618);
                    if (class654.field9334.field9850.method1512(82) != 5) {
                        class599.method3408("Failed to enter tk5", (byte) -36);
                        return;
                    }
                    class599.method3408("Entered tk5", (byte) -36);
                    class654.field9334.method3924(true, class654.field9334.field9835, 5);
                    class37.method168((byte) 113);
                    class361.field4632 = false;
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class599.method3408("Invalid buildarea value", (byte) -36);
                        return;
                    }
                    int var14 = class219.method1282((byte) -53, arg3.substring(6));
                    if (var14 >= 0 && class704.method3951(-13634, class649.field9279) >= var14) {
                        class654.field9334.method3924(true, class654.field9334.field9863, var14);
                        class37.method168((byte) 115);
                        class361.field4632 = false;
                        class599.method3408("maxbuildarea=" + class654.field9334.field9863.method565(103), (byte) -36);
                        return;
                    }
                    class599.method3408("Invalid buildarea value", (byte) -36);
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class599.method3408("Invalid rect_debug value", (byte) -36);
                        return;
                    }
                    class475.field6775 = class219.method1282((byte) -82, arg3.substring(10).trim());
                    class599.method3408("rect_debug=" + class475.field6775, (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class19.field164 = true;
                    class599.method3408("qa_op_test=" + class19.field164, (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class518.field7371 = !class518.field7371;
                    class599.method3408("clipcomponents=" + class518.field7371, (byte) -36);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var15 = class275.field3370.method358();
                    if (class463.method2820(1, !var15)) {
                        if (!var15) {
                            class599.method3408("Bloom enabled", (byte) -36);
                            return;
                        }
                        class599.method3408("Bloom disabled", (byte) -36);
                        return;
                    }
                    class599.method3408("Failed to enable bloom", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class16.field153) {
                        class16.field153 = false;
                        class599.method3408("Forced tweening disabled.", (byte) -36);
                        return;
                    }
                    class16.field153 = true;
                    class599.method3408("Forced tweening ENABLED!", (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (!class296.field3651) {
                        class599.method3408("Shift-click ENABLED!", (byte) -36);
                        class296.field3651 = true;
                        return;
                    }
                    class599.method3408("Shift-click disabled.", (byte) -36);
                    class296.field3651 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class599.method3408("x:" + (class90.field937.field4635 >> 9) + " z:" + (class90.field937.field4629 >> 9), (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class599.method3408("Height: " + class504.field7120[class90.field937.field4628].method1671(class90.field937.field4629 >> 9, class90.field937.field4635 >> 9, (byte) -72), (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class394.field5410.method2488(-115);
                    class394.field5410.method2492((byte) 77);
                    class119.field1233.method2340(false);
                    class337.field4323.method2055(114);
                    class8.method33(-31239);
                    class599.method3408("Minimap reset", (byte) -36);
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class275.field3370.method411()) {
                        int var16 = Integer.parseInt(arg3.substring(3));
                        if (var16 < 1) {
                            var16 = 1;
                        } else if (var16 > 4) {
                            var16 = 4;
                        }
                        class74.field779 = var16;
                        class60.method461(-1);
                        class599.method3408("Render cores now: " + class74.field779, (byte) -36);
                        return;
                    }
                    class599.method3408("Current toolkit doesn't support multiple cores", (byte) -36);
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class599.method3408("I(s): " + class559.field7988.method3545(0) + "/" + class559.field7988.method3540((byte) -50), (byte) -36);
                    class599.method3408("I(m): " + class657.field9393.method3545(0) + "/" + class657.field9393.method3540((byte) -50), (byte) -36);
                    class599.method3408("O(s): " + class361.field4643.field1627.method1624(-7995) + "/" + class361.field4643.field1627.method1631((byte) 78), (byte) -36);
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class599.method3408("Pos: " + class90.field937.field4628 + "," + ((class167.field1855 >> 9) + class464.field6624 >> 6) + "," + ((class590.field8319 >> 9) + class181.field2144 >> 6) + "," + ((class167.field1855 >> 9) + class464.field6624 & 0x3F) + "," + ((class590.field8319 >> 9) + class181.field2144 & 0x3F) + " Height: " + (class676.method3845(class590.field8319, class167.field1855, 0, class90.field937.field4628) - class204.field2409), (byte) -36);
                    class599.method3408("Look: " + class90.field937.field4628 + "," + (class464.field6624 + class277.field3403 >> 6) + "," + (class450.field6492 + class181.field2144 >> 6) + "," + (class464.field6624 + class277.field3403 & 0x3F) + "," + (class450.field6492 + class181.field2144 & 0x3F) + " Height: " + (class676.method3845(class450.field6492, class277.field3403, 0, class90.field937.field4628) - class504.field7092), (byte) -36);
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class479.field6857 = !class479.field6857;
                    class275.field3370.method347(class479.field6857);
                    class223.method1293(667);
                    class599.method3408("showprofiling=" + class479.field6857, (byte) -36);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var17 = -1;
                    int var18 = 1000;
                    if (arg3.length() > 15) {
                        String[] var19 = class625.method3586(arg3, ' ', -16647);
                        try {
                            if (var19.length > 1) {
                                var18 = Integer.parseInt(var19[1]);
                            }
                        } catch (Throwable var43) {
                        }
                        try {
                            if (var19.length > 2) {
                                var17 = Integer.parseInt(var19[2]);
                            }
                        } catch (Throwable var42) {
                        }
                    }
                    if (var17 == -1) {
                        class599.method3408("Java toolkit: " + class411.method2519(0, var18, 0), (byte) -36);
                        class599.method3408("SSE toolkit:  " + class411.method2519(0, var18, 2), (byte) -36);
                        class599.method3408("D3D toolkit:  " + class411.method2519(0, var18, 3), (byte) -36);
                        class599.method3408("GL toolkit:   " + class411.method2519(0, var18, 1), (byte) -36);
                        class599.method3408("GLX toolkit:  " + class411.method2519(0, var18, 5), (byte) -36);
                        return;
                    }
                    class599.method3408("Performance: " + class411.method2519(0, var18, class654.field9334.field9850.method1512(-123)), (byte) -36);
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class416.field5695 = !class416.field5695;
                    class599.method3408("nonpcs=" + class416.field5695, (byte) -36);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class486.method2931(81);
                    class599.method3408("auto world selected", (byte) -36);
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var20 = Integer.parseInt(arg3.substring(12));
                    class55.method306(class710.method3969(var20, 0).field7493, var20, 40000);
                    class599.method3408("switched", (byte) -36);
                    return;
                }
                if (arg3.equals("getworld")) {
                    class599.method3408("w: " + class76.field802.field6435, (byte) -36);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class249 var21 = class289.method1715(class6.field41, 61, class41.field470);
                    var21.field3016.method1460(0, 24710);
                    int var22 = var21.field3016.field2903;
                    int var23 = arg3.indexOf(" ", 4);
                    var21.field3016.method1480(arg3.substring(3, var23), false);
                    class122.method783(0, var21.field3016, arg3.substring(var23));
                    var21.field3016.method1434(115, var21.field3016.field2903 - var22);
                    class510.method3017(var21, 54);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class523.method3074(false);
                    class599.method3408("perm varcs saved", (byte) -36);
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var24 = 0; var24 < class217.field2518.length; var24++) {
                        if (class417.field5905[var24]) {
                            class217.field2518[var24] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class217.field2518[var24] *= -1;
                            }
                        }
                    }
                    class523.method3074(false);
                    class599.method3408("perm varcs scrambled", (byte) -36);
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class488.field6975 = true;
                    class8.method33(-31239);
                    class599.method3408("colmap is shown", (byte) -36);
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class488.field6975 = false;
                    class8.method33(-31239);
                    class599.method3408("colmap is hidden", (byte) -36);
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class38.method185(true);
                    class599.method3408("Caches reset", (byte) -36);
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class599.method3408(class61.method467(-65536) + "ms", (byte) -36);
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var25 = Integer.parseInt(arg3.substring(17));
                    class599.method3408("varpbit=" + class722.field10125.method3329((byte) -48, var25), (byte) -36);
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var26 = Integer.parseInt(arg3.substring(14));
                    class599.method3408("varp=" + class722.field10125.method3330(73, var26), (byte) -36);
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var27 = class625.method3586(arg3.substring(12), ' ', -16647);
                    if (var27.length >= 2) {
                        int var28 = var27.length <= 2 ? 0 : Integer.parseInt(var27[2]);
                        class654.method3707(var27[1], -1, var28, var27[0]);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class133.method858();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class133.method855(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class133.method855(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var29 = Integer.parseInt(arg3.substring(8));
                    class275.field3370.method365(var29);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class599.method3408("Active streams: " + class597.field8470.method1683(), (byte) -36);
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class305.method1832(-1);
                    class599.method3408("Complete. Toolkit now: " + class654.field9334.field9850.method1512(-120), (byte) -36);
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class599.method3408(class30.field343.method1797((byte) 25), (byte) -36);
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class546.field7836.startsWith("win")) {
                        class658.method3750(true, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class658.method3750(true, new File("/tmp/heap.dump"), false);
                    }
                    class599.method3408("Done", (byte) -36);
                    return;
                }
                if (arg3.equals("os")) {
                    class599.method3408("Name: " + class546.field7836, (byte) -36);
                    class599.method3408("Arch: " + class546.field7852, (byte) -36);
                    class599.method3408("Ver: " + class546.field7840, (byte) -36);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var30 = Integer.parseInt(arg3.substring(8, 9));
                    class581.field8217 = var30;
                    class60.method461(-1);
                    class599.method3408("Toggled!", (byte) -36);
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var31 = arg3.indexOf(32);
                    if (var31 < 0) {
                        class599.method3408("Syntax: ortho <n>", (byte) -36);
                        return;
                    }
                    int var32 = class219.method1282((byte) -128, arg3.substring(var31 + 1));
                    class654.field9334.method3924(true, class654.field9334.field9872, var32);
                    class37.method168((byte) 117);
                    class361.field4632 = false;
                    class161.method998(false);
                    if (class654.field9334.field9872.method2432(26) == var32) {
                        class599.method3408("Successfully changed ortho mode", (byte) -36);
                        return;
                    }
                    class599.method3408("Failed to change ortho mode", (byte) -36);
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class654.field9334.field9872.method2432(-123) == 0) {
                        class599.method3408("enable ortho mode first (use 'ortho <n>')", (byte) -36);
                        return;
                    }
                    int var33 = class219.method1282((byte) -84, arg3.substring(arg3.indexOf(32) + 1));
                    class586.field8269 = var33;
                    class599.method3408("orthozoom=" + class586.field8269, (byte) -36);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var34 = class219.method1282((byte) -96, arg3.substring(arg3.indexOf(32) + 1));
                    class160.field1782 = var34;
                    class743.field10375 = var34;
                    class599.method3408("ortho tile size=" + var34, (byte) -36);
                    class161.method998(false);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class454.field6521 = !class454.field6521;
                    class599.method3408("ortho camera lock is " + (class454.field6521 ? "on" : "off"), (byte) -36);
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var35 = new File(arg3.substring(10));
                    if (var35.exists()) {
                        var35 = new File(arg3.substring(10) + "." + class652.method3700(-1) + ".log");
                        if (var35.exists()) {
                            class599.method3408("file already exists!", (byte) -36);
                            return;
                        }
                    }
                    if (class570.field8093 != null) {
                        class570.field8093.close();
                        class570.field8093 = null;
                    }
                    try {
                        class570.field8093 = new FileOutputStream(var35);
                        return;
                    } catch (FileNotFoundException var44) {
                        class599.method3408("Could not create " + var35.getName(), (byte) -36);
                        return;
                    } catch (SecurityException var45) {
                        class599.method3408("Cannot write to " + var35.getName(), (byte) -36);
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class570.field8093 != null) {
                        class570.field8093.close();
                    }
                    class570.field8093 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var36 = new File(arg3.substring(10));
                    if (!var36.exists()) {
                        class599.method3408("No such file", (byte) -36);
                        return;
                    }
                    byte[] var37 = class105.method722(var36, 106);
                    if (var37 == null) {
                        class599.method3408("Failed to read file", (byte) -36);
                        return;
                    }
                    String[] var38 = class625.method3586(class388.method2394((byte) -115, '\r', class357.method2107(var37, (byte) 127), ""), '\n', -16647);
                    class717.method3999((byte) -127, var38);
                }
                if (arg3.startsWith("zoom ")) {
                    short var39 = (short) class219.method1282((byte) -100, arg3.substring(5));
                    if (var39 > 0) {
                        class489.field6977 = var39;
                    }
                    return;
                }
                if (class392.field5397 == 10) {
                    class163.field1816++;
                    class249 var40 = class289.method1715(class615.field8814, 103, class41.field470);
                    var40.field3016.method1460(arg3.length() + 3, 24710);
                    var40.field3016.method1460(arg0 ? 1 : 0, 24710);
                    var40.field3016.method1460(arg1 ? 1 : 0, 24710);
                    var40.field3016.method1480(arg3, false);
                    class510.method3017(var40, 52);
                }
                if (arg3.startsWith("fps ") && class342.field4425 != class237.field2829) {
                    class176.method1087(class219.method1282((byte) -75, arg3.substring(4)), 3);
                    return;
                }
            } catch (Exception var46) {
                class599.method3408(class486.field6904.method2936(class489.field6978, 53), (byte) -36);
                return;
            }
        }
        if (class392.field5397 != 10) {
            class599.method3408(class486.field6907.method2936(class489.field6978, -98) + arg3, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z", line = 1069)
    private final boolean method828(byte arg0) {
        field1377++;
        boolean var2 = !this.field1478.field1323;
        boolean var3 = (this.field1445 & 0x37) != 0 && !this.field1449.field1323;
        boolean var4 = !this.field1467.field1323;
        boolean var5 = !this.field1411.field1323;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field1467.field1324 == null) {
                this.field1467.field1324 = this.field1483.method2306(this.field1480, arg0 ^ 0x22);
            }
            class545 var7 = this.field1467.field1324;
            var7.method3110(2501, 12, this.field1395 * 12);
            Buffer var8 = var7.method3109(true, arg0 - 22262);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field1483.field4965.copyPositions(this.field1367, this.field1428, this.field1422, this.field1463, 0, 12, this.field1395, var8.getAddress());
                if (var7.method3107((byte) 103)) {
                    this.field1467.field1326 = var7;
                    this.field1467.field1323 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field1478.field1324 == null) {
                this.field1478.field1324 = this.field1483.method2306(this.field1480, arg0 - 34);
            }
            class545 var9 = this.field1478.field1324;
            var9.method3110(2501, 4, this.field1395 * 4);
            Buffer var10 = var9.method3109(true, arg0 - 22262);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field1445 & 0x37) == 0) {
                    byte[] var11;
                    short[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field1457 == null) {
                        var11 = this.field1427;
                        var12 = this.field1433;
                        var13 = this.field1414;
                        var14 = this.field1469;
                    } else {
                        var13 = this.field1457.field562;
                        var14 = this.field1457.field563;
                        var11 = this.field1457.field564;
                        var12 = this.field1457.field561;
                    }
                    this.field1483.field4965.copyLighting(this.field1476, this.field1398, this.field1386, var14, var12, var13, var11, this.field1382, this.field1438, this.field1359, 0, 4, this.field1395, var10.getAddress());
                } else {
                    this.field1483.field4965.copyColours(this.field1476, this.field1398, this.field1386, this.field1382, this.field1359, 0, 4, this.field1395, var10.getAddress());
                }
                if (var9.method3107((byte) 75)) {
                    this.field1478.field1323 = true;
                    this.field1478.field1326 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field1449.field1324 == null) {
                this.field1449.field1324 = this.field1483.method2306(this.field1480, 0);
            }
            class545 var15 = this.field1449.field1324;
            var15.method3110(arg0 + 2467, 12, this.field1395 * 12);
            Buffer var16 = var15.method3109(true, -22228);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                byte[] var19;
                short[] var20;
                if (this.field1457 == null) {
                    var17 = this.field1433;
                    var18 = this.field1469;
                    var19 = this.field1427;
                    var20 = this.field1414;
                } else {
                    var20 = this.field1457.field562;
                    var18 = this.field1457.field563;
                    var19 = this.field1457.field564;
                    var17 = this.field1457.field561;
                }
                this.field1483.field4965.copyNormals(var18, var17, var20, var19, 3.0F / (float) this.field1438, 3.0F / (float) (this.field1438 / 2 + this.field1438), 0, 12, this.field1395, var16.getAddress());
                if (var15.method3107((byte) 75)) {
                    this.field1449.field1323 = true;
                    this.field1449.field1326 = var15;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field1411.field1324 == null) {
                this.field1411.field1324 = this.field1483.method2306(this.field1480, 0);
            }
            class545 var21 = this.field1411.field1324;
            var21.method3110(arg0 + 2467, 8, this.field1395 * 8);
            Buffer var22 = var21.method3109(true, -22228);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field1483.field4965.copyTexCoords(this.field1361, this.field1420, 0, 8, this.field1395, var22.getAddress());
                if (var21.method3107((byte) 123)) {
                    this.field1411.field1323 = true;
                    this.field1411.field1326 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        if (arg0 != 34) {
            this.field1359 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILdfa;ZI)Z", line = 1262)
    public final boolean method227(int arg0, int arg1, class165 arg2, boolean arg3, int arg4) {
        field1455++;
        return this.method840(arg2, arg4, arg3, arg0, 8, -1, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "na", descriptor = "()I", line = 1272)
    public final int method203() {
        if (!this.field1374) {
            this.method843((byte) -120);
        }
        field1482++;
        return this.field1481;
    }

    @OriginalMember(owner = "client!eea", name = "RA", descriptor = "()I", line = 1283)
    public final int method222() {
        field1378++;
        if (!this.field1374) {
            this.method843((byte) -117);
        }
        return this.field1465;
    }

    @OriginalMember(owner = "client!eea", name = "ma", descriptor = "()I", line = 1297)
    public final int method217() {
        field1485++;
        if (!this.field1374) {
            this.method843((byte) 99);
        }
        return this.field1400;
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "()[Lnda;", line = 1312)
    public final class555[] method212() {
        field1412++;
        return this.field1396;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V", line = 1321)
    private final void method829(int arg0) {
        field1421++;
        if (arg0 >= -45) {
            this.method190();
        }
        if (this.field1404 == 0) {
            return;
        }
        if (this.method828((byte) 34) && this.method844(-1700852319)) {
            this.field1483.method2301(true, this.field1467.field1326, 0);
            this.field1483.method2301(true, this.field1478.field1326, 1);
            this.field1483.method2301(true, this.field1411.field1326, 2);
            boolean var2;
            if ((this.field1445 & 0x37) == 0) {
                this.field1483.method2284(false, 30315);
                var2 = false;
                this.field1483.method2285(1, this.field1483.field5169);
            } else {
                var2 = true;
                this.field1483.method2284(true, 30315);
                this.field1483.method2301(true, this.field1449.field1326, 3);
                this.field1483.method2285(1, this.field1483.field5173);
            }
            for (int var3 = 0; var3 < this.field1362.length; var3++) {
                int var4 = this.field1435[var3];
                int var5 = this.field1435[var3 + 1];
                int var6 = this.field1386[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field1483.method2275(true, var2, (byte) 24, var6);
                this.field1483.method2295(class178.field2092, -124, this.field1384.field499, this.field1362[var3], var5 - var4, var4 * 3, this.field1471[var3]);
            }
        }
        this.method845(-106);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V", line = 1381)
    public static void method830(byte arg0) {
        field1443 = null;
        int var1 = -24 / ((-arg0 - 31) / 54);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIII)Z", line = 1393)
    private final boolean method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1437++;
        if (arg5 > arg0 && arg0 < arg2 && arg0 < arg8) {
            return false;
        }
        if (arg7 != -1447617016) {
            field1443 = null;
        }
        if (arg5 < arg0 && arg0 > arg2 && arg0 > arg8) {
            return false;
        } else if (arg6 > arg4 && arg3 > arg4 && arg1 > arg4) {
            return false;
        } else {
            return arg4 <= arg6 || arg4 <= arg3 || arg1 >= arg4;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V", line = 1420)
    private final void method832(boolean arg0) {
        field1381++;
        if (this.field1467 != null) {
            this.field1467.field1323 = false;
        }
        if (!arg0) {
            this.field1400 = -102;
        }
    }

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "(I)V", line = 1434)
    public final void method207(int arg0) {
        if (this.field1467 != null) {
            this.field1467.field1329 = class78.method554(arg0, this.field1445, 0);
        }
        field1424++;
        if (this.field1411 != null) {
            this.field1411.field1329 = class590.method3376(this.field1445, (byte) -96, arg0);
        }
        if (this.field1478 != null) {
            this.field1478.field1329 = class222.method1291(arg0, 84, this.field1445);
        }
        if (this.field1449 != null) {
            this.field1449.field1329 = class139.method878(arg0, (byte) 0, this.field1445);
        }
        this.field1423 = arg0;
        if (this.field1457 != null && (this.field1423 & 0x10000) == 0) {
            this.field1469 = this.field1457.field563;
            this.field1414 = this.field1457.field562;
            this.field1427 = this.field1457.field564;
            this.field1433 = this.field1457.field561;
            this.field1457 = null;
        }
        this.field1383 = true;
        this.method845(-67);
    }

    @OriginalMember(owner = "client!eea", name = "O", descriptor = "(III)V", line = 1472)
    public final void method232(int arg0, int arg1, int arg2) {
        field1432++;
        for (int var4 = 0; var4 < this.field1408; var4++) {
            if (arg0 != 128) {
                this.field1367[var4] = this.field1367[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1428[var4] = this.field1428[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1422[var4] = this.field1422[var4] * arg2 >> 7;
            }
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldfa;)V", line = 1503)
    public final void method220(class165 arg0) {
        field1371++;
        class427 var2 = (class427) arg0;
        if (this.field1396 != null) {
            for (int var3 = 0; var3 < this.field1396.length; var3++) {
                class555 var4 = this.field1396[var3];
                class555 var5 = var4;
                if (var4.field7943 != null) {
                    var5 = var4.field7943;
                }
                var5.field7952 = (int) ((float) this.field1422[var4.field7940] * var2.field6169 + (float) this.field1428[var4.field7940] * var2.field6171 + (float) this.field1367[var4.field7940] * var2.field6189 + var2.field6211);
                var5.field7946 = (int) ((float) this.field1422[var4.field7940] * var2.field6195 + (float) this.field1428[var4.field7940] * var2.field6182 + (float) this.field1367[var4.field7940] * var2.field6167 + var2.field6205);
                var5.field7942 = (int) ((float) this.field1422[var4.field7940] * var2.field6192 + (float) this.field1428[var4.field7940] * var2.field6213 + (float) this.field1367[var4.field7940] * var2.field6200 + var2.field6204);
                var5.field7958 = (int) ((float) this.field1422[var4.field7941] * var2.field6169 + (float) this.field1428[var4.field7941] * var2.field6171 + (float) this.field1367[var4.field7941] * var2.field6189 + var2.field6211);
                var5.field7956 = (int) ((float) this.field1422[var4.field7941] * var2.field6195 + (float) this.field1428[var4.field7941] * var2.field6182 + (float) this.field1367[var4.field7941] * var2.field6167 + var2.field6205);
                var5.field7961 = (int) ((float) this.field1422[var4.field7941] * var2.field6192 + (float) this.field1428[var4.field7941] * var2.field6213 + (float) this.field1367[var4.field7941] * var2.field6200 + var2.field6204);
                var5.field7948 = (int) ((float) this.field1422[var4.field7950] * var2.field6169 + (float) this.field1428[var4.field7950] * var2.field6171 + (float) this.field1367[var4.field7950] * var2.field6189 + var2.field6211);
                var5.field7947 = (int) ((float) this.field1422[var4.field7950] * var2.field6195 + (float) this.field1428[var4.field7950] * var2.field6182 + (float) this.field1367[var4.field7950] * var2.field6167 + var2.field6205);
                var5.field7949 = (int) ((float) this.field1422[var4.field7950] * var2.field6192 + (float) this.field1428[var4.field7950] * var2.field6213 + (float) this.field1367[var4.field7950] * var2.field6200 + var2.field6204);
            }
        }
        if (this.field1466 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1466.length; var6++) {
            class88 var7 = this.field1466[var6];
            class88 var8 = var7;
            if (var7.field922 != null) {
                var8 = var7.field922;
            }
            if (var7.field920 == null) {
                var7.field920 = var2.method1024();
            } else {
                var7.field920.method1028(var2);
            }
            var8.field919 = (int) ((float) this.field1422[var7.field927] * var2.field6169 + (float) this.field1428[var7.field927] * var2.field6171 + (float) this.field1367[var7.field927] * var2.field6189 + var2.field6211);
            var8.field928 = (int) ((float) this.field1422[var7.field927] * var2.field6195 + (float) this.field1428[var7.field927] * var2.field6182 + (float) this.field1367[var7.field927] * var2.field6167 + var2.field6205);
            var8.field923 = (int) ((float) this.field1422[var7.field927] * var2.field6192 + (float) this.field1428[var7.field927] * var2.field6213 + (float) this.field1367[var7.field927] * var2.field6200 + var2.field6204);
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lln;IIZZ)V", line = 7303)
    public class132(class377 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1374 = false;
        this.field1387 = 0;
        this.field1404 = 0;
        this.field1408 = 0;
        this.field1402 = false;
        this.field1431 = 0;
        this.field1395 = 0;
        this.field1383 = true;
        this.field1385 = false;
        this.field1480 = false;
        this.field1445 = arg2;
        this.field1483 = arg0;
        this.field1423 = arg1;
        this.field1480 = arg4;
        if (arg3 || class325.method1934(this.field1423, this.field1445, (byte) 91)) {
            this.field1467 = new class126(class78.method554(this.field1423, this.field1445, 0));
        }
        if (arg3 || class13.method57(this.field1445, this.field1423, -128)) {
            this.field1411 = new class126(class590.method3376(this.field1445, (byte) -96, this.field1423));
        }
        if (arg3 || class172.method1063((byte) 63, this.field1423, this.field1445)) {
            this.field1478 = new class126(class222.method1291(this.field1423, 97, this.field1445));
        }
        if (arg3 || class467.method2832(-1, this.field1423, this.field1445)) {
            this.field1449 = new class126(class139.method878(this.field1423, (byte) 0, this.field1445));
        }
        if (arg3 || class691.method3898(this.field1445, this.field1423, (byte) -83)) {
            this.field1384 = new class44(class14.method68(this.field1423, this.field1445, 36161));
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V", line = 1573)
    public final void method211(int arg0) {
        field1468++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field1408; var4++) {
            int var5 = this.field1422[var4] * var2 + this.field1367[var4] * var3 >> 14;
            this.field1422[var4] = this.field1422[var4] * var3 - (this.field1367[var4] * var2) >> 14;
            this.field1367[var4] = var5;
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZILeea;ILeea;Z)Lka;", line = 1602)
    private final class470 method833(boolean arg0, int arg1, class132 arg2, int arg3, class132 arg4, boolean arg5) {
        arg2.field1382 = this.field1382;
        field1440++;
        arg2.field1387 = this.field1387;
        arg2.field1423 = arg3;
        arg2.field1408 = this.field1408;
        arg2.field1417 = this.field1417;
        arg2.field1438 = this.field1438;
        arg2.field1395 = this.field1395;
        arg2.field1404 = this.field1404;
        if ((arg3 & 0x100) == 0) {
            arg2.field1402 = this.field1402;
        } else {
            arg2.field1402 = true;
        }
        arg2.field1431 = this.field1431;
        arg2.field1445 = this.field1445;
        arg2.field1385 = this.field1385;
        boolean var7 = class212.method1257(this.field1445, 0, arg3);
        boolean var8 = class357.method2097(arg3, (byte) -65, this.field1445);
        boolean var9 = class197.method1182(this.field1445, arg3, 118);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field1367 = this.field1367;
            } else if (arg4.field1367 == null || this.field1431 > arg4.field1367.length) {
                arg2.field1367 = arg4.field1367 = new int[this.field1431];
            } else {
                arg2.field1367 = arg4.field1367;
            }
            if (!var8) {
                arg2.field1428 = this.field1428;
            } else if (arg4.field1428 == null || this.field1431 > arg4.field1428.length) {
                arg2.field1428 = arg4.field1428 = new int[this.field1431];
            } else {
                arg2.field1428 = arg4.field1428;
            }
            if (!var9) {
                arg2.field1422 = this.field1422;
            } else if (arg4.field1422 == null || this.field1431 > arg4.field1422.length) {
                arg2.field1422 = arg4.field1422 = new int[this.field1431];
            } else {
                arg2.field1422 = arg4.field1422;
            }
            for (int var11 = 0; var11 < this.field1431; var11++) {
                if (var7) {
                    arg2.field1367[var11] = this.field1367[var11];
                }
                if (var8) {
                    arg2.field1428[var11] = this.field1428[var11];
                }
                if (var9) {
                    arg2.field1422[var11] = this.field1422[var11];
                }
            }
        } else {
            arg2.field1428 = this.field1428;
            arg2.field1422 = this.field1422;
            arg2.field1367 = this.field1367;
        }
        if (class78.method554(arg3, this.field1445, 0)) {
            arg2.field1467 = arg4.field1467;
            arg2.field1467.field1326 = this.field1467.field1326;
            arg2.field1467.field1329 = true;
            arg2.field1467.field1323 = this.field1467.field1323;
        } else if (class325.method1934(arg3, this.field1445, (byte) 126)) {
            arg2.field1467 = this.field1467;
        } else {
            arg2.field1467 = null;
        }
        if (class60.method460(false, arg3, this.field1445)) {
            if (arg4.field1476 == null || this.field1387 > arg4.field1476.length) {
                arg2.field1476 = arg4.field1476 = new short[this.field1387];
            } else {
                arg2.field1476 = arg4.field1476;
            }
            for (int var12 = 0; var12 < this.field1387; var12++) {
                arg2.field1476[var12] = this.field1476[var12];
            }
        } else {
            arg2.field1476 = this.field1476;
        }
        if (class647.method3690(93, this.field1445, arg3)) {
            if (arg4.field1398 == null || this.field1387 > arg4.field1398.length) {
                arg2.field1398 = arg4.field1398 = new byte[this.field1387];
            } else {
                arg2.field1398 = arg4.field1398;
            }
            for (int var13 = 0; var13 < this.field1387; var13++) {
                arg2.field1398[var13] = this.field1398[var13];
            }
        } else {
            arg2.field1398 = this.field1398;
        }
        if (class222.method1291(arg3, 112, this.field1445)) {
            arg2.field1478 = arg4.field1478;
            arg2.field1478.field1323 = this.field1478.field1323;
            arg2.field1478.field1329 = true;
            arg2.field1478.field1326 = this.field1478.field1326;
        } else if (class172.method1063((byte) 63, arg3, this.field1445)) {
            arg2.field1478 = this.field1478;
        } else {
            arg2.field1478 = null;
        }
        if (class688.method3889(69, arg3, this.field1445)) {
            if (arg4.field1469 == null || this.field1395 > arg4.field1469.length) {
                int var14 = this.field1395;
                arg2.field1414 = arg4.field1414 = new short[var14];
                arg2.field1469 = arg4.field1469 = new short[var14];
                arg2.field1433 = arg4.field1433 = new short[var14];
            } else {
                arg2.field1433 = arg4.field1433;
                arg2.field1414 = arg4.field1414;
                arg2.field1469 = arg4.field1469;
            }
            if (this.field1457 == null) {
                arg2.field1457 = null;
                for (int var15 = 0; var15 < this.field1395; var15++) {
                    arg2.field1469[var15] = this.field1469[var15];
                    arg2.field1433[var15] = this.field1433[var15];
                    arg2.field1414[var15] = this.field1414[var15];
                }
            } else {
                if (arg4.field1457 == null) {
                    arg4.field1457 = new class55();
                }
                class55 var16 = arg2.field1457 = arg4.field1457;
                if (var16.field563 == null || this.field1395 > var16.field563.length) {
                    int var17 = this.field1395;
                    var16.field564 = new byte[var17];
                    var16.field563 = new short[var17];
                    var16.field561 = new short[var17];
                    var16.field562 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field1395; var18++) {
                    arg2.field1469[var18] = this.field1469[var18];
                    arg2.field1433[var18] = this.field1433[var18];
                    arg2.field1414[var18] = this.field1414[var18];
                    var16.field563[var18] = this.field1457.field563[var18];
                    var16.field561[var18] = this.field1457.field561[var18];
                    var16.field562[var18] = this.field1457.field562[var18];
                    var16.field564[var18] = this.field1457.field564[var18];
                }
            }
            arg2.field1427 = this.field1427;
        } else {
            arg2.field1457 = this.field1457;
            arg2.field1414 = this.field1414;
            arg2.field1433 = this.field1433;
            arg2.field1469 = this.field1469;
            arg2.field1427 = this.field1427;
        }
        if (class139.method878(arg3, (byte) 0, this.field1445)) {
            arg2.field1449 = arg4.field1449;
            arg2.field1449.field1326 = this.field1449.field1326;
            arg2.field1449.field1323 = this.field1449.field1323;
            arg2.field1449.field1329 = true;
        } else if (class467.method2832(arg1 + 20869, arg3, this.field1445)) {
            arg2.field1449 = this.field1449;
        } else {
            arg2.field1449 = null;
        }
        if (class193.method1173((byte) -61, arg3, this.field1445)) {
            if (arg4.field1361 == null || arg4.field1361.length < this.field1387) {
                int var19 = this.field1395;
                arg2.field1420 = arg4.field1420 = new float[var19];
                arg2.field1361 = arg4.field1361 = new float[var19];
            } else {
                arg2.field1420 = arg4.field1420;
                arg2.field1361 = arg4.field1361;
            }
            for (int var20 = 0; var20 < this.field1395; var20++) {
                arg2.field1361[var20] = this.field1361[var20];
                arg2.field1420[var20] = this.field1420[var20];
            }
        } else {
            arg2.field1420 = this.field1420;
            arg2.field1361 = this.field1361;
        }
        if (class590.method3376(this.field1445, (byte) -96, arg3)) {
            arg2.field1411 = arg4.field1411;
            arg2.field1411.field1323 = this.field1411.field1323;
            arg2.field1411.field1326 = this.field1411.field1326;
            arg2.field1411.field1329 = true;
        } else if (class13.method57(this.field1445, arg3, -127)) {
            arg2.field1411 = this.field1411;
        } else {
            arg2.field1411 = null;
        }
        if (class484.method2925(-12944, this.field1445, arg3)) {
            if (arg4.field1392 == null || this.field1387 > arg4.field1392.length) {
                int var21 = this.field1387;
                arg2.field1392 = arg4.field1392 = new short[var21];
                arg2.field1399 = arg4.field1399 = new short[var21];
                arg2.field1484 = arg4.field1484 = new short[var21];
            } else {
                arg2.field1392 = arg4.field1392;
                arg2.field1399 = arg4.field1399;
                arg2.field1484 = arg4.field1484;
            }
            for (int var22 = 0; var22 < this.field1387; var22++) {
                arg2.field1392[var22] = this.field1392[var22];
                arg2.field1399[var22] = this.field1399[var22];
                arg2.field1484[var22] = this.field1484[var22];
            }
        } else {
            arg2.field1399 = this.field1399;
            arg2.field1392 = this.field1392;
            arg2.field1484 = this.field1484;
        }
        if (class14.method68(arg3, this.field1445, 36161)) {
            arg2.field1384 = arg4.field1384;
            arg2.field1384.field495 = this.field1384.field495;
            arg2.field1384.field491 = true;
            arg2.field1384.field499 = this.field1384.field499;
        } else if (class691.method3898(this.field1445, arg3, (byte) -83)) {
            arg2.field1384 = this.field1384;
        } else {
            arg2.field1384 = null;
        }
        if (arg1 != -20870) {
            return null;
        }
        if (class415.method2540(arg3, this.field1445, false)) {
            if (arg4.field1386 == null || this.field1387 > arg4.field1386.length) {
                int var23 = this.field1387;
                arg2.field1386 = arg4.field1386 = new short[var23];
            } else {
                arg2.field1386 = arg4.field1386;
            }
            for (int var24 = 0; var24 < this.field1387; var24++) {
                arg2.field1386[var24] = this.field1386[var24];
            }
        } else {
            arg2.field1386 = this.field1386;
        }
        if (!class701.method3937(this.field1445, arg3, (byte) 100)) {
            arg2.field1391 = this.field1391;
        } else if (arg4.field1391 == null || this.field1417 > arg4.field1391.length) {
            int var26 = this.field1417;
            arg2.field1391 = arg4.field1391 = new class625[var26];
            for (int var27 = 0; var27 < this.field1417; var27++) {
                arg2.field1391[var27] = this.field1391[var27].method3584(80);
            }
        } else {
            arg2.field1391 = arg4.field1391;
            for (int var25 = 0; var25 < this.field1417; var25++) {
                arg2.field1391[var25].method3587(-15083, this.field1391[var25]);
            }
        }
        arg2.field1436 = this.field1436;
        arg2.field1359 = this.field1359;
        if (this.field1374) {
            arg2.field1481 = this.field1481;
            arg2.field1365 = this.field1365;
            arg2.field1401 = this.field1401;
            arg2.field1379 = this.field1379;
            arg2.field1465 = this.field1465;
            arg2.field1458 = this.field1458;
            arg2.field1374 = true;
            arg2.field1406 = this.field1406;
            arg2.field1400 = this.field1400;
        } else {
            arg2.field1374 = false;
        }
        arg2.field1413 = this.field1413;
        arg2.field1451 = this.field1451;
        arg2.field1435 = this.field1435;
        arg2.field1369 = this.field1369;
        arg2.field1471 = this.field1471;
        arg2.field1426 = this.field1426;
        arg2.field1466 = this.field1466;
        arg2.field1396 = this.field1396;
        arg2.field1390 = this.field1390;
        arg2.field1362 = this.field1362;
        arg2.field1463 = this.field1463;
        arg2.field1410 = this.field1410;
        arg2.field1460 = this.field1460;
        return arg2;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)V", line = 2066)
    private final void method834(byte arg0) {
        field1454++;
        if (arg0 != -106) {
            this.method832(false);
        }
        if (this.field1384 != null) {
            this.field1384.field495 = false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldfa;IZ)V", line = 2080)
    public final void method210(class165 arg0, int arg1, boolean arg2) {
        field1376++;
        if (this.field1451 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field1408; var5++) {
            if ((arg1 & this.field1451[var5]) != 0) {
                if (arg2) {
                    arg0.method1020(this.field1367[var5], this.field1428[var5], this.field1422[var5], var4);
                } else {
                    arg0.method1030(this.field1367[var5], this.field1428[var5], this.field1422[var5], var4);
                }
                this.field1367[var5] = var4[0];
                this.field1428[var5] = var4[1];
                this.field1422[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "aa", descriptor = "(SS)V", line = 2113)
    public final void method192(short arg0, short arg1) {
        field1473++;
        class150 var3 = this.field1483.field578;
        for (int var4 = 0; var4 < this.field1387; var4++) {
            if (this.field1386[var4] == arg0) {
                this.field1386[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class298 var7 = var3.method931(arg0 & 0xFFFF, true);
            var5 = var7.field3696;
            var6 = var7.field3709;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class298 var10 = var3.method931(arg1 & 0xFFFF, true);
            if (var10.field3704 != 0 || var10.field3699 != 0) {
                this.field1385 = true;
            }
            var9 = var10.field3709;
            var8 = var10.field3696;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field1436 != null) {
            for (int var11 = 0; var11 < this.field1417; var11++) {
                class30 var12 = this.field1436[var11];
                class625 var13 = this.field1391[var11];
                var13.field8979 = class721.field10115[this.field1476[var12.field353] & 0xFFFF] & 0xFFFFFF | var13.field8979 & 0xFF000000;
            }
        }
        this.method837((byte) -14);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[IIIIIZ)V", line = 2187)
    public final void method206(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1380++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class247.field3007 = 0;
            class77.field807 = 0;
            int var12 = 0;
            class232.field2712 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1390.length > var14) {
                    int[] var15 = this.field1390[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class232.field2712 += this.field1367[var17];
                        class247.field3007 += this.field1428[var17];
                        var12++;
                        class77.field807 += this.field1422[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class77.field807 = var11;
                class247.field3007 = var10;
                class232.field2712 = var9;
            } else {
                class247.field3007 = class247.field3007 / var12 + var10;
                class232.field2712 = class232.field2712 / var12 + var9;
                class77.field807 = class77.field807 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field1390.length) {
                    int[] var23 = this.field1390[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1367[var25] += var18;
                        this.field1428[var25] += var19;
                        this.field1422[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field1390.length) {
                    int[] var46 = this.field1390[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1367[var48] -= class232.field2712;
                            this.field1428[var48] -= class247.field3007;
                            this.field1422[var48] -= class77.field807;
                            if (arg4 != 0) {
                                int var49 = class260.field3230[arg4];
                                int var50 = class260.field3229[arg4];
                                int var51 = this.field1428[var48] * var49 + this.field1367[var48] * var50 + 16383 >> 14;
                                this.field1428[var48] = this.field1428[var48] * var50 + 16383 - (this.field1367[var48] * var49) >> 14;
                                this.field1367[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class260.field3230[arg2];
                                int var53 = class260.field3229[arg2];
                                int var54 = this.field1428[var48] * var53 + 16383 - (this.field1422[var48] * var52) >> 14;
                                this.field1422[var48] = this.field1422[var48] * var53 + this.field1428[var48] * var52 + 16383 >> 14;
                                this.field1428[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class260.field3230[arg3];
                                int var56 = class260.field3229[arg3];
                                int var57 = this.field1422[var48] * var55 + this.field1367[var48] * var56 + 16383 >> 14;
                                this.field1422[var48] = this.field1422[var48] * var56 + 16383 - (this.field1367[var48] * var55) >> 14;
                                this.field1367[var48] = var57;
                            }
                            this.field1367[var48] += class232.field2712;
                            this.field1428[var48] += class247.field3007;
                            this.field1422[var48] += class77.field807;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1367[var59] -= class232.field2712;
                            this.field1428[var59] -= class247.field3007;
                            this.field1422[var59] -= class77.field807;
                            if (arg2 != 0) {
                                int var60 = class260.field3230[arg2];
                                int var61 = class260.field3229[arg2];
                                int var62 = this.field1428[var59] * var61 + 16383 - (this.field1422[var59] * var60) >> 14;
                                this.field1422[var59] = this.field1428[var59] * var60 + this.field1422[var59] * var61 + 16383 >> 14;
                                this.field1428[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class260.field3230[arg4];
                                int var64 = class260.field3229[arg4];
                                int var65 = this.field1428[var59] * var63 + this.field1367[var59] * var64 + 16383 >> 14;
                                this.field1428[var59] = this.field1428[var59] * var64 + 16383 - (this.field1367[var59] * var63) >> 14;
                                this.field1367[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class260.field3230[arg3];
                                int var67 = class260.field3229[arg3];
                                int var68 = this.field1422[var59] * var66 + this.field1367[var59] * var67 + 16383 >> 14;
                                this.field1422[var59] = this.field1422[var59] * var67 + 16383 - (this.field1367[var59] * var66) >> 14;
                                this.field1367[var59] = var68;
                            }
                            this.field1367[var59] += class232.field2712;
                            this.field1428[var59] += class247.field3007;
                            this.field1422[var59] += class77.field807;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field1390.length) {
                        int[] var29 = this.field1390[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1413[var31];
                            int var33 = this.field1413[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1460[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class260.field3230[arg4];
                                    int var37 = class260.field3229[arg4];
                                    int var38 = this.field1469[var35] * var37 + this.field1433[var35] * var36 + 16383 >> 14;
                                    this.field1433[var35] = (short) (this.field1433[var35] * var37 + 16383 - (this.field1469[var35] * var36) >> 14);
                                    this.field1469[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class260.field3230[arg2];
                                    int var40 = class260.field3229[arg2];
                                    int var41 = this.field1433[var35] * var40 + 16383 - this.field1414[var35] * var39 >> 14;
                                    this.field1414[var35] = (short) (this.field1433[var35] * var39 + this.field1414[var35] * var40 + 16383 >> 14);
                                    this.field1433[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class260.field3230[arg3];
                                    int var43 = class260.field3229[arg3];
                                    int var44 = this.field1414[var35] * var42 + (this.field1469[var35] * var43) + 16383 >> 14;
                                    this.field1414[var35] = (short) (this.field1414[var35] * var43 + (16383 - (this.field1469[var35] * var42)) >> 14);
                                    this.field1469[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method839(20541);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1390.length) {
                    int[] var71 = this.field1390[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1367[var73] -= class232.field2712;
                        this.field1428[var73] -= class247.field3007;
                        this.field1422[var73] -= class77.field807;
                        this.field1367[var73] = this.field1367[var73] * arg2 >> 7;
                        this.field1428[var73] = this.field1428[var73] * arg3 >> 7;
                        this.field1422[var73] = this.field1422[var73] * arg4 >> 7;
                        this.field1367[var73] += class232.field2712;
                        this.field1428[var73] += class247.field3007;
                        this.field1422[var73] += class77.field807;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1426 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field1426.length) {
                        int[] var80 = this.field1426[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field1398[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field1398[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field1436 != null) {
                        for (int var76 = 0; var76 < this.field1417; var76++) {
                            class30 var77 = this.field1436[var76];
                            class625 var78 = this.field1391[var76];
                            var78.field8979 = 255 - (this.field1398[var77.field353] & 0xFF) << 24 | var78.field8979 & 0xFFFFFF;
                        }
                    }
                    this.method837((byte) -14);
                }
            }
        } else if (arg0 == 7) {
            if (this.field1426 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field1426.length > var89) {
                        int[] var90 = this.field1426[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field1476[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg2 + var94 & 0x3F;
                            int var97 = var93 & 0x7F;
                            int var98 = arg3 / 4 + var95;
                            if (var98 < 0) {
                                var98 = 0;
                            } else if (var98 > 7) {
                                var98 = 7;
                            }
                            int var99 = arg4 + var97;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field1476[var92] = (short) class695.method3919(class695.method3919(var98 << 7, var96 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field1436 != null) {
                        for (int var86 = 0; var86 < this.field1417; var86++) {
                            class30 var87 = this.field1436[var86];
                            class625 var88 = this.field1391[var86];
                            var88.field8979 = var88.field8979 & 0xFF000000 | class721.field10115[this.field1476[var87.field353] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method837((byte) -14);
                }
            }
        } else if (arg0 == 8) {
            if (this.field1410 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field1410.length > var101) {
                        int[] var102 = this.field1410[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class625 var104 = this.field1391[var102[var103]];
                            var104.field8984 += arg2;
                            var104.field8986 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1410 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field1410.length) {
                        int[] var107 = this.field1410[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class625 var109 = this.field1391[var107[var108]];
                            var109.field8981 = var109.field8981 * arg2 >> 7;
                            var109.field8978 = var109.field8978 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1410 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field1410.length > var111) {
                    int[] var112 = this.field1410[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class625 var114 = this.field1391[var112[var113]];
                        var114.field8976 = var114.field8976 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lru;B)V", line = 2843)
    private final void method835(class192 arg0, byte arg1) {
        if (this.field1395 > class25.field268.length) {
            class25.field268 = new int[this.field1395];
            class538.field7775 = new int[this.field1395];
        }
        field1459++;
        for (int var3 = 0; var3 < this.field1408; var3++) {
            int var14 = (this.field1367[var3] - (this.field1428[var3] * this.field1483.field5144 >> 8) >> this.field1483.field5103) - arg0.field2270;
            int var15 = (this.field1422[var3] - (this.field1428[var3] * this.field1483.field5083 >> 8) >> this.field1483.field5103) - arg0.field2271;
            int var16 = this.field1413[var3];
            int var17 = this.field1413[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field1460[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class25.field268[var19] = var14;
                class538.field7775[var19] = var15;
            }
        }
        if (arg1 < 95) {
            this.method202();
        }
        for (int var4 = 0; var4 < this.field1404; var4++) {
            if (this.field1398 == null || this.field1398[var4] <= 128) {
                short var5 = this.field1392[var4];
                short var6 = this.field1399[var4];
                short var7 = this.field1484[var4];
                int var8 = class25.field268[var5];
                int var9 = class25.field268[var6];
                int var10 = class25.field268[var7];
                int var11 = class538.field7775[var5];
                int var12 = class538.field7775[var6];
                int var13 = class538.field7775[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg0.method1169(var10, -120, var9, var8, var12, var11, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "wa", descriptor = "()V", line = 2927)
    public final void method218() {
        field1370++;
        for (int var1 = 0; var1 < this.field1431; var1++) {
            this.field1367[var1] = this.field1367[var1] + 7 >> 4;
            this.field1428[var1] = this.field1428[var1] + 7 >> 4;
            this.field1422[var1] = this.field1422[var1] + 7 >> 4;
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "ia", descriptor = "(SS)V", line = 2948)
    public final void method187(short arg0, short arg1) {
        field1441++;
        for (int var3 = 0; var3 < this.field1387; var3++) {
            if (this.field1476[var3] == arg0) {
                this.field1476[var3] = arg1;
            }
        }
        if (this.field1436 != null) {
            for (int var4 = 0; var4 < this.field1417; var4++) {
                class30 var5 = this.field1436[var4];
                class625 var6 = this.field1391[var4];
                var6.field8979 = class721.field10115[this.field1476[var5.field353] & 0xFFFF] & 0xFFFFFF | var6.field8979 & 0xFF000000;
            }
        }
        this.method837((byte) -14);
    }

    @OriginalMember(owner = "client!eea", name = "FA", descriptor = "(I)V", line = 2991)
    public final void method204(int arg0) {
        field1366++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field1408; var4++) {
            int var5 = this.field1428[var4] * var3 - this.field1422[var4] * var2 >> 14;
            this.field1422[var4] = this.field1428[var4] * var2 + this.field1422[var4] * var3 >> 14;
            this.field1428[var4] = var5;
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "(IILs;Ls;III)V", line = 3019)
    public final void method219(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6) {
        if (!this.field1374) {
            this.method843((byte) 37);
        }
        field1430++;
        int var8 = this.field1365 + arg4;
        int var9 = arg4 + this.field1465;
        int var10 = arg6 + this.field1458;
        int var11 = this.field1406 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3413 + var9 >> arg2.field3409 >= arg2.field3410 || var10 < 0 || arg2.field3413 + var11 >> arg2.field3409 >= arg2.field3408) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3413 + var9 >> arg3.field3409 >= arg3.field3410 || var10 < 0 || arg3.field3408 <= arg3.field3413 + var11 >> arg3.field3409) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3409;
            int var13 = arg2.field3413 + var9 - 1 >> arg2.field3409;
            int var14 = var10 >> arg2.field3409;
            int var15 = arg2.field3413 + var11 - 1 >> arg2.field3409;
            if (arg5 == arg2.method1671(var14, var12, (byte) 102) && arg2.method1671(var14, var13, (byte) 57) == arg5 && arg2.method1671(var15, var12, (byte) 122) == arg5 && arg2.method1671(var15, var13, (byte) 72) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field1408; var16++) {
                this.field1428[var16] -= arg5 - arg2.method1675(this.field1422[var16] + arg6, this.field1367[var16] - -arg4, 65286);
            }
        } else if (arg0 == 2) {
            int var17 = this.field1379;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field1408; var18++) {
                int var19 = (this.field1428[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field1428[var18] -= -((arg2.method1675(this.field1422[var18] + arg6, this.field1367[var18] + arg4, 65286) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF6A) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var20 >> 1)) < 0 || arg2.field3410 << arg2.field3409 <= arg4 + (var20 >> 1) + arg2.field3413 || arg6 - (var21 >> 1) < 0 || (arg2.field3408 << arg2.field3409) <= ((var21 >> 1) + arg2.field3413 + arg6)) {
                return;
            }
            this.method2839(arg4, arg6, (byte) 112, var23, arg2, var20, var21, var22, arg5);
        } else if (arg0 == 4) {
            int var31 = this.field1401 - this.field1379;
            for (int var32 = 0; var32 < this.field1408; var32++) {
                this.field1428[var32] = this.field1428[var32] + arg3.method1675(this.field1422[var32] + arg6, this.field1367[var32] + arg4, 65286) + (-arg5 - -var31);
            }
        } else if (arg0 == 5) {
            int var24 = this.field1401 - this.field1379;
            for (int var25 = 0; var25 < this.field1408; var25++) {
                int var26 = this.field1367[var25] + arg4;
                int var27 = this.field1422[var25] + arg6;
                int var28 = arg2.method1675(var27, var26, 65286);
                int var29 = arg3.method1675(var27, var26, 65286);
                int var30 = var28 - (arg1 + var29);
                this.field1428[var25] = ((this.field1428[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lka;IIIZ)V", line = 3167)
    public final void method230(class470 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1358++;
        class132 var6 = (class132) arg0;
        if (this.field1387 == 0 || var6.field1387 == 0) {
            return;
        }
        int var7 = var6.field1408;
        int[] var8 = var6.field1367;
        int[] var9 = var6.field1428;
        int[] var10 = var6.field1422;
        short[] var11 = var6.field1469;
        short[] var12 = var6.field1433;
        short[] var13 = var6.field1414;
        byte[] var14 = var6.field1427;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field1457 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1457.field561;
            var16 = this.field1457.field564;
            var17 = this.field1457.field562;
            var18 = this.field1457.field563;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1457 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1457.field561;
            var21 = var6.field1457.field563;
            var20 = var6.field1457.field564;
            var22 = var6.field1457.field562;
        }
        int[] var23 = var6.field1413;
        short[] var24 = var6.field1460;
        if (!var6.field1374) {
            var6.method843((byte) -123);
        }
        int var25 = var6.field1379;
        int var26 = var6.field1401;
        int var27 = var6.field1365;
        int var28 = var6.field1465;
        int var29 = var6.field1458;
        int var30 = var6.field1406;
        for (int var31 = 0; var31 < this.field1408; var31++) {
            int var32 = this.field1428[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field1367[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field1422[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1413[var31];
                        int var37 = this.field1413[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1460[var38] - 1;
                            if (var35 == -1 || this.field1427[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var18 == null) {
                                            this.field1457 = new class55();
                                            var18 = this.field1457.field563 = class743.method4138(this.field1469, 89);
                                            var15 = this.field1457.field561 = class743.method4138(this.field1433, 111);
                                            var17 = this.field1457.field562 = class743.method4138(this.field1414, 55);
                                            var16 = this.field1457.field564 = class173.method1077(0, this.field1427);
                                        }
                                        if (var21 == null) {
                                            class55 var44 = var6.field1457 = new class55();
                                            var21 = var44.field563 = class743.method4138(var11, 64);
                                            var19 = var44.field561 = class743.method4138(var12, 110);
                                            var22 = var44.field562 = class743.method4138(var13, 91);
                                            var20 = var44.field564 = class173.method1077(0, var14);
                                        }
                                        short var45 = this.field1469[var35];
                                        short var46 = this.field1433[var35];
                                        short var47 = this.field1414[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field1427[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var50;
                                            }
                                        }
                                        int var53 = this.field1413[var31];
                                        short var54 = var12[var42];
                                        short var55 = var13[var42];
                                        short var56 = var11[var42];
                                        byte var57 = var14[var42];
                                        int var58 = this.field1413[var31 + 1];
                                        for (int var59 = var53; var59 < var58; var59++) {
                                            int var60 = this.field1460[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var18[var60] += var56;
                                                var15[var60] += var54;
                                                var17[var60] += var55;
                                                var16[var60] += var57;
                                            }
                                        }
                                        var6.method839(20541);
                                        this.method839(20541);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lha;B)V", line = 3425)
    public static final void method836(class58 arg0, byte arg1) {
        class256.field3132 = new class667[class7.field55.length];
        field1393++;
        int var2 = 0;
        if (arg1 != -57) {
            field1443 = null;
        }
        while (class7.field55.length > var2) {
            int var3 = class7.field55[var2];
            class535 var4 = class618.method3528(class278.field3417, (byte) 101, var3);
            class59 var5 = arg0.method373(var4, class155.method959(class586.field8270, var3), true);
            class256.field3132[var2] = new class667(var5, var4);
            var2++;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "()V", line = 3456)
    public final void method189() {
        field1475++;
    }

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "(III)V", line = 3465)
    public final void method195(int arg0, int arg1, int arg2) {
        field1470++;
        for (int var4 = 0; var4 < this.field1408; var4++) {
            if (arg0 != 0) {
                this.field1367[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1428[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1422[var4] += arg2;
            }
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(B)V", line = 3494)
    private final void method837(byte arg0) {
        field1394++;
        if (this.field1478 != null) {
            this.field1478.field1323 = false;
        }
        if (arg0 != -14) {
            this.field1426 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)V", line = 3514)
    private final void method838(boolean arg0) {
        if (this.field1436 != null) {
            this.field1483.method364(!this.field1402);
            this.field1483.method2284(false, 30315);
            this.field1483.method2264(1, class58.field582, (byte) 60);
            this.field1483.method2268(1, 7, class58.field582);
            for (int var2 = 0; var2 < this.field1417; var2++) {
                class30 var3 = this.field1436[var2];
                class625 var4 = this.field1391[var2];
                if (!var3.field350 || !this.field1483.method358()) {
                    float var5 = (float) (this.field1367[var3.field342] + this.field1367[var3.field341] + this.field1367[var3.field346]) * 0.3333333F;
                    float var6 = (float) (this.field1428[var3.field341] - (-this.field1428[var3.field342] - this.field1428[var3.field346])) * 0.3333333F;
                    float var7 = (float) (this.field1422[var3.field342] + this.field1422[var3.field341] + this.field1422[var3.field346]) * 0.3333333F;
                    float var8 = class314.field3919 * var7 + class96.field1010 * var6 + class467.field6690 * var5 + class19.field176;
                    float var9 = class27.field284 * var7 + class71.field750 * var5 + class461.field6568 * var6 + class309.field3838;
                    float var10 = class215.field2502 * var7 + class610.field8691 * var5 + class505.field7210 * var6 + class756.field10546;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field347;
                    class427 var12 = this.field1483.method2263((byte) 55);
                    var12.method2656(var4.field8976, (float) var4.field8986 + var9 - (var9 * var11), var10 - var10 * var11, true, var3.field351 * var4.field8981 >> 7, (float) var4.field8984 + var8 - var8 * var11, var3.field340 * var4.field8978 >> 7);
                    var12.method2660(this.field1483.field5052, (byte) -110);
                    this.field1483.method2304(-119);
                    int var13 = var4.field8979;
                    this.field1483.method2275(false, false, (byte) 24, var3.field348);
                    this.field1483.method2274(var3.field339, -2);
                    this.field1483.method2257(var13, -552);
                    this.field1483.method2279(2);
                }
            }
            this.field1483.method2268(1, 72, class324.field4136);
            this.field1483.method2264(1, class324.field4136, (byte) 60);
            this.field1483.method364(true);
        }
        if (!arg0) {
            this.field1423 = -48;
        }
        field1453++;
    }

    @OriginalMember(owner = "client!eea", name = "WA", descriptor = "()I", line = 3578)
    public final int method225() {
        field1462++;
        return this.field1382;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)V", line = 3592)
    private final void method839(int arg0) {
        field1450++;
        if ((this.field1445 & 0x37) == 0) {
            if (this.field1478 != null) {
                this.field1478.field1323 = false;
            }
        } else if (this.field1449 != null) {
            this.field1449.field1323 = false;
        }
        if (arg0 != 20541) {
            this.method211(-78);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldfa;IZIIII)Z", line = 3616)
    private final boolean method840(class165 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1444++;
        class427 var8 = (class427) arg0;
        class427 var9 = this.field1483.field5051;
        float var10 = var8.field6204 * var9.field6169 + var8.field6211 * var9.field6189 + var8.field6205 * var9.field6171 + var9.field6211;
        float var11 = var8.field6204 * var9.field6195 + var8.field6211 * var9.field6167 + var8.field6205 * var9.field6182 + var9.field6205;
        class467.field6690 = var8.field6200 * var9.field6169 + var8.field6189 * var9.field6189 + var8.field6167 * var9.field6171;
        class27.field284 = var8.field6192 * var9.field6195 + var8.field6195 * var9.field6182 + var8.field6169 * var9.field6167;
        float var12 = var8.field6204 * var9.field6192 + var8.field6211 * var9.field6200 + var8.field6205 * var9.field6213 + var9.field6204;
        class610.field8691 = var8.field6200 * var9.field6192 + var8.field6189 * var9.field6200 + var8.field6167 * var9.field6213;
        class71.field750 = var8.field6200 * var9.field6195 + var8.field6189 * var9.field6167 + var8.field6167 * var9.field6182;
        class215.field2502 = var8.field6192 * var9.field6192 + var8.field6195 * var9.field6213 + var8.field6169 * var9.field6200;
        class314.field3919 = var8.field6192 * var9.field6169 + var8.field6195 * var9.field6171 + var8.field6169 * var9.field6189;
        class461.field6568 = var8.field6213 * var9.field6195 + var8.field6182 * var9.field6182 + var8.field6171 * var9.field6167;
        class96.field1010 = var8.field6213 * var9.field6169 + var8.field6182 * var9.field6171 + var8.field6171 * var9.field6189;
        class505.field7210 = var8.field6213 * var9.field6192 + var8.field6182 * var9.field6213 + var8.field6171 * var9.field6200;
        boolean var13 = false;
        if (arg4 != 8) {
            this.field1399 = null;
        }
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field1483.field5126;
        int var19 = this.field1483.field5115;
        if (!this.field1374) {
            this.method843((byte) -126);
        }
        int var20 = this.field1465 - this.field1365 >> 1;
        int var21 = this.field1401 - this.field1379 >> 1;
        int var22 = this.field1406 - this.field1458 >> 1;
        int var23 = this.field1365 + var20;
        int var24 = this.field1379 + var21;
        int var25 = this.field1458 + var22;
        int var26 = var23 - (var20 << arg1);
        int var27 = var24 - (var21 << arg1);
        int var28 = var25 - (var22 << arg1);
        int var29 = var23 + (var20 << arg1);
        int var30 = (var21 << arg1) + var24;
        int var31 = (var22 << arg1) + var25;
        class475.field6774[0] = var26;
        class205.field2428[0] = var27;
        class253.field3053[0] = var28;
        class475.field6774[1] = var29;
        class205.field2428[1] = var27;
        class253.field3053[1] = var28;
        class475.field6774[2] = var26;
        class205.field2428[2] = var30;
        class475.field6774[3] = var29;
        class253.field3053[2] = var28;
        class205.field2428[3] = var30;
        class475.field6774[4] = var26;
        class253.field3053[3] = var28;
        class205.field2428[4] = var27;
        class475.field6774[5] = var29;
        class253.field3053[4] = var31;
        class205.field2428[5] = var27;
        class253.field3053[5] = var31;
        class475.field6774[6] = var26;
        class205.field2428[6] = var30;
        class475.field6774[7] = var29;
        class253.field3053[6] = var31;
        class205.field2428[7] = var30;
        class253.field3053[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class253.field3053[var32];
            float var52 = (float) class475.field6774[var32];
            float var53 = (float) class205.field2428[var32];
            float var54 = class314.field3919 * var51 + class96.field1010 * var53 + class467.field6690 * var52 + var10;
            float var55 = class27.field284 * var51 + class71.field750 * var52 + class461.field6568 * var53 + var11;
            float var56 = class215.field2502 * var51 + class610.field8691 * var52 + class505.field7210 * var53 + var12;
            if (var56 >= (float) this.field1483.field5151) {
                if (arg5 > 0) {
                    var56 = arg5;
                }
                float var57 = (float) var18 * var54 / var56 + (float) this.field1483.field5124;
                if (var57 < var14) {
                    var14 = var57;
                }
                if (var15 < var57) {
                    var15 = var57;
                }
                float var58 = (float) var19 * var55 / var56 + (float) this.field1483.field5131;
                if (var58 < var16) {
                    var16 = var58;
                }
                if (var17 < var58) {
                    var17 = var58;
                }
                var13 = true;
            }
        }
        if (var13 && var14 < (float) arg3 && (float) arg3 < var15 && (float) arg6 > var16 && (float) arg6 < var17) {
            if (arg2) {
                return true;
            }
            if (class25.field268.length < this.field1395) {
                class538.field7775 = new int[this.field1395];
                class25.field268 = new int[this.field1395];
            }
            for (int var33 = 0; var33 < this.field1408; var33++) {
                float var35 = (float) this.field1367[var33];
                float var36 = (float) this.field1428[var33];
                float var37 = (float) this.field1422[var33];
                float var38 = class215.field2502 * var37 + class610.field8691 * var35 + class505.field7210 * var36 + var12;
                float var39 = class314.field3919 * var37 + class96.field1010 * var36 + class467.field6690 * var35 + var10;
                float var40 = class27.field284 * var37 + class71.field750 * var35 + class461.field6568 * var36 + var11;
                if ((var38 >= (float) this.field1483.field5151)) {
                    if (arg5 > 0) {
                        var38 = arg5;
                    }
                    int var45 = (int) ((float) var18 * var39 / var38 + (float) this.field1483.field5124);
                    int var46 = (int) ((float) var19 * var40 / var38 + (float) this.field1483.field5131);
                    int var47 = this.field1413[var33];
                    int var48 = this.field1413[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field1460[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class25.field268[var50] = var45;
                        class538.field7775[var50] = var46;
                    }
                } else {
                    int var41 = this.field1413[var33];
                    int var42 = this.field1413[var33 + 1];
                    for (int var43 = var41; var43 < var42; var43++) {
                        int var44 = this.field1460[var43] - 1;
                        if (var44 == -1) {
                            break;
                        }
                        class25.field268[this.field1460[var43] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field1387; var34++) {
                if (class25.field268[this.field1392[var34]] != -999999 && class25.field268[this.field1399[var34]] != -999999 && class25.field268[this.field1484[var34]] != -999999 && this.method831(arg6, class25.field268[this.field1484[var34]], class538.field7775[this.field1399[var34]], class25.field268[this.field1399[var34]], arg3, class538.field7775[this.field1392[var34]], class25.field268[this.field1392[var34]], arg4 ^ 0xA9B71E00, class538.field7775[this.field1484[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "()V", line = 3854)
    public final void method199() {
        field1442++;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(JIZIIIILuk;FIF)S", line = 3871)
    private final short method841(long arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class260 arg7, float arg8, int arg9, float arg10) {
        field1409++;
        int var13 = this.field1413[arg1];
        int var14 = this.field1413[arg1 + 1];
        if (!arg2) {
            return -73;
        }
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field1460[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class128.field1350[var16] == arg0) {
                return (short) (var17 - 1);
            }
        }
        this.field1460[var15] = (short) (this.field1395 + 1);
        class128.field1350[var15] = arg0;
        this.field1359[this.field1395] = (short) arg3;
        this.field1463[this.field1395] = (short) arg1;
        this.field1469[this.field1395] = (short) arg4;
        this.field1433[this.field1395] = (short) arg6;
        this.field1414[this.field1395] = (short) arg5;
        this.field1427[this.field1395] = (byte) arg9;
        this.field1361[this.field1395] = arg8;
        this.field1420[this.field1395] = arg10;
        return (short) (this.field1395++);
    }

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "(I[IIIIZI[I)V", line = 3920)
    public final void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1368++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class247.field3007 = 0;
            int var13 = 0;
            class77.field807 = 0;
            class232.field2712 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1390.length) {
                    int[] var16 = this.field1390[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1451 == null || (arg6 & this.field1451[var18]) != 0) {
                            class232.field2712 += this.field1367[var18];
                            class247.field3007 += this.field1428[var18];
                            var13++;
                            class77.field807 += this.field1422[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class77.field807 = class77.field807 / var13 + var12;
                class232.field2712 = class232.field2712 / var13 + var10;
                class247.field3007 = class247.field3007 / var13 + var11;
                class646.field9229 = true;
            } else {
                class247.field3007 = var11;
                class232.field2712 = var10;
                class77.field807 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + 8192 - (-(arg7[7] * arg3) - arg7[8] * arg4) >> 14;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1390.length) {
                    int[] var27 = this.field1390[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1451 == null || (arg6 & this.field1451[var29]) != 0) {
                            this.field1367[var29] += var23;
                            this.field1428[var29] += var22;
                            this.field1422[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field1390.length > var109) {
                        int[] var110 = this.field1390[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1451 == null || (arg6 & this.field1451[var112]) != 0) {
                                this.field1367[var112] -= class232.field2712;
                                this.field1428[var112] -= class247.field3007;
                                this.field1422[var112] -= class77.field807;
                                if (arg4 != 0) {
                                    int var113 = class260.field3230[arg4];
                                    int var114 = class260.field3229[arg4];
                                    int var115 = this.field1367[var112] * var114 + (this.field1428[var112] * var113 + 16383) >> 14;
                                    this.field1428[var112] = this.field1428[var112] * var114 - (this.field1367[var112] * var113 - 16383) >> 14;
                                    this.field1367[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class260.field3230[arg2];
                                    int var117 = class260.field3229[arg2];
                                    int var118 = this.field1428[var112] * var117 + 16383 - (this.field1422[var112] * var116) >> 14;
                                    this.field1422[var112] = this.field1428[var112] * var116 + this.field1422[var112] * var117 + 16383 >> 14;
                                    this.field1428[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class260.field3230[arg3];
                                    int var120 = class260.field3229[arg3];
                                    int var121 = this.field1422[var112] * var119 + (this.field1367[var112] * var120) + 16383 >> 14;
                                    this.field1422[var112] = this.field1422[var112] * var120 + 16383 - this.field1367[var112] * var119 >> 14;
                                    this.field1367[var112] = var121;
                                }
                                this.field1367[var112] += class232.field2712;
                                this.field1428[var112] += class247.field3007;
                                this.field1422[var112] += class77.field807;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field1390.length > var92) {
                            int[] var93 = this.field1390[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1451 == null || (arg6 & this.field1451[var95]) != 0) {
                                    int var96 = this.field1413[var95];
                                    int var97 = this.field1413[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1460[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class260.field3230[arg4];
                                            int var101 = class260.field3229[arg4];
                                            int var102 = this.field1469[var99] * var101 + (this.field1433[var99] * var100 + 16383) >> 14;
                                            this.field1433[var99] = (short) (this.field1433[var99] * var101 + 16383 - (this.field1469[var99] * var100) >> 14);
                                            this.field1469[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class260.field3230[arg2];
                                            int var104 = class260.field3229[arg2];
                                            int var105 = this.field1433[var99] * var104 + 16383 - (this.field1414[var99] * var103) >> 14;
                                            this.field1414[var99] = (short) (this.field1414[var99] * var104 + (this.field1433[var99] * var103 + 16383) >> 14);
                                            this.field1433[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class260.field3230[arg3];
                                            int var107 = class260.field3229[arg3];
                                            int var108 = this.field1414[var99] * var106 - (-(this.field1469[var99] * var107) - 16383) >> 14;
                                            this.field1414[var99] = (short) (this.field1414[var99] * var107 + 16383 - (this.field1469[var99] * var106) >> 14);
                                            this.field1469[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method839(20541);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class646.field9229) {
                    int var36 = arg7[0] * class232.field2712 + (arg7[3] * class247.field3007) - (-(arg7[6] * class77.field807) - 8192) >> 14;
                    int var37 = arg7[4] * class247.field3007 + (arg7[1] * class232.field2712 + (arg7[7] * class77.field807)) + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = var33 + var36;
                    int var40 = arg7[8] * class77.field807 + arg7[2] * class232.field2712 + arg7[5] * class247.field3007 + 8192 >> 14;
                    class247.field3007 = var38;
                    int var41 = var35 + var40;
                    class232.field2712 = var39;
                    class77.field807 = var41;
                    class646.field9229 = false;
                }
                int[] var42 = new int[9];
                int var43 = class260.field3229[arg2];
                int var44 = class260.field3230[arg2];
                int var45 = class260.field3229[arg3];
                int var46 = class260.field3230[arg3];
                int var47 = class260.field3229[arg4];
                int var48 = class260.field3230[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[6] = var45 * var50 + -var46 * var47 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                int var51 = var42[0] * -class232.field2712 + (var42[2] * -class77.field807) + var42[1] * -class247.field3007 + 8192 >> 14;
                int var52 = var42[3] * -class232.field2712 + var42[5] * -class77.field807 + var42[4] * -class247.field3007 + 8192 >> 14;
                int var53 = var42[8] * -class77.field807 + var42[7] * -class247.field3007 + var42[6] * -class232.field2712 + 8192 >> 14;
                int var54 = class232.field2712 + var51;
                int var55 = class247.field3007 + var52;
                int var56 = class77.field807 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 8192 >> 14;
                int var60 = var42[3] * var33 + var42[5] * var35 + var42[4] * var34 + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[7] * var34 + var42[6] * var33 + var42[8] * var35 + 8192 >> 14;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[0] * var62 + (arg7[2] * var64) + arg7[1] * var61 + 8192 >> 14;
                int var68 = arg7[3] * var62 - (-(arg7[4] * var61) - (arg7[5] * var64) - 8192) >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[7] * var61 + arg7[6] * var62 - (-(arg7[8] * var64) - 8192) >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field1390.length > var74) {
                        int[] var75 = this.field1390[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1451 == null || (arg6 & this.field1451[var77]) != 0) {
                                int var78 = this.field1422[var77] * var65[2] + (this.field1367[var77] * var65[0] + (this.field1428[var77] * var65[1])) + 8192 >> 14;
                                int var79 = this.field1428[var77] * var65[4] + this.field1367[var77] * var65[3] + (this.field1422[var77] * var65[5]) + 8192 >> 14;
                                int var80 = this.field1367[var77] * var65[6] + 8192 - (-(this.field1428[var77] * var65[7]) + -(this.field1422[var77] * var65[8])) >> 14;
                                int var81 = var69 + var78;
                                int var82 = var70 + var79;
                                this.field1367[var77] = var81;
                                int var83 = var72 + var80;
                                this.field1428[var77] = var82;
                                this.field1422[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field1390.length) {
                        int[] var124 = this.field1390[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1451 == null || (arg6 & this.field1451[var126]) != 0) {
                                this.field1367[var126] -= class232.field2712;
                                this.field1428[var126] -= class247.field3007;
                                this.field1422[var126] -= class77.field807;
                                this.field1367[var126] = this.field1367[var126] * arg2 >> 7;
                                this.field1428[var126] = this.field1428[var126] * arg3 >> 7;
                                this.field1422[var126] = this.field1422[var126] * arg4 >> 7;
                                this.field1367[var126] += class232.field2712;
                                this.field1428[var126] += class247.field3007;
                                this.field1422[var126] += class77.field807;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class646.field9229) {
                    int var133 = arg7[3] * class247.field3007 + arg7[0] * class232.field2712 + (arg7[6] * class77.field807) + 8192 >> 14;
                    int var134 = arg7[4] * class247.field3007 + arg7[1] * class232.field2712 + arg7[7] * class77.field807 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[5] * class247.field3007 + arg7[2] * class232.field2712 + arg7[8] * class77.field807 + 8192 >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class232.field2712 = var135;
                    class247.field3007 = var137;
                    class646.field9229 = false;
                    class77.field807 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class232.field2712 * var139 + 8192 >> 14;
                int var143 = -class247.field3007 * var140 + 8192 >> 14;
                int var144 = -class77.field807 * var141 + 8192 >> 14;
                int var145 = var142 + class232.field2712;
                int var146 = class247.field3007 + var143;
                int var147 = var144 + class77.field807;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var152 + (arg7[1] * var153) + 8192 >> 14;
                int var158 = arg7[4] * var153 + arg7[3] * var152 + (arg7[5] * var154) + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = arg7[8] * var154 + arg7[7] * var153 + arg7[6] * var152 + 8192 >> 14;
                int var161 = var128 + var158;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field1390.length > var164) {
                        int[] var165 = this.field1390[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1451 == null || (this.field1451[var167] & arg6) != 0) {
                                int var168 = this.field1367[var167] * var155[0] + 8192 - (-(this.field1428[var167] * var155[1]) - this.field1422[var167] * var155[2]) >> 14;
                                int var169 = this.field1428[var167] * var155[4] + this.field1367[var167] * var155[3] - (-(this.field1422[var167] * var155[5]) + -8192) >> 14;
                                int var170 = this.field1422[var167] * var155[8] + this.field1367[var167] * var155[6] + (this.field1428[var167] * var155[7]) + 8192 >> 14;
                                int var171 = var161 + var169;
                                int var172 = var159 + var168;
                                int var173 = var162 + var170;
                                this.field1367[var167] = var172;
                                this.field1428[var167] = var171;
                                this.field1422[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1426 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field1426.length > var182) {
                        int[] var183 = this.field1426[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field1369 == null || (this.field1369[var185] & arg6) != 0) {
                                int var186 = (this.field1398[var185] & 0xFF) + (arg2 * 8);
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field1398[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field1436 != null) {
                        for (int var179 = 0; var179 < this.field1417; var179++) {
                            class30 var180 = this.field1436[var179];
                            class625 var181 = this.field1391[var179];
                            var181.field8979 = 255 - (this.field1398[var180.field353] & 0xFF) << 24 | var181.field8979 & 0xFFFFFF;
                        }
                    }
                    this.method837((byte) -14);
                }
            }
        } else if (arg0 == 7) {
            if (this.field1426 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field1426.length > var192) {
                        int[] var193 = this.field1426[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field1369 == null || (this.field1369[var195] & arg6) != 0) {
                                int var196 = this.field1476[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = (var196 & 0x38C) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = var197 + arg2 & 0x3F;
                                int var202 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field1476[var195] = (short) class695.method3919(class695.method3919(var201 << 10, var200 << 7), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field1436 != null) {
                        for (int var189 = 0; var189 < this.field1417; var189++) {
                            class30 var190 = this.field1436[var189];
                            class625 var191 = this.field1391[var189];
                            var191.field8979 = class721.field10115[this.field1476[var190.field353] & 0xFFFF] & 0xFFFFFF | var191.field8979 & 0xFF000000;
                        }
                    }
                    this.method837((byte) -14);
                }
            }
        } else if (arg0 == 8) {
            if (this.field1410 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field1410.length) {
                        int[] var205 = this.field1410[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class625 var207 = this.field1391[var205[var206]];
                            var207.field8984 += arg2;
                            var207.field8986 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1410 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field1410.length) {
                        int[] var210 = this.field1410[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class625 var212 = this.field1391[var210[var211]];
                            var212.field8978 = var212.field8978 * arg3 >> 7;
                            var212.field8981 = var212.field8981 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1410 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field1410.length) {
                    int[] var215 = this.field1410[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class625 var217 = this.field1391[var215[var216]];
                        var217.field8976 = var217.field8976 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldfa;Lim;I)V", line = 4915)
    public final void method228(class165 arg0, class569 arg1, int arg2) {
        field1416++;
        if (this.field1395 == 0) {
            return;
        }
        class427 var4 = this.field1483.field5051;
        if (!this.field1374) {
            this.method843((byte) 26);
        }
        class427 var5 = (class427) arg0;
        class756.field10546 = var4.field6192 * var5.field6204 + var4.field6213 * var5.field6205 + var4.field6200 * var5.field6211 + var4.field6204;
        class505.field7210 = var4.field6192 * var5.field6213 + var4.field6213 * var5.field6182 + var4.field6200 * var5.field6171;
        float var6 = (float) this.field1379 * class505.field7210 + class756.field10546;
        float var7 = (float) this.field1401 * class505.field7210 + class756.field10546;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) (-this.field1481) + var7;
            var9 = (float) this.field1481 + var6;
        } else {
            var8 = (float) (-this.field1481) + var6;
            var9 = (float) this.field1481 + var7;
        }
        if ((this.field1483.field5084 <= var8) || (var9 <= (float) this.field1483.field5151)) {
            return;
        }
        class96.field1010 = var4.field6169 * var5.field6213 + var4.field6189 * var5.field6171 + var4.field6171 * var5.field6182;
        class19.field176 = var4.field6169 * var5.field6204 + var4.field6189 * var5.field6211 + var4.field6171 * var5.field6205 + var4.field6211;
        float var10 = (float) this.field1379 * class96.field1010 + class19.field176;
        float var11 = (float) this.field1401 * class96.field1010 + class19.field176;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field1481) + var11) * (float) this.field1483.field5126;
            var13 = ((float) this.field1481 + var10) * (float) this.field1483.field5126;
        } else {
            var12 = (var10 - (float) this.field1481) * (float) this.field1483.field5126;
            var13 = ((float) this.field1481 + var11) * (float) this.field1483.field5126;
        }
        if ((var12 / var9 >= this.field1483.field5156) || (this.field1483.field5106 >= var13 / var9)) {
            return;
        }
        class309.field3838 = var4.field6195 * var5.field6204 + var4.field6182 * var5.field6205 + var4.field6167 * var5.field6211 + var4.field6205;
        class461.field6568 = var4.field6195 * var5.field6213 + var4.field6182 * var5.field6182 + var4.field6167 * var5.field6171;
        float var14 = (float) this.field1379 * class461.field6568 + class309.field3838;
        float var15 = (float) this.field1401 * class461.field6568 + class309.field3838;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field1481 + var14) * (float) this.field1483.field5115;
            var17 = ((float) (-this.field1481) + var15) * (float) this.field1483.field5115;
        } else {
            var16 = ((float) this.field1481 + var15) * (float) this.field1483.field5115;
            var17 = (var14 - (float) this.field1481) * (float) this.field1483.field5115;
        }
        if ((var17 / var9 >= this.field1483.field5077) || (this.field1483.field5072 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field1436 != null) {
            class610.field8691 = var4.field6192 * var5.field6200 + var4.field6213 * var5.field6167 + var4.field6200 * var5.field6189;
            class314.field3919 = var4.field6169 * var5.field6192 + var4.field6189 * var5.field6169 + var4.field6171 * var5.field6195;
            class71.field750 = var4.field6195 * var5.field6200 + var4.field6182 * var5.field6167 + var4.field6167 * var5.field6189;
            class215.field2502 = var4.field6192 * var5.field6192 + var4.field6213 * var5.field6195 + var4.field6200 * var5.field6169;
            class467.field6690 = var4.field6169 * var5.field6200 + var4.field6189 * var5.field6189 + var4.field6171 * var5.field6167;
            class27.field284 = var4.field6195 * var5.field6192 + var4.field6182 * var5.field6195 + var4.field6167 * var5.field6169;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1465 + this.field1365 >> 1;
            int var21 = this.field1458 + this.field1406 >> 1;
            int var22 = (int) ((float) var21 * class314.field3919 + (float) this.field1379 * class96.field1010 + (float) var20 * class467.field6690 + class19.field176);
            int var23 = (int) ((float) var21 * class27.field284 + (float) this.field1379 * class461.field6568 + (float) var20 * class71.field750 + class309.field3838);
            int var24 = (int) ((float) var21 * class215.field2502 + (float) this.field1379 * class505.field7210 + (float) var20 * class610.field8691 + class756.field10546);
            if (this.field1483.field5151 <= var24) {
                arg1.field8085 = this.field1483.field5131 + (this.field1483.field5115 * var23 / var24);
                arg1.field8083 = this.field1483.field5126 * var22 / var24 + this.field1483.field5124;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class314.field3919 + (float) this.field1401 * class96.field1010 + (float) var20 * class467.field6690 + class19.field176);
            int var26 = (int) ((float) var21 * class27.field284 + (float) this.field1401 * class461.field6568 + (float) var20 * class71.field750 + class309.field3838);
            int var27 = (int) ((float) var21 * class215.field2502 + (float) this.field1401 * class505.field7210 + (float) var20 * class610.field8691 + class756.field10546);
            if (var27 >= this.field1483.field5151) {
                arg1.field8081 = this.field1483.field5124 + (this.field1483.field5126 * var25 / var27);
                arg1.field8086 = this.field1483.field5115 * var26 / var27 + this.field1483.field5131;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1483.field5151 > var24 && var27 < this.field1483.field5151) {
                    var19 = false;
                } else if (this.field1483.field5151 > var24) {
                    int var28 = (var27 - this.field1483.field5151 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field8083 = this.field1483.field5124 + (this.field1483.field5126 * var29 / this.field1483.field5151);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field8085 = this.field1483.field5115 * var30 / this.field1483.field5151 + this.field1483.field5131;
                } else if (this.field1483.field5151 > var27) {
                    int var31 = (var24 - this.field1483.field5151 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field8083 = this.field1483.field5126 * var32 / this.field1483.field5151 + this.field1483.field5124;
                    arg1.field8085 = this.field1483.field5115 * var33 / this.field1483.field5151 + this.field1483.field5131;
                }
            }
            if (var19) {
                arg1.field8082 = true;
                if (var24 <= var27) {
                    arg1.field8084 = (this.field1481 + var25) * this.field1483.field5126 / var27 + (this.field1483.field5124 - arg1.field8081);
                } else {
                    arg1.field8084 = (this.field1481 + var22) * this.field1483.field5126 / var24 + this.field1483.field5124 - arg1.field8083;
                }
            }
        }
        this.field1483.method2256(1);
        this.field1483.method2239(89, var5);
        this.method829(-58);
        this.method838(true);
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "()Z", line = 5112)
    public final boolean method200() {
        field1448++;
        if (this.field1386 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1386.length; var1++) {
            if (this.field1386[var1] != -1 && !this.field1483.field578.method929(15715, this.field1386[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "(I)V", line = 5137)
    public final void method209(int arg0) {
        field1474++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field1408; var4++) {
            int var7 = this.field1422[var4] * var2 + (this.field1367[var4] * var3) >> 14;
            this.field1422[var4] = this.field1422[var4] * var3 - (this.field1367[var4] * var2) >> 14;
            this.field1367[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1395; var5++) {
            int var6 = this.field1469[var5] * var3 + this.field1414[var5] * var2 >> 14;
            this.field1414[var5] = (short) (this.field1414[var5] * var3 - (this.field1469[var5] * var2) >> 14);
            this.field1469[var5] = (short) var6;
        }
        this.method832(true);
        this.method839(20541);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(B)V", line = 5183)
    public final void method842(byte arg0) {
        field1419++;
        if (this.field1467 != null) {
            this.field1467.method803(7355);
        }
        if (this.field1411 != null) {
            this.field1411.method803(7355);
        }
        if (this.field1478 != null) {
            this.field1478.method803(7355);
        }
        if (this.field1449 != null) {
            this.field1449.method803(7355);
        }
        if (arg0 > -78) {
            this.field1467 = null;
        }
        if (this.field1384 != null) {
            this.field1384.method259(80);
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "()V", line = 5211)
    public final void method223() {
        field1363++;
        if (this.field1395 > 0 && this.field1404 > 0) {
            this.method828((byte) 34);
            this.method844(-1700852319);
            this.method845(-95);
        }
    }

    @OriginalMember(owner = "client!eea", name = "VA", descriptor = "(I)V", line = 5228)
    public final void method214(int arg0) {
        field1415++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field1408; var4++) {
            int var5 = this.field1428[var4] * var2 + this.field1367[var4] * var3 >> 14;
            this.field1428[var4] = this.field1428[var4] * var3 - (this.field1367[var4] * var2) >> 14;
            this.field1367[var4] = var5;
        }
        this.method832(true);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIZ)Lka;", line = 5261)
    public final class470 method237(byte arg0, int arg1, boolean arg2) {
        field1403++;
        class132 var4;
        class132 var5;
        if (arg0 == 1) {
            var4 = this.field1483.field5158;
            var5 = this.field1483.field5177;
        } else if (arg0 == 2) {
            var4 = this.field1483.field5160;
            var5 = this.field1483.field5170;
        } else if (arg0 == 3) {
            var4 = this.field1483.field5164;
            var5 = this.field1483.field5159;
        } else if (arg0 == 4) {
            var5 = this.field1483.field5174;
            var4 = this.field1483.field5166;
        } else if (arg0 == 5) {
            var4 = this.field1483.field5171;
            var5 = this.field1483.field5162;
        } else {
            var4 = var5 = new class132(this.field1483, 0, 0, true, false);
        }
        return this.method833(arg2, -20870, var4, arg1, var5, arg0 != 0);
    }

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "()Z", line = 5311)
    public final boolean method197() {
        field1360++;
        return this.field1402;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "()[Loia;", line = 5319)
    public final class88[] method186() {
        field1452++;
        return this.field1466;
    }

    @OriginalMember(owner = "client!eea", name = "P", descriptor = "(IIII)V", line = 5333)
    public final void method236(int arg0, int arg1, int arg2, int arg3) {
        field1389++;
        if (arg0 == 0) {
            int var5 = 0;
            class247.field3007 = 0;
            class232.field2712 = 0;
            class77.field807 = 0;
            for (int var6 = 0; var6 < this.field1408; var6++) {
                class232.field2712 += this.field1367[var6];
                class247.field3007 += this.field1428[var6];
                var5++;
                class77.field807 += this.field1422[var6];
            }
            if (var5 <= 0) {
                class77.field807 = arg3;
                class247.field3007 = arg2;
                class232.field2712 = arg1;
            } else {
                class247.field3007 = class247.field3007 / var5 + arg2;
                class77.field807 = class77.field807 / var5 + arg3;
                class232.field2712 = class232.field2712 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1408; var7++) {
                this.field1367[var7] += arg1;
                this.field1428[var7] += arg2;
                this.field1422[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1408; var8++) {
                this.field1367[var8] -= class232.field2712;
                this.field1428[var8] -= class247.field3007;
                this.field1422[var8] -= class77.field807;
                if (arg3 != 0) {
                    int var9 = class260.field3230[arg3];
                    int var10 = class260.field3229[arg3];
                    int var11 = this.field1428[var8] * var9 + this.field1367[var8] * var10 + 16383 >> 14;
                    this.field1428[var8] = this.field1428[var8] * var10 - (this.field1367[var8] * var9 - 16383) >> 14;
                    this.field1367[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class260.field3230[arg1];
                    int var13 = class260.field3229[arg1];
                    int var14 = this.field1428[var8] * var13 - (this.field1422[var8] * var12 - 16383) >> 14;
                    this.field1422[var8] = this.field1428[var8] * var12 + this.field1422[var8] * var13 + 16383 >> 14;
                    this.field1428[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class260.field3230[arg2];
                    int var16 = class260.field3229[arg2];
                    int var17 = this.field1422[var8] * var15 + this.field1367[var8] * var16 + 16383 >> 14;
                    this.field1422[var8] = this.field1422[var8] * var16 + 16383 - (this.field1367[var8] * var15) >> 14;
                    this.field1367[var8] = var17;
                }
                this.field1367[var8] += class232.field2712;
                this.field1428[var8] += class247.field3007;
                this.field1422[var8] += class77.field807;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1408; var18++) {
                this.field1367[var18] -= class232.field2712;
                this.field1428[var18] -= class247.field3007;
                this.field1422[var18] -= class77.field807;
                this.field1367[var18] = this.field1367[var18] * arg1 / 128;
                this.field1428[var18] = this.field1428[var18] * arg2 / 128;
                this.field1422[var18] = this.field1422[var18] * arg3 / 128;
                this.field1367[var18] += class232.field2712;
                this.field1428[var18] += class247.field3007;
                this.field1422[var18] += class77.field807;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1387; var19++) {
                int var23 = (this.field1398[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1398[var19] = (byte) var23;
            }
            if (this.field1436 != null) {
                for (int var20 = 0; var20 < this.field1417; var20++) {
                    class30 var21 = this.field1436[var20];
                    class625 var22 = this.field1391[var20];
                    var22.field8979 = 255 - (this.field1398[var21.field353] & 0xFF) << 24 | var22.field8979 & 0xFFFFFF;
                }
            }
            this.method837((byte) -14);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1387; var24++) {
                int var28 = this.field1476[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3C4) >> 7;
                int var31 = var29 + arg1 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1476[var24] = (short) class695.method3919(class695.method3919(var32 << 7, var31 << 10), var34);
            }
            if (this.field1436 != null) {
                for (int var25 = 0; var25 < this.field1417; var25++) {
                    class30 var26 = this.field1436[var25];
                    class625 var27 = this.field1391[var25];
                    var27.field8979 = class721.field10115[this.field1476[var26.field353] & 0xFFFF] & 0xFFFFFF | var27.field8979 & 0xFF000000;
                }
            }
            this.method837((byte) -14);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1417; var35++) {
                class625 var36 = this.field1391[var35];
                var36.field8984 += arg1;
                var36.field8986 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1417; var37++) {
                class625 var38 = this.field1391[var37];
                var38.field8978 = var38.field8978 * arg2 >> 7;
                var38.field8981 = var38.field8981 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1417; var39++) {
                class625 var40 = this.field1391[var39];
                var40.field8976 = var40.field8976 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "LA", descriptor = "(I)V", line = 5648)
    public final void method196(int arg0) {
        this.field1438 = (short) arg0;
        field1429++;
        this.method832(true);
        this.method839(20541);
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(B)V", line = 5661)
    private final void method843(byte arg0) {
        field1372++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        int var10 = -41 / ((-arg0 - 40) / 61);
        for (int var11 = 0; var11 < this.field1408; var11++) {
            int var12 = this.field1367[var11];
            int var13 = this.field1428[var11];
            if (var13 > var6) {
                var6 = var13;
            }
            int var14 = this.field1422[var11];
            if (var2 > var12) {
                var2 = var12;
            }
            if (var5 < var12) {
                var5 = var12;
            }
            if (var13 < var3) {
                var3 = var13;
            }
            if (var14 < var4) {
                var4 = var14;
            }
            if (var14 > var7) {
                var7 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var13 * var13 + (var12 * var12 + (var14 * var14));
            if (var9 < var16) {
                var9 = var16;
            }
        }
        this.field1406 = var7;
        this.field1458 = var4;
        this.field1401 = var6;
        this.field1379 = var3;
        this.field1365 = var2;
        this.field1465 = var5;
        this.field1481 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field1400 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field1374 = true;
    }

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "()I", line = 5743)
    public final int method234() {
        field1418++;
        if (!this.field1374) {
            this.method843((byte) 84);
        }
        return this.field1406;
    }

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "(I)V", line = 5754)
    public final void method205(int arg0) {
        this.field1382 = (short) arg0;
        field1472++;
        this.method837((byte) -14);
    }

    @OriginalMember(owner = "client!eea", name = "ua", descriptor = "()I", line = 5765)
    public final int method213() {
        field1388++;
        return this.field1423;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lln;Luk;IIII)V", line = 5774)
    public class132(class377 arg0, class260 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class150 var7 = arg0.field578;
        int[] var8 = new int[arg1.field3220];
        this.field1413 = new int[arg1.field3204 + 1];
        for (int var9 = 0; var9 < arg1.field3220; var9++) {
            if (arg1.field3217 == null || arg1.field3217[var9] != 2) {
                if (arg1.field3203 != null && arg1.field3203[var9] != -1) {
                    class298 var178 = var7.method931(arg1.field3203[var9] & 0xFFFF, true);
                    if (((this.field1445 & 0x40) == 0 || !var178.field3694) && var178.field3710) {
                        continue;
                    }
                }
                var8[this.field1387++] = var9;
                this.field1413[arg1.field3189[var9]]++;
                this.field1413[arg1.field3179[var9]]++;
                this.field1413[arg1.field3197[var9]]++;
            }
        }
        this.field1404 = this.field1387;
        long[] var10 = new long[this.field1387];
        boolean var11 = (this.field1423 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field1387; var12++) {
            int var161 = var8[var12];
            class298 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field3208 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field3208.length; var168++) {
                    class714 var169 = arg1.field3208[var168];
                    if (var169.field10046 == var161) {
                        class128 var170 = class741.method4128(false, var169.field10043);
                        if (var170.field1336) {
                            var167 = true;
                        }
                        if (var170.field1345 != -1) {
                            class298 var171 = var7.method931(var170.field1345, true);
                            if (var171.field3698 == 2) {
                                this.field1402 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field1404--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field3203 != null) {
                var172 = arg1.field3203[var161];
                if (var172 != -1) {
                    var162 = var7.method931(var172 & 0xFFFF, true);
                    if ((this.field1445 & 0x40) != 0 && var162.field3694) {
                        var172 = -1;
                        var162 = null;
                    } else {
                        var166 = var162.field3695;
                        var165 = var162.field3702;
                    }
                }
            }
            boolean var173 = arg1.field3199 != null && arg1.field3199[var161] != 0 || var162 != null && var162.field3698 != 0;
            if ((var11 || var173) && arg1.field3213 != null) {
                var163 += arg1.field3213[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = ((var165 & 0xFF) << 8) + var163;
            int var175 = (var172 & 0xFFFF << 16) + var164;
            int var176 = (var166 & 0xFF) + var174;
            int var177 = (var12 & 0xFFFF) + var175;
            var10[var12] = ((long) var176 << 32) + (long) var177;
            this.field1402 |= var173;
            this.field1385 |= var162 != null && (var162.field3704 != 0 || var162.field3699 != 0);
        }
        class722.method4024(var8, var10, 0);
        this.field1408 = arg1.field3204;
        this.field1422 = arg1.field3210;
        this.field1428 = arg1.field3192;
        this.field1451 = arg1.field3211;
        this.field1431 = arg1.field3198;
        this.field1367 = arg1.field3226;
        class110[] var13 = new class110[this.field1408];
        this.field1466 = arg1.field3174;
        this.field1396 = arg1.field3172;
        if (arg1.field3208 != null) {
            this.field1417 = arg1.field3208.length;
            this.field1391 = new class625[this.field1417];
            this.field1436 = new class30[this.field1417];
            for (int var14 = 0; var14 < this.field1417; var14++) {
                class714 var15 = arg1.field3208[var14];
                class128 var16 = class741.method4128(false, var15.field10043);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1387; var18++) {
                    if (var8[var18] == var15.field10046) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class721.field10115[arg1.field3190[var15.field10046] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3199 == null ? 0 : arg1.field3199[var15.field10046]) << 24;
                this.field1436[var14] = new class30(var17, arg1.field3189[var15.field10046], arg1.field3179[var15.field10046], arg1.field3197[var15.field10046], var16.field1337, var16.field1344, var16.field1345, var16.field1348, var16.field1346, var16.field1336, var16.field1343, var15.field10042);
                this.field1391[var14] = new class625(var20);
            }
        }
        int var21 = this.field1387 * 3;
        this.field1460 = new short[var21];
        this.field1438 = (short) arg4;
        this.field1359 = new short[var21];
        this.field1414 = new short[var21];
        if (arg1.field3191 != null) {
            this.field1369 = new short[this.field1387];
        }
        this.field1476 = new short[this.field1387];
        this.field1382 = (short) arg3;
        this.field1399 = new short[this.field1387];
        this.field1386 = new short[this.field1387];
        this.field1420 = new float[var21];
        this.field1469 = new short[var21];
        class128.field1350 = new long[var21];
        this.field1398 = new byte[this.field1387];
        this.field1427 = new byte[var21];
        this.field1392 = new short[this.field1387];
        this.field1484 = new short[this.field1387];
        this.field1463 = new short[var21];
        this.field1361 = new float[var21];
        this.field1433 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3204; var23++) {
            int var160 = this.field1413[var23];
            this.field1413[var23] = var22;
            var22 += var160;
            var13[var23] = new class110();
        }
        this.field1413[arg1.field3204] = var22;
        class74 var24 = class366.method2134(arg1, var8, this.field1387, -112);
        class176[] var25 = new class176[arg1.field3220];
        for (int var26 = 0; var26 < arg1.field3220; var26++) {
            short var139 = arg1.field3189[var26];
            short var140 = arg1.field3179[var26];
            short var141 = arg1.field3197[var26];
            int var142 = this.field1367[var140] - this.field1367[var139];
            int var143 = this.field1428[var140] - this.field1428[var139];
            int var144 = this.field1422[var140] - this.field1422[var139];
            int var145 = this.field1367[var141] - this.field1367[var139];
            int var146 = this.field1428[var141] - this.field1428[var139];
            int var147 = this.field1422[var141] - this.field1422[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150;
            for (var150 = var142 * var146 - (var143 * var145); var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192; var150 >>= 0x1) {
                var148 >>= 0x1;
                var149 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var150 * var150 + var148 * var148 + var149 * var149));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var148 * 256 / var151;
            int var153 = var149 * 256 / var151;
            int var154 = var150 * 256 / var151;
            byte var155 = arg1.field3217 == null ? 0 : arg1.field3217[var26];
            if (var155 == 0) {
                class110 var156 = var13[var139];
                var156.field1165++;
                var156.field1164 += var152;
                var156.field1163 += var154;
                var156.field1168 += var153;
                class110 var157 = var13[var140];
                var157.field1163 += var154;
                var157.field1168 += var153;
                var157.field1164 += var152;
                var157.field1165++;
                class110 var158 = var13[var141];
                var158.field1163 += var154;
                var158.field1165++;
                var158.field1168 += var153;
                var158.field1164 += var152;
            } else if (var155 == 1) {
                class176 var159 = var25[var26] = new class176();
                var159.field2065 = var153;
                var159.field2072 = var152;
                var159.field2070 = var154;
            }
        }
        for (int var27 = 0; var27 < this.field1387; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field3190[var48] & 0xFFFF;
            int var50;
            if (arg1.field3184 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field3184[var48];
            }
            int var51;
            if (arg1.field3199 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field3199[var48] & 0xFF;
            }
            short var52 = arg1.field3203 == null ? -1 : arg1.field3203[var48];
            if (var52 != -1 && (this.field1445 & 0x40) != 0) {
                class298 var53 = var7.method931(var52 & 0xFFFF, true);
                if (var53.field3694) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var58 = 0.0F;
                    var57 = 1.0F;
                    var59 = 0.0F;
                    var54 = 0.0F;
                    var61 = 2;
                    var56 = 1.0F;
                    var55 = 1.0F;
                    var60 = 1;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field3218[var50];
                    if (var63 == 0) {
                        short var92 = arg1.field3189[var48];
                        short var93 = arg1.field3179[var48];
                        short var94 = arg1.field3197[var48];
                        short var95 = arg1.field3176[var50];
                        short var96 = arg1.field3183[var50];
                        short var97 = arg1.field3188[var50];
                        float var98 = (float) arg1.field3226[var95];
                        float var99 = (float) arg1.field3192[var95];
                        float var100 = (float) arg1.field3210[var95];
                        float var101 = (float) arg1.field3226[var96] - var98;
                        float var102 = (float) arg1.field3192[var96] - var99;
                        float var103 = (float) arg1.field3210[var96] - var100;
                        float var104 = (float) arg1.field3226[var97] - var98;
                        float var105 = (float) arg1.field3192[var97] - var99;
                        float var106 = (float) arg1.field3210[var97] - var100;
                        float var107 = (float) arg1.field3226[var92] - var98;
                        float var108 = (float) arg1.field3192[var92] - var99;
                        float var109 = (float) arg1.field3210[var92] - var100;
                        float var110 = (float) arg1.field3226[var93] - var98;
                        float var111 = (float) arg1.field3192[var93] - var99;
                        float var112 = (float) arg1.field3210[var93] - var100;
                        float var113 = (float) arg1.field3226[var94] - var98;
                        float var114 = (float) arg1.field3192[var94] - var99;
                        float var115 = (float) arg1.field3210[var94] - var100;
                        float var116 = var102 * var106 - var103 * var105;
                        float var117 = var103 * var104 - var101 * var106;
                        float var118 = var101 * var105 - var102 * var104;
                        float var119 = var105 * var118 - (var106 * var117);
                        float var120 = var106 * var116 - var104 * var118;
                        float var121 = var104 * var117 - var105 * var116;
                        float var122 = 1.0F / (var103 * var121 + var101 * var119 + var102 * var120);
                        var56 = (var112 * var121 + var110 * var119 + var111 * var120) * var122;
                        var54 = (var109 * var121 + var107 * var119 + var108 * var120) * var122;
                        var58 = (var115 * var121 + var113 * var119 + var114 * var120) * var122;
                        float var123 = var103 * var116 - var101 * var118;
                        float var124 = var101 * var117 - (var102 * var116);
                        float var125 = var102 * var118 - (var103 * var117);
                        float var126 = 1.0F / (var106 * var124 + var104 * var125 + var105 * var123);
                        var55 = (var109 * var124 + var107 * var125 + var108 * var123) * var126;
                        var59 = (var115 * var124 + var113 * var125 + var114 * var123) * var126;
                        var57 = (var112 * var124 + var110 * var125 + var111 * var123) * var126;
                    } else {
                        short var64 = arg1.field3189[var48];
                        short var65 = arg1.field3179[var48];
                        short var66 = arg1.field3197[var48];
                        int var67 = var24.field771[var50];
                        int var68 = var24.field775[var50];
                        int var69 = var24.field774[var50];
                        float[] var70 = var24.field770[var50];
                        byte var71 = arg1.field3202[var50];
                        float var72 = (float) arg1.field3177[var50] / 256.0F;
                        if (var63 == 1) {
                            float var73 = (float) arg1.field3227[var50] / 1024.0F;
                            class741.method4127(var68, var73, var67, arg1.field3192[var64], arg1.field3226[var64], var72, var69, class661.field9434, var70, true, arg1.field3210[var64], var71);
                            var55 = class661.field9434[1];
                            var54 = class661.field9434[0];
                            class741.method4127(var68, var73, var67, arg1.field3192[var65], arg1.field3226[var65], var72, var69, class661.field9434, var70, true, arg1.field3210[var65], var71);
                            var57 = class661.field9434[1];
                            var56 = class661.field9434[0];
                            class741.method4127(var68, var73, var67, arg1.field3192[var66], arg1.field3226[var66], var72, var69, class661.field9434, var70, true, arg1.field3210[var66], var71);
                            var59 = class661.field9434[1];
                            var58 = class661.field9434[0];
                            float var74 = var73 / 2.0F;
                            if ((var71 & 0x1) == 0) {
                                if ((var74 < var56 - var54)) {
                                    var60 = 1;
                                    var56 -= var73;
                                } else if (var54 - var56 > var74) {
                                    var60 = 2;
                                    var56 += var73;
                                }
                                if (var58 - var54 > var74) {
                                    var61 = 1;
                                    var58 -= var73;
                                } else if (var74 < var54 - var58) {
                                    var61 = 2;
                                    var58 += var73;
                                }
                            } else {
                                if ((var59 - var55 > var74)) {
                                    var61 = 1;
                                    var59 -= var73;
                                } else if (var74 < var55 - var59) {
                                    var59 += var73;
                                    var61 = 2;
                                }
                                if (var57 - var55 > var74) {
                                    var60 = 1;
                                    var57 -= var73;
                                } else if (var74 < var55 - var57) {
                                    var60 = 2;
                                    var57 += var73;
                                }
                            }
                        } else if (var63 == 2) {
                            float var75 = (float) arg1.field3223[var50] / 256.0F;
                            float var76 = (float) arg1.field3195[var50] / 256.0F;
                            int var77 = arg1.field3226[var65] - arg1.field3226[var64];
                            int var78 = arg1.field3192[var65] - arg1.field3192[var64];
                            int var79 = arg1.field3210[var65] - arg1.field3210[var64];
                            int var80 = arg1.field3226[var66] - arg1.field3226[var64];
                            int var81 = arg1.field3192[var66] - arg1.field3192[var64];
                            int var82 = arg1.field3210[var66] - arg1.field3210[var64];
                            int var83 = var78 * var82 - (var79 * var81);
                            int var84 = var79 * var80 - (var77 * var82);
                            int var85 = var77 * var81 - (var78 * var80);
                            float var86 = 64.0F / (float) arg1.field3212[var50];
                            float var87 = 64.0F / (float) arg1.field3196[var50];
                            float var88 = 64.0F / (float) arg1.field3227[var50];
                            float var89 = (var70[2] * (float) var85 + var70[1] * (float) var84 + var70[0] * (float) var83) / var86;
                            float var90 = (var70[5] * (float) var85 + var70[4] * (float) var84 + var70[3] * (float) var83) / var87;
                            float var91 = (var70[8] * (float) var85 + var70[6] * (float) var83 + var70[7] * (float) var84) / var88;
                            var62 = class417.method2586((byte) -121, var90, var89, var91);
                            class336.method2000(var76, arg1.field3210[var64], var75, class661.field9434, var67, arg1.field3226[var64], var62, arg1.field3192[var64], 28795, var71, var69, var72, var68, var70);
                            var55 = class661.field9434[1];
                            var54 = class661.field9434[0];
                            class336.method2000(var76, arg1.field3210[var65], var75, class661.field9434, var67, arg1.field3226[var65], var62, arg1.field3192[var65], 28795, var71, var69, var72, var68, var70);
                            var57 = class661.field9434[1];
                            var56 = class661.field9434[0];
                            class336.method2000(var76, arg1.field3210[var66], var75, class661.field9434, var67, arg1.field3226[var66], var62, arg1.field3192[var66], 28795, var71, var69, var72, var68, var70);
                            var59 = class661.field9434[1];
                            var58 = class661.field9434[0];
                        } else if (var63 == 3) {
                            class202.method1222(arg1.field3226[var64], (byte) -96, var71, var68, var70, arg1.field3192[var64], class661.field9434, var72, var69, var67, arg1.field3210[var64]);
                            var55 = class661.field9434[1];
                            var54 = class661.field9434[0];
                            class202.method1222(arg1.field3226[var65], (byte) -110, var71, var68, var70, arg1.field3192[var65], class661.field9434, var72, var69, var67, arg1.field3210[var65]);
                            var56 = class661.field9434[0];
                            var57 = class661.field9434[1];
                            class202.method1222(arg1.field3226[var66], (byte) -122, var71, var68, var70, arg1.field3192[var66], class661.field9434, var72, var69, var67, arg1.field3210[var66]);
                            var58 = class661.field9434[0];
                            var59 = class661.field9434[1];
                            if ((var71 & 0x1) == 0) {
                                if (var58 - var54 > 0.5F) {
                                    var58--;
                                    var61 = 1;
                                } else if (var54 - var58 > 0.5F) {
                                    var61 = 2;
                                    var58++;
                                }
                                if ((var56 - var54 > 0.5F)) {
                                    var56--;
                                    var60 = 1;
                                } else if (var54 - var56 > 0.5F) {
                                    var56++;
                                    var60 = 2;
                                }
                            } else {
                                if ((var59 - var55 > 0.5F)) {
                                    var61 = 1;
                                    var59--;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                                if (var57 - var55 > 0.5F) {
                                    var60 = 1;
                                    var57--;
                                } else if (var55 - var57 > 0.5F) {
                                    var57++;
                                    var60 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field3217 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field3217[var48];
            }
            if (var127 == 0) {
                long var128 = ((long) (var62 << 24) + (long) var51 + (long) (var49 << 8) << 32) + (long) (var50 << 2);
                short var130 = arg1.field3189[var48];
                short var131 = arg1.field3179[var48];
                short var132 = arg1.field3197[var48];
                class110 var133 = var13[var130];
                this.field1392[var27] = this.method841(var128, var130, true, var27, var133.field1164, var133.field1163, var133.field1168, arg1, var54, var133.field1165, var55);
                class110 var134 = var13[var131];
                this.field1399[var27] = this.method841((long) var60 + var128, var131, true, var27, var134.field1164, var134.field1163, var134.field1168, arg1, var56, var134.field1165, var57);
                class110 var135 = var13[var132];
                this.field1484[var27] = this.method841((long) var61 + var128, var132, true, var27, var135.field1164, var135.field1163, var135.field1168, arg1, var58, var135.field1165, var59);
            } else if (var127 == 1) {
                class176 var136 = var25[var48];
                long var137 = (long) ((var136.field2065 + 256 << 12) + (var50 << 2) + ((var136.field2072 > 0 ? 1024 : 2048) - -(var136.field2070 + 256 << 22))) + ((long) (var62 << 24) + (long) var51 + (long) (var49 << 8) << 32);
                this.field1392[var27] = this.method841(var137, arg1.field3189[var48], true, var27, var136.field2072, var136.field2070, var136.field2065, arg1, var54, 0, var55);
                this.field1399[var27] = this.method841((long) var60 + var137, arg1.field3179[var48], true, var27, var136.field2072, var136.field2070, var136.field2065, arg1, var56, 0, var57);
                this.field1484[var27] = this.method841((long) var61 + var137, arg1.field3197[var48], true, var27, var136.field2072, var136.field2070, var136.field2065, arg1, var58, 0, var59);
            }
            if (arg1.field3199 != null) {
                this.field1398[var27] = arg1.field3199[var48];
            }
            if (arg1.field3191 != null) {
                this.field1369[var27] = arg1.field3191[var48];
            }
            this.field1476[var27] = arg1.field3190[var48];
            this.field1386[var27] = var52;
        }
        if (this.field1404 > 0) {
            int var28 = 1;
            short var29 = this.field1386[0];
            for (int var30 = 0; var30 < this.field1404; var30++) {
                short var40 = this.field1386[var30];
                if (var29 != var40) {
                    var29 = var40;
                    var28++;
                }
            }
            this.field1471 = new int[var28];
            this.field1435 = new int[var28 + 1];
            this.field1362 = new int[var28];
            this.field1435[0] = 0;
            int var31 = this.field1395;
            int var32 = 0;
            short var33 = 0;
            short var34 = this.field1386[0];
            for (int var35 = 0; var35 < this.field1404; var35++) {
                short var36 = this.field1386[var35];
                if (var34 != var36) {
                    this.field1362[var32] = var31;
                    this.field1471[var32] = var33 + 1 - var31;
                    var32++;
                    this.field1435[var32] = var35;
                    var33 = 0;
                    var31 = this.field1395;
                    var34 = var36;
                }
                short var37 = this.field1392[var35];
                if (var37 > var33) {
                    var33 = var37;
                }
                if (var31 > var37) {
                    var31 = var37;
                }
                short var38 = this.field1399[var35];
                if (var38 > var33) {
                    var33 = var38;
                }
                if (var31 > var38) {
                    var31 = var38;
                }
                short var39 = this.field1484[var35];
                if (var39 > var33) {
                    var33 = var39;
                }
                if (var39 < var31) {
                    var31 = var39;
                }
            }
            this.field1362[var32] = var31;
            this.field1471[var32] = var33 + 1 - var31;
            var32++;
            this.field1435[var32] = this.field1404;
        }
        class128.field1350 = null;
        this.field1463 = class169.method1056(false, this.field1463, this.field1395);
        this.field1359 = class169.method1056(false, this.field1359, this.field1395);
        this.field1469 = class169.method1056(false, this.field1469, this.field1395);
        this.field1433 = class169.method1056(false, this.field1433, this.field1395);
        this.field1414 = class169.method1056(false, this.field1414, this.field1395);
        this.field1427 = class581.method3346(this.field1427, 0, this.field1395);
        this.field1361 = class615.method3478(this.field1361, -95, this.field1395);
        this.field1420 = class615.method3478(this.field1420, 123, this.field1395);
        if (arg1.field3173 != null && class368.method2147(this.field1445, 63, arg2)) {
            this.field1390 = arg1.method1550((byte) 125, false);
        }
        if (arg1.field3208 != null && class621.method3553(this.field1445, true, arg2)) {
            this.field1410 = arg1.method1555(119);
        }
        if (arg1.field3186 != null && class757.method4208(-1, arg2, this.field1445)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field1387; var43++) {
                int var47 = arg1.field3186[var8[var43]];
                if (var47 >= 0) {
                    if (var47 > var41) {
                        var41 = var47;
                    }
                    int var10002 = var42[var47]++;
                }
            }
            this.field1426 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field1426[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field1387; var45++) {
                int var46 = arg1.field3186[var8[var45]];
                if (var46 >= 0) {
                    this.field1426[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "V", descriptor = "()I", line = 6676)
    public final int method221() {
        if (!this.field1374) {
            this.method843((byte) -101);
        }
        field1479++;
        return this.field1365;
    }

    @OriginalMember(owner = "client!eea", name = "HA", descriptor = "()I", line = 6689)
    public final int method238() {
        if (!this.field1374) {
            this.method843((byte) -101);
        }
        field1405++;
        return this.field1458;
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)Z", line = 6702)
    private final boolean method844(int arg0) {
        field1439++;
        if (this.field1384.field495) {
            return true;
        }
        if (this.field1384.field490 == null) {
            this.field1384.field490 = this.field1483.method2235(this.field1480, 9);
        }
        class543 var2 = this.field1384.field490;
        var2.method267(arg0 + 1700883222, this.field1404 * 6);
        Buffer var3 = var2.method263(13931, true);
        if (arg0 != -1700852319) {
            this.field1402 = true;
        }
        if (var3 != null) {
            Stream var4 = this.field1483.method2299(var3, 0);
            if (Stream.method3823()) {
                for (int var5 = 0; var5 < this.field1404; var5++) {
                    var4.method3820(this.field1392[var5]);
                    var4.method3820(this.field1399[var5]);
                    var4.method3820(this.field1484[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field1404; var6++) {
                    var4.method3816(this.field1392[var6]);
                    var4.method3816(this.field1399[var6]);
                    var4.method3816(this.field1484[var6]);
                }
            }
            var4.method3821();
            if (var2.method266(-19067)) {
                this.field1383 = true;
                this.field1384.field499 = var2;
                this.field1384.field495 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "ba", descriptor = "(Lr;)Lr;", line = 6774)
    public final class182 method194(class182 arg0) {
        field1407++;
        if (this.field1395 == 0) {
            return null;
        }
        if (!this.field1374) {
            this.method843((byte) 54);
        }
        int var2;
        int var3;
        if (this.field1483.field5144 <= 0) {
            var2 = this.field1365 - (this.field1483.field5144 * this.field1379 >> 8) >> this.field1483.field5103;
            var3 = this.field1465 - (this.field1483.field5144 * this.field1401 >> 8) >> this.field1483.field5103;
        } else {
            var2 = this.field1365 - (this.field1483.field5144 * this.field1401 >> 8) >> this.field1483.field5103;
            var3 = this.field1465 - (this.field1483.field5144 * this.field1379 >> 8) >> this.field1483.field5103;
        }
        int var4;
        int var5;
        if (this.field1483.field5083 <= 0) {
            var4 = this.field1458 - (this.field1483.field5083 * this.field1379 >> 8) >> this.field1483.field5103;
            var5 = this.field1406 - (this.field1483.field5083 * this.field1401 >> 8) >> this.field1483.field5103;
        } else {
            var4 = this.field1458 - (this.field1483.field5083 * this.field1401 >> 8) >> this.field1483.field5103;
            var5 = this.field1406 - (this.field1483.field5083 * this.field1379 >> 8) >> this.field1483.field5103;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class192 var8 = (class192) arg0;
        class192 var9;
        if (var8 != null && var8.method1163(13793, var6, var7)) {
            var9 = var8;
            var8.method1171(0);
        } else {
            var9 = new class192(this.field1483, var6, var7);
        }
        var9.method1166(-1778027312, var5, var4, var2, var3);
        this.method835(var9, (byte) 103);
        return var9;
    }

    @OriginalMember(owner = "client!eea", name = "EA", descriptor = "()I", line = 6842)
    public final int method193() {
        if (!this.field1374) {
            this.method843((byte) -111);
        }
        field1373++;
        return this.field1401;
    }

    @OriginalMember(owner = "client!eea", name = "NA", descriptor = "()Z", line = 6855)
    public final boolean method208() {
        field1464++;
        if (this.field1390 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1431; var1++) {
            this.field1367[var1] <<= 0x4;
            this.field1428[var1] <<= 0x4;
            this.field1422[var1] <<= 0x4;
        }
        class232.field2712 = 0;
        class247.field3007 = 0;
        class77.field807 = 0;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "()Z", line = 6888)
    public final boolean method202() {
        field1375++;
        return this.field1385;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ldfa;Lim;II)V", line = 6896)
    public final void method188(class165 arg0, class569 arg1, int arg2, int arg3) {
        field1425++;
        if (this.field1395 == 0) {
            return;
        }
        class427 var5 = this.field1483.field5051;
        class427 var6 = (class427) arg0;
        if (!this.field1374) {
            this.method843((byte) 114);
        }
        class505.field7210 = var5.field6192 * var6.field6213 + var5.field6213 * var6.field6182 + var5.field6200 * var6.field6171;
        class756.field10546 = var5.field6192 * var6.field6204 + var5.field6213 * var6.field6205 + var5.field6200 * var6.field6211 + var5.field6204;
        float var7 = (float) this.field1379 * class505.field7210 + class756.field10546;
        float var8 = (float) this.field1401 * class505.field7210 + class756.field10546;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field1481 + var7;
            var10 = var8 - (float) this.field1481;
        } else {
            var10 = (float) (-this.field1481) + var7;
            var9 = (float) this.field1481 + var8;
        }
        if ((this.field1483.field5112 <= var10) || (var9 <= (float) this.field1483.field5151)) {
            return;
        }
        class96.field1010 = var5.field6169 * var6.field6213 + var5.field6189 * var6.field6171 + var5.field6171 * var6.field6182;
        class19.field176 = var5.field6169 * var6.field6204 + var5.field6189 * var6.field6211 + var5.field6171 * var6.field6205 + var5.field6211;
        float var11 = (float) this.field1379 * class96.field1010 + class19.field176;
        float var12 = (float) this.field1401 * class96.field1010 + class19.field176;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field1481 + var11) * (float) this.field1483.field5126;
            var13 = (var12 - (float) this.field1481) * (float) this.field1483.field5126;
        } else {
            var13 = ((float) (-this.field1481) + var11) * (float) this.field1483.field5126;
            var14 = ((float) this.field1481 + var12) * (float) this.field1483.field5126;
        }
        if ((this.field1483.field5156 <= var13 / (float) arg2) || (this.field1483.field5106 >= var14 / (float) arg2)) {
            return;
        }
        class461.field6568 = var5.field6195 * var6.field6213 + var5.field6182 * var6.field6182 + var5.field6167 * var6.field6171;
        class309.field3838 = var5.field6195 * var6.field6204 + var5.field6182 * var6.field6205 + var5.field6167 * var6.field6211 + var5.field6205;
        float var15 = (float) this.field1379 * class461.field6568 + class309.field3838;
        float var16 = (float) this.field1401 * class461.field6568 + class309.field3838;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field1481 + var15) * (float) this.field1483.field5115;
            var18 = ((float) (-this.field1481) + var16) * (float) this.field1483.field5115;
        } else {
            var17 = ((float) this.field1481 + var16) * (float) this.field1483.field5115;
            var18 = ((float) (-this.field1481) + var15) * (float) this.field1483.field5115;
        }
        if ((this.field1483.field5077 <= var18 / (float) arg2) || (this.field1483.field5072 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field1436 != null) {
            class610.field8691 = var6.field6200 * var5.field6192 + var5.field6213 * var6.field6167 + var5.field6200 * var6.field6189;
            class27.field284 = var5.field6195 * var6.field6192 + var5.field6182 * var6.field6195 + var5.field6167 * var6.field6169;
            class467.field6690 = var5.field6169 * var6.field6200 + var5.field6189 * var6.field6189 + var5.field6171 * var6.field6167;
            class71.field750 = var5.field6195 * var6.field6200 + var5.field6182 * var6.field6167 + var5.field6167 * var6.field6189;
            class314.field3919 = var5.field6169 * var6.field6192 + var5.field6189 * var6.field6169 + var5.field6171 * var6.field6195;
            class215.field2502 = var5.field6192 * var6.field6192 + var5.field6213 * var6.field6195 + var5.field6200 * var6.field6169;
        }
        if (arg1 != null) {
            int var19 = this.field1465 + this.field1365 >> 1;
            int var20 = this.field1458 + this.field1406 >> 1;
            int var21 = (int) ((float) var20 * class314.field3919 + (float) this.field1379 * class96.field1010 + (float) var19 * class467.field6690 + class19.field176);
            int var22 = (int) ((float) var20 * class27.field284 + (float) this.field1379 * class461.field6568 + (float) var19 * class71.field750 + class309.field3838);
            int var23 = (int) ((float) var20 * class215.field2502 + (float) this.field1379 * class505.field7210 + (float) var19 * class610.field8691 + class756.field10546);
            int var24 = (int) ((float) var20 * class314.field3919 + (float) this.field1401 * class96.field1010 + (float) var19 * class467.field6690 + class19.field176);
            int var25 = (int) ((float) var20 * class27.field284 + (float) this.field1401 * class461.field6568 + (float) var19 * class71.field750 + class309.field3838);
            arg1.field8086 = this.field1483.field5115 * var25 / arg2 + this.field1483.field5131;
            arg1.field8083 = this.field1483.field5124 + (this.field1483.field5126 * var21 / arg2);
            int var26 = (int) ((float) var20 * class215.field2502 + (float) this.field1401 * class505.field7210 + (float) var19 * class610.field8691 + class756.field10546);
            arg1.field8085 = this.field1483.field5131 + (this.field1483.field5115 * var22 / arg2);
            arg1.field8081 = this.field1483.field5126 * var24 / arg2 + this.field1483.field5124;
            if (var23 >= this.field1483.field5151 || this.field1483.field5151 <= var26) {
                arg1.field8084 = (this.field1481 + var21) * this.field1483.field5126 / arg2 + this.field1483.field5124 - arg1.field8083;
                arg1.field8082 = true;
            }
        }
        this.field1483.method2212(3, (float) arg2);
        this.field1483.method2218((byte) -112);
        this.field1483.method2239(14, var6);
        this.method829(-97);
        this.method838(true);
    }

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "()V", line = 7045)
    public final void method233() {
        field1447++;
        for (int var1 = 0; var1 < this.field1408; var1++) {
            this.field1422[var1] = -this.field1422[var1];
        }
        for (int var2 = 0; var2 < this.field1395; var2++) {
            this.field1414[var2] = (short) (-this.field1414[var2]);
        }
        for (int var3 = 0; var3 < this.field1387; var3++) {
            short var4 = this.field1392[var3];
            this.field1392[var3] = this.field1484[var3];
            this.field1484[var3] = var4;
        }
        this.method832(true);
        this.method839(20541);
        this.method834((byte) -106);
        this.field1374 = false;
    }

    @OriginalMember(owner = "client!eea", name = "fa", descriptor = "()I", line = 7087)
    public final int method190() {
        field1397++;
        if (!this.field1374) {
            this.method843((byte) -106);
        }
        return this.field1379;
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V", line = 7102)
    private final void method845(int arg0) {
        if (arg0 > -62) {
            this.field1414 = null;
        }
        field1461++;
        if (!this.field1383) {
            return;
        }
        this.field1383 = false;
        if (this.field1396 == null && this.field1466 == null && this.field1436 == null) {
            if (this.field1367 != null && !class750.method4177(this.field1423, (byte) 64, this.field1445)) {
                if (this.field1467 == null || this.field1467.method804(-104)) {
                    if (!this.field1374) {
                        this.method843((byte) -121);
                    }
                    this.field1367 = null;
                } else {
                    this.field1383 = true;
                }
            }
            if (this.field1428 != null && !class47.method273(this.field1423, (byte) 102, this.field1445)) {
                if (this.field1467 == null || this.field1467.method804(122)) {
                    if (!this.field1374) {
                        this.method843((byte) 46);
                    }
                    this.field1428 = null;
                } else {
                    this.field1383 = true;
                }
            }
            if (this.field1422 != null && !class260.method1561(this.field1445, this.field1423, (byte) -47)) {
                if (this.field1467 == null || this.field1467.method804(81)) {
                    if (!this.field1374) {
                        this.method843((byte) 122);
                    }
                    this.field1422 = null;
                } else {
                    this.field1383 = true;
                }
            }
        }
        if (this.field1460 != null && this.field1367 == null && this.field1428 == null && this.field1422 == null) {
            this.field1460 = null;
            this.field1413 = null;
        }
        if (this.field1427 != null && !class660.method3760(1, this.field1423, this.field1445)) {
            label203: {
                label202: {
                    boolean var10000;
                    if ((this.field1445 & 0x37) == 0) {
                        if (this.field1478 == null || this.field1478.method804(-117)) {
                            break label202;
                        }
                        var10000 = false;
                    } else {
                        if (this.field1449 == null || this.field1449.method804(-73)) {
                            break label202;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field1383 = true;
                        break label203;
                    }
                }
                this.field1427 = null;
                this.field1469 = this.field1433 = this.field1414 = null;
            }
        }
        if (this.field1476 != null && !class50.method282(this.field1423, (byte) 104, this.field1445)) {
            if (this.field1478 == null || this.field1478.method804(-62)) {
                this.field1476 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1398 != null && !class567.method3302(this.field1423, 16672, this.field1445)) {
            if (this.field1478 == null || this.field1478.method804(-41)) {
                this.field1398 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1361 != null && !class613.method3468(this.field1423, 109, this.field1445)) {
            if (this.field1411 == null || this.field1411.method804(-95)) {
                this.field1361 = this.field1420 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1386 != null && !class208.method1235(true, this.field1445, this.field1423)) {
            if (this.field1478 == null || this.field1478.method804(104)) {
                this.field1386 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1392 != null && !class205.method1229((byte) -87, this.field1445, this.field1423)) {
            if ((this.field1384 == null || this.field1384.method258((byte) 120)) && (this.field1478 == null || this.field1478.method804(-59))) {
                this.field1392 = this.field1399 = this.field1484 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1463 != null) {
            if (this.field1467 == null || this.field1467.method804(94)) {
                this.field1463 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1359 != null) {
            if (this.field1478 == null || this.field1478.method804(-27)) {
                this.field1359 = null;
            } else {
                this.field1383 = true;
            }
        }
        if (this.field1426 != null && !class757.method4208(-1, this.field1423, this.field1445)) {
            this.field1369 = null;
            this.field1426 = null;
        }
        if (this.field1390 != null && !class368.method2147(this.field1445, 63, this.field1423)) {
            this.field1451 = null;
            this.field1390 = null;
        }
        if (this.field1410 != null && !class621.method3553(this.field1445, true, this.field1423)) {
            this.field1410 = null;
        }
        if (this.field1435 != null && (this.field1423 & 0x800) == 0 && (this.field1423 & 0x40000) == 0) {
            this.field1471 = null;
            this.field1362 = null;
            this.field1435 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "(B)V", line = 7283)
    public static final void method846(byte arg0) {
        class541.field7782.method1758(-38);
        field1477++;
        if (arg0 <= -111) {
            class101.field1046.method1758(122);
        }
    }
}
