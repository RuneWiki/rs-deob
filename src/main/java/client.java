import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client")
public class client extends GameShell {

    @OriginalMember(owner = "client", name = "L", descriptor = "B")
    private byte field1183 = -21;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1185 = -1;

    @OriginalMember(owner = "client", name = "P", descriptor = "Z")
    private boolean field1187 = false;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1188 = -1;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1198 = -1;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1208 = new int[4000];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1209 = new int[4000];

    @OriginalMember(owner = "client", name = "mb", descriptor = "[Ljava/lang/String;")
    private String[] field1210 = new String[500];

    @OriginalMember(owner = "client", name = "nb", descriptor = "[Ljc;")
    private CollisionMap[] field1211 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field1213 = new int[7];

    @OriginalMember(owner = "client", name = "rb", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1218 = 2;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[I")
    private int[] field1219 = new int[5];

    @OriginalMember(owner = "client", name = "wb", descriptor = "Z")
    public boolean field1220 = false;

    @OriginalMember(owner = "client", name = "yb", descriptor = "B")
    private byte field1222 = 69;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1227 = 1;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1232 = 3;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "B")
    private byte field1234 = 8;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "B")
    private byte field1235 = 4;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private boolean field1237 = false;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field1240 = false;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Z")
    private boolean field1241 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field1245 = new int[33];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "B")
    private byte field1246 = 118;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field1247 = new int[100];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[Ljava/lang/String;")
    private String[] field1248 = new String[100];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[Ljava/lang/String;")
    private String[] field1249 = new String[100];

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private int[] field1255 = new int[50];

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1262 = -1;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private final int field1263 = 100;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field1264 = new int[100];

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1267 = 9;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljava/lang/String;")
    private String field1274 = "";

    @OriginalMember(owner = "client", name = "zc", descriptor = "B")
    private byte field1275 = 8;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    private final int[] field1276 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Z")
    private boolean field1282 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field1283 = new int[151];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[[I")
    private int[][] field1284 = new int[104][104];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1285 = new int[5];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    private int[] field1286 = new int[256];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[Ljava/lang/String;")
    private String[] field1294 = new String[200];

    @OriginalMember(owner = "client", name = "ad", descriptor = "Lpb;")
    private LinkList field1302 = new LinkList(-767);

    @OriginalMember(owner = "client", name = "cd", descriptor = "B")
    private byte field1304 = 9;

    @OriginalMember(owner = "client", name = "ed", descriptor = "[J")
    private long[] field1306 = new long[100];

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1311 = 919;

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private boolean field1312 = true;

    @OriginalMember(owner = "client", name = "ld", descriptor = "Ljava/lang/String;")
    private String field1313 = "";

    @OriginalMember(owner = "client", name = "md", descriptor = "Ld;")
    private Component field1314 = new Component();

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field1315 = false;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field1317 = false;

    @OriginalMember(owner = "client", name = "td", descriptor = "B")
    private byte field1321 = 5;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1324 = false;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[J")
    private long[] field1326 = new long[200];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field1330 = new int[500];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field1331 = new int[500];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "[I")
    private int[] field1332 = new int[500];

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[I")
    private int[] field1333 = new int[500];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Ljava/lang/String;")
    private String field1335 = "";

    @OriginalMember(owner = "client", name = "Id", descriptor = "Ljava/lang/String;")
    private String field1336 = "";

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field1338 = new int[9];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Lmb;")
    private Packet field1339 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    public int[] field1341 = new int[1000];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[[[Lpb;")
    private LinkList[][][] field1342 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1344 = new int[33];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Ljava/lang/String;")
    private String field1345 = "";

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Z")
    private boolean field1350 = false;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private boolean field1351 = false;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1352 = new CRC32();

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field1353 = false;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1354 = 7;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1355 = 7759444;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[Lwb;")
    public FileStream[] field1356 = new FileStream[5];

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1358 = -550;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1364 = false;

    @OriginalMember(owner = "client", name = "le", descriptor = "Ljava/lang/String;")
    private String field1365 = "";

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1370 = -345;

    @OriginalMember(owner = "client", name = "se", descriptor = "B")
    private byte field1372 = -4;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1374 = 50;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field1375 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field1376 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field1377 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field1378 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field1379 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field1380 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private int[] field1381 = new int[this.field1374];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Ljava/lang/String;")
    private String[] field1382 = new String[this.field1374];

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1383 = 3353893;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field1384 = new int[5];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1385 = -1;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field1386 = false;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1388 = -523;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Z")
    public boolean field1389 = true;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Z")
    private boolean field1396 = false;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1397 = -1;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1398 = -1;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private boolean field1399 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "Z")
    private boolean field1402 = true;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1405 = -1;

    @OriginalMember(owner = "client", name = "bf", descriptor = "[Lkb;")
    private Pix8[] field1407 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1411 = 1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "B")
    private byte field1412 = 8;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Ljava/lang/String;")
    private String field1414 = "";

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1416 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[Ljb;")
    private Pix32[] field1417 = new Pix32[8];

    @OriginalMember(owner = "client", name = "nf", descriptor = "B")
    private byte field1418 = -4;

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field1421 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "rf", descriptor = "[Lkb;")
    private Pix8[] field1422 = new Pix8[13];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[B")
    private byte[] field1426 = new byte[16384];

    @OriginalMember(owner = "client", name = "xf", descriptor = "B")
    private byte field1428 = 125;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[Ljb;")
    private Pix32[] field1431 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1432 = 351;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1435 = new int[1000];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[I")
    private int[] field1436 = new int[1000];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1438 = -1;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Z")
    private boolean field1443 = false;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1444 = -1;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1445 = -1;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field1448 = false;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field1449 = false;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1452 = 78;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[Lkb;")
    private Pix8[] field1454 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1456 = new int[Stats.field1126];

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1457 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1458 = new int[50];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private boolean field1459 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field1462 = new int[2000];

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field1463 = true;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Z")
    private boolean field1464 = false;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1478 = 2301979;

    @OriginalMember(owner = "client", name = "zg", descriptor = "[Ljb;")
    private Pix32[] field1482 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1484 = 1;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Z")
    private boolean field1485 = true;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private boolean field1488 = true;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Z")
    private boolean field1489 = true;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[I")
    private int[] field1493 = new int[Stats.field1126];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[Z")
    private boolean[] field1502 = new boolean[5];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1505 = new int[50];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "B")
    private byte field1506 = -82;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[[I")
    private int[][] field1507 = new int[104][104];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field1508 = true;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lpb;")
    private LinkList field1512 = new LinkList(-767);

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field1513 = new int[151];

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1516 = false;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1517 = false;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Z")
    private boolean field1521 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1535 = -45;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[Lab;")
    private NpcEntity[] field1537 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    public int[] field1539 = new int[8192];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[Ljb;")
    private Pix32[] field1541 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field1542 = new int[Stats.field1126];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1544 = 5063219;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field1546 = false;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1555 = 3;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field1556 = new int[5];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field1558 = new int[200];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1559 = 128;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Lmb;")
    private Packet field1563 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "fi", descriptor = "Lmb;")
    private Packet field1566 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "gi", descriptor = "[[I")
    private int[][] field1567 = new int[104][104];

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1573 = -1;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1575 = 2;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1576 = -1;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1581 = -1;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[Ljb;")
    private Pix32[] field1583 = new Pix32[20];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field1584 = new int[5];

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1585 = 2048;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1586 = 2047;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[Lbb;")
    private PlayerEntity[] field1587 = new PlayerEntity[this.field1585];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    public int[] field1589 = new int[this.field1585];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field1591 = new int[this.field1585];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[Lmb;")
    private Packet[] field1592 = new Packet[this.field1585];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "B")
    private byte field1593 = -117;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "Lpb;")
    private LinkList field1594 = new LinkList(-767);

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Z")
    private boolean field1608 = false;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field1612 = new int[2000];

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1622 = 2;

    @OriginalMember(owner = "client", name = "kj", descriptor = "B")
    private byte field1623 = 7;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Ljava/lang/String;")
    private String field1631 = "";

    @OriginalMember(owner = "client", name = "tj", descriptor = "Ljava/lang/String;")
    private String field1632 = "";

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private static int field1228 = 10;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private static boolean field1230 = true;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[I")
    private static int[] field1292 = new int[32];

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private static int field1359;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1400;

    @OriginalMember(owner = "client", name = "af", descriptor = "Ljava/lang/String;")
    private static String field1406;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private static int field1413;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[[I")
    public static final int[][] field1429;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1446;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private static int[] field1533;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    public static final int[] field1551;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private static int field1216;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private static int field1238;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private static int field1242;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private static int field1303;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private static int field1323;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private static int field1334;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private static int field1357;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private static int field1419;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field1437;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private static int field1442;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private static int field1481;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private static int field1486;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private static int field1503;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private static int field1520;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private static int field1526;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private static int field1534;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private static int field1618;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "sd", descriptor = "J")
    private long field1320;

    @OriginalMember(owner = "client", name = "cf", descriptor = "J")
    private long field1408;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "J")
    private long field1447;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "J")
    public long field1504;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "J")
    private long field1611;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Le;")
    private ClientStream field1496;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Lxb;")
    private Isaac field1415;

    @OriginalMember(owner = "client", name = "di", descriptor = "Lyb;")
    private Jagfile field1564;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lfc;")
    public MouseTracking field1322;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Lvb;")
    private OnDemand field1273;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Ljb;")
    private Pix32 field1233;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Ljb;")
    private Pix32 field1243;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Ljb;")
    private Pix32 field1244;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Ljb;")
    private Pix32 field1309;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Ljb;")
    private Pix32 field1318;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Ljb;")
    private Pix32 field1319;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Ljb;")
    private Pix32 field1403;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Ljb;")
    private Pix32 field1404;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljb;")
    private Pix32 field1460;

    @OriginalMember(owner = "client", name = "qi", descriptor = "Ljb;")
    private Pix32 field1577;

    @OriginalMember(owner = "client", name = "ri", descriptor = "Ljb;")
    private Pix32 field1578;

    @OriginalMember(owner = "client", name = "si", descriptor = "Ljb;")
    private Pix32 field1579;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Ljb;")
    private Pix32 field1580;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Lkb;")
    private Pix8 field1268;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Lkb;")
    private Pix8 field1269;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Lkb;")
    private Pix8 field1270;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Lkb;")
    private Pix8 field1271;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Lkb;")
    private Pix8 field1272;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Lkb;")
    private Pix8 field1289;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Lkb;")
    private Pix8 field1290;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Lkb;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Lkb;")
    private Pix8 field1295;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Lkb;")
    private Pix8 field1296;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lkb;")
    private Pix8 field1423;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Lkb;")
    private Pix8 field1424;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Lkb;")
    private Pix8 field1425;

    @OriginalMember(owner = "client", name = "jg", descriptor = "Lkb;")
    private Pix8 field1466;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lkb;")
    private Pix8 field1467;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lkb;")
    private Pix8 field1468;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Lkb;")
    private Pix8 field1469;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Lkb;")
    private Pix8 field1470;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lkb;")
    private Pix8 field1619;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Lkb;")
    private Pix8 field1620;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Llb;")
    private PixFont field1360;

    @OriginalMember(owner = "client", name = "he", descriptor = "Llb;")
    private PixFont field1361;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Llb;")
    private PixFont field1362;

    @OriginalMember(owner = "client", name = "je", descriptor = "Llb;")
    private PixFont field1363;

    @OriginalMember(owner = "client", name = "R", descriptor = "Lrb;")
    private PixMap field1189;

    @OriginalMember(owner = "client", name = "S", descriptor = "Lrb;")
    private PixMap field1190;

    @OriginalMember(owner = "client", name = "T", descriptor = "Lrb;")
    private PixMap field1191;

    @OriginalMember(owner = "client", name = "U", descriptor = "Lrb;")
    private PixMap field1192;

    @OriginalMember(owner = "client", name = "V", descriptor = "Lrb;")
    private PixMap field1193;

    @OriginalMember(owner = "client", name = "W", descriptor = "Lrb;")
    private PixMap field1194;

    @OriginalMember(owner = "client", name = "X", descriptor = "Lrb;")
    private PixMap field1195;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Lrb;")
    private PixMap field1196;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Lrb;")
    private PixMap field1197;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lrb;")
    private PixMap field1199;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Lrb;")
    private PixMap field1200;

    @OriginalMember(owner = "client", name = "db", descriptor = "Lrb;")
    private PixMap field1201;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Lrb;")
    private PixMap field1202;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Lrb;")
    private PixMap field1203;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Lrb;")
    private PixMap field1204;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Lrb;")
    private PixMap field1205;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Lrb;")
    private PixMap field1206;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Lrb;")
    private PixMap field1207;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Lrb;")
    private PixMap field1475;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lrb;")
    private PixMap field1476;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lrb;")
    private PixMap field1477;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Lrb;")
    private PixMap field1614;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Lrb;")
    private PixMap field1615;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lrb;")
    private PixMap field1616;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lrb;")
    private PixMap field1617;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Lbb;")
    public static PlayerEntity field1239;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Ls;")
    private World3D field1420;

    @OriginalMember(owner = "client", name = "J", descriptor = "Ljava/lang/String;")
    private String field1181;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Ljava/lang/String;")
    public String field1281;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Ljava/lang/String;")
    private String field1433;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Ljava/lang/String;")
    public String field1550;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private static boolean field1231;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private static boolean field1328;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Z")
    private static boolean field1401;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private static boolean field1441;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Z")
    public static boolean field1636;

    @OriginalMember(owner = "client", name = "Td", descriptor = "[I")
    private int[] field1347;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field1348;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field1349;

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private int[] field1471;

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field1472;

    @OriginalMember(owner = "client", name = "qg", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field1474;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field1494;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field1495;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1509;

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field1510;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field1511;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field1629;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1630;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[Lkb;")
    private Pix8[] field1634;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[[B")
    private byte[][] field1293;

    @OriginalMember(owner = "client", name = "id", descriptor = "[[B")
    private byte[][] field1310;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[[[B")
    private byte[][][] field1343;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[[[I")
    private int[][][] field1337;

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public void method431(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1565);
        if (this.field1273 != null) {
            System.out.println("Od-cycle:" + this.field1273.field846);
        }
        System.out.println("loop-cycle:" + field1633);
        System.out.println("draw-cycle:" + field1624);
        System.out.println("ptype:" + this.field1596);
        System.out.println("psize:" + this.field1595);
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1496 != null) {
            this.field1496.method43((byte) 6);
        }
        super.field10 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        int var2 = 91 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public static final void method432(int arg0) {
        World3D.field295 = true;
        if (arg0 == -21519) {
            Pix3D.field643 = true;
            field1231 = true;
            World.field42 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILmb;)V")
    private final void method433(boolean arg0, int arg1, Packet arg2) {
        int var4 = arg2.method250(8, 0);
        if (var4 < this.field1588) {
            for (int var5 = var4; var5 < this.field1588; ++var5) {
                this.field1341[this.field1340++] = this.field1589[var5];
            }
        }
        if (var4 > this.field1588) {
            signlink.reporterror(this.field1631 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1588 = 0;
            if (!arg0) {
                this.field1350 = !this.field1350;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1589[var6];
                PlayerEntity var8 = this.field1587[var7];
                int var9 = arg2.method250(1, 0);
                if (var9 == 0) {
                    this.field1589[this.field1588++] = var7;
                    var8.field454 = field1633;
                } else {
                    int var10 = arg2.method250(2, 0);
                    if (var10 == 0) {
                        this.field1589[this.field1588++] = var7;
                        var8.field454 = field1633;
                        this.field1591[this.field1590++] = var7;
                    } else if (var10 == 1) {
                        this.field1589[this.field1588++] = var7;
                        var8.field454 = field1633;
                        int var11 = arg2.method250(3, 0);
                        var8.method125(var11, false, 37435);
                        int var12 = arg2.method250(1, 0);
                        if (var12 == 1) {
                            this.field1591[this.field1590++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1589[this.field1588++] = var7;
                        var8.field454 = field1633;
                        int var13 = arg2.method250(3, 0);
                        var8.method125(var13, true, 37435);
                        int var14 = arg2.method250(3, 0);
                        var8.method125(var14, true, 37435);
                        int var15 = arg2.method250(1, 0);
                        if (var15 == 1) {
                            this.field1591[this.field1590++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1341[this.field1340++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method434(int arg0) {
        for (int var2 = -1; var2 < this.field1588; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field1586;
            } else {
                var7 = this.field1589[var2];
            }
            PlayerEntity var8 = this.field1587[var7];
            if (var8 != null && var8.field422 > 0) {
                --var8.field422;
                if (var8.field422 == 0) {
                    var8.field421 = null;
                }
            }
        }
        int var3 = 7 / arg0;
        for (int var4 = 0; var4 < this.field1538; ++var4) {
            int var5 = this.field1539[var4];
            NpcEntity var6 = this.field1537[var5];
            if (var6 != null && var6.field422 > 0) {
                --var6.field422;
                if (var6.field422 == 0) {
                    var6.field421 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method435(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 0) {
            this.field1596 = this.field1563.method239();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method436(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != 9993) {
            this.field1596 = this.field1563.method239();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method12(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method437(int arg0, int arg1) {
        int var3 = 30 / arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method438(boolean arg0) {
        this.field1220 &= arg0;
        LocType.field968.method117();
        LocType.field969.method117();
        NpcType.field1008.method117();
        ObjType.field1056.method117();
        ObjType.field1057.method117();
        PlayerEntity.field488.method117();
        SpotAnimType.field1142.method117();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method439(byte arg0) {
        for (int var2 = 0; var2 < this.field1451; ++var2) {
            if (this.field1505[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1255[var2] == this.field1188 && this.field1458[var2] == this.field1397) {
                        if (!this.method535((byte) 7)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method323(572, this.field1458[var2], this.field1255[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field710 / 22) > (long) (this.field1479 / 22) + this.field1447) {
                            this.field1479 = var4.field710;
                            this.field1447 = System.currentTimeMillis();
                            if (this.method468(var4.field710, var4.field709, 0)) {
                                this.field1188 = this.field1255[var2];
                                this.field1397 = this.field1458[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1505[var2] != -5) {
                    this.field1505[var2] = -5;
                } else {
                    --this.field1451;
                    for (int var6 = var2; var6 < this.field1451; ++var6) {
                        this.field1255[var6] = this.field1255[var6 + 1];
                        this.field1458[var6] = this.field1458[var6 + 1];
                        this.field1505[var6] = this.field1505[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1505[var2]--;
            }
        }
        if (this.field1304 == arg0) {
            if (this.field1480 > 0) {
                this.field1480 -= 20;
                if (this.field1480 < 0) {
                    this.field1480 = 0;
                }
                if (this.field1480 == 0 && this.field1463 && !field1231) {
                    this.field1607 = this.field1385;
                    this.field1608 = false;
                    this.field1273.method289(2, this.field1607);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method440(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1335 = "";
                this.field1336 = "Connecting to server...";
                this.method476(6);
            }
            this.field1496 = new ClientStream(this, this.method464(field1229 + 43594), 7);
            long var4 = JString.method310(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1566.field710 = 0;
            this.field1566.method229(14);
            this.field1566.method229(var6);
            this.field1496.method42(0, 7, this.field1566.field709, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1496.method39();
            }
            int var8 = this.field1496.method39();
            if (var8 == 0) {
                this.field1496.method41(this.field1563.field709, 0, 8);
                this.field1563.field710 = 0;
                this.field1320 = this.field1563.method245((byte) -25);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1320 >> 32), (int) this.field1320 };
                this.field1566.field710 = 0;
                this.field1566.method229(10);
                this.field1566.method233(var9[0]);
                this.field1566.method233(var9[1]);
                this.field1566.method233(var9[2]);
                this.field1566.method233(var9[3]);
                this.field1566.method233(signlink.uid);
                this.field1566.method236(arg0);
                this.field1566.method236(arg1);
                this.field1566.method254(field1446, -40736, field1400);
                this.field1339.field710 = 0;
                if (arg2) {
                    this.field1339.method229(18);
                } else {
                    this.field1339.method229(16);
                }
                this.field1339.method229(this.field1566.field710 + 36 + 1 + 1);
                this.field1339.method229(249);
                this.field1339.method229(field1231 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1339.method233(this.field1338[var10]);
                }
                this.field1339.method237(true, this.field1566.field710, this.field1566.field709, 0);
                this.field1566.field714 = new Isaac(this.field1506, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1415 = new Isaac(this.field1506, var9);
                this.field1496.method42(0, 7, this.field1339.field709, this.field1339.field710);
                var8 = this.field1496.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var19) {
                }
                this.method440(arg0, arg1, arg2);
            } else if (var8 != 2 && var8 != 18 && var8 != 19) {
                if (var8 == 3) {
                    this.field1335 = "";
                    this.field1336 = "Invalid username or password.";
                } else if (var8 == 4) {
                    this.field1335 = "Your account has been disabled.";
                    this.field1336 = "Please check your message-centre for details.";
                } else if (var8 == 5) {
                    this.field1335 = "Your account is already logged in.";
                    this.field1336 = "Try again in 60 secs...";
                } else if (var8 == 6) {
                    this.field1335 = "RuneScape has been updated!";
                    this.field1336 = "Please reload this page.";
                } else if (var8 == 7) {
                    this.field1335 = "This world is full.";
                    this.field1336 = "Please use a different world.";
                } else if (var8 == 8) {
                    this.field1335 = "Unable to connect.";
                    this.field1336 = "Login server offline.";
                } else if (var8 == 9) {
                    this.field1335 = "Login limit exceeded.";
                    this.field1336 = "Too many connections from your address.";
                } else if (var8 == 10) {
                    this.field1335 = "Unable to connect.";
                    this.field1336 = "Bad session id.";
                } else if (var8 == 11) {
                    this.field1336 = "Login server rejected session.";
                    this.field1336 = "Please try again.";
                } else if (var8 == 12) {
                    this.field1335 = "You need a members account to login to this world.";
                    this.field1336 = "Please subscribe, or use a different world.";
                } else if (var8 == 13) {
                    this.field1335 = "Could not complete login.";
                    this.field1336 = "Please try using a different world.";
                } else if (var8 == 14) {
                    this.field1335 = "The server is being updated.";
                    this.field1336 = "Please wait 1 minute and try again.";
                } else if (var8 == 15) {
                    this.field1220 = true;
                    this.field1566.field710 = 0;
                    this.field1563.field710 = 0;
                    this.field1596 = -1;
                    this.field1522 = -1;
                    this.field1523 = -1;
                    this.field1524 = -1;
                    this.field1595 = 0;
                    this.field1597 = 0;
                    this.field1256 = 0;
                    this.field1492 = 0;
                    this.field1364 = false;
                    this.field1408 = System.currentTimeMillis();
                } else if (var8 == 16) {
                    this.field1335 = "Login attempts exceeded.";
                    this.field1336 = "Please wait 1 minute and try again.";
                } else if (var8 == 17) {
                    this.field1335 = "You are standing in a members-only area.";
                    this.field1336 = "To play on this world move to a free area first";
                } else if (var8 == 20) {
                    this.field1335 = "Invalid loginserver requested";
                    this.field1336 = "Please try using a different world.";
                } else if (var8 == -1) {
                    this.field1335 = "No response from server";
                    this.field1336 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1335 = "Unexpected server response";
                    this.field1336 = "Please try using a different world.";
                }
            } else {
                this.field1395 = 0;
                if (var8 == 18) {
                    this.field1395 = 1;
                }
                if (var8 == 19) {
                    this.field1395 = 2;
                }
                InputTracking.method45(this.field1350);
                this.field1504 = 0L;
                this.field1455 = 0;
                this.field1322.field973 = 0;
                super.field18 = true;
                this.field1389 = true;
                this.field1220 = true;
                this.field1566.field710 = 0;
                this.field1563.field710 = 0;
                this.field1596 = -1;
                this.field1522 = -1;
                this.field1523 = -1;
                this.field1524 = -1;
                this.field1595 = 0;
                this.field1597 = 0;
                this.field1256 = 0;
                this.field1599 = 0;
                this.field1569 = 0;
                this.field1427 = 0;
                this.field1492 = 0;
                this.field1364 = false;
                super.field19 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1249[var12] = null;
                }
                this.field1277 = 0;
                this.field1547 = 0;
                this.field1487 = 0;
                this.field1451 = 0;
                this.field1621 = (int) (Math.random() * 100.0D) - 50;
                this.field1217 = (int) (Math.random() * 110.0D) - 55;
                this.field1410 = (int) (Math.random() * 80.0D) - 40;
                this.field1574 = (int) (Math.random() * 120.0D) - 60;
                this.field1483 = (int) (Math.random() * 30.0D) - 20;
                this.field1560 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1198 = -1;
                this.field1307 = 0;
                this.field1308 = 0;
                this.field1588 = 0;
                this.field1538 = 0;
                for (int var13 = 0; var13 < this.field1585; ++var13) {
                    this.field1587[var13] = null;
                    this.field1592[var13] = null;
                }
                for (int var14 = 0; var14 < 8192; ++var14) {
                    this.field1537[var14] = null;
                }
                field1239 = this.field1587[this.field1586] = new PlayerEntity();
                this.field1594.method262();
                this.field1512.method262();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1342[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1302 = new LinkList(-767);
                this.field1371 = 0;
                this.field1398 = -1;
                this.field1573 = -1;
                this.field1262 = -1;
                this.field1438 = -1;
                this.field1581 = -1;
                this.field1459 = false;
                this.field1232 = 3;
                this.field1386 = false;
                this.field1364 = false;
                this.field1187 = false;
                this.field1433 = null;
                this.field1609 = 0;
                this.field1576 = -1;
                this.field1312 = true;
                this.method473(this.field1428);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1556[var18] = 0;
                }
                field1334 = 0;
                field1526 = 0;
                field1481 = 0;
                field1216 = 0;
                field1238 = 0;
                field1534 = 0;
                field1242 = 0;
                field1486 = 0;
                field1419 = 0;
                field1520 = 0;
                this.method497((byte) 118);
            }
        } catch (IOException var20) {
            this.field1335 = "";
            this.field1336 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)Z")
    public final boolean method441(boolean arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        Component var6 = Component.field67[arg1];
        for (int var7 = 0; var7 < var6.field89.length && var6.field89[var7] != -1; ++var7) {
            Component var8 = Component.field67[var6.field89[var7]];
            if (var8.field74 == 1) {
                var4 |= this.method441(false, var8.field72, arg2);
            }
            if (var8.field74 == 6 && (var8.field120 != -1 || var8.field121 != -1)) {
                boolean var9 = this.method447(var8, 295);
                int var10;
                if (var9) {
                    var10 = var8.field121;
                } else {
                    var10 = var8.field120;
                }
                if (var10 != -1) {
                    SeqType var11 = SeqType.field1110[var10];
                    var8.field71 += arg2;
                    while (var8.field71 > var11.method384(var8.field70, true)) {
                        var8.field71 -= var11.method384(var8.field70, true) + 1;
                        ++var8.field70;
                        if (var8.field70 >= var11.field1111) {
                            var8.field70 -= var11.field1115;
                            if (var8.field70 < 0 || var8.field70 >= var11.field1111) {
                                var8.field70 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        if (arg0) {
            this.field1342 = null;
        }
        if (field1231 && this.field1487 == 2 && World.field43 != this.field1224) {
            this.field1616.method268(3);
            this.field1361.method214("Loading - please wait.", 0, 151, 257, -28519);
            this.field1361.method214("Loading - please wait.", 16777215, 150, 256, -28519);
            this.field1616.method269((byte) 7, 4, super.field13, 4);
            this.field1487 = 1;
            this.field1408 = System.currentTimeMillis();
        }
        if (this.field1487 == 1) {
            int var2 = this.method443((byte) 7);
            if (var2 != 0 && System.currentTimeMillis() - this.field1408 > 360000L) {
                signlink.reporterror(this.field1631 + " glcfb " + this.field1320 + "," + var2 + "," + field1231 + "," + this.field1356[0] + "," + this.field1273.method290() + "," + this.field1224 + "," + this.field1439 + "," + this.field1440);
                this.field1408 = System.currentTimeMillis();
            }
        }
        if (this.field1487 == 2 && this.field1224 != this.field1198) {
            this.field1198 = this.field1224;
            this.method517(39649, this.field1224);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)I")
    public final int method443(byte arg0) {
        for (int var2 = 0; var2 < this.field1310.length; ++var2) {
            if (this.field1310[var2] == null && this.field1348[var2] != -1) {
                return -1;
            }
            if (this.field1293[var2] == null && this.field1349[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1310.length; ++var4) {
            byte[] var6 = this.field1293[var4];
            if (var6 != null) {
                int var7 = (this.field1347[var4] >> 8) * 64 - this.field1366;
                int var8 = (this.field1347[var4] & 255) * 64 - this.field1367;
                var3 &= World.method16(var6, var8, var7, true);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1241) {
            return -4;
        } else {
            this.field1487 = 2;
            World.field43 = this.field1224;
            this.method445(this.field1372);
            if (arg0 == 7) {
                boolean var5 = false;
            } else {
                this.field1596 = this.field1563.method239();
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (this.field1392 == 0) {
            this.field1210[0] = "Cancel";
            this.field1332[0] = 1252;
            this.field1492 = 1;
            this.method480(true);
            this.field1226 = 0;
            if (super.field21 > 4 && super.field22 > 4 && super.field21 < 516 && super.field22 < 338) {
                if (this.field1262 != -1) {
                    this.method550(4, this.field1388, 4, 0, super.field21, super.field22, Component.field67[this.field1262]);
                } else {
                    this.method546(715);
                }
            }
            if (this.field1226 != this.field1212) {
                this.field1212 = this.field1226;
            }
            this.field1226 = 0;
            if (super.field21 > 553 && super.field22 > 205 && super.field21 < 743 && super.field22 < 466) {
                if (this.field1438 != -1) {
                    this.method550(205, this.field1388, 553, 0, super.field21, super.field22, Component.field67[this.field1438]);
                } else if (this.field1421[this.field1232] != -1) {
                    this.method550(205, this.field1388, 553, 0, super.field21, super.field22, Component.field67[this.field1421[this.field1232]]);
                }
            }
            if (this.field1226 != this.field1223) {
                this.field1517 = true;
                this.field1223 = this.field1226;
            }
            this.field1226 = 0;
            if (super.field21 > 17 && super.field22 > 357 && super.field21 < 496 && super.field22 < 453) {
                if (this.field1573 != -1) {
                    this.method550(357, this.field1388, 17, 0, super.field21, super.field22, Component.field67[this.field1573]);
                } else if (super.field22 < 434 && super.field21 < 426) {
                    this.method513(super.field22 - 357, this.field1215, super.field21 - 17);
                }
            }
            if (this.field1573 != -1 && this.field1387 != this.field1226) {
                this.field1282 = true;
                this.field1387 = this.field1226;
            }
            boolean var2 = false;
            this.field1595 += arg0;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1492 - 1; ++var3) {
                    if (this.field1332[var3] < 1000 && this.field1332[var3 + 1] > 1000) {
                        String var4 = this.field1210[var3];
                        this.field1210[var3] = this.field1210[var3 + 1];
                        this.field1210[var3 + 1] = var4;
                        int var5 = this.field1332[var3];
                        this.field1332[var3] = this.field1332[var3 + 1];
                        this.field1332[var3 + 1] = var5;
                        int var6 = this.field1330[var3];
                        this.field1330[var3] = this.field1330[var3 + 1];
                        this.field1330[var3 + 1] = var6;
                        int var7 = this.field1331[var3];
                        this.field1331[var3] = this.field1331[var3 + 1];
                        this.field1331[var3 + 1] = var7;
                        int var8 = this.field1333[var3];
                        this.field1333[var3] = this.field1333[var3 + 1];
                        this.field1333[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method445(byte arg0) {
        try {
            this.field1198 = -1;
            this.field1512.method262();
            this.field1594.method262();
            Pix3D.method180(true);
            this.method438(true);
            this.field1420.method64(this.field1535);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1211[var2].method361(6);
            }
            System.gc();
            World var3 = new World(0, 104, this.field1343, 104, this.field1337);
            int var4 = this.field1310.length;
            World.field42 = World3D.field295;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1347[var5] >> 8;
                int var7 = this.field1347[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field42 = false;
                }
            }
            if (World.field42) {
                this.field1420.method65(803, this.field1224);
            } else {
                this.field1420.method65(803, 0);
            }
            this.field1566.method228((byte) 0, 206);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1347[var8] >> 8) * 64 - this.field1366;
                int var10 = (this.field1347[var8] & 255) * 64 - this.field1367;
                byte[] var11 = this.field1310[var8];
                if (var11 != null) {
                    var3.method15(var11, var10, (this.field1440 - 6) * 8, var9, (this.field1439 - 6) * 8, true);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1347[var12] >> 8) * 64 - this.field1366;
                int var14 = (this.field1347[var12] & 255) * 64 - this.field1367;
                byte[] var15 = this.field1310[var12];
                if (var15 == null && this.field1440 < 800) {
                    var3.method14(var13, true, 64, var14, 64);
                }
            }
            this.field1566.method228((byte) 0, 206);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1293[var16];
                if (var17 != null) {
                    int var18 = (this.field1347[var16] >> 8) * 64 - this.field1366;
                    int var19 = (this.field1347[var16] & 255) * 64 - this.field1367;
                    var3.method18(this.field1420, var19, var18, 5, this.field1211, var17);
                }
            }
            this.field1566.method228((byte) 0, 206);
            var3.method20(this.field1211, this.field1420, true);
            this.field1616.method268(3);
            this.field1566.method228((byte) 0, 206);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method495(var20, var21);
                }
            }
            this.method457(false);
        } catch (Exception var34) {
        }
        LocType.field968.method117();
        if (field1231 && signlink.cache_dat != null) {
            int var23 = this.field1273.method282(0, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1273.method287(4, var24);
                if ((var25 & 121) == 0) {
                    Model.method138(false, var24);
                }
            }
        }
        System.gc();
        Pix3D.method181(-291, 20);
        this.field1273.method293(-391);
        int var26 = (this.field1439 - 6) / 8 - 1;
        int var27 = (this.field1439 + 6) / 8 + 1;
        int var28 = (this.field1440 - 6) / 8 - 1;
        int var29 = (this.field1440 + 6) / 8 + 1;
        if (arg0 != -4) {
            this.field1566.method229(45);
        }
        if (this.field1461) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1273.method284(var31, 0, -371, var30);
                    if (var32 != -1) {
                        this.field1273.method294(false, 3, var32);
                    }
                    int var33 = this.field1273.method284(var31, 1, -371, var30);
                    if (var33 != -1) {
                        this.field1273.method294(false, 3, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        if (this.field1540 != 0) {
            PixFont var2 = this.field1361;
            if (arg0) {
                this.field1342 = null;
            }
            int var3 = 0;
            if (this.field1256 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1249[var4] != null) {
                    int var5 = this.field1247[var4];
                    String var6 = this.field1248[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1635 == 0 || this.field1635 == 1 && this.method559(var6, this.field1246))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method217(var8, var9, "From", 0, (byte) 3);
                        var2.method217(var8 - 1, var9, "From", 65535, (byte) 3);
                        int var10 = var9 + var2.method216(-525, "From ");
                        if (var7 == 1) {
                            this.field1407[0].method212(0, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1407[1].method212(0, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method217(var8, var10, var6 + ": " + this.field1249[var4], 0, (byte) 3);
                        var2.method217(var8 - 1, var10, var6 + ": " + this.field1249[var4], 65535, (byte) 3);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1635 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method217(var11, 4, this.field1249[var4], 0, (byte) 3);
                        var2.method217(var11 - 1, 4, this.field1249[var4], 65535, (byte) 3);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1635 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method217(var12, 4, "To " + var6 + ": " + this.field1249[var4], 0, (byte) 3);
                        var2.method217(var12 - 1, 4, "To " + var6 + ": " + this.field1249[var4], 65535, (byte) 3);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method447(Component arg0, int arg1) {
        if (arg0.field83 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field83.length; ++var3) {
                int var5 = this.method478(this.field1222, arg0, var3);
                int var6 = arg0.field84[var3];
                if (arg0.field83[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field83[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field83[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            int var4 = 75 / arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method448(Component arg0, byte arg1) {
        if (arg1 != -50) {
            this.field1215 = !this.field1215;
        }
        int var3 = arg0.field76;
        if (var3 == 201) {
            this.field1282 = true;
            this.field1386 = false;
            this.field1187 = true;
            this.field1345 = "";
            this.field1518 = 1;
            this.field1365 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1282 = true;
            this.field1386 = false;
            this.field1187 = true;
            this.field1345 = "";
            this.field1518 = 2;
            this.field1365 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1599 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1282 = true;
                this.field1386 = false;
                this.field1187 = true;
                this.field1345 = "";
                this.field1518 = 4;
                this.field1365 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1282 = true;
                this.field1386 = false;
                this.field1187 = true;
                this.field1345 = "";
                this.field1518 = 5;
                this.field1365 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1213[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1086 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1086) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1087[var6].field1093 && IdkType.field1087[var6].field1088 == var4 + (this.field1312 ? 0 : 7)) {
                            this.field1213[var4] = var6;
                            this.field1315 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1556[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1429[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1429[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1556[var7] = var9;
                this.field1315 = true;
            }
            if (var3 == 324 && !this.field1312) {
                this.field1312 = true;
                this.method473(this.field1428);
            }
            if (var3 == 325 && this.field1312) {
                this.field1312 = false;
                this.method473(this.field1428);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1449 = !this.field1449;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method537(251);
                    if (this.field1313.length() > 0) {
                        this.field1566.method228((byte) 0, 205);
                        this.field1566.method235(JString.method310(this.field1313), this.field1305);
                        this.field1566.method229(var3 - 601);
                        this.field1566.method229(this.field1449 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1566.method228((byte) 0, 150);
                this.field1566.method229(this.field1312 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1566.method229(this.field1213[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1566.method229(this.field1556[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIII)V")
    public final void method449(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1619.method212(0, arg3, arg2);
        this.field1620.method212(0, arg3 + arg5 - 16, arg2);
        Pix2D.method170(16, 5, arg2, arg3 + 16, arg5 - 32, this.field1478);
        if (arg1 != 8) {
            this.field1358 = -289;
        }
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg0 / (arg4 - arg5);
        Pix2D.method170(16, 5, arg2, arg3 + 16 + var8, var7, this.field1544);
        Pix2D.method175(arg3 + 16 + var8, var7, false, this.field1355, arg2);
        Pix2D.method175(arg3 + 16 + var8, var7, false, this.field1355, arg2 + 1);
        Pix2D.method173(arg3 + 16 + var8, arg2, 16, this.field1355, (byte) 59);
        Pix2D.method173(arg3 + 17 + var8, arg2, 16, this.field1355, (byte) 59);
        Pix2D.method175(arg3 + 16 + var8, var7, false, this.field1383, arg2 + 15);
        Pix2D.method175(arg3 + 17 + var8, var7 - 1, false, this.field1383, arg2 + 14);
        Pix2D.method173(arg3 + 15 + var8 + var7, arg2, 16, this.field1383, (byte) 59);
        Pix2D.method173(arg3 + 14 + var8 + var7, arg2 + 1, 15, this.field1383, (byte) 59);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method450(boolean arg0) {
        this.field1617.method268(3);
        Pix3D.field654 = this.field1509;
        this.field1425.method212(0, 0, 0);
        if (arg0) {
            this.field1370 = this.field1415.method305();
        }
        if (this.field1187) {
            this.field1362.method214(this.field1365, 0, 40, 239, -28519);
            this.field1362.method214(this.field1345 + "*", 128, 60, 239, -28519);
        } else if (this.field1386) {
            this.field1362.method214("Enter amount:", 0, 40, 239, -28519);
            this.field1362.method214(this.field1274 + "*", 128, 60, 239, -28519);
        } else if (this.field1433 != null) {
            this.field1362.method214(this.field1433, 0, 40, 239, -28519);
            this.field1362.method214("Click to continue", 128, 60, 239, -28519);
        } else if (this.field1573 != -1) {
            this.method503(true, Component.field67[this.field1573], 0, 0, 0);
        } else if (this.field1398 != -1) {
            this.method503(true, Component.field67[this.field1398], 0, 0, 0);
        } else {
            PixFont var2 = this.field1361;
            int var3 = 0;
            Pix2D.method167(0, 463, 77, 0, this.field1489);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1249[var4] != null) {
                    int var6 = this.field1247[var4];
                    int var7 = 70 - var3 * 14 + this.field1465;
                    String var8 = this.field1248[var4];
                    byte var9 = 0;
                    if (var8 != null && var8.startsWith("@cr1@")) {
                        var8 = var8.substring(5);
                        var9 = 1;
                    }
                    if (var8 != null && var8.startsWith("@cr2@")) {
                        var8 = var8.substring(5);
                        var9 = 2;
                    }
                    if (var6 == 0) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 4, this.field1249[var4], 0, (byte) 3);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1491 == 0 || this.field1491 == 1 && this.method559(var8, this.field1246))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1407[0].method212(0, var7 - 12, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1407[1].method212(0, var7 - 12, var10);
                                var10 += 14;
                            }
                            var2.method217(var7, var10, var8 + ":", 0, (byte) 3);
                            int var11 = var10 + var2.method216(-525, var8) + 8;
                            var2.method217(var7, var11, this.field1249[var4], 255, (byte) 3);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1540 == 0 && (var6 == 7 || this.field1635 == 0 || this.field1635 == 1 && this.method559(var8, this.field1246))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method217(var7, var12, "From", 0, (byte) 3);
                            int var13 = var12 + var2.method216(-525, "From ");
                            if (var9 == 1) {
                                this.field1407[0].method212(0, var7 - 12, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1407[1].method212(0, var7 - 12, var13);
                                var13 += 14;
                            }
                            var2.method217(var7, var13, var8 + ":", 0, (byte) 3);
                            int var14 = var13 + var2.method216(-525, var8) + 8;
                            var2.method217(var7, var14, this.field1249[var4], 8388608, (byte) 3);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1346 == 0 || this.field1346 == 1 && this.method559(var8, this.field1246))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 4, var8 + " " + this.field1249[var4], 8388736, (byte) 3);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1540 == 0 && this.field1635 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 4, this.field1249[var4], 8388608, (byte) 3);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1540 == 0 && this.field1635 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 4, "To " + var8 + ":", 0, (byte) 3);
                            var2.method217(var7, 12 + var2.method216(-525, "To " + var8), this.field1249[var4], 8388608, (byte) 3);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1346 == 0 || this.field1346 == 1 && this.method559(var8, this.field1246))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 4, var8 + " " + this.field1249[var4], 8270336, (byte) 3);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method166((byte) 0);
            this.field1452 = var3 * 14 + 7;
            if (this.field1452 < 78) {
                this.field1452 = 78;
            }
            this.method449(this.field1452 - this.field1465 - 77, (byte) 8, 463, 0, this.field1452, 77);
            String var5;
            if (field1239 != null && field1239.field467 != null) {
                var5 = field1239.field467;
            } else {
                var5 = JString.method314(this.field1631, (byte) 9);
            }
            var2.method217(90, 4, var5 + ":", 0, (byte) 3);
            var2.method217(90, 6 + var2.method216(-525, var5 + ": "), this.field1414 + "*", 255, (byte) 3);
            Pix2D.method173(77, 0, 479, 0, (byte) 59);
        }
        if (this.field1364 && this.field1497 == 2) {
            this.method475(false);
        }
        this.field1617.method269((byte) 7, 357, super.field13, 17);
        this.field1616.method268(3);
        Pix3D.field654 = this.field1511;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method451(byte arg0, boolean arg1) {
        if (field1239.field409 >> 7 == this.field1307 && field1239.field410 >> 7 == this.field1308) {
            this.field1307 = 0;
        }
        int var3 = this.field1588;
        if (arg0 == 9) {
            boolean var4 = false;
        } else {
            this.method6();
        }
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            PlayerEntity var6;
            int var7;
            if (arg1) {
                var6 = field1239;
                var7 = this.field1586 << 14;
            } else {
                var6 = this.field1587[this.field1589[var5]];
                var7 = this.field1589[var5] << 14;
            }
            if (var6 != null && var6.method127(false)) {
                var6.field486 = false;
                if ((field1231 && this.field1588 > 50 || this.field1588 > 200) && !arg1 && var6.field434 == var6.field414) {
                    var6.field486 = true;
                }
                int var8 = var6.field409 >> 7;
                int var9 = var6.field410 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field481 != null && field1633 >= var6.field476 && field1633 < var6.field477) {
                        var6.field486 = false;
                        var6.field475 = this.method484(var6.field410, this.field1224, var6.field409, (byte) 6);
                        this.field1420.method76(var6, var7, var6.field485, var6.field411, var6.field475, var6.field410, var6.field482, var6.field409, this.field1224, this.field1321, 60, var6.field483, var6.field484);
                    } else {
                        if ((var6.field409 & 127) == 64 && (var6.field410 & 127) == 64) {
                            if (this.field1284[var8][var9] == this.field1329) {
                                continue;
                            }
                            this.field1284[var8][var9] = this.field1329;
                        }
                        var6.field475 = this.method484(var6.field410, this.field1224, var6.field409, (byte) 6);
                        this.field1420.method75(var6, var6.field475, var6.field411, var7, var6.field412, this.field1224, var6.field410, 60, this.field1267, var6.field409);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;III)V")
    public final void method452(Pix32 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1402 = !this.field1402;
        }
        int var5 = arg1 * arg1 + arg2 * arg2;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1574 + this.field1560 & 2047;
            int var7 = Model.field607[var6];
            int var8 = Model.field608[var6];
            int var9 = var7 * 256 / (this.field1483 + 256);
            int var10 = var8 * 256 / (this.field1483 + 256);
            int var11 = arg1 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1233.method204(256, 15, var15 + 94 + 4 - 10, 20, var13, 15, 83 - var16 - 20, 20, (byte) -107);
        } else {
            this.method540(arg0, 4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method453(byte arg0) {
        if (arg0 == 109) {
            if (this.field1569 == 2) {
                this.method557(false, (this.field1529 - this.field1367 << 7) + this.field1532, this.field1530 * 2, (this.field1528 - this.field1366 << 7) + this.field1531);
                if (this.field1444 > -1 && field1633 % 20 < 10) {
                    this.field1482[2].method199(0, this.field1445 - 28, this.field1444 - 12);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Z")
    public final boolean method454(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1332[arg1];
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                return var3 == 406;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method455(int arg0) {
        Graphics var2 = this.method11(437).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, 0);
        if (arg0 != 3) {
            this.field1596 = -1;
        }
        if (this.field1443) {
            this.field1351 = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            byte var3 = 35;
            var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
            int var5 = var3 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var5);
            int var6 = var5 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
            int var7 = var6 + 30;
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
            int var8 = var7 + 30;
            var2.drawString("3: Try using a different game-world", 30, var8);
            int var10 = var8 + 30;
            var2.drawString("4: Try rebooting your computer", 30, var10);
            int var12 = var10 + 30;
            var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var12);
        }
        if (this.field1527) {
            this.field1351 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1237) {
            this.field1351 = false;
            var2.setColor(Color.yellow);
            byte var4 = 35;
            var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var4);
            int var9 = var4 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var9);
            int var11 = var9 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var11);
            int var13 = var11 + 30;
            var2.drawString("2: Try rebooting your computer, and reloading", 30, var13);
            int var14 = var13 + 30;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method456(int arg0) {
        int var2 = 28 / arg0;
        try {
            int var3 = field1239.field409 + this.field1621;
            int var4 = field1239.field410 + this.field1217;
            if (this.field1514 - var3 < -500 || this.field1514 - var3 > 500 || this.field1515 - var4 < -500 || this.field1515 - var4 > 500) {
                this.field1514 = var3;
                this.field1515 = var4;
            }
            if (this.field1514 != var3) {
                this.field1514 += (var3 - this.field1514) / 16;
            }
            if (this.field1515 != var4) {
                this.field1515 += (var4 - this.field1515) / 16;
            }
            if (super.field31[1] == 1) {
                this.field1561 += (-24 - this.field1561) / 2;
            } else if (super.field31[2] == 1) {
                this.field1561 += (24 - this.field1561) / 2;
            } else {
                this.field1561 /= 2;
            }
            if (super.field31[3] == 1) {
                this.field1562 += (12 - this.field1562) / 2;
            } else if (super.field31[4] == 1) {
                this.field1562 += (-12 - this.field1562) / 2;
            } else {
                this.field1562 /= 2;
            }
            this.field1560 = this.field1561 / 2 + this.field1560 & 2047;
            this.field1559 += this.field1562 / 2;
            if (this.field1559 < 128) {
                this.field1559 = 128;
            }
            if (this.field1559 > 383) {
                this.field1559 = 383;
            }
            int var5 = this.field1514 >> 7;
            int var6 = this.field1515 >> 7;
            int var7 = this.method484(this.field1515, this.field1224, this.field1514, (byte) 6);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field1224;
                        if (var11 < 3 && (this.field1343[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field1337[var11][var9][var10];
                        if (var12 > var8) {
                            var8 = var12;
                        }
                    }
                }
            }
            int var13 = var8 * 192;
            if (var13 > 98048) {
                var13 = 98048;
            }
            if (var13 < 32768) {
                var13 = 32768;
            }
            if (var13 > this.field1570) {
                this.field1570 += (var13 - this.field1570) / 24;
            } else if (var13 < this.field1570) {
                this.field1570 += (var13 - this.field1570) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field1239.field409 + "," + field1239.field410 + "," + this.field1514 + "," + this.field1515 + "," + this.field1439 + "," + this.field1440 + "," + this.field1366 + "," + this.field1367);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    private final void method457(boolean arg0) {
        if (arg0) {
            this.field1370 = this.field1415.method305();
        }
        for (LocSpawned var2 = (LocSpawned) this.field1302.method258(); var2 != null; var2 = (LocSpawned) this.field1302.method260(true)) {
            if (var2.field739 == -1) {
                var2.field738 = 0;
                this.method549(var2, -388);
            } else {
                var2.method120();
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method458(boolean arg0) {
        if (arg0) {
            for (ProjectileEntity var2 = (ProjectileEntity) this.field1594.method258(); var2 != null; var2 = (ProjectileEntity) this.field1594.method260(true)) {
                if (this.field1224 == var2.field509 && field1633 <= var2.field515) {
                    if (field1633 >= var2.field514) {
                        if (var2.field518 > 0) {
                            NpcEntity var3 = this.field1537[var2.field518 - 1];
                            if (var3 != null && var3.field409 >= 0 && var3.field409 < 13312 && var3.field410 >= 0 && var3.field410 < 13312) {
                                var2.method133((byte) 7, field1633, var3.field410, var3.field409, this.method484(var3.field410, var2.field509, var3.field409, (byte) 6) - var2.field513);
                            }
                        }
                        if (var2.field518 < 0) {
                            int var4 = -var2.field518 - 1;
                            PlayerEntity var5;
                            if (this.field1185 == var4) {
                                var5 = field1239;
                            } else {
                                var5 = this.field1587[var4];
                            }
                            if (var5 != null && var5.field409 >= 0 && var5.field409 < 13312 && var5.field410 >= 0 && var5.field410 < 13312) {
                                var2.method133((byte) 7, field1633, var5.field410, var5.field409, this.method484(var5.field410, var2.field509, var5.field409, (byte) 6) - var2.field513);
                            }
                        }
                        var2.method134(this.field1325, 2);
                        this.field1420.method75(var2, (int) var2.field522, var2.field528, -1, false, this.field1224, (int) var2.field521, 60, this.field1267, (int) var2.field520);
                    }
                } else {
                    var2.method120();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method459(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1225 >= 100) {
                this.method544(0, "", "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = JString.method314(JString.method311((byte) 4, arg0), (byte) 9);
                for (int var5 = 0; var5 < this.field1225; ++var5) {
                    if (this.field1306[var5] == arg0) {
                        this.method544(0, "", var4 + " is already on your ignore list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1371; ++var6) {
                    if (this.field1326[var6] == arg0) {
                        this.method544(0, "", "Please remove " + var4 + " from your friend list first", 0);
                        return;
                    }
                }
                this.field1306[this.field1225++] = arg0;
                if (this.field1593 != arg1) {
                    this.field1448 = !this.field1448;
                }
                this.field1517 = true;
                this.field1566.method228((byte) 0, 20);
                this.field1566.method235(arg0, this.field1305);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (this.field1412 != arg0) {
            this.field1566.method229(134);
        }
        if (super.field27 == 1) {
            if (super.field28 >= 6 && super.field28 <= 106 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1491 = (this.field1491 + 1) % 4;
                this.field1521 = true;
                this.field1282 = true;
                this.field1566.method228((byte) 0, 8);
                this.field1566.method229(this.field1491);
                this.field1566.method229(this.field1635);
                this.field1566.method229(this.field1346);
            }
            if (super.field28 >= 135 && super.field28 <= 235 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1635 = (this.field1635 + 1) % 3;
                this.field1521 = true;
                this.field1282 = true;
                this.field1566.method228((byte) 0, 8);
                this.field1566.method229(this.field1491);
                this.field1566.method229(this.field1635);
                this.field1566.method229(this.field1346);
            }
            if (super.field28 >= 273 && super.field28 <= 373 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1346 = (this.field1346 + 1) % 3;
                this.field1521 = true;
                this.field1282 = true;
                this.field1566.method228((byte) 0, 8);
                this.field1566.method229(this.field1491);
                this.field1566.method229(this.field1635);
                this.field1566.method229(this.field1346);
            }
            if (super.field28 >= 412 && super.field28 <= 512 && super.field29 >= 467 && super.field29 <= 499) {
                this.method537(251);
                this.field1313 = "";
                this.field1449 = false;
                for (int var2 = 0; var2 < Component.field67.length; ++var2) {
                    if (Component.field67[var2] != null && Component.field67[var2].field76 == 600) {
                        this.field1405 = this.field1262 = Component.field67[var2].field73;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IZ)V")
    private final void method461(Packet arg0, int arg1, boolean arg2) {
        this.field1340 = 0;
        this.field1590 = 0;
        this.method543(arg1, arg0, -16477);
        this.method433(true, arg1, arg0);
        this.method505(0, arg1, arg0);
        this.method554(arg1, false, arg0);
        for (int var4 = 0; var4 < this.field1340; ++var4) {
            int var6 = this.field1341[var4];
            if (field1633 != this.field1587[var6].field454) {
                this.field1587[var6] = null;
            }
        }
        if (arg2) {
            field1328 = !field1328;
        }
        if (arg0.field710 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field710 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1588; ++var5) {
                if (this.field1587[this.field1589[var5]] == null) {
                    signlink.reporterror(this.field1631 + " null entry in pl list - pos:" + var5 + " size:" + this.field1588);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)I")
    public final int method462(byte arg0) {
        if (arg0 != -107) {
            this.field1354 = this.field1415.method305();
        }
        int var2 = 3;
        if (this.field1300 < 310) {
            int var3 = this.field1297 >> 7;
            int var4 = this.field1299 >> 7;
            int var5 = field1239.field409 >> 7;
            int var6 = field1239.field410 >> 7;
            if ((this.field1343[this.field1224][var3][var4] & 4) != 0) {
                var2 = this.field1224;
            }
            int var7;
            if (var5 > var3) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            int var8;
            if (var6 > var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            if (var7 > var8) {
                int var9 = var8 * 65536 / var7;
                int var10 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        ++var3;
                    } else if (var3 > var5) {
                        --var3;
                    }
                    if ((this.field1343[this.field1224][var3][var4] & 4) != 0) {
                        var2 = this.field1224;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1343[this.field1224][var3][var4] & 4) != 0) {
                            var2 = this.field1224;
                        }
                    }
                }
            } else {
                int var11 = var7 * 65536 / var8;
                int var12 = 32768;
                while (var4 != var6) {
                    if (var4 < var6) {
                        ++var4;
                    } else if (var4 > var6) {
                        --var4;
                    }
                    if ((this.field1343[this.field1224][var3][var4] & 4) != 0) {
                        var2 = this.field1224;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1343[this.field1224][var3][var4] & 4) != 0) {
                            var2 = this.field1224;
                        }
                    }
                }
            }
        }
        if ((this.field1343[this.field1224][field1239.field409 >> 7][field1239.field410 >> 7] & 4) != 0) {
            var2 = this.field1224;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)I")
    public final int method463(int arg0) {
        if (arg0 != 43738) {
            this.field1350 = !this.field1350;
        }
        int var2 = this.method484(this.field1299, this.field1224, this.field1297, (byte) 6);
        return var2 - this.field1298 < 800 && (this.field1343[this.field1224][this.field1297 >> 7][this.field1299 >> 7] & 4) != 0 ? this.field1224 : 3;
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://127.0.0.1:" + (field1229 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method464(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    private final void method465(int arg0) {
        this.field1595 += arg0;
        if (this.field1487 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1302.method258(); var2 != null; var2 = (LocSpawned) this.field1302.method260(true)) {
                if (var2.field739 > 0) {
                    --var2.field739;
                }
                if (var2.field739 == 0) {
                    if (var2.field732 < 0 || World.method30(var2.field734, var2.field732, (byte) 5)) {
                        this.method528(var2.field733, var2.field728, var2.field730, var2.field734, (byte) -2, var2.field732, var2.field729, var2.field731);
                        var2.method120();
                    }
                } else {
                    if (var2.field738 > 0) {
                        --var2.field738;
                    }
                    if (var2.field738 == 0 && var2.field730 >= 1 && var2.field731 >= 1 && var2.field730 <= 102 && var2.field731 <= 102 && (var2.field735 < 0 || World.method30(var2.field737, var2.field735, (byte) 5))) {
                        this.method528(var2.field736, var2.field728, var2.field730, var2.field737, (byte) -2, var2.field735, var2.field729, var2.field731);
                        var2.field738 = -1;
                        if (var2.field735 == var2.field732 && var2.field732 == -1) {
                            var2.method120();
                        } else if (var2.field735 == var2.field732 && var2.field736 == var2.field733 && var2.field737 == var2.field734) {
                            var2.method120();
                        }
                    }
                }
            }
            ++field1323;
            if (field1323 > 85) {
                field1323 = 0;
                this.field1566.method228((byte) 0, 63);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ[B)V")
    public final void method466(boolean arg0, boolean arg1, byte[] arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        if (arg1) {
            this.field1596 = this.field1563.method239();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        this.field1595 += arg0;
        if (this.field1496 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1496.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1596 == -1) {
                    this.field1496.method41(this.field1563.field709, 0, 1);
                    this.field1596 = this.field1563.field709[0] & 255;
                    if (this.field1415 != null) {
                        this.field1596 = this.field1596 - this.field1415.method305() & 255;
                    }
                    this.field1595 = Protocol.field1059[this.field1596];
                    --var2;
                }
                if (this.field1595 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1496.method41(this.field1563.field709, 0, 1);
                    this.field1595 = this.field1563.field709[0] & 255;
                    --var2;
                }
                if (this.field1595 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1496.method41(this.field1563.field709, 0, 2);
                    this.field1563.field710 = 0;
                    this.field1595 = this.field1563.method241();
                    var2 -= 2;
                }
                if (var2 < this.field1595) {
                    return false;
                }
                this.field1563.field710 = 0;
                this.field1496.method41(this.field1563.field709, 0, this.field1595);
                this.field1597 = 0;
                this.field1524 = this.field1523;
                this.field1523 = this.field1522;
                this.field1522 = this.field1596;
                if (this.field1596 == 15) {
                    this.field1553 = this.field1563.method239();
                    this.field1554 = this.field1563.method239();
                    while (this.field1563.field710 < this.field1595) {
                        int var3 = this.field1563.method239();
                        this.method506(-47250, var3, this.field1563);
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 153) {
                    int var4 = this.field1563.method241();
                    int var5 = this.field1563.method241();
                    int var6 = this.field1563.method241();
                    ObjType var7 = ObjType.method350(var5);
                    Component.field67[var4].field116 = 4;
                    Component.field67[var4].field117 = var5;
                    Component.field67[var4].field123 = var7.field1024;
                    Component.field67[var4].field124 = var7.field1025;
                    Component.field67[var4].field122 = var7.field1023 * 100 / var6;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 165) {
                    Packet var8 = InputTracking.method47(589);
                    if (var8 != null) {
                        this.field1566.method228((byte) 0, 19);
                        this.field1566.method230(var8.field710);
                        this.field1566.method237(true, var8.field710, var8.field709, 0);
                        var8.method227((byte) -12);
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 156) {
                    this.field1517 = true;
                    int var9 = this.field1563.method241();
                    Component var10 = Component.field67[var9];
                    int var11 = this.field1563.method239();
                    for (int var12 = 0; var12 < var11; ++var12) {
                        var10.field68[var12] = this.field1563.method241();
                        int var13 = this.field1563.method239();
                        if (var13 == 255) {
                            var13 = this.field1563.method244();
                        }
                        var10.field69[var12] = var13;
                    }
                    for (int var14 = var11; var14 < var10.field68.length; ++var14) {
                        var10.field68[var14] = 0;
                        var10.field69[var14] = 0;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 69) {
                    int var15 = this.field1563.method241();
                    int var16 = this.field1563.method241();
                    Component.field67[var15].field120 = var16;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 115) {
                    int var17 = this.field1563.method242();
                    if (var17 >= 0) {
                        this.method469(var17, -380);
                    }
                    this.field1581 = var17;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 32) {
                    int var18 = this.field1563.method241();
                    String var19 = this.field1563.method246();
                    Component.field67[var18].field108 = var19;
                    if (this.field1421[this.field1232] == Component.field67[var18].field73) {
                        this.field1517 = true;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 96) {
                    int var20 = this.field1563.method241();
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    if (this.field1385 != var20 && this.field1463 && !field1231 && this.field1480 == 0) {
                        this.field1607 = var20;
                        this.field1608 = true;
                        this.field1273.method289(2, this.field1607);
                    }
                    this.field1385 = var20;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 39) {
                    int var21 = this.field1563.method241();
                    int var22 = this.field1563.method241();
                    if (this.field1463 && !field1231) {
                        this.field1607 = var21;
                        this.field1608 = false;
                        this.field1273.method289(2, this.field1607);
                        this.field1480 = var22;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 243) {
                    this.field1569 = this.field1563.method239();
                    if (this.field1569 == 1) {
                        this.field1186 = this.field1563.method241();
                    }
                    if (this.field1569 >= 2 && this.field1569 <= 6) {
                        if (this.field1569 == 2) {
                            this.field1531 = 64;
                            this.field1532 = 64;
                        }
                        if (this.field1569 == 3) {
                            this.field1531 = 0;
                            this.field1532 = 64;
                        }
                        if (this.field1569 == 4) {
                            this.field1531 = 128;
                            this.field1532 = 64;
                        }
                        if (this.field1569 == 5) {
                            this.field1531 = 64;
                            this.field1532 = 0;
                        }
                        if (this.field1569 == 6) {
                            this.field1531 = 64;
                            this.field1532 = 128;
                        }
                        this.field1569 = 2;
                        this.field1528 = this.field1563.method241();
                        this.field1529 = this.field1563.method241();
                        this.field1530 = this.field1563.method239();
                    }
                    if (this.field1569 == 10) {
                        this.field1601 = this.field1563.method241();
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 26) {
                    this.field1256 = this.field1563.method241() * 30;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 60) {
                    int var23 = this.field1563.method241();
                    int var24 = this.field1563.method241();
                    Component.field67[var23].field116 = 1;
                    Component.field67[var23].field117 = var24;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 76) {
                    int var25 = this.field1563.method241();
                    int var26 = this.field1563.method241();
                    Component.field67[var25].field116 = 2;
                    Component.field67[var25].field117 = var26;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 2) {
                    this.field1491 = this.field1563.method239();
                    this.field1635 = this.field1563.method239();
                    this.field1346 = this.field1563.method239();
                    this.field1521 = true;
                    this.field1282 = true;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 25) {
                    for (int var27 = 0; var27 < this.field1462.length; ++var27) {
                        if (this.field1612[var27] != this.field1462[var27]) {
                            this.field1462[var27] = this.field1612[var27];
                            this.method527(var27, -42638);
                            this.field1517 = true;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 208) {
                    if (this.field1232 == 12) {
                        this.field1517 = true;
                    }
                    this.field1610 = this.field1563.method239();
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 161) {
                    this.method461(this.field1563, this.field1595, false);
                    this.field1241 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 140) {
                    this.field1553 = this.field1563.method239();
                    this.field1554 = this.field1563.method239();
                    for (int var28 = this.field1553; var28 < this.field1553 + 8; ++var28) {
                        for (int var29 = this.field1554; var29 < this.field1554 + 8; ++var29) {
                            if (this.field1342[this.field1224][var28][var29] != null) {
                                this.field1342[this.field1224][var28][var29] = null;
                                this.method495(var28, var29);
                            }
                        }
                    }
                    for (LocSpawned var30 = (LocSpawned) this.field1302.method258(); var30 != null; var30 = (LocSpawned) this.field1302.method260(true)) {
                        if (var30.field730 >= this.field1553 && var30.field730 < this.field1553 + 8 && var30.field731 >= this.field1554 && var30.field731 < this.field1554 + 8 && this.field1224 == var30.field728) {
                            var30.field739 = 0;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 207) {
                    long var31 = this.field1563.method245((byte) -25);
                    int var33 = this.field1563.method244();
                    int var34 = this.field1563.method239();
                    boolean var35 = false;
                    for (int var36 = 0; var36 < 100; ++var36) {
                        if (this.field1264[var36] == var33) {
                            var35 = true;
                            break;
                        }
                    }
                    if (var34 <= 1) {
                        for (int var37 = 0; var37 < this.field1225; ++var37) {
                            if (this.field1306[var37] == var31) {
                                var35 = true;
                                break;
                            }
                        }
                    }
                    if (!var35 && this.field1536 == 0) {
                        try {
                            this.field1264[this.field1490] = var33;
                            this.field1490 = (this.field1490 + 1) % 100;
                            String var38 = WordPack.method317(this.field1563, this.field1595 - 13, 983);
                            String var39 = WordFilter.method403(103, var38);
                            if (var34 != 2 && var34 != 3) {
                                if (var34 == 1) {
                                    this.method544(7, "@cr1@" + JString.method314(JString.method311((byte) 4, var31), (byte) 9), var39, 0);
                                } else {
                                    this.method544(3, JString.method314(JString.method311((byte) 4, var31), (byte) 9), var39, 0);
                                }
                            } else {
                                this.method544(7, "@cr2@" + JString.method314(JString.method311((byte) 4, var31), (byte) 9), var39, 0);
                            }
                        } catch (Exception var155) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 152) {
                    int var41 = this.field1563.method242();
                    this.field1398 = var41;
                    this.field1282 = true;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 7) {
                    int var42 = this.field1563.method241();
                    this.method469(var42, -380);
                    if (this.field1438 != -1) {
                        this.field1438 = -1;
                        this.field1517 = true;
                        this.field1353 = true;
                    }
                    this.field1573 = var42;
                    this.field1282 = true;
                    this.field1262 = -1;
                    this.field1459 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 28) {
                    InputTracking.method44(0);
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 135) {
                    int var43 = this.field1563.method241();
                    int var44 = this.field1563.method241();
                    int var45 = var44 >> 10 & 31;
                    int var46 = var44 >> 5 & 31;
                    int var47 = var44 & 31;
                    Component.field67[var43].field110 = (var47 << 3) + (var45 << 19) + (var46 << 11);
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 144) {
                    for (int var48 = 0; var48 < this.field1587.length; ++var48) {
                        if (this.field1587[var48] != null) {
                            this.field1587[var48].field437 = -1;
                        }
                    }
                    for (int var49 = 0; var49 < this.field1537.length; ++var49) {
                        if (this.field1537[var49] != null) {
                            this.field1537[var49].field437 = -1;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 225) {
                    int var50 = this.field1563.method241();
                    boolean var51 = this.field1563.method239() == 1;
                    Component.field67[var50].field88 = var51;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 230) {
                    int var52 = this.field1563.method241();
                    int var53 = this.field1563.method242();
                    int var54 = this.field1563.method242();
                    Component var55 = Component.field67[var52];
                    var55.field80 = var53;
                    var55.field81 = var54;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 192) {
                    int var56 = this.field1563.method241();
                    byte var57 = this.field1563.method240();
                    this.field1612[var56] = var57;
                    if (this.field1462[var56] != var57) {
                        this.field1462[var56] = var57;
                        this.method527(var56, -42638);
                        this.field1517 = true;
                        if (this.field1398 != -1) {
                            this.field1282 = true;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 226) {
                    int var58 = this.field1563.method241();
                    int var59 = this.field1563.method241();
                    Component var60 = Component.field67[var58];
                    if (var60 != null && var60.field74 == 0) {
                        if (var59 < 0) {
                            var59 = 0;
                        }
                        if (var59 > var60.field86 - var60.field78) {
                            var59 = var60.field86 - var60.field78;
                        }
                        var60.field87 = var59;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 238) {
                    this.field1557 = this.field1563.method244();
                    this.field1613 = this.field1563.method241();
                    this.field1182 = this.field1563.method239();
                    this.field1327 = this.field1563.method241();
                    this.field1214 = this.field1563.method239();
                    if (this.field1557 != 0 && this.field1262 == -1) {
                        signlink.dnslookup(JString.method313(9, this.field1557));
                        this.method537(251);
                        short var61 = 650;
                        if (this.field1182 != 201 || this.field1214 == 1) {
                            var61 = 655;
                        }
                        this.field1313 = "";
                        this.field1449 = false;
                        for (int var62 = 0; var62 < Component.field67.length; ++var62) {
                            if (Component.field67[var62] != null && Component.field67[var62].field76 == var61) {
                                this.field1262 = Component.field67[var62].field73;
                                break;
                            }
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 203) {
                    this.field1553 = this.field1563.method239();
                    this.field1554 = this.field1563.method239();
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 123) {
                    this.field1317 = true;
                    this.field1257 = this.field1563.method239();
                    this.field1258 = this.field1563.method239();
                    this.field1259 = this.field1563.method241();
                    this.field1260 = this.field1563.method239();
                    this.field1261 = this.field1563.method239();
                    if (this.field1261 >= 100) {
                        int var63 = this.field1257 * 128 + 64;
                        int var64 = this.field1258 * 128 + 64;
                        int var65 = this.method484(var64, this.field1224, var63, (byte) 6) - this.field1259;
                        int var66 = var63 - this.field1297;
                        int var67 = var65 - this.field1298;
                        int var68 = var64 - this.field1299;
                        int var69 = (int) Math.sqrt((double) (var66 * var66 + var68 * var68));
                        this.field1300 = (int) (Math.atan2((double) var67, (double) var69) * 325.949D) & 2047;
                        this.field1301 = (int) (Math.atan2((double) var66, (double) var68) * -325.949D) & 2047;
                        if (this.field1300 < 128) {
                            this.field1300 = 128;
                        }
                        if (this.field1300 > 383) {
                            this.field1300 = 383;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 56) {
                    this.field1187 = false;
                    this.field1386 = true;
                    this.field1274 = "";
                    this.field1282 = true;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 86) {
                    this.field1317 = true;
                    this.field1602 = this.field1563.method239();
                    this.field1603 = this.field1563.method239();
                    this.field1604 = this.field1563.method241();
                    this.field1605 = this.field1563.method239();
                    this.field1606 = this.field1563.method239();
                    if (this.field1606 >= 100) {
                        this.field1297 = this.field1602 * 128 + 64;
                        this.field1299 = this.field1603 * 128 + 64;
                        this.field1298 = this.method484(this.field1299, this.field1224, this.field1297, (byte) 6) - this.field1604;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 105) {
                    this.method510(435, this.field1563, this.field1595);
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 174) {
                    if (this.field1438 != -1) {
                        this.field1438 = -1;
                        this.field1517 = true;
                        this.field1353 = true;
                    }
                    if (this.field1573 != -1) {
                        this.field1573 = -1;
                        this.field1282 = true;
                    }
                    if (this.field1386) {
                        this.field1386 = false;
                        this.field1282 = true;
                    }
                    this.field1262 = -1;
                    this.field1459 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 109) {
                    long var70 = this.field1563.method245((byte) -25);
                    int var72 = this.field1563.method239();
                    String var73 = JString.method314(JString.method311((byte) 4, var70), (byte) 9);
                    for (int var74 = 0; var74 < this.field1371; ++var74) {
                        if (this.field1326[var74] == var70) {
                            if (this.field1558[var74] != var72) {
                                this.field1558[var74] = var72;
                                this.field1517 = true;
                                if (var72 > 0) {
                                    this.method544(5, "", var73 + " has logged in.", 0);
                                }
                                if (var72 == 0) {
                                    this.method544(5, "", var73 + " has logged out.", 0);
                                }
                            }
                            var73 = null;
                            break;
                        }
                    }
                    if (var73 != null && this.field1371 < 200) {
                        this.field1326[this.field1371] = var70;
                        this.field1294[this.field1371] = var73;
                        this.field1558[this.field1371] = var72;
                        ++this.field1371;
                        this.field1517 = true;
                    }
                    boolean var75 = false;
                    while (!var75) {
                        var75 = true;
                        for (int var76 = 0; var76 < this.field1371 - 1; ++var76) {
                            if (this.field1558[var76] != field1228 && this.field1558[var76 + 1] == field1228 || this.field1558[var76] == 0 && this.field1558[var76 + 1] != 0) {
                                int var77 = this.field1558[var76];
                                this.field1558[var76] = this.field1558[var76 + 1];
                                this.field1558[var76 + 1] = var77;
                                String var78 = this.field1294[var76];
                                this.field1294[var76] = this.field1294[var76 + 1];
                                this.field1294[var76 + 1] = var78;
                                long var79 = this.field1326[var76];
                                this.field1326[var76] = this.field1326[var76 + 1];
                                this.field1326[var76 + 1] = var79;
                                this.field1517 = true;
                                var75 = false;
                            }
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 49) {
                    this.field1185 = this.field1563.method241();
                    this.field1543 = this.field1563.method239();
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 75) {
                    int var81 = this.field1563.method241();
                    int var82 = this.field1563.method244();
                    this.field1612[var81] = var82;
                    if (this.field1462[var81] != var82) {
                        this.field1462[var81] = var82;
                        this.method527(var81, -42638);
                        this.field1517 = true;
                        if (this.field1398 != -1) {
                            this.field1282 = true;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 29) {
                    int var83 = this.field1563.method241();
                    int var84 = this.field1563.method239();
                    if (var83 == 65535) {
                        var83 = -1;
                    }
                    this.field1421[var84] = var83;
                    this.field1517 = true;
                    this.field1353 = true;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 8) {
                    this.field1232 = this.field1563.method239();
                    this.field1517 = true;
                    this.field1353 = true;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 177) {
                    int var85 = this.field1563.method241();
                    this.method469(var85, -380);
                    if (this.field1438 != -1) {
                        this.field1438 = -1;
                        this.field1517 = true;
                        this.field1353 = true;
                    }
                    if (this.field1573 != -1) {
                        this.field1573 = -1;
                        this.field1282 = true;
                    }
                    if (this.field1386) {
                        this.field1386 = false;
                        this.field1282 = true;
                    }
                    this.field1262 = var85;
                    this.field1459 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 236) {
                    int var86 = this.field1563.method241();
                    this.method469(var86, -380);
                    if (this.field1573 != -1) {
                        this.field1573 = -1;
                        this.field1282 = true;
                    }
                    if (this.field1386) {
                        this.field1386 = false;
                        this.field1282 = true;
                    }
                    this.field1438 = var86;
                    this.field1517 = true;
                    this.field1353 = true;
                    this.field1262 = -1;
                    this.field1459 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 95) {
                    this.field1517 = true;
                    int var87 = this.field1563.method241();
                    Component var88 = Component.field67[var87];
                    while (this.field1563.field710 < this.field1595) {
                        int var89 = this.field1563.method239();
                        int var90 = this.field1563.method241();
                        int var91 = this.field1563.method239();
                        if (var91 == 255) {
                            var91 = this.field1563.method244();
                        }
                        if (var89 >= 0 && var89 < var88.field68.length) {
                            var88.field68[var89] = var90;
                            var88.field69[var89] = var91;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 108) {
                    this.field1427 = 255;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 70) {
                    if (this.field1232 == 12) {
                        this.field1517 = true;
                    }
                    this.field1184 = this.field1563.method242();
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 181) {
                    this.field1225 = this.field1595 / 8;
                    for (int var92 = 0; var92 < this.field1225; ++var92) {
                        this.field1306[var92] = this.field1563.method245((byte) -25);
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 175) {
                    String var93 = this.field1563.method246();
                    if (var93.endsWith(":tradereq:")) {
                        String var94 = var93.substring(0, var93.indexOf(":"));
                        long var95 = JString.method310(var94);
                        boolean var97 = false;
                        for (int var98 = 0; var98 < this.field1225; ++var98) {
                            if (this.field1306[var98] == var95) {
                                var97 = true;
                                break;
                            }
                        }
                        if (!var97 && this.field1536 == 0) {
                            this.method544(4, var94, "wishes to trade with you.", 0);
                        }
                    } else if (!var93.endsWith(":duelreq:")) {
                        this.method544(0, "", var93, 0);
                    } else {
                        String var99 = var93.substring(0, var93.indexOf(":"));
                        long var100 = JString.method310(var99);
                        boolean var102 = false;
                        for (int var103 = 0; var103 < this.field1225; ++var103) {
                            if (this.field1306[var103] == var100) {
                                var102 = true;
                                break;
                            }
                        }
                        if (!var102 && this.field1536 == 0) {
                            this.method544(8, var99, "wishes to duel with you.", 0);
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 229) {
                    int var104 = this.field1563.method241();
                    int var105 = this.field1563.method241();
                    if (this.field1573 != -1) {
                        this.field1573 = -1;
                        this.field1282 = true;
                    }
                    if (this.field1386) {
                        this.field1386 = false;
                        this.field1282 = true;
                    }
                    this.field1262 = var104;
                    this.field1438 = var105;
                    this.field1517 = true;
                    this.field1353 = true;
                    this.field1459 = false;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 110) {
                    this.field1517 = true;
                    int var106 = this.field1563.method239();
                    int var107 = this.field1563.method244();
                    int var108 = this.field1563.method239();
                    this.field1456[var106] = var107;
                    this.field1493[var106] = var108;
                    this.field1542[var106] = 1;
                    for (int var109 = 0; var109 < 98; ++var109) {
                        if (var107 >= field1533[var109]) {
                            this.field1542[var106] = var109 + 2;
                        }
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 143) {
                    int var110 = this.field1563.method241();
                    Component var111 = Component.field67[var110];
                    for (int var112 = 0; var112 < var111.field68.length; ++var112) {
                        var111.field68[var112] = -1;
                        var111.field68[var112] = 0;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 233) {
                    this.field1307 = 0;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 132) {
                    this.field1576 = this.field1563.method239();
                    if (this.field1576 == this.field1232) {
                        if (this.field1576 == 3) {
                            this.field1232 = 1;
                        } else {
                            this.field1232 = 3;
                        }
                        this.field1517 = true;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 83) {
                    int var113 = this.field1563.method241();
                    Component.field67[var113].field116 = 3;
                    Component.field67[var113].field117 = (field1239.field471[8] << 6) + (field1239.field471[0] << 12) + (field1239.field472[0] << 24) + (field1239.field472[4] << 18) + field1239.field471[11];
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 209) {
                    int var114 = this.field1563.method241();
                    int var115 = this.field1563.method239();
                    int var116 = this.field1563.method241();
                    if (this.field1508 && !field1231 && this.field1451 < 50) {
                        this.field1255[this.field1451] = var114;
                        this.field1458[this.field1451] = var115;
                        this.field1505[this.field1451] = Wave.field895[var114] + var116;
                        ++this.field1451;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 103) {
                    int var117 = this.field1563.method239();
                    int var118 = this.field1563.method239();
                    int var119 = this.field1563.method239();
                    int var120 = this.field1563.method239();
                    this.field1502[var117] = true;
                    this.field1384[var117] = var118;
                    this.field1219[var117] = var119;
                    this.field1584[var117] = var120;
                    this.field1285[var117] = 0;
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 151 || this.field1596 == 188 || this.field1596 == 190 || this.field1596 == 141 || this.field1596 == 187 || this.field1596 == 13 || this.field1596 == 94 || this.field1596 == 71 || this.field1596 == 198 || this.field1596 == 119) {
                    this.method506(-47250, this.field1596, this.field1563);
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 35) {
                    this.field1609 = this.field1563.method239();
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 36) {
                    this.method553(0);
                    this.field1596 = -1;
                    return false;
                }
                if (this.field1596 == 134) {
                    this.field1317 = false;
                    for (int var121 = 0; var121 < 5; ++var121) {
                        this.field1502[var121] = false;
                    }
                    this.field1596 = -1;
                    return true;
                }
                if (this.field1596 == 66) {
                    int var122 = this.field1563.method241();
                    int var123 = this.field1563.method241();
                    if (this.field1439 == var122 && this.field1440 == var123 && this.field1487 == 2) {
                        this.field1596 = -1;
                        return true;
                    }
                    this.field1439 = var122;
                    this.field1440 = var123;
                    this.field1366 = (this.field1439 - 6) * 8;
                    this.field1367 = (this.field1440 - 6) * 8;
                    this.field1461 = false;
                    if ((this.field1439 / 8 == 48 || this.field1439 / 8 == 49) && this.field1440 / 8 == 48) {
                        this.field1461 = true;
                    }
                    if (this.field1439 / 8 == 48 && this.field1440 / 8 == 148) {
                        this.field1461 = true;
                    }
                    this.field1487 = 1;
                    this.field1408 = System.currentTimeMillis();
                    this.field1616.method268(3);
                    this.field1361.method214("Loading - please wait.", 0, 151, 257, -28519);
                    this.field1361.method214("Loading - please wait.", 16777215, 150, 256, -28519);
                    this.field1616.method269((byte) 7, 4, super.field13, 4);
                    int var124 = 0;
                    for (int var125 = (this.field1439 - 6) / 8; var125 <= (this.field1439 + 6) / 8; ++var125) {
                        for (int var126 = (this.field1440 - 6) / 8; var126 <= (this.field1440 + 6) / 8; ++var126) {
                            ++var124;
                        }
                    }
                    this.field1310 = new byte[var124][];
                    this.field1293 = new byte[var124][];
                    this.field1347 = new int[var124];
                    this.field1348 = new int[var124];
                    this.field1349 = new int[var124];
                    int var127 = 0;
                    for (int var128 = (this.field1439 - 6) / 8; var128 <= (this.field1439 + 6) / 8; ++var128) {
                        for (int var129 = (this.field1440 - 6) / 8; var129 <= (this.field1440 + 6) / 8; ++var129) {
                            this.field1347[var127] = (var128 << 8) + var129;
                            if (!this.field1461 || var129 != 49 && var129 != 149 && var129 != 147 && var128 != 50 && (var128 != 49 || var129 != 47)) {
                                int var130 = this.field1348[var127] = this.field1273.method284(var129, 0, -371, var128);
                                if (var130 != -1) {
                                    this.field1273.method289(3, var130);
                                }
                                int var131 = this.field1349[var127] = this.field1273.method284(var129, 1, -371, var128);
                                if (var131 != -1) {
                                    this.field1273.method289(3, var131);
                                }
                                ++var127;
                            } else {
                                this.field1348[var127] = -1;
                                this.field1349[var127] = -1;
                                ++var127;
                            }
                        }
                    }
                    int var132 = this.field1366 - this.field1368;
                    int var133 = this.field1367 - this.field1369;
                    this.field1368 = this.field1366;
                    this.field1369 = this.field1367;
                    for (int var134 = 0; var134 < 8192; ++var134) {
                        NpcEntity var135 = this.field1537[var134];
                        if (var135 != null) {
                            for (int var136 = 0; var136 < 10; ++var136) {
                                var135.field458[var136] -= var132;
                                var135.field459[var136] -= var133;
                            }
                            var135.field409 -= var132 * 128;
                            var135.field410 -= var133 * 128;
                        }
                    }
                    for (int var137 = 0; var137 < this.field1585; ++var137) {
                        PlayerEntity var138 = this.field1587[var137];
                        if (var138 != null) {
                            for (int var139 = 0; var139 < 10; ++var139) {
                                var138.field458[var139] -= var132;
                                var138.field459[var139] -= var133;
                            }
                            var138.field409 -= var132 * 128;
                            var138.field410 -= var133 * 128;
                        }
                    }
                    this.field1241 = true;
                    byte var140 = 0;
                    byte var141 = 104;
                    byte var142 = 1;
                    if (var132 < 0) {
                        var140 = 103;
                        var141 = -1;
                        var142 = -1;
                    }
                    byte var143 = 0;
                    byte var144 = 104;
                    byte var145 = 1;
                    if (var133 < 0) {
                        var143 = 103;
                        var144 = -1;
                        var145 = -1;
                    }
                    for (int var146 = var140; var141 != var146; var146 += var142) {
                        for (int var147 = var143; var144 != var147; var147 += var145) {
                            int var148 = var132 + var146;
                            int var149 = var133 + var147;
                            for (int var150 = 0; var150 < 4; ++var150) {
                                if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
                                    this.field1342[var150][var146][var147] = this.field1342[var150][var148][var149];
                                } else {
                                    this.field1342[var150][var146][var147] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var151 = (LocSpawned) this.field1302.method258(); var151 != null; var151 = (LocSpawned) this.field1302.method260(true)) {
                        var151.field730 -= var132;
                        var151.field731 -= var133;
                        if (var151.field730 < 0 || var151.field731 < 0 || var151.field730 >= 104 || var151.field731 >= 104) {
                            var151.method120();
                        }
                    }
                    if (this.field1307 != 0) {
                        this.field1307 -= var132;
                        this.field1308 -= var133;
                    }
                    this.field1317 = false;
                    this.field1596 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1596 + "," + this.field1595 + " - " + this.field1523 + "," + this.field1524);
                this.method553(0);
            } catch (IOException var156) {
                this.method498(false);
            } catch (Exception var157) {
                String var153 = "T2 - " + this.field1596 + "," + this.field1523 + "," + this.field1524 + " - " + this.field1595 + "," + (field1239.field458[0] + this.field1366) + "," + (field1239.field459[0] + this.field1367) + " - ";
                for (int var154 = 0; var154 < this.field1595 && var154 < 50; ++var154) {
                    var153 = var153 + this.field1563.field709[var154] + ",";
                }
                signlink.reporterror(var153);
                this.method553(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method468(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            field1359 = -83;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method469(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1596 = this.field1563.method239();
        }
        Component var3 = Component.field67[arg0];
        for (int var4 = 0; var4 < var3.field89.length && var3.field89[var4] != -1; ++var4) {
            Component var5 = Component.field67[var3.field89[var4]];
            if (var5.field74 == 1) {
                this.method469(var5.field72, -380);
            }
            var5.field70 = 0;
            var5.field71 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLmb;I)V")
    private final void method470(boolean arg0, Packet arg1, int arg2) {
        if (arg0) {
            this.field1370 = 441;
        }
        while (arg1.field711 + 21 < arg2 * 8) {
            int var4 = arg1.method250(13, 0);
            if (var4 == 8191) {
                break;
            }
            if (this.field1537[var4] == null) {
                this.field1537[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1537[var4];
            this.field1539[this.field1538++] = var4;
            var5.field454 = field1633;
            var5.field464 = NpcType.method344(arg1.method250(11, 0));
            var5.field413 = var5.field464.field986;
            var5.field416 = var5.field464.field990;
            var5.field417 = var5.field464.field991;
            var5.field418 = var5.field464.field992;
            var5.field419 = var5.field464.field993;
            var5.field414 = var5.field464.field989;
            int var6 = arg1.method250(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method250(5, 0);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method124(field1239.field458[0] + var6, false, 0, field1239.field459[0] + var7);
            int var8 = arg1.method250(1, 0);
            if (var8 == 1) {
                this.field1591[this.field1590++] = var4;
            }
        }
        arg1.method251(30037);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method471(int arg0) {
        for (int var2 = -1; var2 < this.field1588; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1586;
            } else {
                var4 = this.field1589[var2];
            }
            PlayerEntity var5 = this.field1587[var4];
            if (var5 != null) {
                this.method520(1, var5, true);
            }
        }
        ++field1503;
        if (arg0 <= 0) {
            this.field1350 = !this.field1350;
        }
        if (field1503 > 1406) {
            field1503 = 0;
            this.field1566.method228((byte) 0, 112);
            this.field1566.method229(0);
            int var3 = this.field1566.field710;
            this.field1566.method229(162);
            this.field1566.method229(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1566.method229(84);
            }
            this.field1566.method230(31824);
            this.field1566.method230(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1566.method229(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1566.method229(134);
            }
            this.field1566.method229(100);
            this.field1566.method229(94);
            this.field1566.method230(35521);
            this.field1566.method238(this.field1566.field710 - var3, -18284);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method472(int arg0) {
        ++this.field1329;
        this.method451((byte) 9, true);
        this.method496(-5080, true);
        this.method451((byte) 9, false);
        this.method496(-5080, false);
        this.method458(true);
        this.method542(this.field1235);
        if (!this.field1317) {
            int var2 = this.field1559;
            if (this.field1570 / 256 > var2) {
                var2 = this.field1570 / 256;
            }
            if (this.field1502[4] && this.field1219[4] + 128 > var2) {
                var2 = this.field1219[4] + 128;
            }
            int var3 = this.field1560 + this.field1410 & 2047;
            this.method533(this.method484(field1239.field410, this.field1224, field1239.field409, (byte) 6) - 50, var2 * 3 + 600, var3, this.field1515, 0, this.field1514, var2);
            ++field1357;
            if (field1357 > 1802) {
                field1357 = 0;
                this.field1566.method228((byte) 0, 223);
                this.field1566.method229(0);
                int var4 = this.field1566.field710;
                this.field1566.method230(29711);
                this.field1566.method229(70);
                this.field1566.method229((int) (Math.random() * 256.0D));
                this.field1566.method229(242);
                this.field1566.method229(186);
                this.field1566.method229(39);
                this.field1566.method229(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1566.method229(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1566.method230(57856);
                }
                this.field1566.method230((int) (Math.random() * 65536.0D));
                this.field1566.method238(this.field1566.field710 - var4, -18284);
            }
        }
        int var5;
        if (!this.field1317) {
            var5 = this.method462((byte) -107);
        } else {
            var5 = this.method463(43738);
        }
        int var6 = this.field1297;
        int var7 = this.field1298;
        int var8 = this.field1299;
        int var9 = this.field1300;
        int var10 = this.field1301;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1502[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1384[var11] * 2 + 1) - (double) this.field1384[var11] + Math.sin((double) this.field1584[var11] / 100.0D * (double) this.field1285[var11]) * (double) this.field1219[var11]);
                if (var11 == 0) {
                    this.field1297 += var13;
                }
                if (var11 == 1) {
                    this.field1298 += var13;
                }
                if (var11 == 2) {
                    this.field1299 += var13;
                }
                if (var11 == 3) {
                    this.field1301 = this.field1301 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1300 += var13;
                    if (this.field1300 < 128) {
                        this.field1300 = 128;
                    }
                    if (this.field1300 > 383) {
                        this.field1300 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field663;
        Model.field602 = true;
        Model.field605 = 0;
        Model.field603 = super.field21 - 4;
        Model.field604 = super.field22 - 4;
        Pix2D.method168(274);
        this.field1420.method103(this.field1299, this.field1300, -713, this.field1301, this.field1298, this.field1297, var5);
        this.field1420.method78(895);
        this.method518(0);
        if (arg0 <= 0) {
            this.field1342 = null;
        }
        this.method453((byte) 109);
        this.method509((byte) 4, var12);
        this.method558(48);
        this.field1616.method269((byte) 7, 4, super.field13, 4);
        this.field1297 = var6;
        this.field1298 = var7;
        this.field1299 = var8;
        this.field1300 = var9;
        this.field1301 = var10;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method473(byte arg0) {
        this.field1315 = true;
        if (arg0 != 125) {
            this.field1402 = !this.field1402;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1213[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1086; ++var3) {
                if (!IdkType.field1087[var3].field1093 && IdkType.field1087[var3].field1088 == var2 + (this.field1312 ? 0 : 7)) {
                    this.field1213[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method474(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1396) {
            this.method538(3);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        int var2 = this.field1498;
        int var3 = this.field1499;
        int var4 = this.field1500;
        int var5 = this.field1501;
        if (arg0) {
            this.field1342 = null;
        }
        int var6 = 6116423;
        Pix2D.method170(var4, 5, var2, var3, var5, var6);
        Pix2D.method170(var4 - 2, 5, var2 + 1, var3 + 1, 16, 0);
        Pix2D.method171(field1413, var5 - 19, var3 + 18, var4 - 2, 0, var2 + 1);
        this.field1362.method217(var3 + 14, var2 + 3, "Choose Option", var6, (byte) 3);
        int var7 = super.field21;
        int var8 = super.field22;
        if (this.field1497 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1497 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1497 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1492; ++var9) {
            int var10 = (this.field1492 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1362.method219(this.field1210[var9], var10, var2 + 3, true, -44475, var11);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method476(int arg0) {
        this.method493(7);
        this.field1201.method268(3);
        if (arg0 < 6 || arg0 > 6) {
            this.field1596 = -1;
        }
        this.field1295.method212(0, 0, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1409 == 0) {
            int var4 = var3 / 2 + 80;
            this.field1360.method215(var4, (byte) 6, var2 / 2, true, this.field1273.field832, 7711145);
            int var5 = var3 / 2 - 20;
            this.field1362.method215(var5, (byte) 6, var2 / 2, true, "Welcome to RuneScape", 16776960);
            int var16 = var5 + 30;
            int var6 = var2 / 2 - 80;
            int var7 = var3 / 2 + 20;
            this.field1296.method212(0, var7 - 20, var6 - 73);
            this.field1362.method215(var7 + 5, (byte) 6, var6, true, "New user", 16777215);
            int var8 = var2 / 2 + 80;
            this.field1296.method212(0, var7 - 20, var8 - 73);
            this.field1362.method215(var7 + 5, (byte) 6, var8, true, "Existing User", 16777215);
        }
        if (this.field1409 == 2) {
            int var9 = var3 / 2 - 40;
            if (this.field1335.length() > 0) {
                this.field1362.method215(var9 - 15, (byte) 6, var2 / 2, true, this.field1335, 16776960);
                this.field1362.method215(var9, (byte) 6, var2 / 2, true, this.field1336, 16776960);
                var9 += 30;
            } else {
                this.field1362.method215(var9 - 7, (byte) 6, var2 / 2, true, this.field1336, 16776960);
                var9 += 30;
            }
            this.field1362.method219("Username: " + this.field1631 + (this.field1519 == 0 & field1633 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 90, true, -44475, 16777215);
            var9 += 15;
            this.field1362.method219("Password: " + JString.method316(this.field1632, (byte) -76) + (this.field1519 == 1 & field1633 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 88, true, -44475, 16777215);
            var9 += 15;
            int var10 = var2 / 2 - 80;
            int var11 = var3 / 2 + 50;
            this.field1296.method212(0, var11 - 20, var10 - 73);
            this.field1362.method215(var11 + 5, (byte) 6, var10, true, "Login", 16777215);
            int var12 = var2 / 2 + 80;
            this.field1296.method212(0, var11 - 20, var12 - 73);
            this.field1362.method215(var11 + 5, (byte) 6, var12, true, "Cancel", 16777215);
        }
        if (this.field1409 == 3) {
            this.field1362.method215(var3 / 2 - 60, (byte) 6, var2 / 2, true, "Create a free account", 16776960);
            int var13 = var3 / 2 - 35;
            this.field1362.method215(var13, (byte) 6, var2 / 2, true, "To create a new account you need to", 16777215);
            int var17 = var13 + 15;
            this.field1362.method215(var17, (byte) 6, var2 / 2, true, "go back to the main RuneScape webpage", 16777215);
            int var18 = var17 + 15;
            this.field1362.method215(var18, (byte) 6, var2 / 2, true, "and choose the red 'create account'", 16777215);
            int var19 = var18 + 15;
            this.field1362.method215(var19, (byte) 6, var2 / 2, true, "button at the top right of that page.", 16777215);
            int var20 = var19 + 15;
            int var14 = var2 / 2;
            int var15 = var3 / 2 + 50;
            this.field1296.method212(0, var15 - 20, var14 - 73);
            this.field1362.method215(var15 + 5, (byte) 6, var14, true, "Cancel", 16777215);
        }
        this.field1201.method269((byte) 7, 171, super.field13, 202);
        if (this.field1546) {
            this.field1546 = false;
            this.field1199.method269((byte) 7, 0, super.field13, 128);
            this.field1200.method269((byte) 7, 371, super.field13, 202);
            this.field1204.method269((byte) 7, 265, super.field13, 0);
            this.field1205.method269((byte) 7, 265, super.field13, 562);
            this.field1206.method269((byte) 7, 171, super.field13, 128);
            this.field1207.method269((byte) 7, 171, super.field13, 562);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method477(int arg0) {
        if (arg0 != -974) {
            this.field1566.method229(21);
        }
        if (super.field27 == 1) {
            if (super.field28 >= 539 && super.field28 <= 573 && super.field29 >= 169 && super.field29 < 205 && this.field1421[0] != -1) {
                this.field1517 = true;
                this.field1232 = 0;
                this.field1353 = true;
            }
            if (super.field28 >= 569 && super.field28 <= 599 && super.field29 >= 168 && super.field29 < 205 && this.field1421[1] != -1) {
                this.field1517 = true;
                this.field1232 = 1;
                this.field1353 = true;
            }
            if (super.field28 >= 597 && super.field28 <= 627 && super.field29 >= 168 && super.field29 < 205 && this.field1421[2] != -1) {
                this.field1517 = true;
                this.field1232 = 2;
                this.field1353 = true;
            }
            if (super.field28 >= 625 && super.field28 <= 669 && super.field29 >= 168 && super.field29 < 203 && this.field1421[3] != -1) {
                this.field1517 = true;
                this.field1232 = 3;
                this.field1353 = true;
            }
            if (super.field28 >= 666 && super.field28 <= 696 && super.field29 >= 168 && super.field29 < 205 && this.field1421[4] != -1) {
                this.field1517 = true;
                this.field1232 = 4;
                this.field1353 = true;
            }
            if (super.field28 >= 694 && super.field28 <= 724 && super.field29 >= 168 && super.field29 < 205 && this.field1421[5] != -1) {
                this.field1517 = true;
                this.field1232 = 5;
                this.field1353 = true;
            }
            if (super.field28 >= 722 && super.field28 <= 756 && super.field29 >= 169 && super.field29 < 205 && this.field1421[6] != -1) {
                this.field1517 = true;
                this.field1232 = 6;
                this.field1353 = true;
            }
            if (super.field28 >= 540 && super.field28 <= 574 && super.field29 >= 466 && super.field29 < 502 && this.field1421[7] != -1) {
                this.field1517 = true;
                this.field1232 = 7;
                this.field1353 = true;
            }
            if (super.field28 >= 572 && super.field28 <= 602 && super.field29 >= 466 && super.field29 < 503 && this.field1421[8] != -1) {
                this.field1517 = true;
                this.field1232 = 8;
                this.field1353 = true;
            }
            if (super.field28 >= 599 && super.field28 <= 629 && super.field29 >= 466 && super.field29 < 503 && this.field1421[9] != -1) {
                this.field1517 = true;
                this.field1232 = 9;
                this.field1353 = true;
            }
            if (super.field28 >= 627 && super.field28 <= 671 && super.field29 >= 467 && super.field29 < 502 && this.field1421[10] != -1) {
                this.field1517 = true;
                this.field1232 = 10;
                this.field1353 = true;
            }
            if (super.field28 >= 669 && super.field28 <= 699 && super.field29 >= 466 && super.field29 < 503 && this.field1421[11] != -1) {
                this.field1517 = true;
                this.field1232 = 11;
                this.field1353 = true;
            }
            if (super.field28 >= 696 && super.field28 <= 726 && super.field29 >= 466 && super.field29 < 503 && this.field1421[12] != -1) {
                this.field1517 = true;
                this.field1232 = 12;
                this.field1353 = true;
            }
            if (super.field28 >= 724 && super.field28 <= 758 && super.field29 >= 466 && super.field29 < 502 && this.field1421[13] != -1) {
                this.field1517 = true;
                this.field1232 = 13;
                this.field1353 = true;
            }
            ++field1442;
            if (field1442 > 150) {
                field1442 = 0;
                this.field1566.method228((byte) 0, 136);
                this.field1566.method229(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;I)I")
    public final int method478(byte arg0, Component arg1, int arg2) {
        if (arg0 != 69) {
            return 1;
        } else if (arg1.field82 != null && arg2 < arg1.field82.length) {
            try {
                int[] var4 = arg1.field82[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1493[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1542[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1456[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field67[var4[var6++]];
                        int var9 = var4[var6++];
                        if (var9 >= 0 && var9 < ObjType.field1011 && (!ObjType.method350(var9).field1032 || field1230)) {
                            for (int var10 = 0; var10 < var8.field68.length; ++var10) {
                                if (var9 + 1 == var8.field68[var10]) {
                                    var5 += var8.field69[var10];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1462[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1533[this.field1542[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1462[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += field1239.field473;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < Stats.field1126; ++var11) {
                            if (Stats.field1128[var11]) {
                                var5 += this.field1542[var11];
                            }
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field67[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        if (var13 >= 0 && var13 < ObjType.field1011 && (!ObjType.method350(var13).field1032 || field1230)) {
                            for (int var14 = 0; var14 < var12.field68.length; ++var14) {
                                if (var12.field68[var14] == var13) {
                                    var5 += 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1610;
                    }
                    if (var7 == 12) {
                        var5 += this.field1184;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1462[var4[var6++]];
                        int var16 = var4[var6++];
                        var5 += (var15 & 1 << var16) != 0 ? 1 : 0;
                    }
                    if (var7 == 14) {
                        int var17 = var4[var6++];
                        VarbitType var18 = VarbitType.field1144[var17];
                        int var19 = var18.field1146;
                        int var20 = var18.field1147;
                        int var21 = var18.field1148;
                        int var22 = field1292[var21 - var20];
                        var5 += this.field1462[var19] >> var20 & var22;
                    }
                }
            } catch (Exception var23) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method479(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field1629[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field1629[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field1630[var15] = (this.field1629[var15 - 1] + this.field1629[var15 + 1] + this.field1629[var15 - 128] + this.field1629[var15 + 128]) / 4;
            }
        }
        this.field1316 += 128;
        if (this.field1316 > this.field1494.length) {
            this.field1316 -= this.field1494.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method541(this.field1634[var6], 32758);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var7 << 7) + var11;
                int var13 = this.field1630[var12 + 128] - this.field1494[this.field1316 + var12 & this.field1494.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field1629[var12] = var13;
            }
        }
        if (this.field1623 == arg0) {
            boolean var8 = false;
        } else {
            this.method6();
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field1286[var9] = this.field1286[var9 + 1];
        }
        this.field1286[var2 - 1] = (int) (Math.sin((double) field1633 / 14.0D) * 16.0D + Math.sin((double) field1633 / 15.0D) * 14.0D + Math.sin((double) field1633 / 16.0D) * 12.0D);
        if (this.field1571 > 0) {
            this.field1571 -= 4;
        }
        if (this.field1572 > 0) {
            this.field1572 -= 4;
        }
        if (this.field1571 == 0 && this.field1572 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field1571 = 1024;
            }
            if (var10 == 1) {
                this.field1572 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method480(boolean arg0) {
        if (this.field1540 != 0) {
            int var2 = 0;
            if (this.field1256 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1249[var3] != null) {
                    int var4 = this.field1247[var3];
                    String var5 = this.field1248[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1635 == 0 || this.field1635 == 1 && this.method559(var5, this.field1246))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field21 > 4 && super.field22 - 4 > var9 - 10 && super.field22 - 4 <= var9 + 3) {
                            int var10 = this.field1361.method216(-525, "From:  " + var5 + this.field1249[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field21 < var10 + 4) {
                                if (this.field1395 >= 1) {
                                    this.field1210[this.field1492] = "Report abuse @whi@" + var5;
                                    this.field1332[this.field1492] = 2034;
                                    ++this.field1492;
                                }
                                this.field1210[this.field1492] = "Add ignore @whi@" + var5;
                                this.field1332[this.field1492] = 2436;
                                ++this.field1492;
                                this.field1210[this.field1492] = "Add friend @whi@" + var5;
                                this.field1332[this.field1492] = 2406;
                                ++this.field1492;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1635 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lyb;")
    public final Jagfile method481(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1356[0] != null) {
                var7 = this.field1356[0].method301(0, arg2);
            }
        } catch (Exception var29) {
        }
        if (var7 != null) {
            this.field1352.reset();
            this.field1352.update(var7);
            int var9 = (int) this.field1352.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(this.field1183, var7);
        } else {
            int var11 = 0;
            if (arg1 <= 0) {
                field1618 = -60;
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(638, "Requesting " + arg4, arg5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method474(arg0 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, 337);
                    var17.field710 = 3;
                    int var18 = var17.method243() + 6;
                    int var19 = 6;
                    var7 = new byte[var18];
                    for (int var20 = 0; var20 < 6; ++var20) {
                        var7[var20] = var16[var20];
                    }
                    while (var19 < var18) {
                        int var21 = var18 - var19;
                        if (var21 > 1000) {
                            var21 = 1000;
                        }
                        int var22 = var15.read(var7, var19, var21);
                        if (var22 < 0) {
                            (new StringBuffer("Length error: ")).append(var19).append("/").append(var18).toString();
                            throw new IOException("EOF");
                        }
                        var19 += var22;
                        int var23 = var19 * 100 / var18;
                        if (var14 != var23) {
                            this.method13(638, "Loading " + arg4 + " - " + var23 + "%", arg5);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1356[0] != null) {
                            this.field1356[0].method302(var7, true, arg2, var7.length);
                        }
                    } catch (Exception var28) {
                        this.field1356[0] = null;
                    }
                    if (var7 != null) {
                        this.field1352.reset();
                        this.field1352.update(var7);
                        int var24 = (int) this.field1352.getValue();
                        if (arg3 != var24) {
                            var7 = null;
                            ++var11;
                            var12 = "Checksum error: " + var24;
                        }
                    }
                } catch (IOException var30) {
                    if (var12.equals("Unknown error")) {
                        var12 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var31) {
                    var12 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var32) {
                    var12 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var33) {
                    var12 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var25 = var8; var25 > 0; --var25) {
                        if (var11 >= 3) {
                            this.method13(638, "Game updated - please reload page", arg5);
                            var25 = 10;
                        } else {
                            this.method13(638, var12 + " - Retrying in " + var25, arg5);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var27) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                }
            }
            return new Jagfile(this.field1183, var7);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        if (this.field1256 > 1) {
            --this.field1256;
        }
        if (this.field1599 > 0) {
            --this.field1599;
        }
        if (this.field1427 > 0) {
            this.field1427 -= 2;
        }
        for (int var2 = 0; var2 < 5 && this.method467(0); ++var2) {
        }
        if (!arg0) {
            field1359 = 380;
        }
        if (this.field1220) {
            this.method442(false);
            this.method465(0);
            this.method439((byte) 9);
            Packet var3 = InputTracking.method46(false);
            if (var3 != null) {
                this.field1566.method228((byte) 0, 19);
                this.field1566.method230(var3.field710);
                this.field1566.method237(true, var3.field710, var3.field709, 0);
                var3.method227((byte) -12);
            }
            ++this.field1597;
            if (this.field1597 > 750) {
                this.method498(false);
            }
            this.method471(60);
            this.method519(true);
            this.method434(264);
            ++this.field1325;
            if (this.field1628 != 0) {
                this.field1627 += 20;
                if (this.field1627 >= 400) {
                    this.field1628 = 0;
                }
            }
            if (this.field1254 != 0) {
                ++this.field1251;
                if (this.field1251 >= 15) {
                    if (this.field1254 == 2) {
                        this.field1517 = true;
                    }
                    if (this.field1254 == 3) {
                        this.field1282 = true;
                    }
                    this.field1254 = 0;
                }
            }
            if (this.field1392 != 0) {
                ++this.field1453;
                if (super.field21 > this.field1393 + 5 || super.field21 < this.field1393 - 5 || super.field22 > this.field1394 + 5 || super.field22 < this.field1394 - 5) {
                    this.field1416 = true;
                }
                if (super.field20 == 0) {
                    if (this.field1392 == 2) {
                        this.field1517 = true;
                    }
                    if (this.field1392 == 3) {
                        this.field1282 = true;
                    }
                    this.field1392 = 0;
                    if (this.field1416 && this.field1453 >= 5) {
                        this.field1266 = -1;
                        this.method444(this.field1287);
                        if (this.field1390 == this.field1266 && this.field1391 != this.field1265) {
                            Component var4 = Component.field67[this.field1390];
                            byte var5 = 0;
                            if (this.field1450 == 1 && var4.field76 == 206) {
                                var5 = 1;
                            }
                            if (var4.field68[this.field1265] <= 0) {
                                var5 = 0;
                            }
                            if (var4.field97) {
                                int var6 = this.field1391;
                                int var7 = this.field1265;
                                var4.field68[var7] = var4.field68[var6];
                                var4.field69[var7] = var4.field69[var6];
                                var4.field68[var6] = -1;
                                var4.field69[var6] = 0;
                            } else if (var5 == 1) {
                                int var8 = this.field1391;
                                int var9 = this.field1265;
                                while (var8 != var9) {
                                    if (var8 > var9) {
                                        var4.method33(var8 - 1, true, var8);
                                        --var8;
                                    } else if (var8 < var9) {
                                        var4.method33(var8 + 1, true, var8);
                                        ++var8;
                                    }
                                }
                            } else {
                                var4.method33(this.field1265, true, this.field1391);
                            }
                            this.field1566.method228((byte) 0, 7);
                            this.field1566.method230(this.field1390);
                            this.field1566.method230(this.field1391);
                            this.field1566.method230(this.field1265);
                            this.field1566.method229(var5);
                        }
                    } else if ((this.field1600 == 1 || this.method454(0, this.field1492 - 1)) && this.field1492 > 2) {
                        this.method534(1);
                    } else if (this.field1492 > 0) {
                        this.method548(0, this.field1492 - 1);
                    }
                    this.field1251 = 10;
                    super.field27 = 0;
                }
            }
            ++field1303;
            if (field1303 > 127) {
                field1303 = 0;
                this.field1566.method228((byte) 0, 181);
                this.field1566.method232(4991788);
            }
            if (World3D.field329 != -1) {
                int var10 = World3D.field329;
                int var11 = World3D.field330;
                boolean var12 = this.method499(true, 0, 0, var10, 0, 0, field1239.field458[0], 0, var11, 0, field1239.field459[0], false);
                World3D.field329 = -1;
                if (var12) {
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 1;
                    this.field1627 = 0;
                }
            }
            if (super.field27 == 1 && this.field1433 != null) {
                this.field1433 = null;
                this.field1282 = true;
                super.field27 = 0;
            }
            this.method500((byte) 8);
            this.method529(8);
            this.method477(-974);
            this.method460((byte) 8);
            if (super.field20 == 1 || super.field27 == 1) {
                ++this.field1221;
            }
            if (this.field1487 == 2) {
                this.method456(992);
            }
            if (this.field1487 == 2 && this.field1317) {
                this.method551(this.field1432);
            }
            for (int var13 = 0; var13 < 5; ++var13) {
                int var10002 = this.field1285[var13]++;
            }
            this.method508(false);
            ++super.field19;
            if (super.field19 > 4500) {
                this.field1599 = 250;
                super.field19 -= 500;
                this.field1566.method228((byte) 0, 102);
            }
            ++this.field1568;
            if (this.field1568 > 500) {
                this.field1568 = 0;
                int var14 = (int) (Math.random() * 8.0D);
                if ((var14 & 1) == 1) {
                    this.field1621 += this.field1622;
                }
                if ((var14 & 2) == 2) {
                    this.field1217 += this.field1218;
                }
                if ((var14 & 4) == 4) {
                    this.field1410 += this.field1411;
                }
            }
            if (this.field1621 < -50) {
                this.field1622 = 2;
            }
            if (this.field1621 > 50) {
                this.field1622 = -2;
            }
            if (this.field1217 < -55) {
                this.field1218 = 2;
            }
            if (this.field1217 > 55) {
                this.field1218 = -2;
            }
            if (this.field1410 < -40) {
                this.field1411 = 1;
            }
            if (this.field1410 > 40) {
                this.field1411 = -1;
            }
            ++this.field1545;
            if (this.field1545 > 500) {
                this.field1545 = 0;
                int var15 = (int) (Math.random() * 8.0D);
                if ((var15 & 1) == 1) {
                    this.field1574 += this.field1575;
                }
                if ((var15 & 2) == 2) {
                    this.field1483 += this.field1484;
                }
            }
            if (this.field1574 < -60) {
                this.field1575 = 2;
            }
            if (this.field1574 > 60) {
                this.field1575 = -2;
            }
            if (this.field1483 < -20) {
                this.field1484 = 1;
            }
            if (this.field1483 > 10) {
                this.field1484 = -1;
            }
            ++field1437;
            if (field1437 > 110) {
                field1437 = 0;
                this.field1566.method228((byte) 0, 94);
                this.field1566.method233(0);
            }
            ++this.field1598;
            if (this.field1598 > 50) {
                this.field1566.method228((byte) 0, 206);
            }
            try {
                if (this.field1496 != null && this.field1566.field710 > 0) {
                    this.field1496.method42(0, 7, this.field1566.field709, this.field1566.field710);
                    this.field1566.field710 = 0;
                    this.field1598 = 0;
                }
            } catch (IOException var17) {
                this.method498(false);
            } catch (Exception var18) {
                this.method553(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)Ljava/lang/String;")
    public final String method483(byte arg0) {
        if (arg0 != -76) {
            this.method6();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method484(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field1343[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            if (arg3 == 6) {
                boolean var10 = false;
            } else {
                for (int var11 = 1; var11 > 0; ++var11) {
                }
            }
            int var12 = (128 - var8) * this.field1337[var7][var5][var6] + this.field1337[var7][var5 + 1][var6] * var8 >> 7;
            int var13 = (128 - var8) * this.field1337[var7][var5][var6 + 1] + this.field1337[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var12 + var9 * var13 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method485(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1225; ++var4) {
                if (this.field1306[var4] == arg1) {
                    --this.field1225;
                    this.field1517 = true;
                    for (int var5 = var4; var5 < this.field1225; ++var5) {
                        this.field1306[var5] = this.field1306[var5 + 1];
                    }
                    this.field1566.method228((byte) 0, 4);
                    this.field1566.method235(arg1, this.field1305);
                    break;
                }
            }
            this.field1595 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method486(int arg0) {
        if (arg0 < 0) {
            World3D.field295 = false;
            Pix3D.field643 = false;
            field1231 = false;
            World.field42 = false;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method487(int arg0, int arg1, int arg2) {
        if (arg2 != -34316) {
            field1413 = -188;
        }
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "@red@";
        } else if (var3 < -6) {
            return "@or3@";
        } else if (var3 < -3) {
            return "@or2@";
        } else if (var3 < 0) {
            return "@or1@";
        } else if (var3 > 9) {
            return "@gre@";
        } else if (var3 > 6) {
            return "@gr3@";
        } else if (var3 > 3) {
            return "@gr2@";
        } else {
            return var3 > 0 ? "@gr1@" : "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)V")
    public final void method488(boolean arg0, Component arg1) {
        if (arg0) {
            this.field1342 = null;
        }
        int var3 = arg1.field76;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
                if (var3 == 203) {
                    arg1.field86 = this.field1371 * 15 + 20;
                    if (arg1.field86 <= arg1.field78) {
                        arg1.field86 = arg1.field78 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 >= this.field1225) {
                        arg1.field108 = "";
                        arg1.field75 = 0;
                    } else {
                        arg1.field108 = JString.method314(JString.method311((byte) 4, this.field1306[var3]), (byte) 9);
                        arg1.field75 = 1;
                    }
                } else if (var3 == 503) {
                    arg1.field86 = this.field1225 * 15 + 20;
                    if (arg1.field86 <= arg1.field78) {
                        arg1.field86 = arg1.field78 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field123 = 150;
                    arg1.field124 = (int) (Math.sin((double) field1633 / 40.0D) * 256.0D) & 2047;
                    if (this.field1315) {
                        for (int var4 = 0; var4 < 7; ++var4) {
                            int var11 = this.field1213[var4];
                            if (var11 >= 0 && !IdkType.field1087[var11].method379(-417)) {
                                return;
                            }
                        }
                        this.field1315 = false;
                        Model[] var5 = new Model[7];
                        int var6 = 0;
                        for (int var7 = 0; var7 < 7; ++var7) {
                            int var10 = this.field1213[var7];
                            if (var10 >= 0) {
                                var5[var6++] = IdkType.field1087[var10].method380((byte) 5);
                            }
                        }
                        Model var8 = new Model((byte) 1, var6, var5);
                        for (int var9 = 0; var9 < 5; ++var9) {
                            if (this.field1556[var9] != 0) {
                                var8.method153(field1429[var9][0], field1429[var9][this.field1556[var9]]);
                                if (var9 == 1) {
                                    var8.method153(field1551[0], field1551[this.field1556[var9]]);
                                }
                            }
                        }
                        var8.method146(true);
                        var8.method147(SeqType.field1110[field1239.field414].field1112[0], false);
                        var8.method156(64, 850, -30, -50, -30, true);
                        arg1.field116 = 5;
                        arg1.field117 = 0;
                        Component.method36(0, 5, -403, var8);
                    }
                } else if (var3 == 324) {
                    if (this.field1318 == null) {
                        this.field1318 = arg1.field114;
                        this.field1319 = arg1.field115;
                    }
                    if (this.field1312) {
                        arg1.field114 = this.field1319;
                    } else {
                        arg1.field114 = this.field1318;
                    }
                } else if (var3 == 325) {
                    if (this.field1318 == null) {
                        this.field1318 = arg1.field114;
                        this.field1319 = arg1.field115;
                    }
                    if (this.field1312) {
                        arg1.field114 = this.field1318;
                    } else {
                        arg1.field114 = this.field1319;
                    }
                } else if (var3 == 600) {
                    arg1.field108 = this.field1313;
                    if (field1633 % 20 < 10) {
                        arg1.field108 = arg1.field108 + "|";
                    } else {
                        arg1.field108 = arg1.field108 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field1395 >= 1) {
                            if (this.field1449) {
                                arg1.field110 = 16711680;
                                arg1.field108 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field110 = 16777215;
                                arg1.field108 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field108 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field1557 != 0) {
                            String var12;
                            if (this.field1613 == 0) {
                                var12 = "earlier today";
                            } else if (this.field1613 == 1) {
                                var12 = "yesterday";
                            } else {
                                var12 = this.field1613 + " days ago";
                            }
                            arg1.field108 = "You last logged in " + var12 + " from: " + signlink.dns;
                        } else {
                            arg1.field108 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field1327 == 0) {
                            arg1.field108 = "0 unread messages";
                            arg1.field110 = 16776960;
                        }
                        if (this.field1327 == 1) {
                            arg1.field108 = "1 unread message";
                            arg1.field110 = 65280;
                        }
                        if (this.field1327 > 1) {
                            arg1.field108 = this.field1327 + " unread messages";
                            arg1.field110 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field1182 == 201) {
                            if (this.field1214 == 1) {
                                arg1.field108 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg1.field108 = "";
                            }
                        } else if (this.field1182 == 200) {
                            arg1.field108 = "You have not yet set any password recovery questions.";
                        } else {
                            String var13;
                            if (this.field1182 == 0) {
                                var13 = "Earlier today";
                            } else if (this.field1182 == 1) {
                                var13 = "Yesterday";
                            } else {
                                var13 = this.field1182 + " days ago";
                            }
                            arg1.field108 = var13 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field1182 == 201) {
                            if (this.field1214 == 1) {
                                arg1.field108 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg1.field108 = "";
                            }
                        } else if (this.field1182 == 200) {
                            arg1.field108 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg1.field108 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field1182 == 201) {
                            if (this.field1214 == 1) {
                                arg1.field108 = "@whi@this world but member benefits are unavailabe whilst here.";
                            } else {
                                arg1.field108 = "";
                            }
                        } else if (this.field1182 == 200) {
                            arg1.field108 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg1.field108 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else {
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= this.field1371) {
                    arg1.field108 = "";
                    arg1.field75 = 0;
                } else {
                    if (this.field1558[var3] == 0) {
                        arg1.field108 = "@red@Offline";
                    } else if (this.field1558[var3] == field1228) {
                        arg1.field108 = "@gre@World-" + (this.field1558[var3] - 9);
                    } else {
                        arg1.field108 = "@yel@World-" + (this.field1558[var3] - 9);
                    }
                    arg1.field75 = 1;
                }
            }
        } else {
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= this.field1371) {
                arg1.field108 = "";
                arg1.field75 = 0;
            } else {
                arg1.field108 = this.field1294[var3];
                arg1.field75 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIILbb;)V")
    public final void method489(byte arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg0 != 10) {
            this.field1566.method229(62);
        }
        if (field1239 != arg4) {
            if (this.field1492 < 400) {
                String var6 = arg4.field467 + method487(arg4.field473, field1239.field473, -34316) + " (level-" + arg4.field473 + ")";
                if (this.field1277 == 1) {
                    this.field1210[this.field1492] = "Use " + this.field1281 + " with @whi@" + var6;
                    this.field1332[this.field1492] = 367;
                    this.field1333[this.field1492] = arg1;
                    this.field1330[this.field1492] = arg2;
                    this.field1331[this.field1492] = arg3;
                    ++this.field1492;
                } else if (this.field1547 == 1) {
                    if ((this.field1549 & 8) == 8) {
                        this.field1210[this.field1492] = this.field1550 + " @whi@" + var6;
                        this.field1332[this.field1492] = 651;
                        this.field1333[this.field1492] = arg1;
                        this.field1330[this.field1492] = arg2;
                        this.field1331[this.field1492] = arg3;
                        ++this.field1492;
                    }
                } else {
                    this.field1210[this.field1492] = "Follow @whi@" + var6;
                    this.field1332[this.field1492] = 1544;
                    this.field1333[this.field1492] = arg1;
                    this.field1330[this.field1492] = arg2;
                    this.field1331[this.field1492] = arg3;
                    ++this.field1492;
                    if (this.field1536 == 0) {
                        this.field1210[this.field1492] = "Trade with @whi@" + var6;
                        this.field1332[this.field1492] = 1373;
                        this.field1333[this.field1492] = arg1;
                        this.field1330[this.field1492] = arg2;
                        this.field1331[this.field1492] = arg3;
                        ++this.field1492;
                    }
                    if (this.field1250 > 0) {
                        this.field1210[this.field1492] = "Attack @whi@" + var6;
                        if (field1239.field473 >= arg4.field473) {
                            this.field1332[this.field1492] = 151;
                        } else {
                            this.field1332[this.field1492] = 2151;
                        }
                        this.field1333[this.field1492] = arg1;
                        this.field1330[this.field1492] = arg2;
                        this.field1331[this.field1492] = arg3;
                        ++this.field1492;
                    }
                    if (this.field1288 == 1) {
                        this.field1210[this.field1492] = "Fight @whi@" + var6;
                        this.field1332[this.field1492] = 151;
                        this.field1333[this.field1492] = arg1;
                        this.field1330[this.field1492] = arg2;
                        this.field1331[this.field1492] = arg3;
                        ++this.field1492;
                    }
                    if (this.field1288 == 2) {
                        this.field1210[this.field1492] = "Duel-with @whi@" + var6;
                        this.field1332[this.field1492] = 1101;
                        this.field1333[this.field1492] = arg1;
                        this.field1330[this.field1492] = arg2;
                        this.field1331[this.field1492] = arg3;
                        ++this.field1492;
                    }
                }
                for (int var7 = 0; var7 < this.field1492; ++var7) {
                    if (this.field1332[var7] == 660) {
                        this.field1210[var7] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method490(byte arg0) {
        byte[] var2 = this.field1564.method309("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1202.method268(3);
        var3.method197(0, 0, false);
        this.field1203.method268(3);
        var3.method197(-637, 0, false);
        this.field1199.method268(3);
        var3.method197(-128, 0, false);
        this.field1200.method268(3);
        var3.method197(-202, -371, false);
        this.field1201.method268(3);
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        var3.method197(-202, -171, false);
        this.field1204.method268(3);
        var3.method197(0, -265, false);
        this.field1205.method268(3);
        var3.method197(-562, -265, false);
        this.field1206.method268(3);
        var3.method197(-128, -171, false);
        this.field1207.method268(3);
        var3.method197(-562, -171, false);
        int[] var6 = new int[var3.field673];
        for (int var7 = 0; var7 < var3.field674; ++var7) {
            for (int var12 = 0; var12 < var3.field673; ++var12) {
                var6[var12] = var3.field672[var3.field673 * var7 + (var3.field673 - var12 - 1)];
            }
            for (int var13 = 0; var13 < var3.field673; ++var13) {
                var3.field672[var3.field673 * var7 + var13] = var6[var13];
            }
        }
        this.field1202.method268(3);
        var3.method197(382, 0, false);
        this.field1203.method268(3);
        var3.method197(-255, 0, false);
        this.field1199.method268(3);
        var3.method197(254, 0, false);
        this.field1200.method268(3);
        var3.method197(180, -371, false);
        this.field1201.method268(3);
        var3.method197(180, -171, false);
        this.field1204.method268(3);
        var3.method197(382, -265, false);
        this.field1205.method268(3);
        var3.method197(-180, -265, false);
        this.field1206.method268(3);
        var3.method197(254, -171, false);
        this.field1207.method268(3);
        var3.method197(-180, -171, false);
        Pix32 var8 = new Pix32(this.field1564, "logo", 0);
        this.field1199.method268(3);
        var8.method199(0, 18, 382 - var8.field673 / 2 - 128);
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method491(int arg0, int arg1) {
        if (arg1 != -5001) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method492(boolean arg0) {
        if (arg0) {
            field1413 = -388;
        }
        while (true) {
            OnDemandRequest var2 = this.field1273.method291();
            if (var2 == null) {
                return;
            }
            if (var2.field723 == 0) {
                Model.method137(var2.field724, this.field1227, var2.field725);
                if ((this.field1273.method287(4, var2.field724) & 98) != 0) {
                    this.field1517 = true;
                    if (this.field1573 != -1) {
                        this.field1282 = true;
                    }
                }
            }
            if (var2.field723 == 1 && var2.field725 != null) {
                AnimFrame.method59(-25, var2.field725);
            }
            if (var2.field723 == 2 && this.field1607 == var2.field724 && var2.field725 != null) {
                this.method466(this.field1608, false, var2.field725);
            }
            if (var2.field723 == 3 && this.field1487 == 1) {
                for (int var3 = 0; var3 < this.field1310.length; ++var3) {
                    if (this.field1348[var3] == var2.field724) {
                        this.field1310[var3] = var2.field725;
                        if (var2.field725 == null) {
                            this.field1348[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1349[var3] == var2.field724) {
                        this.field1293[var3] = var2.field725;
                        if (var2.field725 == null) {
                            this.field1349[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field723 == 93 && this.field1273.method286(var2.field724, -47341)) {
                World.method17(new Packet(var2.field725, 337), this.field1273, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method493(int arg0) {
        if (this.field1199 == null) {
            super.field14 = null;
            this.field1617 = null;
            this.field1615 = null;
            this.field1614 = null;
            this.field1616 = null;
            this.field1475 = null;
            this.field1476 = null;
            this.field1477 = null;
            this.field1202 = new PixMap((byte) -82, 265, this.method11(437), 128);
            Pix2D.method168(274);
            this.field1203 = new PixMap((byte) -82, 265, this.method11(437), 128);
            Pix2D.method168(274);
            this.field1199 = new PixMap((byte) -82, 171, this.method11(437), 509);
            Pix2D.method168(274);
            this.field1200 = new PixMap((byte) -82, 132, this.method11(437), 360);
            Pix2D.method168(274);
            this.field1201 = new PixMap((byte) -82, 200, this.method11(437), 360);
            Pix2D.method168(274);
            this.field1204 = new PixMap((byte) -82, 238, this.method11(437), 202);
            Pix2D.method168(274);
            if (this.field1354 != arg0) {
                this.field1596 = this.field1563.method239();
            }
            this.field1205 = new PixMap((byte) -82, 238, this.method11(437), 203);
            Pix2D.method168(274);
            this.field1206 = new PixMap((byte) -82, 94, this.method11(437), 74);
            Pix2D.method168(274);
            this.field1207 = new PixMap((byte) -82, 94, this.method11(437), 75);
            Pix2D.method168(274);
            if (this.field1564 != null) {
                this.method490((byte) 7);
                this.method547(field1618);
            }
            this.field1546 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZII)V")
    public final void method494(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg1;
        if (arg2 == 4) {
            if (arg0) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            field1359 = 412;
        }
        this.field1546 = true;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method495(int arg0, int arg1) {
        LinkList var3 = this.field1342[this.field1224][arg0][arg1];
        if (var3 == null) {
            this.field1420.method85(this.field1224, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method258(); var6 != null; var6 = (ObjStackEntity) var3.method260(true)) {
                ObjType var11 = ObjType.method350(var6.field502);
                int var12 = var11.field1031;
                if (var11.field1030) {
                    var12 = (var6.field503 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method256(var5, 6);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method258(); var9 != null; var9 = (ObjStackEntity) var3.method260(true)) {
                if (var5.field502 != var9.field502 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field502 != var9.field502 && var7.field502 != var9.field502 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1420.method71(arg1, arg0, var8, -353, var7, this.field1224, var10, var5, this.method484(arg1 * 128 + 64, this.field1224, arg0 * 128 + 64, (byte) 6));
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method496(int arg0, boolean arg1) {
        if (arg0 != -5080) {
            this.field1596 = this.field1563.method239();
        }
        for (int var3 = 0; var3 < this.field1538; ++var3) {
            NpcEntity var4 = this.field1537[this.field1539[var3]];
            int var5 = (this.field1539[var3] << 14) + 536870912;
            if (var4 != null && var4.method127(false) && var4.field464.field1004 == arg1) {
                int var6 = var4.field409 >> 7;
                int var7 = var4.field410 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field413 == 1 && (var4.field409 & 127) == 64 && (var4.field410 & 127) == 64) {
                        if (this.field1284[var6][var7] == this.field1329) {
                            continue;
                        }
                        this.field1284[var6][var7] = this.field1329;
                    }
                    this.field1420.method75(var4, this.method484(var4.field410, this.field1224, var4.field409, (byte) 6), var4.field411, var5, var4.field412, this.field1224, var4.field410, (var4.field413 - 1) * 64 + 60, this.field1267, var4.field409);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method497(byte arg0) {
        if (this.field1617 == null) {
            this.method545(366);
            super.field14 = null;
            this.field1199 = null;
            this.field1200 = null;
            this.field1201 = null;
            this.field1202 = null;
            this.field1203 = null;
            this.field1204 = null;
            this.field1205 = null;
            this.field1206 = null;
            this.field1207 = null;
            this.field1617 = new PixMap((byte) -82, 96, this.method11(437), 479);
            this.field1615 = new PixMap((byte) -82, 156, this.method11(437), 172);
            Pix2D.method168(274);
            if (arg0 != 118) {
                this.field1566.method229(241);
            }
            this.field1424.method212(0, 0, 0);
            this.field1614 = new PixMap((byte) -82, 261, this.method11(437), 190);
            this.field1616 = new PixMap((byte) -82, 334, this.method11(437), 512);
            Pix2D.method168(274);
            this.field1475 = new PixMap((byte) -82, 50, this.method11(437), 496);
            this.field1476 = new PixMap((byte) -82, 37, this.method11(437), 269);
            this.field1477 = new PixMap((byte) -82, 45, this.method11(437), 249);
            this.field1546 = true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method498(boolean arg0) {
        if (this.field1599 > 0) {
            this.method553(0);
        } else {
            this.field1616.method268(3);
            this.field1361.method214("Connection lost", 0, 144, 257, -28519);
            this.field1361.method214("Connection lost", 16777215, 143, 256, -28519);
            this.field1361.method214("Please wait - attempting to reestablish", 0, 159, 257, -28519);
            this.field1361.method214("Please wait - attempting to reestablish", 16777215, 158, 256, -28519);
            if (arg0) {
                this.field1596 = this.field1563.method239();
            }
            this.field1616.method269((byte) 7, 4, super.field13, 4);
            this.field1307 = 0;
            ClientStream var2 = this.field1496;
            this.field1220 = false;
            this.method440(this.field1631, this.field1632, true);
            if (!this.field1220) {
                this.method553(0);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIIIIIZ)Z")
    public final boolean method499(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1507[var15][var35] = 0;
                this.field1567[var15][var35] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg10;
        this.field1507[arg6][arg10] = 99;
        this.field1567[arg6][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1208[var18] = arg6;
        int var36 = var18 + 1;
        this.field1209[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field1208.length;
        int[][] var22 = this.field1211[this.field1224].field1069;
        if (arg11) {
            this.field1535 = this.field1415.method305();
        }
        while (var36 != var19) {
            var16 = this.field1208[var19];
            var17 = this.field1209[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field1211[this.field1224].method370(arg3, var16, arg2 - 1, arg7, arg8, var17, (byte) 7)) {
                    var20 = true;
                    break;
                }
                if (arg2 < 10 && this.field1211[this.field1224].method371(arg3, var16, arg8, arg7, arg2 - 1, var17, 326)) {
                    var20 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg9 != 0 && this.field1211[this.field1224].method372(arg8, arg4, arg9, var17, var16, 730, arg1, arg3)) {
                var20 = true;
                break;
            }
            int var34 = this.field1567[var16][var17] + 1;
            if (var16 > 0 && this.field1507[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1208[var36] = var16 - 1;
                this.field1209[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 - 1][var17] = 2;
                this.field1567[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1507[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1208[var36] = var16 + 1;
                this.field1209[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 + 1][var17] = 8;
                this.field1567[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1507[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1208[var36] = var16;
                this.field1209[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16][var17 - 1] = 1;
                this.field1567[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1507[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1208[var36] = var16;
                this.field1209[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16][var17 + 1] = 4;
                this.field1567[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1507[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1208[var36] = var16 - 1;
                this.field1209[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 - 1][var17 - 1] = 3;
                this.field1567[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1507[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1208[var36] = var16 + 1;
                this.field1209[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 + 1][var17 - 1] = 9;
                this.field1567[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1507[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1208[var36] = var16 - 1;
                this.field1209[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 - 1][var17 + 1] = 6;
                this.field1567[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1507[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1208[var36] = var16 + 1;
                this.field1209[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1507[var16 + 1][var17 + 1] = 12;
                this.field1567[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1236 = 0;
        if (!var20) {
            if (arg0) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1567[var25][var26] < var23) {
                                var23 = this.field1567[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1236 = 1;
                                var20 = true;
                            }
                        }
                    }
                    if (var20) {
                        break;
                    }
                }
            }
            if (!var20) {
                return false;
            }
        }
        byte var27 = 0;
        this.field1208[var27] = var16;
        int var37 = var27 + 1;
        this.field1209[var27] = var17;
        int var28;
        int var29 = var28 = this.field1507[var16][var17];
        while (arg6 != var16 || arg10 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1208[var37] = var16;
                this.field1209[var37++] = var17;
            }
            if ((var29 & 2) != 0) {
                ++var16;
            } else if ((var29 & 8) != 0) {
                --var16;
            }
            if ((var29 & 1) != 0) {
                ++var17;
            } else if ((var29 & 4) != 0) {
                --var17;
            }
            var29 = this.field1507[var16][var17];
        }
        if (var37 <= 0) {
            if (arg5 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var30 = var37;
            if (var37 > 25) {
                var30 = 25;
            }
            --var37;
            int var31 = this.field1208[var37];
            int var32 = this.field1209[var37];
            if (arg5 == 0) {
                this.field1566.method228((byte) 0, 182);
                this.field1566.method229(var30 + var30 + 3);
            }
            if (arg5 == 1) {
                this.field1566.method228((byte) 0, 198);
                this.field1566.method229(var30 + var30 + 3 + 14);
            }
            if (arg5 == 2) {
                this.field1566.method228((byte) 0, 216);
                this.field1566.method229(var30 + var30 + 3);
            }
            if (super.field31[5] == 1) {
                this.field1566.method229(1);
            } else {
                this.field1566.method229(0);
            }
            this.field1566.method230(this.field1366 + var31);
            this.field1566.method230(this.field1367 + var32);
            this.field1307 = this.field1208[0];
            this.field1308 = this.field1209[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1566.method229(this.field1208[var37] - var31);
                this.field1566.method229(this.field1209[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method500(byte arg0) {
        if (this.field1392 == 0) {
            int var2 = super.field27;
            if (this.field1275 != arg0) {
                this.field1488 = !this.field1488;
            }
            if (this.field1547 == 1 && super.field28 >= 516 && super.field29 >= 160 && super.field28 <= 765 && super.field29 <= 205) {
                var2 = 0;
            }
            if (this.field1364) {
                if (var2 != 1) {
                    int var3 = super.field21;
                    int var4 = super.field22;
                    if (this.field1497 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1497 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1497 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1498 - 10 || var3 > this.field1500 + this.field1498 + 10 || var4 < this.field1499 - 10 || var4 > this.field1501 + this.field1499 + 10) {
                        this.field1364 = false;
                        if (this.field1497 == 1) {
                            this.field1517 = true;
                        }
                        if (this.field1497 == 2) {
                            this.field1282 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1498;
                    int var6 = this.field1499;
                    int var7 = this.field1500;
                    int var8 = super.field28;
                    int var9 = super.field29;
                    if (this.field1497 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1497 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1497 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1492; ++var11) {
                        int var12 = (this.field1492 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method548(0, var10);
                    }
                    this.field1364 = false;
                    if (this.field1497 == 1) {
                        this.field1517 = true;
                    }
                    if (this.field1497 == 2) {
                        this.field1282 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1492 > 0) {
                    int var13 = this.field1332[this.field1492 - 1];
                    if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188 || var13 == 1773) {
                        int var14 = this.field1330[this.field1492 - 1];
                        int var15 = this.field1331[this.field1492 - 1];
                        Component var16 = Component.field67[var15];
                        if (var16.field94 || var16.field97) {
                            this.field1416 = false;
                            this.field1453 = 0;
                            this.field1390 = var15;
                            this.field1391 = var14;
                            this.field1392 = 2;
                            this.field1393 = super.field28;
                            this.field1394 = super.field29;
                            if (Component.field67[var15].field73 == this.field1262) {
                                this.field1392 = 1;
                            }
                            if (Component.field67[var15].field73 == this.field1573) {
                                this.field1392 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1600 == 1 || this.method454(0, this.field1492 - 1)) && this.field1492 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1492 > 0) {
                    this.method548(0, this.field1492 - 1);
                }
                if (var2 != 2 || this.field1492 <= 0) {
                    return;
                }
                this.method534(1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JB)V")
    public final void method501(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1371 >= 100 && this.field1543 != 1) {
                this.method544(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field1371 >= 200) {
                this.method544(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = JString.method314(JString.method311((byte) 4, arg0), (byte) 9);
                for (int var5 = 0; var5 < this.field1371; ++var5) {
                    if (this.field1326[var5] == arg0) {
                        this.method544(0, "", var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1225; ++var6) {
                    if (this.field1306[var6] == arg0) {
                        this.method544(0, "", "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (!var4.equals(field1239.field467)) {
                    this.field1294[this.field1371] = var4;
                    this.field1326[this.field1371] = arg0;
                    this.field1558[this.field1371] = 0;
                    ++this.field1371;
                    this.field1517 = true;
                    this.field1566.method228((byte) 0, 116);
                    this.field1566.method235(arg0, this.field1305);
                    if (arg1 == 5) {
                        boolean var7 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLd;)Z")
    public final boolean method502(boolean arg0, Component arg1) {
        if (!arg0) {
            this.field1596 = -1;
        }
        int var3 = arg1.field76;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1210[this.field1492] = "Remove @whi@" + arg1.field108;
                this.field1332[this.field1492] = 556;
                ++this.field1492;
                return true;
            } else {
                return false;
            }
        } else {
            if (var3 >= 801) {
                var3 -= 701;
            } else if (var3 >= 701) {
                var3 -= 601;
            } else if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1210[this.field1492] = "Remove @whi@" + this.field1294[var3];
            this.field1332[this.field1492] = 557;
            ++this.field1492;
            this.field1210[this.field1492] = "Message @whi@" + this.field1294[var3];
            this.field1332[this.field1492] = 679;
            ++this.field1492;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;III)V")
    public final void method503(boolean arg0, Component arg1, int arg2, int arg3, int arg4) {
        if (arg1.field74 == 0 && arg1.field89 != null) {
            if (!arg1.field88 || this.field1212 == arg1.field72 || this.field1223 == arg1.field72 || this.field1387 == arg1.field72) {
                int var6 = Pix2D.field634;
                int var7 = Pix2D.field632;
                int var8 = Pix2D.field635;
                int var9 = Pix2D.field633;
                this.field1220 &= arg0;
                Pix2D.method167(arg3, arg1.field77 + arg3, arg1.field78 + arg4, arg4, this.field1489);
                int var10 = arg1.field89.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field90[var11] + arg3;
                    int var13 = arg1.field91[var11] + arg4 - arg2;
                    Component var14 = Component.field67[arg1.field89[var11]];
                    int var15 = var14.field80 + var12;
                    int var16 = var14.field81 + var13;
                    if (var14.field76 > 0) {
                        this.method488(false, var14);
                    }
                    if (var14.field74 == 0) {
                        if (var14.field87 > var14.field86 - var14.field78) {
                            var14.field87 = var14.field86 - var14.field78;
                        }
                        if (var14.field87 < 0) {
                            var14.field87 = 0;
                        }
                        this.method503(true, var14, var14.field87, var15, var16);
                        if (var14.field86 > var14.field78) {
                            this.method449(var14.field87, (byte) 8, var14.field77 + var15, var16, var14.field86, var14.field78);
                        }
                    } else if (var14.field74 != 1) {
                        if (var14.field74 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field78; ++var18) {
                                for (int var19 = 0; var19 < var14.field77; ++var19) {
                                    int var20 = (var14.field98 + 32) * var19 + var15;
                                    int var21 = (var14.field99 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field101[var17];
                                        var21 += var14.field102[var17];
                                    }
                                    if (var14.field68[var17] <= 0) {
                                        if (var14.field100 != null && var17 < 20) {
                                            Pix32 var30 = var14.field100[var17];
                                            if (var30 != null) {
                                                var30.method199(0, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field68[var17] - 1;
                                        if (var20 > Pix2D.field634 - 32 && var20 < Pix2D.field635 && var21 > Pix2D.field632 - 32 && var21 < Pix2D.field633 || this.field1392 != 0 && this.field1391 == var17) {
                                            int var25 = 0;
                                            if (this.field1277 == 1 && this.field1278 == var17 && this.field1279 == var14.field72) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method356(var25, var14.field69[var17], var24, 0);
                                            if (var26 != null) {
                                                if (this.field1392 != 0 && this.field1391 == var17 && this.field1390 == var14.field72) {
                                                    var22 = super.field21 - this.field1393;
                                                    var23 = super.field22 - this.field1394;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1453 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method201(128, var20 + var22, 25372, var21 + var23);
                                                    if (var21 + var23 < Pix2D.field632 && arg1.field87 > 0) {
                                                        int var27 = (Pix2D.field632 - var21 - var23) * this.field1325 / 3;
                                                        if (var27 > this.field1325 * 10) {
                                                            var27 = this.field1325 * 10;
                                                        }
                                                        if (var27 > arg1.field87) {
                                                            var27 = arg1.field87;
                                                        }
                                                        arg1.field87 -= var27;
                                                        this.field1394 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field633 && arg1.field87 < arg1.field86 - arg1.field78) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field633) * this.field1325 / 3;
                                                        if (var28 > this.field1325 * 10) {
                                                            var28 = this.field1325 * 10;
                                                        }
                                                        if (var28 > arg1.field86 - arg1.field78 - arg1.field87) {
                                                            var28 = arg1.field86 - arg1.field78 - arg1.field87;
                                                        }
                                                        arg1.field87 += var28;
                                                        this.field1394 -= var28;
                                                    }
                                                } else if (this.field1254 != 0 && this.field1253 == var17 && this.field1252 == var14.field72) {
                                                    var26.method201(128, var20, 25372, var21);
                                                } else {
                                                    var26.method199(0, var21, var20);
                                                }
                                                if (var26.field677 == 33 || var14.field69[var17] != 1) {
                                                    int var29 = var14.field69[var17];
                                                    this.field1360.method217(var21 + 10 + var23, var20 + 1 + var22, method491(var29, -5001), 0, (byte) 3);
                                                    this.field1360.method217(var21 + 9 + var23, var20 + var22, method491(var29, -5001), 16776960, (byte) 3);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field74 == 3) {
                            boolean var31 = false;
                            if (this.field1387 == var14.field72 || this.field1223 == var14.field72 || this.field1212 == var14.field72) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method447(var14, 295)) {
                                var32 = var14.field111;
                                if (var31 && var14.field113 != 0) {
                                    var32 = var14.field113;
                                }
                            } else {
                                var32 = var14.field110;
                                if (var31 && var14.field112 != 0) {
                                    var32 = var14.field112;
                                }
                            }
                            if (var14.field79 == 0) {
                                if (var14.field104) {
                                    Pix2D.method170(var14.field77, 5, var15, var16, var14.field78, var32);
                                } else {
                                    Pix2D.method171(field1413, var14.field78, var16, var14.field77, var32, var15);
                                }
                            } else if (var14.field104) {
                                Pix2D.method169(var15, var14.field78, var16, (byte) 4, 256 - (var14.field79 & 255), var14.field77, var32);
                            } else {
                                Pix2D.method172(var14.field77, var32, -84, var14.field78, var16, var15, 256 - (var14.field79 & 255));
                            }
                        } else if (var14.field74 == 4) {
                            PixFont var33 = var14.field107;
                            String var34 = var14.field108;
                            boolean var35 = false;
                            if (this.field1387 == var14.field72 || this.field1223 == var14.field72 || this.field1212 == var14.field72) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method447(var14, 295)) {
                                var36 = var14.field111;
                                if (var35 && var14.field113 != 0) {
                                    var36 = var14.field113;
                                }
                                if (var14.field109.length() > 0) {
                                    var34 = var14.field109;
                                }
                            } else {
                                var36 = var14.field110;
                                if (var35 && var14.field112 != 0) {
                                    var36 = var14.field112;
                                }
                            }
                            if (var14.field75 == 6 && this.field1459) {
                                var34 = "Please wait...";
                                var36 = var14.field110;
                            }
                            if (Pix2D.field630 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field697 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label346: while (true) {
                                        int var38 = var34.indexOf("%1");
                                        if (var38 == -1) {
                                            while (true) {
                                                int var39 = var34.indexOf("%2");
                                                if (var39 == -1) {
                                                    while (true) {
                                                        int var40 = var34.indexOf("%3");
                                                        if (var40 == -1) {
                                                            while (true) {
                                                                int var41 = var34.indexOf("%4");
                                                                if (var41 == -1) {
                                                                    while (true) {
                                                                        int var42 = var34.indexOf("%5");
                                                                        if (var42 == -1) {
                                                                            break label346;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method437(this.method478(this.field1222, var14, 4), 292) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method437(this.method478(this.field1222, var14, 3), 292) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method437(this.method478(this.field1222, var14, 2), 292) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method437(this.method478(this.field1222, var14, 1), 292) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method437(this.method478(this.field1222, var14, 0), 292) + var34.substring(var38 + 2);
                                    }
                                }
                                int var43 = var34.indexOf("\\n");
                                String var44;
                                if (var43 != -1) {
                                    var44 = var34.substring(0, var43);
                                    var34 = var34.substring(var43 + 2);
                                } else {
                                    var44 = var34;
                                    var34 = "";
                                }
                                if (var14.field105) {
                                    var33.method215(var37, (byte) 6, var14.field77 / 2 + var15, var14.field106, var44, var36);
                                } else {
                                    var33.method219(var44, var37, var15, var14.field106, -44475, var36);
                                }
                                var37 += var33.field697;
                            }
                        } else if (var14.field74 == 5) {
                            Pix32 var45;
                            if (this.method447(var14, 295)) {
                                var45 = var14.field115;
                            } else {
                                var45 = var14.field114;
                            }
                            if (var45 != null) {
                                var45.method199(0, var16, var15);
                            }
                        } else if (var14.field74 == 6) {
                            int var46 = Pix3D.field648;
                            int var47 = Pix3D.field649;
                            Pix3D.field648 = var14.field77 / 2 + var15;
                            Pix3D.field649 = var14.field78 / 2 + var16;
                            int var48 = Pix3D.field652[var14.field123] * var14.field122 >> 16;
                            int var49 = Pix3D.field653[var14.field123] * var14.field122 >> 16;
                            boolean var50 = this.method447(var14, 295);
                            int var51;
                            if (var50) {
                                var51 = var14.field121;
                            } else {
                                var51 = var14.field120;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, -1, -824, var50);
                            } else {
                                SeqType var53 = SeqType.field1110[var51];
                                var52 = var14.method34(var53.field1113[var14.field70], var53.field1112[var14.field70], -824, var50);
                            }
                            if (var52 != null) {
                                var52.method159(0, var14.field124, 0, var14.field123, 0, var48, var49);
                            }
                            Pix3D.field648 = var46;
                            Pix3D.field649 = var47;
                        } else if (var14.field74 == 7) {
                            PixFont var54 = var14.field107;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field78; ++var56) {
                                for (int var57 = 0; var57 < var14.field77; ++var57) {
                                    if (var14.field68[var55] > 0) {
                                        ObjType var58 = ObjType.method350(var14.field68[var55] - 1);
                                        String var59 = var58.field1019;
                                        if (var58.field1030 || var14.field69[var55] != 1) {
                                            var59 = var59 + " x" + method516(false, var14.field69[var55]);
                                        }
                                        int var60 = (var14.field98 + 115) * var57 + var15;
                                        int var61 = (var14.field99 + 12) * var56 + var16;
                                        if (var14.field105) {
                                            var54.method215(var61, (byte) 6, var14.field77 / 2 + var60, var14.field106, var59, var14.field110);
                                        } else {
                                            var54.method219(var59, var61, var60, var14.field106, -44475, var14.field110);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method167(var6, var8, var9, var7, this.field1489);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method504(int arg0) {
        this.field1615.method268(3);
        int var2 = this.field1574 + this.field1560 & 2047;
        int var3 = field1239.field409 / 32 + 48;
        int var4 = 464 - field1239.field410 / 32;
        this.field1309.method203(5, this.field1283, var3, 151, 859, 146, var4, 25, this.field1513, var2, this.field1483 + 256);
        if (arg0 >= 0) {
            this.field1358 = this.field1415.method305();
        }
        this.field1460.method203(0, this.field1245, 25, 33, 859, 33, 25, 0, this.field1344, this.field1560, 256);
        for (int var5 = 0; var5 < this.field1434; ++var5) {
            int var33 = this.field1435[var5] * 4 + 2 - field1239.field409 / 32;
            int var34 = this.field1436[var5] * 4 + 2 - field1239.field410 / 32;
            this.method540(this.field1541[var5], 4, var34, var33);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var29 = 0; var29 < 104; ++var29) {
                LinkList var30 = this.field1342[this.field1224][var6][var29];
                if (var30 != null) {
                    int var31 = var6 * 4 + 2 - field1239.field409 / 32;
                    int var32 = var29 * 4 + 2 - field1239.field410 / 32;
                    this.method540(this.field1577, 4, var32, var31);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1538; ++var7) {
            NpcEntity var26 = this.field1537[this.field1539[var7]];
            if (var26 != null && var26.method127(false) && var26.field464.field1000) {
                int var27 = var26.field409 / 32 - field1239.field409 / 32;
                int var28 = var26.field410 / 32 - field1239.field410 / 32;
                this.method540(this.field1578, 4, var28, var27);
            }
        }
        for (int var8 = 0; var8 < this.field1588; ++var8) {
            PlayerEntity var19 = this.field1587[this.field1589[var8]];
            if (var19 != null && var19.method127(false)) {
                int var20 = var19.field409 / 32 - field1239.field409 / 32;
                int var21 = var19.field410 / 32 - field1239.field410 / 32;
                boolean var22 = false;
                long var23 = JString.method310(var19.field467);
                for (int var25 = 0; var25 < this.field1371; ++var25) {
                    if (this.field1326[var25] == var23 && this.field1558[var25] != 0) {
                        var22 = true;
                        break;
                    }
                }
                if (var22) {
                    this.method540(this.field1580, 4, var21, var20);
                } else {
                    this.method540(this.field1579, 4, var21, var20);
                }
            }
        }
        if (this.field1569 != 0 && field1633 % 20 < 10) {
            if (this.field1569 == 1 && this.field1186 >= 0 && this.field1186 < this.field1537.length) {
                NpcEntity var9 = this.field1537[this.field1186];
                if (var9 != null) {
                    int var10 = var9.field409 / 32 - field1239.field409 / 32;
                    int var11 = var9.field410 / 32 - field1239.field410 / 32;
                    this.method452(this.field1244, var10, var11, 0);
                }
            }
            if (this.field1569 == 2) {
                int var12 = (this.field1528 - this.field1366) * 4 + 2 - field1239.field409 / 32;
                int var13 = (this.field1529 - this.field1367) * 4 + 2 - field1239.field410 / 32;
                this.method452(this.field1244, var12, var13, 0);
            }
            if (this.field1569 == 10 && this.field1601 >= 0 && this.field1601 < this.field1587.length) {
                PlayerEntity var14 = this.field1587[this.field1601];
                if (var14 != null) {
                    int var15 = var14.field409 / 32 - field1239.field409 / 32;
                    int var16 = var14.field410 / 32 - field1239.field410 / 32;
                    this.method452(this.field1244, var15, var16, 0);
                }
            }
        }
        if (this.field1307 != 0) {
            int var17 = this.field1307 * 4 + 2 - field1239.field409 / 32;
            int var18 = this.field1308 * 4 + 2 - field1239.field410 / 32;
            this.method540(this.field1243, 4, var18, var17);
        }
        Pix2D.method170(3, 5, 97, 78, 3, 16777215);
        this.field1616.method268(3);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method505(int arg0, int arg1, Packet arg2) {
        if (arg0 == 0) {
            while (arg2.field711 + 10 < arg1 * 8) {
                int var4 = arg2.method250(11, 0);
                if (var4 == 2047) {
                    break;
                }
                if (this.field1587[var4] == null) {
                    this.field1587[var4] = new PlayerEntity();
                    if (this.field1592[var4] != null) {
                        this.field1587[var4].method130(this.field1592[var4], this.field1485);
                    }
                }
                this.field1589[this.field1588++] = var4;
                PlayerEntity var5 = this.field1587[var4];
                var5.field454 = field1633;
                int var6 = arg2.method250(5, 0);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method250(5, 0);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg2.method250(1, 0);
                var5.method124(field1239.field458[0] + var6, var8 == 1, 0, field1239.field459[0] + var7);
                int var9 = arg2.method250(1, 0);
                if (var9 == 1) {
                    this.field1591[this.field1590++] = var4;
                }
            }
            arg2.method251(30037);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILmb;)V")
    public final void method506(int arg0, int arg1, Packet arg2) {
        if (arg0 != -47250) {
            arg1 = arg2.method239();
        }
        if (arg1 != 119 && arg1 != 198) {
            if (arg1 == 71) {
                int var4 = arg2.method239();
                int var5 = (var4 >> 4 & 7) + this.field1553;
                int var6 = (var4 & 7) + this.field1554;
                int var7 = arg2.method239();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1276[var8];
                int var11 = arg2.method241();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1337[this.field1224][var5][var6];
                    int var13 = this.field1337[this.field1224][var5 + 1][var6];
                    int var14 = this.field1337[this.field1224][var5 + 1][var6 + 1];
                    int var15 = this.field1337[this.field1224][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1420.method86(var6, this.field1224, var5, 16802);
                        if (var16 != null) {
                            int var17 = var16.field280 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field278 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, var9 + 4, var17, 2);
                                var16.field279 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, var9 + 1 & 3, var17, 2);
                            } else {
                                var16.field278 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, var9, var17, var8);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1420.method87((byte) -127, var6, var5, this.field1224);
                        if (var18 != null) {
                            var18.field171 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, 0, var18.field172 >> 14 & 32767, 4);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1420.method88(var6, var5, -813, this.field1224);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field263 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, var9, var19.field271 >> 14 & 32767, var8);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1420.method89(var6, true, var5, this.field1224);
                        if (var20 != null) {
                            var20.field202 = new LocEntity(var12, false, var15, var11, var13, this.field1358, var14, var9, var20.field203 >> 14 & 32767, 22);
                        }
                    }
                }
            } else if (arg1 == 94) {
                int var21 = arg2.method239();
                int var22 = (var21 >> 4 & 7) + this.field1553;
                int var23 = (var21 & 7) + this.field1554;
                int var24 = arg2.method241();
                int var25 = arg2.method241();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field502 = var24;
                    var26.field503 = var25;
                    if (this.field1342[this.field1224][var22][var23] == null) {
                        this.field1342[this.field1224][var22][var23] = new LinkList(-767);
                    }
                    this.field1342[this.field1224][var22][var23].method255(var26);
                    this.method495(var22, var23);
                }
            } else if (arg1 == 13) {
                int var27 = arg2.method239();
                int var28 = (var27 >> 4 & 7) + this.field1553;
                int var29 = (var27 & 7) + this.field1554;
                int var30 = arg2.method241();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1342[this.field1224][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method258(); var32 != null; var32 = (ObjStackEntity) var31.method260(true)) {
                            if ((var30 & 32767) == var32.field502) {
                                var32.method120();
                                break;
                            }
                        }
                        if (var31.method258() == null) {
                            this.field1342[this.field1224][var28][var29] = null;
                        }
                        this.method495(var28, var29);
                    }
                }
            } else if (arg1 == 187) {
                int var33 = arg2.method239();
                int var34 = (var33 >> 4 & 7) + this.field1553;
                int var35 = (var33 & 7) + this.field1554;
                int var36 = var34 + arg2.method240();
                int var37 = var35 + arg2.method240();
                int var38 = arg2.method242();
                int var39 = arg2.method241();
                int var40 = arg2.method239() * 4;
                int var41 = arg2.method239() * 4;
                int var42 = arg2.method241();
                int var43 = arg2.method241();
                int var44 = arg2.method239();
                int var45 = arg2.method239();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(var45, var47, var39, field1633 + var43, field1633 + var42, false, this.method484(var47, this.field1224, var46, (byte) 6) - var40, var46, var41, var44, var38, this.field1224);
                    var50.method133((byte) 7, field1633 + var42, var49, var48, this.method484(var49, this.field1224, var48, (byte) 6) - var41);
                    this.field1594.method255(var50);
                }
            } else if (arg1 == 141) {
                int var51 = arg2.method239();
                int var52 = (var51 >> 4 & 7) + this.field1553;
                int var53 = (var51 & 7) + this.field1554;
                int var54 = arg2.method241();
                int var55 = arg2.method239();
                int var56 = arg2.method241();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(0, var58, var56, var54, var57, field1633, this.method484(var58, this.field1224, var57, (byte) 6) - var55, this.field1224);
                    this.field1512.method255(var59);
                }
            } else if (arg1 == 190) {
                int var60 = arg2.method239();
                int var61 = (var60 >> 4 & 7) + this.field1553;
                int var62 = (var60 & 7) + this.field1554;
                int var63 = arg2.method241();
                int var64 = arg2.method241();
                int var65 = arg2.method241();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1185 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field502 = var63;
                    var66.field503 = var64;
                    if (this.field1342[this.field1224][var61][var62] == null) {
                        this.field1342[this.field1224][var61][var62] = new LinkList(-767);
                    }
                    this.field1342[this.field1224][var61][var62].method255(var66);
                    this.method495(var61, var62);
                }
            } else {
                if (arg1 == 188) {
                    int var67 = arg2.method239();
                    int var68 = (var67 >> 4 & 7) + this.field1553;
                    int var69 = (var67 & 7) + this.field1554;
                    int var70 = arg2.method239();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1276[var71];
                    int var74 = arg2.method241();
                    int var75 = arg2.method241();
                    int var76 = arg2.method241();
                    int var77 = arg2.method241();
                    byte var78 = arg2.method240();
                    byte var79 = arg2.method240();
                    byte var80 = arg2.method240();
                    byte var81 = arg2.method240();
                    PlayerEntity var82;
                    if (this.field1185 == var77) {
                        var82 = field1239;
                    } else {
                        var82 = this.field1587[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method334(var74);
                        int var84 = this.field1337[this.field1224][var68][var69];
                        int var85 = this.field1337[this.field1224][var68 + 1][var69];
                        int var86 = this.field1337[this.field1224][var68 + 1][var69 + 1];
                        int var87 = this.field1337[this.field1224][var68][var69 + 1];
                        Model var88 = var83.method340(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method532(var69, this.field1224, var73, var76 + 1, -1, var68, (byte) 2, var75 + 1, 0, 0);
                            var82.field476 = field1633 + var75;
                            var82.field477 = field1633 + var76;
                            var82.field481 = var88;
                            int var89 = var83.field941;
                            int var90 = var83.field942;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field942;
                                var90 = var83.field941;
                            }
                            var82.field478 = var68 * 128 + var89 * 64;
                            var82.field480 = var69 * 128 + var90 * 64;
                            var82.field479 = this.method484(var82.field480, this.field1224, var82.field478, (byte) 6);
                            if (var78 > var80) {
                                byte var91 = var78;
                                var78 = var80;
                                var80 = var91;
                            }
                            if (var79 > var81) {
                                byte var92 = var79;
                                var79 = var81;
                                var81 = var92;
                            }
                            var82.field482 = var68 + var78;
                            var82.field484 = var68 + var80;
                            var82.field483 = var69 + var79;
                            var82.field485 = var69 + var81;
                        }
                    }
                }
                if (arg1 == 151) {
                    int var93 = arg2.method239();
                    int var94 = (var93 >> 4 & 7) + this.field1553;
                    int var95 = (var93 & 7) + this.field1554;
                    int var96 = arg2.method241();
                    int var97 = arg2.method241();
                    int var98 = arg2.method241();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1342[this.field1224][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method258(); var100 != null; var100 = (ObjStackEntity) var99.method260(true)) {
                                if ((var96 & 32767) == var100.field502 && var100.field503 == var97) {
                                    var100.field503 = var98;
                                    break;
                                }
                            }
                            this.method495(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var101 = arg2.method239();
            int var102 = (var101 >> 4 & 7) + this.field1553;
            int var103 = (var101 & 7) + this.field1554;
            int var104 = arg2.method239();
            int var105 = var104 >> 2;
            int var106 = var104 & 3;
            int var107 = this.field1276[var105];
            int var108;
            if (arg1 == 198) {
                var108 = -1;
            } else {
                var108 = arg2.method241();
            }
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                this.method532(var103, this.field1224, var107, -1, var108, var102, (byte) 2, 0, var105, var106);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIII)Z")
    public final boolean method507(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1 >> 14 & 32767;
        int var7 = this.field1420.method94(this.field1224, arg4, arg3, arg1);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method499(false, 0, var8 + 1, arg4, 0, 2, field1239.field458[0], var9, arg3, 0, field1239.field459[0], false);
            } else {
                LocType var10 = LocType.method334(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field942;
                    var12 = var10.field941;
                } else {
                    var11 = var10.field941;
                    var12 = var10.field942;
                }
                int var13 = var10.field964;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method499(false, var11, 0, arg4, var13, 2, field1239.field458[0], 0, arg3, var12, field1239.field459[0], false);
            }
            this.field1625 = super.field28;
            if (arg0 != 5) {
                arg2 = this.field1563.method239();
            }
            this.field1626 = super.field29;
            this.field1628 = 2;
            this.field1627 = 0;
            this.field1566.method228((byte) 0, arg2);
            this.field1566.method230(this.field1366 + arg4);
            this.field1566.method230(this.field1367 + arg3);
            this.field1566.method230(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        if (arg0) {
            this.field1342 = null;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5((byte) -24);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1262 != -1 && this.field1405 == this.field1262) {
                        if (var2 == 8 && this.field1313.length() > 0) {
                            this.field1313 = this.field1313.substring(0, this.field1313.length() - 1);
                        }
                        break;
                    }
                    if (this.field1187) {
                        if (var2 >= 32 && var2 <= 122 && this.field1345.length() < 80) {
                            this.field1345 = this.field1345 + (char) var2;
                            this.field1282 = true;
                        }
                        if (var2 == 8 && this.field1345.length() > 0) {
                            this.field1345 = this.field1345.substring(0, this.field1345.length() - 1);
                            this.field1282 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1187 = false;
                            this.field1282 = true;
                            if (this.field1518 == 1) {
                                long var3 = JString.method310(this.field1345);
                                this.method501(var3, (byte) 5);
                            }
                            if (this.field1518 == 2 && this.field1371 > 0) {
                                long var5 = JString.method310(this.field1345);
                                this.method536(-443, var5);
                            }
                            if (this.field1518 == 3 && this.field1345.length() > 0) {
                                this.field1566.method228((byte) 0, 99);
                                this.field1566.method229(0);
                                int var7 = this.field1566.field710;
                                this.field1566.method235(this.field1611, this.field1305);
                                WordPack.method318(this.field1345, this.field1566, this.field1234);
                                this.field1566.method238(this.field1566.field710 - var7, -18284);
                                this.field1345 = JString.method315(this.field1418, this.field1345);
                                this.field1345 = WordFilter.method403(103, this.field1345);
                                this.method544(6, JString.method314(JString.method311((byte) 4, this.field1611), (byte) 9), this.field1345, 0);
                                if (this.field1635 == 2) {
                                    this.field1635 = 1;
                                    this.field1521 = true;
                                    this.field1566.method228((byte) 0, 8);
                                    this.field1566.method229(this.field1491);
                                    this.field1566.method229(this.field1635);
                                    this.field1566.method229(this.field1346);
                                }
                            }
                            if (this.field1518 == 4 && this.field1225 < 100) {
                                long var8 = JString.method310(this.field1345);
                                this.method459(var8, (byte) -117);
                            }
                            if (this.field1518 == 5 && this.field1225 > 0) {
                                long var10 = JString.method310(this.field1345);
                                this.method485(0, var10);
                            }
                        }
                    } else if (this.field1386) {
                        if (var2 >= 48 && var2 <= 57 && this.field1274.length() < 10) {
                            this.field1274 = this.field1274 + (char) var2;
                            this.field1282 = true;
                        }
                        if (var2 == 8 && this.field1274.length() > 0) {
                            this.field1274 = this.field1274.substring(0, this.field1274.length() - 1);
                            this.field1282 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1274.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1274);
                                } catch (Exception var17) {
                                }
                                this.field1566.method228((byte) 0, 241);
                                this.field1566.method233(var12);
                            }
                            this.field1386 = false;
                            this.field1282 = true;
                        }
                    } else if (this.field1573 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1414.length() < 80) {
                            this.field1414 = this.field1414 + (char) var2;
                            this.field1282 = true;
                        }
                        if (var2 == 8 && this.field1414.length() > 0) {
                            this.field1414 = this.field1414.substring(0, this.field1414.length() - 1);
                            this.field1282 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1414.length() > 0) {
                            if (this.field1395 == 2) {
                                if (this.field1414.equals("::clientdrop")) {
                                    this.method498(false);
                                }
                                if (this.field1414.equals("::lag")) {
                                    this.method431((byte) 6);
                                }
                                if (this.field1414.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1273.method282(2, 0); ++var13) {
                                        this.field1273.method292(0, (byte) 1, var13, 2);
                                    }
                                }
                            }
                            if (this.field1414.startsWith("::")) {
                                this.field1566.method228((byte) 0, 11);
                                this.field1566.method229(this.field1414.length() - 1);
                                this.field1566.method236(this.field1414.substring(2));
                            } else {
                                byte var14 = 0;
                                if (this.field1414.startsWith("yellow:")) {
                                    var14 = 0;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                if (this.field1414.startsWith("red:")) {
                                    var14 = 1;
                                    this.field1414 = this.field1414.substring(4);
                                }
                                if (this.field1414.startsWith("green:")) {
                                    var14 = 2;
                                    this.field1414 = this.field1414.substring(6);
                                }
                                if (this.field1414.startsWith("cyan:")) {
                                    var14 = 3;
                                    this.field1414 = this.field1414.substring(5);
                                }
                                if (this.field1414.startsWith("purple:")) {
                                    var14 = 4;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                if (this.field1414.startsWith("white:")) {
                                    var14 = 5;
                                    this.field1414 = this.field1414.substring(6);
                                }
                                if (this.field1414.startsWith("flash1:")) {
                                    var14 = 6;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                if (this.field1414.startsWith("flash2:")) {
                                    var14 = 7;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                if (this.field1414.startsWith("flash3:")) {
                                    var14 = 8;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                if (this.field1414.startsWith("glow1:")) {
                                    var14 = 9;
                                    this.field1414 = this.field1414.substring(6);
                                }
                                if (this.field1414.startsWith("glow2:")) {
                                    var14 = 10;
                                    this.field1414 = this.field1414.substring(6);
                                }
                                if (this.field1414.startsWith("glow3:")) {
                                    var14 = 11;
                                    this.field1414 = this.field1414.substring(6);
                                }
                                byte var15 = 0;
                                if (this.field1414.startsWith("wave:")) {
                                    var15 = 1;
                                    this.field1414 = this.field1414.substring(5);
                                }
                                if (this.field1414.startsWith("scroll:")) {
                                    var15 = 2;
                                    this.field1414 = this.field1414.substring(7);
                                }
                                this.field1566.method228((byte) 0, 78);
                                this.field1566.method229(0);
                                int var16 = this.field1566.field710;
                                this.field1566.method229(var14);
                                this.field1566.method229(var15);
                                WordPack.method318(this.field1414, this.field1566, this.field1234);
                                this.field1566.method238(this.field1566.field710 - var16, -18284);
                                this.field1414 = JString.method315(this.field1418, this.field1414);
                                this.field1414 = WordFilter.method403(103, this.field1414);
                                field1239.field421 = this.field1414;
                                field1239.field423 = var14;
                                field1239.field424 = var15;
                                field1239.field422 = 150;
                                if (this.field1395 == 2) {
                                    this.method544(2, "@cr2@" + field1239.field467, field1239.field421, 0);
                                } else if (this.field1395 == 1) {
                                    this.method544(2, "@cr1@" + field1239.field467, field1239.field421, 0);
                                } else {
                                    this.method544(2, field1239.field467, field1239.field421, 0);
                                }
                                if (this.field1491 == 2) {
                                    this.field1491 = 3;
                                    this.field1521 = true;
                                    this.field1566.method228((byte) 0, 8);
                                    this.field1566.method229(this.field1491);
                                    this.field1566.method229(this.field1635);
                                    this.field1566.method229(this.field1346);
                                }
                            }
                            this.field1414 = "";
                            this.field1282 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1313.length() < 12) {
                this.field1313 = this.field1313 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method509(byte arg0, int arg1) {
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            field1618 = 32;
        }
        if (!field1231) {
            if (Pix3D.field662[17] >= arg1) {
                Pix8 var4 = Pix3D.field656[17];
                int var5 = var4.field684 * var4.field683 - 1;
                int var6 = this.field1325 * var4.field683 * 2;
                byte[] var7 = var4.field681;
                byte[] var8 = this.field1426;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field681 = var8;
                this.field1426 = var7;
                Pix3D.method184(this.field1311, 17);
            }
            if (Pix3D.field662[24] >= arg1) {
                Pix8 var10 = Pix3D.field656[24];
                int var11 = var10.field684 * var10.field683 - 1;
                int var12 = this.field1325 * var10.field683 * 2;
                byte[] var13 = var10.field681;
                byte[] var14 = this.field1426;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field681 = var14;
                this.field1426 = var13;
                Pix3D.method184(this.field1311, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method510(int arg0, Packet arg1, int arg2) {
        this.field1340 = 0;
        this.field1590 = 0;
        this.method514(0, arg2, arg1);
        this.method470(false, arg1, arg2);
        if (arg0 > 0) {
            this.method539(arg2, arg1, true);
            for (int var4 = 0; var4 < this.field1340; ++var4) {
                int var6 = this.field1341[var4];
                if (field1633 != this.field1537[var6].field454) {
                    this.field1537[var6].field464 = null;
                    this.field1537[var6] = null;
                }
            }
            if (arg1.field710 != arg2) {
                signlink.reporterror(this.field1631 + " size mismatch in getnpcpos - pos:" + arg1.field710 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1538; ++var5) {
                    if (this.field1537[this.field1539[var5]] == null) {
                        signlink.reporterror(this.field1631 + " null entry in npc list - pos:" + var5 + " size:" + this.field1538);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 249);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1228 = Integer.parseInt(arg0[0]);
                field1229 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method432(-21519);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method486(-136);
                }
                if (arg0[3].equals("free")) {
                    field1230 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1230 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(503, field1359, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method511(int arg0) {
        if (arg0 != 0) {
            field1359 = this.field1415.method305();
        }
        if (this.field1409 == 0) {
            int var2 = super.field11 / 2 - 80;
            int var3 = super.field12 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field27 == 1 && super.field28 >= var2 - 75 && super.field28 <= var2 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1409 = 3;
                this.field1519 = 0;
            }
            int var4 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var4 - 75 && super.field28 <= var4 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1335 = "";
                this.field1336 = "Enter your username & password.";
                this.field1409 = 2;
                this.field1519 = 0;
            }
        } else if (this.field1409 == 2) {
            int var5 = super.field12 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field27 == 1 && super.field29 >= var16 - 15 && super.field29 < var16) {
                this.field1519 = 0;
            }
            var5 = var16 + 15;
            if (super.field27 == 1 && super.field29 >= var5 - 15 && super.field29 < var5) {
                this.field1519 = 1;
            }
            var5 += 15;
            int var6 = super.field11 / 2 - 80;
            int var7 = super.field12 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field27 == 1 && super.field28 >= var6 - 75 && super.field28 <= var6 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.method440(this.field1631, this.field1632, false);
                if (this.field1220) {
                    return;
                }
            }
            int var8 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var8 - 75 && super.field28 <= var8 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.field1409 = 0;
                this.field1631 = "";
                this.field1632 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) -24);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1406.length(); ++var11) {
                        if (var9 == field1406.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1519 == 0) {
                        if (var9 == 8 && this.field1631.length() > 0) {
                            this.field1631 = this.field1631.substring(0, this.field1631.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1519 = 1;
                        }
                        if (var10) {
                            this.field1631 = this.field1631 + (char) var9;
                        }
                        if (this.field1631.length() > 12) {
                            this.field1631 = this.field1631.substring(0, 12);
                        }
                    } else if (this.field1519 == 1) {
                        if (var9 == 8 && this.field1632.length() > 0) {
                            this.field1632 = this.field1632.substring(0, this.field1632.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1519 = 0;
                        }
                        if (var10) {
                            this.field1632 = this.field1632 + (char) var9;
                        }
                        if (this.field1632.length() > 20) {
                            this.field1632 = this.field1632.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1409 == 3) {
                int var12 = super.field11 / 2;
                int var13 = super.field12 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field27 == 1 && super.field28 >= var12 - 75 && super.field28 <= var12 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1409 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILgc;II)V")
    public final void method512(int arg0, int arg1, NpcType arg2, int arg3, int arg4) {
        if (this.field1492 < 400) {
            String var6 = arg2.field984;
            this.field1595 += arg0;
            if (arg2.field1001 != 0) {
                var6 = var6 + method487(arg2.field1001, field1239.field473, -34316) + " (level-" + arg2.field1001 + ")";
            }
            if (this.field1277 == 1) {
                this.field1210[this.field1492] = "Use " + this.field1281 + " with @yel@" + var6;
                this.field1332[this.field1492] = 900;
                this.field1333[this.field1492] = arg4;
                this.field1330[this.field1492] = arg3;
                this.field1331[this.field1492] = arg1;
                ++this.field1492;
            } else {
                if (this.field1547 == 1) {
                    if ((this.field1549 & 2) == 2) {
                        this.field1210[this.field1492] = this.field1550 + " @yel@" + var6;
                        this.field1332[this.field1492] = 265;
                        this.field1333[this.field1492] = arg4;
                        this.field1330[this.field1492] = arg3;
                        this.field1331[this.field1492] = arg1;
                        ++this.field1492;
                        return;
                    }
                } else {
                    if (arg2.field996 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg2.field996[var7] != null && !arg2.field996[var7].equalsIgnoreCase("attack")) {
                                this.field1210[this.field1492] = arg2.field996[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1332[this.field1492] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1332[this.field1492] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1332[this.field1492] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1332[this.field1492] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1332[this.field1492] = 245;
                                }
                                this.field1333[this.field1492] = arg4;
                                this.field1330[this.field1492] = arg3;
                                this.field1331[this.field1492] = arg1;
                                ++this.field1492;
                            }
                        }
                    }
                    if (arg2.field996 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg2.field996[var8] != null && arg2.field996[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg2.field1001 > field1239.field473) {
                                    var9 = 2000;
                                }
                                this.field1210[this.field1492] = arg2.field996[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1332[this.field1492] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1332[this.field1492] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1332[this.field1492] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1332[this.field1492] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1332[this.field1492] = var9 + 245;
                                }
                                this.field1333[this.field1492] = arg4;
                                this.field1330[this.field1492] = arg3;
                                this.field1331[this.field1492] = arg1;
                                ++this.field1492;
                            }
                        }
                    }
                    this.field1210[this.field1492] = "Examine @yel@" + var6;
                    this.field1332[this.field1492] = 1607;
                    this.field1333[this.field1492] = arg4;
                    this.field1330[this.field1492] = arg3;
                    this.field1331[this.field1492] = arg1;
                    ++this.field1492;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method513(int arg0, boolean arg1, int arg2) {
        int var4 = 0;
        if (arg1) {
            this.method6();
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1249[var5] != null) {
                int var6 = this.field1247[var5];
                int var7 = 70 - var4 * 14 + this.field1465 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1248[var5];
                boolean var9 = false;
                if (var8 != null && var8.startsWith("@cr1@")) {
                    var8 = var8.substring(5);
                    boolean var10 = true;
                }
                if (var8 != null && var8.startsWith("@cr2@")) {
                    var8 = var8.substring(5);
                    boolean var11 = true;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1491 == 0 || this.field1491 == 1 && this.method559(var8, this.field1246))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1239.field467)) {
                        if (this.field1395 >= 1) {
                            this.field1210[this.field1492] = "Report abuse @whi@" + var8;
                            this.field1332[this.field1492] = 34;
                            ++this.field1492;
                        }
                        this.field1210[this.field1492] = "Add ignore @whi@" + var8;
                        this.field1332[this.field1492] = 436;
                        ++this.field1492;
                        this.field1210[this.field1492] = "Add friend @whi@" + var8;
                        this.field1332[this.field1492] = 406;
                        ++this.field1492;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1540 == 0 && (var6 == 7 || this.field1635 == 0 || this.field1635 == 1 && this.method559(var8, this.field1246))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1395 >= 1) {
                            this.field1210[this.field1492] = "Report abuse @whi@" + var8;
                            this.field1332[this.field1492] = 34;
                            ++this.field1492;
                        }
                        this.field1210[this.field1492] = "Add ignore @whi@" + var8;
                        this.field1332[this.field1492] = 436;
                        ++this.field1492;
                        this.field1210[this.field1492] = "Add friend @whi@" + var8;
                        this.field1332[this.field1492] = 406;
                        ++this.field1492;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1346 == 0 || this.field1346 == 1 && this.method559(var8, this.field1246))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1210[this.field1492] = "Accept trade @whi@" + var8;
                        this.field1332[this.field1492] = 903;
                        ++this.field1492;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1540 == 0 && this.field1635 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1346 == 0 || this.field1346 == 1 && this.method559(var8, this.field1246))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1210[this.field1492] = "Accept duel @whi@" + var8;
                        this.field1332[this.field1492] = 363;
                        ++this.field1492;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method13(int arg0, String arg1, int arg2) {
        this.field1430 = arg2;
        this.field1181 = arg1;
        this.method493(7);
        if (this.field1564 == null) {
            super.method13(638, arg1, arg2);
        } else {
            this.field1201.method268(3);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1362.method214("RuneScape is loading - please wait...", 16777215, var5 / 2 - 26 - var6, var4 / 2, -28519);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method171(field1413, 34, var7, 304, 9179409, var4 / 2 - 152);
            Pix2D.method171(field1413, 32, var7 + 1, 302, 0, var4 / 2 - 151);
            Pix2D.method170(arg2 * 3, 5, var4 / 2 - 150, var7 + 2, 30, 9179409);
            int var8 = 66 / arg0;
            Pix2D.method170(300 - arg2 * 3, 5, arg2 * 3 + (var4 / 2 - 150), var7 + 2, 30, 0);
            this.field1362.method214(arg1, 16777215, var5 / 2 + 5 - var6, var4 / 2, -28519);
            this.field1201.method269((byte) 7, 171, super.field13, 202);
            if (this.field1546) {
                this.field1546 = false;
                if (!this.field1351) {
                    this.field1202.method269((byte) 7, 0, super.field13, 0);
                    this.field1203.method269((byte) 7, 0, super.field13, 637);
                }
                this.field1199.method269((byte) 7, 0, super.field13, 128);
                this.field1200.method269((byte) 7, 371, super.field13, 202);
                this.field1204.method269((byte) 7, 265, super.field13, 0);
                this.field1205.method269((byte) 7, 265, super.field13, 562);
                this.field1206.method269((byte) 7, 171, super.field13, 128);
                this.field1207.method269((byte) 7, 171, super.field13, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILmb;)V")
    private final void method514(int arg0, int arg1, Packet arg2) {
        arg2.method249(0);
        if (arg0 < 0 || arg0 > 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg2.method250(8, 0);
        if (var5 < this.field1538) {
            for (int var6 = var5; var6 < this.field1538; ++var6) {
                this.field1341[this.field1340++] = this.field1539[var6];
            }
        }
        if (var5 > this.field1538) {
            signlink.reporterror(this.field1631 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1538 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field1539[var7];
                NpcEntity var9 = this.field1537[var8];
                int var10 = arg2.method250(1, 0);
                if (var10 == 0) {
                    this.field1539[this.field1538++] = var8;
                    var9.field454 = field1633;
                } else {
                    int var11 = arg2.method250(2, 0);
                    if (var11 == 0) {
                        this.field1539[this.field1538++] = var8;
                        var9.field454 = field1633;
                        this.field1591[this.field1590++] = var8;
                    } else if (var11 == 1) {
                        this.field1539[this.field1538++] = var8;
                        var9.field454 = field1633;
                        int var12 = arg2.method250(3, 0);
                        var9.method125(var12, false, 37435);
                        int var13 = arg2.method250(1, 0);
                        if (var13 == 1) {
                            this.field1591[this.field1590++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1539[this.field1538++] = var8;
                        var9.field454 = field1633;
                        int var14 = arg2.method250(3, 0);
                        var9.method125(var14, true, 37435);
                        int var15 = arg2.method250(3, 0);
                        var9.method125(var15, true, 37435);
                        int var16 = arg2.method250(1, 0);
                        if (var16 == 1) {
                            this.field1591[this.field1590++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1341[this.field1340++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method515(byte arg0) {
        this.field1614.method268(3);
        Pix3D.field654 = this.field1510;
        this.field1423.method212(0, 0, 0);
        if (this.field1438 != -1) {
            this.method503(true, Component.field67[this.field1438], 0, 0, 0);
        } else if (this.field1421[this.field1232] != -1) {
            this.method503(true, Component.field67[this.field1421[this.field1232]], 0, 0, 0);
        }
        if (this.field1364 && this.field1497 == 1) {
            this.method475(false);
        }
        this.field1614.method269((byte) 7, 205, super.field13, 553);
        if (arg0 == -103) {
            this.field1616.method268(3);
            Pix3D.field654 = this.field1511;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method516(boolean arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method517(int arg0, int arg1) {
        int[] var3 = this.field1309.field672;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1343[arg1][var24][var6] & 24) == 0) {
                    this.field1420.method99(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1343[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1420.method99(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1309.method194(3);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1343[arg1][var22][var9] & 24) == 0) {
                    this.method562(var7, var8, arg1, var9, var22, (byte) 5);
                }
                if (arg1 < 3 && (this.field1343[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method562(var7, var8, arg1 + 1, var9, var22, (byte) 5);
                }
            }
        }
        this.field1616.method268(3);
        if (arg0 == 39649) {
            this.field1434 = 0;
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    int var12 = this.field1420.method93(this.field1224, var10, var11);
                    if (var12 != 0) {
                        int var13 = var12 >> 14 & 32767;
                        int var14 = LocType.method334(var13).field954;
                        if (var14 >= 0) {
                            int var15 = var10;
                            int var16 = var11;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                byte var17 = 104;
                                byte var18 = 104;
                                int[][] var19 = this.field1211[this.field1224].field1069;
                                for (int var20 = 0; var20 < 10; ++var20) {
                                    int var21 = (int) (Math.random() * 4.0D);
                                    if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 2621704) == 0) {
                                        --var15;
                                    }
                                    if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 2621824) == 0) {
                                        ++var15;
                                    }
                                    if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 2621698) == 0) {
                                        --var16;
                                    }
                                    if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 2621728) == 0) {
                                        ++var16;
                                    }
                                }
                            }
                            this.field1541[this.field1434] = this.field1431[var14];
                            this.field1435[this.field1434] = var15;
                            this.field1436[this.field1434] = var16;
                            ++this.field1434;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1496 != null) {
                this.field1496.method38();
            }
        } catch (Exception var2) {
        }
        this.field1496 = null;
        this.method435(0);
        if (this.field1322 != null) {
            this.field1322.field971 = false;
        }
        this.field1322 = null;
        this.field1273.method281();
        this.field1273 = null;
        this.field1566 = null;
        this.field1339 = null;
        this.field1563 = null;
        this.field1347 = null;
        this.field1310 = null;
        this.field1293 = null;
        this.field1348 = null;
        this.field1349 = null;
        this.field1337 = null;
        this.field1343 = null;
        this.field1420 = null;
        this.field1211 = null;
        this.field1507 = null;
        this.field1567 = null;
        this.field1208 = null;
        this.field1209 = null;
        this.field1426 = null;
        this.field1614 = null;
        this.field1615 = null;
        this.field1616 = null;
        this.field1617 = null;
        this.field1475 = null;
        this.field1476 = null;
        this.field1477 = null;
        this.field1189 = null;
        this.field1190 = null;
        this.field1191 = null;
        this.field1192 = null;
        this.field1193 = null;
        this.field1194 = null;
        this.field1195 = null;
        this.field1196 = null;
        this.field1197 = null;
        this.field1423 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1289 = null;
        this.field1290 = null;
        this.field1291 = null;
        this.field1422 = null;
        this.field1466 = null;
        this.field1467 = null;
        this.field1468 = null;
        this.field1469 = null;
        this.field1470 = null;
        this.field1268 = null;
        this.field1269 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1460 = null;
        this.field1583 = null;
        this.field1482 = null;
        this.field1417 = null;
        this.field1577 = null;
        this.field1578 = null;
        this.field1579 = null;
        this.field1580 = null;
        this.field1454 = null;
        this.field1431 = null;
        this.field1284 = null;
        this.field1587 = null;
        this.field1589 = null;
        this.field1591 = null;
        this.field1592 = null;
        this.field1341 = null;
        this.field1537 = null;
        this.field1539 = null;
        this.field1342 = null;
        this.field1302 = null;
        this.field1594 = null;
        this.field1512 = null;
        this.field1330 = null;
        this.field1331 = null;
        this.field1332 = null;
        this.field1333 = null;
        this.field1210 = null;
        this.field1462 = null;
        this.field1435 = null;
        this.field1436 = null;
        this.field1541 = null;
        this.field1309 = null;
        this.field1294 = null;
        this.field1326 = null;
        this.field1558 = null;
        this.field1202 = null;
        this.field1203 = null;
        this.field1199 = null;
        this.field1200 = null;
        this.field1201 = null;
        this.field1204 = null;
        this.field1205 = null;
        this.field1206 = null;
        this.field1207 = null;
        this.method545(366);
        LocType.method333(false);
        NpcType.method343(false);
        ObjType.method349(false);
        FloType.field1073 = null;
        IdkType.field1087 = null;
        Component.field67 = null;
        UnkType.field1095 = null;
        SeqType.field1110 = null;
        SpotAnimType.field1130 = null;
        SpotAnimType.field1142 = null;
        VarpType.field1151 = null;
        super.field14 = null;
        PlayerEntity.field488 = null;
        Pix3D.method177(false);
        World3D.method63(false);
        if (arg0 != 24) {
            this.field1596 = -1;
        }
        Model.method135(false);
        AnimFrame.method60(false);
        System.gc();
        if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method518(int arg0) {
        this.field1373 = 0;
        for (int var2 = -1; var2 < this.field1588 + this.field1538; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1239;
            } else if (var2 < this.field1588) {
                var17 = this.field1587[this.field1589[var2]];
            } else {
                var17 = this.field1537[this.field1539[var2 - this.field1588]];
            }
            if (var17 != null && var17.method127(false)) {
                if (var2 >= this.field1588) {
                    NpcType var21 = ((NpcEntity) var17).field464;
                    if (var21.field1007 >= 0 && var21.field1007 < this.field1482.length) {
                        this.method556(var17, 4, var17.field455 + 15);
                        if (this.field1444 > -1) {
                            this.field1482[var21.field1007].method199(0, this.field1445 - 30, this.field1444 - 12);
                        }
                    }
                    if (this.field1569 == 1 && this.field1539[var2 - this.field1588] == this.field1186 && field1633 % 20 < 10) {
                        this.method556(var17, 4, var17.field455 + 15);
                        if (this.field1444 > -1) {
                            this.field1482[2].method199(0, this.field1445 - 28, this.field1444 - 12);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field470 != 0) {
                        this.method556(var17, 4, var17.field455 + 15);
                        if (this.field1444 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field470 & 1 << var20) != 0) {
                                    this.field1482[var20].method199(0, this.field1445 - var18, this.field1444 - 12);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1569 == 10 && this.field1589[var2] == this.field1601) {
                        this.method556(var17, 4, var17.field455 + 15);
                        if (this.field1444 > -1) {
                            this.field1482[7].method199(0, this.field1445 - var18, this.field1444 - 12);
                        }
                    }
                }
                if (var17.field421 != null && (var2 >= this.field1588 || this.field1491 == 0 || this.field1491 == 3 || this.field1491 == 1 && this.method559(((PlayerEntity) var17).field467, this.field1246))) {
                    this.method556(var17, 4, var17.field455);
                    if (this.field1444 > -1 && this.field1373 < this.field1374) {
                        this.field1378[this.field1373] = this.field1362.method216(-525, var17.field421) / 2;
                        this.field1377[this.field1373] = this.field1362.field697;
                        this.field1375[this.field1373] = this.field1444;
                        this.field1376[this.field1373] = this.field1445;
                        this.field1379[this.field1373] = var17.field423;
                        this.field1380[this.field1373] = var17.field424;
                        this.field1381[this.field1373] = var17.field422;
                        this.field1382[this.field1373++] = var17.field421;
                        if (this.field1552 == 0 && var17.field424 == 1) {
                            this.field1377[this.field1373] += 10;
                            this.field1376[this.field1373] += 5;
                        }
                        if (this.field1552 == 0 && var17.field424 == 2) {
                            this.field1378[this.field1373] = 60;
                        }
                    }
                }
                if (var17.field428 > field1633) {
                    this.method556(var17, 4, var17.field455 + 15);
                    if (this.field1444 > -1) {
                        int var22 = var17.field429 * 30 / var17.field430;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method170(var22, 5, this.field1444 - 15, this.field1445 - 3, 5, 65280);
                        Pix2D.method170(30 - var22, 5, this.field1444 - 15 + var22, this.field1445 - 3, 5, 16711680);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field427[var23] > field1633) {
                        this.method556(var17, 4, var17.field455 / 2);
                        if (this.field1444 > -1) {
                            if (var23 == 1) {
                                this.field1445 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1444 -= 15;
                                this.field1445 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1444 += 15;
                                this.field1445 -= 10;
                            }
                            this.field1583[var17.field426[var23]].method199(0, this.field1445 - 12, this.field1444 - 12);
                            this.field1360.method214(String.valueOf(var17.field425[var23]), 0, this.field1445 + 4, this.field1444, -28519);
                            this.field1360.method214(String.valueOf(var17.field425[var23]), 16777215, this.field1445 + 3, this.field1444 - 1, -28519);
                        }
                    }
                }
            }
        }
        this.field1595 += arg0;
        for (int var3 = 0; var3 < this.field1373; ++var3) {
            int var4 = this.field1375[var3];
            int var5 = this.field1376[var3];
            int var6 = this.field1378[var3];
            int var7 = this.field1377[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1376[var16] - this.field1377[var16] && var5 - var7 < this.field1376[var16] + 2 && var4 - var6 < this.field1378[var16] + this.field1375[var16] && var4 + var6 > this.field1375[var16] - this.field1378[var16] && this.field1376[var16] - this.field1377[var16] < var5) {
                        var5 = this.field1376[var16] - this.field1377[var16];
                        var8 = true;
                    }
                }
            }
            this.field1444 = this.field1375[var3];
            this.field1445 = this.field1376[var3] = var5;
            String var9 = this.field1382[var3];
            if (this.field1552 == 0) {
                int var10 = 16776960;
                if (this.field1379[var3] < 6) {
                    var10 = this.field1457[this.field1379[var3]];
                }
                if (this.field1379[var3] == 6) {
                    var10 = this.field1329 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1379[var3] == 7) {
                    var10 = this.field1329 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1379[var3] == 8) {
                    var10 = this.field1329 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1379[var3] == 9) {
                    int var11 = 150 - this.field1381[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1379[var3] == 10) {
                    int var12 = 150 - this.field1381[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1379[var3] == 11) {
                    int var13 = 150 - this.field1381[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1380[var3] == 0) {
                    this.field1362.method214(var9, 0, this.field1445 + 1, this.field1444, -28519);
                    this.field1362.method214(var9, var10, this.field1445, this.field1444, -28519);
                }
                if (this.field1380[var3] == 1) {
                    this.field1362.method218(this.field1444, var9, -244, 0, this.field1329, this.field1445 + 1);
                    this.field1362.method218(this.field1444, var9, -244, var10, this.field1329, this.field1445);
                }
                if (this.field1380[var3] == 2) {
                    int var14 = this.field1362.method216(-525, var9);
                    int var15 = (150 - this.field1381[var3]) * (var14 + 100) / 150;
                    Pix2D.method167(this.field1444 - 50, this.field1444 + 50, 334, 0, this.field1489);
                    this.field1362.method217(this.field1445 + 1, this.field1444 + 50 - var15, var9, 0, (byte) 3);
                    this.field1362.method217(this.field1445, this.field1444 + 50 - var15, var9, var10, (byte) 3);
                    Pix2D.method166((byte) 0);
                }
            } else {
                this.field1362.method214(var9, 0, this.field1445 + 1, this.field1444, -28519);
                this.field1362.method214(var9, 16776960, this.field1445, this.field1444, -28519);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method519(boolean arg0) {
        for (int var2 = 0; var2 < this.field1538; ++var2) {
            int var3 = this.field1539[var2];
            NpcEntity var4 = this.field1537[var3];
            if (var4 != null) {
                this.method520(var4.field464.field986, var4, true);
            }
        }
        this.field1220 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;Z)V")
    public final void method520(int arg0, PathingEntity arg1, boolean arg2) {
        if (arg1.field409 < 128 || arg1.field410 < 128 || arg1.field409 >= 13184 || arg1.field410 >= 13184) {
            arg1.field437 = -1;
            arg1.field442 = -1;
            arg1.field451 = 0;
            arg1.field452 = 0;
            arg1.field409 = arg1.field458[0] * 128 + arg1.field413 * 64;
            arg1.field410 = arg1.field459[0] * 128 + arg1.field413 * 64;
            arg1.method126(-730);
        }
        if (field1239 == arg1 && (arg1.field409 < 1536 || arg1.field410 < 1536 || arg1.field409 >= 11776 || arg1.field410 >= 11776)) {
            arg1.field437 = -1;
            arg1.field442 = -1;
            arg1.field451 = 0;
            arg1.field452 = 0;
            arg1.field409 = arg1.field458[0] * 128 + arg1.field413 * 64;
            arg1.field410 = arg1.field459[0] * 128 + arg1.field413 * 64;
            arg1.method126(-730);
        }
        if (arg1.field451 > field1633) {
            this.method521(7, arg1);
        } else if (arg1.field452 >= field1633) {
            this.method522(arg1, 1);
        } else {
            this.method523(arg1, -950);
        }
        this.method524(arg1, (byte) 9);
        this.method525(arg1, (byte) 4);
        if (!arg2) {
            this.field1555 = this.field1415.method305();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method521(int arg0, PathingEntity arg1) {
        int var3 = arg1.field451 - field1633;
        if (arg0 < 7 || arg0 > 7) {
            field1618 = -334;
        }
        int var4 = arg1.field447 * 128 + arg1.field413 * 64;
        int var5 = arg1.field449 * 128 + arg1.field413 * 64;
        arg1.field409 += (var4 - arg1.field409) / var3;
        arg1.field410 += (var5 - arg1.field410) / var3;
        arg1.field461 = 0;
        if (arg1.field453 == 0) {
            arg1.field456 = 1024;
        }
        if (arg1.field453 == 1) {
            arg1.field456 = 1536;
        }
        if (arg1.field453 == 2) {
            arg1.field456 = 0;
        }
        if (arg1.field453 == 3) {
            arg1.field456 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method522(PathingEntity arg0, int arg1) {
        if (field1633 == arg0.field452 || arg0.field437 == -1 || arg0.field440 != 0 || arg0.field439 + 1 > SeqType.field1110[arg0.field437].method384(arg0.field438, true)) {
            int var3 = arg0.field452 - arg0.field451;
            int var4 = field1633 - arg0.field451;
            int var5 = arg0.field447 * 128 + arg0.field413 * 64;
            int var6 = arg0.field449 * 128 + arg0.field413 * 64;
            int var7 = arg0.field448 * 128 + arg0.field413 * 64;
            int var8 = arg0.field450 * 128 + arg0.field413 * 64;
            arg0.field409 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field410 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field461 = 0;
        if (arg1 != 1) {
            this.field1596 = -1;
        }
        if (arg0.field453 == 0) {
            arg0.field456 = 1024;
        }
        if (arg0.field453 == 1) {
            arg0.field456 = 1536;
        }
        if (arg0.field453 == 2) {
            arg0.field456 = 0;
        }
        if (arg0.field453 == 3) {
            arg0.field456 = 512;
        }
        arg0.field411 = arg0.field456;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method523(PathingEntity arg0, int arg1) {
        arg0.field434 = arg0.field414;
        if (arg0.field457 == 0) {
            arg0.field461 = 0;
        } else {
            if (arg0.field437 != -1 && arg0.field440 == 0) {
                SeqType var3 = SeqType.field1110[arg0.field437];
                if (arg0.field462 > 0 && var3.field1122 == 0) {
                    ++arg0.field461;
                    return;
                }
                if (arg0.field462 <= 0 && var3.field1123 == 0) {
                    ++arg0.field461;
                    return;
                }
            }
            int var4 = arg0.field409;
            int var5 = arg0.field410;
            int var6 = arg0.field458[arg0.field457 - 1] * 128 + arg0.field413 * 64;
            int var7 = arg0.field459[arg0.field457 - 1] * 128 + arg0.field413 * 64;
            if (arg1 < 0) {
                if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg0.field456 = 1280;
                        } else if (var5 > var7) {
                            arg0.field456 = 1792;
                        } else {
                            arg0.field456 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg0.field456 = 768;
                        } else if (var5 > var7) {
                            arg0.field456 = 256;
                        } else {
                            arg0.field456 = 512;
                        }
                    } else if (var5 < var7) {
                        arg0.field456 = 1024;
                    } else {
                        arg0.field456 = 0;
                    }
                    int var8 = arg0.field456 - arg0.field411 & 2047;
                    if (var8 > 1024) {
                        var8 -= 2048;
                    }
                    int var9 = arg0.field417;
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg0.field416;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg0.field419;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg0.field418;
                    }
                    if (var9 == -1) {
                        var9 = arg0.field416;
                    }
                    arg0.field434 = var9;
                    int var10 = 4;
                    if (arg0.field456 != arg0.field411 && arg0.field431 == -1) {
                        var10 = 2;
                    }
                    if (arg0.field457 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field457 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field461 > 0 && arg0.field457 > 1) {
                        var10 = 8;
                        --arg0.field461;
                    }
                    if (arg0.field460[arg0.field457 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field434 == arg0.field416 && arg0.field420 != -1) {
                        arg0.field434 = arg0.field420;
                    }
                    if (var4 < var6) {
                        arg0.field409 += var10;
                        if (arg0.field409 > var6) {
                            arg0.field409 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field409 -= var10;
                        if (arg0.field409 < var6) {
                            arg0.field409 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field410 += var10;
                        if (arg0.field410 > var7) {
                            arg0.field410 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field410 -= var10;
                        if (arg0.field410 < var7) {
                            arg0.field410 = var7;
                        }
                    }
                    if (arg0.field409 == var6 && arg0.field410 == var7) {
                        --arg0.field457;
                        if (arg0.field462 > 0) {
                            --arg0.field462;
                            return;
                        }
                    }
                } else {
                    arg0.field409 = var6;
                    arg0.field410 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;B)V")
    public final void method524(PathingEntity arg0, byte arg1) {
        if (arg1 != 9) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0.field431 != -1 && arg0.field431 < 32768) {
            NpcEntity var4 = this.field1537[arg0.field431];
            if (var4 != null) {
                int var5 = arg0.field409 - var4.field409;
                int var6 = arg0.field410 - var4.field410;
                if (var5 != 0 || var6 != 0) {
                    arg0.field456 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field431 >= 32768) {
            int var7 = arg0.field431 - 32768;
            if (this.field1185 == var7) {
                var7 = this.field1586;
            }
            PlayerEntity var8 = this.field1587[var7];
            if (var8 != null) {
                int var9 = arg0.field409 - var8.field409;
                int var10 = arg0.field410 - var8.field410;
                if (var9 != 0 || var10 != 0) {
                    arg0.field456 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field432 != 0 || arg0.field433 != 0) && (arg0.field457 == 0 || arg0.field461 > 0)) {
            int var11 = arg0.field409 - (arg0.field432 - this.field1366 - this.field1366) * 64;
            int var12 = arg0.field410 - (arg0.field433 - this.field1367 - this.field1367) * 64;
            if (var11 != 0 || var12 != 0) {
                arg0.field456 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
            }
            arg0.field432 = 0;
            arg0.field433 = 0;
        }
        int var13 = arg0.field456 - arg0.field411 & 2047;
        if (var13 != 0) {
            if (var13 >= 32 && var13 <= 2016) {
                if (var13 > 1024) {
                    arg0.field411 -= 32;
                } else {
                    arg0.field411 += 32;
                }
            } else {
                arg0.field411 = arg0.field456;
            }
            arg0.field411 &= 2047;
            if (arg0.field434 == arg0.field414 && arg0.field456 != arg0.field411) {
                if (arg0.field415 != -1) {
                    arg0.field434 = arg0.field415;
                    return;
                }
                arg0.field434 = arg0.field416;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;B)V")
    public final void method525(PathingEntity arg0, byte arg1) {
        if (arg1 != 4) {
            this.field1342 = null;
        }
        arg0.field412 = false;
        if (arg0.field434 != -1) {
            SeqType var3 = SeqType.field1110[arg0.field434];
            ++arg0.field436;
            if (arg0.field435 < var3.field1111 && arg0.field436 > var3.method384(arg0.field435, true)) {
                arg0.field436 = 0;
                ++arg0.field435;
            }
            if (arg0.field435 >= var3.field1111) {
                arg0.field436 = 0;
                arg0.field435 = 0;
            }
        }
        if (arg0.field442 != -1 && field1633 >= arg0.field445) {
            if (arg0.field443 < 0) {
                arg0.field443 = 0;
            }
            SeqType var4 = SpotAnimType.field1130[arg0.field442].field1134;
            ++arg0.field444;
            while (arg0.field443 < var4.field1111 && arg0.field444 > var4.method384(arg0.field443, true)) {
                arg0.field444 -= var4.method384(arg0.field443, true);
                ++arg0.field443;
            }
            if (arg0.field443 >= var4.field1111 && (arg0.field443 < 0 || arg0.field443 >= var4.field1111)) {
                arg0.field442 = -1;
            }
        }
        if (arg0.field437 != -1 && arg0.field440 <= 1) {
            SeqType var5 = SeqType.field1110[arg0.field437];
            if (var5.field1122 == 1 && arg0.field462 > 0 && arg0.field451 <= field1633 && arg0.field452 < field1633) {
                arg0.field440 = 1;
                return;
            }
        }
        if (arg0.field437 != -1 && arg0.field440 == 0) {
            SeqType var6 = SeqType.field1110[arg0.field437];
            ++arg0.field439;
            while (arg0.field438 < var6.field1111 && arg0.field439 > var6.method384(arg0.field438, true)) {
                arg0.field439 -= var6.method384(arg0.field438, true);
                ++arg0.field438;
            }
            if (arg0.field438 >= var6.field1111) {
                arg0.field438 -= var6.field1115;
                ++arg0.field441;
                if (arg0.field441 >= var6.field1121) {
                    arg0.field437 = -1;
                }
                if (arg0.field438 < 0 || arg0.field438 >= var6.field1111) {
                    arg0.field437 = -1;
                }
            }
            arg0.field412 = var6.field1117;
        }
        if (arg0.field440 > 0) {
            --arg0.field440;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method526(byte arg0) {
        if (this.field1546) {
            this.field1546 = false;
            this.field1189.method269((byte) 7, 4, super.field13, 0);
            this.field1190.method269((byte) 7, 357, super.field13, 0);
            this.field1191.method269((byte) 7, 4, super.field13, 722);
            this.field1192.method269((byte) 7, 205, super.field13, 743);
            this.field1193.method269((byte) 7, 0, super.field13, 0);
            this.field1194.method269((byte) 7, 4, super.field13, 516);
            this.field1195.method269((byte) 7, 205, super.field13, 516);
            this.field1196.method269((byte) 7, 357, super.field13, 496);
            this.field1197.method269((byte) 7, 338, super.field13, 0);
            this.field1517 = true;
            this.field1282 = true;
            this.field1353 = true;
            this.field1521 = true;
            if (this.field1487 != 2) {
                this.field1616.method269((byte) 7, 4, super.field13, 4);
                this.field1615.method269((byte) 7, 4, super.field13, 550);
            }
        }
        if (this.field1487 == 2) {
            this.method472(424);
        }
        if (this.field1364 && this.field1497 == 1) {
            this.field1517 = true;
        }
        if (this.field1438 != -1) {
            boolean var2 = this.method441(false, this.field1438, this.field1325);
            if (var2) {
                this.field1517 = true;
            }
        }
        if (this.field1254 == 2) {
            this.field1517 = true;
        }
        if (this.field1392 == 2) {
            this.field1517 = true;
        }
        if (this.field1517) {
            this.method515((byte) -103);
            this.field1517 = false;
        }
        if (this.field1573 == -1) {
            this.field1314.field87 = this.field1452 - this.field1465 - 77;
            if (super.field21 > 448 && super.field21 < 560 && super.field22 > 332) {
                this.method552(77, false, 463, super.field22 - 357, this.field1314, 0, 0, super.field21 - 17, this.field1452);
            }
            int var3 = this.field1452 - 77 - this.field1314.field87;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1452 - 77) {
                var3 = this.field1452 - 77;
            }
            if (this.field1465 != var3) {
                this.field1465 = var3;
                this.field1282 = true;
            }
        }
        if (this.field1573 != -1) {
            boolean var4 = this.method441(false, this.field1573, this.field1325);
            if (var4) {
                this.field1282 = true;
            }
        }
        if (this.field1254 == 3) {
            this.field1282 = true;
        }
        if (this.field1392 == 3) {
            this.field1282 = true;
        }
        if (this.field1433 != null) {
            this.field1282 = true;
        }
        if (this.field1364 && this.field1497 == 2) {
            this.field1282 = true;
        }
        if (this.field1282) {
            this.method450(false);
            this.field1282 = false;
        }
        if (this.field1487 == 2) {
            this.method504(-892);
            this.field1615.method269((byte) 7, 4, super.field13, 550);
        }
        if (this.field1576 != -1) {
            this.field1353 = true;
        }
        if (this.field1353) {
            if (this.field1576 != -1 && this.field1576 == this.field1232) {
                this.field1576 = -1;
                this.field1566.method228((byte) 0, 243);
                this.field1566.method229(this.field1232);
            }
            this.field1353 = false;
            this.field1477.method268(3);
            this.field1291.method212(0, 0, 0);
            if (this.field1438 == -1) {
                if (this.field1421[this.field1232] != -1) {
                    if (this.field1232 == 0) {
                        this.field1466.method212(0, 10, 22);
                    }
                    if (this.field1232 == 1) {
                        this.field1467.method212(0, 8, 54);
                    }
                    if (this.field1232 == 2) {
                        this.field1467.method212(0, 8, 82);
                    }
                    if (this.field1232 == 3) {
                        this.field1468.method212(0, 8, 110);
                    }
                    if (this.field1232 == 4) {
                        this.field1470.method212(0, 8, 153);
                    }
                    if (this.field1232 == 5) {
                        this.field1470.method212(0, 8, 181);
                    }
                    if (this.field1232 == 6) {
                        this.field1469.method212(0, 9, 209);
                    }
                }
                if (this.field1421[0] != -1 && (this.field1576 != 0 || field1633 % 20 < 10)) {
                    this.field1422[0].method212(0, 13, 29);
                }
                if (this.field1421[1] != -1 && (this.field1576 != 1 || field1633 % 20 < 10)) {
                    this.field1422[1].method212(0, 11, 53);
                }
                if (this.field1421[2] != -1 && (this.field1576 != 2 || field1633 % 20 < 10)) {
                    this.field1422[2].method212(0, 11, 82);
                }
                if (this.field1421[3] != -1 && (this.field1576 != 3 || field1633 % 20 < 10)) {
                    this.field1422[3].method212(0, 12, 115);
                }
                if (this.field1421[4] != -1 && (this.field1576 != 4 || field1633 % 20 < 10)) {
                    this.field1422[4].method212(0, 13, 153);
                }
                if (this.field1421[5] != -1 && (this.field1576 != 5 || field1633 % 20 < 10)) {
                    this.field1422[5].method212(0, 11, 180);
                }
                if (this.field1421[6] != -1 && (this.field1576 != 6 || field1633 % 20 < 10)) {
                    this.field1422[6].method212(0, 13, 208);
                }
            }
            this.field1477.method269((byte) 7, 160, super.field13, 516);
            this.field1476.method268(3);
            this.field1290.method212(0, 0, 0);
            if (this.field1438 == -1) {
                if (this.field1421[this.field1232] != -1) {
                    if (this.field1232 == 7) {
                        this.field1268.method212(0, 0, 42);
                    }
                    if (this.field1232 == 8) {
                        this.field1269.method212(0, 0, 74);
                    }
                    if (this.field1232 == 9) {
                        this.field1269.method212(0, 0, 102);
                    }
                    if (this.field1232 == 10) {
                        this.field1270.method212(0, 1, 130);
                    }
                    if (this.field1232 == 11) {
                        this.field1272.method212(0, 0, 173);
                    }
                    if (this.field1232 == 12) {
                        this.field1272.method212(0, 0, 201);
                    }
                    if (this.field1232 == 13) {
                        this.field1271.method212(0, 0, 229);
                    }
                }
                if (this.field1421[8] != -1 && (this.field1576 != 8 || field1633 % 20 < 10)) {
                    this.field1422[7].method212(0, 2, 74);
                }
                if (this.field1421[9] != -1 && (this.field1576 != 9 || field1633 % 20 < 10)) {
                    this.field1422[8].method212(0, 3, 102);
                }
                if (this.field1421[10] != -1 && (this.field1576 != 10 || field1633 % 20 < 10)) {
                    this.field1422[9].method212(0, 4, 137);
                }
                if (this.field1421[11] != -1 && (this.field1576 != 11 || field1633 % 20 < 10)) {
                    this.field1422[10].method212(0, 2, 174);
                }
                if (this.field1421[12] != -1 && (this.field1576 != 12 || field1633 % 20 < 10)) {
                    this.field1422[11].method212(0, 2, 201);
                }
                if (this.field1421[13] != -1 && (this.field1576 != 13 || field1633 % 20 < 10)) {
                    this.field1422[12].method212(0, 2, 226);
                }
            }
            this.field1476.method269((byte) 7, 466, super.field13, 496);
            this.field1616.method268(3);
        }
        if (this.field1521) {
            this.field1521 = false;
            this.field1475.method268(3);
            this.field1289.method212(0, 0, 0);
            this.field1361.method215(28, (byte) 6, 55, true, "Public chat", 16777215);
            if (this.field1491 == 0) {
                this.field1361.method215(41, (byte) 6, 55, true, "On", 65280);
            }
            if (this.field1491 == 1) {
                this.field1361.method215(41, (byte) 6, 55, true, "Friends", 16776960);
            }
            if (this.field1491 == 2) {
                this.field1361.method215(41, (byte) 6, 55, true, "Off", 16711680);
            }
            if (this.field1491 == 3) {
                this.field1361.method215(41, (byte) 6, 55, true, "Hide", 65535);
            }
            this.field1361.method215(28, (byte) 6, 184, true, "Private chat", 16777215);
            if (this.field1635 == 0) {
                this.field1361.method215(41, (byte) 6, 184, true, "On", 65280);
            }
            if (this.field1635 == 1) {
                this.field1361.method215(41, (byte) 6, 184, true, "Friends", 16776960);
            }
            if (this.field1635 == 2) {
                this.field1361.method215(41, (byte) 6, 184, true, "Off", 16711680);
            }
            this.field1361.method215(28, (byte) 6, 324, true, "Trade/duel", 16777215);
            if (this.field1346 == 0) {
                this.field1361.method215(41, (byte) 6, 324, true, "On", 65280);
            }
            if (this.field1346 == 1) {
                this.field1361.method215(41, (byte) 6, 324, true, "Friends", 16776960);
            }
            if (this.field1346 == 2) {
                this.field1361.method215(41, (byte) 6, 324, true, "Off", 16711680);
            }
            this.field1361.method215(33, (byte) 6, 458, true, "Report abuse", 16777215);
            this.field1475.method269((byte) 7, 453, super.field13, 0);
            this.field1616.method268(3);
        }
        this.field1325 = 0;
        if (arg0 != 3) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)V")
    public final void method527(int arg0, int arg1) {
        int var3 = VarpType.field1151[arg0].field1159;
        if (var3 != 0) {
            int var4 = this.field1462[arg0];
            if (arg1 == -42638) {
                if (var3 == 1) {
                    if (var4 == 1) {
                        Pix3D.method186(-4767, 0.9D);
                    }
                    if (var4 == 2) {
                        Pix3D.method186(-4767, 0.8D);
                    }
                    if (var4 == 3) {
                        Pix3D.method186(-4767, 0.7D);
                    }
                    if (var4 == 4) {
                        Pix3D.method186(-4767, 0.6D);
                    }
                    ObjType.field1057.method117();
                    this.field1546 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field1463;
                    if (var4 == 0) {
                        this.method494(this.field1463, 0, 4);
                        this.field1463 = true;
                    }
                    if (var4 == 1) {
                        this.method494(this.field1463, -400, 4);
                        this.field1463 = true;
                    }
                    if (var4 == 2) {
                        this.method494(this.field1463, -800, 4);
                        this.field1463 = true;
                    }
                    if (var4 == 3) {
                        this.method494(this.field1463, -1200, 4);
                        this.field1463 = true;
                    }
                    if (var4 == 4) {
                        this.field1463 = false;
                    }
                    if (this.field1463 != var5 && !field1231) {
                        if (this.field1463) {
                            this.field1607 = this.field1385;
                            this.field1608 = false;
                            this.field1273.method289(2, this.field1607);
                        } else {
                            this.method435(0);
                        }
                        this.field1480 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field1508 = true;
                        this.method436(9993, 0);
                    }
                    if (var4 == 1) {
                        this.field1508 = true;
                        this.method436(9993, -400);
                    }
                    if (var4 == 2) {
                        this.field1508 = true;
                        this.method436(9993, -800);
                    }
                    if (var4 == 3) {
                        this.field1508 = true;
                        this.method436(9993, -1200);
                    }
                    if (var4 == 4) {
                        this.field1508 = false;
                    }
                }
                if (var3 == 5) {
                    this.field1600 = var4;
                }
                if (var3 == 6) {
                    this.field1552 = var4;
                }
                if (var3 == 8) {
                    this.field1540 = var4;
                    this.field1282 = true;
                }
                if (var3 == 9) {
                    this.field1450 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBIII)V")
    private final void method528(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -2) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg2 >= 1 && arg7 >= 1 && arg2 <= 102 && arg7 <= 102) {
            if (field1231 && this.field1224 != arg1) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg6 == 0) {
                var10 = this.field1420.method90(arg1, arg2, arg7);
            }
            if (arg6 == 1) {
                var10 = this.field1420.method91(false, arg2, arg7, arg1);
            }
            if (arg6 == 2) {
                var10 = this.field1420.method92(arg1, arg2, arg7);
            }
            if (arg6 == 3) {
                var10 = this.field1420.method93(arg1, arg2, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field1420.method94(arg1, arg2, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg6 == 0) {
                    this.field1420.method81(arg2, arg7, arg1, 0);
                    LocType var18 = LocType.method334(var15);
                    if (var18.field943) {
                        this.field1211[arg1].method366(29274, arg2, arg7, var16, var18.field944, var17);
                    }
                }
                if (arg6 == 1) {
                    this.field1420.method82(arg7, true, arg1, arg2);
                }
                if (arg6 == 2) {
                    this.field1420.method83(arg7, arg2, -1280, arg1);
                    LocType var19 = LocType.method334(var15);
                    if (var19.field941 + arg2 > 103 || var19.field941 + arg7 > 103 || var19.field942 + arg2 > 103 || var19.field942 + arg7 > 103) {
                        return;
                    }
                    if (var19.field943) {
                        this.field1211[arg1].method367(18910, arg7, var19.field941, arg2, var19.field942, var17, var19.field944);
                    }
                }
                if (arg6 == 3) {
                    this.field1420.method84((byte) 7, arg2, arg1, arg7);
                    LocType var20 = LocType.method334(var15);
                    if (var20.field943 && var20.field945) {
                        this.field1211[arg1].method369(0, arg2, arg7);
                    }
                }
            }
            if (arg5 >= 0) {
                int var21 = arg1;
                if (arg1 < 3 && (this.field1343[1][arg2][arg7] & 2) == 2) {
                    var21 = arg1 + 1;
                }
                World.method31(this.field1337, arg3, this.field1420, var21, arg2, this.field1211[arg1], arg0, arg1, 34324, arg5, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method529(int arg0) {
        if (arg0 != 8) {
            this.field1596 = this.field1563.method239();
        }
        if (super.field27 == 1) {
            int var2 = super.field28 - 25 - 550;
            int var3 = super.field29 - 5 - 4;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1574 + this.field1560 & 2047;
                int var5 = Pix3D.field652[var4];
                int var6 = Pix3D.field653[var4];
                int var7 = (this.field1483 + 256) * var5 >> 8;
                int var8 = (this.field1483 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = field1239.field409 + var9 >> 7;
                int var12 = field1239.field410 - var10 >> 7;
                boolean var13 = this.method499(true, 0, 0, var11, 0, 1, field1239.field458[0], 0, var12, 0, field1239.field459[0], false);
                if (var13) {
                    this.field1566.method229(var2);
                    this.field1566.method229(var3);
                    this.field1566.method230(this.field1560);
                    this.field1566.method229(57);
                    this.field1566.method229(this.field1574);
                    this.field1566.method229(this.field1483);
                    this.field1566.method229(89);
                    this.field1566.method230(field1239.field409);
                    this.field1566.method230(field1239.field410);
                    this.field1566.method229(this.field1236);
                    this.field1566.method229(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1228 = Integer.parseInt(this.getParameter("nodeid"));
        field1229 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method432(-21519);
        } else {
            method486(-136);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1230 = false;
        } else {
            field1230 = true;
        }
        this.method2(765, 40169, 503);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = (field1239.field409 >> 7) + this.field1366;
        int var4 = (field1239.field410 >> 7) + this.field1367;
        if (var3 >= 2944 && var3 < 3392 && var4 >= 3520 && var4 < 6400) {
            this.field1250 = (var4 - 3520) / 8 + 1;
        } else if (var3 >= 2944 && var3 < 3392 && var4 >= 9920 && var4 < 12800) {
            this.field1250 = (var4 - 9920) / 8 + 1;
        } else {
            this.field1250 = 0;
        }
        this.field1288 = 0;
        if (var3 >= 3328 && var3 < 3392 && var4 >= 3200 && var4 < 3264) {
            int var5 = var3 & 63;
            int var6 = var4 & 63;
            if (var5 >= 4 && var5 <= 29 && var6 >= 44 && var6 <= 58) {
                this.field1288 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 44 && var6 <= 58) {
                this.field1288 = 1;
            }
            if (var5 >= 4 && var5 <= 29 && var6 >= 25 && var6 <= 39) {
                this.field1288 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 25 && var6 <= 39) {
                this.field1288 = 1;
            }
            if (var5 >= 4 && var5 <= 29 && var6 >= 6 && var6 <= 20) {
                this.field1288 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 6 && var6 <= 20) {
                this.field1288 = 1;
            }
        }
        if (this.field1288 == 0 && var3 >= 3328 && var3 <= 3393 && var4 >= 3203 && var4 <= 3325) {
            this.field1288 = 2;
        }
        this.field1536 = 0;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field1536 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field1536 = 1;
        }
        if (this.field1536 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field1536 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method531(boolean arg0) {
        if (this.field1492 >= 2 || this.field1277 != 0 || this.field1547 != 0) {
            String var2;
            if (this.field1277 == 1 && this.field1492 < 2) {
                var2 = "Use " + this.field1281 + " with...";
            } else if (this.field1547 == 1 && this.field1492 < 2) {
                var2 = this.field1550 + "...";
            } else {
                var2 = this.field1210[this.field1492 - 1];
            }
            if (this.field1492 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1492 - 2) + " more options";
            }
            this.field1362.method220(field1633 / 1000, (byte) -37, 15, 4, 16777215, var2, true);
            if (arg0) {
                this.field1342 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIBIII)V")
    private final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1302.method258(); var12 != null; var12 = (LocSpawned) this.field1302.method260(true)) {
            if (var12.field728 == arg1 && var12.field730 == arg5 && var12.field731 == arg0 && var12.field729 == arg2) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field728 = arg1;
            var11.field729 = arg2;
            var11.field730 = arg5;
            var11.field731 = arg0;
            this.method549(var11, -388);
            this.field1302.method255(var11);
        }
        var11.field735 = arg4;
        var11.field737 = arg8;
        var11.field736 = arg9;
        if (arg6 != 2) {
            this.field1596 = -1;
        }
        var11.field738 = arg7;
        var11.field739 = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = Model.field607[var8];
            int var14 = Model.field608[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field607[var9];
            int var17 = Model.field608[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1297 = arg5 - var10;
        this.field1298 = arg0 - var11;
        if (arg4 != 0) {
            this.field1342 = null;
        }
        this.field1299 = arg3 - var12;
        this.field1300 = arg6;
        this.field1301 = arg2;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method534(int arg0) {
        int var2 = this.field1362.method216(-525, "Choose Option");
        if (arg0 != 1) {
            this.field1566.method229(215);
        }
        for (int var3 = 0; var3 < this.field1492; ++var3) {
            int var11 = this.field1362.method216(-525, this.field1210[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1492 * 15 + 21;
        if (super.field28 > 4 && super.field29 > 4 && super.field28 < 516 && super.field29 < 338) {
            int var5 = super.field28 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field29 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1364 = true;
            this.field1497 = 0;
            this.field1498 = var5;
            this.field1499 = var6;
            this.field1500 = var2;
            this.field1501 = this.field1492 * 15 + 22;
        }
        if (super.field28 > 553 && super.field29 > 205 && super.field28 < 743 && super.field29 < 466) {
            int var7 = super.field28 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field29 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1364 = true;
            this.field1497 = 1;
            this.field1498 = var7;
            this.field1499 = var8;
            this.field1500 = var2;
            this.field1501 = this.field1492 * 15 + 22;
        }
        if (super.field28 > 17 && super.field29 > 357 && super.field28 < 496 && super.field29 < 453) {
            int var9 = super.field28 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field29 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1364 = true;
            this.field1497 = 2;
            this.field1498 = var9;
            this.field1499 = var10;
            this.field1500 = var2;
            this.field1501 = this.field1492 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)Z")
    public final boolean method535(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
            return signlink.wavereplay();
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1237 && !this.field1443 && !this.field1527) {
            ++field1624;
            if (arg0 != 0) {
                this.field1342 = null;
            }
            if (!this.field1220) {
                this.method476(6);
            } else {
                this.method526((byte) 3);
            }
            this.field1221 = 0;
        } else {
            this.method455(3);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method536(int arg0, long arg1) {
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field1371; ++var5) {
                if (this.field1326[var5] == arg1) {
                    --this.field1371;
                    this.field1517 = true;
                    for (int var6 = var5; var6 < this.field1371; ++var6) {
                        this.field1294[var6] = this.field1294[var6 + 1];
                        this.field1558[var6] = this.field1558[var6 + 1];
                        this.field1326[var6] = this.field1326[var6 + 1];
                    }
                    this.field1566.method228((byte) 0, 61);
                    this.field1566.method235(arg1, this.field1305);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method537(int arg0) {
        int var2 = 22 / arg0;
        this.field1566.method228((byte) 0, 245);
        if (this.field1438 != -1) {
            this.field1438 = -1;
            this.field1517 = true;
            this.field1459 = false;
            this.field1353 = true;
        }
        if (this.field1573 != -1) {
            this.field1573 = -1;
            this.field1282 = true;
            this.field1459 = false;
        }
        this.field1262 = -1;
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (this.field1555 == arg0) {
            this.field1324 = true;
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field1351) {
                    ++this.field1565;
                    this.method479((byte) 7);
                    this.method479((byte) 7);
                    this.method561(676);
                    ++var4;
                    if (var4 > 10) {
                        long var6 = System.currentTimeMillis();
                        int var8 = (int) (var6 - var2) / 10 - var5;
                        var5 = 40 - var8;
                        if (var5 < 5) {
                            var5 = 5;
                        }
                        var4 = 0;
                        var2 = var6;
                    }
                    try {
                        Thread.sleep((long) var5);
                    } catch (Exception var9) {
                    }
                }
            } catch (Exception var10) {
            }
            this.field1324 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Z)V")
    private final void method539(int arg0, Packet arg1, boolean arg2) {
        this.field1220 &= arg2;
        for (int var4 = 0; var4 < this.field1590; ++var4) {
            int var5 = this.field1591[var4];
            NpcEntity var6 = this.field1537[var5];
            int var7 = arg1.method239();
            if ((var7 & 1) == 1) {
                int var8 = arg1.method239();
                int var9 = arg1.method239();
                var6.method128(var8, var9, -500);
                var6.field428 = field1633 + 300;
                var6.field429 = arg1.method239();
                var6.field430 = arg1.method239();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg1.method241();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field437 == var10) {
                    var6.field441 = 0;
                }
                int var11 = arg1.method239();
                if (var6.field437 == var10 && var10 != -1) {
                    int var12 = SeqType.field1110[var10].field1124;
                    if (var12 == 1) {
                        var6.field438 = 0;
                        var6.field439 = 0;
                        var6.field440 = var11;
                        var6.field441 = 0;
                    }
                    if (var12 == 2) {
                        var6.field441 = 0;
                    }
                } else if (var10 == -1 || var6.field437 == -1 || SeqType.field1110[var10].field1118 >= SeqType.field1110[var6.field437].field1118) {
                    var6.field437 = var10;
                    var6.field438 = 0;
                    var6.field439 = 0;
                    var6.field440 = var11;
                    var6.field441 = 0;
                    var6.field462 = var6.field457;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field431 = arg1.method241();
                if (var6.field431 == 65535) {
                    var6.field431 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field421 = arg1.method246();
                var6.field422 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg1.method239();
                int var14 = arg1.method239();
                var6.method128(var13, var14, -500);
                var6.field428 = field1633 + 300;
                var6.field429 = arg1.method239();
                var6.field430 = arg1.method239();
            }
            if ((var7 & 32) == 32) {
                var6.field464 = NpcType.method344(arg1.method241());
                var6.field416 = var6.field464.field990;
                var6.field417 = var6.field464.field991;
                var6.field418 = var6.field464.field992;
                var6.field419 = var6.field464.field993;
                var6.field414 = var6.field464.field989;
            }
            if ((var7 & 64) == 64) {
                var6.field442 = arg1.method241();
                int var15 = arg1.method244();
                var6.field446 = var15 >> 16;
                var6.field445 = (var15 & 65535) + field1633;
                var6.field443 = 0;
                var6.field444 = 0;
                if (var6.field445 > field1633) {
                    var6.field443 = -1;
                }
                if (var6.field442 == 65535) {
                    var6.field442 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field432 = arg1.method241();
                var6.field433 = arg1.method241();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljb;III)V")
    public final void method540(Pix32 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 4 || arg1 > 4) {
            field1441 = !field1441;
        }
        int var5 = this.field1574 + this.field1560 & 2047;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field607[var5];
            int var8 = Model.field608[var5];
            int var9 = var7 * 256 / (this.field1483 + 256);
            int var10 = var8 * 256 / (this.field1483 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method205(83 - var12 - arg0.field678 / 2 - 4, (byte) 4, var11 + 94 - arg0.field677 / 2 + 4, this.field1424);
            } else {
                arg0.method199(0, 83 - var12 - arg0.field678 / 2 - 4, var11 + 94 - arg0.field677 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;I)V")
    public final void method541(Pix8 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1494.length; ++var4) {
            this.field1494[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1494[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != 32758) {
            this.field1555 = -343;
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1495[var16] = (this.field1494[var16 - 1] + this.field1494[var16 + 1] + this.field1494[var16 - 128] + this.field1494[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1494;
            this.field1494 = this.field1495;
            this.field1495 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field684; ++var8) {
                for (int var9 = 0; var9 < arg0.field683; ++var9) {
                    if (arg0.field681[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field685;
                        int var11 = var8 + 16 + arg0.field686;
                        int var12 = (var11 << 7) + var10;
                        this.field1494[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public final void method542(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1596 = this.field1563.method239();
        }
        for (SpotAnimEntity var3 = (SpotAnimEntity) this.field1512.method258(); var3 != null; var3 = (SpotAnimEntity) this.field1512.method260(true)) {
            if (this.field1224 == var3.field615 && !var3.field621) {
                if (field1633 >= var3.field614) {
                    var3.method164(630, this.field1325);
                    if (var3.field621) {
                        var3.method120();
                    } else {
                        this.field1420.method75(var3, var3.field618, 0, -1, false, var3.field615, var3.field617, 60, this.field1267, var3.field616);
                    }
                }
            } else {
                var3.method120();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!this.field1237 && !this.field1443 && !this.field1527) {
            ++field1633;
            if (!this.field1220) {
                this.method511(0);
            } else {
                this.method482(this.field1488);
            }
            this.method492(false);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method543(int arg0, Packet arg1, int arg2) {
        arg1.method249(0);
        int var4 = arg1.method250(1, 0);
        if (arg2 != -16477) {
            this.field1305 = 137;
        }
        if (var4 != 0) {
            int var5 = arg1.method250(2, 0);
            if (var5 == 0) {
                this.field1591[this.field1590++] = this.field1586;
            } else if (var5 == 1) {
                int var6 = arg1.method250(3, 0);
                field1239.method125(var6, false, 37435);
                int var7 = arg1.method250(1, 0);
                if (var7 == 1) {
                    this.field1591[this.field1590++] = this.field1586;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method250(3, 0);
                field1239.method125(var8, true, 37435);
                int var9 = arg1.method250(3, 0);
                field1239.method125(var9, true, 37435);
                int var10 = arg1.method250(1, 0);
                if (var10 == 1) {
                    this.field1591[this.field1590++] = this.field1586;
                }
            } else if (var5 == 3) {
                this.field1224 = arg1.method250(2, 0);
                int var11 = arg1.method250(7, 0);
                int var12 = arg1.method250(7, 0);
                int var13 = arg1.method250(1, 0);
                field1239.method124(var11, var13 == 1, 0, var12);
                int var14 = arg1.method250(1, 0);
                if (var14 == 1) {
                    this.field1591[this.field1590++] = this.field1586;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method544(int arg0, String arg1, String arg2, int arg3) {
        if (arg0 == 0 && this.field1398 != -1) {
            this.field1433 = arg2;
            super.field27 = 0;
        }
        if (this.field1573 == -1) {
            this.field1282 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1247[var5] = this.field1247[var5 - 1];
            this.field1248[var5] = this.field1248[var5 - 1];
            this.field1249[var5] = this.field1249[var5 - 1];
        }
        this.field1247[0] = arg0;
        this.field1248[0] = arg1;
        if (arg3 == 0) {
            this.field1249[0] = arg2;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field1351 = false;
        while (this.field1324) {
            this.field1351 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field1295 = null;
        this.field1296 = null;
        this.field1634 = null;
        this.field1471 = null;
        this.field1472 = null;
        this.field1473 = null;
        int var2 = 86 / arg0;
        this.field1474 = null;
        this.field1494 = null;
        this.field1495 = null;
        this.field1629 = null;
        this.field1630 = null;
        this.field1403 = null;
        this.field1404 = null;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method546(int arg0) {
        if (arg0 > 0) {
            if (this.field1277 == 0 && this.field1547 == 0) {
                this.field1210[this.field1492] = "Walk here";
                this.field1332[this.field1492] = 660;
                this.field1330[this.field1492] = super.field21;
                this.field1331[this.field1492] = super.field22;
                ++this.field1492;
            }
            int var2 = -1;
            for (int var3 = 0; var3 < Model.field605; ++var3) {
                int var4 = Model.field606[var3];
                int var5 = var4 & 127;
                int var6 = var4 >> 7 & 127;
                int var7 = var4 >> 29 & 3;
                int var8 = var4 >> 14 & 32767;
                if (var2 != var4) {
                    var2 = var4;
                    if (var7 == 2 && this.field1420.method94(this.field1224, var5, var6, var4) >= 0) {
                        LocType var9 = LocType.method334(var8);
                        if (this.field1277 == 1) {
                            this.field1210[this.field1492] = "Use " + this.field1281 + " with @cya@" + var9.field937;
                            this.field1332[this.field1492] = 450;
                            this.field1333[this.field1492] = var4;
                            this.field1330[this.field1492] = var5;
                            this.field1331[this.field1492] = var6;
                            ++this.field1492;
                        } else if (this.field1547 == 1) {
                            if ((this.field1549 & 4) == 4) {
                                this.field1210[this.field1492] = this.field1550 + " @cya@" + var9.field937;
                                this.field1332[this.field1492] = 55;
                                this.field1333[this.field1492] = var4;
                                this.field1330[this.field1492] = var5;
                                this.field1331[this.field1492] = var6;
                                ++this.field1492;
                            }
                        } else {
                            if (var9.field953 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var9.field953[var10] != null) {
                                        this.field1210[this.field1492] = var9.field953[var10] + " @cya@" + var9.field937;
                                        if (var10 == 0) {
                                            this.field1332[this.field1492] = 285;
                                        }
                                        if (var10 == 1) {
                                            this.field1332[this.field1492] = 504;
                                        }
                                        if (var10 == 2) {
                                            this.field1332[this.field1492] = 364;
                                        }
                                        if (var10 == 3) {
                                            this.field1332[this.field1492] = 581;
                                        }
                                        if (var10 == 4) {
                                            this.field1332[this.field1492] = 1501;
                                        }
                                        this.field1333[this.field1492] = var4;
                                        this.field1330[this.field1492] = var5;
                                        this.field1331[this.field1492] = var6;
                                        ++this.field1492;
                                    }
                                }
                            }
                            this.field1210[this.field1492] = "Examine @cya@" + var9.field937;
                            this.field1332[this.field1492] = 1175;
                            this.field1333[this.field1492] = var4;
                            this.field1330[this.field1492] = var5;
                            this.field1331[this.field1492] = var6;
                            ++this.field1492;
                        }
                    }
                    if (var7 == 1) {
                        NpcEntity var11 = this.field1537[var8];
                        if (var11.field464.field986 == 1 && (var11.field409 & 127) == 64 && (var11.field410 & 127) == 64) {
                            for (int var12 = 0; var12 < this.field1538; ++var12) {
                                NpcEntity var13 = this.field1537[this.field1539[var12]];
                                if (var13 != null && var11 != var13 && var13.field464.field986 == 1 && var11.field409 == var13.field409 && var11.field410 == var13.field410) {
                                    this.method512(0, var6, var13.field464, var5, this.field1539[var12]);
                                }
                            }
                        }
                        this.method512(0, var6, var11.field464, var5, var8);
                    }
                    if (var7 == 0) {
                        PlayerEntity var14 = this.field1587[var8];
                        if ((var14.field409 & 127) == 64 && (var14.field410 & 127) == 64) {
                            for (int var15 = 0; var15 < this.field1538; ++var15) {
                                NpcEntity var18 = this.field1537[this.field1539[var15]];
                                if (var18 != null && var18.field464.field986 == 1 && var14.field409 == var18.field409 && var14.field410 == var18.field410) {
                                    this.method512(0, var6, var18.field464, var5, this.field1539[var15]);
                                }
                            }
                            for (int var16 = 0; var16 < this.field1588; ++var16) {
                                PlayerEntity var17 = this.field1587[this.field1589[var16]];
                                if (var17 != null && var14 != var17 && var14.field409 == var17.field409 && var14.field410 == var17.field410) {
                                    this.method489((byte) 10, this.field1589[var16], var5, var6, var17);
                                }
                            }
                        }
                        this.method489((byte) 10, var8, var5, var6, var14);
                    }
                    if (var7 == 3) {
                        LinkList var19 = this.field1342[this.field1224][var5][var6];
                        if (var19 != null) {
                            for (ObjStackEntity var20 = (ObjStackEntity) var19.method259((byte) 1); var20 != null; var20 = (ObjStackEntity) var19.method261(15991)) {
                                ObjType var21 = ObjType.method350(var20.field502);
                                if (this.field1277 == 1) {
                                    this.field1210[this.field1492] = "Use " + this.field1281 + " with @lre@" + var21.field1019;
                                    this.field1332[this.field1492] = 217;
                                    this.field1333[this.field1492] = var20.field502;
                                    this.field1330[this.field1492] = var5;
                                    this.field1331[this.field1492] = var6;
                                    ++this.field1492;
                                } else if (this.field1547 == 1) {
                                    if ((this.field1549 & 1) == 1) {
                                        this.field1210[this.field1492] = this.field1550 + " @lre@" + var21.field1019;
                                        this.field1332[this.field1492] = 965;
                                        this.field1333[this.field1492] = var20.field502;
                                        this.field1330[this.field1492] = var5;
                                        this.field1331[this.field1492] = var6;
                                        ++this.field1492;
                                    }
                                } else {
                                    for (int var22 = 4; var22 >= 0; --var22) {
                                        if (var21.field1033 != null && var21.field1033[var22] != null) {
                                            this.field1210[this.field1492] = var21.field1033[var22] + " @lre@" + var21.field1019;
                                            if (var22 == 0) {
                                                this.field1332[this.field1492] = 224;
                                            }
                                            if (var22 == 1) {
                                                this.field1332[this.field1492] = 993;
                                            }
                                            if (var22 == 2) {
                                                this.field1332[this.field1492] = 99;
                                            }
                                            if (var22 == 3) {
                                                this.field1332[this.field1492] = 746;
                                            }
                                            if (var22 == 4) {
                                                this.field1332[this.field1492] = 877;
                                            }
                                            this.field1333[this.field1492] = var20.field502;
                                            this.field1330[this.field1492] = var5;
                                            this.field1331[this.field1492] = var6;
                                            ++this.field1492;
                                        } else if (var22 == 2) {
                                            this.field1210[this.field1492] = "Take @lre@" + var21.field1019;
                                            this.field1332[this.field1492] = 99;
                                            this.field1333[this.field1492] = var20.field502;
                                            this.field1330[this.field1492] = var5;
                                            this.field1331[this.field1492] = var6;
                                            ++this.field1492;
                                        }
                                    }
                                    this.field1210[this.field1492] = "Examine @lre@" + var21.field1019;
                                    this.field1332[this.field1492] = 1102;
                                    this.field1333[this.field1492] = var20.field502;
                                    this.field1330[this.field1492] = var5;
                                    this.field1331[this.field1492] = var6;
                                    ++this.field1492;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method547(int arg0) {
        this.field1295 = new Pix8(this.field1564, "titlebox", 0);
        this.field1296 = new Pix8(this.field1564, "titlebutton", 0);
        this.field1595 += arg0;
        this.field1634 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1634[var2] = new Pix8(this.field1564, "runes", var2);
        }
        this.field1403 = new Pix32(128, 265);
        this.field1404 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1403.field672[var3] = this.field1202.field751[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1404.field672[var4] = this.field1203.field751[var4];
        }
        this.field1472 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1472[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1472[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1472[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1472[var8 + 192] = 16777215;
        }
        this.field1473 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1473[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1473[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1473[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1473[var12 + 192] = 16777215;
        }
        this.field1474 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1474[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1474[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1474[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1474[var16 + 192] = 16777215;
        }
        this.field1471 = new int[256];
        this.field1494 = new int[32768];
        this.field1495 = new int[32768];
        this.method541((Pix8) null, 32758);
        this.field1629 = new int[32768];
        this.field1630 = new int[32768];
        this.method13(638, "Connecting to fileserver", 10);
        if (!this.field1351) {
            this.field1396 = true;
            this.field1351 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(II)V")
    public final void method548(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1386) {
                this.field1386 = false;
                this.field1282 = true;
            }
            int var3 = this.field1330[arg1];
            int var4 = this.field1331[arg1];
            int var5 = this.field1332[arg1];
            int var6 = this.field1333[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 1501) {
                field1534 += this.field1367;
                if (field1534 >= 92) {
                    this.field1566.method228((byte) 0, 250);
                    this.field1566.method233(0);
                }
                this.method507((byte) 5, var6, 86, var4, var3);
            }
            if (var5 == 450 && this.method507((byte) 5, var6, 147, var4, var3)) {
                this.field1566.method230(this.field1280);
                this.field1566.method230(this.field1278);
                this.field1566.method230(this.field1279);
            }
            if (var5 == 679) {
                String var7 = this.field1210[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = JString.method310(var7.substring(var8 + 5).trim());
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1371; ++var12) {
                        if (this.field1326[var12] == var9) {
                            var11 = var12;
                            break;
                        }
                    }
                    if (var11 != -1 && this.field1558[var11] > 0) {
                        this.field1282 = true;
                        this.field1386 = false;
                        this.field1187 = true;
                        this.field1345 = "";
                        this.field1518 = 3;
                        this.field1611 = this.field1326[var11];
                        this.field1365 = "Enter message to send to " + this.field1294[var11];
                    }
                }
            }
            if (var5 == 903 || var5 == 363) {
                String var13 = this.field1210[arg1];
                int var14 = var13.indexOf("@whi@");
                if (var14 != -1) {
                    String var15 = var13.substring(var14 + 5).trim();
                    String var16 = JString.method314(JString.method311((byte) 4, JString.method310(var15)), (byte) 9);
                    boolean var17 = false;
                    for (int var18 = 0; var18 < this.field1588; ++var18) {
                        PlayerEntity var19 = this.field1587[this.field1589[var18]];
                        if (var19 != null && var19.field467 != null && var19.field467.equalsIgnoreCase(var16)) {
                            this.method499(false, 1, 0, var19.field458[0], 0, 2, field1239.field458[0], 0, var19.field459[0], 1, field1239.field459[0], false);
                            if (var5 == 903) {
                                this.field1566.method228((byte) 0, 54);
                            }
                            if (var5 == 363) {
                                this.field1566.method228((byte) 0, 135);
                            }
                            this.field1566.method230(this.field1589[var18]);
                            var17 = true;
                            break;
                        }
                    }
                    if (!var17) {
                        this.method544(0, "", "Unable to find " + var16, 0);
                    }
                }
            }
            if (var5 == 367) {
                PlayerEntity var20 = this.field1587[var6];
                if (var20 != null) {
                    this.method499(false, 1, 0, var20.field458[0], 0, 2, field1239.field458[0], 0, var20.field459[0], 1, field1239.field459[0], false);
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    this.field1566.method228((byte) 0, 210);
                    this.field1566.method230(var6);
                    this.field1566.method230(this.field1280);
                    this.field1566.method230(this.field1278);
                    this.field1566.method230(this.field1279);
                }
            }
            if (var5 == 1607) {
                NpcEntity var21 = this.field1537[var6];
                if (var21 != null) {
                    String var22;
                    if (var21.field464.field985 != null) {
                        var22 = new String(var21.field464.field985);
                    } else {
                        var22 = "It's a " + var21.field464.field984 + ".";
                    }
                    this.method544(0, "", var22, 0);
                }
            }
            if (var5 == 1102) {
                ObjType var23 = ObjType.method350(var6);
                String var24;
                if (var23.field1020 != null) {
                    var24 = new String(var23.field1020);
                } else {
                    var24 = "It's a " + var23.field1019 + ".";
                }
                this.method544(0, "", var24, 0);
            }
            if (var5 == 581) {
                if ((var6 & 3) == 0) {
                    ++field1334;
                }
                if (field1334 >= 99) {
                    this.field1566.method228((byte) 0, 87);
                    this.field1566.method233(0);
                }
                this.method507((byte) 5, var6, 204, var4, var3);
            }
            if (var5 == 960) {
                this.field1566.method228((byte) 0, 177);
                this.field1566.method230(var4);
                Component var25 = Component.field67[var4];
                if (var25.field82 != null && var25.field82[0][0] == 5) {
                    int var26 = var25.field82[0][1];
                    if (this.field1462[var26] != var25.field84[0]) {
                        this.field1462[var26] = var25.field84[0];
                        this.method527(var26, -42638);
                        this.field1517 = true;
                    }
                }
            }
            if (var5 == 55 && this.method507((byte) 5, var6, 208, var4, var3)) {
                this.field1566.method230(this.field1548);
            }
            if (var5 == 947) {
                this.method537(251);
            }
            if (var5 == 951) {
                Component var27 = Component.field67[var4];
                boolean var28 = true;
                if (var27.field76 > 0) {
                    var28 = this.method448(var27, (byte) -50);
                }
                if (var28) {
                    this.field1566.method228((byte) 0, 177);
                    this.field1566.method230(var4);
                }
            }
            if (var5 == 1175) {
                int var29 = var6 >> 14 & 32767;
                LocType var30 = LocType.method334(var29);
                String var31;
                if (var30.field938 != null) {
                    var31 = new String(var30.field938);
                } else {
                    var31 = "It's a " + var30.field937 + ".";
                }
                this.method544(0, "", var31, 0);
            }
            if (var5 == 504) {
                this.method507((byte) 5, var6, 219, var4, var3);
            }
            if (var5 == 1773) {
                ObjType var32 = ObjType.method350(var6);
                Component var33 = Component.field67[var4];
                String var34;
                if (var33 != null && var33.field69[var3] >= 100000) {
                    var34 = var33.field69[var3] + " x " + var32.field1019;
                } else if (var32.field1020 != null) {
                    var34 = new String(var32.field1020);
                } else {
                    var34 = "It's a " + var32.field1019 + ".";
                }
                this.method544(0, "", var34, 0);
            }
            if (var5 == 660) {
                if (!this.field1364) {
                    this.field1420.method102(true, super.field28 - 4, super.field29 - 4);
                } else {
                    this.field1420.method102(true, var3 - 4, var4 - 4);
                }
            }
            if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                NpcEntity var35 = this.field1537[var6];
                if (var35 != null) {
                    this.method499(false, 1, 0, var35.field458[0], 0, 2, field1239.field458[0], 0, var35.field459[0], 1, field1239.field459[0], false);
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    if (var5 == 728) {
                        this.field1566.method228((byte) 0, 180);
                    }
                    if (var5 == 963) {
                        this.field1566.method228((byte) 0, 107);
                    }
                    if (var5 == 6) {
                        if ((var6 & 3) == 0) {
                            ++field1526;
                        }
                        if (field1526 >= 124) {
                            this.field1566.method228((byte) 0, 95);
                            this.field1566.method233(0);
                        }
                        this.field1566.method228((byte) 0, 196);
                    }
                    if (var5 == 542) {
                        this.field1566.method228((byte) 0, 252);
                    }
                    if (var5 == 245) {
                        if ((var6 & 3) == 0) {
                            ++field1216;
                        }
                        if (field1216 >= 85) {
                            this.field1566.method228((byte) 0, 186);
                            this.field1566.method230(39596);
                        }
                        this.field1566.method228((byte) 0, 43);
                    }
                    this.field1566.method230(var6);
                }
            }
            if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                PlayerEntity var36 = this.field1587[var6];
                if (var36 != null) {
                    this.method499(false, 1, 0, var36.field458[0], 0, 2, field1239.field458[0], 0, var36.field459[0], 1, field1239.field459[0], false);
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    if (var5 == 1544) {
                        this.field1566.method228((byte) 0, 172);
                    }
                    if (var5 == 1101) {
                        this.field1566.method228((byte) 0, 135);
                    }
                    if (var5 == 151) {
                        ++field1486;
                        if (field1486 >= 90) {
                            this.field1566.method228((byte) 0, 171);
                            this.field1566.method230(31114);
                        }
                        this.field1566.method228((byte) 0, 165);
                    }
                    if (var5 == 1373) {
                        this.field1566.method228((byte) 0, 54);
                    }
                    this.field1566.method230(var6);
                }
            }
            if (var5 == 465) {
                this.field1566.method228((byte) 0, 177);
                this.field1566.method230(var4);
                Component var37 = Component.field67[var4];
                if (var37.field82 != null && var37.field82[0][0] == 5) {
                    int var38 = var37.field82[0][1];
                    this.field1462[var38] = 1 - this.field1462[var38];
                    this.method527(var38, -42638);
                    this.field1517 = true;
                }
            }
            if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                String var39 = this.field1210[arg1];
                int var40 = var39.indexOf("@whi@");
                if (var40 != -1) {
                    long var41 = JString.method310(var39.substring(var40 + 5).trim());
                    if (var5 == 406) {
                        this.method501(var41, (byte) 5);
                    }
                    if (var5 == 436) {
                        this.method459(var41, (byte) -117);
                    }
                    if (var5 == 557) {
                        this.method536(-443, var41);
                    }
                    if (var5 == 556) {
                        this.method485(0, var41);
                    }
                }
            }
            if (var5 == 217) {
                boolean var43 = this.method499(false, 0, 0, var3, 0, 2, field1239.field458[0], 0, var4, 0, field1239.field459[0], false);
                if (!var43) {
                    this.method499(false, 1, 0, var3, 0, 2, field1239.field458[0], 0, var4, 1, field1239.field459[0], false);
                }
                this.field1625 = super.field28;
                this.field1626 = super.field29;
                this.field1628 = 2;
                this.field1627 = 0;
                this.field1566.method228((byte) 0, 143);
                this.field1566.method230(this.field1366 + var3);
                this.field1566.method230(this.field1367 + var4);
                this.field1566.method230(var6);
                this.field1566.method230(this.field1280);
                this.field1566.method230(this.field1278);
                this.field1566.method230(this.field1279);
            }
            if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                if (var5 == 347) {
                    this.field1566.method228((byte) 0, 9);
                }
                if (var5 == 405) {
                    field1481 += var6;
                    if (field1481 >= 97) {
                        this.field1566.method228((byte) 0, 146);
                        this.field1566.method232(14953816);
                    }
                    this.field1566.method228((byte) 0, 104);
                }
                if (var5 == 478) {
                    if ((var3 & 3) == 0) {
                        ++field1238;
                    }
                    if (field1238 >= 90) {
                        this.field1566.method228((byte) 0, 74);
                    }
                    this.field1566.method228((byte) 0, 194);
                }
                if (var5 == 422) {
                    this.field1566.method228((byte) 0, 115);
                }
                if (var5 == 38) {
                    this.field1566.method228((byte) 0, 193);
                }
                this.field1566.method230(var6);
                this.field1566.method230(var3);
                this.field1566.method230(var4);
                this.field1251 = 0;
                this.field1252 = var4;
                this.field1253 = var3;
                this.field1254 = 2;
                if (Component.field67[var4].field73 == this.field1262) {
                    this.field1254 = 1;
                }
                if (Component.field67[var4].field73 == this.field1573) {
                    this.field1254 = 3;
                }
            }
            if (var5 == 265) {
                NpcEntity var45 = this.field1537[var6];
                if (var45 != null) {
                    this.method499(false, 1, 0, var45.field458[0], 0, 2, field1239.field458[0], 0, var45.field459[0], 1, field1239.field459[0], false);
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    this.field1566.method228((byte) 0, 141);
                    this.field1566.method230(var6);
                    this.field1566.method230(this.field1548);
                }
            }
            if (var5 == 900) {
                NpcEntity var46 = this.field1537[var6];
                if (var46 != null) {
                    this.method499(false, 1, 0, var46.field458[0], 0, 2, field1239.field458[0], 0, var46.field459[0], 1, field1239.field459[0], false);
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    this.field1566.method228((byte) 0, 14);
                    this.field1566.method230(var6);
                    this.field1566.method230(this.field1280);
                    this.field1566.method230(this.field1278);
                    this.field1566.method230(this.field1279);
                }
            }
            if (var5 == 881) {
                this.field1566.method228((byte) 0, 126);
                this.field1566.method230(var6);
                this.field1566.method230(var3);
                this.field1566.method230(var4);
                this.field1566.method230(this.field1280);
                this.field1566.method230(this.field1278);
                this.field1566.method230(this.field1279);
                this.field1251 = 0;
                this.field1252 = var4;
                this.field1253 = var3;
                this.field1254 = 2;
                if (Component.field67[var4].field73 == this.field1262) {
                    this.field1254 = 1;
                }
                if (Component.field67[var4].field73 == this.field1573) {
                    this.field1254 = 3;
                }
            }
            if (var5 == 965) {
                boolean var47 = this.method499(false, 0, 0, var3, 0, 2, field1239.field458[0], 0, var4, 0, field1239.field459[0], false);
                if (!var47) {
                    this.method499(false, 1, 0, var3, 0, 2, field1239.field458[0], 0, var4, 1, field1239.field459[0], false);
                }
                this.field1625 = super.field28;
                this.field1626 = super.field29;
                this.field1628 = 2;
                this.field1627 = 0;
                this.field1566.method228((byte) 0, 122);
                this.field1566.method230(this.field1366 + var3);
                this.field1566.method230(this.field1367 + var4);
                this.field1566.method230(var6);
                this.field1566.method230(this.field1548);
            }
            if (var5 == 930) {
                Component var49 = Component.field67[var4];
                this.field1547 = 1;
                this.field1548 = var4;
                this.field1549 = var49.field127;
                this.field1277 = 0;
                this.field1517 = true;
                String var50 = var49.field125;
                if (var50.indexOf(" ") != -1) {
                    var50 = var50.substring(0, var50.indexOf(" "));
                }
                String var51 = var49.field125;
                if (var51.indexOf(" ") != -1) {
                    var51 = var51.substring(var51.indexOf(" ") + 1);
                }
                this.field1550 = var50 + " " + var49.field126 + " " + var51;
                if (this.field1549 == 16) {
                    this.field1517 = true;
                    this.field1232 = 3;
                    this.field1353 = true;
                }
            } else if (var5 == 188) {
                this.field1277 = 1;
                this.field1278 = var3;
                this.field1279 = var4;
                this.field1280 = var6;
                this.field1281 = ObjType.method350(var6).field1019;
                this.field1547 = 0;
                this.field1517 = true;
            } else {
                if (var5 == 364) {
                    this.method507((byte) 5, var6, 226, var4, var3);
                }
                if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                    boolean var52 = this.method499(false, 0, 0, var3, 0, 2, field1239.field458[0], 0, var4, 0, field1239.field459[0], false);
                    if (!var52) {
                        this.method499(false, 1, 0, var3, 0, 2, field1239.field458[0], 0, var4, 1, field1239.field459[0], false);
                    }
                    this.field1625 = super.field28;
                    this.field1626 = super.field29;
                    this.field1628 = 2;
                    this.field1627 = 0;
                    if (var5 == 993) {
                        this.field1566.method228((byte) 0, 238);
                    }
                    if (var5 == 746) {
                        this.field1566.method228((byte) 0, 17);
                    }
                    if (var5 == 224) {
                        this.field1566.method228((byte) 0, 113);
                    }
                    if (var5 == 877) {
                        this.field1566.method228((byte) 0, 247);
                    }
                    if (var5 == 99) {
                        this.field1566.method228((byte) 0, 55);
                    }
                    this.field1566.method230(this.field1366 + var3);
                    this.field1566.method230(this.field1367 + var4);
                    this.field1566.method230(var6);
                }
                if (var5 == 44 && !this.field1459) {
                    this.field1566.method228((byte) 0, 239);
                    this.field1566.method230(var4);
                    this.field1459 = true;
                }
                if (var5 == 391) {
                    this.field1566.method228((byte) 0, 188);
                    this.field1566.method230(var6);
                    this.field1566.method230(var3);
                    this.field1566.method230(var4);
                    this.field1566.method230(this.field1548);
                    this.field1251 = 0;
                    this.field1252 = var4;
                    this.field1253 = var3;
                    this.field1254 = 2;
                    if (Component.field67[var4].field73 == this.field1262) {
                        this.field1254 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1573) {
                        this.field1254 = 3;
                    }
                }
                if (var5 == 651) {
                    PlayerEntity var54 = this.field1587[var6];
                    if (var54 != null) {
                        this.method499(false, 1, 0, var54.field458[0], 0, 2, field1239.field458[0], 0, var54.field459[0], 1, field1239.field459[0], false);
                        this.field1625 = super.field28;
                        this.field1626 = super.field29;
                        this.field1628 = 2;
                        this.field1627 = 0;
                        this.field1566.method228((byte) 0, 52);
                        this.field1566.method230(var6);
                        this.field1566.method230(this.field1548);
                    }
                }
                if (var5 == 34) {
                    String var55 = this.field1210[arg1];
                    int var56 = var55.indexOf("@whi@");
                    if (var56 != -1) {
                        this.method537(251);
                        this.field1313 = var55.substring(var56 + 5).trim();
                        this.field1449 = false;
                        for (int var57 = 0; var57 < Component.field67.length; ++var57) {
                            if (Component.field67[var57] != null && Component.field67[var57].field76 == 600) {
                                this.field1405 = this.field1262 = Component.field67[var57].field73;
                                break;
                            }
                        }
                    }
                }
                if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                    if (var5 == 415) {
                        if ((var4 & 3) == 0) {
                            ++field1242;
                        }
                        if (field1242 >= 55) {
                            this.field1566.method228((byte) 0, 119);
                            this.field1566.method233(0);
                        }
                        this.field1566.method228((byte) 0, 242);
                    }
                    if (var5 == 892) {
                        if ((var3 & 3) == 0) {
                            ++field1419;
                        }
                        if (field1419 >= 130) {
                            this.field1566.method228((byte) 0, 233);
                            this.field1566.method229(177);
                        }
                        this.field1566.method228((byte) 0, 183);
                    }
                    if (var5 == 596) {
                        this.field1566.method228((byte) 0, 58);
                    }
                    if (var5 == 22) {
                        this.field1566.method228((byte) 0, 48);
                    }
                    if (var5 == 602) {
                        this.field1566.method228((byte) 0, 13);
                    }
                    this.field1566.method230(var6);
                    this.field1566.method230(var3);
                    this.field1566.method230(var4);
                    this.field1251 = 0;
                    this.field1252 = var4;
                    this.field1253 = var3;
                    this.field1254 = 2;
                    if (Component.field67[var4].field73 == this.field1262) {
                        this.field1254 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1573) {
                        this.field1254 = 3;
                    }
                }
                if (var5 == 285) {
                    this.method507((byte) 5, var6, 1, var4, var3);
                }
                this.field1277 = 0;
                this.field1547 = 0;
                if (arg0 != 0) {
                    this.field1350 = !this.field1350;
                }
                this.field1517 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lob;I)V")
    private final void method549(LocSpawned arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field729 == 0) {
            var3 = this.field1420.method90(arg0.field728, arg0.field730, arg0.field731);
        }
        if (arg0.field729 == 1) {
            var3 = this.field1420.method91(false, arg0.field730, arg0.field731, arg0.field728);
        }
        if (arg0.field729 == 2) {
            var3 = this.field1420.method92(arg0.field728, arg0.field730, arg0.field731);
        }
        if (arg0.field729 == 3) {
            var3 = this.field1420.method93(arg0.field728, arg0.field730, arg0.field731);
        }
        if (var3 != 0) {
            int var7 = this.field1420.method94(arg0.field728, arg0.field730, arg0.field731, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field732 = var4;
        arg0.field734 = var5;
        arg0.field733 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILd;)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg6.field74 == 0 && arg6.field89 != null && !arg6.field88) {
            if (arg4 >= arg2 && arg5 >= arg0 && arg4 <= arg6.field77 + arg2 && arg5 <= arg6.field78 + arg0) {
                int var8 = arg6.field89.length;
                if (arg1 < 0) {
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg6.field90[var9] + arg2;
                        int var11 = arg6.field91[var9] + arg0 - arg3;
                        Component var12 = Component.field67[arg6.field89[var9]];
                        int var13 = var12.field80 + var10;
                        int var14 = var12.field81 + var11;
                        if ((var12.field85 >= 0 || var12.field112 != 0) && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                            if (var12.field85 >= 0) {
                                this.field1226 = var12.field85;
                            } else {
                                this.field1226 = var12.field72;
                            }
                        }
                        if (var12.field74 == 0) {
                            this.method550(var14, this.field1388, var13, var12.field87, arg4, arg5, var12);
                            if (var12.field86 > var12.field78) {
                                this.method552(var12.field78, true, var12.field77 + var13, arg5, var12, 0, var14, arg4, var12.field86);
                            }
                        } else {
                            if (var12.field75 == 1 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                boolean var15 = false;
                                if (var12.field76 != 0) {
                                    var15 = this.method502(true, var12);
                                }
                                if (!var15) {
                                    this.field1210[this.field1492] = var12.field128;
                                    this.field1332[this.field1492] = 951;
                                    this.field1331[this.field1492] = var12.field72;
                                    ++this.field1492;
                                }
                            }
                            if (var12.field75 == 2 && this.field1547 == 0 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                String var16 = var12.field125;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field1210[this.field1492] = var16 + " @gre@" + var12.field126;
                                this.field1332[this.field1492] = 930;
                                this.field1331[this.field1492] = var12.field72;
                                ++this.field1492;
                            }
                            if (var12.field75 == 3 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1210[this.field1492] = "Close";
                                this.field1332[this.field1492] = 947;
                                this.field1331[this.field1492] = var12.field72;
                                ++this.field1492;
                            }
                            if (var12.field75 == 4 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1210[this.field1492] = var12.field128;
                                this.field1332[this.field1492] = 465;
                                this.field1331[this.field1492] = var12.field72;
                                ++this.field1492;
                            }
                            if (var12.field75 == 5 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1210[this.field1492] = var12.field128;
                                this.field1332[this.field1492] = 960;
                                this.field1331[this.field1492] = var12.field72;
                                ++this.field1492;
                            }
                            if (var12.field75 == 6 && !this.field1459 && arg4 >= var13 && arg5 >= var14 && arg4 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1210[this.field1492] = var12.field128;
                                this.field1332[this.field1492] = 44;
                                this.field1331[this.field1492] = var12.field72;
                                ++this.field1492;
                            }
                            if (var12.field74 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var12.field78; ++var18) {
                                    for (int var19 = 0; var19 < var12.field77; ++var19) {
                                        int var20 = (var12.field98 + 32) * var19 + var13;
                                        int var21 = (var12.field99 + 32) * var18 + var14;
                                        if (var17 < 20) {
                                            var20 += var12.field101[var17];
                                            var21 += var12.field102[var17];
                                        }
                                        if (arg4 >= var20 && arg5 >= var21 && arg4 < var20 + 32 && arg5 < var21 + 32) {
                                            this.field1265 = var17;
                                            this.field1266 = var12.field72;
                                            if (var12.field68[var17] > 0) {
                                                ObjType var22 = ObjType.method350(var12.field68[var17] - 1);
                                                if (this.field1277 == 1 && var12.field95) {
                                                    if (this.field1279 != var12.field72 || this.field1278 != var17) {
                                                        this.field1210[this.field1492] = "Use " + this.field1281 + " with @lre@" + var22.field1019;
                                                        this.field1332[this.field1492] = 881;
                                                        this.field1333[this.field1492] = var22.field1017;
                                                        this.field1330[this.field1492] = var17;
                                                        this.field1331[this.field1492] = var12.field72;
                                                        ++this.field1492;
                                                    }
                                                } else if (this.field1547 == 1 && var12.field95) {
                                                    if ((this.field1549 & 16) == 16) {
                                                        this.field1210[this.field1492] = this.field1550 + " @lre@" + var22.field1019;
                                                        this.field1332[this.field1492] = 391;
                                                        this.field1333[this.field1492] = var22.field1017;
                                                        this.field1330[this.field1492] = var17;
                                                        this.field1331[this.field1492] = var12.field72;
                                                        ++this.field1492;
                                                    }
                                                } else {
                                                    if (var12.field95) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1034 != null && var22.field1034[var23] != null) {
                                                                this.field1210[this.field1492] = var22.field1034[var23] + " @lre@" + var22.field1019;
                                                                if (var23 == 3) {
                                                                    this.field1332[this.field1492] = 478;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field1332[this.field1492] = 347;
                                                                }
                                                                this.field1333[this.field1492] = var22.field1017;
                                                                this.field1330[this.field1492] = var17;
                                                                this.field1331[this.field1492] = var12.field72;
                                                                ++this.field1492;
                                                            } else if (var23 == 4) {
                                                                this.field1210[this.field1492] = "Drop @lre@" + var22.field1019;
                                                                this.field1332[this.field1492] = 347;
                                                                this.field1333[this.field1492] = var22.field1017;
                                                                this.field1330[this.field1492] = var17;
                                                                this.field1331[this.field1492] = var12.field72;
                                                                ++this.field1492;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field96) {
                                                        this.field1210[this.field1492] = "Use @lre@" + var22.field1019;
                                                        this.field1332[this.field1492] = 188;
                                                        this.field1333[this.field1492] = var22.field1017;
                                                        this.field1330[this.field1492] = var17;
                                                        this.field1331[this.field1492] = var12.field72;
                                                        ++this.field1492;
                                                    }
                                                    if (var12.field95 && var22.field1034 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1034[var24] != null) {
                                                                this.field1210[this.field1492] = var22.field1034[var24] + " @lre@" + var22.field1019;
                                                                if (var24 == 0) {
                                                                    this.field1332[this.field1492] = 405;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field1332[this.field1492] = 38;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field1332[this.field1492] = 422;
                                                                }
                                                                this.field1333[this.field1492] = var22.field1017;
                                                                this.field1330[this.field1492] = var17;
                                                                this.field1331[this.field1492] = var12.field72;
                                                                ++this.field1492;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field103 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field103[var25] != null) {
                                                                this.field1210[this.field1492] = var12.field103[var25] + " @lre@" + var22.field1019;
                                                                if (var25 == 0) {
                                                                    this.field1332[this.field1492] = 602;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field1332[this.field1492] = 596;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field1332[this.field1492] = 22;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field1332[this.field1492] = 892;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field1332[this.field1492] = 415;
                                                                }
                                                                this.field1333[this.field1492] = var22.field1017;
                                                                this.field1330[this.field1492] = var17;
                                                                this.field1331[this.field1492] = var12.field72;
                                                                ++this.field1492;
                                                            }
                                                        }
                                                    }
                                                    this.field1210[this.field1492] = "Examine @lre@" + var22.field1019;
                                                    this.field1332[this.field1492] = 1773;
                                                    this.field1333[this.field1492] = var22.field1017;
                                                    this.field1330[this.field1492] = var17;
                                                    this.field1331[this.field1492] = var12.field72;
                                                    ++this.field1492;
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method551(int arg0) {
        int var2 = this.field1602 * 128 + 64;
        int var3 = this.field1603 * 128 + 64;
        int var4 = this.method484(var3, this.field1224, var2, (byte) 6) - this.field1604;
        if (this.field1297 < var2) {
            this.field1297 += (var2 - this.field1297) * this.field1606 / 1000 + this.field1605;
            if (this.field1297 > var2) {
                this.field1297 = var2;
            }
        }
        if (this.field1297 > var2) {
            this.field1297 -= (this.field1297 - var2) * this.field1606 / 1000 + this.field1605;
            if (this.field1297 < var2) {
                this.field1297 = var2;
            }
        }
        if (this.field1298 < var4) {
            this.field1298 += (var4 - this.field1298) * this.field1606 / 1000 + this.field1605;
            if (this.field1298 > var4) {
                this.field1298 = var4;
            }
        }
        if (this.field1298 > var4) {
            this.field1298 -= (this.field1298 - var4) * this.field1606 / 1000 + this.field1605;
            if (this.field1298 < var4) {
                this.field1298 = var4;
            }
        }
        if (this.field1299 < var3) {
            this.field1299 += (var3 - this.field1299) * this.field1606 / 1000 + this.field1605;
            if (this.field1299 > var3) {
                this.field1299 = var3;
            }
        }
        if (this.field1299 > var3) {
            this.field1299 -= (this.field1299 - var3) * this.field1606 / 1000 + this.field1605;
            if (this.field1299 < var3) {
                this.field1299 = var3;
            }
        }
        int var5 = this.field1257 * 128 + 64;
        int var6 = this.field1258 * 128 + 64;
        int var7 = this.method484(var6, this.field1224, var5, (byte) 6) - this.field1259;
        if (arg0 <= 0) {
            this.field1535 = -244;
        }
        int var8 = var5 - this.field1297;
        int var9 = var7 - this.field1298;
        int var10 = var6 - this.field1299;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1300 < var12) {
            this.field1300 += (var12 - this.field1300) * this.field1261 / 1000 + this.field1260;
            if (this.field1300 > var12) {
                this.field1300 = var12;
            }
        }
        if (this.field1300 > var12) {
            this.field1300 -= (this.field1300 - var12) * this.field1261 / 1000 + this.field1260;
            if (this.field1300 < var12) {
                this.field1300 = var12;
            }
        }
        int var14 = var13 - this.field1301;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1301 += this.field1261 * var14 / 1000 + this.field1260;
            this.field1301 &= 2047;
        }
        if (var14 < 0) {
            this.field1301 -= -var14 * this.field1261 / 1000 + this.field1260;
            this.field1301 &= 2047;
        }
        int var15 = var13 - this.field1301;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1301 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILd;IIII)V")
    public final void method552(int arg0, boolean arg1, int arg2, int arg3, Component arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field1464) {
            this.field1582 = 32;
        } else {
            this.field1582 = 0;
        }
        this.field1464 = false;
        if (arg5 != 0) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg7 >= arg2 && arg7 < arg2 + 16 && arg3 >= arg6 && arg3 < arg6 + 16) {
            arg4.field87 -= this.field1221 * 4;
            if (arg1) {
                this.field1517 = true;
                return;
            }
        } else if (arg7 >= arg2 && arg7 < arg2 + 16 && arg3 >= arg0 + arg6 - 16 && arg3 < arg0 + arg6) {
            arg4.field87 += this.field1221 * 4;
            if (arg1) {
                this.field1517 = true;
                return;
            }
        } else {
            if (arg7 < arg2 - this.field1582 || arg7 >= arg2 + 16 + this.field1582 || arg3 < arg6 + 16 || arg3 >= arg0 + arg6 - 16 || this.field1221 <= 0) {
                return;
            }
            int var11 = (arg0 - 32) * arg0 / arg8;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg3 - arg6 - 16 - var11 / 2;
            int var13 = arg0 - 32 - var11;
            arg4.field87 = (arg8 - arg0) * var12 / var13;
            if (arg1) {
                this.field1517 = true;
            }
            this.field1464 = true;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method553(int arg0) {
        this.field1595 += arg0;
        try {
            if (this.field1496 != null) {
                this.field1496.method38();
            }
        } catch (Exception var3) {
        }
        this.field1496 = null;
        this.field1220 = false;
        this.field1409 = 0;
        this.field1631 = "";
        this.field1632 = "";
        InputTracking.method45(this.field1350);
        this.method438(true);
        this.field1420.method64(this.field1535);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1211[var2].method361(6);
        }
        System.gc();
        this.method435(0);
        this.field1385 = -1;
        this.field1607 = -1;
        this.field1480 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (field1401) {
            this.field1237 = true;
        } else {
            field1401 = true;
            boolean var1 = false;
            String var2 = this.method483((byte) -76);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.246")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.247")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.249")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.253")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.254")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field1527 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1356[var3] = new FileStream(34035, signlink.cache_idx[var3], signlink.cache_dat, 500000, var3 + 1);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1338[8] = 0;
                    while (this.field1338[8] == 0) {
                        this.method13(638, "Connecting to web server", 20);
                        try {
                            DataInputStream var5 = this.method474("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(new byte[36], 337);
                            var5.readFully(var6.field709, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1338[var7] = var6.method244();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(638, "Error loading - Will retry in " + var8 + " secs.", 10);
                                try {
                                    Thread.sleep(1000L);
                                } catch (Exception var75) {
                                }
                            }
                            var4 *= 2;
                            if (var4 > 60) {
                                var4 = 60;
                            }
                        }
                    }
                    this.field1564 = this.method481("title", 143, 1, this.field1338[1], "title screen", 25);
                    this.field1360 = new PixFont("p11", (byte) 7, this.field1564);
                    this.field1361 = new PixFont("p12", (byte) 7, this.field1564);
                    this.field1362 = new PixFont("b12", (byte) 7, this.field1564);
                    this.field1363 = new PixFont("q8", (byte) 7, this.field1564);
                    this.method490((byte) 7);
                    this.method547(field1618);
                    Jagfile var9 = this.method481("config", 143, 2, this.field1338[2], "config", 30);
                    Jagfile var10 = this.method481("interface", 143, 3, this.field1338[3], "interface", 35);
                    Jagfile var11 = this.method481("media", 143, 4, this.field1338[4], "2d graphics", 40);
                    Jagfile var12 = this.method481("textures", 143, 6, this.field1338[6], "textures", 45);
                    Jagfile var13 = this.method481("wordenc", 143, 7, this.field1338[7], "chat system", 50);
                    Jagfile var14 = this.method481("sounds", 143, 8, this.field1338[8], "sound effects", 55);
                    this.field1343 = new byte[4][104][104];
                    this.field1337 = new int[4][105][105];
                    this.field1420 = new World3D(4, 104, 104, (byte) 108, this.field1337);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1211[var15] = new CollisionMap(104, 104, false);
                    }
                    this.field1309 = new Pix32(512, 512);
                    Jagfile var16 = this.method481("versionlist", 143, 5, this.field1338[5], "update list", 60);
                    this.method13(638, "Connecting to update server", 60);
                    this.field1273 = new OnDemand();
                    this.field1273.method280(var16, this);
                    AnimFrame.method58(this.field1273.method283(field1328));
                    Model.method136(this.field1273.method282(0, 0), this.field1273);
                    if (!field1231) {
                        this.field1607 = 0;
                        this.field1608 = false;
                        this.field1273.method289(2, this.field1607);
                        while (this.field1273.method290() > 0) {
                            this.method492(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13(638, "Requesting animations", 65);
                    int var17 = this.field1273.method282(1, 0);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1273.method289(1, var18);
                    }
                    while (this.field1273.method290() > 0) {
                        int var19 = var17 - this.field1273.method290();
                        if (var19 > 0) {
                            this.method13(638, "Loading animations - " + var19 * 100 / var17 + "%", 65);
                        }
                        this.method492(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13(638, "Requesting models", 70);
                    int var20 = this.field1273.method282(0, 0);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1273.method287(4, var21);
                        if ((var22 & 1) != 0) {
                            this.field1273.method289(0, var21);
                        }
                    }
                    int var23 = this.field1273.method290();
                    while (this.field1273.method290() > 0) {
                        int var24 = var23 - this.field1273.method290();
                        if (var24 > 0) {
                            this.method13(638, "Loading models - " + var24 * 100 / var23 + "%", 70);
                        }
                        this.method492(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1356[0] != null) {
                        this.method13(638, "Requesting maps", 75);
                        this.field1273.method289(3, this.field1273.method284(48, 0, -371, 47));
                        this.field1273.method289(3, this.field1273.method284(48, 1, -371, 47));
                        this.field1273.method289(3, this.field1273.method284(48, 0, -371, 48));
                        this.field1273.method289(3, this.field1273.method284(48, 1, -371, 48));
                        this.field1273.method289(3, this.field1273.method284(48, 0, -371, 49));
                        this.field1273.method289(3, this.field1273.method284(48, 1, -371, 49));
                        this.field1273.method289(3, this.field1273.method284(47, 0, -371, 47));
                        this.field1273.method289(3, this.field1273.method284(47, 1, -371, 47));
                        this.field1273.method289(3, this.field1273.method284(47, 0, -371, 48));
                        this.field1273.method289(3, this.field1273.method284(47, 1, -371, 48));
                        this.field1273.method289(3, this.field1273.method284(148, 0, -371, 48));
                        this.field1273.method289(3, this.field1273.method284(148, 1, -371, 48));
                        int var25 = this.field1273.method290();
                        while (this.field1273.method290() > 0) {
                            int var26 = var25 - this.field1273.method290();
                            if (var26 > 0) {
                                this.method13(638, "Loading maps - " + var26 * 100 / var25 + "%", 75);
                            }
                            this.method492(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1273.method282(0, 0);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1273.method287(4, var28);
                        byte var30 = 0;
                        if ((var29 & 8) != 0) {
                            var30 = 10;
                        } else if ((var29 & 32) != 0) {
                            var30 = 9;
                        } else if ((var29 & 16) != 0) {
                            var30 = 8;
                        } else if ((var29 & 64) != 0) {
                            var30 = 7;
                        } else if ((var29 & 128) != 0) {
                            var30 = 6;
                        } else if ((var29 & 2) != 0) {
                            var30 = 5;
                        } else if ((var29 & 4) != 0) {
                            var30 = 4;
                        }
                        if ((var29 & 1) != 0) {
                            var30 = 3;
                        }
                        if (var30 != 0) {
                            this.field1273.method292(0, var30, var28, 0);
                        }
                    }
                    this.field1273.method285(0, field1230);
                    if (!field1231) {
                        int var31 = this.field1273.method282(2, 0);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1273.method288(var32, false)) {
                                this.field1273.method292(0, (byte) 1, var32, 2);
                            }
                        }
                    }
                    this.method13(638, "Unpacking media", 80);
                    this.field1423 = new Pix8(var11, "invback", 0);
                    this.field1425 = new Pix8(var11, "chatback", 0);
                    this.field1424 = new Pix8(var11, "mapback", 0);
                    this.field1289 = new Pix8(var11, "backbase1", 0);
                    this.field1290 = new Pix8(var11, "backbase2", 0);
                    this.field1291 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1422[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1460 = new Pix32(var11, "compass", 0);
                    this.field1233 = new Pix32(var11, "mapedge", 0);
                    this.field1233.method196(9);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1454[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1431[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1583[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1482[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1243 = new Pix32(var11, "mapmarker", 0);
                    this.field1244 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1417[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1577 = new Pix32(var11, "mapdots", 0);
                    this.field1578 = new Pix32(var11, "mapdots", 1);
                    this.field1579 = new Pix32(var11, "mapdots", 2);
                    this.field1580 = new Pix32(var11, "mapdots", 3);
                    this.field1619 = new Pix8(var11, "scrollbar", 0);
                    this.field1620 = new Pix8(var11, "scrollbar", 1);
                    this.field1466 = new Pix8(var11, "redstone1", 0);
                    this.field1467 = new Pix8(var11, "redstone2", 0);
                    this.field1468 = new Pix8(var11, "redstone3", 0);
                    this.field1469 = new Pix8(var11, "redstone1", 0);
                    this.field1469.method209(3);
                    this.field1470 = new Pix8(var11, "redstone2", 0);
                    this.field1470.method209(3);
                    this.field1268 = new Pix8(var11, "redstone1", 0);
                    this.field1268.method210(0);
                    this.field1269 = new Pix8(var11, "redstone2", 0);
                    this.field1269.method210(0);
                    this.field1270 = new Pix8(var11, "redstone3", 0);
                    this.field1270.method210(0);
                    this.field1271 = new Pix8(var11, "redstone1", 0);
                    this.field1271.method209(3);
                    this.field1271.method210(0);
                    this.field1272 = new Pix8(var11, "redstone2", 0);
                    this.field1272.method209(3);
                    this.field1272.method210(0);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1407[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1189 = new PixMap((byte) -82, var40.field674, this.method11(437), var40.field673);
                    var40.method197(0, 0, false);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1190 = new PixMap((byte) -82, var41.field674, this.method11(437), var41.field673);
                    var41.method197(0, 0, false);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1191 = new PixMap((byte) -82, var42.field674, this.method11(437), var42.field673);
                    var42.method197(0, 0, false);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1192 = new PixMap((byte) -82, var43.field674, this.method11(437), var43.field673);
                    var43.method197(0, 0, false);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1193 = new PixMap((byte) -82, var44.field674, this.method11(437), var44.field673);
                    var44.method197(0, 0, false);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1194 = new PixMap((byte) -82, var45.field674, this.method11(437), var45.field673);
                    var45.method197(0, 0, false);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1195 = new PixMap((byte) -82, var46.field674, this.method11(437), var46.field673);
                    var46.method197(0, 0, false);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1196 = new PixMap((byte) -82, var47.field674, this.method11(437), var47.field673);
                    var47.method197(0, 0, false);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1197 = new PixMap((byte) -82, var48.field674, this.method11(437), var48.field673);
                    var48.method197(0, 0, false);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1431[var53] != null) {
                            this.field1431[var53].method195(7, var50 + var52, var51 + var52, var49 + var52);
                        }
                        if (this.field1454[var53] != null) {
                            this.field1454[var53].method211(7, var50 + var52, var51 + var52, var49 + var52);
                        }
                    }
                    this.method13(638, "Unpacking textures", 83);
                    Pix3D.method182(2, var12);
                    Pix3D.method186(-4767, 0.8D);
                    Pix3D.method181(-291, 20);
                    this.method13(638, "Unpacking config", 86);
                    SeqType.method383(var9, true);
                    LocType.method332(var9);
                    FloType.method373(var9, true);
                    ObjType.method348(var9);
                    NpcType.method342(var9);
                    IdkType.method377(var9, true);
                    SpotAnimType.method386(var9, true);
                    VarpType.method391(var9, true);
                    VarbitType.method389(var9, true);
                    ObjType.field1016 = field1230;
                    if (!field1231) {
                        this.method13(638, "Unpacking sounds", 90);
                        byte[] var54 = var14.method309("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(var54, 337);
                        Wave.method322(var55, true);
                    }
                    this.method13(638, "Unpacking interfaces", 95);
                    PixFont[] var56 = new PixFont[] { this.field1360, this.field1361, this.field1362, this.field1363 };
                    Component.method32(7, var56, var11, var10);
                    this.method13(638, "Preparing game engine", 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1424.field681[this.field1424.field683 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1344[var57] = var58;
                        this.field1245[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1424.field681[this.field1424.field683 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field1513[var61 - 5] = var62 - 25;
                        this.field1283[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method179(96, -32143, 479);
                    this.field1509 = Pix3D.field654;
                    Pix3D.method179(261, -32143, 190);
                    this.field1510 = Pix3D.field654;
                    Pix3D.method179(334, -32143, 512);
                    this.field1511 = Pix3D.field654;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field652[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method100(334, 800, 512, var65, 37942, 500);
                    WordFilter.method393(var13);
                    this.field1322 = new MouseTracking(-331, this);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1181 + " " + this.field1430);
                    this.field1443 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLmb;)V")
    private final void method554(int arg0, boolean arg1, Packet arg2) {
        if (!arg1) {
            for (int var4 = 0; var4 < this.field1590; ++var4) {
                int var5 = this.field1591[var4];
                PlayerEntity var6 = this.field1587[var5];
                int var7 = arg2.method239();
                if ((var7 & 128) == 128) {
                    var7 += arg2.method239() << 8;
                }
                this.method560(arg2, var6, var5, (byte) 44, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method555(int arg0, int arg1, int arg2, int arg3) {
        this.field1595 += arg2;
        int var5 = 256 - arg1;
        return ((arg0 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;II)V")
    public final void method556(PathingEntity arg0, int arg1, int arg2) {
        if (arg1 == 4) {
            this.method557(false, arg0.field410, arg2, arg0.field409);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)V")
    public final void method557(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            field1618 = -306;
        }
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method484(arg1, this.field1224, arg3, (byte) 6) - arg2;
            int var6 = arg3 - this.field1297;
            int var7 = var5 - this.field1298;
            int var8 = arg1 - this.field1299;
            int var9 = Model.field607[this.field1300];
            int var10 = Model.field608[this.field1300];
            int var11 = Model.field607[this.field1301];
            int var12 = Model.field608[this.field1301];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1444 = (var13 << 9) / var17 + Pix3D.field648;
                this.field1445 = (var16 << 9) / var17 + Pix3D.field649;
            } else {
                this.field1444 = -1;
                this.field1445 = -1;
            }
        } else {
            this.field1444 = -1;
            this.field1445 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method558(int arg0) {
        this.method446(false);
        if (this.field1628 == 1) {
            this.field1417[this.field1627 / 100].method199(0, this.field1626 - 8 - 4, this.field1625 - 8 - 4);
        }
        if (this.field1628 == 2) {
            this.field1417[this.field1627 / 100 + 4].method199(0, this.field1626 - 8 - 4, this.field1625 - 8 - 4);
        }
        if (this.field1581 != -1) {
            this.method441(false, this.field1581, this.field1325);
            this.method503(true, Component.field67[this.field1581], 0, 0, 0);
        }
        if (this.field1427 > 0) {
            int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1427 / 10.0D) * 10.0D);
            for (int var3 = 0; var3 < 30; ++var3) {
                int var4 = (30 - var3) * 16;
                Pix2D.method174(var2 + var3, this.field1427, var4, 16776960, 256 - var4 / 2, (byte) -77);
            }
        }
        if (this.field1262 != -1) {
            this.method441(false, this.field1262, this.field1325);
            this.method503(true, Component.field67[this.field1262], 0, 0, 0);
        }
        this.method530(false);
        int var5 = 1 / arg0;
        if (!this.field1364) {
            this.method444(this.field1287);
            this.method531(false);
        } else if (this.field1497 == 0) {
            this.method475(false);
        }
        if (this.field1609 == 1) {
            if (this.field1250 <= 0 && this.field1288 != 1) {
                this.field1482[1].method199(0, 296, 472);
            } else {
                this.field1482[1].method199(0, 258, 472);
            }
        }
        if (this.field1250 > 0) {
            this.field1482[0].method199(0, 296, 472);
            this.field1361.method214("Level: " + this.field1250, 16776960, 329, 484, -28519);
        }
        if (this.field1288 == 1) {
            this.field1482[6].method199(0, 296, 472);
            this.field1361.method214("Arena", 16776960, 329, 484, -28519);
        }
        if (this.field1256 != 0) {
            int var6 = this.field1256 / 50;
            int var7 = var6 / 60;
            int var8 = var6 % 60;
            if (var8 < 10) {
                this.field1361.method217(329, 4, "System update in: " + var7 + ":0" + var8, 16776960, (byte) 3);
            } else {
                this.field1361.method217(329, 4, "System update in: " + var7 + ":" + var8, 16776960, (byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method559(String arg0, byte arg1) {
        if (arg1 != 118) {
            this.field1596 = -1;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1371; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1294[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field1239.field467);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;Lbb;IBI)V")
    private final void method560(Packet arg0, PlayerEntity arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 44) {
            this.field1566.method229(203);
        }
        if ((arg4 & 1) == 1) {
            int var6 = arg0.method239();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(var7, 337);
            arg0.method248(0, var6, 0, var7);
            this.field1592[arg2] = var8;
            arg1.method130(var8, this.field1485);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg0.method241();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg1.field437 == var9) {
                arg1.field441 = 0;
            }
            int var10 = arg0.method239();
            if (arg1.field437 == var9 && var9 != -1) {
                int var11 = SeqType.field1110[var9].field1124;
                if (var11 == 1) {
                    arg1.field438 = 0;
                    arg1.field439 = 0;
                    arg1.field440 = var10;
                    arg1.field441 = 0;
                }
                if (var11 == 2) {
                    arg1.field441 = 0;
                }
            } else if (var9 == -1 || arg1.field437 == -1 || SeqType.field1110[var9].field1118 >= SeqType.field1110[arg1.field437].field1118) {
                arg1.field437 = var9;
                arg1.field438 = 0;
                arg1.field439 = 0;
                arg1.field440 = var10;
                arg1.field441 = 0;
                arg1.field462 = arg1.field457;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field431 = arg0.method241();
            if (arg1.field431 == 65535) {
                arg1.field431 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field421 = arg0.method246();
            arg1.field423 = 0;
            arg1.field424 = 0;
            arg1.field422 = 150;
            this.method544(2, arg1.field467, arg1.field421, 0);
        }
        if ((arg4 & 16) == 16) {
            int var12 = arg0.method239();
            int var13 = arg0.method239();
            arg1.method128(var12, var13, -500);
            arg1.field428 = field1633 + 300;
            arg1.field429 = arg0.method239();
            arg1.field430 = arg0.method239();
        }
        if ((arg4 & 32) == 32) {
            arg1.field432 = arg0.method241();
            arg1.field433 = arg0.method241();
        }
        if ((arg4 & 64) == 64) {
            int var14 = arg0.method241();
            int var15 = arg0.method239();
            int var16 = arg0.method239();
            int var17 = arg0.field710;
            if (arg1.field467 != null && arg1.field468) {
                long var18 = JString.method310(arg1.field467);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1225; ++var21) {
                        if (this.field1306[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1536 == 0) {
                    try {
                        String var22 = WordPack.method317(arg0, var16, 983);
                        String var23 = WordFilter.method403(103, var22);
                        arg1.field421 = var23;
                        arg1.field423 = var14 >> 8;
                        arg1.field424 = var14 & 255;
                        arg1.field422 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method544(1, "@cr1@" + arg1.field467, var23, 0);
                            } else {
                                this.method544(2, arg1.field467, var23, 0);
                            }
                        } else {
                            this.method544(1, "@cr2@" + arg1.field467, var23, 0);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field710 = var16 + var17;
        }
        if ((arg4 & 256) == 256) {
            arg1.field442 = arg0.method241();
            int var25 = arg0.method244();
            arg1.field446 = var25 >> 16;
            arg1.field445 = (var25 & 65535) + field1633;
            arg1.field443 = 0;
            arg1.field444 = 0;
            if (arg1.field445 > field1633) {
                arg1.field443 = -1;
            }
            if (arg1.field442 == 65535) {
                arg1.field442 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field447 = arg0.method239();
            arg1.field449 = arg0.method239();
            arg1.field448 = arg0.method239();
            arg1.field450 = arg0.method239();
            arg1.field451 = arg0.method241() + field1633;
            arg1.field452 = arg0.method241() + field1633;
            arg1.field453 = arg0.method239();
            arg1.method126(-730);
        }
        if ((arg4 & 1024) == 1024) {
            int var26 = arg0.method239();
            int var27 = arg0.method239();
            arg1.method128(var26, var27, -500);
            arg1.field428 = field1633 + 300;
            arg1.field429 = arg0.method239();
            arg1.field430 = arg0.method239();
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method561(int arg0) {
        short var2 = 256;
        if (this.field1571 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1571 > 768) {
                    this.field1471[var3] = this.method555(this.field1473[var3], 1024 - this.field1571, 0, this.field1472[var3]);
                } else if (this.field1571 > 256) {
                    this.field1471[var3] = this.field1473[var3];
                } else {
                    this.field1471[var3] = this.method555(this.field1472[var3], 256 - this.field1571, 0, this.field1473[var3]);
                }
            }
        } else if (this.field1572 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1572 > 768) {
                    this.field1471[var4] = this.method555(this.field1474[var4], 1024 - this.field1572, 0, this.field1472[var4]);
                } else if (this.field1572 > 256) {
                    this.field1471[var4] = this.field1474[var4];
                } else {
                    this.field1471[var4] = this.method555(this.field1472[var4], 256 - this.field1572, 0, this.field1474[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1471[var5] = this.field1472[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1202.field751[var6] = this.field1403.field672[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1286[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1629[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1471[var26];
                    int var30 = this.field1202.field751[var8];
                    this.field1202.field751[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1202.method269((byte) 7, 0, super.field13, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1203.field751[var10] = this.field1404.field672[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1286[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1629[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1471[var18];
                    int var22 = this.field1203.field751[var16];
                    this.field1203.field751[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 <= 0) {
            field1328 = !field1328;
        }
        this.field1203.method269((byte) 7, 0, super.field13, 637);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field1420.method90(arg2, arg4, arg3);
        if (var7 != 0) {
            int var8 = this.field1420.method94(arg2, arg4, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field1309.field672;
            int var13 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method334(var14);
            if (var15.field955 != -1) {
                Pix8 var16 = this.field1454[var15.field955];
                if (var16 != null) {
                    int var17 = (var15.field941 * 4 - var16.field683) / 2;
                    int var18 = (var15.field942 * 4 - var16.field684) / 2;
                    var16.method212(0, (104 - arg3 - var15.field942) * 4 + 48 + var18, arg4 * 4 + 48 + var17);
                }
            } else {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            }
        }
        int var19 = this.field1420.method92(arg2, arg4, arg3);
        if (arg5 != 5) {
            for (int var20 = 1; var20 > 0; ++var20) {
            }
        }
        if (var19 != 0) {
            int var21 = this.field1420.method94(arg2, arg4, arg3, var19);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var19 >> 14 & 32767;
            LocType var25 = LocType.method334(var24);
            if (var25.field955 != -1) {
                Pix8 var26 = this.field1454[var25.field955];
                if (var26 != null) {
                    int var27 = (var25.field941 * 4 - var26.field683) / 2;
                    int var28 = (var25.field942 * 4 - var26.field684) / 2;
                    var26.method212(0, (104 - arg3 - var25.field942) * 4 + 48 + var28, arg4 * 4 + 48 + var27);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var19 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field1309.field672;
                int var31 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
                if (var22 != 0 && var22 != 2) {
                    var30[var31] = var29;
                    var30[var31 + 512 + 1] = var29;
                    var30[var31 + 1024 + 2] = var29;
                    var30[var31 + 1536 + 3] = var29;
                } else {
                    var30[var31 + 1536] = var29;
                    var30[var31 + 1024 + 1] = var29;
                    var30[var31 + 512 + 2] = var29;
                    var30[var31 + 3] = var29;
                }
            }
        }
        int var32 = this.field1420.method93(arg2, arg4, arg3);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            LocType var34 = LocType.method334(var33);
            if (var34.field955 != -1) {
                Pix8 var35 = this.field1454[var34.field955];
                if (var35 != null) {
                    int var36 = (var34.field941 * 4 - var35.field683) / 2;
                    int var37 = (var34.field942 * 4 - var35.field684) / 2;
                    var35.method212(0, (104 - arg3 - var34.field942) * 4 + 48 + var37, arg4 * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1292[var1] = var0 - 1;
            var0 += var0;
        }
        field1359 = -161;
        field1400 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1406 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1413 = -796;
        field1429 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1446 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1533 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1533[var3] = var2 / 4;
        }
        field1551 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
