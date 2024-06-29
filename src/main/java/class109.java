import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class109 extends class474 {

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    private int field1362 = 0;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    private int field1382 = 0;

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
    private int field1396 = 0;

    @OriginalMember(owner = "client!hq", name = "wb", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!hq", name = "Ib", descriptor = "I")
    private int field1436 = 0;

    @OriginalMember(owner = "client!hq", name = "ac", descriptor = "I")
    private int field1454 = 0;

    @OriginalMember(owner = "client!hq", name = "gc", descriptor = "Z")
    private boolean field1460 = true;

    @OriginalMember(owner = "client!hq", name = "Db", descriptor = "Lug;")
    private class395 field1431;

    @OriginalMember(owner = "client!hq", name = "zb", descriptor = "Log;")
    private class460 field1427;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "Log;")
    private class460 field1379;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "Log;")
    private class460 field1377;

    @OriginalMember(owner = "client!hq", name = "Jb", descriptor = "Log;")
    private class460 field1437;

    @OriginalMember(owner = "client!hq", name = "V", descriptor = "Lig;")
    private class162 field1397;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!hq", name = "hc", descriptor = "[I")
    private int[] field1461;

    @OriginalMember(owner = "client!hq", name = "tb", descriptor = "[I")
    private int[] field1421;

    @OriginalMember(owner = "client!hq", name = "lb", descriptor = "[I")
    private int[] field1413;

    @OriginalMember(owner = "client!hq", name = "Xb", descriptor = "[S")
    private short[] field1451;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
    private int[] field1366;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lew;")
    private class342[] field1371;

    @OriginalMember(owner = "client!hq", name = "Sb", descriptor = "[Lfs;")
    private class390[] field1446;

    @OriginalMember(owner = "client!hq", name = "jb", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!hq", name = "Nb", descriptor = "[Lle;")
    private class202[] field1441;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "[Lfv;")
    private class78[] field1389;

    @OriginalMember(owner = "client!hq", name = "ob", descriptor = "[S")
    private short[] field1416;

    @OriginalMember(owner = "client!hq", name = "Ab", descriptor = "[S")
    private short[] field1428;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "[B")
    private byte[] field1380;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "[F")
    private float[] field1370;

    @OriginalMember(owner = "client!hq", name = "T", descriptor = "S")
    private short field1395;

    @OriginalMember(owner = "client!hq", name = "lc", descriptor = "[S")
    private short[] field1465;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "[S")
    private short[] field1388;

    @OriginalMember(owner = "client!hq", name = "hb", descriptor = "[B")
    private byte[] field1409;

    @OriginalMember(owner = "client!hq", name = "Ob", descriptor = "[S")
    private short[] field1442;

    @OriginalMember(owner = "client!hq", name = "Vb", descriptor = "S")
    private short field1449;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[F")
    private float[] field1363;

    @OriginalMember(owner = "client!hq", name = "Kb", descriptor = "[S")
    private short[] field1438;

    @OriginalMember(owner = "client!hq", name = "kb", descriptor = "[S")
    private short[] field1412;

    @OriginalMember(owner = "client!hq", name = "bb", descriptor = "[S")
    private short[] field1403;

    @OriginalMember(owner = "client!hq", name = "W", descriptor = "[S")
    private short[] field1398;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "[S")
    private short[] field1373;

    @OriginalMember(owner = "client!hq", name = "ec", descriptor = "[I")
    private int[] field1458;

    @OriginalMember(owner = "client!hq", name = "ub", descriptor = "[[I")
    private int[][] field1422;

    @OriginalMember(owner = "client!hq", name = "rb", descriptor = "[[I")
    private int[][] field1419;

    @OriginalMember(owner = "client!hq", name = "rc", descriptor = "[[I")
    private int[][] field1471;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!hq", name = "cc", descriptor = "Lfg;")
    public static class84 field1456 = class106.method782(27059);

    @OriginalMember(owner = "client!hq", name = "tc", descriptor = "Lkg;")
    public static class179 field1473 = new class179(43, 4);

    @OriginalMember(owner = "client!hq", name = "vc", descriptor = "I")
    public static int field1475 = 1407;

    @OriginalMember(owner = "client!hq", name = "uc", descriptor = "Ldq;")
    public static class493 field1474 = new class493(92, 1);

    @OriginalMember(owner = "client!hq", name = "wc", descriptor = "Ljk;")
    public static class449 field1476 = new class449(20);

    @OriginalMember(owner = "client!hq", name = "xc", descriptor = "S")
    public static short field1477 = 32767;

    @OriginalMember(owner = "client!hq", name = "Yb", descriptor = "B")
    private byte field1452;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hq", name = "X", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!hq", name = "Z", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!hq", name = "cb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hq", name = "eb", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!hq", name = "fb", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hq", name = "gb", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hq", name = "ib", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hq", name = "mb", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hq", name = "qb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!hq", name = "sb", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!hq", name = "vb", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!hq", name = "xb", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!hq", name = "yb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!hq", name = "Bb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hq", name = "Cb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hq", name = "Eb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!hq", name = "Fb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!hq", name = "Hb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!hq", name = "Lb", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!hq", name = "Mb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hq", name = "Pb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hq", name = "Qb", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hq", name = "Rb", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!hq", name = "Wb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hq", name = "Zb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hq", name = "bc", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hq", name = "dc", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hq", name = "fc", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!hq", name = "ic", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hq", name = "jc", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hq", name = "kc", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!hq", name = "mc", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hq", name = "nc", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hq", name = "oc", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!hq", name = "pc", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hq", name = "qc", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hq", name = "sc", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hq", name = "Y", descriptor = "Lfq;")
    private class136 field1400;

    @OriginalMember(owner = "client!hq", name = "pb", descriptor = "Lit;")
    private class458 field1417;

    @OriginalMember(owner = "client!hq", name = "Ub", descriptor = "Llc;")
    private class459 field1448;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "S")
    private short field1369;

    @OriginalMember(owner = "client!hq", name = "S", descriptor = "S")
    private short field1394;

    @OriginalMember(owner = "client!hq", name = "ab", descriptor = "S")
    private short field1402;

    @OriginalMember(owner = "client!hq", name = "db", descriptor = "S")
    private short field1405;

    @OriginalMember(owner = "client!hq", name = "nb", descriptor = "S")
    private short field1415;

    @OriginalMember(owner = "client!hq", name = "Gb", descriptor = "S")
    private short field1434;

    @OriginalMember(owner = "client!hq", name = "Tb", descriptor = "S")
    private short field1447;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "(I)V", line = 9)
    public final void method421(int arg0) {
        field1469++;
        int var2 = class36.field443[arg0];
        int var3 = class36.field478[arg0];
        for (int var4 = 0; var4 < this.field1454; var4++) {
            int var5 = this.field1413[var4] * var2 + (this.field1421[var4] * var3) >> 15;
            this.field1413[var4] = this.field1413[var4] * var3 - this.field1421[var4] * var2 >> 15;
            this.field1421[var4] = var5;
        }
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "HA", descriptor = "()I", line = 43)
    public final int method431() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1367++;
        return this.field1415;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V", line = 60)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
        field1462++;
        for (int var5 = 0; var5 < this.field1382; var5++) {
            int var9 = this.field1398[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field1398[var5] = (short) class215.method1323(class215.method1323(var10 << 10, var11 << 7), var12);
        }
        if (this.field1389 != null) {
            for (int var6 = 0; var6 < this.field1411; var6++) {
                class78 var7 = this.field1389[var6];
                class202 var8 = this.field1441[var6];
                var8.field2621 = var8.field2621 & 0xFF000000 | class441.field6318[this.field1398[var7.field1011] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1437 != null) {
            this.field1437.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 122)
    public static void method795(int arg0) {
        if (arg0 >= -91) {
            field1473 = null;
        }
        field1476 = null;
        field1473 = null;
        field1456 = null;
        field1474 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILmb;IIFIIFIJ)S", line = 135)
    private final short method796(int arg0, class173 arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, int arg8, long arg9) {
        field1450++;
        int var12 = this.field1461[arg0];
        int var13 = this.field1461[arg0 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1416[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class404.field5751[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field1416[var14] = (short) (this.field1396 + arg5);
        class404.field5751[var14] = arg9;
        this.field1388[this.field1396] = (short) arg8;
        this.field1442[this.field1396] = (short) arg3;
        this.field1465[this.field1396] = (short) arg6;
        this.field1409[this.field1396] = (byte) arg2;
        this.field1363[this.field1396] = arg7;
        this.field1370[this.field1396] = arg4;
        return (short) (this.field1396++);
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V", line = 181)
    public static final void method797(int arg0) {
        field1407++;
        int var1 = (int) ((double) class452.field6526 * 34.46D);
        int var2 = var1 << arg0;
        if (class33.field416.method289()) {
            var2 += 128;
        }
        class33.field416.method274(50, var2);
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V", line = 195)
    private final void method798(int arg0) {
        field1444++;
        if (this.field1362 == 0) {
            return;
        }
        if (this.field1452 != 0) {
            this.method802((byte) -81, true);
        }
        this.method802((byte) 111, false);
        if (this.field1397 != null) {
            if (this.field1397.field2060 == null) {
                this.method807((this.field1452 & 0x10) != 0, arg0 ^ 0xFFFF9FF3);
            }
            if (this.field1397.field2060 != null) {
                this.field1431.method2325((byte) 127, this.field1377 != null);
                this.field1431.method2295(this.field1379, this.field1427, this.field1437, false, this.field1377);
                int var2 = this.field1458.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1458[var3];
                    int var5 = this.field1458[var3 + 1];
                    int var6 = this.field1438[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1431.method2307(-31, this.field1377 != null, var6);
                    this.field1431.method2343(arg0 + 24462, this.field1397.field2060, var4 * 3, (var5 - var4) * 3, 4);
                }
            }
        }
        this.method804(0);
        if (arg0 != -24585) {
            field1473 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lug;)V", line = 5622)
    public class109(class395 arg0) {
        this.field1431 = arg0;
        this.field1427 = new class460(null, 5126, 3, 0);
        this.field1379 = new class460(null, 5126, 2, 0);
        this.field1377 = new class460(null, 5126, 3, 0);
        this.field1437 = new class460(null, 5121, 4, 0);
        this.field1397 = new class162();
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lug;Lmb;IIII)V", line = 5635)
    public class109(class395 arg0, class173 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1392 = arg5;
        this.field1431 = arg0;
        this.field1385 = arg2;
        if (class129.method913(3754, arg2, arg5)) {
            this.field1427 = new class460(null, 5126, 3, 0);
        }
        if (class136.method934(24016, arg2, arg5)) {
            this.field1379 = new class460(null, 5126, 2, 0);
        }
        if (class179.method1145(arg2, 22136, arg5)) {
            this.field1377 = new class460(null, 5126, 3, 0);
        }
        if (class338.method1947(arg5, (byte) 103, arg2)) {
            this.field1437 = new class460(null, 5121, 4, 0);
        }
        if (class286.method1689(arg5, arg2, 2048)) {
            this.field1397 = new class162();
        }
        class278 var7 = arg0.field502;
        int[] var8 = new int[arg1.field2236];
        this.field1461 = new int[arg1.field2208 + 1];
        for (int var9 = 0; var9 < arg1.field2236; var9++) {
            if ((arg1.field2246 == null || arg1.field2246[var9] != 2) && (arg1.field2234 == null || arg1.field2234[var9] == -1 || !var7.method1642(arg1.field2234[var9] & 0xFFFF, 26).field1779)) {
                var8[this.field1382++] = var9;
                this.field1461[arg1.field2212[var9]]++;
                this.field1461[arg1.field2216[var9]]++;
                this.field1461[arg1.field2232[var9]]++;
            }
        }
        this.field1362 = this.field1382;
        long[] var10 = new long[this.field1382];
        boolean var11 = (this.field1385 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field1382; var12++) {
            int var180 = var8[var12];
            class139 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2245 != null) {
                for (int var186 = 0; var186 < arg1.field2245.length; var186++) {
                    class410 var187 = arg1.field2245[var186];
                    if (var187.field5857 == var180) {
                        class472 var188 = class65.method584(var187.field5861, false);
                        if (var188.field6839) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1362--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field2234 != null) {
                var189 = arg1.field2234[var180];
                if (var189 != -1) {
                    var181 = var7.method1642(var189 & 0xFFFF, -103);
                    var184 = var181.field1794;
                    var185 = var181.field1790;
                }
            }
            boolean var190 = arg1.field2228 != null && arg1.field2228[var180] != 0 || var181 != null && !var181.field1783;
            if ((var11 || var190) && arg1.field2240 != null) {
                var182 += arg1.field2240[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class265.method1574(var8, (byte) 102, var10);
        this.field1454 = arg1.field2208;
        this.field1421 = arg1.field2198;
        this.field1436 = arg1.field2203;
        this.field1413 = arg1.field2209;
        this.field1451 = arg1.field2197;
        this.field1366 = arg1.field2201;
        this.field1371 = arg1.field2238;
        this.field1446 = arg1.field2235;
        class367[] var13 = new class367[this.field1454];
        if (arg1.field2245 != null) {
            this.field1411 = arg1.field2245.length;
            this.field1441 = new class202[this.field1411];
            this.field1389 = new class78[this.field1411];
            for (int var14 = 0; var14 < this.field1411; var14++) {
                class410 var15 = arg1.field2245[var14];
                class472 var16 = class65.method584(var15.field5861, false);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1382; var18++) {
                    if (var8[var18] == var15.field5857) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class441.field6318[arg1.field2207[var15.field5857] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field2228 == null ? 0 : arg1.field2228[var15.field5857]) << 24;
                this.field1389[var14] = new class78(var17, arg1.field2212[var15.field5857], arg1.field2216[var15.field5857], arg1.field2232[var15.field5857], var16.field6841, var16.field6846, var16.field6836, var16.field6837, var16.field6838, var16.field6839, var16.field6845, var15.field5859);
                this.field1441[var14] = new class202(var20);
            }
        }
        int var21 = this.field1382 * 3;
        this.field1416 = new short[var21];
        class404.field5751 = new long[var21];
        this.field1428 = new short[this.field1382];
        this.field1380 = new byte[this.field1382];
        this.field1370 = new float[var21];
        this.field1395 = (short) arg4;
        this.field1465 = new short[var21];
        this.field1388 = new short[var21];
        this.field1409 = new byte[var21];
        this.field1442 = new short[var21];
        this.field1449 = (short) arg3;
        this.field1363 = new float[var21];
        this.field1438 = new short[this.field1382];
        if (arg1.field2214 != null) {
            this.field1412 = new short[this.field1382];
        }
        this.field1403 = new short[this.field1382];
        this.field1398 = new short[this.field1382];
        this.field1373 = new short[this.field1382];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2208; var23++) {
            int var179 = this.field1461[var23];
            this.field1461[var23] = var22;
            var13[var23] = new class367();
            var22 += var179;
        }
        this.field1461[arg1.field2208] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2223 != null) {
            int var28 = arg1.field2215;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var25 = new int[var28];
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field1382; var36++) {
                int var43 = var8[var36];
                if (arg1.field2223[var43] != -1) {
                    int var44 = arg1.field2223[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2212[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2216[var43];
                        } else {
                            var46 = arg1.field2232[var43];
                        }
                        int var47 = arg1.field2198[var46];
                        int var48 = arg1.field2201[var46];
                        int var49 = arg1.field2209[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2211[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field2199[var37];
                        var41 = 64.0F / (float) arg1.field2204[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 <= 0) {
                            var39 = (float) (-var42) / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var40 = (float) var42 / 1024.0F;
                            var39 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field2202[var37];
                        var39 = 64.0F / (float) arg1.field2199[var37];
                        var41 = 64.0F / (float) arg1.field2204[var37];
                    } else {
                        var39 = (float) arg1.field2199[var37] / 1024.0F;
                        var40 = (float) arg1.field2202[var37] / 1024.0F;
                        var41 = (float) arg1.field2204[var37] / 1024.0F;
                    }
                    var27[var37] = class40.method379(class378.method2145(255, arg1.field2217[var37]), var39, var41, var40, arg1.field2205[var37], arg1.field2218[var37], arg1.field2241[var37], -148);
                }
            }
        }
        class411[] var50 = new class411[arg1.field2236];
        for (int var51 = 0; var51 < arg1.field2236; var51++) {
            short var158 = arg1.field2212[var51];
            short var159 = arg1.field2216[var51];
            short var160 = arg1.field2232[var51];
            int var161 = this.field1421[var159] - this.field1421[var158];
            int var162 = this.field1366[var159] - this.field1366[var158];
            int var163 = this.field1413[var159] - this.field1413[var158];
            int var164 = this.field1421[var160] - this.field1421[var158];
            int var165 = this.field1366[var160] - this.field1366[var158];
            int var166 = this.field1413[var160] - this.field1413[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field2246 == null ? 0 : arg1.field2246[var51];
            if (var174 == 0) {
                class367 var175 = var13[var158];
                var175.field4758 += var173;
                var175.field4757 += var172;
                var175.field4760++;
                var175.field4756 += var171;
                class367 var176 = var13[var159];
                var176.field4756 += var171;
                var176.field4760++;
                var176.field4757 += var172;
                var176.field4758 += var173;
                class367 var177 = var13[var160];
                var177.field4756 += var171;
                var177.field4757 += var172;
                var177.field4758 += var173;
                var177.field4760++;
            } else if (var174 == 1) {
                class411 var178 = var50[var51] = new class411();
                var178.field5864 = var173;
                var178.field5866 = var172;
                var178.field5867 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field1382; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2207[var68] & 0xFFFF;
            short var70;
            if (arg1.field2234 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2234[var68];
            }
            int var71;
            if (arg1.field2223 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2223[var68];
            }
            int var72;
            if (arg1.field2228 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field2228[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var79 = 1;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2211[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field2212[var68];
                        short var112 = arg1.field2216[var68];
                        short var113 = arg1.field2232[var68];
                        short var114 = arg1.field2218[var71];
                        short var115 = arg1.field2241[var71];
                        short var116 = arg1.field2205[var71];
                        float var117 = (float) arg1.field2198[var114];
                        float var118 = (float) arg1.field2201[var114];
                        float var119 = (float) arg1.field2209[var114];
                        float var120 = (float) arg1.field2198[var115] - var117;
                        float var121 = (float) arg1.field2201[var115] - var118;
                        float var122 = (float) arg1.field2209[var115] - var119;
                        float var123 = (float) arg1.field2198[var116] - var117;
                        float var124 = (float) arg1.field2201[var116] - var118;
                        float var125 = (float) arg1.field2209[var116] - var119;
                        float var126 = (float) arg1.field2198[var111] - var117;
                        float var127 = (float) arg1.field2201[var111] - var118;
                        float var128 = (float) arg1.field2209[var111] - var119;
                        float var129 = (float) arg1.field2198[var112] - var117;
                        float var130 = (float) arg1.field2201[var112] - var118;
                        float var131 = (float) arg1.field2209[var112] - var119;
                        float var132 = (float) arg1.field2198[var113] - var117;
                        float var133 = (float) arg1.field2201[var113] - var118;
                        float var134 = (float) arg1.field2209[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - var121 * var135;
                        float var143 = var122 * var135 - (var120 * var137);
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                        var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                        var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                        var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                    } else {
                        short var83 = arg1.field2212[var68];
                        short var84 = arg1.field2216[var68];
                        short var85 = arg1.field2232[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field2242[var71];
                        float var91 = (float) arg1.field2224[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field2202[var71] / 1024.0F;
                            class390.method2215(var92, var90, var87, var88, var89, var91, -111, var86, arg1.field2198[var83], arg1.field2209[var83], arg1.field2201[var83]);
                            var74 = class42.field520;
                            var73 = class448.field6409;
                            class390.method2215(var92, var90, var87, var88, var89, var91, -14, var86, arg1.field2198[var84], arg1.field2209[var84], arg1.field2201[var84]);
                            var76 = class42.field520;
                            var75 = class448.field6409;
                            class390.method2215(var92, var90, var87, var88, var89, var91, 100, var86, arg1.field2198[var85], arg1.field2209[var85], arg1.field2201[var85]);
                            var78 = class42.field520;
                            var77 = class448.field6409;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > var93)) {
                                    var77 -= var92;
                                    var80 = 1;
                                } else if (var73 - var77 > var93) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                                if ((var75 - var73 > var93)) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var73 - var75 > var93) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                            } else {
                                if (var93 < var76 - var74) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var93 < var74 - var76) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var93)) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var93 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field2249[var71] / 256.0F;
                            float var95 = (float) arg1.field2229[var71] / 256.0F;
                            int var96 = arg1.field2198[var84] - arg1.field2198[var83];
                            int var97 = arg1.field2201[var84] - arg1.field2201[var83];
                            int var98 = arg1.field2209[var84] - arg1.field2209[var83];
                            int var99 = arg1.field2198[var85] - arg1.field2198[var83];
                            int var100 = arg1.field2201[var85] - arg1.field2201[var83];
                            int var101 = arg1.field2209[var85] - arg1.field2209[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field2199[var71];
                            float var106 = 64.0F / (float) arg1.field2204[var71];
                            float var107 = 64.0F / (float) arg1.field2202[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[4] * (float) var103 + var89[3] * (float) var102) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class174.method1118(var108, var109, var110, (byte) 62);
                            class69.method615(var90, var88, var91, var81, var95, arg1.field2198[var83], var87, var94, arg1.field2209[var83], 3, var89, var86, arg1.field2201[var83]);
                            var73 = class371.field4795;
                            var74 = class299.field3854;
                            class69.method615(var90, var88, var91, var81, var95, arg1.field2198[var84], var87, var94, arg1.field2209[var84], 3, var89, var86, arg1.field2201[var84]);
                            var75 = class371.field4795;
                            var76 = class299.field3854;
                            class69.method615(var90, var88, var91, var81, var95, arg1.field2198[var85], var87, var94, arg1.field2209[var85], 3, var89, var86, arg1.field2201[var85]);
                            var77 = class371.field4795;
                            var78 = class299.field3854;
                        } else if (var82 == 3) {
                            class229.method1390(var88, var91, var87, 8, arg1.field2201[var83], var86, arg1.field2198[var83], var89, var90, arg1.field2209[var83]);
                            var74 = class341.field4285;
                            var73 = class468.field6773;
                            class229.method1390(var88, var91, var87, 8, arg1.field2201[var84], var86, arg1.field2198[var84], var89, var90, arg1.field2209[var84]);
                            var75 = class468.field6773;
                            var76 = class341.field4285;
                            class229.method1390(var88, var91, var87, 8, arg1.field2201[var85], var86, arg1.field2198[var85], var89, var90, arg1.field2209[var85]);
                            var78 = class341.field4285;
                            var77 = class468.field6773;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field2246 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2246[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32) + (long) (var71 << 2);
                short var149 = arg1.field2212[var68];
                short var150 = arg1.field2216[var68];
                short var151 = arg1.field2232[var68];
                class367 var152 = var13[var149];
                this.field1428[var52] = this.method796(var149, arg1, var152.field4760, var152.field4757, var74, 1, var152.field4756, var73, var152.field4758, var147);
                class367 var153 = var13[var150];
                this.field1373[var52] = this.method796(var150, arg1, var153.field4760, var153.field4757, var76, 1, var153.field4756, var75, var153.field4758, (long) var79 + var147);
                class367 var154 = var13[var151];
                this.field1403[var52] = this.method796(var151, arg1, var154.field4760, var154.field4757, var78, 1, var154.field4756, var77, var154.field4758, (long) var80 + var147);
            } else if (var146 == 1) {
                class411 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) ((var155.field5867 + 256 << 22) + (var155.field5866 + 256 << 12) + ((var71 << 2) - -(var155.field5864 > 0 ? 1024 : 2048)));
                this.field1428[var52] = this.method796(arg1.field2212[var68], arg1, 0, var155.field5866, var74, 1, var155.field5867, var73, var155.field5864, var156);
                this.field1373[var52] = this.method796(arg1.field2216[var68], arg1, 0, var155.field5866, var76, 1, var155.field5867, var75, var155.field5864, (long) var79 + var156);
                this.field1403[var52] = this.method796(arg1.field2232[var68], arg1, 0, var155.field5866, var78, 1, var155.field5867, var77, var155.field5864, (long) var80 + var156);
            }
            if (arg1.field2234 == null) {
                this.field1438[var52] = -1;
            } else {
                this.field1438[var52] = arg1.field2234[var68];
            }
            if (arg1.field2228 != null) {
                this.field1380[var52] = arg1.field2228[var68];
            }
            if (arg1.field2214 != null) {
                this.field1412[var52] = arg1.field2214[var68];
            }
            this.field1398[var52] = arg1.field2207[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1362; var55++) {
            short var67 = this.field1438[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1458 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field1362; var58++) {
            short var66 = this.field1438[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field1458[var56++] = var58;
            }
        }
        this.field1458[var56] = this.field1362;
        class404.field5751 = null;
        this.field1388 = class192.method1190(this.field1396, this.field1388, 0);
        this.field1442 = class192.method1190(this.field1396, this.field1442, 0);
        this.field1465 = class192.method1190(this.field1396, this.field1465, 0);
        this.field1409 = class194.method1201(-104, this.field1396, this.field1409);
        this.field1363 = class115.method831(this.field1363, this.field1396, (byte) 63);
        this.field1370 = class115.method831(this.field1370, this.field1396, (byte) 63);
        if (arg1.field2227 != null && class394.method2267(arg2, this.field1392, (byte) 66)) {
            this.field1422 = arg1.method1100(121);
        }
        if (arg1.field2245 != null && class90.method706(-109, arg2, this.field1392)) {
            this.field1419 = arg1.method1108(-77);
        }
        if (arg1.field2219 != null && class524.method3124(this.field1392, 0, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1382; var61++) {
                int var65 = arg1.field2219[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field1471 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1471[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1382; var63++) {
                int var64 = arg1.field2219[var8[var63]];
                if (var64 >= 0) {
                    this.field1471[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "()I", line = 260)
    public final int method437() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1425++;
        return this.field1447;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILhq;ZZBLhq;)Lt;", line = 274)
    private final class474 method799(int arg0, class109 arg1, boolean arg2, boolean arg3, byte arg4, class109 arg5) {
        arg5.field1449 = this.field1449;
        arg5.field1452 = 0;
        arg5.field1454 = this.field1454;
        arg5.field1392 = this.field1392;
        arg5.field1396 = this.field1396;
        arg5.field1411 = this.field1411;
        field1372++;
        arg5.field1395 = this.field1395;
        arg5.field1362 = this.field1362;
        arg5.field1382 = this.field1382;
        arg5.field1436 = this.field1436;
        arg5.field1385 = arg0;
        boolean var7 = class502.method3023(arg0, (byte) -125, this.field1392);
        boolean var8 = class139.method944(arg0, this.field1392, 114);
        boolean var9 = class418.method2463(this.field1392, 52, arg0);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg5.field1421 = this.field1421;
            } else if (arg1.field1421 == null || this.field1436 > arg1.field1421.length) {
                arg5.field1421 = arg1.field1421 = new int[this.field1436];
            } else {
                arg5.field1421 = arg1.field1421;
            }
            if (!var8) {
                arg5.field1366 = this.field1366;
            } else if (arg1.field1366 == null || this.field1436 > arg1.field1366.length) {
                arg5.field1366 = arg1.field1366 = new int[this.field1436];
            } else {
                arg5.field1366 = arg1.field1366;
            }
            if (!var9) {
                arg5.field1413 = this.field1413;
            } else if (arg1.field1413 == null || arg1.field1413.length < this.field1436) {
                arg5.field1413 = arg1.field1413 = new int[this.field1436];
            } else {
                arg5.field1413 = arg1.field1413;
            }
            for (int var11 = 0; var11 < this.field1436; var11++) {
                if (var7) {
                    arg5.field1421[var11] = this.field1421[var11];
                }
                if (var8) {
                    arg5.field1366[var11] = this.field1366[var11];
                }
                if (var9) {
                    arg5.field1413[var11] = this.field1413[var11];
                }
            }
        } else {
            arg5.field1366 = this.field1366;
            arg5.field1413 = this.field1413;
            arg5.field1421 = this.field1421;
        }
        if (class454.method2705(arg0, 111, this.field1392)) {
            arg5.field1427 = arg1.field1427;
            if (arg2) {
                arg5.field1452 = (byte) (arg5.field1452 | 0x1);
            }
            arg5.field1427.field6582 = this.field1427.field6582;
            arg5.field1427.field6578 = this.field1427.field6578;
        } else if (class129.method913(arg4 ^ 0xEF9, arg0, this.field1392)) {
            arg5.field1427 = this.field1427;
        } else {
            arg5.field1427 = null;
        }
        if (class22.method188(this.field1392, (byte) 94, arg0)) {
            if (arg1.field1398 == null || arg1.field1398.length < this.field1382) {
                arg5.field1398 = arg1.field1398 = new short[this.field1382];
            } else {
                arg5.field1398 = arg1.field1398;
            }
            for (int var12 = 0; var12 < this.field1382; var12++) {
                arg5.field1398[var12] = this.field1398[var12];
            }
        } else {
            arg5.field1398 = this.field1398;
        }
        if (class25.method205(this.field1392, arg0, (byte) -21)) {
            if (arg1.field1380 == null || arg1.field1380.length < this.field1382) {
                arg5.field1380 = arg1.field1380 = new byte[this.field1382];
            } else {
                arg5.field1380 = arg1.field1380;
            }
            for (int var13 = 0; var13 < this.field1382; var13++) {
                arg5.field1380[var13] = this.field1380[var13];
            }
        } else {
            arg5.field1380 = this.field1380;
        }
        if (class9.method57(this.field1392, arg0, 55)) {
            arg5.field1437 = arg1.field1437;
            if (arg2) {
                arg5.field1452 = (byte) (arg5.field1452 | 0x2);
            }
            arg5.field1437.field6582 = this.field1437.field6582;
            arg5.field1437.field6578 = this.field1437.field6578;
        } else if (class338.method1947(this.field1392, (byte) 100, arg0)) {
            arg5.field1437 = this.field1437;
        } else {
            arg5.field1437 = null;
        }
        if (class240.method1448(this.field1392, (byte) 127, arg0)) {
            if (arg1.field1388 == null || this.field1396 > arg1.field1388.length) {
                int var14 = this.field1396;
                arg5.field1388 = arg1.field1388 = new short[var14];
                arg5.field1465 = arg1.field1465 = new short[var14];
                arg5.field1442 = arg1.field1442 = new short[var14];
            } else {
                arg5.field1442 = arg1.field1442;
                arg5.field1388 = arg1.field1388;
                arg5.field1465 = arg1.field1465;
            }
            if (this.field1400 == null) {
                for (int var18 = 0; var18 < this.field1396; var18++) {
                    arg5.field1388[var18] = this.field1388[var18];
                    arg5.field1442[var18] = this.field1442[var18];
                    arg5.field1465[var18] = this.field1465[var18];
                }
            } else {
                if (arg1.field1400 == null) {
                    arg1.field1400 = new class136();
                }
                class136 var15 = arg5.field1400 = arg1.field1400;
                if (var15.field1749 == null || this.field1396 > var15.field1749.length) {
                    int var16 = this.field1396;
                    var15.field1749 = new short[var16];
                    var15.field1753 = new short[var16];
                    var15.field1752 = new byte[var16];
                    var15.field1748 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field1396; var17++) {
                    arg5.field1388[var17] = this.field1388[var17];
                    arg5.field1442[var17] = this.field1442[var17];
                    arg5.field1465[var17] = this.field1465[var17];
                    var15.field1749[var17] = this.field1400.field1749[var17];
                    var15.field1748[var17] = this.field1400.field1748[var17];
                    var15.field1753[var17] = this.field1400.field1753[var17];
                    var15.field1752[var17] = this.field1400.field1752[var17];
                }
            }
            arg5.field1409 = this.field1409;
        } else {
            arg5.field1442 = this.field1442;
            arg5.field1400 = this.field1400;
            arg5.field1409 = this.field1409;
            arg5.field1388 = this.field1388;
            arg5.field1465 = this.field1465;
        }
        if (class225.method1374(arg0, this.field1392, false)) {
            if (arg2) {
                arg5.field1452 = (byte) (arg5.field1452 | 0x4);
            }
            arg5.field1377 = arg1.field1377;
            arg5.field1377.field6578 = this.field1377.field6578;
            arg5.field1377.field6582 = this.field1377.field6582;
        } else if (class179.method1145(arg0, 22136, this.field1392)) {
            arg5.field1377 = this.field1377;
        } else {
            arg5.field1377 = null;
        }
        if (class532.method3155(arg0, -1, this.field1392)) {
            if (arg1.field1363 == null || arg1.field1363.length < this.field1382) {
                int var19 = this.field1396;
                arg5.field1370 = arg1.field1370 = new float[var19];
                arg5.field1363 = arg1.field1363 = new float[var19];
            } else {
                arg5.field1370 = arg1.field1370;
                arg5.field1363 = arg1.field1363;
            }
            for (int var20 = 0; var20 < this.field1396; var20++) {
                arg5.field1363[var20] = this.field1363[var20];
                arg5.field1370[var20] = this.field1370[var20];
            }
        } else {
            arg5.field1363 = this.field1363;
            arg5.field1370 = this.field1370;
        }
        if (class370.method2112(arg0, -91, this.field1392)) {
            arg5.field1379 = arg1.field1379;
            if (arg2) {
                arg5.field1452 = (byte) (arg5.field1452 | 0x8);
            }
            arg5.field1379.field6582 = this.field1379.field6582;
            arg5.field1379.field6578 = this.field1379.field6578;
        } else if (class136.method934(24016, arg0, this.field1392)) {
            arg5.field1379 = this.field1379;
        } else {
            arg5.field1379 = null;
        }
        if (class279.method1659((byte) -119, arg0, this.field1392)) {
            if (arg1.field1428 == null || arg1.field1428.length < this.field1382) {
                int var21 = this.field1382;
                arg5.field1428 = arg1.field1428 = new short[var21];
                arg5.field1403 = arg1.field1403 = new short[var21];
                arg5.field1373 = arg1.field1373 = new short[var21];
            } else {
                arg5.field1373 = arg1.field1373;
                arg5.field1428 = arg1.field1428;
                arg5.field1403 = arg1.field1403;
            }
            for (int var22 = 0; var22 < this.field1382; var22++) {
                arg5.field1428[var22] = this.field1428[var22];
                arg5.field1373[var22] = this.field1373[var22];
                arg5.field1403[var22] = this.field1403[var22];
            }
        } else {
            arg5.field1403 = this.field1403;
            arg5.field1428 = this.field1428;
            arg5.field1373 = this.field1373;
        }
        if (class95.method728(this.field1392, arg0, (byte) 121)) {
            arg5.field1397 = arg1.field1397;
            if (arg2) {
                arg5.field1452 = (byte) (arg5.field1452 | 0x10);
            }
            arg5.field1397.field2060 = this.field1397.field2060;
        } else if (class286.method1689(this.field1392, arg0, 2048)) {
            arg5.field1397 = this.field1397;
        } else {
            arg5.field1397 = null;
        }
        if (class232.method1410(arg0, this.field1392, false)) {
            if (arg1.field1438 == null || this.field1382 > arg1.field1438.length) {
                int var23 = this.field1382;
                arg5.field1438 = arg1.field1438 = new short[var23];
            } else {
                arg5.field1438 = arg1.field1438;
            }
            for (int var24 = 0; var24 < this.field1382; var24++) {
                arg5.field1438[var24] = this.field1438[var24];
            }
        } else {
            arg5.field1438 = this.field1438;
        }
        if (!class436.method2556(arg0, true, this.field1392)) {
            arg5.field1441 = this.field1441;
        } else if (arg1.field1441 == null || arg1.field1441.length < this.field1411) {
            int var26 = this.field1411;
            arg5.field1441 = arg1.field1441 = new class202[var26];
            for (int var27 = 0; var27 < this.field1411; var27++) {
                arg5.field1441[var27] = this.field1441[var27].method1270((byte) -77);
            }
        } else {
            arg5.field1441 = arg1.field1441;
            for (int var25 = 0; var25 < this.field1411; var25++) {
                arg5.field1441[var25].method1269(this.field1441[var25], -15492);
            }
        }
        arg5.field1412 = this.field1412;
        arg5.field1371 = this.field1371;
        arg5.field1416 = this.field1416;
        if (arg4 != 83) {
            field1473 = null;
        }
        arg5.field1451 = this.field1451;
        arg5.field1422 = this.field1422;
        arg5.field1446 = this.field1446;
        if (this.field1424) {
            arg5.field1405 = this.field1405;
            arg5.field1394 = this.field1394;
            arg5.field1447 = this.field1447;
            arg5.field1424 = true;
            arg5.field1434 = this.field1434;
            arg5.field1415 = this.field1415;
            arg5.field1402 = this.field1402;
            arg5.field1369 = this.field1369;
        } else {
            arg5.field1424 = false;
        }
        arg5.field1458 = this.field1458;
        arg5.field1389 = this.field1389;
        arg5.field1419 = this.field1419;
        arg5.field1461 = this.field1461;
        arg5.field1471 = this.field1471;
        return arg5;
    }

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "(I)V", line = 740)
    public final void method405(int arg0) {
        field1430++;
        int var2 = class36.field443[arg0];
        int var3 = class36.field478[arg0];
        for (int var4 = 0; var4 < this.field1454; var4++) {
            int var5 = this.field1421[var4] * var3 + this.field1366[var4] * var2 >> 15;
            this.field1366[var4] = this.field1366[var4] * var3 - (this.field1421[var4] * var2) >> 15;
            this.field1421[var4] = var5;
        }
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "PA", descriptor = "()I", line = 772)
    public final int method409() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1453++;
        return this.field1434;
    }

    @OriginalMember(owner = "client!hq", name = "JA", descriptor = "(III)V", line = 786)
    public final void method443(int arg0, int arg1, int arg2) {
        field1390++;
        for (int var4 = 0; var4 < this.field1454; var4++) {
            if (arg0 != 0) {
                this.field1421[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1366[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1413[var4] += arg2;
            }
        }
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
        this.field1424 = false;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(SBBII)I", line = 821)
    private final int method800(short arg0, byte arg1, byte arg2, int arg3, int arg4) {
        field1404++;
        int var6 = class441.field6318[class98.method739(arg3, 65408, arg4)];
        if (arg0 != -1) {
            class139 var7 = this.field1431.field502.method1642(arg0 & 0xFFFF, 9);
            int var8 = var7.field1785 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field1788 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var14 & 0xFF00) + ((var13 & 0xAD00FF00) << 8) + (var15 >> 8);
            }
        }
        if (arg1 < 87) {
            this.field1452 = 104;
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!hq", name = "Z", descriptor = "(I)V", line = 892)
    public final void method436(int arg0) {
        field1374++;
        int var2 = class36.field443[arg0];
        int var3 = class36.field478[arg0];
        for (int var4 = 0; var4 < this.field1454; var4++) {
            int var5 = this.field1366[var4] * var3 - this.field1413[var4] * var2 >> 15;
            this.field1413[var4] = this.field1413[var4] * var3 + this.field1366[var4] * var2 >> 15;
            this.field1366[var4] = var5;
        }
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
        this.field1424 = false;
    }

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "(I)V", line = 926)
    private final void method801(int arg0) {
        if (arg0 >= -24) {
            this.method427();
        }
        field1429++;
        if (this.field1389 == null) {
            return;
        }
        class237 var2 = this.field1431.field5497;
        float var3 = this.field1431.method333();
        float var4 = this.field1431.method278();
        this.field1431.method2272((byte) -115);
        this.field1431.method280(false);
        this.field1431.method2325((byte) 122, false);
        this.field1431.method2295(this.field1431.field5592, this.field1431.field5541, null, false, null);
        for (int var5 = 0; var5 < this.field1411; var5++) {
            class78 var6 = this.field1389[var5];
            class202 var7 = this.field1441[var5];
            if (!var6.field1009 || !this.field1431.method304()) {
                float var8 = (float) (this.field1421[var6.field1013] + this.field1421[var6.field1017] + this.field1421[var6.field1018]) * 0.3333333F;
                float var9 = (float) (this.field1366[var6.field1018] + this.field1366[var6.field1013] + this.field1366[var6.field1017]) * 0.3333333F;
                float var10 = (float) (this.field1413[var6.field1017] + this.field1413[var6.field1013] + this.field1413[var6.field1018]) * 0.3333333F;
                float var11 = class2.field22 * var10 + class52.field699 * var9 + class438.field6287 * var8 + class40.field513;
                float var12 = class2.field15 * var10 + class490.field7122 * var8 + class3.field31 * var9 + class153.field1935;
                float var13 = class116.field1566 * var10 + class268.field3395 * var8 + class256.field3258 * var9 + class256.field3248;
                var2.method1424((byte) -13, var7.field2628, var6.field1008 * var7.field2631 >> 7, -var13, var6.field1016 * var7.field2625 >> 7, (float) var7.field2623 - var12, (float) var7.field2626 + var11);
                this.field1431.method2351(var2, (byte) 124);
                this.field1431.method338(var4, var3 - (float) var6.field1015 * 1.5F);
                int var14 = var7.field2621;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field1431.method2349((byte) 125, var6.field1006);
                this.field1431.method2290(true, var6.field1014);
                this.field1431.method2305(7681, var6.field1007);
                this.field1431.method2316((byte) 84, 7, 0, 4);
            }
        }
        this.field1431.method338(var4, var3);
        this.field1431.method280(true);
        this.field1431.method2329(0);
    }

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "(IILta;Lta;III)V", line = 993)
    public final void method404(int arg0, int arg1, class143 arg2, class143 arg3, int arg4, int arg5, int arg6) {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1399++;
        int var8 = this.field1415 + arg4;
        int var9 = this.field1402 + arg4;
        int var10 = this.field1434 + arg6;
        int var11 = this.field1447 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field1842 <= arg2.field1836 + var9 >> arg2.field1840 || var10 < 0 || arg2.field1836 + var11 >> arg2.field1840 >= arg2.field1844) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field1836 + var9 >> arg3.field1840) >= arg3.field1842 || var10 < 0 || (var11 + arg3.field1836 >> arg3.field1840) >= arg3.field1844) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1840;
            int var13 = var9 - (1 - arg2.field1836) >> arg2.field1840;
            int var14 = var10 >> arg2.field1840;
            int var15 = var11 + arg2.field1836 - 1 >> arg2.field1840;
            if (arg2.method399(var12, var14) == arg5 && arg5 == arg2.method399(var13, var14) && arg5 == arg2.method399(var12, var15) && arg5 == arg2.method399(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field1454; var32++) {
                this.field1366[var32] = this.field1366[var32] + arg2.method396(this.field1421[var32] + arg4, this.field1413[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field1394;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field1454; var30++) {
                int var31 = (this.field1366[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field1366[var30] -= -((arg1 - var31) * (arg2.method396(this.field1421[var30] + arg4, this.field1413[var30] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFF52) >> 8) * 4;
            int var18 = (arg1 >> 16 & 0xFF) << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var16 >> 1)) < 0 || (var16 >> 1) + arg4 + arg2.field1836 >= arg2.field1842 << arg2.field1840 || (arg6 - (var17 >> 1)) < 0 || arg6 - (-(var17 >> 1) - arg2.field1836) >= arg2.field1844 << arg2.field1840) {
                return;
            }
            this.method2853(var16, var17, arg6, arg4, var19, var18, arg5, arg2, true);
        } else if (arg0 == 4) {
            int var27 = this.field1405 - this.field1394;
            for (int var28 = 0; var28 < this.field1454; var28++) {
                this.field1366[var28] = this.field1366[var28] + arg3.method396(this.field1421[var28] + arg4, this.field1413[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field1405 - this.field1394;
            for (int var21 = 0; var21 < this.field1454; var21++) {
                int var22 = this.field1421[var21] + arg4;
                int var23 = this.field1413[var21] + arg6;
                int var24 = arg2.method396(var22, var23);
                int var25 = arg3.method396(var22, var23);
                int var26 = var24 - var25;
                this.field1366[var21] = var24 - (arg5 - ((this.field1366[var21] << 8) / var20 * var26 >> 8));
            }
        }
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZ)V", line = 1147)
    private final void method802(byte arg0, boolean arg1) {
        field1414++;
        boolean var3 = this.field1437 != null && this.field1437.field6582 == null;
        boolean var4 = this.field1377 != null && this.field1377.field6582 == null;
        boolean var5 = this.field1427 != null && this.field1427.field6582 == null;
        boolean var6 = this.field1379 != null && this.field1379.field6582 == null;
        if (arg1) {
            var3 &= (this.field1452 & 0x2) != 0;
            var4 &= (this.field1452 & 0x4) != 0;
            var5 &= (this.field1452 & 0x1) != 0;
            var6 &= (this.field1452 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field1396 * var7 <= this.field1431.field5536.field6618.length) {
            this.field1431.field5536.field6631 = 0;
        } else {
            this.field1431.field5536 = new class498((this.field1396 + 100) * var7);
        }
        class498 var12 = this.field1431.field5536;
        int var13 = 81 / ((56 - arg0) / 41);
        if (var5) {
            if (this.field1431.field5593) {
                for (int var14 = 0; var14 < this.field1454; var14++) {
                    int var15 = NativeStream.floatToRawIntBits((float) this.field1421[var14]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field1366[var14]);
                    int var17 = NativeStream.floatToRawIntBits((float) this.field1413[var14]);
                    int var18 = this.field1461[var14];
                    int var19 = this.field1461[var14 + 1];
                    for (int var20 = var18; var20 < var19; var20++) {
                        int var21 = this.field1416[var20] - 1;
                        if (var21 == -1) {
                            break;
                        }
                        var12.field6631 = var7 * var21;
                        var12.method2777(var15, -11);
                        var12.method2777(var16, -11);
                        var12.method2777(var17, -11);
                    }
                }
            } else {
                for (int var22 = 0; var22 < this.field1454; var22++) {
                    int var23 = NativeStream.floatToRawIntBits((float) this.field1421[var22]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field1366[var22]);
                    int var25 = NativeStream.floatToRawIntBits((float) this.field1413[var22]);
                    int var26 = this.field1461[var22];
                    int var27 = this.field1461[var22 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field1416[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        var12.field6631 = var7 * var29;
                        var12.method2770(var23, 1);
                        var12.method2770(var24, 1);
                        var12.method2770(var25, 1);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1377 == null) {
                short[] var30;
                byte[] var31;
                short[] var32;
                short[] var33;
                if (this.field1400 == null) {
                    var30 = this.field1442;
                    var31 = this.field1409;
                    var32 = this.field1388;
                    var33 = this.field1465;
                } else {
                    var30 = this.field1400.field1748;
                    var33 = this.field1400.field1753;
                    var32 = this.field1400.field1749;
                    var31 = this.field1400.field1752;
                }
                float var34 = this.field1431.field5595[0];
                float var35 = this.field1431.field5595[1];
                float var36 = this.field1431.field5595[2];
                float var37 = this.field1431.field5608;
                float var38 = this.field1431.field5636 * 768.0F / (float) this.field1395;
                float var39 = this.field1431.field5560 * 768.0F / (float) this.field1395;
                for (int var40 = 0; var40 < this.field1382; var40++) {
                    int var41 = this.method800(this.field1438[var40], (byte) 124, this.field1380[var40], this.field1398[var40], this.field1449);
                    float var42 = (float) ((var41 & 0xFFA6) >> 8) * this.field1431.field5626;
                    float var43 = (float) (var41 >>> 24) * this.field1431.field5609;
                    short var44 = this.field1428[var40];
                    float var45 = (float) ((var41 & 0xFFE33F) >> 16) * this.field1431.field5570;
                    short var46 = (short) var31[var44];
                    float var47;
                    if (var46 == 0) {
                        var47 = ((float) var33[var44] * var36 + (float) var30[var44] * var35 + (float) var32[var44] * var34) * 0.0026041667F;
                    } else {
                        var47 = ((float) var33[var44] * var36 + (float) var30[var44] * var35 + (float) var32[var44] * var34) / (float) (var46 * 256);
                    }
                    float var48 = (var47 < 0.0F ? var39 : var38) * var47 + var37;
                    int var49 = (int) (var43 * var48);
                    int var50 = (int) (var45 * var48);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var51 = (int) (var42 * var48);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field6631 = var9 + (var7 * var44);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.method2729(var49, false);
                    var12.method2729(var50, false);
                    var12.method2729(var51, false);
                    var12.method2729(255 - (this.field1380[var40] & 0xFF), false);
                    short var52 = this.field1373[var40];
                    short var53 = (short) var31[var52];
                    float var54;
                    if (var53 == 0) {
                        var54 = ((float) var33[var52] * var36 + (float) var30[var52] * var35 + (float) var32[var52] * var34) * 0.0026041667F;
                    } else {
                        var54 = ((float) var33[var52] * var36 + (float) var30[var52] * var35 + (float) var32[var52] * var34) / (float) (var53 * 256);
                    }
                    float var55 = ((var54 < 0.0F) ? var39 : var38) * var54 + var37;
                    int var56 = (int) (var43 * var55);
                    int var57 = (int) (var45 * var55);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var42 * var55);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var12.field6631 = var9 + (var7 * var52);
                    var12.method2729(var56, false);
                    var12.method2729(var57, false);
                    var12.method2729(var58, false);
                    var12.method2729(255 - (this.field1380[var40] & 0xFF), false);
                    short var59 = this.field1403[var40];
                    short var60 = (short) var31[var59];
                    float var61;
                    if (var60 == 0) {
                        var61 = ((float) var33[var59] * var36 + (float) var30[var59] * var35 + (float) var32[var59] * var34) * 0.0026041667F;
                    } else {
                        var61 = ((float) var33[var59] * var36 + (float) var30[var59] * var35 + (float) var32[var59] * var34) / (float) (var60 * 256);
                    }
                    float var62 = var37 + (var61 < 0.0F ? var39 : var38) * var61;
                    int var63 = (int) (var43 * var62);
                    int var64 = (int) (var45 * var62);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var65 = (int) (var42 * var62);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    var12.field6631 = var9 + (var7 * var59);
                    var12.method2729(var63, false);
                    var12.method2729(var64, false);
                    var12.method2729(var65, false);
                    var12.method2729(255 - (this.field1380[var40] & 0xFF), false);
                }
            } else {
                for (int var66 = 0; var66 < this.field1382; var66++) {
                    int var67 = this.method800(this.field1438[var66], (byte) 119, this.field1380[var66], this.field1398[var66], this.field1449);
                    var12.field6631 = this.field1428[var66] * var7 + var9;
                    var12.method2777(var67, -11);
                    var12.field6631 = var9 + (this.field1373[var66] * var7);
                    var12.method2777(var67, -11);
                    var12.field6631 = var9 + (this.field1403[var66] * var7);
                    var12.method2777(var67, -11);
                }
            }
        }
        if (var4) {
            short[] var68;
            byte[] var69;
            short[] var70;
            short[] var71;
            if (this.field1400 == null) {
                var68 = this.field1388;
                var69 = this.field1409;
                var70 = this.field1442;
                var71 = this.field1465;
            } else {
                var68 = this.field1400.field1749;
                var70 = this.field1400.field1748;
                var71 = this.field1400.field1753;
                var69 = this.field1400.field1752;
            }
            float var72 = 3.0F / (float) this.field1395;
            var12.field6631 = var10;
            float var73 = 3.0F / (float) (this.field1395 + (this.field1395 / 2));
            if (this.field1431.field5593) {
                for (int var77 = 0; var77 < this.field1396; var77++) {
                    int var78 = var69[var77] & 0xFF;
                    if (var78 == 0) {
                        var12.method3004(255, (float) var68[var77] * var73);
                        var12.method3004(255, (float) var70[var77] * var73);
                        var12.method3004(255, (float) var71[var77] * var73);
                    } else {
                        float var79 = var72 / (float) var78;
                        var12.method3004(255, (float) var68[var77] * var79);
                        var12.method3004(255, (float) var70[var77] * var79);
                        var12.method3004(255, (float) var71[var77] * var79);
                    }
                    var12.field6631 += var7 - 12;
                }
            } else {
                for (int var74 = 0; var74 < this.field1396; var74++) {
                    int var75 = var69[var74] & 0xFF;
                    if (var75 == 0) {
                        var12.method3003((float) var68[var74] * var73, -51);
                        var12.method3003((float) var70[var74] * var73, -51);
                        var12.method3003((float) var71[var74] * var73, -51);
                    } else {
                        float var76 = var72 / (float) var75;
                        var12.method3003((float) var68[var74] * var76, -51);
                        var12.method3003((float) var70[var74] * var76, -51);
                        var12.method3003((float) var71[var74] * var76, -51);
                    }
                    var12.field6631 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6631 = var11;
            if (this.field1431.field5593) {
                for (int var81 = 0; var81 < this.field1396; var81++) {
                    var12.method3004(255, this.field1363[var81]);
                    var12.method3004(255, this.field1370[var81]);
                    var12.field6631 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field1396; var80++) {
                    var12.method3003(this.field1363[var80], -51);
                    var12.method3003(this.field1370[var80], -51);
                    var12.field6631 += var7 - 8;
                }
            }
        }
        var12.field6631 = this.field1396 * var7;
        class459 var82;
        if (arg1) {
            if (this.field1448 == null) {
                this.field1448 = this.field1431.method2269(true, (byte) -123, var12.field6631, var7, var12.field6618);
            } else {
                this.field1448.method971(var12.field6618, var7, var12.field6631, (byte) 103);
            }
            this.field1452 = 0;
            var82 = this.field1448;
        } else {
            var82 = this.field1431.method2269(false, (byte) -1, var12.field6631, var7, var12.field6618);
            this.field1460 = true;
        }
        if (var5) {
            this.field1427.field6582 = var82;
            this.field1427.field6578 = var8;
        }
        if (var6) {
            this.field1379.field6582 = var82;
            this.field1379.field6578 = var11;
        }
        if (var3) {
            this.field1437.field6578 = var9;
            this.field1437.field6582 = var82;
        }
        if (var4) {
            this.field1377.field6582 = var82;
            this.field1377.field6578 = var10;
        }
    }

    @OriginalMember(owner = "client!hq", name = "XA", descriptor = "(I[IIIIIZ)V", line = 1666)
    public final void method420(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1459++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class387.field5093 = 0;
            class222.field2807 = 0;
            class427.field6065 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1422.length > var14) {
                    int[] var15 = this.field1422[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class427.field6065 += this.field1421[var17];
                        class387.field5093 += this.field1366[var17];
                        class222.field2807 += this.field1413[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class427.field6065 = class427.field6065 / var12 + var9;
                class222.field2807 = class222.field2807 / var12 + var11;
                class387.field5093 = class387.field5093 / var12 + var10;
            } else {
                class427.field6065 = var9;
                class222.field2807 = var11;
                class387.field5093 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1422.length > var22) {
                    int[] var23 = this.field1422[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1421[var25] += var20;
                        this.field1366[var25] += var18;
                        this.field1413[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1422.length > var45) {
                    int[] var46 = this.field1422[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1421[var48] -= class427.field6065;
                            this.field1366[var48] -= class387.field5093;
                            this.field1413[var48] -= class222.field2807;
                            if (arg4 != 0) {
                                int var49 = class36.field443[arg4];
                                int var50 = class36.field478[arg4];
                                int var51 = this.field1421[var48] * var50 + this.field1366[var48] * var49 + 32767 >> 15;
                                this.field1366[var48] = this.field1366[var48] * var50 + 32767 - (this.field1421[var48] * var49) >> 15;
                                this.field1421[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class36.field443[arg2];
                                int var53 = class36.field478[arg2];
                                int var54 = this.field1366[var48] * var53 + 32767 - this.field1413[var48] * var52 >> 15;
                                this.field1413[var48] = this.field1366[var48] * var52 + (this.field1413[var48] * var53 + 32767) >> 15;
                                this.field1366[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class36.field443[arg3];
                                int var56 = class36.field478[arg3];
                                int var57 = this.field1421[var48] * var56 + this.field1413[var48] * var55 + 32767 >> 15;
                                this.field1413[var48] = this.field1413[var48] * var56 + 32767 - (this.field1421[var48] * var55) >> 15;
                                this.field1421[var48] = var57;
                            }
                            this.field1421[var48] += class427.field6065;
                            this.field1366[var48] += class387.field5093;
                            this.field1413[var48] += class222.field2807;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1421[var59] -= class427.field6065;
                            this.field1366[var59] -= class387.field5093;
                            this.field1413[var59] -= class222.field2807;
                            if (arg2 != 0) {
                                int var60 = class36.field443[arg2];
                                int var61 = class36.field478[arg2];
                                int var62 = this.field1366[var59] * var61 + 32767 - (this.field1413[var59] * var60) >> 15;
                                this.field1413[var59] = this.field1413[var59] * var61 + this.field1366[var59] * var60 + 32767 >> 15;
                                this.field1366[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class36.field443[arg4];
                                int var64 = class36.field478[arg4];
                                int var65 = this.field1421[var59] * var64 + this.field1366[var59] * var63 + 32767 >> 15;
                                this.field1366[var59] = this.field1366[var59] * var64 + 32767 - this.field1421[var59] * var63 >> 15;
                                this.field1421[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class36.field443[arg3];
                                int var67 = class36.field478[arg3];
                                int var68 = this.field1421[var59] * var67 + this.field1413[var59] * var66 + 32767 >> 15;
                                this.field1413[var59] = this.field1413[var59] * var67 + 32767 - (this.field1421[var59] * var66) >> 15;
                                this.field1421[var59] = var68;
                            }
                            this.field1421[var59] += class427.field6065;
                            this.field1366[var59] += class387.field5093;
                            this.field1413[var59] += class222.field2807;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field1422.length > var28) {
                        int[] var29 = this.field1422[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1461[var31];
                            int var33 = this.field1461[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1416[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class36.field443[arg4];
                                    int var37 = class36.field478[arg4];
                                    int var38 = this.field1388[var35] * var37 + this.field1442[var35] * var36 + 32767 >> 15;
                                    this.field1442[var35] = (short) (this.field1442[var35] * var37 + 32767 - (this.field1388[var35] * var36) >> 15);
                                    this.field1388[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class36.field443[arg2];
                                    int var40 = class36.field478[arg2];
                                    int var41 = this.field1442[var35] * var40 + 32767 - (this.field1465[var35] * var39) >> 15;
                                    this.field1465[var35] = (short) (this.field1465[var35] * var40 + this.field1442[var35] * var39 + 32767 >> 15);
                                    this.field1442[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class36.field443[arg3];
                                    int var43 = class36.field478[arg3];
                                    int var44 = this.field1465[var35] * var42 + this.field1388[var35] * var43 + 32767 >> 15;
                                    this.field1465[var35] = (short) (this.field1465[var35] * var43 + 32767 - (this.field1388[var35] * var42) >> 15);
                                    this.field1388[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1377 == null && this.field1437 != null) {
                    this.field1437.field6582 = null;
                }
                if (this.field1377 != null) {
                    this.field1377.field6582 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field1422.length > var70) {
                    int[] var71 = this.field1422[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1421[var73] -= class427.field6065;
                        this.field1366[var73] -= class387.field5093;
                        this.field1413[var73] -= class222.field2807;
                        this.field1421[var73] = this.field1421[var73] * arg2 >> 7;
                        this.field1366[var73] = this.field1366[var73] * arg3 >> 7;
                        this.field1413[var73] = this.field1413[var73] * arg4 >> 7;
                        this.field1421[var73] += class427.field6065;
                        this.field1366[var73] += class387.field5093;
                        this.field1413[var73] += class222.field2807;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1471 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field1471.length > var78) {
                        int[] var79 = this.field1471[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1380[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1380[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1437 != null) {
                            this.field1437.field6582 = null;
                        }
                    }
                }
                if (this.field1389 != null) {
                    for (int var75 = 0; var75 < this.field1411; var75++) {
                        class78 var76 = this.field1389[var75];
                        class202 var77 = this.field1441[var75];
                        var77.field2621 = 255 - (this.field1380[var76.field1011] & 0xFF) << 24 | var77.field2621 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1471 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field1471.length) {
                        int[] var88 = this.field1471[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1398[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var92 + arg2 & 0x3F;
                            int var97 = arg4 + var94;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1398[var90] = (short) class215.method1323(class215.method1323(var95 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field1437 != null) {
                            this.field1437.field6582 = null;
                        }
                    }
                }
                if (this.field1389 != null) {
                    for (int var84 = 0; var84 < this.field1411; var84++) {
                        class78 var85 = this.field1389[var84];
                        class202 var86 = this.field1441[var84];
                        var86.field2621 = var86.field2621 & 0xFF000000 | class441.field6318[this.field1398[var85.field1011] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1419 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1419.length) {
                        int[] var100 = this.field1419[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class202 var102 = this.field1441[var100[var101]];
                            var102.field2623 += arg3;
                            var102.field2626 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1419 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field1419.length > var104) {
                        int[] var105 = this.field1419[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class202 var107 = this.field1441[var105[var106]];
                            var107.field2625 = var107.field2625 * arg3 >> 7;
                            var107.field2631 = var107.field2631 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1419 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field1419.length) {
                    int[] var110 = this.field1419[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class202 var112 = this.field1441[var110[var111]];
                        var112.field2628 = var112.field2628 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "()I", line = 2319)
    public final int method422() {
        field1410++;
        return this.field1385;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lc;Lvs;I)V", line = 2327)
    public final void method415(class123 arg0, class419 arg1, int arg2) {
        field1365++;
        if (this.field1396 == 0) {
            return;
        }
        class237 var4 = this.field1431.field5606;
        if (!this.field1424) {
            this.method808(27739);
        }
        class237 var5 = (class237) arg0;
        this.method805(var5, 4435);
        class256.field3248 = var4.field3012 * var5.field3016 + var4.field3038 * var5.field3032 + var4.field3035 * var5.field3042 + var4.field3016;
        class256.field3258 = var4.field3012 * var5.field3035 + var4.field3038 * var5.field3022 + var4.field3035 * var5.field3013;
        float var6 = (float) this.field1394 * class256.field3258 + class256.field3248;
        float var7 = (float) this.field1405 * class256.field3258 + class256.field3248;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) (-this.field1369) + var7;
            var8 = (float) this.field1369 + var6;
        } else {
            var8 = (float) this.field1369 + var7;
            var9 = (float) (-this.field1369) + var6;
        }
        if ((this.field1431.field5600 <= var9) || ((float) this.field1431.field5559 >= var8)) {
            return;
        }
        class40.field513 = var4.field3011 * var5.field3016 + var4.field3040 * var5.field3032 + var4.field3022 * var5.field3042 + var4.field3032;
        class52.field699 = var4.field3011 * var5.field3035 + var4.field3040 * var5.field3022 + var4.field3022 * var5.field3013;
        float var10 = (float) this.field1394 * class52.field699 + class40.field513;
        float var11 = (float) this.field1405 * class52.field699 + class40.field513;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) this.field1369 + var10) * (float) this.field1431.field5605;
            var12 = (var11 - (float) this.field1369) * (float) this.field1431.field5605;
        } else {
            var12 = ((float) (-this.field1369) + var10) * (float) this.field1431.field5605;
            var13 = ((float) this.field1369 + var11) * (float) this.field1431.field5605;
        }
        if ((var12 / var8 >= this.field1431.field5604) || (this.field1431.field5553 >= var13 / var8)) {
            return;
        }
        class153.field1935 = var4.field3018 * var5.field3016 + var4.field3037 * var5.field3032 + var4.field3013 * var5.field3042 + var4.field3042;
        class3.field31 = var4.field3018 * var5.field3035 + var4.field3037 * var5.field3022 + var4.field3013 * var5.field3013;
        float var14 = (float) this.field1394 * class3.field31 + class153.field1935;
        float var15 = (float) this.field1405 * class3.field31 + class153.field1935;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field1369) * (float) this.field1431.field5557;
            var17 = ((float) this.field1369 + var14) * (float) this.field1431.field5557;
        } else {
            var16 = (var14 - (float) this.field1369) * (float) this.field1431.field5557;
            var17 = ((float) this.field1369 + var15) * (float) this.field1431.field5557;
        }
        if ((var16 / var8 >= this.field1431.field5537) || (this.field1431.field5607 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field1389 != null) {
            class2.field15 = var4.field3018 * var5.field3012 + var4.field3037 * var5.field3011 + var4.field3013 * var5.field3018;
            class2.field22 = var4.field3011 * var5.field3012 + var4.field3040 * var5.field3011 + var4.field3022 * var5.field3018;
            class438.field6287 = var4.field3011 * var5.field3038 + var4.field3040 * var5.field3040 + var4.field3022 * var5.field3037;
            class116.field1566 = var4.field3012 * var5.field3012 + var4.field3038 * var5.field3011 + var4.field3035 * var5.field3018;
            class268.field3395 = var4.field3012 * var5.field3038 + var4.field3038 * var5.field3040 + var4.field3035 * var5.field3037;
            class490.field7122 = var4.field3018 * var5.field3038 + var4.field3037 * var5.field3040 + var4.field3013 * var5.field3037;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1415 + this.field1402 >> 1;
            int var21 = this.field1447 + this.field1434 >> 1;
            int var22 = (int) ((float) var21 * class2.field22 + (float) this.field1394 * class52.field699 + (float) var20 * class438.field6287 + class40.field513);
            int var23 = (int) ((float) var21 * class2.field15 + (float) this.field1394 * class3.field31 + (float) var20 * class490.field7122 + class153.field1935);
            int var24 = (int) ((float) var21 * class116.field1566 + (float) this.field1394 * class256.field3258 + (float) var20 * class268.field3395 + class256.field3248);
            if (this.field1431.field5559 <= var24) {
                arg1.field5947 = this.field1431.field5539 + (this.field1431.field5605 * var22 / var24);
                arg1.field5943 = this.field1431.field5557 * var23 / var24 + this.field1431.field5584;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class2.field22 + (float) this.field1405 * class52.field699 + (float) var20 * class438.field6287 + class40.field513);
            int var26 = (int) ((float) var21 * class2.field15 + (float) this.field1405 * class3.field31 + (float) var20 * class490.field7122 + class153.field1935);
            int var27 = (int) ((float) var21 * class116.field1566 + (float) this.field1405 * class256.field3258 + (float) var20 * class268.field3395 + class256.field3248);
            if (this.field1431.field5559 <= var27) {
                arg1.field5946 = this.field1431.field5539 + (this.field1431.field5605 * var25 / var27);
                arg1.field5944 = this.field1431.field5584 + (this.field1431.field5557 * var26 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1431.field5559 > var24 && this.field1431.field5559 > var27) {
                    var19 = false;
                } else if (this.field1431.field5559 > var24) {
                    int var28 = (var27 - this.field1431.field5559 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field5947 = this.field1431.field5605 * var29 / this.field1431.field5559 + this.field1431.field5539;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field5943 = this.field1431.field5557 * var30 / this.field1431.field5559 + this.field1431.field5584;
                } else if (var27 < this.field1431.field5559) {
                    int var31 = (var24 - this.field1431.field5559 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field5947 = this.field1431.field5605 * var32 / this.field1431.field5559 + this.field1431.field5539;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field5943 = this.field1431.field5557 * var33 / this.field1431.field5559 + this.field1431.field5584;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field5945 = this.field1431.field5539 + ((this.field1369 + var25) * this.field1431.field5605 / var27) - arg1.field5946;
                } else {
                    arg1.field5945 = this.field1431.field5539 + ((this.field1369 + var22) * this.field1431.field5605 / var24) - arg1.field5947;
                }
                arg1.field5942 = true;
            }
        }
        this.field1431.method2334(124);
        this.field1431.method2328(-21316, var5);
        this.method798(-24585);
        this.field1431.method2329(0);
        this.method801(-29);
    }

    @OriginalMember(owner = "client!hq", name = "WA", descriptor = "()I", line = 2529)
    public final int method426() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1466++;
        return this.field1405;
    }

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "()Z", line = 2544)
    public final boolean method411() {
        field1393++;
        if (this.field1422 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1436; var1++) {
            this.field1421[var1] <<= 0x4;
            this.field1366[var1] <<= 0x4;
            this.field1413[var1] <<= 0x4;
        }
        class222.field2807 = 0;
        class387.field5093 = 0;
        class427.field6065 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hq", name = "BA", descriptor = "(SS)V", line = 2572)
    public final void method425(short arg0, short arg1) {
        field1467++;
        for (int var3 = 0; var3 < this.field1382; var3++) {
            if (this.field1398[var3] == arg0) {
                this.field1398[var3] = arg1;
            }
        }
        if (this.field1389 != null) {
            for (int var4 = 0; var4 < this.field1411; var4++) {
                class78 var5 = this.field1389[var4];
                class202 var6 = this.field1441[var4];
                var6.field2621 = class441.field6318[this.field1398[var5.field1011] & 0xFFFF] & 0xFFFFFF | var6.field2621 & 0xFF000000;
            }
        }
        if (this.field1437 != null) {
            this.field1437.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIIII)Z", line = 2614)
    private final boolean method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1470++;
        if (arg0 > arg7 && arg4 > arg7 && arg3 > arg7) {
            return false;
        }
        int var10 = -64 % ((-arg1 - 22) / 61);
        if (arg7 > arg0 && arg7 > arg4 && arg7 > arg3) {
            return false;
        } else if (arg5 < arg6 && arg2 > arg5 && arg8 > arg5) {
            return false;
        } else {
            return arg5 <= arg6 || arg5 <= arg2 || arg8 >= arg5;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "()V", line = 2639)
    public final void method439() {
        field1384++;
        if (this.field1396 <= 0 || this.field1362 <= 0) {
            return;
        }
        this.method802((byte) 111, false);
        if ((this.field1452 & 0x10) == 0 && this.field1397.field2060 == null) {
            this.method807(false, 4);
        }
        this.method804(0);
    }

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)V", line = 2659)
    private final void method804(int arg0) {
        field1426++;
        if (!this.field1460) {
            return;
        }
        this.field1460 = false;
        if (this.field1371 == null && this.field1446 == null && this.field1389 == null) {
            if (this.field1421 != null && !class429.method2516((byte) 46, this.field1392, this.field1385)) {
                if (this.field1427 != null && this.field1427.field6582 == null) {
                    this.field1460 = true;
                } else {
                    if (!this.field1424) {
                        this.method808(27739);
                    }
                    this.field1421 = null;
                }
            }
            if (this.field1366 != null && !class88.method700(this.field1385, this.field1392, (byte) 7)) {
                if (this.field1427 != null && this.field1427.field6582 == null) {
                    this.field1460 = true;
                } else {
                    if (!this.field1424) {
                        this.method808(27739);
                    }
                    this.field1366 = null;
                }
            }
            if (this.field1413 != null && !class460.method2712(this.field1392, 83, this.field1385)) {
                if (this.field1427 != null && this.field1427.field6582 == null) {
                    this.field1460 = true;
                } else {
                    if (!this.field1424) {
                        this.method808(27739);
                    }
                    this.field1413 = null;
                }
            }
        }
        if (this.field1416 != null && this.field1421 == null && this.field1366 == null && this.field1413 == null) {
            this.field1416 = null;
            this.field1461 = null;
        }
        if (this.field1409 != null && !class288.method1700((byte) -43, this.field1392, this.field1385)) {
            if (this.field1377 == null) {
                if (this.field1437 != null && this.field1437.field6582 == null) {
                    this.field1460 = true;
                } else {
                    this.field1388 = this.field1442 = this.field1465 = null;
                    this.field1409 = null;
                }
            } else if (this.field1377.field6582 == null) {
                this.field1460 = true;
            } else {
                this.field1388 = this.field1442 = this.field1465 = null;
                this.field1409 = null;
            }
        }
        if (this.field1398 != null && !class377.method2139(this.field1385, true, this.field1392)) {
            if (this.field1437 != null && this.field1437.field6582 == null) {
                this.field1460 = true;
            } else {
                this.field1398 = null;
            }
        }
        if (this.field1380 != null && !class457.method2710(this.field1392, (byte) 20, this.field1385)) {
            if (this.field1437 != null && this.field1437.field6582 == null) {
                this.field1460 = true;
            } else {
                this.field1380 = null;
            }
        }
        if (this.field1363 != null && !class205.method1282((byte) 121, this.field1385, this.field1392)) {
            if (this.field1379 != null && this.field1379.field6582 == null) {
                this.field1460 = true;
            } else {
                this.field1363 = this.field1370 = null;
            }
        }
        if (this.field1438 != null && !class529.method3139(this.field1385, this.field1392, (byte) 3)) {
            if (this.field1437 != null && this.field1437.field6582 == null) {
                this.field1460 = true;
            } else {
                this.field1438 = null;
            }
        }
        if (this.field1428 != null && !class401.method2376((byte) 100, this.field1392, this.field1385)) {
            if ((this.field1397 == null || this.field1397.field2060 != null) && (this.field1437 == null || this.field1437.field6582 != null)) {
                this.field1428 = this.field1373 = this.field1403 = null;
            } else {
                this.field1460 = true;
            }
        }
        if (this.field1471 != null && !class524.method3124(this.field1392, 0, this.field1385)) {
            this.field1412 = null;
            this.field1471 = null;
        }
        if (this.field1422 != null && !class394.method2267(this.field1385, this.field1392, (byte) 12)) {
            this.field1422 = null;
            this.field1451 = null;
        }
        if (this.field1419 != null && !class90.method706(-115, this.field1385, this.field1392)) {
            this.field1419 = null;
        }
        if (this.field1458 != null && (this.field1385 & 0x800) == 0 && (this.field1385 & 0x40000) == 0) {
            this.field1458 = null;
        }
        if (arg0 != 0) {
            this.method402(-119);
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "()Z", line = 2837)
    public final boolean method432() {
        field1418++;
        if (this.field1438 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1438.length; var1++) {
            if (this.field1438[var1] != -1 && !this.field1431.field502.method1638(121, this.field1438[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V", line = 2863)
    public final void method402(int arg0) {
        field1375++;
        int var2 = class36.field443[arg0];
        int var3 = class36.field478[arg0];
        for (int var4 = 0; var4 < this.field1454; var4++) {
            int var7 = this.field1421[var4] * var3 + this.field1413[var4] * var2 >> 15;
            this.field1413[var4] = this.field1413[var4] * var3 - this.field1421[var4] * var2 >> 15;
            this.field1421[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1396; var5++) {
            int var6 = this.field1465[var5] * var2 + this.field1388[var5] * var3 >> 15;
            this.field1465[var5] = (short) (this.field1465[var5] * var3 - (this.field1388[var5] * var2) >> 15);
            this.field1388[var5] = (short) var6;
        }
        if (this.field1377 == null && this.field1437 != null) {
            this.field1437.field6582 = null;
        }
        if (this.field1377 != null) {
            this.field1377.field6582 = null;
        }
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "()I", line = 2914)
    public final int method424() {
        field1386++;
        if (!this.field1424) {
            this.method808(27739);
        }
        return this.field1369;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "()[Lew;", line = 2936)
    public final class342[] method441() {
        field1406++;
        return this.field1371;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lkm;I)V", line = 2944)
    private final void method805(class237 arg0, int arg1) {
        if (this.field1371 != null) {
            for (int var3 = 0; var3 < this.field1371.length; var3++) {
                class342 var4 = this.field1371[var3];
                class342 var5 = var4;
                if (var4.field4317 != null) {
                    var5 = var4.field4317;
                }
                var5.field4319 = (int) ((float) this.field1413[var4.field4320] * arg0.field3011 + (float) this.field1421[var4.field4320] * arg0.field3040 + (float) this.field1366[var4.field4320] * arg0.field3022 + arg0.field3032);
                var5.field4327 = (int) ((float) this.field1413[var4.field4320] * arg0.field3018 + (float) this.field1421[var4.field4320] * arg0.field3037 + (float) this.field1366[var4.field4320] * arg0.field3013 + arg0.field3042);
                var5.field4316 = (int) ((float) this.field1413[var4.field4320] * arg0.field3012 + (float) this.field1421[var4.field4320] * arg0.field3038 + (float) this.field1366[var4.field4320] * arg0.field3035 + arg0.field3016);
                var5.field4308 = (int) ((float) this.field1413[var4.field4321] * arg0.field3011 + (float) this.field1421[var4.field4321] * arg0.field3040 + (float) this.field1366[var4.field4321] * arg0.field3022 + arg0.field3032);
                var5.field4324 = (int) ((float) this.field1413[var4.field4321] * arg0.field3018 + (float) this.field1421[var4.field4321] * arg0.field3037 + (float) this.field1366[var4.field4321] * arg0.field3013 + arg0.field3042);
                var5.field4314 = (int) ((float) this.field1413[var4.field4321] * arg0.field3012 + (float) this.field1421[var4.field4321] * arg0.field3038 + (float) this.field1366[var4.field4321] * arg0.field3035 + arg0.field3016);
                var5.field4310 = (int) ((float) this.field1413[var4.field4315] * arg0.field3011 + (float) this.field1421[var4.field4315] * arg0.field3040 + (float) this.field1366[var4.field4315] * arg0.field3022 + arg0.field3032);
                var5.field4325 = (int) ((float) this.field1413[var4.field4315] * arg0.field3018 + (float) this.field1421[var4.field4315] * arg0.field3037 + (float) this.field1366[var4.field4315] * arg0.field3013 + arg0.field3042);
                var5.field4311 = (int) ((float) this.field1413[var4.field4315] * arg0.field3012 + (float) this.field1421[var4.field4315] * arg0.field3038 + (float) this.field1366[var4.field4315] * arg0.field3035 + arg0.field3016);
            }
        }
        field1401++;
        if (this.field1446 != null) {
            for (int var6 = 0; var6 < this.field1446.length; var6++) {
                class390 var7 = this.field1446[var6];
                class390 var8 = var7;
                if (var7.field5238 != null) {
                    var8 = var7.field5238;
                }
                if (var7.field5228 == null) {
                    var7.field5228 = arg0.method230();
                } else {
                    var7.field5228.method237(arg0);
                }
                var8.field5227 = (int) ((float) this.field1413[var7.field5234] * arg0.field3011 + (float) this.field1421[var7.field5234] * arg0.field3040 + (float) this.field1366[var7.field5234] * arg0.field3022 + arg0.field3032);
                var8.field5235 = (int) ((float) this.field1413[var7.field5234] * arg0.field3018 + (float) this.field1421[var7.field5234] * arg0.field3037 + (float) this.field1366[var7.field5234] * arg0.field3013 + arg0.field3042);
                var8.field5232 = (int) ((float) this.field1413[var7.field5234] * arg0.field3012 + (float) this.field1421[var7.field5234] * arg0.field3038 + (float) this.field1366[var7.field5234] * arg0.field3035 + arg0.field3016);
            }
        }
        if (arg1 != 4435) {
            method795(-40);
        }
    }

    @OriginalMember(owner = "client!hq", name = "IA", descriptor = "()V", line = 3013)
    public final void method403() {
        field1423++;
        for (int var1 = 0; var1 < this.field1454; var1++) {
            this.field1413[var1] = -this.field1413[var1];
        }
        for (int var2 = 0; var2 < this.field1396; var2++) {
            this.field1465[var2] = (short) (-this.field1465[var2]);
        }
        for (int var3 = 0; var3 < this.field1382; var3++) {
            short var4 = this.field1428[var3];
            this.field1428[var3] = this.field1403[var3];
            this.field1403[var3] = var4;
        }
        if (this.field1377 == null && this.field1437 != null) {
            this.field1437.field6582 = null;
        }
        if (this.field1377 != null) {
            this.field1377.field6582 = null;
        }
        if (this.field1397 != null) {
            this.field1397.field2060 = null;
        }
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "(III)V", line = 3071)
    public final void method440(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1454; var4++) {
            if (arg0 != 128) {
                this.field1421[var4] = this.field1421[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1366[var4] = this.field1366[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1413[var4] = this.field1413[var4] * arg2 >> 7;
            }
        }
        field1387++;
        this.field1424 = false;
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lua;I)V", line = 3102)
    private final void method806(class473 arg0, int arg1) {
        field1376++;
        if (this.field1396 > this.field1431.field5642.length) {
            this.field1431.field5643 = new int[this.field1396];
            this.field1431.field5642 = new int[this.field1396];
        }
        int[] var3 = this.field1431.field5642;
        int[] var4 = this.field1431.field5643;
        for (int var5 = 0; var5 < this.field1454; var5++) {
            int var16 = (this.field1421[var5] - (this.field1366[var5] * this.field1431.field5599 >> 8) >> this.field1431.field5504) - arg0.field6860;
            int var17 = (this.field1413[var5] - (this.field1366[var5] * this.field1431.field5535 >> 8) >> this.field1431.field5504) - arg0.field6851;
            int var18 = this.field1461[var5];
            int var19 = this.field1461[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1416[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg1 >= -62) {
            this.field1403 = null;
        }
        for (int var6 = 0; var6 < this.field1362; var6++) {
            if (this.field1380 == null || this.field1380[var6] <= 128) {
                short var7 = this.field1428[var6];
                short var8 = this.field1373[var6];
                short var9 = this.field1403[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var14 - var13) * (var12 - var11) > 0) {
                    arg0.method2850(var11, -1, var12, var13, var14, var10, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "(IIII)V", line = 3192)
    public final void method414(int arg0, int arg1, int arg2, int arg3) {
        field1368++;
        if (arg0 == 0) {
            class427.field6065 = 0;
            class222.field2807 = 0;
            class387.field5093 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1454; var6++) {
                class427.field6065 += this.field1421[var6];
                class387.field5093 += this.field1366[var6];
                var5++;
                class222.field2807 += this.field1413[var6];
            }
            if (var5 > 0) {
                class387.field5093 = class387.field5093 / var5 + arg2;
                class427.field6065 = class427.field6065 / var5 + arg1;
                class222.field2807 = class222.field2807 / var5 + arg3;
            } else {
                class387.field5093 = arg2;
                class222.field2807 = arg3;
                class427.field6065 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1454; var7++) {
                this.field1421[var7] += arg1;
                this.field1366[var7] += arg2;
                this.field1413[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1454; var8++) {
                this.field1421[var8] -= class427.field6065;
                this.field1366[var8] -= class387.field5093;
                this.field1413[var8] -= class222.field2807;
                if (arg3 != 0) {
                    int var9 = class36.field443[arg3];
                    int var10 = class36.field478[arg3];
                    int var11 = this.field1366[var8] * var9 + (this.field1421[var8] * var10) + 32767 >> 15;
                    this.field1366[var8] = this.field1366[var8] * var10 + 32767 - this.field1421[var8] * var9 >> 15;
                    this.field1421[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class36.field443[arg1];
                    int var13 = class36.field478[arg1];
                    int var14 = this.field1366[var8] * var13 + 32767 - this.field1413[var8] * var12 >> 15;
                    this.field1413[var8] = this.field1366[var8] * var12 - (-(this.field1413[var8] * var13) - 32767) >> 15;
                    this.field1366[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class36.field443[arg2];
                    int var16 = class36.field478[arg2];
                    int var17 = this.field1421[var8] * var16 + this.field1413[var8] * var15 + 32767 >> 15;
                    this.field1413[var8] = this.field1413[var8] * var16 + 32767 - (this.field1421[var8] * var15) >> 15;
                    this.field1421[var8] = var17;
                }
                this.field1421[var8] += class427.field6065;
                this.field1366[var8] += class387.field5093;
                this.field1413[var8] += class222.field2807;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1454; var18++) {
                this.field1421[var18] -= class427.field6065;
                this.field1366[var18] -= class387.field5093;
                this.field1413[var18] -= class222.field2807;
                this.field1421[var18] = this.field1421[var18] * arg1 / 128;
                this.field1366[var18] = this.field1366[var18] * arg2 / 128;
                this.field1413[var18] = this.field1413[var18] * arg3 / 128;
                this.field1421[var18] += class427.field6065;
                this.field1366[var18] += class387.field5093;
                this.field1413[var18] += class222.field2807;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1382; var19++) {
                int var23 = (this.field1380[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1380[var19] = (byte) var23;
            }
            if (this.field1437 != null) {
                this.field1437.field6582 = null;
            }
            if (this.field1389 != null) {
                for (int var20 = 0; var20 < this.field1411; var20++) {
                    class78 var21 = this.field1389[var20];
                    class202 var22 = this.field1441[var20];
                    var22.field2621 = 255 - (this.field1380[var21.field1011] & 0xFF) << 24 | var22.field2621 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1382; var24++) {
                int var28 = this.field1398[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x383) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1398[var24] = (short) class215.method1323(class215.method1323(var31 << 10, var32 << 7), var34);
            }
            if (this.field1437 != null) {
                this.field1437.field6582 = null;
            }
            if (this.field1389 != null) {
                for (int var25 = 0; var25 < this.field1411; var25++) {
                    class78 var26 = this.field1389[var25];
                    class202 var27 = this.field1441[var25];
                    var27.field2621 = var27.field2621 & 0xFF000000 | class441.field6318[this.field1398[var26.field1011] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1411; var35++) {
                class202 var36 = this.field1441[var35];
                var36.field2623 += arg2;
                var36.field2626 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1411; var37++) {
                class202 var38 = this.field1441[var37];
                var38.field2631 = var38.field2631 * arg1 >> 7;
                var38.field2625 = var38.field2625 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1411; var39++) {
                class202 var40 = this.field1441[var39];
                var40.field2628 = var40.field2628 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "()V", line = 3497)
    public final void method417() {
        field1420++;
        for (int var1 = 0; var1 < this.field1436; var1++) {
            this.field1421[var1] = this.field1421[var1] + 7 >> 4;
            this.field1366[var1] = this.field1366[var1] + 7 >> 4;
            this.field1413[var1] = this.field1413[var1] + 7 >> 4;
        }
        if (this.field1427 != null) {
            this.field1427.field6582 = null;
        }
        this.field1424 = false;
    }

    @OriginalMember(owner = "client!hq", name = "MA", descriptor = "()I", line = 3522)
    public final int method418() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1439++;
        return this.field1394;
    }

    @OriginalMember(owner = "client!hq", name = "NA", descriptor = "()I", line = 3534)
    public final int method434() {
        if (!this.field1424) {
            this.method808(27739);
        }
        field1391++;
        return this.field1402;
    }

    @OriginalMember(owner = "client!hq", name = "fa", descriptor = "(Lba;)Lba;", line = 3547)
    public final class264 method433(class264 arg0) {
        field1440++;
        if (this.field1396 == 0) {
            return null;
        }
        if (!this.field1424) {
            this.method808(27739);
        }
        int var2;
        int var3;
        if (this.field1431.field5599 <= 0) {
            var2 = this.field1415 - (this.field1431.field5599 * this.field1394 >> 8) >> this.field1431.field5504;
            var3 = this.field1402 - (this.field1431.field5599 * this.field1405 >> 8) >> this.field1431.field5504;
        } else {
            var2 = this.field1415 - (this.field1431.field5599 * this.field1405 >> 8) >> this.field1431.field5504;
            var3 = this.field1402 - (this.field1431.field5599 * this.field1394 >> 8) >> this.field1431.field5504;
        }
        int var4;
        int var5;
        if (this.field1431.field5535 <= 0) {
            var4 = this.field1434 - (this.field1431.field5535 * this.field1394 >> 8) >> this.field1431.field5504;
            var5 = this.field1447 - (this.field1431.field5535 * this.field1405 >> 8) >> this.field1431.field5504;
        } else {
            var4 = this.field1434 - (this.field1431.field5535 * this.field1405 >> 8) >> this.field1431.field5504;
            var5 = this.field1447 - (this.field1431.field5535 * this.field1394 >> 8) >> this.field1431.field5504;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class473 var8 = (class473) arg0;
        class473 var9;
        if (var8 != null && var8.method2849(var7, (byte) 0, var6)) {
            var9 = var8;
            var8.method2852((byte) 94);
        } else {
            var9 = new class473(this.field1431, var6, var7);
        }
        var9.method2851(1171950256, var2, var4, var3, var5);
        this.method806(var9, -106);
        return var9;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIZ)Lt;", line = 3618)
    public final class474 method416(byte arg0, int arg1, boolean arg2) {
        field1381++;
        class109 var4;
        class109 var5;
        if (arg0 == 1) {
            var4 = this.field1431.field5618;
            var5 = this.field1431.field5556;
        } else if (arg0 == 2) {
            var5 = this.field1431.field5596;
            var4 = this.field1431.field5578;
        } else if (arg0 == 3) {
            var4 = this.field1431.field5545;
            var5 = this.field1431.field5547;
        } else if (arg0 == 4) {
            var4 = this.field1431.field5540;
            var5 = this.field1431.field5551;
        } else if (arg0 == 5) {
            var4 = this.field1431.field5628;
            var5 = this.field1431.field5563;
        } else {
            var4 = var5 = new class109(this.field1431);
        }
        return this.method799(arg1, var5, arg0 != 0, arg2, (byte) 83, var4);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lc;Lvs;II)V", line = 3666)
    public final void method413(class123 arg0, class419 arg1, int arg2, int arg3) {
        field1383++;
        if (this.field1396 == 0) {
            return;
        }
        class237 var5 = this.field1431.field5606;
        if (!this.field1424) {
            this.method808(27739);
        }
        class237 var6 = (class237) arg0;
        class256.field3258 = var5.field3012 * var6.field3035 + var5.field3038 * var6.field3022 + var5.field3035 * var6.field3013;
        class256.field3248 = var5.field3012 * var6.field3016 + var5.field3038 * var6.field3032 + var5.field3035 * var6.field3042 + var5.field3016;
        float var7 = (float) this.field1394 * class256.field3258 + class256.field3248;
        float var8 = (float) this.field1405 * class256.field3258 + class256.field3248;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = var8 - (float) this.field1369;
            var10 = (float) this.field1369 + var7;
        } else {
            var9 = var7 - (float) this.field1369;
            var10 = (float) this.field1369 + var8;
        }
        if ((var9 >= this.field1431.field5525) || ((float) this.field1431.field5559 >= var10)) {
            return;
        }
        class40.field513 = var5.field3011 * var6.field3016 + var5.field3040 * var6.field3032 + var5.field3022 * var6.field3042 + var5.field3032;
        class52.field699 = var5.field3011 * var6.field3035 + var5.field3040 * var6.field3022 + var5.field3022 * var6.field3013;
        float var11 = (float) this.field1394 * class52.field699 + class40.field513;
        float var12 = (float) this.field1405 * class52.field699 + class40.field513;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = (var12 - (float) this.field1369) * (float) this.field1431.field5605;
            var14 = ((float) this.field1369 + var11) * (float) this.field1431.field5605;
        } else {
            var13 = (var11 - (float) this.field1369) * (float) this.field1431.field5605;
            var14 = ((float) this.field1369 + var12) * (float) this.field1431.field5605;
        }
        if ((this.field1431.field5604 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field1431.field5553)) {
            return;
        }
        class153.field1935 = var5.field3018 * var6.field3016 + var5.field3037 * var6.field3032 + var5.field3013 * var6.field3042 + var5.field3042;
        class3.field31 = var5.field3018 * var6.field3035 + var5.field3037 * var6.field3022 + var5.field3013 * var6.field3013;
        float var15 = (float) this.field1394 * class3.field31 + class153.field1935;
        float var16 = (float) this.field1405 * class3.field31 + class153.field1935;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field1369 + var15) * (float) this.field1431.field5557;
            var18 = ((float) (-this.field1369) + var16) * (float) this.field1431.field5557;
        } else {
            var17 = ((float) this.field1369 + var16) * (float) this.field1431.field5557;
            var18 = (var15 - (float) this.field1369) * (float) this.field1431.field5557;
        }
        if ((var18 / (float) arg2 >= this.field1431.field5537) || (var17 / (float) arg2 <= this.field1431.field5607)) {
            return;
        }
        if (arg1 != null || this.field1389 != null) {
            class2.field15 = var5.field3018 * var6.field3012 + var5.field3037 * var6.field3011 + var5.field3013 * var6.field3018;
            class438.field6287 = var5.field3011 * var6.field3038 + var5.field3040 * var6.field3040 + var5.field3022 * var6.field3037;
            class116.field1566 = var5.field3012 * var6.field3012 + var5.field3038 * var6.field3011 + var5.field3035 * var6.field3018;
            class268.field3395 = var5.field3012 * var6.field3038 + var5.field3038 * var6.field3040 + var5.field3035 * var6.field3037;
            class490.field7122 = var5.field3018 * var6.field3038 + var5.field3037 * var6.field3040 + var5.field3013 * var6.field3037;
            class2.field22 = var5.field3011 * var6.field3012 + var5.field3040 * var6.field3011 + var5.field3022 * var6.field3018;
        }
        if (arg1 != null) {
            int var19 = this.field1415 + this.field1402 >> 1;
            int var20 = this.field1447 + this.field1434 >> 1;
            int var21 = (int) ((float) var20 * class2.field22 + (float) this.field1394 * class52.field699 + (float) var19 * class438.field6287 + class40.field513);
            int var22 = (int) ((float) var20 * class2.field15 + (float) this.field1394 * class3.field31 + (float) var19 * class490.field7122 + class153.field1935);
            int var23 = (int) ((float) var20 * class116.field1566 + (float) this.field1394 * class256.field3258 + (float) var19 * class268.field3395 + class256.field3248);
            int var24 = (int) ((float) var20 * class2.field22 + (float) this.field1405 * class52.field699 + (float) var19 * class438.field6287 + class40.field513);
            int var25 = (int) ((float) var20 * class2.field15 + (float) this.field1405 * class3.field31 + (float) var19 * class490.field7122 + class153.field1935);
            arg1.field5943 = this.field1431.field5557 * var22 / arg2 + this.field1431.field5584;
            arg1.field5946 = this.field1431.field5605 * var24 / arg2 + this.field1431.field5539;
            arg1.field5944 = this.field1431.field5584 + (this.field1431.field5557 * var25 / arg2);
            arg1.field5947 = this.field1431.field5605 * var21 / arg2 + this.field1431.field5539;
            int var26 = (int) ((float) var20 * class116.field1566 + (float) this.field1405 * class256.field3258 + (float) var19 * class268.field3395 + class256.field3248);
            if (this.field1431.field5559 > var23 && this.field1431.field5559 > var26) {
                arg1.field5945 = (this.field1369 + var21) * this.field1431.field5605 / arg2 + this.field1431.field5539 - arg1.field5947;
                arg1.field5942 = true;
            }
        }
        this.field1431.method2342(79, (float) arg2);
        this.field1431.method2304((byte) -72);
        this.field1431.method2328(-21316, var6);
        this.method798(-24585);
        this.field1431.method2329(0);
        this.method801(-128);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V", line = 3814)
    private final void method807(boolean arg0, int arg1) {
        field1445++;
        if (this.field1362 * 6 <= this.field1431.field5536.field6618.length) {
            this.field1431.field5536.field6631 = 0;
        } else {
            this.field1431.field5536 = new class498((this.field1362 + 100) * 6);
        }
        class498 var3 = this.field1431.field5536;
        if (this.field1431.field5593) {
            for (int var4 = 0; var4 < this.field1362; var4++) {
                var3.method2759((byte) -54, this.field1428[var4]);
                var3.method2759((byte) -62, this.field1373[var4]);
                var3.method2759((byte) -62, this.field1403[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1362; var5++) {
                var3.method2790(arg1 ^ 0xC74BD8EC, this.field1428[var5]);
                var3.method2790(-951330584, this.field1373[var5]);
                var3.method2790(arg1 - 951330588, this.field1403[var5]);
            }
        }
        if (var3.field6631 == 0) {
            return;
        }
        if (arg0) {
            if (this.field1417 == null) {
                this.field1417 = this.field1431.method2287(5123, true, arg1 ^ 0x1627, var3.field6618, var3.field6631);
            } else {
                this.field1417.method2505(5123, arg1 + 6534, var3.field6631, var3.field6618);
            }
            this.field1397.field2060 = this.field1417;
        } else {
            this.field1397.field2060 = this.field1431.method2287(5123, false, 5667, var3.field6618, var3.field6631);
        }
        if (arg1 == 4 && !arg0) {
            this.field1460 = true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "aa", descriptor = "(I)V", line = 3881)
    public final void method430(int arg0) {
        field1433++;
        this.field1395 = (short) arg0;
        if (this.field1437 != null) {
            this.field1437.field6582 = null;
        }
        if (this.field1377 != null) {
            this.field1377.field6582 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILc;Z)Z", line = 3902)
    public final boolean method412(int arg0, int arg1, class123 arg2, boolean arg3) {
        field1408++;
        class237 var5 = (class237) arg2;
        class237 var6 = this.field1431.field5606;
        float var7 = var5.field3016 * var6.field3011 + var5.field3042 * var6.field3022 + var5.field3032 * var6.field3040 + var6.field3032;
        float var8 = var5.field3016 * var6.field3018 + var5.field3042 * var6.field3013 + var5.field3032 * var6.field3037 + var6.field3042;
        class116.field1566 = var5.field3012 * var6.field3012 + var5.field3018 * var6.field3035 + var5.field3011 * var6.field3038;
        class268.field3395 = var5.field3038 * var6.field3012 + var5.field3040 * var6.field3038 + var5.field3037 * var6.field3035;
        class2.field22 = var5.field3012 * var6.field3011 + var5.field3018 * var6.field3022 + var5.field3011 * var6.field3040;
        class256.field3258 = var5.field3035 * var6.field3012 + var5.field3022 * var6.field3038 + var5.field3013 * var6.field3035;
        class438.field6287 = var5.field3038 * var6.field3011 + var5.field3040 * var6.field3040 + var5.field3037 * var6.field3022;
        class2.field15 = var5.field3012 * var6.field3018 + var5.field3018 * var6.field3013 + var5.field3011 * var6.field3037;
        class3.field31 = var5.field3035 * var6.field3018 + var5.field3022 * var6.field3037 + var5.field3013 * var6.field3013;
        class52.field699 = var5.field3035 * var6.field3011 + var5.field3022 * var6.field3040 + var5.field3013 * var6.field3022;
        class490.field7122 = var5.field3038 * var6.field3018 + var5.field3040 * var6.field3037 + var5.field3037 * var6.field3013;
        float var9 = var5.field3016 * var6.field3012 + var5.field3042 * var6.field3035 + var5.field3032 * var6.field3038 + var6.field3016;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field1431.field5605;
        int var16 = this.field1431.field5557;
        if (!this.field1424) {
            this.method808(27739);
        }
        class273.field3432[0] = this.field1415;
        class406.field5813[0] = this.field1394;
        class122.field1643[0] = this.field1434;
        class273.field3432[1] = this.field1402;
        class406.field5813[1] = this.field1394;
        class122.field1643[1] = this.field1434;
        class273.field3432[2] = this.field1415;
        class406.field5813[2] = this.field1405;
        class273.field3432[3] = this.field1402;
        class122.field1643[2] = this.field1434;
        class406.field5813[3] = this.field1405;
        class122.field1643[3] = this.field1434;
        class273.field3432[4] = this.field1415;
        class406.field5813[4] = this.field1394;
        class273.field3432[5] = this.field1402;
        class122.field1643[4] = this.field1447;
        class406.field5813[5] = this.field1394;
        class273.field3432[6] = this.field1415;
        class122.field1643[5] = this.field1447;
        class406.field5813[6] = this.field1405;
        class122.field1643[6] = this.field1447;
        class273.field3432[7] = this.field1402;
        class406.field5813[7] = this.field1405;
        class122.field1643[7] = this.field1447;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class406.field5813[var17];
            float var39 = (float) class273.field3432[var17];
            float var40 = (float) class122.field1643[var17];
            float var41 = class2.field22 * var40 + class52.field699 * var38 + class438.field6287 * var39 + var7;
            float var42 = class116.field1566 * var40 + class268.field3395 * var39 + class256.field3258 * var38 + var9;
            float var43 = class2.field15 * var40 + class490.field7122 * var39 + class3.field31 * var38 + var8;
            if ((float) this.field1431.field5559 <= var42) {
                float var44 = (float) var15 * var41 / var42 + (float) this.field1431.field5539;
                float var45 = (float) var16 * var43 / var42 + (float) this.field1431.field5584;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var44 < var11) {
                    var11 = var44;
                }
                var10 = true;
                if (var14 < var45) {
                    var14 = var45;
                }
                if (var13 > var45) {
                    var13 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field1396 > this.field1431.field5642.length) {
                this.field1431.field5643 = new int[this.field1396];
                this.field1431.field5642 = new int[this.field1396];
            }
            int[] var18 = this.field1431.field5642;
            int[] var19 = this.field1431.field5643;
            for (int var20 = 0; var20 < this.field1454; var20++) {
                float var22 = (float) this.field1366[var20];
                float var23 = (float) this.field1413[var20];
                float var24 = (float) this.field1421[var20];
                float var25 = class2.field15 * var23 + class490.field7122 * var24 + class3.field31 * var22 + var8;
                float var26 = class2.field22 * var23 + class52.field699 * var22 + class438.field6287 * var24 + var7;
                float var27 = class116.field1566 * var23 + class268.field3395 * var24 + class256.field3258 * var22 + var9;
                if ((var27 >= (float) this.field1431.field5559)) {
                    int var32 = (int) ((float) var15 * var26 / var27 + (float) this.field1431.field5539);
                    int var33 = (int) ((float) var16 * var25 / var27 + (float) this.field1431.field5584);
                    int var34 = this.field1461[var20];
                    int var35 = this.field1461[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field1416[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field1461[var20];
                    int var29 = this.field1461[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field1416[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field1416[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field1382; var21++) {
                if (var18[this.field1428[var21]] != -999999 && var18[this.field1373[var21]] != -999999 && var18[this.field1403[var21]] != -999999 && this.method803(var19[this.field1428[var21]], 43, var18[this.field1373[var21]], var19[this.field1403[var21]], var19[this.field1373[var21]], arg0, var18[this.field1428[var21]], arg1, var18[this.field1403[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "()I", line = 4117)
    public final int method429() {
        field1468++;
        return this.field1449;
    }

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)V", line = 4127)
    private final void method808(int arg0) {
        field1378++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        if (arg0 != 27739) {
            this.method806(null, -55);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1454; var10++) {
            int var11 = this.field1421[var10];
            int var12 = this.field1366[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field1413[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1434 = (short) var4;
        this.field1394 = (short) var3;
        this.field1415 = (short) var2;
        this.field1402 = (short) var5;
        this.field1447 = (short) var7;
        this.field1405 = (short) var6;
        this.field1369 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field1424 = true;
    }

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "()I", line = 4215)
    public final int method408() {
        field1472++;
        return this.field1395;
    }

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "(I)V", line = 4225)
    public final void method438(int arg0) {
        if (this.field1437 != null) {
            this.field1437.field6582 = null;
        }
        field1432++;
        this.field1449 = (short) arg0;
    }

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "(I[IIIIZI[I)V", line = 4239)
    public final void method444(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1455++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class387.field5093 = 0;
            int var13 = 0;
            class427.field6065 = 0;
            class222.field2807 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field1422.length > var15) {
                    int[] var16 = this.field1422[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1451 == null || (this.field1451[var18] & arg6) != 0) {
                            class427.field6065 += this.field1421[var18];
                            class387.field5093 += this.field1366[var18];
                            class222.field2807 += this.field1413[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class387.field5093 = class387.field5093 / var13 + var10;
                class427.field6065 = class427.field6065 / var13 + var11;
                class304.field3892 = true;
                class222.field2807 = class222.field2807 / var13 + var12;
            } else {
                class387.field5093 = var10;
                class222.field2807 = var12;
                class427.field6065 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + (arg7[5] * arg4) + 16384 >> 15;
                int var21 = arg7[7] * arg3 + (arg7[6] * arg2 + (arg7[8] * arg4) + 16384) >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1422.length) {
                    int[] var27 = this.field1422[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1451 == null || (arg6 & this.field1451[var29]) != 0) {
                            this.field1421[var29] += var23;
                            this.field1366[var29] += var24;
                            this.field1413[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field1422.length) {
                        int[] var110 = this.field1422[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1451 == null || (arg6 & this.field1451[var112]) != 0) {
                                this.field1421[var112] -= class427.field6065;
                                this.field1366[var112] -= class387.field5093;
                                this.field1413[var112] -= class222.field2807;
                                if (arg4 != 0) {
                                    int var113 = class36.field443[arg4];
                                    int var114 = class36.field478[arg4];
                                    int var115 = this.field1366[var112] * var113 + this.field1421[var112] * var114 + 32767 >> 15;
                                    this.field1366[var112] = this.field1366[var112] * var114 + 32767 - (this.field1421[var112] * var113) >> 15;
                                    this.field1421[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class36.field443[arg2];
                                    int var117 = class36.field478[arg2];
                                    int var118 = this.field1366[var112] * var117 + 32767 - (this.field1413[var112] * var116) >> 15;
                                    this.field1413[var112] = this.field1413[var112] * var117 + (this.field1366[var112] * var116 + 32767) >> 15;
                                    this.field1366[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class36.field443[arg3];
                                    int var120 = class36.field478[arg3];
                                    int var121 = this.field1413[var112] * var119 + this.field1421[var112] * var120 + 32767 >> 15;
                                    this.field1413[var112] = this.field1413[var112] * var120 + 32767 - (this.field1421[var112] * var119) >> 15;
                                    this.field1421[var112] = var121;
                                }
                                this.field1421[var112] += class427.field6065;
                                this.field1366[var112] += class387.field5093;
                                this.field1413[var112] += class222.field2807;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field1422.length > var92) {
                            int[] var93 = this.field1422[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1451 == null || (arg6 & this.field1451[var95]) != 0) {
                                    int var96 = this.field1461[var95];
                                    int var97 = this.field1461[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1416[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class36.field443[arg4];
                                            int var101 = class36.field478[arg4];
                                            int var102 = this.field1442[var99] * var100 + this.field1388[var99] * var101 + 32767 >> 15;
                                            this.field1442[var99] = (short) (this.field1442[var99] * var101 + 32767 - (this.field1388[var99] * var100) >> 15);
                                            this.field1388[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class36.field443[arg2];
                                            int var104 = class36.field478[arg2];
                                            int var105 = this.field1442[var99] * var104 + 32767 - (this.field1465[var99] * var103) >> 15;
                                            this.field1465[var99] = (short) (this.field1465[var99] * var104 + this.field1442[var99] * var103 + 32767 >> 15);
                                            this.field1442[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class36.field443[arg3];
                                            int var107 = class36.field478[arg3];
                                            int var108 = this.field1465[var99] * var106 + this.field1388[var99] * var107 + 32767 >> 15;
                                            this.field1465[var99] = (short) (this.field1465[var99] * var107 + 32767 - (this.field1388[var99] * var106) >> 15);
                                            this.field1388[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1377 == null && this.field1437 != null) {
                        this.field1437.field6582 = null;
                    }
                    if (this.field1377 != null) {
                        this.field1377.field6582 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class304.field3892) {
                    int var36 = arg7[6] * class222.field2807 + arg7[0] * class427.field6065 + arg7[3] * class387.field5093 + 16384 >> 15;
                    int var37 = arg7[4] * class387.field5093 + arg7[1] * class427.field6065 + (arg7[7] * class222.field2807) + 16384 >> 15;
                    int var38 = var34 + var37;
                    int var39 = arg7[8] * class222.field2807 + arg7[2] * class427.field6065 + arg7[5] * class387.field5093 + 16384 >> 15;
                    int var40 = var33 + var36;
                    class427.field6065 = var40;
                    int var41 = var35 + var39;
                    class387.field5093 = var38;
                    class304.field3892 = false;
                    class222.field2807 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class36.field478[arg2];
                int var44 = class36.field443[arg2];
                int var45 = class36.field478[arg3];
                int var46 = class36.field443[arg3];
                int var47 = class36.field478[arg4];
                int var48 = class36.field443[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[1] = var46 * var49 + -var45 * var48 + 16384 >> 15;
                int var51 = var42[2] * -class222.field2807 + var42[1] * -class387.field5093 + var42[0] * -class427.field6065 + 16384 >> 15;
                int var52 = var42[5] * -class222.field2807 + var42[4] * -class387.field5093 + var42[3] * -class427.field6065 + 16384 >> 15;
                int var53 = var42[8] * -class222.field2807 + var42[7] * -class387.field5093 + (var42[6] * -class427.field6065 - -16384) >> 15;
                int var54 = class427.field6065 + var51;
                int var55 = class387.field5093 + var52;
                int var56 = class222.field2807 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[0] * var33 + var42[1] * var34 - (-(var42[2] * var35) + -16384) >> 15;
                int var60 = var42[4] * var34 + var42[3] * var33 + var42[5] * var35 + 16384 >> 15;
                int var61 = var54 + var59;
                int var62 = var42[6] * var33 + var42[7] * var34 + var42[8] * var35 + 16384 >> 15;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var84 + (var86 * 3)];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var63 + arg7[0] * var61 + 16384 >> 15;
                int var68 = arg7[3] * var61 + arg7[4] * var63 + arg7[5] * var64 + 16384 >> 15;
                int var69 = var30 + var67;
                int var70 = arg7[8] * var64 + arg7[7] * var63 + arg7[6] * var61 + 16384 >> 15;
                int var71 = var31 + var68;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field1422.length) {
                        int[] var75 = this.field1422[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1451 == null || (arg6 & this.field1451[var77]) != 0) {
                                int var78 = this.field1421[var77] * var65[0] + this.field1413[var77] * var65[2] - (-(this.field1366[var77] * var65[1]) + -16384) >> 15;
                                int var79 = this.field1413[var77] * var65[5] + this.field1421[var77] * var65[3] + (this.field1366[var77] * var65[4] - -16384) >> 15;
                                int var80 = this.field1421[var77] * var65[6] + this.field1413[var77] * var65[8] + (this.field1366[var77] * var65[7]) + 16384 >> 15;
                                int var81 = var71 + var79;
                                int var82 = var69 + var78;
                                this.field1421[var77] = var82;
                                int var83 = var72 + var80;
                                this.field1366[var77] = var81;
                                this.field1413[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field1422.length) {
                        int[] var124 = this.field1422[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field1451 == null || (this.field1451[var126] & arg6) != 0) {
                                this.field1421[var126] -= class427.field6065;
                                this.field1366[var126] -= class387.field5093;
                                this.field1413[var126] -= class222.field2807;
                                this.field1421[var126] = this.field1421[var126] * arg2 >> 7;
                                this.field1366[var126] = this.field1366[var126] * arg3 >> 7;
                                this.field1413[var126] = this.field1413[var126] * arg4 >> 7;
                                this.field1421[var126] += class427.field6065;
                                this.field1366[var126] += class387.field5093;
                                this.field1413[var126] += class222.field2807;
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
                if (class304.field3892) {
                    int var133 = arg7[3] * class387.field5093 + arg7[6] * class222.field2807 + arg7[0] * class427.field6065 + 16384 >> 15;
                    int var134 = arg7[7] * class222.field2807 + arg7[4] * class387.field5093 + arg7[1] * class427.field6065 + 16384 >> 15;
                    int var135 = var130 + var133;
                    int var136 = arg7[5] * class387.field5093 + (arg7[2] * class427.field6065 - (-(arg7[8] * class222.field2807) - 16384)) >> 15;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class387.field5093 = var137;
                    class427.field6065 = var135;
                    class304.field3892 = false;
                    class222.field2807 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class427.field6065 * var139 + 16384 >> 15;
                int var143 = -class387.field5093 * var140 + 16384 >> 15;
                int var144 = -class222.field2807 * var141 + 16384 >> 15;
                int var145 = var142 + class427.field6065;
                int var146 = class387.field5093 + var143;
                int var147 = class222.field2807 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 16384 >> 15;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[0] * var151 + arg7[2] * var154 + arg7[1] * var152 + 16384 >> 15;
                int var158 = arg7[4] * var152 + arg7[5] * var154 + arg7[3] * var151 + 16384 >> 15;
                int var159 = var128 + var158;
                int var160 = arg7[6] * var151 + arg7[8] * var154 + arg7[7] * var152 + 16384 >> 15;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field1422.length > var164) {
                        int[] var165 = this.field1422[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field1451 == null || (this.field1451[var167] & arg6) != 0) {
                                int var168 = this.field1421[var167] * var155[0] + this.field1366[var167] * var155[1] - (-(this.field1413[var167] * var155[2]) - 16384) >> 15;
                                int var169 = this.field1413[var167] * var155[5] + this.field1421[var167] * var155[3] + this.field1366[var167] * var155[4] + 16384 >> 15;
                                int var170 = this.field1413[var167] * var155[8] + this.field1421[var167] * var155[6] + this.field1366[var167] * var155[7] + 16384 >> 15;
                                int var171 = var161 + var168;
                                int var172 = var159 + var169;
                                this.field1421[var167] = var171;
                                int var173 = var162 + var170;
                                this.field1366[var167] = var172;
                                this.field1413[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1471 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field1471.length > var181) {
                        int[] var182 = this.field1471[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1412 == null || (arg6 & this.field1412[var184]) != 0) {
                                int var185 = (this.field1380[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1380[var184] = (byte) var185;
                                if (this.field1437 != null) {
                                    this.field1437.field6582 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1389 != null) {
                    for (int var178 = 0; var178 < this.field1411; var178++) {
                        class78 var179 = this.field1389[var178];
                        class202 var180 = this.field1441[var178];
                        var180.field2621 = 255 - (this.field1380[var179.field1011] & 0xFF) << 24 | var180.field2621 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1471 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field1471.length > var190) {
                        int[] var191 = this.field1471[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1412 == null || (this.field1412[var193] & arg6) != 0) {
                                int var194 = this.field1398[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1398[var193] = (short) class215.method1323(var200, class215.method1323(var198 << 7, var197 << 10));
                                if (this.field1437 != null) {
                                    this.field1437.field6582 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1389 != null) {
                    for (int var187 = 0; var187 < this.field1411; var187++) {
                        class78 var188 = this.field1389[var187];
                        class202 var189 = this.field1441[var187];
                        var189.field2621 = class441.field6318[this.field1398[var188.field1011] & 0xFFFF] & 0xFFFFFF | var189.field2621 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1419 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field1419.length > var202) {
                        int[] var203 = this.field1419[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class202 var205 = this.field1441[var203[var204]];
                            var205.field2626 += arg2;
                            var205.field2623 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1419 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1419.length) {
                        int[] var208 = this.field1419[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class202 var210 = this.field1441[var208[var209]];
                            var210.field2625 = var210.field2625 * arg3 >> 7;
                            var210.field2631 = var210.field2631 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1419 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field1419.length > var212) {
                    int[] var213 = this.field1419[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class202 var215 = this.field1441[var213[var214]];
                        var215.field2628 = var215.field2628 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "UA", descriptor = "(I)V", line = 5228)
    public final void method442(int arg0) {
        this.field1385 = arg0;
        field1464++;
        this.field1460 = true;
        if (this.field1400 != null && (this.field1385 & 0x10000) == 0) {
            this.field1409 = this.field1400.field1752;
            this.field1465 = this.field1400.field1753;
            this.field1442 = this.field1400.field1748;
            this.field1388 = this.field1400.field1749;
            this.field1400 = null;
        }
        this.method804(0);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "()[Lfs;", line = 5258)
    public final class390[] method427() {
        field1435++;
        return this.field1446;
    }

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "(SS)V", line = 5272)
    public final void method423(short arg0, short arg1) {
        field1463++;
        class278 var3 = this.field1431.field502;
        for (int var4 = 0; var4 < this.field1382; var4++) {
            if (this.field1438[var4] == arg0) {
                this.field1438[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class139 var7 = var3.method1642(arg0 & 0xFFFF, 120);
            var5 = var7.field1785;
            var6 = var7.field1788;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class139 var10 = var3.method1642(arg1 & 0xFFFF, 120);
            var9 = var10.field1788;
            var8 = var10.field1785;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1389 != null) {
            for (int var11 = 0; var11 < this.field1411; var11++) {
                class78 var12 = this.field1389[var11];
                class202 var13 = this.field1441[var11];
                var13.field2621 = var13.field2621 & 0xFF000000 | class441.field6318[this.field1398[var12.field1011] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1437 != null) {
            this.field1437.field6582 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lt;IIIZ)V", line = 5348)
    public final void method435(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1457++;
        class109 var6 = (class109) arg0;
        if (this.field1382 == 0 || var6.field1382 == 0) {
            return;
        }
        int var7 = var6.field1454;
        int[] var8 = var6.field1421;
        int[] var9 = var6.field1366;
        int[] var10 = var6.field1413;
        short[] var11 = var6.field1388;
        short[] var12 = var6.field1442;
        short[] var13 = var6.field1465;
        byte[] var14 = var6.field1409;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field1400 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field1400.field1753;
            var17 = this.field1400.field1752;
            var15 = this.field1400.field1748;
            var18 = this.field1400.field1749;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field1400 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field1400.field1753;
            var21 = var6.field1400.field1752;
            var19 = var6.field1400.field1748;
            var20 = var6.field1400.field1749;
        }
        int[] var23 = var6.field1461;
        short[] var24 = var6.field1416;
        if (!var6.field1424) {
            var6.method808(27739);
        }
        short var25 = var6.field1394;
        short var26 = var6.field1405;
        short var27 = var6.field1415;
        short var28 = var6.field1402;
        short var29 = var6.field1434;
        short var30 = var6.field1447;
        for (int var31 = 0; var31 < this.field1454; var31++) {
            int var32 = this.field1366[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field1421[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field1413[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1461[var31];
                        int var37 = this.field1461[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1416[var38] - 1;
                            if (var35 == -1 || this.field1409[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field1400 = new class136();
                                            var18 = this.field1400.field1749 = class11.method77(-125, this.field1388);
                                            var15 = this.field1400.field1748 = class11.method77(112, this.field1442);
                                            var16 = this.field1400.field1753 = class11.method77(-106, this.field1465);
                                            var17 = this.field1400.field1752 = class534.method3158((byte) 37, this.field1409);
                                        }
                                        if (var20 == null) {
                                            class136 var44 = var6.field1400 = new class136();
                                            var20 = var44.field1749 = class11.method77(48, var11);
                                            var19 = var44.field1748 = class11.method77(-101, var12);
                                            var22 = var44.field1753 = class11.method77(-106, var13);
                                            var21 = var44.field1752 = class534.method3158((byte) 37, var14);
                                        }
                                        short var45 = this.field1388[var35];
                                        short var46 = this.field1442[var35];
                                        short var47 = this.field1465[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field1409[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field1461[var31];
                                        short var54 = var11[var41];
                                        short var55 = var13[var41];
                                        short var56 = var12[var41];
                                        byte var57 = var14[var41];
                                        int var58 = this.field1461[var31 + 1];
                                        for (int var59 = var53; var59 < var58; var59++) {
                                            int var60 = this.field1416[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var54;
                                                var15[var60] += var56;
                                                var16[var60] += var55;
                                                var17[var60] += var57;
                                            }
                                        }
                                        if (this.field1377 == null && this.field1437 != null) {
                                            this.field1437.field6582 = null;
                                        }
                                        if (this.field1377 != null) {
                                            this.field1377.field6582 = null;
                                        }
                                        if (var6.field1377 == null && var6.field1437 != null) {
                                            var6.field1437.field6582 = null;
                                        }
                                        if (var6.field1377 != null) {
                                            var6.field1377.field6582 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
