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

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private boolean field1191 = false;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1192 = -1;

    @OriginalMember(owner = "client", name = "O", descriptor = "Z")
    private boolean field1195 = false;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1196 = -14273;

    @OriginalMember(owner = "client", name = "R", descriptor = "Ljava/lang/String;")
    private String field1198 = "";

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljava/lang/String;")
    private String field1199 = "";

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1202 = 2;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1203 = new int[50];

    @OriginalMember(owner = "client", name = "X", descriptor = "Lmb;")
    private Packet field1204 = Packet.method225(false, 1);

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1205 = -1;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[[I")
    private int[][] field1206 = new int[104][104];

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field1211 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1212 = new int[50];

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1217 = -1;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1218 = 128;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1236 = -266;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1237 = -1;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "B")
    private byte field1242 = -5;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Ld;")
    private Component field1243 = new Component();

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1246 = -1;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1248 = 5063219;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[I")
    private int[] field1251 = new int[33];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field1255 = new int[7];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/lang/String;")
    private String field1256 = "";

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[Ljb;")
    private Pix32[] field1257 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Z")
    private boolean field1258 = false;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Z")
    private boolean field1259 = false;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1260 = -1;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field1261 = new int[2000];

    @OriginalMember(owner = "client", name = "ec", descriptor = "Z")
    private boolean field1263 = false;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1265 = 751;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field1277 = new int[5];

    @OriginalMember(owner = "client", name = "uc", descriptor = "Z")
    private boolean field1279 = false;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field1280 = false;

    @OriginalMember(owner = "client", name = "wc", descriptor = "B")
    private byte field1281 = 3;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1287 = -266;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[[[Lpb;")
    private LinkList[][][] field1289 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[I")
    private int[] field1291 = new int[5];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1294 = new int[151];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Z")
    private boolean field1296 = true;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[Z")
    private boolean[] field1303 = new boolean[5];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "B")
    private byte field1304 = 5;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[Lwb;")
    public FileStream[] field1306 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[Lkb;")
    private Pix8[] field1307 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/lang/String;")
    private String field1308 = "";

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private boolean field1309 = false;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1314 = 751;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1315 = 922;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1316 = new int[5];

    @OriginalMember(owner = "client", name = "od", descriptor = "[Ljb;")
    private Pix32[] field1325 = new Pix32[20];

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1326 = 1;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Lmb;")
    private Packet field1327 = Packet.method225(false, 1);

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field1328 = new int[256];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[[I")
    private int[][] field1333 = new int[104][104];

    @OriginalMember(owner = "client", name = "yd", descriptor = "B")
    private byte field1335 = -5;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[I")
    private int[] field1337 = new int[1000];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field1338 = new int[1000];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1342 = -1;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1343 = -1;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1350 = -1;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Lpb;")
    private LinkList field1351 = new LinkList(false);

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1352 = -286;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1364 = 78;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1367 = -1;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1369 = new CRC32();

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    public boolean field1371 = false;

    @OriginalMember(owner = "client", name = "je", descriptor = "[J")
    private long[] field1372 = new long[200];

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1373 = false;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private final int field1375 = 100;

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field1376 = new int[100];

    @OriginalMember(owner = "client", name = "pe", descriptor = "B")
    private byte field1378 = -41;

    @OriginalMember(owner = "client", name = "te", descriptor = "Z")
    private boolean field1382 = false;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1384 = 1;

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field1385 = false;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[Ljava/lang/String;")
    private String[] field1386 = new String[500];

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field1387 = new int[100];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[Ljava/lang/String;")
    private String[] field1388 = new String[100];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[Ljava/lang/String;")
    private String[] field1389 = new String[100];

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field1390 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Ljava/lang/String;")
    private String field1391 = "";

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field1396 = new int[4000];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field1397 = new int[4000];

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1398 = 1;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field1399 = new int[5];

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1400 = 7759444;

    @OriginalMember(owner = "client", name = "Me", descriptor = "B")
    private byte field1401 = 86;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field1423 = false;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private boolean field1429 = true;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Ljava/lang/String;")
    private String field1430 = "";

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field1440 = new int[50];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field1441 = new int[5];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Lpb;")
    private LinkList field1447 = new LinkList(false);

    @OriginalMember(owner = "client", name = "If", descriptor = "Lpb;")
    private LinkList field1448 = new LinkList(false);

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1450 = 3;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1451 = -1;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1453 = 1;

    @OriginalMember(owner = "client", name = "Of", descriptor = "B")
    private byte field1454 = -1;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field1455 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[I")
    private int[] field1456 = new int[200];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1459 = 50;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field1460 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field1461 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field1462 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field1463 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1464 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1465 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1466 = new int[this.field1459];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[Ljava/lang/String;")
    private String[] field1467 = new String[this.field1459];

    @OriginalMember(owner = "client", name = "dg", descriptor = "B")
    private byte field1469 = 32;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1471 = -732;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field1472 = new int[2000];

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1474 = 2;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field1477 = new int[33];

    @OriginalMember(owner = "client", name = "mg", descriptor = "Z")
    private boolean field1478 = false;

    @OriginalMember(owner = "client", name = "og", descriptor = "[Lab;")
    private NpcEntity[] field1480 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "qg", descriptor = "[I")
    public int[] field1482 = new int[8192];

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1490 = 3353893;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private boolean field1492 = false;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1497 = new int[50];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[Ljb;")
    private Pix32[] field1503 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[Ljb;")
    private Pix32[] field1505 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field1512 = new int[9];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "B")
    private byte field1514 = 5;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field1515 = new int[151];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field1517 = false;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field1519 = 2048;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field1520 = 2047;

    @OriginalMember(owner = "client", name = "dh", descriptor = "[Lbb;")
    private PlayerEntity[] field1521 = new PlayerEntity[this.field1519];

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    public int[] field1523 = new int[this.field1519];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    private int[] field1525 = new int[this.field1519];

    @OriginalMember(owner = "client", name = "ih", descriptor = "[Lmb;")
    private Packet[] field1526 = new Packet[this.field1519];

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field1529 = false;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[J")
    private long[] field1530 = new long[100];

    @OriginalMember(owner = "client", name = "sh", descriptor = "[Ljava/lang/String;")
    private String[] field1536 = new String[200];

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    public boolean field1537 = true;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field1538 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field1539 = new int[500];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field1540 = new int[500];

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1541 = new int[500];

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1542 = new int[500];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Lmb;")
    private Packet field1545 = Packet.method225(false, 1);

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field1550 = new int[50];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[I")
    public int[] field1553 = new int[1000];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "B")
    private byte field1555 = -88;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field1556 = true;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Ljava/lang/String;")
    private String field1570 = "";

    @OriginalMember(owner = "client", name = "bi", descriptor = "Ljava/lang/String;")
    private String field1571 = "";

    @OriginalMember(owner = "client", name = "ci", descriptor = "[Ljb;")
    private Pix32[] field1572 = new Pix32[50];

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1573 = -1;

    @OriginalMember(owner = "client", name = "ei", descriptor = "[Ljc;")
    private CollisionMap[] field1574 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "fi", descriptor = "Ljava/lang/String;")
    private String field1575 = "";

    @OriginalMember(owner = "client", name = "ii", descriptor = "[Lkb;")
    private Pix8[] field1578 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field1579 = true;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1588 = 2301979;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Z")
    private boolean field1589 = false;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Z")
    private boolean field1590 = false;

    @OriginalMember(owner = "client", name = "xi", descriptor = "B")
    private byte field1593 = 4;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1594 = -1;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field1598 = new int[50];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1602 = 909;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1603 = 377;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1604 = -1;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1610 = 43763;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1612 = 2;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private boolean field1615 = true;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[[I")
    private int[][] field1616 = new int[104][104];

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field1618 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private final int[] field1622 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field1623 = false;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field1631 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "sj", descriptor = "[B")
    private byte[] field1640 = new byte[16384];

    @OriginalMember(owner = "client", name = "tj", descriptor = "[Lkb;")
    private Pix8[] field1641 = new Pix8[13];

    @OriginalMember(owner = "client", name = "jb", descriptor = "[[I")
    public static final int[][] field1216 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "qb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1223 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private static int[] field1253 = new int[99];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    public static final int[] field1298;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Ljava/lang/String;")
    private static String field1421;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1457;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private static int field1468;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private static int field1485;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Z")
    private static boolean field1487;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private static int field1544;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private static int field1586;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private static boolean field1627;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private static int field1642;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private static int field1190;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private static int field1245;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private static int field1252;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private static int field1295;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private static int field1334;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private static int field1344;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private static int field1377;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private static int field1422;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private static int field1445;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private static int field1491;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private static int field1595;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private static int field1599;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private static int field1600;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private static int field1632;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private static int field1639;

    @OriginalMember(owner = "client", name = "xb", descriptor = "J")
    private long field1230;

    @OriginalMember(owner = "client", name = "eg", descriptor = "J")
    private long field1470;

    @OriginalMember(owner = "client", name = "rg", descriptor = "J")
    private long field1483;

    @OriginalMember(owner = "client", name = "kh", descriptor = "J")
    public long field1528;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "J")
    private long field1609;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Le;")
    private ClientStream field1297;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Lxb;")
    private Isaac field1379;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Lyb;")
    private Jagfile field1278;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lfc;")
    public MouseTracking field1368;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Lvb;")
    private OnDemand field1576;

    @OriginalMember(owner = "client", name = "T", descriptor = "Ljb;")
    private Pix32 field1200;

    @OriginalMember(owner = "client", name = "ab", descriptor = "Ljb;")
    private Pix32 field1207;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Ljb;")
    private Pix32 field1208;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Ljb;")
    private Pix32 field1209;

    @OriginalMember(owner = "client", name = "db", descriptor = "Ljb;")
    private Pix32 field1210;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Ljb;")
    private Pix32 field1240;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Ljb;")
    private Pix32 field1241;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Ljb;")
    private Pix32 field1274;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Ljb;")
    private Pix32 field1275;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Ljb;")
    private Pix32 field1276;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Ljb;")
    private Pix32 field1293;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Ljb;")
    private Pix32 field1393;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Ljb;")
    private Pix32 field1394;

    @OriginalMember(owner = "client", name = "md", descriptor = "Lkb;")
    private Pix8 field1323;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lkb;")
    private Pix8 field1324;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Lkb;")
    private Pix8 field1354;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Lkb;")
    private Pix8 field1355;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lkb;")
    private Pix8 field1356;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lkb;")
    private Pix8 field1357;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Lkb;")
    private Pix8 field1358;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lkb;")
    private Pix8 field1494;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lkb;")
    private Pix8 field1495;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Lkb;")
    private Pix8 field1496;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Lkb;")
    private Pix8 field1506;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Lkb;")
    private Pix8 field1507;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Lkb;")
    private Pix8 field1508;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Lkb;")
    private Pix8 field1580;

    @OriginalMember(owner = "client", name = "li", descriptor = "Lkb;")
    private Pix8 field1581;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Lkb;")
    private Pix8 field1582;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Lkb;")
    private Pix8 field1583;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lkb;")
    private Pix8 field1584;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Lkb;")
    private Pix8 field1633;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Lkb;")
    private Pix8 field1634;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Llb;")
    private PixFont field1299;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Llb;")
    private PixFont field1300;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Llb;")
    private PixFont field1301;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Llb;")
    private PixFont field1302;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Lrb;")
    private PixMap field1402;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lrb;")
    private PixMap field1403;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lrb;")
    private PixMap field1404;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Lrb;")
    private PixMap field1405;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Lrb;")
    private PixMap field1406;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Lrb;")
    private PixMap field1407;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Lrb;")
    private PixMap field1408;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Lrb;")
    private PixMap field1409;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Lrb;")
    private PixMap field1410;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Lrb;")
    private PixMap field1424;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lrb;")
    private PixMap field1425;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Lrb;")
    private PixMap field1426;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lrb;")
    private PixMap field1427;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Lrb;")
    private PixMap field1558;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lrb;")
    private PixMap field1559;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Lrb;")
    private PixMap field1560;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Lrb;")
    private PixMap field1561;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Lrb;")
    private PixMap field1562;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lrb;")
    private PixMap field1563;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lrb;")
    private PixMap field1564;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lrb;")
    private PixMap field1565;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lrb;")
    private PixMap field1566;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Lrb;")
    private PixMap field1567;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Lrb;")
    private PixMap field1568;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Lrb;")
    private PixMap field1569;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Lbb;")
    public static PlayerEntity field1527;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Ls;")
    private World3D field1250;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Ljava/lang/String;")
    public String field1332;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Ljava/lang/String;")
    public String field1439;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Ljava/lang/String;")
    private String field1446;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Ljava/lang/String;")
    private String field1605;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private static boolean field1239;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Z")
    private static boolean field1488;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    public static boolean field1643;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1224;

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field1225;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1226;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field1359;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field1360;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field1361;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field1432;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field1433;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1547;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    private int[] field1548;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[I")
    private int[] field1549;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field1591;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    private int[] field1592;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[Lkb;")
    private Pix8[] field1551;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[[B")
    private byte[][] field1227;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[[B")
    private byte[][] field1554;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[[[B")
    private byte[][][] field1621;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[[[I")
    private int[][][] field1557;

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method427(int arg0) {
        if (arg0 != 8894) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public void method428(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1247);
        if (this.field1576 != null) {
            System.out.println("Od-cycle:" + this.field1576.field851);
        }
        System.out.println("loop-cycle:" + field1444);
        if (this.field1555 != arg0) {
            this.field1532 = -1;
        }
        System.out.println("draw-cycle:" + field1629);
        System.out.println("ptype:" + this.field1532);
        System.out.println("psize:" + this.field1531);
        if (this.field1297 != null) {
            this.field1297.method43((byte) -88);
        }
        super.field10 = true;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 < 0) {
            if (signlink.mainapp != null) {
                return signlink.mainapp;
            } else {
                return super.field16 != null ? super.field16 : this;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public final boolean method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1333[var15][var35] = 0;
                this.field1206[var15][var35] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg5;
        this.field1333[arg11][arg5] = 99;
        this.field1206[arg11][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1396[var18] = arg11;
        int var36 = var18 + 1;
        this.field1397[var18] = arg5;
        boolean var20 = false;
        int var21 = this.field1396.length;
        int[][] var22 = this.field1574[this.field1587].field1086;
        while (var36 != var19) {
            var16 = this.field1396[var19];
            var17 = this.field1397[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg10 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field1574[this.field1587].method368(arg0 - 1, var16, arg8, arg4, var17, arg10, (byte) -61)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field1574[this.field1587].method369(var16, false, var17, arg0 - 1, arg4, arg8, arg10)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg2 != 0 && this.field1574[this.field1587].method370(arg2, 109, arg7, var17, arg10, arg6, var16, arg8)) {
                var20 = true;
                break;
            }
            int var34 = this.field1206[var16][var17] + 1;
            if (var16 > 0 && this.field1333[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1396[var36] = var16 - 1;
                this.field1397[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 - 1][var17] = 2;
                this.field1206[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1333[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1396[var36] = var16 + 1;
                this.field1397[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 + 1][var17] = 8;
                this.field1206[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1333[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1396[var36] = var16;
                this.field1397[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16][var17 - 1] = 1;
                this.field1206[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1333[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1396[var36] = var16;
                this.field1397[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16][var17 + 1] = 4;
                this.field1206[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1333[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1396[var36] = var16 - 1;
                this.field1397[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 - 1][var17 - 1] = 3;
                this.field1206[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1333[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1396[var36] = var16 + 1;
                this.field1397[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 + 1][var17 - 1] = 9;
                this.field1206[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1333[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1396[var36] = var16 - 1;
                this.field1397[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 - 1][var17 + 1] = 6;
                this.field1206[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1333[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1396[var36] = var16 + 1;
                this.field1397[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1333[var16 + 1][var17 + 1] = 12;
                this.field1206[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1434 = 0;
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg10 - var24; var26 <= arg10 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1206[var25][var26] < var23) {
                                var23 = this.field1206[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1434 = 1;
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
        this.field1396[var27] = var16;
        int var37 = var27 + 1;
        this.field1397[var27] = var17;
        int var28;
        int var29 = var28 = this.field1333[var16][var17];
        if (arg1 != 9) {
            field1586 = this.field1379.method304();
        }
        while (arg11 != var16 || arg5 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1396[var37] = var16;
                this.field1397[var37++] = var17;
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
            var29 = this.field1333[var16][var17];
        }
        if (var37 <= 0) {
            if (arg3 == 1) {
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
            int var31 = this.field1396[var37];
            int var32 = this.field1397[var37];
            if (arg3 == 0) {
                this.field1204.method227(9, 182);
                this.field1204.method228(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field1204.method227(9, 198);
                this.field1204.method228(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field1204.method227(9, 216);
                this.field1204.method228(var30 + var30 + 3);
            }
            if (super.field31[5] == 1) {
                this.field1204.method228(1);
            } else {
                this.field1204.method228(0);
            }
            this.field1204.method229(this.field1266 + var31);
            this.field1204.method229(this.field1267 + var32);
            this.field1272 = this.field1396[0];
            this.field1273 = this.field1397[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1204.method228(this.field1396[var37] - var31);
                this.field1204.method228(this.field1397[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method430(int arg0) {
        this.method490(699);
        if (this.field1313 == 1) {
            this.field1257[this.field1312 / 100].method198(this.field1310 - 8 - 4, 200, this.field1311 - 8 - 4);
        }
        if (this.field1313 == 2) {
            this.field1257[this.field1312 / 100 + 4].method198(this.field1310 - 8 - 4, 200, this.field1311 - 8 - 4);
        }
        if (this.field1451 != -1) {
            this.method543(this.field1451, this.field1290, -450);
            this.method473(Component.field70[this.field1451], 0, true, 0, 0);
        }
        if (this.field1504 > 0) {
            int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1504 / 10.0D) * 10.0D);
            for (int var3 = 0; var3 < 30; ++var3) {
                int var4 = (30 - var3) * 16;
                Pix2D.method173(16776960, var2 + var3, this.field1504, var4, 256 - var4 / 2, true);
            }
        }
        if (this.field1217 != -1) {
            this.method543(this.field1217, this.field1290, -450);
            this.method473(Component.field70[this.field1217], 0, true, 0, 0);
        }
        this.method484(3);
        if (arg0 != 6) {
            this.field1532 = -1;
        }
        if (!this.field1420) {
            this.method468(-540);
            this.method500(-169);
        } else if (this.field1498 == 0) {
            this.method438(0);
        }
        if (this.field1194 == 1) {
            if (this.field1244 <= 0 && this.field1288 != 1) {
                this.field1325[1].method198(472, 200, 296);
            } else {
                this.field1325[1].method198(472, 200, 258);
            }
        }
        if (this.field1244 > 0) {
            this.field1325[0].method198(472, 200, 296);
            this.field1300.method213(16776960, 484, 329, "Level: " + this.field1244, -977);
        }
        if (this.field1288 == 1) {
            this.field1325[6].method198(472, 200, 296);
            this.field1300.method213(16776960, 484, 329, "Arena", -977);
        }
        if (this.field1614 != 0) {
            int var5 = this.field1614 / 50;
            int var6 = var5 / 60;
            int var7 = var5 % 60;
            if (var7 < 10) {
                this.field1300.method216(0, "System update in: " + var6 + ":0" + var7, 16776960, 4, 329);
            } else {
                this.field1300.method216(0, "System update in: " + var6 + ":" + var7, 16776960, 4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB[B)Z")
    public final boolean method431(int arg0, byte arg1, byte[] arg2) {
        if (arg1 != 113) {
            this.field1204.method228(17);
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method432(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg0;
        this.field1531 += arg1;
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method433(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1363; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1536[var3])) {
                    return true;
                }
            }
            if (arg0 <= 0) {
                this.field1532 = this.field1327.method238();
            }
            return arg1.equalsIgnoreCase(field1527.field476);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method434(int arg0, int arg1) {
        LinkList var3 = this.field1289[this.field1587][arg0][arg1];
        if (var3 == null) {
            this.field1250.method84(this.field1587, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method257(); var6 != null; var6 = (ObjStackEntity) var3.method259(-327)) {
                ObjType var11 = ObjType.method348(var6.field509);
                int var12 = var11.field1047;
                if (var11.field1046) {
                    var12 = (var6.field510 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method255(var5, 21);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method257(); var9 != null; var9 = (ObjStackEntity) var3.method259(-327)) {
                if (var5.field509 != var9.field509 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field509 != var9.field509 && var7.field509 != var9.field509 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1250.method70((byte) 6, var10, arg0, this.method526(arg1 * 128 + 64, this.field1587, arg0 * 128 + 64, (byte) 2), this.field1587, arg1, var7, var8, var5);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
    public final void method435(boolean arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field1260 != -1) {
            this.field1446 = arg3;
            super.field27 = 0;
        }
        if (this.field1350 == -1) {
            this.field1492 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1387[var5] = this.field1387[var5 - 1];
            this.field1388[var5] = this.field1388[var5 - 1];
            this.field1389[var5] = this.field1389[var5 - 1];
        }
        this.field1387[0] = arg2;
        if (!arg0) {
            this.field1388[0] = arg1;
            this.field1389[0] = arg3;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method436(int arg0, int arg1, int arg2) {
        while (arg0 >= 0) {
        }
        int var3 = arg1 - arg2;
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method437(int arg0, int arg1) {
        int var3 = 50 / arg0;
        int var4 = VarpType.field1157[arg1].field1165;
        if (var4 != 0) {
            int var5 = this.field1472[arg1];
            if (var4 == 1) {
                if (var5 == 1) {
                    Pix3D.method185(field1544, 0.9D);
                }
                if (var5 == 2) {
                    Pix3D.method185(field1544, 0.8D);
                }
                if (var5 == 3) {
                    Pix3D.method185(field1544, 0.7D);
                }
                if (var5 == 4) {
                    Pix3D.method185(field1544, 0.6D);
                }
                ObjType.field1073.method116();
                this.field1517 = true;
            }
            if (var4 == 3) {
                boolean var6 = this.field1556;
                if (var5 == 0) {
                    this.method544(this.field1556, 5, 0);
                    this.field1556 = true;
                }
                if (var5 == 1) {
                    this.method544(this.field1556, 5, -400);
                    this.field1556 = true;
                }
                if (var5 == 2) {
                    this.method544(this.field1556, 5, -800);
                    this.field1556 = true;
                }
                if (var5 == 3) {
                    this.method544(this.field1556, 5, -1200);
                    this.field1556 = true;
                }
                if (var5 == 4) {
                    this.field1556 = false;
                }
                if (this.field1556 != var6 && !field1488) {
                    if (this.field1556) {
                        this.field1340 = this.field1205;
                        this.field1341 = false;
                        this.field1576.method288(2, this.field1340);
                    } else {
                        this.method515(0);
                    }
                    this.field1270 = 0;
                }
            }
            if (var4 == 4) {
                if (var5 == 0) {
                    this.field1579 = true;
                    this.method457(0, 0);
                }
                if (var5 == 1) {
                    this.field1579 = true;
                    this.method457(-400, 0);
                }
                if (var5 == 2) {
                    this.field1579 = true;
                    this.method457(-800, 0);
                }
                if (var5 == 3) {
                    this.field1579 = true;
                    this.method457(-1200, 0);
                }
                if (var5 == 4) {
                    this.field1579 = false;
                }
            }
            if (var4 == 5) {
                this.field1416 = var5;
            }
            if (var4 == 6) {
                this.field1249 = var5;
            }
            if (var4 == 8) {
                this.field1271 = var5;
                this.field1492 = true;
            }
            if (var4 == 9) {
                this.field1626 = var5;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method438(int arg0) {
        int var2 = this.field1499;
        int var3 = this.field1500;
        int var4 = this.field1501;
        int var5 = this.field1502;
        int var6 = 6116423;
        Pix2D.method169(-556, var3, var5, var2, var4, var6);
        Pix2D.method169(-556, var3 + 1, 16, var2 + 1, var4 - 2, 0);
        Pix2D.method170(var2 + 1, var5 - 19, var3 + 18, var4 - 2, 0, false);
        this.field1301.method216(0, "Choose Option", var6, var2 + 3, var3 + 14);
        int var7 = super.field21;
        int var8 = super.field22;
        if (arg0 == 0) {
            if (this.field1498 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field1498 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field1498 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field1213; ++var9) {
                int var10 = (this.field1213 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field1301.method218(var11, var2 + 3, var10, true, false, this.field1386[var9]);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (arg0 != 0) {
            this.field1532 = -1;
        }
        for (int var2 = 0; var2 < this.field1481; ++var2) {
            int var3 = this.field1482[var2];
            NpcEntity var4 = this.field1480[var3];
            if (var4 != null) {
                this.method440(this.field1454, var4.field471.field998, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILz;)V")
    public final void method440(byte arg0, int arg1, PathingEntity arg2) {
        if (arg0 != -1) {
            this.field1532 = -1;
        }
        if (arg2.field414 < 128 || arg2.field415 < 128 || arg2.field414 >= 13184 || arg2.field415 >= 13184) {
            arg2.field442 = -1;
            arg2.field447 = -1;
            arg2.field456 = 0;
            arg2.field457 = 0;
            arg2.field414 = arg2.field463[0] * 128 + arg2.field418 * 64;
            arg2.field415 = arg2.field464[0] * 128 + arg2.field418 * 64;
            arg2.method125((byte) -66);
        }
        if (field1527 == arg2 && (arg2.field414 < 1536 || arg2.field415 < 1536 || arg2.field414 >= 11776 || arg2.field415 >= 11776)) {
            arg2.field442 = -1;
            arg2.field447 = -1;
            arg2.field456 = 0;
            arg2.field457 = 0;
            arg2.field414 = arg2.field463[0] * 128 + arg2.field418 * 64;
            arg2.field415 = arg2.field464[0] * 128 + arg2.field418 * 64;
            arg2.method125((byte) -66);
        }
        if (arg2.field456 > field1444) {
            this.method441(0, arg2);
        } else if (arg2.field457 >= field1444) {
            this.method442((byte) 32, arg2);
        } else {
            this.method443(735, arg2);
        }
        this.method444(arg2, (byte) 8);
        this.method445(arg2, 46734);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method441(int arg0, PathingEntity arg1) {
        int var3 = arg1.field456 - field1444;
        int var4 = arg1.field452 * 128 + arg1.field418 * 64;
        int var5 = arg1.field454 * 128 + arg1.field418 * 64;
        arg1.field414 += (var4 - arg1.field414) / var3;
        arg1.field415 += (var5 - arg1.field415) / var3;
        arg1.field466 = 0;
        this.field1531 += arg0;
        if (arg1.field458 == 0) {
            arg1.field461 = 1024;
        }
        if (arg1.field458 == 1) {
            arg1.field461 = 1536;
        }
        if (arg1.field458 == 2) {
            arg1.field461 = 0;
        }
        if (arg1.field458 == 3) {
            arg1.field461 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLz;)V")
    public final void method442(byte arg0, PathingEntity arg1) {
        if (this.field1469 != arg0) {
            this.field1532 = -1;
        }
        if (field1444 == arg1.field457 || arg1.field442 == -1 || arg1.field445 != 0 || arg1.field444 + 1 > SeqType.field1125[arg1.field442].method382(arg1.field443, 0)) {
            int var3 = arg1.field457 - arg1.field456;
            int var4 = field1444 - arg1.field456;
            int var5 = arg1.field452 * 128 + arg1.field418 * 64;
            int var6 = arg1.field454 * 128 + arg1.field418 * 64;
            int var7 = arg1.field453 * 128 + arg1.field418 * 64;
            int var8 = arg1.field455 * 128 + arg1.field418 * 64;
            arg1.field414 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field415 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field466 = 0;
        if (arg1.field458 == 0) {
            arg1.field461 = 1024;
        }
        if (arg1.field458 == 1) {
            arg1.field461 = 1536;
        }
        if (arg1.field458 == 2) {
            arg1.field461 = 0;
        }
        if (arg1.field458 == 3) {
            arg1.field461 = 512;
        }
        arg1.field416 = arg1.field461;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILz;)V")
    public final void method443(int arg0, PathingEntity arg1) {
        arg1.field439 = arg1.field419;
        if (arg1.field462 == 0) {
            arg1.field466 = 0;
        } else {
            if (arg1.field442 != -1 && arg1.field445 == 0) {
                SeqType var3 = SeqType.field1125[arg1.field442];
                if (arg1.field467 > 0 && var3.field1137 == 0) {
                    ++arg1.field466;
                    return;
                }
                if (arg1.field467 <= 0 && var3.field1138 == 0) {
                    ++arg1.field466;
                    return;
                }
            }
            int var4 = arg1.field414;
            int var5 = arg1.field415;
            int var6 = arg1.field463[arg1.field462 - 1] * 128 + arg1.field418 * 64;
            int var7 = arg1.field464[arg1.field462 - 1] * 128 + arg1.field418 * 64;
            int var8 = 63 / arg0;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field461 = 1280;
                    } else if (var5 > var7) {
                        arg1.field461 = 1792;
                    } else {
                        arg1.field461 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field461 = 768;
                    } else if (var5 > var7) {
                        arg1.field461 = 256;
                    } else {
                        arg1.field461 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field461 = 1024;
                } else {
                    arg1.field461 = 0;
                }
                int var9 = arg1.field461 - arg1.field416 & 2047;
                if (var9 > 1024) {
                    var9 -= 2048;
                }
                int var10 = arg1.field422;
                if (var9 >= -256 && var9 <= 256) {
                    var10 = arg1.field421;
                } else if (var9 >= 256 && var9 < 768) {
                    var10 = arg1.field424;
                } else if (var9 >= -768 && var9 <= -256) {
                    var10 = arg1.field423;
                }
                if (var10 == -1) {
                    var10 = arg1.field421;
                }
                arg1.field439 = var10;
                int var11 = 4;
                if (arg1.field461 != arg1.field416 && arg1.field436 == -1) {
                    var11 = 2;
                }
                if (arg1.field462 > 2) {
                    var11 = 6;
                }
                if (arg1.field462 > 3) {
                    var11 = 8;
                }
                if (arg1.field466 > 0 && arg1.field462 > 1) {
                    var11 = 8;
                    --arg1.field466;
                }
                if (arg1.field465[arg1.field462 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field439 == arg1.field421 && arg1.field425 != -1) {
                    arg1.field439 = arg1.field425;
                }
                if (var4 < var6) {
                    arg1.field414 += var11;
                    if (arg1.field414 > var6) {
                        arg1.field414 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field414 -= var11;
                    if (arg1.field414 < var6) {
                        arg1.field414 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field415 += var11;
                    if (arg1.field415 > var7) {
                        arg1.field415 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field415 -= var11;
                    if (arg1.field415 < var7) {
                        arg1.field415 = var7;
                    }
                }
                if (arg1.field414 == var6 && arg1.field415 == var7) {
                    --arg1.field462;
                    if (arg1.field467 > 0) {
                        --arg1.field467;
                        return;
                    }
                }
            } else {
                arg1.field414 = var6;
                arg1.field415 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;B)V")
    public final void method444(PathingEntity arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            this.field1532 = -1;
        }
        if (arg0.field436 != -1 && arg0.field436 < 32768) {
            NpcEntity var4 = this.field1480[arg0.field436];
            if (var4 != null) {
                int var5 = arg0.field414 - var4.field414;
                int var6 = arg0.field415 - var4.field415;
                if (var5 != 0 || var6 != 0) {
                    arg0.field461 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field436 >= 32768) {
            int var7 = arg0.field436 - 32768;
            if (this.field1594 == var7) {
                var7 = this.field1520;
            }
            PlayerEntity var8 = this.field1521[var7];
            if (var8 != null) {
                int var9 = arg0.field414 - var8.field414;
                int var10 = arg0.field415 - var8.field415;
                if (var9 != 0 || var10 != 0) {
                    arg0.field461 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field437 != 0 || arg0.field438 != 0) && (arg0.field462 == 0 || arg0.field466 > 0)) {
            int var11 = arg0.field414 - (arg0.field437 - this.field1266 - this.field1266) * 64;
            int var12 = arg0.field415 - (arg0.field438 - this.field1267 - this.field1267) * 64;
            if (var11 != 0 || var12 != 0) {
                arg0.field461 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
            }
            arg0.field437 = 0;
            arg0.field438 = 0;
        }
        int var13 = arg0.field461 - arg0.field416 & 2047;
        if (var13 != 0) {
            if (var13 >= 32 && var13 <= 2016) {
                if (var13 > 1024) {
                    arg0.field416 -= 32;
                } else {
                    arg0.field416 += 32;
                }
            } else {
                arg0.field416 = arg0.field461;
            }
            arg0.field416 &= 2047;
            if (arg0.field439 == arg0.field419 && arg0.field461 != arg0.field416) {
                if (arg0.field420 != -1) {
                    arg0.field439 = arg0.field420;
                    return;
                }
                arg0.field439 = arg0.field421;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method445(PathingEntity arg0, int arg1) {
        if (arg1 != 46734) {
            this.field1352 = this.field1379.method304();
        }
        arg0.field417 = false;
        if (arg0.field439 != -1) {
            SeqType var3 = SeqType.field1125[arg0.field439];
            ++arg0.field441;
            if (arg0.field440 < var3.field1126 && arg0.field441 > var3.method382(arg0.field440, 0)) {
                arg0.field441 = 0;
                ++arg0.field440;
            }
            if (arg0.field440 >= var3.field1126) {
                arg0.field441 = 0;
                arg0.field440 = 0;
            }
        }
        if (arg0.field447 != -1 && field1444 >= arg0.field450) {
            if (arg0.field448 < 0) {
                arg0.field448 = 0;
            }
            SeqType var4 = SpotAnimType.field1142[arg0.field447].field1146;
            ++arg0.field449;
            while (arg0.field448 < var4.field1126 && arg0.field449 > var4.method382(arg0.field448, 0)) {
                arg0.field449 -= var4.method382(arg0.field448, 0);
                ++arg0.field448;
            }
            if (arg0.field448 >= var4.field1126 && (arg0.field448 < 0 || arg0.field448 >= var4.field1126)) {
                arg0.field447 = -1;
            }
        }
        if (arg0.field442 != -1 && arg0.field445 <= 1) {
            SeqType var5 = SeqType.field1125[arg0.field442];
            if (var5.field1137 == 1 && arg0.field467 > 0 && arg0.field456 <= field1444 && arg0.field457 < field1444) {
                arg0.field445 = 1;
                return;
            }
        }
        if (arg0.field442 != -1 && arg0.field445 == 0) {
            SeqType var6 = SeqType.field1125[arg0.field442];
            ++arg0.field444;
            while (arg0.field443 < var6.field1126 && arg0.field444 > var6.method382(arg0.field443, 0)) {
                arg0.field444 -= var6.method382(arg0.field443, 0);
                ++arg0.field443;
            }
            if (arg0.field443 >= var6.field1126) {
                arg0.field443 -= var6.field1130;
                ++arg0.field446;
                if (arg0.field446 >= var6.field1136) {
                    arg0.field442 = -1;
                }
                if (arg0.field443 < 0 || arg0.field443 >= var6.field1126) {
                    arg0.field442 = -1;
                }
            }
            arg0.field417 = var6.field1132;
        }
        if (arg0.field445 > 0) {
            --arg0.field445;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method446(int arg0) {
        if (this.field1517) {
            this.field1517 = false;
            this.field1402.method268(0, (byte) 107, super.field13, 4);
            this.field1403.method268(0, (byte) 107, super.field13, 357);
            this.field1404.method268(722, (byte) 107, super.field13, 4);
            this.field1405.method268(743, (byte) 107, super.field13, 205);
            this.field1406.method268(0, (byte) 107, super.field13, 0);
            this.field1407.method268(516, (byte) 107, super.field13, 4);
            this.field1408.method268(516, (byte) 107, super.field13, 205);
            this.field1409.method268(496, (byte) 107, super.field13, 357);
            this.field1410.method268(0, (byte) 107, super.field13, 338);
            this.field1623 = true;
            this.field1492 = true;
            this.field1589 = true;
            this.field1478 = true;
            if (this.field1509 != 2) {
                this.field1426.method268(4, (byte) 107, super.field13, 4);
                this.field1425.method268(550, (byte) 107, super.field13, 4);
            }
        }
        if (this.field1509 == 2) {
            this.method510(9);
        }
        if (this.field1420 && this.field1498 == 1) {
            this.field1623 = true;
        }
        if (this.field1237 != -1) {
            boolean var2 = this.method543(this.field1237, this.field1290, -450);
            if (var2) {
                this.field1623 = true;
            }
        }
        if (this.field1638 == 2) {
            this.field1623 = true;
        }
        if (this.field1347 == 2) {
            this.field1623 = true;
        }
        if (this.field1623) {
            this.method558(8);
            this.field1623 = false;
        }
        if (this.field1350 == -1) {
            this.field1243.field90 = this.field1364 - this.field1322 - 77;
            if (super.field21 > 448 && super.field21 < 560 && super.field22 > 332) {
                this.method536(0, 463, this.field1364, 77, false, this.field1243, super.field22 - 357, super.field21 - 17, (byte) 56);
            }
            int var3 = this.field1364 - 77 - this.field1243.field90;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1364 - 77) {
                var3 = this.field1364 - 77;
            }
            if (this.field1322 != var3) {
                this.field1322 = var3;
                this.field1492 = true;
            }
        }
        if (this.field1350 != -1) {
            boolean var4 = this.method543(this.field1350, this.field1290, -450);
            if (var4) {
                this.field1492 = true;
            }
        }
        if (this.field1638 == 3) {
            this.field1492 = true;
        }
        if (this.field1347 == 3) {
            this.field1492 = true;
        }
        if (this.field1446 != null) {
            this.field1492 = true;
        }
        if (this.field1420 && this.field1498 == 2) {
            this.field1492 = true;
        }
        if (this.field1492) {
            this.method537(this.field1197);
            this.field1492 = false;
        }
        if (this.field1509 == 2) {
            this.method514(595);
            this.field1425.method268(550, (byte) 107, super.field13, 4);
        }
        if (this.field1192 != -1) {
            this.field1589 = true;
        }
        if (this.field1589) {
            if (this.field1192 != -1 && this.field1450 == this.field1192) {
                this.field1192 = -1;
                this.field1204.method227(9, 243);
                this.field1204.method228(this.field1450);
            }
            this.field1589 = false;
            this.field1569.method267(this.field1378);
            this.field1508.method211(0, 200, 0);
            if (this.field1237 == -1) {
                if (this.field1631[this.field1450] != -1) {
                    if (this.field1450 == 0) {
                        this.field1354.method211(22, 200, 10);
                    }
                    if (this.field1450 == 1) {
                        this.field1355.method211(54, 200, 8);
                    }
                    if (this.field1450 == 2) {
                        this.field1355.method211(82, 200, 8);
                    }
                    if (this.field1450 == 3) {
                        this.field1356.method211(110, 200, 8);
                    }
                    if (this.field1450 == 4) {
                        this.field1358.method211(153, 200, 8);
                    }
                    if (this.field1450 == 5) {
                        this.field1358.method211(181, 200, 8);
                    }
                    if (this.field1450 == 6) {
                        this.field1357.method211(209, 200, 9);
                    }
                }
                if (this.field1631[0] != -1 && (this.field1192 != 0 || field1444 % 20 < 10)) {
                    this.field1641[0].method211(29, 200, 13);
                }
                if (this.field1631[1] != -1 && (this.field1192 != 1 || field1444 % 20 < 10)) {
                    this.field1641[1].method211(53, 200, 11);
                }
                if (this.field1631[2] != -1 && (this.field1192 != 2 || field1444 % 20 < 10)) {
                    this.field1641[2].method211(82, 200, 11);
                }
                if (this.field1631[3] != -1 && (this.field1192 != 3 || field1444 % 20 < 10)) {
                    this.field1641[3].method211(115, 200, 12);
                }
                if (this.field1631[4] != -1 && (this.field1192 != 4 || field1444 % 20 < 10)) {
                    this.field1641[4].method211(153, 200, 13);
                }
                if (this.field1631[5] != -1 && (this.field1192 != 5 || field1444 % 20 < 10)) {
                    this.field1641[5].method211(180, 200, 11);
                }
                if (this.field1631[6] != -1 && (this.field1192 != 6 || field1444 % 20 < 10)) {
                    this.field1641[6].method211(208, 200, 13);
                }
            }
            this.field1569.method268(516, (byte) 107, super.field13, 160);
            this.field1568.method267(this.field1378);
            this.field1507.method211(0, 200, 0);
            if (this.field1237 == -1) {
                if (this.field1631[this.field1450] != -1) {
                    if (this.field1450 == 7) {
                        this.field1580.method211(42, 200, 0);
                    }
                    if (this.field1450 == 8) {
                        this.field1581.method211(74, 200, 0);
                    }
                    if (this.field1450 == 9) {
                        this.field1581.method211(102, 200, 0);
                    }
                    if (this.field1450 == 10) {
                        this.field1582.method211(130, 200, 1);
                    }
                    if (this.field1450 == 11) {
                        this.field1584.method211(173, 200, 0);
                    }
                    if (this.field1450 == 12) {
                        this.field1584.method211(201, 200, 0);
                    }
                    if (this.field1450 == 13) {
                        this.field1583.method211(229, 200, 0);
                    }
                }
                if (this.field1631[8] != -1 && (this.field1192 != 8 || field1444 % 20 < 10)) {
                    this.field1641[7].method211(74, 200, 2);
                }
                if (this.field1631[9] != -1 && (this.field1192 != 9 || field1444 % 20 < 10)) {
                    this.field1641[8].method211(102, 200, 3);
                }
                if (this.field1631[10] != -1 && (this.field1192 != 10 || field1444 % 20 < 10)) {
                    this.field1641[9].method211(137, 200, 4);
                }
                if (this.field1631[11] != -1 && (this.field1192 != 11 || field1444 % 20 < 10)) {
                    this.field1641[10].method211(174, 200, 2);
                }
                if (this.field1631[12] != -1 && (this.field1192 != 12 || field1444 % 20 < 10)) {
                    this.field1641[11].method211(201, 200, 2);
                }
                if (this.field1631[13] != -1 && (this.field1192 != 13 || field1444 % 20 < 10)) {
                    this.field1641[12].method211(226, 200, 2);
                }
            }
            this.field1568.method268(496, (byte) 107, super.field13, 466);
            this.field1426.method267(this.field1378);
        }
        if (this.field1478) {
            this.field1478 = false;
            this.field1567.method267(this.field1378);
            this.field1506.method211(0, 200, 0);
            this.field1300.method214(true, 28, 16777215, 55, "Public chat", (byte) -5);
            if (this.field1428 == 0) {
                this.field1300.method214(true, 41, 65280, 55, "On", (byte) -5);
            }
            if (this.field1428 == 1) {
                this.field1300.method214(true, 41, 16776960, 55, "Friends", (byte) -5);
            }
            if (this.field1428 == 2) {
                this.field1300.method214(true, 41, 16711680, 55, "Off", (byte) -5);
            }
            if (this.field1428 == 3) {
                this.field1300.method214(true, 41, 65535, 55, "Hide", (byte) -5);
            }
            this.field1300.method214(true, 28, 16777215, 184, "Private chat", (byte) -5);
            if (this.field1577 == 0) {
                this.field1300.method214(true, 41, 65280, 184, "On", (byte) -5);
            }
            if (this.field1577 == 1) {
                this.field1300.method214(true, 41, 16776960, 184, "Friends", (byte) -5);
            }
            if (this.field1577 == 2) {
                this.field1300.method214(true, 41, 16711680, 184, "Off", (byte) -5);
            }
            this.field1300.method214(true, 28, 16777215, 324, "Trade/duel", (byte) -5);
            if (this.field1489 == 0) {
                this.field1300.method214(true, 41, 65280, 324, "On", (byte) -5);
            }
            if (this.field1489 == 1) {
                this.field1300.method214(true, 41, 16776960, 324, "Friends", (byte) -5);
            }
            if (this.field1489 == 2) {
                this.field1300.method214(true, 41, 16711680, 324, "Off", (byte) -5);
            }
            this.field1300.method214(true, 33, 16777215, 458, "Report abuse", (byte) -5);
            this.field1567.method268(0, (byte) 107, super.field13, 453);
            this.field1426.method267(this.field1378);
        }
        this.field1290 = 0;
        while (arg0 >= 0) {
            this.field1352 = this.field1379.method304();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method447(int arg0) {
        int var2 = this.field1411 * 128 + 64;
        int var3 = this.field1412 * 128 + 64;
        int var4 = this.method526(var3, this.field1587, var2, (byte) 2) - this.field1413;
        this.field1531 += arg0;
        if (this.field1317 < var2) {
            this.field1317 += (var2 - this.field1317) * this.field1415 / 1000 + this.field1414;
            if (this.field1317 > var2) {
                this.field1317 = var2;
            }
        }
        if (this.field1317 > var2) {
            this.field1317 -= (this.field1317 - var2) * this.field1415 / 1000 + this.field1414;
            if (this.field1317 < var2) {
                this.field1317 = var2;
            }
        }
        if (this.field1318 < var4) {
            this.field1318 += (var4 - this.field1318) * this.field1415 / 1000 + this.field1414;
            if (this.field1318 > var4) {
                this.field1318 = var4;
            }
        }
        if (this.field1318 > var4) {
            this.field1318 -= (this.field1318 - var4) * this.field1415 / 1000 + this.field1414;
            if (this.field1318 < var4) {
                this.field1318 = var4;
            }
        }
        if (this.field1319 < var3) {
            this.field1319 += (var3 - this.field1319) * this.field1415 / 1000 + this.field1414;
            if (this.field1319 > var3) {
                this.field1319 = var3;
            }
        }
        if (this.field1319 > var3) {
            this.field1319 -= (this.field1319 - var3) * this.field1415 / 1000 + this.field1414;
            if (this.field1319 < var3) {
                this.field1319 = var3;
            }
        }
        int var5 = this.field1231 * 128 + 64;
        int var6 = this.field1232 * 128 + 64;
        int var7 = this.method526(var6, this.field1587, var5, (byte) 2) - this.field1233;
        int var8 = var5 - this.field1317;
        int var9 = var7 - this.field1318;
        int var10 = var6 - this.field1319;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1320 < var12) {
            this.field1320 += (var12 - this.field1320) * this.field1235 / 1000 + this.field1234;
            if (this.field1320 > var12) {
                this.field1320 = var12;
            }
        }
        if (this.field1320 > var12) {
            this.field1320 -= (this.field1320 - var12) * this.field1235 / 1000 + this.field1234;
            if (this.field1320 < var12) {
                this.field1320 = var12;
            }
        }
        int var14 = var13 - this.field1321;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1321 += this.field1235 * var14 / 1000 + this.field1234;
            this.field1321 &= 2047;
        }
        if (var14 < 0) {
            this.field1321 -= -var14 * this.field1235 / 1000 + this.field1234;
            this.field1321 &= 2047;
        }
        int var15 = var13 - this.field1321;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1321 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1263) {
            this.method464(9);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (this.field1427 == null) {
            this.method504(false);
            super.field14 = null;
            this.field1558 = null;
            this.field1559 = null;
            this.field1560 = null;
            this.field1561 = null;
            this.field1562 = null;
            this.field1563 = null;
            this.field1564 = null;
            if (arg0 <= 0) {
                field1468 = -319;
            }
            this.field1565 = null;
            this.field1566 = null;
            this.field1427 = new PixMap(96, this.method11(-66), 0, 479);
            this.field1425 = new PixMap(156, this.method11(-66), 0, 172);
            Pix2D.method167(true);
            this.field1495.method211(0, 200, 0);
            this.field1424 = new PixMap(261, this.method11(-66), 0, 190);
            this.field1426 = new PixMap(334, this.method11(-66), 0, 512);
            Pix2D.method167(true);
            this.field1567 = new PixMap(50, this.method11(-66), 0, 496);
            this.field1568 = new PixMap(37, this.method11(-66), 0, 269);
            this.field1569 = new PixMap(45, this.method11(-66), 0, 249);
            this.field1517 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 != 4) {
            this.field1602 = -322;
        }
        if (this.field1297 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1297.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1532 == -1) {
                    this.field1297.method41(this.field1327.field712, 0, 1);
                    this.field1532 = this.field1327.field712[0] & 255;
                    if (this.field1379 != null) {
                        this.field1532 = this.field1532 - this.field1379.method304() & 255;
                    }
                    this.field1531 = Protocol.field1075[this.field1532];
                    --var2;
                }
                if (this.field1531 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1297.method41(this.field1327.field712, 0, 1);
                    this.field1531 = this.field1327.field712[0] & 255;
                    --var2;
                }
                if (this.field1531 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1297.method41(this.field1327.field712, 0, 2);
                    this.field1327.field713 = 0;
                    this.field1531 = this.field1327.method240();
                    var2 -= 2;
                }
                if (var2 < this.field1531) {
                    return false;
                }
                this.field1327.field713 = 0;
                this.field1297.method41(this.field1327.field712, 0, this.field1531);
                this.field1533 = 0;
                this.field1419 = this.field1418;
                this.field1418 = this.field1417;
                this.field1417 = this.field1532;
                if (this.field1532 == 203) {
                    this.field1596 = this.field1327.method238();
                    this.field1597 = this.field1327.method238();
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 69) {
                    int var3 = this.field1327.method240();
                    int var4 = this.field1327.method240();
                    Component.field70[var3].field123 = var4;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 236) {
                    int var5 = this.field1327.method240();
                    this.method499(this.field1279, var5);
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1492 = true;
                    }
                    if (this.field1195) {
                        this.field1195 = false;
                        this.field1492 = true;
                    }
                    this.field1237 = var5;
                    this.field1623 = true;
                    this.field1589 = true;
                    this.field1217 = -1;
                    this.field1385 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 177) {
                    int var6 = this.field1327.method240();
                    this.method499(this.field1279, var6);
                    if (this.field1237 != -1) {
                        this.field1237 = -1;
                        this.field1623 = true;
                        this.field1589 = true;
                    }
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1492 = true;
                    }
                    if (this.field1195) {
                        this.field1195 = false;
                        this.field1492 = true;
                    }
                    this.field1217 = var6;
                    this.field1385 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 165) {
                    Packet var7 = InputTracking.method47(-689);
                    if (var7 != null) {
                        this.field1204.method227(9, 19);
                        this.field1204.method229(var7.field713);
                        this.field1204.method236(var7.field712, -37074, var7.field713, 0);
                        var7.method226(false);
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 60) {
                    int var8 = this.field1327.method240();
                    int var9 = this.field1327.method240();
                    Component.field70[var8].field119 = 1;
                    Component.field70[var8].field120 = var9;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 105) {
                    this.method472(this.field1531, 5, this.field1327);
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 15) {
                    this.field1596 = this.field1327.method238();
                    this.field1597 = this.field1327.method238();
                    while (this.field1327.field713 < this.field1531) {
                        int var10 = this.field1327.method238();
                        this.method503(this.field1327, (byte) 3, var10);
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 8) {
                    this.field1450 = this.field1327.method238();
                    this.field1623 = true;
                    this.field1589 = true;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 152) {
                    int var11 = this.field1327.method241();
                    this.field1260 = var11;
                    this.field1492 = true;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 207) {
                    long var12 = this.field1327.method244(true);
                    int var14 = this.field1327.method243();
                    int var15 = this.field1327.method238();
                    boolean var16 = false;
                    for (int var17 = 0; var17 < 100; ++var17) {
                        if (this.field1376[var17] == var14) {
                            var16 = true;
                            break;
                        }
                    }
                    if (var15 <= 1) {
                        for (int var18 = 0; var18 < this.field1365; ++var18) {
                            if (this.field1530[var18] == var12) {
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16 && this.field1475 == 0) {
                        try {
                            this.field1376[this.field1395] = var14;
                            this.field1395 = (this.field1395 + 1) % 100;
                            String var19 = WordPack.method316(0, this.field1531 - 13, this.field1327);
                            String var20 = WordFilter.method399(var19, 0);
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method435(false, "@cr1@" + JString.method313(JString.method310(var12, false), -19010), 7, var20);
                                } else {
                                    this.method435(false, JString.method313(JString.method310(var12, false), -19010), 3, var20);
                                }
                            } else {
                                this.method435(false, "@cr2@" + JString.method313(JString.method310(var12, false), -19010), 7, var20);
                            }
                        } catch (Exception var155) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 175) {
                    String var22 = this.field1327.method245();
                    if (var22.endsWith(":tradereq:")) {
                        String var23 = var22.substring(0, var22.indexOf(":"));
                        long var24 = JString.method309(var23);
                        boolean var26 = false;
                        for (int var27 = 0; var27 < this.field1365; ++var27) {
                            if (this.field1530[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                        if (!var26 && this.field1475 == 0) {
                            this.method435(false, var23, 4, "wishes to trade with you.");
                        }
                    } else if (!var22.endsWith(":duelreq:")) {
                        this.method435(false, "", 0, var22);
                    } else {
                        String var28 = var22.substring(0, var22.indexOf(":"));
                        long var29 = JString.method309(var28);
                        boolean var31 = false;
                        for (int var32 = 0; var32 < this.field1365; ++var32) {
                            if (this.field1530[var32] == var29) {
                                var31 = true;
                                break;
                            }
                        }
                        if (!var31 && this.field1475 == 0) {
                            this.method435(false, var28, 8, "wishes to duel with you.");
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 181) {
                    this.field1365 = this.field1531 / 8;
                    for (int var33 = 0; var33 < this.field1365; ++var33) {
                        this.field1530[var33] = this.field1327.method244(true);
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 229) {
                    int var34 = this.field1327.method240();
                    int var35 = this.field1327.method240();
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1492 = true;
                    }
                    if (this.field1195) {
                        this.field1195 = false;
                        this.field1492 = true;
                    }
                    this.field1217 = var34;
                    this.field1237 = var35;
                    this.field1623 = true;
                    this.field1589 = true;
                    this.field1385 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 238) {
                    this.field1193 = this.field1327.method243();
                    this.field1392 = this.field1327.method240();
                    this.field1339 = this.field1327.method238();
                    this.field1484 = this.field1327.method240();
                    this.field1292 = this.field1327.method238();
                    if (this.field1193 != 0 && this.field1217 == -1) {
                        signlink.dnslookup(JString.method312(this.field1193, 767));
                        this.method517(-361);
                        short var36 = 650;
                        if (this.field1339 != 201 || this.field1292 == 1) {
                            var36 = 655;
                        }
                        this.field1575 = "";
                        this.field1211 = false;
                        for (int var37 = 0; var37 < Component.field70.length; ++var37) {
                            if (Component.field70[var37] != null && Component.field70[var37].field79 == var36) {
                                this.field1217 = Component.field70[var37].field76;
                                break;
                            }
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 161) {
                    this.method485(this.field1531, this.field1327, 45228);
                    this.field1191 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 243) {
                    this.field1620 = this.field1327.method238();
                    if (this.field1620 == 1) {
                        this.field1262 = this.field1327.method240();
                    }
                    if (this.field1620 >= 2 && this.field1620 <= 6) {
                        if (this.field1620 == 2) {
                            this.field1285 = 64;
                            this.field1286 = 64;
                        }
                        if (this.field1620 == 3) {
                            this.field1285 = 0;
                            this.field1286 = 64;
                        }
                        if (this.field1620 == 4) {
                            this.field1285 = 128;
                            this.field1286 = 64;
                        }
                        if (this.field1620 == 5) {
                            this.field1285 = 64;
                            this.field1286 = 0;
                        }
                        if (this.field1620 == 6) {
                            this.field1285 = 64;
                            this.field1286 = 128;
                        }
                        this.field1620 = 2;
                        this.field1282 = this.field1327.method240();
                        this.field1283 = this.field1327.method240();
                        this.field1284 = this.field1327.method238();
                    }
                    if (this.field1620 == 10) {
                        this.field1601 = this.field1327.method240();
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 135) {
                    int var38 = this.field1327.method240();
                    int var39 = this.field1327.method240();
                    int var40 = var39 >> 10 & 31;
                    int var41 = var39 >> 5 & 31;
                    int var42 = var39 & 31;
                    Component.field70[var38].field113 = (var42 << 3) + (var40 << 19) + (var41 << 11);
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 56) {
                    this.field1259 = false;
                    this.field1195 = true;
                    this.field1391 = "";
                    this.field1492 = true;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 7) {
                    int var43 = this.field1327.method240();
                    this.method499(this.field1279, var43);
                    if (this.field1237 != -1) {
                        this.field1237 = -1;
                        this.field1623 = true;
                        this.field1589 = true;
                    }
                    this.field1350 = var43;
                    this.field1492 = true;
                    this.field1217 = -1;
                    this.field1385 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 151 || this.field1532 == 188 || this.field1532 == 190 || this.field1532 == 141 || this.field1532 == 187 || this.field1532 == 13 || this.field1532 == 94 || this.field1532 == 71 || this.field1532 == 198 || this.field1532 == 119) {
                    this.method503(this.field1327, (byte) 3, this.field1532);
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 96) {
                    int var44 = this.field1327.method240();
                    if (var44 == 65535) {
                        var44 = -1;
                    }
                    if (this.field1205 != var44 && this.field1556 && !field1488) {
                        this.field1340 = var44;
                        this.field1341 = true;
                        this.field1576.method288(2, this.field1340);
                    }
                    this.field1205 = var44;
                    this.field1270 = 0;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 39) {
                    int var45 = this.field1327.method240();
                    int var46 = this.field1327.method240();
                    if (this.field1556 && !field1488) {
                        this.field1340 = var45;
                        this.field1341 = false;
                        this.field1576.method288(2, this.field1340);
                        this.field1270 = var46;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 225) {
                    int var47 = this.field1327.method240();
                    boolean var48 = this.field1327.method238() == 1;
                    Component.field70[var47].field91 = var48;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 143) {
                    int var49 = this.field1327.method240();
                    Component var50 = Component.field70[var49];
                    for (int var51 = 0; var51 < var50.field71.length; ++var51) {
                        var50.field71[var51] = -1;
                        var50.field71[var51] = 0;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 26) {
                    this.field1614 = this.field1327.method240() * 30;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 209) {
                    int var52 = this.field1327.method240();
                    int var53 = this.field1327.method238();
                    int var54 = this.field1327.method240();
                    if (this.field1579 && !field1488 && this.field1608 < 50) {
                        this.field1203[this.field1608] = var52;
                        this.field1550[this.field1608] = var53;
                        this.field1598[this.field1608] = Wave.field901[var52] + var54;
                        ++this.field1608;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 109) {
                    long var55 = this.field1327.method244(true);
                    int var57 = this.field1327.method238();
                    String var58 = JString.method313(JString.method310(var55, false), -19010);
                    for (int var59 = 0; var59 < this.field1363; ++var59) {
                        if (this.field1372[var59] == var55) {
                            if (this.field1456[var59] != var57) {
                                this.field1456[var59] = var57;
                                this.field1623 = true;
                                if (var57 > 0) {
                                    this.method435(false, "", 5, var58 + " has logged in.");
                                }
                                if (var57 == 0) {
                                    this.method435(false, "", 5, var58 + " has logged out.");
                                }
                            }
                            var58 = null;
                            break;
                        }
                    }
                    if (var58 != null && this.field1363 < 200) {
                        this.field1372[this.field1363] = var55;
                        this.field1536[this.field1363] = var58;
                        this.field1456[this.field1363] = var57;
                        ++this.field1363;
                        this.field1623 = true;
                    }
                    boolean var60 = false;
                    while (!var60) {
                        var60 = true;
                        for (int var61 = 0; var61 < this.field1363 - 1; ++var61) {
                            if (this.field1456[var61] != field1485 && this.field1456[var61 + 1] == field1485 || this.field1456[var61] == 0 && this.field1456[var61 + 1] != 0) {
                                int var62 = this.field1456[var61];
                                this.field1456[var61] = this.field1456[var61 + 1];
                                this.field1456[var61 + 1] = var62;
                                String var63 = this.field1536[var61];
                                this.field1536[var61] = this.field1536[var61 + 1];
                                this.field1536[var61 + 1] = var63;
                                long var64 = this.field1372[var61];
                                this.field1372[var61] = this.field1372[var61 + 1];
                                this.field1372[var61 + 1] = var64;
                                this.field1623 = true;
                                var60 = false;
                            }
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 2) {
                    this.field1428 = this.field1327.method238();
                    this.field1577 = this.field1327.method238();
                    this.field1489 = this.field1327.method238();
                    this.field1478 = true;
                    this.field1492 = true;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 36) {
                    this.method554(-956);
                    this.field1532 = -1;
                    return false;
                }
                if (this.field1532 == 28) {
                    InputTracking.method44(7);
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 174) {
                    if (this.field1237 != -1) {
                        this.field1237 = -1;
                        this.field1623 = true;
                        this.field1589 = true;
                    }
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1492 = true;
                    }
                    if (this.field1195) {
                        this.field1195 = false;
                        this.field1492 = true;
                    }
                    this.field1217 = -1;
                    this.field1385 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 29) {
                    int var66 = this.field1327.method240();
                    int var67 = this.field1327.method238();
                    if (var66 == 65535) {
                        var66 = -1;
                    }
                    this.field1631[var67] = var66;
                    this.field1623 = true;
                    this.field1589 = true;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 132) {
                    this.field1192 = this.field1327.method238();
                    if (this.field1450 == this.field1192) {
                        if (this.field1192 == 3) {
                            this.field1450 = 1;
                        } else {
                            this.field1450 = 3;
                        }
                        this.field1623 = true;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 25) {
                    for (int var68 = 0; var68 < this.field1472.length; ++var68) {
                        if (this.field1472[var68] != this.field1261[var68]) {
                            this.field1472[var68] = this.field1261[var68];
                            this.method437(238, var68);
                            this.field1623 = true;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 156) {
                    this.field1623 = true;
                    int var69 = this.field1327.method240();
                    Component var70 = Component.field70[var69];
                    int var71 = this.field1327.method238();
                    for (int var72 = 0; var72 < var71; ++var72) {
                        var70.field71[var72] = this.field1327.method240();
                        int var73 = this.field1327.method238();
                        if (var73 == 255) {
                            var73 = this.field1327.method243();
                        }
                        var70.field72[var72] = var73;
                    }
                    for (int var74 = var71; var74 < var70.field71.length; ++var74) {
                        var70.field71[var74] = 0;
                        var70.field72[var74] = 0;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 32) {
                    int var75 = this.field1327.method240();
                    String var76 = this.field1327.method245();
                    Component.field70[var75].field111 = var76;
                    if (this.field1631[this.field1450] == Component.field70[var75].field76) {
                        this.field1623 = true;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 140) {
                    this.field1596 = this.field1327.method238();
                    this.field1597 = this.field1327.method238();
                    for (int var77 = this.field1596; var77 < this.field1596 + 8; ++var77) {
                        for (int var78 = this.field1597; var78 < this.field1597 + 8; ++var78) {
                            if (this.field1289[this.field1587][var77][var78] != null) {
                                this.field1289[this.field1587][var77][var78] = null;
                                this.method434(var77, var78);
                            }
                        }
                    }
                    for (LocSpawned var79 = (LocSpawned) this.field1448.method257(); var79 != null; var79 = (LocSpawned) this.field1448.method259(-327)) {
                        if (var79.field732 >= this.field1596 && var79.field732 < this.field1596 + 8 && var79.field733 >= this.field1597 && var79.field733 < this.field1597 + 8 && this.field1587 == var79.field730) {
                            var79.field741 = 0;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 76) {
                    int var80 = this.field1327.method240();
                    int var81 = this.field1327.method240();
                    Component.field70[var80].field119 = 2;
                    Component.field70[var80].field120 = var81;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 75) {
                    int var82 = this.field1327.method240();
                    int var83 = this.field1327.method243();
                    this.field1261[var82] = var83;
                    if (this.field1472[var82] != var83) {
                        this.field1472[var82] = var83;
                        this.method437(238, var82);
                        this.field1623 = true;
                        if (this.field1260 != -1) {
                            this.field1492 = true;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 134) {
                    this.field1373 = false;
                    for (int var84 = 0; var84 < 5; ++var84) {
                        this.field1303[var84] = false;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 226) {
                    int var85 = this.field1327.method240();
                    int var86 = this.field1327.method240();
                    Component var87 = Component.field70[var85];
                    if (var87 != null && var87.field77 == 0) {
                        if (var86 < 0) {
                            var86 = 0;
                        }
                        if (var86 > var87.field89 - var87.field81) {
                            var86 = var87.field89 - var87.field81;
                        }
                        var87.field90 = var86;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 103) {
                    int var88 = this.field1327.method238();
                    int var89 = this.field1327.method238();
                    int var90 = this.field1327.method238();
                    int var91 = this.field1327.method238();
                    this.field1303[var88] = true;
                    this.field1291[var88] = var89;
                    this.field1277[var88] = var90;
                    this.field1441[var88] = var91;
                    this.field1316[var88] = 0;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 123) {
                    this.field1373 = true;
                    this.field1231 = this.field1327.method238();
                    this.field1232 = this.field1327.method238();
                    this.field1233 = this.field1327.method240();
                    this.field1234 = this.field1327.method238();
                    this.field1235 = this.field1327.method238();
                    if (this.field1235 >= 100) {
                        int var92 = this.field1231 * 128 + 64;
                        int var93 = this.field1232 * 128 + 64;
                        int var94 = this.method526(var93, this.field1587, var92, (byte) 2) - this.field1233;
                        int var95 = var92 - this.field1317;
                        int var96 = var94 - this.field1318;
                        int var97 = var93 - this.field1319;
                        int var98 = (int) Math.sqrt((double) (var95 * var95 + var97 * var97));
                        this.field1320 = (int) (Math.atan2((double) var96, (double) var98) * 325.949D) & 2047;
                        this.field1321 = (int) (Math.atan2((double) var95, (double) var97) * -325.949D) & 2047;
                        if (this.field1320 < 128) {
                            this.field1320 = 128;
                        }
                        if (this.field1320 > 383) {
                            this.field1320 = 383;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 95) {
                    this.field1623 = true;
                    int var99 = this.field1327.method240();
                    Component var100 = Component.field70[var99];
                    while (this.field1327.field713 < this.field1531) {
                        int var101 = this.field1327.method238();
                        int var102 = this.field1327.method240();
                        int var103 = this.field1327.method238();
                        if (var103 == 255) {
                            var103 = this.field1327.method243();
                        }
                        if (var101 >= 0 && var101 < var100.field71.length) {
                            var100.field71[var101] = var102;
                            var100.field72[var101] = var103;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 110) {
                    this.field1623 = true;
                    int var104 = this.field1327.method238();
                    int var105 = this.field1327.method243();
                    int var106 = this.field1327.method238();
                    this.field1440[var104] = var105;
                    this.field1212[var104] = var106;
                    this.field1497[var104] = 1;
                    for (int var107 = 0; var107 < 98; ++var107) {
                        if (var105 >= field1253[var107]) {
                            this.field1497[var104] = var107 + 2;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 66) {
                    int var108 = this.field1327.method240();
                    int var109 = this.field1327.method240();
                    if (this.field1228 == var108 && this.field1229 == var109 && this.field1509 == 2) {
                        this.field1532 = -1;
                        return true;
                    }
                    this.field1228 = var108;
                    this.field1229 = var109;
                    this.field1266 = (this.field1228 - 6) * 8;
                    this.field1267 = (this.field1229 - 6) * 8;
                    this.field1390 = false;
                    if ((this.field1228 / 8 == 48 || this.field1228 / 8 == 49) && this.field1229 / 8 == 48) {
                        this.field1390 = true;
                    }
                    if (this.field1228 / 8 == 48 && this.field1229 / 8 == 148) {
                        this.field1390 = true;
                    }
                    this.field1509 = 1;
                    this.field1230 = System.currentTimeMillis();
                    this.field1426.method267(this.field1378);
                    this.field1300.method213(0, 257, 151, "Loading - please wait.", -977);
                    this.field1300.method213(16777215, 256, 150, "Loading - please wait.", -977);
                    this.field1426.method268(4, (byte) 107, super.field13, 4);
                    int var110 = 0;
                    for (int var111 = (this.field1228 - 6) / 8; var111 <= (this.field1228 + 6) / 8; ++var111) {
                        for (int var112 = (this.field1229 - 6) / 8; var112 <= (this.field1229 + 6) / 8; ++var112) {
                            ++var110;
                        }
                    }
                    this.field1227 = new byte[var110][];
                    this.field1554 = new byte[var110][];
                    this.field1547 = new int[var110];
                    this.field1548 = new int[var110];
                    this.field1549 = new int[var110];
                    int var113 = 0;
                    for (int var114 = (this.field1228 - 6) / 8; var114 <= (this.field1228 + 6) / 8; ++var114) {
                        for (int var115 = (this.field1229 - 6) / 8; var115 <= (this.field1229 + 6) / 8; ++var115) {
                            this.field1547[var113] = (var114 << 8) + var115;
                            if (this.field1390 && (var115 == 49 || var115 == 149 || var115 == 147 || var114 == 50 || var114 == 49 && var115 == 47)) {
                                this.field1548[var113] = -1;
                                this.field1549[var113] = -1;
                                ++var113;
                            } else {
                                int var116 = this.field1548[var113] = this.field1576.method283(0, var114, var115, 7);
                                if (var116 != -1) {
                                    this.field1576.method288(3, var116);
                                }
                                int var117 = this.field1549[var113] = this.field1576.method283(1, var114, var115, 7);
                                if (var117 != -1) {
                                    this.field1576.method288(3, var117);
                                }
                                ++var113;
                            }
                        }
                    }
                    int var118 = this.field1266 - this.field1268;
                    int var119 = this.field1267 - this.field1269;
                    this.field1268 = this.field1266;
                    this.field1269 = this.field1267;
                    for (int var120 = 0; var120 < 8192; ++var120) {
                        NpcEntity var121 = this.field1480[var120];
                        if (var121 != null) {
                            for (int var122 = 0; var122 < 10; ++var122) {
                                var121.field463[var122] -= var118;
                                var121.field464[var122] -= var119;
                            }
                            var121.field414 -= var118 * 128;
                            var121.field415 -= var119 * 128;
                        }
                    }
                    for (int var123 = 0; var123 < this.field1519; ++var123) {
                        PlayerEntity var124 = this.field1521[var123];
                        if (var124 != null) {
                            for (int var125 = 0; var125 < 10; ++var125) {
                                var124.field463[var125] -= var118;
                                var124.field464[var125] -= var119;
                            }
                            var124.field414 -= var118 * 128;
                            var124.field415 -= var119 * 128;
                        }
                    }
                    this.field1191 = true;
                    byte var126 = 0;
                    byte var127 = 104;
                    byte var128 = 1;
                    if (var118 < 0) {
                        var126 = 103;
                        var127 = -1;
                        var128 = -1;
                    }
                    byte var129 = 0;
                    byte var130 = 104;
                    byte var131 = 1;
                    if (var119 < 0) {
                        var129 = 103;
                        var130 = -1;
                        var131 = -1;
                    }
                    for (int var132 = var126; var127 != var132; var132 += var128) {
                        for (int var133 = var129; var130 != var133; var133 += var131) {
                            int var134 = var118 + var132;
                            int var135 = var119 + var133;
                            for (int var136 = 0; var136 < 4; ++var136) {
                                if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
                                    this.field1289[var136][var132][var133] = this.field1289[var136][var134][var135];
                                } else {
                                    this.field1289[var136][var132][var133] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var137 = (LocSpawned) this.field1448.method257(); var137 != null; var137 = (LocSpawned) this.field1448.method259(-327)) {
                        var137.field732 -= var118;
                        var137.field733 -= var119;
                        if (var137.field732 < 0 || var137.field733 < 0 || var137.field732 >= 104 || var137.field733 >= 104) {
                            var137.method119();
                        }
                    }
                    if (this.field1272 != 0) {
                        this.field1272 -= var118;
                        this.field1273 -= var119;
                    }
                    this.field1373 = false;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 115) {
                    int var138 = this.field1327.method241();
                    this.field1451 = var138;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 144) {
                    for (int var139 = 0; var139 < this.field1521.length; ++var139) {
                        if (this.field1521[var139] != null) {
                            this.field1521[var139].field442 = -1;
                        }
                    }
                    for (int var140 = 0; var140 < this.field1480.length; ++var140) {
                        if (this.field1480[var140] != null) {
                            this.field1480[var140].field442 = -1;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 108) {
                    this.field1504 = 255;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 35) {
                    this.field1194 = this.field1327.method238();
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 70) {
                    if (this.field1450 == 12) {
                        this.field1623 = true;
                    }
                    this.field1238 = this.field1327.method241();
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 83) {
                    int var141 = this.field1327.method240();
                    Component.field70[var141].field119 = 3;
                    Component.field70[var141].field120 = (field1527.field480[8] << 6) + (field1527.field480[0] << 12) + (field1527.field481[0] << 24) + (field1527.field481[4] << 18) + field1527.field480[11];
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 153) {
                    int var142 = this.field1327.method240();
                    int var143 = this.field1327.method240();
                    int var144 = this.field1327.method240();
                    ObjType var145 = ObjType.method348(var143);
                    Component.field70[var142].field119 = 4;
                    Component.field70[var142].field120 = var143;
                    Component.field70[var142].field126 = var145.field1039;
                    Component.field70[var142].field127 = var145.field1040;
                    Component.field70[var142].field125 = var145.field1038 * 100 / var144;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 86) {
                    this.field1373 = true;
                    this.field1411 = this.field1327.method238();
                    this.field1412 = this.field1327.method238();
                    this.field1413 = this.field1327.method240();
                    this.field1414 = this.field1327.method238();
                    this.field1415 = this.field1327.method238();
                    if (this.field1415 >= 100) {
                        this.field1317 = this.field1411 * 128 + 64;
                        this.field1319 = this.field1412 * 128 + 64;
                        this.field1318 = this.method526(this.field1319, this.field1587, this.field1317, (byte) 2) - this.field1413;
                    }
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 230) {
                    int var146 = this.field1327.method240();
                    int var147 = this.field1327.method241();
                    int var148 = this.field1327.method241();
                    Component var149 = Component.field70[var146];
                    var149.field83 = var147;
                    var149.field84 = var148;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 233) {
                    this.field1272 = 0;
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 208) {
                    if (this.field1450 == 12) {
                        this.field1623 = true;
                    }
                    this.field1543 = this.field1327.method238();
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 49) {
                    this.field1594 = this.field1327.method240();
                    this.field1624 = this.field1327.method238();
                    this.field1532 = -1;
                    return true;
                }
                if (this.field1532 == 192) {
                    int var150 = this.field1327.method240();
                    byte var151 = this.field1327.method239();
                    this.field1261[var150] = var151;
                    if (this.field1472[var150] != var151) {
                        this.field1472[var150] = var151;
                        this.method437(238, var150);
                        this.field1623 = true;
                        if (this.field1260 != -1) {
                            this.field1492 = true;
                        }
                    }
                    this.field1532 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1532 + "," + this.field1531 + " - " + this.field1418 + "," + this.field1419);
                this.method554(-956);
            } catch (IOException var156) {
                this.method507(22095);
            } catch (Exception var157) {
                String var153 = "T2 - " + this.field1532 + "," + this.field1418 + "," + this.field1419 + " - " + this.field1531 + "," + (field1527.field463[0] + this.field1266) + "," + (field1527.field464[0] + this.field1267) + " - ";
                for (int var154 = 0; var154 < this.field1531 && var154 < 50; ++var154) {
                    var153 = var153 + this.field1327.field712[var154] + ",";
                }
                signlink.reporterror(var153);
                this.method554(-956);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg4 & 2047;
        if (arg6 != 9) {
            this.field1532 = this.field1327.method238();
        }
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = Model.field613[var8];
            int var14 = Model.field614[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field613[var9];
            int var17 = Model.field614[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1317 = arg3 - var10;
        this.field1318 = arg1 - var11;
        this.field1319 = arg2 - var12;
        this.field1320 = arg0;
        this.field1321 = arg4;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method451(int arg0) {
        this.field1633 = new Pix8(this.field1278, "titlebox", 0);
        this.field1634 = new Pix8(this.field1278, "titlebutton", 0);
        this.field1551 = new Pix8[12];
        if (arg0 != 19831) {
            this.field1602 = this.field1379.method304();
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1551[var2] = new Pix8(this.field1278, "runes", var2);
        }
        this.field1275 = new Pix32(128, 265);
        this.field1276 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1275.field670[var3] = this.field1561.field752[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1276.field670[var4] = this.field1562.field752[var4];
        }
        this.field1360 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1360[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1360[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1360[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1360[var8 + 192] = 16777215;
        }
        this.field1361 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1361[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1361[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1361[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1361[var12 + 192] = 16777215;
        }
        this.field1362 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1362[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1362[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1362[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1362[var16 + 192] = 16777215;
        }
        this.field1359 = new int[256];
        this.field1591 = new int[32768];
        this.field1592 = new int[32768];
        this.method454(50, (Pix8) null);
        this.field1432 = new int[32768];
        this.field1433 = new int[32768];
        this.method13((byte) 7, "Connecting to fileserver", 10);
        if (!this.field1529) {
            this.field1263 = true;
            this.field1529 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field1250.method89(arg3, arg0, arg1);
        if (var7 != 0) {
            int var8 = this.field1250.method93(arg3, arg0, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field1274.field670;
            int var13 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method333(var14);
            if (var15.field966 != -1) {
                Pix8 var16 = this.field1307[var15.field966];
                if (var16 != null) {
                    int var17 = (var15.field951 * 4 - var16.field684) / 2;
                    int var18 = (var15.field952 * 4 - var16.field685) / 2;
                    var16.method211(arg0 * 4 + 48 + var17, 200, (104 - arg1 - var15.field952) * 4 + 48 + var18);
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
        int var19 = this.field1250.method91(arg3, arg0, arg1);
        if (this.field1335 != arg5) {
            for (int var20 = 1; var20 > 0; ++var20) {
            }
        }
        if (var19 != 0) {
            int var21 = this.field1250.method93(arg3, arg0, arg1, var19);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var19 >> 14 & 32767;
            LocType var25 = LocType.method333(var24);
            if (var25.field966 != -1) {
                Pix8 var26 = this.field1307[var25.field966];
                if (var26 != null) {
                    int var27 = (var25.field951 * 4 - var26.field684) / 2;
                    int var28 = (var25.field952 * 4 - var26.field685) / 2;
                    var26.method211(arg0 * 4 + 48 + var27, 200, (104 - arg1 - var25.field952) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var19 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field1274.field670;
                int var31 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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
        int var32 = this.field1250.method92(arg3, arg0, arg1);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            LocType var34 = LocType.method333(var33);
            if (var34.field966 != -1) {
                Pix8 var35 = this.field1307[var34.field966];
                if (var35 != null) {
                    int var36 = (var34.field951 * 4 - var35.field684) / 2;
                    int var37 = (var34.field952 * 4 - var35.field685) / 2;
                    var35.method211(arg0 * 4 + 48 + var36, 200, (104 - arg1 - var34.field952) * 4 + 48 + var37);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 51 / arg3;
        if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
            if (field1488 && this.field1587 != arg7) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg4 == 0) {
                var10 = this.field1250.method89(arg7, arg6, arg1);
            }
            if (arg4 == 1) {
                var10 = this.field1250.method90(arg7, arg6, arg1, 3);
            }
            if (arg4 == 2) {
                var10 = this.field1250.method91(arg7, arg6, arg1);
            }
            if (arg4 == 3) {
                var10 = this.field1250.method92(arg7, arg6, arg1);
            }
            if (var10 != 0) {
                int var14 = this.field1250.method93(arg7, arg6, arg1, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg4 == 0) {
                    this.field1250.method80(true, arg1, arg7, arg6);
                    LocType var18 = LocType.method333(var15);
                    if (var18.field953) {
                        this.field1574[arg7].method364(arg1, var17, arg6, 3, var16, var18.field954);
                    }
                }
                if (arg4 == 1) {
                    this.field1250.method81(false, arg6, arg7, arg1);
                }
                if (arg4 == 2) {
                    this.field1250.method82(arg1, false, arg7, arg6);
                    LocType var19 = LocType.method333(var15);
                    if (var19.field951 + arg6 > 103 || var19.field951 + arg1 > 103 || var19.field952 + arg6 > 103 || var19.field952 + arg1 > 103) {
                        return;
                    }
                    if (var19.field953) {
                        this.field1574[arg7].method365(5, arg6, var19.field951, arg1, var19.field954, var17, var19.field952);
                    }
                }
                if (arg4 == 3) {
                    this.field1250.method83(arg6, 876, arg7, arg1);
                    LocType var20 = LocType.method333(var15);
                    if (var20.field953 && var20.field955) {
                        this.field1574[arg7].method367(arg1, (byte) 1, arg6);
                    }
                }
            }
            if (arg5 >= 0) {
                int var21 = arg7;
                if (arg7 < 3 && (this.field1621[1][arg6][arg1] & 2) == 2) {
                    var21 = arg7 + 1;
                }
                World.method31(this.field1557, this.field1250, (byte) 32, arg7, arg1, arg6, arg5, var21, arg0, this.field1574[arg7], arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;)V")
    public final void method454(int arg0, Pix8 arg1) {
        short var3 = 256;
        int var4 = 31 / arg0;
        for (int var5 = 0; var5 < this.field1591.length; ++var5) {
            this.field1591[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1591[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field1592[var17] = (this.field1591[var17 - 1] + this.field1591[var17 + 1] + this.field1591[var17 - 128] + this.field1591[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field1591;
            this.field1591 = this.field1592;
            this.field1592 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field685; ++var9) {
                for (int var10 = 0; var10 < arg1.field684; ++var10) {
                    if (arg1.field682[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field686;
                        int var12 = var9 + 16 + arg1.field687;
                        int var13 = (var12 << 7) + var11;
                        this.field1591[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IB)V")
    private final void method455(Packet arg0, int arg1, byte arg2) {
        for (int var4 = 0; var4 < this.field1524; ++var4) {
            int var5 = this.field1525[var4];
            PlayerEntity var6 = this.field1521[var5];
            int var7 = arg0.method238();
            if ((var7 & 128) == 128) {
                var7 += arg0.method238() << 8;
            }
            this.method548((byte) 3, var7, var5, var6, arg0);
        }
        if (arg2 != 5) {
            this.field1204.method228(230);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1448.method257(); var12 != null; var12 = (LocSpawned) this.field1448.method259(-327)) {
            if (var12.field730 == arg2 && var12.field732 == arg8 && var12.field733 == arg5 && var12.field731 == arg1) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field730 = arg2;
            var11.field731 = arg1;
            var11.field732 = arg8;
            var11.field733 = arg5;
            this.method521((byte) 6, var11);
            this.field1448.method254(var11);
        }
        var11.field737 = arg0;
        var11.field739 = arg9;
        var11.field738 = arg4;
        var11.field740 = arg6;
        while (arg3 >= 0) {
            for (int var13 = 1; var13 > 0; ++var13) {
            }
        }
        var11.field741 = arg7;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method457(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method458(boolean arg0, byte arg1) {
        if (arg1 == 3) {
            for (int var3 = 0; var3 < this.field1481; ++var3) {
                NpcEntity var4 = this.field1480[this.field1482[var3]];
                int var5 = (this.field1482[var3] << 14) + 536870912;
                if (var4 != null && var4.method126(this.field1514) && var4.field471.field1017 == arg0) {
                    int var6 = var4.field414 >> 7;
                    int var7 = var4.field415 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field418 == 1 && (var4.field414 & 127) == 64 && (var4.field415 & 127) == 64) {
                            if (this.field1616[var6][var7] == this.field1630) {
                                continue;
                            }
                            this.field1616[var6][var7] = this.field1630;
                        }
                        this.field1250.method74((var4.field418 - 1) * 64 + 60, var4.field415, var4.field416, var4.field414, var5, this.field1587, var4.field417, this.method526(var4.field415, this.field1587, var4.field414, (byte) 2), 9, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLz;I)V")
    public final void method459(boolean arg0, PathingEntity arg1, int arg2) {
        this.method460(arg1.field415, arg2, arg1.field414, -969);
        if (arg0) {
            this.field1532 = this.field1327.method238();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method526(arg0, this.field1587, arg2, (byte) 2) - arg1;
            int var6 = arg2 - this.field1317;
            while (arg3 >= 0) {
            }
            int var7 = var5 - this.field1318;
            int var8 = arg0 - this.field1319;
            int var9 = Model.field613[this.field1320];
            int var10 = Model.field614[this.field1320];
            int var11 = Model.field613[this.field1321];
            int var12 = Model.field614[this.field1321];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1342 = (var13 << 9) / var17 + Pix3D.field649;
                this.field1343 = (var16 << 9) / var17 + Pix3D.field650;
            } else {
                this.field1342 = -1;
                this.field1343 = -1;
            }
        } else {
            this.field1342 = -1;
            this.field1343 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method461(boolean arg0) {
        this.field1371 &= arg0;
        Graphics var2 = this.method11(-66).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, (byte) -99);
        if (this.field1455) {
            this.field1529 = false;
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
        if (this.field1280) {
            this.field1529 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1309) {
            this.field1529 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method462(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1195) {
                this.field1195 = false;
                this.field1492 = true;
            }
            int var3 = this.field1539[arg1];
            int var4 = this.field1540[arg1];
            int var5 = this.field1541[arg1];
            int var6 = this.field1542[arg1];
            if (arg0 != -2) {
                this.field1476 = !this.field1476;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 465) {
                this.field1204.method227(9, 177);
                this.field1204.method229(var4);
                Component var7 = Component.field70[var4];
                if (var7.field85 != null && var7.field85[0][0] == 5) {
                    int var8 = var7.field85[0][1];
                    this.field1472[var8] = 1 - this.field1472[var8];
                    this.method437(238, var8);
                    this.field1623 = true;
                }
            }
            if (var5 == 881) {
                this.field1204.method227(9, 126);
                this.field1204.method229(var6);
                this.field1204.method229(var3);
                this.field1204.method229(var4);
                this.field1204.method229(this.field1438);
                this.field1204.method229(this.field1436);
                this.field1204.method229(this.field1437);
                this.field1635 = 0;
                this.field1636 = var4;
                this.field1637 = var3;
                this.field1638 = 2;
                if (Component.field70[var4].field76 == this.field1217) {
                    this.field1638 = 1;
                }
                if (Component.field70[var4].field76 == this.field1350) {
                    this.field1638 = 3;
                }
            }
            if (var5 == 1102) {
                ObjType var9 = ObjType.method348(var6);
                String var10;
                if (var9.field1035 != null) {
                    var10 = new String(var9.field1035);
                } else {
                    var10 = "It's a " + var9.field1034 + ".";
                }
                this.method435(false, "", 0, var10);
            }
            if (var5 == 581) {
                if ((var6 & 3) == 0) {
                    ++field1377;
                }
                if (field1377 >= 99) {
                    this.field1204.method227(9, 87);
                    this.field1204.method232(0);
                }
                this.method540((byte) 39, var6, 204, var3, var4);
            }
            if (var5 == 1607) {
                NpcEntity var11 = this.field1480[var6];
                if (var11 != null) {
                    String var12;
                    if (var11.field471.field997 != null) {
                        var12 = new String(var11.field471.field997);
                    } else {
                        var12 = "It's a " + var11.field471.field996 + ".";
                    }
                    this.method435(false, "", 0, var12);
                }
            }
            if (var5 == 1175) {
                int var13 = var6 >> 14 & 32767;
                LocType var14 = LocType.method333(var13);
                String var15;
                if (var14.field948 != null) {
                    var15 = new String(var14.field948);
                } else {
                    var15 = "It's a " + var14.field947 + ".";
                }
                this.method435(false, "", 0, var15);
            }
            if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                NpcEntity var16 = this.field1480[var6];
                if (var16 != null) {
                    this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var16.field463[0], false, var16.field464[0], field1527.field463[0]);
                    this.field1310 = super.field28;
                    this.field1311 = super.field29;
                    this.field1313 = 2;
                    this.field1312 = 0;
                    if (var5 == 728) {
                        this.field1204.method227(9, 180);
                    }
                    if (var5 == 963) {
                        this.field1204.method227(9, 107);
                    }
                    if (var5 == 542) {
                        this.field1204.method227(9, 252);
                    }
                    if (var5 == 6) {
                        if ((var6 & 3) == 0) {
                            ++field1599;
                        }
                        if (field1599 >= 124) {
                            this.field1204.method227(9, 95);
                            this.field1204.method232(0);
                        }
                        this.field1204.method227(9, 196);
                    }
                    if (var5 == 245) {
                        if ((var6 & 3) == 0) {
                            ++field1445;
                        }
                        if (field1445 >= 85) {
                            this.field1204.method227(9, 186);
                            this.field1204.method229(39596);
                        }
                        this.field1204.method227(9, 43);
                    }
                    this.field1204.method229(var6);
                }
            }
            if (var5 == 1773) {
                ObjType var17 = ObjType.method348(var6);
                String var18;
                if (var4 >= 100000) {
                    var18 = var4 + " x " + var17.field1034;
                } else if (var17.field1035 != null) {
                    var18 = new String(var17.field1035);
                } else {
                    var18 = "It's a " + var17.field1034 + ".";
                }
                this.method435(false, "", 0, var18);
            }
            if (var5 == 188) {
                this.field1435 = 1;
                this.field1436 = var3;
                this.field1437 = var4;
                this.field1438 = var6;
                this.field1439 = ObjType.method348(var6).field1034;
                this.field1329 = 0;
                this.field1623 = true;
            } else {
                if (var5 == 900) {
                    NpcEntity var19 = this.field1480[var6];
                    if (var19 != null) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var19.field463[0], false, var19.field464[0], field1527.field463[0]);
                        this.field1310 = super.field28;
                        this.field1311 = super.field29;
                        this.field1313 = 2;
                        this.field1312 = 0;
                        this.field1204.method227(9, 14);
                        this.field1204.method229(var6);
                        this.field1204.method229(this.field1438);
                        this.field1204.method229(this.field1436);
                        this.field1204.method229(this.field1437);
                    }
                }
                if (var5 == 217) {
                    boolean var20 = this.method429(0, 9, 0, 2, 0, field1527.field464[0], 0, 0, var3, false, var4, field1527.field463[0]);
                    if (!var20) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var3, false, var4, field1527.field463[0]);
                    }
                    this.field1310 = super.field28;
                    this.field1311 = super.field29;
                    this.field1313 = 2;
                    this.field1312 = 0;
                    this.field1204.method227(9, 143);
                    this.field1204.method229(this.field1266 + var3);
                    this.field1204.method229(this.field1267 + var4);
                    this.field1204.method229(var6);
                    this.field1204.method229(this.field1438);
                    this.field1204.method229(this.field1436);
                    this.field1204.method229(this.field1437);
                }
                if (var5 == 651) {
                    PlayerEntity var22 = this.field1521[var6];
                    if (var22 != null) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var22.field463[0], false, var22.field464[0], field1527.field463[0]);
                        this.field1310 = super.field28;
                        this.field1311 = super.field29;
                        this.field1313 = 2;
                        this.field1312 = 0;
                        this.field1204.method227(9, 52);
                        this.field1204.method229(var6);
                        this.field1204.method229(this.field1330);
                    }
                }
                if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                    if (var5 == 22) {
                        this.field1204.method227(9, 48);
                    }
                    if (var5 == 415) {
                        if ((var4 & 3) == 0) {
                            ++field1344;
                        }
                        if (field1344 >= 55) {
                            this.field1204.method227(9, 119);
                            this.field1204.method232(0);
                        }
                        this.field1204.method227(9, 242);
                    }
                    if (var5 == 892) {
                        if ((var3 & 3) == 0) {
                            ++field1334;
                        }
                        if (field1334 >= 130) {
                            this.field1204.method227(9, 233);
                            this.field1204.method228(177);
                        }
                        this.field1204.method227(9, 183);
                    }
                    if (var5 == 602) {
                        this.field1204.method227(9, 13);
                    }
                    if (var5 == 596) {
                        this.field1204.method227(9, 58);
                    }
                    this.field1204.method229(var6);
                    this.field1204.method229(var3);
                    this.field1204.method229(var4);
                    this.field1635 = 0;
                    this.field1636 = var4;
                    this.field1637 = var3;
                    this.field1638 = 2;
                    if (Component.field70[var4].field76 == this.field1217) {
                        this.field1638 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1350) {
                        this.field1638 = 3;
                    }
                }
                if (var5 == 951) {
                    Component var23 = Component.field70[var4];
                    boolean var24 = true;
                    if (var23.field79 > 0) {
                        var24 = this.method529((byte) 63, var23);
                    }
                    if (var24) {
                        this.field1204.method227(9, 177);
                        this.field1204.method229(var4);
                    }
                }
                if (var5 == 504) {
                    this.method540((byte) 39, var6, 219, var3, var4);
                }
                if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                    if (var5 == 38) {
                        this.field1204.method227(9, 193);
                    }
                    if (var5 == 347) {
                        this.field1204.method227(9, 9);
                    }
                    if (var5 == 478) {
                        if ((var3 & 3) == 0) {
                            ++field1600;
                        }
                        if (field1600 >= 90) {
                            this.field1204.method227(9, 74);
                        }
                        this.field1204.method227(9, 194);
                    }
                    if (var5 == 422) {
                        this.field1204.method227(9, 115);
                    }
                    if (var5 == 405) {
                        field1190 += var6;
                        if (field1190 >= 97) {
                            this.field1204.method227(9, 146);
                            this.field1204.method231(14953816);
                        }
                        this.field1204.method227(9, 104);
                    }
                    this.field1204.method229(var6);
                    this.field1204.method229(var3);
                    this.field1204.method229(var4);
                    this.field1635 = 0;
                    this.field1636 = var4;
                    this.field1637 = var3;
                    this.field1638 = 2;
                    if (Component.field70[var4].field76 == this.field1217) {
                        this.field1638 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1350) {
                        this.field1638 = 3;
                    }
                }
                if (var5 == 965) {
                    boolean var25 = this.method429(0, 9, 0, 2, 0, field1527.field464[0], 0, 0, var3, false, var4, field1527.field463[0]);
                    if (!var25) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var3, false, var4, field1527.field463[0]);
                    }
                    this.field1310 = super.field28;
                    this.field1311 = super.field29;
                    this.field1313 = 2;
                    this.field1312 = 0;
                    this.field1204.method227(9, 122);
                    this.field1204.method229(this.field1266 + var3);
                    this.field1204.method229(this.field1267 + var4);
                    this.field1204.method229(var6);
                    this.field1204.method229(this.field1330);
                }
                if (var5 == 367) {
                    PlayerEntity var27 = this.field1521[var6];
                    if (var27 != null) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var27.field463[0], false, var27.field464[0], field1527.field463[0]);
                        this.field1310 = super.field28;
                        this.field1311 = super.field29;
                        this.field1313 = 2;
                        this.field1312 = 0;
                        this.field1204.method227(9, 210);
                        this.field1204.method229(var6);
                        this.field1204.method229(this.field1438);
                        this.field1204.method229(this.field1436);
                        this.field1204.method229(this.field1437);
                    }
                }
                if (var5 == 947) {
                    this.method517(-361);
                }
                if (var5 == 44 && !this.field1385) {
                    this.field1204.method227(9, 239);
                    this.field1204.method229(var4);
                    this.field1385 = true;
                }
                if (var5 == 1501) {
                    field1374 += this.field1267;
                    if (field1374 >= 92) {
                        this.field1204.method227(9, 250);
                        this.field1204.method232(0);
                    }
                    this.method540((byte) 39, var6, 86, var3, var4);
                }
                if (var5 == 960) {
                    this.field1204.method227(9, 177);
                    this.field1204.method229(var4);
                    Component var28 = Component.field70[var4];
                    if (var28.field85 != null && var28.field85[0][0] == 5) {
                        int var29 = var28.field85[0][1];
                        if (this.field1472[var29] != var28.field87[0]) {
                            this.field1472[var29] = var28.field87[0];
                            this.method437(238, var29);
                            this.field1623 = true;
                        }
                    }
                }
                if (var5 == 364) {
                    this.method540((byte) 39, var6, 226, var3, var4);
                }
                if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                    PlayerEntity var30 = this.field1521[var6];
                    if (var30 != null) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var30.field463[0], false, var30.field464[0], field1527.field463[0]);
                        this.field1310 = super.field28;
                        this.field1311 = super.field29;
                        this.field1313 = 2;
                        this.field1312 = 0;
                        if (var5 == 1101) {
                            this.field1204.method227(9, 135);
                        }
                        if (var5 == 1373) {
                            this.field1204.method227(9, 54);
                        }
                        if (var5 == 1544) {
                            this.field1204.method227(9, 172);
                        }
                        if (var5 == 151) {
                            ++field1491;
                            if (field1491 >= 90) {
                                this.field1204.method227(9, 171);
                                this.field1204.method229(31114);
                            }
                            this.field1204.method227(9, 165);
                        }
                        this.field1204.method229(var6);
                    }
                }
                if (var5 == 285) {
                    this.method540((byte) 39, var6, 1, var3, var4);
                }
                if (var5 == 55 && this.method540((byte) 39, var6, 208, var3, var4)) {
                    this.field1204.method229(this.field1330);
                }
                if (var5 == 903 || var5 == 363) {
                    String var31 = this.field1386[arg1];
                    int var32 = var31.indexOf("@whi@");
                    if (var32 != -1) {
                        String var33 = var31.substring(var32 + 5).trim();
                        String var34 = JString.method313(JString.method310(JString.method309(var33), false), -19010);
                        boolean var35 = false;
                        for (int var36 = 0; var36 < this.field1522; ++var36) {
                            PlayerEntity var37 = this.field1521[this.field1523[var36]];
                            if (var37 != null && var37.field476 != null && var37.field476.equalsIgnoreCase(var34)) {
                                this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var37.field463[0], false, var37.field464[0], field1527.field463[0]);
                                if (var5 == 903) {
                                    this.field1204.method227(9, 54);
                                }
                                if (var5 == 363) {
                                    this.field1204.method227(9, 135);
                                }
                                this.field1204.method229(this.field1523[var36]);
                                var35 = true;
                                break;
                            }
                        }
                        if (!var35) {
                            this.method435(false, "", 0, "Unable to find " + var34);
                        }
                    }
                }
                if (var5 == 265) {
                    NpcEntity var38 = this.field1480[var6];
                    if (var38 != null) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var38.field463[0], false, var38.field464[0], field1527.field463[0]);
                        this.field1310 = super.field28;
                        this.field1311 = super.field29;
                        this.field1313 = 2;
                        this.field1312 = 0;
                        this.field1204.method227(9, 141);
                        this.field1204.method229(var6);
                        this.field1204.method229(this.field1330);
                    }
                }
                if (var5 == 660) {
                    if (!this.field1420) {
                        this.field1250.method101(super.field28 - 4, super.field29 - 4, 3);
                    } else {
                        this.field1250.method101(var3 - 4, var4 - 4, 3);
                    }
                }
                if (var5 == 34) {
                    String var39 = this.field1386[arg1];
                    int var40 = var39.indexOf("@whi@");
                    if (var40 != -1) {
                        this.method517(-361);
                        this.field1575 = var39.substring(var40 + 5).trim();
                        this.field1211 = false;
                        for (int var41 = 0; var41 < Component.field70.length; ++var41) {
                            if (Component.field70[var41] != null && Component.field70[var41].field79 == 600) {
                                this.field1604 = this.field1217 = Component.field70[var41].field76;
                                break;
                            }
                        }
                    }
                }
                if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                    String var42 = this.field1386[arg1];
                    int var43 = var42.indexOf("@whi@");
                    if (var43 != -1) {
                        long var44 = JString.method309(var42.substring(var43 + 5).trim());
                        if (var5 == 406) {
                            this.method530(-15246, var44);
                        }
                        if (var5 == 436) {
                            this.method467(var44, 3652);
                        }
                        if (var5 == 557) {
                            this.method471(var44, false);
                        }
                        if (var5 == 556) {
                            this.method549(false, var44);
                        }
                    }
                }
                if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                    boolean var46 = this.method429(0, 9, 0, 2, 0, field1527.field464[0], 0, 0, var3, false, var4, field1527.field463[0]);
                    if (!var46) {
                        this.method429(0, 9, 1, 2, 0, field1527.field464[0], 1, 0, var3, false, var4, field1527.field463[0]);
                    }
                    this.field1310 = super.field28;
                    this.field1311 = super.field29;
                    this.field1313 = 2;
                    this.field1312 = 0;
                    if (var5 == 99) {
                        this.field1204.method227(9, 55);
                    }
                    if (var5 == 993) {
                        this.field1204.method227(9, 238);
                    }
                    if (var5 == 224) {
                        this.field1204.method227(9, 113);
                    }
                    if (var5 == 877) {
                        this.field1204.method227(9, 247);
                    }
                    if (var5 == 746) {
                        this.field1204.method227(9, 17);
                    }
                    this.field1204.method229(this.field1266 + var3);
                    this.field1204.method229(this.field1267 + var4);
                    this.field1204.method229(var6);
                }
                if (var5 == 930) {
                    Component var48 = Component.field70[var4];
                    this.field1329 = 1;
                    this.field1330 = var4;
                    this.field1331 = var48.field130;
                    this.field1435 = 0;
                    this.field1623 = true;
                    String var49 = var48.field128;
                    if (var49.indexOf(" ") != -1) {
                        var49 = var49.substring(0, var49.indexOf(" "));
                    }
                    String var50 = var48.field128;
                    if (var50.indexOf(" ") != -1) {
                        var50 = var50.substring(var50.indexOf(" ") + 1);
                    }
                    this.field1332 = var49 + " " + var48.field129 + " " + var50;
                    if (this.field1331 == 16) {
                        this.field1623 = true;
                        this.field1450 = 3;
                        this.field1589 = true;
                    }
                } else {
                    if (var5 == 679) {
                        String var51 = this.field1386[arg1];
                        int var52 = var51.indexOf("@whi@");
                        if (var52 != -1) {
                            long var53 = JString.method309(var51.substring(var52 + 5).trim());
                            int var55 = -1;
                            for (int var56 = 0; var56 < this.field1363; ++var56) {
                                if (this.field1372[var56] == var53) {
                                    var55 = var56;
                                    break;
                                }
                            }
                            if (var55 != -1 && this.field1456[var55] > 0) {
                                this.field1492 = true;
                                this.field1195 = false;
                                this.field1259 = true;
                                this.field1430 = "";
                                this.field1625 = 3;
                                this.field1470 = this.field1372[var55];
                                this.field1256 = "Enter message to send to " + this.field1536[var55];
                            }
                        }
                    }
                    if (var5 == 391) {
                        this.field1204.method227(9, 188);
                        this.field1204.method229(var6);
                        this.field1204.method229(var3);
                        this.field1204.method229(var4);
                        this.field1204.method229(this.field1330);
                        this.field1635 = 0;
                        this.field1636 = var4;
                        this.field1637 = var3;
                        this.field1638 = 2;
                        if (Component.field70[var4].field76 == this.field1217) {
                            this.field1638 = 1;
                        }
                        if (Component.field70[var4].field76 == this.field1350) {
                            this.field1638 = 3;
                        }
                    }
                    if (var5 == 450 && this.method540((byte) 39, var6, 147, var3, var4)) {
                        this.field1204.method229(this.field1438);
                        this.field1204.method229(this.field1436);
                        this.field1204.method229(this.field1437);
                    }
                    this.field1435 = 0;
                    this.field1329 = 0;
                    this.field1623 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IZ)V")
    private final void method463(Packet arg0, int arg1, boolean arg2) {
        arg0.method248(-15529);
        int var4 = arg0.method249(8, this.field1471);
        if (var4 < this.field1481) {
            for (int var5 = var4; var5 < this.field1481; ++var5) {
                this.field1553[this.field1552++] = this.field1482[var5];
            }
        }
        if (var4 > this.field1481) {
            signlink.reporterror(this.field1198 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1481 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1482[var6];
                NpcEntity var8 = this.field1480[var7];
                int var9 = arg0.method249(1, this.field1471);
                if (var9 == 0) {
                    this.field1482[this.field1481++] = var7;
                    var8.field459 = field1444;
                } else {
                    int var10 = arg0.method249(2, this.field1471);
                    if (var10 == 0) {
                        this.field1482[this.field1481++] = var7;
                        var8.field459 = field1444;
                        this.field1525[this.field1524++] = var7;
                    } else if (var10 == 1) {
                        this.field1482[this.field1481++] = var7;
                        var8.field459 = field1444;
                        int var11 = arg0.method249(3, this.field1471);
                        var8.method124(false, var11, 0);
                        int var12 = arg0.method249(1, this.field1471);
                        if (var12 == 1) {
                            this.field1525[this.field1524++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1482[this.field1481++] = var7;
                        var8.field459 = field1444;
                        int var13 = arg0.method249(3, this.field1471);
                        var8.method124(true, var13, 0);
                        int var14 = arg0.method249(3, this.field1471);
                        var8.method124(true, var14, 0);
                        int var15 = arg0.method249(1, this.field1471);
                        if (var15 == 1) {
                            this.field1525[this.field1524++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1553[this.field1552++] = var7;
                    }
                }
            }
            if (!arg2) {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field1258 = true;
        if (arg0 == 9) {
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field1529) {
                    ++this.field1247;
                    this.method493(-185);
                    this.method493(-185);
                    this.method512(-576);
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
            this.field1258 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILbb;III)V")
    public final void method465(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (field1527 != arg1) {
            if (this.field1213 < 400) {
                String var6 = arg1.field476 + method436(-688, field1527.field482, arg1.field482) + " (level-" + arg1.field482 + ")";
                if (arg0 <= 0) {
                    this.field1398 = 302;
                }
                if (this.field1435 == 1) {
                    this.field1386[this.field1213] = "Use " + this.field1439 + " with @whi@" + var6;
                    this.field1541[this.field1213] = 367;
                    this.field1542[this.field1213] = arg3;
                    this.field1539[this.field1213] = arg2;
                    this.field1540[this.field1213] = arg4;
                    ++this.field1213;
                } else if (this.field1329 == 1) {
                    if ((this.field1331 & 8) == 8) {
                        this.field1386[this.field1213] = this.field1332 + " @whi@" + var6;
                        this.field1541[this.field1213] = 651;
                        this.field1542[this.field1213] = arg3;
                        this.field1539[this.field1213] = arg2;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                    }
                } else {
                    this.field1386[this.field1213] = "Follow @whi@" + var6;
                    this.field1541[this.field1213] = 1544;
                    this.field1542[this.field1213] = arg3;
                    this.field1539[this.field1213] = arg2;
                    this.field1540[this.field1213] = arg4;
                    ++this.field1213;
                    if (this.field1475 == 0) {
                        this.field1386[this.field1213] = "Trade with @whi@" + var6;
                        this.field1541[this.field1213] = 1373;
                        this.field1542[this.field1213] = arg3;
                        this.field1539[this.field1213] = arg2;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                    }
                    if (this.field1244 > 0) {
                        this.field1386[this.field1213] = "Attack @whi@" + var6;
                        if (field1527.field482 >= arg1.field482) {
                            this.field1541[this.field1213] = 151;
                        } else {
                            this.field1541[this.field1213] = 2151;
                        }
                        this.field1542[this.field1213] = arg3;
                        this.field1539[this.field1213] = arg2;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                    }
                    if (this.field1288 == 1) {
                        this.field1386[this.field1213] = "Fight @whi@" + var6;
                        this.field1541[this.field1213] = 151;
                        this.field1542[this.field1213] = arg3;
                        this.field1539[this.field1213] = arg2;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                    }
                    if (this.field1288 == 2) {
                        this.field1386[this.field1213] = "Duel-with @whi@" + var6;
                        this.field1541[this.field1213] = 1101;
                        this.field1542[this.field1213] = arg3;
                        this.field1539[this.field1213] = arg2;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                    }
                }
                for (int var7 = 0; var7 < this.field1213; ++var7) {
                    if (this.field1541[var7] == 660) {
                        this.field1386[var7] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)V")
    public final void method466(int arg0, Component arg1) {
        int var3 = arg1.field79;
        if (arg0 >= 0) {
            this.field1279 = !this.field1279;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= this.field1363) {
                arg1.field111 = "";
                arg1.field78 = 0;
            } else {
                arg1.field111 = this.field1536[var3];
                arg1.field78 = 1;
            }
        } else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
            if (var3 == 203) {
                arg1.field89 = this.field1363 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1365) {
                    arg1.field111 = "";
                    arg1.field78 = 0;
                } else {
                    arg1.field111 = JString.method313(JString.method310(this.field1530[var3], false), -19010);
                    arg1.field78 = 1;
                }
            } else if (var3 == 503) {
                arg1.field89 = this.field1365 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 == 327) {
                arg1.field126 = 150;
                arg1.field127 = (int) (Math.sin((double) field1444 / 40.0D) * 256.0D) & 2047;
                if (this.field1423) {
                    for (int var4 = 0; var4 < 7; ++var4) {
                        int var11 = this.field1255[var4];
                        if (var11 >= 0 && !IdkType.field1104[var11].method377(0)) {
                            return;
                        }
                    }
                    this.field1423 = false;
                    Model[] var5 = new Model[7];
                    int var6 = 0;
                    for (int var7 = 0; var7 < 7; ++var7) {
                        int var10 = this.field1255[var7];
                        if (var10 >= 0) {
                            var5[var6++] = IdkType.field1104[var10].method378(true);
                        }
                    }
                    Model var8 = new Model(false, var5, var6);
                    for (int var9 = 0; var9 < 5; ++var9) {
                        if (this.field1399[var9] != 0) {
                            var8.method152(field1216[var9][0], field1216[var9][this.field1399[var9]]);
                            if (var9 == 1) {
                                var8.method152(field1298[0], field1298[this.field1399[var9]]);
                            }
                        }
                    }
                    var8.method145(this.field1401);
                    var8.method146(true, SeqType.field1125[field1527.field419].field1127[0]);
                    var8.method155(64, 850, -30, -50, -30, true);
                    arg1.field119 = 5;
                    arg1.field120 = 0;
                    Component.method36(false, var8, 0, 5);
                }
            } else if (var3 == 324) {
                if (this.field1393 == null) {
                    this.field1393 = arg1.field117;
                    this.field1394 = arg1.field118;
                }
                if (this.field1429) {
                    arg1.field117 = this.field1394;
                } else {
                    arg1.field117 = this.field1393;
                }
            } else if (var3 == 325) {
                if (this.field1393 == null) {
                    this.field1393 = arg1.field117;
                    this.field1394 = arg1.field118;
                }
                if (this.field1429) {
                    arg1.field117 = this.field1393;
                } else {
                    arg1.field117 = this.field1394;
                }
            } else if (var3 == 600) {
                arg1.field111 = this.field1575;
                if (field1444 % 20 < 10) {
                    arg1.field111 = arg1.field111 + "|";
                } else {
                    arg1.field111 = arg1.field111 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1513 >= 1) {
                        if (this.field1211) {
                            arg1.field113 = 16711680;
                            arg1.field111 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field113 = 16777215;
                            arg1.field111 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field111 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1193 != 0) {
                        String var12;
                        if (this.field1392 == 0) {
                            var12 = "earlier today";
                        } else if (this.field1392 == 1) {
                            var12 = "yesterday";
                        } else {
                            var12 = this.field1392 + " days ago";
                        }
                        arg1.field111 = "You last logged in " + var12 + " from: " + signlink.dns;
                    } else {
                        arg1.field111 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1484 == 0) {
                        arg1.field111 = "0 unread messages";
                        arg1.field113 = 16776960;
                    }
                    if (this.field1484 == 1) {
                        arg1.field111 = "1 unread message";
                        arg1.field113 = 65280;
                    }
                    if (this.field1484 > 1) {
                        arg1.field111 = this.field1484 + " unread messages";
                        arg1.field113 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1339 == 201) {
                        if (this.field1292 == 1) {
                            arg1.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1339 == 200) {
                        arg1.field111 = "You have not yet set any password recovery questions.";
                    } else {
                        String var13;
                        if (this.field1339 == 0) {
                            var13 = "Earlier today";
                        } else if (this.field1339 == 1) {
                            var13 = "Yesterday";
                        } else {
                            var13 = this.field1339 + " days ago";
                        }
                        arg1.field111 = var13 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1339 == 201) {
                        if (this.field1292 == 1) {
                            arg1.field111 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1339 == 200) {
                        arg1.field111 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field111 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1339 == 201) {
                        if (this.field1292 == 1) {
                            arg1.field111 = "@whi@this world but member benefits are unavailabe whilst here.";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1339 == 200) {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else {
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= this.field1363) {
                arg1.field111 = "";
                arg1.field78 = 0;
            } else {
                if (this.field1456[var3] == 0) {
                    arg1.field111 = "@red@Offline";
                } else if (this.field1456[var3] == field1485) {
                    arg1.field111 = "@gre@World-" + (this.field1456[var3] - 9);
                } else {
                    arg1.field111 = "@yel@World-" + (this.field1456[var3] - 9);
                }
                arg1.field78 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method467(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1365 >= 100) {
                this.method435(false, "", 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method313(JString.method310(arg0, false), -19010);
                for (int var5 = 0; var5 < this.field1365; ++var5) {
                    if (this.field1530[var5] == arg0) {
                        this.method435(false, "", 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                if (arg1 != 3652) {
                    this.field1370 = -5;
                }
                for (int var6 = 0; var6 < this.field1363; ++var6) {
                    if (this.field1372[var6] == arg0) {
                        this.method435(false, "", 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1530[this.field1365++] = arg0;
                this.field1623 = true;
                this.field1204.method227(9, 20);
                this.field1204.method234(169, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method468(int arg0) {
        if (this.field1347 == 0) {
            this.field1386[0] = "Cancel";
            this.field1541[0] = 1252;
            this.field1213 = 1;
            this.method546(this.field1593);
            this.field1613 = 0;
            if (super.field21 > 4 && super.field22 > 4 && super.field21 < 516 && super.field22 < 338) {
                if (this.field1217 != -1) {
                    this.method494(4, true, super.field22, 0, Component.field70[this.field1217], super.field21, 4);
                } else {
                    this.method532(27250);
                }
            }
            if (this.field1613 != this.field1254) {
                this.field1254 = this.field1613;
            }
            this.field1613 = 0;
            if (super.field21 > 553 && super.field22 > 205 && super.field21 < 743 && super.field22 < 466) {
                if (this.field1237 != -1) {
                    this.method494(553, true, super.field22, 0, Component.field70[this.field1237], super.field21, 205);
                } else if (this.field1631[this.field1450] != -1) {
                    this.method494(553, true, super.field22, 0, Component.field70[this.field1631[this.field1450]], super.field21, 205);
                }
            }
            if (this.field1613 != this.field1449) {
                this.field1623 = true;
                this.field1449 = this.field1613;
            }
            this.field1613 = 0;
            if (super.field21 > 17 && super.field22 > 357 && super.field21 < 496 && super.field22 < 453) {
                if (this.field1350 != -1) {
                    this.method494(17, true, super.field22, 0, Component.field70[this.field1350], super.field21, 357);
                } else if (super.field22 < 434 && super.field21 < 426) {
                    this.method531(super.field21 - 17, super.field22 - 357, true);
                }
            }
            if (this.field1350 != -1 && this.field1613 != this.field1214) {
                this.field1492 = true;
                this.field1214 = this.field1613;
            }
            boolean var2 = false;
            while (arg0 >= 0) {
                this.field1603 = 456;
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1213 - 1; ++var3) {
                    if (this.field1541[var3] < 1000 && this.field1541[var3 + 1] > 1000) {
                        String var4 = this.field1386[var3];
                        this.field1386[var3] = this.field1386[var3 + 1];
                        this.field1386[var3 + 1] = var4;
                        int var5 = this.field1541[var3];
                        this.field1541[var3] = this.field1541[var3 + 1];
                        this.field1541[var3 + 1] = var5;
                        int var6 = this.field1539[var3];
                        this.field1539[var3] = this.field1539[var3 + 1];
                        this.field1539[var3 + 1] = var6;
                        int var7 = this.field1540[var3];
                        this.field1540[var3] = this.field1540[var3 + 1];
                        this.field1540[var3 + 1] = var7;
                        int var8 = this.field1542[var3];
                        this.field1542[var3] = this.field1542[var3 + 1];
                        this.field1542[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method469(byte arg0) {
        LocType.field978.method116();
        if (arg0 != -10) {
            this.field1204.method228(141);
        }
        LocType.field979.method116();
        NpcType.field1021.method116();
        ObjType.field1072.method116();
        ObjType.field1073.method116();
        PlayerEntity.field497.method116();
        SpotAnimType.field1155.method116();
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method470(int arg0) {
        int var1 = 83 / arg0;
        World3D.field299 = false;
        Pix3D.field644 = false;
        field1488 = false;
        World.field42 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method471(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1363; ++var4) {
                if (this.field1372[var4] == arg0) {
                    --this.field1363;
                    this.field1623 = true;
                    for (int var5 = var4; var5 < this.field1363; ++var5) {
                        this.field1536[var5] = this.field1536[var5 + 1];
                        this.field1456[var5] = this.field1456[var5 + 1];
                        this.field1372[var5] = this.field1372[var5 + 1];
                    }
                    this.field1204.method227(9, 61);
                    this.field1204.method234(169, arg0);
                    break;
                }
            }
            if (arg1) {
                this.field1289 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method472(int arg0, int arg1, Packet arg2) {
        if (arg1 == 5) {
            this.field1552 = 0;
            this.field1524 = 0;
            this.method463(arg2, arg0, true);
            this.method520(arg0, 0, arg2);
            this.method502(46870, arg2, arg0);
            for (int var4 = 0; var4 < this.field1552; ++var4) {
                int var6 = this.field1553[var4];
                if (field1444 != this.field1480[var6].field459) {
                    this.field1480[var6].field471 = null;
                    this.field1480[var6] = null;
                }
            }
            if (arg2.field713 != arg0) {
                signlink.reporterror(this.field1198 + " size mismatch in getnpcpos - pos:" + arg2.field713 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1481; ++var5) {
                    if (this.field1480[this.field1482[var5]] == null) {
                        signlink.reporterror(this.field1198 + " null entry in npc list - pos:" + var5 + " size:" + this.field1481);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IZII)V")
    public final void method473(Component arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0.field77 == 0 && arg0.field92 != null) {
            if (!arg0.field91 || this.field1254 == arg0.field75 || this.field1449 == arg0.field75 || this.field1214 == arg0.field75) {
                int var6 = Pix2D.field635;
                int var7 = Pix2D.field633;
                int var8 = Pix2D.field636;
                int var9 = Pix2D.field634;
                Pix2D.method166(5, arg4, arg0.field80 + arg1, arg0.field81 + arg4, arg1);
                int var10 = arg0.field92.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field93[var11] + arg1;
                    int var13 = arg0.field94[var11] + arg4 - arg3;
                    Component var14 = Component.field70[arg0.field92[var11]];
                    int var15 = var14.field83 + var12;
                    int var16 = var14.field84 + var13;
                    if (var14.field79 > 0) {
                        this.method466(-429, var14);
                    }
                    if (var14.field77 == 0) {
                        if (var14.field90 > var14.field89 - var14.field81) {
                            var14.field90 = var14.field89 - var14.field81;
                        }
                        if (var14.field90 < 0) {
                            var14.field90 = 0;
                        }
                        this.method473(var14, var15, true, var14.field90, var16);
                        if (var14.field89 > var14.field81) {
                            this.method538(var16, var14.field80 + var15, var14.field90, var14.field89, var14.field81, false);
                        }
                    } else if (var14.field77 != 1) {
                        if (var14.field77 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field81; ++var18) {
                                for (int var19 = 0; var19 < var14.field80; ++var19) {
                                    int var20 = (var14.field101 + 32) * var19 + var15;
                                    int var21 = (var14.field102 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field104[var17];
                                        var21 += var14.field105[var17];
                                    }
                                    if (var14.field71[var17] <= 0) {
                                        if (var14.field103 != null && var17 < 20) {
                                            Pix32 var30 = var14.field103[var17];
                                            if (var30 != null) {
                                                var30.method198(var20, 200, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field71[var17] - 1;
                                        if (var20 > Pix2D.field635 - 32 && var20 < Pix2D.field636 && var21 > Pix2D.field633 - 32 && var21 < Pix2D.field634 || this.field1347 != 0 && this.field1346 == var17) {
                                            int var25 = 0;
                                            if (this.field1435 == 1 && this.field1436 == var17 && this.field1437 == var14.field75) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(var25, 517, var14.field72[var17], var24);
                                            if (var26 != null) {
                                                if (this.field1347 != 0 && this.field1346 == var17 && this.field1345 == var14.field75) {
                                                    var22 = super.field21 - this.field1348;
                                                    var23 = super.field22 - this.field1349;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1431 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method200(0, 128, var21 + var23, var20 + var22);
                                                    if (var21 + var23 < Pix2D.field633 && arg0.field90 > 0) {
                                                        int var27 = (Pix2D.field633 - var21 - var23) * this.field1290 / 3;
                                                        if (var27 > this.field1290 * 10) {
                                                            var27 = this.field1290 * 10;
                                                        }
                                                        if (var27 > arg0.field90) {
                                                            var27 = arg0.field90;
                                                        }
                                                        arg0.field90 -= var27;
                                                        this.field1349 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field634 && arg0.field90 < arg0.field89 - arg0.field81) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field634) * this.field1290 / 3;
                                                        if (var28 > this.field1290 * 10) {
                                                            var28 = this.field1290 * 10;
                                                        }
                                                        if (var28 > arg0.field89 - arg0.field81 - arg0.field90) {
                                                            var28 = arg0.field89 - arg0.field81 - arg0.field90;
                                                        }
                                                        arg0.field90 += var28;
                                                        this.field1349 -= var28;
                                                    }
                                                } else if (this.field1638 != 0 && this.field1637 == var17 && this.field1636 == var14.field75) {
                                                    var26.method200(0, 128, var21, var20);
                                                } else {
                                                    var26.method198(var20, 200, var21);
                                                }
                                                if (var26.field675 == 33 || var14.field72[var17] != 1) {
                                                    int var29 = var14.field72[var17];
                                                    this.field1299.method216(0, method497(true, var29), 0, var20 + 1 + var22, var21 + 10 + var23);
                                                    this.field1299.method216(0, method497(true, var29), 16776960, var20 + var22, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field77 == 3) {
                            boolean var31 = false;
                            if (this.field1214 == var14.field75 || this.field1449 == var14.field75 || this.field1254 == var14.field75) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method547(var14, (byte) 0)) {
                                var32 = var14.field114;
                                if (var31 && var14.field116 != 0) {
                                    var32 = var14.field116;
                                }
                            } else {
                                var32 = var14.field113;
                                if (var31 && var14.field115 != 0) {
                                    var32 = var14.field115;
                                }
                            }
                            if (var14.field82 == 0) {
                                if (var14.field107) {
                                    Pix2D.method169(-556, var16, var14.field81, var15, var14.field80, var32);
                                } else {
                                    Pix2D.method170(var15, var14.field81, var16, var14.field80, var32, false);
                                }
                            } else if (var14.field107) {
                                Pix2D.method168(var15, var14.field81, var16, var32, 7861, 256 - (var14.field82 & 255), var14.field80);
                            } else {
                                Pix2D.method171(var14.field80, var15, var16, 256 - (var14.field82 & 255), var32, false, var14.field81);
                            }
                        } else if (var14.field77 == 4) {
                            PixFont var33 = var14.field110;
                            String var34 = var14.field111;
                            boolean var35 = false;
                            if (this.field1214 == var14.field75 || this.field1449 == var14.field75 || this.field1254 == var14.field75) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method547(var14, (byte) 0)) {
                                var36 = var14.field114;
                                if (var35 && var14.field116 != 0) {
                                    var36 = var14.field116;
                                }
                                if (var14.field112.length() > 0) {
                                    var34 = var14.field112;
                                }
                            } else {
                                var36 = var14.field113;
                                if (var35 && var14.field115 != 0) {
                                    var36 = var14.field115;
                                }
                            }
                            if (var14.field78 == 6 && this.field1385) {
                                var34 = "Please wait...";
                                var36 = var14.field113;
                            }
                            if (Pix2D.field631 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field700 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method516(0, this.method552(this.field1315, var14, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method516(0, this.method552(this.field1315, var14, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method516(0, this.method552(this.field1315, var14, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method516(0, this.method552(this.field1315, var14, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method516(0, this.method552(this.field1315, var14, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field108) {
                                    var33.method214(var14.field109, var37, var36, var14.field80 / 2 + var15, var44, (byte) -5);
                                } else {
                                    var33.method218(var36, var15, var37, var14.field109, false, var44);
                                }
                                var37 += var33.field700;
                            }
                        } else if (var14.field77 == 5) {
                            Pix32 var45;
                            if (this.method547(var14, (byte) 0)) {
                                var45 = var14.field118;
                            } else {
                                var45 = var14.field117;
                            }
                            if (var45 != null) {
                                var45.method198(var15, 200, var16);
                            }
                        } else if (var14.field77 == 6) {
                            int var46 = Pix3D.field649;
                            int var47 = Pix3D.field650;
                            Pix3D.field649 = var14.field80 / 2 + var15;
                            Pix3D.field650 = var14.field81 / 2 + var16;
                            int var48 = Pix3D.field653[var14.field126] * var14.field125 >> 16;
                            int var49 = Pix3D.field654[var14.field126] * var14.field125 >> 16;
                            boolean var50 = this.method547(var14, (byte) 0);
                            int var51;
                            if (var50) {
                                var51 = var14.field124;
                            } else {
                                var51 = var14.field123;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, this.field1281, var50, -1);
                            } else {
                                SeqType var53 = SeqType.field1125[var51];
                                var52 = var14.method34(var53.field1127[var14.field73], this.field1281, var50, var53.field1128[var14.field73]);
                            }
                            if (var52 != null) {
                                var52.method158(0, var14.field127, 0, var14.field126, 0, var48, var49);
                            }
                            Pix3D.field649 = var46;
                            Pix3D.field650 = var47;
                        } else if (var14.field77 == 7) {
                            PixFont var54 = var14.field110;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field81; ++var56) {
                                for (int var57 = 0; var57 < var14.field80; ++var57) {
                                    if (var14.field71[var55] > 0) {
                                        ObjType var58 = ObjType.method348(var14.field71[var55] - 1);
                                        String var59 = var58.field1034;
                                        if (var58.field1046 || var14.field72[var55] != 1) {
                                            var59 = var59 + " x" + method482(false, var14.field72[var55]);
                                        }
                                        int var60 = (var14.field101 + 115) * var57 + var15;
                                        int var61 = (var14.field102 + 12) * var56 + var16;
                                        if (var14.field108) {
                                            var54.method214(var14.field109, var61, var14.field113, var14.field80 / 2 + var60, var59, (byte) -5);
                                        } else {
                                            var54.method218(var14.field113, var60, var61, var14.field109, false, var59);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method166(5, var7, var8, var9, var6);
                this.field1371 &= arg2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method474(int arg0) {
        if (arg0 != 18352) {
            field1586 = this.field1379.method304();
        }
        while (true) {
            OnDemandRequest var2 = this.field1576.method290();
            if (var2 == null) {
                return;
            }
            if (var2.field725 == 0) {
                Model.method136(6415, var2.field726, var2.field727);
                if ((this.field1576.method286(var2.field726, -84) & 98) != 0) {
                    this.field1623 = true;
                    if (this.field1350 != -1) {
                        this.field1492 = true;
                    }
                }
            }
            if (var2.field725 == 1 && var2.field727 != null) {
                AnimFrame.method59(true, var2.field727);
            }
            if (var2.field725 == 2 && this.field1340 == var2.field726 && var2.field727 != null) {
                this.method542(this.field1341, var2.field727, false);
            }
            if (var2.field725 == 3 && this.field1509 == 1) {
                for (int var3 = 0; var3 < this.field1227.length; ++var3) {
                    if (this.field1548[var3] == var2.field726) {
                        this.field1227[var3] = var2.field727;
                        if (var2.field727 == null) {
                            this.field1548[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1549[var3] == var2.field726) {
                        this.field1554[var3] = var2.field727;
                        if (var2.field727 == null) {
                            this.field1549[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field725 == 93 && this.field1576.method285(-971, var2.field726)) {
                World.method17(this.field1585, new Packet(var2.field727, false), this.field1576);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method475(int arg0) {
        while (arg0 >= 0) {
            this.field1204.method228(171);
        }
        if (field1488 && this.field1509 == 2 && World.field43 != this.field1587) {
            this.field1426.method267(this.field1378);
            this.field1300.method213(0, 257, 151, "Loading - please wait.", -977);
            this.field1300.method213(16777215, 256, 150, "Loading - please wait.", -977);
            this.field1426.method268(4, (byte) 107, super.field13, 4);
            this.field1509 = 1;
            this.field1230 = System.currentTimeMillis();
        }
        if (this.field1509 == 1) {
            int var2 = this.method476(-40528);
            if (var2 != 0 && System.currentTimeMillis() - this.field1230 > 360000L) {
                signlink.reporterror(this.field1198 + " glcfb " + this.field1609 + "," + var2 + "," + field1488 + "," + this.field1306[0] + "," + this.field1576.method289() + "," + this.field1587 + "," + this.field1228 + "," + this.field1229);
                this.field1230 = System.currentTimeMillis();
            }
        }
        if (this.field1509 == 2 && this.field1587 != this.field1246) {
            this.field1246 = this.field1587;
            this.method522(this.field1587, 25805);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)I")
    public final int method476(int arg0) {
        for (int var2 = 0; var2 < this.field1227.length; ++var2) {
            if (this.field1227[var2] == null && this.field1548[var2] != -1) {
                return -1;
            }
            if (this.field1554[var2] == null && this.field1549[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0 != -40528) {
            field1627 = true;
        }
        for (int var4 = 0; var4 < this.field1227.length; ++var4) {
            byte[] var5 = this.field1554[var4];
            if (var5 != null) {
                int var6 = (this.field1547[var4] >> 8) * 64 - this.field1266;
                int var7 = (this.field1547[var4] & 255) * 64 - this.field1267;
                var3 &= World.method16(var5, var7, (byte) -124, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1191) {
            return -4;
        } else {
            this.field1509 = 2;
            World.field43 = this.field1587;
            this.method535(false);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method477(int arg0) {
        if (this.field1558 == null) {
            super.field14 = null;
            this.field1427 = null;
            this.field1425 = null;
            this.field1424 = null;
            this.field1426 = null;
            this.field1567 = null;
            this.field1568 = null;
            this.field1569 = null;
            this.field1561 = new PixMap(265, this.method11(-66), 0, 128);
            Pix2D.method167(true);
            this.field1562 = new PixMap(265, this.method11(-66), 0, 128);
            this.field1531 += arg0;
            Pix2D.method167(true);
            this.field1558 = new PixMap(171, this.method11(-66), 0, 509);
            Pix2D.method167(true);
            this.field1559 = new PixMap(132, this.method11(-66), 0, 360);
            Pix2D.method167(true);
            this.field1560 = new PixMap(200, this.method11(-66), 0, 360);
            Pix2D.method167(true);
            this.field1563 = new PixMap(238, this.method11(-66), 0, 202);
            Pix2D.method167(true);
            this.field1564 = new PixMap(238, this.method11(-66), 0, 203);
            Pix2D.method167(true);
            this.field1565 = new PixMap(94, this.method11(-66), 0, 74);
            Pix2D.method167(true);
            this.field1566 = new PixMap(94, this.method11(-66), 0, 75);
            Pix2D.method167(true);
            if (this.field1278 != null) {
                this.method508((byte) 4);
                this.method451(19831);
            }
            this.field1517 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILgc;I)V")
    public final void method478(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (arg1 != -9932) {
            this.field1476 = !this.field1476;
        }
        if (this.field1213 < 400) {
            String var6 = arg3.field996;
            if (arg3.field1014 != 0) {
                var6 = var6 + method436(-688, field1527.field482, arg3.field1014) + " (level-" + arg3.field1014 + ")";
            }
            if (this.field1435 == 1) {
                this.field1386[this.field1213] = "Use " + this.field1439 + " with @yel@" + var6;
                this.field1541[this.field1213] = 900;
                this.field1542[this.field1213] = arg2;
                this.field1539[this.field1213] = arg0;
                this.field1540[this.field1213] = arg4;
                ++this.field1213;
            } else {
                if (this.field1329 == 1) {
                    if ((this.field1331 & 2) == 2) {
                        this.field1386[this.field1213] = this.field1332 + " @yel@" + var6;
                        this.field1541[this.field1213] = 265;
                        this.field1542[this.field1213] = arg2;
                        this.field1539[this.field1213] = arg0;
                        this.field1540[this.field1213] = arg4;
                        ++this.field1213;
                        return;
                    }
                } else {
                    if (arg3.field1009 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg3.field1009[var7] != null && !arg3.field1009[var7].equalsIgnoreCase("attack")) {
                                this.field1386[this.field1213] = arg3.field1009[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1541[this.field1213] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1541[this.field1213] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1541[this.field1213] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1541[this.field1213] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1541[this.field1213] = 245;
                                }
                                this.field1542[this.field1213] = arg2;
                                this.field1539[this.field1213] = arg0;
                                this.field1540[this.field1213] = arg4;
                                ++this.field1213;
                            }
                        }
                    }
                    if (arg3.field1009 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg3.field1009[var8] != null && arg3.field1009[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg3.field1014 > field1527.field482) {
                                    var9 = 2000;
                                }
                                this.field1386[this.field1213] = arg3.field1009[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1541[this.field1213] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1541[this.field1213] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1541[this.field1213] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1541[this.field1213] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1541[this.field1213] = var9 + 245;
                                }
                                this.field1542[this.field1213] = arg2;
                                this.field1539[this.field1213] = arg0;
                                this.field1540[this.field1213] = arg4;
                                ++this.field1213;
                            }
                        }
                    }
                    this.field1386[this.field1213] = "Examine @yel@" + var6;
                    this.field1541[this.field1213] = 1607;
                    this.field1542[this.field1213] = arg2;
                    this.field1539[this.field1213] = arg0;
                    this.field1540[this.field1213] = arg4;
                    ++this.field1213;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method479(byte arg0) {
        this.method477(0);
        this.field1560.method267(this.field1378);
        this.field1633.method211(0, 200, 0);
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        short var4 = 360;
        short var5 = 200;
        if (this.field1510 == 0) {
            int var6 = var5 / 2 + 80;
            this.field1299.method214(true, var6, 7711145, var4 / 2, this.field1576.field837, (byte) -5);
            int var7 = var5 / 2 - 20;
            this.field1301.method214(true, var7, 16776960, var4 / 2, "Welcome to RuneScape", (byte) -5);
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field1634.method211(var8 - 73, 200, var9 - 20);
            this.field1301.method214(true, var9 + 5, 16777215, var8, "New user", (byte) -5);
            int var10 = var4 / 2 + 80;
            this.field1634.method211(var10 - 73, 200, var9 - 20);
            this.field1301.method214(true, var9 + 5, 16777215, var10, "Existing User", (byte) -5);
        }
        if (this.field1510 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field1570.length() > 0) {
                this.field1301.method214(true, var11 - 15, 16776960, var4 / 2, this.field1570, (byte) -5);
                this.field1301.method214(true, var11, 16776960, var4 / 2, this.field1571, (byte) -5);
                var11 += 30;
            } else {
                this.field1301.method214(true, var11 - 7, 16776960, var4 / 2, this.field1571, (byte) -5);
                var11 += 30;
            }
            this.field1301.method218(16777215, var4 / 2 - 90, var11, true, false, "Username: " + this.field1198 + (this.field1222 == 0 & field1444 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            this.field1301.method218(16777215, var4 / 2 - 88, var11, true, false, "Password: " + JString.method315(this.field1199, (byte) 4) + (this.field1222 == 1 & field1444 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            int var12 = var4 / 2 - 80;
            int var13 = var5 / 2 + 50;
            this.field1634.method211(var12 - 73, 200, var13 - 20);
            this.field1301.method214(true, var13 + 5, 16777215, var12, "Login", (byte) -5);
            int var14 = var4 / 2 + 80;
            this.field1634.method211(var14 - 73, 200, var13 - 20);
            this.field1301.method214(true, var13 + 5, 16777215, var14, "Cancel", (byte) -5);
        }
        if (this.field1510 == 3) {
            this.field1301.method214(true, var5 / 2 - 60, 16776960, var4 / 2, "Create a free account", (byte) -5);
            int var15 = var5 / 2 - 35;
            this.field1301.method214(true, var15, 16777215, var4 / 2, "To create a new account you need to", (byte) -5);
            int var19 = var15 + 15;
            this.field1301.method214(true, var19, 16777215, var4 / 2, "go back to the main RuneScape webpage", (byte) -5);
            int var20 = var19 + 15;
            this.field1301.method214(true, var20, 16777215, var4 / 2, "and choose the red 'create account'", (byte) -5);
            int var21 = var20 + 15;
            this.field1301.method214(true, var21, 16777215, var4 / 2, "button at the top right of that page.", (byte) -5);
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field1634.method211(var16 - 73, 200, var17 - 20);
            this.field1301.method214(true, var17 + 5, 16777215, var16, "Cancel", (byte) -5);
        }
        this.field1560.method268(202, (byte) 107, super.field13, 171);
        if (this.field1517) {
            this.field1517 = false;
            this.field1558.method268(128, (byte) 107, super.field13, 0);
            this.field1559.method268(202, (byte) 107, super.field13, 371);
            this.field1563.method268(0, (byte) 107, super.field13, 265);
            this.field1564.method268(562, (byte) 107, super.field13, 265);
            this.field1565.method268(128, (byte) 107, super.field13, 171);
            this.field1566.method268(562, (byte) 107, super.field13, 171);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLmb;I)V")
    private final void method480(boolean arg0, Packet arg1, int arg2) {
        int var4 = arg1.method249(8, this.field1471);
        if (var4 < this.field1522) {
            for (int var5 = var4; var5 < this.field1522; ++var5) {
                this.field1553[this.field1552++] = this.field1523[var5];
            }
        }
        if (var4 > this.field1522) {
            signlink.reporterror(this.field1198 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1522 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1523[var6];
                PlayerEntity var8 = this.field1521[var7];
                int var9 = arg1.method249(1, this.field1471);
                if (var9 == 0) {
                    this.field1523[this.field1522++] = var7;
                    var8.field459 = field1444;
                } else {
                    int var10 = arg1.method249(2, this.field1471);
                    if (var10 == 0) {
                        this.field1523[this.field1522++] = var7;
                        var8.field459 = field1444;
                        this.field1525[this.field1524++] = var7;
                    } else if (var10 == 1) {
                        this.field1523[this.field1522++] = var7;
                        var8.field459 = field1444;
                        int var11 = arg1.method249(3, this.field1471);
                        var8.method124(false, var11, 0);
                        int var12 = arg1.method249(1, this.field1471);
                        if (var12 == 1) {
                            this.field1525[this.field1524++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1523[this.field1522++] = var7;
                        var8.field459 = field1444;
                        int var13 = arg1.method249(3, this.field1471);
                        var8.method124(true, var13, 0);
                        int var14 = arg1.method249(3, this.field1471);
                        var8.method124(true, var14, 0);
                        int var15 = arg1.method249(1, this.field1471);
                        if (var15 == 1) {
                            this.field1525[this.field1524++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1553[this.field1552++] = var7;
                    }
                }
            }
            if (arg0) {
                this.field1236 = 87;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method481(int arg0) {
        this.field1458 = 0;
        for (int var2 = -1; var2 < this.field1522 + this.field1481; ++var2) {
            PathingEntity var18;
            if (var2 == -1) {
                var18 = field1527;
            } else if (var2 < this.field1522) {
                var18 = this.field1521[this.field1523[var2]];
            } else {
                var18 = this.field1480[this.field1482[var2 - this.field1522]];
            }
            if (var18 != null && var18.method126(this.field1514)) {
                if (var2 >= this.field1522) {
                    NpcType var22 = ((NpcEntity) var18).field471;
                    if (var22.field1020 >= 0 && var22.field1020 < this.field1325.length) {
                        this.method459(false, var18, var18.field460 + 15);
                        if (this.field1342 > -1) {
                            this.field1325[var22.field1020].method198(this.field1342 - 12, 200, this.field1343 - 30);
                        }
                    }
                    if (this.field1620 == 1 && this.field1482[var2 - this.field1522] == this.field1262 && field1444 % 20 < 10) {
                        this.method459(false, var18, var18.field460 + 15);
                        if (this.field1342 > -1) {
                            this.field1325[2].method198(this.field1342 - 12, 200, this.field1343 - 28);
                        }
                    }
                } else {
                    int var19 = 30;
                    PlayerEntity var20 = (PlayerEntity) var18;
                    if (var20.field479 != 0) {
                        this.method459(false, var18, var18.field460 + 15);
                        if (this.field1342 > -1) {
                            for (int var21 = 0; var21 < 8; ++var21) {
                                if ((var20.field479 & 1 << var21) != 0) {
                                    this.field1325[var21].method198(this.field1342 - 12, 200, this.field1343 - var19);
                                    var19 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1620 == 10 && this.field1523[var2] == this.field1601) {
                        this.method459(false, var18, var18.field460 + 15);
                        if (this.field1342 > -1) {
                            this.field1325[7].method198(this.field1342 - 12, 200, this.field1343 - var19);
                        }
                    }
                }
                if (var18.field426 != null && (var2 >= this.field1522 || this.field1428 == 0 || this.field1428 == 3 || this.field1428 == 1 && this.method433(288, ((PlayerEntity) var18).field476))) {
                    this.method459(false, var18, var18.field460);
                    if (this.field1342 > -1 && this.field1458 < this.field1459) {
                        this.field1463[this.field1458] = this.field1301.method215(true, var18.field426) / 2;
                        this.field1462[this.field1458] = this.field1301.field700;
                        this.field1460[this.field1458] = this.field1342;
                        this.field1461[this.field1458] = this.field1343;
                        this.field1464[this.field1458] = var18.field428;
                        this.field1465[this.field1458] = var18.field429;
                        this.field1466[this.field1458] = var18.field427;
                        this.field1467[this.field1458++] = var18.field426;
                        if (this.field1249 == 0 && var18.field429 == 1) {
                            this.field1462[this.field1458] += 10;
                            this.field1461[this.field1458] += 5;
                        }
                        if (this.field1249 == 0 && var18.field429 == 2) {
                            this.field1463[this.field1458] = 60;
                        }
                    }
                }
                if (var18.field433 > field1444) {
                    this.method459(false, var18, var18.field460 + 15);
                    if (this.field1342 > -1) {
                        int var23 = var18.field434 * 30 / var18.field435;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        Pix2D.method169(-556, this.field1343 - 3, 5, this.field1342 - 15, var23, 65280);
                        Pix2D.method169(-556, this.field1343 - 3, 5, this.field1342 - 15 + var23, 30 - var23, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; ++var24) {
                    if (var18.field432[var24] > field1444) {
                        this.method459(false, var18, var18.field460 / 2);
                        if (this.field1342 > -1) {
                            if (var24 == 1) {
                                this.field1343 -= 20;
                            }
                            if (var24 == 2) {
                                this.field1342 -= 15;
                                this.field1343 -= 10;
                            }
                            if (var24 == 3) {
                                this.field1342 += 15;
                                this.field1343 -= 10;
                            }
                            this.field1503[var18.field431[var24]].method198(this.field1342 - 12, 200, this.field1343 - 12);
                            this.field1299.method213(0, this.field1342, this.field1343 + 4, String.valueOf(var18.field430[var24]), -977);
                            this.field1299.method213(16777215, this.field1342 - 1, this.field1343 + 3, String.valueOf(var18.field430[var24]), -977);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1458; ++var3) {
            int var5 = this.field1460[var3];
            int var6 = this.field1461[var3];
            int var7 = this.field1463[var3];
            int var8 = this.field1462[var3];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var17 = 0; var17 < var3; ++var17) {
                    if (var6 + 2 > this.field1461[var17] - this.field1462[var17] && var6 - var8 < this.field1461[var17] + 2 && var5 - var7 < this.field1463[var17] + this.field1460[var17] && var5 + var7 > this.field1460[var17] - this.field1463[var17] && this.field1461[var17] - this.field1462[var17] < var6) {
                        var6 = this.field1461[var17] - this.field1462[var17];
                        var9 = true;
                    }
                }
            }
            this.field1342 = this.field1460[var3];
            this.field1343 = this.field1461[var3] = var6;
            String var10 = this.field1467[var3];
            if (this.field1249 == 0) {
                int var11 = 16776960;
                if (this.field1464[var3] < 6) {
                    var11 = this.field1538[this.field1464[var3]];
                }
                if (this.field1464[var3] == 6) {
                    var11 = this.field1630 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1464[var3] == 7) {
                    var11 = this.field1630 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1464[var3] == 8) {
                    var11 = this.field1630 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1464[var3] == 9) {
                    int var12 = 150 - this.field1466[var3];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1464[var3] == 10) {
                    int var13 = 150 - this.field1466[var3];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1464[var3] == 11) {
                    int var14 = 150 - this.field1466[var3];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1465[var3] == 0) {
                    this.field1301.method213(0, this.field1342, this.field1343 + 1, var10, -977);
                    this.field1301.method213(var11, this.field1342, this.field1343, var10, -977);
                }
                if (this.field1465[var3] == 1) {
                    this.field1301.method217(this.field1342, 0, this.field1343 + 1, var10, this.field1630, (byte) 1);
                    this.field1301.method217(this.field1342, var11, this.field1343, var10, this.field1630, (byte) 1);
                }
                if (this.field1465[var3] == 2) {
                    int var15 = this.field1301.method215(true, var10);
                    int var16 = (150 - this.field1466[var3]) * (var15 + 100) / 150;
                    Pix2D.method166(5, 0, this.field1342 + 50, 334, this.field1342 - 50);
                    this.field1301.method216(0, var10, 0, this.field1342 + 50 - var16, this.field1343 + 1);
                    this.field1301.method216(0, var10, var11, this.field1342 + 50 - var16, this.field1343);
                    Pix2D.method165(true);
                }
            } else {
                this.field1301.method213(0, this.field1342, this.field1343 + 1, var10, -977);
                this.field1301.method213(16776960, this.field1342, this.field1343, var10, -977);
            }
        }
        int var4 = 12 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method482(boolean arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0) {
            field1586 = 100;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method483(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method484(int arg0) {
        int var2 = (field1527.field414 >> 7) + this.field1266;
        int var3 = (field1527.field415 >> 7) + this.field1267;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1244 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1244 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1244 = 0;
        }
        this.field1288 = 0;
        if (arg0 < 3 || arg0 > 3) {
            this.field1289 = null;
        }
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1288 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1288 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1288 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1288 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1288 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1288 = 1;
            }
        }
        if (this.field1288 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1288 = 2;
        }
        this.field1475 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1475 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1475 = 1;
        }
        if (this.field1475 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1475 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method485(int arg0, Packet arg1, int arg2) {
        if (arg2 != 45228) {
            this.method6();
        }
        this.field1552 = 0;
        this.field1524 = 0;
        this.method550(arg0, -99, arg1);
        this.method480(false, arg1, arg0);
        this.method527(this.field1196, arg1, arg0);
        this.method455(arg1, arg0, (byte) 5);
        for (int var4 = 0; var4 < this.field1552; ++var4) {
            int var6 = this.field1553[var4];
            if (field1444 != this.field1521[var6].field459) {
                this.field1521[var6] = null;
            }
        }
        if (arg1.field713 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field713 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1522; ++var5) {
                if (this.field1521[this.field1523[var5]] == null) {
                    signlink.reporterror(this.field1198 + " null entry in pl list - pos:" + var5 + " size:" + this.field1522);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method486(byte arg0) {
        if (this.field1347 == 0) {
            int var2 = super.field27;
            if (arg0 == 4) {
                if (this.field1329 == 1 && super.field28 >= 516 && super.field29 >= 160 && super.field28 <= 765 && super.field29 <= 205) {
                    var2 = 0;
                }
                if (this.field1420) {
                    if (var2 != 1) {
                        int var3 = super.field21;
                        int var4 = super.field22;
                        if (this.field1498 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field1498 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field1498 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field1499 - 10 || var3 > this.field1501 + this.field1499 + 10 || var4 < this.field1500 - 10 || var4 > this.field1502 + this.field1500 + 10) {
                            this.field1420 = false;
                            if (this.field1498 == 1) {
                                this.field1623 = true;
                            }
                            if (this.field1498 == 2) {
                                this.field1492 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1499;
                        int var6 = this.field1500;
                        int var7 = this.field1501;
                        int var8 = super.field28;
                        int var9 = super.field29;
                        if (this.field1498 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field1498 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field1498 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1213; ++var11) {
                            int var12 = (this.field1213 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method462((byte) -2, var10);
                        }
                        this.field1420 = false;
                        if (this.field1498 == 1) {
                            this.field1623 = true;
                        }
                        if (this.field1498 == 2) {
                            this.field1492 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1213 > 0) {
                        int var13 = this.field1541[this.field1213 - 1];
                        if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
                            int var14 = this.field1539[this.field1213 - 1];
                            int var15 = this.field1540[this.field1213 - 1];
                            Component var16 = Component.field70[var15];
                            if (var16.field97 || var16.field100) {
                                this.field1590 = false;
                                this.field1431 = 0;
                                this.field1345 = var15;
                                this.field1346 = var14;
                                this.field1347 = 2;
                                this.field1348 = super.field28;
                                this.field1349 = super.field29;
                                if (Component.field70[var15].field76 == this.field1217) {
                                    this.field1347 = 1;
                                }
                                if (Component.field70[var15].field76 == this.field1350) {
                                    this.field1347 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1416 == 1 || this.method492(this.field1352, this.field1213 - 1)) && this.field1213 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1213 > 0) {
                        this.method462((byte) -2, this.field1213 - 1);
                    }
                    if (var2 != 2 || this.field1213 <= 0) {
                        return;
                    }
                    this.method533(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method487(Component arg0, int arg1) {
        if (arg1 != 9) {
            this.field1532 = -1;
        }
        int var3 = arg0.field79;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1386[this.field1213] = "Remove @whi@" + arg0.field111;
                this.field1541[this.field1213] = 556;
                ++this.field1213;
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
            this.field1386[this.field1213] = "Remove @whi@" + this.field1536[var3];
            this.field1541[this.field1213] = 557;
            ++this.field1213;
            this.field1386[this.field1213] = "Message @whi@" + this.field1536[var3];
            this.field1541[this.field1213] = 679;
            ++this.field1213;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;II)V")
    public final void method488(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (arg3 != 19482) {
            this.method6();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1219 + this.field1201 & 2047;
            int var7 = Model.field613[var6];
            int var8 = Model.field614[var6];
            int var9 = var7 * 256 / (this.field1452 + 256);
            int var10 = var8 * 256 / (this.field1452 + 256);
            int var11 = arg0 * var9 + arg2 * var10 >> 16;
            int var12 = arg0 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1200.method203(15, 256, 15, var15 + 94 + 4 - 10, 20, 83 - var16 - 20, true, var13, 20);
        } else {
            this.method511(arg2, arg1, arg0, 5);
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://127.0.0.1:" + (field1486 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    private final void method489(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1204.method228(127);
        }
        if (this.field1509 == 2) {
            for (LocSpawned var3 = (LocSpawned) this.field1448.method257(); var3 != null; var3 = (LocSpawned) this.field1448.method259(-327)) {
                if (var3.field741 > 0) {
                    --var3.field741;
                }
                if (var3.field741 == 0) {
                    if (var3.field734 < 0 || World.method30(9, var3.field736, var3.field734)) {
                        this.method453(var3.field736, var3.field733, var3.field735, this.field1314, var3.field731, var3.field734, var3.field732, var3.field730);
                        var3.method119();
                    }
                } else {
                    if (var3.field740 > 0) {
                        --var3.field740;
                    }
                    if (var3.field740 == 0 && var3.field732 >= 1 && var3.field733 >= 1 && var3.field732 <= 102 && var3.field733 <= 102 && (var3.field737 < 0 || World.method30(9, var3.field739, var3.field737))) {
                        this.method453(var3.field739, var3.field733, var3.field738, this.field1314, var3.field731, var3.field737, var3.field732, var3.field730);
                        var3.field740 = -1;
                        if (var3.field737 == var3.field734 && var3.field734 == -1) {
                            var3.method119();
                        } else if (var3.field737 == var3.field734 && var3.field738 == var3.field735 && var3.field739 == var3.field736) {
                            var3.method119();
                        }
                    }
                }
            }
            ++field1252;
            if (field1252 > 85) {
                field1252 = 0;
                this.field1204.method227(9, 63);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method490(int arg0) {
        int var2 = 50 / arg0;
        if (this.field1271 != 0) {
            PixFont var3 = this.field1300;
            int var4 = 0;
            if (this.field1614 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1389[var5] != null) {
                    int var6 = this.field1387[var5];
                    String var7 = this.field1388[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1577 == 0 || this.field1577 == 1 && this.method433(288, var7))) {
                        int var9 = 329 - var4 * 13;
                        byte var10 = 4;
                        var3.method216(0, "From", 0, var10, var9);
                        var3.method216(0, "From", 65535, var10, var9 - 1);
                        int var11 = var10 + var3.method215(true, "From ");
                        if (var8 == 1) {
                            this.field1578[0].method211(var11, 200, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field1578[1].method211(var11, 200, var9 - 12);
                            var11 += 14;
                        }
                        var3.method216(0, var7 + ": " + this.field1389[var5], 0, var11, var9);
                        var3.method216(0, var7 + ": " + this.field1389[var5], 65535, var11, var9 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1577 < 2) {
                        int var12 = 329 - var4 * 13;
                        var3.method216(0, this.field1389[var5], 0, 4, var12);
                        var3.method216(0, this.field1389[var5], 65535, 4, var12 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1577 < 2) {
                        int var13 = 329 - var4 * 13;
                        var3.method216(0, "To " + var7 + ": " + this.field1389[var5], 0, 4, var13);
                        var3.method216(0, "To " + var7 + ": " + this.field1389[var5], 65535, 4, var13 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public static final void method491(int arg0) {
        World3D.field299 = true;
        Pix3D.field644 = true;
        int var1 = 42 / arg0;
        field1488 = true;
        World.field42 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Z")
    public final boolean method492(int arg0, int arg1) {
        if (arg0 >= 0) {
            field1468 = this.field1379.method304();
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1541[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 406;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method493(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1432[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1432[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1433[var14] = (this.field1432[var14 - 1] + this.field1432[var14 + 1] + this.field1432[var14 - 128] + this.field1432[var14 + 128]) / 4;
            }
        }
        this.field1628 += 128;
        if (this.field1628 > this.field1591.length) {
            this.field1628 -= this.field1591.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method454(50, this.field1551[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1433[var11 + 128] - this.field1591[this.field1628 + var11 & this.field1591.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1432[var11] = var12;
            }
        }
        if (arg0 >= 0) {
            this.field1204.method228(153);
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1328[var8] = this.field1328[var8 + 1];
        }
        this.field1328[var2 - 1] = (int) (Math.sin((double) field1444 / 14.0D) * 16.0D + Math.sin((double) field1444 / 15.0D) * 14.0D + Math.sin((double) field1444 / 16.0D) * 12.0D);
        if (this.field1606 > 0) {
            this.field1606 -= 4;
        }
        if (this.field1607 > 0) {
            this.field1607 -= 4;
        }
        if (this.field1606 == 0 && this.field1607 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1606 = 1024;
            }
            if (var9 == 1) {
                this.field1607 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILd;II)V")
    public final void method494(int arg0, boolean arg1, int arg2, int arg3, Component arg4, int arg5, int arg6) {
        if (arg4.field77 == 0 && arg4.field92 != null && !arg4.field91) {
            if (arg5 >= arg0 && arg2 >= arg6 && arg5 <= arg4.field80 + arg0 && arg2 <= arg4.field81 + arg6) {
                int var8 = arg4.field92.length;
                if (!arg1) {
                    this.field1476 = !this.field1476;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg4.field93[var9] + arg0;
                    int var11 = arg4.field94[var9] + arg6 - arg3;
                    Component var12 = Component.field70[arg4.field92[var9]];
                    int var13 = var12.field83 + var10;
                    int var14 = var12.field84 + var11;
                    if ((var12.field88 >= 0 || var12.field115 != 0) && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                        if (var12.field88 >= 0) {
                            this.field1613 = var12.field88;
                        } else {
                            this.field1613 = var12.field75;
                        }
                    }
                    if (var12.field77 == 0) {
                        this.method494(var13, true, arg2, var12.field90, var12, arg5, var14);
                        if (var12.field89 > var12.field81) {
                            this.method536(var14, var12.field80 + var13, var12.field89, var12.field81, true, var12, arg2, arg5, (byte) 56);
                        }
                    } else {
                        if (var12.field78 == 1 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            boolean var15 = false;
                            if (var12.field79 != 0) {
                                var15 = this.method487(var12, 9);
                            }
                            if (!var15) {
                                this.field1386[this.field1213] = var12.field131;
                                this.field1541[this.field1213] = 951;
                                this.field1540[this.field1213] = var12.field75;
                                ++this.field1213;
                            }
                        }
                        if (var12.field78 == 2 && this.field1329 == 0 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            String var16 = var12.field128;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1386[this.field1213] = var16 + " @gre@" + var12.field129;
                            this.field1541[this.field1213] = 930;
                            this.field1540[this.field1213] = var12.field75;
                            ++this.field1213;
                        }
                        if (var12.field78 == 3 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            this.field1386[this.field1213] = "Close";
                            this.field1541[this.field1213] = 947;
                            this.field1540[this.field1213] = var12.field75;
                            ++this.field1213;
                        }
                        if (var12.field78 == 4 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            this.field1386[this.field1213] = var12.field131;
                            this.field1541[this.field1213] = 465;
                            this.field1540[this.field1213] = var12.field75;
                            ++this.field1213;
                        }
                        if (var12.field78 == 5 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            this.field1386[this.field1213] = var12.field131;
                            this.field1541[this.field1213] = 960;
                            this.field1540[this.field1213] = var12.field75;
                            ++this.field1213;
                        }
                        if (var12.field78 == 6 && !this.field1385 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field80 + var13 && arg2 < var12.field81 + var14) {
                            this.field1386[this.field1213] = var12.field131;
                            this.field1541[this.field1213] = 44;
                            this.field1540[this.field1213] = var12.field75;
                            ++this.field1213;
                        }
                        if (var12.field77 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field81; ++var18) {
                                for (int var19 = 0; var19 < var12.field80; ++var19) {
                                    int var20 = (var12.field101 + 32) * var19 + var13;
                                    int var21 = (var12.field102 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field104[var17];
                                        var21 += var12.field105[var17];
                                    }
                                    if (arg5 >= var20 && arg2 >= var21 && arg5 < var20 + 32 && arg2 < var21 + 32) {
                                        this.field1442 = var17;
                                        this.field1443 = var12.field75;
                                        if (var12.field71[var17] > 0) {
                                            ObjType var22 = ObjType.method348(var12.field71[var17] - 1);
                                            if (this.field1435 == 1 && var12.field98) {
                                                if (this.field1437 != var12.field75 || this.field1436 != var17) {
                                                    this.field1386[this.field1213] = "Use " + this.field1439 + " with @lre@" + var22.field1034;
                                                    this.field1541[this.field1213] = 881;
                                                    this.field1542[this.field1213] = var22.field1032;
                                                    this.field1539[this.field1213] = var17;
                                                    this.field1540[this.field1213] = var12.field75;
                                                    ++this.field1213;
                                                }
                                            } else if (this.field1329 == 1 && var12.field98) {
                                                if ((this.field1331 & 16) == 16) {
                                                    this.field1386[this.field1213] = this.field1332 + " @lre@" + var22.field1034;
                                                    this.field1541[this.field1213] = 391;
                                                    this.field1542[this.field1213] = var22.field1032;
                                                    this.field1539[this.field1213] = var17;
                                                    this.field1540[this.field1213] = var12.field75;
                                                    ++this.field1213;
                                                }
                                            } else {
                                                if (var12.field98) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1050 != null && var22.field1050[var23] != null) {
                                                            this.field1386[this.field1213] = var22.field1050[var23] + " @lre@" + var22.field1034;
                                                            if (var23 == 3) {
                                                                this.field1541[this.field1213] = 478;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1541[this.field1213] = 347;
                                                            }
                                                            this.field1542[this.field1213] = var22.field1032;
                                                            this.field1539[this.field1213] = var17;
                                                            this.field1540[this.field1213] = var12.field75;
                                                            ++this.field1213;
                                                        } else if (var23 == 4) {
                                                            this.field1386[this.field1213] = "Drop @lre@" + var22.field1034;
                                                            this.field1541[this.field1213] = 347;
                                                            this.field1542[this.field1213] = var22.field1032;
                                                            this.field1539[this.field1213] = var17;
                                                            this.field1540[this.field1213] = var12.field75;
                                                            ++this.field1213;
                                                        }
                                                    }
                                                }
                                                if (var12.field99) {
                                                    this.field1386[this.field1213] = "Use @lre@" + var22.field1034;
                                                    this.field1541[this.field1213] = 188;
                                                    this.field1542[this.field1213] = var22.field1032;
                                                    this.field1539[this.field1213] = var17;
                                                    this.field1540[this.field1213] = var12.field75;
                                                    ++this.field1213;
                                                }
                                                if (var12.field98 && var22.field1050 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1050[var24] != null) {
                                                            this.field1386[this.field1213] = var22.field1050[var24] + " @lre@" + var22.field1034;
                                                            if (var24 == 0) {
                                                                this.field1541[this.field1213] = 405;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1541[this.field1213] = 38;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1541[this.field1213] = 422;
                                                            }
                                                            this.field1542[this.field1213] = var22.field1032;
                                                            this.field1539[this.field1213] = var17;
                                                            this.field1540[this.field1213] = var12.field75;
                                                            ++this.field1213;
                                                        }
                                                    }
                                                }
                                                if (var12.field106 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field106[var25] != null) {
                                                            this.field1386[this.field1213] = var12.field106[var25] + " @lre@" + var22.field1034;
                                                            if (var25 == 0) {
                                                                this.field1541[this.field1213] = 602;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1541[this.field1213] = 596;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1541[this.field1213] = 22;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1541[this.field1213] = 892;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1541[this.field1213] = 415;
                                                            }
                                                            this.field1542[this.field1213] = var22.field1032;
                                                            this.field1539[this.field1213] = var17;
                                                            this.field1540[this.field1213] = var12.field75;
                                                            ++this.field1213;
                                                        }
                                                    }
                                                }
                                                this.field1386[this.field1213] = "Examine @lre@" + var22.field1034;
                                                this.field1541[this.field1213] = 1773;
                                                this.field1542[this.field1213] = var22.field1032;
                                                this.field1540[this.field1213] = var12.field72[var17];
                                                ++this.field1213;
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method495(boolean arg0) {
        if (this.field1620 == 2) {
            this.method460((this.field1283 - this.field1267 << 7) + this.field1286, this.field1284 * 2, (this.field1282 - this.field1266 << 7) + this.field1285, -969);
            if (arg0) {
                this.field1236 = 369;
            }
            if (this.field1342 > -1 && field1444 % 20 < 10) {
                this.field1325[2].method198(this.field1342 - 12, 200, this.field1343 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method496(int arg0) {
        this.field1423 = true;
        while (arg0 >= 0) {
            this.field1532 = -1;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1255[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1103; ++var3) {
                if (!IdkType.field1104[var3].field1110 && IdkType.field1104[var3].field1105 == var2 + (this.field1429 ? 0 : 7)) {
                    this.field1255[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method497(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1309 && !this.field1455 && !this.field1280) {
            ++field1444;
            if (arg0 < 2 || arg0 > 2) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field1371) {
                this.method513(0);
            } else {
                this.method541(this.field1287);
            }
            this.method474(18352);
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    private final void method498(int arg0) {
        LocSpawned var2 = (LocSpawned) this.field1448.method257();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field741 == -1) {
                var2.field740 = 0;
                this.method521((byte) 6, var2);
            } else {
                var2.method119();
            }
            var2 = (LocSpawned) this.field1448.method259(-327);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method499(boolean arg0, int arg1) {
        Component var3 = Component.field70[arg1];
        for (int var4 = 0; var4 < var3.field92.length && var3.field92[var4] != -1; ++var4) {
            Component var5 = Component.field70[var3.field92[var4]];
            if (var5.field77 == 1) {
                this.method499(this.field1279, var5.field75);
            }
            var5.field73 = 0;
            var5.field74 = 0;
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method500(int arg0) {
        while (arg0 >= 0) {
            this.field1204.method228(161);
        }
        if (this.field1213 >= 2 || this.field1435 != 0 || this.field1329 != 0) {
            String var2;
            if (this.field1435 == 1 && this.field1213 < 2) {
                var2 = "Use " + this.field1439 + " with...";
            } else if (this.field1329 == 1 && this.field1213 < 2) {
                var2 = this.field1332 + "...";
            } else {
                var2 = this.field1386[this.field1213 - 1];
            }
            if (this.field1213 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1213 - 2) + " more options";
            }
            this.field1301.method219(field1444 / 1000, 16777215, true, var2, 15, 4, true);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method501(boolean arg0) {
        if (arg0) {
            this.field1532 = -1;
        }
        if (super.field27 == 1) {
            if (super.field28 >= 539 && super.field28 <= 573 && super.field29 >= 169 && super.field29 < 205 && this.field1631[0] != -1) {
                this.field1623 = true;
                this.field1450 = 0;
                this.field1589 = true;
            }
            if (super.field28 >= 569 && super.field28 <= 599 && super.field29 >= 168 && super.field29 < 205 && this.field1631[1] != -1) {
                this.field1623 = true;
                this.field1450 = 1;
                this.field1589 = true;
            }
            if (super.field28 >= 597 && super.field28 <= 627 && super.field29 >= 168 && super.field29 < 205 && this.field1631[2] != -1) {
                this.field1623 = true;
                this.field1450 = 2;
                this.field1589 = true;
            }
            if (super.field28 >= 625 && super.field28 <= 669 && super.field29 >= 168 && super.field29 < 203 && this.field1631[3] != -1) {
                this.field1623 = true;
                this.field1450 = 3;
                this.field1589 = true;
            }
            if (super.field28 >= 666 && super.field28 <= 696 && super.field29 >= 168 && super.field29 < 205 && this.field1631[4] != -1) {
                this.field1623 = true;
                this.field1450 = 4;
                this.field1589 = true;
            }
            if (super.field28 >= 694 && super.field28 <= 724 && super.field29 >= 168 && super.field29 < 205 && this.field1631[5] != -1) {
                this.field1623 = true;
                this.field1450 = 5;
                this.field1589 = true;
            }
            if (super.field28 >= 722 && super.field28 <= 756 && super.field29 >= 169 && super.field29 < 205 && this.field1631[6] != -1) {
                this.field1623 = true;
                this.field1450 = 6;
                this.field1589 = true;
            }
            if (super.field28 >= 540 && super.field28 <= 574 && super.field29 >= 466 && super.field29 < 502 && this.field1631[7] != -1) {
                this.field1623 = true;
                this.field1450 = 7;
                this.field1589 = true;
            }
            if (super.field28 >= 572 && super.field28 <= 602 && super.field29 >= 466 && super.field29 < 503 && this.field1631[8] != -1) {
                this.field1623 = true;
                this.field1450 = 8;
                this.field1589 = true;
            }
            if (super.field28 >= 599 && super.field28 <= 629 && super.field29 >= 466 && super.field29 < 503 && this.field1631[9] != -1) {
                this.field1623 = true;
                this.field1450 = 9;
                this.field1589 = true;
            }
            if (super.field28 >= 627 && super.field28 <= 671 && super.field29 >= 467 && super.field29 < 502 && this.field1631[10] != -1) {
                this.field1623 = true;
                this.field1450 = 10;
                this.field1589 = true;
            }
            if (super.field28 >= 669 && super.field28 <= 699 && super.field29 >= 466 && super.field29 < 503 && this.field1631[11] != -1) {
                this.field1623 = true;
                this.field1450 = 11;
                this.field1589 = true;
            }
            if (super.field28 >= 696 && super.field28 <= 726 && super.field29 >= 466 && super.field29 < 503 && this.field1631[12] != -1) {
                this.field1623 = true;
                this.field1450 = 12;
                this.field1589 = true;
            }
            if (super.field28 >= 724 && super.field28 <= 758 && super.field29 >= 466 && super.field29 < 502 && this.field1631[13] != -1) {
                this.field1623 = true;
                this.field1450 = 13;
                this.field1589 = true;
            }
            ++field1422;
            if (field1422 > 150) {
                field1422 = 0;
                this.field1204.method227(9, 136);
                this.field1204.method228(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method502(int arg0, Packet arg1, int arg2) {
        if (arg0 == 46870) {
            for (int var4 = 0; var4 < this.field1524; ++var4) {
                int var5 = this.field1525[var4];
                NpcEntity var6 = this.field1480[var5];
                int var7 = arg1.method238();
                if ((var7 & 1) == 1) {
                    int var8 = arg1.method238();
                    int var9 = arg1.method238();
                    var6.method127(var9, var8, -375);
                    var6.field433 = field1444 + 300;
                    var6.field434 = arg1.method238();
                    var6.field435 = arg1.method238();
                }
                if ((var7 & 2) == 2) {
                    int var10 = arg1.method240();
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    if (var6.field442 == var10) {
                        var6.field446 = 0;
                    }
                    int var11 = arg1.method238();
                    if (var6.field442 == var10 && var10 != -1) {
                        int var12 = SeqType.field1125[var10].field1139;
                        if (var12 == 1) {
                            var6.field443 = 0;
                            var6.field444 = 0;
                            var6.field445 = var11;
                            var6.field446 = 0;
                        }
                        if (var12 == 2) {
                            var6.field446 = 0;
                        }
                    } else if (var10 == -1 || var6.field442 == -1 || SeqType.field1125[var10].field1133 >= SeqType.field1125[var6.field442].field1133) {
                        var6.field442 = var10;
                        var6.field443 = 0;
                        var6.field444 = 0;
                        var6.field445 = var11;
                        var6.field446 = 0;
                        var6.field467 = var6.field462;
                    }
                }
                if ((var7 & 4) == 4) {
                    var6.field436 = arg1.method240();
                    if (var6.field436 == 65535) {
                        var6.field436 = -1;
                    }
                }
                if ((var7 & 8) == 8) {
                    var6.field426 = arg1.method245();
                    var6.field427 = 100;
                }
                if ((var7 & 16) == 16) {
                    int var13 = arg1.method238();
                    int var14 = arg1.method238();
                    var6.method127(var14, var13, -375);
                    var6.field433 = field1444 + 300;
                    var6.field434 = arg1.method238();
                    var6.field435 = arg1.method238();
                }
                if ((var7 & 32) == 32) {
                    var6.field471 = NpcType.method342(arg1.method240());
                    var6.field421 = var6.field471.field1002;
                    var6.field422 = var6.field471.field1003;
                    var6.field423 = var6.field471.field1004;
                    var6.field424 = var6.field471.field1005;
                    var6.field419 = var6.field471.field1001;
                }
                if ((var7 & 64) == 64) {
                    var6.field447 = arg1.method240();
                    int var15 = arg1.method243();
                    var6.field451 = var15 >> 16;
                    var6.field450 = (var15 & 65535) + field1444;
                    var6.field448 = 0;
                    var6.field449 = 0;
                    if (var6.field450 > field1444) {
                        var6.field448 = -1;
                    }
                    if (var6.field447 == 65535) {
                        var6.field447 = -1;
                    }
                }
                if ((var7 & 128) == 128) {
                    var6.field437 = arg1.method240();
                    var6.field438 = arg1.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;BI)V")
    public final void method503(Packet arg0, byte arg1, int arg2) {
        if (arg1 != 3) {
            this.field1289 = null;
        }
        if (arg2 != 119 && arg2 != 198) {
            if (arg2 == 71) {
                int var4 = arg0.method238();
                int var5 = (var4 >> 4 & 7) + this.field1596;
                int var6 = (var4 & 7) + this.field1597;
                int var7 = arg0.method238();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1622[var8];
                int var11 = arg0.method240();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1557[this.field1587][var5][var6];
                    int var13 = this.field1557[this.field1587][var5 + 1][var6];
                    int var14 = this.field1557[this.field1587][var5 + 1][var6 + 1];
                    int var15 = this.field1557[this.field1587][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1250.method85(5, var6, this.field1587, var5);
                        if (var16 != null) {
                            int var17 = var16.field286 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field284 = new LocEntity(var14, var17, (byte) 2, false, var12, var15, 2, var9 + 4, var13, var11);
                                var16.field285 = new LocEntity(var14, var17, (byte) 2, false, var12, var15, 2, var9 + 1 & 3, var13, var11);
                            } else {
                                var16.field284 = new LocEntity(var14, var17, (byte) 2, false, var12, var15, var8, var9, var13, var11);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1250.method86(var6, this.field1587, var5, this.field1603);
                        if (var18 != null) {
                            var18.field177 = new LocEntity(var14, var18.field178 >> 14 & 32767, (byte) 2, false, var12, var15, 4, 0, var13, var11);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1250.method87(var6, var5, (byte) 1, this.field1587);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field269 = new LocEntity(var14, var19.field277 >> 14 & 32767, (byte) 2, false, var12, var15, var8, var9, var13, var11);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1250.method88(var6, this.field1587, var5, 0);
                        if (var20 != null) {
                            var20.field208 = new LocEntity(var14, var20.field209 >> 14 & 32767, (byte) 2, false, var12, var15, 22, var9, var13, var11);
                        }
                    }
                }
            } else if (arg2 == 94) {
                int var21 = arg0.method238();
                int var22 = (var21 >> 4 & 7) + this.field1596;
                int var23 = (var21 & 7) + this.field1597;
                int var24 = arg0.method240();
                int var25 = arg0.method240();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field509 = var24;
                    var26.field510 = var25;
                    if (this.field1289[this.field1587][var22][var23] == null) {
                        this.field1289[this.field1587][var22][var23] = new LinkList(false);
                    }
                    this.field1289[this.field1587][var22][var23].method254(var26);
                    this.method434(var22, var23);
                }
            } else if (arg2 == 13) {
                int var27 = arg0.method238();
                int var28 = (var27 >> 4 & 7) + this.field1596;
                int var29 = (var27 & 7) + this.field1597;
                int var30 = arg0.method240();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1289[this.field1587][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method257(); var32 != null; var32 = (ObjStackEntity) var31.method259(-327)) {
                            if ((var30 & 32767) == var32.field509) {
                                var32.method119();
                                break;
                            }
                        }
                        if (var31.method257() == null) {
                            this.field1289[this.field1587][var28][var29] = null;
                        }
                        this.method434(var28, var29);
                    }
                }
            } else if (arg2 == 187) {
                int var33 = arg0.method238();
                int var34 = (var33 >> 4 & 7) + this.field1596;
                int var35 = (var33 & 7) + this.field1597;
                int var36 = var34 + arg0.method239();
                int var37 = var35 + arg0.method239();
                int var38 = arg0.method241();
                int var39 = arg0.method240();
                int var40 = arg0.method238();
                int var41 = arg0.method238();
                int var42 = arg0.method240();
                int var43 = arg0.method240();
                int var44 = arg0.method238();
                int var45 = arg0.method238();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(this.method526(var47, this.field1587, var46, (byte) 2) - var40, var45, this.field1587, var47, field1444 + var43, var41, var39, var44, var38, 200, var46, field1444 + var42);
                    var50.method132(var48, var49, field1444 + var42, this.field1304, this.method526(var49, this.field1587, var48, (byte) 2) - var41);
                    this.field1447.method254(var50);
                }
            } else if (arg2 == 141) {
                int var51 = arg0.method238();
                int var52 = (var51 >> 4 & 7) + this.field1596;
                int var53 = (var51 & 7) + this.field1597;
                int var54 = arg0.method240();
                int var55 = arg0.method238();
                int var56 = arg0.method240();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(this.field1587, var56, (byte) 9, var58, this.method526(var58, this.field1587, var57, (byte) 2) - var55, var54, var57, field1444);
                    this.field1351.method254(var59);
                }
            } else if (arg2 == 190) {
                int var60 = arg0.method238();
                int var61 = (var60 >> 4 & 7) + this.field1596;
                int var62 = (var60 & 7) + this.field1597;
                int var63 = arg0.method240();
                int var64 = arg0.method240();
                int var65 = arg0.method240();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1594 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field509 = var63;
                    var66.field510 = var64;
                    if (this.field1289[this.field1587][var61][var62] == null) {
                        this.field1289[this.field1587][var61][var62] = new LinkList(false);
                    }
                    this.field1289[this.field1587][var61][var62].method254(var66);
                    this.method434(var61, var62);
                }
            } else {
                if (arg2 == 188) {
                    int var67 = arg0.method238();
                    int var68 = (var67 >> 4 & 7) + this.field1596;
                    int var69 = (var67 & 7) + this.field1597;
                    int var70 = arg0.method238();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1622[var71];
                    int var74 = arg0.method240();
                    int var75 = arg0.method240();
                    int var76 = arg0.method240();
                    int var77 = arg0.method240();
                    byte var78 = arg0.method239();
                    byte var79 = arg0.method239();
                    byte var80 = arg0.method239();
                    byte var81 = arg0.method239();
                    PlayerEntity var82;
                    if (this.field1594 == var77) {
                        var82 = field1527;
                    } else {
                        var82 = this.field1521[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method333(var74);
                        int var84 = this.field1557[this.field1587][var68][var69];
                        int var85 = this.field1557[this.field1587][var68 + 1][var69];
                        int var86 = this.field1557[this.field1587][var68 + 1][var69 + 1];
                        int var87 = this.field1557[this.field1587][var68][var69 + 1];
                        Model var88 = var83.method339(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method456(-1, var73, this.field1587, -431, 0, var69, var75 + 1, var76 + 1, var68, 0);
                            var82.field485 = field1444 + var75;
                            var82.field486 = field1444 + var76;
                            var82.field490 = var88;
                            int var89 = var83.field951;
                            int var90 = var83.field952;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field952;
                                var90 = var83.field951;
                            }
                            var82.field487 = var68 * 128 + var89 * 64;
                            var82.field489 = var69 * 128 + var90 * 64;
                            var82.field488 = this.method526(var82.field489, this.field1587, var82.field487, (byte) 2);
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
                            var82.field491 = var68 + var78;
                            var82.field493 = var68 + var80;
                            var82.field492 = var69 + var79;
                            var82.field494 = var69 + var81;
                        }
                    }
                }
                if (arg2 == 151) {
                    int var93 = arg0.method238();
                    int var94 = (var93 >> 4 & 7) + this.field1596;
                    int var95 = (var93 & 7) + this.field1597;
                    int var96 = arg0.method240();
                    int var97 = arg0.method240();
                    int var98 = arg0.method240();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1289[this.field1587][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method257(); var100 != null; var100 = (ObjStackEntity) var99.method259(-327)) {
                                if ((var96 & 32767) == var100.field509 && var100.field510 == var97) {
                                    var100.field510 = var98;
                                    break;
                                }
                            }
                            this.method434(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var101 = arg0.method238();
            int var102 = (var101 >> 4 & 7) + this.field1596;
            int var103 = (var101 & 7) + this.field1597;
            int var104 = arg0.method238();
            int var105 = var104 >> 2;
            int var106 = var104 & 3;
            int var107 = this.field1622[var105];
            int var108;
            if (arg2 == 198) {
                var108 = -1;
            } else {
                var108 = arg0.method240();
            }
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                this.method456(var108, var107, this.field1587, -431, var106, var103, 0, -1, var102, var105);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        this.field1529 = false;
        while (this.field1258) {
            this.field1529 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1633 = null;
        this.field1634 = null;
        this.field1551 = null;
        this.field1359 = null;
        this.field1360 = null;
        this.field1361 = null;
        this.field1362 = null;
        if (arg0) {
            this.field1296 = !this.field1296;
        }
        this.field1591 = null;
        this.field1592 = null;
        this.field1432 = null;
        this.field1433 = null;
        this.field1275 = null;
        this.field1276 = null;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method505(byte arg0) {
        if (arg0 != -34) {
            this.method6();
        }
        if (super.field27 == 1) {
            if (super.field28 >= 6 && super.field28 <= 106 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1428 = (this.field1428 + 1) % 4;
                this.field1478 = true;
                this.field1492 = true;
                this.field1204.method227(9, 8);
                this.field1204.method228(this.field1428);
                this.field1204.method228(this.field1577);
                this.field1204.method228(this.field1489);
            }
            if (super.field28 >= 135 && super.field28 <= 235 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1577 = (this.field1577 + 1) % 3;
                this.field1478 = true;
                this.field1492 = true;
                this.field1204.method227(9, 8);
                this.field1204.method228(this.field1428);
                this.field1204.method228(this.field1577);
                this.field1204.method228(this.field1489);
            }
            if (super.field28 >= 273 && super.field28 <= 373 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1489 = (this.field1489 + 1) % 3;
                this.field1478 = true;
                this.field1492 = true;
                this.field1204.method227(9, 8);
                this.field1204.method228(this.field1428);
                this.field1204.method228(this.field1577);
                this.field1204.method228(this.field1489);
            }
            if (super.field28 >= 412 && super.field28 <= 512 && super.field29 >= 467 && super.field29 <= 499) {
                this.method517(-361);
                this.field1575 = "";
                this.field1211 = false;
                for (int var2 = 0; var2 < Component.field70.length; ++var2) {
                    if (Component.field70[var2] != null && Component.field70[var2].field79 == 600) {
                        this.field1604 = this.field1217 = Component.field70[var2].field76;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1485 = Integer.parseInt(this.getParameter("nodeid"));
        field1486 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method491(856);
        } else {
            method470(271);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1487 = false;
        } else {
            field1487 = true;
        }
        this.method2(765, 503, false);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method506(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1532 = -1;
        }
        if (!field1488) {
            if (Pix3D.field663[17] >= arg0) {
                Pix8 var3 = Pix3D.field657[17];
                int var4 = var3.field685 * var3.field684 - 1;
                int var5 = this.field1290 * var3.field684 * 2;
                byte[] var6 = var3.field682;
                byte[] var7 = this.field1640;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field682 = var7;
                this.field1640 = var6;
                Pix3D.method183(17, true);
            }
            if (Pix3D.field663[24] >= arg0) {
                Pix8 var9 = Pix3D.field657[24];
                int var10 = var9.field685 * var9.field684 - 1;
                int var11 = this.field1290 * var9.field684 * 2;
                byte[] var12 = var9.field682;
                byte[] var13 = this.field1640;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field682 = var13;
                this.field1640 = var12;
                Pix3D.method183(24, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method507(int arg0) {
        if (this.field1535 > 0) {
            this.method554(-956);
        } else {
            this.field1426.method267(this.field1378);
            if (arg0 != 22095) {
                this.field1532 = this.field1327.method238();
            }
            this.field1300.method213(0, 257, 144, "Connection lost", -977);
            this.field1300.method213(16777215, 256, 143, "Connection lost", -977);
            this.field1300.method213(0, 257, 159, "Please wait - attempting to reestablish", -977);
            this.field1300.method213(16777215, 256, 158, "Please wait - attempting to reestablish", -977);
            this.field1426.method268(4, (byte) 107, super.field13, 4);
            this.field1272 = 0;
            ClientStream var2 = this.field1297;
            this.field1371 = false;
            this.method551(this.field1198, this.field1199, true);
            if (!this.field1371) {
                this.method554(-956);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method508(byte arg0) {
        byte[] var2 = this.field1278.method308("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1561.method267(this.field1378);
        var3.method196(0, 49740, 0);
        this.field1562.method267(this.field1378);
        var3.method196(-637, 49740, 0);
        this.field1558.method267(this.field1378);
        var3.method196(-128, 49740, 0);
        this.field1559.method267(this.field1378);
        var3.method196(-202, 49740, -371);
        this.field1560.method267(this.field1378);
        var3.method196(-202, 49740, -171);
        this.field1563.method267(this.field1378);
        var3.method196(0, 49740, -265);
        this.field1564.method267(this.field1378);
        var3.method196(-562, 49740, -265);
        this.field1565.method267(this.field1378);
        var3.method196(-128, 49740, -171);
        this.field1566.method267(this.field1378);
        var3.method196(-562, 49740, -171);
        if (arg0 != 4) {
            this.field1532 = -1;
        }
        int[] var4 = new int[var3.field671];
        for (int var5 = 0; var5 < var3.field672; ++var5) {
            for (int var10 = 0; var10 < var3.field671; ++var10) {
                var4[var10] = var3.field670[var3.field671 * var5 + (var3.field671 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field671; ++var11) {
                var3.field670[var3.field671 * var5 + var11] = var4[var11];
            }
        }
        this.field1561.method267(this.field1378);
        var3.method196(382, 49740, 0);
        this.field1562.method267(this.field1378);
        var3.method196(-255, 49740, 0);
        this.field1558.method267(this.field1378);
        var3.method196(254, 49740, 0);
        this.field1559.method267(this.field1378);
        var3.method196(180, 49740, -371);
        this.field1560.method267(this.field1378);
        var3.method196(180, 49740, -171);
        this.field1563.method267(this.field1378);
        var3.method196(382, 49740, -265);
        this.field1564.method267(this.field1378);
        var3.method196(-180, 49740, -265);
        this.field1565.method267(this.field1378);
        var3.method196(254, 49740, -171);
        this.field1566.method267(this.field1378);
        var3.method196(-180, 49740, -171);
        Pix32 var6 = new Pix32(this.field1278, "logo", 0);
        this.field1558.method267(this.field1378);
        var6.method198(382 - var6.field671 / 2 - 128, 200, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public final void method13(byte arg0, String arg1, int arg2) {
        this.field1366 = arg2;
        this.field1605 = arg1;
        this.method477(0);
        if (this.field1278 == null) {
            super.method13((byte) 7, arg1, arg2);
        } else {
            this.field1560.method267(this.field1378);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1301.method213(16777215, var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", -977);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method170(var4 / 2 - 152, 34, var7, 304, 9179409, false);
            Pix2D.method170(var4 / 2 - 151, 32, var7 + 1, 302, 0, false);
            Pix2D.method169(-556, var7 + 2, 30, var4 / 2 - 150, arg2 * 3, 9179409);
            Pix2D.method169(-556, var7 + 2, 30, arg2 * 3 + (var4 / 2 - 150), 300 - arg2 * 3, 0);
            this.field1301.method213(16777215, var4 / 2, var5 / 2 + 5 - var6, arg1, -977);
            if (arg0 != 7) {
                this.field1532 = -1;
            }
            this.field1560.method268(202, (byte) 107, super.field13, 171);
            if (this.field1517) {
                this.field1517 = false;
                if (!this.field1529) {
                    this.field1561.method268(0, (byte) 107, super.field13, 0);
                    this.field1562.method268(637, (byte) 107, super.field13, 0);
                }
                this.field1558.method268(128, (byte) 107, super.field13, 0);
                this.field1559.method268(202, (byte) 107, super.field13, 371);
                this.field1563.method268(0, (byte) 107, super.field13, 265);
                this.field1564.method268(562, (byte) 107, super.field13, 265);
                this.field1565.method268(128, (byte) 107, super.field13, 171);
                this.field1566.method268(562, (byte) 107, super.field13, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method509(int arg0) {
        if (arg0 != 0) {
            this.field1289 = null;
        }
        for (int var2 = 0; var2 < this.field1608; ++var2) {
            if (this.field1598[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1203[var2] == this.field1367 && this.field1550[var2] == this.field1573) {
                        if (!this.method525((byte) -34)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method322(this.field1203[var2], this.field1550[var2], true);
                        if (System.currentTimeMillis() + (long) (var4.field713 / 22) > (long) (this.field1617 / 22) + this.field1483) {
                            this.field1617 = var4.field713;
                            this.field1483 = System.currentTimeMillis();
                            if (this.method431(var4.field713, (byte) 113, var4.field712)) {
                                this.field1367 = this.field1203[var2];
                                this.field1573 = this.field1550[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1598[var2] != -5) {
                    this.field1598[var2] = -5;
                } else {
                    --this.field1608;
                    for (int var6 = var2; var6 < this.field1608; ++var6) {
                        this.field1203[var6] = this.field1203[var6 + 1];
                        this.field1550[var6] = this.field1550[var6 + 1];
                        this.field1598[var6] = this.field1598[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1598[var2]--;
            }
        }
        if (this.field1270 > 0) {
            this.field1270 -= 20;
            if (this.field1270 < 0) {
                this.field1270 = 0;
            }
            if (this.field1270 == 0 && this.field1556 && !field1488) {
                this.field1340 = this.field1205;
                this.field1341 = false;
                this.field1576.method288(2, this.field1340);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method510(int arg0) {
        ++this.field1630;
        this.method458(true, (byte) 3);
        this.method528(13283);
        this.method458(false, (byte) 3);
        this.method545(-493);
        this.method553(1);
        if (!this.field1373) {
            int var2 = this.field1218;
            if (this.field1511 / 256 > var2) {
                var2 = this.field1511 / 256;
            }
            if (this.field1303[4] && this.field1277[4] + 128 > var2) {
                var2 = this.field1277[4] + 128;
            }
            int var3 = this.field1383 + this.field1219 & 2047;
            this.method450(var2, this.method526(field1527.field415, this.field1587, field1527.field414, (byte) 2) - 50, this.field1381, this.field1380, var3, var2 * 3 + 600, 9);
            ++field1595;
            if (field1595 > 1802) {
                field1595 = 0;
                this.field1204.method227(9, 223);
                this.field1204.method228(0);
                int var4 = this.field1204.field713;
                this.field1204.method229(29711);
                this.field1204.method228(70);
                this.field1204.method228((int) (Math.random() * 256.0D));
                this.field1204.method228(242);
                this.field1204.method228(186);
                this.field1204.method228(39);
                this.field1204.method228(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1204.method228(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1204.method229(57856);
                }
                this.field1204.method229((int) (Math.random() * 65536.0D));
                this.field1204.method237(this.field1204.field713 - var4, false);
            }
        }
        int var5;
        if (!this.field1373) {
            var5 = this.method518(-241);
        } else {
            var5 = this.method519(false);
        }
        int var6 = this.field1317;
        int var7 = this.field1318;
        int var8 = this.field1319;
        int var9 = this.field1320;
        int var10 = this.field1321;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1303[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1291[var11] * 2 + 1) - (double) this.field1291[var11] + Math.sin((double) this.field1441[var11] / 100.0D * (double) this.field1316[var11]) * (double) this.field1277[var11]);
                if (var11 == 0) {
                    this.field1317 += var13;
                }
                if (var11 == 1) {
                    this.field1318 += var13;
                }
                if (var11 == 2) {
                    this.field1319 += var13;
                }
                if (var11 == 3) {
                    this.field1321 = this.field1321 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1320 += var13;
                    if (this.field1320 < 128) {
                        this.field1320 = 128;
                    }
                    if (this.field1320 > 383) {
                        this.field1320 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field664;
        Model.field608 = true;
        Model.field611 = 0;
        Model.field609 = super.field21 - 4;
        Model.field610 = super.field22 - 4;
        Pix2D.method167(true);
        this.field1250.method102(this.field1493, this.field1320, this.field1317, this.field1318, this.field1321, this.field1319, var5);
        this.field1250.method77(0);
        this.method481(326);
        this.method495(false);
        this.method506(var12, 744);
        this.method430(6);
        this.field1426.method268(4, (byte) 107, super.field13, 4);
        this.field1317 = var6;
        this.field1318 = var7;
        this.field1319 = var8;
        this.field1320 = var9;
        if (arg0 <= 0) {
            this.field1353 = this.field1379.method304();
        }
        this.field1321 = var10;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILjb;II)V")
    public final void method511(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1219 + this.field1201 & 2047;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = Model.field613[var5];
            int var8 = Model.field614[var5];
            int var9 = var7 * 256 / (this.field1452 + 256);
            if (arg3 < 5 || arg3 > 5) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = var8 * 256 / (this.field1452 + 256);
            int var12 = arg0 * var11 + arg2 * var9 >> 16;
            int var13 = arg2 * var11 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method204(var12 + 94 - arg1.field675 / 2 + 4, this.field1495, 83 - var13 - arg1.field676 / 2 - 4, (byte) 2);
            } else {
                arg1.method198(var12 + 94 - arg1.field675 / 2 + 4, 200, 83 - var13 - arg1.field676 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method512(int arg0) {
        short var2 = 256;
        if (this.field1606 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1606 > 768) {
                    this.field1359[var3] = this.method432(1024 - this.field1606, 0, this.field1360[var3], this.field1361[var3]);
                } else if (this.field1606 > 256) {
                    this.field1359[var3] = this.field1361[var3];
                } else {
                    this.field1359[var3] = this.method432(256 - this.field1606, 0, this.field1361[var3], this.field1360[var3]);
                }
            }
        } else if (this.field1607 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1607 > 768) {
                    this.field1359[var4] = this.method432(1024 - this.field1607, 0, this.field1360[var4], this.field1362[var4]);
                } else if (this.field1607 > 256) {
                    this.field1359[var4] = this.field1362[var4];
                } else {
                    this.field1359[var4] = this.method432(256 - this.field1607, 0, this.field1362[var4], this.field1360[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1359[var5] = this.field1360[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1561.field752[var6] = this.field1275.field670[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1328[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1432[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1359[var26];
                    int var30 = this.field1561.field752[var8];
                    this.field1561.field752[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1561.method268(0, (byte) 107, super.field13, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1562.field752[var10] = this.field1276.field670[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1328[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1432[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1359[var18];
                    int var22 = this.field1562.field752[var16];
                    this.field1562.field752[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 < 0) {
            this.field1562.method268(637, (byte) 107, super.field13, 0);
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method513(int arg0) {
        this.field1531 += arg0;
        if (this.field1510 == 0) {
            int var2 = super.field11 / 2 - 80;
            int var3 = super.field12 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field27 == 1 && super.field28 >= var2 - 75 && super.field28 <= var2 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1510 = 3;
                this.field1222 = 0;
            }
            int var4 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var4 - 75 && super.field28 <= var4 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1570 = "";
                this.field1571 = "Enter your username & password.";
                this.field1510 = 2;
                this.field1222 = 0;
            }
        } else if (this.field1510 == 2) {
            int var5 = super.field12 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field27 == 1 && super.field29 >= var16 - 15 && super.field29 < var16) {
                this.field1222 = 0;
            }
            var5 = var16 + 15;
            if (super.field27 == 1 && super.field29 >= var5 - 15 && super.field29 < var5) {
                this.field1222 = 1;
            }
            var5 += 15;
            int var6 = super.field11 / 2 - 80;
            int var7 = super.field12 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field27 == 1 && super.field28 >= var6 - 75 && super.field28 <= var6 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.method551(this.field1198, this.field1199, false);
                if (this.field1371) {
                    return;
                }
            }
            int var8 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var8 - 75 && super.field28 <= var8 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.field1510 = 0;
                this.field1198 = "";
                this.field1199 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(true);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1421.length(); ++var11) {
                        if (var9 == field1421.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1222 == 0) {
                        if (var9 == 8 && this.field1198.length() > 0) {
                            this.field1198 = this.field1198.substring(0, this.field1198.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1222 = 1;
                        }
                        if (var10) {
                            this.field1198 = this.field1198 + (char) var9;
                        }
                        if (this.field1198.length() > 12) {
                            this.field1198 = this.field1198.substring(0, 12);
                        }
                    } else if (this.field1222 == 1) {
                        if (var9 == 8 && this.field1199.length() > 0) {
                            this.field1199 = this.field1199.substring(0, this.field1199.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1222 = 0;
                        }
                        if (var10) {
                            this.field1199 = this.field1199 + (char) var9;
                        }
                        if (this.field1199.length() > 20) {
                            this.field1199 = this.field1199.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1510 == 3) {
                int var12 = super.field11 / 2;
                int var13 = super.field12 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field27 == 1 && super.field28 >= var12 - 75 && super.field28 <= var12 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1510 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method514(int arg0) {
        this.field1425.method267(this.field1378);
        int var2 = this.field1219 + this.field1201 & 2047;
        int var3 = field1527.field414 / 32 + 48;
        int var4 = 464 - field1527.field415 / 32;
        this.field1274.method202(this.field1515, true, this.field1294, this.field1452 + 256, 5, var3, 151, var4, 146, var2, 25);
        this.field1293.method202(this.field1251, true, this.field1477, 256, 0, 25, 33, 25, 33, this.field1219, 0);
        for (int var5 = 0; var5 < this.field1336; ++var5) {
            int var34 = this.field1337[var5] * 4 + 2 - field1527.field414 / 32;
            int var35 = this.field1338[var5] * 4 + 2 - field1527.field415 / 32;
            this.method511(var34, this.field1505[var5], var35, 5);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var30 = 0; var30 < 104; ++var30) {
                LinkList var31 = this.field1289[this.field1587][var6][var30];
                if (var31 != null) {
                    int var32 = var6 * 4 + 2 - field1527.field414 / 32;
                    int var33 = var30 * 4 + 2 - field1527.field415 / 32;
                    this.method511(var32, this.field1207, var33, 5);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1481; ++var7) {
            NpcEntity var27 = this.field1480[this.field1482[var7]];
            if (var27 != null && var27.method126(this.field1514) && var27.field471.field1013) {
                int var28 = var27.field414 / 32 - field1527.field414 / 32;
                int var29 = var27.field415 / 32 - field1527.field415 / 32;
                this.method511(var28, this.field1208, var29, 5);
            }
        }
        for (int var8 = 0; var8 < this.field1522; ++var8) {
            PlayerEntity var20 = this.field1521[this.field1523[var8]];
            if (var20 != null && var20.method126(this.field1514)) {
                int var21 = var20.field414 / 32 - field1527.field414 / 32;
                int var22 = var20.field415 / 32 - field1527.field415 / 32;
                boolean var23 = false;
                long var24 = JString.method309(var20.field476);
                for (int var26 = 0; var26 < this.field1363; ++var26) {
                    if (this.field1372[var26] == var24 && this.field1456[var26] != 0) {
                        var23 = true;
                        break;
                    }
                }
                if (var23) {
                    this.method511(var21, this.field1210, var22, 5);
                } else {
                    this.method511(var21, this.field1209, var22, 5);
                }
            }
        }
        if (this.field1620 != 0 && field1444 % 20 < 10) {
            if (this.field1620 == 1 && this.field1262 >= 0 && this.field1262 < this.field1480.length) {
                NpcEntity var9 = this.field1480[this.field1262];
                if (var9 != null) {
                    int var10 = var9.field414 / 32 - field1527.field414 / 32;
                    int var11 = var9.field415 / 32 - field1527.field415 / 32;
                    this.method488(var11, this.field1241, var10, 19482);
                }
            }
            if (this.field1620 == 2) {
                int var12 = (this.field1282 - this.field1266) * 4 + 2 - field1527.field414 / 32;
                int var13 = (this.field1283 - this.field1267) * 4 + 2 - field1527.field415 / 32;
                this.method488(var13, this.field1241, var12, 19482);
            }
            if (this.field1620 == 10 && this.field1601 >= 0 && this.field1601 < this.field1521.length) {
                PlayerEntity var14 = this.field1521[this.field1601];
                if (var14 != null) {
                    int var15 = var14.field414 / 32 - field1527.field414 / 32;
                    int var16 = var14.field415 / 32 - field1527.field415 / 32;
                    this.method488(var16, this.field1241, var15, 19482);
                }
            }
        }
        if (this.field1272 != 0) {
            int var17 = this.field1272 * 4 + 2 - field1527.field414 / 32;
            int var18 = this.field1273 * 4 + 2 - field1527.field415 / 32;
            this.method511(var17, this.field1240, var18, 5);
        }
        Pix2D.method169(-556, 78, 3, 97, 3, 16777215);
        int var19 = 19 / arg0;
        this.field1426.method267(this.field1378);
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method515(int arg0) {
        if (arg0 != 0) {
            this.field1532 = this.field1327.method238();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    public final String method516(int arg0, int arg1) {
        this.field1531 += arg0;
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method517(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1204.method227(9, 245);
        if (this.field1237 != -1) {
            this.field1237 = -1;
            this.field1623 = true;
            this.field1385 = false;
            this.field1589 = true;
        }
        if (this.field1350 != -1) {
            this.field1350 = -1;
            this.field1492 = true;
            this.field1385 = false;
        }
        this.field1217 = -1;
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

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)I")
    public final int method518(int arg0) {
        int var2 = 3;
        if (arg0 >= 0) {
            this.field1204.method228(29);
        }
        if (this.field1320 < 310) {
            int var3 = this.field1317 >> 7;
            int var4 = this.field1319 >> 7;
            int var5 = field1527.field414 >> 7;
            int var6 = field1527.field415 >> 7;
            if ((this.field1621[this.field1587][var3][var4] & 4) != 0) {
                var2 = this.field1587;
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
                    if ((this.field1621[this.field1587][var3][var4] & 4) != 0) {
                        var2 = this.field1587;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1621[this.field1587][var3][var4] & 4) != 0) {
                            var2 = this.field1587;
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
                    if ((this.field1621[this.field1587][var3][var4] & 4) != 0) {
                        var2 = this.field1587;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1621[this.field1587][var3][var4] & 4) != 0) {
                            var2 = this.field1587;
                        }
                    }
                }
            }
        }
        if ((this.field1621[this.field1587][field1527.field414 >> 7][field1527.field415 >> 7] & 4) != 0) {
            var2 = this.field1587;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)I")
    public final int method519(boolean arg0) {
        if (arg0) {
            this.field1532 = -1;
        }
        int var2 = this.method526(this.field1319, this.field1587, this.field1317, (byte) 2);
        return var2 - this.field1318 < 800 && (this.field1621[this.field1587][this.field1317 >> 7][this.field1319 >> 7] & 4) != 0 ? this.field1587 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILmb;)V")
    private final void method520(int arg0, int arg1, Packet arg2) {
        if (arg1 < 0 || arg1 > 0) {
            this.field1353 = this.field1379.method304();
        }
        while (arg2.field714 + 21 < arg0 * 8) {
            int var4 = arg2.method249(13, this.field1471);
            if (var4 == 8191) {
                break;
            }
            if (this.field1480[var4] == null) {
                this.field1480[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1480[var4];
            this.field1482[this.field1481++] = var4;
            var5.field459 = field1444;
            var5.field471 = NpcType.method342(arg2.method249(11, this.field1471));
            var5.field418 = var5.field471.field998;
            var5.field421 = var5.field471.field1002;
            var5.field422 = var5.field471.field1003;
            var5.field423 = var5.field471.field1004;
            var5.field424 = var5.field471.field1005;
            var5.field419 = var5.field471.field1001;
            int var6 = arg2.method249(5, this.field1471);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method249(5, this.field1471);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method123(field1527.field463[0] + var6, field1527.field464[0] + var7, 8, false);
            int var8 = arg2.method249(1, this.field1471);
            if (var8 == 1) {
                this.field1525[this.field1524++] = var4;
            }
        }
        arg2.method250(37124);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1531 += arg0;
        this.field1517 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLob;)V")
    private final void method521(byte arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field731 == 0) {
            var3 = this.field1250.method89(arg1.field730, arg1.field732, arg1.field733);
        }
        if (arg1.field731 == 1) {
            var3 = this.field1250.method90(arg1.field730, arg1.field732, arg1.field733, 3);
        }
        if (arg1.field731 == 2) {
            var3 = this.field1250.method91(arg1.field730, arg1.field732, arg1.field733);
        }
        if (arg1.field731 == 3) {
            var3 = this.field1250.method92(arg1.field730, arg1.field732, arg1.field733);
        }
        if (var3 != 0) {
            int var7 = this.field1250.method93(arg1.field730, arg1.field732, arg1.field733, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field734 = var4;
        arg1.field736 = var5;
        if (arg0 != 6) {
            this.field1370 = -219;
        }
        arg1.field735 = var6;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method522(int arg0, int arg1) {
        int[] var3 = this.field1274.field670;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1621[arg0][var24][var6] & 24) == 0) {
                    this.field1250.method98(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1621[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1250.method98(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1274.method193(this.field1378);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1621[arg0][var22][var9] & 24) == 0) {
                    this.method452(var22, var9, var8, arg0, var7, this.field1242);
                }
                if (arg0 < 3 && (this.field1621[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method452(var22, var9, var8, arg0 + 1, var7, this.field1242);
                }
            }
        }
        if (arg1 != 25805) {
            this.method6();
        }
        this.field1426.method267(this.field1378);
        this.field1336 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1250.method92(this.field1587, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method333(var13).field965;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1574[this.field1587].field1086;
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
                        this.field1505[this.field1336] = this.field1572[var14];
                        this.field1337[this.field1336] = var15;
                        this.field1338[this.field1336] = var16;
                        ++this.field1336;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method523(int arg0) {
        if (arg0 >= this.field1326 && arg0 <= this.field1326) {
            if (super.field27 == 1) {
                int var2 = super.field28 - 25 - 550;
                int var3 = super.field29 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1219 + this.field1201 & 2047;
                    int var5 = Pix3D.field653[var4];
                    int var6 = Pix3D.field654[var4];
                    int var7 = (this.field1452 + 256) * var5 >> 8;
                    int var8 = (this.field1452 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1527.field414 + var9 >> 7;
                    int var12 = field1527.field415 - var10 >> 7;
                    boolean var13 = this.method429(0, 9, 0, 1, 0, field1527.field464[0], 0, 0, var11, true, var12, field1527.field463[0]);
                    if (var13) {
                        this.field1204.method228(var2);
                        this.field1204.method228(var3);
                        this.field1204.method229(this.field1219);
                        this.field1204.method228(57);
                        this.field1204.method228(this.field1201);
                        this.field1204.method228(this.field1452);
                        this.field1204.method228(89);
                        this.field1204.method229(field1527.field414);
                        this.field1204.method229(field1527.field415);
                        this.field1204.method228(this.field1434);
                        this.field1204.method228(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1309 && !this.field1455 && !this.field1280) {
            ++field1629;
            if (arg0 == -25868) {
                if (!this.field1371) {
                    this.method479((byte) 1);
                } else {
                    this.method446(-761);
                }
                this.field1518 = 0;
            }
        } else {
            this.method461(true);
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method524(int arg0) {
        for (int var2 = -1; var2 < this.field1522; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1520;
            } else {
                var4 = this.field1523[var2];
            }
            PlayerEntity var5 = this.field1521[var4];
            if (var5 != null) {
                this.method440(this.field1454, 1, var5);
            }
        }
        if (arg0 != 31294) {
            this.field1296 = !this.field1296;
        }
        ++field1639;
        if (field1639 > 1406) {
            field1639 = 0;
            this.field1204.method227(9, 112);
            this.field1204.method228(0);
            int var3 = this.field1204.field713;
            this.field1204.method228(162);
            this.field1204.method228(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1204.method228(84);
            }
            this.field1204.method229(31824);
            this.field1204.method229(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1204.method228(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1204.method228(134);
            }
            this.field1204.method228(100);
            this.field1204.method228(94);
            this.field1204.method229(35521);
            this.field1204.method237(this.field1204.field713 - var3, false);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)Z")
    public final boolean method525(byte arg0) {
        if (arg0 != -34) {
            this.field1204.method228(87);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method526(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field1621[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field1557[var7][var5][var6] + this.field1557[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1557[var7][var5][var6 + 1] + this.field1557[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg3 == 2) {
                boolean var12 = false;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return this.field1352;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILmb;I)V")
    private final void method527(int arg0, Packet arg1, int arg2) {
        if (arg0 != -14273) {
            this.field1279 = !this.field1279;
        }
        while (arg1.field714 + 10 < arg2 * 8) {
            int var4 = arg1.method249(11, this.field1471);
            if (var4 == 2047) {
                break;
            }
            if (this.field1521[var4] == null) {
                this.field1521[var4] = new PlayerEntity();
                if (this.field1526[var4] != null) {
                    this.field1521[var4].method129(this.field1526[var4], this.field1546);
                }
            }
            this.field1523[this.field1522++] = var4;
            PlayerEntity var5 = this.field1521[var4];
            var5.field459 = field1444;
            int var6 = arg1.method249(5, this.field1471);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method249(5, this.field1471);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method249(1, this.field1471);
            var5.method123(field1527.field463[0] + var6, field1527.field464[0] + var7, 8, var8 == 1);
            int var9 = arg1.method249(1, this.field1471);
            if (var9 == 1) {
                this.field1525[this.field1524++] = var4;
            }
        }
        arg1.method250(37124);
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method528(int arg0) {
        if (field1527.field414 >> 7 == this.field1272 && field1527.field415 >> 7 == this.field1273) {
            this.field1272 = 0;
        }
        for (int var2 = -1; var2 < this.field1522; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = field1527;
                var4 = this.field1520 << 14;
            } else {
                var3 = this.field1521[this.field1523[var2]];
                var4 = this.field1523[var2] << 14;
            }
            if (var3 != null && var3.method126(this.field1514)) {
                var3.field495 = false;
                if ((field1488 && this.field1522 > 50 || this.field1522 > 200) && var2 != -1 && var3.field439 == var3.field419) {
                    var3.field495 = true;
                }
                int var5 = var3.field414 >> 7;
                int var6 = var3.field415 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field490 != null && field1444 >= var3.field485 && field1444 < var3.field486) {
                        var3.field495 = false;
                        var3.field484 = this.method526(var3.field415, this.field1587, var3.field414, (byte) 2);
                        this.field1250.method75(var3.field414, var3.field491, var3.field494, var3.field492, var3.field416, var3.field493, (byte) 5, var3, this.field1587, var3.field484, var4, var3.field415, 60);
                    } else {
                        if ((var3.field414 & 127) == 64 && (var3.field415 & 127) == 64) {
                            if (this.field1616[var5][var6] == this.field1630 && var2 != -1) {
                                continue;
                            }
                            this.field1616[var5][var6] = this.field1630;
                        }
                        var3.field484 = this.method526(var3.field415, this.field1587, var3.field414, (byte) 2);
                        this.field1250.method74(60, var3.field415, var3.field416, var3.field414, var4, this.field1587, var3.field417, var3.field484, 9, var3);
                    }
                }
            }
        }
        if (arg0 != 13283) {
            this.field1532 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)Z")
    public final boolean method529(byte arg0, Component arg1) {
        if (arg0 != 63) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field79;
            if (var3 == 201) {
                this.field1492 = true;
                this.field1195 = false;
                this.field1259 = true;
                this.field1430 = "";
                this.field1625 = 1;
                this.field1256 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1492 = true;
                this.field1195 = false;
                this.field1259 = true;
                this.field1430 = "";
                this.field1625 = 2;
                this.field1256 = "Enter name of friend to delete from list";
            }
            if (var3 == 205) {
                this.field1535 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field1492 = true;
                    this.field1195 = false;
                    this.field1259 = true;
                    this.field1430 = "";
                    this.field1625 = 4;
                    this.field1256 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field1492 = true;
                    this.field1195 = false;
                    this.field1259 = true;
                    this.field1430 = "";
                    this.field1625 = 5;
                    this.field1256 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field1255[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = IdkType.field1103 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= IdkType.field1103) {
                                    var6 = 0;
                                }
                            }
                            if (!IdkType.field1104[var6].field1110 && IdkType.field1104[var6].field1105 == var4 + (this.field1429 ? 0 : 7)) {
                                this.field1255[var4] = var6;
                                this.field1423 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field1399[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field1216[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field1216[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field1399[var7] = var9;
                    this.field1423 = true;
                }
                if (var3 == 324 && !this.field1429) {
                    this.field1429 = true;
                    this.method496(-943);
                }
                if (var3 == 325 && this.field1429) {
                    this.field1429 = false;
                    this.method496(-943);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field1211 = !this.field1211;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method517(-361);
                        if (this.field1575.length() > 0) {
                            this.field1204.method227(9, 205);
                            this.field1204.method234(169, JString.method309(this.field1575));
                            this.field1204.method228(var3 - 601);
                            this.field1204.method228(this.field1211 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field1204.method227(9, 150);
                    this.field1204.method228(this.field1429 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field1204.method228(this.field1255[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field1204.method228(this.field1399[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method530(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1363 >= 100 && this.field1624 != 1) {
                this.method435(false, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field1363 >= 200) {
                this.method435(false, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = JString.method313(JString.method310(arg1, false), -19010);
                for (int var5 = 0; var5 < this.field1363; ++var5) {
                    if (this.field1372[var5] == arg1) {
                        this.method435(false, "", 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1365; ++var6) {
                    if (this.field1530[var6] == arg1) {
                        this.method435(false, "", 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1527.field476)) {
                    this.field1536[this.field1363] = var4;
                    this.field1372[this.field1363] = arg1;
                    this.field1456[this.field1363] = 0;
                    if (arg0 != -15246) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    ++this.field1363;
                    this.field1623 = true;
                    this.field1204.method227(9, 116);
                    this.field1204.method234(169, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIZ)V")
    public final void method531(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        this.field1371 &= arg2;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1389[var5] != null) {
                int var6 = this.field1387[var5];
                int var7 = 70 - var4 * 14 + this.field1322 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1388[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1428 == 0 || this.field1428 == 1 && this.method433(288, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field1527.field476)) {
                        if (this.field1513 >= 1) {
                            this.field1386[this.field1213] = "Report abuse @whi@" + var8;
                            this.field1541[this.field1213] = 34;
                            ++this.field1213;
                        }
                        this.field1386[this.field1213] = "Add ignore @whi@" + var8;
                        this.field1541[this.field1213] = 436;
                        ++this.field1213;
                        this.field1386[this.field1213] = "Add friend @whi@" + var8;
                        this.field1541[this.field1213] = 406;
                        ++this.field1213;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1271 == 0 && (var6 == 7 || this.field1577 == 0 || this.field1577 == 1 && this.method433(288, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field1513 >= 1) {
                            this.field1386[this.field1213] = "Report abuse @whi@" + var8;
                            this.field1541[this.field1213] = 34;
                            ++this.field1213;
                        }
                        this.field1386[this.field1213] = "Add ignore @whi@" + var8;
                        this.field1541[this.field1213] = 436;
                        ++this.field1213;
                        this.field1386[this.field1213] = "Add friend @whi@" + var8;
                        this.field1541[this.field1213] = 406;
                        ++this.field1213;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1489 == 0 || this.field1489 == 1 && this.method433(288, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1386[this.field1213] = "Accept trade @whi@" + var8;
                        this.field1541[this.field1213] = 903;
                        ++this.field1213;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1271 == 0 && this.field1577 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1489 == 0 || this.field1489 == 1 && this.method433(288, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1386[this.field1213] = "Accept duel @whi@" + var8;
                        this.field1541[this.field1213] = 363;
                        ++this.field1213;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1297 != null) {
                this.field1297.method38();
            }
        } catch (Exception var3) {
        }
        this.field1297 = null;
        this.method515(0);
        if (this.field1368 != null) {
            this.field1368.field981 = false;
        }
        this.field1368 = null;
        this.field1576.method280();
        this.field1576 = null;
        this.field1204 = null;
        this.field1545 = null;
        this.field1327 = null;
        this.field1547 = null;
        this.field1227 = null;
        this.field1554 = null;
        this.field1548 = null;
        this.field1549 = null;
        this.field1557 = null;
        this.field1621 = null;
        this.field1250 = null;
        this.field1574 = null;
        this.field1333 = null;
        this.field1206 = null;
        this.field1396 = null;
        this.field1397 = null;
        this.field1640 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1426 = null;
        this.field1427 = null;
        this.field1567 = null;
        this.field1568 = null;
        this.field1569 = null;
        this.field1402 = null;
        this.field1403 = null;
        this.field1404 = null;
        this.field1405 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1408 = null;
        this.field1409 = null;
        this.field1410 = null;
        this.field1494 = null;
        this.field1495 = null;
        this.field1496 = null;
        this.field1506 = null;
        this.field1507 = null;
        this.field1508 = null;
        this.field1641 = null;
        this.field1354 = null;
        this.field1355 = null;
        this.field1356 = null;
        this.field1357 = null;
        this.field1358 = null;
        int var2 = 1 / arg0;
        this.field1580 = null;
        this.field1581 = null;
        this.field1582 = null;
        this.field1583 = null;
        this.field1584 = null;
        this.field1293 = null;
        this.field1503 = null;
        this.field1325 = null;
        this.field1257 = null;
        this.field1207 = null;
        this.field1208 = null;
        this.field1209 = null;
        this.field1210 = null;
        this.field1307 = null;
        this.field1572 = null;
        this.field1616 = null;
        this.field1521 = null;
        this.field1523 = null;
        this.field1525 = null;
        this.field1526 = null;
        this.field1553 = null;
        this.field1480 = null;
        this.field1482 = null;
        this.field1289 = null;
        this.field1448 = null;
        this.field1447 = null;
        this.field1351 = null;
        this.field1539 = null;
        this.field1540 = null;
        this.field1541 = null;
        this.field1542 = null;
        this.field1386 = null;
        this.field1472 = null;
        this.field1337 = null;
        this.field1338 = null;
        this.field1505 = null;
        this.field1274 = null;
        this.field1536 = null;
        this.field1372 = null;
        this.field1456 = null;
        this.field1561 = null;
        this.field1562 = null;
        this.field1558 = null;
        this.field1559 = null;
        this.field1560 = null;
        this.field1563 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1566 = null;
        this.method504(false);
        LocType.method332((byte) 6);
        NpcType.method341((byte) 6);
        ObjType.method347((byte) 6);
        FloType.field1089 = null;
        IdkType.field1104 = null;
        Component.field70 = null;
        UnkType.field1111 = null;
        SeqType.field1125 = null;
        SpotAnimType.field1142 = null;
        SpotAnimType.field1155 = null;
        VarpType.field1157 = null;
        super.field14 = null;
        PlayerEntity.field497 = null;
        Pix3D.method176((byte) 6);
        World3D.method62((byte) 6);
        Model.method134((byte) 6);
        AnimFrame.method60((byte) 6);
        System.gc();
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method532(int arg0) {
        if (arg0 != 27250) {
            this.field1289 = null;
        }
        if (this.field1435 == 0 && this.field1329 == 0) {
            this.field1386[this.field1213] = "Walk here";
            this.field1541[this.field1213] = 660;
            this.field1539[this.field1213] = super.field21;
            this.field1540[this.field1213] = super.field22;
            ++this.field1213;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field611; ++var3) {
            int var4 = Model.field612[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1250.method93(this.field1587, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method333(var8);
                    if (this.field1435 == 1) {
                        this.field1386[this.field1213] = "Use " + this.field1439 + " with @cya@" + var9.field947;
                        this.field1541[this.field1213] = 450;
                        this.field1542[this.field1213] = var4;
                        this.field1539[this.field1213] = var5;
                        this.field1540[this.field1213] = var6;
                        ++this.field1213;
                    } else if (this.field1329 == 1) {
                        if ((this.field1331 & 4) == 4) {
                            this.field1386[this.field1213] = this.field1332 + " @cya@" + var9.field947;
                            this.field1541[this.field1213] = 55;
                            this.field1542[this.field1213] = var4;
                            this.field1539[this.field1213] = var5;
                            this.field1540[this.field1213] = var6;
                            ++this.field1213;
                        }
                    } else {
                        if (var9.field963 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field963[var10] != null) {
                                    this.field1386[this.field1213] = var9.field963[var10] + " @cya@" + var9.field947;
                                    if (var10 == 0) {
                                        this.field1541[this.field1213] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1541[this.field1213] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1541[this.field1213] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1541[this.field1213] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1541[this.field1213] = 1501;
                                    }
                                    this.field1542[this.field1213] = var4;
                                    this.field1539[this.field1213] = var5;
                                    this.field1540[this.field1213] = var6;
                                    ++this.field1213;
                                }
                            }
                        }
                        this.field1386[this.field1213] = "Examine @cya@" + var9.field947;
                        this.field1541[this.field1213] = 1175;
                        this.field1542[this.field1213] = var4;
                        this.field1539[this.field1213] = var5;
                        this.field1540[this.field1213] = var6;
                        ++this.field1213;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1480[var8];
                    if (var11.field471.field998 == 1 && (var11.field414 & 127) == 64 && (var11.field415 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1481; ++var12) {
                            NpcEntity var13 = this.field1480[this.field1482[var12]];
                            if (var13 != null && var11 != var13 && var13.field471.field998 == 1 && var11.field414 == var13.field414 && var11.field415 == var13.field415) {
                                this.method478(var5, -9932, this.field1482[var12], var13.field471, var6);
                            }
                        }
                    }
                    this.method478(var5, -9932, var8, var11.field471, var6);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1521[var8];
                    if ((var14.field414 & 127) == 64 && (var14.field415 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1481; ++var15) {
                            NpcEntity var18 = this.field1480[this.field1482[var15]];
                            if (var18 != null && var18.field471.field998 == 1 && var14.field414 == var18.field414 && var14.field415 == var18.field415) {
                                this.method478(var5, -9932, this.field1482[var15], var18.field471, var6);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1522; ++var16) {
                            PlayerEntity var17 = this.field1521[this.field1523[var16]];
                            if (var17 != null && var14 != var17 && var14.field414 == var17.field414 && var14.field415 == var17.field415) {
                                this.method465(540, var17, var5, this.field1523[var16], var6);
                            }
                        }
                    }
                    this.method465(540, var14, var5, var8, var6);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1289[this.field1587][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method258((byte) -43); var20 != null; var20 = (ObjStackEntity) var19.method260(false)) {
                            ObjType var21 = ObjType.method348(var20.field509);
                            if (this.field1435 == 1) {
                                this.field1386[this.field1213] = "Use " + this.field1439 + " with @lre@" + var21.field1034;
                                this.field1541[this.field1213] = 217;
                                this.field1542[this.field1213] = var20.field509;
                                this.field1539[this.field1213] = var5;
                                this.field1540[this.field1213] = var6;
                                ++this.field1213;
                            } else if (this.field1329 == 1) {
                                if ((this.field1331 & 1) == 1) {
                                    this.field1386[this.field1213] = this.field1332 + " @lre@" + var21.field1034;
                                    this.field1541[this.field1213] = 965;
                                    this.field1542[this.field1213] = var20.field509;
                                    this.field1539[this.field1213] = var5;
                                    this.field1540[this.field1213] = var6;
                                    ++this.field1213;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1049 != null && var21.field1049[var22] != null) {
                                        this.field1386[this.field1213] = var21.field1049[var22] + " @lre@" + var21.field1034;
                                        if (var22 == 0) {
                                            this.field1541[this.field1213] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1541[this.field1213] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1541[this.field1213] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1541[this.field1213] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1541[this.field1213] = 877;
                                        }
                                        this.field1542[this.field1213] = var20.field509;
                                        this.field1539[this.field1213] = var5;
                                        this.field1540[this.field1213] = var6;
                                        ++this.field1213;
                                    } else if (var22 == 2) {
                                        this.field1386[this.field1213] = "Take @lre@" + var21.field1034;
                                        this.field1541[this.field1213] = 99;
                                        this.field1542[this.field1213] = var20.field509;
                                        this.field1539[this.field1213] = var5;
                                        this.field1540[this.field1213] = var6;
                                        ++this.field1213;
                                    }
                                }
                                this.field1386[this.field1213] = "Examine @lre@" + var21.field1034;
                                this.field1541[this.field1213] = 1102;
                                this.field1542[this.field1213] = var20.field509;
                                this.field1539[this.field1213] = var5;
                                this.field1540[this.field1213] = var6;
                                ++this.field1213;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method533(int arg0) {
        int var2 = this.field1301.method215(true, "Choose Option");
        if (arg0 == 0) {
            for (int var3 = 0; var3 < this.field1213; ++var3) {
                int var11 = this.field1301.method215(true, this.field1386[var3]);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field1213 * 15 + 21;
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
                this.field1420 = true;
                this.field1498 = 0;
                this.field1499 = var5;
                this.field1500 = var6;
                this.field1501 = var2;
                this.field1502 = this.field1213 * 15 + 22;
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
                this.field1420 = true;
                this.field1498 = 1;
                this.field1499 = var7;
                this.field1500 = var8;
                this.field1501 = var2;
                this.field1502 = this.field1213 * 15 + 22;
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
                this.field1420 = true;
                this.field1498 = 2;
                this.field1499 = var9;
                this.field1500 = var10;
                this.field1501 = var2;
                this.field1502 = this.field1213 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method534(int arg0) {
        if (arg0 >= 0) {
            this.field1532 = this.field1327.method238();
        }
        try {
            int var2 = field1527.field414 + this.field1473;
            int var3 = field1527.field415 + this.field1611;
            if (this.field1380 - var2 < -500 || this.field1380 - var2 > 500 || this.field1381 - var3 < -500 || this.field1381 - var3 > 500) {
                this.field1380 = var2;
                this.field1381 = var3;
            }
            if (this.field1380 != var2) {
                this.field1380 += (var2 - this.field1380) / 16;
            }
            if (this.field1381 != var3) {
                this.field1381 += (var3 - this.field1381) / 16;
            }
            if (super.field31[1] == 1) {
                this.field1220 += (-24 - this.field1220) / 2;
            } else if (super.field31[2] == 1) {
                this.field1220 += (24 - this.field1220) / 2;
            } else {
                this.field1220 /= 2;
            }
            if (super.field31[3] == 1) {
                this.field1221 += (12 - this.field1221) / 2;
            } else if (super.field31[4] == 1) {
                this.field1221 += (-12 - this.field1221) / 2;
            } else {
                this.field1221 /= 2;
            }
            this.field1219 = this.field1220 / 2 + this.field1219 & 2047;
            this.field1218 += this.field1221 / 2;
            if (this.field1218 < 128) {
                this.field1218 = 128;
            }
            if (this.field1218 > 383) {
                this.field1218 = 383;
            }
            int var4 = this.field1380 >> 7;
            int var5 = this.field1381 >> 7;
            int var6 = this.method526(this.field1381, this.field1587, this.field1380, (byte) 2);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1587;
                        if (var10 < 3 && (this.field1621[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1557[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            int var12 = var7 * 192;
            if (var12 > 98048) {
                var12 = 98048;
            }
            if (var12 < 32768) {
                var12 = 32768;
            }
            if (var12 > this.field1511) {
                this.field1511 += (var12 - this.field1511) / 24;
            } else if (var12 < this.field1511) {
                this.field1511 += (var12 - this.field1511) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1527.field414 + "," + field1527.field415 + "," + this.field1380 + "," + this.field1381 + "," + this.field1228 + "," + this.field1229 + "," + this.field1266 + "," + this.field1267);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method535(boolean arg0) {
        try {
            this.field1246 = -1;
            this.field1351.method261();
            this.field1447.method261();
            Pix3D.method179(0);
            this.method469((byte) -10);
            this.field1250.method63(false);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1574[var2].method359(0);
            }
            System.gc();
            World var3 = new World(this.field1621, this.field1557, 104, 464, 104);
            int var4 = this.field1227.length;
            World.field42 = World3D.field299;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1547[var5] >> 8;
                int var7 = this.field1547[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field42 = false;
                }
            }
            if (World.field42) {
                this.field1250.method64((byte) 1, this.field1587);
            } else {
                this.field1250.method64((byte) 1, 0);
            }
            this.field1204.method227(9, 206);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1547[var8] >> 8) * 64 - this.field1266;
                int var10 = (this.field1547[var8] & 255) * 64 - this.field1267;
                byte[] var11 = this.field1227[var8];
                if (var11 != null) {
                    var3.method15(true, var11, (this.field1228 - 6) * 8, var10, var9, (this.field1229 - 6) * 8);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1547[var12] >> 8) * 64 - this.field1266;
                int var14 = (this.field1547[var12] & 255) * 64 - this.field1267;
                byte[] var15 = this.field1227[var12];
                if (var15 == null && this.field1229 < 800) {
                    var3.method14(-29, 64, var14, var13, 64);
                }
            }
            this.field1204.method227(9, 206);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1554[var16];
                if (var17 != null) {
                    int var18 = (this.field1547[var16] >> 8) * 64 - this.field1266;
                    int var19 = (this.field1547[var16] & 255) * 64 - this.field1267;
                    var3.method18(this.field1574, var19, var17, var18, (byte) 112, this.field1250);
                }
            }
            this.field1204.method227(9, 206);
            var3.method20(this.field1574, true, this.field1250);
            this.field1426.method267(this.field1378);
            this.field1204.method227(9, 206);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method434(var20, var21);
                }
            }
            this.method498(424);
        } catch (Exception var34) {
        }
        LocType.field978.method116();
        if (field1488 && signlink.cache_dat != null) {
            int var23 = this.field1576.method281(0, -66);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1576.method286(var24, -84);
                if ((var25 & 121) == 0) {
                    Model.method137(var24, 0);
                }
            }
        }
        System.gc();
        Pix3D.method180(20, false);
        this.field1576.method292(true);
        if (arg0) {
            this.field1326 = this.field1379.method304();
        }
        int var26 = (this.field1228 - 6) / 8 - 1;
        int var27 = (this.field1228 + 6) / 8 + 1;
        int var28 = (this.field1229 - 6) / 8 - 1;
        int var29 = (this.field1229 + 6) / 8 + 1;
        if (this.field1390) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1576.method283(0, var30, var31, 7);
                    if (var32 != -1) {
                        this.field1576.method293(-26459, var32, 3);
                    }
                    int var33 = this.field1576.method283(1, var30, var31, 7);
                    if (var33 != -1) {
                        this.field1576.method293(-26459, var33, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZLd;IIB)V")
    public final void method536(int arg0, int arg1, int arg2, int arg3, boolean arg4, Component arg5, int arg6, int arg7, byte arg8) {
        if (arg8 != 56) {
            this.method6();
        }
        if (this.field1618) {
            this.field1479 = 32;
        } else {
            this.field1479 = 0;
        }
        this.field1618 = false;
        if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
            arg5.field90 -= this.field1518 * 4;
            if (arg4) {
                this.field1623 = true;
                return;
            }
        } else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 + arg3 - 16 && arg6 < arg0 + arg3) {
            arg5.field90 += this.field1518 * 4;
            if (arg4) {
                this.field1623 = true;
                return;
            }
        } else {
            if (arg7 < arg1 - this.field1479 || arg7 >= arg1 + 16 + this.field1479 || arg6 < arg0 + 16 || arg6 >= arg0 + arg3 - 16 || this.field1518 <= 0) {
                return;
            }
            int var10 = (arg3 - 32) * arg3 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg0 - 16 - var10 / 2;
            int var12 = arg3 - 32 - var10;
            arg5.field90 = (arg2 - arg3) * var11 / var12;
            if (arg4) {
                this.field1623 = true;
            }
            this.field1618 = true;
        }
    }

    @OriginalMember(owner = "client", name = "S", descriptor = "(I)V")
    public final void method537(int arg0) {
        this.field1427.method267(this.field1378);
        Pix3D.field655 = this.field1224;
        this.field1496.method211(0, 200, 0);
        if (this.field1259) {
            this.field1301.method213(0, 239, 40, this.field1256, -977);
            this.field1301.method213(128, 239, 60, this.field1430 + "*", -977);
        } else if (this.field1195) {
            this.field1301.method213(0, 239, 40, "Enter amount:", -977);
            this.field1301.method213(128, 239, 60, this.field1391 + "*", -977);
        } else if (this.field1446 != null) {
            this.field1301.method213(0, 239, 40, this.field1446, -977);
            this.field1301.method213(128, 239, 60, "Click to continue", -977);
        } else if (this.field1350 != -1) {
            this.method473(Component.field70[this.field1350], 0, true, 0, 0);
        } else if (this.field1260 != -1) {
            this.method473(Component.field70[this.field1260], 0, true, 0, 0);
        } else {
            PixFont var2 = this.field1300;
            int var3 = 0;
            Pix2D.method166(5, 0, 463, 77, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1389[var4] != null) {
                    int var6 = this.field1387[var4];
                    int var7 = 70 - var3 * 14 + this.field1322;
                    String var8 = this.field1388[var4];
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
                            var2.method216(0, this.field1389[var4], 0, 4, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1428 == 0 || this.field1428 == 1 && this.method433(288, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1578[0].method211(var10, 200, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1578[1].method211(var10, 200, var7 - 12);
                                var10 += 14;
                            }
                            var2.method216(0, var8 + ":", 0, var10, var7);
                            int var11 = var10 + var2.method215(true, var8) + 8;
                            var2.method216(0, this.field1389[var4], 255, var11, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1271 == 0 && (var6 == 7 || this.field1577 == 0 || this.field1577 == 1 && this.method433(288, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method216(0, "From", 0, var12, var7);
                            int var13 = var12 + var2.method215(true, "From ");
                            if (var9 == 1) {
                                this.field1578[0].method211(var13, 200, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1578[1].method211(var13, 200, var7 - 12);
                                var13 += 14;
                            }
                            var2.method216(0, var8 + ":", 0, var13, var7);
                            int var14 = var13 + var2.method215(true, var8) + 8;
                            var2.method216(0, this.field1389[var4], 8388608, var14, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1489 == 0 || this.field1489 == 1 && this.method433(288, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method216(0, var8 + " " + this.field1389[var4], 8388736, 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1271 == 0 && this.field1577 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method216(0, this.field1389[var4], 8388608, 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1271 == 0 && this.field1577 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method216(0, "To " + var8 + ":", 0, 4, var7);
                            var2.method216(0, this.field1389[var4], 8388608, 12 + var2.method215(true, "To " + var8), var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1489 == 0 || this.field1489 == 1 && this.method433(288, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method216(0, var8 + " " + this.field1389[var4], 8270336, 4, var7);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method165(true);
            this.field1364 = var3 * 14 + 7;
            if (this.field1364 < 78) {
                this.field1364 = 78;
            }
            this.method538(0, 463, this.field1364 - this.field1322 - 77, this.field1364, 77, false);
            String var5;
            if (field1527 != null && field1527.field476 != null) {
                var5 = field1527.field476;
            } else {
                var5 = JString.method313(this.field1198, -19010);
            }
            var2.method216(0, var5 + ":", 0, 4, 90);
            var2.method216(0, this.field1308 + "*", 255, 6 + var2.method215(true, var5 + ": "), 90);
            Pix2D.method172(77, 479, 0, 0, 0);
        }
        if (this.field1420 && this.field1498 == 2) {
            this.method438(0);
        }
        this.field1427.method268(17, (byte) 107, super.field13, 357);
        this.field1426.method267(this.field1378);
        this.field1531 += arg0;
        Pix3D.field655 = this.field1226;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (field1239) {
            this.field1309 = true;
        } else {
            field1239 = true;
            boolean var1 = false;
            String var2 = this.method427(8894);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
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
                this.field1280 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1306[var3] = new FileStream((byte) 98, signlink.cache_dat, var3 + 1, 500000, signlink.cache_idx[var3]);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1512[8] = 0;
                    while (this.field1512[8] == 0) {
                        this.method13((byte) 7, "Connecting to web server", 20);
                        try {
                            DataInputStream var5 = this.method483("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(new byte[36], false);
                            var5.readFully(var6.field712, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1512[var7] = var6.method243();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13((byte) 7, "Error loading - Will retry in " + var8 + " secs.", 10);
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
                    this.field1278 = this.method555("title screen", 484, 1, this.field1512[1], "title", 25);
                    this.field1299 = new PixFont("p11", this.field1278, (byte) -113);
                    this.field1300 = new PixFont("p12", this.field1278, (byte) -113);
                    this.field1301 = new PixFont("b12", this.field1278, (byte) -113);
                    this.field1302 = new PixFont("q8", this.field1278, (byte) -113);
                    this.method508((byte) 4);
                    this.method451(19831);
                    Jagfile var9 = this.method555("config", 484, 2, this.field1512[2], "config", 30);
                    Jagfile var10 = this.method555("interface", 484, 3, this.field1512[3], "interface", 35);
                    Jagfile var11 = this.method555("2d graphics", 484, 4, this.field1512[4], "media", 40);
                    Jagfile var12 = this.method555("textures", 484, 6, this.field1512[6], "textures", 45);
                    Jagfile var13 = this.method555("chat system", 484, 7, this.field1512[7], "wordenc", 50);
                    Jagfile var14 = this.method555("sound effects", 484, 8, this.field1512[8], "sounds", 55);
                    this.field1621 = new byte[4][104][104];
                    this.field1557 = new int[4][105][105];
                    this.field1250 = new World3D(this.field1557, 104, 104, 9, 4);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1574[var15] = new CollisionMap(104, 104, -799);
                    }
                    this.field1274 = new Pix32(512, 512);
                    Jagfile var16 = this.method555("update list", 484, 5, this.field1512[5], "versionlist", 60);
                    this.method13((byte) 7, "Connecting to update server", 60);
                    this.field1576 = new OnDemand();
                    this.field1576.method279(var16, this);
                    AnimFrame.method58(this.field1576.method282(-318));
                    Model.method135(this.field1576.method281(0, -66), this.field1576);
                    if (!field1488) {
                        this.field1340 = 0;
                        this.field1341 = false;
                        this.field1576.method288(2, this.field1340);
                        while (this.field1576.method289() > 0) {
                            this.method474(18352);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13((byte) 7, "Requesting animations", 65);
                    int var17 = this.field1576.method281(1, -66);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1576.method288(1, var18);
                    }
                    while (this.field1576.method289() > 0) {
                        int var19 = var17 - this.field1576.method289();
                        if (var19 > 0) {
                            this.method13((byte) 7, "Loading animations - " + var19 * 100 / var17 + "%", 65);
                        }
                        this.method474(18352);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13((byte) 7, "Requesting models", 70);
                    int var20 = this.field1576.method281(0, -66);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1576.method286(var21, -84);
                        if ((var22 & 1) != 0) {
                            this.field1576.method288(0, var21);
                        }
                    }
                    int var23 = this.field1576.method289();
                    while (this.field1576.method289() > 0) {
                        int var24 = var23 - this.field1576.method289();
                        if (var24 > 0) {
                            this.method13((byte) 7, "Loading models - " + var24 * 100 / var23 + "%", 70);
                        }
                        this.method474(18352);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1306[0] != null) {
                        this.method13((byte) 7, "Requesting maps", 75);
                        this.field1576.method288(3, this.field1576.method283(0, 47, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 47, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(0, 48, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 48, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(0, 49, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 49, 48, 7));
                        this.field1576.method288(3, this.field1576.method283(0, 47, 47, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 47, 47, 7));
                        this.field1576.method288(3, this.field1576.method283(0, 48, 47, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 48, 47, 7));
                        this.field1576.method288(3, this.field1576.method283(0, 48, 148, 7));
                        this.field1576.method288(3, this.field1576.method283(1, 48, 148, 7));
                        int var25 = this.field1576.method289();
                        while (this.field1576.method289() > 0) {
                            int var26 = var25 - this.field1576.method289();
                            if (var26 > 0) {
                                this.method13((byte) 7, "Loading maps - " + var26 * 100 / var25 + "%", 75);
                            }
                            this.method474(18352);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1576.method281(0, -66);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1576.method286(var28, -84);
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
                            this.field1576.method291(var28, 0, var30, 0);
                        }
                    }
                    this.field1576.method284(-777, field1487);
                    if (!field1488) {
                        int var31 = this.field1576.method281(2, -66);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1576.method287(-49612, var32)) {
                                this.field1576.method291(var32, 2, (byte) 1, 0);
                            }
                        }
                    }
                    this.method13((byte) 7, "Unpacking media", 80);
                    this.field1494 = new Pix8(var11, "invback", 0);
                    this.field1496 = new Pix8(var11, "chatback", 0);
                    this.field1495 = new Pix8(var11, "mapback", 0);
                    this.field1506 = new Pix8(var11, "backbase1", 0);
                    this.field1507 = new Pix8(var11, "backbase2", 0);
                    this.field1508 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1641[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1293 = new Pix32(var11, "compass", 0);
                    this.field1200 = new Pix32(var11, "mapedge", 0);
                    this.field1200.method195(-377);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1307[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1572[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1503[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1325[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1240 = new Pix32(var11, "mapmarker", 0);
                    this.field1241 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1257[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1207 = new Pix32(var11, "mapdots", 0);
                    this.field1208 = new Pix32(var11, "mapdots", 1);
                    this.field1209 = new Pix32(var11, "mapdots", 2);
                    this.field1210 = new Pix32(var11, "mapdots", 3);
                    this.field1323 = new Pix8(var11, "scrollbar", 0);
                    this.field1324 = new Pix8(var11, "scrollbar", 1);
                    this.field1354 = new Pix8(var11, "redstone1", 0);
                    this.field1355 = new Pix8(var11, "redstone2", 0);
                    this.field1356 = new Pix8(var11, "redstone3", 0);
                    this.field1357 = new Pix8(var11, "redstone1", 0);
                    this.field1357.method208(626);
                    this.field1358 = new Pix8(var11, "redstone2", 0);
                    this.field1358.method208(626);
                    this.field1580 = new Pix8(var11, "redstone1", 0);
                    this.field1580.method209(0);
                    this.field1581 = new Pix8(var11, "redstone2", 0);
                    this.field1581.method209(0);
                    this.field1582 = new Pix8(var11, "redstone3", 0);
                    this.field1582.method209(0);
                    this.field1583 = new Pix8(var11, "redstone1", 0);
                    this.field1583.method208(626);
                    this.field1583.method209(0);
                    this.field1584 = new Pix8(var11, "redstone2", 0);
                    this.field1584.method208(626);
                    this.field1584.method209(0);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1578[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1402 = new PixMap(var40.field672, this.method11(-66), 0, var40.field671);
                    var40.method196(0, 49740, 0);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1403 = new PixMap(var41.field672, this.method11(-66), 0, var41.field671);
                    var41.method196(0, 49740, 0);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1404 = new PixMap(var42.field672, this.method11(-66), 0, var42.field671);
                    var42.method196(0, 49740, 0);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1405 = new PixMap(var43.field672, this.method11(-66), 0, var43.field671);
                    var43.method196(0, 49740, 0);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1406 = new PixMap(var44.field672, this.method11(-66), 0, var44.field671);
                    var44.method196(0, 49740, 0);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1407 = new PixMap(var45.field672, this.method11(-66), 0, var45.field671);
                    var45.method196(0, 49740, 0);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1408 = new PixMap(var46.field672, this.method11(-66), 0, var46.field671);
                    var46.method196(0, 49740, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1409 = new PixMap(var47.field672, this.method11(-66), 0, var47.field671);
                    var47.method196(0, 49740, 0);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1410 = new PixMap(var48.field672, this.method11(-66), 0, var48.field671);
                    var48.method196(0, 49740, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1572[var53] != null) {
                            this.field1572[var53].method194(var49 + var52, true, var50 + var52, var51 + var52);
                        }
                        if (this.field1307[var53] != null) {
                            this.field1307[var53].method210(var49 + var52, true, var50 + var52, var51 + var52);
                        }
                    }
                    this.method13((byte) 7, "Unpacking textures", 83);
                    Pix3D.method181(-528, var12);
                    Pix3D.method185(field1544, 0.8D);
                    Pix3D.method180(20, false);
                    this.method13((byte) 7, "Unpacking config", 86);
                    SeqType.method381(field1586, var9);
                    LocType.method331(var9);
                    FloType.method371(field1586, var9);
                    ObjType.method346(var9);
                    NpcType.method340(var9);
                    IdkType.method375(field1586, var9);
                    SpotAnimType.method384(field1586, var9);
                    VarpType.method387(field1586, var9);
                    ObjType.field1031 = field1487;
                    if (!field1488) {
                        this.method13((byte) 7, "Unpacking sounds", 90);
                        byte[] var54 = var14.method308("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(var54, false);
                        Wave.method321(field1586, var55);
                    }
                    this.method13((byte) 7, "Unpacking interfaces", 95);
                    PixFont[] var56 = new PixFont[] { this.field1299, this.field1300, this.field1301, this.field1302 };
                    Component.method32(var56, (byte) -109, var11, var10);
                    this.method13((byte) 7, "Preparing game engine", 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1495.field682[this.field1495.field684 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1251[var57] = var58;
                        this.field1477[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1495.field682[this.field1495.field684 * var61 + var64] != 0 || var64 <= 34 && var61 <= 34) {
                                if (var62 != 999) {
                                    var63 = var64;
                                    break;
                                }
                            } else if (var62 == 999) {
                                var62 = var64;
                            }
                        }
                        this.field1515[var61 - 5] = var62 - 25;
                        this.field1294[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method178(479, 96, field1468);
                    this.field1224 = Pix3D.field655;
                    Pix3D.method178(190, 261, field1468);
                    this.field1225 = Pix3D.field655;
                    Pix3D.method178(512, 334, field1468);
                    this.field1226 = Pix3D.field655;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field653[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method99(800, 512, var65, (byte) 6, 334, 500);
                    WordFilter.method389(var13);
                    this.field1368 = new MouseTracking(-16285, this);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1605 + " " + this.field1366);
                    this.field1455 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZ)V")
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1323.method211(arg1, 200, arg0);
        this.field1324.method211(arg1, 200, arg0 + arg4 - 16);
        Pix2D.method169(-556, arg0 + 16, arg4 - 32, arg1, 16, this.field1588);
        int var7 = (arg4 - 32) * arg4 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg2 / (arg3 - arg4);
        Pix2D.method169(-556, arg0 + 16 + var8, var7, arg1, 16, this.field1248);
        Pix2D.method174(this.field1400, arg1, var7, arg0 + 16 + var8, -463);
        Pix2D.method174(this.field1400, arg1 + 1, var7, arg0 + 16 + var8, -463);
        Pix2D.method172(arg0 + 16 + var8, 16, arg1, 0, this.field1400);
        Pix2D.method172(arg0 + 17 + var8, 16, arg1, 0, this.field1400);
        Pix2D.method174(this.field1490, arg1 + 15, var7, arg0 + 16 + var8, -463);
        Pix2D.method174(this.field1490, arg1 + 14, var7 - 1, arg0 + 17 + var8, -463);
        if (arg5) {
            this.field1289 = null;
        }
        Pix2D.method172(arg0 + 15 + var8 + var7, 16, arg1, 0, this.field1490);
        Pix2D.method172(arg0 + 14 + var8 + var7, 15, arg1 + 1, 0, this.field1490);
    }

    @OriginalMember(owner = "client", name = "T", descriptor = "(I)V")
    public final void method539(int arg0) {
        if (arg0 <= 0) {
            this.field1204.method228(233);
        }
        for (int var2 = -1; var2 < this.field1522; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1520;
            } else {
                var6 = this.field1523[var2];
            }
            PlayerEntity var7 = this.field1521[var6];
            if (var7 != null && var7.field427 > 0) {
                --var7.field427;
                if (var7.field427 == 0) {
                    var7.field426 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1481; ++var3) {
            int var4 = this.field1482[var3];
            NpcEntity var5 = this.field1480[var4];
            if (var5 != null && var5.field427 > 0) {
                --var5.field427;
                if (var5.field427 == 0) {
                    var5.field426 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIII)Z")
    public final boolean method540(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1 >> 14 & 32767;
        int var7 = this.field1250.method93(this.field1587, arg3, arg4, arg1);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method429(var8 + 1, 9, 0, 2, var9, field1527.field464[0], 0, 0, arg3, false, arg4, field1527.field463[0]);
            } else {
                LocType var10 = LocType.method333(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field952;
                    var12 = var10.field951;
                } else {
                    var11 = var10.field951;
                    var12 = var10.field952;
                }
                int var13 = var10.field975;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method429(0, 9, var12, 2, 0, field1527.field464[0], var11, var13, arg3, false, arg4, field1527.field463[0]);
            }
            this.field1310 = super.field28;
            this.field1311 = super.field29;
            this.field1313 = 2;
            this.field1312 = 0;
            this.field1204.method227(9, arg2);
            this.field1204.method229(this.field1266 + arg3);
            this.field1204.method229(this.field1267 + arg4);
            if (arg0 != 39) {
                for (int var14 = 1; var14 > 0; ++var14) {
                }
            }
            this.field1204.method229(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "U", descriptor = "(I)V")
    public final void method541(int arg0) {
        if (this.field1614 > 1) {
            --this.field1614;
        }
        if (this.field1535 > 0) {
            --this.field1535;
        }
        if (this.field1504 > 0) {
            this.field1504 -= 2;
        }
        for (int var2 = 0; var2 < 5 && this.method449((byte) 4); ++var2) {
        }
        if (this.field1371) {
            this.method475(-612);
            this.method489((byte) 3);
            this.method509(this.field1353);
            Packet var3 = InputTracking.method46(this.field1610);
            if (var3 != null) {
                this.field1204.method227(9, 19);
                this.field1204.method229(var3.field713);
                this.field1204.method236(var3.field712, -37074, var3.field713, 0);
                var3.method226(false);
            }
            ++this.field1533;
            if (this.field1533 > 750) {
                this.method507(22095);
            }
            this.method524(31294);
            this.method439(0);
            this.method539(121);
            ++this.field1290;
            if (this.field1313 != 0) {
                this.field1312 += 20;
                if (this.field1312 >= 400) {
                    this.field1313 = 0;
                }
            }
            if (this.field1638 != 0) {
                ++this.field1635;
                if (this.field1635 >= 15) {
                    if (this.field1638 == 2) {
                        this.field1623 = true;
                    }
                    if (this.field1638 == 3) {
                        this.field1492 = true;
                    }
                    this.field1638 = 0;
                }
            }
            if (this.field1347 != 0) {
                ++this.field1431;
                if (super.field21 > this.field1348 + 5 || super.field21 < this.field1348 - 5 || super.field22 > this.field1349 + 5 || super.field22 < this.field1349 - 5) {
                    this.field1590 = true;
                }
                if (super.field20 == 0) {
                    if (this.field1347 == 2) {
                        this.field1623 = true;
                    }
                    if (this.field1347 == 3) {
                        this.field1492 = true;
                    }
                    this.field1347 = 0;
                    if (this.field1590 && this.field1431 >= 5) {
                        this.field1443 = -1;
                        this.method468(-540);
                        if (this.field1443 == this.field1345 && this.field1442 != this.field1346) {
                            Component var4 = Component.field70[this.field1345];
                            byte var5 = 0;
                            if (this.field1626 == 1 && var4.field79 == 206) {
                                var5 = 1;
                            }
                            if (var4.field71[this.field1442] <= 0) {
                                var5 = 0;
                            }
                            if (var4.field100) {
                                int var6 = this.field1346;
                                int var7 = this.field1442;
                                var4.field71[var7] = var4.field71[var6];
                                var4.field72[var7] = var4.field72[var6];
                                var4.field71[var6] = -1;
                                var4.field72[var6] = 0;
                            } else if (var5 == 1) {
                                int var8 = this.field1346;
                                int var9 = this.field1442;
                                while (var8 != var9) {
                                    if (var8 > var9) {
                                        var4.method33(var8, var8 - 1, (byte) 71);
                                        --var8;
                                    } else if (var8 < var9) {
                                        var4.method33(var8, var8 + 1, (byte) 71);
                                        ++var8;
                                    }
                                }
                            } else {
                                var4.method33(this.field1346, this.field1442, (byte) 71);
                            }
                            this.field1204.method227(9, 7);
                            this.field1204.method229(this.field1345);
                            this.field1204.method229(this.field1346);
                            this.field1204.method229(this.field1442);
                            this.field1204.method228(var5);
                        }
                    } else if ((this.field1416 == 1 || this.method492(this.field1352, this.field1213 - 1)) && this.field1213 > 2) {
                        this.method533(0);
                    } else if (this.field1213 > 0) {
                        this.method462((byte) -2, this.field1213 - 1);
                    }
                    this.field1635 = 10;
                    super.field27 = 0;
                }
            }
            ++field1632;
            if (field1632 > 127) {
                field1632 = 0;
                this.field1204.method227(9, 181);
                this.field1204.method231(4991788);
            }
            if (World3D.field333 != -1) {
                int var10 = World3D.field333;
                int var11 = World3D.field334;
                boolean var12 = this.method429(0, 9, 0, 0, 0, field1527.field464[0], 0, 0, var10, true, var11, field1527.field463[0]);
                World3D.field333 = -1;
                if (var12) {
                    this.field1310 = super.field28;
                    this.field1311 = super.field29;
                    this.field1313 = 1;
                    this.field1312 = 0;
                }
            }
            if (super.field27 == 1 && this.field1446 != null) {
                this.field1446 = null;
                this.field1492 = true;
                super.field27 = 0;
            }
            this.method486((byte) 4);
            this.method523(this.field1398);
            if (arg0 < 0) {
                this.method501(false);
                this.method505((byte) -34);
                if (super.field20 == 1 || super.field27 == 1) {
                    ++this.field1518;
                }
                if (this.field1509 == 2) {
                    this.method534(-171);
                }
                if (this.field1509 == 2 && this.field1373) {
                    this.method447(0);
                }
                for (int var13 = 0; var13 < 5; ++var13) {
                    int var10002 = this.field1316[var13]++;
                }
                this.method557(this.field1370);
                ++super.field19;
                if (super.field19 > 4500) {
                    this.field1535 = 250;
                    super.field19 -= 500;
                    this.field1204.method227(9, 102);
                }
                ++this.field1619;
                if (this.field1619 > 500) {
                    this.field1619 = 0;
                    int var14 = (int) (Math.random() * 8.0D);
                    if ((var14 & 1) == 1) {
                        this.field1473 += this.field1474;
                    }
                    if ((var14 & 2) == 2) {
                        this.field1611 += this.field1612;
                    }
                    if ((var14 & 4) == 4) {
                        this.field1383 += this.field1384;
                    }
                }
                if (this.field1473 < -50) {
                    this.field1474 = 2;
                }
                if (this.field1473 > 50) {
                    this.field1474 = -2;
                }
                if (this.field1611 < -55) {
                    this.field1612 = 2;
                }
                if (this.field1611 > 55) {
                    this.field1612 = -2;
                }
                if (this.field1383 < -40) {
                    this.field1384 = 1;
                }
                if (this.field1383 > 40) {
                    this.field1384 = -1;
                }
                ++this.field1516;
                if (this.field1516 > 500) {
                    this.field1516 = 0;
                    int var15 = (int) (Math.random() * 8.0D);
                    if ((var15 & 1) == 1) {
                        this.field1201 += this.field1202;
                    }
                    if ((var15 & 2) == 2) {
                        this.field1452 += this.field1453;
                    }
                }
                if (this.field1201 < -60) {
                    this.field1202 = 2;
                }
                if (this.field1201 > 60) {
                    this.field1202 = -2;
                }
                if (this.field1452 < -20) {
                    this.field1453 = 1;
                }
                if (this.field1452 > 10) {
                    this.field1453 = -1;
                }
                ++field1245;
                if (field1245 > 110) {
                    field1245 = 0;
                    this.field1204.method227(9, 94);
                    this.field1204.method232(0);
                }
                ++this.field1534;
                if (this.field1534 > 50) {
                    this.field1204.method227(9, 206);
                }
                try {
                    if (this.field1297 != null && this.field1204.field713 > 0) {
                        this.field1297.method42(0, this.field1204.field713, this.field1204.field712, 0);
                        this.field1204.field713 = 0;
                        this.field1534 = 0;
                    }
                } catch (IOException var17) {
                    this.method507(22095);
                } catch (Exception var18) {
                    this.method554(-956);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BZ)V")
    public final void method542(boolean arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (arg2) {
            this.field1532 = this.field1327.method238();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method543(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        while (arg2 >= 0) {
            this.field1326 = 36;
        }
        Component var5 = Component.field70[arg0];
        for (int var6 = 0; var6 < var5.field92.length && var5.field92[var6] != -1; ++var6) {
            Component var7 = Component.field70[var5.field92[var6]];
            if (var7.field77 == 1) {
                var4 |= this.method543(var7.field75, arg1, -450);
            }
            if (var7.field77 == 6 && (var7.field123 != -1 || var7.field124 != -1)) {
                boolean var8 = this.method547(var7, (byte) 0);
                int var9;
                if (var8) {
                    var9 = var7.field124;
                } else {
                    var9 = var7.field123;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1125[var9];
                    var7.field74 += arg1;
                    while (var7.field74 > var10.method382(var7.field73, 0)) {
                        var7.field74 -= var10.method382(var7.field73, 0) + 1;
                        ++var7.field73;
                        if (var7.field73 >= var10.field1126) {
                            var7.field73 -= var10.field1130;
                            if (var7.field73 < 0 || var7.field73 >= var10.field1126) {
                                var7.field73 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method544(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg1 < 5 || arg1 > 5) {
            this.field1476 = !this.field1476;
        }
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "V", descriptor = "(I)V")
    public final void method545(int arg0) {
        while (arg0 >= 0) {
            field1642 = 0;
        }
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1447.method257(); var2 != null; var2 = (ProjectileEntity) this.field1447.method259(-327)) {
            if (this.field1587 == var2.field515 && field1444 <= var2.field521) {
                if (field1444 >= var2.field520) {
                    if (var2.field524 > 0) {
                        NpcEntity var3 = this.field1480[var2.field524 - 1];
                        if (var3 != null && var3.field414 >= 0 && var3.field414 < 13312 && var3.field415 >= 0 && var3.field415 < 13312) {
                            var2.method132(var3.field414, var3.field415, field1444, this.field1304, this.method526(var3.field415, var2.field515, var3.field414, (byte) 2) - var2.field519);
                        }
                    }
                    if (var2.field524 < 0) {
                        int var4 = -var2.field524 - 1;
                        PlayerEntity var5;
                        if (this.field1594 == var4) {
                            var5 = field1527;
                        } else {
                            var5 = this.field1521[var4];
                        }
                        if (var5 != null && var5.field414 >= 0 && var5.field414 < 13312 && var5.field415 >= 0 && var5.field415 < 13312) {
                            var2.method132(var5.field414, var5.field415, field1444, this.field1304, this.method526(var5.field415, var2.field515, var5.field414, (byte) 2) - var2.field519);
                        }
                    }
                    var2.method133(this.field1290, (byte) 0);
                    this.field1250.method74(60, (int) var2.field527, var2.field534, (int) var2.field526, -1, this.field1587, false, (int) var2.field528, 9, var2);
                }
            } else {
                var2.method119();
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method546(byte arg0) {
        if (this.field1271 != 0) {
            int var2 = 0;
            if (arg0 != 4) {
                this.field1305 = this.field1379.method304();
            }
            if (this.field1614 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1389[var3] != null) {
                    int var4 = this.field1387[var3];
                    String var5 = this.field1388[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1577 == 0 || this.field1577 == 1 && this.method433(288, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field21 > 4 && super.field22 - 4 > var9 - 10 && super.field22 - 4 <= var9 + 3) {
                            int var10 = this.field1300.method215(true, "From:  " + var5 + this.field1389[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field21 < var10 + 4) {
                                if (this.field1513 >= 1) {
                                    this.field1386[this.field1213] = "Report abuse @whi@" + var5;
                                    this.field1541[this.field1213] = 2034;
                                    ++this.field1213;
                                }
                                this.field1386[this.field1213] = "Add ignore @whi@" + var5;
                                this.field1541[this.field1213] = 2436;
                                ++this.field1213;
                                this.field1386[this.field1213] = "Add friend @whi@" + var5;
                                this.field1541[this.field1213] = 2406;
                                ++this.field1213;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1577 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method547(Component arg0, byte arg1) {
        if (arg0.field86 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field86.length; ++var3) {
                int var4 = this.method552(this.field1315, arg0, var3);
                int var5 = arg0.field87[var3];
                if (arg0.field86[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field86[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field86[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 0) {
                field1627 = true;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILbb;Lmb;)V")
    private final void method548(byte arg0, int arg1, int arg2, PlayerEntity arg3, Packet arg4) {
        if (arg0 == 3) {
            boolean var6 = false;
        } else {
            this.field1585 = this.field1379.method304();
        }
        if ((arg1 & 1) == 1) {
            int var7 = arg4.method238();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, false);
            arg4.method247(var7, 768, var8, 0);
            this.field1526[arg2] = var9;
            arg3.method129(var9, this.field1546);
        }
        if ((arg1 & 2) == 2) {
            int var10 = arg4.method240();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg3.field442 == var10) {
                arg3.field446 = 0;
            }
            int var11 = arg4.method238();
            if (arg3.field442 == var10 && var10 != -1) {
                int var12 = SeqType.field1125[var10].field1139;
                if (var12 == 1) {
                    arg3.field443 = 0;
                    arg3.field444 = 0;
                    arg3.field445 = var11;
                    arg3.field446 = 0;
                }
                if (var12 == 2) {
                    arg3.field446 = 0;
                }
            } else if (var10 == -1 || arg3.field442 == -1 || SeqType.field1125[var10].field1133 >= SeqType.field1125[arg3.field442].field1133) {
                arg3.field442 = var10;
                arg3.field443 = 0;
                arg3.field444 = 0;
                arg3.field445 = var11;
                arg3.field446 = 0;
                arg3.field467 = arg3.field462;
            }
        }
        if ((arg1 & 4) == 4) {
            arg3.field436 = arg4.method240();
            if (arg3.field436 == 65535) {
                arg3.field436 = -1;
            }
        }
        if ((arg1 & 8) == 8) {
            arg3.field426 = arg4.method245();
            arg3.field428 = 0;
            arg3.field429 = 0;
            arg3.field427 = 150;
            this.method435(false, arg3.field476, 2, arg3.field426);
        }
        if ((arg1 & 16) == 16) {
            int var13 = arg4.method238();
            int var14 = arg4.method238();
            arg3.method127(var14, var13, -375);
            arg3.field433 = field1444 + 300;
            arg3.field434 = arg4.method238();
            arg3.field435 = arg4.method238();
        }
        if ((arg1 & 32) == 32) {
            arg3.field437 = arg4.method240();
            arg3.field438 = arg4.method240();
        }
        if ((arg1 & 64) == 64) {
            int var15 = arg4.method240();
            int var16 = arg4.method238();
            int var17 = arg4.method238();
            int var18 = arg4.field713;
            if (arg3.field476 != null && arg3.field477) {
                long var19 = JString.method309(arg3.field476);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field1365; ++var22) {
                        if (this.field1530[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field1475 == 0) {
                    try {
                        String var23 = WordPack.method316(0, var17, arg4);
                        String var24 = WordFilter.method399(var23, 0);
                        arg3.field426 = var24;
                        arg3.field428 = var15 >> 8;
                        arg3.field429 = var15 & 255;
                        arg3.field427 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method435(false, "@cr1@" + arg3.field476, 1, var24);
                            } else {
                                this.method435(false, arg3.field476, 2, var24);
                            }
                        } else {
                            this.method435(false, "@cr2@" + arg3.field476, 1, var24);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field713 = var17 + var18;
        }
        if ((arg1 & 256) == 256) {
            arg3.field447 = arg4.method240();
            int var26 = arg4.method243();
            arg3.field451 = var26 >> 16;
            arg3.field450 = (var26 & 65535) + field1444;
            arg3.field448 = 0;
            arg3.field449 = 0;
            if (arg3.field450 > field1444) {
                arg3.field448 = -1;
            }
            if (arg3.field447 == 65535) {
                arg3.field447 = -1;
            }
        }
        if ((arg1 & 512) == 512) {
            arg3.field452 = arg4.method238();
            arg3.field454 = arg4.method238();
            arg3.field453 = arg4.method238();
            arg3.field455 = arg4.method238();
            arg3.field456 = arg4.method240() + field1444;
            arg3.field457 = arg4.method240() + field1444;
            arg3.field458 = arg4.method238();
            arg3.method125((byte) -66);
        }
        if ((arg1 & 1024) == 1024) {
            int var27 = arg4.method238();
            int var28 = arg4.method238();
            arg3.method127(var28, var27, -375);
            arg3.field433 = field1444 + 300;
            arg3.field434 = arg4.method238();
            arg3.field435 = arg4.method238();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method549(boolean arg0, long arg1) {
        if (arg0) {
            this.field1532 = this.field1327.method238();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1365; ++var4) {
                if (this.field1530[var4] == arg1) {
                    --this.field1365;
                    this.field1623 = true;
                    for (int var5 = var4; var5 < this.field1365; ++var5) {
                        this.field1530[var5] = this.field1530[var5 + 1];
                    }
                    this.field1204.method227(9, 4);
                    this.field1204.method234(169, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILmb;)V")
    private final void method550(int arg0, int arg1, Packet arg2) {
        if (arg1 < 0) {
            arg2.method248(-15529);
            int var4 = arg2.method249(1, this.field1471);
            if (var4 != 0) {
                int var5 = arg2.method249(2, this.field1471);
                if (var5 == 0) {
                    this.field1525[this.field1524++] = this.field1520;
                } else if (var5 == 1) {
                    int var6 = arg2.method249(3, this.field1471);
                    field1527.method124(false, var6, 0);
                    int var7 = arg2.method249(1, this.field1471);
                    if (var7 == 1) {
                        this.field1525[this.field1524++] = this.field1520;
                    }
                } else if (var5 == 2) {
                    int var8 = arg2.method249(3, this.field1471);
                    field1527.method124(true, var8, 0);
                    int var9 = arg2.method249(3, this.field1471);
                    field1527.method124(true, var9, 0);
                    int var10 = arg2.method249(1, this.field1471);
                    if (var10 == 1) {
                        this.field1525[this.field1524++] = this.field1520;
                    }
                } else if (var5 == 3) {
                    this.field1587 = arg2.method249(2, this.field1471);
                    int var11 = arg2.method249(7, this.field1471);
                    int var12 = arg2.method249(7, this.field1471);
                    int var13 = arg2.method249(1, this.field1471);
                    field1527.method123(var11, var12, 8, var13 == 1);
                    int var14 = arg2.method249(1, this.field1471);
                    if (var14 == 1) {
                        this.field1525[this.field1524++] = this.field1520;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method551(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1570 = "";
                this.field1571 = "Connecting to server...";
                this.method479((byte) 1);
            }
            this.field1297 = new ClientStream(this, 8, this.method556(field1486 + 43594));
            long var4 = JString.method309(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1204.field713 = 0;
            this.field1204.method228(14);
            this.field1204.method228(var6);
            this.field1297.method42(0, 2, this.field1204.field712, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1297.method39();
            }
            int var8 = this.field1297.method39();
            if (var8 == 0) {
                this.field1297.method41(this.field1327.field712, 0, 8);
                this.field1327.field713 = 0;
                this.field1609 = this.field1327.method244(true);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1609 >> 32), (int) this.field1609 };
                this.field1204.field713 = 0;
                this.field1204.method228(10);
                this.field1204.method232(var9[0]);
                this.field1204.method232(var9[1]);
                this.field1204.method232(var9[2]);
                this.field1204.method232(var9[3]);
                this.field1204.method232(signlink.uid);
                this.field1204.method235(arg0);
                this.field1204.method235(arg1);
                this.field1204.method253(field1457, field1223, 4);
                this.field1545.field713 = 0;
                if (arg2) {
                    this.field1545.method228(18);
                } else {
                    this.field1545.method228(16);
                }
                this.field1545.method228(this.field1204.field713 + 36 + 1 + 1);
                this.field1545.method228(245);
                this.field1545.method228(field1488 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1545.method232(this.field1512[var10]);
                }
                this.field1545.method236(this.field1204.field712, -37074, this.field1204.field713, 0);
                this.field1204.field717 = new Isaac(var9, this.field1602);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1379 = new Isaac(var9, this.field1602);
                this.field1297.method42(0, this.field1545.field713, this.field1545.field712, 0);
                var8 = this.field1297.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var19) {
                }
                this.method551(arg0, arg1, arg2);
            } else if (var8 != 2 && var8 != 18 && var8 != 19) {
                if (var8 == 3) {
                    this.field1570 = "";
                    this.field1571 = "Invalid username or password.";
                } else if (var8 == 4) {
                    this.field1570 = "Your account has been disabled.";
                    this.field1571 = "Please check your message-centre for details.";
                } else if (var8 == 5) {
                    this.field1570 = "Your account is already logged in.";
                    this.field1571 = "Try again in 60 secs...";
                } else if (var8 == 6) {
                    this.field1570 = "RuneScape has been updated!";
                    this.field1571 = "Please reload this page.";
                } else if (var8 == 7) {
                    this.field1570 = "This world is full.";
                    this.field1571 = "Please use a different world.";
                } else if (var8 == 8) {
                    this.field1570 = "Unable to connect.";
                    this.field1571 = "Login server offline.";
                } else if (var8 == 9) {
                    this.field1570 = "Login limit exceeded.";
                    this.field1571 = "Too many connections from your address.";
                } else if (var8 == 10) {
                    this.field1570 = "Unable to connect.";
                    this.field1571 = "Bad session id.";
                } else if (var8 == 11) {
                    this.field1571 = "Login server rejected session.";
                    this.field1571 = "Please try again.";
                } else if (var8 == 12) {
                    this.field1570 = "You need a members account to login to this world.";
                    this.field1571 = "Please subscribe, or use a different world.";
                } else if (var8 == 13) {
                    this.field1570 = "Could not complete login.";
                    this.field1571 = "Please try using a different world.";
                } else if (var8 == 14) {
                    this.field1570 = "The server is being updated.";
                    this.field1571 = "Please wait 1 minute and try again.";
                } else if (var8 == 15) {
                    this.field1371 = true;
                    this.field1204.field713 = 0;
                    this.field1327.field713 = 0;
                    this.field1532 = -1;
                    this.field1417 = -1;
                    this.field1418 = -1;
                    this.field1419 = -1;
                    this.field1531 = 0;
                    this.field1533 = 0;
                    this.field1614 = 0;
                    this.field1213 = 0;
                    this.field1420 = false;
                    this.field1230 = System.currentTimeMillis();
                } else if (var8 == 16) {
                    this.field1570 = "Login attempts exceeded.";
                    this.field1571 = "Please wait 1 minute and try again.";
                } else if (var8 == 17) {
                    this.field1570 = "You are standing in a members-only area.";
                    this.field1571 = "To play on this world move to a free area first";
                } else if (var8 == 20) {
                    this.field1570 = "Invalid loginserver requested";
                    this.field1571 = "Please try using a different world.";
                } else {
                    this.field1570 = "Unexpected server response";
                    this.field1571 = "Please try using a different world.";
                }
            } else {
                this.field1513 = 0;
                if (var8 == 18) {
                    this.field1513 = 1;
                }
                if (var8 == 19) {
                    this.field1513 = 2;
                }
                InputTracking.method45(true);
                this.field1528 = 0L;
                this.field1215 = 0;
                this.field1368.field983 = 0;
                super.field18 = true;
                this.field1537 = true;
                this.field1371 = true;
                this.field1204.field713 = 0;
                this.field1327.field713 = 0;
                this.field1532 = -1;
                this.field1417 = -1;
                this.field1418 = -1;
                this.field1419 = -1;
                this.field1531 = 0;
                this.field1533 = 0;
                this.field1614 = 0;
                this.field1535 = 0;
                this.field1620 = 0;
                this.field1504 = 0;
                this.field1213 = 0;
                this.field1420 = false;
                super.field19 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1389[var12] = null;
                }
                this.field1435 = 0;
                this.field1329 = 0;
                this.field1509 = 0;
                this.field1608 = 0;
                this.field1473 = (int) (Math.random() * 100.0D) - 50;
                this.field1611 = (int) (Math.random() * 110.0D) - 55;
                this.field1383 = (int) (Math.random() * 80.0D) - 40;
                this.field1201 = (int) (Math.random() * 120.0D) - 60;
                this.field1452 = (int) (Math.random() * 30.0D) - 20;
                this.field1219 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1246 = -1;
                this.field1272 = 0;
                this.field1273 = 0;
                this.field1522 = 0;
                this.field1481 = 0;
                for (int var13 = 0; var13 < this.field1519; ++var13) {
                    this.field1521[var13] = null;
                    this.field1526[var13] = null;
                }
                for (int var14 = 0; var14 < 8192; ++var14) {
                    this.field1480[var14] = null;
                }
                field1527 = this.field1521[this.field1520] = new PlayerEntity();
                this.field1447.method261();
                this.field1351.method261();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1289[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1448 = new LinkList(false);
                this.field1363 = 0;
                this.field1260 = -1;
                this.field1350 = -1;
                this.field1217 = -1;
                this.field1237 = -1;
                this.field1451 = -1;
                this.field1385 = false;
                this.field1450 = 3;
                this.field1195 = false;
                this.field1420 = false;
                this.field1259 = false;
                this.field1446 = null;
                this.field1194 = 0;
                this.field1192 = -1;
                this.field1429 = true;
                this.method496(-943);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1399[var18] = 0;
                }
                field1377 = 0;
                field1599 = 0;
                field1190 = 0;
                field1445 = 0;
                field1600 = 0;
                field1374 = 0;
                field1344 = 0;
                field1491 = 0;
                field1334 = 0;
                field1295 = 0;
                this.method448(781);
            }
        } catch (IOException var20) {
            this.field1570 = "";
            this.field1571 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 245);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1485 = Integer.parseInt(arg0[0]);
                field1486 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method491(856);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method470(271);
                }
                if (arg0[3].equals("free")) {
                    field1487 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1487 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(field1642, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;I)I")
    public final int method552(int arg0, Component arg1, int arg2) {
        int var4 = 59 / arg0;
        if (arg1.field85 != null && arg2 < arg1.field85.length) {
            try {
                int[] var5 = arg1.field85[arg2];
                int var6 = 0;
                int var7 = 0;
                while (true) {
                    int var8 = var5[var7++];
                    if (var8 == 0) {
                        return var6;
                    }
                    if (var8 == 1) {
                        var6 += this.field1212[var5[var7++]];
                    }
                    if (var8 == 2) {
                        var6 += this.field1497[var5[var7++]];
                    }
                    if (var8 == 3) {
                        var6 += this.field1440[var5[var7++]];
                    }
                    if (var8 == 4) {
                        Component var9 = Component.field70[var5[var7++]];
                        int var10 = var5[var7++] + 1;
                        for (int var11 = 0; var11 < var9.field71.length; ++var11) {
                            if (var9.field71[var11] == var10) {
                                var6 += var9.field72[var11];
                            }
                        }
                    }
                    if (var8 == 5) {
                        var6 += this.field1472[var5[var7++]];
                    }
                    if (var8 == 6) {
                        var6 += field1253[this.field1497[var5[var7++]] - 1];
                    }
                    if (var8 == 7) {
                        var6 += this.field1472[var5[var7++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var6 += field1527.field482;
                    }
                    if (var8 == 9) {
                        for (int var12 = 0; var12 < 19; ++var12) {
                            if (var12 == 18) {
                                var12 = 20;
                            }
                            var6 += this.field1497[var12];
                        }
                    }
                    if (var8 == 10) {
                        Component var13 = Component.field70[var5[var7++]];
                        int var14 = var5[var7++] + 1;
                        for (int var15 = 0; var15 < var13.field71.length; ++var15) {
                            if (var13.field71[var15] == var14) {
                                var6 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var8 == 11) {
                        var6 += this.field1543;
                    }
                    if (var8 == 12) {
                        var6 += this.field1238;
                    }
                    if (var8 == 13) {
                        int var16 = this.field1472[var5[var7++]];
                        int var17 = var5[var7++];
                        var6 += (var16 & 1 << var17) != 0 ? 1 : 0;
                    }
                }
            } catch (Exception var18) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "W", descriptor = "(I)V")
    public final void method553(int arg0) {
        if (arg0 != 1) {
            this.field1532 = this.field1327.method238();
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1351.method257(); var2 != null; var2 = (SpotAnimEntity) this.field1351.method259(-327)) {
            if (this.field1587 == var2.field620 && !var2.field626) {
                if (field1444 >= var2.field619) {
                    var2.method163(this.field1290, false);
                    if (var2.field626) {
                        var2.method119();
                    } else {
                        this.field1250.method74(60, var2.field622, 0, var2.field621, -1, var2.field620, false, var2.field623, 9, var2);
                    }
                }
            } else {
                var2.method119();
            }
        }
    }

    @OriginalMember(owner = "client", name = "X", descriptor = "(I)V")
    public final void method554(int arg0) {
        try {
            if (this.field1297 != null) {
                this.field1297.method38();
            }
        } catch (Exception var3) {
        }
        this.field1297 = null;
        this.field1371 = false;
        this.field1510 = 0;
        this.field1198 = "";
        this.field1199 = "";
        InputTracking.method45(true);
        this.method469((byte) -10);
        this.field1250.method63(false);
        if (arg0 >= 0) {
            this.field1532 = this.field1327.method238();
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1574[var2].method359(0);
        }
        System.gc();
        this.method515(0);
        this.field1205 = -1;
        this.field1340 = -1;
        this.field1270 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lyb;")
    public final Jagfile method555(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        int var7 = 22 / arg1;
        byte[] var8 = null;
        int var9 = 5;
        try {
            if (this.field1306[0] != null) {
                var8 = this.field1306[0].method300(true, arg2);
            }
        } catch (Exception var30) {
        }
        if (var8 != null) {
            this.field1369.reset();
            this.field1369.update(var8);
            int var10 = (int) this.field1369.getValue();
            if (arg3 != var10) {
                var8 = null;
            }
        }
        if (var8 != null) {
            return new Jagfile(4, var8);
        } else {
            int var12 = 0;
            while (var8 == null) {
                String var13 = "Unknown error";
                this.method13((byte) 7, "Requesting " + arg0, arg5);
                Object var14 = null;
                try {
                    int var15 = 0;
                    DataInputStream var16 = this.method483(arg4 + arg3);
                    byte[] var17 = new byte[6];
                    var16.readFully(var17, 0, 6);
                    Packet var18 = new Packet(var17, false);
                    var18.field713 = 3;
                    int var19 = var18.method242() + 6;
                    int var20 = 6;
                    var8 = new byte[var19];
                    for (int var21 = 0; var21 < 6; ++var21) {
                        var8[var21] = var17[var21];
                    }
                    while (var20 < var19) {
                        int var22 = var19 - var20;
                        if (var22 > 1000) {
                            var22 = 1000;
                        }
                        int var23 = var16.read(var8, var20, var22);
                        if (var23 < 0) {
                            (new StringBuffer("Length error: ")).append(var20).append("/").append(var19).toString();
                            throw new IOException("EOF");
                        }
                        var20 += var23;
                        int var24 = var20 * 100 / var19;
                        if (var15 != var24) {
                            this.method13((byte) 7, "Loading " + arg0 + " - " + var24 + "%", arg5);
                        }
                        var15 = var24;
                    }
                    var16.close();
                    try {
                        if (this.field1306[0] != null) {
                            this.field1306[0].method301(var8, arg2, var8.length, (byte) -115);
                        }
                    } catch (Exception var29) {
                        this.field1306[0] = null;
                    }
                    if (var8 != null) {
                        this.field1369.reset();
                        this.field1369.update(var8);
                        int var25 = (int) this.field1369.getValue();
                        if (arg3 != var25) {
                            var8 = null;
                            ++var12;
                            var13 = "Checksum error: " + var25;
                        }
                    }
                } catch (IOException var31) {
                    if (var13.equals("Unknown error")) {
                        var13 = "Connection error";
                    }
                    var8 = null;
                } catch (NullPointerException var32) {
                    var13 = "Null error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var33) {
                    var13 = "Bounds error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var34) {
                    var13 = "Unexpected error";
                    var8 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var8 == null) {
                    for (int var26 = var9; var26 > 0; --var26) {
                        if (var12 >= 3) {
                            this.method13((byte) 7, "Game updated - please reload page", arg5);
                            var26 = 10;
                        } else {
                            this.method13((byte) 7, var13 + " - Retrying in " + var26, arg5);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var28) {
                        }
                    }
                    var9 *= 2;
                    if (var9 > 60) {
                        var9 = 60;
                    }
                }
            }
            return new Jagfile(4, var8);
        }
    }

    @OriginalMember(owner = "client", name = "Y", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method556(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "Z", descriptor = "(I)V")
    public final void method557(int arg0) {
        if (arg0 < this.field1370 || arg0 > this.field1370) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method5(true);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field1217 != -1 && this.field1604 == this.field1217) {
                        if (var3 == 8 && this.field1575.length() > 0) {
                            this.field1575 = this.field1575.substring(0, this.field1575.length() - 1);
                        }
                        break;
                    }
                    if (this.field1259) {
                        if (var3 >= 32 && var3 <= 122 && this.field1430.length() < 80) {
                            this.field1430 = this.field1430 + (char) var3;
                            this.field1492 = true;
                        }
                        if (var3 == 8 && this.field1430.length() > 0) {
                            this.field1430 = this.field1430.substring(0, this.field1430.length() - 1);
                            this.field1492 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field1259 = false;
                            this.field1492 = true;
                            if (this.field1625 == 1) {
                                long var4 = JString.method309(this.field1430);
                                this.method530(-15246, var4);
                            }
                            if (this.field1625 == 2 && this.field1363 > 0) {
                                long var6 = JString.method309(this.field1430);
                                this.method471(var6, false);
                            }
                            if (this.field1625 == 3 && this.field1430.length() > 0) {
                                this.field1204.method227(9, 99);
                                this.field1204.method228(0);
                                int var8 = this.field1204.field713;
                                this.field1204.method234(169, this.field1470);
                                WordPack.method317(7, this.field1204, this.field1430);
                                this.field1204.method237(this.field1204.field713 - var8, false);
                                this.field1430 = JString.method314(this.field1430, -607);
                                this.field1430 = WordFilter.method399(this.field1430, 0);
                                this.method435(false, JString.method313(JString.method310(this.field1470, false), -19010), 6, this.field1430);
                                if (this.field1577 == 2) {
                                    this.field1577 = 1;
                                    this.field1478 = true;
                                    this.field1204.method227(9, 8);
                                    this.field1204.method228(this.field1428);
                                    this.field1204.method228(this.field1577);
                                    this.field1204.method228(this.field1489);
                                }
                            }
                            if (this.field1625 == 4 && this.field1365 < 100) {
                                long var9 = JString.method309(this.field1430);
                                this.method467(var9, 3652);
                            }
                            if (this.field1625 == 5 && this.field1365 > 0) {
                                long var11 = JString.method309(this.field1430);
                                this.method549(false, var11);
                            }
                        }
                    } else if (this.field1195) {
                        if (var3 >= 48 && var3 <= 57 && this.field1391.length() < 10) {
                            this.field1391 = this.field1391 + (char) var3;
                            this.field1492 = true;
                        }
                        if (var3 == 8 && this.field1391.length() > 0) {
                            this.field1391 = this.field1391.substring(0, this.field1391.length() - 1);
                            this.field1492 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field1391.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field1391);
                                } catch (Exception var18) {
                                }
                                this.field1204.method227(9, 241);
                                this.field1204.method232(var13);
                            }
                            this.field1195 = false;
                            this.field1492 = true;
                        }
                    } else if (this.field1350 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field1308.length() < 80) {
                            this.field1308 = this.field1308 + (char) var3;
                            this.field1492 = true;
                        }
                        if (var3 == 8 && this.field1308.length() > 0) {
                            this.field1308 = this.field1308.substring(0, this.field1308.length() - 1);
                            this.field1492 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field1308.length() > 0) {
                            if (this.field1513 == 2) {
                                if (this.field1308.equals("::clientdrop")) {
                                    this.method507(22095);
                                }
                                if (this.field1308.equals("::lag")) {
                                    this.method428((byte) -88);
                                }
                                if (this.field1308.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field1576.method281(2, -66); ++var14) {
                                        this.field1576.method291(var14, 2, (byte) 1, 0);
                                    }
                                }
                            }
                            if (this.field1308.startsWith("::")) {
                                this.field1204.method227(9, 11);
                                this.field1204.method228(this.field1308.length() - 1);
                                this.field1204.method235(this.field1308.substring(2));
                            } else {
                                byte var15 = 0;
                                if (this.field1308.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                if (this.field1308.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1308 = this.field1308.substring(4);
                                }
                                if (this.field1308.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1308 = this.field1308.substring(6);
                                }
                                if (this.field1308.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1308 = this.field1308.substring(5);
                                }
                                if (this.field1308.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                if (this.field1308.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1308 = this.field1308.substring(6);
                                }
                                if (this.field1308.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                if (this.field1308.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                if (this.field1308.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                if (this.field1308.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1308 = this.field1308.substring(6);
                                }
                                if (this.field1308.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1308 = this.field1308.substring(6);
                                }
                                if (this.field1308.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1308 = this.field1308.substring(6);
                                }
                                byte var16 = 0;
                                if (this.field1308.startsWith("wave:")) {
                                    var16 = 1;
                                    this.field1308 = this.field1308.substring(5);
                                }
                                if (this.field1308.startsWith("scroll:")) {
                                    var16 = 2;
                                    this.field1308 = this.field1308.substring(7);
                                }
                                this.field1204.method227(9, 78);
                                this.field1204.method228(0);
                                int var17 = this.field1204.field713;
                                this.field1204.method228(var15);
                                this.field1204.method228(var16);
                                WordPack.method317(7, this.field1204, this.field1308);
                                this.field1204.method237(this.field1204.field713 - var17, false);
                                this.field1308 = JString.method314(this.field1308, -607);
                                this.field1308 = WordFilter.method399(this.field1308, 0);
                                field1527.field426 = this.field1308;
                                field1527.field428 = var15;
                                field1527.field429 = var16;
                                field1527.field427 = 150;
                                if (this.field1513 == 2) {
                                    this.method435(false, "@cr2@" + field1527.field476, 2, field1527.field426);
                                } else if (this.field1513 == 1) {
                                    this.method435(false, "@cr1@" + field1527.field476, 2, field1527.field426);
                                } else {
                                    this.method435(false, field1527.field476, 2, field1527.field426);
                                }
                                if (this.field1428 == 2) {
                                    this.field1428 = 3;
                                    this.field1478 = true;
                                    this.field1204.method227(9, 8);
                                    this.field1204.method228(this.field1428);
                                    this.field1204.method228(this.field1577);
                                    this.field1204.method228(this.field1489);
                                }
                            }
                            this.field1308 = "";
                            this.field1492 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field1575.length() < 12) {
                this.field1575 = this.field1575 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "ab", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (arg0 != 8) {
            this.field1352 = this.field1379.method304();
        }
        this.field1424.method267(this.field1378);
        Pix3D.field655 = this.field1225;
        this.field1494.method211(0, 200, 0);
        if (this.field1237 != -1) {
            this.method473(Component.field70[this.field1237], 0, true, 0, 0);
        } else if (this.field1631[this.field1450] != -1) {
            this.method473(Component.field70[this.field1631[this.field1450]], 0, true, 0, 0);
        }
        if (this.field1420 && this.field1498 == 1) {
            this.method438(0);
        }
        this.field1424.method268(553, (byte) 107, super.field13, 205);
        this.field1426.method267(this.field1378);
        Pix3D.field655 = this.field1226;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1253[var1] = var0 / 4;
        }
        field1298 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1421 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1457 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1468 = -856;
        field1485 = 10;
        field1487 = true;
        field1544 = -218;
        field1586 = 3;
        field1627 = true;
        field1642 = -196;
    }
}
