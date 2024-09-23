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

    @OriginalMember(owner = "client", name = "J", descriptor = "B")
    private byte field1215 = 7;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1227 = -1;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1231 = -661;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Lib;")
    private Pix32[] field1234 = new Pix32[50];

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field1236 = false;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1243 = -1;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1246 = 50;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field1247 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field1248 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1249 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field1250 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1251 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private int[] field1252 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "vb", descriptor = "[I")
    private int[] field1253 = new int[this.field1246];

    @OriginalMember(owner = "client", name = "wb", descriptor = "[Ljava/lang/String;")
    private String[] field1254 = new String[this.field1246];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[I")
    private int[] field1258 = new int[5];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[Lz;")
    private NpcEntity[] field1259 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Db", descriptor = "[I")
    public int[] field1261 = new int[16384];

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field1262 = true;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private final int[] field1263 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1264 = -337;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field1267 = true;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[J")
    private long[] field1269 = new long[200];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "B")
    private byte field1270 = 110;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[[[Lpb;")
    private LinkList[][][] field1272 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Z")
    private boolean field1273 = false;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1274 = 3353893;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Z")
    private boolean field1275 = false;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1276 = -1;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[Lib;")
    private Pix32[] field1279 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field1280 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "dc", descriptor = "Lmb;")
    private Packet field1287 = Packet.method216(149, 1);

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Ljava/lang/String;")
    private String field1293 = "";

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljava/lang/String;")
    private String field1294 = "";

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field1296 = new int[5];

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1297 = -1;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1300 = 2;

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field1304 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1305 = -31779;

    @OriginalMember(owner = "client", name = "wc", descriptor = "[[I")
    private int[][] field1306 = new int[104][104];

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1307 = 2048;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1308 = 2047;

    @OriginalMember(owner = "client", name = "zc", descriptor = "[Lab;")
    private PlayerEntity[] field1309 = new PlayerEntity[this.field1307];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[I")
    public int[] field1311 = new int[this.field1307];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[I")
    private int[] field1313 = new int[this.field1307];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[Lmb;")
    private Packet[] field1314 = new Packet[this.field1307];

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private boolean field1315 = false;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "B")
    private byte field1319 = 9;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "B")
    private byte field1320 = 6;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field1323 = new int[256];

    @OriginalMember(owner = "client", name = "Oc", descriptor = "B")
    private byte field1324 = 30;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private final int field1325 = 100;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[I")
    private int[] field1326 = new int[100];

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1327 = -456;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[Ljb;")
    private Pix8[] field1328 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field1330 = new int[5];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[Ljb;")
    private Pix8[] field1331 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private boolean field1334 = false;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1341 = new int[100];

    @OriginalMember(owner = "client", name = "gd", descriptor = "[Ljava/lang/String;")
    private String[] field1342 = new String[100];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[Ljava/lang/String;")
    private String[] field1343 = new String[100];

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field1344 = new int[5];

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private boolean field1346 = true;

    @OriginalMember(owner = "client", name = "md", descriptor = "Z")
    private boolean field1348 = false;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1353 = -1;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[J")
    private long[] field1358 = new long[100];

    @OriginalMember(owner = "client", name = "xd", descriptor = "B")
    private byte field1359 = 8;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "B")
    private byte field1363 = -17;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1365 = new CRC32();

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[I")
    private int[] field1368 = new int[500];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[I")
    private int[] field1369 = new int[500];

    @OriginalMember(owner = "client", name = "Id", descriptor = "[I")
    private int[] field1370 = new int[500];

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[I")
    private int[] field1371 = new int[500];

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1374 = 78;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Lmb;")
    private Packet field1376 = Packet.method216(149, 1);

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Lmb;")
    private Packet field1377 = Packet.method216(149, 1);

    @OriginalMember(owner = "client", name = "Qd", descriptor = "B")
    private byte field1378 = 8;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field1380 = new int[1000];

    @OriginalMember(owner = "client", name = "Td", descriptor = "[I")
    private int[] field1381 = new int[1000];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Z")
    private boolean field1386 = false;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field1387 = false;

    @OriginalMember(owner = "client", name = "de", descriptor = "[Lib;")
    private Pix32[] field1391 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field1394 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1395 = -278;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private boolean field1396 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1401 = 5063219;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1407 = 5;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1408 = -45991;

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field1410 = false;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1413 = 1;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Ljava/lang/String;")
    private String field1414 = "";

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field1415 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    public boolean field1416 = true;

    @OriginalMember(owner = "client", name = "De", descriptor = "[[I")
    private int[][] field1417 = new int[104][104];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field1419 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "Je", descriptor = "Ljava/lang/String;")
    private String field1423 = "";

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Ljava/lang/String;")
    private String field1424 = "";

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1427 = 44106;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1428 = 2;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1429 = -1;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1430 = 3;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[I")
    private int[] field1434 = new int[200];

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1435 = -1;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1436 = 2301979;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field1446 = false;

    @OriginalMember(owner = "client", name = "hf", descriptor = "B")
    private byte field1447 = -126;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field1448 = false;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1450 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "client", name = "of", descriptor = "[I")
    private int[] field1453 = new int[5];

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1454 = 7759444;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Z")
    private boolean field1456 = false;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[B")
    private byte[] field1457 = new byte[16384];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[Ljb;")
    private Pix8[] field1464 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Lpb;")
    private LinkList field1467 = new LinkList((byte) 9);

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1468 = 9;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field1469 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1471 = 2;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[I")
    private int[] field1472 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Z")
    private boolean field1474 = false;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field1478 = new int[50];

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1479 = 8;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[Ljava/lang/String;")
    private String[] field1481 = new String[500];

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    public int[] field1483 = new int[1000];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[Lkc;")
    private CollisionMap[] field1485 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field1488 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Ljava/lang/String;")
    private String field1489 = "";

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private boolean field1490 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Z")
    private boolean field1496 = false;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Ld;")
    private Component field1498 = new Component();

    @OriginalMember(owner = "client", name = "ig", descriptor = "[Lwb;")
    public FileStream[] field1499 = new FileStream[5];

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1510 = -1;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Lpb;")
    private LinkList field1514 = new LinkList((byte) 9);

    @OriginalMember(owner = "client", name = "zg", descriptor = "Z")
    private boolean field1516 = false;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field1518 = true;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1519 = 128;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field1533 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[Ljava/lang/String;")
    private String[] field1553 = new String[5];

    @OriginalMember(owner = "client", name = "lh", descriptor = "[Z")
    private boolean[] field1554 = new boolean[5];

    @OriginalMember(owner = "client", name = "mh", descriptor = "Ljava/lang/String;")
    private String field1555 = "";

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field1558 = new int[2000];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[Ljava/lang/String;")
    private String[] field1559 = new String[200];

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1560 = -1;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[[I")
    private int[][] field1561 = new int[104][104];

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1564 = -1;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1565 = 23391;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1567 = 2;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1570 = 9;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Ljava/lang/String;")
    private String field1576 = "";

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1580 = 451;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    private int[] field1585 = new int[151];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field1586 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field1591 = new int[7];

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1598 = 1;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1600 = -1;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1601 = -1;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field1602 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field1603 = new int[4000];

    @OriginalMember(owner = "client", name = "ji", descriptor = "[I")
    private int[] field1604 = new int[4000];

    @OriginalMember(owner = "client", name = "ki", descriptor = "[I")
    private int[] field1605 = new int[33];

    @OriginalMember(owner = "client", name = "mi", descriptor = "Lpb;")
    private LinkList field1607 = new LinkList((byte) 9);

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1608 = -1;

    @OriginalMember(owner = "client", name = "si", descriptor = "[Lib;")
    private Pix32[] field1613 = new Pix32[8];

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1616 = 526;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[Z")
    private boolean[] field1624 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field1625 = new int[50];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private int[] field1628 = new int[2000];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1631 = -1;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[Lib;")
    private Pix32[] field1633 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1635 = 2;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field1637 = new int[33];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Ljava/lang/String;")
    private String field1638 = "";

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field1639 = new int[50];

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    private int[] field1643 = new int[151];

    @OriginalMember(owner = "client", name = "oj", descriptor = "Z")
    private boolean field1661 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field1662 = false;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Z")
    public boolean field1663 = false;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1665 = new int[9];

    @OriginalMember(owner = "client", name = "Gj", descriptor = "B")
    private byte field1679 = -126;

    @OriginalMember(owner = "client", name = "N", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1219 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "W", descriptor = "[[I")
    public static final int[][] field1228 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "X", descriptor = "B")
    private static byte field1229 = 7;

    @OriginalMember(owner = "client", name = "xb", descriptor = "B")
    private static byte field1255 = -38;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private static int[] field1281 = new int[99];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "B")
    private static byte field1333;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1356;

    @OriginalMember(owner = "client", name = "Le", descriptor = "B")
    private static byte field1425;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private static int[] field1426;

    @OriginalMember(owner = "client", name = "ff", descriptor = "B")
    private static byte field1445;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private static int field1459;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Z")
    private static boolean field1461;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private static boolean field1475;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    public static final int[] field1484;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Ljava/lang/String;")
    private static String field1587;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private static int field1230;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private static int field1265;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private static int field1277;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private static int field1278;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private static int field1322;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private static int field1332;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private static int field1364;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private static int field1398;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private static int field1418;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private static int field1466;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private static int field1470;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field1473;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private static int field1486;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private static int field1513;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private static int field1557;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private static int field1568;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field1577;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private static int field1599;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field1641;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client", name = "ic", descriptor = "J")
    private long field1292;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "J")
    private long field1437;

    @OriginalMember(owner = "client", name = "nh", descriptor = "J")
    private long field1556;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "J")
    private long field1592;

    @OriginalMember(owner = "client", name = "ti", descriptor = "J")
    public long field1614;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Le;")
    private ClientStream field1357;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Lxb;")
    private Isaac field1535;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Lyb;")
    private Jagfile field1497;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Lgc;")
    public MouseTracking field1271;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Lvb;")
    private OnDemand field1480;

    @OriginalMember(owner = "client", name = "L", descriptor = "Lib;")
    private Pix32 field1217;

    @OriginalMember(owner = "client", name = "M", descriptor = "Lib;")
    private Pix32 field1218;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Lib;")
    private Pix32 field1256;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Lib;")
    private Pix32 field1257;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Lib;")
    private Pix32 field1318;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Lib;")
    private Pix32 field1337;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Lib;")
    private Pix32 field1338;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Lib;")
    private Pix32 field1339;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Lib;")
    private Pix32 field1340;

    @OriginalMember(owner = "client", name = "td", descriptor = "Lib;")
    private Pix32 field1355;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Lib;")
    private Pix32 field1422;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Lib;")
    private Pix32 field1551;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Lib;")
    private Pix32 field1552;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Ljb;")
    private Pix8 field1237;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Ljb;")
    private Pix8 field1238;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ljb;")
    private Pix8 field1239;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljb;")
    private Pix8 field1240;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Ljb;")
    private Pix8 field1241;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Ljb;")
    private Pix8 field1290;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Ljb;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Ljb;")
    private Pix8 field1432;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Ljb;")
    private Pix8 field1433;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Ljb;")
    private Pix8 field1442;

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljb;")
    private Pix8 field1443;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Ljb;")
    private Pix8 field1444;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Ljb;")
    private Pix8 field1493;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljb;")
    private Pix8 field1494;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ljb;")
    private Pix8 field1495;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Ljb;")
    private Pix8 field1571;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Ljb;")
    private Pix8 field1572;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Ljb;")
    private Pix8 field1573;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Ljb;")
    private Pix8 field1574;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Ljb;")
    private Pix8 field1575;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Lkb;")
    private PixFont field1523;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "Lkb;")
    private PixFont field1524;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Lkb;")
    private PixFont field1525;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lkb;")
    private PixFont field1526;

    @OriginalMember(owner = "client", name = "jg", descriptor = "Lrb;")
    private PixMap field1500;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lrb;")
    private PixMap field1501;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lrb;")
    private PixMap field1502;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Lrb;")
    private PixMap field1503;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Lrb;")
    private PixMap field1504;

    @OriginalMember(owner = "client", name = "og", descriptor = "Lrb;")
    private PixMap field1505;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lrb;")
    private PixMap field1506;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lrb;")
    private PixMap field1507;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lrb;")
    private PixMap field1508;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Lrb;")
    private PixMap field1538;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Lrb;")
    private PixMap field1539;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Lrb;")
    private PixMap field1540;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Lrb;")
    private PixMap field1541;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lrb;")
    private PixMap field1542;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lrb;")
    private PixMap field1543;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lrb;")
    private PixMap field1544;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lrb;")
    private PixMap field1545;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lrb;")
    private PixMap field1546;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Lrb;")
    private PixMap field1581;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Lrb;")
    private PixMap field1582;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Lrb;")
    private PixMap field1583;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lrb;")
    private PixMap field1584;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lrb;")
    private PixMap field1588;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lrb;")
    private PixMap field1589;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lrb;")
    private PixMap field1590;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Lab;")
    public static PlayerEntity field1569;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Lr;")
    private World3D field1463;

    @OriginalMember(owner = "client", name = "db", descriptor = "Ljava/lang/String;")
    private String field1235;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Ljava/lang/String;")
    private String field1242;

    @OriginalMember(owner = "client", name = "se", descriptor = "Ljava/lang/String;")
    public String field1406;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljava/lang/String;")
    public String field1441;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Z")
    private static boolean field1233;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    public static boolean field1244;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Z")
    private static boolean field1462;

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field1224;

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field1225;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field1226;

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field1361;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field1389;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[I")
    private int[] field1390;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field1547;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field1548;

    @OriginalMember(owner = "client", name = "gh", descriptor = "[I")
    private int[] field1549;

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    private int[] field1650;

    @OriginalMember(owner = "client", name = "ej", descriptor = "[I")
    private int[] field1651;

    @OriginalMember(owner = "client", name = "fj", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[Ljb;")
    private Pix8[] field1298;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[[B")
    private byte[][] field1372;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[[B")
    private byte[][] field1640;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[[[B")
    private byte[][][] field1392;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[[[I")
    private int[][][] field1578;

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method426(int arg0) {
        if (arg0 != 38628) {
            this.field1396 = !this.field1396;
        }
        if (super.field27 == 1) {
            if (super.field28 >= 539 && super.field28 <= 573 && super.field29 >= 169 && super.field29 < 205 && this.field1586[0] != -1) {
                this.field1602 = true;
                this.field1430 = 0;
                this.field1488 = true;
            }
            if (super.field28 >= 569 && super.field28 <= 599 && super.field29 >= 168 && super.field29 < 205 && this.field1586[1] != -1) {
                this.field1602 = true;
                this.field1430 = 1;
                this.field1488 = true;
            }
            if (super.field28 >= 597 && super.field28 <= 627 && super.field29 >= 168 && super.field29 < 205 && this.field1586[2] != -1) {
                this.field1602 = true;
                this.field1430 = 2;
                this.field1488 = true;
            }
            if (super.field28 >= 625 && super.field28 <= 669 && super.field29 >= 168 && super.field29 < 203 && this.field1586[3] != -1) {
                this.field1602 = true;
                this.field1430 = 3;
                this.field1488 = true;
            }
            if (super.field28 >= 666 && super.field28 <= 696 && super.field29 >= 168 && super.field29 < 205 && this.field1586[4] != -1) {
                this.field1602 = true;
                this.field1430 = 4;
                this.field1488 = true;
            }
            if (super.field28 >= 694 && super.field28 <= 724 && super.field29 >= 168 && super.field29 < 205 && this.field1586[5] != -1) {
                this.field1602 = true;
                this.field1430 = 5;
                this.field1488 = true;
            }
            if (super.field28 >= 722 && super.field28 <= 756 && super.field29 >= 169 && super.field29 < 205 && this.field1586[6] != -1) {
                this.field1602 = true;
                this.field1430 = 6;
                this.field1488 = true;
            }
            if (super.field28 >= 540 && super.field28 <= 574 && super.field29 >= 466 && super.field29 < 502 && this.field1586[7] != -1) {
                this.field1602 = true;
                this.field1430 = 7;
                this.field1488 = true;
            }
            if (super.field28 >= 572 && super.field28 <= 602 && super.field29 >= 466 && super.field29 < 503 && this.field1586[8] != -1) {
                this.field1602 = true;
                this.field1430 = 8;
                this.field1488 = true;
            }
            if (super.field28 >= 599 && super.field28 <= 629 && super.field29 >= 466 && super.field29 < 503 && this.field1586[9] != -1) {
                this.field1602 = true;
                this.field1430 = 9;
                this.field1488 = true;
            }
            if (super.field28 >= 627 && super.field28 <= 671 && super.field29 >= 467 && super.field29 < 502 && this.field1586[10] != -1) {
                this.field1602 = true;
                this.field1430 = 10;
                this.field1488 = true;
            }
            if (super.field28 >= 669 && super.field28 <= 699 && super.field29 >= 466 && super.field29 < 503 && this.field1586[11] != -1) {
                this.field1602 = true;
                this.field1430 = 11;
                this.field1488 = true;
            }
            if (super.field28 >= 696 && super.field28 <= 726 && super.field29 >= 466 && super.field29 < 503 && this.field1586[12] != -1) {
                this.field1602 = true;
                this.field1430 = 12;
                this.field1488 = true;
            }
            if (super.field28 >= 724 && super.field28 <= 758 && super.field29 >= 466 && super.field29 < 502 && this.field1586[13] != -1) {
                this.field1602 = true;
                this.field1430 = 13;
                this.field1488 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method427(int arg0) {
        this.field1584.method257(0);
        Pix3D.field648 = this.field1547;
        this.field1444.method198((byte) 0, 0, 0);
        if (this.field1661) {
            this.field1525.method200(-544, 40, 239, this.field1576, 0);
            this.field1525.method200(-544, 60, 239, this.field1414 + "*", 128);
        } else if (this.field1516) {
            this.field1525.method200(-544, 40, 239, "Enter amount:", 0);
            this.field1525.method200(-544, 60, 239, this.field1638 + "*", 128);
        } else if (this.field1235 != null) {
            this.field1525.method200(-544, 40, 239, this.field1235, 0);
            this.field1525.method200(-544, 60, 239, "Click to continue", 128);
        } else if (this.field1276 != -1) {
            this.method543(0, false, 0, 0, Component.field74[this.field1276]);
        } else if (this.field1510 != -1) {
            this.method543(0, false, 0, 0, Component.field74[this.field1510]);
        } else {
            PixFont var2 = this.field1524;
            int var3 = 0;
            Pix2D.method153(77, 0, 0, 0, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1343[var4] != null) {
                    int var6 = this.field1341[var4];
                    int var7 = 70 - var3 * 14 + this.field1636;
                    String var8 = this.field1342[var4];
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
                            var2.method203(this.field1343[var4], 0, var7, (byte) 110, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1329 == 0 || this.field1329 == 1 && this.method455(-983, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1331[0].method198((byte) 0, var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1331[1].method198((byte) 0, var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method203(var8 + ":", 0, var7, (byte) 110, var10);
                            int var11 = var10 + var2.method202(false, var8) + 8;
                            var2.method203(this.field1343[var4], 255, var7, (byte) 110, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1517 == 0 && (var6 == 7 || this.field1678 == 0 || this.field1678 == 1 && this.method455(-983, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method203("From", 0, var7, (byte) 110, var12);
                            int var13 = var12 + var2.method202(false, "From ");
                            if (var9 == 1) {
                                this.field1331[0].method198((byte) 0, var13, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1331[1].method198((byte) 0, var13, var7 - 12);
                                var13 += 14;
                            }
                            var2.method203(var8 + ":", 0, var7, (byte) 110, var13);
                            int var14 = var13 + var2.method202(false, var8) + 8;
                            var2.method203(this.field1343[var4], 8388608, var7, (byte) 110, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1375 == 0 || this.field1375 == 1 && this.method455(-983, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(var8 + " " + this.field1343[var4], 8388736, var7, (byte) 110, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1517 == 0 && this.field1678 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(this.field1343[var4], 8388608, var7, (byte) 110, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1517 == 0 && this.field1678 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203("To " + var8 + ":", 0, var7, (byte) 110, 4);
                            var2.method203(this.field1343[var4], 8388608, var7, (byte) 110, 12 + var2.method202(false, "To " + var8));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1375 == 0 || this.field1375 == 1 && this.method455(-983, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(var8 + " " + this.field1343[var4], 8270336, var7, (byte) 110, 4);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method152(0);
            this.field1374 = var3 * 14 + 7;
            if (this.field1374 < 78) {
                this.field1374 = 78;
            }
            this.method508(463, 0, this.field1374 - this.field1636 - 77, 77, this.field1374, (byte) -17);
            String var5;
            if (field1569 != null && field1569.field462 != null) {
                var5 = field1569.field462;
            } else {
                var5 = JString.method303(this.field1293, 8);
            }
            var2.method203(var5 + ":", 0, 90, (byte) 110, 4);
            var2.method203(this.field1555 + "*", 255, 90, (byte) 110, 6 + var2.method202(false, var5 + ": "));
            Pix2D.method159(0, 479, 0, 77, (byte) 2);
        }
        if (this.field1354 && this.field1656 == 2) {
            this.method516(243);
        }
        this.field1584.method258(357, -740, super.field13, 17);
        this.field1583.method257(0);
        while (arg0 >= 0) {
            this.method6();
        }
        Pix3D.field648 = this.field1549;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method428(int arg0, boolean arg1) {
        this.method466(7);
        this.field1540.method257(0);
        if (arg0 != 3) {
            this.method6();
        }
        this.field1432.method198((byte) 0, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1512 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1523.method201(var3 / 2, true, false, 7711145, var5, this.field1480.field838);
            int var6 = var4 / 2 - 20;
            this.field1525.method201(var3 / 2, true, false, 16776960, var6, "Welcome to RuneScape");
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1433.method198((byte) 0, var7 - 73, var8 - 20);
            this.field1525.method201(var7, true, false, 16777215, var8 + 5, "New user");
            int var9 = var3 / 2 + 80;
            this.field1433.method198((byte) 0, var9 - 73, var8 - 20);
            this.field1525.method201(var9, true, false, 16777215, var8 + 5, "Existing User");
        }
        if (this.field1512 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1423.length() > 0) {
                this.field1525.method201(var3 / 2, true, false, 16776960, var10 - 15, this.field1423);
                this.field1525.method201(var3 / 2, true, false, 16776960, var10, this.field1424);
                var10 += 30;
            } else {
                this.field1525.method201(var3 / 2, true, false, 16776960, var10 - 7, this.field1424);
                var10 += 30;
            }
            this.field1525.method205(var10, 0, "Username: " + this.field1293 + (this.field1360 == 0 & field1223 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, true, 16777215);
            var10 += 15;
            this.field1525.method205(var10, 0, "Password: " + JString.method305(this.field1294, true) + (this.field1360 == 1 & field1223 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, true, 16777215);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1433.method198((byte) 0, var11 - 73, var12 - 20);
                this.field1525.method201(var11, true, false, 16777215, var12 + 5, "Login");
                int var13 = var3 / 2 + 80;
                this.field1433.method198((byte) 0, var13 - 73, var12 - 20);
                this.field1525.method201(var13, true, false, 16777215, var12 + 5, "Cancel");
            }
        }
        if (this.field1512 == 3) {
            this.field1525.method201(var3 / 2, true, false, 16776960, var4 / 2 - 60, "Create a free account");
            int var14 = var4 / 2 - 35;
            this.field1525.method201(var3 / 2, true, false, 16777215, var14, "To create a new account you need to");
            int var18 = var14 + 15;
            this.field1525.method201(var3 / 2, true, false, 16777215, var18, "go back to the main RuneScape webpage");
            int var19 = var18 + 15;
            this.field1525.method201(var3 / 2, true, false, 16777215, var19, "and choose the red 'create account'");
            int var20 = var19 + 15;
            this.field1525.method201(var3 / 2, true, false, 16777215, var20, "button at the top right of that page.");
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1433.method198((byte) 0, var15 - 73, var16 - 20);
            this.field1525.method201(var15, true, false, 16777215, var16 + 5, "Cancel");
        }
        this.field1540.method258(171, -740, super.field13, 202);
        if (this.field1394) {
            this.field1394 = false;
            this.field1538.method258(0, -740, super.field13, 128);
            this.field1539.method258(371, -740, super.field13, 202);
            this.field1543.method258(265, -740, super.field13, 0);
            this.field1544.method258(265, -740, super.field13, 562);
            this.field1545.method258(171, -740, super.field13, 128);
            this.field1546.method258(171, -740, super.field13, 562);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method429(int arg0) {
        if (this.field1479 != arg0) {
            this.method6();
        }
        if (this.field1512 == 0) {
            int var2 = super.field11 / 2 - 80;
            int var3 = super.field12 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field27 == 1 && super.field28 >= var2 - 75 && super.field28 <= var2 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1512 = 3;
                this.field1360 = 0;
            }
            int var4 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var4 - 75 && super.field28 <= var4 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1423 = "";
                this.field1424 = "Enter your username & password.";
                this.field1512 = 2;
                this.field1360 = 0;
            }
        } else if (this.field1512 == 2) {
            int var5 = super.field12 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field27 == 1 && super.field29 >= var16 - 15 && super.field29 < var16) {
                this.field1360 = 0;
            }
            var5 = var16 + 15;
            if (super.field27 == 1 && super.field29 >= var5 - 15 && super.field29 < var5) {
                this.field1360 = 1;
            }
            var5 += 15;
            int var6 = super.field11 / 2 - 80;
            int var7 = super.field12 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field27 == 1 && super.field28 >= var6 - 75 && super.field28 <= var6 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.method464(this.field1293, this.field1294, false);
                if (this.field1663) {
                    return;
                }
            }
            int var8 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var8 - 75 && super.field28 <= var8 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.field1512 = 0;
                this.field1293 = "";
                this.field1294 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) -60);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1587.length(); ++var11) {
                        if (var9 == field1587.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1360 == 0) {
                        if (var9 == 8 && this.field1293.length() > 0) {
                            this.field1293 = this.field1293.substring(0, this.field1293.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1360 = 1;
                        }
                        if (var10) {
                            this.field1293 = this.field1293 + (char) var9;
                        }
                        if (this.field1293.length() > 12) {
                            this.field1293 = this.field1293.substring(0, 12);
                        }
                    } else if (this.field1360 == 1) {
                        if (var9 == 8 && this.field1294.length() > 0) {
                            this.field1294 = this.field1294.substring(0, this.field1294.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1360 = 0;
                        }
                        if (var10) {
                            this.field1294 = this.field1294 + (char) var9;
                        }
                        if (this.field1294.length() > 20) {
                            this.field1294 = this.field1294.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1512 == 3) {
                int var12 = super.field11 / 2;
                int var13 = super.field12 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field27 == 1 && super.field28 >= var12 - 75 && super.field28 <= var12 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1512 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZ)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.field1463.method76(arg0, arg4, arg2);
        if (var7 != 0) {
            int var8 = this.field1463.method80(arg0, arg4, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field1422.field664;
            int var13 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method329(var14);
            if (var15.field978 != -1) {
                Pix8 var16 = this.field1328[var15.field978];
                if (var16 != null) {
                    int var17 = (var15.field964 * 4 - var16.field677) / 2;
                    int var18 = (var15.field965 * 4 - var16.field678) / 2;
                    var16.method198((byte) 0, arg4 * 4 + 48 + var17, (104 - arg2 - var15.field965) * 4 + 48 + var18);
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
        int var19 = this.field1463.method78(arg0, arg4, arg2);
        this.field1663 &= arg5;
        if (var19 != 0) {
            int var20 = this.field1463.method80(arg0, arg4, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method329(var23);
            if (var24.field978 != -1) {
                Pix8 var25 = this.field1328[var24.field978];
                if (var25 != null) {
                    int var26 = (var24.field964 * 4 - var25.field677) / 2;
                    int var27 = (var24.field965 * 4 - var25.field678) / 2;
                    var25.method198((byte) 0, arg4 * 4 + 48 + var26, (104 - arg2 - var24.field965) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1422.field664;
                int var30 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
                if (var21 != 0 && var21 != 2) {
                    var29[var30] = var28;
                    var29[var30 + 512 + 1] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                } else {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 + 3] = var28;
                }
            }
        }
        int var31 = this.field1463.method79(arg0, arg4, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method329(var32);
            if (var33.field978 != -1) {
                Pix8 var34 = this.field1328[var33.field978];
                if (var34 != null) {
                    int var35 = (var33.field964 * 4 - var34.field677) / 2;
                    int var36 = (var33.field965 * 4 - var34.field678) / 2;
                    var34.method198((byte) 0, arg4 * 4 + 48 + var35, (104 - arg2 - var33.field965) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method431(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1626 >= 100 && this.field1397 != 1) {
                this.method539("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 6, 0);
            } else if (this.field1626 >= 200) {
                this.method539("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 6, 0);
            } else {
                String var4 = JString.method303(JString.method300(586, arg0), 8);
                for (int var5 = 0; var5 < this.field1626; ++var5) {
                    if (this.field1269[var5] == arg0) {
                        this.method539(var4 + " is already on your friend list", "", (byte) 6, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1509; ++var6) {
                    if (this.field1358[var6] == arg0) {
                        this.method539("Please remove " + var4 + " from your ignore list first", "", (byte) 6, 0);
                        return;
                    }
                }
                if (!var4.equals(field1569.field462)) {
                    this.field1559[this.field1626] = var4;
                    this.field1269[this.field1626] = arg0;
                    this.field1434[this.field1626] = 0;
                    ++this.field1626;
                    this.field1602 = true;
                    if (!arg1) {
                        this.field1377.method217(9, (byte) 5);
                        this.field1377.method224(arg0, -25114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLy;I)V")
    public final void method432(byte arg0, PathingEntity arg1, int arg2) {
        if (arg0 != -105) {
            this.field1667 = -1;
        }
        this.method433(arg1.field400, arg2, 0, arg1.field401);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
            int var5 = this.method515(arg0, 526, arg3, this.field1644) - arg1;
            int var6 = arg0 - this.field1645;
            if (arg2 != 0) {
                this.field1272 = null;
            }
            int var7 = var5 - this.field1646;
            int var8 = arg3 - this.field1647;
            int var9 = Model.field603[this.field1648];
            int var10 = Model.field604[this.field1648];
            int var11 = Model.field603[this.field1649];
            int var12 = Model.field604[this.field1649];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1600 = (var13 << 9) / var17 + Pix3D.field642;
                this.field1601 = (var16 << 9) / var17 + Pix3D.field643;
            } else {
                this.field1600 = -1;
                this.field1601 = -1;
            }
        } else {
            this.field1600 = -1;
            this.field1601 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    public final void method434(Packet arg0, int arg1, int arg2) {
        if (arg2 == 21631) {
            if (arg1 != 70 && arg1 != 88) {
                if (arg1 == 30) {
                    int var4 = arg0.method228();
                    int var5 = (var4 >> 4 & 7) + this.field1629;
                    int var6 = (var4 & 7) + this.field1630;
                    int var7 = arg0.method228();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1263[var8];
                    int var11 = arg0.method230();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1578[this.field1644][var5][var6];
                        int var13 = this.field1578[this.field1644][var5 + 1][var6];
                        int var14 = this.field1578[this.field1644][var5 + 1][var6 + 1];
                        int var15 = this.field1578[this.field1644][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1463.method72(this.field1644, false, var5, var6);
                            if (var16 != null) {
                                int var17 = var16.field278 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field276 = new LocEntity(var11, var9 + 4, (byte) 69, false, var13, var12, var17, var15, 2, var14);
                                    var16.field277 = new LocEntity(var11, var9 + 1 & 3, (byte) 69, false, var13, var12, var17, var15, 2, var14);
                                } else {
                                    var16.field276 = new LocEntity(var11, var9, (byte) 69, false, var13, var12, var17, var15, var8, var14);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1463.method73(var5, this.field1644, var6, this.field1320);
                            if (var18 != null) {
                                var18.field169 = new LocEntity(var11, 0, (byte) 69, false, var13, var12, var18.field170 >> 14 & 32767, var15, 4, var14);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1463.method74(false, var5, this.field1644, var6);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field261 = new LocEntity(var11, var9, (byte) 69, false, var13, var12, var19.field269 >> 14 & 32767, var15, var8, var14);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1463.method75(this.field1644, var6, 358, var5);
                            if (var20 != null) {
                                var20.field200 = new LocEntity(var11, var9, (byte) 69, false, var13, var12, var20.field201 >> 14 & 32767, var15, 22, var14);
                            }
                        }
                    }
                } else if (arg1 == 120) {
                    int var21 = arg0.method228();
                    int var22 = (var21 >> 4 & 7) + this.field1629;
                    int var23 = (var21 & 7) + this.field1630;
                    int var24 = arg0.method230();
                    int var25 = arg0.method230();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field498 = var24;
                        var26.field499 = var25;
                        if (this.field1272[this.field1644][var22][var23] == null) {
                            this.field1272[this.field1644][var22][var23] = new LinkList((byte) 9);
                        }
                        this.field1272[this.field1644][var22][var23].method244(var26);
                        this.method546(var22, var23);
                    }
                } else if (arg1 == 115) {
                    int var27 = arg0.method228();
                    int var28 = (var27 >> 4 & 7) + this.field1629;
                    int var29 = (var27 & 7) + this.field1630;
                    int var30 = arg0.method230();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1272[this.field1644][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method247(); var32 != null; var32 = (ObjStackEntity) var31.method249(633)) {
                                if ((var30 & 32767) == var32.field498) {
                                    var32.method106();
                                    break;
                                }
                            }
                            if (var31.method247() == null) {
                                this.field1272[this.field1644][var28][var29] = null;
                            }
                            this.method546(var28, var29);
                        }
                    }
                } else if (arg1 == 37) {
                    int var33 = arg0.method228();
                    int var34 = (var33 >> 4 & 7) + this.field1629;
                    int var35 = (var33 & 7) + this.field1630;
                    int var36 = var34 + arg0.method229();
                    int var37 = var35 + arg0.method229();
                    int var38 = arg0.method231();
                    int var39 = arg0.method230();
                    int var40 = arg0.method228() * 4;
                    int var41 = arg0.method228() * 4;
                    int var42 = arg0.method230();
                    int var43 = arg0.method230();
                    int var44 = arg0.method228();
                    int var45 = arg0.method228();
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                        int var46 = var34 * 128 + 64;
                        int var47 = var35 * 128 + 64;
                        int var48 = var36 * 128 + 64;
                        int var49 = var37 * 128 + 64;
                        ProjectileEntity var50 = new ProjectileEntity(var39, field1223 + var42, var38, var47, this.method515(var46, 526, var47, this.field1644) - var40, this.field1644, var44, var41, field1223 + var43, var46, true, var45);
                        var50.method119(var48, 0, this.method515(var48, 526, var49, this.field1644) - var41, var49, field1223 + var42);
                        this.field1514.method244(var50);
                    }
                } else if (arg1 == 114) {
                    int var51 = arg0.method228();
                    int var52 = (var51 >> 4 & 7) + this.field1629;
                    int var53 = (var51 & 7) + this.field1630;
                    int var54 = arg0.method230();
                    int var55 = arg0.method228();
                    int var56 = arg0.method230();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(false, field1223, var54, var58, var56, this.field1644, this.method515(var57, 526, var58, this.field1644) - var55, var57);
                        this.field1467.method244(var59);
                    }
                } else if (arg1 == 8) {
                    int var60 = arg0.method228();
                    int var61 = (var60 >> 4 & 7) + this.field1629;
                    int var62 = (var60 & 7) + this.field1630;
                    int var63 = arg0.method230();
                    int var64 = arg0.method230();
                    int var65 = arg0.method230();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1631 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field498 = var63;
                        var66.field499 = var64;
                        if (this.field1272[this.field1644][var61][var62] == null) {
                            this.field1272[this.field1644][var61][var62] = new LinkList((byte) 9);
                        }
                        this.field1272[this.field1644][var61][var62].method244(var66);
                        this.method546(var61, var62);
                    }
                } else {
                    if (arg1 == 218) {
                        int var67 = arg0.method228();
                        int var68 = (var67 >> 4 & 7) + this.field1629;
                        int var69 = (var67 & 7) + this.field1630;
                        int var70 = arg0.method228();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1263[var71];
                        int var74 = arg0.method230();
                        int var75 = arg0.method230();
                        int var76 = arg0.method230();
                        int var77 = arg0.method230();
                        byte var78 = arg0.method229();
                        byte var79 = arg0.method229();
                        byte var80 = arg0.method229();
                        byte var81 = arg0.method229();
                        PlayerEntity var82;
                        if (this.field1631 == var77) {
                            var82 = field1569;
                        } else {
                            var82 = this.field1309[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method329(var74);
                            int var84 = this.field1578[this.field1644][var68][var69];
                            int var85 = this.field1578[this.field1644][var68 + 1][var69];
                            int var86 = this.field1578[this.field1644][var68 + 1][var69 + 1];
                            int var87 = this.field1578[this.field1644][var68][var69 + 1];
                            Model var88 = var83.method335(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method490(-1, var76 + 1, var75 + 1, var69, var68, 0, var73, false, 0, this.field1644);
                                var82.field471 = field1223 + var75;
                                var82.field472 = field1223 + var76;
                                var82.field476 = var88;
                                int var89 = var83.field964;
                                int var90 = var83.field965;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field965;
                                    var90 = var83.field964;
                                }
                                var82.field473 = var68 * 128 + var89 * 64;
                                var82.field475 = var69 * 128 + var90 * 64;
                                var82.field474 = this.method515(var82.field473, 526, var82.field475, this.field1644);
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
                                var82.field477 = var68 + var78;
                                var82.field479 = var68 + var80;
                                var82.field478 = var69 + var79;
                                var82.field480 = var69 + var81;
                            }
                        }
                    }
                    if (arg1 == 98) {
                        int var93 = arg0.method228();
                        int var94 = (var93 >> 4 & 7) + this.field1629;
                        int var95 = (var93 & 7) + this.field1630;
                        int var96 = arg0.method230();
                        int var97 = arg0.method230();
                        int var98 = arg0.method230();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1272[this.field1644][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method247(); var100 != null; var100 = (ObjStackEntity) var99.method249(633)) {
                                    if ((var96 & 32767) == var100.field498 && var100.field499 == var97) {
                                        var100.field499 = var98;
                                        break;
                                    }
                                }
                                this.method546(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var101 = arg0.method228();
                int var102 = (var101 >> 4 & 7) + this.field1629;
                int var103 = (var101 & 7) + this.field1630;
                int var104 = arg0.method228();
                int var105 = var104 >> 2;
                int var106 = var104 & 3;
                int var107 = this.field1263[var105];
                int var108;
                if (arg1 == 88) {
                    var108 = -1;
                } else {
                    var108 = arg0.method230();
                }
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    this.method490(var108, -1, 0, var103, var102, var105, var107, false, var106, this.field1644);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method435(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    private final void method436(int arg0) {
        LocSpawned var2 = (LocSpawned) this.field1607.method247();
        if (arg0 <= 0) {
            this.field1667 = -1;
        }
        while (var2 != null) {
            if (var2.field743 == -1) {
                var2.field742 = 0;
                this.method477(0, var2);
            } else {
                var2.method106();
            }
            var2 = (LocSpawned) this.field1607.method249(633);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public final boolean method437(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1561[var15][var35] = 0;
                this.field1306[var15][var35] = 99999999;
            }
        }
        int var16 = arg5;
        int var17 = arg0;
        this.field1561[arg5][arg0] = 99;
        this.field1306[arg5][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1603[var18] = arg5;
        int var36 = var18 + 1;
        this.field1604[var18] = arg0;
        this.field1666 += arg8;
        boolean var20 = false;
        int var21 = this.field1603.length;
        int[][] var22 = this.field1485[this.field1644].field1095;
        while (var36 != var19) {
            var16 = this.field1603[var19];
            var17 = this.field1604[var19];
            var19 = (var19 + 1) % var21;
            if (arg1 == var16 && arg6 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field1485[this.field1644].method365(arg10, var17, arg1, arg6, arg4 - 1, this.field1262, var16)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field1485[this.field1644].method366(arg1, (byte) -96, var16, var17, arg6, arg4 - 1, arg10)) {
                    var20 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg9 != 0 && this.field1485[this.field1644].method367(arg3, var16, arg1, arg6, arg9, arg7, -245, var17)) {
                var20 = true;
                break;
            }
            int var34 = this.field1306[var16][var17] + 1;
            if (var16 > 0 && this.field1561[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1603[var36] = var16 - 1;
                this.field1604[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 - 1][var17] = 2;
                this.field1306[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1561[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1603[var36] = var16 + 1;
                this.field1604[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 + 1][var17] = 8;
                this.field1306[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1561[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1603[var36] = var16;
                this.field1604[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16][var17 - 1] = 1;
                this.field1306[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1561[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1603[var36] = var16;
                this.field1604[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16][var17 + 1] = 4;
                this.field1306[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1561[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1603[var36] = var16 - 1;
                this.field1604[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 - 1][var17 - 1] = 3;
                this.field1306[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1561[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1603[var36] = var16 + 1;
                this.field1604[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 + 1][var17 - 1] = 9;
                this.field1306[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1561[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1603[var36] = var16 - 1;
                this.field1604[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 - 1][var17 + 1] = 6;
                this.field1306[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1561[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1603[var36] = var16 + 1;
                this.field1604[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1561[var16 + 1][var17 + 1] = 12;
                this.field1306[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1654 = 0;
        if (!var20) {
            if (arg2) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg1 - var24; var25 <= arg1 + var24; ++var25) {
                        for (int var26 = arg6 - var24; var26 <= arg6 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1306[var25][var26] < var23) {
                                var23 = this.field1306[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1654 = 1;
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
        this.field1603[var27] = var16;
        int var37 = var27 + 1;
        this.field1604[var27] = var17;
        int var28;
        int var29 = var28 = this.field1561[var16][var17];
        while (arg5 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1603[var37] = var16;
                this.field1604[var37++] = var17;
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
            var29 = this.field1561[var16][var17];
        }
        if (var37 <= 0) {
            if (arg11 == 1) {
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
            int var31 = this.field1603[var37];
            int var32 = this.field1604[var37];
            if (arg11 == 0) {
                this.field1377.method217(6, (byte) 5);
                this.field1377.method218(var30 + var30 + 3);
            }
            if (arg11 == 1) {
                this.field1377.method217(220, (byte) 5);
                this.field1377.method218(var30 + var30 + 3 + 14);
            }
            if (arg11 == 2) {
                this.field1377.method217(127, (byte) 5);
                this.field1377.method218(var30 + var30 + 3);
            }
            if (super.field31[5] == 1) {
                this.field1377.method218(1);
            } else {
                this.field1377.method218(0);
            }
            this.field1377.method219(this.field1593 + var31);
            this.field1377.method219(this.field1594 + var32);
            this.field1420 = this.field1603[0];
            this.field1421 = this.field1604[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1377.method218(this.field1603[var37] - var31);
                this.field1377.method218(this.field1604[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method438(int arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1312; ++var4) {
            int var5 = this.field1313[var4];
            NpcEntity var6 = this.field1259[var5];
            int var7 = arg2.method228();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method228();
                int var9 = arg2.method228();
                var6.method114(14691, field1223, var8, var9);
                var6.field419 = field1223 + 300;
                var6.field420 = arg2.method228();
                var6.field421 = arg2.method228();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method230();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field428 == var10) {
                    var6.field432 = 0;
                }
                int var11 = arg2.method228();
                if (var6.field428 == var10 && var10 != -1) {
                    int var12 = SeqType.field1136[var10].field1150;
                    if (var12 == 1) {
                        var6.field429 = 0;
                        var6.field430 = 0;
                        var6.field431 = var11;
                        var6.field432 = 0;
                    }
                    if (var12 == 2) {
                        var6.field432 = 0;
                    }
                } else if (var10 == -1 || var6.field428 == -1 || SeqType.field1136[var10].field1144 >= SeqType.field1136[var6.field428].field1144) {
                    var6.field428 = var10;
                    var6.field429 = 0;
                    var6.field430 = 0;
                    var6.field431 = var11;
                    var6.field432 = 0;
                    var6.field454 = var6.field449;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field422 = arg2.method230();
                if (var6.field422 == 65535) {
                    var6.field422 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field412 = arg2.method235();
                var6.field413 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method228();
                int var14 = arg2.method228();
                var6.method114(14691, field1223, var13, var14);
                var6.field419 = field1223 + 300;
                var6.field420 = arg2.method228();
                var6.field421 = arg2.method228();
            }
            if ((var7 & 32) == 32) {
                var6.field458 = NpcType.method339(arg2.method230());
                var6.field404 = var6.field458.field1010;
                var6.field448 = var6.field458.field1032;
                var6.field407 = var6.field458.field1014;
                var6.field408 = var6.field458.field1015;
                var6.field409 = var6.field458.field1016;
                var6.field410 = var6.field458.field1017;
                var6.field405 = var6.field458.field1013;
            }
            if ((var7 & 64) == 64) {
                var6.field433 = arg2.method230();
                int var15 = arg2.method233();
                var6.field437 = var15 >> 16;
                var6.field436 = (var15 & 65535) + field1223;
                var6.field434 = 0;
                var6.field435 = 0;
                if (var6.field436 > field1223) {
                    var6.field434 = -1;
                }
                if (var6.field433 == 65535) {
                    var6.field433 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field423 = arg2.method230();
                var6.field424 = arg2.method230();
            }
        }
        if (this.field1408 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method439(int arg0, Component arg1) {
        int var3 = 4 / arg0;
        int var4 = arg1.field83;
        if (this.field1627 == 2) {
            if (var4 == 201) {
                this.field1490 = true;
                this.field1516 = false;
                this.field1661 = true;
                this.field1414 = "";
                this.field1537 = 1;
                this.field1576 = "Enter name of friend to add to list";
            }
            if (var4 == 202) {
                this.field1490 = true;
                this.field1516 = false;
                this.field1661 = true;
                this.field1414 = "";
                this.field1537 = 2;
                this.field1576 = "Enter name of friend to delete from list";
            }
        }
        if (var4 == 205) {
            this.field1670 = 250;
            return true;
        } else {
            if (var4 == 501) {
                this.field1490 = true;
                this.field1516 = false;
                this.field1661 = true;
                this.field1414 = "";
                this.field1537 = 4;
                this.field1576 = "Enter name of player to add to list";
            }
            if (var4 == 502) {
                this.field1490 = true;
                this.field1516 = false;
                this.field1661 = true;
                this.field1414 = "";
                this.field1537 = 5;
                this.field1576 = "Enter name of player to delete from list";
            }
            if (var4 >= 300 && var4 <= 313) {
                int var5 = (var4 - 300) / 2;
                int var6 = var4 & 1;
                int var7 = this.field1591[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = IdkType.field1112 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= IdkType.field1112) {
                                var7 = 0;
                            }
                        }
                        if (!IdkType.field1113[var7].field1119 && IdkType.field1113[var7].field1114 == var5 + (this.field1518 ? 0 : 7)) {
                            this.field1591[var5] = var7;
                            this.field1533 = true;
                            break;
                        }
                    }
                }
            }
            if (var4 >= 314 && var4 <= 323) {
                int var8 = (var4 - 314) / 2;
                int var9 = var4 & 1;
                int var10 = this.field1296[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field1228[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field1228[var8].length) {
                        var10 = 0;
                    }
                }
                this.field1296[var8] = var10;
                this.field1533 = true;
            }
            if (var4 == 324 && !this.field1518) {
                this.field1518 = true;
                this.method513(0);
            }
            if (var4 == 325 && this.field1518) {
                this.field1518 = false;
                this.method513(0);
            }
            if (var4 != 326) {
                if (var4 == 613) {
                    this.field1451 = !this.field1451;
                }
                if (var4 >= 601 && var4 <= 612) {
                    this.method453(-711);
                    if (this.field1489.length() > 0) {
                        this.field1377.method217(203, (byte) 5);
                        this.field1377.method224(JString.method299(this.field1489), -25114);
                        this.field1377.method218(var4 - 601);
                        this.field1377.method218(this.field1451 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1377.method217(13, (byte) 5);
                this.field1377.method218(this.field1518 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field1377.method218(this.field1591[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field1377.method218(this.field1296[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method440(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field74[arg2];
        for (int var6 = 0; var6 < var5.field96.length && var5.field96[var6] != -1; ++var6) {
            Component var7 = Component.field74[var5.field96[var6]];
            if (var7.field81 == 1) {
                var4 |= this.method440(1, arg1, var7.field79);
            }
            if (var7.field81 == 6 && (var7.field127 != -1 || var7.field128 != -1)) {
                boolean var8 = this.method484(var7, this.field1319);
                int var9;
                if (var8) {
                    var9 = var7.field128;
                } else {
                    var9 = var7.field127;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1136[var9];
                    var7.field78 += arg1;
                    while (var7.field78 > var10.method379(1, var7.field77)) {
                        var7.field78 -= var10.method379(1, var7.field77) + 1;
                        ++var7.field77;
                        if (var7.field77 >= var10.field1137) {
                            var7.field77 -= var10.field1141;
                            if (var7.field77 < 0 || var7.field77 >= var10.field1137) {
                                var7.field77 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg0 != 1) {
            this.field1479 = this.field1535.method294();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method441(boolean arg0) {
        if (this.field1584 == null) {
            this.method534(true);
            super.field14 = null;
            this.field1538 = null;
            this.field1539 = null;
            this.field1540 = null;
            this.field1541 = null;
            this.field1542 = null;
            this.field1543 = null;
            this.field1544 = null;
            this.field1545 = null;
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field1546 = null;
            this.field1584 = new PixMap(479, 96, 47904, this.method11(-125));
            this.field1582 = new PixMap(172, 156, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1443.method198((byte) 0, 0, 0);
            this.field1581 = new PixMap(190, 261, 47904, this.method11(-125));
            this.field1583 = new PixMap(512, 334, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1588 = new PixMap(496, 50, 47904, this.method11(-125));
            this.field1589 = new PixMap(269, 37, 47904, this.method11(-125));
            this.field1590 = new PixMap(249, 45, 47904, this.method11(-125));
            this.field1394 = true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method442(int arg0) {
        if (this.field1232 == 2) {
            this.method433((this.field1673 - this.field1593 << 7) + this.field1676, this.field1675 * 2, 0, (this.field1674 - this.field1594 << 7) + this.field1677);
            if (arg0 < 9 || arg0 > 9) {
                this.field1272 = null;
            }
            if (this.field1600 > -1 && field1223 % 20 < 10) {
                this.field1279[2].method185((byte) 0, this.field1600 - 12, this.field1601 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method443(byte arg0, long arg1) {
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg1 != 0L) {
            for (int var6 = 0; var6 < this.field1626; ++var6) {
                if (this.field1269[var6] == arg1) {
                    --this.field1626;
                    this.field1602 = true;
                    for (int var7 = var6; var7 < this.field1626; ++var7) {
                        this.field1559[var7] = this.field1559[var7 + 1];
                        this.field1434[var7] = this.field1434[var7 + 1];
                        this.field1269[var7] = this.field1269[var7 + 1];
                    }
                    this.field1377.method217(84, (byte) 5);
                    this.field1377.method224(arg1, -25114);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        if (this.field1517 != 0) {
            PixFont var2 = this.field1524;
            int var3 = 0;
            if (this.field1303 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1343[var4] != null) {
                    int var6 = this.field1341[var4];
                    String var7 = this.field1342[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1678 == 0 || this.field1678 == 1 && this.method455(-983, var7))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method203("From", 0, var9, (byte) 110, var10);
                        var2.method203("From", 65535, var9 - 1, (byte) 110, var10);
                        int var11 = var10 + var2.method202(false, "From ");
                        if (var8 == 1) {
                            this.field1331[0].method198((byte) 0, var11, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field1331[1].method198((byte) 0, var11, var9 - 12);
                            var11 += 14;
                        }
                        var2.method203(var7 + ": " + this.field1343[var4], 0, var9, (byte) 110, var11);
                        var2.method203(var7 + ": " + this.field1343[var4], 65535, var9 - 1, (byte) 110, var11);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1678 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method203(this.field1343[var4], 0, var12, (byte) 110, 4);
                        var2.method203(this.field1343[var4], 65535, var12 - 1, (byte) 110, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1678 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method203("To " + var7 + ": " + this.field1343[var4], 0, var13, (byte) 110, 4);
                        var2.method203("To " + var7 + ": " + this.field1343[var4], 65535, var13 - 1, (byte) 110, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)Z")
    public final boolean method445(boolean arg0) {
        if (arg0) {
            this.field1377.method218(142);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        Graphics var2 = this.method11(-125).getGraphics();
        if (!arg0) {
            field1486 = this.field1535.method294();
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, (byte) -106);
        if (this.field1527) {
            this.field1315 = false;
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
        if (this.field1273) {
            this.field1315 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1410) {
            this.field1315 = false;
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public void method447(int arg0) {
        System.out.println("============");
        if (arg0 < 0) {
            System.out.println("flame-cycle:" + this.field1550);
            if (this.field1480 != null) {
                System.out.println("Od-cycle:" + this.field1480.field852);
            }
            System.out.println("loop-cycle:" + field1223);
            System.out.println("draw-cycle:" + field1632);
            System.out.println("ptype:" + this.field1667);
            System.out.println("psize:" + this.field1666);
            if (this.field1357 != null) {
                this.field1357.method43(-747);
            }
            super.field10 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        this.method444(false);
        if (this.field1352 == 1) {
            this.field1613[this.field1351 / 100].method185((byte) 0, this.field1349 - 8 - 4, this.field1350 - 8 - 4);
        }
        if (this.field1352 == 2) {
            this.field1613[this.field1351 / 100 + 4].method185((byte) 0, this.field1349 - 8 - 4, this.field1350 - 8 - 4);
            ++field1470;
            if (field1470 > 57) {
                field1470 = 0;
                this.field1377.method217(100, (byte) 5);
            }
        }
        if (this.field1297 != -1) {
            this.method440(1, this.field1347, this.field1297);
            this.method543(0, false, 0, 0, Component.field74[this.field1297]);
        }
        if (this.field1227 != -1) {
            this.method440(1, this.field1347, this.field1227);
            this.method543(0, false, 0, 0, Component.field74[this.field1227]);
        }
        this.method480(false);
        this.field1663 &= arg0;
        if (!this.field1354) {
            this.method544(false);
            this.method456(188);
        } else if (this.field1656 == 0) {
            this.method516(243);
        }
        if (this.field1623 == 1) {
            this.field1279[1].method185((byte) 0, 472, 296);
        }
        if (this.field1303 != 0) {
            int var2 = this.field1303 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1524.method203("System update in: " + var3 + ":0" + var4, 16776960, 329, (byte) 110, 4);
            } else {
                this.field1524.method203("System update in: " + var3 + ":" + var4, 16776960, 329, (byte) 110, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method449(int arg0) {
        if (this.field1670 > 0) {
            this.method475(2408);
        } else {
            this.field1583.method257(0);
            this.field1524.method200(-544, 144, 257, "Connection lost", 0);
            this.field1524.method200(-544, 143, 256, "Connection lost", 16777215);
            this.field1524.method200(-544, 159, 257, "Please wait - attempting to reestablish", 0);
            this.field1524.method200(-544, 158, 256, "Please wait - attempting to reestablish", 16777215);
            while (arg0 >= 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field1583.method258(4, -740, super.field13, 4);
            this.field1420 = 0;
            ClientStream var3 = this.field1357;
            this.field1663 = false;
            this.method464(this.field1293, this.field1294, true);
            if (!this.field1663) {
                this.method475(2408);
            }
            try {
                var3.method38();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method450(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method451(int arg0, boolean arg1) {
        if (arg1) {
            this.method6();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method452(int arg0, int arg1, int arg2) {
        if (this.field1471 != arg2) {
            this.field1570 = this.field1535.method294();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1343[var5] != null) {
                int var6 = this.field1341[var5];
                int var7 = 70 - var4 * 14 + this.field1636 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1342[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1329 == 0 || this.field1329 == 1 && this.method455(-983, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1569.field462)) {
                        if (this.field1617 >= 1) {
                            this.field1481[this.field1458] = "Report abuse @whi@" + var8;
                            this.field1370[this.field1458] = 524;
                            ++this.field1458;
                        }
                        this.field1481[this.field1458] = "Add ignore @whi@" + var8;
                        this.field1370[this.field1458] = 47;
                        ++this.field1458;
                        this.field1481[this.field1458] = "Add friend @whi@" + var8;
                        this.field1370[this.field1458] = 605;
                        ++this.field1458;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1517 == 0 && (var6 == 7 || this.field1678 == 0 || this.field1678 == 1 && this.method455(-983, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1617 >= 1) {
                            this.field1481[this.field1458] = "Report abuse @whi@" + var8;
                            this.field1370[this.field1458] = 524;
                            ++this.field1458;
                        }
                        this.field1481[this.field1458] = "Add ignore @whi@" + var8;
                        this.field1370[this.field1458] = 47;
                        ++this.field1458;
                        this.field1481[this.field1458] = "Add friend @whi@" + var8;
                        this.field1370[this.field1458] = 605;
                        ++this.field1458;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1375 == 0 || this.field1375 == 1 && this.method455(-983, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1481[this.field1458] = "Accept trade @whi@" + var8;
                        this.field1370[this.field1458] = 507;
                        ++this.field1458;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1517 == 0 && this.field1678 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1375 == 0 || this.field1375 == 1 && this.method455(-983, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1481[this.field1458] = "Accept duel @whi@" + var8;
                        this.field1370[this.field1458] = 957;
                        ++this.field1458;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method453(int arg0) {
        this.field1377.method217(58, (byte) 5);
        if (this.field1353 != -1) {
            this.field1353 = -1;
            this.field1602 = true;
            this.field1446 = false;
            this.field1488 = true;
        }
        if (this.field1276 != -1) {
            this.field1276 = -1;
            this.field1490 = true;
            this.field1446 = false;
        }
        this.field1227 = -1;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method454(int arg0) {
        if (this.field1517 != 0) {
            int var2 = 0;
            if (this.field1303 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1343[var3] != null) {
                    int var4 = this.field1341[var3];
                    String var5 = this.field1342[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1678 == 0 || this.field1678 == 1 && this.method455(-983, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field21 > 4 && super.field22 - 4 > var9 - 10 && super.field22 - 4 <= var9 + 3) {
                            int var10 = this.field1524.method202(false, "From:  " + var5 + this.field1343[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field21 < var10 + 4) {
                                if (this.field1617 >= 1) {
                                    this.field1481[this.field1458] = "Report abuse @whi@" + var5;
                                    this.field1370[this.field1458] = 2524;
                                    ++this.field1458;
                                }
                                this.field1481[this.field1458] = "Add ignore @whi@" + var5;
                                this.field1370[this.field1458] = 2047;
                                ++this.field1458;
                                this.field1481[this.field1458] = "Add friend @whi@" + var5;
                                this.field1370[this.field1458] = 2605;
                                ++this.field1458;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1678 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 >= 0) {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1410 && !this.field1527 && !this.field1273) {
            ++field1223;
            if (!this.field1663) {
                this.method429(8);
            } else {
                this.method491(true);
            }
            this.method541((byte) 4);
            this.field1666 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method455(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1626; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1559[var3])) {
                    return true;
                }
            }
            if (arg0 >= 0) {
                this.field1667 = this.field1376.method228();
            }
            return arg1.equalsIgnoreCase(field1569.field462);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method456(int arg0) {
        if (this.field1458 >= 2 || this.field1402 != 0 || this.field1438 != 0) {
            String var2;
            if (this.field1402 == 1 && this.field1458 < 2) {
                var2 = "Use " + this.field1406 + " with...";
            } else if (this.field1438 == 1 && this.field1458 < 2) {
                var2 = this.field1441 + "...";
            } else {
                var2 = this.field1481[this.field1458 - 1];
            }
            if (this.field1458 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1458 - 2) + " more options";
            }
            this.field1525.method206(true, var2, 15, 16777215, field1223 / 1000, 25755, 4);
            int var3 = 17 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method457(byte arg0, byte[] arg1, int arg2) {
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field1667 = this.field1376.method228();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (arg0 != -44088) {
            field1486 = this.field1535.method294();
        }
        try {
            this.field1564 = -1;
            this.field1467.method251();
            this.field1514.method251();
            Pix3D.method166(-331);
            this.method523(-31779);
            this.field1463.method50(this.field1474);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1485[var2].method356(3);
            }
            System.gc();
            World var3 = new World(this.field1578, 104, 7, this.field1392, 104);
            int var4 = this.field1372.length;
            World.field44 = World3D.field289;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1224[var5] >> 8;
                int var7 = this.field1224[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field44 = false;
                }
            }
            if (World.field44) {
                this.field1463.method51(this.field1644, -234);
            } else {
                this.field1463.method51(0, -234);
            }
            this.field1377.method217(239, (byte) 5);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1224[var8] >> 8) * 64 - this.field1593;
                int var10 = (this.field1224[var8] & 255) * 64 - this.field1594;
                byte[] var11 = this.field1372[var8];
                if (var11 != null) {
                    var3.method15(var10, (this.field1476 - 6) * 8, (this.field1477 - 6) * 8, var9, 34545, var11);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1224[var12] >> 8) * 64 - this.field1593;
                int var14 = (this.field1224[var12] & 255) * 64 - this.field1594;
                byte[] var15 = this.field1372[var12];
                if (var15 == null && this.field1477 < 800) {
                    var3.method14(0, 64, var14, var13, 64);
                }
            }
            this.field1377.method217(239, (byte) 5);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1640[var16];
                if (var17 != null) {
                    int var18 = (this.field1224[var16] >> 8) * 64 - this.field1593;
                    int var19 = (this.field1224[var16] & 255) * 64 - this.field1594;
                    var3.method18(var19, var18, var17, this.field1463, this.field1485, -128);
                }
            }
            this.field1377.method217(239, (byte) 5);
            var3.method20(false, this.field1463, this.field1485);
            this.field1583.method257(0);
            this.field1377.method217(239, (byte) 5);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method546(var20, var21);
                }
            }
            this.method436(801);
        } catch (Exception var34) {
        }
        LocType.field991.method103();
        if (field1462 && signlink.cache_dat != null) {
            int var23 = this.field1480.method271(73, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1480.method276(var24, field1513);
                if ((var25 & 121) == 0) {
                    Model.method124(var24, (byte) -115);
                }
            }
        }
        System.gc();
        Pix3D.method167(20, field1445);
        this.field1480.method282(29974);
        int var26 = (this.field1476 - 6) / 8 - 1;
        int var27 = (this.field1476 + 6) / 8 + 1;
        int var28 = (this.field1477 - 6) / 8 - 1;
        int var29 = (this.field1477 + 6) / 8 + 1;
        if (this.field1534) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1480.method273(23320, var30, 0, var31);
                    if (var32 != -1) {
                        this.field1480.method283(3, (byte) 3, var32);
                    }
                    int var33 = this.field1480.method273(23320, var30, 1, var31);
                    if (var33 != -1) {
                        this.field1480.method283(3, (byte) 3, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method459(byte arg0) {
        for (int var2 = -1; var2 < this.field1310; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1308;
            } else {
                var6 = this.field1311[var2];
            }
            PlayerEntity var7 = this.field1309[var6];
            if (var7 != null && var7.field413 > 0) {
                --var7.field413;
                if (var7.field413 == 0) {
                    var7.field412 = null;
                }
            }
        }
        if (arg0 != 9) {
            this.field1667 = this.field1376.method228();
        }
        for (int var3 = 0; var3 < this.field1260; ++var3) {
            int var4 = this.field1261[var3];
            NpcEntity var5 = this.field1259[var4];
            if (var5 != null && var5.field413 > 0) {
                --var5.field413;
                if (var5.field413 == 0) {
                    var5.field412 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (field1233) {
            this.field1410 = true;
        } else {
            field1233 = true;
            boolean var1 = false;
            String var2 = this.method549((byte) 97);
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
                this.field1273 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1499[var3] = new FileStream(-5745, signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1665[8] = 0;
                    while (this.field1665[8] == 0) {
                        this.method13(20, "Connecting to web server", 7);
                        try {
                            DataInputStream var5 = this.method435("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(new byte[36], true);
                            var5.readFully(var6.field713, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1665[var7] = var6.method233();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(10, "Error loading - Will retry in " + var8 + " secs.", 7);
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
                    this.field1497 = this.method552("title", 1, "title screen", this.field1665[1], (byte) 7, 25);
                    this.field1523 = new PixFont(this.field1497, "p11");
                    this.field1524 = new PixFont(this.field1497, "p12");
                    this.field1525 = new PixFontFull(field1229, "b12_full", this.field1497);
                    this.field1526 = new PixFont(this.field1497, "q8");
                    this.method465(field1425);
                    this.method525(29758);
                    Jagfile var9 = this.method552("config", 2, "config", this.field1665[2], (byte) 7, 30);
                    Jagfile var10 = this.method552("interface", 3, "interface", this.field1665[3], (byte) 7, 35);
                    Jagfile var11 = this.method552("media", 4, "2d graphics", this.field1665[4], (byte) 7, 40);
                    Jagfile var12 = this.method552("textures", 6, "textures", this.field1665[6], (byte) 7, 45);
                    Jagfile var13 = this.method552("wordenc", 7, "chat system", this.field1665[7], (byte) 7, 50);
                    Jagfile var14 = this.method552("sounds", 8, "sound effects", this.field1665[8], (byte) 7, 55);
                    this.field1392 = new byte[4][104][104];
                    this.field1578 = new int[4][105][105];
                    this.field1463 = new World3D(-15570, 104, 104, this.field1578, 4);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1485[var15] = new CollisionMap(field1486, 104, 104);
                    }
                    this.field1422 = new Pix32(512, 512);
                    Jagfile var16 = this.method552("versionlist", 5, "update list", this.field1665[5], (byte) 7, 60);
                    this.method13(60, "Connecting to update server", 7);
                    this.field1480 = new OnDemand();
                    this.field1480.method269(var16, this);
                    AnimFrame.method44(this.field1480.method272(0));
                    Model.method122(this.field1480.method271(73, 0), this.field1480);
                    if (!field1462) {
                        this.field1449 = 0;
                        this.field1450 = false;
                        this.field1480.method278(2, this.field1449);
                        while (this.field1480.method279() > 0) {
                            this.method541((byte) 4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13(65, "Requesting animations", 7);
                    int var17 = this.field1480.method271(73, 1);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1480.method278(1, var18);
                    }
                    while (this.field1480.method279() > 0) {
                        int var19 = var17 - this.field1480.method279();
                        if (var19 > 0) {
                            this.method13(65, "Loading animations - " + var19 * 100 / var17 + "%", 7);
                        }
                        this.method541((byte) 4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13(70, "Requesting models", 7);
                    int var20 = this.field1480.method271(73, 0);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1480.method276(var21, field1513);
                        if ((var22 & 1) != 0) {
                            this.field1480.method278(0, var21);
                        }
                    }
                    int var23 = this.field1480.method279();
                    while (this.field1480.method279() > 0) {
                        int var24 = var23 - this.field1480.method279();
                        if (var24 > 0) {
                            this.method13(70, "Loading models - " + var24 * 100 / var23 + "%", 7);
                        }
                        this.method541((byte) 4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1499[0] != null) {
                        this.method13(75, "Requesting maps", 7);
                        this.field1480.method278(3, this.field1480.method273(23320, 47, 0, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 47, 1, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 0, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 1, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 49, 0, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 49, 1, 48));
                        this.field1480.method278(3, this.field1480.method273(23320, 47, 0, 47));
                        this.field1480.method278(3, this.field1480.method273(23320, 47, 1, 47));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 0, 47));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 1, 47));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 0, 148));
                        this.field1480.method278(3, this.field1480.method273(23320, 48, 1, 148));
                        int var25 = this.field1480.method279();
                        while (this.field1480.method279() > 0) {
                            int var26 = var25 - this.field1480.method279();
                            if (var26 > 0) {
                                this.method13(75, "Loading maps - " + var26 * 100 / var25 + "%", 7);
                            }
                            this.method541((byte) 4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1480.method271(73, 0);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1480.method276(var28, field1513);
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
                            this.field1480.method281(var28, var30, true, 0);
                        }
                    }
                    this.field1480.method274(field1461, (byte) 2);
                    if (!field1462) {
                        int var31 = this.field1480.method271(73, 2);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1480.method277(field1475, var32)) {
                                this.field1480.method281(var32, (byte) 1, true, 2);
                            }
                        }
                    }
                    this.method13(80, "Unpacking media", 7);
                    this.field1442 = new Pix8(var11, "invback", 0);
                    this.field1444 = new Pix8(var11, "chatback", 0);
                    this.field1443 = new Pix8(var11, "mapback", 0);
                    this.field1493 = new Pix8(var11, "backbase1", 0);
                    this.field1494 = new Pix8(var11, "backbase2", 0);
                    this.field1495 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1464[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1355 = new Pix32(var11, "compass", 0);
                    this.field1318 = new Pix32(var11, "mapedge", 0);
                    this.field1318.method182(false);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1328[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1234[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1633[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1279[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1217 = new Pix32(var11, "mapmarker", 0);
                    this.field1218 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1613[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1337 = new Pix32(var11, "mapdots", 0);
                    this.field1338 = new Pix32(var11, "mapdots", 1);
                    this.field1339 = new Pix32(var11, "mapdots", 2);
                    this.field1340 = new Pix32(var11, "mapdots", 3);
                    this.field1290 = new Pix8(var11, "scrollbar", 0);
                    this.field1291 = new Pix8(var11, "scrollbar", 1);
                    this.field1571 = new Pix8(var11, "redstone1", 0);
                    this.field1572 = new Pix8(var11, "redstone2", 0);
                    this.field1573 = new Pix8(var11, "redstone3", 0);
                    this.field1574 = new Pix8(var11, "redstone1", 0);
                    this.field1574.method195(false);
                    this.field1575 = new Pix8(var11, "redstone2", 0);
                    this.field1575.method195(false);
                    this.field1237 = new Pix8(var11, "redstone1", 0);
                    this.field1237.method196(-489);
                    this.field1238 = new Pix8(var11, "redstone2", 0);
                    this.field1238.method196(-489);
                    this.field1239 = new Pix8(var11, "redstone3", 0);
                    this.field1239.method196(-489);
                    this.field1240 = new Pix8(var11, "redstone1", 0);
                    this.field1240.method195(false);
                    this.field1240.method196(-489);
                    this.field1241 = new Pix8(var11, "redstone2", 0);
                    this.field1241.method195(false);
                    this.field1241.method196(-489);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1331[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1500 = new PixMap(var40.field665, var40.field666, 47904, this.method11(-125));
                    var40.method183(0, 0, 0);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1501 = new PixMap(var41.field665, var41.field666, 47904, this.method11(-125));
                    var41.method183(0, 0, 0);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1502 = new PixMap(var42.field665, var42.field666, 47904, this.method11(-125));
                    var42.method183(0, 0, 0);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1503 = new PixMap(var43.field665, var43.field666, 47904, this.method11(-125));
                    var43.method183(0, 0, 0);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1504 = new PixMap(var44.field665, var44.field666, 47904, this.method11(-125));
                    var44.method183(0, 0, 0);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1505 = new PixMap(var45.field665, var45.field666, 47904, this.method11(-125));
                    var45.method183(0, 0, 0);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1506 = new PixMap(var46.field665, var46.field666, 47904, this.method11(-125));
                    var46.method183(0, 0, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1507 = new PixMap(var47.field665, var47.field666, 47904, this.method11(-125));
                    var47.method183(0, 0, 0);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1508 = new PixMap(var48.field665, var48.field666, 47904, this.method11(-125));
                    var48.method183(0, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1234[var53] != null) {
                            this.field1234[var53].method181(var51 + var52, var49 + var52, var50 + var52, field1255);
                        }
                        if (this.field1328[var53] != null) {
                            this.field1328[var53].method197(var51 + var52, var49 + var52, var50 + var52, field1255);
                        }
                    }
                    this.method13(83, "Unpacking textures", 7);
                    Pix3D.method168(var12, 2);
                    Pix3D.method172(4, 0.8D);
                    Pix3D.method167(20, field1445);
                    this.method13(86, "Unpacking config", 7);
                    SeqType.method378(6771, var9);
                    LocType.method327(var9);
                    FloType.method368(6771, var9);
                    ObjType.method343(var9);
                    NpcType.method337(var9);
                    IdkType.method372(6771, var9);
                    SpotAnimType.method381(6771, var9);
                    VarpType.method386(6771, var9);
                    VarbitType.method384(6771, var9);
                    ObjType.field1042 = field1461;
                    if (!field1462) {
                        this.method13(90, "Unpacking sounds", 7);
                        byte[] var54 = var14.method298("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(var54, true);
                        Wave.method317(6771, var55);
                    }
                    this.method13(95, "Unpacking interfaces", 7);
                    PixFont[] var56 = new PixFont[] { this.field1523, this.field1524, this.field1525, this.field1526 };
                    Component.method32(var56, 6, var10, var11);
                    this.method13(100, "Preparing game engine", 7);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1443.field675[this.field1443.field677 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1605[var57] = var58;
                        this.field1637[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1443.field675[this.field1443.field677 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field1585[var61 - 5] = var62 - 25;
                        this.field1643[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method165(96, 479, field1333);
                    this.field1547 = Pix3D.field648;
                    Pix3D.method165(261, 190, field1333);
                    this.field1548 = Pix3D.field648;
                    Pix3D.method165(334, 512, field1333);
                    this.field1549 = Pix3D.field648;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field646[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method86(800, 334, 7, 512, var65, 500);
                    WordFilter.method388(var13);
                    this.field1271 = new MouseTracking(this, -617);
                    this.method12(this.field1271, 10);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1242 + " " + this.field1216);
                    this.field1527 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method460(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1509 >= 100) {
                this.method539("Your ignore list is full. Max of 100 hit", "", (byte) 6, 0);
            } else {
                String var4 = JString.method303(JString.method300(586, arg0), 8);
                for (int var5 = 0; var5 < this.field1509; ++var5) {
                    if (this.field1358[var5] == arg0) {
                        this.method539(var4 + " is already on your ignore list", "", (byte) 6, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1626; ++var6) {
                    if (this.field1269[var6] == arg0) {
                        this.method539("Please remove " + var4 + " from your friend list first", "", (byte) 6, 0);
                        return;
                    }
                }
                this.field1358[this.field1509++] = arg0;
                this.field1602 = true;
                this.field1377.method217(189, (byte) 5);
                if (arg1 != 0) {
                    this.method6();
                }
                this.field1377.method224(arg0, -25114);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLmb;)V")
    private final void method461(int arg0, byte arg1, Packet arg2) {
        this.field1482 = 0;
        this.field1312 = 0;
        if (arg1 == 5) {
            this.method488(false, arg2, arg0);
            this.method511(arg0, arg2, 5);
            this.method438(arg0, -45991, arg2);
            for (int var4 = 0; var4 < this.field1482; ++var4) {
                int var6 = this.field1483[var4];
                if (field1223 != this.field1259[var6].field445) {
                    this.field1259[var6].field458 = null;
                    this.field1259[var6] = null;
                }
            }
            if (arg2.field714 != arg0) {
                signlink.reporterror(this.field1293 + " size mismatch in getnpcpos - pos:" + arg2.field714 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1260; ++var5) {
                    if (this.field1259[this.field1261[var5]] == null) {
                        signlink.reporterror(this.field1293 + " null entry in npc list - pos:" + var5 + " size:" + this.field1260);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1459 = Integer.parseInt(this.getParameter("nodeid"));
        field1460 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method518((byte) -118);
        } else {
            method536(4);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1461 = false;
        } else {
            field1461 = true;
        }
        this.method2(503, (byte) -39, 765);
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 == 3) {
            for (int var2 = 0; var2 < this.field1373; ++var2) {
                if (this.field1639[var2] <= 0) {
                    boolean var3 = false;
                    try {
                        if (this.field1625[var2] == this.field1608 && this.field1478[var2] == this.field1435) {
                            if (!this.method445(false)) {
                                var3 = true;
                            }
                        } else {
                            Packet var4 = Wave.method318(this.field1625[var2], -648, this.field1478[var2]);
                            if (System.currentTimeMillis() + (long) (var4.field714 / 22) > (long) (this.field1563 / 22) + this.field1437) {
                                this.field1563 = var4.field714;
                                this.field1437 = System.currentTimeMillis();
                                if (this.method457((byte) 6, var4.field713, var4.field714)) {
                                    this.field1608 = this.field1625[var2];
                                    this.field1435 = this.field1478[var2];
                                } else {
                                    var3 = true;
                                }
                            }
                        }
                    } catch (Exception var7) {
                    }
                    if (var3 && this.field1639[var2] != -5) {
                        this.field1639[var2] = -5;
                    } else {
                        --this.field1373;
                        for (int var6 = var2; var6 < this.field1373; ++var6) {
                            this.field1625[var6] = this.field1625[var6 + 1];
                            this.field1478[var6] = this.field1478[var6 + 1];
                            this.field1639[var6] = this.field1639[var6 + 1];
                        }
                        --var2;
                    }
                } else {
                    int var10002 = this.field1639[var2]--;
                }
            }
            if (this.field1268 > 0) {
                this.field1268 -= 20;
                if (this.field1268 < 0) {
                    this.field1268 = 0;
                }
                if (this.field1268 == 0 && this.field1346 && !field1462) {
                    this.field1449 = this.field1560;
                    this.field1450 = false;
                    this.field1480.method278(2, this.field1449);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method463(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        this.field1666 += arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method464(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1423 = "";
                this.field1424 = "Connecting to server...";
                this.method428(3, true);
            }
            this.field1357 = new ClientStream(this, true, this.method450(field1460 + 43594));
            long var4 = JString.method299(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1377.field714 = 0;
            this.field1377.method218(14);
            this.field1377.method218(var6);
            this.field1357.method42(2, this.field1377.field713, (byte) -39, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1357.method39();
            }
            int var8 = this.field1357.method39();
            if (var8 == 0) {
                this.field1357.method41(this.field1376.field713, 0, 8);
                this.field1376.field714 = 0;
                this.field1592 = this.field1376.method234(0);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1592 >> 32), (int) this.field1592 };
                this.field1377.field714 = 0;
                this.field1377.method218(10);
                this.field1377.method222(var9[0]);
                this.field1377.method222(var9[1]);
                this.field1377.method222(var9[2]);
                this.field1377.method222(var9[3]);
                this.field1377.method222(signlink.uid);
                this.field1377.method225(arg0);
                this.field1377.method225(arg1);
                this.field1377.method243(field1219, -186, field1356);
                this.field1287.field714 = 0;
                if (arg2) {
                    this.field1287.method218(18);
                } else {
                    this.field1287.method218(16);
                }
                this.field1287.method218(this.field1377.field714 + 36 + 1 + 1 + 2);
                this.field1287.method218(255);
                this.field1287.method219(257);
                this.field1287.method218(field1462 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1287.method222(this.field1665[var10]);
                }
                this.field1287.method226(3, 0, this.field1377.field713, this.field1377.field714);
                this.field1377.field718 = new Isaac(true, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1535 = new Isaac(true, var9);
                this.field1357.method42(this.field1287.field714, this.field1287.field713, (byte) -39, 0);
                var8 = this.field1357.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method464(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1617 = this.field1357.method39();
                field1244 = this.field1357.method39() == 1;
                this.field1614 = 0L;
                this.field1295 = 0;
                this.field1271.field997 = 0;
                super.field18 = true;
                this.field1416 = true;
                this.field1663 = true;
                this.field1377.field714 = 0;
                this.field1376.field714 = 0;
                this.field1667 = -1;
                this.field1220 = -1;
                this.field1221 = -1;
                this.field1222 = -1;
                this.field1666 = 0;
                this.field1668 = 0;
                this.field1303 = 0;
                this.field1670 = 0;
                this.field1232 = 0;
                this.field1458 = 0;
                this.field1354 = false;
                super.field19 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1343[var12] = null;
                }
                this.field1402 = 0;
                this.field1438 = 0;
                this.field1492 = 0;
                this.field1373 = 0;
                this.field1299 = (int) (Math.random() * 100.0D) - 50;
                this.field1634 = (int) (Math.random() * 110.0D) - 55;
                this.field1412 = (int) (Math.random() * 80.0D) - 40;
                this.field1566 = (int) (Math.random() * 120.0D) - 60;
                this.field1597 = (int) (Math.random() * 30.0D) - 20;
                this.field1520 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1564 = -1;
                this.field1420 = 0;
                this.field1421 = 0;
                this.field1310 = 0;
                this.field1260 = 0;
                for (int var13 = 0; var13 < this.field1307; ++var13) {
                    this.field1309[var13] = null;
                    this.field1314[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1259[var14] = null;
                }
                field1569 = this.field1309[this.field1308] = new PlayerEntity();
                this.field1514.method251();
                this.field1467.method251();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1272[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1607 = new LinkList((byte) 9);
                this.field1627 = 0;
                this.field1626 = 0;
                this.field1510 = -1;
                this.field1276 = -1;
                this.field1227 = -1;
                this.field1353 = -1;
                this.field1297 = -1;
                this.field1446 = false;
                this.field1430 = 3;
                this.field1516 = false;
                this.field1354 = false;
                this.field1661 = false;
                this.field1235 = null;
                this.field1623 = 0;
                this.field1243 = -1;
                this.field1518 = true;
                this.method513(0);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1296[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1553[var19] = null;
                    this.field1554[var19] = false;
                }
                field1641 = 0;
                field1568 = 0;
                field1277 = 0;
                field1473 = 0;
                field1322 = 0;
                field1265 = 0;
                field1230 = 0;
                field1599 = 0;
                field1466 = 0;
                field1418 = 0;
                this.method441(true);
            } else if (var8 == 3) {
                this.field1423 = "";
                this.field1424 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1423 = "Your account has been disabled.";
                this.field1424 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1423 = "Your account is already logged in.";
                this.field1424 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1423 = "RuneScape has been updated!";
                this.field1424 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1423 = "This world is full.";
                this.field1424 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1423 = "Unable to connect.";
                this.field1424 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1423 = "Login limit exceeded.";
                this.field1424 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1423 = "Unable to connect.";
                this.field1424 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1424 = "Login server rejected session.";
                this.field1424 = "Please try again.";
            } else if (var8 == 12) {
                this.field1423 = "You need a members account to login to this world.";
                this.field1424 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1423 = "Could not complete login.";
                this.field1424 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1423 = "The server is being updated.";
                this.field1424 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1663 = true;
                this.field1377.field714 = 0;
                this.field1376.field714 = 0;
                this.field1667 = -1;
                this.field1220 = -1;
                this.field1221 = -1;
                this.field1222 = -1;
                this.field1666 = 0;
                this.field1668 = 0;
                this.field1303 = 0;
                this.field1458 = 0;
                this.field1354 = false;
                this.field1292 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1423 = "Login attempts exceeded.";
                this.field1424 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1423 = "You are standing in a members-only area.";
                this.field1424 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1423 = "Invalid loginserver requested";
                this.field1424 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1423 = "No response from server";
                    this.field1424 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1423 = "Unexpected server response";
                    this.field1424 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1357.method39(); var20 >= 0; --var20) {
                    this.field1423 = "You have only just left another world";
                    this.field1424 = "Your profile will be transfered in: " + var20 + " seconds";
                    this.method428(3, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method464(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1423 = "";
            this.field1424 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method465(byte arg0) {
        byte[] var2 = this.field1497.method298("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1541.method257(0);
        var3.method183(0, 0, 0);
        this.field1542.method257(0);
        var3.method183(0, -637, 0);
        this.field1538.method257(0);
        var3.method183(0, -128, 0);
        this.field1539.method257(0);
        var3.method183(-371, -202, 0);
        this.field1540.method257(0);
        var3.method183(-171, -202, 0);
        this.field1543.method257(0);
        var3.method183(-265, 0, 0);
        this.field1544.method257(0);
        var3.method183(-265, -562, 0);
        this.field1545.method257(0);
        var3.method183(-171, -128, 0);
        this.field1546.method257(0);
        var3.method183(-171, -562, 0);
        int[] var4 = new int[var3.field665];
        for (int var5 = 0; var5 < var3.field666; ++var5) {
            for (int var12 = 0; var12 < var3.field665; ++var12) {
                var4[var12] = var3.field664[var3.field665 * var5 + (var3.field665 - var12 - 1)];
            }
            for (int var13 = 0; var13 < var3.field665; ++var13) {
                var3.field664[var3.field665 * var5 + var13] = var4[var13];
            }
        }
        this.field1541.method257(0);
        var3.method183(0, 382, 0);
        this.field1542.method257(0);
        var3.method183(0, -255, 0);
        if (this.field1359 == arg0) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field1538.method257(0);
        var3.method183(0, 254, 0);
        this.field1539.method257(0);
        var3.method183(-371, 180, 0);
        this.field1540.method257(0);
        var3.method183(-171, 180, 0);
        this.field1543.method257(0);
        var3.method183(-265, 382, 0);
        this.field1544.method257(0);
        var3.method183(-265, -180, 0);
        this.field1545.method257(0);
        var3.method183(-171, 254, 0);
        this.field1546.method257(0);
        var3.method183(-171, -180, 0);
        Pix32 var8 = new Pix32(this.field1497, "logo", 0);
        this.field1538.method257(0);
        var8.method185((byte) 0, 382 - var8.field665 / 2 - 128, 18);
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (this.field1538 == null) {
            super.field14 = null;
            this.field1584 = null;
            this.field1582 = null;
            this.field1581 = null;
            this.field1583 = null;
            this.field1588 = null;
            if (arg0 < 7 || arg0 > 7) {
                field1513 = this.field1535.method294();
            }
            this.field1589 = null;
            this.field1590 = null;
            this.field1541 = new PixMap(128, 265, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1542 = new PixMap(128, 265, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1538 = new PixMap(509, 171, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1539 = new PixMap(360, 132, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1540 = new PixMap(360, 200, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1543 = new PixMap(202, 238, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1544 = new PixMap(203, 238, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1545 = new PixMap(74, 94, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            this.field1546 = new PixMap(75, 94, 47904, this.method11(-125));
            Pix2D.method154(this.field1580);
            if (this.field1497 != null) {
                this.method465(field1425);
                this.method525(29758);
            }
            this.field1394 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method467(boolean arg0) {
        if (arg0) {
            field1475 = !field1475;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1467.method247(); var2 != null; var2 = (SpotAnimEntity) this.field1467.method249(633)) {
            if (this.field1644 == var2.field611 && !var2.field617) {
                if (field1223 >= var2.field610) {
                    var2.method150(this.field1347, this.field1655);
                    if (var2.field617) {
                        var2.method106();
                    } else {
                        this.field1463.method61(var2.field611, var2.field612, var2, false, var2.field614, false, var2.field613, 0, 60, -1);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method468(int arg0) {
        int var2 = this.field1525.method202(false, "Choose Option");
        for (int var3 = 0; var3 < this.field1458; ++var3) {
            int var11 = this.field1525.method202(false, this.field1481[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 != 6745) {
            this.field1327 = this.field1535.method294();
        }
        var2 += 8;
        int var4 = this.field1458 * 15 + 21;
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
            this.field1354 = true;
            this.field1656 = 0;
            this.field1657 = var5;
            this.field1658 = var6;
            this.field1659 = var2;
            this.field1660 = this.field1458 * 15 + 22;
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
            this.field1354 = true;
            this.field1656 = 1;
            this.field1657 = var7;
            this.field1658 = var8;
            this.field1659 = var2;
            this.field1660 = this.field1458 * 15 + 22;
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
            this.field1354 = true;
            this.field1656 = 2;
            this.field1657 = var9;
            this.field1658 = var10;
            this.field1659 = var2;
            this.field1660 = this.field1458 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILd;)V")
    public final void method469(int arg0, Component arg1) {
        if (arg0 >= 0) {
            this.field1272 = null;
        }
        int var3 = arg1.field83;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1626;
                if (this.field1627 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field115 = "";
                    arg1.field82 = 0;
                } else {
                    if (this.field1434[var3] == 0) {
                        arg1.field115 = "@red@Offline";
                    } else if (this.field1434[var3] == field1459) {
                        arg1.field115 = "@gre@World-" + (this.field1434[var3] - 9);
                    } else {
                        arg1.field115 = "@yel@World-" + (this.field1434[var3] - 9);
                    }
                    arg1.field82 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1626;
                if (this.field1627 != 2) {
                    var6 = 0;
                }
                arg1.field93 = var6 * 15 + 20;
                if (arg1.field93 <= arg1.field85) {
                    arg1.field93 = arg1.field85 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1509) {
                    arg1.field115 = "";
                    arg1.field82 = 0;
                } else {
                    arg1.field115 = JString.method303(JString.method300(586, this.field1358[var3]), 8);
                    arg1.field82 = 1;
                }
            } else if (var3 == 503) {
                arg1.field93 = this.field1509 * 15 + 20;
                if (arg1.field93 <= arg1.field85) {
                    arg1.field93 = arg1.field85 + 1;
                }
            } else if (var3 == 327) {
                arg1.field130 = 150;
                arg1.field131 = (int) (Math.sin((double) field1223 / 40.0D) * 256.0D) & 2047;
                if (this.field1533) {
                    for (int var7 = 0; var7 < 7; ++var7) {
                        int var14 = this.field1591[var7];
                        if (var14 >= 0 && !IdkType.field1113[var14].method374(5)) {
                            return;
                        }
                    }
                    this.field1533 = false;
                    Model[] var8 = new Model[7];
                    int var9 = 0;
                    for (int var10 = 0; var10 < 7; ++var10) {
                        int var13 = this.field1591[var10];
                        if (var13 >= 0) {
                            var8[var9++] = IdkType.field1113[var13].method375(2);
                        }
                    }
                    Model var11 = new Model(172, var8, var9);
                    for (int var12 = 0; var12 < 5; ++var12) {
                        if (this.field1296[var12] != 0) {
                            var11.method139(field1228[var12][0], field1228[var12][this.field1296[var12]]);
                            if (var12 == 1) {
                                var11.method139(field1484[0], field1484[this.field1296[var12]]);
                            }
                        }
                    }
                    var11.method132(this.field1399);
                    var11.method133(-278, SeqType.field1136[field1569.field405].field1138[0]);
                    var11.method142(64, 850, -30, -50, -30, true);
                    arg1.field123 = 5;
                    arg1.field124 = 0;
                    Component.method36(true, 0, var11, 5);
                }
            } else if (var3 == 324) {
                if (this.field1256 == null) {
                    this.field1256 = arg1.field121;
                    this.field1257 = arg1.field122;
                }
                if (this.field1518) {
                    arg1.field121 = this.field1257;
                } else {
                    arg1.field121 = this.field1256;
                }
            } else if (var3 == 325) {
                if (this.field1256 == null) {
                    this.field1256 = arg1.field121;
                    this.field1257 = arg1.field122;
                }
                if (this.field1518) {
                    arg1.field121 = this.field1256;
                } else {
                    arg1.field121 = this.field1257;
                }
            } else if (var3 == 600) {
                arg1.field115 = this.field1489;
                if (field1223 % 20 < 10) {
                    arg1.field115 = arg1.field115 + "|";
                } else {
                    arg1.field115 = arg1.field115 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1617 >= 1) {
                        if (this.field1451) {
                            arg1.field117 = 16711680;
                            arg1.field115 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field117 = 16777215;
                            arg1.field115 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field115 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1511 != 0) {
                        String var15;
                        if (this.field1579 == 0) {
                            var15 = "earlier today";
                        } else if (this.field1579 == 1) {
                            var15 = "yesterday";
                        } else {
                            var15 = this.field1579 + " days ago";
                        }
                        arg1.field115 = "You last logged in " + var15 + " from: " + signlink.dns;
                    } else {
                        arg1.field115 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1672 == 0) {
                        arg1.field115 = "0 unread messages";
                        arg1.field117 = 16776960;
                    }
                    if (this.field1672 == 1) {
                        arg1.field115 = "1 unread message";
                        arg1.field117 = 65280;
                    }
                    if (this.field1672 > 1) {
                        arg1.field115 = this.field1672 + " unread messages";
                        arg1.field117 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1411 == 201) {
                        if (this.field1671 == 1) {
                            arg1.field115 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field115 = "";
                        }
                    } else if (this.field1411 == 200) {
                        arg1.field115 = "You have not yet set any password recovery questions.";
                    } else {
                        String var16;
                        if (this.field1411 == 0) {
                            var16 = "Earlier today";
                        } else if (this.field1411 == 1) {
                            var16 = "Yesterday";
                        } else {
                            var16 = this.field1411 + " days ago";
                        }
                        arg1.field115 = var16 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1411 == 201) {
                        if (this.field1671 == 1) {
                            arg1.field115 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field115 = "";
                        }
                    } else if (this.field1411 == 200) {
                        arg1.field115 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field115 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1411 == 201) {
                        if (this.field1671 == 1) {
                            arg1.field115 = "@whi@this world but member benefits are unavailabe whilst here.";
                        } else {
                            arg1.field115 = "";
                        }
                    } else if (this.field1411 == 200) {
                        arg1.field115 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field115 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1627 == 0) {
            arg1.field115 = "Loading friend list";
            arg1.field82 = 0;
        } else if (var3 == 1 && this.field1627 == 1) {
            arg1.field115 = "Connecting to friendserver";
            arg1.field82 = 0;
        } else if (var3 == 2 && this.field1627 != 2) {
            arg1.field115 = "Please wait...";
            arg1.field82 = 0;
        } else {
            int var4 = this.field1626;
            if (this.field1627 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field115 = "";
                arg1.field82 = 0;
            } else {
                arg1.field115 = this.field1559[var3];
                arg1.field82 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method470(int arg0, int arg1) {
        if (arg0 != -25132) {
            this.field1667 = this.field1376.method228();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method471(Packet arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field1482 = 0;
        this.field1312 = 0;
        this.method474(2, arg0, arg2);
        this.method527(arg0, arg2, false);
        this.method506(arg2, -700, arg0);
        this.method505(arg0, arg2, -288);
        for (int var5 = 0; var5 < this.field1482; ++var5) {
            int var7 = this.field1483[var5];
            if (field1223 != this.field1309[var7].field445) {
                this.field1309[var7] = null;
            }
        }
        if (arg0.field714 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field714 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1310; ++var6) {
                if (this.field1309[this.field1311[var6]] == null) {
                    signlink.reporterror(this.field1293 + " null entry in pl list - pos:" + var6 + " size:" + this.field1310);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BJ)V")
    public final void method472(byte arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1509; ++var4) {
                if (this.field1358[var4] == arg1) {
                    --this.field1509;
                    this.field1602 = true;
                    for (int var5 = var4; var5 < this.field1509; ++var5) {
                        this.field1358[var5] = this.field1358[var5 + 1];
                    }
                    this.field1377.method217(193, (byte) 5);
                    this.field1377.method224(arg1, -25114);
                    break;
                }
            }
            if (arg0 != 3) {
                this.field1305 = this.field1535.method294();
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method473(int arg0) {
        short var2 = 256;
        if (arg0 != 9) {
            field1486 = 471;
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1361[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1361[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1362[var14] = (this.field1361[var14 - 1] + this.field1361[var14 + 1] + this.field1361[var14 - 128] + this.field1361[var14 + 128]) / 4;
            }
        }
        this.field1465 += 128;
        if (this.field1465 > this.field1389.length) {
            this.field1465 -= this.field1389.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method519(606, this.field1298[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1362[var11 + 128] - this.field1389[this.field1465 + var11 & this.field1389.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1361[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1323[var8] = this.field1323[var8 + 1];
        }
        this.field1323[var2 - 1] = (int) (Math.sin((double) field1223 / 14.0D) * 16.0D + Math.sin((double) field1223 / 15.0D) * 14.0D + Math.sin((double) field1223 / 16.0D) * 12.0D);
        if (this.field1366 > 0) {
            this.field1366 -= 4;
        }
        if (this.field1367 > 0) {
            this.field1367 -= 4;
        }
        if (this.field1366 == 0 && this.field1367 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1366 = 1024;
            }
            if (var9 == 1) {
                this.field1367 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method474(int arg0, Packet arg1, int arg2) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        arg1.method238(-153);
        int var5 = arg1.method239(1, this.field1395);
        if (var5 != 0) {
            int var6 = arg1.method239(2, this.field1395);
            if (var6 == 0) {
                this.field1313[this.field1312++] = this.field1308;
            } else if (var6 == 1) {
                int var7 = arg1.method239(3, this.field1395);
                field1569.method111(var7, false, -116);
                int var8 = arg1.method239(1, this.field1395);
                if (var8 == 1) {
                    this.field1313[this.field1312++] = this.field1308;
                }
            } else if (var6 == 2) {
                int var9 = arg1.method239(3, this.field1395);
                field1569.method111(var9, true, -116);
                int var10 = arg1.method239(3, this.field1395);
                field1569.method111(var10, true, -116);
                int var11 = arg1.method239(1, this.field1395);
                if (var11 == 1) {
                    this.field1313[this.field1312++] = this.field1308;
                }
            } else if (var6 == 3) {
                this.field1644 = arg1.method239(2, this.field1395);
                int var12 = arg1.method239(7, this.field1395);
                int var13 = arg1.method239(7, this.field1395);
                int var14 = arg1.method239(1, this.field1395);
                field1569.method110(-34395, var14 == 1, var13, var12);
                int var15 = arg1.method239(1, this.field1395);
                if (var15 == 1) {
                    this.field1313[this.field1312++] = this.field1308;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method475(int arg0) {
        try {
            if (this.field1357 != null) {
                this.field1357.method38();
            }
        } catch (Exception var3) {
        }
        this.field1357 = null;
        this.field1663 = false;
        this.field1512 = 0;
        this.field1293 = "";
        if (arg0 == 2408) {
            this.field1294 = "";
            this.method523(-31779);
            this.field1463.method50(this.field1474);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1485[var2].method356(3);
            }
            System.gc();
            this.method509(0);
            this.field1560 = -1;
            this.field1449 = -1;
            this.field1268 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method476(int arg0, int arg1) {
        int var3 = 25 / arg1;
        int var4 = VarpType.field1184[arg0].field1192;
        if (var4 != 0) {
            int var5 = this.field1558[arg0];
            if (var4 == 1) {
                if (var5 == 1) {
                    Pix3D.method172(4, 0.9D);
                }
                if (var5 == 2) {
                    Pix3D.method172(4, 0.8D);
                }
                if (var5 == 3) {
                    Pix3D.method172(4, 0.7D);
                }
                if (var5 == 4) {
                    Pix3D.method172(4, 0.6D);
                }
                ObjType.field1083.method103();
                this.field1394 = true;
            }
            if (var4 == 3) {
                boolean var6 = this.field1346;
                if (var5 == 0) {
                    this.method463(this.field1317, 0, this.field1346);
                    this.field1346 = true;
                }
                if (var5 == 1) {
                    this.method463(this.field1317, -400, this.field1346);
                    this.field1346 = true;
                }
                if (var5 == 2) {
                    this.method463(this.field1317, -800, this.field1346);
                    this.field1346 = true;
                }
                if (var5 == 3) {
                    this.method463(this.field1317, -1200, this.field1346);
                    this.field1346 = true;
                }
                if (var5 == 4) {
                    this.field1346 = false;
                }
                if (this.field1346 != var6 && !field1462) {
                    if (this.field1346) {
                        this.field1449 = this.field1560;
                        this.field1450 = false;
                        this.field1480.method278(2, this.field1449);
                    } else {
                        this.method509(0);
                    }
                    this.field1268 = 0;
                }
            }
            if (var4 == 4) {
                if (var5 == 0) {
                    this.field1267 = true;
                    this.method470(-25132, 0);
                }
                if (var5 == 1) {
                    this.field1267 = true;
                    this.method470(-25132, -400);
                }
                if (var5 == 2) {
                    this.field1267 = true;
                    this.method470(-25132, -800);
                }
                if (var5 == 3) {
                    this.field1267 = true;
                    this.method470(-25132, -1200);
                }
                if (var5 == 4) {
                    this.field1267 = false;
                }
            }
            if (var4 == 5) {
                this.field1455 = var5;
            }
            if (var4 == 6) {
                this.field1400 = var5;
            }
            if (var4 == 8) {
                this.field1517 = var5;
                this.field1490 = true;
            }
            if (var4 == 9) {
                this.field1345 = var5;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILob;)V")
    private final void method477(int arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field733 == 0) {
            var3 = this.field1463.method76(arg1.field732, arg1.field734, arg1.field735);
        }
        if (arg1.field733 == 1) {
            var3 = this.field1463.method77(arg1.field734, arg1.field732, this.field1396, arg1.field735);
        }
        if (arg1.field733 == 2) {
            var3 = this.field1463.method78(arg1.field732, arg1.field734, arg1.field735);
        }
        if (arg1.field733 == 3) {
            var3 = this.field1463.method79(arg1.field732, arg1.field734, arg1.field735);
        }
        if (var3 != 0) {
            int var7 = this.field1463.method80(arg1.field732, arg1.field734, arg1.field735, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field736 = var4;
        arg1.field738 = var5;
        this.field1666 += arg0;
        arg1.field737 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method13(int arg0, String arg1, int arg2) {
        this.field1216 = arg0;
        this.field1242 = arg1;
        this.method466(7);
        if (this.field1497 == null) {
            super.method13(arg0, arg1, 7);
        } else {
            this.field1540.method257(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1525.method200(-544, var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...", 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method157(var4 / 2 - 152, 304, 34, 0, var7, 9179409);
            Pix2D.method157(var4 / 2 - 151, 302, 32, 0, var7 + 1, 0);
            Pix2D.method156(arg0 * 3, 9179409, 47458, var7 + 2, 30, var4 / 2 - 150);
            Pix2D.method156(300 - arg0 * 3, 0, 47458, var7 + 2, 30, arg0 * 3 + (var4 / 2 - 150));
            if (arg2 >= 7 && arg2 <= 7) {
                this.field1525.method200(-544, var5 / 2 + 5 - var6, var4 / 2, arg1, 16777215);
                this.field1540.method258(171, -740, super.field13, 202);
                if (this.field1394) {
                    this.field1394 = false;
                    if (!this.field1315) {
                        this.field1541.method258(0, -740, super.field13, 0);
                        this.field1542.method258(0, -740, super.field13, 637);
                    }
                    this.field1538.method258(0, -740, super.field13, 128);
                    this.field1539.method258(371, -740, super.field13, 202);
                    this.field1543.method258(265, -740, super.field13, 0);
                    this.field1544.method258(265, -740, super.field13, 562);
                    this.field1545.method258(171, -740, super.field13, 128);
                    this.field1546.method258(171, -740, super.field13, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method478(byte arg0) {
        for (int var2 = -1; var2 < this.field1310; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1308;
            } else {
                var3 = this.field1311[var2];
            }
            PlayerEntity var4 = this.field1309[var3];
            if (var4 != null) {
                this.method493(this.field1324, 1, var4);
            }
        }
        if (arg0 != 127) {
            this.field1580 = -9;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method479(byte arg0) {
        this.field1582.method257(0);
        int var2 = this.field1566 + this.field1520 & 2047;
        int var3 = field1569.field400 / 32 + 48;
        int var4 = 464 - field1569.field401 / 32;
        this.field1422.method189(this.field1597 + 256, 9271, var2, var3, var4, this.field1585, 146, this.field1643, 5, 25, 151);
        this.field1355.method189(256, 9271, this.field1520, 25, 25, this.field1605, 33, this.field1637, 0, 0, 33);
        if (arg0 != -21) {
            this.field1667 = this.field1376.method228();
        }
        for (int var5 = 0; var5 < this.field1379; ++var5) {
            int var33 = this.field1380[var5] * 4 + 2 - field1569.field400 / 32;
            int var34 = this.field1381[var5] * 4 + 2 - field1569.field401 / 32;
            this.method550(var34, this.field1391[var5], false, var33);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var29 = 0; var29 < 104; ++var29) {
                LinkList var30 = this.field1272[this.field1644][var6][var29];
                if (var30 != null) {
                    int var31 = var6 * 4 + 2 - field1569.field400 / 32;
                    int var32 = var29 * 4 + 2 - field1569.field401 / 32;
                    this.method550(var32, this.field1337, false, var31);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1260; ++var7) {
            NpcEntity var26 = this.field1259[this.field1261[var7]];
            if (var26 != null && var26.method113(false) && var26.field458.field1024) {
                int var27 = var26.field400 / 32 - field1569.field400 / 32;
                int var28 = var26.field401 / 32 - field1569.field401 / 32;
                this.method550(var28, this.field1338, false, var27);
            }
        }
        for (int var8 = 0; var8 < this.field1310; ++var8) {
            PlayerEntity var19 = this.field1309[this.field1311[var8]];
            if (var19 != null && var19.method113(false)) {
                int var20 = var19.field400 / 32 - field1569.field400 / 32;
                int var21 = var19.field401 / 32 - field1569.field401 / 32;
                boolean var22 = false;
                long var23 = JString.method299(var19.field462);
                for (int var25 = 0; var25 < this.field1626; ++var25) {
                    if (this.field1269[var25] == var23 && this.field1434[var25] != 0) {
                        var22 = true;
                        break;
                    }
                }
                if (var22) {
                    this.method550(var21, this.field1340, false, var20);
                } else {
                    this.method550(var21, this.field1339, false, var20);
                }
            }
        }
        if (this.field1232 != 0 && field1223 % 20 < 10) {
            if (this.field1232 == 1 && this.field1642 >= 0 && this.field1642 < this.field1259.length) {
                NpcEntity var9 = this.field1259[this.field1642];
                if (var9 != null) {
                    int var10 = var9.field400 / 32 - field1569.field400 / 32;
                    int var11 = var9.field401 / 32 - field1569.field401 / 32;
                    this.method486((byte) -63, var11, this.field1218, var10);
                }
            }
            if (this.field1232 == 2) {
                int var12 = (this.field1673 - this.field1593) * 4 + 2 - field1569.field400 / 32;
                int var13 = (this.field1674 - this.field1594) * 4 + 2 - field1569.field401 / 32;
                this.method486((byte) -63, var13, this.field1218, var12);
            }
            if (this.field1232 == 10 && this.field1606 >= 0 && this.field1606 < this.field1309.length) {
                PlayerEntity var14 = this.field1309[this.field1606];
                if (var14 != null) {
                    int var15 = var14.field400 / 32 - field1569.field400 / 32;
                    int var16 = var14.field401 / 32 - field1569.field401 / 32;
                    this.method486((byte) -63, var16, this.field1218, var15);
                }
            }
        }
        if (this.field1420 != 0) {
            int var17 = this.field1420 * 4 + 2 - field1569.field400 / 32;
            int var18 = this.field1421 * 4 + 2 - field1569.field401 / 32;
            this.method550(var18, this.field1217, false, var17);
        }
        Pix2D.method156(3, 16777215, 47458, 78, 3, 97);
        this.field1583.method257(0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method480(boolean arg0) {
        if (arg0) {
            this.field1667 = this.field1376.method228();
        }
        this.field1316 = 0;
        int var2 = (field1569.field400 >> 7) + this.field1593;
        int var3 = (field1569.field401 >> 7) + this.field1594;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1316 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1316 = 1;
        }
        if (this.field1316 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1316 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method481(int arg0) {
        this.field1666 += arg0;
        if (field1462 && this.field1492 == 2 && World.field45 != this.field1644) {
            this.field1583.method257(0);
            this.field1524.method200(-544, 151, 257, "Loading - please wait.", 0);
            this.field1524.method200(-544, 150, 256, "Loading - please wait.", 16777215);
            this.field1583.method258(4, -740, super.field13, 4);
            this.field1492 = 1;
            this.field1292 = System.currentTimeMillis();
        }
        if (this.field1492 == 1) {
            int var2 = this.method482(this.field1378);
            if (var2 != 0 && System.currentTimeMillis() - this.field1292 > 360000L) {
                signlink.reporterror(this.field1293 + " glcfb " + this.field1592 + "," + var2 + "," + field1462 + "," + this.field1499[0] + "," + this.field1480.method279() + "," + this.field1644 + "," + this.field1476 + "," + this.field1477);
                this.field1292 = System.currentTimeMillis();
            }
        }
        if (this.field1492 == 2 && this.field1644 != this.field1564) {
            this.field1564 = this.field1644;
            this.method542(this.field1644, 0);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)I")
    public final int method482(byte arg0) {
        for (int var2 = 0; var2 < this.field1372.length; ++var2) {
            if (this.field1372[var2] == null && this.field1225[var2] != -1) {
                return -1;
            }
            if (this.field1640[var2] == null && this.field1226[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1372.length; ++var4) {
            byte[] var5 = this.field1640[var4];
            if (var5 != null) {
                int var6 = (this.field1224[var4] >> 8) * 64 - this.field1593;
                int var7 = (this.field1224[var4] & 255) * 64 - this.field1594;
                var3 &= World.method16(false, var5, var7, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1496) {
            return -4;
        } else {
            this.field1492 = 2;
            World.field45 = this.field1644;
            this.method458(-44088);
            if (arg0 != 8) {
                field1475 = !field1475;
            }
            this.field1377.method217(134, (byte) 5);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method483(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field1516) {
                this.field1516 = false;
                this.field1490 = true;
            }
            int var3 = this.field1368[arg0];
            int var4 = this.field1369[arg0];
            int var5 = this.field1370[arg0];
            int var6 = this.field1371[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 902) {
                String var7 = this.field1481[arg0];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = JString.method299(var7.substring(var8 + 5).trim());
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1626; ++var12) {
                        if (this.field1269[var12] == var9) {
                            var11 = var12;
                            break;
                        }
                    }
                    if (var11 != -1 && this.field1434[var11] > 0) {
                        this.field1490 = true;
                        this.field1516 = false;
                        this.field1661 = true;
                        this.field1414 = "";
                        this.field1537 = 3;
                        this.field1556 = this.field1269[var11];
                        this.field1576 = "Enter message to send to " + this.field1559[var11];
                    }
                }
            }
            if (var5 == 357) {
                this.method540(var4, -376, var6, 87, var3);
            }
            if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                if (var5 == 555) {
                    this.field1377.method217(59, (byte) 5);
                }
                if (var5 == 354) {
                    this.field1377.method217(62, (byte) 5);
                }
                if (var5 == 113) {
                    this.field1377.method217(70, (byte) 5);
                }
                if (var5 == 582) {
                    if ((var6 & 3) == 0) {
                        ++field1265;
                    }
                    if (field1265 >= 133) {
                        this.field1377.method217(131, (byte) 5);
                        this.field1377.method219(6118);
                    }
                    this.field1377.method217(181, (byte) 5);
                }
                if (var5 == 331) {
                    this.field1377.method217(160, (byte) 5);
                }
                this.field1377.method219(var6);
                this.field1377.method219(var3);
                this.field1377.method219(var4);
                this.field1609 = 0;
                this.field1610 = var4;
                this.field1611 = var3;
                this.field1612 = 2;
                if (Component.field74[var4].field80 == this.field1227) {
                    this.field1612 = 1;
                }
                if (Component.field74[var4].field80 == this.field1276) {
                    this.field1612 = 3;
                }
            }
            if (var5 == 899 && this.method540(var4, -376, var6, 26, var3)) {
                this.field1377.method219(this.field1439);
            }
            if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                PlayerEntity var13 = this.field1309[var6];
                if (var13 != null) {
                    this.method437(field1569.field451[0], var13.field450[0], false, 0, 0, field1569.field450[0], var13.field451[0], 1, 0, 1, 0, 2);
                    this.field1349 = super.field28;
                    this.field1350 = super.field29;
                    this.field1352 = 2;
                    this.field1351 = 0;
                    if (var5 == 185) {
                        this.field1377.method217(230, (byte) 5);
                    }
                    if (var5 == 387) {
                        field1322 += var6;
                        if (field1322 >= 66) {
                            this.field1377.method217(233, (byte) 5);
                            this.field1377.method218(154);
                        }
                        this.field1377.method217(72, (byte) 5);
                    }
                    if (var5 == 27) {
                        this.field1377.method217(18, (byte) 5);
                    }
                    if (var5 == 499) {
                        this.field1377.method217(17, (byte) 5);
                    }
                    if (var5 == 639) {
                        ++field1473;
                        if (field1473 >= 52) {
                            this.field1377.method217(121, (byte) 5);
                            this.field1377.method218(131);
                        }
                        this.field1377.method217(192, (byte) 5);
                    }
                    this.field1377.method219(var6);
                }
            }
            if (var5 == 829) {
                NpcEntity var14 = this.field1259[var6];
                if (var14 != null) {
                    this.method437(field1569.field451[0], var14.field450[0], false, 0, 0, field1569.field450[0], var14.field451[0], 1, 0, 1, 0, 2);
                    this.field1349 = super.field28;
                    this.field1350 = super.field29;
                    this.field1352 = 2;
                    this.field1351 = 0;
                    this.field1377.method217(119, (byte) 5);
                    this.field1377.method219(var6);
                    this.field1377.method219(this.field1405);
                    this.field1377.method219(this.field1403);
                    this.field1377.method219(this.field1404);
                }
            }
            if (var5 == 1328) {
                ObjType var15 = ObjType.method345(var6);
                Component var16 = Component.field74[var4];
                String var17;
                if (var16 != null && var16.field76[var3] >= 100000) {
                    var17 = var16.field76[var3] + " x " + var15.field1045;
                } else if (var15.field1046 != null) {
                    var17 = new String(var15.field1046);
                } else {
                    var17 = "It's a " + var15.field1045 + ".";
                }
                this.method539(var17, "", (byte) 6, 0);
            }
            if (var5 == 102) {
                this.field1402 = 1;
                this.field1403 = var3;
                this.field1404 = var4;
                this.field1405 = var6;
                this.field1406 = ObjType.method345(var6).field1045;
                this.field1438 = 0;
                this.field1602 = true;
            } else {
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var18 = this.field1259[var6];
                    if (var18 != null) {
                        this.method437(field1569.field451[0], var18.field450[0], false, 0, 0, field1569.field450[0], var18.field451[0], 1, 0, 1, 0, 2);
                        this.field1349 = super.field28;
                        this.field1350 = super.field29;
                        this.field1352 = 2;
                        this.field1351 = 0;
                        if (var5 == 852) {
                            this.field1377.method217(122, (byte) 5);
                        }
                        if (var5 == 242) {
                            this.field1377.method217(143, (byte) 5);
                        }
                        if (var5 == 309) {
                            this.field1377.method217(69, (byte) 5);
                        }
                        if (var5 == 793) {
                            this.field1377.method217(118, (byte) 5);
                        }
                        if (var5 == 209) {
                            this.field1377.method217(195, (byte) 5);
                        }
                        this.field1377.method219(var6);
                    }
                }
                if (var5 == 718) {
                    if (!this.field1354) {
                        this.field1463.method88(super.field29 - 4, super.field28 - 4, this.field1615);
                    } else {
                        this.field1463.method88(var4 - 4, var3 - 4, this.field1615);
                    }
                }
                if (var5 == 743) {
                    ++field1568;
                    if (field1568 >= 124) {
                        this.field1377.method217(77, (byte) 5);
                        this.field1377.method219(37954);
                    }
                    this.method540(var4, -376, var6, 98, var3);
                }
                if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                    boolean var19 = this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 0, 0, 0, 0, 2);
                    if (!var19) {
                        this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 1, 0, 1, 0, 2);
                    }
                    this.field1349 = super.field28;
                    this.field1350 = super.field29;
                    this.field1352 = 2;
                    this.field1351 = 0;
                    if (var5 == 662) {
                        field1277 += this.field1594;
                        if (field1277 >= 118) {
                            this.field1377.method217(56, (byte) 5);
                            this.field1377.method222(0);
                        }
                        this.field1377.method217(97, (byte) 5);
                    }
                    if (var5 == 617) {
                        this.field1377.method217(178, (byte) 5);
                    }
                    if (var5 == 139) {
                        if ((var3 & 3) == 0) {
                            ++field1230;
                        }
                        if (field1230 >= 123) {
                            this.field1377.method217(187, (byte) 5);
                            this.field1377.method222(0);
                        }
                        this.field1377.method217(141, (byte) 5);
                    }
                    if (var5 == 224) {
                        field1599 += var4;
                        if (field1599 >= 75) {
                            this.field1377.method217(206, (byte) 5);
                            this.field1377.method218(19);
                        }
                        this.field1377.method217(47, (byte) 5);
                    }
                    if (var5 == 778) {
                        this.field1377.method217(67, (byte) 5);
                    }
                    this.field1377.method219(this.field1593 + var3);
                    this.field1377.method219(this.field1594 + var4);
                    this.field1377.method219(var6);
                }
                if (var5 == 225) {
                    this.field1377.method217(244, (byte) 5);
                    this.field1377.method219(var4);
                    Component var21 = Component.field74[var4];
                    if (var21.field89 != null && var21.field89[0][0] == 5) {
                        int var22 = var21.field89[0][1];
                        if (this.field1558[var22] != var21.field91[0]) {
                            this.field1558[var22] = var21.field91[0];
                            this.method476(var22, 108);
                            this.field1602 = true;
                        }
                    }
                }
                if (var5 == 398) {
                    this.field1377.method217(200, (byte) 5);
                    this.field1377.method219(var6);
                    this.field1377.method219(var3);
                    this.field1377.method219(var4);
                    this.field1377.method219(this.field1405);
                    this.field1377.method219(this.field1403);
                    this.field1377.method219(this.field1404);
                    this.field1609 = 0;
                    this.field1610 = var4;
                    this.field1611 = var3;
                    this.field1612 = 2;
                    if (Component.field74[var4].field80 == this.field1227) {
                        this.field1612 = 1;
                    }
                    if (Component.field74[var4].field80 == this.field1276) {
                        this.field1612 = 3;
                    }
                }
                if (var5 == 1381) {
                    int var23 = var6 >> 14 & 32767;
                    LocType var24 = LocType.method329(var23);
                    String var25;
                    if (var24.field961 != null) {
                        var25 = new String(var24.field961);
                    } else {
                        var25 = "It's a " + var24.field960 + ".";
                    }
                    this.method539(var25, "", (byte) 6, 0);
                }
                if (var5 == 997 && !this.field1446) {
                    this.field1377.method217(146, (byte) 5);
                    this.field1377.method219(var4);
                    this.field1446 = true;
                }
                if (var5 == 507 || var5 == 957) {
                    String var26 = this.field1481[arg0];
                    int var27 = var26.indexOf("@whi@");
                    if (var27 != -1) {
                        String var28 = var26.substring(var27 + 5).trim();
                        String var29 = JString.method303(JString.method300(586, JString.method299(var28)), 8);
                        boolean var30 = false;
                        for (int var31 = 0; var31 < this.field1310; ++var31) {
                            PlayerEntity var32 = this.field1309[this.field1311[var31]];
                            if (var32 != null && var32.field462 != null && var32.field462.equalsIgnoreCase(var29)) {
                                this.method437(field1569.field451[0], var32.field450[0], false, 0, 0, field1569.field450[0], var32.field451[0], 1, 0, 1, 0, 2);
                                if (var5 == 507) {
                                    field1322 += var6;
                                    if (field1322 >= 66) {
                                        this.field1377.method217(233, (byte) 5);
                                        this.field1377.method218(154);
                                    }
                                    this.field1377.method217(72, (byte) 5);
                                }
                                if (var5 == 957) {
                                    ++field1473;
                                    if (field1473 >= 52) {
                                        this.field1377.method217(121, (byte) 5);
                                        this.field1377.method218(131);
                                    }
                                    this.field1377.method217(192, (byte) 5);
                                }
                                this.field1377.method219(this.field1311[var31]);
                                var30 = true;
                                break;
                            }
                        }
                        if (!var30) {
                            this.method539("Unable to find " + var29, "", (byte) 6, 0);
                        }
                    }
                }
                if (var5 == 737) {
                    this.method453(-711);
                }
                if (var5 == 563) {
                    this.field1377.method217(102, (byte) 5);
                    this.field1377.method219(var6);
                    this.field1377.method219(var3);
                    this.field1377.method219(var4);
                    this.field1377.method219(this.field1439);
                    this.field1609 = 0;
                    this.field1610 = var4;
                    this.field1611 = var3;
                    this.field1612 = 2;
                    if (Component.field74[var4].field80 == this.field1227) {
                        this.field1612 = 1;
                    }
                    if (Component.field74[var4].field80 == this.field1276) {
                        this.field1612 = 3;
                    }
                }
                if (var5 == 1714) {
                    NpcEntity var33 = this.field1259[var6];
                    if (var33 != null) {
                        String var34;
                        if (var33.field458.field1009 != null) {
                            var34 = new String(var33.field458.field1009);
                        } else {
                            var34 = "It's a " + var33.field458.field1008 + ".";
                        }
                        this.method539(var34, "", (byte) 6, 0);
                    }
                }
                if (var5 == 131) {
                    PlayerEntity var35 = this.field1309[var6];
                    if (var35 != null) {
                        this.method437(field1569.field451[0], var35.field450[0], false, 0, 0, field1569.field450[0], var35.field451[0], 1, 0, 1, 0, 2);
                        this.field1349 = super.field28;
                        this.field1350 = super.field29;
                        this.field1352 = 2;
                        this.field1351 = 0;
                        this.field1377.method217(68, (byte) 5);
                        this.field1377.method219(var6);
                        this.field1377.method219(this.field1439);
                    }
                }
                if (var5 == 524) {
                    String var36 = this.field1481[arg0];
                    int var37 = var36.indexOf("@whi@");
                    if (var37 != -1) {
                        this.method453(-711);
                        this.field1489 = var36.substring(var37 + 5).trim();
                        this.field1451 = false;
                        for (int var38 = 0; var38 < Component.field74.length; ++var38) {
                            if (Component.field74[var38] != null && Component.field74[var38].field83 == 600) {
                                this.field1429 = this.field1227 = Component.field74[var38].field80;
                                break;
                            }
                        }
                    }
                }
                if (var5 == 240) {
                    NpcEntity var39 = this.field1259[var6];
                    if (var39 != null) {
                        this.method437(field1569.field451[0], var39.field450[0], false, 0, 0, field1569.field450[0], var39.field451[0], 1, 0, 1, 0, 2);
                        this.field1349 = super.field28;
                        this.field1350 = super.field29;
                        this.field1352 = 2;
                        this.field1351 = 0;
                        this.field1377.method217(231, (byte) 5);
                        this.field1377.method219(var6);
                        this.field1377.method219(this.field1439);
                    }
                }
                if (var5 == 111) {
                    boolean var40 = this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 0, 0, 0, 0, 2);
                    if (!var40) {
                        this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 1, 0, 1, 0, 2);
                    }
                    this.field1349 = super.field28;
                    this.field1350 = super.field29;
                    this.field1352 = 2;
                    this.field1351 = 0;
                    this.field1377.method217(245, (byte) 5);
                    this.field1377.method219(this.field1593 + var3);
                    this.field1377.method219(this.field1594 + var4);
                    this.field1377.method219(var6);
                    this.field1377.method219(this.field1405);
                    this.field1377.method219(this.field1403);
                    this.field1377.method219(this.field1404);
                }
                if (var5 == 1152) {
                    ObjType var42 = ObjType.method345(var6);
                    String var43;
                    if (var42.field1046 != null) {
                        var43 = new String(var42.field1046);
                    } else {
                        var43 = "It's a " + var42.field1045 + ".";
                    }
                    this.method539(var43, "", (byte) 6, 0);
                }
                if (var5 == 721) {
                    field1641 += var4;
                    if (field1641 >= 139) {
                        this.field1377.method217(28, (byte) 5);
                        this.field1377.method222(0);
                    }
                    this.method540(var4, -376, var6, 213, var3);
                }
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 100) {
                        this.field1377.method217(74, (byte) 5);
                    }
                    if (var5 == 962) {
                        this.field1377.method217(228, (byte) 5);
                    }
                    if (var5 == 681) {
                        ++field1466;
                        if (field1466 >= 116) {
                            this.field1377.method217(162, (byte) 5);
                            this.field1377.method221(13018169);
                        }
                        this.field1377.method217(163, (byte) 5);
                    }
                    if (var5 == 694) {
                        this.field1377.method217(243, (byte) 5);
                    }
                    if (var5 == 795) {
                        this.field1377.method217(80, (byte) 5);
                    }
                    this.field1377.method219(var6);
                    this.field1377.method219(var3);
                    this.field1377.method219(var4);
                    this.field1609 = 0;
                    this.field1610 = var4;
                    this.field1611 = var3;
                    this.field1612 = 2;
                    if (Component.field74[var4].field80 == this.field1227) {
                        this.field1612 = 1;
                    }
                    if (Component.field74[var4].field80 == this.field1276) {
                        this.field1612 = 3;
                    }
                }
                if (var5 == 435) {
                    this.field1377.method217(244, (byte) 5);
                    this.field1377.method219(var4);
                    Component var44 = Component.field74[var4];
                    if (var44.field89 != null && var44.field89[0][0] == 5) {
                        int var45 = var44.field89[0][1];
                        this.field1558[var45] = 1 - this.field1558[var45];
                        this.method476(var45, 108);
                        this.field1602 = true;
                    }
                }
                if (var5 == 275) {
                    PlayerEntity var46 = this.field1309[var6];
                    if (var46 != null) {
                        this.method437(field1569.field451[0], var46.field450[0], false, 0, 0, field1569.field450[0], var46.field451[0], 1, 0, 1, 0, 2);
                        this.field1349 = super.field28;
                        this.field1350 = super.field29;
                        this.field1352 = 2;
                        this.field1351 = 0;
                        this.field1377.method217(113, (byte) 5);
                        this.field1377.method219(var6);
                        this.field1377.method219(this.field1405);
                        this.field1377.method219(this.field1403);
                        this.field1377.method219(this.field1404);
                    }
                }
                if (var5 == 1071) {
                    this.method540(var4, -376, var6, 147, var3);
                }
                if (var5 == 625) {
                    this.method540(var4, -376, var6, 33, var3);
                }
                if (var5 == 231) {
                    Component var47 = Component.field74[var4];
                    boolean var48 = true;
                    if (var47.field83 > 0) {
                        var48 = this.method439(76, var47);
                    }
                    if (var48) {
                        this.field1377.method217(244, (byte) 5);
                        this.field1377.method219(var4);
                    }
                }
                if (var5 == 810 && this.method540(var4, -376, var6, 240, var3)) {
                    this.field1377.method219(this.field1405);
                    this.field1377.method219(this.field1403);
                    this.field1377.method219(this.field1404);
                }
                if (var5 == 274) {
                    Component var49 = Component.field74[var4];
                    this.field1438 = 1;
                    this.field1439 = var4;
                    this.field1440 = var49.field134;
                    this.field1402 = 0;
                    this.field1602 = true;
                    String var50 = var49.field132;
                    if (var50.indexOf(" ") != -1) {
                        var50 = var50.substring(0, var50.indexOf(" "));
                    }
                    String var51 = var49.field132;
                    if (var51.indexOf(" ") != -1) {
                        var51 = var51.substring(var51.indexOf(" ") + 1);
                    }
                    this.field1441 = var50 + " " + var49.field133 + " " + var51;
                    if (this.field1440 == 16) {
                        this.field1602 = true;
                        this.field1430 = 3;
                        this.field1488 = true;
                    }
                } else {
                    if (var5 == 370) {
                        boolean var52 = this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 0, 0, 0, 0, 2);
                        if (!var52) {
                            this.method437(field1569.field451[0], var3, false, 0, 0, field1569.field450[0], var4, 1, 0, 1, 0, 2);
                        }
                        this.field1349 = super.field28;
                        this.field1350 = super.field29;
                        this.field1352 = 2;
                        this.field1351 = 0;
                        this.field1377.method217(202, (byte) 5);
                        this.field1377.method219(this.field1593 + var3);
                        this.field1377.method219(this.field1594 + var4);
                        this.field1377.method219(var6);
                        this.field1377.method219(this.field1439);
                    }
                    if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                        String var54 = this.field1481[arg0];
                        int var55 = var54.indexOf("@whi@");
                        if (var55 != -1) {
                            long var56 = JString.method299(var54.substring(var55 + 5).trim());
                            if (var5 == 605) {
                                this.method431(var56, false);
                            }
                            if (var5 == 47) {
                                this.method460(var56, 0);
                            }
                            if (var5 == 513) {
                                this.method443((byte) 8, var56);
                            }
                            if (var5 == 884) {
                                this.method472((byte) 3, var56);
                            }
                        }
                    }
                    this.field1402 = 0;
                    this.field1438 = 0;
                    this.field1602 = true;
                    if (arg1) {
                        this.field1479 = -331;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method484(Component arg0, byte arg1) {
        if (arg1 != 9) {
            throw new NullPointerException();
        } else if (arg0.field90 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field90.length; ++var3) {
                int var4 = this.method535(arg0, (byte) 5, var3);
                int var5 = arg0.field91[var3];
                if (arg0.field90[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field90[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field90[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Z")
    public final boolean method485(byte arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1370[arg1];
            if (arg0 != -89) {
                this.field1427 = this.field1535.method294();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILib;I)V")
    public final void method486(byte arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 != -63) {
            this.field1667 = this.field1376.method228();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1566 + this.field1520 & 2047;
            int var7 = Model.field603[var6];
            int var8 = Model.field604[var6];
            int var9 = var7 * 256 / (this.field1597 + 256);
            int var10 = var8 * 256 / (this.field1597 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1318.method190(20, var13, false, 83 - var16 - 20, 15, 20, var15 + 94 + 4 - 10, 15, 256);
        } else {
            this.method550(arg1, arg2, false, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method487(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg1) {
            this.field1479 = this.field1535.method294();
        }
        return ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLmb;I)V")
    private final void method488(boolean arg0, Packet arg1, int arg2) {
        arg1.method238(-153);
        if (!arg0) {
            int var4 = arg1.method239(8, this.field1395);
            if (var4 < this.field1260) {
                for (int var5 = var4; var5 < this.field1260; ++var5) {
                    this.field1483[this.field1482++] = this.field1261[var5];
                }
            }
            if (var4 > this.field1260) {
                signlink.reporterror(this.field1293 + " Too many npcs");
                throw new RuntimeException("eek");
            } else {
                this.field1260 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1261[var6];
                    NpcEntity var8 = this.field1259[var7];
                    int var9 = arg1.method239(1, this.field1395);
                    if (var9 == 0) {
                        this.field1261[this.field1260++] = var7;
                        var8.field445 = field1223;
                    } else {
                        int var10 = arg1.method239(2, this.field1395);
                        if (var10 == 0) {
                            this.field1261[this.field1260++] = var7;
                            var8.field445 = field1223;
                            this.field1313[this.field1312++] = var7;
                        } else if (var10 == 1) {
                            this.field1261[this.field1260++] = var7;
                            var8.field445 = field1223;
                            int var11 = arg1.method239(3, this.field1395);
                            var8.method111(var11, false, -116);
                            int var12 = arg1.method239(1, this.field1395);
                            if (var12 == 1) {
                                this.field1313[this.field1312++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1261[this.field1260++] = var7;
                            var8.field445 = field1223;
                            int var13 = arg1.method239(3, this.field1395);
                            var8.method111(var13, true, -116);
                            int var14 = arg1.method239(3, this.field1395);
                            var8.method111(var14, true, -116);
                            int var15 = arg1.method239(1, this.field1395);
                            if (var15 == 1) {
                                this.field1313[this.field1312++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1483[this.field1482++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;IIII)V")
    public final void method489(NpcType arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1468 != arg3) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (this.field1458 < 400) {
            String var7 = arg0.field1008;
            if (arg0.field1025 != 0) {
                var7 = var7 + method517(arg0.field1025, field1569.field468, this.field1264) + " (level-" + arg0.field1025 + ")";
            }
            if (this.field1402 == 1) {
                this.field1481[this.field1458] = "Use " + this.field1406 + " with @yel@" + var7;
                this.field1370[this.field1458] = 829;
                this.field1371[this.field1458] = arg1;
                this.field1368[this.field1458] = arg4;
                this.field1369[this.field1458] = arg2;
                ++this.field1458;
            } else {
                if (this.field1438 == 1) {
                    if ((this.field1440 & 2) == 2) {
                        this.field1481[this.field1458] = this.field1441 + " @yel@" + var7;
                        this.field1370[this.field1458] = 240;
                        this.field1371[this.field1458] = arg1;
                        this.field1368[this.field1458] = arg4;
                        this.field1369[this.field1458] = arg2;
                        ++this.field1458;
                        return;
                    }
                } else {
                    if (arg0.field1020 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg0.field1020[var8] != null && !arg0.field1020[var8].equalsIgnoreCase("attack")) {
                                this.field1481[this.field1458] = arg0.field1020[var8] + " @yel@" + var7;
                                if (var8 == 0) {
                                    this.field1370[this.field1458] = 242;
                                }
                                if (var8 == 1) {
                                    this.field1370[this.field1458] = 209;
                                }
                                if (var8 == 2) {
                                    this.field1370[this.field1458] = 309;
                                }
                                if (var8 == 3) {
                                    this.field1370[this.field1458] = 852;
                                }
                                if (var8 == 4) {
                                    this.field1370[this.field1458] = 793;
                                }
                                this.field1371[this.field1458] = arg1;
                                this.field1368[this.field1458] = arg4;
                                this.field1369[this.field1458] = arg2;
                                ++this.field1458;
                            }
                        }
                    }
                    if (arg0.field1020 != null) {
                        for (int var9 = 4; var9 >= 0; --var9) {
                            if (arg0.field1020[var9] != null && arg0.field1020[var9].equalsIgnoreCase("attack")) {
                                short var10 = 0;
                                if (arg0.field1025 > field1569.field468) {
                                    var10 = 2000;
                                }
                                this.field1481[this.field1458] = arg0.field1020[var9] + " @yel@" + var7;
                                if (var9 == 0) {
                                    this.field1370[this.field1458] = var10 + 242;
                                }
                                if (var9 == 1) {
                                    this.field1370[this.field1458] = var10 + 209;
                                }
                                if (var9 == 2) {
                                    this.field1370[this.field1458] = var10 + 309;
                                }
                                if (var9 == 3) {
                                    this.field1370[this.field1458] = var10 + 852;
                                }
                                if (var9 == 4) {
                                    this.field1370[this.field1458] = var10 + 793;
                                }
                                this.field1371[this.field1458] = arg1;
                                this.field1368[this.field1458] = arg4;
                                this.field1369[this.field1458] = arg2;
                                ++this.field1458;
                            }
                        }
                    }
                    this.field1481[this.field1458] = "Examine @yel@" + var7;
                    this.field1370[this.field1458] = 1714;
                    this.field1371[this.field1458] = arg1;
                    this.field1368[this.field1458] = arg4;
                    this.field1369[this.field1458] = arg2;
                    ++this.field1458;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZII)V")
    private final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        LocSpawned var12 = (LocSpawned) this.field1607.method247();
        if (arg7) {
            this.field1396 = !this.field1396;
        }
        while (var12 != null) {
            if (var12.field732 == arg9 && var12.field734 == arg4 && var12.field735 == arg3 && var12.field733 == arg6) {
                var11 = var12;
                break;
            }
            var12 = (LocSpawned) this.field1607.method249(633);
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field732 = arg9;
            var11.field733 = arg6;
            var11.field734 = arg4;
            var11.field735 = arg3;
            this.method477(0, var11);
            this.field1607.method244(var11);
        }
        var11.field739 = arg0;
        var11.field741 = arg5;
        var11.field740 = arg8;
        var11.field742 = arg2;
        var11.field743 = arg1;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method491(boolean arg0) {
        if (this.field1303 > 1) {
            --this.field1303;
        }
        if (this.field1670 > 0) {
            --this.field1670;
        }
        for (int var2 = 0; var2 < 5 && this.method504((byte) 41); ++var2) {
        }
        if (this.field1663) {
            Object var3 = this.field1271.field996;
            synchronized (this.field1271.field996) {
                if (!field1244) {
                    this.field1271.field997 = 0;
                } else if (super.field27 != 0 || this.field1271.field997 >= 40) {
                    this.field1377.method217(232, (byte) 5);
                    this.field1377.method218(0);
                    int var4 = this.field1377.field714;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1271.field997 && var4 - this.field1377.field714 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1271.field999[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1271.field998[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1271.field999[var6] == -1 && this.field1271.field998[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1335 == var8 && this.field1336 == var7) {
                            if (this.field1295 < 2047) {
                                ++this.field1295;
                            }
                        } else {
                            int var10 = var8 - this.field1335;
                            this.field1335 = var8;
                            int var11 = var7 - this.field1336;
                            this.field1336 = var7;
                            if (this.field1295 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1377.method219((this.field1295 << 12) + (var10 << 6) + var11);
                                this.field1295 = 0;
                            } else if (this.field1295 < 8) {
                                this.field1377.method221((this.field1295 << 19) + 8388608 + var9);
                                this.field1295 = 0;
                            } else {
                                this.field1377.method222((this.field1295 << 19) + -1073741824 + var9);
                                this.field1295 = 0;
                            }
                        }
                    }
                    this.field1377.method227((byte) 39, this.field1377.field714 - var4);
                    if (var5 >= this.field1271.field997) {
                        this.field1271.field997 = 0;
                    } else {
                        this.field1271.field997 -= var5;
                        for (int var12 = 0; var12 < this.field1271.field997; ++var12) {
                            this.field1271.field998[var12] = this.field1271.field998[var5 + var12];
                            this.field1271.field999[var12] = this.field1271.field999[var5 + var12];
                        }
                    }
                }
            }
            if (super.field27 != 0) {
                long var13 = (super.field30 - this.field1614) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1614 = super.field30;
                int var15 = super.field29;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field28;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field27 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1377.method217(234, (byte) 5);
                this.field1377.method222((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1385 > 0) {
                --this.field1385;
            }
            if (super.field31[1] == 1 || super.field31[2] == 1 || super.field31[3] == 1 || super.field31[4] == 1) {
                this.field1386 = true;
            }
            if (this.field1386 && this.field1385 <= 0) {
                this.field1385 = 20;
                this.field1386 = false;
                this.field1377.method217(91, (byte) 5);
                this.field1377.method219(this.field1519);
                this.field1377.method219(this.field1520);
            }
            if (super.field18 && !this.field1416) {
                this.field1416 = true;
                this.field1377.method217(8, (byte) 5);
                this.field1377.method218(1);
            }
            if (!super.field18 && this.field1416) {
                this.field1416 = false;
                this.field1377.method217(8, (byte) 5);
                this.field1377.method218(0);
            }
            this.method481(0);
            this.method529((byte) 9);
            this.method462(3);
            ++this.field1668;
            if (this.field1668 > 750) {
                this.method449(-332);
            }
            this.method478((byte) 127);
            this.method492(-20457);
            this.method459((byte) 9);
            ++this.field1347;
            if (this.field1352 != 0) {
                this.field1351 += 20;
                if (this.field1351 >= 400) {
                    this.field1352 = 0;
                }
            }
            if (this.field1612 != 0) {
                ++this.field1609;
                if (this.field1609 >= 15) {
                    if (this.field1612 == 2) {
                        this.field1602 = true;
                    }
                    if (this.field1612 == 3) {
                        this.field1490 = true;
                    }
                    this.field1612 = 0;
                }
            }
            if (this.field1620 != 0) {
                ++this.field1382;
                if (super.field21 > this.field1621 + 5 || super.field21 < this.field1621 - 5 || super.field22 > this.field1622 + 5 || super.field22 < this.field1622 - 5) {
                    this.field1662 = true;
                }
                if (super.field20 == 0) {
                    if (this.field1620 == 2) {
                        this.field1602 = true;
                    }
                    if (this.field1620 == 3) {
                        this.field1490 = true;
                    }
                    this.field1620 = 0;
                    if (this.field1662 && this.field1382 >= 5) {
                        this.field1302 = -1;
                        this.method544(false);
                        if (this.field1618 == this.field1302 && this.field1619 != this.field1301) {
                            Component var20 = Component.field74[this.field1618];
                            byte var21 = 0;
                            if (this.field1345 == 1 && var20.field83 == 206) {
                                var21 = 1;
                            }
                            if (var20.field75[this.field1301] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field104) {
                                int var22 = this.field1619;
                                int var23 = this.field1301;
                                var20.field75[var23] = var20.field75[var22];
                                var20.field76[var23] = var20.field76[var22];
                                var20.field75[var22] = -1;
                                var20.field76[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1619;
                                int var25 = this.field1301;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24 - 1, var24, false);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24 + 1, var24, false);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1301, this.field1619, false);
                            }
                            this.field1377.method217(176, (byte) 5);
                            this.field1377.method219(this.field1618);
                            this.field1377.method219(this.field1619);
                            this.field1377.method219(this.field1301);
                            this.field1377.method218(var21);
                        }
                    } else if ((this.field1455 == 1 || this.method485((byte) -89, this.field1458 - 1)) && this.field1458 > 2) {
                        this.method468(6745);
                    } else if (this.field1458 > 0) {
                        this.method483(this.field1458 - 1, false);
                    }
                    this.field1609 = 10;
                    super.field27 = 0;
                }
            }
            ++field1278;
            if (field1278 > 62) {
                field1278 = 0;
                this.field1377.method217(182, (byte) 5);
            }
            if (World3D.field323 != -1) {
                int var26 = World3D.field323;
                int var27 = World3D.field324;
                boolean var28 = this.method437(field1569.field451[0], var26, true, 0, 0, field1569.field450[0], var27, 0, 0, 0, 0, 0);
                World3D.field323 = -1;
                if (var28) {
                    this.field1349 = super.field28;
                    this.field1350 = super.field29;
                    this.field1352 = 1;
                    this.field1351 = 0;
                }
            }
            if (super.field27 == 1 && this.field1235 != null) {
                this.field1235 = null;
                this.field1490 = true;
                super.field27 = 0;
            }
            this.method500(656);
            this.method507(8);
            this.method426(38628);
            this.method554(-947);
            if (super.field20 == 1 || super.field27 == 1) {
                ++this.field1266;
            }
            if (this.field1492 == 2) {
                this.method530(true);
            }
            if (this.field1492 == 2 && this.field1348) {
                this.method512(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1453[var29]++;
            }
            this.method520((byte) 9);
            ++super.field19;
            if (super.field19 > 4500) {
                this.field1670 = 250;
                super.field19 -= 500;
                this.field1377.method217(144, (byte) 5);
            }
            ++this.field1664;
            if (this.field1664 > 500) {
                this.field1664 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1299 += this.field1300;
                }
                if ((var30 & 2) == 2) {
                    this.field1634 += this.field1635;
                }
                if ((var30 & 4) == 4) {
                    this.field1412 += this.field1413;
                }
            }
            if (this.field1299 < -50) {
                this.field1300 = 2;
            }
            if (this.field1299 > 50) {
                this.field1300 = -2;
            }
            if (this.field1634 < -55) {
                this.field1635 = 2;
            }
            if (this.field1634 > 55) {
                this.field1635 = -2;
            }
            if (this.field1412 < -40) {
                this.field1413 = 1;
            }
            if (this.field1412 > 40) {
                this.field1413 = -1;
            }
            ++this.field1393;
            if (!arg0) {
                this.field1474 = !this.field1474;
            }
            if (this.field1393 > 500) {
                this.field1393 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1566 += this.field1567;
                }
                if ((var31 & 2) == 2) {
                    this.field1597 += this.field1598;
                }
            }
            if (this.field1566 < -60) {
                this.field1567 = 2;
            }
            if (this.field1566 > 60) {
                this.field1567 = -2;
            }
            if (this.field1597 < -20) {
                this.field1598 = 1;
            }
            if (this.field1597 > 10) {
                this.field1598 = -1;
            }
            ++this.field1669;
            if (this.field1669 > 50) {
                this.field1377.method217(239, (byte) 5);
            }
            try {
                if (this.field1357 != null && this.field1377.field714 > 0) {
                    this.field1357.method42(this.field1377.field714, this.field1377.field713, (byte) -39, 0);
                    this.field1377.field714 = 0;
                    this.field1669 = 0;
                }
            } catch (IOException var33) {
                this.method449(-332);
            } catch (Exception var34) {
                this.method475(2408);
            }
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

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (arg0 == -20457) {
            for (int var2 = 0; var2 < this.field1260; ++var2) {
                int var3 = this.field1261[var2];
                NpcEntity var4 = this.field1259[var3];
                if (var4 != null) {
                    this.method493(this.field1324, var4.field458.field1010, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILy;)V")
    public final void method493(byte arg0, int arg1, PathingEntity arg2) {
        if (arg2.field400 < 128 || arg2.field401 < 128 || arg2.field400 >= 13184 || arg2.field401 >= 13184) {
            arg2.field428 = -1;
            arg2.field433 = -1;
            arg2.field442 = 0;
            arg2.field443 = 0;
            arg2.field400 = arg2.field450[0] * 128 + arg2.field404 * 64;
            arg2.field401 = arg2.field451[0] * 128 + arg2.field404 * 64;
            arg2.method112(-47205);
        }
        if (field1569 == arg2 && (arg2.field400 < 1536 || arg2.field401 < 1536 || arg2.field400 >= 11776 || arg2.field401 >= 11776)) {
            arg2.field428 = -1;
            arg2.field433 = -1;
            arg2.field442 = 0;
            arg2.field443 = 0;
            arg2.field400 = arg2.field450[0] * 128 + arg2.field404 * 64;
            arg2.field401 = arg2.field451[0] * 128 + arg2.field404 * 64;
            arg2.method112(-47205);
        }
        if (arg2.field442 > field1223) {
            this.method494(arg2, this.field1236);
        } else if (arg2.field443 >= field1223) {
            this.method495(arg2, 7);
        } else {
            this.method496(arg2, false);
        }
        this.method497(arg2, 37377);
        if (arg0 != 30) {
            this.field1272 = null;
        }
        this.method498(arg2, this.field1407);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method494(PathingEntity arg0, boolean arg1) {
        int var3 = arg0.field442 - field1223;
        int var4 = arg0.field438 * 128 + arg0.field404 * 64;
        int var5 = arg0.field440 * 128 + arg0.field404 * 64;
        if (arg1) {
            this.field1667 = this.field1376.method228();
        }
        arg0.field400 += (var4 - arg0.field400) / var3;
        arg0.field401 += (var5 - arg0.field401) / var3;
        arg0.field453 = 0;
        if (arg0.field444 == 0) {
            arg0.field447 = 1024;
        }
        if (arg0.field444 == 1) {
            arg0.field447 = 1536;
        }
        if (arg0.field444 == 2) {
            arg0.field447 = 0;
        }
        if (arg0.field444 == 3) {
            arg0.field447 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method495(PathingEntity arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (field1223 == arg0.field443 || arg0.field428 == -1 || arg0.field431 != 0 || arg0.field430 + 1 > SeqType.field1136[arg0.field428].method379(1, arg0.field429)) {
            int var4 = arg0.field443 - arg0.field442;
            int var5 = field1223 - arg0.field442;
            int var6 = arg0.field438 * 128 + arg0.field404 * 64;
            int var7 = arg0.field440 * 128 + arg0.field404 * 64;
            int var8 = arg0.field439 * 128 + arg0.field404 * 64;
            int var9 = arg0.field441 * 128 + arg0.field404 * 64;
            arg0.field400 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field401 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field453 = 0;
        if (arg0.field444 == 0) {
            arg0.field447 = 1024;
        }
        if (arg0.field444 == 1) {
            arg0.field447 = 1536;
        }
        if (arg0.field444 == 2) {
            arg0.field447 = 0;
        }
        if (arg0.field444 == 3) {
            arg0.field447 = 512;
        }
        arg0.field402 = arg0.field447;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;Z)V")
    public final void method496(PathingEntity arg0, boolean arg1) {
        arg0.field425 = arg0.field405;
        if (arg0.field449 == 0) {
            arg0.field453 = 0;
        } else {
            if (arg0.field428 != -1 && arg0.field431 == 0) {
                SeqType var3 = SeqType.field1136[arg0.field428];
                if (arg0.field454 > 0 && var3.field1148 == 0) {
                    ++arg0.field453;
                    return;
                }
                if (arg0.field454 <= 0 && var3.field1149 == 0) {
                    ++arg0.field453;
                    return;
                }
            }
            int var4 = arg0.field400;
            int var5 = arg0.field401;
            int var6 = arg0.field450[arg0.field449 - 1] * 128 + arg0.field404 * 64;
            int var7 = arg0.field451[arg0.field449 - 1] * 128 + arg0.field404 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field447 = 1280;
                    } else if (var5 > var7) {
                        arg0.field447 = 1792;
                    } else {
                        arg0.field447 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field447 = 768;
                    } else if (var5 > var7) {
                        arg0.field447 = 256;
                    } else {
                        arg0.field447 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field447 = 1024;
                } else {
                    arg0.field447 = 0;
                }
                int var8 = arg0.field447 - arg0.field402 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field408;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field407;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field410;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field409;
                }
                if (var9 == -1) {
                    var9 = arg0.field407;
                }
                arg0.field425 = var9;
                int var10 = 4;
                if (arg1) {
                    this.field1667 = this.field1376.method228();
                }
                if (arg0.field447 != arg0.field402 && arg0.field422 == -1 && arg0.field448 != 0) {
                    var10 = 2;
                }
                if (arg0.field449 > 2) {
                    var10 = 6;
                }
                if (arg0.field449 > 3) {
                    var10 = 8;
                }
                if (arg0.field453 > 0 && arg0.field449 > 1) {
                    var10 = 8;
                    --arg0.field453;
                }
                if (arg0.field452[arg0.field449 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field425 == arg0.field407 && arg0.field411 != -1) {
                    arg0.field425 = arg0.field411;
                }
                if (var4 < var6) {
                    arg0.field400 += var10;
                    if (arg0.field400 > var6) {
                        arg0.field400 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field400 -= var10;
                    if (arg0.field400 < var6) {
                        arg0.field400 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field401 += var10;
                    if (arg0.field401 > var7) {
                        arg0.field401 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field401 -= var10;
                    if (arg0.field401 < var7) {
                        arg0.field401 = var7;
                    }
                }
                if (arg0.field400 == var6 && arg0.field401 == var7) {
                    --arg0.field449;
                    if (arg0.field454 > 0) {
                        --arg0.field454;
                        return;
                    }
                }
            } else {
                arg0.field400 = var6;
                arg0.field401 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method497(PathingEntity arg0, int arg1) {
        if (arg1 != 37377) {
            this.field1580 = 6;
        }
        if (arg0.field448 != 0) {
            if (arg0.field422 != -1 && arg0.field422 < 32768) {
                NpcEntity var3 = this.field1259[arg0.field422];
                if (var3 != null) {
                    int var4 = arg0.field400 - var3.field400;
                    int var5 = arg0.field401 - var3.field401;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field447 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field422 >= 32768) {
                int var6 = arg0.field422 - 32768;
                if (this.field1631 == var6) {
                    var6 = this.field1308;
                }
                PlayerEntity var7 = this.field1309[var6];
                if (var7 != null) {
                    int var8 = arg0.field400 - var7.field400;
                    int var9 = arg0.field401 - var7.field401;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field447 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field423 != 0 || arg0.field424 != 0) && (arg0.field449 == 0 || arg0.field453 > 0)) {
                int var10 = arg0.field400 - (arg0.field423 - this.field1593 - this.field1593) * 64;
                int var11 = arg0.field401 - (arg0.field424 - this.field1594 - this.field1594) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field447 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field423 = 0;
                arg0.field424 = 0;
            }
            int var12 = arg0.field447 - arg0.field402 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field448 && var12 <= 2048 - arg0.field448) {
                    if (var12 > 1024) {
                        arg0.field402 -= arg0.field448;
                    } else {
                        arg0.field402 += arg0.field448;
                    }
                } else {
                    arg0.field402 = arg0.field447;
                }
                arg0.field402 &= 2047;
                if (arg0.field425 == arg0.field405 && arg0.field447 != arg0.field402) {
                    if (arg0.field406 != -1) {
                        arg0.field425 = arg0.field406;
                        return;
                    }
                    arg0.field425 = arg0.field407;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Ly;I)V")
    public final void method498(PathingEntity arg0, int arg1) {
        if (arg1 != 5) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        arg0.field403 = false;
        if (arg0.field425 != -1) {
            SeqType var4 = SeqType.field1136[arg0.field425];
            ++arg0.field427;
            if (arg0.field426 < var4.field1137 && arg0.field427 > var4.method379(1, arg0.field426)) {
                arg0.field427 = 0;
                ++arg0.field426;
            }
            if (arg0.field426 >= var4.field1137) {
                arg0.field427 = 0;
                arg0.field426 = 0;
            }
        }
        if (arg0.field433 != -1 && field1223 >= arg0.field436) {
            if (arg0.field434 < 0) {
                arg0.field434 = 0;
            }
            SeqType var5 = SpotAnimType.field1158[arg0.field433].field1162;
            ++arg0.field435;
            while (arg0.field434 < var5.field1137 && arg0.field435 > var5.method379(1, arg0.field434)) {
                arg0.field435 -= var5.method379(1, arg0.field434);
                ++arg0.field434;
            }
            if (arg0.field434 >= var5.field1137 && (arg0.field434 < 0 || arg0.field434 >= var5.field1137)) {
                arg0.field433 = -1;
            }
        }
        if (arg0.field428 != -1 && arg0.field431 <= 1) {
            SeqType var6 = SeqType.field1136[arg0.field428];
            if (var6.field1148 == 1 && arg0.field454 > 0 && arg0.field442 <= field1223 && arg0.field443 < field1223) {
                arg0.field431 = 1;
                return;
            }
        }
        if (arg0.field428 != -1 && arg0.field431 == 0) {
            SeqType var7 = SeqType.field1136[arg0.field428];
            ++arg0.field430;
            while (arg0.field429 < var7.field1137 && arg0.field430 > var7.method379(1, arg0.field429)) {
                arg0.field430 -= var7.method379(1, arg0.field429);
                ++arg0.field429;
            }
            if (arg0.field429 >= var7.field1137) {
                arg0.field429 -= var7.field1141;
                ++arg0.field432;
                if (arg0.field432 >= var7.field1147) {
                    arg0.field428 = -1;
                }
                if (arg0.field429 < 0 || arg0.field429 >= var7.field1137) {
                    arg0.field428 = -1;
                }
            }
            arg0.field403 = var7.field1143;
        }
        if (arg0.field431 > 0) {
            --arg0.field431;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method499(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1272 = null;
        }
        if (this.field1394) {
            this.field1394 = false;
            this.field1500.method258(4, -740, super.field13, 0);
            this.field1501.method258(357, -740, super.field13, 0);
            this.field1502.method258(4, -740, super.field13, 722);
            this.field1503.method258(205, -740, super.field13, 743);
            this.field1504.method258(0, -740, super.field13, 0);
            this.field1505.method258(4, -740, super.field13, 516);
            this.field1506.method258(205, -740, super.field13, 516);
            this.field1507.method258(357, -740, super.field13, 496);
            this.field1508.method258(338, -740, super.field13, 0);
            this.field1602 = true;
            this.field1490 = true;
            this.field1488 = true;
            this.field1387 = true;
            if (this.field1492 != 2) {
                this.field1583.method258(4, -740, super.field13, 4);
                this.field1582.method258(4, -740, super.field13, 550);
            }
        }
        if (this.field1492 == 2) {
            this.method521((byte) 81);
        }
        if (this.field1354 && this.field1656 == 1) {
            this.field1602 = true;
        }
        if (this.field1353 != -1) {
            boolean var3 = this.method440(1, this.field1347, this.field1353);
            if (var3) {
                this.field1602 = true;
            }
        }
        if (this.field1612 == 2) {
            this.field1602 = true;
        }
        if (this.field1620 == 2) {
            this.field1602 = true;
        }
        if (this.field1602) {
            this.method548(-243);
            this.field1602 = false;
        }
        if (this.field1276 == -1) {
            this.field1498.field94 = this.field1374 - this.field1636 - 77;
            if (super.field21 > 448 && super.field21 < 560 && super.field22 > 332) {
                this.method531(0, super.field21 - 17, 463, false, this.field1498, false, 77, super.field22 - 357, this.field1374);
            }
            int var4 = this.field1374 - 77 - this.field1498.field94;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field1374 - 77) {
                var4 = this.field1374 - 77;
            }
            if (this.field1636 != var4) {
                this.field1636 = var4;
                this.field1490 = true;
            }
        }
        if (this.field1276 != -1) {
            boolean var5 = this.method440(1, this.field1347, this.field1276);
            if (var5) {
                this.field1490 = true;
            }
        }
        if (this.field1612 == 3) {
            this.field1490 = true;
        }
        if (this.field1620 == 3) {
            this.field1490 = true;
        }
        if (this.field1235 != null) {
            this.field1490 = true;
        }
        if (this.field1354 && this.field1656 == 2) {
            this.field1490 = true;
        }
        if (this.field1490) {
            this.method427(-419);
            this.field1490 = false;
        }
        if (this.field1492 == 2) {
            this.method479((byte) -21);
            this.field1582.method258(4, -740, super.field13, 550);
        }
        if (this.field1243 != -1) {
            this.field1488 = true;
        }
        if (this.field1488) {
            if (this.field1243 != -1 && this.field1430 == this.field1243) {
                this.field1243 = -1;
                this.field1377.method217(201, (byte) 5);
                this.field1377.method218(this.field1430);
            }
            this.field1488 = false;
            this.field1590.method257(0);
            this.field1495.method198((byte) 0, 0, 0);
            if (this.field1353 == -1) {
                if (this.field1586[this.field1430] != -1) {
                    if (this.field1430 == 0) {
                        this.field1571.method198((byte) 0, 22, 10);
                    }
                    if (this.field1430 == 1) {
                        this.field1572.method198((byte) 0, 54, 8);
                    }
                    if (this.field1430 == 2) {
                        this.field1572.method198((byte) 0, 82, 8);
                    }
                    if (this.field1430 == 3) {
                        this.field1573.method198((byte) 0, 110, 8);
                    }
                    if (this.field1430 == 4) {
                        this.field1575.method198((byte) 0, 153, 8);
                    }
                    if (this.field1430 == 5) {
                        this.field1575.method198((byte) 0, 181, 8);
                    }
                    if (this.field1430 == 6) {
                        this.field1574.method198((byte) 0, 209, 9);
                    }
                }
                if (this.field1586[0] != -1 && (this.field1243 != 0 || field1223 % 20 < 10)) {
                    this.field1464[0].method198((byte) 0, 29, 13);
                }
                if (this.field1586[1] != -1 && (this.field1243 != 1 || field1223 % 20 < 10)) {
                    this.field1464[1].method198((byte) 0, 53, 11);
                }
                if (this.field1586[2] != -1 && (this.field1243 != 2 || field1223 % 20 < 10)) {
                    this.field1464[2].method198((byte) 0, 82, 11);
                }
                if (this.field1586[3] != -1 && (this.field1243 != 3 || field1223 % 20 < 10)) {
                    this.field1464[3].method198((byte) 0, 115, 12);
                }
                if (this.field1586[4] != -1 && (this.field1243 != 4 || field1223 % 20 < 10)) {
                    this.field1464[4].method198((byte) 0, 153, 13);
                }
                if (this.field1586[5] != -1 && (this.field1243 != 5 || field1223 % 20 < 10)) {
                    this.field1464[5].method198((byte) 0, 180, 11);
                }
                if (this.field1586[6] != -1 && (this.field1243 != 6 || field1223 % 20 < 10)) {
                    this.field1464[6].method198((byte) 0, 208, 13);
                }
            }
            this.field1590.method258(160, -740, super.field13, 516);
            this.field1589.method257(0);
            this.field1494.method198((byte) 0, 0, 0);
            if (this.field1353 == -1) {
                if (this.field1586[this.field1430] != -1) {
                    if (this.field1430 == 7) {
                        this.field1237.method198((byte) 0, 42, 0);
                    }
                    if (this.field1430 == 8) {
                        this.field1238.method198((byte) 0, 74, 0);
                    }
                    if (this.field1430 == 9) {
                        this.field1238.method198((byte) 0, 102, 0);
                    }
                    if (this.field1430 == 10) {
                        this.field1239.method198((byte) 0, 130, 1);
                    }
                    if (this.field1430 == 11) {
                        this.field1241.method198((byte) 0, 173, 0);
                    }
                    if (this.field1430 == 12) {
                        this.field1241.method198((byte) 0, 201, 0);
                    }
                    if (this.field1430 == 13) {
                        this.field1240.method198((byte) 0, 229, 0);
                    }
                }
                if (this.field1586[8] != -1 && (this.field1243 != 8 || field1223 % 20 < 10)) {
                    this.field1464[7].method198((byte) 0, 74, 2);
                }
                if (this.field1586[9] != -1 && (this.field1243 != 9 || field1223 % 20 < 10)) {
                    this.field1464[8].method198((byte) 0, 102, 3);
                }
                if (this.field1586[10] != -1 && (this.field1243 != 10 || field1223 % 20 < 10)) {
                    this.field1464[9].method198((byte) 0, 137, 4);
                }
                if (this.field1586[11] != -1 && (this.field1243 != 11 || field1223 % 20 < 10)) {
                    this.field1464[10].method198((byte) 0, 174, 2);
                }
                if (this.field1586[12] != -1 && (this.field1243 != 12 || field1223 % 20 < 10)) {
                    this.field1464[11].method198((byte) 0, 201, 2);
                }
                if (this.field1586[13] != -1 && (this.field1243 != 13 || field1223 % 20 < 10)) {
                    this.field1464[12].method198((byte) 0, 226, 2);
                }
            }
            this.field1589.method258(466, -740, super.field13, 496);
            this.field1583.method257(0);
        }
        if (this.field1387) {
            this.field1387 = false;
            this.field1588.method257(0);
            this.field1493.method198((byte) 0, 0, 0);
            this.field1524.method201(55, true, false, 16777215, 28, "Public chat");
            if (this.field1329 == 0) {
                this.field1524.method201(55, true, false, 65280, 41, "On");
            }
            if (this.field1329 == 1) {
                this.field1524.method201(55, true, false, 16776960, 41, "Friends");
            }
            if (this.field1329 == 2) {
                this.field1524.method201(55, true, false, 16711680, 41, "Off");
            }
            if (this.field1329 == 3) {
                this.field1524.method201(55, true, false, 65535, 41, "Hide");
            }
            this.field1524.method201(184, true, false, 16777215, 28, "Private chat");
            if (this.field1678 == 0) {
                this.field1524.method201(184, true, false, 65280, 41, "On");
            }
            if (this.field1678 == 1) {
                this.field1524.method201(184, true, false, 16776960, 41, "Friends");
            }
            if (this.field1678 == 2) {
                this.field1524.method201(184, true, false, 16711680, 41, "Off");
            }
            this.field1524.method201(324, true, false, 16777215, 28, "Trade/duel");
            if (this.field1375 == 0) {
                this.field1524.method201(324, true, false, 65280, 41, "On");
            }
            if (this.field1375 == 1) {
                this.field1524.method201(324, true, false, 16776960, 41, "Friends");
            }
            if (this.field1375 == 2) {
                this.field1524.method201(324, true, false, 16711680, 41, "Off");
            }
            this.field1524.method201(458, true, false, 16777215, 33, "Report abuse");
            this.field1588.method258(453, -740, super.field13, 0);
            this.field1583.method257(0);
        }
        this.field1347 = 0;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method500(int arg0) {
        if (this.field1620 == 0) {
            int var2 = super.field27;
            int var3 = 21 / arg0;
            if (this.field1438 == 1 && super.field28 >= 516 && super.field29 >= 160 && super.field28 <= 765 && super.field29 <= 205) {
                var2 = 0;
            }
            if (this.field1354) {
                if (var2 != 1) {
                    int var4 = super.field21;
                    int var5 = super.field22;
                    if (this.field1656 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field1656 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field1656 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field1657 - 10 || var4 > this.field1659 + this.field1657 + 10 || var5 < this.field1658 - 10 || var5 > this.field1660 + this.field1658 + 10) {
                        this.field1354 = false;
                        if (this.field1656 == 1) {
                            this.field1602 = true;
                        }
                        if (this.field1656 == 2) {
                            this.field1490 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field1657;
                    int var7 = this.field1658;
                    int var8 = this.field1659;
                    int var9 = super.field28;
                    int var10 = super.field29;
                    if (this.field1656 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field1656 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field1656 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1458; ++var12) {
                        int var13 = (this.field1458 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method483(var11, false);
                    }
                    this.field1354 = false;
                    if (this.field1656 == 1) {
                        this.field1602 = true;
                    }
                    if (this.field1656 == 2) {
                        this.field1490 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1458 > 0) {
                    int var14 = this.field1370[this.field1458 - 1];
                    if (var14 == 582 || var14 == 113 || var14 == 555 || var14 == 331 || var14 == 354 || var14 == 694 || var14 == 962 || var14 == 795 || var14 == 681 || var14 == 100 || var14 == 102 || var14 == 1328) {
                        int var15 = this.field1368[this.field1458 - 1];
                        int var16 = this.field1369[this.field1458 - 1];
                        Component var17 = Component.field74[var16];
                        if (var17.field101 || var17.field104) {
                            this.field1662 = false;
                            this.field1382 = 0;
                            this.field1618 = var16;
                            this.field1619 = var15;
                            this.field1620 = 2;
                            this.field1621 = super.field28;
                            this.field1622 = super.field29;
                            if (Component.field74[var16].field80 == this.field1227) {
                                this.field1620 = 1;
                            }
                            if (Component.field74[var16].field80 == this.field1276) {
                                this.field1620 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1455 == 1 || this.method485((byte) -89, this.field1458 - 1)) && this.field1458 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1458 > 0) {
                    this.method483(this.field1458 - 1, false);
                }
                if (var2 != 2 || this.field1458 <= 0) {
                    return;
                }
                this.method468(6745);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (arg4 < this.field1428 || arg4 > this.field1428) {
            this.field1428 = this.field1535.method294();
        }
        if (var8 != 0) {
            int var13 = Model.field603[var8];
            int var14 = Model.field604[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field603[var9];
            int var17 = Model.field604[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1645 = arg3 - var10;
        this.field1646 = arg2 - var11;
        this.field1647 = arg0 - var12;
        this.field1648 = arg6;
        this.field1649 = arg1;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)I")
    public final int method502(int arg0) {
        if (arg0 >= 9 && arg0 <= 9) {
            int var2 = 3;
            if (this.field1648 < 310) {
                int var3 = this.field1645 >> 7;
                int var4 = this.field1647 >> 7;
                int var5 = field1569.field400 >> 7;
                int var6 = field1569.field401 >> 7;
                if ((this.field1392[this.field1644][var3][var4] & 4) != 0) {
                    var2 = this.field1644;
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
                        if ((this.field1392[this.field1644][var3][var4] & 4) != 0) {
                            var2 = this.field1644;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1392[this.field1644][var3][var4] & 4) != 0) {
                                var2 = this.field1644;
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
                        if ((this.field1392[this.field1644][var3][var4] & 4) != 0) {
                            var2 = this.field1644;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1392[this.field1644][var3][var4] & 4) != 0) {
                                var2 = this.field1644;
                            }
                        }
                    }
                }
            }
            if ((this.field1392[this.field1644][field1569.field400 >> 7][field1569.field401 >> 7] & 4) != 0) {
                var2 = this.field1644;
            }
            return var2;
        } else {
            return this.field1407;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)I")
    public final int method503(boolean arg0) {
        if (arg0) {
            this.field1667 = -1;
        }
        int var2 = this.method515(this.field1645, 526, this.field1647, this.field1644);
        return var2 - this.field1646 < 800 && (this.field1392[this.field1644][this.field1645 >> 7][this.field1647 >> 7] & 4) != 0 ? this.field1644 : 3;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        if (arg0 != 41) {
            field1486 = -452;
        }
        if (this.field1357 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1357.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1667 == -1) {
                    this.field1357.method41(this.field1376.field713, 0, 1);
                    this.field1667 = this.field1376.field713[0] & 255;
                    if (this.field1535 != null) {
                        this.field1667 = this.field1667 - this.field1535.method294() & 255;
                    }
                    this.field1666 = Protocol.field1085[this.field1667];
                    --var2;
                }
                if (this.field1666 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1357.method41(this.field1376.field713, 0, 1);
                    this.field1666 = this.field1376.field713[0] & 255;
                    --var2;
                }
                if (this.field1666 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1357.method41(this.field1376.field713, 0, 2);
                    this.field1376.field714 = 0;
                    this.field1666 = this.field1376.method230();
                    var2 -= 2;
                }
                if (var2 < this.field1666) {
                    return false;
                }
                this.field1376.field714 = 0;
                this.field1357.method41(this.field1376.field713, 0, this.field1666);
                this.field1668 = 0;
                this.field1222 = this.field1221;
                this.field1221 = this.field1220;
                this.field1220 = this.field1667;
                if (this.field1667 == 203) {
                    for (int var3 = 0; var3 < this.field1309.length; ++var3) {
                        if (this.field1309[var3] != null) {
                            this.field1309[var3].field428 = -1;
                        }
                    }
                    for (int var4 = 0; var4 < this.field1259.length; ++var4) {
                        if (this.field1259[var4] != null) {
                            this.field1259[var4].field428 = -1;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 143) {
                    this.field1303 = this.field1376.method230() * 30;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 173) {
                    this.field1629 = this.field1376.method228();
                    this.field1630 = this.field1376.method228();
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 14) {
                    int var5 = this.field1376.method230();
                    int var6 = this.field1376.method230();
                    Component var7 = Component.field74[var5];
                    if (var7 != null && var7.field81 == 0) {
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        if (var6 > var7.field93 - var7.field85) {
                            var6 = var7.field93 - var7.field85;
                        }
                        var7.field94 = var6;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 60) {
                    long var8 = this.field1376.method234(0);
                    int var10 = this.field1376.method233();
                    int var11 = this.field1376.method228();
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 100; ++var13) {
                        if (this.field1326[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var11 <= 1) {
                        for (int var14 = 0; var14 < this.field1509; ++var14) {
                            if (this.field1358[var14] == var8) {
                                var12 = true;
                                break;
                            }
                        }
                    }
                    if (!var12 && this.field1316 == 0) {
                        try {
                            this.field1326[this.field1321] = var10;
                            this.field1321 = (this.field1321 + 1) % 100;
                            String var15 = WordPack.method306(false, this.field1376, this.field1666 - 13);
                            String var16 = WordFilter.method398((byte) -1, var15);
                            if (var11 != 2 && var11 != 3) {
                                if (var11 == 1) {
                                    this.method539(var16, "@cr1@" + JString.method303(JString.method300(586, var8), 8), (byte) 6, 7);
                                } else {
                                    this.method539(var16, JString.method303(JString.method300(586, var8), 8), (byte) 6, 3);
                                }
                            } else {
                                this.method539(var16, "@cr2@" + JString.method303(JString.method300(586, var8), 8), (byte) 6, 7);
                            }
                        } catch (Exception var158) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 3) {
                    int var18 = this.field1376.method230();
                    int var19 = this.field1376.method230();
                    Component.field74[var18].field123 = 2;
                    Component.field74[var18].field124 = var19;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 123) {
                    this.method461(this.field1666, (byte) 5, this.field1376);
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 239) {
                    int var20 = this.field1376.method231();
                    this.field1510 = var20;
                    this.field1490 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 0) {
                    this.field1348 = true;
                    this.field1282 = this.field1376.method228();
                    this.field1283 = this.field1376.method228();
                    this.field1284 = this.field1376.method230();
                    this.field1285 = this.field1376.method228();
                    this.field1286 = this.field1376.method228();
                    if (this.field1286 >= 100) {
                        int var21 = this.field1282 * 128 + 64;
                        int var22 = this.field1283 * 128 + 64;
                        int var23 = this.method515(var21, 526, var22, this.field1644) - this.field1284;
                        int var24 = var21 - this.field1645;
                        int var25 = var23 - this.field1646;
                        int var26 = var22 - this.field1647;
                        int var27 = (int) Math.sqrt((double) (var24 * var24 + var26 * var26));
                        this.field1648 = (int) (Math.atan2((double) var25, (double) var27) * 325.949D) & 2047;
                        this.field1649 = (int) (Math.atan2((double) var24, (double) var26) * -325.949D) & 2047;
                        if (this.field1648 < 128) {
                            this.field1648 = 128;
                        }
                        if (this.field1648 > 383) {
                            this.field1648 = 383;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 174) {
                    if (this.field1353 != -1) {
                        this.field1353 = -1;
                        this.field1602 = true;
                        this.field1488 = true;
                    }
                    if (this.field1276 != -1) {
                        this.field1276 = -1;
                        this.field1490 = true;
                    }
                    if (this.field1516) {
                        this.field1516 = false;
                        this.field1490 = true;
                    }
                    this.field1227 = -1;
                    this.field1446 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 58) {
                    this.field1243 = this.field1376.method228();
                    if (this.field1430 == this.field1243) {
                        if (this.field1243 == 3) {
                            this.field1430 = 1;
                        } else {
                            this.field1430 = 3;
                        }
                        this.field1602 = true;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 95) {
                    int var28 = this.field1376.method230();
                    int var29 = this.field1376.method231();
                    Component var30 = Component.field74[var28];
                    var30.field127 = var29;
                    if (var29 == -1) {
                        var30.field77 = 0;
                        var30.field78 = 0;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 27) {
                    int var31 = this.field1376.method230();
                    int var32 = this.field1376.method231();
                    int var33 = this.field1376.method231();
                    Component var34 = Component.field74[var31];
                    var34.field87 = var32;
                    var34.field88 = var33;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 196) {
                    int var35 = this.field1376.method230();
                    int var36 = this.field1376.method233();
                    this.field1628[var35] = var36;
                    if (this.field1558[var35] != var36) {
                        this.field1558[var35] = var36;
                        this.method476(var35, 108);
                        this.field1602 = true;
                        if (this.field1510 != -1) {
                            this.field1490 = true;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 73) {
                    String var37 = this.field1376.method235();
                    if (var37.endsWith(":tradereq:")) {
                        String var38 = var37.substring(0, var37.indexOf(":"));
                        long var39 = JString.method299(var38);
                        boolean var41 = false;
                        for (int var42 = 0; var42 < this.field1509; ++var42) {
                            if (this.field1358[var42] == var39) {
                                var41 = true;
                                break;
                            }
                        }
                        if (!var41 && this.field1316 == 0) {
                            this.method539("wishes to trade with you.", var38, (byte) 6, 4);
                        }
                    } else if (!var37.endsWith(":duelreq:")) {
                        this.method539(var37, "", (byte) 6, 0);
                    } else {
                        String var43 = var37.substring(0, var37.indexOf(":"));
                        long var44 = JString.method299(var43);
                        boolean var46 = false;
                        for (int var47 = 0; var47 < this.field1509; ++var47) {
                            if (this.field1358[var47] == var44) {
                                var46 = true;
                                break;
                            }
                        }
                        if (!var46 && this.field1316 == 0) {
                            this.method539("wishes to duel with you.", var43, (byte) 6, 8);
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 75) {
                    this.field1623 = this.field1376.method228();
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 222) {
                    int var48 = this.field1376.method230();
                    int var49 = this.field1376.method230();
                    int var50 = this.field1376.method230();
                    ObjType var51 = ObjType.method345(var49);
                    Component.field74[var48].field123 = 4;
                    Component.field74[var48].field124 = var49;
                    Component.field74[var48].field130 = var51.field1050;
                    Component.field74[var48].field131 = var51.field1051;
                    Component.field74[var48].field129 = var51.field1049 * 100 / var50;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 159) {
                    this.field1629 = this.field1376.method228();
                    this.field1630 = this.field1376.method228();
                    for (int var52 = this.field1629; var52 < this.field1629 + 8; ++var52) {
                        for (int var53 = this.field1630; var53 < this.field1630 + 8; ++var53) {
                            if (this.field1272[this.field1644][var52][var53] != null) {
                                this.field1272[this.field1644][var52][var53] = null;
                                this.method546(var52, var53);
                            }
                        }
                    }
                    for (LocSpawned var54 = (LocSpawned) this.field1607.method247(); var54 != null; var54 = (LocSpawned) this.field1607.method249(633)) {
                        if (var54.field734 >= this.field1629 && var54.field734 < this.field1629 + 8 && var54.field735 >= this.field1630 && var54.field735 < this.field1630 + 8 && this.field1644 == var54.field732) {
                            var54.field743 = 0;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 136) {
                    this.field1602 = true;
                    int var55 = this.field1376.method228();
                    int var56 = this.field1376.method233();
                    int var57 = this.field1376.method228();
                    this.field1304[var55] = var56;
                    this.field1280[var55] = var57;
                    this.field1419[var55] = 1;
                    for (int var58 = 0; var58 < 98; ++var58) {
                        if (var56 >= field1281[var58]) {
                            this.field1419[var55] = var58 + 2;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 5) {
                    this.field1661 = false;
                    this.field1516 = true;
                    this.field1638 = "";
                    this.field1490 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 91) {
                    int var59 = this.field1376.method230();
                    int var60 = this.field1376.method228();
                    if (var59 == 65535) {
                        var59 = -1;
                    }
                    this.field1586[var60] = var59;
                    this.field1602 = true;
                    this.field1488 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 141) {
                    int var61 = this.field1376.method230();
                    this.method532(var61, -925);
                    if (this.field1353 != -1) {
                        this.field1353 = -1;
                        this.field1602 = true;
                        this.field1488 = true;
                    }
                    this.field1276 = var61;
                    this.field1490 = true;
                    this.field1227 = -1;
                    this.field1446 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 25) {
                    int var62 = this.field1376.method230();
                    int var63 = this.field1376.method228();
                    int var64 = this.field1376.method230();
                    if (this.field1267 && !field1462 && this.field1373 < 50) {
                        this.field1625[this.field1373] = var62;
                        this.field1478[this.field1373] = var63;
                        this.field1639[this.field1373] = Wave.field915[var62] + var64;
                        ++this.field1373;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 98 || this.field1667 == 218 || this.field1667 == 8 || this.field1667 == 114 || this.field1667 == 37 || this.field1667 == 115 || this.field1667 == 120 || this.field1667 == 30 || this.field1667 == 88 || this.field1667 == 70) {
                    this.method434(this.field1376, this.field1667, 21631);
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 28) {
                    this.field1602 = true;
                    int var65 = this.field1376.method230();
                    Component var66 = Component.field74[var65];
                    int var67 = this.field1376.method228();
                    for (int var68 = 0; var68 < var67; ++var68) {
                        var66.field75[var68] = this.field1376.method230();
                        int var69 = this.field1376.method228();
                        if (var69 == 255) {
                            var69 = this.field1376.method233();
                        }
                        var66.field76[var68] = var69;
                    }
                    for (int var70 = var67; var70 < var66.field75.length; ++var70) {
                        var66.field75[var70] = 0;
                        var66.field76[var70] = 0;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 204) {
                    int var71 = this.field1376.method228();
                    int var72 = this.field1376.method228();
                    String var73 = this.field1376.method235();
                    if (var71 >= 1 && var71 <= 5) {
                        if (var73.equalsIgnoreCase("null")) {
                            var73 = null;
                        }
                        this.field1553[var71 - 1] = var73;
                        this.field1554[var71 - 1] = var72 == 0;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 63) {
                    this.field1509 = this.field1666 / 8;
                    for (int var74 = 0; var74 < this.field1509; ++var74) {
                        this.field1358[var74] = this.field1376.method234(0);
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 85) {
                    int var75 = this.field1376.method231();
                    if (var75 >= 0) {
                        this.method532(var75, -925);
                    }
                    this.field1297 = var75;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 211) {
                    int var76 = this.field1376.method230();
                    int var77 = this.field1376.method230();
                    Component.field74[var76].field123 = 1;
                    Component.field74[var76].field124 = var77;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 146) {
                    this.field1511 = this.field1376.method233();
                    this.field1579 = this.field1376.method230();
                    this.field1411 = this.field1376.method228();
                    this.field1672 = this.field1376.method230();
                    this.field1671 = this.field1376.method228();
                    if (this.field1511 != 0 && this.field1227 == -1) {
                        signlink.dnslookup(JString.method302(this.field1511, this.field1427));
                        this.method453(-711);
                        short var78 = 650;
                        if (this.field1411 != 201 || this.field1671 == 1) {
                            var78 = 655;
                        }
                        this.field1489 = "";
                        this.field1451 = false;
                        for (int var79 = 0; var79 < Component.field74.length; ++var79) {
                            if (Component.field74[var79] != null && Component.field74[var79].field83 == var78) {
                                this.field1227 = Component.field74[var79].field80;
                                break;
                            }
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 164) {
                    if (this.field1430 == 12) {
                        this.field1602 = true;
                    }
                    this.field1431 = this.field1376.method231();
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 227) {
                    int var80 = this.field1376.method230();
                    boolean var81 = this.field1376.method228() == 1;
                    Component.field74[var80].field95 = var81;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 249) {
                    int var82 = this.field1376.method230();
                    int var83 = this.field1376.method230();
                    if (this.field1276 != -1) {
                        this.field1276 = -1;
                        this.field1490 = true;
                    }
                    if (this.field1516) {
                        this.field1516 = false;
                        this.field1490 = true;
                    }
                    this.field1227 = var82;
                    this.field1353 = var83;
                    this.field1602 = true;
                    this.field1488 = true;
                    this.field1446 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 87) {
                    this.method471(this.field1376, this.field1327, this.field1666);
                    this.field1496 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 21) {
                    this.method475(2408);
                    this.field1667 = -1;
                    return false;
                }
                if (this.field1667 == 161) {
                    int var84 = this.field1376.method230();
                    Component.field74[var84].field123 = 3;
                    Component.field74[var84].field124 = (field1569.field466[8] << 6) + (field1569.field466[0] << 12) + (field1569.field467[0] << 24) + (field1569.field467[4] << 18) + field1569.field466[11];
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 255) {
                    this.field1627 = this.field1376.method228();
                    this.field1602 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 197) {
                    int var85 = this.field1376.method230();
                    this.method532(var85, -925);
                    if (this.field1353 != -1) {
                        this.field1353 = -1;
                        this.field1602 = true;
                        this.field1488 = true;
                    }
                    if (this.field1276 != -1) {
                        this.field1276 = -1;
                        this.field1490 = true;
                    }
                    if (this.field1516) {
                        this.field1516 = false;
                        this.field1490 = true;
                    }
                    this.field1227 = var85;
                    this.field1446 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 187) {
                    int var86 = this.field1376.method230();
                    this.method532(var86, -925);
                    if (this.field1276 != -1) {
                        this.field1276 = -1;
                        this.field1490 = true;
                    }
                    if (this.field1516) {
                        this.field1516 = false;
                        this.field1490 = true;
                    }
                    this.field1353 = var86;
                    this.field1602 = true;
                    this.field1488 = true;
                    this.field1227 = -1;
                    this.field1446 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 213) {
                    this.field1631 = this.field1376.method230();
                    this.field1397 = this.field1376.method228();
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 186) {
                    int var87 = this.field1376.method230();
                    byte var88 = this.field1376.method229();
                    this.field1628[var87] = var88;
                    if (this.field1558[var87] != var88) {
                        this.field1558[var87] = var88;
                        this.method476(var87, 108);
                        this.field1602 = true;
                        if (this.field1510 != -1) {
                            this.field1490 = true;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 94) {
                    if (this.field1430 == 12) {
                        this.field1602 = true;
                    }
                    this.field1409 = this.field1376.method228();
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 64) {
                    this.field1232 = this.field1376.method228();
                    if (this.field1232 == 1) {
                        this.field1642 = this.field1376.method230();
                    }
                    if (this.field1232 >= 2 && this.field1232 <= 6) {
                        if (this.field1232 == 2) {
                            this.field1676 = 64;
                            this.field1677 = 64;
                        }
                        if (this.field1232 == 3) {
                            this.field1676 = 0;
                            this.field1677 = 64;
                        }
                        if (this.field1232 == 4) {
                            this.field1676 = 128;
                            this.field1677 = 64;
                        }
                        if (this.field1232 == 5) {
                            this.field1676 = 64;
                            this.field1677 = 0;
                        }
                        if (this.field1232 == 6) {
                            this.field1676 = 64;
                            this.field1677 = 128;
                        }
                        this.field1232 = 2;
                        this.field1673 = this.field1376.method230();
                        this.field1674 = this.field1376.method230();
                        this.field1675 = this.field1376.method228();
                    }
                    if (this.field1232 == 10) {
                        this.field1606 = this.field1376.method230();
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 167) {
                    this.field1348 = false;
                    for (int var89 = 0; var89 < 5; ++var89) {
                        this.field1624[var89] = false;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 225) {
                    int var90 = this.field1376.method228();
                    int var91 = this.field1376.method228();
                    int var92 = this.field1376.method228();
                    int var93 = this.field1376.method228();
                    this.field1624[var90] = true;
                    this.field1330[var90] = var91;
                    this.field1344[var90] = var92;
                    this.field1258[var90] = var93;
                    this.field1453[var90] = 0;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 55) {
                    this.field1348 = true;
                    this.field1528 = this.field1376.method228();
                    this.field1529 = this.field1376.method228();
                    this.field1530 = this.field1376.method230();
                    this.field1531 = this.field1376.method228();
                    this.field1532 = this.field1376.method228();
                    if (this.field1532 >= 100) {
                        this.field1645 = this.field1528 * 128 + 64;
                        this.field1647 = this.field1529 * 128 + 64;
                        this.field1646 = this.method515(this.field1645, 526, this.field1647, this.field1644) - this.field1530;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 140) {
                    for (int var94 = 0; var94 < this.field1558.length; ++var94) {
                        if (this.field1628[var94] != this.field1558[var94]) {
                            this.field1558[var94] = this.field1628[var94];
                            this.method476(var94, 108);
                            this.field1602 = true;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 170) {
                    this.field1602 = true;
                    int var95 = this.field1376.method230();
                    Component var96 = Component.field74[var95];
                    while (this.field1376.field714 < this.field1666) {
                        int var97 = this.field1376.method228();
                        int var98 = this.field1376.method230();
                        int var99 = this.field1376.method228();
                        if (var99 == 255) {
                            var99 = this.field1376.method233();
                        }
                        if (var97 >= 0 && var97 < var96.field75.length) {
                            var96.field75[var97] = var98;
                            var96.field76[var97] = var99;
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 61) {
                    this.field1629 = this.field1376.method228();
                    this.field1630 = this.field1376.method228();
                    while (this.field1376.field714 < this.field1666) {
                        int var100 = this.field1376.method228();
                        this.method434(this.field1376, var100, 21631);
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 108) {
                    this.field1420 = 0;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 38) {
                    int var101 = this.field1376.method230();
                    int var102 = this.field1376.method230();
                    int var103 = var102 >> 10 & 31;
                    int var104 = var102 >> 5 & 31;
                    int var105 = var102 & 31;
                    Component.field74[var101].field117 = (var105 << 3) + (var103 << 19) + (var104 << 11);
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 168) {
                    int var106 = this.field1376.method230();
                    Component var107 = Component.field74[var106];
                    for (int var108 = 0; var108 < var107.field75.length; ++var108) {
                        var107.field75[var108] = -1;
                        var107.field75[var108] = 0;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 163) {
                    int var109 = this.field1376.method230();
                    if (var109 == 65535) {
                        var109 = -1;
                    }
                    if (this.field1560 != var109 && this.field1346 && !field1462 && this.field1268 == 0) {
                        this.field1449 = var109;
                        this.field1450 = true;
                        this.field1480.method278(2, this.field1449);
                    }
                    this.field1560 = var109;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 242) {
                    int var110 = this.field1376.method230();
                    int var111 = this.field1376.method230();
                    if (this.field1346 && !field1462) {
                        this.field1449 = var110;
                        this.field1450 = false;
                        this.field1480.method278(2, this.field1449);
                        this.field1268 = var111;
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 111) {
                    long var112 = this.field1376.method234(0);
                    int var114 = this.field1376.method228();
                    String var115 = JString.method303(JString.method300(586, var112), 8);
                    for (int var116 = 0; var116 < this.field1626; ++var116) {
                        if (this.field1269[var116] == var112) {
                            if (this.field1434[var116] != var114) {
                                this.field1434[var116] = var114;
                                this.field1602 = true;
                                if (var114 > 0) {
                                    this.method539(var115 + " has logged in.", "", (byte) 6, 5);
                                }
                                if (var114 == 0) {
                                    this.method539(var115 + " has logged out.", "", (byte) 6, 5);
                                }
                            }
                            var115 = null;
                            break;
                        }
                    }
                    if (var115 != null && this.field1626 < 200) {
                        this.field1269[this.field1626] = var112;
                        this.field1559[this.field1626] = var115;
                        this.field1434[this.field1626] = var114;
                        ++this.field1626;
                        this.field1602 = true;
                    }
                    boolean var117 = false;
                    while (!var117) {
                        var117 = true;
                        for (int var118 = 0; var118 < this.field1626 - 1; ++var118) {
                            if (this.field1434[var118] != field1459 && this.field1434[var118 + 1] == field1459 || this.field1434[var118] == 0 && this.field1434[var118 + 1] != 0) {
                                int var119 = this.field1434[var118];
                                this.field1434[var118] = this.field1434[var118 + 1];
                                this.field1434[var118 + 1] = var119;
                                String var120 = this.field1559[var118];
                                this.field1559[var118] = this.field1559[var118 + 1];
                                this.field1559[var118 + 1] = var120;
                                long var121 = this.field1269[var118];
                                this.field1269[var118] = this.field1269[var118 + 1];
                                this.field1269[var118 + 1] = var121;
                                this.field1602 = true;
                                var117 = false;
                            }
                        }
                    }
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 138) {
                    this.field1430 = this.field1376.method228();
                    this.field1602 = true;
                    this.field1488 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 209) {
                    int var123 = this.field1376.method230();
                    int var124 = this.field1376.method230();
                    if (this.field1476 == var123 && this.field1477 == var124 && this.field1492 == 2) {
                        this.field1667 = -1;
                        return true;
                    }
                    this.field1476 = var123;
                    this.field1477 = var124;
                    this.field1593 = (this.field1476 - 6) * 8;
                    this.field1594 = (this.field1477 - 6) * 8;
                    this.field1534 = false;
                    if ((this.field1476 / 8 == 48 || this.field1476 / 8 == 49) && this.field1477 / 8 == 48) {
                        this.field1534 = true;
                    }
                    if (this.field1476 / 8 == 48 && this.field1477 / 8 == 148) {
                        this.field1534 = true;
                    }
                    this.field1492 = 1;
                    this.field1292 = System.currentTimeMillis();
                    this.field1583.method257(0);
                    this.field1524.method200(-544, 151, 257, "Loading - please wait.", 0);
                    this.field1524.method200(-544, 150, 256, "Loading - please wait.", 16777215);
                    this.field1583.method258(4, -740, super.field13, 4);
                    int var125 = 0;
                    for (int var126 = (this.field1476 - 6) / 8; var126 <= (this.field1476 + 6) / 8; ++var126) {
                        for (int var127 = (this.field1477 - 6) / 8; var127 <= (this.field1477 + 6) / 8; ++var127) {
                            ++var125;
                        }
                    }
                    this.field1372 = new byte[var125][];
                    this.field1640 = new byte[var125][];
                    this.field1224 = new int[var125];
                    this.field1225 = new int[var125];
                    this.field1226 = new int[var125];
                    int var128 = 0;
                    for (int var129 = (this.field1476 - 6) / 8; var129 <= (this.field1476 + 6) / 8; ++var129) {
                        for (int var130 = (this.field1477 - 6) / 8; var130 <= (this.field1477 + 6) / 8; ++var130) {
                            this.field1224[var128] = (var129 << 8) + var130;
                            if (this.field1534 && (var130 == 49 || var130 == 149 || var130 == 147 || var129 == 50 || var129 == 49 && var130 == 47)) {
                                this.field1225[var128] = -1;
                                this.field1226[var128] = -1;
                                ++var128;
                            } else {
                                int var131 = this.field1225[var128] = this.field1480.method273(23320, var129, 0, var130);
                                if (var131 != -1) {
                                    this.field1480.method278(3, var131);
                                }
                                int var132 = this.field1226[var128] = this.field1480.method273(23320, var129, 1, var130);
                                if (var132 != -1) {
                                    this.field1480.method278(3, var132);
                                }
                                ++var128;
                            }
                        }
                    }
                    int var133 = this.field1593 - this.field1595;
                    int var134 = this.field1594 - this.field1596;
                    this.field1595 = this.field1593;
                    this.field1596 = this.field1594;
                    for (int var135 = 0; var135 < 16384; ++var135) {
                        NpcEntity var136 = this.field1259[var135];
                        if (var136 != null) {
                            for (int var137 = 0; var137 < 10; ++var137) {
                                var136.field450[var137] -= var133;
                                var136.field451[var137] -= var134;
                            }
                            var136.field400 -= var133 * 128;
                            var136.field401 -= var134 * 128;
                        }
                    }
                    for (int var138 = 0; var138 < this.field1307; ++var138) {
                        PlayerEntity var139 = this.field1309[var138];
                        if (var139 != null) {
                            for (int var140 = 0; var140 < 10; ++var140) {
                                var139.field450[var140] -= var133;
                                var139.field451[var140] -= var134;
                            }
                            var139.field400 -= var133 * 128;
                            var139.field401 -= var134 * 128;
                        }
                    }
                    this.field1496 = true;
                    byte var141 = 0;
                    byte var142 = 104;
                    byte var143 = 1;
                    if (var133 < 0) {
                        var141 = 103;
                        var142 = -1;
                        var143 = -1;
                    }
                    byte var144 = 0;
                    byte var145 = 104;
                    byte var146 = 1;
                    if (var134 < 0) {
                        var144 = 103;
                        var145 = -1;
                        var146 = -1;
                    }
                    for (int var147 = var141; var142 != var147; var147 += var143) {
                        for (int var148 = var144; var145 != var148; var148 += var146) {
                            int var149 = var133 + var147;
                            int var150 = var134 + var148;
                            for (int var151 = 0; var151 < 4; ++var151) {
                                if (var149 >= 0 && var150 >= 0 && var149 < 104 && var150 < 104) {
                                    this.field1272[var151][var147][var148] = this.field1272[var151][var149][var150];
                                } else {
                                    this.field1272[var151][var147][var148] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var152 = (LocSpawned) this.field1607.method247(); var152 != null; var152 = (LocSpawned) this.field1607.method249(633)) {
                        var152.field734 -= var133;
                        var152.field735 -= var134;
                        if (var152.field734 < 0 || var152.field735 < 0 || var152.field734 >= 104 || var152.field735 >= 104) {
                            var152.method106();
                        }
                    }
                    if (this.field1420 != 0) {
                        this.field1420 -= var133;
                        this.field1421 -= var134;
                    }
                    this.field1348 = false;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 24) {
                    this.field1329 = this.field1376.method228();
                    this.field1678 = this.field1376.method228();
                    this.field1375 = this.field1376.method228();
                    this.field1387 = true;
                    this.field1490 = true;
                    this.field1667 = -1;
                    return true;
                }
                if (this.field1667 == 41) {
                    int var153 = this.field1376.method230();
                    String var154 = this.field1376.method235();
                    Component.field74[var153].field115 = var154;
                    if (this.field1586[this.field1430] == Component.field74[var153].field80) {
                        this.field1602 = true;
                    }
                    this.field1667 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1667 + "," + this.field1666 + " - " + this.field1221 + "," + this.field1222);
                this.method475(2408);
            } catch (IOException var159) {
                this.method449(-332);
            } catch (Exception var160) {
                String var156 = "T2 - " + this.field1667 + "," + this.field1221 + "," + this.field1222 + " - " + this.field1666 + "," + (field1569.field450[0] + this.field1593) + "," + (field1569.field451[0] + this.field1594) + " - ";
                for (int var157 = 0; var157 < this.field1666 && var157 < 50; ++var157) {
                    var156 = var156 + this.field1376.field713[var157] + ",";
                }
                signlink.reporterror(var156);
                this.method475(2408);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lmb;II)V")
    private final void method505(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1312; ++var4) {
            int var5 = this.field1313[var4];
            PlayerEntity var6 = this.field1309[var5];
            int var7 = arg0.method228();
            if ((var7 & 128) == 128) {
                var7 += arg0.method228() << 8;
            }
            this.method522(var5, var7, 39, arg0, var6);
        }
        if (arg2 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILmb;)V")
    private final void method506(int arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field715 + 10 < arg0 * 8) {
                int var4 = arg2.method239(11, this.field1395);
                if (var4 != 2047) {
                    if (this.field1309[var4] == null) {
                        this.field1309[var4] = new PlayerEntity();
                        if (this.field1314[var4] != null) {
                            this.field1309[var4].method116(this.field1314[var4], -25120);
                        }
                    }
                    this.field1311[this.field1310++] = var4;
                    PlayerEntity var5 = this.field1309[var4];
                    var5.field445 = field1223;
                    int var6 = arg2.method239(5, this.field1395);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method239(5, this.field1395);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method239(1, this.field1395);
                    var5.method110(-34395, var8 == 1, field1569.field451[0] + var7, field1569.field450[0] + var6);
                    int var9 = arg2.method239(1, this.field1395);
                    if (var9 == 1) {
                        this.field1313[this.field1312++] = var4;
                    }
                    continue;
                }
            }
            arg2.method240(false);
            while (arg1 >= 0) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method507(int arg0) {
        if (arg0 != 8) {
            this.field1479 = this.field1535.method294();
        }
        if (super.field27 == 1) {
            int var2 = super.field28 - 25 - 550;
            int var3 = super.field29 - 5 - 4;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1566 + this.field1520 & 2047;
                int var5 = Pix3D.field646[var4];
                int var6 = Pix3D.field647[var4];
                int var7 = (this.field1597 + 256) * var5 >> 8;
                int var8 = (this.field1597 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = field1569.field400 + var9 >> 7;
                int var12 = field1569.field401 - var10 >> 7;
                boolean var13 = this.method437(field1569.field451[0], var11, true, 0, 0, field1569.field450[0], var12, 0, 0, 0, 0, 1);
                if (var13) {
                    this.field1377.method218(var2);
                    this.field1377.method218(var3);
                    this.field1377.method219(this.field1520);
                    this.field1377.method218(57);
                    this.field1377.method218(this.field1566);
                    this.field1377.method218(this.field1597);
                    this.field1377.method218(89);
                    this.field1377.method219(field1569.field400);
                    this.field1377.method219(field1569.field401);
                    this.field1377.method218(this.field1654);
                    this.field1377.method218(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.field1290.method198((byte) 0, arg0, arg1);
        this.field1291.method198((byte) 0, arg0, arg1 + arg3 - 16);
        Pix2D.method156(16, this.field1436, 47458, arg1 + 16, arg3 - 32, arg0);
        int var7 = (arg3 - 32) * arg3 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg2 / (arg4 - arg3);
        Pix2D.method156(16, this.field1401, 47458, arg1 + 16 + var8, var7, arg0);
        Pix2D.method161(arg1 + 16 + var8, arg0, this.field1454, var7, true);
        Pix2D.method161(arg1 + 16 + var8, arg0 + 1, this.field1454, var7, true);
        Pix2D.method159(this.field1454, 16, arg0, arg1 + 16 + var8, (byte) 2);
        Pix2D.method159(this.field1454, 16, arg0, arg1 + 17 + var8, (byte) 2);
        Pix2D.method161(arg1 + 16 + var8, arg0 + 15, this.field1274, var7, true);
        Pix2D.method161(arg1 + 17 + var8, arg0 + 14, this.field1274, var7 - 1, true);
        Pix2D.method159(this.field1274, 16, arg0, arg1 + 15 + var8 + var7, (byte) 2);
        Pix2D.method159(this.field1274, 15, arg0 + 1, arg1 + 14 + var8 + var7, (byte) 2);
        if (this.field1363 == arg5) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method509(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method510(int arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1514.method247(); var2 != null; var2 = (ProjectileEntity) this.field1514.method249(633)) {
            if (this.field1644 == var2.field505 && field1223 <= var2.field511) {
                if (field1223 >= var2.field510) {
                    if (var2.field514 > 0) {
                        NpcEntity var4 = this.field1259[var2.field514 - 1];
                        if (var4 != null && var4.field400 >= 0 && var4.field400 < 13312 && var4.field401 >= 0 && var4.field401 < 13312) {
                            var2.method119(var4.field400, 0, this.method515(var4.field400, 526, var4.field401, var2.field505) - var2.field509, var4.field401, field1223);
                        }
                    }
                    if (var2.field514 < 0) {
                        int var5 = -var2.field514 - 1;
                        PlayerEntity var6;
                        if (this.field1631 == var5) {
                            var6 = field1569;
                        } else {
                            var6 = this.field1309[var5];
                        }
                        if (var6 != null && var6.field400 >= 0 && var6.field400 < 13312 && var6.field401 >= 0 && var6.field401 < 13312) {
                            var2.method119(var6.field400, 0, this.method515(var6.field400, 526, var6.field401, var2.field505) - var2.field509, var6.field401, field1223);
                        }
                    }
                    var2.method120(true, this.field1347);
                    this.field1463.method61(this.field1644, (int) var2.field516, var2, false, (int) var2.field518, false, (int) var2.field517, var2.field524, 60, -1);
                }
            } else {
                var2.method106();
            }
        }
        ++field1557;
        if (arg0 != 4) {
            this.field1479 = this.field1535.method294();
        }
        if (field1557 > 1174) {
            field1557 = 0;
            this.field1377.method217(51, (byte) 5);
            this.field1377.method218(0);
            int var3 = this.field1377.field714;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1377.method219(11499);
            }
            this.field1377.method219(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1377.method218(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1377.method218(94);
            }
            this.field1377.method219(51693);
            this.field1377.method218(16);
            this.field1377.method219(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1377.method218(65);
            }
            this.field1377.method218((int) (Math.random() * 256.0D));
            this.field1377.method219(22990);
            this.field1377.method227((byte) 39, this.field1377.field714 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 257);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1459 = Integer.parseInt(arg0[0]);
                field1460 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method518((byte) -118);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method536(4);
                }
                if (arg0[3].equals("free")) {
                    field1461 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1461 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 2, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method511(int arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field715 + 21 < arg0 * 8) {
                int var4 = arg1.method239(14, this.field1395);
                if (var4 != 16383) {
                    if (this.field1259[var4] == null) {
                        this.field1259[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1259[var4];
                    this.field1261[this.field1260++] = var4;
                    var5.field445 = field1223;
                    var5.field458 = NpcType.method339(arg1.method239(11, this.field1395));
                    var5.field404 = var5.field458.field1010;
                    var5.field448 = var5.field458.field1032;
                    var5.field407 = var5.field458.field1014;
                    var5.field408 = var5.field458.field1015;
                    var5.field409 = var5.field458.field1016;
                    var5.field410 = var5.field458.field1017;
                    var5.field405 = var5.field458.field1013;
                    int var6 = arg1.method239(5, this.field1395);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method239(5, this.field1395);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method110(-34395, false, field1569.field451[0] + var7, field1569.field450[0] + var6);
                    int var8 = arg1.method239(1, this.field1395);
                    if (var8 == 1) {
                        this.field1313[this.field1312++] = var4;
                    }
                    continue;
                }
            }
            arg1.method240(false);
            if (arg2 != 5) {
                this.method6();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method512(int arg0) {
        int var2 = this.field1528 * 128 + 64;
        int var3 = this.field1529 * 128 + 64;
        int var4 = this.method515(var2, 526, var3, this.field1644) - this.field1530;
        if (this.field1645 < var2) {
            this.field1645 += (var2 - this.field1645) * this.field1532 / 1000 + this.field1531;
            if (this.field1645 > var2) {
                this.field1645 = var2;
            }
        }
        if (this.field1645 > var2) {
            this.field1645 -= (this.field1645 - var2) * this.field1532 / 1000 + this.field1531;
            if (this.field1645 < var2) {
                this.field1645 = var2;
            }
        }
        if (this.field1646 < var4) {
            this.field1646 += (var4 - this.field1646) * this.field1532 / 1000 + this.field1531;
            if (this.field1646 > var4) {
                this.field1646 = var4;
            }
        }
        if (this.field1646 > var4) {
            this.field1646 -= (this.field1646 - var4) * this.field1532 / 1000 + this.field1531;
            if (this.field1646 < var4) {
                this.field1646 = var4;
            }
        }
        if (this.field1647 < var3) {
            this.field1647 += (var3 - this.field1647) * this.field1532 / 1000 + this.field1531;
            if (this.field1647 > var3) {
                this.field1647 = var3;
            }
        }
        if (this.field1647 > var3) {
            this.field1647 -= (this.field1647 - var3) * this.field1532 / 1000 + this.field1531;
            if (this.field1647 < var3) {
                this.field1647 = var3;
            }
        }
        int var5 = this.field1282 * 128 + 64;
        int var6 = this.field1283 * 128 + 64;
        this.field1666 += arg0;
        int var7 = this.method515(var5, 526, var6, this.field1644) - this.field1284;
        int var8 = var5 - this.field1645;
        int var9 = var7 - this.field1646;
        int var10 = var6 - this.field1647;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1648 < var12) {
            this.field1648 += (var12 - this.field1648) * this.field1286 / 1000 + this.field1285;
            if (this.field1648 > var12) {
                this.field1648 = var12;
            }
        }
        if (this.field1648 > var12) {
            this.field1648 -= (this.field1648 - var12) * this.field1286 / 1000 + this.field1285;
            if (this.field1648 < var12) {
                this.field1648 = var12;
            }
        }
        int var14 = var13 - this.field1649;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1649 += this.field1286 * var14 / 1000 + this.field1285;
            this.field1649 &= 2047;
        }
        if (var14 < 0) {
            this.field1649 -= -var14 * this.field1286 / 1000 + this.field1285;
            this.field1649 &= 2047;
        }
        int var15 = var13 - this.field1649;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1649 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method513(int arg0) {
        this.field1533 = true;
        this.field1666 += arg0;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1591[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1112; ++var3) {
                if (!IdkType.field1113[var3].field1119 && IdkType.field1113[var3].field1114 == var2 + (this.field1518 ? 0 : 7)) {
                    this.field1591[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method514(int arg0, int arg1) {
        if (arg0 >= 0 && arg0 <= 0) {
            String var2 = String.valueOf(arg1);
            for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            }
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (!this.field1410 && !this.field1527 && !this.field1273) {
            ++field1632;
            if (!this.field1663) {
                this.method428(3, false);
            } else {
                this.method499((byte) 3);
            }
            this.field1266 = 0;
            if (!arg0) {
                ;
            }
        } else {
            this.method446(true);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method515(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1392[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field1578[var7][var5][var6] + this.field1578[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1578[var7][var5][var6 + 1] + this.field1578[var7][var5 + 1][var6 + 1] * var8 >> 7;
            int var12 = 17 / arg1;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method516(int arg0) {
        int var2 = this.field1657;
        int var3 = this.field1658;
        int var4 = this.field1659;
        int var5 = this.field1660;
        int var6 = 6116423;
        Pix2D.method156(var4, var6, 47458, var3, var5, var2);
        int var7 = 41 / arg0;
        Pix2D.method156(var4 - 2, 0, 47458, var3 + 1, 16, var2 + 1);
        Pix2D.method157(var2 + 1, var4 - 2, var5 - 19, 0, var3 + 18, 0);
        this.field1525.method203("Choose Option", var6, var3 + 14, (byte) 110, var2 + 3);
        int var8 = super.field21;
        int var9 = super.field22;
        if (this.field1656 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (this.field1656 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (this.field1656 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < this.field1458; ++var10) {
            int var11 = (this.field1458 - 1 - var10) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            this.field1525.method205(var11, 0, this.field1481[var10], var2 + 3, true, var12);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method517(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else {
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
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://127.0.0.1:" + (field1460 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public static final void method518(byte arg0) {
        World3D.field289 = true;
        Pix3D.field637 = true;
        if (arg0 == -118) {
            field1462 = true;
            World.field44 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method519(int arg0, Pix8 arg1) {
        short var3 = 256;
        if (arg0 <= 0) {
            field1486 = this.field1535.method294();
        }
        for (int var4 = 0; var4 < this.field1389.length; ++var4) {
            this.field1389[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1389[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1390[var16] = (this.field1389[var16 - 1] + this.field1389[var16 + 1] + this.field1389[var16 - 128] + this.field1389[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1389;
            this.field1389 = this.field1390;
            this.field1390 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field678; ++var8) {
                for (int var9 = 0; var9 < arg1.field677; ++var9) {
                    if (arg1.field675[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field679;
                        int var11 = var8 + 16 + arg1.field680;
                        int var12 = (var11 << 7) + var10;
                        this.field1389[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method520(byte arg0) {
        ++field1577;
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.method6();
        }
        if (field1577 > 192) {
            field1577 = 0;
            this.field1377.method217(226, (byte) 5);
            this.field1377.method218(232);
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method5((byte) -60);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field1227 != -1 && this.field1429 == this.field1227) {
                        if (var3 == 8 && this.field1489.length() > 0) {
                            this.field1489 = this.field1489.substring(0, this.field1489.length() - 1);
                        }
                        break;
                    }
                    if (this.field1661) {
                        if (var3 >= 32 && var3 <= 122 && this.field1414.length() < 80) {
                            this.field1414 = this.field1414 + (char) var3;
                            this.field1490 = true;
                        }
                        if (var3 == 8 && this.field1414.length() > 0) {
                            this.field1414 = this.field1414.substring(0, this.field1414.length() - 1);
                            this.field1490 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field1661 = false;
                            this.field1490 = true;
                            if (this.field1537 == 1) {
                                long var4 = JString.method299(this.field1414);
                                this.method431(var4, false);
                            }
                            if (this.field1537 == 2 && this.field1626 > 0) {
                                long var6 = JString.method299(this.field1414);
                                this.method443((byte) 8, var6);
                            }
                            if (this.field1537 == 3 && this.field1414.length() > 0) {
                                this.field1377.method217(214, (byte) 5);
                                this.field1377.method218(0);
                                int var8 = this.field1377.field714;
                                this.field1377.method224(this.field1556, -25114);
                                WordPack.method307(false, this.field1414, this.field1377);
                                this.field1377.method227((byte) 39, this.field1377.field714 - var8);
                                this.field1414 = JString.method304(this.field1414, (byte) 4);
                                this.field1414 = WordFilter.method398((byte) -1, this.field1414);
                                this.method539(this.field1414, JString.method303(JString.method300(586, this.field1556), 8), (byte) 6, 6);
                                if (this.field1678 == 2) {
                                    this.field1678 = 1;
                                    this.field1387 = true;
                                    this.field1377.method217(129, (byte) 5);
                                    this.field1377.method218(this.field1329);
                                    this.field1377.method218(this.field1678);
                                    this.field1377.method218(this.field1375);
                                }
                            }
                            if (this.field1537 == 4 && this.field1509 < 100) {
                                long var9 = JString.method299(this.field1414);
                                this.method460(var9, 0);
                            }
                            if (this.field1537 == 5 && this.field1509 > 0) {
                                long var11 = JString.method299(this.field1414);
                                this.method472((byte) 3, var11);
                            }
                        }
                    } else if (this.field1516) {
                        if (var3 >= 48 && var3 <= 57 && this.field1638.length() < 10) {
                            this.field1638 = this.field1638 + (char) var3;
                            this.field1490 = true;
                        }
                        if (var3 == 8 && this.field1638.length() > 0) {
                            this.field1638 = this.field1638.substring(0, this.field1638.length() - 1);
                            this.field1490 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field1638.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field1638);
                                } catch (Exception var18) {
                                }
                                this.field1377.method217(161, (byte) 5);
                                this.field1377.method222(var13);
                            }
                            this.field1516 = false;
                            this.field1490 = true;
                        }
                    } else if (this.field1276 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field1555.length() < 80) {
                            this.field1555 = this.field1555 + (char) var3;
                            this.field1490 = true;
                        }
                        if (var3 == 8 && this.field1555.length() > 0) {
                            this.field1555 = this.field1555.substring(0, this.field1555.length() - 1);
                            this.field1490 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field1555.length() > 0) {
                            if (this.field1617 == 2) {
                                if (this.field1555.equals("::clientdrop")) {
                                    this.method449(-332);
                                }
                                if (this.field1555.equals("::lag")) {
                                    this.method447(-747);
                                }
                                if (this.field1555.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field1480.method271(73, 2); ++var14) {
                                        this.field1480.method281(var14, (byte) 1, true, 2);
                                    }
                                }
                            }
                            if (this.field1555.startsWith("::")) {
                                this.field1377.method217(86, (byte) 5);
                                this.field1377.method218(this.field1555.length() - 1);
                                this.field1377.method225(this.field1555.substring(2));
                            } else {
                                byte var15 = 0;
                                if (this.field1555.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                if (this.field1555.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1555 = this.field1555.substring(4);
                                }
                                if (this.field1555.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1555 = this.field1555.substring(6);
                                }
                                if (this.field1555.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1555 = this.field1555.substring(5);
                                }
                                if (this.field1555.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                if (this.field1555.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1555 = this.field1555.substring(6);
                                }
                                if (this.field1555.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                if (this.field1555.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                if (this.field1555.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                if (this.field1555.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1555 = this.field1555.substring(6);
                                }
                                if (this.field1555.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1555 = this.field1555.substring(6);
                                }
                                if (this.field1555.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1555 = this.field1555.substring(6);
                                }
                                byte var16 = 0;
                                if (this.field1555.startsWith("wave:")) {
                                    var16 = 1;
                                    this.field1555 = this.field1555.substring(5);
                                }
                                if (this.field1555.startsWith("scroll:")) {
                                    var16 = 2;
                                    this.field1555 = this.field1555.substring(7);
                                }
                                this.field1377.method217(83, (byte) 5);
                                this.field1377.method218(0);
                                int var17 = this.field1377.field714;
                                this.field1377.method218(var15);
                                this.field1377.method218(var16);
                                WordPack.method307(false, this.field1555, this.field1377);
                                this.field1377.method227((byte) 39, this.field1377.field714 - var17);
                                this.field1555 = JString.method304(this.field1555, (byte) 4);
                                this.field1555 = WordFilter.method398((byte) -1, this.field1555);
                                field1569.field412 = this.field1555;
                                field1569.field414 = var15;
                                field1569.field415 = var16;
                                field1569.field413 = 150;
                                if (this.field1617 == 2) {
                                    this.method539(field1569.field412, "@cr2@" + field1569.field462, (byte) 6, 2);
                                } else if (this.field1617 == 1) {
                                    this.method539(field1569.field412, "@cr1@" + field1569.field462, (byte) 6, 2);
                                } else {
                                    this.method539(field1569.field412, field1569.field462, (byte) 6, 2);
                                }
                                if (this.field1329 == 2) {
                                    this.field1329 = 3;
                                    this.field1387 = true;
                                    this.field1377.method217(129, (byte) 5);
                                    this.field1377.method218(this.field1329);
                                    this.field1377.method218(this.field1678);
                                    this.field1377.method218(this.field1375);
                                }
                            }
                            this.field1555 = "";
                            this.field1490 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field1489.length() < 12) {
                this.field1489 = this.field1489 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method521(byte arg0) {
        ++this.field1515;
        this.method551((byte) 30, true);
        this.method555(true, (byte) 9);
        this.method551((byte) 30, false);
        this.method555(false, (byte) 9);
        this.method510(4);
        this.method467(false);
        if (!this.field1348) {
            int var2 = this.field1519;
            if (this.field1388 / 256 > var2) {
                var2 = this.field1388 / 256;
            }
            if (this.field1624[4] && this.field1344[4] + 128 > var2) {
                var2 = this.field1344[4] + 128;
            }
            int var3 = this.field1520 + this.field1412 & 2047;
            this.method501(this.field1384, var3, this.method515(field1569.field400, 526, field1569.field401, this.field1644) - 50, this.field1383, 2, var2 * 3 + 600, var2);
        }
        int var4;
        if (!this.field1348) {
            var4 = this.method502(9);
        } else {
            var4 = this.method503(false);
        }
        int var5 = this.field1645;
        int var6 = this.field1646;
        int var7 = this.field1647;
        int var8 = this.field1648;
        int var9 = this.field1649;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1624[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1330[var10] * 2 + 1) - (double) this.field1330[var10] + Math.sin((double) this.field1258[var10] / 100.0D * (double) this.field1453[var10]) * (double) this.field1344[var10]);
                if (var10 == 0) {
                    this.field1645 += var12;
                }
                if (var10 == 1) {
                    this.field1646 += var12;
                }
                if (var10 == 2) {
                    this.field1647 += var12;
                }
                if (var10 == 3) {
                    this.field1649 = this.field1649 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1648 += var12;
                    if (this.field1648 < 128) {
                        this.field1648 = 128;
                    }
                    if (this.field1648 > 383) {
                        this.field1648 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field657;
        Model.field598 = true;
        Model.field601 = 0;
        Model.field599 = super.field21 - 4;
        Model.field600 = super.field22 - 4;
        Pix2D.method154(this.field1580);
        this.field1463.method89(true, this.field1647, this.field1645, this.field1646, this.field1648, var4, this.field1649);
        if (arg0 != 81) {
            field1475 = !field1475;
        }
        this.field1463.method64(this.field1275);
        this.method526((byte) -34);
        this.method442(9);
        this.method528(var11, this.field1334);
        this.method448(true);
        this.field1583.method258(4, -740, super.field13, 4);
        this.field1645 = var5;
        this.field1646 = var6;
        this.field1647 = var7;
        this.field1648 = var8;
        this.field1649 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILmb;Lab;)V")
    private final void method522(int arg0, int arg1, int arg2, Packet arg3, PlayerEntity arg4) {
        if (arg2 <= 0) {
            this.field1428 = -287;
        }
        if ((arg1 & 1) == 1) {
            int var6 = arg3.method228();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(var7, true);
            arg3.method237(var6, true, 0, var7);
            this.field1314[arg0] = var8;
            arg4.method116(var8, -25120);
        }
        if ((arg1 & 2) == 2) {
            int var9 = arg3.method230();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field428 == var9) {
                arg4.field432 = 0;
            }
            int var10 = arg3.method228();
            if (arg4.field428 == var9 && var9 != -1) {
                int var11 = SeqType.field1136[var9].field1150;
                if (var11 == 1) {
                    arg4.field429 = 0;
                    arg4.field430 = 0;
                    arg4.field431 = var10;
                    arg4.field432 = 0;
                }
                if (var11 == 2) {
                    arg4.field432 = 0;
                }
            } else if (var9 == -1 || arg4.field428 == -1 || SeqType.field1136[var9].field1144 >= SeqType.field1136[arg4.field428].field1144) {
                arg4.field428 = var9;
                arg4.field429 = 0;
                arg4.field430 = 0;
                arg4.field431 = var10;
                arg4.field432 = 0;
                arg4.field454 = arg4.field449;
            }
        }
        if ((arg1 & 4) == 4) {
            arg4.field422 = arg3.method230();
            if (arg4.field422 == 65535) {
                arg4.field422 = -1;
            }
        }
        if ((arg1 & 8) == 8) {
            arg4.field412 = arg3.method235();
            arg4.field414 = 0;
            arg4.field415 = 0;
            arg4.field413 = 150;
            this.method539(arg4.field412, arg4.field462, (byte) 6, 2);
        }
        if ((arg1 & 16) == 16) {
            int var12 = arg3.method228();
            int var13 = arg3.method228();
            arg4.method114(14691, field1223, var12, var13);
            arg4.field419 = field1223 + 300;
            arg4.field420 = arg3.method228();
            arg4.field421 = arg3.method228();
        }
        if ((arg1 & 32) == 32) {
            arg4.field423 = arg3.method230();
            arg4.field424 = arg3.method230();
        }
        if ((arg1 & 64) == 64) {
            int var14 = arg3.method230();
            int var15 = arg3.method228();
            int var16 = arg3.method228();
            int var17 = arg3.field714;
            if (arg4.field462 != null && arg4.field463) {
                long var18 = JString.method299(arg4.field462);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1509; ++var21) {
                        if (this.field1358[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1316 == 0) {
                    try {
                        String var22 = WordPack.method306(false, arg3, var16);
                        String var23 = WordFilter.method398((byte) -1, var22);
                        arg4.field412 = var23;
                        arg4.field414 = var14 >> 8;
                        arg4.field415 = var14 & 255;
                        arg4.field413 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method539(var23, "@cr1@" + arg4.field462, (byte) 6, 1);
                            } else {
                                this.method539(var23, arg4.field462, (byte) 6, 2);
                            }
                        } else {
                            this.method539(var23, "@cr2@" + arg4.field462, (byte) 6, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field714 = var16 + var17;
        }
        if ((arg1 & 256) == 256) {
            arg4.field433 = arg3.method230();
            int var25 = arg3.method233();
            arg4.field437 = var25 >> 16;
            arg4.field436 = (var25 & 65535) + field1223;
            arg4.field434 = 0;
            arg4.field435 = 0;
            if (arg4.field436 > field1223) {
                arg4.field434 = -1;
            }
            if (arg4.field433 == 65535) {
                arg4.field433 = -1;
            }
        }
        if ((arg1 & 512) == 512) {
            arg4.field438 = arg3.method228();
            arg4.field440 = arg3.method228();
            arg4.field439 = arg3.method228();
            arg4.field441 = arg3.method228();
            arg4.field442 = arg3.method230() + field1223;
            arg4.field443 = arg3.method230() + field1223;
            arg4.field444 = arg3.method228();
            arg4.method112(-47205);
        }
        if ((arg1 & 1024) == 1024) {
            int var26 = arg3.method228();
            int var27 = arg3.method228();
            arg4.method114(14691, field1223, var26, var27);
            arg4.field419 = field1223 + 300;
            arg4.field420 = arg3.method228();
            arg4.field421 = arg3.method228();
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1415) {
            this.method556(-736);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method523(int arg0) {
        LocType.field991.method103();
        LocType.field992.method103();
        NpcType.field1033.method103();
        ObjType.field1082.method103();
        if (this.field1305 != arg0) {
            this.method6();
        }
        ObjType.field1083.method103();
        PlayerEntity.field484.method103();
        SpotAnimType.field1170.method103();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method524(Component arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            this.field1667 = this.field1376.method228();
        }
        int var3 = arg0.field83;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1481[this.field1458] = "Remove @whi@" + arg0.field115;
                this.field1370[this.field1458] = 884;
                ++this.field1458;
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
            this.field1481[this.field1458] = "Remove @whi@" + this.field1559[var3];
            this.field1370[this.field1458] = 513;
            ++this.field1458;
            this.field1481[this.field1458] = "Message @whi@" + this.field1559[var3];
            this.field1370[this.field1458] = 902;
            ++this.field1458;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method525(int arg0) {
        this.field1432 = new Pix8(this.field1497, "titlebox", 0);
        this.field1433 = new Pix8(this.field1497, "titlebutton", 0);
        this.field1298 = new Pix8[12];
        if (arg0 != 29758) {
            this.field1667 = this.field1376.method228();
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1298[var2] = new Pix8(this.field1497, "runes", var2);
        }
        this.field1551 = new Pix32(128, 265);
        this.field1552 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1551.field664[var3] = this.field1541.field755[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1552.field664[var4] = this.field1542.field755[var4];
        }
        this.field1651 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1651[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1651[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1651[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1651[var8 + 192] = 16777215;
        }
        this.field1652 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1652[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1652[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1652[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1652[var12 + 192] = 16777215;
        }
        this.field1653 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1653[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1653[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1653[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1653[var16 + 192] = 16777215;
        }
        this.field1650 = new int[256];
        this.field1389 = new int[32768];
        this.field1390 = new int[32768];
        this.method519(606, (Pix8) null);
        this.field1361 = new int[32768];
        this.field1362 = new int[32768];
        this.method13(10, "Connecting to fileserver", 7);
        if (!this.field1315) {
            this.field1415 = true;
            this.field1315 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method526(byte arg0) {
        this.field1245 = 0;
        for (int var2 = -1; var2 < this.field1310 + this.field1260; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1569;
            } else if (var2 < this.field1310) {
                var17 = this.field1309[this.field1311[var2]];
            } else {
                var17 = this.field1259[this.field1261[var2 - this.field1310]];
            }
            if (var17 != null && var17.method113(false)) {
                if (var2 >= this.field1310) {
                    NpcType var21 = ((NpcEntity) var17).field458;
                    if (var21.field1031 >= 0 && var21.field1031 < this.field1279.length) {
                        this.method432((byte) -105, var17, var17.field446 + 15);
                        if (this.field1600 > -1) {
                            this.field1279[var21.field1031].method185((byte) 0, this.field1600 - 12, this.field1601 - 30);
                        }
                    }
                    if (this.field1232 == 1 && this.field1261[var2 - this.field1310] == this.field1642 && field1223 % 20 < 10) {
                        this.method432((byte) -105, var17, var17.field446 + 15);
                        if (this.field1600 > -1) {
                            this.field1279[2].method185((byte) 0, this.field1600 - 12, this.field1601 - 28);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field465 != 0) {
                        this.method432((byte) -105, var17, var17.field446 + 15);
                        if (this.field1600 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field465 & 1 << var20) != 0) {
                                    this.field1279[var20].method185((byte) 0, this.field1600 - 12, this.field1601 - var18);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1232 == 10 && this.field1311[var2] == this.field1606) {
                        this.method432((byte) -105, var17, var17.field446 + 15);
                        if (this.field1600 > -1) {
                            this.field1279[7].method185((byte) 0, this.field1600 - 12, this.field1601 - var18);
                        }
                    }
                }
                if (var17.field412 != null && (var2 >= this.field1310 || this.field1329 == 0 || this.field1329 == 3 || this.field1329 == 1 && this.method455(-983, ((PlayerEntity) var17).field462))) {
                    this.method432((byte) -105, var17, var17.field446);
                    if (this.field1600 > -1 && this.field1245 < this.field1246) {
                        this.field1250[this.field1245] = this.field1525.method202(false, var17.field412) / 2;
                        this.field1249[this.field1245] = this.field1525.field692;
                        this.field1247[this.field1245] = this.field1600;
                        this.field1248[this.field1245] = this.field1601;
                        this.field1251[this.field1245] = var17.field414;
                        this.field1252[this.field1245] = var17.field415;
                        this.field1253[this.field1245] = var17.field413;
                        this.field1254[this.field1245++] = var17.field412;
                        if (this.field1400 == 0 && var17.field415 == 1) {
                            this.field1249[this.field1245] += 10;
                            this.field1248[this.field1245] += 5;
                        }
                        if (this.field1400 == 0 && var17.field415 == 2) {
                            this.field1250[this.field1245] = 60;
                        }
                    }
                }
                if (var17.field419 > field1223) {
                    this.method432((byte) -105, var17, var17.field446 + 15);
                    if (this.field1600 > -1) {
                        int var22 = var17.field420 * 30 / var17.field421;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method156(var22, 65280, 47458, this.field1601 - 3, 5, this.field1600 - 15);
                        Pix2D.method156(30 - var22, 16711680, 47458, this.field1601 - 3, 5, this.field1600 - 15 + var22);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field418[var23] > field1223) {
                        this.method432((byte) -105, var17, var17.field446 / 2);
                        if (this.field1600 > -1) {
                            if (var23 == 1) {
                                this.field1601 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1600 -= 15;
                                this.field1601 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1600 += 15;
                                this.field1601 -= 10;
                            }
                            this.field1633[var17.field417[var23]].method185((byte) 0, this.field1600 - 12, this.field1601 - 12);
                            this.field1523.method200(-544, this.field1601 + 4, this.field1600, String.valueOf(var17.field416[var23]), 0);
                            this.field1523.method200(-544, this.field1601 + 3, this.field1600 - 1, String.valueOf(var17.field416[var23]), 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1245; ++var3) {
            int var4 = this.field1247[var3];
            int var5 = this.field1248[var3];
            int var6 = this.field1250[var3];
            int var7 = this.field1249[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1248[var16] - this.field1249[var16] && var5 - var7 < this.field1248[var16] + 2 && var4 - var6 < this.field1250[var16] + this.field1247[var16] && var4 + var6 > this.field1247[var16] - this.field1250[var16] && this.field1248[var16] - this.field1249[var16] < var5) {
                        var5 = this.field1248[var16] - this.field1249[var16];
                        var8 = true;
                    }
                }
            }
            this.field1600 = this.field1247[var3];
            this.field1601 = this.field1248[var3] = var5;
            String var9 = this.field1254[var3];
            if (this.field1400 == 0) {
                int var10 = 16776960;
                if (this.field1251[var3] < 6) {
                    var10 = this.field1472[this.field1251[var3]];
                }
                if (this.field1251[var3] == 6) {
                    var10 = this.field1515 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1251[var3] == 7) {
                    var10 = this.field1515 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1251[var3] == 8) {
                    var10 = this.field1515 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1251[var3] == 9) {
                    int var11 = 150 - this.field1253[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1251[var3] == 10) {
                    int var12 = 150 - this.field1253[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1251[var3] == 11) {
                    int var13 = 150 - this.field1253[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1252[var3] == 0) {
                    this.field1525.method200(-544, this.field1601 + 1, this.field1600, var9, 0);
                    this.field1525.method200(-544, this.field1601, this.field1600, var9, var10);
                }
                if (this.field1252[var3] == 1) {
                    this.field1525.method204(var9, -794, this.field1600, this.field1515, this.field1601 + 1, 0);
                    this.field1525.method204(var9, -794, this.field1600, this.field1515, this.field1601, var10);
                }
                if (this.field1252[var3] == 2) {
                    int var14 = this.field1525.method202(false, var9);
                    int var15 = (150 - this.field1253[var3]) * (var14 + 100) / 150;
                    Pix2D.method153(334, 0, 0, this.field1600 - 50, this.field1600 + 50);
                    this.field1525.method203(var9, 0, this.field1601 + 1, (byte) 110, this.field1600 + 50 - var15);
                    this.field1525.method203(var9, var10, this.field1601, (byte) 110, this.field1600 + 50 - var15);
                    Pix2D.method152(0);
                }
            } else {
                this.field1525.method200(-544, this.field1601 + 1, this.field1600, var9, 0);
                this.field1525.method200(-544, this.field1601, this.field1600, var9, 16776960);
            }
        }
        if (arg0 != -34) {
            this.field1667 = this.field1376.method228();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IZ)V")
    private final void method527(Packet arg0, int arg1, boolean arg2) {
        int var4 = arg0.method239(8, this.field1395);
        if (var4 < this.field1310) {
            for (int var5 = var4; var5 < this.field1310; ++var5) {
                this.field1483[this.field1482++] = this.field1311[var5];
            }
        }
        if (var4 > this.field1310) {
            signlink.reporterror(this.field1293 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1310 = 0;
            if (arg2) {
                this.field1272 = null;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1311[var6];
                PlayerEntity var8 = this.field1309[var7];
                int var9 = arg0.method239(1, this.field1395);
                if (var9 == 0) {
                    this.field1311[this.field1310++] = var7;
                    var8.field445 = field1223;
                } else {
                    int var10 = arg0.method239(2, this.field1395);
                    if (var10 == 0) {
                        this.field1311[this.field1310++] = var7;
                        var8.field445 = field1223;
                        this.field1313[this.field1312++] = var7;
                    } else if (var10 == 1) {
                        this.field1311[this.field1310++] = var7;
                        var8.field445 = field1223;
                        int var11 = arg0.method239(3, this.field1395);
                        var8.method111(var11, false, -116);
                        int var12 = arg0.method239(1, this.field1395);
                        if (var12 == 1) {
                            this.field1313[this.field1312++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1311[this.field1310++] = var7;
                        var8.field445 = field1223;
                        int var13 = arg0.method239(3, this.field1395);
                        var8.method111(var13, true, -116);
                        int var14 = arg0.method239(3, this.field1395);
                        var8.method111(var14, true, -116);
                        int var15 = arg0.method239(1, this.field1395);
                        if (var15 == 1) {
                            this.field1313[this.field1312++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1483[this.field1482++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 == 0) {
            this.field1394 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IZ)V")
    public final void method528(int arg0, boolean arg1) {
        if (!arg1) {
            if (!field1462) {
                if (Pix3D.field656[17] >= arg0) {
                    Pix8 var3 = Pix3D.field650[17];
                    int var4 = var3.field678 * var3.field677 - 1;
                    int var5 = this.field1347 * var3.field677 * 2;
                    byte[] var6 = var3.field675;
                    byte[] var7 = this.field1457;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field675 = var7;
                    this.field1457 = var6;
                    Pix3D.method170(17, -477);
                }
                if (Pix3D.field656[24] >= arg0) {
                    Pix8 var9 = Pix3D.field650[24];
                    int var10 = var9.field678 * var9.field677 - 1;
                    int var11 = this.field1347 * var9.field677 * 2;
                    byte[] var12 = var9.field675;
                    byte[] var13 = this.field1457;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field675 = var13;
                    this.field1457 = var12;
                    Pix3D.method170(24, -477);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    private final void method529(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
            if (this.field1492 == 2) {
                for (LocSpawned var3 = (LocSpawned) this.field1607.method247(); var3 != null; var3 = (LocSpawned) this.field1607.method249(633)) {
                    if (var3.field743 > 0) {
                        --var3.field743;
                    }
                    if (var3.field743 == 0) {
                        if (var3.field736 < 0 || World.method30(true, var3.field736, var3.field738)) {
                            this.method553(var3.field735, 185, var3.field733, var3.field734, var3.field732, var3.field737, var3.field738, var3.field736);
                            var3.method106();
                        }
                    } else {
                        if (var3.field742 > 0) {
                            --var3.field742;
                        }
                        if (var3.field742 == 0 && var3.field734 >= 1 && var3.field735 >= 1 && var3.field734 <= 102 && var3.field735 <= 102 && (var3.field739 < 0 || World.method30(true, var3.field739, var3.field741))) {
                            this.method553(var3.field735, 185, var3.field733, var3.field734, var3.field732, var3.field740, var3.field741, var3.field739);
                            var3.field742 = -1;
                            if (var3.field739 == var3.field736 && var3.field736 == -1) {
                                var3.method106();
                            } else if (var3.field739 == var3.field736 && var3.field740 == var3.field737 && var3.field741 == var3.field738) {
                                var3.method106();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field1569.field400 + this.field1299;
            int var4 = field1569.field401 + this.field1634;
            if (this.field1383 - var3 < -500 || this.field1383 - var3 > 500 || this.field1384 - var4 < -500 || this.field1384 - var4 > 500) {
                this.field1383 = var3;
                this.field1384 = var4;
            }
            if (this.field1383 != var3) {
                this.field1383 += (var3 - this.field1383) / 16;
            }
            if (this.field1384 != var4) {
                this.field1384 += (var4 - this.field1384) / 16;
            }
            if (super.field31[1] == 1) {
                this.field1521 += (-24 - this.field1521) / 2;
            } else if (super.field31[2] == 1) {
                this.field1521 += (24 - this.field1521) / 2;
            } else {
                this.field1521 /= 2;
            }
            if (super.field31[3] == 1) {
                this.field1522 += (12 - this.field1522) / 2;
            } else if (super.field31[4] == 1) {
                this.field1522 += (-12 - this.field1522) / 2;
            } else {
                this.field1522 /= 2;
            }
            this.field1520 = this.field1521 / 2 + this.field1520 & 2047;
            this.field1519 += this.field1522 / 2;
            if (this.field1519 < 128) {
                this.field1519 = 128;
            }
            if (this.field1519 > 383) {
                this.field1519 = 383;
            }
            int var5 = this.field1383 >> 7;
            int var6 = this.field1384 >> 7;
            int var7 = this.method515(this.field1383, 526, this.field1384, this.field1644);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field1644;
                        if (var11 < 3 && (this.field1392[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field1578[var11][var9][var10];
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
            if (var13 > this.field1388) {
                this.field1388 += (var13 - this.field1388) / 24;
            } else if (var13 < this.field1388) {
                this.field1388 += (var13 - this.field1388) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field1569.field400 + "," + field1569.field401 + "," + this.field1383 + "," + this.field1384 + "," + this.field1476 + "," + this.field1477 + "," + this.field1593 + "," + this.field1594);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZLd;ZIII)V")
    public final void method531(int arg0, int arg1, int arg2, boolean arg3, Component arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (this.field1289) {
            this.field1562 = 32;
        } else {
            this.field1562 = 0;
        }
        this.field1289 = false;
        if (arg3) {
            this.method6();
        }
        if (arg1 >= arg2 && arg1 < arg2 + 16 && arg7 >= arg0 && arg7 < arg0 + 16) {
            arg4.field94 -= this.field1266 * 4;
            if (arg5) {
                this.field1602 = true;
                return;
            }
        } else if (arg1 >= arg2 && arg1 < arg2 + 16 && arg7 >= arg0 + arg6 - 16 && arg7 < arg0 + arg6) {
            arg4.field94 += this.field1266 * 4;
            if (arg5) {
                this.field1602 = true;
                return;
            }
        } else {
            if (arg1 < arg2 - this.field1562 || arg1 >= arg2 + 16 + this.field1562 || arg7 < arg0 + 16 || arg7 >= arg0 + arg6 - 16 || this.field1266 <= 0) {
                return;
            }
            int var10 = (arg6 - 32) * arg6 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg0 - 16 - var10 / 2;
            int var12 = arg6 - 32 - var10;
            arg4.field94 = (arg8 - arg6) * var11 / var12;
            if (arg5) {
                this.field1602 = true;
            }
            this.field1289 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method532(int arg0, int arg1) {
        Component var3 = Component.field74[arg0];
        for (int var4 = 0; var4 < var3.field96.length && var3.field96[var4] != -1; ++var4) {
            Component var5 = Component.field74[var3.field96[var4]];
            if (var5.field81 == 1) {
                this.method532(var5.field79, -925);
            }
            var5.field77 = 0;
            var5.field78 = 0;
        }
        if (arg1 >= 0) {
            this.field1407 = this.field1535.method294();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BI)V")
    public final void method533(boolean arg0, byte[] arg1, int arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method534(boolean arg0) {
        this.field1315 = false;
        while (this.field1491) {
            this.field1315 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1432 = null;
        this.field1433 = null;
        this.field1298 = null;
        this.field1650 = null;
        if (!arg0) {
            this.field1667 = this.field1376.method228();
        }
        this.field1651 = null;
        this.field1652 = null;
        this.field1653 = null;
        this.field1389 = null;
        this.field1390 = null;
        this.field1361 = null;
        this.field1362 = null;
        this.field1551 = null;
        this.field1552 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;BI)I")
    public final int method535(Component arg0, byte arg1, int arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field1580 = 326;
        }
        if (arg0.field89 != null && arg2 < arg0.field89.length) {
            try {
                int[] var5 = arg0.field89[arg2];
                int var6 = 0;
                int var7 = 0;
                byte var8 = 0;
                while (true) {
                    int var9 = var5[var7++];
                    int var10 = 0;
                    byte var11 = 0;
                    if (var9 == 0) {
                        return var6;
                    }
                    if (var9 == 1) {
                        var10 = this.field1280[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field1419[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field1304[var5[var7++]];
                    }
                    if (var9 == 4) {
                        Component var12 = Component.field74[var5[var7++]];
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < ObjType.field1037 && (!ObjType.method345(var13).field1058 || field1461)) {
                            for (int var14 = 0; var14 < var12.field75.length; ++var14) {
                                if (var13 + 1 == var12.field75[var14]) {
                                    var10 += var12.field76[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field1558[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field1281[this.field1419[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field1558[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field1569.field468;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < Stats.field1152; ++var15) {
                            if (Stats.field1154[var15]) {
                                var10 += this.field1419[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        Component var16 = Component.field74[var5[var7++]];
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < ObjType.field1037 && (!ObjType.method345(var17).field1058 || field1461)) {
                            for (int var18 = 0; var18 < var16.field75.length; ++var18) {
                                if (var16.field75[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field1409;
                    }
                    if (var9 == 12) {
                        var10 = this.field1431;
                    }
                    if (var9 == 13) {
                        int var19 = this.field1558[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        VarbitType var22 = VarbitType.field1175[var21];
                        int var23 = var22.field1177;
                        int var24 = var22.field1178;
                        int var25 = var22.field1179;
                        int var26 = field1426[var25 - var24];
                        var10 = this.field1558[var23] >> var24 & var26;
                    }
                    if (var9 == 15) {
                        var11 = 1;
                    }
                    if (var9 == 16) {
                        var11 = 2;
                    }
                    if (var9 == 17) {
                        var11 = 3;
                    }
                    if (var9 == 18) {
                        var10 = (field1569.field400 >> 7) + this.field1593;
                    }
                    if (var9 == 19) {
                        var10 = (field1569.field401 >> 7) + this.field1594;
                    }
                    if (var9 == 20) {
                        var10 = var5[var7++];
                    }
                    if (var11 == 0) {
                        if (var8 == 0) {
                            var6 += var10;
                        }
                        if (var8 == 1) {
                            var6 -= var10;
                        }
                        if (var8 == 2 && var10 != 0) {
                            var6 /= var10;
                        }
                        if (var8 == 3) {
                            var6 *= var10;
                        }
                        var8 = 0;
                    } else {
                        var8 = var11;
                    }
                }
            } catch (Exception var27) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public static final void method536(int arg0) {
        if (arg0 == 4) {
            World3D.field289 = false;
            Pix3D.field637 = false;
            field1462 = false;
            World.field44 = false;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method537(boolean arg0) {
        if (this.field1402 == 0 && this.field1438 == 0) {
            this.field1481[this.field1458] = "Walk here";
            this.field1370[this.field1458] = 718;
            this.field1368[this.field1458] = super.field21;
            this.field1369[this.field1458] = super.field22;
            ++this.field1458;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field601; ++var3) {
            int var4 = Model.field602[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1463.method80(this.field1644, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method329(var8);
                    if (this.field1402 == 1) {
                        this.field1481[this.field1458] = "Use " + this.field1406 + " with @cya@" + var9.field960;
                        this.field1370[this.field1458] = 810;
                        this.field1371[this.field1458] = var4;
                        this.field1368[this.field1458] = var5;
                        this.field1369[this.field1458] = var6;
                        ++this.field1458;
                    } else if (this.field1438 == 1) {
                        if ((this.field1440 & 4) == 4) {
                            this.field1481[this.field1458] = this.field1441 + " @cya@" + var9.field960;
                            this.field1370[this.field1458] = 899;
                            this.field1371[this.field1458] = var4;
                            this.field1368[this.field1458] = var5;
                            this.field1369[this.field1458] = var6;
                            ++this.field1458;
                        }
                    } else {
                        if (var9.field976 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field976[var10] != null) {
                                    this.field1481[this.field1458] = var9.field976[var10] + " @cya@" + var9.field960;
                                    if (var10 == 0) {
                                        this.field1370[this.field1458] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1370[this.field1458] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1370[this.field1458] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1370[this.field1458] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1370[this.field1458] = 1071;
                                    }
                                    this.field1371[this.field1458] = var4;
                                    this.field1368[this.field1458] = var5;
                                    this.field1369[this.field1458] = var6;
                                    ++this.field1458;
                                }
                            }
                        }
                        this.field1481[this.field1458] = "Examine @cya@" + var9.field960;
                        this.field1370[this.field1458] = 1381;
                        this.field1371[this.field1458] = var4;
                        this.field1368[this.field1458] = var5;
                        this.field1369[this.field1458] = var6;
                        ++this.field1458;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1259[var8];
                    if (var11.field458.field1010 == 1 && (var11.field400 & 127) == 64 && (var11.field401 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1260; ++var12) {
                            NpcEntity var15 = this.field1259[this.field1261[var12]];
                            if (var15 != null && var11 != var15 && var15.field458.field1010 == 1 && var11.field400 == var15.field400 && var11.field401 == var15.field401) {
                                this.method489(var15.field458, this.field1261[var12], var6, this.field1570, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1310; ++var13) {
                            PlayerEntity var14 = this.field1309[this.field1311[var13]];
                            if (var14 != null && var11.field400 == var14.field400 && var11.field401 == var14.field401) {
                                this.method547(26004, var6, var5, this.field1311[var13], var14);
                            }
                        }
                    }
                    this.method489(var11.field458, var8, var6, this.field1570, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1309[var8];
                    if ((var16.field400 & 127) == 64 && (var16.field401 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1260; ++var17) {
                            NpcEntity var20 = this.field1259[this.field1261[var17]];
                            if (var20 != null && var20.field458.field1010 == 1 && var16.field400 == var20.field400 && var16.field401 == var20.field401) {
                                this.method489(var20.field458, this.field1261[var17], var6, this.field1570, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1310; ++var18) {
                            PlayerEntity var19 = this.field1309[this.field1311[var18]];
                            if (var19 != null && var16 != var19 && var16.field400 == var19.field400 && var16.field401 == var19.field401) {
                                this.method547(26004, var6, var5, this.field1311[var18], var19);
                            }
                        }
                    }
                    this.method547(26004, var6, var5, var8, var16);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1272[this.field1644][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method248(-42339); var22 != null; var22 = (ObjStackEntity) var21.method250(false)) {
                            ObjType var23 = ObjType.method345(var22.field498);
                            if (this.field1402 == 1) {
                                this.field1481[this.field1458] = "Use " + this.field1406 + " with @lre@" + var23.field1045;
                                this.field1370[this.field1458] = 111;
                                this.field1371[this.field1458] = var22.field498;
                                this.field1368[this.field1458] = var5;
                                this.field1369[this.field1458] = var6;
                                ++this.field1458;
                            } else if (this.field1438 == 1) {
                                if ((this.field1440 & 1) == 1) {
                                    this.field1481[this.field1458] = this.field1441 + " @lre@" + var23.field1045;
                                    this.field1370[this.field1458] = 370;
                                    this.field1371[this.field1458] = var22.field498;
                                    this.field1368[this.field1458] = var5;
                                    this.field1369[this.field1458] = var6;
                                    ++this.field1458;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1059 != null && var23.field1059[var24] != null) {
                                        this.field1481[this.field1458] = var23.field1059[var24] + " @lre@" + var23.field1045;
                                        if (var24 == 0) {
                                            this.field1370[this.field1458] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1370[this.field1458] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1370[this.field1458] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1370[this.field1458] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1370[this.field1458] = 662;
                                        }
                                        this.field1371[this.field1458] = var22.field498;
                                        this.field1368[this.field1458] = var5;
                                        this.field1369[this.field1458] = var6;
                                        ++this.field1458;
                                    } else if (var24 == 2) {
                                        this.field1481[this.field1458] = "Take @lre@" + var23.field1045;
                                        this.field1370[this.field1458] = 617;
                                        this.field1371[this.field1458] = var22.field498;
                                        this.field1368[this.field1458] = var5;
                                        this.field1369[this.field1458] = var6;
                                        ++this.field1458;
                                    }
                                }
                                this.field1481[this.field1458] = "Examine @lre@" + var23.field1045;
                                this.field1370[this.field1458] = 1152;
                                this.field1371[this.field1458] = var22.field498;
                                this.field1368[this.field1458] = var5;
                                this.field1369[this.field1458] = var6;
                                ++this.field1458;
                            }
                        }
                    }
                }
            }
        }
        this.field1663 &= arg0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method538(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public final void method539(String arg0, String arg1, byte arg2, int arg3) {
        if (arg3 == 0 && this.field1510 != -1) {
            this.field1235 = arg0;
            super.field27 = 0;
        }
        if (this.field1276 == -1) {
            this.field1490 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1341[var5] = this.field1341[var5 - 1];
            this.field1342[var5] = this.field1342[var5 - 1];
            this.field1343[var5] = this.field1343[var5 - 1];
        }
        this.field1341[0] = arg3;
        this.field1342[0] = arg1;
        if (arg2 == 6) {
            this.field1343[0] = arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1463.method80(this.field1644, arg4, arg0, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1364;
            if (field1364 > 1086) {
                field1364 = 0;
                this.field1377.method217(225, (byte) 5);
                this.field1377.method218(0);
                int var10 = this.field1377.field714;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1377.method219(16791);
                }
                this.field1377.method218(254);
                this.field1377.method219((int) (Math.random() * 65536.0D));
                this.field1377.method219(16128);
                this.field1377.method219(52610);
                this.field1377.method219((int) (Math.random() * 65536.0D));
                this.field1377.method219(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1377.method219(35025);
                }
                this.field1377.method219(46628);
                this.field1377.method218((int) (Math.random() * 256.0D));
                this.field1377.method227((byte) 39, this.field1377.field714 - var10);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method437(field1569.field451[0], arg4, false, 0, var8 + 1, field1569.field450[0], arg0, 0, 0, 0, var9, 2);
            } else {
                LocType var11 = LocType.method329(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field965;
                    var13 = var11.field964;
                } else {
                    var12 = var11.field964;
                    var13 = var11.field965;
                }
                int var14 = var11.field987;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method437(field1569.field451[0], arg4, false, var14, 0, field1569.field450[0], arg0, var12, 0, var13, 0, 2);
            }
            this.field1349 = super.field28;
            if (arg1 >= 0) {
                field1475 = !field1475;
            }
            this.field1350 = super.field29;
            this.field1352 = 2;
            this.field1351 = 0;
            this.field1377.method217(arg3, (byte) 5);
            this.field1377.method219(this.field1593 + arg4);
            this.field1377.method219(this.field1594 + arg0);
            this.field1377.method219(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method541(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1377.method218(42);
        }
        while (true) {
            OnDemandRequest var3 = this.field1480.method280();
            if (var3 == null) {
                return;
            }
            if (var3.field727 == 0) {
                Model.method123((byte) -42, var3.field728, var3.field729);
                if ((this.field1480.method276(var3.field728, field1513) & 98) != 0) {
                    this.field1602 = true;
                    if (this.field1276 != -1) {
                        this.field1490 = true;
                    }
                }
            }
            if (var3.field727 == 1 && var3.field729 != null) {
                AnimFrame.method45(6, var3.field729);
            }
            if (var3.field727 == 2 && this.field1449 == var3.field728 && var3.field729 != null) {
                this.method533(this.field1450, var3.field729, 0);
            }
            if (var3.field727 == 3 && this.field1492 == 1) {
                for (int var4 = 0; var4 < this.field1372.length; ++var4) {
                    if (this.field1225[var4] == var3.field728) {
                        this.field1372[var4] = var3.field729;
                        if (var3.field729 == null) {
                            this.field1225[var4] = -1;
                        }
                        break;
                    }
                    if (this.field1226[var4] == var3.field728) {
                        this.field1640[var4] = var3.field729;
                        if (var3.field729 == null) {
                            this.field1226[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field727 == 93 && this.field1480.method275(0, var3.field728)) {
                World.method17(this.field1480, -4, new Packet(var3.field729, true));
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method542(int arg0, int arg1) {
        int[] var3 = this.field1422.field664;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1392[arg0][var24][var6] & 24) == 0) {
                    this.field1463.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1392[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1463.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1422.method180(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1392[arg0][var22][var9] & 24) == 0) {
                    this.method430(arg0, var7, var9, var8, var22, true);
                }
                if (arg0 < 3 && (this.field1392[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method430(arg0 + 1, var7, var9, var8, var22, true);
                }
            }
        }
        this.field1583.method257(0);
        this.field1379 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1463.method79(this.field1644, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method329(var13).field977;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1485[this.field1644].field1095;
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
                        this.field1391[this.field1379] = this.field1234[var14];
                        this.field1380[this.field1379] = var15;
                        this.field1381[this.field1379] = var16;
                        ++this.field1379;
                    }
                }
            }
        }
        if (arg1 != 0) {
            this.method6();
        }
        ++field1398;
        if (field1398 > 112) {
            field1398 = 0;
            this.field1377.method217(4, (byte) 5);
            this.field1377.method218(50);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILd;)V")
    public final void method543(int arg0, boolean arg1, int arg2, int arg3, Component arg4) {
        if (arg4.field81 == 0 && arg4.field96 != null) {
            if (!arg4.field95 || this.field1487 == arg4.field79 || this.field1288 == arg4.field79 || this.field1536 == arg4.field79) {
                int var6 = Pix2D.field626;
                int var7 = Pix2D.field624;
                int var8 = Pix2D.field627;
                int var9 = Pix2D.field625;
                Pix2D.method153(arg4.field85 + arg2, arg2, 0, arg0, arg4.field84 + arg0);
                int var10 = arg4.field96.length;
                if (arg1) {
                    this.field1580 = this.field1535.method294();
                }
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field97[var11] + arg0;
                    int var13 = arg4.field98[var11] + arg2 - arg3;
                    Component var14 = Component.field74[arg4.field96[var11]];
                    int var15 = var14.field87 + var12;
                    int var16 = var14.field88 + var13;
                    if (var14.field83 > 0) {
                        this.method469(-206, var14);
                    }
                    if (var14.field81 == 0) {
                        if (var14.field94 > var14.field93 - var14.field85) {
                            var14.field94 = var14.field93 - var14.field85;
                        }
                        if (var14.field94 < 0) {
                            var14.field94 = 0;
                        }
                        this.method543(var15, false, var16, var14.field94, var14);
                        if (var14.field93 > var14.field85) {
                            this.method508(var14.field84 + var15, var16, var14.field94, var14.field85, var14.field93, (byte) -17);
                        }
                    } else if (var14.field81 != 1) {
                        if (var14.field81 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field85; ++var18) {
                                for (int var19 = 0; var19 < var14.field84; ++var19) {
                                    int var20 = (var14.field105 + 32) * var19 + var15;
                                    int var21 = (var14.field106 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field108[var17];
                                        var21 += var14.field109[var17];
                                    }
                                    if (var14.field75[var17] <= 0) {
                                        if (var14.field107 != null && var17 < 20) {
                                            Pix32 var30 = var14.field107[var17];
                                            if (var30 != null) {
                                                var30.method185((byte) 0, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field75[var17] - 1;
                                        if (var20 > Pix2D.field626 - 32 && var20 < Pix2D.field627 && var21 > Pix2D.field624 - 32 && var21 < Pix2D.field625 || this.field1620 != 0 && this.field1619 == var17) {
                                            int var25 = 0;
                                            if (this.field1402 == 1 && this.field1403 == var17 && this.field1404 == var14.field79) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method351((byte) -7, var25, var24, var14.field76[var17]);
                                            if (var26 != null) {
                                                if (this.field1620 != 0 && this.field1619 == var17 && this.field1618 == var14.field79) {
                                                    var22 = super.field21 - this.field1621;
                                                    var23 = super.field22 - this.field1622;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1382 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method187(var20 + var22, 128, var21 + var23, this.field1565);
                                                    if (var21 + var23 < Pix2D.field624 && arg4.field94 > 0) {
                                                        int var27 = (Pix2D.field624 - var21 - var23) * this.field1347 / 3;
                                                        if (var27 > this.field1347 * 10) {
                                                            var27 = this.field1347 * 10;
                                                        }
                                                        if (var27 > arg4.field94) {
                                                            var27 = arg4.field94;
                                                        }
                                                        arg4.field94 -= var27;
                                                        this.field1622 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field625 && arg4.field94 < arg4.field93 - arg4.field85) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field625) * this.field1347 / 3;
                                                        if (var28 > this.field1347 * 10) {
                                                            var28 = this.field1347 * 10;
                                                        }
                                                        if (var28 > arg4.field93 - arg4.field85 - arg4.field94) {
                                                            var28 = arg4.field93 - arg4.field85 - arg4.field94;
                                                        }
                                                        arg4.field94 += var28;
                                                        this.field1622 -= var28;
                                                    }
                                                } else if (this.field1612 != 0 && this.field1611 == var17 && this.field1610 == var14.field79) {
                                                    var26.method187(var20, 128, var21, this.field1565);
                                                } else {
                                                    var26.method185((byte) 0, var20, var21);
                                                }
                                                if (var26.field669 == 33 || var14.field76[var17] != 1) {
                                                    int var29 = var14.field76[var17];
                                                    this.field1523.method203(method538(var29, true), 0, var21 + 10 + var23, (byte) 110, var20 + 1 + var22);
                                                    this.field1523.method203(method538(var29, true), 16776960, var21 + 9 + var23, (byte) 110, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field81 == 3) {
                            boolean var31 = false;
                            if (this.field1536 == var14.field79 || this.field1288 == var14.field79 || this.field1487 == var14.field79) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method484(var14, this.field1319)) {
                                var32 = var14.field118;
                                if (var31 && var14.field120 != 0) {
                                    var32 = var14.field120;
                                }
                            } else {
                                var32 = var14.field117;
                                if (var31 && var14.field119 != 0) {
                                    var32 = var14.field119;
                                }
                            }
                            if (var14.field86 == 0) {
                                if (var14.field111) {
                                    Pix2D.method156(var14.field84, var32, 47458, var16, var14.field85, var15);
                                } else {
                                    Pix2D.method157(var15, var14.field84, var14.field85, 0, var16, var32);
                                }
                            } else if (var14.field111) {
                                Pix2D.method155(256 - (var14.field86 & 255), var32, 0, var15, var14.field85, var14.field84, var16);
                            } else {
                                Pix2D.method158(var32, false, var16, var14.field84, var14.field85, 256 - (var14.field86 & 255), var15);
                            }
                        } else if (var14.field81 == 4) {
                            PixFont var33 = var14.field114;
                            String var34 = var14.field115;
                            boolean var35 = false;
                            if (this.field1536 == var14.field79 || this.field1288 == var14.field79 || this.field1487 == var14.field79) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method484(var14, this.field1319)) {
                                var36 = var14.field118;
                                if (var35 && var14.field120 != 0) {
                                    var36 = var14.field120;
                                }
                                if (var14.field116.length() > 0) {
                                    var34 = var14.field116;
                                }
                            } else {
                                var36 = var14.field117;
                                if (var35 && var14.field119 != 0) {
                                    var36 = var14.field119;
                                }
                            }
                            if (var14.field82 == 6 && this.field1446) {
                                var34 = "Please wait...";
                                var36 = var14.field117;
                            }
                            if (Pix2D.field622 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field692 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label350: while (true) {
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
                                                                            break label350;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method451(this.method535(var14, (byte) 5, 4), false) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method451(this.method535(var14, (byte) 5, 3), false) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method451(this.method535(var14, (byte) 5, 2), false) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method451(this.method535(var14, (byte) 5, 1), false) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method451(this.method535(var14, (byte) 5, 0), false) + var34.substring(var38 + 2);
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
                                if (var14.field112) {
                                    var33.method201(var14.field84 / 2 + var15, var14.field113, false, var36, var37, var44);
                                } else {
                                    var33.method205(var37, 0, var44, var15, var14.field113, var36);
                                }
                                var37 += var33.field692;
                            }
                        } else if (var14.field81 == 5) {
                            Pix32 var45;
                            if (this.method484(var14, this.field1319)) {
                                var45 = var14.field122;
                            } else {
                                var45 = var14.field121;
                            }
                            if (var45 != null) {
                                var45.method185((byte) 0, var15, var16);
                            }
                        } else if (var14.field81 == 6) {
                            int var46 = Pix3D.field642;
                            int var47 = Pix3D.field643;
                            Pix3D.field642 = var14.field84 / 2 + var15;
                            Pix3D.field643 = var14.field85 / 2 + var16;
                            int var48 = Pix3D.field646[var14.field130] * var14.field129 >> 16;
                            int var49 = Pix3D.field647[var14.field130] * var14.field129 >> 16;
                            boolean var50 = this.method484(var14, this.field1319);
                            int var51;
                            if (var50) {
                                var51 = var14.field128;
                            } else {
                                var51 = var14.field127;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(this.field1469, -1, -1, var50);
                            } else {
                                SeqType var53 = SeqType.field1136[var51];
                                var52 = var14.method34(this.field1469, var53.field1139[var14.field77], var53.field1138[var14.field77], var50);
                            }
                            if (var52 != null) {
                                var52.method145(0, var14.field131, 0, var14.field130, 0, var48, var49);
                            }
                            Pix3D.field642 = var46;
                            Pix3D.field643 = var47;
                        } else if (var14.field81 == 7) {
                            PixFont var54 = var14.field114;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field85; ++var56) {
                                for (int var57 = 0; var57 < var14.field84; ++var57) {
                                    if (var14.field75[var55] > 0) {
                                        ObjType var58 = ObjType.method345(var14.field75[var55] - 1);
                                        String var59 = var58.field1045;
                                        if (var58.field1056 || var14.field76[var55] != 1) {
                                            var59 = var59 + " x" + method514(0, var14.field76[var55]);
                                        }
                                        int var60 = (var14.field105 + 115) * var57 + var15;
                                        int var61 = (var14.field106 + 12) * var56 + var16;
                                        if (var14.field112) {
                                            var54.method201(var14.field84 / 2 + var60, var14.field113, false, var14.field117, var61, var59);
                                        } else {
                                            var54.method205(var61, 0, var59, var60, var14.field113, var14.field117);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method153(var9, var7, 0, var6, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method544(boolean arg0) {
        if (arg0) {
            this.field1272 = null;
        }
        if (this.field1620 == 0) {
            this.field1481[0] = "Cancel";
            this.field1370[0] = 1106;
            this.field1458 = 1;
            this.method454(-661);
            this.field1452 = 0;
            if (super.field21 > 4 && super.field22 > 4 && super.field21 < 516 && super.field22 < 338) {
                if (this.field1227 != -1) {
                    this.method557(Component.field74[this.field1227], 0, 4, this.field1447, super.field22, super.field21, 4);
                } else {
                    this.method537(true);
                }
            }
            if (this.field1487 != this.field1452) {
                this.field1487 = this.field1452;
            }
            this.field1452 = 0;
            if (super.field21 > 553 && super.field22 > 205 && super.field21 < 743 && super.field22 < 466) {
                if (this.field1353 != -1) {
                    this.method557(Component.field74[this.field1353], 0, 205, this.field1447, super.field22, super.field21, 553);
                } else if (this.field1586[this.field1430] != -1) {
                    this.method557(Component.field74[this.field1586[this.field1430]], 0, 205, this.field1447, super.field22, super.field21, 553);
                }
            }
            if (this.field1452 != this.field1288) {
                this.field1602 = true;
                this.field1288 = this.field1452;
            }
            this.field1452 = 0;
            if (super.field21 > 17 && super.field22 > 357 && super.field21 < 496 && super.field22 < 453) {
                if (this.field1276 != -1) {
                    this.method557(Component.field74[this.field1276], 0, 357, this.field1447, super.field22, super.field21, 17);
                } else if (super.field22 < 434 && super.field21 < 426) {
                    this.method452(super.field22 - 357, super.field21 - 17, 2);
                }
            }
            if (this.field1276 != -1 && this.field1536 != this.field1452) {
                this.field1490 = true;
                this.field1536 = this.field1452;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1458 - 1; ++var3) {
                    if (this.field1370[var3] < 1000 && this.field1370[var3 + 1] > 1000) {
                        String var4 = this.field1481[var3];
                        this.field1481[var3] = this.field1481[var3 + 1];
                        this.field1481[var3 + 1] = var4;
                        int var5 = this.field1370[var3];
                        this.field1370[var3] = this.field1370[var3 + 1];
                        this.field1370[var3 + 1] = var5;
                        int var6 = this.field1368[var3];
                        this.field1368[var3] = this.field1368[var3 + 1];
                        this.field1368[var3 + 1] = var6;
                        int var7 = this.field1369[var3];
                        this.field1369[var3] = this.field1369[var3 + 1];
                        this.field1369[var3 + 1] = var7;
                        int var8 = this.field1371[var3];
                        this.field1371[var3] = this.field1371[var3 + 1];
                        this.field1371[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1357 != null) {
                this.field1357.method38();
            }
        } catch (Exception var2) {
        }
        this.field1357 = null;
        this.method509(0);
        if (this.field1271 != null) {
            this.field1271.field995 = false;
        }
        this.field1271 = null;
        this.field1480.method270();
        this.field1480 = null;
        this.field1377 = null;
        this.field1287 = null;
        this.field1376 = null;
        this.field1224 = null;
        this.field1372 = null;
        this.field1640 = null;
        this.field1225 = null;
        this.field1226 = null;
        this.field1578 = null;
        this.field1392 = null;
        this.field1463 = null;
        this.field1485 = null;
        this.field1561 = null;
        this.field1306 = null;
        this.field1603 = null;
        this.field1604 = null;
        this.field1457 = null;
        this.field1581 = null;
        this.field1582 = null;
        this.field1583 = null;
        this.field1584 = null;
        this.field1588 = null;
        this.field1589 = null;
        this.field1590 = null;
        this.field1500 = null;
        this.field1501 = null;
        this.field1502 = null;
        this.field1503 = null;
        this.field1504 = null;
        this.field1505 = null;
        this.field1506 = null;
        this.field1507 = null;
        this.field1508 = null;
        this.field1442 = null;
        this.field1443 = null;
        this.field1444 = null;
        this.field1493 = null;
        this.field1494 = null;
        this.field1495 = null;
        this.field1464 = null;
        this.field1571 = null;
        this.field1572 = null;
        this.field1573 = null;
        this.field1574 = null;
        this.field1575 = null;
        this.field1666 += arg0;
        this.field1237 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field1241 = null;
        this.field1355 = null;
        this.field1633 = null;
        this.field1279 = null;
        this.field1613 = null;
        this.field1337 = null;
        this.field1338 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.field1328 = null;
        this.field1234 = null;
        this.field1417 = null;
        this.field1309 = null;
        this.field1311 = null;
        this.field1313 = null;
        this.field1314 = null;
        this.field1483 = null;
        this.field1259 = null;
        this.field1261 = null;
        this.field1272 = null;
        this.field1607 = null;
        this.field1514 = null;
        this.field1467 = null;
        this.field1368 = null;
        this.field1369 = null;
        this.field1370 = null;
        this.field1371 = null;
        this.field1481 = null;
        this.field1558 = null;
        this.field1380 = null;
        this.field1381 = null;
        this.field1391 = null;
        this.field1422 = null;
        this.field1559 = null;
        this.field1269 = null;
        this.field1434 = null;
        this.field1541 = null;
        this.field1542 = null;
        this.field1538 = null;
        this.field1539 = null;
        this.field1540 = null;
        this.field1543 = null;
        this.field1544 = null;
        this.field1545 = null;
        this.field1546 = null;
        this.method534(true);
        LocType.method328(0);
        NpcType.method338(0);
        ObjType.method344(0);
        FloType.field1098 = null;
        IdkType.field1113 = null;
        Component.field74 = null;
        UnkType.field1121 = null;
        SeqType.field1136 = null;
        SpotAnimType.field1158 = null;
        SpotAnimType.field1170 = null;
        VarpType.field1184 = null;
        super.field14 = null;
        PlayerEntity.field484 = null;
        Pix3D.method163(0);
        World3D.method49(0);
        Model.method121(0);
        AnimFrame.method46(0);
        System.gc();
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method545(int arg0) {
        short var2 = 256;
        if (this.field1366 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1366 > 768) {
                    this.field1650[var3] = this.method487(this.field1651[var3], false, this.field1652[var3], 1024 - this.field1366);
                } else if (this.field1366 > 256) {
                    this.field1650[var3] = this.field1652[var3];
                } else {
                    this.field1650[var3] = this.method487(this.field1652[var3], false, this.field1651[var3], 256 - this.field1366);
                }
            }
        } else if (this.field1367 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1367 > 768) {
                    this.field1650[var4] = this.method487(this.field1651[var4], false, this.field1653[var4], 1024 - this.field1367);
                } else if (this.field1367 > 256) {
                    this.field1650[var4] = this.field1653[var4];
                } else {
                    this.field1650[var4] = this.method487(this.field1653[var4], false, this.field1651[var4], 256 - this.field1367);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1650[var5] = this.field1651[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1541.field755[var6] = this.field1551.field664[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1323[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1361[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1650[var26];
                    int var30 = this.field1541.field755[var8];
                    this.field1541.field755[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1541.method258(0, -740, super.field13, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1542.field755[var10] = this.field1552.field664[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1323[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1361[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1650[var18];
                    int var22 = this.field1542.field755[var16];
                    this.field1542.field755[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 == -41631) {
            this.field1542.method258(0, -740, super.field13, 637);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method546(int arg0, int arg1) {
        LinkList var3 = this.field1272[this.field1644][arg0][arg1];
        if (var3 == null) {
            this.field1463.method71(this.field1644, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method247(); var6 != null; var6 = (ObjStackEntity) var3.method249(633)) {
                ObjType var11 = ObjType.method345(var6.field498);
                int var12 = var11.field1057;
                if (var11.field1056) {
                    var12 = (var6.field499 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method245(false, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method247(); var9 != null; var9 = (ObjStackEntity) var3.method249(633)) {
                if (var5.field498 != var9.field498 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field498 != var9.field498 && var7.field498 != var9.field498 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1463.method57(this.field1644, var5, var7, this.method515(arg0 * 128 + 64, 526, arg1 * 128 + 64, this.field1644), arg1, arg0, this.field1270, var10, var8);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILab;)V")
    public final void method547(int arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg0 != 26004) {
            this.field1428 = 288;
        }
        if (field1569 != arg4) {
            if (this.field1458 < 400) {
                String var6 = arg4.field462 + method517(arg4.field468, field1569.field468, this.field1264) + " (level-" + arg4.field468 + ")";
                if (this.field1402 == 1) {
                    this.field1481[this.field1458] = "Use " + this.field1406 + " with @whi@" + var6;
                    this.field1370[this.field1458] = 275;
                    this.field1371[this.field1458] = arg3;
                    this.field1368[this.field1458] = arg2;
                    this.field1369[this.field1458] = arg1;
                    ++this.field1458;
                } else if (this.field1438 == 1) {
                    if ((this.field1440 & 8) == 8) {
                        this.field1481[this.field1458] = this.field1441 + " @whi@" + var6;
                        this.field1370[this.field1458] = 131;
                        this.field1371[this.field1458] = arg3;
                        this.field1368[this.field1458] = arg2;
                        this.field1369[this.field1458] = arg1;
                        ++this.field1458;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1553[var7] != null) {
                            this.field1481[this.field1458] = this.field1553[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1553[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field468 > field1569.field468) {
                                    var9 = 2000;
                                }
                            } else if (this.field1554[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1370[this.field1458] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1370[this.field1458] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1370[this.field1458] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1370[this.field1458] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1370[this.field1458] = var9 + 185;
                            }
                            this.field1371[this.field1458] = arg3;
                            this.field1368[this.field1458] = arg2;
                            this.field1369[this.field1458] = arg1;
                            ++this.field1458;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1458; ++var8) {
                    if (this.field1370[var8] == 718) {
                        this.field1481[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method548(int arg0) {
        this.field1581.method257(0);
        Pix3D.field648 = this.field1548;
        this.field1442.method198((byte) 0, 0, 0);
        if (this.field1353 != -1) {
            this.method543(0, false, 0, 0, Component.field74[this.field1353]);
        } else if (this.field1586[this.field1430] != -1) {
            this.method543(0, false, 0, 0, Component.field74[this.field1586[this.field1430]]);
        }
        if (this.field1354 && this.field1656 == 1) {
            this.method516(243);
        }
        this.field1581.method258(205, -740, super.field13, 553);
        if (arg0 < 0) {
            this.field1583.method257(0);
            Pix3D.field648 = this.field1549;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)Ljava/lang/String;")
    public final String method549(byte arg0) {
        if (arg0 != 97) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;ZI)V")
    public final void method550(int arg0, Pix32 arg1, boolean arg2, int arg3) {
        int var5 = this.field1566 + this.field1520 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field603[var5];
            int var8 = Model.field604[var5];
            int var9 = var7 * 256 / (this.field1597 + 256);
            int var10 = var8 * 256 / (this.field1597 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            if (arg2) {
                this.method6();
            }
            if (var6 > 2500) {
                arg1.method191(83 - var12 - arg1.field670 / 2 - 4, var11 + 94 - arg1.field669 / 2 + 4, this.field1443, 1);
            } else {
                arg1.method185((byte) 0, var11 + 94 - arg1.field669 / 2 + 4, 83 - var12 - arg1.field670 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method551(byte arg0, boolean arg1) {
        if (arg0 != 30) {
            this.field1667 = -1;
        }
        if (field1569.field400 >> 7 == this.field1420 && field1569.field401 >> 7 == this.field1421) {
            this.field1420 = 0;
            ++field1332;
            if (field1332 > 122) {
                field1332 = 0;
                this.field1377.method217(36, (byte) 5);
                this.field1377.method218(62);
            }
        }
        int var3 = this.field1310;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg1) {
                var5 = field1569;
                var6 = this.field1308 << 14;
            } else {
                var5 = this.field1309[this.field1311[var4]];
                var6 = this.field1311[var4] << 14;
            }
            if (var5 != null && var5.method113(false)) {
                var5.field481 = false;
                if ((field1462 && this.field1310 > 50 || this.field1310 > 200) && !arg1 && var5.field425 == var5.field405) {
                    var5.field481 = true;
                }
                int var7 = var5.field400 >> 7;
                int var8 = var5.field401 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field476 != null && field1223 >= var5.field471 && field1223 < var5.field472) {
                        var5.field481 = false;
                        var5.field470 = this.method515(var5.field400, 526, var5.field401, this.field1644);
                        this.field1463.method62(var5.field400, var5.field402, 6, var5, var5.field470, this.field1644, var5.field401, var6, var5.field479, 60, var5.field480, var5.field478, var5.field477);
                    } else {
                        if ((var5.field400 & 127) == 64 && (var5.field401 & 127) == 64) {
                            if (this.field1417[var7][var8] == this.field1515) {
                                continue;
                            }
                            this.field1417[var7][var8] = this.field1515;
                        }
                        var5.field470 = this.method515(var5.field400, 526, var5.field401, this.field1644);
                        this.field1463.method61(this.field1644, var5.field400, var5, false, var5.field470, var5.field403, var5.field401, var5.field402, 60, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IBI)Lyb;")
    public final Jagfile method552(String arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        if (this.field1215 != arg4) {
            throw new NullPointerException();
        } else {
            byte[] var7 = null;
            int var8 = 5;
            try {
                if (this.field1499[0] != null) {
                    var7 = this.field1499[0].method290((byte) 44, arg1);
                }
            } catch (Exception var29) {
            }
            if (var7 != null) {
                this.field1365.reset();
                this.field1365.update(var7);
                int var9 = (int) this.field1365.getValue();
                if (arg3 != var9) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new Jagfile(var7, 289);
            } else {
                int var11 = 0;
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method13(arg5, "Requesting " + arg2, 7);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method435(arg0 + arg3);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        Packet var17 = new Packet(var16, true);
                        var17.field714 = 3;
                        int var18 = var17.method232() + 6;
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
                                this.method13(arg5, "Loading " + arg2 + " - " + var23 + "%", 7);
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field1499[0] != null) {
                                this.field1499[0].method291(var7, false, arg1, var7.length);
                            }
                        } catch (Exception var28) {
                            this.field1499[0] = null;
                        }
                        if (var7 != null) {
                            this.field1365.reset();
                            this.field1365.update(var7);
                            int var24 = (int) this.field1365.getValue();
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
                                this.method13(arg5, "Game updated - please reload page", 7);
                                var25 = 10;
                            } else {
                                this.method13(arg5, var12 + " - Retrying in " + var25, 7);
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
                return new Jagfile(var7, 289);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 0) {
            this.field1377.method218(142);
        }
        if (arg3 >= 1 && arg0 >= 1 && arg3 <= 102 && arg0 <= 102) {
            if (field1462 && this.field1644 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field1463.method76(arg4, arg3, arg0);
            }
            if (arg2 == 1) {
                var9 = this.field1463.method77(arg3, arg4, this.field1396, arg0);
            }
            if (arg2 == 2) {
                var9 = this.field1463.method78(arg4, arg3, arg0);
            }
            if (arg2 == 3) {
                var9 = this.field1463.method79(arg4, arg3, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field1463.method80(arg4, arg3, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field1463.method67(false, arg4, arg0, arg3);
                    LocType var17 = LocType.method329(var14);
                    if (var17.field966) {
                        this.field1485[arg4].method361(var15, var16, arg3, var17.field967, -463, arg0);
                    }
                }
                if (arg2 == 1) {
                    this.field1463.method68(460, arg4, arg0, arg3);
                }
                if (arg2 == 2) {
                    this.field1463.method69(arg0, (byte) 3, arg4, arg3);
                    LocType var18 = LocType.method329(var14);
                    if (var18.field964 + arg3 > 103 || var18.field964 + arg0 > 103 || var18.field965 + arg3 > 103 || var18.field965 + arg0 > 103) {
                        return;
                    }
                    if (var18.field966) {
                        this.field1485[arg4].method362(arg0, arg3, (byte) 73, var18.field967, var18.field965, var18.field964, var16);
                    }
                }
                if (arg2 == 3) {
                    this.field1463.method70(false, arg0, arg4, arg3);
                    LocType var19 = LocType.method329(var14);
                    if (var19.field966 && var19.field968) {
                        this.field1485[arg4].method364(arg3, 0, arg0);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field1392[1][arg3][arg0] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                World.method31(arg5, arg6, arg4, arg3, (byte) -91, this.field1578, this.field1463, arg0, var20, arg7, this.field1485[arg4]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (arg0 < 0) {
            if (super.field27 == 1) {
                if (super.field28 >= 6 && super.field28 <= 106 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1329 = (this.field1329 + 1) % 4;
                    this.field1387 = true;
                    this.field1490 = true;
                    this.field1377.method217(129, (byte) 5);
                    this.field1377.method218(this.field1329);
                    this.field1377.method218(this.field1678);
                    this.field1377.method218(this.field1375);
                }
                if (super.field28 >= 135 && super.field28 <= 235 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1678 = (this.field1678 + 1) % 3;
                    this.field1387 = true;
                    this.field1490 = true;
                    this.field1377.method217(129, (byte) 5);
                    this.field1377.method218(this.field1329);
                    this.field1377.method218(this.field1678);
                    this.field1377.method218(this.field1375);
                }
                if (super.field28 >= 273 && super.field28 <= 373 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1375 = (this.field1375 + 1) % 3;
                    this.field1387 = true;
                    this.field1490 = true;
                    this.field1377.method217(129, (byte) 5);
                    this.field1377.method218(this.field1329);
                    this.field1377.method218(this.field1678);
                    this.field1377.method218(this.field1375);
                }
                if (super.field28 >= 412 && super.field28 <= 512 && super.field29 >= 467 && super.field29 <= 499) {
                    this.method453(-711);
                    this.field1489 = "";
                    this.field1451 = false;
                    for (int var2 = 0; var2 < Component.field74.length; ++var2) {
                        if (Component.field74[var2] != null && Component.field74[var2].field83 == 600) {
                            this.field1429 = this.field1227 = Component.field74[var2].field80;
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method555(boolean arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1260; ++var4) {
                NpcEntity var5 = this.field1259[this.field1261[var4]];
                int var6 = (this.field1261[var4] << 14) + 536870912;
                if (var5 != null && var5.method113(false) && var5.field458.field1028 == arg0) {
                    int var7 = var5.field400 >> 7;
                    int var8 = var5.field401 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field404 == 1 && (var5.field400 & 127) == 64 && (var5.field401 & 127) == 64) {
                            if (this.field1417[var7][var8] == this.field1515) {
                                continue;
                            }
                            this.field1417[var7][var8] = this.field1515;
                        }
                        this.field1463.method61(this.field1644, var5.field400, var5, false, this.method515(var5.field400, 526, var5.field401, this.field1644), var5.field403, var5.field401, var5.field402, (var5.field404 - 1) * 64 + 60, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method556(int arg0) {
        this.field1491 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1315) {
                ++this.field1550;
                this.method473(9);
                this.method473(9);
                this.method545(-41631);
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
        this.field1491 = false;
        if (arg0 >= 0) {
            this.field1396 = !this.field1396;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIBIII)V")
    public final void method557(Component arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg0.field81 == 0 && arg0.field96 != null && !arg0.field95) {
            if (arg5 >= arg6 && arg4 >= arg2 && arg5 <= arg0.field84 + arg6 && arg4 <= arg0.field85 + arg2) {
                int var8 = arg0.field96.length;
                if (this.field1679 != arg3) {
                    this.method6();
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field97[var9] + arg6;
                    int var11 = arg0.field98[var9] + arg2 - arg1;
                    Component var12 = Component.field74[arg0.field96[var9]];
                    int var13 = var12.field87 + var10;
                    int var14 = var12.field88 + var11;
                    if ((var12.field92 >= 0 || var12.field119 != 0) && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                        if (var12.field92 >= 0) {
                            this.field1452 = var12.field92;
                        } else {
                            this.field1452 = var12.field79;
                        }
                    }
                    if (var12.field81 == 0) {
                        this.method557(var12, var12.field94, var14, this.field1447, arg4, arg5, var13);
                        if (var12.field93 > var12.field85) {
                            this.method531(var14, arg5, var12.field84 + var13, false, var12, true, var12.field85, arg4, var12.field93);
                        }
                    } else {
                        if (var12.field82 == 1 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            boolean var15 = false;
                            if (var12.field83 != 0) {
                                var15 = this.method524(var12, 2);
                            }
                            if (!var15) {
                                this.field1481[this.field1458] = var12.field135;
                                this.field1370[this.field1458] = 231;
                                this.field1369[this.field1458] = var12.field79;
                                ++this.field1458;
                            }
                        }
                        if (var12.field82 == 2 && this.field1438 == 0 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            String var16 = var12.field132;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1481[this.field1458] = var16 + " @gre@" + var12.field133;
                            this.field1370[this.field1458] = 274;
                            this.field1369[this.field1458] = var12.field79;
                            ++this.field1458;
                        }
                        if (var12.field82 == 3 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            this.field1481[this.field1458] = "Close";
                            this.field1370[this.field1458] = 737;
                            this.field1369[this.field1458] = var12.field79;
                            ++this.field1458;
                        }
                        if (var12.field82 == 4 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            this.field1481[this.field1458] = var12.field135;
                            this.field1370[this.field1458] = 435;
                            this.field1369[this.field1458] = var12.field79;
                            ++this.field1458;
                        }
                        if (var12.field82 == 5 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            this.field1481[this.field1458] = var12.field135;
                            this.field1370[this.field1458] = 225;
                            this.field1369[this.field1458] = var12.field79;
                            ++this.field1458;
                        }
                        if (var12.field82 == 6 && !this.field1446 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field84 + var13 && arg4 < var12.field85 + var14) {
                            this.field1481[this.field1458] = var12.field135;
                            this.field1370[this.field1458] = 997;
                            this.field1369[this.field1458] = var12.field79;
                            ++this.field1458;
                        }
                        if (var12.field81 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field85; ++var18) {
                                for (int var19 = 0; var19 < var12.field84; ++var19) {
                                    int var20 = (var12.field105 + 32) * var19 + var13;
                                    int var21 = (var12.field106 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field108[var17];
                                        var21 += var12.field109[var17];
                                    }
                                    if (arg5 >= var20 && arg4 >= var21 && arg5 < var20 + 32 && arg4 < var21 + 32) {
                                        this.field1301 = var17;
                                        this.field1302 = var12.field79;
                                        if (var12.field75[var17] > 0) {
                                            ObjType var22 = ObjType.method345(var12.field75[var17] - 1);
                                            if (this.field1402 == 1 && var12.field102) {
                                                if (this.field1404 != var12.field79 || this.field1403 != var17) {
                                                    this.field1481[this.field1458] = "Use " + this.field1406 + " with @lre@" + var22.field1045;
                                                    this.field1370[this.field1458] = 398;
                                                    this.field1371[this.field1458] = var22.field1043;
                                                    this.field1368[this.field1458] = var17;
                                                    this.field1369[this.field1458] = var12.field79;
                                                    ++this.field1458;
                                                }
                                            } else if (this.field1438 == 1 && var12.field102) {
                                                if ((this.field1440 & 16) == 16) {
                                                    this.field1481[this.field1458] = this.field1441 + " @lre@" + var22.field1045;
                                                    this.field1370[this.field1458] = 563;
                                                    this.field1371[this.field1458] = var22.field1043;
                                                    this.field1368[this.field1458] = var17;
                                                    this.field1369[this.field1458] = var12.field79;
                                                    ++this.field1458;
                                                }
                                            } else {
                                                if (var12.field102) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1060 != null && var22.field1060[var23] != null) {
                                                            this.field1481[this.field1458] = var22.field1060[var23] + " @lre@" + var22.field1045;
                                                            if (var23 == 3) {
                                                                this.field1370[this.field1458] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1370[this.field1458] = 100;
                                                            }
                                                            this.field1371[this.field1458] = var22.field1043;
                                                            this.field1368[this.field1458] = var17;
                                                            this.field1369[this.field1458] = var12.field79;
                                                            ++this.field1458;
                                                        } else if (var23 == 4) {
                                                            this.field1481[this.field1458] = "Drop @lre@" + var22.field1045;
                                                            this.field1370[this.field1458] = 100;
                                                            this.field1371[this.field1458] = var22.field1043;
                                                            this.field1368[this.field1458] = var17;
                                                            this.field1369[this.field1458] = var12.field79;
                                                            ++this.field1458;
                                                        }
                                                    }
                                                }
                                                if (var12.field103) {
                                                    this.field1481[this.field1458] = "Use @lre@" + var22.field1045;
                                                    this.field1370[this.field1458] = 102;
                                                    this.field1371[this.field1458] = var22.field1043;
                                                    this.field1368[this.field1458] = var17;
                                                    this.field1369[this.field1458] = var12.field79;
                                                    ++this.field1458;
                                                }
                                                if (var12.field102 && var22.field1060 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1060[var24] != null) {
                                                            this.field1481[this.field1458] = var22.field1060[var24] + " @lre@" + var22.field1045;
                                                            if (var24 == 0) {
                                                                this.field1370[this.field1458] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1370[this.field1458] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1370[this.field1458] = 795;
                                                            }
                                                            this.field1371[this.field1458] = var22.field1043;
                                                            this.field1368[this.field1458] = var17;
                                                            this.field1369[this.field1458] = var12.field79;
                                                            ++this.field1458;
                                                        }
                                                    }
                                                }
                                                if (var12.field110 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field110[var25] != null) {
                                                            this.field1481[this.field1458] = var12.field110[var25] + " @lre@" + var22.field1045;
                                                            if (var25 == 0) {
                                                                this.field1370[this.field1458] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1370[this.field1458] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1370[this.field1458] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1370[this.field1458] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1370[this.field1458] = 354;
                                                            }
                                                            this.field1371[this.field1458] = var22.field1043;
                                                            this.field1368[this.field1458] = var17;
                                                            this.field1369[this.field1458] = var12.field79;
                                                            ++this.field1458;
                                                        }
                                                    }
                                                }
                                                this.field1481[this.field1458] = "Examine @lre@" + var22.field1045;
                                                this.field1370[this.field1458] = 1328;
                                                this.field1371[this.field1458] = var22.field1043;
                                                this.field1368[this.field1458] = var17;
                                                this.field1369[this.field1458] = var12.field79;
                                                ++this.field1458;
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

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1281[var1] = var0 / 4;
        }
        field1333 = 7;
        field1356 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1425 = 8;
        field1426 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1426[var3] = var2 - 1;
            var2 += var2;
        }
        field1445 = 105;
        field1459 = 10;
        field1461 = true;
        field1475 = true;
        field1484 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1587 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
