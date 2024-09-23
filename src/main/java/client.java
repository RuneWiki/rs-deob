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

    @OriginalMember(owner = "client", name = "L", descriptor = "[I")
    private int[] field1186 = new int[50];

    @OriginalMember(owner = "client", name = "P", descriptor = "Lpb;")
    private LinkList field1190 = new LinkList((byte) 7);

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1191 = 855;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1192 = -1;

    @OriginalMember(owner = "client", name = "V", descriptor = "Z")
    private boolean field1196 = false;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[[I")
    private int[][] field1200 = new int[104][104];

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    private int[] field1201 = new int[500];

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field1202 = new int[500];

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field1203 = new int[500];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1204 = new int[500];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1206 = -20334;

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1207 = new int[151];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[J")
    private long[] field1208 = new long[200];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1211 = new int[1000];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1212 = new int[1000];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Ljava/lang/String;")
    private String field1213 = "";

    @OriginalMember(owner = "client", name = "nb", descriptor = "[B")
    private byte[] field1214 = new byte[16384];

    @OriginalMember(owner = "client", name = "ub", descriptor = "Z")
    private boolean field1221 = false;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[I")
    private int[] field1222 = new int[50];

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1223 = 7;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1225 = 3;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1228 = 1;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1229 = -1;

    @OriginalMember(owner = "client", name = "Db", descriptor = "[I")
    private int[] field1230 = new int[50];

    @OriginalMember(owner = "client", name = "Eb", descriptor = "[Lwb;")
    public FileStream[] field1231 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field1232 = false;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field1234 = new int[50];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1235 = 4;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field1236 = false;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    private int[] field1237 = new int[5];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[[I")
    private int[][] field1239 = new int[104][104];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private final int field1240 = 100;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field1241 = new int[100];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[I")
    private int[] field1242 = new int[5];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private boolean field1249 = false;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1250 = 3;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1251 = -1;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Z")
    public boolean field1252 = true;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1253 = -1;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field1257 = new int[5];

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1265 = -1;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1267 = 2;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[[I")
    private int[][] field1271 = new int[104][104];

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1272 = 489;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1273 = -1;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1276 = 3353893;

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    private int[] field1278 = new int[2000];

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    private int[] field1279 = new int[5];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1280 = 5063219;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1283 = 2048;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1284 = 2047;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[Lbb;")
    private PlayerEntity[] field1285 = new PlayerEntity[this.field1283];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    public int[] field1287 = new int[this.field1283];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    private int[] field1289 = new int[this.field1283];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[Lmb;")
    private Packet[] field1290 = new Packet[this.field1283];

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field1291 = new int[9];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1294 = -1;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1295 = -1;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "B")
    private byte field1303 = 54;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1304 = 2301979;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private final int[] field1305 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1306 = -922;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1312 = 5;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    public int[] field1323 = new int[1000];

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field1324 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "yd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1329 = new CRC32();

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field1331 = 1;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[Lkb;")
    private Pix8[] field1332 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Ljava/lang/String;")
    private String field1336 = "";

    @OriginalMember(owner = "client", name = "Id", descriptor = "[J")
    private long[] field1339 = new long[100];

    @OriginalMember(owner = "client", name = "Od", descriptor = "Ljava/lang/String;")
    private String field1345 = "";

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[Z")
    private boolean[] field1352 = new boolean[5];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field1356 = false;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1357 = 354;

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    private boolean field1358 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Z")
    public boolean field1361 = false;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1375 = -119;

    @OriginalMember(owner = "client", name = "te", descriptor = "Z")
    private boolean field1376 = false;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field1384 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[Ljb;")
    private Pix32[] field1389 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1396 = -1;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1397 = -1;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Lmb;")
    private Packet field1404 = Packet.method225(5, 1);

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private boolean field1412 = true;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field1413 = new int[50];

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field1417 = true;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Z")
    private boolean field1421 = true;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Z")
    private boolean field1426 = false;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field1427 = new int[33];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1429 = new int[100];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[Ljava/lang/String;")
    private String[] field1430 = new String[100];

    @OriginalMember(owner = "client", name = "xf", descriptor = "[Ljava/lang/String;")
    private String[] field1431 = new String[100];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[[[Lpb;")
    private LinkList[][][] field1432 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1434 = -162;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private boolean field1437 = false;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[Lab;")
    private NpcEntity[] field1438 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[I")
    public int[] field1440 = new int[8192];

    @OriginalMember(owner = "client", name = "Of", descriptor = "[Ljb;")
    private Pix32[] field1448 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Ljava/lang/String;")
    private String field1449 = "";

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Z")
    private boolean field1450 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field1452 = false;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Z")
    private boolean field1454 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Z")
    private boolean field1460 = true;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[I")
    private int[] field1464 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field1470 = new int[200];

    @OriginalMember(owner = "client", name = "lg", descriptor = "Z")
    private boolean field1471 = false;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1472 = -1;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Z")
    private boolean field1477 = false;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1480 = 576;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Z")
    private boolean field1483 = false;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lmb;")
    private Packet field1484 = Packet.method225(5, 1);

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1486 = 2;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1495 = 78;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "B")
    private byte field1496 = 0;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Z")
    private boolean field1503 = false;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    private boolean field1504 = true;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field1505 = new int[151];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Z")
    private boolean field1507 = false;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljava/lang/String;")
    private String field1508 = "";

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field1509 = "";

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    private int[] field1510 = new int[2000];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[I")
    private int[] field1511 = new int[4000];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1512 = new int[4000];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[Ljb;")
    private Pix32[] field1514 = new Pix32[20];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    private int[] field1519 = new int[50];

    @OriginalMember(owner = "client", name = "ih", descriptor = "B")
    private byte field1520 = 8;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Lmb;")
    private Packet field1521 = Packet.method225(5, 1);

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1523 = 7;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1530 = -1;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1534 = 2;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1535 = 7759444;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    private boolean field1538 = false;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1540 = new int[256];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[Ljc;")
    private CollisionMap[] field1554 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1555 = 5;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[Ljava/lang/String;")
    private String[] field1556 = new String[200];

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field1557 = new int[5];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1559 = 128;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1563 = 78;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1565 = -1;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[Ljb;")
    private Pix32[] field1566 = new Pix32[50];

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1567 = -1;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field1569 = false;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Z")
    private boolean field1570 = true;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Lpb;")
    private LinkList field1573 = new LinkList((byte) 7);

    @OriginalMember(owner = "client", name = "ki", descriptor = "[Lkb;")
    private Pix8[] field1574 = new Pix8[50];

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1575 = 11089;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/lang/String;")
    private String field1577 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "Ljava/lang/String;")
    private String field1578 = "";

    @OriginalMember(owner = "client", name = "pi", descriptor = "[Ljava/lang/String;")
    private String[] field1579 = new String[500];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Lpb;")
    private LinkList field1591 = new LinkList((byte) 7);

    @OriginalMember(owner = "client", name = "Di", descriptor = "[Lkb;")
    private Pix8[] field1593 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "B")
    private byte field1595 = 71;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "Ljava/lang/String;")
    private String field1596 = "";

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private int[] field1597 = new int[7];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[Ljb;")
    private Pix32[] field1599 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1604 = 612;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "B")
    private byte field1605 = -102;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field1607 = new int[33];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1611 = 4;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Z")
    private boolean field1613 = false;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field1614 = true;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private boolean field1615 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Z")
    private boolean field1616 = false;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Ld;")
    private Component field1619 = new Component();

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1620 = 280;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field1621 = false;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Z")
    private boolean field1626 = false;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1628 = 50;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field1629 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field1630 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field1631 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field1632 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1633 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1634 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1635 = new int[this.field1628];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[Ljava/lang/String;")
    private String[] field1636 = new String[this.field1628];

    @OriginalMember(owner = "client", name = "N", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1188 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "xb", descriptor = "Ljava/lang/String;")
    private static String field1224 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "we", descriptor = "[[I")
    public static final int[][] field1379 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private static int field1398 = 10;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Z")
    private static boolean field1400 = true;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private static int[] field1481 = new int[99];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    public static final int[] field1528;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private static int field1543;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private static int field1545;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1608;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private static int field1194;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private static int field1195;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private static int field1209;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private static int field1219;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private static int field1386;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private static int field1453;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private static int field1506;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private static int field1513;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private static int field1524;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private static int field1542;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private static int field1553;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private static int field1558;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private static int field1598;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private static int field1606;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field1610;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private static int field1612;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private static int field1622;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "J")
    private long field1387;

    @OriginalMember(owner = "client", name = "Te", descriptor = "J")
    public long field1402;

    @OriginalMember(owner = "client", name = "mf", descriptor = "J")
    private long field1420;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "J")
    private long field1489;

    @OriginalMember(owner = "client", name = "jj", descriptor = "J")
    private long field1625;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Le;")
    private ClientStream field1274;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Lxb;")
    private Isaac field1537;

    @OriginalMember(owner = "client", name = "He", descriptor = "Lyb;")
    private Jagfile field1390;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Lfc;")
    public MouseTracking field1623;

    @OriginalMember(owner = "client", name = "nh", descriptor = "Lvb;")
    private OnDemand field1525;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Ljb;")
    private Pix32 field1269;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Ljb;")
    private Pix32 field1270;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Ljb;")
    private Pix32 field1435;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Ljb;")
    private Pix32 field1436;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljb;")
    private Pix32 field1463;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Ljb;")
    private Pix32 field1473;

    @OriginalMember(owner = "client", name = "og", descriptor = "Ljb;")
    private Pix32 field1474;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Ljb;")
    private Pix32 field1478;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Ljb;")
    private Pix32 field1491;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Ljb;")
    private Pix32 field1492;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "Ljb;")
    private Pix32 field1493;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Ljb;")
    private Pix32 field1494;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Ljb;")
    private Pix32 field1552;

    @OriginalMember(owner = "client", name = "W", descriptor = "Lkb;")
    private Pix8 field1197;

    @OriginalMember(owner = "client", name = "X", descriptor = "Lkb;")
    private Pix8 field1198;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lkb;")
    private Pix8 field1362;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lkb;")
    private Pix8 field1363;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Lkb;")
    private Pix8 field1391;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Lkb;")
    private Pix8 field1392;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Lkb;")
    private Pix8 field1393;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Lkb;")
    private Pix8 field1394;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Lkb;")
    private Pix8 field1395;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lkb;")
    private Pix8 field1422;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lkb;")
    private Pix8 field1423;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Lkb;")
    private Pix8 field1424;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Lkb;")
    private Pix8 field1445;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Lkb;")
    private Pix8 field1446;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lkb;")
    private Pix8 field1447;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Lkb;")
    private Pix8 field1583;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Lkb;")
    private Pix8 field1584;

    @OriginalMember(owner = "client", name = "vi", descriptor = "Lkb;")
    private Pix8 field1585;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Lkb;")
    private Pix8 field1586;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Lkb;")
    private Pix8 field1587;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Llb;")
    private PixFont field1441;

    @OriginalMember(owner = "client", name = "If", descriptor = "Llb;")
    private PixFont field1442;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Llb;")
    private PixFont field1443;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Llb;")
    private PixFont field1444;

    @OriginalMember(owner = "client", name = "id", descriptor = "Lrb;")
    private PixMap field1313;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Lrb;")
    private PixMap field1314;

    @OriginalMember(owner = "client", name = "kd", descriptor = "Lrb;")
    private PixMap field1315;

    @OriginalMember(owner = "client", name = "ld", descriptor = "Lrb;")
    private PixMap field1316;

    @OriginalMember(owner = "client", name = "md", descriptor = "Lrb;")
    private PixMap field1317;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lrb;")
    private PixMap field1318;

    @OriginalMember(owner = "client", name = "od", descriptor = "Lrb;")
    private PixMap field1319;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Lrb;")
    private PixMap field1320;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Lrb;")
    private PixMap field1321;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lrb;")
    private PixMap field1325;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Lrb;")
    private PixMap field1326;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Lrb;")
    private PixMap field1327;

    @OriginalMember(owner = "client", name = "he", descriptor = "Lrb;")
    private PixMap field1364;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Lrb;")
    private PixMap field1365;

    @OriginalMember(owner = "client", name = "je", descriptor = "Lrb;")
    private PixMap field1366;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Lrb;")
    private PixMap field1367;

    @OriginalMember(owner = "client", name = "le", descriptor = "Lrb;")
    private PixMap field1368;

    @OriginalMember(owner = "client", name = "me", descriptor = "Lrb;")
    private PixMap field1369;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Lrb;")
    private PixMap field1370;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Lrb;")
    private PixMap field1371;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Lrb;")
    private PixMap field1372;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lrb;")
    private PixMap field1515;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lrb;")
    private PixMap field1516;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Lrb;")
    private PixMap field1517;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Lrb;")
    private PixMap field1518;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Lbb;")
    public static PlayerEntity field1428;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Ls;")
    private World3D field1258;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Ljava/lang/String;")
    private String field1199;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Ljava/lang/String;")
    public String field1310;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Ljava/lang/String;")
    public String field1501;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Ljava/lang/String;")
    private String field1624;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private static boolean field1282;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private static boolean field1401;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private static boolean field1609;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Z")
    public static boolean field1642;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field1215;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field1216;

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field1217;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field1301;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[I")
    private int[] field1302;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field1353;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field1354;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field1355;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field1405;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field1406;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[I")
    private int[] field1407;

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field1571;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field1572;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[Lkb;")
    private Pix8[] field1502;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[[B")
    private byte[][] field1268;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[[B")
    private byte[][] field1311;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[[[B")
    private byte[][][] field1281;

    @OriginalMember(owner = "client", name = "af", descriptor = "[[[I")
    private int[][][] field1409;

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method427(boolean arg0) {
        ++this.field1580;
        this.method453(this.field1495, true);
        this.method486(7);
        this.method453(this.field1495, false);
        this.method449(this.field1193);
        this.method465(this.field1480);
        if (!this.field1471) {
            int var2 = this.field1559;
            if (this.field1226 / 256 > var2) {
                var2 = this.field1226 / 256;
            }
            if (this.field1352[4] && this.field1242[4] + 128 > var2) {
                var2 = this.field1242[4] + 128;
            }
            int var3 = this.field1560 + this.field1227 & 2047;
            this.method491(this.field1375, var3, this.method473(false, field1428.field405, this.field1479, field1428.field404) - 50, var2, this.field1476, var2 * 3 + 600, this.field1475);
            ++field1209;
            if (field1209 > 1802) {
                field1209 = 0;
                this.field1404.method227(148, this.field1496);
                this.field1404.method228(0);
                int var4 = this.field1404.field719;
                this.field1404.method229(29711);
                this.field1404.method228(70);
                this.field1404.method228((int) (Math.random() * 256.0D));
                this.field1404.method228(242);
                this.field1404.method228(186);
                this.field1404.method228(39);
                this.field1404.method228(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1404.method228(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1404.method229(57856);
                }
                this.field1404.method229((int) (Math.random() * 65536.0D));
                this.field1404.method237(41372, this.field1404.field719 - var4);
            }
        }
        int var5;
        if (!this.field1471) {
            var5 = this.method520(150);
        } else {
            var5 = this.method521(8);
        }
        int var6 = this.field1637;
        int var7 = this.field1638;
        int var8 = this.field1639;
        int var9 = this.field1640;
        int var10 = this.field1641;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1352[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1279[var11] * 2 + 1) - (double) this.field1279[var11] + Math.sin((double) this.field1237[var11] / 100.0D * (double) this.field1257[var11]) * (double) this.field1242[var11]);
                if (var11 == 0) {
                    this.field1637 += var13;
                }
                if (var11 == 1) {
                    this.field1638 += var13;
                }
                if (var11 == 2) {
                    this.field1639 += var13;
                }
                if (var11 == 3) {
                    this.field1641 = this.field1641 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1640 += var13;
                    if (this.field1640 < 128) {
                        this.field1640 = 128;
                    }
                    if (this.field1640 > 383) {
                        this.field1640 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field662;
        Model.field601 = true;
        Model.field604 = 0;
        Model.field602 = super.field23 - 4;
        if (!arg0) {
            this.field1426 = !this.field1426;
        }
        Model.field603 = super.field24 - 4;
        Pix2D.method167(false);
        this.field1258.method102(this.field1637, var5, 7, this.field1641, this.field1640, this.field1639, this.field1638);
        this.field1258.method77((byte) -48);
        this.method462(47);
        this.method509(317);
        this.method555(var12, -131);
        this.method475((byte) 1);
        this.field1517.method268(super.field15, 4, (byte) 55, 4);
        this.field1637 = var6;
        this.field1638 = var7;
        this.field1639 = var8;
        this.field1640 = var9;
        this.field1641 = var10;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method428(int arg0, int arg1, Packet arg2) {
        this.field1322 = 0;
        if (arg0 != -13193) {
            this.field1244 = -1;
        }
        this.field1288 = 0;
        this.method485(arg2, (byte) 20, arg1);
        this.method518(arg1, false, arg2);
        this.method498(false, arg2, arg1);
        for (int var4 = 0; var4 < this.field1322; ++var4) {
            int var6 = this.field1323[var4];
            if (field1588 != this.field1438[var6].field449) {
                this.field1438[var6].field461 = null;
                this.field1438[var6] = null;
            }
        }
        if (arg2.field719 != arg1) {
            signlink.reporterror(this.field1577 + " size mismatch in getnpcpos - pos:" + arg2.field719 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1439; ++var5) {
                if (this.field1438[this.field1440[var5]] == null) {
                    signlink.reporterror(this.field1577 + " null entry in npc list - pos:" + var5 + " size:" + this.field1439);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method429(int arg0) {
        if (arg0 != 0) {
            this.field1404.method228(174);
        }
        if (this.field1247 > 0) {
            this.method476(false);
        } else {
            this.field1517.method267(212);
            this.field1442.method213(257, 1, 0, "Connection lost", 144);
            this.field1442.method213(256, 1, 16777215, "Connection lost", 143);
            this.field1442.method213(257, 1, 0, "Please wait - attempting to reestablish", 159);
            this.field1442.method213(256, 1, 16777215, "Please wait - attempting to reestablish", 158);
            this.field1517.method268(super.field15, 4, (byte) 55, 4);
            this.field1461 = 0;
            ClientStream var2 = this.field1274;
            this.field1361 = false;
            this.method448(this.field1577, this.field1578, true);
            if (!this.field1361) {
                this.method476(false);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method430(int arg0) {
        if (arg0 != 10370) {
            this.field1404.method228(93);
        }
        if (super.field29 == 1) {
            if (super.field30 >= 539 && super.field30 <= 573 && super.field31 >= 169 && super.field31 < 205 && this.field1324[0] != -1) {
                this.field1221 = true;
                this.field1225 = 0;
                this.field1384 = true;
            }
            if (super.field30 >= 569 && super.field30 <= 599 && super.field31 >= 168 && super.field31 < 205 && this.field1324[1] != -1) {
                this.field1221 = true;
                this.field1225 = 1;
                this.field1384 = true;
            }
            if (super.field30 >= 597 && super.field30 <= 627 && super.field31 >= 168 && super.field31 < 205 && this.field1324[2] != -1) {
                this.field1221 = true;
                this.field1225 = 2;
                this.field1384 = true;
            }
            if (super.field30 >= 625 && super.field30 <= 669 && super.field31 >= 168 && super.field31 < 203 && this.field1324[3] != -1) {
                this.field1221 = true;
                this.field1225 = 3;
                this.field1384 = true;
            }
            if (super.field30 >= 666 && super.field30 <= 696 && super.field31 >= 168 && super.field31 < 205 && this.field1324[4] != -1) {
                this.field1221 = true;
                this.field1225 = 4;
                this.field1384 = true;
            }
            if (super.field30 >= 694 && super.field30 <= 724 && super.field31 >= 168 && super.field31 < 205 && this.field1324[5] != -1) {
                this.field1221 = true;
                this.field1225 = 5;
                this.field1384 = true;
            }
            if (super.field30 >= 722 && super.field30 <= 756 && super.field31 >= 169 && super.field31 < 205 && this.field1324[6] != -1) {
                this.field1221 = true;
                this.field1225 = 6;
                this.field1384 = true;
            }
            if (super.field30 >= 540 && super.field30 <= 574 && super.field31 >= 466 && super.field31 < 502 && this.field1324[7] != -1) {
                this.field1221 = true;
                this.field1225 = 7;
                this.field1384 = true;
            }
            if (super.field30 >= 572 && super.field30 <= 602 && super.field31 >= 466 && super.field31 < 503 && this.field1324[8] != -1) {
                this.field1221 = true;
                this.field1225 = 8;
                this.field1384 = true;
            }
            if (super.field30 >= 599 && super.field30 <= 629 && super.field31 >= 466 && super.field31 < 503 && this.field1324[9] != -1) {
                this.field1221 = true;
                this.field1225 = 9;
                this.field1384 = true;
            }
            if (super.field30 >= 627 && super.field30 <= 671 && super.field31 >= 467 && super.field31 < 502 && this.field1324[10] != -1) {
                this.field1221 = true;
                this.field1225 = 10;
                this.field1384 = true;
            }
            if (super.field30 >= 669 && super.field30 <= 699 && super.field31 >= 466 && super.field31 < 503 && this.field1324[11] != -1) {
                this.field1221 = true;
                this.field1225 = 11;
                this.field1384 = true;
            }
            if (super.field30 >= 696 && super.field30 <= 726 && super.field31 >= 466 && super.field31 < 503 && this.field1324[12] != -1) {
                this.field1221 = true;
                this.field1225 = 12;
                this.field1384 = true;
            }
            if (super.field30 >= 724 && super.field30 <= 758 && super.field31 >= 466 && super.field31 < 502 && this.field1324[13] != -1) {
                this.field1221 = true;
                this.field1225 = 13;
                this.field1384 = true;
            }
            ++field1513;
            if (field1513 > 150) {
                field1513 = 0;
                this.field1404.method227(46, this.field1496);
                this.field1404.method228(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public final void method431(String arg0, String arg1, int arg2, boolean arg3) {
        if (arg2 == 0 && this.field1565 != -1) {
            this.field1199 = arg0;
            super.field29 = 0;
        }
        if (this.field1396 == -1) {
            this.field1236 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1429[var5] = this.field1429[var5 - 1];
            this.field1430[var5] = this.field1430[var5 - 1];
            this.field1431[var5] = this.field1431[var5 - 1];
        }
        if (arg3) {
            this.field1244 = -1;
        }
        this.field1429[0] = arg2;
        this.field1430[0] = arg1;
        this.field1431[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method432(byte arg0) {
        if (arg0 != -119) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field29 == 1) {
            if (super.field30 >= 6 && super.field30 <= 106 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1408 = (this.field1408 + 1) % 4;
                this.field1616 = true;
                this.field1236 = true;
                this.field1404.method227(98, this.field1496);
                this.field1404.method228(this.field1408);
                this.field1404.method228(this.field1576);
                this.field1404.method228(this.field1275);
            }
            if (super.field30 >= 135 && super.field30 <= 235 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1576 = (this.field1576 + 1) % 3;
                this.field1616 = true;
                this.field1236 = true;
                this.field1404.method227(98, this.field1496);
                this.field1404.method228(this.field1408);
                this.field1404.method228(this.field1576);
                this.field1404.method228(this.field1275);
            }
            if (super.field30 >= 273 && super.field30 <= 373 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1275 = (this.field1275 + 1) % 3;
                this.field1616 = true;
                this.field1236 = true;
                this.field1404.method227(98, this.field1496);
                this.field1404.method228(this.field1408);
                this.field1404.method228(this.field1576);
                this.field1404.method228(this.field1275);
            }
            if (super.field30 >= 412 && super.field30 <= 512 && super.field31 >= 467 && super.field31 <= 499) {
                this.method450(true);
                this.field1345 = "";
                this.field1451 = false;
                for (int var3 = 0; var3 < Component.field73.length; ++var3) {
                    if (Component.field73[var3] != null && Component.field73[var3].field82 == 600) {
                        this.field1192 = this.field1273 = Component.field73[var3].field79;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)V")
    public final void method433(Component arg0, byte arg1) {
        if (arg1 != 102) {
            this.field1404.method228(206);
        }
        int var3 = arg0.field82;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
                if (var3 == 203) {
                    arg0.field92 = this.field1418 * 15 + 20;
                    if (arg0.field92 <= arg0.field84) {
                        arg0.field92 = arg0.field84 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 >= this.field1359) {
                        arg0.field113 = "";
                        arg0.field81 = 0;
                    } else {
                        arg0.field113 = JString.method313(true, JString.method310((byte) 88, this.field1339[var3]));
                        arg0.field81 = 1;
                    }
                } else if (var3 == 503) {
                    arg0.field92 = this.field1359 * 15 + 20;
                    if (arg0.field92 <= arg0.field84) {
                        arg0.field92 = arg0.field84 + 1;
                    }
                } else if (var3 == 327) {
                    arg0.field127 = 150;
                    arg0.field128 = (int) (Math.sin((double) field1588 / 40.0D) * 256.0D) & 2047;
                    if (this.field1196) {
                        for (int var4 = 0; var4 < 7; ++var4) {
                            int var11 = this.field1597[var4];
                            if (var11 >= 0 && !IdkType.field1101[var11].method377(6)) {
                                return;
                            }
                        }
                        this.field1196 = false;
                        Model[] var5 = new Model[7];
                        int var6 = 0;
                        for (int var7 = 0; var7 < 7; ++var7) {
                            int var10 = this.field1597[var7];
                            if (var10 >= 0) {
                                var5[var6++] = IdkType.field1101[var10].method378(597);
                            }
                        }
                        Model var8 = new Model(var6, 652, var5);
                        for (int var9 = 0; var9 < 5; ++var9) {
                            if (this.field1557[var9] != 0) {
                                var8.method152(field1379[var9][0], field1379[var9][this.field1557[var9]]);
                                if (var9 == 1) {
                                    var8.method152(field1528[0], field1528[this.field1557[var9]]);
                                }
                            }
                        }
                        var8.method145(-591);
                        var8.method146(SeqType.field1120[field1428.field409].field1122[0], 13056);
                        var8.method155(64, 850, -30, -50, -30, true);
                        arg0.field120 = 5;
                        arg0.field121 = 0;
                        Component.method36(var8, 675, 0, 5);
                    }
                } else if (var3 == 324) {
                    if (this.field1435 == null) {
                        this.field1435 = arg0.field118;
                        this.field1436 = arg0.field119;
                    }
                    if (this.field1570) {
                        arg0.field118 = this.field1436;
                    } else {
                        arg0.field118 = this.field1435;
                    }
                } else if (var3 == 325) {
                    if (this.field1435 == null) {
                        this.field1435 = arg0.field118;
                        this.field1436 = arg0.field119;
                    }
                    if (this.field1570) {
                        arg0.field118 = this.field1435;
                    } else {
                        arg0.field118 = this.field1436;
                    }
                } else if (var3 == 600) {
                    arg0.field113 = this.field1345;
                    if (field1588 % 20 < 10) {
                        arg0.field113 = arg0.field113 + "|";
                    } else {
                        arg0.field113 = arg0.field113 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field1378 >= 1) {
                            if (this.field1451) {
                                arg0.field115 = 16711680;
                                arg0.field113 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg0.field115 = 16777215;
                                arg0.field113 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg0.field113 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field1487 != 0) {
                            String var12;
                            if (this.field1529 == 0) {
                                var12 = "earlier today";
                            } else if (this.field1529 == 1) {
                                var12 = "yesterday";
                            } else {
                                var12 = this.field1529 + " days ago";
                            }
                            arg0.field113 = "You last logged in " + var12 + " from: " + signlink.dns;
                        } else {
                            arg0.field113 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field1189 == 0) {
                            arg0.field113 = "0 unread messages";
                            arg0.field115 = 16776960;
                        }
                        if (this.field1189 == 1) {
                            arg0.field113 = "1 unread message";
                            arg0.field115 = 65280;
                        }
                        if (this.field1189 > 1) {
                            arg0.field113 = this.field1189 + " unread messages";
                            arg0.field115 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field1238 == 201) {
                            if (this.field1425 == 1) {
                                arg0.field113 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg0.field113 = "";
                            }
                        } else if (this.field1238 == 200) {
                            arg0.field113 = "You have not yet set any password recovery questions.";
                        } else {
                            String var13;
                            if (this.field1238 == 0) {
                                var13 = "Earlier today";
                            } else if (this.field1238 == 1) {
                                var13 = "Yesterday";
                            } else {
                                var13 = this.field1238 + " days ago";
                            }
                            arg0.field113 = var13 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field1238 == 201) {
                            if (this.field1425 == 1) {
                                arg0.field113 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg0.field113 = "";
                            }
                        } else if (this.field1238 == 200) {
                            arg0.field113 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg0.field113 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field1238 == 201) {
                            if (this.field1425 == 1) {
                                arg0.field113 = "@whi@this world but member benefits are unavailabe whilst here.";
                            } else {
                                arg0.field113 = "";
                            }
                        } else if (this.field1238 == 200) {
                            arg0.field113 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg0.field113 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else {
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= this.field1418) {
                    arg0.field113 = "";
                    arg0.field81 = 0;
                } else {
                    if (this.field1470[var3] == 0) {
                        arg0.field113 = "@red@Offline";
                    } else if (this.field1470[var3] == field1398) {
                        arg0.field113 = "@gre@World-" + (this.field1470[var3] - 9);
                    } else {
                        arg0.field113 = "@yel@World-" + (this.field1470[var3] - 9);
                    }
                    arg0.field81 = 1;
                }
            }
        } else {
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= this.field1418) {
                arg0.field113 = "";
                arg0.field81 = 0;
            } else {
                arg0.field113 = this.field1556[var3];
                arg0.field81 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (arg0 == 9) {
            if (this.field1261 == 0) {
                int var2 = super.field29;
                if (this.field1307 == 1 && super.field30 >= 516 && super.field31 >= 160 && super.field30 <= 765 && super.field31 <= 205) {
                    var2 = 0;
                }
                if (this.field1356) {
                    if (var2 != 1) {
                        int var3 = super.field23;
                        int var4 = super.field24;
                        if (this.field1455 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field1455 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field1455 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field1456 - 10 || var3 > this.field1458 + this.field1456 + 10 || var4 < this.field1457 - 10 || var4 > this.field1459 + this.field1457 + 10) {
                            this.field1356 = false;
                            if (this.field1455 == 1) {
                                this.field1221 = true;
                            }
                            if (this.field1455 == 2) {
                                this.field1236 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1456;
                        int var6 = this.field1457;
                        int var7 = this.field1458;
                        int var8 = super.field30;
                        int var9 = super.field31;
                        if (this.field1455 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field1455 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field1455 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1564; ++var11) {
                            int var12 = (this.field1564 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method512(var10, 0);
                        }
                        this.field1356 = false;
                        if (this.field1455 == 1) {
                            this.field1221 = true;
                        }
                        if (this.field1455 == 2) {
                            this.field1236 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1564 > 0) {
                        int var13 = this.field1203[this.field1564 - 1];
                        if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
                            int var14 = this.field1201[this.field1564 - 1];
                            int var15 = this.field1202[this.field1564 - 1];
                            Component var16 = Component.field73[var15];
                            if (var16.field100) {
                                this.field1232 = false;
                                this.field1254 = 0;
                                this.field1259 = var15;
                                this.field1260 = var14;
                                this.field1261 = 2;
                                this.field1262 = super.field30;
                                this.field1263 = super.field31;
                                if (Component.field73[var15].field79 == this.field1273) {
                                    this.field1261 = 1;
                                }
                                if (Component.field73[var15].field79 == this.field1396) {
                                    this.field1261 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1522 == 1 || this.method487(this.field1564 - 1, true)) && this.field1564 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1564 > 0) {
                        this.method512(this.field1564 - 1, 0);
                    }
                    if (var2 != 2 || this.field1564 <= 0) {
                        return;
                    }
                    this.method541((byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method435(boolean arg0) {
        byte[] var2 = this.field1390.method308("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1367.method267(212);
        var3.method196(0, 0, 7);
        this.field1368.method267(212);
        var3.method196(-637, 0, 7);
        this.field1364.method267(212);
        var3.method196(-128, 0, 7);
        this.field1365.method267(212);
        var3.method196(-202, -371, 7);
        this.field1366.method267(212);
        var3.method196(-202, -171, 7);
        this.field1369.method267(212);
        if (!arg0) {
            this.field1244 = this.field1484.method238();
        }
        var3.method196(0, -265, 7);
        this.field1370.method267(212);
        var3.method196(-562, -265, 7);
        this.field1371.method267(212);
        var3.method196(-128, -171, 7);
        this.field1372.method267(212);
        var3.method196(-562, -171, 7);
        int[] var4 = new int[var3.field671];
        for (int var5 = 0; var5 < var3.field672; ++var5) {
            for (int var10 = 0; var10 < var3.field671; ++var10) {
                var4[var10] = var3.field670[var3.field671 * var5 + (var3.field671 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field671; ++var11) {
                var3.field670[var3.field671 * var5 + var11] = var4[var11];
            }
        }
        this.field1367.method267(212);
        var3.method196(382, 0, 7);
        this.field1368.method267(212);
        var3.method196(-255, 0, 7);
        this.field1364.method267(212);
        var3.method196(254, 0, 7);
        this.field1365.method267(212);
        var3.method196(180, -371, 7);
        this.field1366.method267(212);
        var3.method196(180, -171, 7);
        this.field1369.method267(212);
        var3.method196(382, -265, 7);
        this.field1370.method267(212);
        var3.method196(-180, -265, 7);
        this.field1371.method267(212);
        var3.method196(254, -171, 7);
        this.field1372.method267(212);
        var3.method196(-180, -171, 7);
        Pix32 var6 = new Pix32(this.field1390, "logo", 0);
        this.field1364.method267(212);
        var6.method198((byte) 9, 382 - var6.field671 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1258.method93(this.field1479, arg1, arg4, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method515(false, 0, field1428.field454[0], 0, 2, false, var9, arg1, var8 + 1, arg4, 0, field1428.field453[0]);
            } else {
                LocType var10 = LocType.method333(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field954;
                    var12 = var10.field953;
                } else {
                    var11 = var10.field953;
                    var12 = var10.field954;
                }
                int var13 = var10.field977;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method515(false, var11, field1428.field454[0], var13, 2, false, 0, arg1, 0, arg4, var12, field1428.field453[0]);
            }
            this.field1600 = super.field30;
            this.field1601 = super.field31;
            this.field1603 = 2;
            this.field1602 = 0;
            while (arg3 >= 0) {
                for (int var14 = 1; var14 > 0; ++var14) {
                }
            }
            this.field1404.method227(arg0, this.field1496);
            this.field1404.method229(this.field1340 + arg1);
            this.field1404.method229(this.field1341 + arg4);
            this.field1404.method229(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method437(int arg0) {
        for (int var2 = 0; var2 < this.field1439; ++var2) {
            int var3 = this.field1440[var2];
            NpcEntity var4 = this.field1438[var3];
            if (var4 != null) {
                this.method438(var4, var4.field461.field996, 867);
            }
        }
        this.field1243 += arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;II)V")
    public final void method438(PathingEntity arg0, int arg1, int arg2) {
        if (arg0.field404 < 128 || arg0.field405 < 128 || arg0.field404 >= 13184 || arg0.field405 >= 13184) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field404 = arg0.field453[0] * 128 + arg0.field408 * 64;
            arg0.field405 = arg0.field454[0] * 128 + arg0.field408 * 64;
            arg0.method125(2);
        }
        if (field1428 == arg0 && (arg0.field404 < 1536 || arg0.field405 < 1536 || arg0.field404 >= 11776 || arg0.field405 >= 11776)) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field404 = arg0.field453[0] * 128 + arg0.field408 * 64;
            arg0.field405 = arg0.field454[0] * 128 + arg0.field408 * 64;
            arg0.method125(2);
        }
        if (arg0.field446 > field1588) {
            this.method439(0, arg0);
        } else if (arg0.field447 >= field1588) {
            this.method440(arg0, 4);
        } else {
            this.method441(arg0, -848);
        }
        this.method442(arg0, 8);
        int var4 = 7 / arg2;
        this.method443(arg0, -391);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method439(int arg0, PathingEntity arg1) {
        int var3 = arg1.field446 - field1588;
        int var4 = arg1.field442 * 128 + arg1.field408 * 64;
        int var5 = arg1.field444 * 128 + arg1.field408 * 64;
        arg1.field404 += (var4 - arg1.field404) / var3;
        this.field1243 += arg0;
        arg1.field405 += (var5 - arg1.field405) / var3;
        arg1.field456 = 0;
        if (arg1.field448 == 0) {
            arg1.field451 = 1024;
        }
        if (arg1.field448 == 1) {
            arg1.field451 = 1536;
        }
        if (arg1.field448 == 2) {
            arg1.field451 = 0;
        }
        if (arg1.field448 == 3) {
            arg1.field451 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method440(PathingEntity arg0, int arg1) {
        if (field1588 == arg0.field447 || arg0.field432 == -1 || arg0.field435 != 0 || arg0.field434 + 1 > SeqType.field1120[arg0.field432].method382(0, arg0.field433)) {
            int var3 = arg0.field447 - arg0.field446;
            int var4 = field1588 - arg0.field446;
            int var5 = arg0.field442 * 128 + arg0.field408 * 64;
            int var6 = arg0.field444 * 128 + arg0.field408 * 64;
            int var7 = arg0.field443 * 128 + arg0.field408 * 64;
            int var8 = arg0.field445 * 128 + arg0.field408 * 64;
            arg0.field404 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field405 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field456 = 0;
        if (this.field1235 != arg1) {
            this.field1426 = !this.field1426;
        }
        if (arg0.field448 == 0) {
            arg0.field451 = 1024;
        }
        if (arg0.field448 == 1) {
            arg0.field451 = 1536;
        }
        if (arg0.field448 == 2) {
            arg0.field451 = 0;
        }
        if (arg0.field448 == 3) {
            arg0.field451 = 512;
        }
        arg0.field406 = arg0.field451;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method441(PathingEntity arg0, int arg1) {
        arg0.field429 = arg0.field409;
        if (arg0.field452 == 0) {
            arg0.field456 = 0;
        } else {
            if (arg0.field432 != -1 && arg0.field435 == 0) {
                SeqType var3 = SeqType.field1120[arg0.field432];
                if (arg0.field457 > 0 && var3.field1132 == 0) {
                    ++arg0.field456;
                    return;
                }
                if (arg0.field457 <= 0 && var3.field1133 == 0) {
                    ++arg0.field456;
                    return;
                }
            }
            int var4 = arg0.field404;
            int var5 = arg0.field405;
            int var6 = arg0.field453[arg0.field452 - 1] * 128 + arg0.field408 * 64;
            int var7 = arg0.field454[arg0.field452 - 1] * 128 + arg0.field408 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field451 = 1280;
                    } else if (var5 > var7) {
                        arg0.field451 = 1792;
                    } else {
                        arg0.field451 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field451 = 768;
                    } else if (var5 > var7) {
                        arg0.field451 = 256;
                    } else {
                        arg0.field451 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field451 = 1024;
                } else {
                    arg0.field451 = 0;
                }
                int var8 = arg0.field451 - arg0.field406 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field412;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field411;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field414;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field413;
                }
                if (var9 == -1) {
                    var9 = arg0.field411;
                }
                arg0.field429 = var9;
                if (arg1 < 0) {
                    int var10 = 4;
                    if (arg0.field451 != arg0.field406 && arg0.field426 == -1) {
                        var10 = 2;
                    }
                    if (arg0.field452 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field452 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field456 > 0 && arg0.field452 > 1) {
                        var10 = 8;
                        --arg0.field456;
                    }
                    if (arg0.field455[arg0.field452 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field429 == arg0.field411 && arg0.field415 != -1) {
                        arg0.field429 = arg0.field415;
                    }
                    if (var4 < var6) {
                        arg0.field404 += var10;
                        if (arg0.field404 > var6) {
                            arg0.field404 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field404 -= var10;
                        if (arg0.field404 < var6) {
                            arg0.field404 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field405 += var10;
                        if (arg0.field405 > var7) {
                            arg0.field405 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field405 -= var10;
                        if (arg0.field405 < var7) {
                            arg0.field405 = var7;
                        }
                    }
                    if (arg0.field404 == var6 && arg0.field405 == var7) {
                        --arg0.field452;
                        if (arg0.field457 > 0) {
                            --arg0.field457;
                            return;
                        }
                    }
                }
            } else {
                arg0.field404 = var6;
                arg0.field405 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lz;I)V")
    public final void method442(PathingEntity arg0, int arg1) {
        if (arg1 == 8) {
            if (arg0.field426 != -1 && arg0.field426 < 32768) {
                NpcEntity var3 = this.field1438[arg0.field426];
                if (var3 != null) {
                    int var4 = arg0.field404 - var3.field404;
                    int var5 = arg0.field405 - var3.field405;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field451 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field426 >= 32768) {
                int var6 = arg0.field426 - 32768;
                if (this.field1397 == var6) {
                    var6 = this.field1284;
                }
                PlayerEntity var7 = this.field1285[var6];
                if (var7 != null) {
                    int var8 = arg0.field404 - var7.field404;
                    int var9 = arg0.field405 - var7.field405;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field451 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field427 != 0 || arg0.field428 != 0) && (arg0.field452 == 0 || arg0.field456 > 0)) {
                int var10 = arg0.field404 - (arg0.field427 - this.field1340 - this.field1340) * 64;
                int var11 = arg0.field405 - (arg0.field428 - this.field1341 - this.field1341) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field451 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field427 = 0;
                arg0.field428 = 0;
            }
            int var12 = arg0.field451 - arg0.field406 & 2047;
            if (var12 != 0) {
                if (var12 >= 32 && var12 <= 2016) {
                    if (var12 > 1024) {
                        arg0.field406 -= 32;
                    } else {
                        arg0.field406 += 32;
                    }
                } else {
                    arg0.field406 = arg0.field451;
                }
                arg0.field406 &= 2047;
                if (arg0.field429 == arg0.field409 && arg0.field451 != arg0.field406) {
                    if (arg0.field410 != -1) {
                        arg0.field429 = arg0.field410;
                        return;
                    }
                    arg0.field429 = arg0.field411;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Lz;I)V")
    public final void method443(PathingEntity arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1432 = null;
        }
        arg0.field407 = false;
        if (arg0.field429 != -1) {
            SeqType var3 = SeqType.field1120[arg0.field429];
            ++arg0.field431;
            if (arg0.field430 < var3.field1121 && arg0.field431 > var3.method382(0, arg0.field430)) {
                arg0.field431 = 0;
                ++arg0.field430;
            }
            if (arg0.field430 >= var3.field1121) {
                arg0.field431 = 0;
                arg0.field430 = 0;
            }
        }
        if (arg0.field437 != -1 && field1588 >= arg0.field440) {
            if (arg0.field438 < 0) {
                arg0.field438 = 0;
            }
            SeqType var4 = SpotAnimType.field1138[arg0.field437].field1142;
            ++arg0.field439;
            while (arg0.field438 < var4.field1121 && arg0.field439 > var4.method382(0, arg0.field438)) {
                arg0.field439 -= var4.method382(0, arg0.field438);
                ++arg0.field438;
            }
            if (arg0.field438 >= var4.field1121 && (arg0.field438 < 0 || arg0.field438 >= var4.field1121)) {
                arg0.field437 = -1;
            }
        }
        if (arg0.field432 != -1 && arg0.field435 <= 1) {
            SeqType var5 = SeqType.field1120[arg0.field432];
            if (var5.field1132 == 1 && arg0.field457 > 0 && arg0.field446 <= field1588 && arg0.field447 < field1588) {
                arg0.field435 = 1;
                return;
            }
        }
        if (arg0.field432 != -1 && arg0.field435 == 0) {
            SeqType var6 = SeqType.field1120[arg0.field432];
            ++arg0.field434;
            while (arg0.field433 < var6.field1121 && arg0.field434 > var6.method382(0, arg0.field433)) {
                arg0.field434 -= var6.method382(0, arg0.field433);
                ++arg0.field433;
            }
            if (arg0.field433 >= var6.field1121) {
                arg0.field433 -= var6.field1125;
                ++arg0.field436;
                if (arg0.field436 >= var6.field1131) {
                    arg0.field432 = -1;
                }
                if (arg0.field433 < 0 || arg0.field433 >= var6.field1121) {
                    arg0.field432 = -1;
                }
            }
            arg0.field407 = var6.field1127;
        }
        if (arg0.field435 > 0) {
            --arg0.field435;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (this.field1483) {
            this.field1483 = false;
            this.field1313.method268(super.field15, 4, (byte) 55, 0);
            this.field1314.method268(super.field15, 357, (byte) 55, 0);
            this.field1315.method268(super.field15, 4, (byte) 55, 722);
            this.field1316.method268(super.field15, 205, (byte) 55, 743);
            this.field1317.method268(super.field15, 0, (byte) 55, 0);
            this.field1318.method268(super.field15, 4, (byte) 55, 516);
            this.field1319.method268(super.field15, 205, (byte) 55, 516);
            this.field1320.method268(super.field15, 357, (byte) 55, 496);
            this.field1321.method268(super.field15, 338, (byte) 55, 0);
            this.field1221 = true;
            this.field1236 = true;
            this.field1384 = true;
            this.field1616 = true;
            if (this.field1527 != 2) {
                this.field1517.method268(super.field15, 4, (byte) 55, 4);
                this.field1516.method268(super.field15, 4, (byte) 55, 550);
            }
        }
        if (this.field1527 == 2) {
            this.method427(true);
        }
        if (this.field1356 && this.field1455 == 1) {
            this.field1221 = true;
        }
        if (this.field1567 != -1) {
            boolean var2 = this.method489(this.field1488, 225, this.field1567);
            if (var2) {
                this.field1221 = true;
            }
        }
        if (this.field1300 == 2) {
            this.field1221 = true;
        }
        if (this.field1261 == 2) {
            this.field1221 = true;
        }
        if (this.field1221) {
            this.method464((byte) 5);
            this.field1221 = false;
        }
        if (this.field1396 == -1) {
            this.field1619.field93 = this.field1563 - this.field1248 - 77;
            if (super.field23 > 448 && super.field23 < 560 && super.field24 > 332) {
                this.method542(this.field1619, 0, false, super.field24 - 357, 77, this.field1563, super.field23 - 17, 463, -960);
            }
            int var3 = this.field1563 - 77 - this.field1619.field93;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1563 - 77) {
                var3 = this.field1563 - 77;
            }
            if (this.field1248 != var3) {
                this.field1248 = var3;
                this.field1236 = true;
            }
        }
        if (this.field1396 != -1) {
            boolean var4 = this.method489(this.field1488, 225, this.field1396);
            if (var4) {
                this.field1236 = true;
            }
        }
        if (this.field1300 == 3) {
            this.field1236 = true;
        }
        if (this.field1261 == 3) {
            this.field1236 = true;
        }
        if (this.field1199 != null) {
            this.field1236 = true;
        }
        if (this.field1356 && this.field1455 == 2) {
            this.field1236 = true;
        }
        if (this.field1236) {
            this.method492((byte) 71);
            this.field1236 = false;
        }
        if (this.field1527 == 2) {
            this.method456(false);
            this.field1516.method268(super.field15, 4, (byte) 55, 550);
        }
        if (this.field1253 != -1) {
            this.field1384 = true;
        }
        if (this.field1384) {
            if (this.field1253 != -1 && this.field1253 == this.field1225) {
                this.field1253 = -1;
                this.field1404.method227(233, this.field1496);
                this.field1404.method228(this.field1225);
            }
            this.field1384 = false;
            this.field1327.method267(212);
            this.field1424.method211((byte) 9, 0, 0);
            if (this.field1567 == -1) {
                if (this.field1324[this.field1225] != -1) {
                    if (this.field1225 == 0) {
                        this.field1391.method211((byte) 9, 22, 10);
                    }
                    if (this.field1225 == 1) {
                        this.field1392.method211((byte) 9, 54, 8);
                    }
                    if (this.field1225 == 2) {
                        this.field1392.method211((byte) 9, 82, 8);
                    }
                    if (this.field1225 == 3) {
                        this.field1393.method211((byte) 9, 110, 8);
                    }
                    if (this.field1225 == 4) {
                        this.field1395.method211((byte) 9, 153, 8);
                    }
                    if (this.field1225 == 5) {
                        this.field1395.method211((byte) 9, 181, 8);
                    }
                    if (this.field1225 == 6) {
                        this.field1394.method211((byte) 9, 209, 9);
                    }
                }
                if (this.field1324[0] != -1 && (this.field1253 != 0 || field1588 % 20 < 10)) {
                    this.field1593[0].method211((byte) 9, 29, 13);
                }
                if (this.field1324[1] != -1 && (this.field1253 != 1 || field1588 % 20 < 10)) {
                    this.field1593[1].method211((byte) 9, 53, 11);
                }
                if (this.field1324[2] != -1 && (this.field1253 != 2 || field1588 % 20 < 10)) {
                    this.field1593[2].method211((byte) 9, 82, 11);
                }
                if (this.field1324[3] != -1 && (this.field1253 != 3 || field1588 % 20 < 10)) {
                    this.field1593[3].method211((byte) 9, 115, 12);
                }
                if (this.field1324[4] != -1 && (this.field1253 != 4 || field1588 % 20 < 10)) {
                    this.field1593[4].method211((byte) 9, 153, 13);
                }
                if (this.field1324[5] != -1 && (this.field1253 != 5 || field1588 % 20 < 10)) {
                    this.field1593[5].method211((byte) 9, 180, 11);
                }
                if (this.field1324[6] != -1 && (this.field1253 != 6 || field1588 % 20 < 10)) {
                    this.field1593[6].method211((byte) 9, 208, 13);
                }
            }
            this.field1327.method268(super.field15, 160, (byte) 55, 516);
            this.field1326.method267(212);
            this.field1423.method211((byte) 9, 0, 0);
            if (this.field1567 == -1) {
                if (this.field1324[this.field1225] != -1) {
                    if (this.field1225 == 7) {
                        this.field1583.method211((byte) 9, 42, 0);
                    }
                    if (this.field1225 == 8) {
                        this.field1584.method211((byte) 9, 74, 0);
                    }
                    if (this.field1225 == 9) {
                        this.field1584.method211((byte) 9, 102, 0);
                    }
                    if (this.field1225 == 10) {
                        this.field1585.method211((byte) 9, 130, 1);
                    }
                    if (this.field1225 == 11) {
                        this.field1587.method211((byte) 9, 173, 0);
                    }
                    if (this.field1225 == 12) {
                        this.field1587.method211((byte) 9, 201, 0);
                    }
                    if (this.field1225 == 13) {
                        this.field1586.method211((byte) 9, 229, 0);
                    }
                }
                if (this.field1324[8] != -1 && (this.field1253 != 8 || field1588 % 20 < 10)) {
                    this.field1593[7].method211((byte) 9, 74, 2);
                }
                if (this.field1324[9] != -1 && (this.field1253 != 9 || field1588 % 20 < 10)) {
                    this.field1593[8].method211((byte) 9, 102, 3);
                }
                if (this.field1324[10] != -1 && (this.field1253 != 10 || field1588 % 20 < 10)) {
                    this.field1593[9].method211((byte) 9, 137, 4);
                }
                if (this.field1324[11] != -1 && (this.field1253 != 11 || field1588 % 20 < 10)) {
                    this.field1593[10].method211((byte) 9, 174, 2);
                }
                if (this.field1324[12] != -1 && (this.field1253 != 12 || field1588 % 20 < 10)) {
                    this.field1593[11].method211((byte) 9, 201, 2);
                }
                if (this.field1324[13] != -1 && (this.field1253 != 13 || field1588 % 20 < 10)) {
                    this.field1593[12].method211((byte) 9, 226, 2);
                }
            }
            this.field1326.method268(super.field15, 466, (byte) 55, 496);
            this.field1517.method267(212);
        }
        if (this.field1616) {
            this.field1616 = false;
            this.field1325.method267(212);
            this.field1422.method211((byte) 9, 0, 0);
            this.field1442.method214(55, true, "Public chat", true, 28, 16777215);
            if (this.field1408 == 0) {
                this.field1442.method214(55, true, "On", true, 41, 65280);
            }
            if (this.field1408 == 1) {
                this.field1442.method214(55, true, "Friends", true, 41, 16776960);
            }
            if (this.field1408 == 2) {
                this.field1442.method214(55, true, "Off", true, 41, 16711680);
            }
            if (this.field1408 == 3) {
                this.field1442.method214(55, true, "Hide", true, 41, 65535);
            }
            this.field1442.method214(184, true, "Private chat", true, 28, 16777215);
            if (this.field1576 == 0) {
                this.field1442.method214(184, true, "On", true, 41, 65280);
            }
            if (this.field1576 == 1) {
                this.field1442.method214(184, true, "Friends", true, 41, 16776960);
            }
            if (this.field1576 == 2) {
                this.field1442.method214(184, true, "Off", true, 41, 16711680);
            }
            this.field1442.method214(324, true, "Trade/duel", true, 28, 16777215);
            if (this.field1275 == 0) {
                this.field1442.method214(324, true, "On", true, 41, 65280);
            }
            if (this.field1275 == 1) {
                this.field1442.method214(324, true, "Friends", true, 41, 16776960);
            }
            if (this.field1275 == 2) {
                this.field1442.method214(324, true, "Off", true, 41, 16711680);
            }
            this.field1442.method214(458, true, "Report abuse", true, 33, 16777215);
            this.field1325.method268(super.field15, 453, (byte) 55, 0);
            this.field1517.method267(212);
        }
        this.field1488 = 0;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method445(boolean arg0) {
        if (!arg0) {
            this.field1480 = this.field1537.method304();
        }
        if (this.field1497 == 0 && this.field1307 == 0) {
            this.field1579[this.field1564] = "Walk here";
            this.field1203[this.field1564] = 660;
            this.field1201[this.field1564] = super.field23;
            this.field1202[this.field1564] = super.field24;
            ++this.field1564;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field604; ++var3) {
            int var4 = Model.field605[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1258.method93(this.field1479, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method333(var8);
                    if (this.field1497 == 1) {
                        this.field1579[this.field1564] = "Use " + this.field1501 + " with @cya@" + var9.field949;
                        this.field1203[this.field1564] = 450;
                        this.field1204[this.field1564] = var4;
                        this.field1201[this.field1564] = var5;
                        this.field1202[this.field1564] = var6;
                        ++this.field1564;
                    } else if (this.field1307 == 1) {
                        if ((this.field1309 & 4) == 4) {
                            this.field1579[this.field1564] = this.field1310 + " @cya@" + var9.field949;
                            this.field1203[this.field1564] = 55;
                            this.field1204[this.field1564] = var4;
                            this.field1201[this.field1564] = var5;
                            this.field1202[this.field1564] = var6;
                            ++this.field1564;
                        }
                    } else {
                        if (var9.field965 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field965[var10] != null) {
                                    this.field1579[this.field1564] = var9.field965[var10] + " @cya@" + var9.field949;
                                    if (var10 == 0) {
                                        this.field1203[this.field1564] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1203[this.field1564] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1203[this.field1564] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1203[this.field1564] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1203[this.field1564] = 1501;
                                    }
                                    this.field1204[this.field1564] = var4;
                                    this.field1201[this.field1564] = var5;
                                    this.field1202[this.field1564] = var6;
                                    ++this.field1564;
                                }
                            }
                        }
                        this.field1579[this.field1564] = "Examine @cya@" + var9.field949;
                        this.field1203[this.field1564] = 1175;
                        this.field1204[this.field1564] = var4;
                        this.field1201[this.field1564] = var5;
                        this.field1202[this.field1564] = var6;
                        ++this.field1564;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1438[var8];
                    if (var11.field461.field996 == 1 && (var11.field404 & 127) == 64 && (var11.field405 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1439; ++var12) {
                            NpcEntity var13 = this.field1438[this.field1440[var12]];
                            if (var13 != null && var11 != var13 && var13.field461.field996 == 1 && var11.field404 == var13.field404 && var11.field405 == var13.field405) {
                                this.method511(var6, var5, this.field1440[var12], 682, var13.field461);
                            }
                        }
                    }
                    this.method511(var6, var5, var8, 682, var11.field461);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1285[var8];
                    if ((var14.field404 & 127) == 64 && (var14.field405 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1439; ++var15) {
                            NpcEntity var18 = this.field1438[this.field1440[var15]];
                            if (var18 != null && var18.field461.field996 == 1 && var14.field404 == var18.field404 && var14.field405 == var18.field405) {
                                this.method511(var6, var5, this.field1440[var15], 682, var18.field461);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1286; ++var16) {
                            PlayerEntity var17 = this.field1285[this.field1287[var16]];
                            if (var17 != null && var14 != var17 && var14.field404 == var17.field404 && var14.field405 == var17.field405) {
                                this.method554(this.field1287[var16], var5, -162, var6, var17);
                            }
                        }
                    }
                    this.method554(var8, var5, -162, var6, var14);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1432[this.field1479][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method258((byte) 6); var20 != null; var20 = (ObjStackEntity) var19.method260(false)) {
                            ObjType var21 = ObjType.method348(var20.field500);
                            if (this.field1497 == 1) {
                                this.field1579[this.field1564] = "Use " + this.field1501 + " with @lre@" + var21.field1031;
                                this.field1203[this.field1564] = 217;
                                this.field1204[this.field1564] = var20.field500;
                                this.field1201[this.field1564] = var5;
                                this.field1202[this.field1564] = var6;
                                ++this.field1564;
                            } else if (this.field1307 == 1) {
                                if ((this.field1309 & 1) == 1) {
                                    this.field1579[this.field1564] = this.field1310 + " @lre@" + var21.field1031;
                                    this.field1203[this.field1564] = 965;
                                    this.field1204[this.field1564] = var20.field500;
                                    this.field1201[this.field1564] = var5;
                                    this.field1202[this.field1564] = var6;
                                    ++this.field1564;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1046 != null && var21.field1046[var22] != null) {
                                        this.field1579[this.field1564] = var21.field1046[var22] + " @lre@" + var21.field1031;
                                        if (var22 == 0) {
                                            this.field1203[this.field1564] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1203[this.field1564] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1203[this.field1564] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1203[this.field1564] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1203[this.field1564] = 877;
                                        }
                                        this.field1204[this.field1564] = var20.field500;
                                        this.field1201[this.field1564] = var5;
                                        this.field1202[this.field1564] = var6;
                                        ++this.field1564;
                                    } else if (var22 == 2) {
                                        this.field1579[this.field1564] = "Take @lre@" + var21.field1031;
                                        this.field1203[this.field1564] = 99;
                                        this.field1204[this.field1564] = var20.field500;
                                        this.field1201[this.field1564] = var5;
                                        this.field1202[this.field1564] = var6;
                                        ++this.field1564;
                                    }
                                }
                                this.field1579[this.field1564] = "Examine @lre@" + var21.field1031;
                                this.field1203[this.field1564] = 1102;
                                this.field1204[this.field1564] = var20.field500;
                                this.field1201[this.field1564] = var5;
                                this.field1202[this.field1564] = var6;
                                ++this.field1564;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method446(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1359 >= 100) {
                this.method431("Your ignore list is full. Max of 100 hit", "", 0, false);
            } else {
                String var4 = JString.method313(true, JString.method310((byte) 88, arg1));
                for (int var5 = 0; var5 < this.field1359; ++var5) {
                    if (this.field1339[var5] == arg1) {
                        this.method431(var4 + " is already on your ignore list", "", 0, false);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1418; ++var6) {
                    if (this.field1208[var6] == arg1) {
                        this.method431("Please remove " + var4 + " from your friend list first", "", 0, false);
                        return;
                    }
                }
                this.field1339[this.field1359++] = arg1;
                this.field1221 = true;
                if (arg0 != 57) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                this.field1404.method227(203, this.field1496);
                this.field1404.method234(arg1, this.field1377);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILjb;)V")
    public final void method447(int arg0, byte arg1, int arg2, Pix32 arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (arg1 != 2) {
            this.field1250 = this.field1537.method304();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1560 + this.field1533 & 2047;
            int var7 = Model.field606[var6];
            int var8 = Model.field607[var6];
            int var9 = var7 * 256 / (this.field1330 + 256);
            int var10 = var8 * 256 / (this.field1330 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1552.method203(83 - var16 - 20, (byte) 0, var13, 256, 15, 15, 20, 20, var15 + 94 + 4 - 10);
        } else {
            this.method553(arg0, false, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method448(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1508 = "";
                this.field1509 = "Connecting to server...";
                this.method517(this.field1206);
            }
            this.field1274 = new ClientStream(this.method507(field1399 + 43594), this, (byte) 11);
            long var4 = JString.method309(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1404.field719 = 0;
            this.field1404.method228(14);
            this.field1404.method228(var6);
            this.field1274.method42(2, true, 0, this.field1404.field718);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1274.method39();
            }
            int var8 = this.field1274.method39();
            if (var8 == 0) {
                this.field1274.method41(this.field1484.field718, 0, 8);
                this.field1484.field719 = 0;
                this.field1387 = this.field1484.method244(this.field1191);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1387 >> 32), (int) this.field1387 };
                this.field1404.field719 = 0;
                this.field1404.method228(10);
                this.field1404.method232(var9[0]);
                this.field1404.method232(var9[1]);
                this.field1404.method232(var9[2]);
                this.field1404.method232(var9[3]);
                this.field1404.method232(signlink.uid);
                this.field1404.method235(arg0);
                this.field1404.method235(arg1);
                this.field1404.method253(41466, field1608, field1188);
                this.field1521.field719 = 0;
                if (arg2) {
                    this.field1521.method228(18);
                } else {
                    this.field1521.method228(16);
                }
                this.field1521.method228(this.field1404.field719 + 36 + 1 + 1);
                this.field1521.method228(244);
                this.field1521.method228(field1401 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1521.method232(this.field1291[var10]);
                }
                this.field1521.method236(this.field1404.field719, 0, 0, this.field1404.field718);
                this.field1404.field723 = new Isaac(var9, this.field1536);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1537 = new Isaac(var9, this.field1536);
                this.field1274.method42(this.field1521.field719, true, 0, this.field1521.field718);
                var8 = this.field1274.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var19) {
                }
                this.method448(arg0, arg1, arg2);
            } else if (var8 != 2 && var8 != 18 && var8 != 19) {
                if (var8 == 3) {
                    this.field1508 = "";
                    this.field1509 = "Invalid username or password.";
                } else if (var8 == 4) {
                    this.field1508 = "Your account has been disabled.";
                    this.field1509 = "Please check your message-centre for details.";
                } else if (var8 == 5) {
                    this.field1508 = "Your account is already logged in.";
                    this.field1509 = "Try again in 60 secs...";
                } else if (var8 == 6) {
                    this.field1508 = "RuneScape has been updated!";
                    this.field1509 = "Please reload this page.";
                } else if (var8 == 7) {
                    this.field1508 = "This world is full.";
                    this.field1509 = "Please use a different world.";
                } else if (var8 == 8) {
                    this.field1508 = "Unable to connect.";
                    this.field1509 = "Login server offline.";
                } else if (var8 == 9) {
                    this.field1508 = "Login limit exceeded.";
                    this.field1509 = "Too many connections from your address.";
                } else if (var8 == 10) {
                    this.field1508 = "Unable to connect.";
                    this.field1509 = "Bad session id.";
                } else if (var8 == 11) {
                    this.field1509 = "Login server rejected session.";
                    this.field1509 = "Please try again.";
                } else if (var8 == 12) {
                    this.field1508 = "You need a members account to login to this world.";
                    this.field1509 = "Please subscribe, or use a different world.";
                } else if (var8 == 13) {
                    this.field1508 = "Could not complete login.";
                    this.field1509 = "Please try using a different world.";
                } else if (var8 == 14) {
                    this.field1508 = "The server is being updated.";
                    this.field1509 = "Please wait 1 minute and try again.";
                } else if (var8 == 15) {
                    this.field1361 = true;
                    this.field1404.field719 = 0;
                    this.field1484.field719 = 0;
                    this.field1244 = -1;
                    this.field1380 = -1;
                    this.field1381 = -1;
                    this.field1382 = -1;
                    this.field1243 = 0;
                    this.field1245 = 0;
                    this.field1592 = 0;
                    this.field1564 = 0;
                    this.field1356 = false;
                    this.field1489 = System.currentTimeMillis();
                } else if (var8 == 16) {
                    this.field1508 = "Login attempts exceeded.";
                    this.field1509 = "Please wait 1 minute and try again.";
                } else if (var8 == 17) {
                    this.field1508 = "You are standing in a members-only area.";
                    this.field1509 = "To play on this world move to a free area first";
                } else if (var8 == 20) {
                    this.field1508 = "Invalid loginserver requested";
                    this.field1509 = "Please try using a different world.";
                } else {
                    this.field1508 = "Unexpected server response";
                    this.field1509 = "Please try using a different world.";
                }
            } else {
                this.field1378 = 0;
                if (var8 == 18) {
                    this.field1378 = 1;
                }
                if (var8 == 19) {
                    this.field1378 = 2;
                }
                InputTracking.method45(this.field1303);
                this.field1402 = 0L;
                this.field1403 = 0;
                this.field1623.field984 = 0;
                super.field20 = true;
                this.field1252 = true;
                this.field1361 = true;
                this.field1404.field719 = 0;
                this.field1484.field719 = 0;
                this.field1244 = -1;
                this.field1380 = -1;
                this.field1381 = -1;
                this.field1382 = -1;
                this.field1243 = 0;
                this.field1245 = 0;
                this.field1592 = 0;
                this.field1247 = 0;
                this.field1581 = 0;
                this.field1264 = 0;
                this.field1564 = 0;
                this.field1356 = false;
                super.field21 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1431[var12] = null;
                }
                this.field1497 = 0;
                this.field1307 = 0;
                this.field1527 = 0;
                this.field1334 = 0;
                this.field1485 = (int) (Math.random() * 100.0D) - 50;
                this.field1266 = (int) (Math.random() * 110.0D) - 55;
                this.field1227 = (int) (Math.random() * 80.0D) - 40;
                this.field1533 = (int) (Math.random() * 120.0D) - 60;
                this.field1330 = (int) (Math.random() * 30.0D) - 20;
                this.field1560 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1265 = -1;
                this.field1461 = 0;
                this.field1462 = 0;
                this.field1286 = 0;
                this.field1439 = 0;
                for (int var13 = 0; var13 < this.field1283; ++var13) {
                    this.field1285[var13] = null;
                    this.field1290[var13] = null;
                }
                for (int var14 = 0; var14 < 8192; ++var14) {
                    this.field1438[var14] = null;
                }
                field1428 = this.field1285[this.field1284] = new PlayerEntity();
                this.field1573.method261();
                this.field1591.method261();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1432[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1190 = new LinkList((byte) 7);
                this.field1418 = 0;
                this.field1565 = -1;
                this.field1396 = -1;
                this.field1273 = -1;
                this.field1567 = -1;
                this.field1229 = -1;
                this.field1613 = false;
                this.field1225 = 3;
                this.field1376 = false;
                this.field1356 = false;
                this.field1626 = false;
                this.field1199 = null;
                this.field1416 = 0;
                this.field1253 = -1;
                this.field1570 = true;
                this.method501(0);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1557[var18] = 0;
                }
                field1506 = 0;
                field1612 = 0;
                field1606 = 0;
                field1553 = 0;
                field1219 = 0;
                field1542 = 0;
                field1622 = 0;
                field1386 = 0;
                field1558 = 0;
                field1524 = 0;
                this.method467(-437);
            }
        } catch (IOException var20) {
            this.field1508 = "";
            this.field1509 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method449(int arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1573.method257();
        if (arg0 != 0) {
            this.field1373 = -391;
        }
        while (var2 != null) {
            if (this.field1479 == var2.field505 && field1588 <= var2.field511) {
                if (field1588 >= var2.field510) {
                    if (var2.field514 > 0) {
                        NpcEntity var3 = this.field1438[var2.field514 - 1];
                        if (var3 != null && var3.field404 >= 0 && var3.field404 < 13312 && var3.field405 >= 0 && var3.field405 < 13312) {
                            var2.method132(var3.field405, (byte) -12, this.method473(false, var3.field405, var2.field505, var3.field404) - var2.field509, var3.field404, field1588);
                        }
                    }
                    if (var2.field514 < 0) {
                        int var4 = -var2.field514 - 1;
                        PlayerEntity var5;
                        if (this.field1397 == var4) {
                            var5 = field1428;
                        } else {
                            var5 = this.field1285[var4];
                        }
                        if (var5 != null && var5.field404 >= 0 && var5.field404 < 13312 && var5.field405 >= 0 && var5.field405 < 13312) {
                            var2.method132(var5.field405, (byte) -12, this.method473(false, var5.field405, var2.field505, var5.field404) - var2.field509, var5.field404, field1588);
                        }
                    }
                    var2.method133(-847, this.field1488);
                    this.field1258.method74(60, false, (int) var2.field518, var2.field524, (int) var2.field517, var2, (int) var2.field516, false, -1, this.field1479);
                }
            } else {
                var2.method119();
            }
            var2 = (ProjectileEntity) this.field1573.method259(-976);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method450(boolean arg0) {
        this.field1404.method227(187, this.field1496);
        if (this.field1567 != -1) {
            this.field1567 = -1;
            this.field1221 = true;
            this.field1613 = false;
            this.field1384 = true;
        }
        if (this.field1396 != -1) {
            this.field1396 = -1;
            this.field1236 = true;
            this.field1613 = false;
        }
        this.field1273 = -1;
        this.field1361 &= arg0;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (this.field1261 == 0) {
            this.field1579[0] = "Cancel";
            this.field1203[0] = 1252;
            this.field1564 = 1;
            if (arg0 < 0) {
                this.method550(this.field1539);
                this.field1296 = 0;
                if (super.field23 > 4 && super.field24 > 4 && super.field23 < 516 && super.field24 < 338) {
                    if (this.field1273 != -1) {
                        this.method523(super.field23, 4, super.field24, 7, 4, Component.field73[this.field1273], 0);
                    } else {
                        this.method445(this.field1412);
                    }
                }
                if (this.field1541 != this.field1296) {
                    this.field1541 = this.field1296;
                }
                this.field1296 = 0;
                if (super.field23 > 553 && super.field24 > 205 && super.field23 < 743 && super.field24 < 466) {
                    if (this.field1567 != -1) {
                        this.method523(super.field23, 205, super.field24, 7, 553, Component.field73[this.field1567], 0);
                    } else if (this.field1324[this.field1225] != -1) {
                        this.method523(super.field23, 205, super.field24, 7, 553, Component.field73[this.field1324[this.field1225]], 0);
                    }
                }
                if (this.field1618 != this.field1296) {
                    this.field1221 = true;
                    this.field1618 = this.field1296;
                }
                this.field1296 = 0;
                if (super.field23 > 17 && super.field24 > 357 && super.field23 < 426 && super.field24 < 453) {
                    if (this.field1396 != -1) {
                        this.method523(super.field23, 357, super.field24, 7, 17, Component.field73[this.field1396], 0);
                    } else if (super.field24 < 434) {
                        this.method533(false, super.field23 - 17, super.field24 - 357);
                    }
                }
                if (this.field1396 != -1 && this.field1490 != this.field1296) {
                    this.field1236 = true;
                    this.field1490 = this.field1296;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field1564 - 1; ++var3) {
                        if (this.field1203[var3] < 1000 && this.field1203[var3 + 1] > 1000) {
                            String var4 = this.field1579[var3];
                            this.field1579[var3] = this.field1579[var3 + 1];
                            this.field1579[var3 + 1] = var4;
                            int var5 = this.field1203[var3];
                            this.field1203[var3] = this.field1203[var3 + 1];
                            this.field1203[var3 + 1] = var5;
                            int var6 = this.field1201[var3];
                            this.field1201[var3] = this.field1201[var3 + 1];
                            this.field1201[var3 + 1] = var6;
                            int var7 = this.field1202[var3];
                            this.field1202[var3] = this.field1202[var3 + 1];
                            this.field1202[var3 + 1] = var7;
                            int var8 = this.field1204[var3];
                            this.field1204[var3] = this.field1204[var3 + 1];
                            this.field1204[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLob;)V")
    private final void method452(byte arg0, LocSpawned arg1) {
        if (this.field1605 != arg0) {
            this.field1404.method228(139);
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field737 == 0) {
            var3 = this.field1258.method89(arg1.field736, arg1.field738, arg1.field739);
        }
        if (arg1.field737 == 1) {
            var3 = this.field1258.method90(arg1.field739, 0, arg1.field736, arg1.field738);
        }
        if (arg1.field737 == 2) {
            var3 = this.field1258.method91(arg1.field736, arg1.field738, arg1.field739);
        }
        if (arg1.field737 == 3) {
            var3 = this.field1258.method92(arg1.field736, arg1.field738, arg1.field739);
        }
        if (var3 != 0) {
            int var7 = this.field1258.method93(arg1.field736, arg1.field738, arg1.field739, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field740 = var4;
        arg1.field742 = var5;
        arg1.field741 = var6;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1621) {
            this.method556(-7);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 244);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1398 = Integer.parseInt(arg0[0]);
                field1399 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method483(6);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method488((byte) 110);
                }
                if (arg0[3].equals("free")) {
                    field1400 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1400 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(370, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method453(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1439; ++var3) {
            NpcEntity var4 = this.field1438[this.field1440[var3]];
            int var5 = (this.field1440[var3] << 14) + 536870912;
            if (var4 != null && var4.method126(this.field1520) && var4.field461.field1015 == arg1) {
                int var6 = var4.field404 >> 7;
                int var7 = var4.field405 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field408 == 1 && (var4.field404 & 127) == 64 && (var4.field405 & 127) == 64) {
                        if (this.field1200[var6][var7] == this.field1580) {
                            continue;
                        }
                        this.field1200[var6][var7] = this.field1580;
                    }
                    this.field1258.method74((var4.field408 - 1) * 64 + 60, var4.field407, this.method473(false, var4.field405, this.field1479, var4.field404), var4.field406, var4.field405, var4, var4.field404, false, var5, this.field1479);
                }
            }
        }
        if (arg0 <= 0) {
            field1195 = this.field1537.method304();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method454(byte arg0) {
        if (this.field1346 != 0) {
            PixFont var2 = this.field1442;
            if (arg0 != 0) {
                this.field1434 = this.field1537.method304();
            }
            int var3 = 0;
            if (this.field1592 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1431[var4] != null) {
                    int var5 = this.field1429[var4];
                    String var6 = this.field1430[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var6, (byte) 1))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method216("From", 0, (byte) 8, var8, var9);
                        var2.method216("From", 65535, (byte) 8, var8 - 1, var9);
                        int var10 = var9 + var2.method215("From ", (byte) 4);
                        if (var7 == 1) {
                            this.field1332[0].method211((byte) 9, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1332[1].method211((byte) 9, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method216(var6 + ": " + this.field1431[var4], 0, (byte) 8, var8, var10);
                        var2.method216(var6 + ": " + this.field1431[var4], 65535, (byte) 8, var8 - 1, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1576 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method216(this.field1431[var4], 0, (byte) 8, var11, 4);
                        var2.method216(this.field1431[var4], 65535, (byte) 8, var11 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1576 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method216("To " + var6 + ": " + this.field1431[var4], 0, (byte) 8, var12, 4);
                        var2.method216("To " + var6 + ": " + this.field1431[var4], 65535, (byte) 8, var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method455(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            field1282 = !field1282;
        }
        if (this.field1564 >= 2 || this.field1497 != 0 || this.field1307 != 0) {
            String var3;
            if (this.field1497 == 1 && this.field1564 < 2) {
                var3 = "Use " + this.field1501 + " with...";
            } else if (this.field1307 == 1 && this.field1564 < 2) {
                var3 = this.field1310 + "...";
            } else {
                var3 = this.field1579[this.field1564 - 1];
            }
            if (this.field1564 > 2) {
                var3 = var3 + "@whi@ / " + (this.field1564 - 2) + " more options";
            }
            this.field1443.method219(true, field1588 / 1000, 4, 15, 7019, 16777215, var3);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method456(boolean arg0) {
        this.field1516.method267(212);
        int var2 = this.field1560 + this.field1533 & 2047;
        int var3 = field1428.field404 / 32 + 48;
        if (arg0) {
            this.field1404.method228(242);
        }
        int var4 = 464 - field1428.field405 / 32;
        this.field1463.method202(25, var4, 146, this.field1330 + 256, 5, var2, this.field1538, this.field1207, this.field1505, var3, 151);
        this.field1478.method202(0, 25, 33, 256, 0, this.field1560, this.field1538, this.field1607, this.field1427, 25, 33);
        for (int var5 = 0; var5 < this.field1210; ++var5) {
            int var33 = this.field1211[var5] * 4 + 2 - field1428.field404 / 32;
            int var34 = this.field1212[var5] * 4 + 2 - field1428.field405 / 32;
            this.method553(var33, false, this.field1448[var5], var34);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var29 = 0; var29 < 104; ++var29) {
                LinkList var30 = this.field1432[this.field1479][var6][var29];
                if (var30 != null) {
                    int var31 = var6 * 4 + 2 - field1428.field404 / 32;
                    int var32 = var29 * 4 + 2 - field1428.field405 / 32;
                    this.method553(var31, false, this.field1491, var32);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1439; ++var7) {
            NpcEntity var26 = this.field1438[this.field1440[var7]];
            if (var26 != null && var26.method126(this.field1520) && var26.field461.field1011) {
                int var27 = var26.field404 / 32 - field1428.field404 / 32;
                int var28 = var26.field405 / 32 - field1428.field405 / 32;
                this.method553(var27, false, this.field1492, var28);
            }
        }
        for (int var8 = 0; var8 < this.field1286; ++var8) {
            PlayerEntity var19 = this.field1285[this.field1287[var8]];
            if (var19 != null && var19.method126(this.field1520)) {
                int var20 = var19.field404 / 32 - field1428.field404 / 32;
                int var21 = var19.field405 / 32 - field1428.field405 / 32;
                boolean var22 = false;
                long var23 = JString.method309(var19.field465);
                for (int var25 = 0; var25 < this.field1418; ++var25) {
                    if (this.field1208[var25] == var23 && this.field1470[var25] != 0) {
                        var22 = true;
                        break;
                    }
                }
                if (var22) {
                    this.method553(var20, false, this.field1494, var21);
                } else {
                    this.method553(var20, false, this.field1493, var21);
                }
            }
        }
        if (this.field1581 != 0 && field1588 % 20 < 10) {
            if (this.field1581 == 1 && this.field1277 >= 0 && this.field1277 < this.field1438.length) {
                NpcEntity var9 = this.field1438[this.field1277];
                if (var9 != null) {
                    int var10 = var9.field404 / 32 - field1428.field404 / 32;
                    int var11 = var9.field405 / 32 - field1428.field405 / 32;
                    this.method447(var10, (byte) 2, var11, this.field1474);
                }
            }
            if (this.field1581 == 2) {
                int var12 = (this.field1347 - this.field1340) * 4 + 2 - field1428.field404 / 32;
                int var13 = (this.field1348 - this.field1341) * 4 + 2 - field1428.field405 / 32;
                this.method447(var12, (byte) 2, var13, this.field1474);
            }
            if (this.field1581 == 10 && this.field1415 >= 0 && this.field1415 < this.field1285.length) {
                PlayerEntity var14 = this.field1285[this.field1415];
                if (var14 != null) {
                    int var15 = var14.field404 / 32 - field1428.field404 / 32;
                    int var16 = var14.field405 / 32 - field1428.field405 / 32;
                    this.method447(var15, (byte) 2, var16, this.field1474);
                }
            }
        }
        if (this.field1461 != 0) {
            int var17 = this.field1461 * 4 + 2 - field1428.field404 / 32;
            int var18 = this.field1462 * 4 + 2 - field1428.field405 / 32;
            this.method553(var17, false, this.field1473, var18);
        }
        Pix2D.method169(0, 16777215, 3, 3, 97, 78);
        this.field1517.method267(212);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;II)Lyb;")
    public final Jagfile method457(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        this.field1243 += arg5;
        int var8 = 5;
        try {
            if (this.field1231[0] != null) {
                var7 = this.field1231[0].method300(168, arg2);
            }
        } catch (Exception var28) {
        }
        if (var7 != null) {
            this.field1329.reset();
            this.field1329.update(var7);
            int var9 = (int) this.field1329.getValue();
            if (arg0 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile((byte) 5, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                this.method13(7, arg4, "Requesting " + arg3);
                Object var12 = null;
                try {
                    int var13 = 0;
                    DataInputStream var14 = this.method506(arg1 + arg0);
                    byte[] var15 = new byte[6];
                    var14.readFully(var15, 0, 6);
                    Packet var16 = new Packet((byte) -109, var15);
                    var16.field719 = 3;
                    int var17 = var16.method242() + 6;
                    int var18 = 6;
                    var7 = new byte[var17];
                    for (int var19 = 0; var19 < 6; ++var19) {
                        var7[var19] = var15[var19];
                    }
                    while (var18 < var17) {
                        int var20 = var17 - var18;
                        if (var20 > 1000) {
                            var20 = 1000;
                        }
                        int var21 = var14.read(var7, var18, var20);
                        if (var21 < 0) {
                            throw new IOException("EOF");
                        }
                        var18 += var21;
                        int var22 = var18 * 100 / var17;
                        if (var13 != var22) {
                            this.method13(7, arg4, "Loading " + arg3 + " - " + var22 + "%");
                        }
                        var13 = var22;
                    }
                    var14.close();
                    try {
                        if (this.field1231[0] != null) {
                            this.field1231[0].method301(var7, arg2, true, var7.length);
                        }
                    } catch (Exception var27) {
                        this.field1231[0] = null;
                    }
                    if (var7 != null) {
                        this.field1329.reset();
                        this.field1329.update(var7);
                        int var23 = (int) this.field1329.getValue();
                        if (arg0 != var23) {
                            var7 = null;
                            ++var11;
                        }
                    }
                } catch (IOException var29) {
                    var7 = null;
                } catch (Exception var30) {
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var24 = var8; var24 > 0; --var24) {
                        if (var11 >= 3) {
                            this.method13(7, arg4, "Game updated - please reload page");
                            var24 = 10;
                        } else {
                            this.method13(7, arg4, "Error loading - Will retry in " + var24 + " secs.");
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var26) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                }
            }
            return new Jagfile((byte) 5, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field9 = 5;
        }
        if (field1609) {
            this.field1450 = true;
        } else {
            field1609 = true;
            boolean var1 = false;
            String var2 = this.method531(false);
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
                this.field1503 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1231[var3] = new FileStream(var3 + 1, signlink.cache_idx[var3], signlink.cache_dat, true, 500000);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1291[8] = 0;
                    while (this.field1291[8] == 0) {
                        this.method13(7, 20, "Connecting to web server");
                        try {
                            DataInputStream var5 = this.method506("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet((byte) -109, new byte[36]);
                            var5.readFully(var6.field718, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1291[var7] = var6.method243();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(7, 10, "Error loading - Will retry in " + var8 + " secs.");
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
                    this.field1390 = this.method457(this.field1291[1], "title", 1, "title screen", 25, field1195);
                    this.field1441 = new PixFont(this.field1390, "p11", 0);
                    this.field1442 = new PixFont(this.field1390, "p12", 0);
                    this.field1443 = new PixFont(this.field1390, "b12", 0);
                    this.field1444 = new PixFont(this.field1390, "q8", 0);
                    this.method435(true);
                    this.method495(field1374);
                    Jagfile var9 = this.method457(this.field1291[2], "config", 2, "config", 30, field1195);
                    Jagfile var10 = this.method457(this.field1291[3], "interface", 3, "interface", 35, field1195);
                    Jagfile var11 = this.method457(this.field1291[4], "media", 4, "2d graphics", 40, field1195);
                    Jagfile var12 = this.method457(this.field1291[6], "textures", 6, "textures", 45, field1195);
                    Jagfile var13 = this.method457(this.field1291[7], "wordenc", 7, "chat system", 50, field1195);
                    Jagfile var14 = this.method457(this.field1291[8], "sounds", 8, "sound effects", 55, field1195);
                    this.field1281 = new byte[4][104][104];
                    this.field1409 = new int[4][105][105];
                    this.field1258 = new World3D(104, this.field1409, 104, 4, true);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1554[var15] = new CollisionMap(104, false, 104);
                    }
                    this.field1463 = new Pix32(512, 512);
                    Jagfile var16 = this.method457(this.field1291[5], "versionlist", 5, "update list", 60, field1195);
                    this.method13(7, 60, "Connecting to update server");
                    this.field1525 = new OnDemand();
                    this.field1525.method279(var16, this);
                    AnimFrame.method58(this.field1525.method282((byte) 4));
                    Model.method135(this.field1525.method281(0, 0), this.field1525);
                    if (!field1401) {
                        this.field1568 = 0;
                        this.field1569 = false;
                        this.field1525.method288(2, this.field1568);
                        while (this.field1525.method289() > 0) {
                            this.method460((byte) 71);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13(7, 65, "Requesting animations");
                    int var17 = this.field1525.method281(1, 0);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1525.method288(1, var18);
                    }
                    while (this.field1525.method289() > 0) {
                        int var19 = var17 - this.field1525.method289();
                        if (var19 > 0) {
                            this.method13(7, 65, "Loading animations - " + var19 * 100 / var17 + "%");
                        }
                        this.method460((byte) 71);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13(7, 70, "Requesting models");
                    int var20 = this.field1525.method281(0, 0);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1525.method286(-250, var21);
                        if ((var22 & 1) != 0) {
                            this.field1525.method288(0, var21);
                        }
                    }
                    int var23 = this.field1525.method289();
                    while (this.field1525.method289() > 0) {
                        int var24 = var23 - this.field1525.method289();
                        if (var24 > 0) {
                            this.method13(7, 70, "Loading models - " + var24 * 100 / var23 + "%");
                        }
                        this.method460((byte) 71);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1231[0] != null) {
                        this.method13(7, 75, "Requesting maps");
                        this.field1525.method288(3, this.field1525.method283(48, 47, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(48, 47, 1, field1543));
                        this.field1525.method288(3, this.field1525.method283(48, 48, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(48, 48, 1, field1543));
                        this.field1525.method288(3, this.field1525.method283(48, 49, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(48, 49, 1, field1543));
                        this.field1525.method288(3, this.field1525.method283(47, 47, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(47, 47, 1, field1543));
                        this.field1525.method288(3, this.field1525.method283(47, 48, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(47, 48, 1, field1543));
                        this.field1525.method288(3, this.field1525.method283(148, 48, 0, field1543));
                        this.field1525.method288(3, this.field1525.method283(148, 48, 1, field1543));
                        int var25 = this.field1525.method289();
                        while (this.field1525.method289() > 0) {
                            int var26 = var25 - this.field1525.method289();
                            if (var26 > 0) {
                                this.method13(7, 75, "Loading maps - " + var26 * 100 / var25 + "%");
                            }
                            this.method460((byte) 71);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1525.method281(0, 0);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1525.method286(-250, var28);
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
                            this.field1525.method291(0, false, var28, var30);
                        }
                    }
                    this.field1525.method284(field1400, 0);
                    if (!field1401) {
                        int var31 = this.field1525.method281(2, 0);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1525.method287(var32, -23943)) {
                                this.field1525.method291(2, false, var32, (byte) 1);
                            }
                        }
                    }
                    this.method13(7, 80, "Unpacking media");
                    this.field1445 = new Pix8(var11, "invback", 0);
                    this.field1447 = new Pix8(var11, "chatback", 0);
                    this.field1446 = new Pix8(var11, "mapback", 0);
                    this.field1422 = new Pix8(var11, "backbase1", 0);
                    this.field1423 = new Pix8(var11, "backbase2", 0);
                    this.field1424 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1593[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1478 = new Pix32(var11, "compass", 0);
                    this.field1552 = new Pix32(var11, "mapedge", 0);
                    this.field1552.method195(false);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1574[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1566[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1514[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1389[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1473 = new Pix32(var11, "mapmarker", 0);
                    this.field1474 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1599[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1491 = new Pix32(var11, "mapdots", 0);
                    this.field1492 = new Pix32(var11, "mapdots", 1);
                    this.field1493 = new Pix32(var11, "mapdots", 2);
                    this.field1494 = new Pix32(var11, "mapdots", 3);
                    this.field1197 = new Pix8(var11, "scrollbar", 0);
                    this.field1198 = new Pix8(var11, "scrollbar", 1);
                    this.field1391 = new Pix8(var11, "redstone1", 0);
                    this.field1392 = new Pix8(var11, "redstone2", 0);
                    this.field1393 = new Pix8(var11, "redstone3", 0);
                    this.field1394 = new Pix8(var11, "redstone1", 0);
                    this.field1394.method208(4);
                    this.field1395 = new Pix8(var11, "redstone2", 0);
                    this.field1395.method208(4);
                    this.field1583 = new Pix8(var11, "redstone1", 0);
                    this.field1583.method209(35546);
                    this.field1584 = new Pix8(var11, "redstone2", 0);
                    this.field1584.method209(35546);
                    this.field1585 = new Pix8(var11, "redstone3", 0);
                    this.field1585.method209(35546);
                    this.field1586 = new Pix8(var11, "redstone1", 0);
                    this.field1586.method208(4);
                    this.field1586.method209(35546);
                    this.field1587 = new Pix8(var11, "redstone2", 0);
                    this.field1587.method208(4);
                    this.field1587.method209(35546);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1332[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1313 = new PixMap(this.method11(3), var40.field672, var40.field671, 2);
                    var40.method196(0, 0, 7);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1314 = new PixMap(this.method11(3), var41.field672, var41.field671, 2);
                    var41.method196(0, 0, 7);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1315 = new PixMap(this.method11(3), var42.field672, var42.field671, 2);
                    var42.method196(0, 0, 7);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1316 = new PixMap(this.method11(3), var43.field672, var43.field671, 2);
                    var43.method196(0, 0, 7);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1317 = new PixMap(this.method11(3), var44.field672, var44.field671, 2);
                    var44.method196(0, 0, 7);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1318 = new PixMap(this.method11(3), var45.field672, var45.field671, 2);
                    var45.method196(0, 0, 7);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1319 = new PixMap(this.method11(3), var46.field672, var46.field671, 2);
                    var46.method196(0, 0, 7);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1320 = new PixMap(this.method11(3), var47.field672, var47.field671, 2);
                    var47.method196(0, 0, 7);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1321 = new PixMap(this.method11(3), var48.field672, var48.field671, 2);
                    var48.method196(0, 0, 7);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1566[var53] != null) {
                            this.field1566[var53].method194(var49 + var52, var51 + var52, 8, var50 + var52);
                        }
                        if (this.field1574[var53] != null) {
                            this.field1574[var53].method210(var49 + var52, var51 + var52, 8, var50 + var52);
                        }
                    }
                    this.method13(7, 83, "Unpacking textures");
                    Pix3D.method181(false, var12);
                    Pix3D.method185(43504, 0.8D);
                    Pix3D.method180(field1545, 20);
                    this.method13(7, 86, "Unpacking config");
                    SeqType.method381(var9, (byte) 127);
                    LocType.method331(var9);
                    FloType.method371(var9, (byte) 127);
                    ObjType.method346(var9);
                    NpcType.method340(var9);
                    IdkType.method375(var9, (byte) 127);
                    SpotAnimType.method384(var9, (byte) 127);
                    VarpType.method387(var9, (byte) 127);
                    ObjType.field1028 = field1400;
                    if (!field1401) {
                        this.method13(7, 90, "Unpacking sounds");
                        byte[] var54 = var14.method308("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet((byte) -109, var54);
                        Wave.method321(var55, (byte) 127);
                    }
                    this.method13(7, 95, "Unpacking interfaces");
                    PixFont[] var56 = new PixFont[] { this.field1441, this.field1442, this.field1443, this.field1444 };
                    Component.method32(var10, 0, var11, var56);
                    this.method13(7, 100, "Preparing game engine");
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1446.field683[this.field1446.field685 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1427[var57] = var58;
                        this.field1607[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1446.field683[this.field1446.field685 * var61 + var64] != 0 || var64 <= 34 && var61 <= 34) {
                                if (var62 != 999) {
                                    var63 = var64;
                                    break;
                                }
                            } else if (var62 == 999) {
                                var62 = var64;
                            }
                        }
                        this.field1505[var61 - 5] = var62 - 25;
                        this.field1207[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method178(-130, 96, 479);
                    this.field1353 = Pix3D.field653;
                    Pix3D.method178(-130, 261, 190);
                    this.field1354 = Pix3D.field653;
                    Pix3D.method178(-130, 334, 512);
                    this.field1355 = Pix3D.field653;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field651[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method99(800, 334, (byte) 1, 500, 512, var65);
                    WordFilter.method389(var13);
                    this.field1623 = new MouseTracking(this, -74);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1624 + " " + this.field1617);
                    this.field1437 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method458(int arg0, Packet arg1, int arg2) {
        arg1.method248(30730);
        int var4 = arg1.method249(9, 1);
        if (var4 != 0) {
            int var5 = arg1.method249(9, 2);
            int var6 = 30 / arg2;
            if (var5 == 0) {
                this.field1289[this.field1288++] = this.field1284;
            } else if (var5 == 1) {
                int var7 = arg1.method249(9, 3);
                field1428.method124(var7, false, this.field1504);
                int var8 = arg1.method249(9, 1);
                if (var8 == 1) {
                    this.field1289[this.field1288++] = this.field1284;
                }
            } else if (var5 == 2) {
                int var9 = arg1.method249(9, 3);
                field1428.method124(var9, true, this.field1504);
                int var10 = arg1.method249(9, 3);
                field1428.method124(var10, true, this.field1504);
                int var11 = arg1.method249(9, 1);
                if (var11 == 1) {
                    this.field1289[this.field1288++] = this.field1284;
                }
            } else if (var5 == 3) {
                this.field1479 = arg1.method249(9, 2);
                int var12 = arg1.method249(9, 7);
                int var13 = arg1.method249(9, 7);
                int var14 = arg1.method249(9, 1);
                field1428.method123(var14 == 1, var12, var13, this.field1523);
                int var15 = arg1.method249(9, 1);
                if (var15 == 1) {
                    this.field1289[this.field1288++] = this.field1284;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1398 = Integer.parseInt(this.getParameter("nodeid"));
        field1399 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method483(6);
        } else {
            method488((byte) 110);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1400 = false;
        } else {
            field1400 = true;
        }
        this.method2((byte) 57, 503, 765);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method459(int arg0, int arg1) {
        if (arg0 >= 5 && arg0 <= 5) {
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (arg0 != 71) {
            this.field1191 = -492;
        }
        while (true) {
            OnDemandRequest var2 = this.field1525.method290();
            if (var2 == null) {
                return;
            }
            if (var2.field731 == 0) {
                Model.method136(var2.field732, false, var2.field733);
                if ((this.field1525.method286(-250, var2.field732) & 98) != 0) {
                    this.field1221 = true;
                    if (this.field1396 != -1) {
                        this.field1236 = true;
                    }
                }
            }
            if (var2.field731 == 1 && var2.field733 != null) {
                AnimFrame.method59(300, var2.field733);
            }
            if (var2.field731 == 2 && this.field1568 == var2.field732 && var2.field733 != null) {
                this.method466(this.field1569, var2.field733, this.field1417);
            }
            if (var2.field731 == 3 && this.field1527 == 1) {
                for (int var3 = 0; var3 < this.field1268.length; ++var3) {
                    if (this.field1406[var3] == var2.field732) {
                        this.field1268[var3] = var2.field733;
                        if (var2.field733 == null) {
                            this.field1406[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1407[var3] == var2.field732) {
                        this.field1311[var3] = var2.field733;
                        if (var2.field733 == null) {
                            this.field1407[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field731 == 93 && this.field1525.method285(var2.field732, 9)) {
                World.method17(31048, new Packet((byte) -109, var2.field733), this.field1525);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)I")
    public final int method461(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg0 != 8) {
            this.field1404.method228(54);
        }
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg1 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 > 0) {
            this.field1627 = 0;
            for (int var2 = -1; var2 < this.field1439 + this.field1286; ++var2) {
                PathingEntity var17;
                if (var2 == -1) {
                    var17 = field1428;
                } else if (var2 < this.field1286) {
                    var17 = this.field1285[this.field1287[var2]];
                } else {
                    var17 = this.field1438[this.field1440[var2 - this.field1286]];
                }
                if (var17 != null && var17.method126(this.field1520)) {
                    if (var2 >= this.field1286) {
                        NpcType var21 = ((NpcEntity) var17).field461;
                        if (var21.field1018 >= 0 && var21.field1018 < this.field1389.length) {
                            this.method479(this.field1433, var17.field450 + 15, var17);
                            if (this.field1294 > -1) {
                                this.field1389[var21.field1018].method198((byte) 9, this.field1294 - 12, this.field1295 - 30);
                            }
                        }
                        if (this.field1581 == 1 && this.field1440[var2 - this.field1286] == this.field1277 && field1588 % 20 < 10) {
                            this.method479(this.field1433, var17.field450 + 15, var17);
                            if (this.field1294 > -1) {
                                this.field1389[2].method198((byte) 9, this.field1294 - 12, this.field1295 - 28);
                            }
                        }
                    } else {
                        int var18 = 30;
                        PlayerEntity var19 = (PlayerEntity) var17;
                        if (var19.field468 != 0) {
                            this.method479(this.field1433, var17.field450 + 15, var17);
                            if (this.field1294 > -1) {
                                for (int var20 = 0; var20 < 8; ++var20) {
                                    if ((var19.field468 & 1 << var20) != 0) {
                                        this.field1389[var20].method198((byte) 9, this.field1294 - 12, this.field1295 - var18);
                                        var18 -= 25;
                                    }
                                }
                            }
                        }
                        if (var2 >= 0 && this.field1581 == 10 && this.field1287[var2] == this.field1415) {
                            this.method479(this.field1433, var17.field450 + 15, var17);
                            if (this.field1294 > -1) {
                                this.field1389[7].method198((byte) 9, this.field1294 - 12, this.field1295 - var18);
                            }
                        }
                    }
                    if (var17.field416 != null && (var2 >= this.field1286 || this.field1408 == 0 || this.field1408 == 3 || this.field1408 == 1 && this.method502(((PlayerEntity) var17).field465, (byte) 1))) {
                        this.method479(this.field1433, var17.field450, var17);
                        if (this.field1294 > -1 && this.field1627 < this.field1628) {
                            this.field1632[this.field1627] = this.field1443.method215(var17.field416, (byte) 4) / 2;
                            this.field1631[this.field1627] = this.field1443.field704;
                            this.field1629[this.field1627] = this.field1294;
                            this.field1630[this.field1627] = this.field1295;
                            this.field1633[this.field1627] = var17.field418;
                            this.field1634[this.field1627] = var17.field419;
                            this.field1635[this.field1627] = var17.field417;
                            this.field1636[this.field1627++] = var17.field416;
                            if (this.field1333 == 0 && var17.field419 == 1) {
                                this.field1631[this.field1627] += 10;
                                this.field1630[this.field1627] += 5;
                            }
                            if (this.field1333 == 0 && var17.field419 == 2) {
                                this.field1632[this.field1627] = 60;
                            }
                        }
                    }
                    if (var17.field423 > field1588) {
                        this.method479(this.field1433, var17.field450 + 15, var17);
                        if (this.field1294 > -1) {
                            int var22 = var17.field424 * 30 / var17.field425;
                            if (var22 > 30) {
                                var22 = 30;
                            }
                            Pix2D.method169(0, 65280, var22, 5, this.field1294 - 15, this.field1295 - 3);
                            Pix2D.method169(0, 16711680, 30 - var22, 5, this.field1294 - 15 + var22, this.field1295 - 3);
                        }
                    }
                    for (int var23 = 0; var23 < 4; ++var23) {
                        if (var17.field422[var23] > field1588) {
                            this.method479(this.field1433, var17.field450 / 2, var17);
                            if (this.field1294 > -1) {
                                if (var23 == 1) {
                                    this.field1295 -= 20;
                                }
                                if (var23 == 2) {
                                    this.field1294 -= 15;
                                    this.field1295 -= 10;
                                }
                                if (var23 == 3) {
                                    this.field1294 += 15;
                                    this.field1295 -= 10;
                                }
                                this.field1514[var17.field421[var23]].method198((byte) 9, this.field1294 - 12, this.field1295 - 12);
                                this.field1441.method213(this.field1294, 1, 0, String.valueOf(var17.field420[var23]), this.field1295 + 4);
                                this.field1441.method213(this.field1294 - 1, 1, 16777215, String.valueOf(var17.field420[var23]), this.field1295 + 3);
                            }
                        }
                    }
                }
            }
            for (int var3 = 0; var3 < this.field1627; ++var3) {
                int var4 = this.field1629[var3];
                int var5 = this.field1630[var3];
                int var6 = this.field1632[var3];
                int var7 = this.field1631[var3];
                boolean var8 = true;
                while (var8) {
                    var8 = false;
                    for (int var16 = 0; var16 < var3; ++var16) {
                        if (var5 + 2 > this.field1630[var16] - this.field1631[var16] && var5 - var7 < this.field1630[var16] + 2 && var4 - var6 < this.field1632[var16] + this.field1629[var16] && var4 + var6 > this.field1629[var16] - this.field1632[var16] && this.field1630[var16] - this.field1631[var16] < var5) {
                            var5 = this.field1630[var16] - this.field1631[var16];
                            var8 = true;
                        }
                    }
                }
                this.field1294 = this.field1629[var3];
                this.field1295 = this.field1630[var3] = var5;
                String var9 = this.field1636[var3];
                if (this.field1333 == 0) {
                    int var10 = 16776960;
                    if (this.field1633[var3] < 6) {
                        var10 = this.field1464[this.field1633[var3]];
                    }
                    if (this.field1633[var3] == 6) {
                        var10 = this.field1580 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (this.field1633[var3] == 7) {
                        var10 = this.field1580 % 20 < 10 ? 255 : 65535;
                    }
                    if (this.field1633[var3] == 8) {
                        var10 = this.field1580 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (this.field1633[var3] == 9) {
                        int var11 = 150 - this.field1635[var3];
                        if (var11 < 50) {
                            var10 = var11 * 1280 + 16711680;
                        } else if (var11 < 100) {
                            var10 = 16776960 - (var11 - 50) * 327680;
                        } else if (var11 < 150) {
                            var10 = (var11 - 100) * 5 + 65280;
                        }
                    }
                    if (this.field1633[var3] == 10) {
                        int var12 = 150 - this.field1635[var3];
                        if (var12 < 50) {
                            var10 = var12 * 5 + 16711680;
                        } else if (var12 < 100) {
                            var10 = 16711935 - (var12 - 50) * 327680;
                        } else if (var12 < 150) {
                            var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                        }
                    }
                    if (this.field1633[var3] == 11) {
                        int var13 = 150 - this.field1635[var3];
                        if (var13 < 50) {
                            var10 = 16777215 - var13 * 327685;
                        } else if (var13 < 100) {
                            var10 = (var13 - 50) * 327685 + 65280;
                        } else if (var13 < 150) {
                            var10 = 16777215 - (var13 - 100) * 327680;
                        }
                    }
                    if (this.field1634[var3] == 0) {
                        this.field1443.method213(this.field1294, 1, 0, var9, this.field1295 + 1);
                        this.field1443.method213(this.field1294, 1, var10, var9, this.field1295);
                    }
                    if (this.field1634[var3] == 1) {
                        this.field1443.method217(this.field1295 + 1, this.field1580, var9, 29720, this.field1294, 0);
                        this.field1443.method217(this.field1295, this.field1580, var9, 29720, this.field1294, var10);
                    }
                    if (this.field1634[var3] == 2) {
                        int var14 = this.field1443.method215(var9, (byte) 4);
                        int var15 = (150 - this.field1635[var3]) * (var14 + 100) / 150;
                        Pix2D.method166(this.field1294 + 50, 334, this.field1611, 0, this.field1294 - 50);
                        this.field1443.method216(var9, 0, (byte) 8, this.field1295 + 1, this.field1294 + 50 - var15);
                        this.field1443.method216(var9, var10, (byte) 8, this.field1295, this.field1294 + 50 - var15);
                        Pix2D.method165((byte) -115);
                    }
                } else {
                    this.field1443.method213(this.field1294, 1, 0, var9, this.field1295 + 1);
                    this.field1443.method213(this.field1294, 1, 16776960, var9, this.field1295);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method464(byte arg0) {
        this.field1515.method267(212);
        if (arg0 != 5) {
            field1543 = this.field1537.method304();
        }
        Pix3D.field653 = this.field1354;
        this.field1445.method211((byte) 9, 0, 0);
        if (this.field1567 != -1) {
            this.method544(0, 0, 0, Component.field73[this.field1567], 0);
        } else if (this.field1324[this.field1225] != -1) {
            this.method544(0, 0, 0, Component.field73[this.field1324[this.field1225]], 0);
        }
        if (this.field1356 && this.field1455 == 1) {
            this.method477((byte) 34);
        }
        this.field1515.method268(super.field15, 205, (byte) 55, 553);
        this.field1517.method267(212);
        Pix3D.field653 = this.field1355;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method465(int arg0) {
        if (arg0 <= 0) {
            this.field1193 = -475;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1591.method257(); var2 != null; var2 = (SpotAnimEntity) this.field1591.method259(-976)) {
            if (this.field1479 == var2.field613 && !var2.field619) {
                if (field1588 >= var2.field612) {
                    var2.method163(this.field1419, this.field1488);
                    if (var2.field619) {
                        var2.method119();
                    } else {
                        this.field1258.method74(60, false, var2.field616, 0, var2.field615, var2, var2.field614, false, -1, var2.field613);
                    }
                }
            } else {
                var2.method119();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BZ)V")
    public final void method466(boolean arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        this.field1361 &= arg2;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method467(int arg0) {
        if (this.field1518 == null) {
            this.method525(0);
            super.field16 = null;
            this.field1364 = null;
            this.field1365 = null;
            this.field1366 = null;
            this.field1367 = null;
            this.field1368 = null;
            this.field1369 = null;
            this.field1370 = null;
            this.field1371 = null;
            this.field1372 = null;
            this.field1518 = new PixMap(this.method11(3), 96, 479, 2);
            this.field1516 = new PixMap(this.method11(3), 156, 172, 2);
            Pix2D.method167(false);
            this.field1446.method211((byte) 9, 0, 0);
            this.field1515 = new PixMap(this.method11(3), 261, 190, 2);
            this.field1517 = new PixMap(this.method11(3), 334, 512, 2);
            while (arg0 >= 0) {
                this.field1244 = -1;
            }
            Pix2D.method167(false);
            this.field1325 = new PixMap(this.method11(3), 50, 496, 2);
            this.field1326 = new PixMap(this.method11(3), 37, 269, 2);
            this.field1327 = new PixMap(this.method11(3), 45, 249, 2);
            this.field1483 = true;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method468(int arg0) {
        int var2 = (field1428.field404 >> 7) + this.field1340;
        int var3 = (field1428.field405 >> 7) + this.field1341;
        if (arg0 != -11934) {
            this.field1244 = -1;
        }
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1410 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1410 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1410 = 0;
        }
        this.field1187 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1187 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1187 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1187 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1187 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1187 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1187 = 1;
            }
        }
        if (this.field1187 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1187 = 2;
        }
        this.field1360 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1360 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1360 = 1;
        }
        if (this.field1360 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1360 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method469(int arg0, int arg1, int arg2) {
        if (arg1 != 31733) {
            throw new NullPointerException();
        } else {
            int var3 = arg2 - arg0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -21245) {
            this.field1432 = null;
        }
        if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
            if (field1401 && this.field1479 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field1258.method89(arg4, arg1, arg6);
            }
            if (arg7 == 1) {
                var9 = this.field1258.method90(arg6, 0, arg4, arg1);
            }
            if (arg7 == 2) {
                var9 = this.field1258.method91(arg4, arg1, arg6);
            }
            if (arg7 == 3) {
                var9 = this.field1258.method92(arg4, arg1, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field1258.method93(arg4, arg1, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field1258.method80(arg1, arg4, arg6, -284);
                    LocType var17 = LocType.method333(var14);
                    if (var17.field955) {
                        this.field1554[arg4].method364(var17.field956, arg6, var16, var15, this.field1620, arg1);
                    }
                }
                if (arg7 == 1) {
                    this.field1258.method81(arg6, (byte) 98, arg1, arg4);
                }
                if (arg7 == 2) {
                    this.field1258.method82(arg1, arg6, 1, arg4);
                    LocType var18 = LocType.method333(var14);
                    if (var18.field953 + arg1 > 103 || var18.field953 + arg6 > 103 || var18.field954 + arg1 > 103 || var18.field954 + arg6 > 103) {
                        return;
                    }
                    if (var18.field955) {
                        this.field1554[arg4].method365(var18.field953, arg6, arg1, var18.field956, var18.field954, true, var16);
                    }
                }
                if (arg7 == 3) {
                    this.field1258.method83(arg6, arg4, arg1, this.field1272);
                    LocType var19 = LocType.method333(var14);
                    if (var19.field955 && var19.field957) {
                        this.field1554[arg4].method367(arg6, -625, arg1);
                    }
                }
            }
            if (arg0 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field1281[1][arg1][arg6] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                World.method31(arg1, arg3, arg0, arg6, this.field1258, (byte) 5, arg2, this.field1409, this.field1554[arg4], var20, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method471(int arg0, int arg1) {
        Component var3 = Component.field73[arg0];
        for (int var4 = 0; var4 < var3.field95.length && var3.field95[var4] != -1; ++var4) {
            Component var5 = Component.field73[var3.field95[var4]];
            if (var5.field80 == 1) {
                this.method471(var5.field78, 5);
            }
            var5.field76 = 0;
            var5.field77 = 0;
        }
        if (arg1 < 5 || arg1 > 5) {
            this.field1432 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method472(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1418 >= 100 && this.field1255 != 1) {
                this.method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, false);
            } else if (this.field1418 >= 200) {
                this.method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, false);
            } else {
                String var4 = JString.method313(true, JString.method310((byte) 88, arg1));
                for (int var5 = 0; var5 < this.field1418; ++var5) {
                    if (this.field1208[var5] == arg1) {
                        this.method431(var4 + " is already on your friend list", "", 0, false);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1359; ++var6) {
                    if (this.field1339[var6] == arg1) {
                        this.method431("Please remove " + var4 + " from your ignore list first", "", 0, false);
                        return;
                    }
                }
                if (!var4.equals(field1428.field465)) {
                    this.field1556[this.field1418] = var4;
                    if (arg0) {
                        this.field1208[this.field1418] = arg1;
                        this.field1470[this.field1418] = 0;
                        ++this.field1418;
                        this.field1221 = true;
                        this.field1404.method227(9, this.field1496);
                        this.field1404.method234(arg1, this.field1377);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method473(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field1281[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field1409[var7][var5][var6] + this.field1409[var7][var5 + 1][var6] * var8 >> 7;
            if (arg0) {
                this.field1404.method228(190);
            }
            int var11 = (128 - var8) * this.field1409[var7][var5][var6 + 1] + this.field1409[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method474(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1359; ++var4) {
                if (this.field1339[var4] == arg1) {
                    --this.field1359;
                    this.field1221 = true;
                    for (int var5 = var4; var5 < this.field1359; ++var5) {
                        this.field1339[var5] = this.field1339[var5 + 1];
                    }
                    this.field1404.method227(207, this.field1496);
                    this.field1404.method234(arg1, this.field1377);
                    break;
                }
            }
            if (!arg0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method475(byte arg0) {
        this.method454((byte) 0);
        if (this.field1603 == 1) {
            this.field1599[this.field1602 / 100].method198((byte) 9, this.field1600 - 8 - 4, this.field1601 - 8 - 4);
        }
        if (this.field1603 == 2) {
            this.field1599[this.field1602 / 100 + 4].method198((byte) 9, this.field1600 - 8 - 4, this.field1601 - 8 - 4);
        }
        if (this.field1229 != -1) {
            this.method489(this.field1488, 225, this.field1229);
            this.method544(0, 0, 0, Component.field73[this.field1229], 0);
        }
        if (this.field1264 > 0) {
            int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1264 / 10.0D) * 10.0D);
            for (int var3 = 0; var3 < 30; ++var3) {
                int var4 = (30 - var3) * 16;
                Pix2D.method173(var2 + var3, var4, 629, 16776960, 256 - var4 / 2, this.field1264);
            }
        }
        if (this.field1273 != -1) {
            this.method489(this.field1488, 225, this.field1273);
            this.method544(0, 0, 0, Component.field73[this.field1273], 0);
        }
        this.method468(-11934);
        if (arg0 == 1) {
            boolean var5 = false;
        } else {
            field1543 = 182;
        }
        if (!this.field1356) {
            this.method451(-346);
            this.method455((byte) 9);
        } else if (this.field1455 == 0) {
            this.method477((byte) 34);
        }
        if (this.field1416 == 1) {
            if (this.field1410 <= 0 && this.field1187 != 1) {
                this.field1389[1].method198((byte) 9, 472, 296);
            } else {
                this.field1389[1].method198((byte) 9, 472, 258);
            }
        }
        if (this.field1410 > 0) {
            this.field1389[0].method198((byte) 9, 472, 296);
            this.field1442.method213(484, 1, 16776960, "Level: " + this.field1410, 329);
        }
        if (this.field1187 == 1) {
            this.field1389[6].method198((byte) 9, 472, 296);
            this.field1442.method213(484, 1, 16776960, "Arena", 329);
        }
        if (this.field1592 != 0) {
            int var6 = this.field1592 / 50;
            int var7 = var6 / 60;
            int var8 = var6 % 60;
            if (var8 < 10) {
                this.field1442.method216("System update in: " + var7 + ":0" + var8, 16776960, (byte) 8, 329, 4);
            } else {
                this.field1442.method216("System update in: " + var7 + ":" + var8, 16776960, (byte) 8, 329, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method476(boolean arg0) {
        try {
            if (this.field1274 != null) {
                this.field1274.method38();
            }
        } catch (Exception var3) {
        }
        this.field1274 = null;
        if (arg0) {
            this.field1404.method228(159);
        }
        this.field1361 = false;
        this.field1414 = 0;
        this.field1577 = "";
        this.field1578 = "";
        InputTracking.method45(this.field1303);
        this.method481(true);
        this.field1258.method63(0);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1554[var2].method359((byte) 0);
        }
        System.gc();
        this.method503(0);
        this.field1472 = -1;
        this.field1568 = -1;
        this.field1205 = 0;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method477(byte arg0) {
        int var2 = this.field1456;
        int var3 = this.field1457;
        int var4 = this.field1458;
        int var5 = this.field1459;
        int var6 = 6116423;
        Pix2D.method169(0, var6, var4, var5, var2, var3);
        Pix2D.method169(0, 0, var4 - 2, 16, var2 + 1, var3 + 1);
        Pix2D.method170(var5 - 19, var4 - 2, 0, var2 + 1, 901, var3 + 18);
        this.field1443.method216("Choose Option", var6, (byte) 8, var3 + 14, var2 + 3);
        int var7 = super.field23;
        int var8 = super.field24;
        if (this.field1455 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1455 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1455 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1564; ++var9) {
            int var10 = (this.field1564 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1443.method218(var11, var2 + 3, true, false, var10, this.field1579[var9]);
        }
        if (arg0 != 34) {
            this.field1244 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IB)V")
    private final void method478(Packet arg0, int arg1, byte arg2) {
        if (arg2 == 7) {
            boolean var4 = false;
        } else {
            this.field1193 = 145;
        }
        for (int var5 = 0; var5 < this.field1288; ++var5) {
            int var6 = this.field1289[var5];
            PlayerEntity var7 = this.field1285[var6];
            int var8 = arg0.method238();
            if ((var8 & 128) == 128) {
                var8 += arg0.method238() << 8;
            }
            this.method522(var8, arg0, -113, var6, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILz;)V")
    public final void method479(int arg0, int arg1, PathingEntity arg2) {
        this.method480(3, arg2.field405, arg1, arg2.field404);
        if (arg0 != 0) {
            this.field1419 = this.field1537.method304();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method473(false, arg1, this.field1479, arg3) - arg2;
            int var6 = arg3 - this.field1637;
            int var7 = var5 - this.field1638;
            int var8 = arg1 - this.field1639;
            int var9 = Model.field606[this.field1640];
            int var10 = Model.field607[this.field1640];
            int var11 = Model.field606[this.field1641];
            int var12 = Model.field607[this.field1641];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg0 >= 3 && arg0 <= 3) {
                if (var17 >= 50) {
                    this.field1294 = (var13 << 9) / var17 + Pix3D.field647;
                    this.field1295 = (var16 << 9) / var17 + Pix3D.field648;
                } else {
                    this.field1294 = -1;
                    this.field1295 = -1;
                }
            }
        } else {
            this.field1294 = -1;
            this.field1295 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field18 != null) {
                    return new URL("http://127.0.0.1:" + (field1399 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        LocType.field979.method116();
        LocType.field980.method116();
        NpcType.field1019.method116();
        ObjType.field1069.method116();
        ObjType.field1070.method116();
        PlayerEntity.field486.method116();
        SpotAnimType.field1151.method116();
        this.field1361 &= arg0;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method482(int arg0) {
        while (arg0 >= 0) {
            field1282 = !field1282;
        }
        for (int var2 = 0; var2 < this.field1334; ++var2) {
            if (this.field1413[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1186[var2] == this.field1530 && this.field1230[var2] == this.field1251) {
                        if (!this.method497(this.field1250)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method322(this.field1230[var2], this.field1186[var2], this.field1604);
                        if (System.currentTimeMillis() + (long) (var4.field719 / 22) > (long) (this.field1328 / 22) + this.field1420) {
                            this.field1328 = var4.field719;
                            this.field1420 = System.currentTimeMillis();
                            if (this.method552((byte) 6, var4.field718, var4.field719)) {
                                this.field1530 = this.field1186[var2];
                                this.field1251 = this.field1230[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1413[var2] != -5) {
                    this.field1413[var2] = -5;
                } else {
                    --this.field1334;
                    for (int var6 = var2; var6 < this.field1334; ++var6) {
                        this.field1186[var6] = this.field1186[var6 + 1];
                        this.field1230[var6] = this.field1230[var6 + 1];
                        this.field1413[var6] = this.field1413[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1413[var2]--;
            }
        }
        if (this.field1205 > 0) {
            this.field1205 -= 20;
            if (this.field1205 < 0) {
                this.field1205 = 0;
            }
            if (this.field1205 == 0 && this.field1460 && !field1401) {
                this.field1568 = this.field1472;
                this.field1569 = false;
                this.field1525.method288(2, this.field1568);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method483(int arg0) {
        World3D.field295 = true;
        Pix3D.field642 = true;
        if (arg0 == 6) {
            field1401 = true;
            World.field45 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILmb;)V")
    public final void method484(int arg0, int arg1, Packet arg2) {
        if (arg0 == 6) {
            if (arg1 != 232 && arg1 != 125) {
                if (arg1 == 155) {
                    int var4 = arg2.method238();
                    int var5 = (var4 >> 4 & 7) + this.field1337;
                    int var6 = (var4 & 7) + this.field1338;
                    int var7 = arg2.method238();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1305[var8];
                    int var11 = arg2.method240();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1409[this.field1479][var5][var6];
                        int var13 = this.field1409[this.field1479][var5 + 1][var6];
                        int var14 = this.field1409[this.field1479][var5 + 1][var6 + 1];
                        int var15 = this.field1409[this.field1479][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1258.method85(var5, var6, this.field1479, true);
                            if (var16 != null) {
                                int var17 = var16.field287 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field285 = new LocEntity(var15, var14, var12, true, 2, var9 + 4, false, var13, var17, var11);
                                    var16.field286 = new LocEntity(var15, var14, var12, true, 2, var9 + 1 & 3, false, var13, var17, var11);
                                } else {
                                    var16.field285 = new LocEntity(var15, var14, var12, true, var8, var9, false, var13, var17, var11);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1258.method86(var5, this.field1479, -98, var6);
                            if (var18 != null) {
                                var18.field176 = new LocEntity(var15, var14, var12, true, 4, 0, false, var13, var18.field177 >> 14 & 32767, var11);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1258.method87(this.field1479, var6, 0, var5);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field270 = new LocEntity(var15, var14, var12, true, var8, var9, false, var13, var19.field278 >> 14 & 32767, var11);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1258.method88(false, var5, var6, this.field1479);
                            if (var20 != null) {
                                var20.field209 = new LocEntity(var15, var14, var12, true, 22, var9, false, var13, var20.field210 >> 14 & 32767, var11);
                            }
                        }
                    }
                } else if (arg1 == 234) {
                    int var21 = arg2.method238();
                    int var22 = (var21 >> 4 & 7) + this.field1337;
                    int var23 = (var21 & 7) + this.field1338;
                    int var24 = arg2.method240();
                    int var25 = arg2.method240();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field500 = var24;
                        var26.field501 = var25;
                        if (this.field1432[this.field1479][var22][var23] == null) {
                            this.field1432[this.field1479][var22][var23] = new LinkList((byte) 7);
                        }
                        this.field1432[this.field1479][var22][var23].method254(var26);
                        this.method536(var22, var23);
                    }
                } else if (arg1 == 39) {
                    int var27 = arg2.method238();
                    int var28 = (var27 >> 4 & 7) + this.field1337;
                    int var29 = (var27 & 7) + this.field1338;
                    int var30 = arg2.method240();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1432[this.field1479][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method257(); var32 != null; var32 = (ObjStackEntity) var31.method259(-976)) {
                                if ((var30 & 32767) == var32.field500) {
                                    var32.method119();
                                    break;
                                }
                            }
                            if (var31.method257() == null) {
                                this.field1432[this.field1479][var28][var29] = null;
                            }
                            this.method536(var28, var29);
                        }
                    }
                } else if (arg1 == 137) {
                    int var33 = arg2.method238();
                    int var34 = (var33 >> 4 & 7) + this.field1337;
                    int var35 = (var33 & 7) + this.field1338;
                    int var36 = var34 + arg2.method239();
                    int var37 = var35 + arg2.method239();
                    int var38 = arg2.method241();
                    int var39 = arg2.method240();
                    int var40 = arg2.method238();
                    int var41 = arg2.method238();
                    int var42 = arg2.method240();
                    int var43 = arg2.method240();
                    int var44 = arg2.method238();
                    int var45 = arg2.method238();
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                        int var46 = var34 * 128 + 64;
                        int var47 = var35 * 128 + 64;
                        int var48 = var36 * 128 + 64;
                        int var49 = var37 * 128 + 64;
                        ProjectileEntity var50 = new ProjectileEntity(var46, var39, var44, var41, (byte) -2, this.field1479, var47, this.method473(false, var47, this.field1479, var46) - var40, var45, field1588 + var42, var38, field1588 + var43);
                        var50.method132(var49, (byte) -12, this.method473(false, var49, this.field1479, var48) - var41, var48, field1588 + var42);
                        this.field1573.method254(var50);
                    }
                } else if (arg1 == 198) {
                    int var51 = arg2.method238();
                    int var52 = (var51 >> 4 & 7) + this.field1337;
                    int var53 = (var51 & 7) + this.field1338;
                    int var54 = arg2.method240();
                    int var55 = arg2.method238();
                    int var56 = arg2.method240();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(var58, var57, this.field1479, var54, this.method473(false, var58, this.field1479, var57) - var55, -258, field1588, var56);
                        this.field1591.method254(var59);
                    }
                } else if (arg1 == 69) {
                    int var60 = arg2.method238();
                    int var61 = (var60 >> 4 & 7) + this.field1337;
                    int var62 = (var60 & 7) + this.field1338;
                    int var63 = arg2.method240();
                    int var64 = arg2.method240();
                    int var65 = arg2.method240();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1397 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field500 = var63;
                        var66.field501 = var64;
                        if (this.field1432[this.field1479][var61][var62] == null) {
                            this.field1432[this.field1479][var61][var62] = new LinkList((byte) 7);
                        }
                        this.field1432[this.field1479][var61][var62].method254(var66);
                        this.method536(var61, var62);
                    }
                } else {
                    if (arg1 == 29) {
                        int var67 = arg2.method238();
                        int var68 = (var67 >> 4 & 7) + this.field1337;
                        int var69 = (var67 & 7) + this.field1338;
                        int var70 = arg2.method238();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1305[var71];
                        int var74 = arg2.method240();
                        int var75 = arg2.method240();
                        int var76 = arg2.method240();
                        int var77 = arg2.method240();
                        byte var78 = arg2.method239();
                        byte var79 = arg2.method239();
                        byte var80 = arg2.method239();
                        byte var81 = arg2.method239();
                        PlayerEntity var82;
                        if (this.field1397 == var77) {
                            var82 = field1428;
                        } else {
                            var82 = this.field1285[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method333(var74);
                            int var84 = this.field1409[this.field1479][var68][var69];
                            int var85 = this.field1409[this.field1479][var68 + 1][var69];
                            int var86 = this.field1409[this.field1479][var68 + 1][var69 + 1];
                            int var87 = this.field1409[this.field1479][var68][var69 + 1];
                            Model var88 = var83.method339(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method500(var68, 0, var76 + 1, 30437, -1, 0, var73, var69, this.field1479, var75 + 1);
                                var82.field474 = field1588 + var75;
                                var82.field475 = field1588 + var76;
                                var82.field479 = var88;
                                int var89 = var83.field953;
                                int var90 = var83.field954;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field954;
                                    var90 = var83.field953;
                                }
                                var82.field476 = var68 * 128 + var89 * 64;
                                var82.field478 = var69 * 128 + var90 * 64;
                                var82.field477 = this.method473(false, var82.field478, this.field1479, var82.field476);
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
                                var82.field480 = var68 + var78;
                                var82.field482 = var68 + var80;
                                var82.field481 = var69 + var79;
                                var82.field483 = var69 + var81;
                            }
                        }
                    }
                    if (arg1 == 209) {
                        int var93 = arg2.method238();
                        int var94 = (var93 >> 4 & 7) + this.field1337;
                        int var95 = (var93 & 7) + this.field1338;
                        int var96 = arg2.method240();
                        int var97 = arg2.method240();
                        int var98 = arg2.method240();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1432[this.field1479][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method257(); var100 != null; var100 = (ObjStackEntity) var99.method259(-976)) {
                                    if ((var96 & 32767) == var100.field500 && var100.field501 == var97) {
                                        var100.field501 = var98;
                                        break;
                                    }
                                }
                                this.method536(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var101 = arg2.method238();
                int var102 = (var101 >> 4 & 7) + this.field1337;
                int var103 = (var101 & 7) + this.field1338;
                int var104 = arg2.method238();
                int var105 = var104 >> 2;
                int var106 = var104 & 3;
                int var107 = this.field1305[var105];
                int var108;
                if (arg1 == 125) {
                    var108 = -1;
                } else {
                    var108 = arg2.method240();
                }
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    this.method500(var102, var105, -1, 30437, var108, var106, var107, var103, this.field1479, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;BI)V")
    private final void method485(Packet arg0, byte arg1, int arg2) {
        arg0.method248(30730);
        int var4 = arg0.method249(9, 8);
        if (var4 < this.field1439) {
            for (int var5 = var4; var5 < this.field1439; ++var5) {
                this.field1323[this.field1322++] = this.field1440[var5];
            }
        }
        if (var4 > this.field1439) {
            signlink.reporterror(this.field1577 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1439 = 0;
            if (arg1 == 20) {
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1440[var6];
                    NpcEntity var8 = this.field1438[var7];
                    int var9 = arg0.method249(9, 1);
                    if (var9 == 0) {
                        this.field1440[this.field1439++] = var7;
                        var8.field449 = field1588;
                    } else {
                        int var10 = arg0.method249(9, 2);
                        if (var10 == 0) {
                            this.field1440[this.field1439++] = var7;
                            var8.field449 = field1588;
                            this.field1289[this.field1288++] = var7;
                        } else if (var10 == 1) {
                            this.field1440[this.field1439++] = var7;
                            var8.field449 = field1588;
                            int var11 = arg0.method249(9, 3);
                            var8.method124(var11, false, this.field1504);
                            int var12 = arg0.method249(9, 1);
                            if (var12 == 1) {
                                this.field1289[this.field1288++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1440[this.field1439++] = var7;
                            var8.field449 = field1588;
                            int var13 = arg0.method249(9, 3);
                            var8.method124(var13, true, this.field1504);
                            int var14 = arg0.method249(9, 3);
                            var8.method124(var14, true, this.field1504);
                            int var15 = arg0.method249(9, 1);
                            if (var15 == 1) {
                                this.field1289[this.field1288++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1323[this.field1322++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (arg0 == 7) {
            if (field1428.field404 >> 7 == this.field1461 && field1428.field405 >> 7 == this.field1462) {
                this.field1461 = 0;
            }
            for (int var2 = -1; var2 < this.field1286; ++var2) {
                PlayerEntity var3;
                int var4;
                if (var2 == -1) {
                    var3 = field1428;
                    var4 = this.field1284 << 14;
                } else {
                    var3 = this.field1285[this.field1287[var2]];
                    var4 = this.field1287[var2] << 14;
                }
                if (var3 != null && var3.method126(this.field1520)) {
                    var3.field484 = false;
                    if ((field1401 && this.field1286 > 50 || this.field1286 > 200) && var2 != -1 && var3.field429 == var3.field409) {
                        var3.field484 = true;
                    }
                    int var5 = var3.field404 >> 7;
                    int var6 = var3.field405 >> 7;
                    if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                        if (var3.field479 != null && field1588 >= var3.field474 && field1588 < var3.field475) {
                            var3.field484 = false;
                            var3.field473 = this.method473(false, var3.field405, this.field1479, var3.field404);
                            this.field1258.method75(this.field1479, var3, var3.field405, var3.field482, var3.field483, (byte) 7, var3.field473, var3.field406, var3.field404, var3.field480, 60, var4, var3.field481);
                        } else {
                            if ((var3.field404 & 127) == 64 && (var3.field405 & 127) == 64) {
                                if (this.field1200[var5][var6] == this.field1580 && var2 != -1) {
                                    continue;
                                }
                                this.field1200[var5][var6] = this.field1580;
                            }
                            var3.field473 = this.method473(false, var3.field405, this.field1479, var3.field404);
                            this.field1258.method74(60, var3.field407, var3.field473, var3.field406, var3.field405, var3, var3.field404, false, var4, this.field1479);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Z")
    public final boolean method487(int arg0, boolean arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1203[arg0];
            if (!arg1) {
                this.field1426 = !this.field1426;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 406;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        if (arg0 != 110) {
            field1282 = !field1282;
        }
        World3D.field295 = false;
        Pix3D.field642 = false;
        field1401 = false;
        World.field45 = false;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method489(int arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field1432 = null;
        }
        boolean var4 = false;
        Component var5 = Component.field73[arg2];
        for (int var6 = 0; var6 < var5.field95.length && var5.field95[var6] != -1; ++var6) {
            Component var7 = Component.field73[var5.field95[var6]];
            if (var7.field80 == 1) {
                var4 |= this.method489(arg0, 225, var7.field78);
            }
            if (var7.field80 == 6 && (var7.field124 != -1 || var7.field125 != -1)) {
                boolean var8 = this.method516(var7, 551);
                int var9;
                if (var8) {
                    var9 = var7.field125;
                } else {
                    var9 = var7.field124;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1120[var9];
                    var7.field77 += arg0;
                    while (var7.field77 > var10.method382(0, var7.field76)) {
                        var7.field77 -= var10.method382(0, var7.field76) + 1;
                        ++var7.field76;
                        if (var7.field76 >= var10.field1121) {
                            var7.field76 -= var10.field1125;
                            if (var7.field76 < 0 || var7.field76 >= var10.field1121) {
                                var7.field76 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method490(int arg0) {
        for (int var2 = -1; var2 < this.field1286; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1284;
            } else {
                var4 = this.field1287[var2];
            }
            PlayerEntity var5 = this.field1285[var4];
            if (var5 != null) {
                this.method438(var5, 1, 867);
            }
        }
        ++field1610;
        if (arg0 != 20697) {
            field1282 = !field1282;
        }
        if (field1610 > 1406) {
            field1610 = 0;
            this.field1404.method227(215, this.field1496);
            this.field1404.method228(0);
            int var3 = this.field1404.field719;
            this.field1404.method228(162);
            this.field1404.method228(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1404.method228(84);
            }
            this.field1404.method229(31824);
            this.field1404.method229(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1404.method228(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1404.method228(134);
            }
            this.field1404.method228(100);
            this.field1404.method228(94);
            this.field1404.method229(35521);
            this.field1404.method237(41372, this.field1404.field719 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg1 & 2047;
        if (arg0 < 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg5;
            if (var8 != 0) {
                int var13 = Model.field606[var8];
                int var14 = Model.field607[var8];
                int var15 = var11 * var14 - arg5 * var13 >> 16;
                var12 = var11 * var13 + arg5 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field606[var9];
                int var17 = Model.field607[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1637 = arg6 - var10;
            this.field1638 = arg2 - var11;
            this.field1639 = arg4 - var12;
            this.field1640 = arg3;
            this.field1641 = arg1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.field1617 = arg1;
        this.field1624 = arg2;
        this.method540(true);
        if (this.field1390 == null) {
            super.method13(7, arg1, arg2);
        } else {
            this.field1366.method267(212);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1443.method213(var4 / 2, 1, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method170(34, 304, 9179409, var4 / 2 - 152, 901, var7);
            Pix2D.method170(32, 302, 0, var4 / 2 - 151, 901, var7 + 1);
            Pix2D.method169(0, 9179409, arg1 * 3, 30, var4 / 2 - 150, var7 + 2);
            Pix2D.method169(0, 0, 300 - arg1 * 3, 30, arg1 * 3 + (var4 / 2 - 150), var7 + 2);
            this.field1443.method213(var4 / 2, 1, 16777215, arg2, var5 / 2 + 5 - var6);
            if (arg0 < 7 || arg0 > 7) {
                this.method6();
            }
            this.field1366.method268(super.field15, 171, (byte) 55, 202);
            if (this.field1483) {
                this.field1483 = false;
                if (!this.field1452) {
                    this.field1367.method268(super.field15, 0, (byte) 55, 0);
                    this.field1368.method268(super.field15, 0, (byte) 55, 637);
                }
                this.field1364.method268(super.field15, 0, (byte) 55, 128);
                this.field1365.method268(super.field15, 371, (byte) 55, 202);
                this.field1369.method268(super.field15, 265, (byte) 55, 0);
                this.field1370.method268(super.field15, 265, (byte) 55, 562);
                this.field1371.method268(super.field15, 171, (byte) 55, 128);
                this.field1372.method268(super.field15, 171, (byte) 55, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method492(byte arg0) {
        this.field1518.method267(212);
        if (this.field1595 == arg0) {
            Pix3D.field653 = this.field1353;
            this.field1447.method211((byte) 9, 0, 0);
            if (this.field1626) {
                this.field1443.method213(239, 1, 0, this.field1213, 40);
                this.field1443.method213(239, 1, 128, this.field1449 + "*", 60);
            } else if (this.field1376) {
                this.field1443.method213(239, 1, 0, "Enter amount:", 40);
                this.field1443.method213(239, 1, 128, this.field1336 + "*", 60);
            } else if (this.field1199 != null) {
                this.field1443.method213(239, 1, 0, this.field1199, 40);
                this.field1443.method213(239, 1, 128, "Click to continue", 60);
            } else if (this.field1396 != -1) {
                this.method544(0, 0, 0, Component.field73[this.field1396], 0);
            } else if (this.field1565 != -1) {
                this.method544(0, 0, 0, Component.field73[this.field1565], 0);
            } else {
                PixFont var2 = this.field1442;
                int var3 = 0;
                Pix2D.method166(463, 77, this.field1611, 0, 0);
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1431[var4] != null) {
                        int var6 = this.field1429[var4];
                        int var7 = 70 - var3 * 14 + this.field1248;
                        String var8 = this.field1430[var4];
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
                                var2.method216(this.field1431[var4], 0, (byte) 8, var7, 4);
                            }
                            ++var3;
                        }
                        if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1408 == 0 || this.field1408 == 1 && this.method502(var8, (byte) 1))) {
                            if (var7 > 0 && var7 < 110) {
                                int var10 = 4;
                                if (var9 == 1) {
                                    this.field1332[0].method211((byte) 9, var10, var7 - 12);
                                    var10 += 14;
                                }
                                if (var9 == 2) {
                                    this.field1332[1].method211((byte) 9, var10, var7 - 12);
                                    var10 += 14;
                                }
                                var2.method216(var8 + ":", 0, (byte) 8, var7, var10);
                                int var11 = var10 + var2.method215(var8, (byte) 4) + 8;
                                var2.method216(this.field1431[var4], 255, (byte) 8, var7, var11);
                            }
                            ++var3;
                        }
                        if ((var6 == 3 || var6 == 7) && this.field1346 == 0 && (var6 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var8, (byte) 1))) {
                            if (var7 > 0 && var7 < 110) {
                                byte var12 = 4;
                                var2.method216("From", 0, (byte) 8, var7, var12);
                                int var13 = var12 + var2.method215("From ", (byte) 4);
                                if (var9 == 1) {
                                    this.field1332[0].method211((byte) 9, var13, var7 - 12);
                                    var13 += 14;
                                }
                                if (var9 == 2) {
                                    this.field1332[1].method211((byte) 9, var13, var7 - 12);
                                    var13 += 14;
                                }
                                var2.method216(var8 + ":", 0, (byte) 8, var7, var13);
                                int var14 = var13 + var2.method215(var8, (byte) 4) + 8;
                                var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, var14);
                            }
                            ++var3;
                        }
                        if (var6 == 4 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method216(var8 + " " + this.field1431[var4], 8388736, (byte) 8, var7, 4);
                            }
                            ++var3;
                        }
                        if (var6 == 5 && this.field1346 == 0 && this.field1576 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, 4);
                            }
                            ++var3;
                        }
                        if (var6 == 6 && this.field1346 == 0 && this.field1576 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method216("To " + var8 + ":", 0, (byte) 8, var7, 4);
                                var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, 12 + var2.method215("To " + var8, (byte) 4));
                            }
                            ++var3;
                        }
                        if (var6 == 8 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method216(var8 + " " + this.field1431[var4], 8270336, (byte) 8, var7, 4);
                            }
                            ++var3;
                        }
                    }
                }
                Pix2D.method165((byte) -115);
                this.field1563 = var3 * 14 + 7;
                if (this.field1563 < 78) {
                    this.field1563 = 78;
                }
                this.method551(463, this.field1563, 0, this.field1563 - this.field1248 - 77, (byte) 9, 77);
                String var5;
                if (field1428 != null && field1428.field465 != null) {
                    var5 = field1428.field465;
                } else {
                    var5 = JString.method313(true, this.field1577);
                }
                var2.method216(var5 + ":", 0, (byte) 8, 90, 4);
                var2.method216(this.field1596 + "*", 255, (byte) 8, 90, 6 + var2.method215(var5 + ": ", (byte) 4));
                Pix2D.method172(0, 77, 479, 0, this.field1220);
            }
            if (this.field1356 && this.field1455 == 2) {
                this.method477((byte) 34);
            }
            this.field1518.method268(super.field15, 357, (byte) 55, 17);
            this.field1517.method267(212);
            Pix3D.field653 = this.field1355;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public void method493(byte arg0) {
        if (arg0 == 40) {
            System.out.println("============");
            System.out.println("flame-cycle:" + this.field1385);
            if (this.field1525 != null) {
                System.out.println("Od-cycle:" + this.field1525.field855);
            }
            System.out.println("loop-cycle:" + field1588);
            System.out.println("draw-cycle:" + field1344);
            System.out.println("ptype:" + this.field1244);
            System.out.println("psize:" + this.field1243);
            if (this.field1274 != null) {
                this.field1274.method43((byte) 40);
            }
            super.field12 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.method6();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field18 != null ? super.field18 : this;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method494(int arg0) {
        for (int var2 = -1; var2 < this.field1286; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1284;
            } else {
                var6 = this.field1287[var2];
            }
            PlayerEntity var7 = this.field1285[var6];
            if (var7 != null && var7.field417 > 0) {
                --var7.field417;
                if (var7.field417 == 0) {
                    var7.field416 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1439; ++var3) {
            int var4 = this.field1440[var3];
            NpcEntity var5 = this.field1438[var4];
            if (var5 != null && var5.field417 > 0) {
                --var5.field417;
                if (var5.field417 == 0) {
                    var5.field416 = null;
                }
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.field1244 = this.field1484.method238();
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method495(int arg0) {
        if (arg0 != 0) {
            field1282 = !field1282;
        }
        this.field1362 = new Pix8(this.field1390, "titlebox", 0);
        this.field1363 = new Pix8(this.field1390, "titlebutton", 0);
        this.field1502 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1502[var2] = new Pix8(this.field1390, "runes", var2);
        }
        this.field1269 = new Pix32(128, 265);
        this.field1270 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1269.field670[var3] = this.field1367.field757[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1270.field670[var4] = this.field1368.field757[var4];
        }
        this.field1216 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1216[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1216[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1216[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1216[var8 + 192] = 16777215;
        }
        this.field1217 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1217[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1217[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1217[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1217[var12 + 192] = 16777215;
        }
        this.field1218 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1218[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1218[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1218[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1218[var16 + 192] = 16777215;
        }
        this.field1215 = new int[256];
        this.field1301 = new int[32768];
        this.field1302 = new int[32768];
        this.method527((Pix8) null, (byte) 66);
        this.field1571 = new int[32768];
        this.field1572 = new int[32768];
        this.method13(7, 10, "Connecting to fileserver");
        if (!this.field1452) {
            this.field1621 = true;
            this.field1452 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method496(int arg0) {
        int var2 = 7 / arg0;
        if (super.field29 == 1) {
            int var3 = super.field30 - 25 - 550;
            int var4 = super.field31 - 5 - 4;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                var4 -= 75;
                int var5 = this.field1560 + this.field1533 & 2047;
                int var6 = Pix3D.field651[var5];
                int var7 = Pix3D.field652[var5];
                int var8 = (this.field1330 + 256) * var6 >> 8;
                int var9 = (this.field1330 + 256) * var7 >> 8;
                int var10 = var3 * var9 + var4 * var8 >> 11;
                int var11 = var4 * var9 - var3 * var8 >> 11;
                int var12 = field1428.field404 + var10 >> 7;
                int var13 = field1428.field405 - var11 >> 7;
                boolean var14 = this.method515(false, 0, field1428.field454[0], 0, 1, true, 0, var12, 0, var13, 0, field1428.field453[0]);
                if (var14) {
                    this.field1404.method228(var3);
                    this.field1404.method228(var4);
                    this.field1404.method229(this.field1560);
                    this.field1404.method228(57);
                    this.field1404.method228(this.field1533);
                    this.field1404.method228(this.field1330);
                    this.field1404.method228(89);
                    this.field1404.method229(field1428.field404);
                    this.field1404.method229(field1428.field405);
                    this.field1404.method228(this.field1544);
                    this.field1404.method228(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)Z")
    public final boolean method497(int arg0) {
        if (arg0 != 3) {
            this.field1244 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLmb;I)V")
    private final void method498(boolean arg0, Packet arg1, int arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field1288; ++var5) {
            int var6 = this.field1289[var5];
            NpcEntity var7 = this.field1438[var6];
            int var8 = arg1.method238();
            if ((var8 & 1) == 1) {
                int var9 = arg1.method238();
                int var10 = arg1.method238();
                var7.method127(var10, 0, var9);
                var7.field423 = field1588 + 300;
                var7.field424 = arg1.method238();
                var7.field425 = arg1.method238();
            }
            if ((var8 & 2) == 2) {
                int var11 = arg1.method240();
                if (var11 == 65535) {
                    var11 = -1;
                }
                if (var7.field432 == var11) {
                    var7.field436 = 0;
                }
                int var12 = arg1.method238();
                if (var7.field432 == var11 && var11 != -1) {
                    int var13 = SeqType.field1120[var11].field1134;
                    if (var13 == 1) {
                        var7.field433 = 0;
                        var7.field434 = 0;
                        var7.field435 = var12;
                        var7.field436 = 0;
                    }
                    if (var13 == 2) {
                        var7.field436 = 0;
                    }
                } else if (var11 == -1 || var7.field432 == -1 || SeqType.field1120[var11].field1128 >= SeqType.field1120[var7.field432].field1128) {
                    var7.field432 = var11;
                    var7.field433 = 0;
                    var7.field434 = 0;
                    var7.field435 = var12;
                    var7.field436 = 0;
                    var7.field457 = var7.field452;
                }
            }
            if ((var8 & 4) == 4) {
                var7.field426 = arg1.method240();
                if (var7.field426 == 65535) {
                    var7.field426 = -1;
                }
            }
            if ((var8 & 8) == 8) {
                var7.field416 = arg1.method245();
                var7.field417 = 100;
            }
            if ((var8 & 16) == 16) {
                int var14 = arg1.method238();
                int var15 = arg1.method238();
                var7.method127(var15, 0, var14);
                var7.field423 = field1588 + 300;
                var7.field424 = arg1.method238();
                var7.field425 = arg1.method238();
            }
            if ((var8 & 32) == 32) {
                var7.field461 = NpcType.method342(arg1.method240());
                var7.field411 = var7.field461.field1000;
                var7.field412 = var7.field461.field1001;
                var7.field413 = var7.field461.field1002;
                var7.field414 = var7.field461.field1003;
                var7.field409 = var7.field461.field999;
            }
            if ((var8 & 64) == 64) {
                var7.field437 = arg1.method240();
                int var16 = arg1.method243();
                var7.field441 = var16 >> 16;
                var7.field440 = (var16 & 65535) + field1588;
                var7.field438 = 0;
                var7.field439 = 0;
                if (var7.field440 > field1588) {
                    var7.field438 = -1;
                }
                if (var7.field437 == 65535) {
                    var7.field437 = -1;
                }
            }
            if ((var8 & 128) == 128) {
                var7.field427 = arg1.method240();
                var7.field428 = arg1.method240();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method499(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method249(9, 8);
        if (this.field1312 != arg2) {
            this.field1620 = this.field1537.method304();
        }
        if (var4 < this.field1286) {
            for (int var5 = var4; var5 < this.field1286; ++var5) {
                this.field1323[this.field1322++] = this.field1287[var5];
            }
        }
        if (var4 > this.field1286) {
            signlink.reporterror(this.field1577 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1286 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1287[var6];
                PlayerEntity var8 = this.field1285[var7];
                int var9 = arg1.method249(9, 1);
                if (var9 == 0) {
                    this.field1287[this.field1286++] = var7;
                    var8.field449 = field1588;
                } else {
                    int var10 = arg1.method249(9, 2);
                    if (var10 == 0) {
                        this.field1287[this.field1286++] = var7;
                        var8.field449 = field1588;
                        this.field1289[this.field1288++] = var7;
                    } else if (var10 == 1) {
                        this.field1287[this.field1286++] = var7;
                        var8.field449 = field1588;
                        int var11 = arg1.method249(9, 3);
                        var8.method124(var11, false, this.field1504);
                        int var12 = arg1.method249(9, 1);
                        if (var12 == 1) {
                            this.field1289[this.field1288++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1287[this.field1286++] = var7;
                        var8.field449 = field1588;
                        int var13 = arg1.method249(9, 3);
                        var8.method124(var13, true, this.field1504);
                        int var14 = arg1.method249(9, 3);
                        var8.method124(var14, true, this.field1504);
                        int var15 = arg1.method249(9, 1);
                        if (var15 == 1) {
                            this.field1289[this.field1288++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1323[this.field1322++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 <= 0) {
            this.field1244 = this.field1484.method238();
        }
        this.field1483 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1190.method257(); var12 != null; var12 = (LocSpawned) this.field1190.method259(-976)) {
            if (var12.field736 == arg8 && var12.field738 == arg0 && var12.field739 == arg7 && var12.field737 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field736 = arg8;
            var11.field737 = arg6;
            var11.field738 = arg0;
            var11.field739 = arg7;
            this.method452((byte) -102, var11);
            this.field1190.method254(var11);
        }
        var11.field743 = arg4;
        var11.field745 = arg1;
        var11.field744 = arg5;
        var11.field746 = arg9;
        if (arg3 != 30437) {
            this.method6();
        }
        var11.field747 = arg2;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method501(int arg0) {
        this.field1196 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1597[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1100; ++var3) {
                if (!IdkType.field1101[var3].field1107 && IdkType.field1101[var3].field1102 == var2 + (this.field1570 ? 0 : 7)) {
                    this.field1597[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != 0) {
            this.field1404.method228(220);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method502(String arg0, byte arg1) {
        if (arg1 != 1) {
            this.field1244 = this.field1484.method238();
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1418; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1556[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field1428.field465);
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method503(int arg0) {
        this.field1243 += arg0;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method504(long arg0, boolean arg1) {
        if (!arg1) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field1418; ++var4) {
                    if (this.field1208[var4] == arg0) {
                        --this.field1418;
                        this.field1221 = true;
                        for (int var5 = var4; var5 < this.field1418; ++var5) {
                            this.field1556[var5] = this.field1556[var5 + 1];
                            this.field1470[var5] = this.field1470[var5 + 1];
                            this.field1208[var5] = this.field1208[var5 + 1];
                        }
                        this.field1404.method227(69, this.field1496);
                        this.field1404.method234(arg0, this.field1377);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method505(int arg0) {
        int var2 = this.field1546 * 128 + 64;
        int var3 = this.field1547 * 128 + 64;
        int var4 = this.method473(false, var3, this.field1479, var2) - this.field1548;
        if (this.field1637 < var2) {
            this.field1637 += (var2 - this.field1637) * this.field1550 / 1000 + this.field1549;
            if (this.field1637 > var2) {
                this.field1637 = var2;
            }
        }
        if (this.field1637 > var2) {
            this.field1637 -= (this.field1637 - var2) * this.field1550 / 1000 + this.field1549;
            if (this.field1637 < var2) {
                this.field1637 = var2;
            }
        }
        if (this.field1638 < var4) {
            this.field1638 += (var4 - this.field1638) * this.field1550 / 1000 + this.field1549;
            if (this.field1638 > var4) {
                this.field1638 = var4;
            }
        }
        if (this.field1638 > var4) {
            this.field1638 -= (this.field1638 - var4) * this.field1550 / 1000 + this.field1549;
            if (this.field1638 < var4) {
                this.field1638 = var4;
            }
        }
        if (this.field1639 < var3) {
            this.field1639 += (var3 - this.field1639) * this.field1550 / 1000 + this.field1549;
            if (this.field1639 > var3) {
                this.field1639 = var3;
            }
        }
        if (this.field1639 > var3) {
            this.field1639 -= (this.field1639 - var3) * this.field1550 / 1000 + this.field1549;
            if (this.field1639 < var3) {
                this.field1639 = var3;
            }
        }
        int var5 = this.field1465 * 128 + 64;
        int var6 = this.field1466 * 128 + 64;
        int var7 = this.method473(false, var6, this.field1479, var5) - this.field1467;
        int var8 = var5 - this.field1637;
        int var9 = var7 - this.field1638;
        int var10 = var6 - this.field1639;
        if (this.field1555 != arg0) {
            this.field1417 = !this.field1417;
        }
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1640 < var12) {
            this.field1640 += (var12 - this.field1640) * this.field1469 / 1000 + this.field1468;
            if (this.field1640 > var12) {
                this.field1640 = var12;
            }
        }
        if (this.field1640 > var12) {
            this.field1640 -= (this.field1640 - var12) * this.field1469 / 1000 + this.field1468;
            if (this.field1640 < var12) {
                this.field1640 = var12;
            }
        }
        int var14 = var13 - this.field1641;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1641 += this.field1469 * var14 / 1000 + this.field1468;
            this.field1641 &= 2047;
        }
        if (var14 < 0) {
            this.field1641 -= -var14 * this.field1469 / 1000 + this.field1468;
            this.field1641 &= 2047;
        }
        int var15 = var13 - this.field1641;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1641 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method506(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method507(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        if (arg0) {
            this.method6();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(9);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1273 != -1 && this.field1273 == this.field1192) {
                        if (var2 == 8 && this.field1345.length() > 0) {
                            this.field1345 = this.field1345.substring(0, this.field1345.length() - 1);
                        }
                        break;
                    }
                    if (this.field1626) {
                        if (var2 >= 32 && var2 <= 122 && this.field1449.length() < 80) {
                            this.field1449 = this.field1449 + (char) var2;
                            this.field1236 = true;
                        }
                        if (var2 == 8 && this.field1449.length() > 0) {
                            this.field1449 = this.field1449.substring(0, this.field1449.length() - 1);
                            this.field1236 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1626 = false;
                            this.field1236 = true;
                            if (this.field1256 == 1) {
                                long var3 = JString.method309(this.field1449);
                                this.method472(true, var3);
                            }
                            if (this.field1256 == 2 && this.field1418 > 0) {
                                long var5 = JString.method309(this.field1449);
                                this.method504(var5, false);
                            }
                            if (this.field1256 == 3 && this.field1449.length() > 0) {
                                this.field1404.method227(170, this.field1496);
                                this.field1404.method228(0);
                                int var7 = this.field1404.field719;
                                this.field1404.method234(this.field1625, this.field1377);
                                WordPack.method317(this.field1449, -786, this.field1404);
                                this.field1404.method237(41372, this.field1404.field719 - var7);
                                this.field1449 = JString.method314(true, this.field1449);
                                this.field1449 = WordFilter.method399(this.field1449, (byte) 5);
                                this.method431(this.field1449, JString.method313(true, JString.method310((byte) 88, this.field1625)), 6, false);
                                if (this.field1576 == 2) {
                                    this.field1576 = 1;
                                    this.field1616 = true;
                                    this.field1404.method227(98, this.field1496);
                                    this.field1404.method228(this.field1408);
                                    this.field1404.method228(this.field1576);
                                    this.field1404.method228(this.field1275);
                                }
                            }
                            if (this.field1256 == 4 && this.field1359 < 100) {
                                long var8 = JString.method309(this.field1449);
                                this.method446((byte) 57, var8);
                            }
                            if (this.field1256 == 5 && this.field1359 > 0) {
                                long var10 = JString.method309(this.field1449);
                                this.method474(true, var10);
                            }
                        }
                    } else if (this.field1376) {
                        if (var2 >= 48 && var2 <= 57 && this.field1336.length() < 10) {
                            this.field1336 = this.field1336 + (char) var2;
                            this.field1236 = true;
                        }
                        if (var2 == 8 && this.field1336.length() > 0) {
                            this.field1336 = this.field1336.substring(0, this.field1336.length() - 1);
                            this.field1236 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1336.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1336);
                                } catch (Exception var17) {
                                }
                                this.field1404.method227(190, this.field1496);
                                this.field1404.method232(var12);
                            }
                            this.field1376 = false;
                            this.field1236 = true;
                        }
                    } else if (this.field1396 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1596.length() < 80) {
                            this.field1596 = this.field1596 + (char) var2;
                            this.field1236 = true;
                        }
                        if (var2 == 8 && this.field1596.length() > 0) {
                            this.field1596 = this.field1596.substring(0, this.field1596.length() - 1);
                            this.field1236 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1596.length() > 0) {
                            if (this.field1378 == 2) {
                                if (this.field1596.equals("::clientdrop")) {
                                    this.method429(0);
                                }
                                if (this.field1596.equals("::lag")) {
                                    this.method493((byte) 40);
                                }
                                if (this.field1596.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1525.method281(2, 0); ++var13) {
                                        this.field1525.method291(2, false, var13, (byte) 1);
                                    }
                                }
                            }
                            if (this.field1596.startsWith("::")) {
                                this.field1404.method227(76, this.field1496);
                                this.field1404.method228(this.field1596.length() - 1);
                                this.field1404.method235(this.field1596.substring(2));
                            } else {
                                byte var14 = 0;
                                if (this.field1596.startsWith("yellow:")) {
                                    var14 = 0;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                if (this.field1596.startsWith("red:")) {
                                    var14 = 1;
                                    this.field1596 = this.field1596.substring(4);
                                }
                                if (this.field1596.startsWith("green:")) {
                                    var14 = 2;
                                    this.field1596 = this.field1596.substring(6);
                                }
                                if (this.field1596.startsWith("cyan:")) {
                                    var14 = 3;
                                    this.field1596 = this.field1596.substring(5);
                                }
                                if (this.field1596.startsWith("purple:")) {
                                    var14 = 4;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                if (this.field1596.startsWith("white:")) {
                                    var14 = 5;
                                    this.field1596 = this.field1596.substring(6);
                                }
                                if (this.field1596.startsWith("flash1:")) {
                                    var14 = 6;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                if (this.field1596.startsWith("flash2:")) {
                                    var14 = 7;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                if (this.field1596.startsWith("flash3:")) {
                                    var14 = 8;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                if (this.field1596.startsWith("glow1:")) {
                                    var14 = 9;
                                    this.field1596 = this.field1596.substring(6);
                                }
                                if (this.field1596.startsWith("glow2:")) {
                                    var14 = 10;
                                    this.field1596 = this.field1596.substring(6);
                                }
                                if (this.field1596.startsWith("glow3:")) {
                                    var14 = 11;
                                    this.field1596 = this.field1596.substring(6);
                                }
                                byte var15 = 0;
                                if (this.field1596.startsWith("wave:")) {
                                    var15 = 1;
                                    this.field1596 = this.field1596.substring(5);
                                }
                                if (this.field1596.startsWith("scroll:")) {
                                    var15 = 2;
                                    this.field1596 = this.field1596.substring(7);
                                }
                                this.field1404.method227(171, this.field1496);
                                this.field1404.method228(0);
                                int var16 = this.field1404.field719;
                                this.field1404.method228(var14);
                                this.field1404.method228(var15);
                                WordPack.method317(this.field1596, -786, this.field1404);
                                this.field1404.method237(41372, this.field1404.field719 - var16);
                                this.field1596 = JString.method314(true, this.field1596);
                                this.field1596 = WordFilter.method399(this.field1596, (byte) 5);
                                field1428.field416 = this.field1596;
                                field1428.field418 = var14;
                                field1428.field419 = var15;
                                field1428.field417 = 150;
                                if (this.field1378 == 2) {
                                    this.method431(field1428.field416, "@cr2@" + field1428.field465, 2, false);
                                } else if (this.field1378 == 1) {
                                    this.method431(field1428.field416, "@cr1@" + field1428.field465, 2, false);
                                } else {
                                    this.method431(field1428.field416, field1428.field465, 2, false);
                                }
                                if (this.field1408 == 2) {
                                    this.field1408 = 3;
                                    this.field1616 = true;
                                    this.field1404.method227(98, this.field1496);
                                    this.field1404.method228(this.field1408);
                                    this.field1404.method228(this.field1576);
                                    this.field1404.method228(this.field1275);
                                }
                            }
                            this.field1596 = "";
                            this.field1236 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1345.length() < 12) {
                this.field1345 = this.field1345 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method509(int arg0) {
        int var2 = 98 / arg0;
        if (this.field1581 == 2) {
            this.method480(3, (this.field1348 - this.field1341 << 7) + this.field1351, this.field1349 * 2, (this.field1347 - this.field1340 << 7) + this.field1350);
            if (this.field1294 > -1 && field1588 % 20 < 10) {
                this.field1389[2].method198((byte) 9, this.field1294 - 12, this.field1295 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method510(int arg0, int arg1) {
        int var3 = VarpType.field1154[arg0].field1162;
        if (arg1 < this.field1223 || arg1 > this.field1223) {
            this.field1244 = -1;
        }
        if (var3 != 0) {
            int var4 = this.field1278[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method185(43504, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method185(43504, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method185(43504, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method185(43504, 0.6D);
                }
                ObjType.field1070.method116();
                this.field1483 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1460;
                if (var4 == 0) {
                    this.method534(0, this.field1460, false);
                    this.field1460 = true;
                }
                if (var4 == 1) {
                    this.method534(-400, this.field1460, false);
                    this.field1460 = true;
                }
                if (var4 == 2) {
                    this.method534(-800, this.field1460, false);
                    this.field1460 = true;
                }
                if (var4 == 3) {
                    this.method534(-1200, this.field1460, false);
                    this.field1460 = true;
                }
                if (var4 == 4) {
                    this.field1460 = false;
                }
                if (this.field1460 != var5 && !field1401) {
                    if (this.field1460) {
                        this.field1568 = this.field1472;
                        this.field1569 = false;
                        this.field1525.method288(2, this.field1568);
                    } else {
                        this.method503(0);
                    }
                    this.field1205 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1614 = true;
                    this.method463(0, 0);
                }
                if (var4 == 1) {
                    this.field1614 = true;
                    this.method463(-400, 0);
                }
                if (var4 == 2) {
                    this.field1614 = true;
                    this.method463(-800, 0);
                }
                if (var4 == 3) {
                    this.field1614 = true;
                    this.method463(-1200, 0);
                }
                if (var4 == 4) {
                    this.field1614 = false;
                }
            }
            if (var3 == 5) {
                this.field1522 = var4;
            }
            if (var3 == 6) {
                this.field1333 = var4;
            }
            if (var3 == 8) {
                this.field1346 = var4;
                this.field1236 = true;
            }
            if (var3 == 9) {
                this.field1551 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILgc;)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, NpcType arg4) {
        if (arg3 <= 0) {
            this.field1426 = !this.field1426;
        }
        if (this.field1564 < 400) {
            String var6 = arg4.field994;
            if (arg4.field1012 != 0) {
                var6 = var6 + method469(arg4.field1012, 31733, field1428.field471) + " (level-" + arg4.field1012 + ")";
            }
            if (this.field1497 == 1) {
                this.field1579[this.field1564] = "Use " + this.field1501 + " with @yel@" + var6;
                this.field1203[this.field1564] = 900;
                this.field1204[this.field1564] = arg2;
                this.field1201[this.field1564] = arg1;
                this.field1202[this.field1564] = arg0;
                ++this.field1564;
            } else {
                if (this.field1307 == 1) {
                    if ((this.field1309 & 2) == 2) {
                        this.field1579[this.field1564] = this.field1310 + " @yel@" + var6;
                        this.field1203[this.field1564] = 265;
                        this.field1204[this.field1564] = arg2;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg0;
                        ++this.field1564;
                        return;
                    }
                } else {
                    if (arg4.field1007 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg4.field1007[var7] != null && !arg4.field1007[var7].equalsIgnoreCase("attack")) {
                                this.field1579[this.field1564] = arg4.field1007[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1203[this.field1564] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1203[this.field1564] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1203[this.field1564] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1203[this.field1564] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1203[this.field1564] = 245;
                                }
                                this.field1204[this.field1564] = arg2;
                                this.field1201[this.field1564] = arg1;
                                this.field1202[this.field1564] = arg0;
                                ++this.field1564;
                            }
                        }
                    }
                    if (arg4.field1007 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg4.field1007[var8] != null && arg4.field1007[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg4.field1012 > field1428.field471) {
                                    var9 = 2000;
                                }
                                this.field1579[this.field1564] = arg4.field1007[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1203[this.field1564] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1203[this.field1564] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1203[this.field1564] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1203[this.field1564] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1203[this.field1564] = var9 + 245;
                                }
                                this.field1204[this.field1564] = arg2;
                                this.field1201[this.field1564] = arg1;
                                this.field1202[this.field1564] = arg0;
                                ++this.field1564;
                            }
                        }
                    }
                    this.field1579[this.field1564] = "Examine @yel@" + var6;
                    this.field1203[this.field1564] = 1607;
                    this.field1204[this.field1564] = arg2;
                    this.field1201[this.field1564] = arg1;
                    this.field1202[this.field1564] = arg0;
                    ++this.field1564;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method512(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1376) {
                this.field1376 = false;
                this.field1236 = true;
            }
            int var3 = this.field1201[arg0];
            int var4 = this.field1202[arg0];
            int var5 = this.field1203[arg0];
            int var6 = this.field1204[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 1501) {
                field1542 += this.field1341;
                if (field1542 >= 92) {
                    this.field1404.method227(177, this.field1496);
                    this.field1404.method232(0);
                }
                this.method436(243, var3, var6, -841, var4);
            }
            if (var5 == 34) {
                String var7 = this.field1579[arg0];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    this.method450(true);
                    this.field1345 = var7.substring(var8 + 5).trim();
                    this.field1451 = false;
                    for (int var9 = 0; var9 < Component.field73.length; ++var9) {
                        if (Component.field73[var9] != null && Component.field73[var9].field82 == 600) {
                            this.field1192 = this.field1273 = Component.field73[var9].field79;
                            break;
                        }
                    }
                }
            }
            if (var5 == 367) {
                PlayerEntity var10 = this.field1285[var6];
                if (var10 != null) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var10.field453[0], 0, var10.field454[0], 1, field1428.field453[0]);
                    this.field1600 = super.field30;
                    this.field1601 = super.field31;
                    this.field1603 = 2;
                    this.field1602 = 0;
                    this.field1404.method227(48, this.field1496);
                    this.field1404.method229(var6);
                    this.field1404.method229(this.field1500);
                    this.field1404.method229(this.field1498);
                    this.field1404.method229(this.field1499);
                }
            }
            if (var5 == 951) {
                Component var11 = Component.field73[var4];
                boolean var12 = true;
                if (var11.field82 > 0) {
                    var12 = this.method532(var11, (byte) 7);
                }
                if (var12) {
                    this.field1404.method227(39, this.field1496);
                    this.field1404.method229(var4);
                }
            }
            if (var5 == 217) {
                boolean var13 = this.method515(false, 0, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 0, field1428.field453[0]);
                if (!var13) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 1, field1428.field453[0]);
                }
                this.field1600 = super.field30;
                this.field1601 = super.field31;
                this.field1603 = 2;
                this.field1602 = 0;
                this.field1404.method227(111, this.field1496);
                this.field1404.method229(this.field1340 + var3);
                this.field1404.method229(this.field1341 + var4);
                this.field1404.method229(var6);
                this.field1404.method229(this.field1500);
                this.field1404.method229(this.field1498);
                this.field1404.method229(this.field1499);
            }
            if (var5 == 450 && this.method436(106, var3, var6, -841, var4)) {
                this.field1404.method229(this.field1500);
                this.field1404.method229(this.field1498);
                this.field1404.method229(this.field1499);
            }
            if (var5 == 265) {
                NpcEntity var15 = this.field1438[var6];
                if (var15 != null) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var15.field453[0], 0, var15.field454[0], 1, field1428.field453[0]);
                    this.field1600 = super.field30;
                    this.field1601 = super.field31;
                    this.field1603 = 2;
                    this.field1602 = 0;
                    this.field1404.method227(101, this.field1496);
                    this.field1404.method229(var6);
                    this.field1404.method229(this.field1308);
                }
            }
            if (var5 == 364) {
                this.method436(19, var3, var6, -841, var4);
            }
            if (var5 == 55 && this.method436(182, var3, var6, -841, var4)) {
                this.field1404.method229(this.field1308);
            }
            if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                boolean var16 = this.method515(false, 0, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 0, field1428.field453[0]);
                if (!var16) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 1, field1428.field453[0]);
                }
                this.field1600 = super.field30;
                this.field1601 = super.field31;
                this.field1603 = 2;
                this.field1602 = 0;
                if (var5 == 99) {
                    this.field1404.method227(27, this.field1496);
                }
                if (var5 == 993) {
                    this.field1404.method227(110, this.field1496);
                }
                if (var5 == 224) {
                    this.field1404.method227(231, this.field1496);
                }
                if (var5 == 877) {
                    this.field1404.method227(225, this.field1496);
                }
                if (var5 == 746) {
                    this.field1404.method227(17, this.field1496);
                }
                this.field1404.method229(this.field1340 + var3);
                this.field1404.method229(this.field1341 + var4);
                this.field1404.method229(var6);
            }
            if (var5 == 581) {
                if ((var6 & 3) == 0) {
                    ++field1506;
                }
                if (field1506 >= 99) {
                    this.field1404.method227(47, this.field1496);
                    this.field1404.method232(0);
                }
                this.method436(55, var3, var6, -841, var4);
            }
            if (var5 == 679) {
                String var18 = this.field1579[arg0];
                int var19 = var18.indexOf("@whi@");
                if (var19 != -1) {
                    long var20 = JString.method309(var18.substring(var19 + 5).trim());
                    int var22 = -1;
                    for (int var23 = 0; var23 < this.field1418; ++var23) {
                        if (this.field1208[var23] == var20) {
                            var22 = var23;
                            break;
                        }
                    }
                    if (var22 != -1 && this.field1470[var22] > 0) {
                        this.field1236 = true;
                        this.field1376 = false;
                        this.field1626 = true;
                        this.field1449 = "";
                        this.field1256 = 3;
                        this.field1625 = this.field1208[var22];
                        this.field1213 = "Enter message to send to " + this.field1556[var22];
                    }
                }
            }
            if (var5 == 960) {
                this.field1404.method227(39, this.field1496);
                this.field1404.method229(var4);
                Component var24 = Component.field73[var4];
                if (var24.field88 != null && var24.field88[0][0] == 5) {
                    int var25 = var24.field88[0][1];
                    if (this.field1278[var25] != var24.field90[0]) {
                        this.field1278[var25] = var24.field90[0];
                        this.method510(var25, 7);
                        this.field1221 = true;
                    }
                }
            }
            if (var5 == 1175) {
                int var26 = var6 >> 14 & 32767;
                LocType var27 = LocType.method333(var26);
                String var28;
                if (var27.field950 != null) {
                    var28 = new String(var27.field950);
                } else {
                    var28 = "It's a " + var27.field949 + ".";
                }
                this.method431(var28, "", 0, false);
            }
            if (var5 == 881) {
                this.field1404.method227(58, this.field1496);
                this.field1404.method229(var6);
                this.field1404.method229(var3);
                this.field1404.method229(var4);
                this.field1404.method229(this.field1500);
                this.field1404.method229(this.field1498);
                this.field1404.method229(this.field1499);
                this.field1297 = 0;
                this.field1298 = var4;
                this.field1299 = var3;
                this.field1300 = 2;
                if (Component.field73[var4].field79 == this.field1273) {
                    this.field1300 = 1;
                }
                if (Component.field73[var4].field79 == this.field1396) {
                    this.field1300 = 3;
                }
            }
            if (var5 == 44 && !this.field1613) {
                this.field1404.method227(11, this.field1496);
                this.field1404.method229(var4);
                this.field1613 = true;
            }
            if (var5 == 285) {
                this.method436(238, var3, var6, -841, var4);
            }
            if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                String var29 = this.field1579[arg0];
                int var30 = var29.indexOf("@whi@");
                if (var30 != -1) {
                    long var31 = JString.method309(var29.substring(var30 + 5).trim());
                    if (var5 == 406) {
                        this.method472(true, var31);
                    }
                    if (var5 == 436) {
                        this.method446((byte) 57, var31);
                    }
                    if (var5 == 557) {
                        this.method504(var31, false);
                    }
                    if (var5 == 556) {
                        this.method474(true, var31);
                    }
                }
            }
            if (var5 == 947) {
                this.method450(true);
            }
            if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                if (var5 == 347) {
                    this.field1404.method227(133, this.field1496);
                }
                if (var5 == 422) {
                    this.field1404.method227(221, this.field1496);
                }
                if (var5 == 478) {
                    if ((var3 & 3) == 0) {
                        ++field1219;
                    }
                    if (field1219 >= 90) {
                        this.field1404.method227(7, this.field1496);
                    }
                    this.field1404.method227(6, this.field1496);
                }
                if (var5 == 405) {
                    field1606 += var6;
                    if (field1606 >= 97) {
                        this.field1404.method227(37, this.field1496);
                        this.field1404.method231(14953816);
                    }
                    this.field1404.method227(228, this.field1496);
                }
                if (var5 == 38) {
                    this.field1404.method227(166, this.field1496);
                }
                this.field1404.method229(var6);
                this.field1404.method229(var3);
                this.field1404.method229(var4);
                this.field1297 = 0;
                this.field1298 = var4;
                this.field1299 = var3;
                this.field1300 = 2;
                if (Component.field73[var4].field79 == this.field1273) {
                    this.field1300 = 1;
                }
                if (Component.field73[var4].field79 == this.field1396) {
                    this.field1300 = 3;
                }
            }
            if (var5 == 965) {
                boolean var33 = this.method515(false, 0, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 0, field1428.field453[0]);
                if (!var33) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var3, 0, var4, 1, field1428.field453[0]);
                }
                this.field1600 = super.field30;
                this.field1601 = super.field31;
                this.field1603 = 2;
                this.field1602 = 0;
                this.field1404.method227(25, this.field1496);
                this.field1404.method229(this.field1340 + var3);
                this.field1404.method229(this.field1341 + var4);
                this.field1404.method229(var6);
                this.field1404.method229(this.field1308);
            }
            if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                if (var5 == 415) {
                    if ((var4 & 3) == 0) {
                        ++field1622;
                    }
                    if (field1622 >= 55) {
                        this.field1404.method227(50, this.field1496);
                        this.field1404.method232(0);
                    }
                    this.field1404.method227(212, this.field1496);
                }
                if (var5 == 22) {
                    this.field1404.method227(158, this.field1496);
                }
                if (var5 == 596) {
                    this.field1404.method227(193, this.field1496);
                }
                if (var5 == 892) {
                    if ((var3 & 3) == 0) {
                        ++field1558;
                    }
                    if (field1558 >= 130) {
                        this.field1404.method227(169, this.field1496);
                        this.field1404.method228(177);
                    }
                    this.field1404.method227(204, this.field1496);
                }
                if (var5 == 602) {
                    this.field1404.method227(153, this.field1496);
                }
                this.field1404.method229(var6);
                this.field1404.method229(var3);
                this.field1404.method229(var4);
                this.field1297 = 0;
                this.field1298 = var4;
                this.field1299 = var3;
                this.field1300 = 2;
                if (Component.field73[var4].field79 == this.field1273) {
                    this.field1300 = 1;
                }
                if (Component.field73[var4].field79 == this.field1396) {
                    this.field1300 = 3;
                }
            }
            if (var5 == 465) {
                this.field1404.method227(39, this.field1496);
                this.field1404.method229(var4);
                Component var35 = Component.field73[var4];
                if (var35.field88 != null && var35.field88[0][0] == 5) {
                    int var36 = var35.field88[0][1];
                    this.field1278[var36] = 1 - this.field1278[var36];
                    this.method510(var36, 7);
                    this.field1221 = true;
                }
            }
            if (var5 == 900) {
                NpcEntity var37 = this.field1438[var6];
                if (var37 != null) {
                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var37.field453[0], 0, var37.field454[0], 1, field1428.field453[0]);
                    this.field1600 = super.field30;
                    this.field1601 = super.field31;
                    this.field1603 = 2;
                    this.field1602 = 0;
                    this.field1404.method227(52, this.field1496);
                    this.field1404.method229(var6);
                    this.field1404.method229(this.field1500);
                    this.field1404.method229(this.field1498);
                    this.field1404.method229(this.field1499);
                }
            }
            if (var5 == 188) {
                this.field1497 = 1;
                this.field1498 = var3;
                this.field1499 = var4;
                this.field1500 = var6;
                this.field1501 = ObjType.method348(var6).field1031;
                this.field1307 = 0;
                this.field1221 = true;
            } else {
                if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                    NpcEntity var38 = this.field1438[var6];
                    if (var38 != null) {
                        this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var38.field453[0], 0, var38.field454[0], 1, field1428.field453[0]);
                        this.field1600 = super.field30;
                        this.field1601 = super.field31;
                        this.field1603 = 2;
                        this.field1602 = 0;
                        if (var5 == 963) {
                            this.field1404.method227(229, this.field1496);
                        }
                        if (var5 == 6) {
                            if ((var6 & 3) == 0) {
                                ++field1612;
                            }
                            if (field1612 >= 124) {
                                this.field1404.method227(218, this.field1496);
                                this.field1404.method232(0);
                            }
                            this.field1404.method227(132, this.field1496);
                        }
                        if (var5 == 245) {
                            if ((var6 & 3) == 0) {
                                ++field1553;
                            }
                            if (field1553 >= 85) {
                                this.field1404.method227(34, this.field1496);
                                this.field1404.method229(39596);
                            }
                            this.field1404.method227(102, this.field1496);
                        }
                        if (var5 == 728) {
                            this.field1404.method227(222, this.field1496);
                        }
                        if (var5 == 542) {
                            this.field1404.method227(84, this.field1496);
                        }
                        this.field1404.method229(var6);
                    }
                }
                if (var5 == 391) {
                    this.field1404.method227(143, this.field1496);
                    this.field1404.method229(var6);
                    this.field1404.method229(var3);
                    this.field1404.method229(var4);
                    this.field1404.method229(this.field1308);
                    this.field1297 = 0;
                    this.field1298 = var4;
                    this.field1299 = var3;
                    this.field1300 = 2;
                    if (Component.field73[var4].field79 == this.field1273) {
                        this.field1300 = 1;
                    }
                    if (Component.field73[var4].field79 == this.field1396) {
                        this.field1300 = 3;
                    }
                }
                if (var5 == 930) {
                    Component var39 = Component.field73[var4];
                    this.field1307 = 1;
                    this.field1308 = var4;
                    this.field1309 = var39.field131;
                    this.field1497 = 0;
                    this.field1221 = true;
                    String var40 = var39.field129;
                    if (var40.indexOf(" ") != -1) {
                        var40 = var40.substring(0, var40.indexOf(" "));
                    }
                    String var41 = var39.field129;
                    if (var41.indexOf(" ") != -1) {
                        var41 = var41.substring(var41.indexOf(" ") + 1);
                    }
                    this.field1310 = var40 + " " + var39.field130 + " " + var41;
                    if (this.field1309 == 16) {
                        this.field1221 = true;
                        this.field1225 = 3;
                        this.field1384 = true;
                    }
                } else {
                    if (var5 == 660) {
                        if (!this.field1356) {
                            this.field1258.method101((byte) 38, super.field31 - 4, super.field30 - 4);
                        } else {
                            this.field1258.method101((byte) 38, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 903 || var5 == 363) {
                        String var42 = this.field1579[arg0];
                        int var43 = var42.indexOf("@whi@");
                        if (var43 != -1) {
                            String var44 = var42.substring(var43 + 5).trim();
                            String var45 = JString.method313(true, JString.method310((byte) 88, JString.method309(var44)));
                            boolean var46 = false;
                            for (int var47 = 0; var47 < this.field1286; ++var47) {
                                PlayerEntity var48 = this.field1285[this.field1287[var47]];
                                if (var48 != null && var48.field465 != null && var48.field465.equalsIgnoreCase(var45)) {
                                    this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var48.field453[0], 0, var48.field454[0], 1, field1428.field453[0]);
                                    if (var5 == 903) {
                                        this.field1404.method227(43, this.field1496);
                                    }
                                    if (var5 == 363) {
                                        this.field1404.method227(211, this.field1496);
                                    }
                                    this.field1404.method229(this.field1287[var47]);
                                    var46 = true;
                                    break;
                                }
                            }
                            if (!var46) {
                                this.method431("Unable to find " + var45, "", 0, false);
                            }
                        }
                    }
                    if (var5 == 1607) {
                        NpcEntity var49 = this.field1438[var6];
                        if (var49 != null) {
                            String var50;
                            if (var49.field461.field995 != null) {
                                var50 = new String(var49.field461.field995);
                            } else {
                                var50 = "It's a " + var49.field461.field994 + ".";
                            }
                            this.method431(var50, "", 0, false);
                        }
                    }
                    if (var5 == 651) {
                        PlayerEntity var51 = this.field1285[var6];
                        if (var51 != null) {
                            this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var51.field453[0], 0, var51.field454[0], 1, field1428.field453[0]);
                            this.field1600 = super.field30;
                            this.field1601 = super.field31;
                            this.field1603 = 2;
                            this.field1602 = 0;
                            this.field1404.method227(73, this.field1496);
                            this.field1404.method229(var6);
                            this.field1404.method229(this.field1308);
                        }
                    }
                    if (var5 == 1102) {
                        ObjType var52 = ObjType.method348(var6);
                        String var53;
                        if (var52.field1032 != null) {
                            var53 = new String(var52.field1032);
                        } else {
                            var53 = "It's a " + var52.field1031 + ".";
                        }
                        this.method431(var53, "", 0, false);
                    }
                    if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                        PlayerEntity var54 = this.field1285[var6];
                        if (var54 != null) {
                            this.method515(false, 1, field1428.field454[0], 0, 2, false, 0, var54.field453[0], 0, var54.field454[0], 1, field1428.field453[0]);
                            this.field1600 = super.field30;
                            this.field1601 = super.field31;
                            this.field1603 = 2;
                            this.field1602 = 0;
                            if (var5 == 1544) {
                                this.field1404.method227(64, this.field1496);
                            }
                            if (var5 == 1373) {
                                this.field1404.method227(43, this.field1496);
                            }
                            if (var5 == 151) {
                                ++field1386;
                                if (field1386 >= 90) {
                                    this.field1404.method227(100, this.field1496);
                                    this.field1404.method229(31114);
                                }
                                this.field1404.method227(219, this.field1496);
                            }
                            if (var5 == 1101) {
                                this.field1404.method227(211, this.field1496);
                            }
                            this.field1404.method229(var6);
                        }
                    }
                    if (var5 == 504) {
                        this.method436(38, var3, var6, -841, var4);
                    }
                    if (var5 == 1773) {
                        ObjType var55 = ObjType.method348(var6);
                        String var56;
                        if (var4 >= 100000) {
                            var56 = var4 + " x " + var55.field1031;
                        } else if (var55.field1032 != null) {
                            var56 = new String(var55.field1032);
                        } else {
                            var56 = "It's a " + var55.field1031 + ".";
                        }
                        this.method431(var56, "", 0, false);
                    }
                    this.field1497 = 0;
                    this.field1307 = 0;
                    if (arg1 == 0) {
                        this.field1221 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    private final void method513(int arg0) {
        LocSpawned var2 = (LocSpawned) this.field1190.method257();
        while (arg0 >= 0) {
            field1282 = !field1282;
        }
        while (var2 != null) {
            if (var2.field747 == -1) {
                var2.field746 = 0;
                this.method452((byte) -102, var2);
            } else {
                var2.method119();
            }
            var2 = (LocSpawned) this.field1190.method259(-976);
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method514(int arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field1428.field404 + this.field1485;
            int var4 = field1428.field405 + this.field1266;
            if (this.field1475 - var3 < -500 || this.field1475 - var3 > 500 || this.field1476 - var4 < -500 || this.field1476 - var4 > 500) {
                this.field1475 = var3;
                this.field1476 = var4;
            }
            if (this.field1475 != var3) {
                this.field1475 += (var3 - this.field1475) / 16;
            }
            if (this.field1476 != var4) {
                this.field1476 += (var4 - this.field1476) / 16;
            }
            if (super.field33[1] == 1) {
                this.field1561 += (-24 - this.field1561) / 2;
            } else if (super.field33[2] == 1) {
                this.field1561 += (24 - this.field1561) / 2;
            } else {
                this.field1561 /= 2;
            }
            if (super.field33[3] == 1) {
                this.field1562 += (12 - this.field1562) / 2;
            } else if (super.field33[4] == 1) {
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
            int var5 = this.field1475 >> 7;
            int var6 = this.field1476 >> 7;
            int var7 = this.method473(false, this.field1476, this.field1479, this.field1475);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field1479;
                        if (var11 < 3 && (this.field1281[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field1409[var11][var9][var10];
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
            if (var13 > this.field1226) {
                this.field1226 += (var13 - this.field1226) / 24;
            } else if (var13 < this.field1226) {
                this.field1226 += (var13 - this.field1226) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field1428.field404 + "," + field1428.field405 + "," + this.field1475 + "," + this.field1476 + "," + this.field1589 + "," + this.field1590 + "," + this.field1340 + "," + this.field1341);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIZIIIIII)Z")
    public final boolean method515(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1271[var15][var35] = 0;
                this.field1239[var15][var35] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg2;
        this.field1271[arg11][arg2] = 99;
        if (arg0) {
            field1374 = -379;
        }
        this.field1239[arg11][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1511[var18] = arg11;
        int var36 = var18 + 1;
        this.field1512[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field1511.length;
        int[][] var22 = this.field1554[this.field1479].field1083;
        while (var36 != var19) {
            var16 = this.field1511[var19];
            var17 = this.field1512[var19];
            var19 = (var19 + 1) % var21;
            if (arg7 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && this.field1554[this.field1479].method368(arg7, false, arg8 - 1, arg9, var17, var16, arg6)) {
                    var20 = true;
                    break;
                }
                if (arg8 < 10 && this.field1554[this.field1479].method369(var17, var16, arg7, true, arg8 - 1, arg6, arg9)) {
                    var20 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg10 != 0 && this.field1554[this.field1479].method370(arg1, var16, arg7, arg9, arg3, var17, (byte) 6, arg10)) {
                var20 = true;
                break;
            }
            int var34 = this.field1239[var16][var17] + 1;
            if (var16 > 0 && this.field1271[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1511[var36] = var16 - 1;
                this.field1512[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 - 1][var17] = 2;
                this.field1239[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1271[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1511[var36] = var16 + 1;
                this.field1512[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 + 1][var17] = 8;
                this.field1239[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1271[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1511[var36] = var16;
                this.field1512[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16][var17 - 1] = 1;
                this.field1239[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1271[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1511[var36] = var16;
                this.field1512[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16][var17 + 1] = 4;
                this.field1239[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1271[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1511[var36] = var16 - 1;
                this.field1512[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 - 1][var17 - 1] = 3;
                this.field1239[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1271[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1511[var36] = var16 + 1;
                this.field1512[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 + 1][var17 - 1] = 9;
                this.field1239[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1271[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1511[var36] = var16 - 1;
                this.field1512[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 - 1][var17 + 1] = 6;
                this.field1239[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1271[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1511[var36] = var16 + 1;
                this.field1512[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1271[var16 + 1][var17 + 1] = 12;
                this.field1239[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1544 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg7 - var24; var25 <= arg7 + var24; ++var25) {
                        for (int var26 = arg9 - var24; var26 <= arg9 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1239[var25][var26] < var23) {
                                var23 = this.field1239[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1544 = 1;
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
        this.field1511[var27] = var16;
        int var37 = var27 + 1;
        this.field1512[var27] = var17;
        int var28;
        int var29 = var28 = this.field1271[var16][var17];
        while (arg11 != var16 || arg2 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1511[var37] = var16;
                this.field1512[var37++] = var17;
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
            var29 = this.field1271[var16][var17];
        }
        if (var37 <= 0) {
            if (arg4 == 1) {
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
            int var31 = this.field1511[var37];
            int var32 = this.field1512[var37];
            if (arg4 == 0) {
                this.field1404.method227(63, this.field1496);
                this.field1404.method228(var30 + var30 + 3);
            }
            if (arg4 == 1) {
                this.field1404.method227(56, this.field1496);
                this.field1404.method228(var30 + var30 + 3 + 14);
            }
            if (arg4 == 2) {
                this.field1404.method227(167, this.field1496);
                this.field1404.method228(var30 + var30 + 3);
            }
            if (super.field33[5] == 1) {
                this.field1404.method228(1);
            } else {
                this.field1404.method228(0);
            }
            this.field1404.method229(this.field1340 + var31);
            this.field1404.method229(this.field1341 + var32);
            this.field1461 = this.field1511[0];
            this.field1462 = this.field1512[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1404.method228(this.field1511[var37] - var31);
                this.field1404.method228(this.field1512[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method516(Component arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else if (arg0.field89 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field89.length; ++var3) {
                int var4 = this.method526(arg0, 52, var3);
                int var5 = arg0.field90[var3];
                if (arg0.field89[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field89[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field89[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method517(int arg0) {
        this.method540(true);
        if (this.field1206 != arg0) {
            this.field1404.method228(143);
        }
        this.field1366.method267(212);
        this.field1362.method211((byte) 9, 0, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1414 == 0) {
            int var4 = var3 / 2 + 80;
            this.field1441.method214(var2 / 2, true, this.field1525.field841, true, var4, 7711145);
            int var5 = var3 / 2 - 20;
            this.field1443.method214(var2 / 2, true, "Welcome to RuneScape", true, var5, 16776960);
            int var16 = var5 + 30;
            int var6 = var2 / 2 - 80;
            int var7 = var3 / 2 + 20;
            this.field1363.method211((byte) 9, var6 - 73, var7 - 20);
            this.field1443.method214(var6, true, "New user", true, var7 + 5, 16777215);
            int var8 = var2 / 2 + 80;
            this.field1363.method211((byte) 9, var8 - 73, var7 - 20);
            this.field1443.method214(var8, true, "Existing User", true, var7 + 5, 16777215);
        }
        if (this.field1414 == 2) {
            int var9 = var3 / 2 - 40;
            if (this.field1508.length() > 0) {
                this.field1443.method214(var2 / 2, true, this.field1508, true, var9 - 15, 16776960);
                this.field1443.method214(var2 / 2, true, this.field1509, true, var9, 16776960);
                var9 += 30;
            } else {
                this.field1443.method214(var2 / 2, true, this.field1509, true, var9 - 7, 16776960);
                var9 += 30;
            }
            this.field1443.method218(16777215, var2 / 2 - 90, true, false, var9, "Username: " + this.field1577 + (this.field1526 == 0 & field1588 % 40 < 20 ? "@yel@|" : ""));
            var9 += 15;
            this.field1443.method218(16777215, var2 / 2 - 88, true, false, var9, "Password: " + JString.method315(false, this.field1578) + (this.field1526 == 1 & field1588 % 40 < 20 ? "@yel@|" : ""));
            var9 += 15;
            int var10 = var2 / 2 - 80;
            int var11 = var3 / 2 + 50;
            this.field1363.method211((byte) 9, var10 - 73, var11 - 20);
            this.field1443.method214(var10, true, "Login", true, var11 + 5, 16777215);
            int var12 = var2 / 2 + 80;
            this.field1363.method211((byte) 9, var12 - 73, var11 - 20);
            this.field1443.method214(var12, true, "Cancel", true, var11 + 5, 16777215);
        }
        if (this.field1414 == 3) {
            this.field1443.method214(var2 / 2, true, "Create a free account", true, var3 / 2 - 60, 16776960);
            int var13 = var3 / 2 - 35;
            this.field1443.method214(var2 / 2, true, "To create a new account you need to", true, var13, 16777215);
            int var17 = var13 + 15;
            this.field1443.method214(var2 / 2, true, "go back to the main RuneScape webpage", true, var17, 16777215);
            int var18 = var17 + 15;
            this.field1443.method214(var2 / 2, true, "and choose the red 'create account'", true, var18, 16777215);
            int var19 = var18 + 15;
            this.field1443.method214(var2 / 2, true, "button at the top right of that page.", true, var19, 16777215);
            int var20 = var19 + 15;
            int var14 = var2 / 2;
            int var15 = var3 / 2 + 50;
            this.field1363.method211((byte) 9, var14 - 73, var15 - 20);
            this.field1443.method214(var14, true, "Cancel", true, var15 + 5, 16777215);
        }
        this.field1366.method268(super.field15, 171, (byte) 55, 202);
        if (this.field1483) {
            this.field1483 = false;
            this.field1364.method268(super.field15, 0, (byte) 55, 128);
            this.field1365.method268(super.field15, 371, (byte) 55, 202);
            this.field1369.method268(super.field15, 265, (byte) 55, 0);
            this.field1370.method268(super.field15, 265, (byte) 55, 562);
            this.field1371.method268(super.field15, 171, (byte) 55, 128);
            this.field1372.method268(super.field15, 171, (byte) 55, 562);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLmb;)V")
    private final void method518(int arg0, boolean arg1, Packet arg2) {
        if (arg1) {
            field1282 = !field1282;
        }
        while (arg2.field720 + 21 < arg0 * 8) {
            int var4 = arg2.method249(9, 13);
            if (var4 == 8191) {
                break;
            }
            if (this.field1438[var4] == null) {
                this.field1438[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1438[var4];
            this.field1440[this.field1439++] = var4;
            var5.field449 = field1588;
            var5.field461 = NpcType.method342(arg2.method249(9, 11));
            var5.field408 = var5.field461.field996;
            var5.field411 = var5.field461.field1000;
            var5.field412 = var5.field461.field1001;
            var5.field413 = var5.field461.field1002;
            var5.field414 = var5.field461.field1003;
            var5.field409 = var5.field461.field999;
            int var6 = arg2.method249(9, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method249(9, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method123(false, field1428.field453[0] + var6, field1428.field454[0] + var7, this.field1523);
            int var8 = arg2.method249(9, 1);
            if (var8 == 1) {
                this.field1289[this.field1288++] = var4;
            }
        }
        arg2.method250(0);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method519(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1244 = this.field1484.method238();
        }
        if (arg0 < 999999999) {
            return String.valueOf(arg0);
        } else {
            return "*";
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)I")
    public final int method520(int arg0) {
        int var2 = 3;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1640 < 310) {
            int var4 = this.field1637 >> 7;
            int var5 = this.field1639 >> 7;
            int var6 = field1428.field404 >> 7;
            int var7 = field1428.field405 >> 7;
            if ((this.field1281[this.field1479][var4][var5] & 4) != 0) {
                var2 = this.field1479;
            }
            int var8;
            if (var6 > var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            int var9;
            if (var7 > var5) {
                var9 = var7 - var5;
            } else {
                var9 = var5 - var7;
            }
            if (var8 > var9) {
                int var10 = var9 * 65536 / var8;
                int var11 = 32768;
                while (var4 != var6) {
                    if (var4 < var6) {
                        ++var4;
                    } else if (var4 > var6) {
                        --var4;
                    }
                    if ((this.field1281[this.field1479][var4][var5] & 4) != 0) {
                        var2 = this.field1479;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field1281[this.field1479][var4][var5] & 4) != 0) {
                            var2 = this.field1479;
                        }
                    }
                }
            } else {
                int var12 = var8 * 65536 / var9;
                int var13 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        ++var5;
                    } else if (var5 > var7) {
                        --var5;
                    }
                    if ((this.field1281[this.field1479][var4][var5] & 4) != 0) {
                        var2 = this.field1479;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1281[this.field1479][var4][var5] & 4) != 0) {
                            var2 = this.field1479;
                        }
                    }
                }
            }
        }
        if ((this.field1281[this.field1479][field1428.field404 >> 7][field1428.field405 >> 7] & 4) != 0) {
            var2 = this.field1479;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)I")
    public final int method521(int arg0) {
        if (arg0 != 8) {
            return 0;
        } else {
            int var2 = this.method473(false, this.field1639, this.field1479, this.field1637);
            return var2 - this.field1638 < 800 && (this.field1281[this.field1479][this.field1637 >> 7][this.field1639 >> 7] & 4) != 0 ? this.field1479 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;IILbb;)V")
    private final void method522(int arg0, Packet arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg2 >= 0) {
            field1282 = !field1282;
        }
        if ((arg0 & 1) == 1) {
            int var6 = arg1.method238();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet((byte) -109, var7);
            arg1.method247(var7, 0, 188, var6);
            this.field1290[arg3] = var8;
            arg4.method129(var8, -323);
        }
        if ((arg0 & 2) == 2) {
            int var9 = arg1.method240();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field432 == var9) {
                arg4.field436 = 0;
            }
            int var10 = arg1.method238();
            if (arg4.field432 == var9 && var9 != -1) {
                int var11 = SeqType.field1120[var9].field1134;
                if (var11 == 1) {
                    arg4.field433 = 0;
                    arg4.field434 = 0;
                    arg4.field435 = var10;
                    arg4.field436 = 0;
                }
                if (var11 == 2) {
                    arg4.field436 = 0;
                }
            } else if (var9 == -1 || arg4.field432 == -1 || SeqType.field1120[var9].field1128 >= SeqType.field1120[arg4.field432].field1128) {
                arg4.field432 = var9;
                arg4.field433 = 0;
                arg4.field434 = 0;
                arg4.field435 = var10;
                arg4.field436 = 0;
                arg4.field457 = arg4.field452;
            }
        }
        if ((arg0 & 4) == 4) {
            arg4.field426 = arg1.method240();
            if (arg4.field426 == 65535) {
                arg4.field426 = -1;
            }
        }
        if ((arg0 & 8) == 8) {
            arg4.field416 = arg1.method245();
            arg4.field418 = 0;
            arg4.field419 = 0;
            arg4.field417 = 150;
            this.method431(arg4.field416, arg4.field465, 2, false);
        }
        if ((arg0 & 16) == 16) {
            int var12 = arg1.method238();
            int var13 = arg1.method238();
            arg4.method127(var13, 0, var12);
            arg4.field423 = field1588 + 300;
            arg4.field424 = arg1.method238();
            arg4.field425 = arg1.method238();
        }
        if ((arg0 & 32) == 32) {
            arg4.field427 = arg1.method240();
            arg4.field428 = arg1.method240();
        }
        if ((arg0 & 64) == 64) {
            int var14 = arg1.method240();
            int var15 = arg1.method238();
            int var16 = arg1.method238();
            int var17 = arg1.field719;
            if (arg4.field465 != null && arg4.field466) {
                long var18 = JString.method309(arg4.field465);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1359; ++var21) {
                        if (this.field1339[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1360 == 0) {
                    try {
                        String var22 = WordPack.method316(var16, 355, arg1);
                        String var23 = WordFilter.method399(var22, (byte) 5);
                        arg4.field416 = var23;
                        arg4.field418 = var14 >> 8;
                        arg4.field419 = var14 & 255;
                        arg4.field417 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method431(var23, "@cr1@" + arg4.field465, 1, false);
                            } else {
                                this.method431(var23, arg4.field465, 2, false);
                            }
                        } else {
                            this.method431(var23, "@cr2@" + arg4.field465, 1, false);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field719 = var16 + var17;
        }
        if ((arg0 & 256) == 256) {
            arg4.field437 = arg1.method240();
            int var25 = arg1.method243();
            arg4.field441 = var25 >> 16;
            arg4.field440 = (var25 & 65535) + field1588;
            arg4.field438 = 0;
            arg4.field439 = 0;
            if (arg4.field440 > field1588) {
                arg4.field438 = -1;
            }
            if (arg4.field437 == 65535) {
                arg4.field437 = -1;
            }
        }
        if ((arg0 & 512) == 512) {
            arg4.field442 = arg1.method238();
            arg4.field444 = arg1.method238();
            arg4.field443 = arg1.method238();
            arg4.field445 = arg1.method238();
            arg4.field446 = arg1.method240() + field1588;
            arg4.field447 = arg1.method240() + field1588;
            arg4.field448 = arg1.method238();
            arg4.method125(2);
        }
        if ((arg0 & 1024) == 1024) {
            int var26 = arg1.method238();
            int var27 = arg1.method238();
            arg4.method127(var27, 0, var26);
            arg4.field423 = field1588 + 300;
            arg4.field424 = arg1.method238();
            arg4.field425 = arg1.method238();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIILd;I)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, Component arg5, int arg6) {
        if (arg5.field80 == 0 && arg5.field95 != null && !arg5.field94) {
            if (arg0 >= arg4 && arg2 >= arg1 && arg0 <= arg5.field83 + arg4 && arg2 <= arg5.field84 + arg1) {
                int var8 = arg5.field95.length;
                if (arg3 == 7) {
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg5.field96[var9] + arg4;
                        int var11 = arg5.field97[var9] + arg1 - arg6;
                        Component var12 = Component.field73[arg5.field95[var9]];
                        int var13 = var12.field86 + var10;
                        int var14 = var12.field87 + var11;
                        if ((var12.field91 >= 0 || var12.field117 != 0) && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                            if (var12.field91 >= 0) {
                                this.field1296 = var12.field91;
                            } else {
                                this.field1296 = var12.field78;
                            }
                        }
                        if (var12.field80 == 0) {
                            this.method523(arg0, var14, arg2, 7, var13, var12, var12.field93);
                            if (var12.field92 > var12.field84) {
                                this.method542(var12, var14, true, arg2, var12.field84, var12.field92, arg0, var12.field83 + var13, -960);
                            }
                        } else {
                            if (var12.field81 == 1 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                boolean var15 = false;
                                if (var12.field82 != 0) {
                                    var15 = this.method558(this.field1306, var12);
                                }
                                if (!var15) {
                                    this.field1579[this.field1564] = var12.field132;
                                    this.field1203[this.field1564] = 951;
                                    this.field1202[this.field1564] = var12.field78;
                                    ++this.field1564;
                                }
                            }
                            if (var12.field81 == 2 && this.field1307 == 0 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                String var16 = var12.field129;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field1579[this.field1564] = var16 + " @gre@" + var12.field130;
                                this.field1203[this.field1564] = 930;
                                this.field1202[this.field1564] = var12.field78;
                                ++this.field1564;
                            }
                            if (var12.field81 == 3 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                this.field1579[this.field1564] = "Close";
                                this.field1203[this.field1564] = 947;
                                this.field1202[this.field1564] = var12.field78;
                                ++this.field1564;
                            }
                            if (var12.field81 == 4 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                this.field1579[this.field1564] = var12.field132;
                                this.field1203[this.field1564] = 465;
                                this.field1202[this.field1564] = var12.field78;
                                ++this.field1564;
                            }
                            if (var12.field81 == 5 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                this.field1579[this.field1564] = var12.field132;
                                this.field1203[this.field1564] = 960;
                                this.field1202[this.field1564] = var12.field78;
                                ++this.field1564;
                            }
                            if (var12.field81 == 6 && !this.field1613 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
                                this.field1579[this.field1564] = var12.field132;
                                this.field1203[this.field1564] = 44;
                                this.field1202[this.field1564] = var12.field78;
                                ++this.field1564;
                            }
                            if (var12.field80 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var12.field84; ++var18) {
                                    for (int var19 = 0; var19 < var12.field83; ++var19) {
                                        int var20 = (var12.field103 + 32) * var19 + var13;
                                        int var21 = (var12.field104 + 32) * var18 + var14;
                                        if (var17 < 20) {
                                            var20 += var12.field106[var17];
                                            var21 += var12.field107[var17];
                                        }
                                        if (arg0 >= var20 && arg2 >= var21 && arg0 < var20 + 32 && arg2 < var21 + 32) {
                                            this.field1531 = var17;
                                            this.field1532 = var12.field78;
                                            if (var12.field74[var17] > 0) {
                                                ObjType var22 = ObjType.method348(var12.field74[var17] - 1);
                                                if (this.field1497 == 1 && var12.field101) {
                                                    if (this.field1499 != var12.field78 || this.field1498 != var17) {
                                                        this.field1579[this.field1564] = "Use " + this.field1501 + " with @lre@" + var22.field1031;
                                                        this.field1203[this.field1564] = 881;
                                                        this.field1204[this.field1564] = var22.field1029;
                                                        this.field1201[this.field1564] = var17;
                                                        this.field1202[this.field1564] = var12.field78;
                                                        ++this.field1564;
                                                    }
                                                } else if (this.field1307 == 1 && var12.field101) {
                                                    if ((this.field1309 & 16) == 16) {
                                                        this.field1579[this.field1564] = this.field1310 + " @lre@" + var22.field1031;
                                                        this.field1203[this.field1564] = 391;
                                                        this.field1204[this.field1564] = var22.field1029;
                                                        this.field1201[this.field1564] = var17;
                                                        this.field1202[this.field1564] = var12.field78;
                                                        ++this.field1564;
                                                    }
                                                } else {
                                                    if (var12.field101) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1047 != null && var22.field1047[var23] != null) {
                                                                this.field1579[this.field1564] = var22.field1047[var23] + " @lre@" + var22.field1031;
                                                                if (var23 == 3) {
                                                                    this.field1203[this.field1564] = 478;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field1203[this.field1564] = 347;
                                                                }
                                                                this.field1204[this.field1564] = var22.field1029;
                                                                this.field1201[this.field1564] = var17;
                                                                this.field1202[this.field1564] = var12.field78;
                                                                ++this.field1564;
                                                            } else if (var23 == 4) {
                                                                this.field1579[this.field1564] = "Drop @lre@" + var22.field1031;
                                                                this.field1203[this.field1564] = 347;
                                                                this.field1204[this.field1564] = var22.field1029;
                                                                this.field1201[this.field1564] = var17;
                                                                this.field1202[this.field1564] = var12.field78;
                                                                ++this.field1564;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field102) {
                                                        this.field1579[this.field1564] = "Use @lre@" + var22.field1031;
                                                        this.field1203[this.field1564] = 188;
                                                        this.field1204[this.field1564] = var22.field1029;
                                                        this.field1201[this.field1564] = var17;
                                                        this.field1202[this.field1564] = var12.field78;
                                                        ++this.field1564;
                                                    }
                                                    if (var12.field101 && var22.field1047 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1047[var24] != null) {
                                                                this.field1579[this.field1564] = var22.field1047[var24] + " @lre@" + var22.field1031;
                                                                if (var24 == 0) {
                                                                    this.field1203[this.field1564] = 405;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field1203[this.field1564] = 38;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field1203[this.field1564] = 422;
                                                                }
                                                                this.field1204[this.field1564] = var22.field1029;
                                                                this.field1201[this.field1564] = var17;
                                                                this.field1202[this.field1564] = var12.field78;
                                                                ++this.field1564;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field108 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field108[var25] != null) {
                                                                this.field1579[this.field1564] = var12.field108[var25] + " @lre@" + var22.field1031;
                                                                if (var25 == 0) {
                                                                    this.field1203[this.field1564] = 602;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field1203[this.field1564] = 596;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field1203[this.field1564] = 22;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field1203[this.field1564] = 892;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field1203[this.field1564] = 415;
                                                                }
                                                                this.field1204[this.field1564] = var22.field1029;
                                                                this.field1201[this.field1564] = var17;
                                                                this.field1202[this.field1564] = var12.field78;
                                                                ++this.field1564;
                                                            }
                                                        }
                                                    }
                                                    this.field1579[this.field1564] = "Examine @lre@" + var22.field1031;
                                                    this.field1203[this.field1564] = 1773;
                                                    this.field1204[this.field1564] = var22.field1029;
                                                    this.field1202[this.field1564] = var12.field75[var17];
                                                    ++this.field1564;
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

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        if (arg0 != -35584) {
            this.method6();
        }
        if (this.field1274 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1274.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1244 == -1) {
                    this.field1274.method41(this.field1484.field718, 0, 1);
                    this.field1244 = this.field1484.field718[0] & 255;
                    if (this.field1537 != null) {
                        this.field1244 = this.field1244 - this.field1537.method304() & 255;
                    }
                    this.field1243 = Protocol.field1072[this.field1244];
                    --var2;
                }
                if (this.field1243 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1274.method41(this.field1484.field718, 0, 1);
                    this.field1243 = this.field1484.field718[0] & 255;
                    --var2;
                }
                if (this.field1243 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1274.method41(this.field1484.field718, 0, 2);
                    this.field1484.field719 = 0;
                    this.field1243 = this.field1484.method240();
                    var2 -= 2;
                }
                if (var2 < this.field1243) {
                    return false;
                }
                this.field1484.field719 = 0;
                this.field1274.method41(this.field1484.field718, 0, this.field1243);
                this.field1245 = 0;
                this.field1382 = this.field1381;
                this.field1381 = this.field1380;
                this.field1380 = this.field1244;
                if (this.field1244 == 44) {
                    this.field1487 = this.field1484.method243();
                    this.field1529 = this.field1484.method240();
                    this.field1238 = this.field1484.method238();
                    this.field1189 = this.field1484.method240();
                    this.field1425 = this.field1484.method238();
                    if (this.field1487 != 0 && this.field1273 == -1) {
                        signlink.dnslookup(JString.method312(this.field1487, (byte) -35));
                        this.method450(true);
                        short var3 = 650;
                        if (this.field1238 != 201 || this.field1425 == 1) {
                            var3 = 655;
                        }
                        this.field1345 = "";
                        this.field1451 = false;
                        for (int var4 = 0; var4 < Component.field73.length; ++var4) {
                            if (Component.field73[var4] != null && Component.field73[var4].field82 == var3) {
                                this.field1273 = Component.field73[var4].field79;
                                break;
                            }
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 72) {
                    this.field1221 = true;
                    int var5 = this.field1484.method240();
                    Component var6 = Component.field73[var5];
                    int var7 = this.field1484.method238();
                    for (int var8 = 0; var8 < var7; ++var8) {
                        var6.field74[var8] = this.field1484.method240();
                        int var9 = this.field1484.method238();
                        if (var9 == 255) {
                            var9 = this.field1484.method243();
                        }
                        var6.field75[var8] = var9;
                    }
                    for (int var10 = var7; var10 < var6.field74.length; ++var10) {
                        var6.field74[var10] = 0;
                        var6.field75[var10] = 0;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 164) {
                    int var11 = this.field1484.method240();
                    int var12 = this.field1484.method240();
                    int var13 = this.field1484.method240();
                    ObjType var14 = ObjType.method348(var12);
                    Component.field73[var11].field120 = 4;
                    Component.field73[var11].field121 = var12;
                    Component.field73[var11].field127 = var14.field1036;
                    Component.field73[var11].field128 = var14.field1037;
                    Component.field73[var11].field126 = var14.field1035 * 100 / var13;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 207) {
                    int var15 = this.field1484.method240();
                    int var16 = this.field1484.method240();
                    if (this.field1396 != -1) {
                        this.field1396 = -1;
                        this.field1236 = true;
                    }
                    if (this.field1376) {
                        this.field1376 = false;
                        this.field1236 = true;
                    }
                    this.field1273 = var15;
                    this.field1567 = var16;
                    this.field1221 = true;
                    this.field1384 = true;
                    this.field1613 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 192) {
                    this.field1264 = 255;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 70) {
                    long var17 = this.field1484.method244(this.field1191);
                    int var19 = this.field1484.method238();
                    String var20 = JString.method313(true, JString.method310((byte) 88, var17));
                    for (int var21 = 0; var21 < this.field1418; ++var21) {
                        if (this.field1208[var21] == var17) {
                            if (this.field1470[var21] != var19) {
                                this.field1470[var21] = var19;
                                this.field1221 = true;
                                if (var19 > 0) {
                                    this.method431(var20 + " has logged in.", "", 5, false);
                                }
                                if (var19 == 0) {
                                    this.method431(var20 + " has logged out.", "", 5, false);
                                }
                            }
                            var20 = null;
                            break;
                        }
                    }
                    if (var20 != null && this.field1418 < 200) {
                        this.field1208[this.field1418] = var17;
                        this.field1556[this.field1418] = var20;
                        this.field1470[this.field1418] = var19;
                        ++this.field1418;
                        this.field1221 = true;
                    }
                    boolean var22 = false;
                    while (!var22) {
                        var22 = true;
                        for (int var23 = 0; var23 < this.field1418 - 1; ++var23) {
                            if (this.field1470[var23] != field1398 && this.field1470[var23 + 1] == field1398 || this.field1470[var23] == 0 && this.field1470[var23 + 1] != 0) {
                                int var24 = this.field1470[var23];
                                this.field1470[var23] = this.field1470[var23 + 1];
                                this.field1470[var23 + 1] = var24;
                                String var25 = this.field1556[var23];
                                this.field1556[var23] = this.field1556[var23 + 1];
                                this.field1556[var23 + 1] = var25;
                                long var26 = this.field1208[var23];
                                this.field1208[var23] = this.field1208[var23 + 1];
                                this.field1208[var23 + 1] = var26;
                                this.field1221 = true;
                                var22 = false;
                            }
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 17) {
                    this.method476(false);
                    this.field1244 = -1;
                    return false;
                }
                if (this.field1244 == 50) {
                    int var28 = this.field1484.method238();
                    int var29 = this.field1484.method238();
                    int var30 = this.field1484.method238();
                    int var31 = this.field1484.method238();
                    this.field1352[var28] = true;
                    this.field1279[var28] = var29;
                    this.field1242[var28] = var30;
                    this.field1237[var28] = var31;
                    this.field1257[var28] = 0;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 22) {
                    InputTracking.method44(53);
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 160) {
                    if (this.field1225 == 12) {
                        this.field1221 = true;
                    }
                    this.field1388 = this.field1484.method241();
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 94) {
                    this.field1337 = this.field1484.method238();
                    this.field1338 = this.field1484.method238();
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 78) {
                    int var32 = this.field1484.method240();
                    int var33 = this.field1484.method240();
                    int var34 = var33 >> 10 & 31;
                    int var35 = var33 >> 5 & 31;
                    int var36 = var33 & 31;
                    Component.field73[var32].field115 = (var36 << 3) + (var34 << 19) + (var35 << 11);
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 152) {
                    this.field1626 = false;
                    this.field1376 = true;
                    this.field1336 = "";
                    this.field1236 = true;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 53) {
                    this.field1471 = false;
                    for (int var37 = 0; var37 < 5; ++var37) {
                        this.field1352[var37] = false;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 240) {
                    int var38 = this.field1484.method240();
                    if (var38 == 65535) {
                        var38 = -1;
                    }
                    if (this.field1472 != var38 && this.field1460 && !field1401) {
                        this.field1568 = var38;
                        this.field1569 = true;
                        this.field1525.method288(2, this.field1568);
                    }
                    this.field1472 = var38;
                    this.field1205 = 0;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 173) {
                    int var39 = this.field1484.method240();
                    int var40 = this.field1484.method240();
                    if (this.field1460 && !field1401) {
                        this.field1568 = var39;
                        this.field1569 = false;
                        this.field1525.method288(2, this.field1568);
                        this.field1205 = var40;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 158) {
                    int var41 = this.field1484.method241();
                    this.field1229 = var41;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 9) {
                    this.field1408 = this.field1484.method238();
                    this.field1576 = this.field1484.method238();
                    this.field1275 = this.field1484.method238();
                    this.field1616 = true;
                    this.field1236 = true;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 209 || this.field1244 == 29 || this.field1244 == 69 || this.field1244 == 198 || this.field1244 == 137 || this.field1244 == 39 || this.field1244 == 234 || this.field1244 == 155 || this.field1244 == 125 || this.field1244 == 232) {
                    this.method484(6, this.field1244, this.field1484);
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 241) {
                    int var42 = this.field1484.method240();
                    int var43 = this.field1484.method241();
                    int var44 = this.field1484.method241();
                    Component var45 = Component.field73[var42];
                    var45.field86 = var43;
                    var45.field87 = var44;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 226) {
                    int var46 = this.field1484.method240();
                    int var47 = this.field1484.method243();
                    this.field1510[var46] = var47;
                    if (this.field1278[var46] != var47) {
                        this.field1278[var46] = var47;
                        this.method510(var46, 7);
                        this.field1221 = true;
                        if (this.field1565 != -1) {
                            this.field1236 = true;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 210) {
                    this.field1397 = this.field1484.method240();
                    this.field1255 = this.field1484.method238();
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 97) {
                    this.field1416 = this.field1484.method238();
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 85) {
                    this.field1592 = this.field1484.method240() * 30;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 245) {
                    int var48 = this.field1484.method240();
                    int var49 = this.field1484.method240();
                    Component.field73[var48].field120 = 1;
                    Component.field73[var48].field121 = var49;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 151) {
                    int var50 = this.field1484.method240();
                    int var51 = this.field1484.method238();
                    int var52 = this.field1484.method240();
                    if (this.field1614 && !field1401 && this.field1334 < 50) {
                        this.field1186[this.field1334] = var50;
                        this.field1230[this.field1334] = var51;
                        this.field1413[this.field1334] = Wave.field903[var50] + var52;
                        ++this.field1334;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 87) {
                    for (int var53 = 0; var53 < this.field1278.length; ++var53) {
                        if (this.field1510[var53] != this.field1278[var53]) {
                            this.field1278[var53] = this.field1510[var53];
                            this.method510(var53, 7);
                            this.field1221 = true;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 165) {
                    int var54 = this.field1484.method240();
                    int var55 = this.field1484.method240();
                    if (this.field1589 == var54 && this.field1590 == var55 && this.field1527 == 2) {
                        this.field1244 = -1;
                        return true;
                    }
                    this.field1589 = var54;
                    this.field1590 = var55;
                    this.field1340 = (this.field1589 - 6) * 8;
                    this.field1341 = (this.field1590 - 6) * 8;
                    this.field1507 = false;
                    if ((this.field1589 / 8 == 48 || this.field1589 / 8 == 49) && this.field1590 / 8 == 48) {
                        this.field1507 = true;
                    }
                    if (this.field1589 / 8 == 48 && this.field1590 / 8 == 148) {
                        this.field1507 = true;
                    }
                    this.field1527 = 1;
                    this.field1489 = System.currentTimeMillis();
                    this.field1517.method267(212);
                    this.field1442.method213(257, 1, 0, "Loading - please wait.", 151);
                    this.field1442.method213(256, 1, 16777215, "Loading - please wait.", 150);
                    this.field1517.method268(super.field15, 4, (byte) 55, 4);
                    int var56 = 0;
                    for (int var57 = (this.field1589 - 6) / 8; var57 <= (this.field1589 + 6) / 8; ++var57) {
                        for (int var58 = (this.field1590 - 6) / 8; var58 <= (this.field1590 + 6) / 8; ++var58) {
                            ++var56;
                        }
                    }
                    this.field1268 = new byte[var56][];
                    this.field1311 = new byte[var56][];
                    this.field1405 = new int[var56];
                    this.field1406 = new int[var56];
                    this.field1407 = new int[var56];
                    int var59 = 0;
                    for (int var60 = (this.field1589 - 6) / 8; var60 <= (this.field1589 + 6) / 8; ++var60) {
                        for (int var61 = (this.field1590 - 6) / 8; var61 <= (this.field1590 + 6) / 8; ++var61) {
                            this.field1405[var59] = (var60 << 8) + var61;
                            if (this.field1507 && (var61 == 49 || var61 == 149 || var61 == 147 || var60 == 50 || var60 == 49 && var61 == 47)) {
                                this.field1406[var59] = -1;
                                this.field1407[var59] = -1;
                                ++var59;
                            } else {
                                int var62 = this.field1406[var59] = this.field1525.method283(var61, var60, 0, field1543);
                                if (var62 != -1) {
                                    this.field1525.method288(3, var62);
                                }
                                int var63 = this.field1407[var59] = this.field1525.method283(var61, var60, 1, field1543);
                                if (var63 != -1) {
                                    this.field1525.method288(3, var63);
                                }
                                ++var59;
                            }
                        }
                    }
                    int var64 = this.field1340 - this.field1342;
                    int var65 = this.field1341 - this.field1343;
                    this.field1342 = this.field1340;
                    this.field1343 = this.field1341;
                    for (int var66 = 0; var66 < 8192; ++var66) {
                        NpcEntity var67 = this.field1438[var66];
                        if (var67 != null) {
                            for (int var68 = 0; var68 < 10; ++var68) {
                                var67.field453[var68] -= var64;
                                var67.field454[var68] -= var65;
                            }
                            var67.field404 -= var64 * 128;
                            var67.field405 -= var65 * 128;
                        }
                    }
                    for (int var69 = 0; var69 < this.field1283; ++var69) {
                        PlayerEntity var70 = this.field1285[var69];
                        if (var70 != null) {
                            for (int var71 = 0; var71 < 10; ++var71) {
                                var70.field453[var71] -= var64;
                                var70.field454[var71] -= var65;
                            }
                            var70.field404 -= var64 * 128;
                            var70.field405 -= var65 * 128;
                        }
                    }
                    this.field1615 = true;
                    byte var72 = 0;
                    byte var73 = 104;
                    byte var74 = 1;
                    if (var64 < 0) {
                        var72 = 103;
                        var73 = -1;
                        var74 = -1;
                    }
                    byte var75 = 0;
                    byte var76 = 104;
                    byte var77 = 1;
                    if (var65 < 0) {
                        var75 = 103;
                        var76 = -1;
                        var77 = -1;
                    }
                    for (int var78 = var72; var73 != var78; var78 += var74) {
                        for (int var79 = var75; var76 != var79; var79 += var77) {
                            int var80 = var64 + var78;
                            int var81 = var65 + var79;
                            for (int var82 = 0; var82 < 4; ++var82) {
                                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                                    this.field1432[var82][var78][var79] = this.field1432[var82][var80][var81];
                                } else {
                                    this.field1432[var82][var78][var79] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var83 = (LocSpawned) this.field1190.method257(); var83 != null; var83 = (LocSpawned) this.field1190.method259(-976)) {
                        var83.field738 -= var64;
                        var83.field739 -= var65;
                        if (var83.field738 < 0 || var83.field739 < 0 || var83.field738 >= 104 || var83.field739 >= 104) {
                            var83.method119();
                        }
                    }
                    if (this.field1461 != 0) {
                        this.field1461 -= var64;
                        this.field1462 -= var65;
                    }
                    this.field1471 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 214) {
                    if (this.field1567 != -1) {
                        this.field1567 = -1;
                        this.field1221 = true;
                        this.field1384 = true;
                    }
                    if (this.field1396 != -1) {
                        this.field1396 = -1;
                        this.field1236 = true;
                    }
                    if (this.field1376) {
                        this.field1376 = false;
                        this.field1236 = true;
                    }
                    this.field1273 = -1;
                    this.field1613 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 219) {
                    int var84 = this.field1484.method240();
                    int var85 = this.field1484.method240();
                    Component.field73[var84].field124 = var85;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 95) {
                    String var86 = this.field1484.method245();
                    if (var86.endsWith(":tradereq:")) {
                        String var87 = var86.substring(0, var86.indexOf(":"));
                        long var88 = JString.method309(var87);
                        boolean var90 = false;
                        for (int var91 = 0; var91 < this.field1359; ++var91) {
                            if (this.field1339[var91] == var88) {
                                var90 = true;
                                break;
                            }
                        }
                        if (!var90 && this.field1360 == 0) {
                            this.method431("wishes to trade with you.", var87, 4, false);
                        }
                    } else if (!var86.endsWith(":duelreq:")) {
                        this.method431(var86, "", 0, false);
                    } else {
                        String var92 = var86.substring(0, var86.indexOf(":"));
                        long var93 = JString.method309(var92);
                        boolean var95 = false;
                        for (int var96 = 0; var96 < this.field1359; ++var96) {
                            if (this.field1339[var96] == var93) {
                                var95 = true;
                                break;
                            }
                        }
                        if (!var95 && this.field1360 == 0) {
                            this.method431("wishes to duel with you.", var92, 8, false);
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 24) {
                    this.field1221 = true;
                    int var97 = this.field1484.method238();
                    int var98 = this.field1484.method243();
                    int var99 = this.field1484.method238();
                    this.field1234[var97] = var98;
                    this.field1519[var97] = var99;
                    this.field1222[var97] = 1;
                    for (int var100 = 0; var100 < 98; ++var100) {
                        if (var98 >= field1481[var100]) {
                            this.field1222[var97] = var100 + 2;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 60) {
                    Packet var101 = InputTracking.method47(0);
                    if (var101 != null) {
                        this.field1404.method227(217, this.field1496);
                        this.field1404.method229(var101.field719);
                        this.field1404.method236(var101.field719, 0, 0, var101.field718);
                        var101.method226(7290);
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 242) {
                    for (int var102 = 0; var102 < this.field1285.length; ++var102) {
                        if (this.field1285[var102] != null) {
                            this.field1285[var102].field432 = -1;
                        }
                    }
                    for (int var103 = 0; var103 < this.field1438.length; ++var103) {
                        if (this.field1438[var103] != null) {
                            this.field1438[var103].field432 = -1;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 108) {
                    int var104 = this.field1484.method240();
                    Component.field73[var104].field120 = 3;
                    Component.field73[var104].field121 = (field1428.field469[8] << 6) + (field1428.field469[0] << 12) + (field1428.field470[0] << 24) + (field1428.field470[4] << 18) + field1428.field469[11];
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 86) {
                    this.method547(829, this.field1243, this.field1484);
                    this.field1615 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 176) {
                    int var105 = this.field1484.method240();
                    this.method471(var105, 5);
                    if (this.field1396 != -1) {
                        this.field1396 = -1;
                        this.field1236 = true;
                    }
                    if (this.field1376) {
                        this.field1376 = false;
                        this.field1236 = true;
                    }
                    this.field1567 = var105;
                    this.field1221 = true;
                    this.field1384 = true;
                    this.field1273 = -1;
                    this.field1613 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 168) {
                    this.field1253 = this.field1484.method238();
                    if (this.field1253 == this.field1225) {
                        if (this.field1253 == 3) {
                            this.field1225 = 1;
                        } else {
                            this.field1225 = 3;
                        }
                        this.field1221 = true;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 174) {
                    int var106 = this.field1484.method241();
                    this.field1565 = var106;
                    this.field1236 = true;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 154) {
                    int var107 = this.field1484.method240();
                    String var108 = this.field1484.method245();
                    Component.field73[var107].field113 = var108;
                    if (this.field1324[this.field1225] == Component.field73[var107].field79) {
                        this.field1221 = true;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 200) {
                    int var109 = this.field1484.method240();
                    int var110 = this.field1484.method238();
                    if (var109 == 65535) {
                        var109 = -1;
                    }
                    this.field1324[var110] = var109;
                    this.field1221 = true;
                    this.field1384 = true;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 56) {
                    this.field1225 = this.field1484.method238();
                    this.field1221 = true;
                    this.field1384 = true;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 129) {
                    int var111 = this.field1484.method240();
                    int var112 = this.field1484.method240();
                    Component.field73[var111].field120 = 2;
                    Component.field73[var111].field121 = var112;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 222) {
                    this.field1471 = true;
                    this.field1465 = this.field1484.method238();
                    this.field1466 = this.field1484.method238();
                    this.field1467 = this.field1484.method240();
                    this.field1468 = this.field1484.method238();
                    this.field1469 = this.field1484.method238();
                    if (this.field1469 >= 100) {
                        int var113 = this.field1465 * 128 + 64;
                        int var114 = this.field1466 * 128 + 64;
                        int var115 = this.method473(false, var114, this.field1479, var113) - this.field1467;
                        int var116 = var113 - this.field1637;
                        int var117 = var115 - this.field1638;
                        int var118 = var114 - this.field1639;
                        int var119 = (int) Math.sqrt((double) (var116 * var116 + var118 * var118));
                        this.field1640 = (int) (Math.atan2((double) var117, (double) var119) * 325.949D) & 2047;
                        this.field1641 = (int) (Math.atan2((double) var116, (double) var118) * -325.949D) & 2047;
                        if (this.field1640 < 128) {
                            this.field1640 = 128;
                        }
                        if (this.field1640 > 383) {
                            this.field1640 = 383;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 177) {
                    if (this.field1225 == 12) {
                        this.field1221 = true;
                    }
                    this.field1233 = this.field1484.method238();
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 62) {
                    this.field1461 = 0;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 162) {
                    int var120 = this.field1484.method240();
                    Component var121 = Component.field73[var120];
                    for (int var122 = 0; var122 < var121.field74.length; ++var122) {
                        var121.field74[var122] = -1;
                        var121.field74[var122] = 0;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 49) {
                    this.field1581 = this.field1484.method238();
                    if (this.field1581 == 1) {
                        this.field1277 = this.field1484.method240();
                    }
                    if (this.field1581 >= 2 && this.field1581 <= 6) {
                        if (this.field1581 == 2) {
                            this.field1350 = 64;
                            this.field1351 = 64;
                        }
                        if (this.field1581 == 3) {
                            this.field1350 = 0;
                            this.field1351 = 64;
                        }
                        if (this.field1581 == 4) {
                            this.field1350 = 128;
                            this.field1351 = 64;
                        }
                        if (this.field1581 == 5) {
                            this.field1350 = 64;
                            this.field1351 = 0;
                        }
                        if (this.field1581 == 6) {
                            this.field1350 = 64;
                            this.field1351 = 128;
                        }
                        this.field1581 = 2;
                        this.field1347 = this.field1484.method240();
                        this.field1348 = this.field1484.method240();
                        this.field1349 = this.field1484.method238();
                    }
                    if (this.field1581 == 10) {
                        this.field1415 = this.field1484.method240();
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 10) {
                    int var123 = this.field1484.method240();
                    this.method471(var123, 5);
                    if (this.field1567 != -1) {
                        this.field1567 = -1;
                        this.field1221 = true;
                        this.field1384 = true;
                    }
                    if (this.field1396 != -1) {
                        this.field1396 = -1;
                        this.field1236 = true;
                    }
                    if (this.field1376) {
                        this.field1376 = false;
                        this.field1236 = true;
                    }
                    this.field1273 = var123;
                    this.field1613 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 189) {
                    int var124 = this.field1484.method240();
                    this.method471(var124, 5);
                    if (this.field1567 != -1) {
                        this.field1567 = -1;
                        this.field1221 = true;
                        this.field1384 = true;
                    }
                    this.field1396 = var124;
                    this.field1236 = true;
                    this.field1273 = -1;
                    this.field1613 = false;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 244) {
                    this.method428(-13193, this.field1243, this.field1484);
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 132) {
                    this.field1221 = true;
                    int var125 = this.field1484.method240();
                    Component var126 = Component.field73[var125];
                    while (this.field1484.field719 < this.field1243) {
                        int var127 = this.field1484.method238();
                        int var128 = this.field1484.method240();
                        int var129 = this.field1484.method238();
                        if (var129 == 255) {
                            var129 = this.field1484.method243();
                        }
                        if (var127 >= 0 && var127 < var126.field74.length) {
                            var126.field74[var127] = var128;
                            var126.field75[var127] = var129;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 12) {
                    this.field1471 = true;
                    this.field1546 = this.field1484.method238();
                    this.field1547 = this.field1484.method238();
                    this.field1548 = this.field1484.method240();
                    this.field1549 = this.field1484.method238();
                    this.field1550 = this.field1484.method238();
                    if (this.field1550 >= 100) {
                        this.field1637 = this.field1546 * 128 + 64;
                        this.field1639 = this.field1547 * 128 + 64;
                        this.field1638 = this.method473(false, this.field1639, this.field1479, this.field1637) - this.field1548;
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 233) {
                    this.field1337 = this.field1484.method238();
                    this.field1338 = this.field1484.method238();
                    while (this.field1484.field719 < this.field1243) {
                        int var130 = this.field1484.method238();
                        this.method484(6, var130, this.field1484);
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 131) {
                    this.field1337 = this.field1484.method238();
                    this.field1338 = this.field1484.method238();
                    for (int var131 = this.field1337; var131 < this.field1337 + 8; ++var131) {
                        for (int var132 = this.field1338; var132 < this.field1338 + 8; ++var132) {
                            if (this.field1432[this.field1479][var131][var132] != null) {
                                this.field1432[this.field1479][var131][var132] = null;
                                this.method536(var131, var132);
                            }
                        }
                    }
                    for (LocSpawned var133 = (LocSpawned) this.field1190.method257(); var133 != null; var133 = (LocSpawned) this.field1190.method259(-976)) {
                        if (var133.field738 >= this.field1337 && var133.field738 < this.field1337 + 8 && var133.field739 >= this.field1338 && var133.field739 < this.field1338 + 8 && this.field1479 == var133.field736) {
                            var133.field747 = 0;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 30) {
                    long var134 = this.field1484.method244(this.field1191);
                    int var136 = this.field1484.method243();
                    int var137 = this.field1484.method238();
                    boolean var138 = false;
                    for (int var139 = 0; var139 < 100; ++var139) {
                        if (this.field1241[var139] == var136) {
                            var138 = true;
                            break;
                        }
                    }
                    if (var137 <= 1) {
                        for (int var140 = 0; var140 < this.field1359; ++var140) {
                            if (this.field1339[var140] == var134) {
                                var138 = true;
                                break;
                            }
                        }
                    }
                    if (!var138 && this.field1360 == 0) {
                        try {
                            this.field1241[this.field1411] = var136;
                            this.field1411 = (this.field1411 + 1) % 100;
                            String var141 = WordPack.method316(this.field1243 - 13, 355, this.field1484);
                            String var142 = WordFilter.method399(var141, (byte) 5);
                            if (var137 != 2 && var137 != 3) {
                                if (var137 == 1) {
                                    this.method431(var142, "@cr1@" + JString.method313(true, JString.method310((byte) 88, var134)), 7, false);
                                } else {
                                    this.method431(var142, JString.method313(true, JString.method310((byte) 88, var134)), 3, false);
                                }
                            } else {
                                this.method431(var142, "@cr2@" + JString.method313(true, JString.method310((byte) 88, var134)), 7, false);
                            }
                        } catch (Exception var152) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 123) {
                    int var144 = this.field1484.method240();
                    boolean var145 = this.field1484.method238() == 1;
                    Component.field73[var144].field94 = var145;
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 236) {
                    int var146 = this.field1484.method240();
                    byte var147 = this.field1484.method239();
                    this.field1510[var146] = var147;
                    if (this.field1278[var146] != var147) {
                        this.field1278[var146] = var147;
                        this.method510(var146, 7);
                        this.field1221 = true;
                        if (this.field1565 != -1) {
                            this.field1236 = true;
                        }
                    }
                    this.field1244 = -1;
                    return true;
                }
                if (this.field1244 == 7) {
                    this.field1359 = this.field1243 / 8;
                    for (int var148 = 0; var148 < this.field1359; ++var148) {
                        this.field1339[var148] = this.field1484.method244(this.field1191);
                    }
                    this.field1244 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1244 + "," + this.field1243 + " - " + this.field1381 + "," + this.field1382);
                this.method476(false);
            } catch (IOException var153) {
                this.method429(0);
            } catch (Exception var154) {
                String var150 = "T2 - " + this.field1244 + "," + this.field1381 + "," + this.field1382 + " - " + this.field1243 + "," + (field1428.field453[0] + this.field1340) + "," + (field1428.field454[0] + this.field1341) + " - ";
                for (int var151 = 0; var151 < this.field1243 && var151 < 50; ++var151) {
                    var150 = var150 + this.field1484.field718[var151] + ",";
                }
                signlink.reporterror(var150);
                this.method476(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (!this.field1450 && !this.field1437 && !this.field1503) {
            ++field1344;
            if (arg0) {
                this.field1244 = -1;
            }
            if (!this.field1361) {
                this.method517(this.field1206);
            } else {
                this.method444(-476);
            }
            this.field1582 = 0;
        } else {
            this.method545((byte) 6);
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method525(int arg0) {
        this.field1452 = false;
        while (this.field1358) {
            this.field1452 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1362 = null;
        this.field1363 = null;
        this.field1502 = null;
        this.field1215 = null;
        this.field1216 = null;
        this.field1217 = null;
        if (arg0 != 0) {
            this.method6();
        }
        this.field1218 = null;
        this.field1301 = null;
        this.field1302 = null;
        this.field1571 = null;
        this.field1572 = null;
        this.field1269 = null;
        this.field1270 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;II)I")
    public final int method526(Component arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            return 4;
        } else if (arg0.field88 != null && arg2 < arg0.field88.length) {
            try {
                int[] var4 = arg0.field88[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1519[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1222[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1234[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field73[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field74.length; ++var10) {
                            if (var8.field74[var10] == var9) {
                                var5 += var8.field75[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1278[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1481[this.field1222[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1278[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += field1428.field471;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1222[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field73[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field74.length; ++var14) {
                            if (var12.field74[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1233;
                    }
                    if (var7 == 12) {
                        var5 += this.field1388;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1278[var4[var6++]];
                        int var16 = var4[var6++];
                        var5 += (var15 & 1 << var16) != 0 ? 1 : 0;
                    }
                }
            } catch (Exception var17) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;B)V")
    public final void method527(Pix8 arg0, byte arg1) {
        if (arg1 == 66) {
            short var3 = 256;
            for (int var4 = 0; var4 < this.field1301.length; ++var4) {
                this.field1301[var4] = 0;
            }
            for (int var5 = 0; var5 < 5000; ++var5) {
                int var17 = (int) (Math.random() * 128.0D * (double) var3);
                this.field1301[var17] = (int) (Math.random() * 256.0D);
            }
            for (int var6 = 0; var6 < 20; ++var6) {
                for (int var13 = 1; var13 < var3 - 1; ++var13) {
                    for (int var15 = 1; var15 < 127; ++var15) {
                        int var16 = (var13 << 7) + var15;
                        this.field1302[var16] = (this.field1301[var16 - 1] + this.field1301[var16 + 1] + this.field1301[var16 - 128] + this.field1301[var16 + 128]) / 4;
                    }
                }
                int[] var14 = this.field1301;
                this.field1301 = this.field1302;
                this.field1302 = var14;
            }
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field686; ++var8) {
                    for (int var9 = 0; var9 < arg0.field685; ++var9) {
                        if (arg0.field683[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field687;
                            int var11 = var8 + 16 + arg0.field688;
                            int var12 = (var11 << 7) + var10;
                            this.field1301[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method528(int arg0, int arg1) {
        if (arg0 >= 1 && arg0 <= 1) {
            if (arg1 < 100000) {
                return String.valueOf(arg1);
            } else {
                return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIII)V")
    public final void method529(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1258.method89(arg1, arg5, arg0);
        if (var7 != 0) {
            int var8 = this.field1258.method93(arg1, arg5, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field1463.field670;
            int var13 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method333(var14);
            if (var15.field968 != -1) {
                Pix8 var16 = this.field1574[var15.field968];
                if (var16 != null) {
                    int var17 = (var15.field953 * 4 - var16.field685) / 2;
                    int var18 = (var15.field954 * 4 - var16.field686) / 2;
                    var16.method211((byte) 9, arg5 * 4 + 48 + var17, (104 - arg0 - var15.field954) * 4 + 48 + var18);
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
        int var19 = this.field1258.method91(arg1, arg5, arg0);
        if (var19 != 0) {
            int var20 = this.field1258.method93(arg1, arg5, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method333(var23);
            if (var24.field968 != -1) {
                Pix8 var25 = this.field1574[var24.field968];
                if (var25 != null) {
                    int var26 = (var24.field953 * 4 - var25.field685) / 2;
                    int var27 = (var24.field954 * 4 - var25.field686) / 2;
                    var25.method211((byte) 9, arg5 * 4 + 48 + var26, (104 - arg0 - var24.field954) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1463.field670;
                int var30 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field1258.method92(arg1, arg5, arg0);
        if (arg2 != -24) {
            for (int var32 = 1; var32 > 0; ++var32) {
            }
        }
        if (var31 != 0) {
            int var33 = var31 >> 14 & 32767;
            LocType var34 = LocType.method333(var33);
            if (var34.field968 != -1) {
                Pix8 var35 = this.field1574[var34.field968];
                if (var35 != null) {
                    int var36 = (var34.field953 * 4 - var35.field685) / 2;
                    int var37 = (var34.field954 * 4 - var35.field686) / 2;
                    var35.method211((byte) 9, arg5 * 4 + 48 + var36, (104 - arg0 - var34.field954) * 4 + 48 + var37);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    private final void method530(int arg0) {
        if (arg0 < 0) {
            if (this.field1527 == 2) {
                for (LocSpawned var2 = (LocSpawned) this.field1190.method257(); var2 != null; var2 = (LocSpawned) this.field1190.method259(-976)) {
                    if (var2.field747 > 0) {
                        --var2.field747;
                    }
                    if (var2.field747 == 0) {
                        if (var2.field740 < 0 || World.method30(21, var2.field740, var2.field742)) {
                            this.method470(var2.field740, var2.field738, var2.field741, var2.field742, var2.field736, -21245, var2.field739, var2.field737);
                            var2.method119();
                        }
                    } else {
                        if (var2.field746 > 0) {
                            --var2.field746;
                        }
                        if (var2.field746 == 0 && (var2.field743 < 0 || World.method30(21, var2.field743, var2.field745))) {
                            this.method470(var2.field743, var2.field738, var2.field744, var2.field745, var2.field736, -21245, var2.field739, var2.field737);
                            var2.field746 = -1;
                            if (var2.field743 == var2.field740 && var2.field740 == -1) {
                                var2.method119();
                            } else if (var2.field743 == var2.field740 && var2.field744 == var2.field741 && var2.field745 == var2.field742) {
                                var2.method119();
                            }
                        }
                    }
                }
                ++field1453;
                if (field1453 > 85) {
                    field1453 = 0;
                    this.field1404.method227(232, this.field1496);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1274 != null) {
                this.field1274.method38();
            }
        } catch (Exception var2) {
        }
        this.field1274 = null;
        this.method503(0);
        if (this.field1623 != null) {
            this.field1623.field982 = false;
        }
        this.field1623 = null;
        this.field1525.method280();
        this.field1525 = null;
        this.field1404 = null;
        this.field1521 = null;
        this.field1484 = null;
        this.field1405 = null;
        this.field1268 = null;
        this.field1311 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1409 = null;
        this.field1281 = null;
        this.field1258 = null;
        this.field1554 = null;
        this.field1271 = null;
        this.field1239 = null;
        this.field1511 = null;
        this.field1512 = null;
        this.field1214 = null;
        this.field1515 = null;
        this.field1516 = null;
        this.field1517 = null;
        this.field1518 = null;
        this.field1325 = null;
        this.field1326 = null;
        this.field1327 = null;
        this.field1313 = null;
        this.field1314 = null;
        this.field1315 = null;
        this.field1316 = null;
        this.field1317 = null;
        this.field1318 = null;
        this.field1319 = null;
        this.field1320 = null;
        this.field1321 = null;
        this.field1445 = null;
        this.field1446 = null;
        this.field1447 = null;
        this.field1422 = null;
        this.field1423 = null;
        this.field1424 = null;
        this.field1593 = null;
        this.field1391 = null;
        this.field1392 = null;
        this.field1393 = null;
        this.field1394 = null;
        this.field1395 = null;
        this.field1583 = null;
        this.field1584 = null;
        this.field1585 = null;
        this.field1586 = null;
        this.field1587 = null;
        this.field1478 = null;
        this.field1514 = null;
        this.field1389 = null;
        this.field1599 = null;
        this.field1491 = null;
        this.field1492 = null;
        this.field1493 = null;
        this.field1494 = null;
        this.field1574 = null;
        this.field1566 = null;
        this.field1200 = null;
        this.field1285 = null;
        this.field1287 = null;
        this.field1289 = null;
        this.field1290 = null;
        if (this.field1575 != arg0) {
            this.field1191 = this.field1537.method304();
        }
        this.field1323 = null;
        this.field1438 = null;
        this.field1440 = null;
        this.field1432 = null;
        this.field1190 = null;
        this.field1573 = null;
        this.field1591 = null;
        this.field1201 = null;
        this.field1202 = null;
        this.field1203 = null;
        this.field1204 = null;
        this.field1579 = null;
        this.field1278 = null;
        this.field1211 = null;
        this.field1212 = null;
        this.field1448 = null;
        this.field1463 = null;
        this.field1556 = null;
        this.field1208 = null;
        this.field1470 = null;
        this.field1367 = null;
        this.field1368 = null;
        this.field1364 = null;
        this.field1365 = null;
        this.field1366 = null;
        this.field1369 = null;
        this.field1370 = null;
        this.field1371 = null;
        this.field1372 = null;
        this.method525(0);
        LocType.method332((byte) 9);
        NpcType.method341((byte) 9);
        ObjType.method347((byte) 9);
        FloType.field1086 = null;
        IdkType.field1101 = null;
        Component.field73 = null;
        UnkType.field1108 = null;
        SeqType.field1120 = null;
        SpotAnimType.field1138 = null;
        SpotAnimType.field1151 = null;
        VarpType.field1154 = null;
        super.field16 = null;
        PlayerEntity.field486 = null;
        Pix3D.method176((byte) 9);
        World3D.method62((byte) 9);
        Model.method134((byte) 9);
        AnimFrame.method60((byte) 9);
        System.gc();
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)Ljava/lang/String;")
    public final String method531(boolean arg0) {
        if (arg0) {
            this.field1244 = this.field1484.method238();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field18 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;B)Z")
    public final boolean method532(Component arg0, byte arg1) {
        if (arg1 != 7) {
            this.field1244 = -1;
        }
        int var3 = arg0.field82;
        if (var3 == 201) {
            this.field1236 = true;
            this.field1376 = false;
            this.field1626 = true;
            this.field1449 = "";
            this.field1256 = 1;
            this.field1213 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1236 = true;
            this.field1376 = false;
            this.field1626 = true;
            this.field1449 = "";
            this.field1256 = 2;
            this.field1213 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1247 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1236 = true;
                this.field1376 = false;
                this.field1626 = true;
                this.field1449 = "";
                this.field1256 = 4;
                this.field1213 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1236 = true;
                this.field1376 = false;
                this.field1626 = true;
                this.field1449 = "";
                this.field1256 = 5;
                this.field1213 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1597[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1100 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1100) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1101[var6].field1107 && IdkType.field1101[var6].field1102 == var4 + (this.field1570 ? 0 : 7)) {
                            this.field1597[var4] = var6;
                            this.field1196 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1557[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1379[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1379[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1557[var7] = var9;
                this.field1196 = true;
            }
            if (var3 == 324 && !this.field1570) {
                this.field1570 = true;
                this.method501(0);
            }
            if (var3 == 325 && this.field1570) {
                this.field1570 = false;
                this.method501(0);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1451 = !this.field1451;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method450(true);
                    if (this.field1345.length() > 0) {
                        this.field1404.method227(251, this.field1496);
                        this.field1404.method234(JString.method309(this.field1345), this.field1377);
                        this.field1404.method228(var3 - 601);
                        this.field1404.method228(this.field1451 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1404.method227(8, this.field1496);
                this.field1404.method228(this.field1570 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1404.method228(this.field1597[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1404.method228(this.field1557[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method533(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method6();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1431[var5] != null) {
                int var6 = this.field1429[var5];
                int var7 = 70 - var4 * 14 + this.field1248 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1430[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1408 == 0 || this.field1408 == 1 && this.method502(var8, (byte) 1))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field1428.field465)) {
                        if (this.field1378 >= 1) {
                            this.field1579[this.field1564] = "Report abuse @whi@" + var8;
                            this.field1203[this.field1564] = 34;
                            ++this.field1564;
                        }
                        this.field1579[this.field1564] = "Add ignore @whi@" + var8;
                        this.field1203[this.field1564] = 436;
                        ++this.field1564;
                        this.field1579[this.field1564] = "Add friend @whi@" + var8;
                        this.field1203[this.field1564] = 406;
                        ++this.field1564;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1346 == 0 && (var6 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var8, (byte) 1))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1378 >= 1) {
                            this.field1579[this.field1564] = "Report abuse @whi@" + var8;
                            this.field1203[this.field1564] = 34;
                            ++this.field1564;
                        }
                        this.field1579[this.field1564] = "Add ignore @whi@" + var8;
                        this.field1203[this.field1564] = 436;
                        ++this.field1564;
                        this.field1579[this.field1564] = "Add friend @whi@" + var8;
                        this.field1203[this.field1564] = 406;
                        ++this.field1564;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1579[this.field1564] = "Accept trade @whi@" + var8;
                        this.field1203[this.field1564] = 903;
                        ++this.field1564;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1346 == 0 && this.field1576 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1579[this.field1564] = "Accept duel @whi@" + var8;
                        this.field1203[this.field1564] = 363;
                        ++this.field1564;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZZ)V")
    public final void method534(int arg0, boolean arg1, boolean arg2) {
        signlink.midivol = arg0;
        if (arg2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method535(int arg0) {
        if (arg0 != 0) {
            this.field1244 = this.field1484.method238();
        }
        if (this.field1414 == 0) {
            int var2 = super.field13 / 2 - 80;
            int var3 = super.field14 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field29 == 1 && super.field30 >= var2 - 75 && super.field30 <= var2 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1414 = 3;
                this.field1526 = 0;
            }
            int var4 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var4 - 75 && super.field30 <= var4 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1508 = "";
                this.field1509 = "Enter your username & password.";
                this.field1414 = 2;
                this.field1526 = 0;
            }
        } else if (this.field1414 == 2) {
            int var5 = super.field14 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field29 == 1 && super.field31 >= var16 - 15 && super.field31 < var16) {
                this.field1526 = 0;
            }
            var5 = var16 + 15;
            if (super.field29 == 1 && super.field31 >= var5 - 15 && super.field31 < var5) {
                this.field1526 = 1;
            }
            var5 += 15;
            int var6 = super.field13 / 2 - 80;
            int var7 = super.field14 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field29 == 1 && super.field30 >= var6 - 75 && super.field30 <= var6 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.method448(this.field1577, this.field1578, false);
                if (this.field1361) {
                    return;
                }
            }
            int var8 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var8 - 75 && super.field30 <= var8 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.field1414 = 0;
                this.field1577 = "";
                this.field1578 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(9);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1224.length(); ++var11) {
                        if (var9 == field1224.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1526 == 0) {
                        if (var9 == 8 && this.field1577.length() > 0) {
                            this.field1577 = this.field1577.substring(0, this.field1577.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1526 = 1;
                        }
                        if (var10) {
                            this.field1577 = this.field1577 + (char) var9;
                        }
                        if (this.field1577.length() > 12) {
                            this.field1577 = this.field1577.substring(0, 12);
                        }
                    } else if (this.field1526 == 1) {
                        if (var9 == 8 && this.field1578.length() > 0) {
                            this.field1578 = this.field1578.substring(0, this.field1578.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1526 = 0;
                        }
                        if (var10) {
                            this.field1578 = this.field1578 + (char) var9;
                        }
                        if (this.field1578.length() > 20) {
                            this.field1578 = this.field1578.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1414 == 3) {
                int var12 = super.field13 / 2;
                int var13 = super.field14 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field29 == 1 && super.field30 >= var12 - 75 && super.field30 <= var12 + 75 && super.field31 >= var18 - 20 && super.field31 <= var18 + 20) {
                    this.field1414 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)V")
    public final void method536(int arg0, int arg1) {
        LinkList var3 = this.field1432[this.field1479][arg0][arg1];
        if (var3 == null) {
            this.field1258.method84(this.field1479, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method257(); var6 != null; var6 = (ObjStackEntity) var3.method259(-976)) {
                ObjType var11 = ObjType.method348(var6.field500);
                int var12 = var11.field1044;
                if (var11.field1043) {
                    var12 = (var6.field501 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method255(var5, (byte) 80);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method257(); var9 != null; var9 = (ObjStackEntity) var3.method259(-976)) {
                if (var5.field500 != var9.field500 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field500 != var9.field500 && var7.field500 != var9.field500 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1258.method70(var10, false, this.method473(false, arg1 * 128 + 64, this.field1479, arg0 * 128 + 64), arg0, arg1, var8, var5, this.field1479, var7);
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method537(int arg0) {
        try {
            this.field1265 = -1;
            this.field1591.method261();
            this.field1573.method261();
            Pix3D.method179(7);
            this.method481(true);
            this.field1258.method63(0);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1554[var2].method359((byte) 0);
            }
            System.gc();
            World var3 = new World(true, this.field1409, this.field1281, 104, 104);
            int var4 = this.field1268.length;
            World.field45 = World3D.field295;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1405[var5] >> 8;
                int var7 = this.field1405[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field45 = false;
                }
            }
            if (World.field45) {
                this.field1258.method64(-229, this.field1479);
            } else {
                this.field1258.method64(-229, 0);
            }
            this.field1404.method227(107, this.field1496);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1405[var8] >> 8) * 64 - this.field1340;
                int var10 = (this.field1405[var8] & 255) * 64 - this.field1341;
                byte[] var11 = this.field1268[var8];
                if (var11 != null) {
                    var3.method15(this.field1357, var11, var9, var10, (this.field1589 - 6) * 8, (this.field1590 - 6) * 8);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1405[var12] >> 8) * 64 - this.field1340;
                int var14 = (this.field1405[var12] & 255) * 64 - this.field1341;
                byte[] var15 = this.field1268[var12];
                if (var15 == null && this.field1590 < 800) {
                    var3.method14(var13, var14, 64, true, 64);
                }
            }
            this.field1404.method227(107, this.field1496);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1311[var16];
                if (var17 != null) {
                    int var18 = (this.field1405[var16] >> 8) * 64 - this.field1340;
                    int var19 = (this.field1405[var16] & 255) * 64 - this.field1341;
                    var3.method18(var19, this.field1258, this.field1554, var18, true, var17);
                }
            }
            this.field1404.method227(107, this.field1496);
            var3.method20(this.field1258, this.field1554, false);
            this.field1517.method267(212);
            this.field1404.method227(107, this.field1496);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method536(var20, var21);
                }
            }
            this.method513(-592);
        } catch (Exception var34) {
        }
        LocType.field979.method116();
        if (arg0 >= 0) {
            field1282 = !field1282;
        }
        if (field1401 && signlink.cache_dat != null) {
            int var23 = this.field1525.method281(0, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1525.method286(-250, var24);
                if ((var25 & 121) == 0) {
                    Model.method137(-209, var24);
                }
            }
        }
        System.gc();
        Pix3D.method180(field1545, 20);
        this.field1525.method292(0);
        int var26 = (this.field1589 - 6) / 8 - 1;
        int var27 = (this.field1589 + 6) / 8 + 1;
        int var28 = (this.field1590 - 6) / 8 - 1;
        int var29 = (this.field1590 + 6) / 8 + 1;
        if (this.field1507) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1525.method283(var31, var30, 0, field1543);
                    if (var32 != -1) {
                        this.field1525.method293(3, var32, -938);
                    }
                    int var33 = this.field1525.method283(var31, var30, 1, field1543);
                    if (var33 != -1) {
                        this.field1525.method293(3, var33, -938);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method538(int arg0) {
        short var2 = 256;
        if (this.field1292 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1292 > 768) {
                    this.field1215[var3] = this.method461((byte) 8, 1024 - this.field1292, this.field1216[var3], this.field1217[var3]);
                } else if (this.field1292 > 256) {
                    this.field1215[var3] = this.field1217[var3];
                } else {
                    this.field1215[var3] = this.method461((byte) 8, 256 - this.field1292, this.field1217[var3], this.field1216[var3]);
                }
            }
        } else if (this.field1293 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1293 > 768) {
                    this.field1215[var4] = this.method461((byte) 8, 1024 - this.field1293, this.field1216[var4], this.field1218[var4]);
                } else if (this.field1293 > 256) {
                    this.field1215[var4] = this.field1218[var4];
                } else {
                    this.field1215[var4] = this.method461((byte) 8, 256 - this.field1293, this.field1218[var4], this.field1216[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1215[var5] = this.field1216[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1367.field757[var6] = this.field1269.field670[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1540[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1571[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1215[var26];
                    int var30 = this.field1367.field757[var8];
                    this.field1367.field757[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 == 25630) {
            this.field1367.method268(super.field15, 0, (byte) 55, 0);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field1368.field757[var10] = this.field1270.field670[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field1540[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field1571[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field1215[var18];
                        int var22 = this.field1368.field757[var16];
                        this.field1368.field757[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field1368.method268(super.field15, 0, (byte) 55, 637);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method539(byte arg0, int arg1) {
        int[] var3 = this.field1463.field670;
        int var4 = var3.length;
        if (arg0 != -24) {
            this.field1244 = -1;
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1281[arg1][var24][var6] & 24) == 0) {
                    this.field1258.method98(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1281[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1258.method98(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1463.method193(212);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1281[arg1][var22][var9] & 24) == 0) {
                    this.method529(var9, arg1, (byte) -24, var8, var7, var22);
                }
                if (arg1 < 3 && (this.field1281[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method529(var9, arg1 + 1, (byte) -24, var8, var7, var22);
                }
            }
        }
        this.field1517.method267(212);
        this.field1210 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1258.method92(this.field1479, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method333(var13).field967;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1554[this.field1479].field1083;
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
                        this.field1448[this.field1210] = this.field1566[var14];
                        this.field1211[this.field1210] = var15;
                        this.field1212[this.field1210] = var16;
                        ++this.field1210;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method540(boolean arg0) {
        if (this.field1364 == null) {
            super.field16 = null;
            this.field1518 = null;
            this.field1516 = null;
            this.field1515 = null;
            this.field1517 = null;
            this.field1325 = null;
            this.field1326 = null;
            this.field1327 = null;
            this.field1367 = new PixMap(this.method11(3), 265, 128, 2);
            Pix2D.method167(false);
            this.field1368 = new PixMap(this.method11(3), 265, 128, 2);
            this.field1361 &= arg0;
            Pix2D.method167(false);
            this.field1364 = new PixMap(this.method11(3), 171, 509, 2);
            Pix2D.method167(false);
            this.field1365 = new PixMap(this.method11(3), 132, 360, 2);
            Pix2D.method167(false);
            this.field1366 = new PixMap(this.method11(3), 200, 360, 2);
            Pix2D.method167(false);
            this.field1369 = new PixMap(this.method11(3), 238, 202, 2);
            Pix2D.method167(false);
            this.field1370 = new PixMap(this.method11(3), 238, 203, 2);
            Pix2D.method167(false);
            this.field1371 = new PixMap(this.method11(3), 94, 74, 2);
            Pix2D.method167(false);
            this.field1372 = new PixMap(this.method11(3), 94, 75, 2);
            Pix2D.method167(false);
            if (this.field1390 != null) {
                this.method435(true);
                this.method495(field1374);
            }
            this.field1483 = true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method541(byte arg0) {
        int var2 = this.field1443.method215("Choose Option", (byte) 4);
        if (arg0 == 2) {
            for (int var3 = 0; var3 < this.field1564; ++var3) {
                int var11 = this.field1443.method215(this.field1579[var3], (byte) 4);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field1564 * 15 + 21;
            if (super.field30 > 4 && super.field31 > 4 && super.field30 < 516 && super.field31 < 338) {
                int var5 = super.field30 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field31 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field1356 = true;
                this.field1455 = 0;
                this.field1456 = var5;
                this.field1457 = var6;
                this.field1458 = var2;
                this.field1459 = this.field1564 * 15 + 22;
            }
            if (super.field30 > 553 && super.field31 > 205 && super.field30 < 743 && super.field31 < 466) {
                int var7 = super.field30 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field31 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field1356 = true;
                this.field1455 = 1;
                this.field1456 = var7;
                this.field1457 = var8;
                this.field1458 = var2;
                this.field1459 = this.field1564 * 15 + 22;
            }
            if (super.field30 > 17 && super.field31 > 357 && super.field30 < 496 && super.field31 < 453) {
                int var9 = super.field30 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field31 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field1356 = true;
                this.field1455 = 2;
                this.field1456 = var9;
                this.field1457 = var10;
                this.field1458 = var2;
                this.field1459 = this.field1564 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IZIIIIII)V")
    public final void method542(Component arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 < 0) {
            if (this.field1249) {
                this.field1594 = 32;
            } else {
                this.field1594 = 0;
            }
            this.field1249 = false;
            if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
                arg0.field93 -= this.field1582 * 4;
                if (arg2) {
                    this.field1221 = true;
                    return;
                }
            } else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 + arg4 - 16 && arg3 < arg1 + arg4) {
                arg0.field93 += this.field1582 * 4;
                if (arg2) {
                    this.field1221 = true;
                    return;
                }
            } else {
                if (arg6 < arg7 - this.field1594 || arg6 >= arg7 + 16 + this.field1594 || arg3 < arg1 + 16 || arg3 >= arg1 + arg4 - 16 || this.field1582 <= 0) {
                    return;
                }
                int var10 = (arg4 - 32) * arg4 / arg5;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg3 - arg1 - 16 - var10 / 2;
                int var12 = arg4 - 32 - var10;
                arg0.field93 = (arg5 - arg4) * var11 / var12;
                if (arg2) {
                    this.field1221 = true;
                }
                this.field1249 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method543(Packet arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1404.method228(201);
        }
        while (arg0.field720 + 10 < arg1 * 8) {
            int var4 = arg0.method249(9, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field1285[var4] == null) {
                this.field1285[var4] = new PlayerEntity();
                if (this.field1290[var4] != null) {
                    this.field1285[var4].method129(this.field1290[var4], -323);
                }
            }
            this.field1287[this.field1286++] = var4;
            PlayerEntity var5 = this.field1285[var4];
            var5.field449 = field1588;
            int var6 = arg0.method249(9, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method249(9, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method249(9, 1);
            var5.method123(var8 == 1, field1428.field453[0] + var6, field1428.field454[0] + var7, this.field1523);
            int var9 = arg0.method249(9, 1);
            if (var9 == 1) {
                this.field1289[this.field1288++] = var4;
            }
        }
        arg0.method250(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;I)V")
    public final void method544(int arg0, int arg1, int arg2, Component arg3, int arg4) {
        if (arg3.field80 == 0 && arg3.field95 != null) {
            if (!arg3.field94 || this.field1541 == arg3.field78 || this.field1618 == arg3.field78 || this.field1490 == arg3.field78) {
                int var6 = Pix2D.field632;
                int var7 = Pix2D.field630;
                int var8 = Pix2D.field633;
                int var9 = Pix2D.field631;
                this.field1243 += arg1;
                Pix2D.method166(arg3.field83 + arg4, arg3.field84 + arg2, this.field1611, arg2, arg4);
                int var10 = arg3.field95.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field96[var11] + arg4;
                    int var13 = arg3.field97[var11] + arg2 - arg0;
                    Component var14 = Component.field73[arg3.field95[var11]];
                    int var15 = var14.field86 + var12;
                    int var16 = var14.field87 + var13;
                    if (var14.field82 > 0) {
                        this.method433(var14, (byte) 102);
                    }
                    if (var14.field80 == 0) {
                        if (var14.field93 > var14.field92 - var14.field84) {
                            var14.field93 = var14.field92 - var14.field84;
                        }
                        if (var14.field93 < 0) {
                            var14.field93 = 0;
                        }
                        this.method544(var14.field93, 0, var16, var14, var15);
                        if (var14.field92 > var14.field84) {
                            this.method551(var14.field83 + var15, var14.field92, var16, var14.field93, (byte) 9, var14.field84);
                        }
                    } else if (var14.field80 != 1) {
                        if (var14.field80 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field84; ++var18) {
                                for (int var19 = 0; var19 < var14.field83; ++var19) {
                                    int var20 = (var14.field103 + 32) * var19 + var15;
                                    int var21 = (var14.field104 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field106[var17];
                                        var21 += var14.field107[var17];
                                    }
                                    if (var14.field74[var17] <= 0) {
                                        if (var14.field105 != null && var17 < 20) {
                                            Pix32 var30 = var14.field105[var17];
                                            if (var30 != null) {
                                                var30.method198((byte) 9, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field74[var17] - 1;
                                        if (var20 > Pix2D.field632 - 32 && var20 < Pix2D.field633 && var21 > Pix2D.field630 - 32 && var21 < Pix2D.field631 || this.field1261 != 0 && this.field1260 == var17) {
                                            int var25 = 0;
                                            if (this.field1497 == 1 && this.field1498 == var17 && this.field1499 == var14.field78) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(var25, var14.field75[var17], var24, 723);
                                            if (var26 != null) {
                                                if (this.field1261 != 0 && this.field1260 == var17 && this.field1259 == var14.field78) {
                                                    var22 = super.field23 - this.field1262;
                                                    var23 = super.field24 - this.field1263;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1254 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method200(var20 + var22, 128, 953, var21 + var23);
                                                    if (var21 + var23 < Pix2D.field630 && arg3.field93 > 0) {
                                                        int var27 = (Pix2D.field630 - var21 - var23) * this.field1488 / 3;
                                                        if (var27 > this.field1488 * 10) {
                                                            var27 = this.field1488 * 10;
                                                        }
                                                        if (var27 > arg3.field93) {
                                                            var27 = arg3.field93;
                                                        }
                                                        arg3.field93 -= var27;
                                                        this.field1263 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field631 && arg3.field93 < arg3.field92 - arg3.field84) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field631) * this.field1488 / 3;
                                                        if (var28 > this.field1488 * 10) {
                                                            var28 = this.field1488 * 10;
                                                        }
                                                        if (var28 > arg3.field92 - arg3.field84 - arg3.field93) {
                                                            var28 = arg3.field92 - arg3.field84 - arg3.field93;
                                                        }
                                                        arg3.field93 += var28;
                                                        this.field1263 -= var28;
                                                    }
                                                } else if (this.field1300 != 0 && this.field1299 == var17 && this.field1298 == var14.field78) {
                                                    var26.method200(var20, 128, 953, var21);
                                                } else {
                                                    var26.method198((byte) 9, var20, var21);
                                                }
                                                if (var26.field675 == 33 || var14.field75[var17] != 1) {
                                                    int var29 = var14.field75[var17];
                                                    this.field1441.method216(method528(1, var29), 0, (byte) 8, var21 + 10 + var23, var20 + 1 + var22);
                                                    this.field1441.method216(method528(1, var29), 16776960, (byte) 8, var21 + 9 + var23, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field80 == 3) {
                            if (var14.field85 == 0) {
                                if (var14.field109) {
                                    Pix2D.method169(0, var14.field115, var14.field83, var14.field84, var15, var16);
                                } else {
                                    Pix2D.method170(var14.field84, var14.field83, var14.field115, var15, 901, var16);
                                }
                            } else if (var14.field109) {
                                Pix2D.method168(var16, 256 - (var14.field85 & 255), var14.field84, var14.field83, var14.field115, var15, (byte) -30);
                            } else {
                                Pix2D.method171(var14.field84, var14.field115, var15, var16, var14.field83, true, 256 - (var14.field85 & 255));
                            }
                        } else if (var14.field80 == 4) {
                            PixFont var31 = var14.field112;
                            int var32 = var14.field115;
                            String var33 = var14.field113;
                            if ((this.field1490 == var14.field78 || this.field1618 == var14.field78 || this.field1541 == var14.field78) && var14.field117 != 0) {
                                var32 = var14.field117;
                            }
                            if (this.method516(var14, 551)) {
                                var32 = var14.field116;
                                if (var14.field114.length() > 0) {
                                    var33 = var14.field114;
                                }
                            }
                            if (var14.field81 == 6 && this.field1613) {
                                var33 = "Please wait...";
                                var32 = var14.field115;
                            }
                            if (Pix2D.field628 == 479) {
                                if (var32 == 16776960) {
                                    var32 = 255;
                                }
                                if (var32 == 49152) {
                                    var32 = 16777215;
                                }
                            }
                            int var34 = var31.field704 + var16;
                            while (var33.length() > 0) {
                                if (var33.indexOf("%") != -1) {
                                    label311: while (true) {
                                        int var35 = var33.indexOf("%1");
                                        if (var35 == -1) {
                                            while (true) {
                                                int var36 = var33.indexOf("%2");
                                                if (var36 == -1) {
                                                    while (true) {
                                                        int var37 = var33.indexOf("%3");
                                                        if (var37 == -1) {
                                                            while (true) {
                                                                int var38 = var33.indexOf("%4");
                                                                if (var38 == -1) {
                                                                    while (true) {
                                                                        int var39 = var33.indexOf("%5");
                                                                        if (var39 == -1) {
                                                                            break label311;
                                                                        }
                                                                        var33 = var33.substring(0, var39) + this.method519(this.method526(var14, 52, 4), -218) + var33.substring(var39 + 2);
                                                                    }
                                                                }
                                                                var33 = var33.substring(0, var38) + this.method519(this.method526(var14, 52, 3), -218) + var33.substring(var38 + 2);
                                                            }
                                                        }
                                                        var33 = var33.substring(0, var37) + this.method519(this.method526(var14, 52, 2), -218) + var33.substring(var37 + 2);
                                                    }
                                                }
                                                var33 = var33.substring(0, var36) + this.method519(this.method526(var14, 52, 1), -218) + var33.substring(var36 + 2);
                                            }
                                        }
                                        var33 = var33.substring(0, var35) + this.method519(this.method526(var14, 52, 0), -218) + var33.substring(var35 + 2);
                                    }
                                }
                                int var40 = var33.indexOf("\\n");
                                String var41;
                                if (var40 != -1) {
                                    var41 = var33.substring(0, var40);
                                    var33 = var33.substring(var40 + 2);
                                } else {
                                    var41 = var33;
                                    var33 = "";
                                }
                                if (var14.field110) {
                                    var31.method214(var14.field83 / 2 + var15, var14.field111, var41, true, var34, var32);
                                } else {
                                    var31.method218(var32, var15, var14.field111, false, var34, var41);
                                }
                                var34 += var31.field704;
                            }
                        } else if (var14.field80 == 5) {
                            Pix32 var42;
                            if (this.method516(var14, 551)) {
                                var42 = var14.field119;
                            } else {
                                var42 = var14.field118;
                            }
                            if (var42 != null) {
                                var42.method198((byte) 9, var15, var16);
                            }
                        } else if (var14.field80 == 6) {
                            int var43 = Pix3D.field647;
                            int var44 = Pix3D.field648;
                            Pix3D.field647 = var14.field83 / 2 + var15;
                            Pix3D.field648 = var14.field84 / 2 + var16;
                            int var45 = Pix3D.field651[var14.field127] * var14.field126 >> 16;
                            int var46 = Pix3D.field652[var14.field127] * var14.field126 >> 16;
                            boolean var47 = this.method516(var14, 551);
                            int var48;
                            if (var47) {
                                var48 = var14.field125;
                            } else {
                                var48 = var14.field124;
                            }
                            Model var49;
                            if (var48 == -1) {
                                var49 = var14.method34((byte) 0, -1, -1, var47);
                            } else {
                                SeqType var50 = SeqType.field1120[var48];
                                var49 = var14.method34((byte) 0, var50.field1122[var14.field76], var50.field1123[var14.field76], var47);
                            }
                            if (var49 != null) {
                                var49.method158(0, var14.field128, 0, var14.field127, 0, var45, var46);
                            }
                            Pix3D.field647 = var43;
                            Pix3D.field648 = var44;
                        } else if (var14.field80 == 7) {
                            PixFont var51 = var14.field112;
                            int var52 = 0;
                            for (int var53 = 0; var53 < var14.field84; ++var53) {
                                for (int var54 = 0; var54 < var14.field83; ++var54) {
                                    if (var14.field74[var52] > 0) {
                                        ObjType var55 = ObjType.method348(var14.field74[var52] - 1);
                                        String var56 = var55.field1031;
                                        if (var55.field1043 || var14.field75[var52] != 1) {
                                            var56 = var56 + " x" + method459(5, var14.field75[var52]);
                                        }
                                        int var57 = (var14.field103 + 115) * var54 + var15;
                                        int var58 = (var14.field104 + 12) * var53 + var16;
                                        if (var14.field110) {
                                            var51.method214(var14.field83 / 2 + var57, var14.field111, var56, true, var58, var14.field115);
                                        } else {
                                            var51.method218(var14.field115, var57, var14.field111, false, var58, var56);
                                        }
                                    }
                                    ++var52;
                                }
                            }
                        }
                    }
                }
                Pix2D.method166(var8, var9, this.field1611, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method545(byte arg0) {
        Graphics var2 = this.method11(3).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, 400);
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field1244 = this.field1484.method238();
        }
        if (this.field1437) {
            this.field1452 = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            byte var4 = 35;
            var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
            int var6 = var4 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var6);
            int var7 = var6 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
            int var8 = var7 + 30;
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
            int var9 = var8 + 30;
            var2.drawString("3: Try using a different game-world", 30, var9);
            int var11 = var9 + 30;
            var2.drawString("4: Try rebooting your computer", 30, var11);
            int var13 = var11 + 30;
            var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
        }
        if (this.field1503) {
            this.field1452 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1450) {
            this.field1452 = false;
            var2.setColor(Color.yellow);
            byte var5 = 35;
            var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
            int var10 = var5 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var10);
            int var12 = var10 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
            int var14 = var12 + 30;
            var2.drawString("2: Try rebooting your computer, and reloading", 30, var14);
            int var15 = var14 + 30;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method546(boolean arg0) {
        if (this.field1592 > 1) {
            --this.field1592;
        }
        if (this.field1247 > 0) {
            --this.field1247;
        }
        if (this.field1264 > 0) {
            this.field1264 -= 2;
        }
        for (int var2 = 0; var2 < 5 && this.method524(-35584); ++var2) {
        }
        if (this.field1361) {
            this.method548((byte) 6);
            this.method530(-63);
            this.method482(-563);
            Packet var3 = InputTracking.method46(3);
            if (var3 != null) {
                this.field1404.method227(217, this.field1496);
                this.field1404.method229(var3.field719);
                this.field1404.method236(var3.field719, 0, 0, var3.field718);
                var3.method226(7290);
            }
            ++this.field1245;
            if (this.field1245 > 750) {
                this.method429(0);
            }
            this.method490(20697);
            this.method437(0);
            this.method494(8);
            ++this.field1488;
            if (this.field1603 != 0) {
                this.field1602 += 20;
                if (this.field1602 >= 400) {
                    this.field1603 = 0;
                }
            }
            if (this.field1300 != 0) {
                ++this.field1297;
                if (this.field1297 >= 15) {
                    if (this.field1300 == 2) {
                        this.field1221 = true;
                    }
                    if (this.field1300 == 3) {
                        this.field1236 = true;
                    }
                    this.field1300 = 0;
                }
            }
            if (this.field1261 != 0) {
                ++this.field1254;
                if (super.field23 > this.field1262 + 5 || super.field23 < this.field1262 - 5 || super.field24 > this.field1263 + 5 || super.field24 < this.field1263 - 5) {
                    this.field1232 = true;
                }
                if (super.field22 == 0) {
                    if (this.field1261 == 2) {
                        this.field1221 = true;
                    }
                    if (this.field1261 == 3) {
                        this.field1236 = true;
                    }
                    this.field1261 = 0;
                    if (this.field1232 && this.field1254 >= 5) {
                        this.field1532 = -1;
                        this.method451(-346);
                        if (this.field1532 == this.field1259 && this.field1531 != this.field1260) {
                            Component var4 = Component.field73[this.field1259];
                            byte var5 = 0;
                            if (this.field1551 == 1 && var4.field82 == 206) {
                                var5 = 1;
                            }
                            if (var4.field74[this.field1531] <= 0) {
                                var5 = 0;
                            }
                            if (var5 == 1) {
                                int var6 = this.field1260;
                                int var7 = this.field1531;
                                while (var6 != var7) {
                                    if (var6 > var7) {
                                        var4.method33(var6, false, var6 - 1);
                                        --var6;
                                    } else if (var6 < var7) {
                                        var4.method33(var6, false, var6 + 1);
                                        ++var6;
                                    }
                                }
                            } else {
                                var4.method33(this.field1260, false, this.field1531);
                            }
                            this.field1404.method227(81, this.field1496);
                            this.field1404.method229(this.field1259);
                            this.field1404.method229(this.field1260);
                            this.field1404.method229(this.field1531);
                            this.field1404.method228(var5);
                        }
                    } else if ((this.field1522 == 1 || this.method487(this.field1564 - 1, true)) && this.field1564 > 2) {
                        this.method541((byte) 2);
                    } else if (this.field1564 > 0) {
                        this.method512(this.field1564 - 1, 0);
                    }
                    this.field1297 = 10;
                    super.field29 = 0;
                }
            }
            ++field1598;
            if (field1598 > 127) {
                field1598 = 0;
                this.field1404.method227(144, this.field1496);
                this.field1404.method231(4991788);
            }
            if (World3D.field329 != -1) {
                int var8 = World3D.field329;
                int var9 = World3D.field330;
                boolean var10 = this.method515(false, 0, field1428.field454[0], 0, 0, true, 0, var8, 0, var9, 0, field1428.field453[0]);
                World3D.field329 = -1;
                if (var10) {
                    this.field1600 = super.field30;
                    this.field1601 = super.field31;
                    this.field1603 = 1;
                    this.field1602 = 0;
                }
            }
            if (super.field29 == 1 && this.field1199 != null) {
                this.field1199 = null;
                this.field1236 = true;
                super.field29 = 0;
            }
            this.method434(9);
            this.method496(374);
            this.method430(10370);
            this.method432((byte) -119);
            if (super.field22 == 1 || super.field29 == 1) {
                ++this.field1582;
            }
            if (this.field1527 == 2) {
                this.method514(3);
            }
            if (this.field1527 == 2 && this.field1471) {
                this.method505(5);
            }
            for (int var11 = 0; var11 < 5; ++var11) {
                int var10002 = this.field1257[var11]++;
            }
            this.method508(false);
            ++super.field21;
            if (super.field21 > 4500) {
                this.field1247 = 250;
                super.field21 -= 500;
                this.field1404.method227(146, this.field1496);
            }
            ++this.field1383;
            if (this.field1383 > 500) {
                this.field1383 = 0;
                int var12 = (int) (Math.random() * 8.0D);
                if ((var12 & 1) == 1) {
                    this.field1485 += this.field1486;
                }
                if ((var12 & 2) == 2) {
                    this.field1266 += this.field1267;
                }
                if ((var12 & 4) == 4) {
                    this.field1227 += this.field1228;
                }
            }
            if (this.field1485 < -50) {
                this.field1486 = 2;
            }
            if (this.field1485 > 50) {
                this.field1486 = -2;
            }
            if (this.field1266 < -55) {
                this.field1267 = 2;
            }
            if (this.field1266 > 55) {
                this.field1267 = -2;
            }
            if (this.field1227 < -40) {
                this.field1228 = 1;
            }
            if (this.field1227 > 40) {
                this.field1228 = -1;
            }
            ++this.field1482;
            if (this.field1482 > 500) {
                this.field1482 = 0;
                int var13 = (int) (Math.random() * 8.0D);
                if ((var13 & 1) == 1) {
                    this.field1533 += this.field1534;
                }
                if ((var13 & 2) == 2) {
                    this.field1330 += this.field1331;
                }
            }
            if (this.field1533 < -60) {
                this.field1534 = 2;
            }
            if (this.field1533 > 60) {
                this.field1534 = -2;
            }
            if (this.field1330 < -20) {
                this.field1331 = 1;
            }
            if (this.field1330 > 10) {
                this.field1331 = -1;
            }
            ++field1194;
            if (field1194 > 110) {
                field1194 = 0;
                this.field1404.method227(41, this.field1496);
                this.field1404.method232(0);
            }
            ++this.field1246;
            if (arg0) {
                this.field1244 = this.field1484.method238();
            }
            if (this.field1246 > 50) {
                this.field1404.method227(107, this.field1496);
            }
            try {
                if (this.field1274 != null && this.field1404.field719 > 0) {
                    this.field1274.method42(this.field1404.field719, true, 0, this.field1404.field718);
                    this.field1404.field719 = 0;
                    this.field1246 = 0;
                }
            } catch (IOException var15) {
                this.method429(0);
            } catch (Exception var16) {
                this.method476(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1450 && !this.field1437 && !this.field1503) {
            ++field1588;
            if (!this.field1361) {
                this.method535(0);
            } else {
                this.method546(false);
            }
            this.method460((byte) 71);
            this.field1243 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILmb;)V")
    private final void method547(int arg0, int arg1, Packet arg2) {
        this.field1322 = 0;
        this.field1288 = 0;
        this.method458(arg1, arg2, 515);
        if (arg0 <= 0) {
            this.field1404.method228(74);
        }
        this.method499(arg1, arg2, 5);
        this.method543(arg2, arg1, 0);
        this.method478(arg2, arg1, (byte) 7);
        for (int var4 = 0; var4 < this.field1322; ++var4) {
            int var6 = this.field1323[var4];
            if (field1588 != this.field1285[var6].field449) {
                this.field1285[var6] = null;
            }
        }
        if (arg2.field719 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field719 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1286; ++var5) {
                if (this.field1285[this.field1287[var5]] == null) {
                    signlink.reporterror(this.field1577 + " null entry in pl list - pos:" + var5 + " size:" + this.field1286);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method548(byte arg0) {
        if (arg0 != 6) {
            this.field1244 = -1;
        }
        if (field1401 && this.field1527 == 2 && World.field46 != this.field1479) {
            this.field1517.method267(212);
            this.field1442.method213(257, 1, 0, "Loading - please wait.", 151);
            this.field1442.method213(256, 1, 16777215, "Loading - please wait.", 150);
            this.field1517.method268(super.field15, 4, (byte) 55, 4);
            this.field1527 = 1;
            this.field1489 = System.currentTimeMillis();
        }
        if (this.field1527 == 1) {
            int var2 = this.method549(-216);
            if (var2 != 0 && System.currentTimeMillis() - this.field1489 > 360000L) {
                signlink.reporterror(this.field1577 + " glcfb " + this.field1387 + "," + var2 + "," + field1401 + "," + this.field1231[0] + "," + this.field1525.method289() + "," + this.field1479 + "," + this.field1589 + "," + this.field1590);
                this.field1489 = System.currentTimeMillis();
            }
        }
        if (this.field1527 == 2 && this.field1479 != this.field1265) {
            this.field1265 = this.field1479;
            this.method539((byte) -24, this.field1479);
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)I")
    public final int method549(int arg0) {
        for (int var2 = 0; var2 < this.field1268.length; ++var2) {
            if (this.field1268[var2] == null && this.field1406[var2] != -1) {
                return -1;
            }
            if (this.field1311[var2] == null && this.field1407[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1268.length; ++var4) {
            byte[] var5 = this.field1311[var4];
            if (var5 != null) {
                int var6 = (this.field1405[var4] >> 8) * 64 - this.field1340;
                int var7 = (this.field1405[var4] & 255) * 64 - this.field1341;
                var3 &= World.method16(var6, var7, var5, true);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1615) {
            return -4;
        } else {
            this.field1527 = 2;
            World.field46 = this.field1479;
            if (arg0 >= 0) {
                return this.field1250;
            } else {
                this.method537(-732);
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (this.field1346 != 0) {
            int var2 = 0;
            if (arg0 != 0) {
                this.field1432 = null;
            }
            if (this.field1592 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1431[var3] != null) {
                    int var4 = this.field1429[var3];
                    String var5 = this.field1430[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var5, (byte) 1))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field23 > 4 && super.field23 < 516 && super.field24 - 4 > var9 - 10 && super.field24 - 4 <= var9 + 3) {
                            if (this.field1378 >= 1) {
                                this.field1579[this.field1564] = "Report abuse @whi@" + var5;
                                this.field1203[this.field1564] = 2034;
                                ++this.field1564;
                            }
                            this.field1579[this.field1564] = "Add ignore @whi@" + var5;
                            this.field1203[this.field1564] = 2436;
                            ++this.field1564;
                            this.field1579[this.field1564] = "Add friend @whi@" + var5;
                            this.field1203[this.field1564] = 2406;
                            ++this.field1564;
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1576 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBI)V")
    public final void method551(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.field1197.method211((byte) 9, arg0, arg2);
        this.field1198.method211((byte) 9, arg0, arg2 + arg5 - 16);
        Pix2D.method169(0, this.field1304, 16, arg5 - 32, arg0, arg2 + 16);
        int var7 = (arg5 - 32) * arg5 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg3 / (arg1 - arg5);
        Pix2D.method169(0, this.field1280, 16, var7, arg0, arg2 + 16 + var8);
        if (arg4 == 9) {
            boolean var9 = false;
        } else {
            this.field1523 = this.field1537.method304();
        }
        Pix2D.method174(arg0, this.field1535, arg2 + 16 + var8, var7, this.field1421);
        Pix2D.method174(arg0 + 1, this.field1535, arg2 + 16 + var8, var7, this.field1421);
        Pix2D.method172(this.field1535, arg2 + 16 + var8, 16, arg0, this.field1220);
        Pix2D.method172(this.field1535, arg2 + 17 + var8, 16, arg0, this.field1220);
        Pix2D.method174(arg0 + 15, this.field1276, arg2 + 16 + var8, var7, this.field1421);
        Pix2D.method174(arg0 + 14, this.field1276, arg2 + 17 + var8, var7 - 1, this.field1421);
        Pix2D.method172(this.field1276, arg2 + 15 + var8 + var7, 16, arg0, this.field1220);
        Pix2D.method172(this.field1276, arg2 + 14 + var8 + var7, 15, arg0 + 1, this.field1220);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method552(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != 6) {
            field1374 = 76;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLjb;I)V")
    public final void method553(int arg0, boolean arg1, Pix32 arg2, int arg3) {
        int var5 = this.field1560 + this.field1533 & 2047;
        if (arg1) {
            this.field1604 = -474;
        }
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field606[var5];
            int var8 = Model.field607[var5];
            int var9 = var7 * 256 / (this.field1330 + 256);
            int var10 = var8 * 256 / (this.field1330 + 256);
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method204(this.field1446, false, var11 + 94 - arg2.field675 / 2 + 4, 83 - var12 - arg2.field676 / 2 - 4);
            } else {
                arg2.method198((byte) 9, var11 + 94 - arg2.field675 / 2 + 4, 83 - var12 - arg2.field676 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILbb;)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (field1428 != arg4) {
            if (this.field1564 < 400) {
                String var6 = arg4.field465 + method469(arg4.field471, 31733, field1428.field471) + " (level-" + arg4.field471 + ")";
                if (this.field1497 == 1) {
                    this.field1579[this.field1564] = "Use " + this.field1501 + " with @whi@" + var6;
                    this.field1203[this.field1564] = 367;
                    this.field1204[this.field1564] = arg0;
                    this.field1201[this.field1564] = arg1;
                    this.field1202[this.field1564] = arg3;
                    ++this.field1564;
                } else if (this.field1307 == 1) {
                    if ((this.field1309 & 8) == 8) {
                        this.field1579[this.field1564] = this.field1310 + " @whi@" + var6;
                        this.field1203[this.field1564] = 651;
                        this.field1204[this.field1564] = arg0;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg3;
                        ++this.field1564;
                    }
                } else {
                    this.field1579[this.field1564] = "Follow @whi@" + var6;
                    this.field1203[this.field1564] = 1544;
                    this.field1204[this.field1564] = arg0;
                    this.field1201[this.field1564] = arg1;
                    this.field1202[this.field1564] = arg3;
                    ++this.field1564;
                    if (this.field1360 == 0) {
                        this.field1579[this.field1564] = "Trade with @whi@" + var6;
                        this.field1203[this.field1564] = 1373;
                        this.field1204[this.field1564] = arg0;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg3;
                        ++this.field1564;
                    }
                    if (this.field1410 > 0) {
                        this.field1579[this.field1564] = "Attack @whi@" + var6;
                        if (field1428.field471 >= arg4.field471) {
                            this.field1203[this.field1564] = 151;
                        } else {
                            this.field1203[this.field1564] = 2151;
                        }
                        this.field1204[this.field1564] = arg0;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg3;
                        ++this.field1564;
                    }
                    if (this.field1187 == 1) {
                        this.field1579[this.field1564] = "Fight @whi@" + var6;
                        this.field1203[this.field1564] = 151;
                        this.field1204[this.field1564] = arg0;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg3;
                        ++this.field1564;
                    }
                    if (this.field1187 == 2) {
                        this.field1579[this.field1564] = "Duel-with @whi@" + var6;
                        this.field1203[this.field1564] = 1101;
                        this.field1204[this.field1564] = arg0;
                        this.field1201[this.field1564] = arg1;
                        this.field1202[this.field1564] = arg3;
                        ++this.field1564;
                    }
                }
                for (int var7 = 0; var7 < this.field1564; ++var7) {
                    if (this.field1203[var7] == 660) {
                        this.field1579[var7] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                while (arg2 >= 0) {
                    this.field1244 = this.field1484.method238();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(II)V")
    public final void method555(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1480 = 166;
        }
        if (!field1401) {
            if (Pix3D.field661[17] >= arg0) {
                Pix8 var3 = Pix3D.field655[17];
                int var4 = var3.field686 * var3.field685 - 1;
                int var5 = this.field1488 * var3.field685 * 2;
                byte[] var6 = var3.field683;
                byte[] var7 = this.field1214;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field683 = var7;
                this.field1214 = var6;
                Pix3D.method183(17, (byte) 4);
            }
            if (Pix3D.field661[24] >= arg0) {
                Pix8 var9 = Pix3D.field655[24];
                int var10 = var9.field686 * var9.field685 - 1;
                int var11 = this.field1488 * var9.field685 * 2;
                byte[] var12 = var9.field683;
                byte[] var13 = this.field1214;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field683 = var13;
                this.field1214 = var12;
                Pix3D.method183(24, (byte) 4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method556(int arg0) {
        this.field1358 = true;
        if (arg0 >= 0) {
            this.field1191 = this.field1537.method304();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1452) {
                ++this.field1385;
                this.method557(false);
                this.method557(false);
                this.method538(25630);
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
        this.field1358 = false;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1571[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1571[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1572[var14] = (this.field1571[var14 - 1] + this.field1571[var14 + 1] + this.field1571[var14 - 128] + this.field1571[var14 + 128]) / 4;
            }
        }
        this.field1335 += 128;
        if (arg0) {
            field1282 = !field1282;
        }
        if (this.field1335 > this.field1301.length) {
            this.field1335 -= this.field1301.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method527(this.field1502[var6], (byte) 66);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1572[var11 + 128] - this.field1301[this.field1335 + var11 & this.field1301.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1571[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1540[var8] = this.field1540[var8 + 1];
        }
        this.field1540[var2 - 1] = (int) (Math.sin((double) field1588 / 14.0D) * 16.0D + Math.sin((double) field1588 / 15.0D) * 14.0D + Math.sin((double) field1588 / 16.0D) * 12.0D);
        if (this.field1292 > 0) {
            this.field1292 -= 4;
        }
        if (this.field1293 > 0) {
            this.field1293 -= 4;
        }
        if (this.field1292 == 0 && this.field1293 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1292 = 1024;
            }
            if (var9 == 1) {
                this.field1293 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method558(int arg0, Component arg1) {
        int var3 = arg1.field82;
        if (arg0 >= 0) {
            this.field1244 = this.field1484.method238();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1579[this.field1564] = "Remove @whi@" + arg1.field113;
                this.field1203[this.field1564] = 556;
                ++this.field1564;
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
            this.field1579[this.field1564] = "Remove @whi@" + this.field1556[var3];
            this.field1203[this.field1564] = 557;
            ++this.field1564;
            this.field1579[this.field1564] = "Message @whi@" + this.field1556[var3];
            this.field1203[this.field1564] = 679;
            ++this.field1564;
            return true;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1481[var1] = var0 / 4;
        }
        field1528 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1543 = 5;
        field1545 = -12734;
        field1608 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
