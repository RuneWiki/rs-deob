import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class106 extends class65 {

    @OriginalMember(owner = "client!qfa", name = "Y", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1250 = new Hashtable();

    @OriginalMember(owner = "client!qfa", name = "he", descriptor = "I")
    public int field1415 = 128;

    @OriginalMember(owner = "client!qfa", name = "xe", descriptor = "Lvf;")
    private class161 field1431 = new class161();

    @OriginalMember(owner = "client!qfa", name = "ze", descriptor = "Lou;")
    private class630 field1433 = new class630();

    @OriginalMember(owner = "client!qfa", name = "Ae", descriptor = "Lou;")
    public class630 field1434 = new class630();

    @OriginalMember(owner = "client!qfa", name = "Fe", descriptor = "I")
    public int field1439 = 3;

    @OriginalMember(owner = "client!qfa", name = "Ge", descriptor = "Z")
    private boolean field1440 = false;

    @OriginalMember(owner = "client!qfa", name = "He", descriptor = "I")
    public int field1441 = 8;

    @OriginalMember(owner = "client!qfa", name = "Ce", descriptor = "Lok;")
    private class266 field1436 = new class266();

    @OriginalMember(owner = "client!qfa", name = "Je", descriptor = "I")
    private int field1443 = -1;

    @OriginalMember(owner = "client!qfa", name = "Ke", descriptor = "I")
    private int field1444 = -1;

    @OriginalMember(owner = "client!qfa", name = "Oe", descriptor = "I")
    private int field1448 = -1;

    @OriginalMember(owner = "client!qfa", name = "Qe", descriptor = "[Liha;")
    private class32[] field1450 = new class32[4];

    @OriginalMember(owner = "client!qfa", name = "Ne", descriptor = "[Liha;")
    private class32[] field1447 = new class32[4];

    @OriginalMember(owner = "client!qfa", name = "Re", descriptor = "[Liha;")
    private class32[] field1451 = new class32[4];

    @OriginalMember(owner = "client!qfa", name = "Te", descriptor = "Lok;")
    private class266 field1453;

    @OriginalMember(owner = "client!qfa", name = "We", descriptor = "Lok;")
    private class266 field1456;

    @OriginalMember(owner = "client!qfa", name = "Xe", descriptor = "Lok;")
    private class266 field1457;

    @OriginalMember(owner = "client!qfa", name = "Ye", descriptor = "Lok;")
    private class266 field1458;

    @OriginalMember(owner = "client!qfa", name = "Ze", descriptor = "Lok;")
    private class266 field1459;

    @OriginalMember(owner = "client!qfa", name = "af", descriptor = "Lok;")
    private class266 field1460;

    @OriginalMember(owner = "client!qfa", name = "bf", descriptor = "Lok;")
    private class266 field1461;

    @OriginalMember(owner = "client!qfa", name = "jf", descriptor = "Lou;")
    public class630 field1468;

    @OriginalMember(owner = "client!qfa", name = "mf", descriptor = "Lou;")
    public class630 field1471;

    @OriginalMember(owner = "client!qfa", name = "nf", descriptor = "Lou;")
    public class630 field1472;

    @OriginalMember(owner = "client!qfa", name = "Df", descriptor = "[F")
    private float[] field1488;

    @OriginalMember(owner = "client!qfa", name = "Sf", descriptor = "F")
    private float field1503;

    @OriginalMember(owner = "client!qfa", name = "Tf", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!qfa", name = "Gf", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!qfa", name = "If", descriptor = "F")
    public float field1493;

    @OriginalMember(owner = "client!qfa", name = "jg", descriptor = "F")
    private float field1520;

    @OriginalMember(owner = "client!qfa", name = "Kf", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!qfa", name = "Ff", descriptor = "F")
    private float field1490;

    @OriginalMember(owner = "client!qfa", name = "vf", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!qfa", name = "sf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!qfa", name = "lg", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!qfa", name = "fg", descriptor = "F")
    public float field1516;

    @OriginalMember(owner = "client!qfa", name = "Cg", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!qfa", name = "Of", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!qfa", name = "zg", descriptor = "F")
    public float field1536;

    @OriginalMember(owner = "client!qfa", name = "Hf", descriptor = "F")
    private float field1492;

    @OriginalMember(owner = "client!qfa", name = "Fg", descriptor = "[F")
    public float[] field1542;

    @OriginalMember(owner = "client!qfa", name = "sg", descriptor = "[F")
    private float[] field1529;

    @OriginalMember(owner = "client!qfa", name = "cg", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!qfa", name = "xf", descriptor = "F")
    public float field1482;

    @OriginalMember(owner = "client!qfa", name = "qf", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!qfa", name = "Qg", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!qfa", name = "tg", descriptor = "[Lqm;")
    private class154[] field1530;

    @OriginalMember(owner = "client!qfa", name = "yg", descriptor = "F")
    public float field1535;

    @OriginalMember(owner = "client!qfa", name = "vg", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!qfa", name = "Lg", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!qfa", name = "Ig", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!qfa", name = "bh", descriptor = "F")
    private float field1564;

    @OriginalMember(owner = "client!qfa", name = "fh", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!qfa", name = "Tg", descriptor = "[F")
    private float[] field1556;

    @OriginalMember(owner = "client!qfa", name = "Vg", descriptor = "F")
    public float field1558;

    @OriginalMember(owner = "client!qfa", name = "kh", descriptor = "F")
    public float field1573;

    @OriginalMember(owner = "client!qfa", name = "Pg", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!qfa", name = "nh", descriptor = "[F")
    private float[] field1576;

    @OriginalMember(owner = "client!qfa", name = "rh", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!qfa", name = "Zg", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!qfa", name = "Ng", descriptor = "Z")
    private boolean field1550;

    @OriginalMember(owner = "client!qfa", name = "hh", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!qfa", name = "Bf", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!qfa", name = "sh", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!qfa", name = "th", descriptor = "Z")
    private boolean field1582;

    @OriginalMember(owner = "client!qfa", name = "Af", descriptor = "Lnga;")
    public class538 field1485;

    @OriginalMember(owner = "client!qfa", name = "xh", descriptor = "[I")
    public int[] field1586;

    @OriginalMember(owner = "client!qfa", name = "yh", descriptor = "[B")
    public byte[] field1587;

    @OriginalMember(owner = "client!qfa", name = "zh", descriptor = "[I")
    public int[] field1588;

    @OriginalMember(owner = "client!qfa", name = "Ah", descriptor = "[I")
    public int[] field1589;

    @OriginalMember(owner = "client!qfa", name = "Yb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1302;

    @OriginalMember(owner = "client!qfa", name = "Uc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1350;

    @OriginalMember(owner = "client!qfa", name = "ye", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!qfa", name = "od", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1370;

    @OriginalMember(owner = "client!qfa", name = "md", descriptor = "J")
    private long field1368;

    @OriginalMember(owner = "client!qfa", name = "Sc", descriptor = "J")
    private long field1348;

    @OriginalMember(owner = "client!qfa", name = "dg", descriptor = "Z")
    public boolean field1514;

    @OriginalMember(owner = "client!qfa", name = "pf", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!qfa", name = "jh", descriptor = "Ljava/lang/String;")
    private String field1572;

    @OriginalMember(owner = "client!qfa", name = "pg", descriptor = "Z")
    private boolean field1526;

    @OriginalMember(owner = "client!qfa", name = "Jf", descriptor = "Z")
    public boolean field1494;

    @OriginalMember(owner = "client!qfa", name = "lh", descriptor = "Z")
    public boolean field1574;

    @OriginalMember(owner = "client!qfa", name = "gg", descriptor = "Z")
    public boolean field1517;

    @OriginalMember(owner = "client!qfa", name = "Lf", descriptor = "Z")
    private boolean field1496;

    @OriginalMember(owner = "client!qfa", name = "og", descriptor = "Z")
    public boolean field1525;

    @OriginalMember(owner = "client!qfa", name = "ng", descriptor = "Ljava/lang/String;")
    private String field1524;

    @OriginalMember(owner = "client!qfa", name = "oh", descriptor = "Z")
    public boolean field1577;

    @OriginalMember(owner = "client!qfa", name = "Rf", descriptor = "Z")
    private boolean field1502;

    @OriginalMember(owner = "client!qfa", name = "me", descriptor = "Lwca;")
    private class705 field1420;

    @OriginalMember(owner = "client!qfa", name = "Ee", descriptor = "Lov;")
    public class199 field1438;

    @OriginalMember(owner = "client!qfa", name = "re", descriptor = "Lmja;")
    private class440 field1425;

    @OriginalMember(owner = "client!qfa", name = "ve", descriptor = "Ldka;")
    private class13 field1429;

    @OriginalMember(owner = "client!qfa", name = "ue", descriptor = "Lhf;")
    private class415 field1428;

    @OriginalMember(owner = "client!qfa", name = "Pc", descriptor = "Z")
    public static boolean field1345 = false;

    @OriginalMember(owner = "client!qfa", name = "ub", descriptor = "Lbu;")
    public static class21 field1272 = new class21(64, 1);

    @OriginalMember(owner = "client!qfa", name = "zf", descriptor = "F")
    public float field1484;

    @OriginalMember(owner = "client!qfa", name = "Cf", descriptor = "F")
    public float field1487;

    @OriginalMember(owner = "client!qfa", name = "Wf", descriptor = "F")
    private float field1507;

    @OriginalMember(owner = "client!qfa", name = "Yf", descriptor = "F")
    public float field1509;

    @OriginalMember(owner = "client!qfa", name = "qg", descriptor = "F")
    public float field1527;

    @OriginalMember(owner = "client!qfa", name = "rg", descriptor = "F")
    public float field1528;

    @OriginalMember(owner = "client!qfa", name = "Gg", descriptor = "F")
    public float field1543;

    @OriginalMember(owner = "client!qfa", name = "eh", descriptor = "F")
    private float field1567;

    @OriginalMember(owner = "client!qfa", name = "mh", descriptor = "F")
    private float field1575;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!qfa", name = "J", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!qfa", name = "M", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!qfa", name = "N", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!qfa", name = "O", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!qfa", name = "Q", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!qfa", name = "R", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qfa", name = "S", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!qfa", name = "T", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qfa", name = "U", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!qfa", name = "V", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!qfa", name = "W", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!qfa", name = "X", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!qfa", name = "Z", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!qfa", name = "ab", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qfa", name = "bb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!qfa", name = "cb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!qfa", name = "db", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!qfa", name = "eb", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!qfa", name = "fb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!qfa", name = "gb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!qfa", name = "hb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!qfa", name = "ib", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!qfa", name = "jb", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!qfa", name = "kb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!qfa", name = "lb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!qfa", name = "mb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!qfa", name = "nb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!qfa", name = "ob", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!qfa", name = "pb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!qfa", name = "qb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!qfa", name = "rb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!qfa", name = "sb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!qfa", name = "tb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!qfa", name = "vb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!qfa", name = "wb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!qfa", name = "xb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!qfa", name = "yb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!qfa", name = "zb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!qfa", name = "Ab", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!qfa", name = "Bb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!qfa", name = "Cb", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!qfa", name = "Db", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!qfa", name = "Eb", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!qfa", name = "Fb", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!qfa", name = "Gb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!qfa", name = "Hb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!qfa", name = "Ib", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!qfa", name = "Jb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!qfa", name = "Kb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!qfa", name = "Lb", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!qfa", name = "Mb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!qfa", name = "Nb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!qfa", name = "Ob", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!qfa", name = "Pb", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!qfa", name = "Qb", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!qfa", name = "Rb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!qfa", name = "Sb", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!qfa", name = "Tb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!qfa", name = "Ub", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!qfa", name = "Vb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qfa", name = "Wb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!qfa", name = "Xb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!qfa", name = "Zb", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!qfa", name = "ac", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!qfa", name = "bc", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!qfa", name = "cc", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!qfa", name = "dc", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qfa", name = "ec", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!qfa", name = "fc", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!qfa", name = "gc", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qfa", name = "hc", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qfa", name = "ic", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qfa", name = "jc", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qfa", name = "kc", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!qfa", name = "lc", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!qfa", name = "mc", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!qfa", name = "nc", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!qfa", name = "oc", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!qfa", name = "pc", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!qfa", name = "qc", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!qfa", name = "rc", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!qfa", name = "sc", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!qfa", name = "tc", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!qfa", name = "uc", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!qfa", name = "vc", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!qfa", name = "wc", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!qfa", name = "xc", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!qfa", name = "yc", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!qfa", name = "zc", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!qfa", name = "Ac", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!qfa", name = "Bc", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!qfa", name = "Cc", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!qfa", name = "Dc", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!qfa", name = "Ec", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!qfa", name = "Fc", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!qfa", name = "Gc", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!qfa", name = "Hc", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!qfa", name = "Ic", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!qfa", name = "Jc", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!qfa", name = "Kc", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!qfa", name = "Lc", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!qfa", name = "Mc", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!qfa", name = "Nc", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!qfa", name = "Oc", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!qfa", name = "Qc", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!qfa", name = "Rc", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!qfa", name = "Tc", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!qfa", name = "Vc", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!qfa", name = "Wc", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!qfa", name = "Xc", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!qfa", name = "Yc", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!qfa", name = "Zc", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!qfa", name = "ad", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!qfa", name = "bd", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!qfa", name = "cd", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qfa", name = "dd", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!qfa", name = "ed", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!qfa", name = "fd", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!qfa", name = "gd", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!qfa", name = "hd", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!qfa", name = "id", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!qfa", name = "jd", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!qfa", name = "kd", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!qfa", name = "ld", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!qfa", name = "nd", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!qfa", name = "pd", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!qfa", name = "qd", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!qfa", name = "rd", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!qfa", name = "sd", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!qfa", name = "td", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!qfa", name = "ud", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qfa", name = "vd", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!qfa", name = "wd", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qfa", name = "xd", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!qfa", name = "yd", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!qfa", name = "zd", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!qfa", name = "Ad", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!qfa", name = "Bd", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!qfa", name = "Cd", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!qfa", name = "Dd", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!qfa", name = "Ed", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!qfa", name = "Fd", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!qfa", name = "Gd", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!qfa", name = "Hd", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!qfa", name = "Id", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!qfa", name = "Jd", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!qfa", name = "Kd", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!qfa", name = "Ld", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!qfa", name = "Md", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!qfa", name = "Nd", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!qfa", name = "Od", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!qfa", name = "Pd", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!qfa", name = "Qd", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!qfa", name = "Rd", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!qfa", name = "Sd", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qfa", name = "Td", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qfa", name = "Ud", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!qfa", name = "Vd", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!qfa", name = "Wd", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!qfa", name = "Xd", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!qfa", name = "Yd", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!qfa", name = "Zd", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!qfa", name = "ae", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!qfa", name = "be", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!qfa", name = "ce", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!qfa", name = "de", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!qfa", name = "ee", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!qfa", name = "fe", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!qfa", name = "ge", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qfa", name = "ie", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!qfa", name = "je", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qfa", name = "ke", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!qfa", name = "le", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!qfa", name = "ne", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qfa", name = "oe", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qfa", name = "pe", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qfa", name = "qe", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!qfa", name = "se", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!qfa", name = "te", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!qfa", name = "we", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qfa", name = "De", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!qfa", name = "Se", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!qfa", name = "Ue", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!qfa", name = "Ve", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!qfa", name = "gf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!qfa", name = "hf", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!qfa", name = "kf", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!qfa", name = "Mf", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!qfa", name = "Nf", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!qfa", name = "Uf", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!qfa", name = "Xf", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!qfa", name = "wg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!qfa", name = "xg", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!qfa", name = "Hg", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!qfa", name = "Kg", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!qfa", name = "Yg", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!qfa", name = "ah", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!qfa", name = "gh", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!qfa", name = "uh", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client!qfa", name = "vh", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!qfa", name = "wh", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!qfa", name = "lf", descriptor = "J")
    private long field1470;

    @OriginalMember(owner = "client!qfa", name = "tf", descriptor = "Lhba;")
    public class10 field1478;

    @OriginalMember(owner = "client!qfa", name = "uf", descriptor = "Lhba;")
    public class10 field1479;

    @OriginalMember(owner = "client!qfa", name = "Ef", descriptor = "Lhba;")
    public class10 field1489;

    @OriginalMember(owner = "client!qfa", name = "ag", descriptor = "Lhba;")
    public class10 field1511;

    @OriginalMember(owner = "client!qfa", name = "ig", descriptor = "Lhba;")
    public class10 field1519;

    @OriginalMember(owner = "client!qfa", name = "Ag", descriptor = "Lhba;")
    public class10 field1537;

    @OriginalMember(owner = "client!qfa", name = "Eg", descriptor = "Lhba;")
    public class10 field1541;

    @OriginalMember(owner = "client!qfa", name = "Ug", descriptor = "Lhba;")
    public class10 field1557;

    @OriginalMember(owner = "client!qfa", name = "dh", descriptor = "Lhba;")
    public class10 field1566;

    @OriginalMember(owner = "client!qfa", name = "ih", descriptor = "Lhba;")
    public class10 field1571;

    @OriginalMember(owner = "client!qfa", name = "Jg", descriptor = "Lhq;")
    private class168 field1546;

    @OriginalMember(owner = "client!qfa", name = "Rg", descriptor = "Lei;")
    public class189 field1554;

    @OriginalMember(owner = "client!qfa", name = "Sg", descriptor = "Lei;")
    public class189 field1555;

    @OriginalMember(owner = "client!qfa", name = "Bg", descriptor = "Lcw;")
    private class192 field1538;

    @OriginalMember(owner = "client!qfa", name = "Ie", descriptor = "Lrea;")
    private class219 field1442;

    @OriginalMember(owner = "client!qfa", name = "Me", descriptor = "Liha;")
    private class32 field1446;

    @OriginalMember(owner = "client!qfa", name = "Pe", descriptor = "Liha;")
    private class32 field1449;

    @OriginalMember(owner = "client!qfa", name = "Zf", descriptor = "Lkm;")
    public class373 field1510;

    @OriginalMember(owner = "client!qfa", name = "Mg", descriptor = "Lkda;")
    private class408 field1549;

    @OriginalMember(owner = "client!qfa", name = "Le", descriptor = "Lgja;")
    private class54 field1445;

    @OriginalMember(owner = "client!qfa", name = "Qf", descriptor = "Lgja;")
    public class54 field1501;

    @OriginalMember(owner = "client!qfa", name = "Vf", descriptor = "Lgda;")
    private class61 field1506;

    @OriginalMember(owner = "client!qfa", name = "Xg", descriptor = "Lgda;")
    private class61 field1560;

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "Lwia;")
    public static class791 field1241;

    @OriginalMember(owner = "client!qfa", name = "Be", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1435;

    @OriginalMember(owner = "client!qfa", name = "cf", descriptor = "Z")
    private boolean field1462;

    @OriginalMember(owner = "client!qfa", name = "df", descriptor = "Z")
    private boolean field1463;

    @OriginalMember(owner = "client!qfa", name = "ef", descriptor = "Z")
    private boolean field1464;

    @OriginalMember(owner = "client!qfa", name = "ff", descriptor = "Z")
    private boolean field1465;

    @OriginalMember(owner = "client!qfa", name = "of", descriptor = "Z")
    private boolean field1473;

    @OriginalMember(owner = "client!qfa", name = "rf", descriptor = "Z")
    public boolean field1476;

    @OriginalMember(owner = "client!qfa", name = "wf", descriptor = "Z")
    private boolean field1481;

    @OriginalMember(owner = "client!qfa", name = "yf", descriptor = "Z")
    private boolean field1483;

    @OriginalMember(owner = "client!qfa", name = "Pf", descriptor = "Z")
    private boolean field1500;

    @OriginalMember(owner = "client!qfa", name = "bg", descriptor = "Z")
    public boolean field1512;

    @OriginalMember(owner = "client!qfa", name = "eg", descriptor = "Z")
    public boolean field1515;

    @OriginalMember(owner = "client!qfa", name = "hg", descriptor = "Z")
    public boolean field1518;

    @OriginalMember(owner = "client!qfa", name = "kg", descriptor = "Z")
    public boolean field1521;

    @OriginalMember(owner = "client!qfa", name = "mg", descriptor = "Z")
    public boolean field1523;

    @OriginalMember(owner = "client!qfa", name = "Dg", descriptor = "Z")
    public boolean field1540;

    @OriginalMember(owner = "client!qfa", name = "Og", descriptor = "Z")
    private boolean field1551;

    @OriginalMember(owner = "client!qfa", name = "Wg", descriptor = "Z")
    public boolean field1559;

    @OriginalMember(owner = "client!qfa", name = "ch", descriptor = "Z")
    public boolean field1565;

    @OriginalMember(owner = "client!qfa", name = "ph", descriptor = "Z")
    private boolean field1578;

    @OriginalMember(owner = "client!qfa", name = "qh", descriptor = "Z")
    private boolean field1579;

    @OriginalMember(owner = "client!qfa", name = "ug", descriptor = "[Ldca;")
    private class188[] field1531;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "()Z")
    public final boolean method432() {
        ++field1262;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lpt;)V")
    public final void method528(class555 arg0) {
        ++field1229;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIF)Lqm;")
    public final class154 method439(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1380;
        return new class222(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lie;[Lus;Z)Lda;")
    public final class66 method437(class6 arg0, class1[] arg1, boolean arg2) {
        ++field1414;
        return new class177(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "L", descriptor = "(III)V")
    public final void method502(int arg0, int arg1, int arg2) {
        ++field1423;
        if (this.field1513 != arg0 || this.field1580 != arg1 || this.field1495 != arg2) {
            this.field1580 = arg1;
            this.field1495 = arg2;
            this.field1513 = arg0;
            this.method801((byte) -119);
            this.method752((byte) -128);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(II)Lts;")
    public final class560 method532(int arg0, int arg1) {
        ++field1231;
        return null;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)V")
    public final synchronized void method742(int arg0, int arg1, int arg2) {
        ++field1267;
        class489 var4 = new class489(arg2);
        var4.field8133 = (long) arg0;
        if (arg1 != -30314) {
            this.field1302 = null;
        }
        this.field1456.method1727(var4, (byte) 127);
    }

    @OriginalMember(owner = "client!qfa", name = "aa", descriptor = "(IIIIII)V")
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1371;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method746(false);
        float var10 = (float) arg3 + var8;
        this.method800(arg5, 28276);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1473) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1473) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(I)V")
    private final void method743(int arg0) {
        ++field1358;
        if (~this.field1534 != -3) {
            this.field1534 = 2;
            this.method792(-31489);
            this.method820((byte) -104);
            this.field1467 &= -8;
        }
        if (arg0 != -16026) {
            this.field1562 = 18;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lqja;)V")
    public final void method550(class326 arg0) {
        ++field1396;
        this.field1468.method1884(arg0);
        this.field1471.method1884(this.field1468);
        this.field1471.method3613((byte) 102);
        this.field1472.method3614(this.field1471, (byte) 99);
        if (~this.field1534 != -2) {
            this.method820((byte) -76);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "(I)V")
    public final void method519(int arg0) {
        this.method804(6717);
        ++field1386;
    }

    @OriginalMember(owner = "client!qfa", name = "KA", descriptor = "(IIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field1275;
        if (this.field1282 < arg2) {
            arg2 = this.field1282;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~this.field1223 > ~arg3) {
            arg3 = this.field1223;
        }
        this.field1477 = arg1;
        this.field1475 = arg2;
        this.field1539 = arg3;
        this.field1553 = arg0;
        OpenGL.glEnable(3089);
        this.method762(4611);
        this.method779((byte) 124);
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "(I)V")
    public final void method497(int arg0) {
        ++field1393;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "()V")
    public final void method546() {
        OpenGL.glFinish();
        ++field1398;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class511 method552(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1279;
        return class270.method1750(arg3, (byte) 41, this, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "(IIIIIII)I")
    public final int method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1305;
        float var8 = (float) arg2 * this.field1468.field8850 + (float) arg0 * this.field1468.field8853 + (float) arg1 * this.field1468.field8833 + this.field1468.field8824;
        float var9 = (float) arg5 * this.field1468.field8850 + (float) arg3 * this.field1468.field8853 + (float) arg4 * this.field1468.field8833 + this.field1468.field8824;
        int var10 = 0;
        if ((float) this.field1491 > var8 && (float) this.field1491 > var9) {
            var10 |= 16;
        } else if ((float) this.field1581 < var8 && (float) this.field1581 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field1468.field8826 + (float) arg0 * this.field1468.field8825 + (float) arg1 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field1468.field8826 + (float) arg3 * this.field1468.field8825 + (float) arg4 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / (float) arg6);
        if ((float) var11 < this.field1509 && (float) var12 < this.field1509) {
            var10 |= 1;
        } else if ((float) var11 > this.field1527 && (float) var12 > this.field1527) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field1468.field8831 + (float) arg0 * this.field1468.field8855 + (float) arg1 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field1468.field8831 + (float) arg3 * this.field1468.field8855 + (float) arg4 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / (float) arg6);
        if ((float) var13 < this.field1484 && (float) var14 < this.field1484) {
            var10 |= 4;
        } else if ((float) var13 > this.field1487 && this.field1487 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
    public final synchronized void method454(int arg0) {
        ++field1405;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1456.method1737(-17429)) {
            class489 var12 = (class489) this.field1456.method1736(0);
            class11.field220[var2++] = (int) var12.field8133;
            this.field1455 -= var12.field6926;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class11.field220, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class11.field220, 0);
            var2 = 0;
        }
        while (!this.field1457.method1737(-17429)) {
            class489 var11 = (class489) this.field1457.method1736(0);
            class11.field220[var2++] = (int) var11.field8133;
            this.field1452 -= var11.field6926;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class11.field220, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class11.field220, 0);
            var2 = 0;
        }
        while (!this.field1458.method1737(-17429)) {
            class489 var10 = (class489) this.field1458.method1736(0);
            class11.field220[var2++] = var10.field6926;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class11.field220, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class11.field220, 0);
            var2 = 0;
        }
        while (!this.field1459.method1737(-17429)) {
            class489 var9 = (class489) this.field1459.method1736(0);
            class11.field220[var2++] = (int) var9.field8133;
            this.field1454 -= var9.field6926;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class11.field220, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class11.field220, 0);
            boolean var4 = false;
        }
        while (!this.field1453.method1737(-17429)) {
            class489 var8 = (class489) this.field1453.method1736(0);
            OpenGL.glDeleteLists((int) var8.field8133, var8.field6926);
        }
        while (!this.field1460.method1737(-17429)) {
            class577 var7 = this.field1460.method1736(0);
            OpenGL.glDeleteProgramARB((int) var7.field8133);
        }
        while (!this.field1461.method1737(-17429)) {
            class577 var6 = this.field1461.method1736(0);
            OpenGL.glDeleteObjectARB(var6.field8133);
        }
        while (!this.field1453.method1737(-17429)) {
            class489 var5 = (class489) this.field1453.method1736(0);
            OpenGL.glDeleteLists((int) var5.field8133, var5.field6926);
        }
        this.field1420.method3988((byte) -126);
        if (this.method433() > 100663296 && this.field1470 + 60000L < class459.method2731(97)) {
            System.gc();
            this.field1470 = class459.method2731(125);
        }
        this.field1437 = var3;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lkd;I)V")
    public final void method541(class296 arg0, int arg1) {
        this.field1431.method1216(false, arg1, this, arg0);
        ++field1372;
    }

    @OriginalMember(owner = "client!qfa", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method469(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1376;
        boolean var7 = ~this.field1545 != ~arg0;
        if (var7 || this.field1558 != arg1 || this.field1535 != arg2) {
            this.field1545 = arg0;
            this.field1558 = arg1;
            this.field1535 = arg2;
            if (var7) {
                this.field1573 = (float) (this.field1545 & 65280) / 65280.0F;
                this.field1536 = (float) (this.field1545 & 16711680) / 1.671168E7F;
                this.field1482 = (float) (this.field1545 & 255) / 255.0F;
                this.method771((byte) 113);
            }
            this.method815((byte) 118);
        }
        if (this.field1488[0] != arg3 || this.field1488[1] != arg4 || this.field1488[2] != arg5) {
            this.field1488[1] = arg4;
            this.field1488[2] = arg5;
            this.field1488[0] = arg3;
            this.field1556[1] = -arg4;
            this.field1556[2] = -arg5;
            this.field1556[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1542[2] = arg5 * var8;
            this.field1542[0] = arg3 * var8;
            this.field1542[1] = arg4 * var8;
            this.field1529[1] = -this.field1542[1];
            this.field1529[0] = -this.field1542[0];
            this.field1529[2] = -this.field1542[2];
            this.method753(59);
            this.field1569 = (int) (arg3 * 256.0F / arg4);
            this.field1498 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "()Z")
    public final boolean method477() {
        ++field1333;
        return false;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILou;)V")
    public final void method744(int arg0, class630 arg1) {
        OpenGL.glLoadMatrixf(arg1.method3607((byte) -128), arg0);
        ++field1276;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
    public final void method473(boolean arg0) {
        ++field1378;
    }

    @OriginalMember(owner = "client!qfa", name = "za", descriptor = "(IIIII)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1320;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field1553 && -arg2 + arg0 <= this.field1475 && arg1 + arg2 >= this.field1477 && ~(-arg2 + arg1) >= ~this.field1539) {
            this.method746(false);
            this.method800(arg4, 28276);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field1503 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field1490) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class189.method1324(var9, (byte) 37);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class58.field723[var11] * (float) arg2 + var6, class58.field730[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIII)V")
    public final void method745(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        int var5 = 97 / ((arg1 - -44) / 55);
        ++field1335;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)V")
    private final void method746(boolean arg0) {
        ++field1342;
        if (~this.field1467 != -2) {
            this.method780(15449);
            this.method797((byte) 80, false);
            this.method756(false, 92);
            this.method785(false, (byte) 123);
            this.method791(false, true);
            this.method808((byte) 34, (class188) null);
            this.method747(-2, -2142656808);
            this.method795(1, 34023);
            this.field1467 = 1;
        }
        if (arg0) {
            this.field1473 = true;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "na", descriptor = "(IIII)[I")
    public final int[] method467(int arg0, int arg1, int arg2, int arg3) {
        ++field1326;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field1223 - var6, arg2, 1, 32993, this.field1474, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "(II)V")
    public final void method747(int arg0, int arg1) {
        this.method750(true, -117, arg0);
        if (arg1 != -2142656808) {
            this.method780(-34);
        }
        ++field1412;
    }

    @OriginalMember(owner = "client!qfa", name = "JA", descriptor = "(IIIIII)I")
    public final int method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1240;
        int var7 = 0;
        float var8 = (float) arg2 * this.field1468.field8850 + (float) arg0 * this.field1468.field8853 + (float) arg1 * this.field1468.field8833 + this.field1468.field8824;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field1468.field8850 + (float) arg3 * this.field1468.field8853 + (float) arg4 * this.field1468.field8833 + this.field1468.field8824;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field1491 > var8 && (float) this.field1491 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field1581 && var9 > (float) this.field1581) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field1468.field8826 + (float) arg0 * this.field1468.field8825 + (float) arg1 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / var8);
        int var11 = (int) (((float) arg5 * this.field1468.field8826 + (float) arg3 * this.field1468.field8825 + (float) arg4 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / var9);
        if (this.field1509 > (float) var10 && (float) var11 < this.field1509) {
            var7 |= 1;
        } else if ((float) var10 > this.field1527 && this.field1527 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field1468.field8831 + (float) arg0 * this.field1468.field8855 + (float) arg1 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / var8);
        int var13 = (int) (((float) arg5 * this.field1468.field8831 + (float) arg3 * this.field1468.field8855 + (float) arg4 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / var9);
        if ((float) var12 < this.field1484 && this.field1484 > (float) var13) {
            var7 |= 4;
        } else if (this.field1487 < (float) var12 && (float) var13 > this.field1487) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Liha;Z)V")
    public final void method748(class32 arg0, boolean arg1) {
        ++field1237;
        if (arg1) {
            this.method489();
        }
        if (~this.field1444 <= -1 && this.field1451[this.field1444] == arg0) {
            this.field1451[this.field1444--] = null;
            arg0.method264(25791);
            if (this.field1444 < 0) {
                this.field1446 = null;
            } else {
                this.field1446 = this.field1451[this.field1444];
                this.field1446.method263(-15666);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lza;")
    public final class434 method444(int arg0) {
        ++field1339;
        class466 var2 = new class466(arg0);
        this.field1436.method1727(var2, (byte) 126);
        return var2;
    }

    @OriginalMember(owner = "client!qfa", name = "ra", descriptor = "(IIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        ++field1297;
        this.field1512 = true;
        this.field1505 = arg0;
        this.field1552 = arg3;
        this.field1532 = arg1;
        this.field1522 = arg2;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(II)V")
    public final synchronized void method749(int arg0, int arg1) {
        ++field1369;
        if (arg1 < 12) {
            this.method816(115);
        }
        class489 var3 = new class489(arg0);
        this.field1458.method1727(var3, (byte) 69);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZII)V")
    public final void method750(boolean arg0, int arg1, int arg2) {
        this.method810(arg0, true, 128, arg2);
        ++field1402;
        int var4 = 93 / ((-20 - arg1) / 51);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)V")
    public final synchronized void method751(int arg0, byte arg1) {
        if (arg1 < 122) {
            this.field1481 = true;
        }
        ++field1367;
        class577 var3 = new class577();
        var3.field8133 = (long) arg0;
        this.field1460.method1727(var3, (byte) 88);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
    private final void method752(byte arg0) {
        ++field1288;
        if (arg0 != -128) {
            this.field1454 = -98;
        }
        if (this.field1579 && ~this.field1580 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "T", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field1251;
        if (~arg3 > ~this.field1539) {
            this.field1539 = arg3;
        }
        if (~this.field1477 > ~arg1) {
            this.field1477 = arg1;
        }
        if (~arg2 > ~this.field1475) {
            this.field1475 = arg2;
        }
        if (this.field1553 < arg0) {
            this.field1553 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method762(4611);
        this.method779((byte) 124);
    }

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "(I)V")
    public final void method753(int arg0) {
        int var2 = -6 / ((arg0 - -21) / 51);
        ++field1296;
        OpenGL.glLightfv(16384, 4611, this.field1542, 0);
        OpenGL.glLightfv(16385, 4611, this.field1529, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[Lqm;)V")
    public final void method461(int arg0, class154[] arg1) {
        ++field1413;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field1530[var3] = arg1[var3];
        }
        this.field1508 = arg0;
        if (~this.field1534 != -2) {
            this.method758(true);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "da", descriptor = "(III[I)V")
    public final void method485(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1247;
        float var5 = (float) arg2 * this.field1468.field8850 + (float) arg0 * this.field1468.field8853 + (float) arg1 * this.field1468.field8833 + this.field1468.field8824;
        if (!(var5 < (float) this.field1491) && !(var5 > (float) this.field1581)) {
            int var6 = (int) (((float) arg2 * this.field1468.field8826 + (float) arg0 * this.field1468.field8825 + (float) arg1 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / var5);
            int var7 = (int) (((float) arg2 * this.field1468.field8831 + (float) arg0 * this.field1468.field8855 + (float) arg1 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / var5);
            if (this.field1509 <= (float) var6 && this.field1527 >= (float) var6 && this.field1484 <= (float) var7 && this.field1487 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field1509);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field1484);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "(II)I")
    public final int method542(int arg0, int arg1) {
        ++field1360;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lei;Lei;ILei;Lei;)V")
    public final void method754(class189 arg0, class189 arg1, int arg2, class189 arg3, class189 arg4) {
        ++field1268;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method807(arg3.field2912, 111);
            OpenGL.glVertexPointer(arg3.field2914, arg3.field2909, this.field1560.method408(116), this.field1560.method409((byte) -58) - -((long) arg3.field2918));
            OpenGL.glEnableClientState(32884);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method807(arg4.field2912, 113);
            OpenGL.glNormalPointer(arg4.field2909, this.field1560.method408(115), this.field1560.method409((byte) -58) - -((long) arg4.field2918));
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 != null) {
            this.method807(arg0.field2912, 116);
            OpenGL.glColorPointer(arg0.field2914, arg0.field2909, this.field1560.method408(107), this.field1560.method409((byte) -58) - -((long) arg0.field2918));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 >= 92) {
            if (arg1 != null) {
                this.method807(arg1.field2912, -68);
                OpenGL.glTexCoordPointer(arg1.field2914, arg1.field2909, this.field1560.method408(104), this.field1560.method409((byte) -58) + (long) arg1.field2918);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Liha;I)V")
    public final void method755(class32 arg0, int arg1) {
        ++field1281;
        if (this.field1476) {
            this.method818(arg0, 0);
            this.method748(arg0, false);
        } else {
            if (~this.field1443 > -1 || this.field1450[this.field1443] != arg0) {
                throw new RuntimeException();
            }
            this.field1450[this.field1443--] = null;
            arg0.method261(-72);
            if (this.field1443 >= 0) {
                this.field1449 = this.field1446 = this.field1450[this.field1443];
                this.field1449.method260(954);
            } else {
                this.field1449 = this.field1446 = null;
            }
        }
        if (arg1 != 0) {
            this.method461(10, (class154[]) null);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V")
    public final void method756(boolean arg0, int arg1) {
        if (this.field1481 != arg0) {
            this.field1481 = arg0;
            this.method822(0);
            this.field1467 &= -8;
        }
        ++field1338;
        if (arg1 <= 77) {
            this.field1568 = 21;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "(I)V")
    private final void method757(int arg0) {
        ++field1377;
        float var2 = (float) (-this.field1568) * this.field1492 / (float) this.field1504;
        float var3 = (float) (-this.field1480) * this.field1492 / (float) this.field1548;
        float var4 = (float) (-this.field1568 + this.field1282) * this.field1492 / (float) this.field1504;
        float var5 = (float) (-this.field1480 + this.field1223) * this.field1492 / (float) this.field1548;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field1491, (double) this.field1581);
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(Z)V")
    private final void method758(boolean arg0) {
        ++field1416;
        int var2;
        for (var2 = 0; ~this.field1508 < ~var2; ++var2) {
            class154 var3 = this.field1530[var2];
            class380.field5258[0] = (float) var3.method1059(-6131);
            int var4 = var2 + 16386;
            class380.field5258[1] = (float) var3.method1055((byte) -71);
            class380.field5258[2] = (float) var3.method1058(96);
            class380.field5258[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class380.field5258, 0);
            int var5 = var3.method1052(false);
            float var6 = var3.method1057(false) / 255.0F;
            class380.field5258[0] = (float) (class702.method3977(16769722, var5) >> 16) * var6;
            class380.field5258[1] = (float) (class702.method3977(var5, 65406) >> 8) * var6;
            class380.field5258[2] = (float) class702.method3977(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class380.field5258, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1051((byte) -93) * var3.method1051((byte) -126)));
            OpenGL.glEnable(var4);
        }
        if (!arg0) {
            this.field1561 = -19;
        }
        while (~var2 > ~this.field1561) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field1561 = this.field1508;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lza;)V")
    public final void method501(class434 arg0) {
        this.field1435 = ((class466) arg0).field6552;
        ++field1331;
        if (this.field1506 == null) {
            class538 var2 = new class538(80);
            if (!this.field1514) {
                var2.method3232(-1.0F, true);
                var2.method3232(-1.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(-1.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(-1.0F, true);
                var2.method3232(1.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(0.0F, true);
                var2.method3232(0.0F, true);
            } else {
                var2.method3229(-1.0F, (byte) 61);
                var2.method3229(-1.0F, (byte) 66);
                var2.method3229(0.0F, (byte) 61);
                var2.method3229(0.0F, (byte) 95);
                var2.method3229(1.0F, (byte) 92);
                var2.method3229(1.0F, (byte) 73);
                var2.method3229(-1.0F, (byte) 117);
                var2.method3229(0.0F, (byte) 67);
                var2.method3229(1.0F, (byte) 107);
                var2.method3229(1.0F, (byte) 116);
                var2.method3229(1.0F, (byte) 62);
                var2.method3229(1.0F, (byte) 76);
                var2.method3229(0.0F, (byte) 97);
                var2.method3229(1.0F, (byte) 56);
                var2.method3229(0.0F, (byte) 79);
                var2.method3229(-1.0F, (byte) 108);
                var2.method3229(1.0F, (byte) 92);
                var2.method3229(0.0F, (byte) 113);
                var2.method3229(0.0F, (byte) 91);
                var2.method3229(0.0F, (byte) 92);
            }
            this.field1506 = this.method794(20, false, 0, var2.field7050, var2.field7042);
            this.field1554 = new class189(this.field1506, 5126, 3, 0);
            this.field1555 = new class189(this.field1506, 5126, 2, 12);
            this.field1431.method1219(this, false);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1401;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            this.method746(false);
            this.method800(arg5, 28276);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg6 + arg7);
            float var14 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var15 = var11 * var12;
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var15;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var13 < ~arg6) {
                var19 = (float) (arg6 - (-arg7 + var13)) * var15;
                var18 = (float) (-var13 + arg6 - -arg7) * var14;
            } else {
                var20 = (float) (arg6 - var13) * var14;
                var21 = (float) (-var13 + arg6) * var15;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var15;
            while (true) {
                if (arg2 <= arg0) {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                var23 += var21 + var25;
                OpenGL.glEnd();
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "X", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.field1439 = 0;
        ++field1242;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field1439;
        }
        this.field1441 = 1 << this.field1439;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(ILou;)V")
    public final void method759(int arg0, class630 arg1) {
        if (arg0 == 1) {
            OpenGL.glPushMatrix();
            ++field1316;
            OpenGL.glMultMatrixf(arg1.method3607((byte) -128), 0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
    private final void method760(byte arg0) {
        OpenGL.glDepthMask(this.field1465 && this.field1550);
        ++field1265;
        int var2 = -97 % ((-65 - arg0) / 49);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method507(Canvas arg0, int arg1, int arg2) {
        ++field1426;
        if (this.field1302 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1250.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field1370.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field1250.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1241 = null;
        field1272 = null;
        if (arg0 <= 1) {
            method761(33);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "(I)V")
    private final void method762(int arg0) {
        this.field1484 = (float) (this.field1477 - this.field1480);
        this.field1509 = (float) (-this.field1568 + this.field1553);
        this.field1487 = (float) (this.field1539 - this.field1480);
        this.field1527 = (float) (this.field1475 - this.field1568);
        ++field1327;
        if (arg0 != 4611) {
            this.method773(-69, -31L);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Liha;B)V")
    public final void method763(class32 arg0, byte arg1) {
        ++field1343;
        if (~this.field1444 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field1444 >= 0) {
                this.field1451[this.field1444].method264(25791);
            }
            if (arg1 != 107) {
                this.method553();
            }
            this.field1446 = this.field1451[++this.field1444] = arg0;
            this.field1446.method263(-15666);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "(I)V")
    private final void method764(int arg0) {
        ++field1422;
        float[] var2 = this.field1576;
        float var3 = (float) (-this.field1568 * this.field1491) / (float) this.field1504;
        float var4 = (float) ((-this.field1568 + this.field1282) * this.field1491) / (float) this.field1504;
        float var5 = (float) (this.field1491 * this.field1480) / (float) this.field1548;
        float var6 = (float) ((-this.field1223 + this.field1480) * this.field1491) / (float) this.field1548;
        if (arg0 != 8) {
            this.method511();
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field1491 * 2.0F;
            var2[14] = this.field1507 = -((float) this.field1581 * var7) / (float) (this.field1581 - this.field1491);
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[15] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[10] = this.field1575 = (float) (-(this.field1581 + this.field1491)) / (float) (this.field1581 - this.field1491);
            var2[3] = 0.0F;
        } else {
            var2[10] = 1.0F;
            var2[8] = 0.0F;
            var2[7] = 0.0F;
            var2[9] = 0.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[12] = 0.0F;
            var2[15] = 1.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
            var2[0] = 1.0F;
        }
        this.method816(14);
    }

    @OriginalMember(owner = "client!qfa", name = "ya", descriptor = "()V")
    public final void method518() {
        this.method791(true, true);
        ++field1308;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "(I)V")
    public final void method765(int arg0) {
        ++field1244;
        OpenGL.glPopMatrix();
        if (arg0 != 9697) {
            this.field1589 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "(I)I")
    private final int method766(int arg0) {
        ++field1295;
        int var2 = 0;
        this.field1524 = OpenGL.glGetString(7936).toLowerCase();
        this.field1572 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field1524.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field1524.indexOf("brian paul") != -1 || this.field1524.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class3.method22(true, ' ', var3.replace('.', ' '));
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class163.method1224(false, var4[0]);
                int var6 = class163.method1224(false, var4[1]);
                this.field1547 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field1547 < 12) {
            var2 |= 2;
        }
        if (!this.field1370.method3724("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field1370.method3724("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field1544 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field1563 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field1497 = var7[0];
        if (this.field1544 < 2 || ~this.field1563 > -3 || ~this.field1497 > -3) {
            var2 |= 16;
        }
        this.field1514 = Stream.method3953();
        if (arg0 != 8490) {
            this.method518();
        }
        this.field1578 = this.field1370.arePbuffersAvailable();
        this.field1526 = this.field1370.method3724("GL_ARB_vertex_buffer_object");
        this.field1473 = this.field1370.method3724("GL_ARB_multisample");
        this.field1565 = this.field1370.method3724("GL_ARB_vertex_program");
        this.field1370.method3724("GL_ARB_fragment_program");
        this.field1521 = this.field1370.method3724("GL_ARB_vertex_shader");
        this.field1523 = this.field1370.method3724("GL_ARB_fragment_shader");
        this.field1494 = this.field1370.method3724("GL_EXT_texture3D");
        this.field1517 = this.field1370.method3724("GL_ARB_texture_rectangle");
        this.field1559 = this.field1370.method3724("GL_ARB_texture_cube_map");
        this.field1574 = this.field1370.method3724("GL_ARB_texture_float");
        this.field1515 = false;
        this.field1577 = this.field1370.method3724("GL_EXT_framebuffer_object");
        this.field1476 = this.field1370.method3724("GL_EXT_framebuffer_blit");
        this.field1540 = this.field1370.method3724("GL_EXT_framebuffer_multisample");
        this.field1483 = this.field1476 & this.field1540;
        this.field1518 = class621.field8734.startsWith("mac");
        OpenGL.glGetFloatv(2834, class685.field9478, 0);
        this.field1503 = class685.field9478[0];
        this.field1490 = class685.field9478[1];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "(I)V")
    public final void method767(int arg0) {
        ++field1324;
        if (arg0 != -223) {
            this.field1524 = null;
        }
        if (this.field1467 != 8) {
            this.method743(-16026);
            this.method797((byte) 46, true);
            this.method785(true, (byte) 123);
            this.method791(true, true);
            this.method800(1, 28276);
            this.field1467 = 8;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "()I")
    public final int method535() {
        ++field1419;
        return 4;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "()Z")
    public final boolean method431() {
        ++field1337;
        if (this.field1429 != null) {
            if (!this.field1429.method943(-24106)) {
                if (!this.field1425.method2624(0, this.field1429)) {
                    return false;
                }
                this.field1420.method3990(-11332);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "()Z")
    public final boolean method462() {
        ++field1421;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(B)V")
    public final void method768(byte arg0) {
        ++field1258;
        if (arg0 > 3) {
            if (~this.field1467 != -5) {
                this.method780(15449);
                this.method797((byte) 70, false);
                this.method756(false, 90);
                this.method785(false, (byte) 123);
                this.method791(false, true);
                this.method747(-2, -2142656808);
                this.method800(1, 28276);
                this.field1467 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1234;
        this.method746(false);
        this.method800(arg5, 28276);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qfa", name = "XA", descriptor = "()I")
    public final int method513() {
        ++field1354;
        return this.field1581;
    }

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "()I")
    public final int method476() {
        ++field1266;
        int var1 = this.field1584;
        this.field1584 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFFZF)V")
    public final void method769(float arg0, float arg1, float arg2, boolean arg3, float arg4) {
        class685.field9478[2] = arg4;
        class685.field9478[1] = arg2;
        class685.field9478[3] = arg0;
        ++field1233;
        class685.field9478[0] = arg1;
        if (!arg3) {
            OpenGL.glTexEnvfv(8960, 8705, class685.field9478, 0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IB)I")
    public final int method770(int arg0, byte arg1) {
        ++field1230;
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (arg1 < 4) {
                    this.method551((class1) null, true);
                }
                if (arg0 != 5125 && ~arg0 != -5125 && arg0 != 5126) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "()Z")
    public final boolean method455() {
        ++field1404;
        return this.field1428.method2527(1, 3);
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "(B)V")
    private final void method771(byte arg0) {
        int var2 = 31 % ((39 - arg0) / 63);
        class685.field9478[0] = this.field1543 * this.field1536;
        class685.field9478[3] = 1.0F;
        ++field1283;
        class685.field9478[2] = this.field1543 * this.field1482;
        class685.field9478[1] = this.field1573 * this.field1543;
        OpenGL.glLightModelfv(2899, class685.field9478, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "(B)V")
    private final void method772(byte arg0) {
        if (~this.field1534 != -4) {
            this.field1534 = 3;
            this.method757(5888);
            this.method820((byte) -67);
            this.field1467 &= -8;
        }
        ++field1374;
        if (arg0 != -35) {
            this.method502(-20, 72, 85);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IJ)V")
    public final synchronized void method773(int arg0, long arg1) {
        ++field1298;
        class577 var4 = new class577();
        var4.field8133 = arg1;
        this.field1461.method1727(var4, (byte) 113);
        int var5 = -36 / ((70 - arg0) / 41);
    }

    @OriginalMember(owner = "client!qfa", name = "Y", descriptor = "()[I")
    public final int[] method510() {
        ++field1351;
        return new int[] { this.field1568, this.field1480, this.field1504, this.field1548 };
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "()V")
    public final void method447() {
        if (this.field1429 != null && this.field1429.method943(-24106)) {
            this.field1425.method2621(this.field1429, 119);
            this.field1420.method3990(-11332);
        }
        ++field1387;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(III)V")
    public final void method774(int arg0, int arg1, int arg2) {
        this.field1570 = arg2;
        this.field1562 = arg1;
        ++field1379;
        this.method787(1);
        this.method779((byte) -8);
        if (arg0 != -5976) {
            this.method785(true, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "GA", descriptor = "(I)V")
    public final void method509(int arg0) {
        this.method800(0, 28276);
        ++field1353;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BIII)V")
    public final void method775(byte arg0, int arg1, int arg2, int arg3) {
        ++field1243;
        OpenGL.glDrawArrays(arg2, arg1, arg3);
        if (arg0 > -21) {
            this.field1483 = true;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "M", descriptor = "()I")
    public final int method538() {
        ++field1382;
        int var1 = this.field1585;
        this.field1585 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)V")
    public final void method524(int arg0) {
        ++field1406;
    }

    @OriginalMember(owner = "client!qfa", name = "xa", descriptor = "(F)V")
    public final void method515(float arg0) {
        if (this.field1543 != arg0) {
            this.field1543 = arg0;
            this.method771((byte) -104);
        }
        ++field1361;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Liha;I)V")
    public final void method776(class32 arg0, int arg1) {
        if (arg1 == 411) {
            ++field1323;
            if (!this.field1476) {
                if (~this.field1443 <= -4) {
                    throw new RuntimeException();
                } else {
                    if (this.field1443 >= 0) {
                        this.field1450[this.field1443].method261(-108);
                    }
                    this.field1449 = this.field1446 = this.field1450[++this.field1443] = arg0;
                    this.field1449.method260(954);
                }
            } else {
                this.method799(arg0, 127);
                this.method763(arg0, (byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "(IIIII)V")
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method746(false);
        ++field1384;
        this.method800(arg4, 28276);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "(I)V")
    public final void method777(int arg0) {
        if (arg0 != -30909) {
            this.method819(3, -0.59872127F);
        }
        ++field1427;
        if (this.field1467 != 16) {
            this.method772((byte) -35);
            this.method797((byte) 46, true);
            this.method785(true, (byte) 123);
            this.method791(true, true);
            this.method800(1, 28276);
            this.field1467 = 16;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljaclib/memory/Buffer;IIIZ)Lgda;")
    public final class61 method778(Buffer arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1228;
        if (arg3 > -121) {
            this.method758(true);
        }
        return (class61) (!this.field1526 || arg4 && !this.field1496 ? new class118(this, arg2, arg0) : new class180(this, arg2, arg0, arg1, arg4));
    }

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "()Lqja;")
    public final class326 method505() {
        ++field1392;
        return new class630();
    }

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "(B)V")
    private final void method779(byte arg0) {
        int var2 = 74 / ((78 - arg0) / 45);
        if (this.field1475 >= this.field1553 && ~this.field1477 >= ~this.field1539) {
            OpenGL.glScissor(this.field1570 - -this.field1553, this.field1562 + this.field1223 + -this.field1539, this.field1475 - this.field1553, this.field1539 - this.field1477);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field1304;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(IIIIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1310;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method746(false);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method800(arg5, 28276);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1473) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1473) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFF)V")
    public final void method499(float arg0, float arg1, float arg2) {
        class583.field8251 = arg1;
        class22.field362 = arg0;
        class589.field8306 = arg2;
        ++field1391;
    }

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "(I)V")
    private final void method780(int arg0) {
        ++field1336;
        if (~this.field1534 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field1282 < -1 && ~this.field1223 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field1282, (double) this.field1223, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field1467 &= -25;
            this.field1534 = 1;
        }
        if (arg0 != 15449) {
            this.method806(3);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "EA", descriptor = "(IIII)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3) {
        ++field1290;
        if (!this.field1512) {
            throw new RuntimeException("");
        } else {
            this.field1505 = arg0;
            this.field1522 = arg2;
            this.field1532 = arg1;
            this.field1552 = arg3;
            if (this.field1582) {
                this.field1428.field5687.method1441((byte) -124);
                this.field1428.field5687.method1442(true);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILkda;II)V")
    public final void method781(int arg0, int arg1, class408 arg2, int arg3, int arg4) {
        ++field1224;
        if (arg0 != 5889) {
            this.method751(70, (byte) 56);
        }
        int var6 = arg2.method1246(-13768);
        int var7 = arg1 * this.method770(var6, (byte) 10);
        this.method817(arg2, -24211);
        OpenGL.glDrawElements(arg3, arg4, var6, arg2.method1242(arg0 ^ -6001) - -((long) var7));
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFI)V")
    public final void method782(float arg0, float arg1, int arg2) {
        this.field1520 = arg0;
        ++field1274;
        this.field1564 = arg1;
        if (arg2 != 1029) {
            this.field1556 = null;
        }
        this.method801((byte) -120);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        ++field1347;
    }

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "(Z)V")
    public final void method544(boolean arg0) {
        ++field1263;
        this.field1550 = arg0;
        this.method760((byte) -117);
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "(Z)V")
    private final void method783(boolean arg0) {
        this.field1370.method3723();
        ++field1389;
        if (arg0) {
            this.field1368 = 37L;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "(II)I")
    public final int method784(int arg0, int arg1) {
        ++field1277;
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            return 34023;
                        } else {
                            int var3 = -69 / ((arg0 - 9) / 47);
                            throw new IllegalArgumentException();
                        }
                    } else {
                        return 260;
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)V")
    public final void method785(boolean arg0, byte arg1) {
        ++field1317;
        if (arg1 == 123) {
            if (!arg0 == this.field1462) {
                if (!arg0) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field1467 &= -32;
                this.field1462 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "(Z)V")
    private final void method786(boolean arg0) {
        if (this.field1551) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field1551 = false;
        }
        ++field1315;
        if (arg0) {
            this.method544(true);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "(I)V")
    private final void method787(int arg0) {
        ++field1359;
        if (arg0 == 1) {
            OpenGL.glViewport(this.field1570, this.field1562, this.field1282, this.field1223);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8) {
        ++field1312;
        class444 var10 = (class444) arg6;
        class192 var11 = var10.field6042;
        this.method809((byte) -1);
        this.method808((byte) 34, var10.field6042);
        this.method800(arg5, 28276);
        this.method802(8448, 11762, 7681);
        this.method789(34167, 768, 0, (byte) 47);
        float var12 = var11.field2959 / (float) var11.field2967;
        float var13 = var11.field2965 / (float) var11.field2960;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method789(5890, 768, 0, (byte) 47);
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
    public final void method471(int arg0) {
        this.method783(false);
        ++field1313;
    }

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "()Z")
    public final boolean method516() {
        ++field1299;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "(II)V")
    public final void method788(int arg0, int arg1) {
        class685.field9478[0] = (float) class702.method3977(16711680, arg1) / 1.671168E7F;
        class685.field9478[3] = (float) (arg1 >>> 24) / 255.0F;
        class685.field9478[2] = (float) class702.method3977(arg1, 255) / 255.0F;
        ++field1285;
        class685.field9478[1] = (float) class702.method3977(65280, arg1) / 65280.0F;
        if (arg0 <= 13) {
            this.field1489 = null;
        }
        OpenGL.glTexEnvfv(8960, 8705, class685.field9478, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIII)V")
    public final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1390;
        OpenGL.glLineWidth((float) arg5);
        this.method487(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "()I")
    public final int method433() {
        ++field1352;
        return this.field1454 + this.field1452 + this.field1455;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIB)V")
    public final void method789(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
        ++field1307;
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
        if (arg3 != 47) {
            this.field1489 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(III)V")
    public final synchronized void method790(int arg0, int arg1, int arg2) {
        ++field1408;
        class489 var4 = new class489(arg0);
        var4.field8133 = (long) arg1;
        this.field1457.method1727(var4, (byte) 92);
        if (arg2 != 8960) {
            this.method551((class1) null, false);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lkd;)V")
    public final void method504(class296 arg0) {
        this.field1431.method1216(false, -1, this, arg0);
        ++field1225;
    }

    @OriginalMember(owner = "client!qfa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1328;
        float var10;
        float var11;
        if (this.field1538 != null && this.field1538.field5144 >= arg2 && ~this.field1538.field5152 <= ~arg3) {
            this.field1538.method2313(0, arg6, 0, arg2, false, 0, 0, arg3, 6406, (byte) 120);
            var10 = (float) arg3 * this.field1538.field2965 / (float) this.field1538.field5152;
            var11 = (float) arg2 * this.field1538.field2959 / (float) this.field1538.field5144;
        } else {
            this.field1538 = class243.method1618(arg2, this, false, arg3, arg6, 3361, 6406, 6406);
            this.field1538.method2314(false, false, 0);
            var10 = this.field1538.field2965;
            var11 = this.field1538.field2959;
        }
        this.method809((byte) -1);
        this.method808((byte) 34, this.field1538);
        this.method800(arg8, 28276);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method788(75, arg5);
        this.method802(34165, 11762, 34165);
        this.method789(34166, 768, 0, (byte) 47);
        this.method789(5890, 770, 2, (byte) 47);
        this.method745(34166, 123, 770, 0);
        this.method745(5890, 24, 770, 2);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method789(5890, 768, 0, (byte) 47);
        this.method789(34166, 770, 2, (byte) 47);
        this.method745(5890, -113, 770, 0);
        this.method745(34166, 102, 770, 2);
    }

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "(II)V")
    public final void method450(int arg0, int arg1) {
        ++field1300;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lkfa;Lts;)Lpt;")
    public final class555 method443(class627 arg0, class560 arg1) {
        ++field1248;
        return null;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method537(Canvas arg0) {
        this.field1348 = 0L;
        this.field1350 = null;
        ++field1344;
        if (arg0 != null && this.field1302 != arg0) {
            if (this.field1250.containsKey(arg0)) {
                Long var2 = (Long) this.field1250.get(arg0);
                this.field1348 = var2;
                this.field1350 = arg0;
            }
        } else {
            this.field1350 = this.field1302;
            this.field1348 = this.field1368;
        }
        if (this.field1350 != null && this.field1348 != 0L) {
            this.field1370.setSurface(this.field1348);
            this.method806(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "()Z")
    public final boolean method441() {
        ++field1286;
        return false;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZZ)V")
    public final void method791(boolean arg0, boolean arg1) {
        ++field1253;
        if (arg0 == !this.field1465) {
            this.field1465 = arg0;
            this.method760((byte) 95);
            this.field1467 &= -32;
        }
        if (!arg1) {
            this.method763((class32) null, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "(I)V")
    private final void method792(int arg0) {
        if (arg0 != -31489) {
            this.method439(11, -114, 112, -111, -64, -1.1541241F);
        }
        ++field1341;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field1576, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;")
    public final class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3) {
        ++field1235;
        if (arg0 != null && arg1 != null && this.field1559 && this.field1577) {
            class586 var5 = null;
            class168 var6 = (class168) arg0;
            class168 var7 = (class168) arg1;
            class425 var8 = var6.method691(10002);
            class425 var9 = var7.method691(10002);
            if (var8 != null && var9 != null) {
                int var10 = var9.field5802 >= var8.field5802 ? var9.field5802 : var8.field5802;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class586) {
                    class586 var11 = (class586) arg3;
                    if (var11.method3419((byte) 74) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class586(this, var10);
                }
                if (var5.method3420(var8, var9, arg2, 10835)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([BIIIZ)Lkda;")
    public final class408 method793(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 != 64) {
            return null;
        } else {
            ++field1269;
            return (class408) (!this.field1526 || arg4 && !this.field1496 ? new class738(this, arg2, arg0, arg1) : new class167(this, arg2, arg0, arg1, arg4));
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIZ)Ljd;")
    public final class241 method517(int arg0, int arg1, boolean arg2) {
        ++field1375;
        return new class219(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([IIIIIZ)Ljd;")
    public final class241 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1397;
        return new class219(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI[BI)Lgda;")
    public final class61 method794(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field1294;
        if (!this.field1526 || arg1 && !this.field1496) {
            return arg2 != 0 ? null : new class118(this, arg0, arg3, arg4);
        } else {
            return new class180(this, arg0, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "(II)V")
    public final void method795(int arg0, int arg1) {
        if (arg1 != 34023) {
            this.method552(122, -51, (int[]) null, (int[]) null);
        }
        if (~arg0 == -2) {
            this.method802(7681, arg1 ^ 43285, 7681);
        } else if (~arg0 != -1) {
            if (arg0 != 2) {
                if (arg0 == 3) {
                    this.method802(8448, arg1 ^ 43285, 260);
                } else if (~arg0 == -5) {
                    this.method802(34023, arg1 + -22261, 34023);
                }
            } else {
                this.method802(7681, arg1 + -22261, 34165);
            }
        } else {
            this.method802(8448, 11762, 8448);
        }
        ++field1255;
    }

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "(I)V")
    private final void method796(int arg0) {
        this.method747(-2, -2142656808);
        ++field1407;
        for (int var2 = this.field1544 + -1; var2 >= 0; --var2) {
            this.method813((byte) 103, var2);
            this.method808((byte) 34, (class188) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method802(8448, arg0 + 11762, 8448);
        this.method789(34168, 770, 2, (byte) 47);
        this.method786(false);
        this.field1466 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field1469 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, (float) arg0);
        this.field1463 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field1464 = true;
        this.method797((byte) 56, true);
        this.method756(true, 97);
        this.method785(true, (byte) 123);
        this.method791(true, true);
        this.method805(-34);
        this.field1370.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field1545 = this.field1513 = -1;
        this.method511();
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BZ)V")
    public final void method797(byte arg0, boolean arg1) {
        if (this.field1579 == !arg1) {
            this.field1579 = arg1;
            this.method752((byte) -128);
            this.field1467 &= -32;
        }
        if (arg0 <= 35) {
            this.method488(10, -62, (int[][]) null, (int[][]) null, -3, 78, 20);
        }
        ++field1334;
    }

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "(I)V")
    private final void method798(int arg0) {
        ++field1373;
        this.field1531 = new class188[this.field1544];
        this.field1510 = new class373(this, 3553, 6408, 1, 1);
        if (arg0 >= -27) {
            this.field1490 = -0.5921605F;
        }
        new class373(this, 3553, 6408, 1, 1);
        new class373(this, 3553, 6408, 1, 1);
        this.field1571 = new class10(this);
        this.field1478 = new class10(this);
        this.field1489 = new class10(this);
        this.field1479 = new class10(this);
        this.field1566 = new class10(this);
        this.field1557 = new class10(this);
        this.field1511 = new class10(this);
        this.field1519 = new class10(this);
        this.field1537 = new class10(this);
        this.field1541 = new class10(this);
        if (this.field1577) {
            this.field1501 = new class54(this);
            new class54(this);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lqaa;)V")
    public final void method464(class29 arg0) {
        ++field1418;
        this.field1546 = (class168) arg0;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Liha;I)V")
    public final void method799(class32 arg0, int arg1) {
        ++field1301;
        if (~this.field1448 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field1448 >= 0) {
                this.field1447[this.field1448].method262((byte) 119);
            }
            this.field1449 = this.field1447[++this.field1448] = arg0;
            this.field1449.method265(-25519);
            if (arg1 < 2) {
                this.field1488 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "(II)V")
    public final void method800(int arg0, int arg1) {
        if (this.field1466 != arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    var3 = true;
                    var4 = 2;
                    var5 = false;
                } else if (~arg0 == -129) {
                    var4 = 3;
                    var5 = true;
                    var3 = true;
                } else {
                    var3 = true;
                    var4 = 0;
                    var5 = false;
                }
            } else {
                var4 = 1;
                var5 = true;
                var3 = true;
            }
            if (!this.field1464 != !var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field1464 = var3;
            }
            if (!var5 != !this.field1463) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field1463 = var5;
            }
            if (this.field1469 != var4) {
                if (var4 != 1) {
                    if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var4 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field1469 = var4;
            }
            this.field1466 = arg0;
            this.field1467 &= -29;
        }
        if (arg1 != 28276) {
            this.field1474 = 26;
        }
        ++field1399;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(B)V")
    private final void method801(byte arg0) {
        ++field1254;
        this.field1567 = (float) (-this.field1495 + this.field1581) - this.field1520;
        this.field1528 = this.field1567 - (float) this.field1580 * this.field1564;
        if (this.field1528 < (float) this.field1491) {
            this.field1528 = (float) this.field1491;
        }
        OpenGL.glFogf(2915, this.field1528);
        OpenGL.glFogf(2916, this.field1567);
        if (arg0 > -115) {
            this.field1348 = -20L;
        }
        class685.field9478[0] = (float) class702.method3977(16711680, this.field1513) / 1.671168E7F;
        class685.field9478[2] = (float) class702.method3977(255, this.field1513) / 255.0F;
        class685.field9478[1] = (float) class702.method3977(65280, this.field1513) / 65280.0F;
        OpenGL.glFogfv(2918, class685.field9478, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIZ)Ljd;")
    public final class241 method479(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1319;
        return new class219(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "()V")
    public final void method548() {
        ++field1293;
        if (this.field1502 && this.field1282 > 0 && this.field1223 > 0) {
            int var1 = this.field1553;
            int var2 = this.field1475;
            int var3 = this.field1477;
            int var4 = this.field1539;
            this.method511();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method805(-122);
            this.method797((byte) 73, false);
            this.method756(false, 109);
            this.method785(false, (byte) 123);
            this.method791(false, true);
            this.method808((byte) 34, (class188) null);
            this.method747(-2, -2142656808);
            this.method795(1, 34023);
            this.method800(0, 28276);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field1282, this.field1223, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method434(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1309;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class444 var13 = (class444) arg6;
            class192 var14 = var13.field6042;
            this.method809((byte) -1);
            this.method808((byte) 34, var13.field6042);
            this.method800(arg5, 28276);
            this.method802(8448, 11762, 7681);
            this.method789(34167, 768, 0, (byte) 47);
            float var15 = var14.field2959 / (float) var14.field2967;
            float var16 = var14.field2965 / (float) var14.field2960;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            float var21 = var17 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var20) {
                var27 = (float) (arg9 - var20) * var21;
                var28 = (float) (-var20 + arg9) * var22;
            } else {
                var26 = (float) (arg9 + arg10 + -var20) * var22;
                var25 = (float) (arg9 + arg10 + -var20) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (~arg0 > ~arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg3 <= arg1) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method789(5890, 768, 0, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([I)V")
    public final void method549(int[] arg0) {
        arg0[1] = this.field1223;
        arg0[0] = this.field1282;
        ++field1260;
    }

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "(III)V")
    public final void method802(int arg0, int arg1, int arg2) {
        if (~this.field1583 == -1) {
            boolean var4 = false;
            if (this.field1486 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field1486 = arg2;
                var4 = true;
            }
            if (this.field1499 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field1499 = arg0;
            }
            if (var4) {
                this.field1467 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        if (arg1 == 11762) {
            ++field1311;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "()I")
    public final int method457() {
        ++field1291;
        return this.field1491;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method493(Canvas arg0) {
        ++field1417;
        if (this.field1302 == arg0) {
            throw new RuntimeException();
        } else if (this.field1250.containsKey(arg0)) {
            Long var2 = (Long) this.field1250.get(arg0);
            this.field1370.releaseSurface(arg0, var2);
            this.field1250.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lus;Z)Ljd;")
    public final class241 method551(class1 arg0, boolean arg1) {
        ++field1388;
        int[] var3 = new int[arg0.field7 * arg0.field4];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2 == null) {
            for (int var6 = 0; ~arg0.field7 < ~var6; ++var6) {
                for (int var7 = 0; ~arg0.field4 < ~var7; ++var7) {
                    int var8 = arg0.field6[255 & arg0.field3[var4++]];
                    var3[var5++] = var8 != 0 ? class746.method4158(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field7; ++var9) {
                for (int var11 = 0; var11 < arg0.field4; ++var11) {
                    var3[var5++] = class746.method4158(arg0.field2[var4] << 24, arg0.field6[class702.method3977(arg0.field3[var4], 255)]);
                    ++var4;
                }
            }
        }
        class241 var10 = this.method458((byte) 88, arg0.field7, arg0.field4, var3, arg0.field4, 0);
        var10.method1506(arg0.field1, arg0.field5, arg0.field8, arg0.field9);
        return var10;
    }

    @OriginalMember(owner = "client!qfa", name = "U", descriptor = "(IIIII)V")
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1332;
        this.method746(false);
        this.method800(arg4, 28276);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "(Z)Lqba;")
    public final class425 method803(boolean arg0) {
        ++field1325;
        if (!arg0) {
            this.field1512 = false;
        }
        return this.field1546 == null ? null : this.field1546.method691(10002);
    }

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "(I)V")
    private final void method804(int arg0) {
        ++field1278;
        int var2 = 0;
        if (arg0 == 6717) {
            while (!this.field1370.method3725()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class107.method828(1000L, (byte) 36);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "()Z")
    public final boolean method494() {
        ++field1284;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "(I)V")
    public final void method805(int arg0) {
        if (this.field1534 != 0) {
            this.field1534 = 0;
            this.field1467 &= -32;
        }
        int var2 = 7 / ((arg0 - -77) / 41);
        ++field1259;
    }

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "()Z")
    public final boolean method492() {
        ++field1303;
        return this.field1473 && (!this.method451() || this.field1483);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method475(Canvas arg0, int arg1, int arg2) {
        ++field1249;
        long var4 = 0L;
        if (arg0 != null && this.field1302 != arg0) {
            if (this.field1250.containsKey(arg0)) {
                Long var6 = (Long) this.field1250.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field1368;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field1370.surfaceResized(var4);
            if (this.field1350 == arg0) {
                this.method806(0);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) throws class736 {
        try {
            this.field1370.swapBuffers();
        } catch (Exception var3) {
        }
        ++field1318;
    }

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "(I)V")
    private final void method806(int arg0) {
        ++field1363;
        if (this.field1350 == null) {
            this.field1403 = this.field1411 = 0;
        } else {
            Dimension var2 = this.field1350.getSize();
            this.field1411 = var2.height;
            this.field1403 = var2.width;
        }
        if (this.field1446 == null) {
            this.field1223 = this.field1411;
            this.field1282 = this.field1403;
            this.method787(arg0 ^ 1);
        }
        this.method805(120);
        if (arg0 != 0) {
            this.method503(-1, 124, 26, -103);
        }
        this.method511();
    }

    @OriginalMember(owner = "client!qfa", name = "HA", descriptor = "(IIII[I)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1236;
        float var6 = (float) arg2 * this.field1468.field8850 + (float) arg0 * this.field1468.field8853 + (float) arg1 * this.field1468.field8833 + this.field1468.field8824;
        if (!(var6 < (float) this.field1491) && !(var6 > (float) this.field1581)) {
            int var7 = (int) (((float) arg2 * this.field1468.field8826 + (float) arg0 * this.field1468.field8825 + (float) arg1 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field1468.field8831 + (float) arg0 * this.field1468.field8855 + (float) arg1 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / (float) arg3);
            if (this.field1509 <= (float) var7 && this.field1527 >= (float) var7 && this.field1484 <= (float) var8 && this.field1487 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 - this.field1509);
                arg4[1] = (int) ((float) var8 + -this.field1484);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "(ILaa;II)V")
    public final void method490(int arg0, class511 arg1, int arg2, int arg3) {
        ++field1261;
        class444 var5 = (class444) arg1;
        class192 var6 = var5.field6042;
        this.method809((byte) -1);
        this.method808((byte) 34, var5.field6042);
        this.method800(1, 28276);
        this.method802(8448, 11762, 7681);
        this.method789(34167, 768, 0, (byte) 47);
        float var7 = var6.field2959 / (float) var6.field2967;
        float var8 = var6.field2965 / (float) var6.field2960;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1553) * var7, (float) (this.field1477 - arg3) * var8);
        OpenGL.glVertex2i(this.field1553, this.field1477);
        OpenGL.glTexCoord2f((float) (this.field1553 - arg2) * var7, (float) (this.field1539 - arg3) * var8);
        OpenGL.glVertex2i(this.field1553, this.field1539);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1475) * var7, (float) (this.field1539 - arg3) * var8);
        OpenGL.glVertex2i(this.field1475, this.field1539);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1475) * var7, (float) (this.field1477 - arg3) * var8);
        OpenGL.glVertex2i(this.field1475, this.field1477);
        OpenGL.glEnd();
        this.method789(5890, 768, 0, (byte) 47);
    }

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "()V")
    public final void method468() {
        ++field1356;
        if (!this.field1577) {
            if (!this.field1578) {
                throw new RuntimeException("");
            }
            this.field1442.method360(0, 0, this.field1282, this.field1223, 0, 0);
            this.field1370.setSurface(this.field1348);
        } else {
            if (this.field1445 != this.field1446) {
                throw new RuntimeException();
            }
            this.field1445.method372(0, 103);
            this.field1445.method372(8, 89);
            this.method755(this.field1445, 0);
        }
        this.field1223 = this.field1411;
        this.field1442 = null;
        this.field1282 = this.field1403;
        this.method805(120);
        this.method787(1);
        this.method511();
    }

    @OriginalMember(owner = "client!qfa", name = "pa", descriptor = "()V")
    public final void method489() {
        ++field1346;
        this.field1512 = false;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class294 method488(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1271;
        return new class626(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(IIIIII)Lqaa;")
    public final class29 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1257;
        return !this.field1559 ? null : new class94(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lgda;I)V")
    public final void method807(class61 arg0, int arg1) {
        ++field1252;
        int var3 = -126 / ((58 - arg1) / 53);
        if (this.field1560 != arg0) {
            if (this.field1526) {
                OpenGL.glBindBufferARB(34962, arg0.method407(false));
            }
            this.field1560 = arg0;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLdca;)V")
    public final void method808(byte arg0, class188 arg1) {
        ++field1246;
        class188 var3 = this.field1531[this.field1583];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (arg1.field2899 != var3.field2899) {
                        OpenGL.glDisable(var3.field2899);
                        OpenGL.glEnable(arg1.field2899);
                    }
                } else {
                    OpenGL.glEnable(arg1.field2899);
                }
                OpenGL.glBindTexture(arg1.field2899, arg1.method1313(9728));
            } else {
                OpenGL.glDisable(var3.field2899);
            }
            this.field1531[this.field1583] = arg1;
        }
        if (arg0 != 34) {
            this.field1532 = -12;
        }
        this.field1467 &= -2;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "()Z")
    public final boolean method452() {
        ++field1364;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "(B)V")
    public final void method809(byte arg0) {
        if (this.field1467 != 2) {
            this.method780(15449);
            this.method797((byte) 74, false);
            this.method756(false, 115);
            this.method785(false, (byte) 123);
            this.method791(false, true);
            this.method747(-2, -2142656808);
            this.field1467 = 2;
        }
        ++field1314;
        if (arg0 != -1) {
            this.field1569 = -120;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "()Z")
    public final boolean method534() {
        ++field1366;
        return this.field1429 != null && (~this.field1432 >= -2 || this.field1483);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZZII)V")
    public final void method810(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (~this.field1533 != ~arg3 || !this.field1512 != !this.field1582) {
            class373 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field1512 ? 3 : 0;
            if (~arg3 > -1) {
                this.method786(false);
            } else {
                var5 = this.field1420.method3987(arg3, -25045);
                class467 var10 = super.field774.method1208((byte) 47, arg3);
                if (var10.field6577 == 0 && ~var10.field6569 == -1) {
                    this.method786(false);
                } else {
                    int var11 = !var10.field6574 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method812((float) (this.field1437 % var12 * var10.field6569) / (float) var12, 0.0F, (float) (this.field1437 % var12 * var10.field6577) / (float) var12, 9404);
                }
                if (!this.field1512) {
                    var7 = var10.field6562;
                    var8 = var10.field6561;
                    var9 = var10.field6567;
                }
                var6 = var10.field6557;
            }
            this.field1428.method2528(-12, var9, arg1, var7, var8, arg0);
            if (!this.field1428.method2526(var5, var6, 127)) {
                this.method808((byte) 34, var5);
                this.method795(var6, 34023);
            }
            this.field1533 = arg3;
            this.field1582 = this.field1512;
        }
        ++field1329;
        if (arg2 != 128) {
            this.field1450 = null;
        }
        this.field1467 &= -8;
    }

    @OriginalMember(owner = "client!qfa", name = "DA", descriptor = "(IIII)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        this.field1568 = arg0;
        this.field1480 = arg1;
        ++field1292;
        this.field1548 = arg3;
        this.field1504 = arg2;
        this.method764(8);
        this.method762(4611);
        if (~this.field1534 == -4) {
            this.method757(5888);
        } else if (~this.field1534 == -3) {
            this.method792(-31489);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "()Lqja;")
    public final class326 method514() {
        ++field1394;
        return this.field1433;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)V")
    public final synchronized void method811(int arg0, byte arg1, int arg2) {
        ++field1362;
        if (arg1 != 14) {
            this.field1431 = null;
        }
        class489 var4 = new class489(arg2);
        var4.field8133 = (long) arg0;
        this.field1459.method1727(var4, (byte) 78);
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "()Lqja;")
    public final class326 method440() {
        ++field1355;
        return this.field1468;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFFI)V")
    private final void method812(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field1385;
        if (this.field1551) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        OpenGL.glMatrixMode(5888);
        if (arg3 != 9404) {
            this.method793((byte[]) null, 86, 113, -117, false);
        }
        this.field1551 = true;
    }

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "()V")
    public final void method486() {
        ++field1322;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V")
    public final void method813(byte arg0, int arg1) {
        ++field1365;
        if (arg0 != 103) {
            this.method524(51);
        }
        if (this.field1583 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field1583 = arg1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(IB)I")
    public final int method814(int arg0, byte arg1) {
        ++field1239;
        if (arg0 != 6406 && arg0 != 6409) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (~arg0 != -6409 && ~arg0 != -34848) {
                    if (~arg0 != -34844) {
                        if (arg0 != 34842) {
                            if (~arg0 != -6403) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else if (arg1 >= -126) {
                                    return -25;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 8;
                        }
                    } else {
                        return 6;
                    }
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "(B)V")
    private final void method815(byte arg0) {
        class685.field9478[2] = this.field1558 * this.field1482;
        class685.field9478[0] = this.field1558 * this.field1536;
        class685.field9478[3] = 1.0F;
        ++field1330;
        class685.field9478[1] = this.field1573 * this.field1558;
        OpenGL.glLightfv(16384, 4609, class685.field9478, 0);
        class685.field9478[3] = 1.0F;
        if (arg0 < 87) {
            this.field1513 = -53;
        }
        class685.field9478[2] = -this.field1535 * this.field1482;
        class685.field9478[0] = -this.field1535 * this.field1536;
        class685.field9478[1] = -this.field1535 * this.field1573;
        OpenGL.glLightfv(16385, 4609, class685.field9478, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method746(false);
        ++field1395;
        this.method800(arg12, 28276);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "(I)V")
    private final void method816(int arg0) {
        this.field1576[arg0] = this.field1507;
        ++field1256;
        this.field1576[10] = this.field1575;
        this.field1493 = (this.field1576[14] - (float) this.field1581) / this.field1576[10];
        this.field1516 = (float) this.field1581;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ldba;IIII)Lka;")
    public final class496 method480(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1349;
        return new class10(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lkda;I)V")
    public final void method817(class408 arg0, int arg1) {
        ++field1238;
        if (this.field1549 != arg0) {
            if (this.field1526) {
                OpenGL.glBindBufferARB(34963, arg0.method1245(arg1 ^ 17214));
            }
            this.field1549 = arg0;
        }
        if (arg1 != -24211) {
            this.field1548 = -75;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736 {
        this.method463(arg2, arg3);
        ++field1287;
    }

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "()V")
    public final void method506() {
        ++field1400;
        this.field1425.method2630(false);
    }

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "(Liha;I)V")
    public final void method818(class32 arg0, int arg1) {
        ++field1409;
        if (this.field1448 >= arg1 && this.field1447[this.field1448] == arg0) {
            this.field1447[this.field1448--] = null;
            arg0.method262((byte) -33);
            if (~this.field1448 <= -1) {
                this.field1449 = this.field1447[this.field1448];
                this.field1449.method265(-25519);
            } else {
                this.field1449 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)Lkfa;")
    public final class627 method481(int arg0, int arg1) {
        ++field1381;
        return null;
    }

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "(II)V")
    public final void method530(int arg0, int arg1) {
        if (~this.field1491 != ~arg0 || ~this.field1581 != ~arg1) {
            this.field1491 = arg0;
            this.field1581 = arg1;
            this.method764(8);
            this.method801((byte) -120);
            if (~this.field1534 == -4) {
                this.method757(5888);
            } else if (~this.field1534 == -3) {
                this.method792(-31489);
            }
        }
        ++field1245;
    }

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "(III[I)V")
    public final void method474(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1424;
        float var5 = (float) arg2 * this.field1468.field8850 + (float) arg0 * this.field1468.field8853 + (float) arg1 * this.field1468.field8833 + this.field1468.field8824;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field1468.field8826 + (float) arg0 * this.field1468.field8825 + (float) arg1 * this.field1468.field8847 + this.field1468.field8835) * (float) this.field1504 / var5);
            arg3[0] = (int) ((float) var6 - this.field1509);
            int var7 = (int) (((float) arg2 * this.field1468.field8831 + (float) arg0 * this.field1468.field8855 + (float) arg1 * this.field1468.field8852 + this.field1468.field8848) * (float) this.field1548 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field1484);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIIID)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field1383;
    }

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "()Lcq;")
    public final class491 method553() {
        ++field1280;
        int var1 = -1;
        if (this.field1524.indexOf("nvidia") == -1) {
            if (this.field1524.indexOf("intel") == -1) {
                if (~this.field1524.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class491(var1, "OpenGL", this.field1547, this.field1572, 0L);
    }

    @OriginalMember(owner = "client!qfa", name = "la", descriptor = "()V")
    public final void method511() {
        ++field1264;
        this.field1475 = this.field1282;
        this.field1539 = this.field1223;
        this.field1553 = 0;
        this.field1477 = 0;
        OpenGL.glDisable(3089);
        this.method762(4611);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IF)V")
    public final void method819(int arg0, float arg1) {
        ++field1232;
        if (arg0 == 3) {
            if (this.field1492 != arg1) {
                this.field1492 = arg1;
                if (this.field1534 == 3) {
                    this.method757(5888);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(II)I")
    public final int method512(int arg0, int arg1) {
        ++field1357;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "(B)V")
    private final void method820(byte arg0) {
        if (arg0 >= -57) {
            this.field1532 = -110;
        }
        OpenGL.glLoadIdentity();
        ++field1321;
        OpenGL.glMultMatrixf(this.field1471.method3607((byte) -128), 0);
        if (this.field1582) {
            this.field1428.field5687.method1441((byte) -113);
        }
        this.method753(-121);
        this.method758(true);
    }

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "(I)V")
    public final void method525(int arg0) {
        ++field1226;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field1415 = arg0;
            this.field1420.method3990(-11332);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "([I)V")
    public final void method449(int[] arg0) {
        arg0[2] = this.field1475;
        arg0[0] = this.field1553;
        arg0[3] = this.field1539;
        ++field1306;
        arg0[1] = this.field1477;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class106(Canvas arg0, class160 arg1, int arg2) {
        super(arg1);
        new class83();
        new class353(16);
        this.field1453 = new class266();
        this.field1456 = new class266();
        this.field1457 = new class266();
        this.field1458 = new class266();
        this.field1459 = new class266();
        this.field1460 = new class266();
        this.field1461 = new class266();
        this.field1468 = new class630();
        this.field1471 = new class630();
        this.field1472 = new class630();
        this.field1488 = new float[4];
        this.field1503 = -1.0F;
        this.field1504 = 512;
        this.field1491 = 50;
        this.field1493 = 3584.0F;
        this.field1520 = 0.0F;
        this.field1495 = 0;
        this.field1490 = -1.0F;
        this.field1480 = 0;
        this.field1477 = 0;
        this.field1522 = -1;
        this.field1516 = 3584.0F;
        this.field1539 = 0;
        this.field1499 = 8448;
        this.field1536 = 1.0F;
        this.field1492 = 1.0F;
        this.field1542 = new float[4];
        this.field1529 = new float[4];
        this.field1513 = -1;
        this.field1482 = 1.0F;
        this.field1475 = 0;
        this.field1553 = 0;
        this.field1530 = new class154[class163.field2592];
        this.field1535 = -1.0F;
        this.field1532 = -1;
        this.field1548 = 512;
        this.field1545 = -1;
        this.field1564 = 1.0F;
        this.field1568 = 0;
        this.field1556 = new float[4];
        this.field1558 = -1.0F;
        this.field1573 = 1.0F;
        this.field1552 = 0;
        this.field1576 = new float[16];
        this.field1580 = -1;
        this.field1562 = 0;
        this.field1550 = true;
        this.field1570 = 0;
        this.field1486 = 8448;
        this.field1581 = 3584;
        this.field1582 = false;
        this.field1485 = new class538(8192);
        this.field1586 = new int[1];
        this.field1587 = new byte[16384];
        this.field1588 = new int[1];
        this.field1589 = new int[1];
        this.field1350 = this.field1302 = arg0;
        this.field1432 = arg2;
        if (!class581.method3402("jaclib", (byte) -18)) {
            throw new RuntimeException("");
        } else if (!class581.method3402("jaggl", (byte) -18)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field1370 = new OpenGL();
                this.field1348 = this.field1368 = this.field1370.init(arg0, 8, 8, 8, 24, 0, this.field1432);
                if (this.field1368 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method804(6717);
                    int var4 = this.method766(8490);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field1474 = this.field1514 ? 33639 : 5121;
                        if (this.field1572.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class3.method22(true, ' ', this.field1572.replace('/', ' '));
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class670.method3805(var10.substring(1, 3), (byte) 5)) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (var10.length() >= 4 && class670.method3805(var10.substring(0, 4), (byte) -101)) {
                                                var5 = class163.method1224(false, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field1526 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field1494 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field1574 = false;
                            }
                            this.field1517 &= this.field1370.method3724("GL_ARB_half_float_pixel");
                            this.field1496 = this.field1526;
                            this.field1525 = true;
                        }
                        if (~this.field1524.indexOf("intel") != 0) {
                            this.field1577 = false;
                        }
                        this.field1502 = !this.field1524.equals("s3 graphics");
                        if (this.field1526) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class486.method2895(true, false, (byte) 121);
                        this.field1440 = true;
                        this.field1420 = new class705(this, super.field774);
                        this.method798(-108);
                        this.field1438 = new class199(this);
                        this.field1425 = new class440(this);
                        if (this.field1425.method2629(-118)) {
                            this.field1429 = new class13(this);
                            if (!this.field1429.method146((byte) 117)) {
                                this.field1429.method143(125);
                                this.field1429 = null;
                            }
                        }
                        this.field1428 = new class415(this);
                        this.method796(0);
                        this.method806(0);
                        this.method548();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method484();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(ZI)V")
    public final void method821(boolean arg0, int arg1) {
        ++field1340;
        if (arg1 < 45) {
            this.method434(-19, -63, -67, -99);
        }
        if (arg0 == !this.field1500) {
            this.field1500 = arg0;
            this.method822(0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "(I)V")
    private final void method822(int arg0) {
        ++field1227;
        if (arg0 != 0) {
            this.field1471 = null;
        }
        if (this.field1481 && !this.field1500) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "(I)V")
    public final void method823(int arg0) {
        ++field1410;
        if (arg0 < 71) {
            this.method490(38, (class511) null, -120, 28);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "()Z")
    public final boolean method483() {
        ++field1430;
        return true;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
        ++field1289;
        this.field1425.method2627(107, arg1, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "()Z")
    public final boolean method451() {
        ++field1270;
        return this.field1429 != null && this.field1429.method943(-24106);
    }

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "()V")
    public final void method484() {
        ++field1273;
        for (class577 var1 = this.field1436.method1731((byte) -123); var1 != null; var1 = this.field1436.method1724(0)) {
            ((class466) var1).method2786(false);
        }
        if (this.field1425 != null) {
            this.field1425.method2626(0);
        }
        if (this.field1370 != null) {
            this.method783(false);
            Enumeration var2 = this.field1250.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field1250.get(var3);
                this.field1370.releaseSurface(var3, var4);
            }
            this.field1370.release();
            this.field1370 = null;
        }
        if (this.field1440) {
            class467.method2791(true, false, (byte) -93);
            this.field1440 = false;
        }
    }
}
