import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1214 = -1;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1215 = -715;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private final int[] field1225 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1226 = -1;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[I")
    public int[] field1227 = new int[2000];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field1228 = false;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Lib;")
    private Pix32[] field1230 = new Pix32[100];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1231 = new int[500];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1232 = new int[500];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1233 = new int[500];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1234 = new int[500];

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1236 = -276;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[Ljb;")
    private Pix8[] field1237 = new Pix8[2];

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1246 = 78;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1247 = new int[151];

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1250 = 6;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[[[I")
    private int[][][] field1251 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    private boolean field1253 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Llb;")
    private Packet field1259 = Packet.method217(1, -14406);

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private boolean field1260 = false;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1265 = -825;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1270 = 1;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Ljava/lang/String;")
    private String[] field1271 = new String[200];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field1273 = new int[50];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field1274 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[Ljava/lang/String;")
    private String[] field1279 = new String[5];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[Z")
    private boolean[] field1280 = new boolean[5];

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1281 = 5063219;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1283 = 2;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[Lvb;")
    public FileStream[] field1284 = new FileStream[5];

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1286 = 3353893;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field1292 = false;

    @OriginalMember(owner = "client", name = "nc", descriptor = "[[I")
    private int[][] field1293 = new int[104][104];

    @OriginalMember(owner = "client", name = "oc", descriptor = "[[[Lob;")
    private LinkList[][][] field1294 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "pc", descriptor = "[J")
    private long[] field1295 = new long[200];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1307 = 8;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    public boolean field1308 = true;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1310 = -398;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[I")
    private int[] field1311 = new int[50];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Z")
    private boolean field1312 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Ljava/lang/String;")
    private String field1313 = "";

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[Ljc;")
    private CollisionMap[] field1314 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1336 = -1;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Ld;")
    private Component field1341 = new Component();

    @OriginalMember(owner = "client", name = "kd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1342 = new CRC32();

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1343 = new int[9];

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1344 = -1;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1345 = -1;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    private boolean field1349 = false;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Z")
    private boolean field1353 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Z")
    private boolean field1355 = false;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[I")
    private int[] field1358 = new int[1000];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field1359 = new int[1000];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Ljava/lang/String;")
    private String field1361 = "";

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1362 = 7759444;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Z")
    private boolean field1364 = false;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field1367 = true;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[Z")
    private boolean[] field1368 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1369 = -318;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1371 = new int[100];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[Ljava/lang/String;")
    private String[] field1372 = new String[100];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[Ljava/lang/String;")
    private String[] field1373 = new String[100];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[Lib;")
    private Pix32[] field1379 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    private boolean field1386 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1388 = 2301979;

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field1389 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1391 = -1;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Lob;")
    private LinkList field1399 = new LinkList(0);

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    public int[] field1419 = new int[1000];

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1438 = 3;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1439 = -1;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1441 = 128;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field1445 = new int[5];

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1449 = 1;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1457 = -714;

    @OriginalMember(owner = "client", name = "Df", descriptor = "[I")
    private int[] field1464 = new int[4000];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1465 = new int[4000];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private boolean field1471 = false;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1472 = new int[5];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1473 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "B")
    private byte field1474 = 23;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1476 = 2;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[Lib;")
    private Pix32[] field1488 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "fg", descriptor = "[Lib;")
    private Pix32[] field1492 = new Pix32[20];

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1493 = 1;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private int[] field1494 = new int[7];

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1495 = -10467;

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    private int[] field1496 = new int[5];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[[I")
    private int[][] field1502 = new int[104][104];

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field1509 = new int[33];

    @OriginalMember(owner = "client", name = "xg", descriptor = "[Ljb;")
    private Pix8[] field1510 = new Pix8[100];

    @OriginalMember(owner = "client", name = "yg", descriptor = "[Ljava/lang/String;")
    private String[] field1511 = new String[500];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "B")
    private byte field1514 = 1;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private boolean field1521 = false;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Z")
    private boolean field1525 = true;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1526 = new int[151];

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field1529 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[I")
    private int[] field1530 = new int[5];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1531 = -732;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Llb;")
    private Packet field1534 = Packet.method217(1, -14406);

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljava/lang/String;")
    private String field1535 = "";

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field1536 = new int[256];

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private final int field1541 = 100;

    @OriginalMember(owner = "client", name = "dh", descriptor = "[I")
    private int[] field1542 = new int[100];

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljava/lang/String;")
    private String field1544 = "";

    @OriginalMember(owner = "client", name = "gh", descriptor = "Ljava/lang/String;")
    private String field1545 = "";

    @OriginalMember(owner = "client", name = "mh", descriptor = "Llb;")
    private Packet field1551 = Packet.method217(1, -14406);

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1554 = 7;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1556 = 50;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field1557 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field1558 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field1559 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field1560 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field1561 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1562 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1563 = new int[this.field1556];

    @OriginalMember(owner = "client", name = "zh", descriptor = "[Ljava/lang/String;")
    private String[] field1564 = new String[this.field1556];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Z")
    private boolean field1569 = true;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1573 = -14114;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private boolean field1574 = false;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field1576 = true;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1577 = -1;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Lob;")
    private LinkList field1578 = new LinkList(0);

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    private int[] field1581 = new int[200];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field1582 = new int[Stats.field1152];

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field1584 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1588 = 332;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field1589 = true;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1590 = 4;

    @OriginalMember(owner = "client", name = "bi", descriptor = "B")
    private byte field1592 = -93;

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field1594 = new int[33];

    @OriginalMember(owner = "client", name = "ei", descriptor = "B")
    private byte field1595 = 67;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Lob;")
    private LinkList field1596 = new LinkList(0);

    @OriginalMember(owner = "client", name = "gi", descriptor = "Z")
    private boolean field1597 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "B")
    private byte field1599 = 6;

    @OriginalMember(owner = "client", name = "ji", descriptor = "[I")
    private int[] field1600 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    public boolean field1602 = false;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    private String field1603 = "";

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/lang/String;")
    private String field1604 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1605 = -1;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1606 = -1;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[Ljb;")
    private Pix8[] field1607 = new Pix8[13];

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1612 = 2;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Z")
    private boolean field1613 = false;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Z")
    private boolean field1615 = false;

    @OriginalMember(owner = "client", name = "zi", descriptor = "[[I")
    private int[][] field1616 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Z")
    private boolean field1618 = false;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1619 = 2048;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1620 = 2047;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[Lab;")
    private PlayerEntity[] field1621 = new PlayerEntity[this.field1619];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[I")
    public int[] field1623 = new int[this.field1619];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private int[] field1625 = new int[this.field1619];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[Llb;")
    private Packet[] field1626 = new Packet[this.field1619];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1627 = 7;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Z")
    private boolean field1628 = true;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1633 = 5;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field1639 = false;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field1640 = new int[5];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1641 = 257;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1642 = 960;

    @OriginalMember(owner = "client", name = "jj", descriptor = "Z")
    private boolean field1652 = false;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Ljava/lang/String;")
    private String field1654 = "";

    @OriginalMember(owner = "client", name = "mj", descriptor = "Ljava/lang/String;")
    private String field1655 = "";

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1657 = -1;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[Lib;")
    private Pix32[] field1659 = new Pix32[8];

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field1661 = -533;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[B")
    private byte[] field1662 = new byte[16384];

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field1664 = false;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1665 = 4131;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private int[] field1666 = new int[50];

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1667 = -1;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field1668 = -1;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field1670 = false;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Z")
    private boolean field1671 = false;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Z")
    private boolean field1672 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field1673 = new int[2000];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[Lz;")
    private NpcEntity[] field1674 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    public int[] field1676 = new int[16384];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[J")
    private long[] field1677 = new long[100];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field1680 = -1;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1267 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private static boolean field1268 = true;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Ljava/lang/String;")
    private static String field1330 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private static int field1360 = 243;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private static int field1463 = -1127;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private static int[] field1506 = new int[99];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    public static int[] field1520;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1533;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private static int field1547;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private static boolean field1549;

    @OriginalMember(owner = "client", name = "ai", descriptor = "[[I")
    public static final int[][] field1591;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    public static final int[] field1669;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private static int field1248;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private static int field1252;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private static int field1350;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private static int field1366;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private static int field1376;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private static int field1377;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private static int field1384;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private static int field1387;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private static int field1396;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private static int field1402;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private static int field1450;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private static int field1460;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private static int field1461;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private static int field1522;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private static int field1540;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private static int field1552;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private static int field1617;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private static int field1644;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "J")
    private long field1258;

    @OriginalMember(owner = "client", name = "uf", descriptor = "J")
    private long field1455;

    @OriginalMember(owner = "client", name = "oh", descriptor = "J")
    public long field1553;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "J")
    private long field1583;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "J")
    private long field1681;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Le;")
    private ClientStream field1370;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Lwb;")
    private Isaac field1416;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Lxb;")
    private Jagfile field1570;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lfc;")
    public MouseTracking field1378;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Lub;")
    private OnDemand field1266;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Lib;")
    private Pix32 field1263;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Lib;")
    private Pix32 field1264;

    @OriginalMember(owner = "client", name = "td", descriptor = "Lib;")
    private Pix32 field1351;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lib;")
    private Pix32 field1352;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lib;")
    private Pix32 field1365;

    @OriginalMember(owner = "client", name = "le", descriptor = "Lib;")
    private Pix32 field1395;

    @OriginalMember(owner = "client", name = "te", descriptor = "Lib;")
    private Pix32 field1403;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Lib;")
    private Pix32 field1404;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Lib;")
    private Pix32 field1405;

    @OriginalMember(owner = "client", name = "we", descriptor = "Lib;")
    private Pix32 field1406;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Lib;")
    private Pix32 field1407;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lib;")
    private Pix32 field1504;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Lib;")
    private Pix32 field1505;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Lib;")
    private Pix32 field1660;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Ljb;")
    private Pix8 field1238;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Ljb;")
    private Pix8 field1239;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Ljb;")
    private Pix8 field1240;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Ljb;")
    private Pix8 field1241;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Ljb;")
    private Pix8 field1242;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Ljb;")
    private Pix8 field1302;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Ljb;")
    private Pix8 field1303;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljb;")
    private Pix8 field1304;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljb;")
    private Pix8 field1305;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Ljb;")
    private Pix8 field1306;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ljb;")
    private Pix8 field1458;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljb;")
    private Pix8 field1459;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljb;")
    private Pix8 field1490;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ljb;")
    private Pix8 field1491;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Ljb;")
    private Pix8 field1515;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Ljb;")
    private Pix8 field1516;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Ljb;")
    private Pix8 field1517;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljb;")
    private Pix8 field1585;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljb;")
    private Pix8 field1586;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Ljb;")
    private Pix8 field1587;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Lkb;")
    private PixFont field1380;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Lkb;")
    private PixFont field1381;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Lkb;")
    private PixFont field1382;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Lkb;")
    private PixFont field1383;

    @OriginalMember(owner = "client", name = "O", descriptor = "Lqb;")
    private PixMap field1216;

    @OriginalMember(owner = "client", name = "P", descriptor = "Lqb;")
    private PixMap field1217;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Lqb;")
    private PixMap field1218;

    @OriginalMember(owner = "client", name = "R", descriptor = "Lqb;")
    private PixMap field1219;

    @OriginalMember(owner = "client", name = "S", descriptor = "Lqb;")
    private PixMap field1220;

    @OriginalMember(owner = "client", name = "T", descriptor = "Lqb;")
    private PixMap field1221;

    @OriginalMember(owner = "client", name = "U", descriptor = "Lqb;")
    private PixMap field1222;

    @OriginalMember(owner = "client", name = "V", descriptor = "Lqb;")
    private PixMap field1223;

    @OriginalMember(owner = "client", name = "W", descriptor = "Lqb;")
    private PixMap field1224;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Lqb;")
    private PixMap field1451;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lqb;")
    private PixMap field1452;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lqb;")
    private PixMap field1453;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Lqb;")
    private PixMap field1454;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Lqb;")
    private PixMap field1477;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lqb;")
    private PixMap field1478;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lqb;")
    private PixMap field1479;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Lqb;")
    private PixMap field1480;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Lqb;")
    private PixMap field1481;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Lqb;")
    private PixMap field1482;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Lqb;")
    private PixMap field1483;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Lqb;")
    private PixMap field1484;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Lqb;")
    private PixMap field1485;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Lqb;")
    private PixMap field1537;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lqb;")
    private PixMap field1538;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lqb;")
    private PixMap field1539;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Lab;")
    public static PlayerEntity field1374;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Lr;")
    private World3D field1614;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Ljava/lang/String;")
    private String field1337;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Ljava/lang/String;")
    public String field1429;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Ljava/lang/String;")
    private String field1518;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Ljava/lang/String;")
    public String field1648;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/net/Socket;")
    private Socket field1277;

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    public static boolean field1385;

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private static boolean field1413;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private static boolean field1550;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Z")
    public static boolean field1572;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "Z")
    public static boolean field1683;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[I")
    private int[] field1254;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field1255;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "[I")
    private int[] field1256;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1315;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    private int[] field1316;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[I")
    private int[] field1317;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field1318;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field1319;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field1507;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field1508;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1565;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field1566;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1567;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1568;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[Ljb;")
    private Pix8[] field1326;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[[B")
    private byte[][] field1375;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[[B")
    private byte[][] field1431;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[[[B")
    private byte[][][] field1658;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[[[I")
    private int[][][] field1249;

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field19 != null) {
                    return new URL("http://127.0.0.1:" + (field1548 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method429(int arg0, Packet arg1, int arg2) {
        this.field1418 = 0;
        this.field1624 = 0;
        this.method443(879, arg2, arg1);
        this.method477(237, arg2, arg1);
        this.method508(arg2, true, arg1);
        for (int var4 = 0; var4 < this.field1418; ++var4) {
            int var6 = this.field1419[var4];
            if (field1275 != this.field1674[var6].field442) {
                this.field1674[var6].field455 = null;
                this.field1674[var6] = null;
            }
        }
        if (arg0 < 5 || arg0 > 5) {
            this.field1580 = -112;
        }
        if (arg1.field711 != arg2) {
            signlink.reporterror(this.field1654 + " size mismatch in getnpcpos - pos:" + arg1.field711 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1675; ++var5) {
                if (this.field1674[this.field1676[var5]] == null) {
                    signlink.reporterror(this.field1654 + " null entry in npc list - pos:" + var5 + " size:" + this.field1675);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIB)Z")
    public final boolean method430(byte[] arg0, int arg1, byte arg2) {
        if (arg2 == 7) {
            boolean var4 = false;
            return arg0 == null ? true : signlink.wavesave(arg0, arg1);
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method431(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg0;
        if (arg2 != -39072) {
            this.field1493 = this.field1416.method295();
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method432(byte arg0) {
        try {
            this.field1344 = -1;
            this.field1578.method252();
            this.field1596.method252();
            Pix3D.method167(true);
            this.method541(336);
            this.field1614.method50(880);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1314[var2].method359(25762);
            }
            System.gc();
            World var3 = new World(-702, this.field1249, 104, 104, this.field1658);
            int var4 = this.field1375.length;
            World.field44 = World3D.field285;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1254[var5] >> 8;
                int var7 = this.field1254[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field44 = false;
                }
            }
            if (World.field44) {
                this.field1614.method51(this.field1546, 10);
            } else {
                this.field1614.method51(0, 10);
            }
            this.field1259.method218(this.field1236, 62);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1254[var8] >> 8) * 64 - this.field1320;
                int var10 = (this.field1254[var8] & 255) * 64 - this.field1321;
                byte[] var11 = this.field1375[var8];
                if (var11 != null) {
                    var3.method15((byte) -12, var10, (this.field1325 - 6) * 8, var9, (this.field1324 - 6) * 8, var11);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1254[var12] >> 8) * 64 - this.field1320;
                int var14 = (this.field1254[var12] & 255) * 64 - this.field1321;
                byte[] var15 = this.field1375[var12];
                if (var15 == null && this.field1325 < 800) {
                    var3.method14(var14, 64, 64, 5, var13);
                }
            }
            this.field1259.method218(this.field1236, 62);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1431[var16];
                if (var17 != null) {
                    int var18 = (this.field1254[var16] >> 8) * 64 - this.field1320;
                    int var19 = (this.field1254[var16] & 255) * 64 - this.field1321;
                    var3.method18((byte) 1, var17, var19, this.field1314, this.field1614, var18);
                }
            }
            this.field1259.method218(this.field1236, 62);
            var3.method20(this.field1614, 0, this.field1314);
            this.field1453.method258((byte) 4);
            this.field1259.method218(this.field1236, 62);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method516(var20, var21);
                }
            }
            this.method521(6831);
        } catch (Exception var34) {
        }
        LocType.field989.method103();
        if (field1550 && signlink.cache_dat != null) {
            int var23 = this.field1266.method272(4, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1266.method277(724, var24);
                if ((var25 & 121) == 0) {
                    Model.method125(false, var24);
                }
            }
        }
        System.gc();
        Pix3D.method168(8, 20);
        this.field1266.method283((byte) 4);
        int var26 = (this.field1324 - 6) / 8 - 1;
        int var27 = (this.field1324 + 6) / 8 + 1;
        int var28 = (this.field1325 - 6) / 8 - 1;
        int var29 = (this.field1325 + 6) / 8 + 1;
        if (this.field1618) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1266.method274(var30, (byte) -55, var31, 0);
                    if (var32 != -1) {
                        this.field1266.method284(3, var32, (byte) 3);
                    }
                    int var33 = this.field1266.method274(var30, (byte) -55, var31, 1);
                    if (var33 != -1) {
                        this.field1266.method284(3, var33, (byte) 3);
                    }
                }
            }
        }
        if (arg0 != 9) {
            this.field1590 = -430;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method433(boolean arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field1675; ++var3) {
            NpcEntity var4 = this.field1674[this.field1676[var3]];
            int var5 = (this.field1676[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(false) && var4.field455.field1027 == arg0) {
                int var6 = var4.field397 >> 7;
                int var7 = var4.field398 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field401 == 1 && (var4.field397 & 127) == 64 && (var4.field398 & 127) == 64) {
                        if (this.field1616[var6][var7] == this.field1446) {
                            continue;
                        }
                        this.field1616[var6][var7] = this.field1446;
                    }
                    this.field1614.method61((var4.field401 - 1) * 64 + 60, var4.field398, var4.field397, this.method513(this.field1592, this.field1546, var4.field397, var4.field398), var4, var4.field399, var4.field400, this.field1546, false, var5);
                }
            }
        }
        if (arg1 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method434(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)Z")
    public final boolean method435(byte arg0) {
        if (arg0 != -67) {
            throw new NullPointerException();
        } else if (this.field1370 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1370.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1467 == -1) {
                    this.field1370.method41(this.field1534.field710, 0, 1);
                    this.field1467 = this.field1534.field710[0] & 255;
                    if (this.field1416 != null) {
                        this.field1467 = this.field1467 - this.field1416.method295() & 255;
                    }
                    this.field1466 = Protocol.field1088[this.field1467];
                    --var2;
                }
                if (this.field1466 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1370.method41(this.field1534.field710, 0, 1);
                    this.field1466 = this.field1534.field710[0] & 255;
                    --var2;
                }
                if (this.field1466 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1370.method41(this.field1534.field710, 0, 2);
                    this.field1534.field711 = 0;
                    this.field1466 = this.field1534.method231();
                    var2 -= 2;
                }
                if (var2 < this.field1466) {
                    return false;
                }
                this.field1534.field711 = 0;
                this.field1370.method41(this.field1534.field710, 0, this.field1466);
                this.field1468 = 0;
                this.field1340 = this.field1339;
                this.field1339 = this.field1338;
                this.field1338 = this.field1467;
                if (this.field1467 == 162) {
                    this.field1401 = this.field1534.method229();
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 24) {
                    int var3 = this.field1534.method229();
                    int var4 = this.field1534.method229();
                    String var5 = this.field1534.method236();
                    if (var3 >= 1 && var3 <= 5) {
                        if (var5.equalsIgnoreCase("null")) {
                            var5 = null;
                        }
                        this.field1279[var3 - 1] = var5;
                        this.field1280[var3 - 1] = var4 == 0;
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 231) {
                    this.field1272 = this.field1534.method229();
                    if (this.field1272 == 1) {
                        this.field1682 = this.field1534.method231();
                    }
                    if (this.field1272 >= 2 && this.field1272 <= 6) {
                        if (this.field1272 == 2) {
                            this.field1411 = 64;
                            this.field1412 = 64;
                        }
                        if (this.field1272 == 3) {
                            this.field1411 = 0;
                            this.field1412 = 64;
                        }
                        if (this.field1272 == 4) {
                            this.field1411 = 128;
                            this.field1412 = 64;
                        }
                        if (this.field1272 == 5) {
                            this.field1411 = 64;
                            this.field1412 = 0;
                        }
                        if (this.field1272 == 6) {
                            this.field1411 = 64;
                            this.field1412 = 128;
                        }
                        this.field1272 = 2;
                        this.field1408 = this.field1534.method231();
                        this.field1409 = this.field1534.method231();
                        this.field1410 = this.field1534.method229();
                    }
                    if (this.field1272 == 10) {
                        this.field1276 = this.field1534.method231();
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 18) {
                    long var6 = this.field1534.method235(this.field1590);
                    int var8 = this.field1534.method229();
                    String var9 = JString.method304(JString.method301(var6, false), 789);
                    for (int var10 = 0; var10 < this.field1346; ++var10) {
                        if (this.field1295[var10] == var6) {
                            if (this.field1581[var10] != var8) {
                                this.field1581[var10] = var8;
                                this.field1327 = true;
                                if (var8 > 0) {
                                    this.method519(true, 5, var9 + " has logged in.", "");
                                }
                                if (var8 == 0) {
                                    this.method519(true, 5, var9 + " has logged out.", "");
                                }
                            }
                            var9 = null;
                            break;
                        }
                    }
                    if (var9 != null && this.field1346 < 200) {
                        this.field1295[this.field1346] = var6;
                        this.field1271[this.field1346] = var9;
                        this.field1581[this.field1346] = var8;
                        ++this.field1346;
                        this.field1327 = true;
                    }
                    boolean var11 = false;
                    while (!var11) {
                        var11 = true;
                        for (int var12 = 0; var12 < this.field1346 - 1; ++var12) {
                            if (this.field1581[var12] != field1547 && this.field1581[var12 + 1] == field1547 || this.field1581[var12] == 0 && this.field1581[var12 + 1] != 0) {
                                int var13 = this.field1581[var12];
                                this.field1581[var12] = this.field1581[var12 + 1];
                                this.field1581[var12 + 1] = var13;
                                String var14 = this.field1271[var12];
                                this.field1271[var12] = this.field1271[var12 + 1];
                                this.field1271[var12 + 1] = var14;
                                long var15 = this.field1295[var12];
                                this.field1295[var12] = this.field1295[var12 + 1];
                                this.field1295[var12 + 1] = var15;
                                this.field1327 = true;
                                var11 = false;
                            }
                        }
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 116) {
                    int var17 = this.field1534.method231();
                    int var18 = this.field1534.method229();
                    int var19 = this.field1534.method231();
                    if (this.field1525 && !field1550 && this.field1503 < 50) {
                        this.field1273[this.field1503] = var17;
                        this.field1666[this.field1503] = var18;
                        this.field1311[this.field1503] = Wave.field908[var17] + var19;
                        ++this.field1503;
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 179) {
                    this.field1598 = this.field1534.method229();
                    this.field1414 = this.field1534.method229();
                    this.field1528 = this.field1534.method229();
                    this.field1639 = true;
                    this.field1574 = true;
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 36) {
                    int var20 = this.field1534.method231();
                    int var21 = this.field1534.method231();
                    int var22 = this.field1534.method231();
                    int var23 = this.field1534.method231();
                    Component.field71[var20].field127 = var21;
                    Component.field71[var20].field128 = var22;
                    Component.field71[var20].field126 = var23;
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 249) {
                    int var24 = this.field1534.method231();
                    int var25 = this.field1534.method231();
                    Component var26 = Component.field71[var24];
                    if (var26 != null && var26.field78 == 0) {
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var25 > var26.field90 - var26.field82) {
                            var25 = var26.field90 - var26.field82;
                        }
                        var26.field91 = var25;
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 101) {
                    this.field1512 = this.field1466 / 8;
                    for (int var27 = 0; var27 < this.field1512; ++var27) {
                        this.field1677[var27] = this.field1534.method235(this.field1590);
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 185) {
                    int var28 = this.field1534.method231();
                    String var29 = this.field1534.method236();
                    Component.field71[var28].field112 = var29;
                    if (this.field1600[this.field1438] == Component.field71[var28].field77) {
                        this.field1327 = true;
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 217) {
                    this.field1327 = true;
                    int var30 = this.field1534.method229();
                    int var31 = this.field1534.method234();
                    int var32 = this.field1534.method229();
                    this.field1473[var30] = var31;
                    this.field1274[var30] = var32;
                    this.field1582[var30] = 1;
                    for (int var33 = 0; var33 < 98; ++var33) {
                        if (var31 >= field1506[var33]) {
                            this.field1582[var30] = var33 + 2;
                        }
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 206) {
                    this.field1327 = true;
                    int var34 = this.field1534.method231();
                    Component var35 = Component.field71[var34];
                    while (this.field1534.field711 < this.field1466) {
                        int var36 = this.field1534.method243();
                        int var37 = this.field1534.method231();
                        int var38 = this.field1534.method229();
                        if (var38 == 255) {
                            var38 = this.field1534.method234();
                        }
                        if (var36 >= 0 && var36 < var35.field72.length) {
                            var35.field72[var36] = var37;
                            var35.field73[var36] = var38;
                        }
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 120) {
                    int var39 = this.field1534.method231();
                    this.method551(664, var39);
                    if (this.field1214 != -1) {
                        this.field1214 = -1;
                        this.field1327 = true;
                        this.field1597 = true;
                    }
                    this.field1345 = var39;
                    this.field1574 = true;
                    this.field1226 = -1;
                    this.field1672 = false;
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 229) {
                    this.method450(false);
                    this.field1467 = -1;
                    return false;
                }
                if (this.field1467 == 159) {
                    this.field1489 = this.field1534.method229();
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 69) {
                    long var40 = this.field1534.method235(this.field1590);
                    int var42 = this.field1534.method234();
                    int var43 = this.field1534.method229();
                    boolean var44 = false;
                    for (int var45 = 0; var45 < 100; ++var45) {
                        if (this.field1542[var45] == var42) {
                            var44 = true;
                            break;
                        }
                    }
                    if (var43 <= 1) {
                        for (int var46 = 0; var46 < this.field1512; ++var46) {
                            if (this.field1677[var46] == var40) {
                                var44 = true;
                                break;
                            }
                        }
                    }
                    if (!var44 && this.field1328 == 0) {
                        try {
                            this.field1542[this.field1440] = var42;
                            this.field1440 = (this.field1440 + 1) % 100;
                            String var47 = WordPack.method306(this.field1534, this.field1466 - 13, 0);
                            if (var43 != 3) {
                                var47 = WordFilter.method401((byte) 59, var47);
                            }
                            if (var43 != 2 && var43 != 3) {
                                if (var43 == 1) {
                                    this.method519(true, 7, var47, "@cr1@" + JString.method304(JString.method301(var40, false), 789));
                                } else {
                                    this.method519(true, 3, var47, JString.method304(JString.method301(var40, false), 789));
                                }
                            } else {
                                this.method519(true, 7, var47, "@cr2@" + JString.method304(JString.method301(var40, false), 789));
                            }
                        } catch (Exception var171) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 == 58) {
                    this.method429(this.field1633, this.field1534, this.field1466);
                    this.field1467 = -1;
                    return true;
                }
                if (this.field1467 != 239 && this.field1467 != 74) {
                    if (this.field1467 == 242) {
                        this.field1678 = this.field1534.method229();
                        this.field1679 = this.field1534.method229();
                        for (int var83 = this.field1678; var83 < this.field1678 + 8; ++var83) {
                            for (int var84 = this.field1679; var84 < this.field1679 + 8; ++var84) {
                                if (this.field1294[this.field1546][var83][var84] != null) {
                                    this.field1294[this.field1546][var83][var84] = null;
                                    this.method516(var83, var84);
                                }
                            }
                        }
                        for (LocSpawned var85 = (LocSpawned) this.field1399.method248(); var85 != null; var85 = (LocSpawned) this.field1399.method250((byte) 8)) {
                            if (var85.field731 >= this.field1678 && var85.field731 < this.field1678 + 8 && var85.field732 >= this.field1679 && var85.field732 < this.field1679 + 8 && this.field1546 == var85.field729) {
                                var85.field740 = 0;
                            }
                        }
                        this.field1467 = -1;
                        return true;
                    }
                    if (this.field1467 == 228) {
                        this.field1678 = this.field1534.method229();
                        this.field1679 = this.field1534.method229();
                        this.field1467 = -1;
                        return true;
                    }
                    if (this.field1467 == 27) {
                        int var86 = this.field1534.method231();
                        int var87 = this.field1534.method231();
                        Component.field71[var86].field120 = 1;
                        Component.field71[var86].field121 = var87;
                        this.field1467 = -1;
                        return true;
                    }
                    if (this.field1467 == 247) {
                        this.field1439 = this.field1534.method229();
                        if (this.field1439 == this.field1438) {
                            if (this.field1439 == 3) {
                                this.field1438 = 1;
                            } else {
                                this.field1438 = 3;
                            }
                            this.field1327 = true;
                        }
                        this.field1467 = -1;
                        return true;
                    }
                    if (this.field1467 == 213) {
                        int var88 = this.field1534.method231();
                        Component.field71[var88].field120 = 3;
                        if (field1374.field482 == null) {
                            Component.field71[var88].field121 = (field1374.field464[11] << 5) + (field1374.field464[8] << 10) + (field1374.field464[0] << 15) + (field1374.field465[0] << 25) + (field1374.field465[4] << 20) + field1374.field464[1];
                        } else {
                            Component.field71[var88].field121 = (int) (field1374.field482.field1006 + 305419896L);
                        }
                        this.field1467 = -1;
                        return true;
                    }
                    if (this.field1467 != 19 && this.field1467 != 197 && this.field1467 != 35 && this.field1467 != 14 && this.field1467 != 45 && this.field1467 != 192 && this.field1467 != 76 && this.field1467 != 7 && this.field1467 != 188 && this.field1467 != 237 && this.field1467 != 142) {
                        if (this.field1467 == 111) {
                            this.field1438 = this.field1534.method229();
                            this.field1327 = true;
                            this.field1597 = true;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 156) {
                            int var89 = this.field1534.method231();
                            int var90 = this.field1534.method229();
                            if (var89 == 65535) {
                                var89 = -1;
                            }
                            this.field1600[var90] = var89;
                            this.field1327 = true;
                            this.field1597 = true;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 189) {
                            int var91 = this.field1534.method231();
                            Component var92 = Component.field71[var91];
                            for (int var93 = 0; var93 < var92.field72.length; ++var93) {
                                var92.field72[var93] = -1;
                                var92.field72[var93] = 0;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 236) {
                            int var94 = this.field1534.method231();
                            int var95 = this.field1534.method231();
                            int var96 = var95 >> 10 & 31;
                            int var97 = var95 >> 5 & 31;
                            int var98 = var95 & 31;
                            Component.field71[var94].field114 = (var98 << 3) + (var96 << 19) + (var97 << 11);
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 16) {
                            int var99 = this.field1534.method231();
                            this.method551(664, var99);
                            if (this.field1214 != -1) {
                                this.field1214 = -1;
                                this.field1327 = true;
                                this.field1597 = true;
                            }
                            if (this.field1345 != -1) {
                                this.field1345 = -1;
                                this.field1574 = true;
                            }
                            if (this.field1615) {
                                this.field1615 = false;
                                this.field1574 = true;
                            }
                            this.field1226 = var99;
                            this.field1672 = false;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 34) {
                            this.field1393 = 0;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 44) {
                            this.field1571 = this.field1534.method234();
                            this.field1643 = this.field1534.method231();
                            this.field1392 = this.field1534.method229();
                            this.field1523 = this.field1534.method231();
                            this.field1261 = this.field1534.method229();
                            if (this.field1571 != 0 && this.field1226 == -1) {
                                signlink.dnslookup(JString.method303((byte) 7, this.field1571));
                                this.method536(3);
                                short var100 = 650;
                                if (this.field1392 != 201 || this.field1261 == 1) {
                                    var100 = 655;
                                }
                                this.field1361 = "";
                                this.field1471 = false;
                                for (int var101 = 0; var101 < Component.field71.length; ++var101) {
                                    if (Component.field71[var101] != null && Component.field71[var101].field80 == var100) {
                                        this.field1226 = Component.field71[var101].field77;
                                        break;
                                    }
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 136) {
                            for (int var102 = 0; var102 < this.field1227.length; ++var102) {
                                if (this.field1673[var102] != this.field1227[var102]) {
                                    this.field1227[var102] = this.field1673[var102];
                                    this.method453(0, var102);
                                    this.field1327 = true;
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 31) {
                            int var103 = this.field1534.method231();
                            if (var103 == 65535) {
                                var103 = -1;
                            }
                            if (this.field1667 != var103 && this.field1415 && !field1550 && this.field1447 == 0) {
                                this.field1575 = var103;
                                this.field1576 = true;
                                this.field1266.method279(2, this.field1575);
                            }
                            this.field1667 = var103;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 218) {
                            int var104 = this.field1534.method231();
                            int var105 = this.field1534.method231();
                            if (this.field1415 && !field1550) {
                                this.field1575 = var104;
                                this.field1576 = false;
                                this.field1266.method279(2, this.field1575);
                                this.field1447 = var105;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 235) {
                            this.field1327 = true;
                            int var106 = this.field1534.method231();
                            Component var107 = Component.field71[var106];
                            int var108 = this.field1534.method231();
                            for (int var109 = 0; var109 < var108; ++var109) {
                                var107.field72[var109] = this.field1534.method231();
                                int var110 = this.field1534.method229();
                                if (var110 == 255) {
                                    var110 = this.field1534.method234();
                                }
                                var107.field73[var109] = var110;
                            }
                            for (int var111 = var108; var111 < var107.field72.length; ++var111) {
                                var107.field72[var111] = 0;
                                var107.field73[var111] = 0;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 167) {
                            int var112 = this.field1534.method231();
                            int var113 = this.field1534.method232();
                            Component var114 = Component.field71[var112];
                            var114.field124 = var113;
                            if (var113 == -1) {
                                var114.field74 = 0;
                                var114.field75 = 0;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 169) {
                            int var115 = this.field1534.method231();
                            byte var116 = this.field1534.method230();
                            this.field1673[var115] = var116;
                            if (this.field1227[var115] != var116) {
                                this.field1227[var115] = var116;
                                this.method453(0, var115);
                                this.field1327 = true;
                                if (this.field1336 != -1) {
                                    this.field1574 = true;
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 66) {
                            int var117 = this.field1534.method231();
                            this.method551(664, var117);
                            if (this.field1345 != -1) {
                                this.field1345 = -1;
                                this.field1574 = true;
                            }
                            if (this.field1615) {
                                this.field1615 = false;
                                this.field1574 = true;
                            }
                            this.field1214 = var117;
                            this.field1327 = true;
                            this.field1597 = true;
                            this.field1226 = -1;
                            this.field1672 = false;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 214) {
                            if (this.field1438 == 12) {
                                this.field1327 = true;
                            }
                            this.field1285 = this.field1534.method232();
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 109) {
                            this.field1678 = this.field1534.method229();
                            this.field1679 = this.field1534.method229();
                            while (this.field1534.field711 < this.field1466) {
                                int var118 = this.field1534.method229();
                                this.method503(this.field1534, var118, false);
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 221) {
                            int var119 = this.field1534.method231();
                            int var120 = this.field1534.method234();
                            this.field1673[var119] = var120;
                            if (this.field1227[var119] != var120) {
                                this.field1227[var119] = var120;
                                this.method453(0, var119);
                                this.field1327 = true;
                                if (this.field1336 != -1) {
                                    this.field1574 = true;
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 89) {
                            int var121 = this.field1534.method231();
                            int var122 = this.field1534.method232();
                            int var123 = this.field1534.method232();
                            Component var124 = Component.field71[var121];
                            var124.field84 = var122;
                            var124.field85 = var123;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 176) {
                            this.field1301 = this.field1534.method231() * 30;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 107) {
                            int var125 = this.field1534.method232();
                            this.field1336 = var125;
                            this.field1574 = true;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 122) {
                            this.method447(false, this.field1534, this.field1466);
                            this.field1228 = false;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 139) {
                            int var126 = this.field1534.method231();
                            int var127 = this.field1534.method231();
                            Component.field71[var126].field120 = 2;
                            Component.field71[var126].field121 = var127;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 220) {
                            this.field1671 = true;
                            this.field1296 = this.field1534.method229();
                            this.field1297 = this.field1534.method229();
                            this.field1298 = this.field1534.method231();
                            this.field1299 = this.field1534.method229();
                            this.field1300 = this.field1534.method229();
                            if (this.field1300 >= 100) {
                                this.field1331 = this.field1296 * 128 + 64;
                                this.field1333 = this.field1297 * 128 + 64;
                                this.field1332 = this.method513(this.field1592, this.field1546, this.field1331, this.field1333) - this.field1298;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 148) {
                            for (int var128 = 0; var128 < this.field1621.length; ++var128) {
                                if (this.field1621[var128] != null) {
                                    this.field1621[var128].field425 = -1;
                                }
                            }
                            for (int var129 = 0; var129 < this.field1674.length; ++var129) {
                                if (this.field1674[var129] != null) {
                                    this.field1674[var129].field425 = -1;
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 127) {
                            this.field1671 = false;
                            for (int var130 = 0; var130 < 5; ++var130) {
                                this.field1368[var130] = false;
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 22) {
                            this.field1680 = this.field1534.method231();
                            this.field1579 = this.field1534.method229();
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 143) {
                            int var131 = this.field1534.method231();
                            int var132 = this.field1534.method231();
                            int var133 = this.field1534.method231();
                            if (var132 == 65535) {
                                Component.field71[var131].field120 = 0;
                                this.field1467 = -1;
                                return true;
                            }
                            ObjType var134 = ObjType.method348(var132);
                            Component.field71[var131].field120 = 4;
                            Component.field71[var131].field121 = var132;
                            Component.field71[var131].field127 = var134.field1052;
                            Component.field71[var131].field128 = var134.field1053;
                            Component.field71[var131].field126 = var134.field1051 * 100 / var133;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 124) {
                            this.field1671 = true;
                            this.field1634 = this.field1534.method229();
                            this.field1635 = this.field1534.method229();
                            this.field1636 = this.field1534.method231();
                            this.field1637 = this.field1534.method229();
                            this.field1638 = this.field1534.method229();
                            if (this.field1638 >= 100) {
                                int var135 = this.field1634 * 128 + 64;
                                int var136 = this.field1635 * 128 + 64;
                                int var137 = this.method513(this.field1592, this.field1546, var135, var136) - this.field1636;
                                int var138 = var135 - this.field1331;
                                int var139 = var137 - this.field1332;
                                int var140 = var136 - this.field1333;
                                int var141 = (int) Math.sqrt((double) (var138 * var138 + var140 * var140));
                                this.field1334 = (int) (Math.atan2((double) var139, (double) var141) * 325.949D) & 2047;
                                this.field1335 = (int) (Math.atan2((double) var138, (double) var140) * -325.949D) & 2047;
                                if (this.field1334 < 128) {
                                    this.field1334 = 128;
                                }
                                if (this.field1334 > 383) {
                                    this.field1334 = 383;
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 121) {
                            int var142 = this.field1534.method231();
                            int var143 = this.field1534.method231();
                            if (this.field1345 != -1) {
                                this.field1345 = -1;
                                this.field1574 = true;
                            }
                            if (this.field1615) {
                                this.field1615 = false;
                                this.field1574 = true;
                            }
                            this.field1226 = var142;
                            this.field1214 = var143;
                            this.field1327 = true;
                            this.field1597 = true;
                            this.field1672 = false;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 195) {
                            if (this.field1214 != -1) {
                                this.field1214 = -1;
                                this.field1327 = true;
                                this.field1597 = true;
                            }
                            if (this.field1345 != -1) {
                                this.field1345 = -1;
                                this.field1574 = true;
                            }
                            if (this.field1615) {
                                this.field1615 = false;
                                this.field1574 = true;
                            }
                            this.field1226 = -1;
                            this.field1672 = false;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 244) {
                            String var144 = this.field1534.method236();
                            if (var144.endsWith(":tradereq:")) {
                                String var145 = var144.substring(0, var144.indexOf(":"));
                                long var146 = JString.method300(var145);
                                boolean var148 = false;
                                for (int var149 = 0; var149 < this.field1512; ++var149) {
                                    if (this.field1677[var149] == var146) {
                                        var148 = true;
                                        break;
                                    }
                                }
                                if (!var148 && this.field1328 == 0) {
                                    this.method519(true, 4, "wishes to trade with you.", var145);
                                }
                            } else if (var144.endsWith(":duelreq:")) {
                                String var150 = var144.substring(0, var144.indexOf(":"));
                                long var151 = JString.method300(var150);
                                boolean var153 = false;
                                for (int var154 = 0; var154 < this.field1512; ++var154) {
                                    if (this.field1677[var154] == var151) {
                                        var153 = true;
                                        break;
                                    }
                                }
                                if (!var153 && this.field1328 == 0) {
                                    this.method519(true, 8, "wishes to duel with you.", var150);
                                }
                            } else if (!var144.endsWith(":chalreq:")) {
                                this.method519(true, 0, var144, "");
                            } else {
                                String var155 = var144.substring(0, var144.indexOf(":"));
                                long var156 = JString.method300(var155);
                                boolean var158 = false;
                                for (int var159 = 0; var159 < this.field1512; ++var159) {
                                    if (this.field1677[var159] == var156) {
                                        var158 = true;
                                        break;
                                    }
                                }
                                if (!var158 && this.field1328 == 0) {
                                    String var160 = var144.substring(var144.indexOf(":") + 1, var144.length() - 9);
                                    this.method519(true, 8, var160, var155);
                                }
                            }
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 234) {
                            int var161 = this.field1534.method229();
                            int var162 = this.field1534.method229();
                            int var163 = this.field1534.method229();
                            int var164 = this.field1534.method229();
                            this.field1368[var161] = true;
                            this.field1472[var161] = var162;
                            this.field1445[var161] = var163;
                            this.field1640[var161] = var164;
                            this.field1496[var161] = 0;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 42) {
                            this.field1613 = false;
                            this.field1615 = true;
                            this.field1544 = "";
                            this.field1574 = true;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 132) {
                            int var165 = this.field1534.method232();
                            if (var165 >= 0) {
                                this.method551(664, var165);
                            }
                            this.field1668 = var165;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 47) {
                            if (this.field1438 == 12) {
                                this.field1327 = true;
                            }
                            this.field1356 = this.field1534.method229();
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 224) {
                            this.field1347 = this.field1534.method229();
                            this.field1327 = true;
                            this.field1467 = -1;
                            return true;
                        }
                        if (this.field1467 == 180) {
                            int var166 = this.field1534.method231();
                            boolean var167 = this.field1534.method229() == 1;
                            Component.field71[var166].field92 = var167;
                            this.field1467 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field1467 + "," + this.field1466 + " - " + this.field1339 + "," + this.field1340);
                        this.method450(false);
                        return true;
                    }
                    this.method503(this.field1534, this.field1467, false);
                    this.field1467 = -1;
                    return true;
                }
                int var49 = this.field1534.method231();
                int var50 = this.field1534.method231();
                this.field1329 = false;
                if (this.field1467 == 74) {
                    this.field1534.method239(false);
                    int var51 = 0;
                    while (true) {
                        if (var51 >= 4) {
                            this.field1534.method241(this.field1554);
                            this.field1329 = true;
                            break;
                        }
                        for (int var52 = 0; var52 < 13; ++var52) {
                            for (int var53 = 0; var53 < 13; ++var53) {
                                int var54 = this.field1534.method240(this.field1310, 1);
                                if (var54 == 1) {
                                    this.field1251[var51][var52][var53] = this.field1534.method240(this.field1310, 26);
                                } else {
                                    this.field1251[var51][var52][var53] = -1;
                                }
                            }
                        }
                        ++var51;
                    }
                }
                if (this.field1324 == var49 && this.field1325 == var50 && this.field1288 == 2) {
                    this.field1467 = -1;
                    return true;
                }
                this.field1324 = var49;
                this.field1325 = var50;
                this.field1320 = (this.field1324 - 6) * 8;
                this.field1321 = (this.field1325 - 6) * 8;
                this.field1618 = false;
                if ((this.field1324 / 8 == 48 || this.field1324 / 8 == 49) && this.field1325 / 8 == 48) {
                    this.field1618 = true;
                }
                if (this.field1324 / 8 == 48 && this.field1325 / 8 == 148) {
                    this.field1618 = true;
                }
                this.field1288 = 1;
                this.field1455 = System.currentTimeMillis();
                this.field1453.method258((byte) 4);
                this.field1381.method202("Loading - please wait.", this.field1307, 151, 0, 257);
                this.field1381.method202("Loading - please wait.", this.field1307, 150, 16777215, 256);
                this.field1453.method259(super.field16, 4, 4, (byte) 8);
                if (this.field1467 == 239) {
                    int var55 = 0;
                    int var56 = (this.field1324 - 6) / 8;
                    label1069: while (true) {
                        if (var56 > (this.field1324 + 6) / 8) {
                            this.field1375 = new byte[var55][];
                            this.field1431 = new byte[var55][];
                            this.field1254 = new int[var55];
                            this.field1255 = new int[var55];
                            this.field1256 = new int[var55];
                            int var58 = 0;
                            int var59 = (this.field1324 - 6) / 8;
                            while (true) {
                                if (var59 > (this.field1324 + 6) / 8) {
                                    break label1069;
                                }
                                for (int var60 = (this.field1325 - 6) / 8; var60 <= (this.field1325 + 6) / 8; ++var60) {
                                    this.field1254[var58] = (var59 << 8) + var60;
                                    if (this.field1618 && (var60 == 49 || var60 == 149 || var60 == 147 || var59 == 50 || var59 == 49 && var60 == 47)) {
                                        this.field1255[var58] = -1;
                                        this.field1256[var58] = -1;
                                        ++var58;
                                    } else {
                                        int var61 = this.field1255[var58] = this.field1266.method274(var59, (byte) -55, var60, 0);
                                        if (var61 != -1) {
                                            this.field1266.method279(3, var61);
                                        }
                                        int var62 = this.field1256[var58] = this.field1266.method274(var59, (byte) -55, var60, 1);
                                        if (var62 != -1) {
                                            this.field1266.method279(3, var62);
                                        }
                                        ++var58;
                                    }
                                }
                                ++var59;
                            }
                        }
                        for (int var57 = (this.field1325 - 6) / 8; var57 <= (this.field1325 + 6) / 8; ++var57) {
                            ++var55;
                        }
                        ++var56;
                    }
                }
                int var63 = this.field1320 - this.field1322;
                int var64 = this.field1321 - this.field1323;
                this.field1322 = this.field1320;
                this.field1323 = this.field1321;
                for (int var65 = 0; var65 < 16384; ++var65) {
                    NpcEntity var66 = this.field1674[var65];
                    if (var66 != null) {
                        for (int var67 = 0; var67 < 10; ++var67) {
                            var66.field447[var67] -= var63;
                            var66.field448[var67] -= var64;
                        }
                        var66.field397 -= var63 * 128;
                        var66.field398 -= var64 * 128;
                    }
                }
                for (int var68 = 0; var68 < this.field1619; ++var68) {
                    PlayerEntity var69 = this.field1621[var68];
                    if (var69 != null) {
                        for (int var70 = 0; var70 < 10; ++var70) {
                            var69.field447[var70] -= var63;
                            var69.field448[var70] -= var64;
                        }
                        var69.field397 -= var63 * 128;
                        var69.field398 -= var64 * 128;
                    }
                }
                this.field1228 = true;
                byte var71 = 0;
                byte var72 = 104;
                byte var73 = 1;
                if (var63 < 0) {
                    var71 = 103;
                    var72 = -1;
                    var73 = -1;
                }
                byte var74 = 0;
                byte var75 = 104;
                byte var76 = 1;
                if (var64 < 0) {
                    var74 = 103;
                    var75 = -1;
                    var76 = -1;
                }
                for (int var77 = var71; var72 != var77; var77 += var73) {
                    for (int var78 = var74; var75 != var78; var78 += var76) {
                        int var79 = var63 + var77;
                        int var80 = var64 + var78;
                        for (int var81 = 0; var81 < 4; ++var81) {
                            if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                                this.field1294[var81][var77][var78] = this.field1294[var81][var79][var80];
                            } else {
                                this.field1294[var81][var77][var78] = null;
                            }
                        }
                    }
                }
                for (LocSpawned var82 = (LocSpawned) this.field1399.method248(); var82 != null; var82 = (LocSpawned) this.field1399.method250((byte) 8)) {
                    var82.field731 -= var63;
                    var82.field732 -= var64;
                    if (var82.field731 < 0 || var82.field732 < 0 || var82.field731 >= 104 || var82.field732 >= 104) {
                        var82.method106();
                    }
                }
                if (this.field1393 != 0) {
                    this.field1393 -= var63;
                    this.field1394 -= var64;
                }
                this.field1671 = false;
                this.field1467 = -1;
                return true;
            } catch (IOException var172) {
                this.method526((byte) 3);
            } catch (Exception var173) {
                String var169 = "T2 - " + this.field1467 + "," + this.field1339 + "," + this.field1340 + " - " + this.field1466 + "," + (field1374.field447[0] + this.field1320) + "," + (field1374.field448[0] + this.field1321) + " - ";
                for (int var170 = 0; var170 < this.field1466 && var170 < 50; ++var170) {
                    var169 = var169 + this.field1534.field710[var170] + ",";
                }
                signlink.reporterror(var169);
                this.method450(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method436(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1346; ++var4) {
                if (this.field1295[var4] == arg0) {
                    --this.field1346;
                    this.field1327 = true;
                    for (int var5 = var4; var5 < this.field1346; ++var5) {
                        this.field1271[var5] = this.field1271[var5 + 1];
                        this.field1581[var5] = this.field1581[var5 + 1];
                        this.field1295[var5] = this.field1295[var5 + 1];
                    }
                    this.field1259.method218(this.field1236, 22);
                    this.field1259.method225(arg0, this.field1641);
                    break;
                }
            }
            if (arg1 == 9) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = Model.field604[var8];
            int var14 = Model.field605[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field604[var9];
            int var17 = Model.field605[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1331 = arg4 - var10;
        this.field1332 = arg5 - var11;
        this.field1333 = arg2 - var12;
        this.field1334 = arg0;
        if (arg1 < 2 || arg1 > 2) {
            this.field1467 = this.field1534.method229();
        }
        this.field1335 = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method438(boolean arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1578.method248();
        if (!arg0) {
            field1268 = !field1268;
        }
        while (var2 != null) {
            if (this.field1546 == var2.field610 && !var2.field616) {
                if (field1275 >= var2.field609) {
                    var2.method151((byte) 1, this.field1348);
                    if (var2.field616) {
                        var2.method106();
                    } else {
                        this.field1614.method61(60, var2.field612, var2.field611, var2.field613, var2, 0, false, var2.field610, false, -1);
                    }
                }
            } else {
                var2.method106();
            }
            var2 = (SpotAnimEntity) this.field1578.method250((byte) 8);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method439(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            throw new NullPointerException();
        } else {
            int var3 = arg0 - arg2;
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

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1529) {
            this.method534(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13("Starting up", -761, 20);
        if (signlink.sunjava) {
            super.field10 = 5;
        }
        if (field1413) {
            this.field1386 = true;
        } else {
            field1413 = true;
            boolean var1 = false;
            String var2 = this.method469(field1360);
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
            if (var2.endsWith("192.168.1.242")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field1349 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1284[var3] = new FileStream(signlink.cache_dat, (byte) 80, signlink.cache_idx[var3], var3 + 1, 500000);
                    }
                }
                try {
                    this.method562((byte) 51);
                    this.field1570 = this.method502("title", "title screen", 1, 1, this.field1343[1], 25);
                    this.field1380 = new PixFont(this.field1570, false, "p11_full", 0);
                    this.field1381 = new PixFont(this.field1570, false, "p12_full", 0);
                    this.field1382 = new PixFont(this.field1570, false, "b12_full", 0);
                    this.field1383 = new PixFont(this.field1570, true, "q8_full", 0);
                    this.method470(true);
                    this.method441(-13665);
                    Jagfile var4 = this.method502("config", "config", 2, 1, this.field1343[2], 30);
                    Jagfile var5 = this.method502("interface", "interface", 3, 1, this.field1343[3], 35);
                    Jagfile var6 = this.method502("media", "2d graphics", 4, 1, this.field1343[4], 40);
                    Jagfile var7 = this.method502("textures", "textures", 6, 1, this.field1343[6], 45);
                    Jagfile var8 = this.method502("wordenc", "chat system", 7, 1, this.field1343[7], 50);
                    Jagfile var9 = this.method502("sounds", "sound effects", 8, 1, this.field1343[8], 55);
                    this.field1658 = new byte[4][104][104];
                    this.field1249 = new int[4][105][105];
                    this.field1614 = new World3D(this.field1249, (byte) 92, 104, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1314[var10] = new CollisionMap(-85, 104, 104);
                    }
                    this.field1395 = new Pix32(512, 512);
                    Jagfile var11 = this.method502("versionlist", "update list", 5, 1, this.field1343[5], 60);
                    this.method13("Connecting to update server", -761, 60);
                    this.field1266 = new OnDemand();
                    this.field1266.method270(var11, this);
                    AnimFrame.method44(this.field1266.method273(false));
                    Model.method123(this.field1266.method272(4, 0), this.field1266);
                    if (!field1550) {
                        this.field1575 = 0;
                        try {
                            this.field1575 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1576 = true;
                        this.field1266.method279(2, this.field1575);
                        while (this.field1266.method280() > 0) {
                            this.method452(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1266.field842 > 3) {
                                this.method511("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13("Requesting animations", -761, 65);
                    int var12 = this.field1266.method272(4, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1266.method279(1, var13);
                    }
                    while (this.field1266.method280() > 0) {
                        int var14 = var12 - this.field1266.method280();
                        if (var14 > 0) {
                            this.method13("Loading animations - " + var14 * 100 / var12 + "%", -761, 65);
                        }
                        this.method452(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1266.field842 > 3) {
                            this.method511("ondemand");
                            return;
                        }
                    }
                    this.method13("Requesting models", -761, 70);
                    int var15 = this.field1266.method272(4, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1266.method277(724, var16);
                        if ((var17 & 1) != 0) {
                            this.field1266.method279(0, var16);
                        }
                    }
                    int var18 = this.field1266.method280();
                    while (this.field1266.method280() > 0) {
                        int var19 = var18 - this.field1266.method280();
                        if (var19 > 0) {
                            this.method13("Loading models - " + var19 * 100 / var18 + "%", -761, 70);
                        }
                        this.method452(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1284[0] != null) {
                        this.method13("Requesting maps", -761, 75);
                        this.field1266.method279(3, this.field1266.method274(47, (byte) -55, 48, 0));
                        this.field1266.method279(3, this.field1266.method274(47, (byte) -55, 48, 1));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 48, 0));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 48, 1));
                        this.field1266.method279(3, this.field1266.method274(49, (byte) -55, 48, 0));
                        this.field1266.method279(3, this.field1266.method274(49, (byte) -55, 48, 1));
                        this.field1266.method279(3, this.field1266.method274(47, (byte) -55, 47, 0));
                        this.field1266.method279(3, this.field1266.method274(47, (byte) -55, 47, 1));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 47, 0));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 47, 1));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 148, 0));
                        this.field1266.method279(3, this.field1266.method274(48, (byte) -55, 148, 1));
                        int var20 = this.field1266.method280();
                        while (this.field1266.method280() > 0) {
                            int var21 = var20 - this.field1266.method280();
                            if (var21 > 0) {
                                this.method13("Loading maps - " + var21 * 100 / var20 + "%", -761, 75);
                            }
                            this.method452(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1266.method272(4, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1266.method277(724, var23);
                        byte var25 = 0;
                        if ((var24 & 8) != 0) {
                            var25 = 10;
                        } else if ((var24 & 32) != 0) {
                            var25 = 9;
                        } else if ((var24 & 16) != 0) {
                            var25 = 8;
                        } else if ((var24 & 64) != 0) {
                            var25 = 7;
                        } else if ((var24 & 128) != 0) {
                            var25 = 6;
                        } else if ((var24 & 2) != 0) {
                            var25 = 5;
                        } else if ((var24 & 4) != 0) {
                            var25 = 4;
                        }
                        if ((var24 & 1) != 0) {
                            var25 = 3;
                        }
                        if (var25 != 0) {
                            this.field1266.method282(var25, 0, (byte) -13, var23);
                        }
                    }
                    this.field1266.method275((byte) 4, field1549);
                    if (!field1550) {
                        int var26 = this.field1266.method272(4, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1266.method278(var27, -829)) {
                                this.field1266.method282((byte) 1, 2, (byte) -13, var27);
                            }
                        }
                    }
                    this.method13("Unpacking media", -761, 80);
                    this.field1515 = new Pix8(var6, "invback", 0);
                    this.field1517 = new Pix8(var6, "chatback", 0);
                    this.field1516 = new Pix8(var6, "mapback", 0);
                    this.field1585 = new Pix8(var6, "backbase1", 0);
                    this.field1586 = new Pix8(var6, "backbase2", 0);
                    this.field1587 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1607[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1660 = new Pix32(var6, "compass", 0);
                    this.field1365 = new Pix32(var6, "mapedge", 0);
                    this.field1365.method183(-32563);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1510[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1230[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1379[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1492[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1504 = new Pix32(var6, "mapmarker", 0);
                    this.field1505 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1659[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1403 = new Pix32(var6, "mapdots", 0);
                    this.field1404 = new Pix32(var6, "mapdots", 1);
                    this.field1405 = new Pix32(var6, "mapdots", 2);
                    this.field1406 = new Pix32(var6, "mapdots", 3);
                    this.field1407 = new Pix32(var6, "mapdots", 4);
                    this.field1490 = new Pix8(var6, "scrollbar", 0);
                    this.field1491 = new Pix8(var6, "scrollbar", 1);
                    this.field1302 = new Pix8(var6, "redstone1", 0);
                    this.field1303 = new Pix8(var6, "redstone2", 0);
                    this.field1304 = new Pix8(var6, "redstone3", 0);
                    this.field1305 = new Pix8(var6, "redstone1", 0);
                    this.field1305.method196(-3417);
                    this.field1306 = new Pix8(var6, "redstone2", 0);
                    this.field1306.method196(-3417);
                    this.field1238 = new Pix8(var6, "redstone1", 0);
                    this.field1238.method197(false);
                    this.field1239 = new Pix8(var6, "redstone2", 0);
                    this.field1239.method197(false);
                    this.field1240 = new Pix8(var6, "redstone3", 0);
                    this.field1240.method197(false);
                    this.field1241 = new Pix8(var6, "redstone1", 0);
                    this.field1241.method196(-3417);
                    this.field1241.method197(false);
                    this.field1242 = new Pix8(var6, "redstone2", 0);
                    this.field1242.method196(-3417);
                    this.field1242.method197(false);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1237[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1216 = new PixMap(var35.field663, 5, var35.field664, this.method11(-914));
                    var35.method184(field1463, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1217 = new PixMap(var36.field663, 5, var36.field664, this.method11(-914));
                    var36.method184(field1463, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1218 = new PixMap(var37.field663, 5, var37.field664, this.method11(-914));
                    var37.method184(field1463, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1219 = new PixMap(var38.field663, 5, var38.field664, this.method11(-914));
                    var38.method184(field1463, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1220 = new PixMap(var39.field663, 5, var39.field664, this.method11(-914));
                    var39.method184(field1463, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1221 = new PixMap(var40.field663, 5, var40.field664, this.method11(-914));
                    var40.method184(field1463, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1222 = new PixMap(var41.field663, 5, var41.field664, this.method11(-914));
                    var41.method184(field1463, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1223 = new PixMap(var42.field663, 5, var42.field664, this.method11(-914));
                    var42.method184(field1463, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1224 = new PixMap(var43.field663, 5, var43.field664, this.method11(-914));
                    var43.method184(field1463, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1230[var48] != null) {
                            this.field1230[var48].method182(var44 + var47, var46 + var47, var45 + var47, -45258);
                        }
                        if (this.field1510[var48] != null) {
                            this.field1510[var48].method198(var44 + var47, var46 + var47, var45 + var47, -45258);
                        }
                    }
                    this.method13("Unpacking textures", -761, 83);
                    Pix3D.method169((byte) 34, var7);
                    Pix3D.method173(true, 0.8D);
                    Pix3D.method168(8, 20);
                    this.method13("Unpacking config", -761, 86);
                    SeqType.method381(var4, -30);
                    LocType.method328(var4);
                    FloType.method371(var4, -30);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(var4, -30);
                    SpotAnimType.method384(var4, -30);
                    VarpType.method389(var4, -30);
                    VarbitType.method387(var4, -30);
                    ObjType.field1044 = field1549;
                    if (!field1550) {
                        this.method13("Unpacking sounds", -761, 90);
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, 58);
                        Wave.method318(var50, -30);
                    }
                    this.method13("Unpacking interfaces", -761, 95);
                    PixFont[] var51 = new PixFont[] { this.field1380, this.field1381, this.field1382, this.field1383 };
                    Component.method32((byte) 3, var51, var5, var6);
                    this.method13("Preparing game engine", -761, 100);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1516.field676[this.field1516.field678 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1594[var52] = var53;
                        this.field1509[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1516.field676[this.field1516.field678 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1247[var56 - 5] = var57 - 25;
                        this.field1526[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(479, 96, (byte) -108);
                    this.field1317 = Pix3D.field645;
                    Pix3D.method166(190, 261, (byte) -108);
                    this.field1318 = Pix3D.field645;
                    Pix3D.method166(512, 334, (byte) -108);
                    this.field1319 = Pix3D.field645;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field643[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(var60, 500, 334, 800, 512, 0);
                    WordFilter.method391(var8);
                    this.field1378 = new MouseTracking(field1522, this);
                    this.method12(this.field1378, 10);
                    LocEntity.field486 = this;
                    LocType.field944 = this;
                    NpcType.field1000 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1518 + " " + this.field1235);
                    this.field1260 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method440(int arg0) {
        ++field1540;
        if (arg0 >= this.field1250 && arg0 <= this.field1250) {
            if (field1540 > 192) {
                field1540 = 0;
                this.field1259.method218(this.field1236, 166);
                this.field1259.method219(232);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5((byte) -4);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1226 != -1 && this.field1657 == this.field1226) {
                            if (var2 == 8 && this.field1361.length() > 0) {
                                this.field1361 = this.field1361.substring(0, this.field1361.length() - 1);
                            }
                            break;
                        }
                        if (this.field1613) {
                            if (var2 >= 32 && var2 <= 122 && this.field1545.length() < 80) {
                                this.field1545 = this.field1545 + (char) var2;
                                this.field1574 = true;
                            }
                            if (var2 == 8 && this.field1545.length() > 0) {
                                this.field1545 = this.field1545.substring(0, this.field1545.length() - 1);
                                this.field1574 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1613 = false;
                                this.field1574 = true;
                                if (this.field1257 == 1) {
                                    long var3 = JString.method300(this.field1545);
                                    this.method518(var3, true);
                                }
                                if (this.field1257 == 2 && this.field1346 > 0) {
                                    long var5 = JString.method300(this.field1545);
                                    this.method436(var5, 9);
                                }
                                if (this.field1257 == 3 && this.field1545.length() > 0) {
                                    this.field1259.method218(this.field1236, 165);
                                    this.field1259.method219(0);
                                    int var7 = this.field1259.field711;
                                    this.field1259.method225(this.field1258, this.field1641);
                                    WordPack.method307((byte) 7, this.field1259, this.field1545);
                                    this.field1259.method228(-164, this.field1259.field711 - var7);
                                    this.field1545 = WordPack.method308((byte) 59, this.field1545);
                                    this.field1545 = WordFilter.method401((byte) 59, this.field1545);
                                    this.method519(true, 6, this.field1545, JString.method304(JString.method301(this.field1258, false), 789));
                                    if (this.field1414 == 2) {
                                        this.field1414 = 1;
                                        this.field1639 = true;
                                        this.field1259.method218(this.field1236, 215);
                                        this.field1259.method219(this.field1598);
                                        this.field1259.method219(this.field1414);
                                        this.field1259.method219(this.field1528);
                                    }
                                }
                                if (this.field1257 == 4 && this.field1512 < 100) {
                                    long var8 = JString.method300(this.field1545);
                                    this.method524(var8, true);
                                }
                                if (this.field1257 == 5 && this.field1512 > 0) {
                                    long var10 = JString.method300(this.field1545);
                                    this.method468(var10, -825);
                                }
                            }
                        } else if (this.field1615) {
                            if (var2 >= 48 && var2 <= 57 && this.field1544.length() < 10) {
                                this.field1544 = this.field1544 + (char) var2;
                                this.field1574 = true;
                            }
                            if (var2 == 8 && this.field1544.length() > 0) {
                                this.field1544 = this.field1544.substring(0, this.field1544.length() - 1);
                                this.field1574 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1544.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1544);
                                    } catch (Exception var19) {
                                    }
                                    this.field1259.method218(this.field1236, 112);
                                    this.field1259.method223(var12);
                                }
                                this.field1615 = false;
                                this.field1574 = true;
                            }
                        } else if (this.field1345 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1535.length() < 80) {
                                this.field1535 = this.field1535 + (char) var2;
                                this.field1574 = true;
                            }
                            if (var2 == 8 && this.field1535.length() > 0) {
                                this.field1535 = this.field1535.substring(0, this.field1535.length() - 1);
                                this.field1574 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1535.length() > 0) {
                                if (this.field1432 == 2) {
                                    if (this.field1535.equals("::clientdrop")) {
                                        this.method526((byte) 3);
                                    }
                                    if (this.field1535.equals("::lag")) {
                                        this.method456(true);
                                    }
                                    if (this.field1535.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field1266.method272(4, 2); ++var13) {
                                            this.field1266.method282((byte) 1, 2, (byte) -13, var13);
                                        }
                                    }
                                    if (this.field1535.equals("::fpson")) {
                                        field1572 = true;
                                    }
                                    if (this.field1535.equals("::fpsoff")) {
                                        field1572 = false;
                                    }
                                }
                                if (this.field1535.startsWith("::")) {
                                    this.field1259.method218(this.field1236, 78);
                                    this.field1259.method219(this.field1535.length() - 1);
                                    this.field1259.method226(this.field1535.substring(2));
                                } else {
                                    String var14 = this.field1535.toLowerCase();
                                    byte var15 = 0;
                                    if (var14.startsWith("yellow:")) {
                                        var15 = 0;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var14.startsWith("red:")) {
                                        var15 = 1;
                                        this.field1535 = this.field1535.substring(4);
                                    } else if (var14.startsWith("green:")) {
                                        var15 = 2;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var14.startsWith("cyan:")) {
                                        var15 = 3;
                                        this.field1535 = this.field1535.substring(5);
                                    } else if (var14.startsWith("purple:")) {
                                        var15 = 4;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var14.startsWith("white:")) {
                                        var15 = 5;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var14.startsWith("flash1:")) {
                                        var15 = 6;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var14.startsWith("flash2:")) {
                                        var15 = 7;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var14.startsWith("flash3:")) {
                                        var15 = 8;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var14.startsWith("glow1:")) {
                                        var15 = 9;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var14.startsWith("glow2:")) {
                                        var15 = 10;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var14.startsWith("glow3:")) {
                                        var15 = 11;
                                        this.field1535 = this.field1535.substring(6);
                                    }
                                    String var16 = this.field1535.toLowerCase();
                                    byte var17 = 0;
                                    if (var16.startsWith("wave:")) {
                                        var17 = 1;
                                        this.field1535 = this.field1535.substring(5);
                                    } else if (var16.startsWith("wave2:")) {
                                        var17 = 2;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var16.startsWith("shake:")) {
                                        var17 = 3;
                                        this.field1535 = this.field1535.substring(6);
                                    } else if (var16.startsWith("scroll:")) {
                                        var17 = 4;
                                        this.field1535 = this.field1535.substring(7);
                                    } else if (var16.startsWith("slide:")) {
                                        var17 = 5;
                                        this.field1535 = this.field1535.substring(6);
                                    }
                                    this.field1259.method218(this.field1236, 233);
                                    this.field1259.method219(0);
                                    int var18 = this.field1259.field711;
                                    this.field1259.method219(var15);
                                    this.field1259.method219(var17);
                                    WordPack.method307((byte) 7, this.field1259, this.field1535);
                                    this.field1259.method228(-164, this.field1259.field711 - var18);
                                    this.field1535 = WordPack.method308((byte) 59, this.field1535);
                                    this.field1535 = WordFilter.method401((byte) 59, this.field1535);
                                    field1374.field409 = this.field1535;
                                    field1374.field411 = var15;
                                    field1374.field412 = var17;
                                    field1374.field410 = 150;
                                    if (this.field1432 == 2) {
                                        this.method519(true, 2, field1374.field409, "@cr2@" + field1374.field460);
                                    } else if (this.field1432 == 1) {
                                        this.method519(true, 2, field1374.field409, "@cr1@" + field1374.field460);
                                    } else {
                                        this.method519(true, 2, field1374.field409, field1374.field460);
                                    }
                                    if (this.field1598 == 2) {
                                        this.field1598 = 3;
                                        this.field1639 = true;
                                        this.field1259.method218(this.field1236, 215);
                                        this.field1259.method219(this.field1598);
                                        this.field1259.method219(this.field1414);
                                        this.field1259.method219(this.field1528);
                                    }
                                }
                                this.field1535 = "";
                                this.field1574 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1361.length() < 12) {
                    this.field1361 = this.field1361 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1547 = Integer.parseInt(this.getParameter("nodeid"));
        field1548 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method478((byte) 0);
        } else {
            method520(-394);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1549 = false;
        } else {
            field1549 = true;
        }
        this.method2(0, 765, 503);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method441(int arg0) {
        this.field1458 = new Pix8(this.field1570, "titlebox", 0);
        this.field1459 = new Pix8(this.field1570, "titlebutton", 0);
        this.field1326 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1326[var3] = new Pix8(this.field1570, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1326[var4] = new Pix8(this.field1570, "runes", (var4 & 3) + 12);
            }
        }
        this.field1351 = new Pix32(128, 265);
        this.field1352 = new Pix32(128, 265);
        if (arg0 == -13665) {
            for (int var5 = 0; var5 < 33920; ++var5) {
                this.field1351.field662[var5] = this.field1480.field750[var5];
            }
            for (int var6 = 0; var6 < 33920; ++var6) {
                this.field1352.field662[var6] = this.field1481.field750[var6];
            }
            this.field1566 = new int[256];
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field1566[var7] = var7 * 262144;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field1566[var8 + 64] = var8 * 1024 + 16711680;
            }
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field1566[var9 + 128] = var9 * 4 + 16776960;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field1566[var10 + 192] = 16777215;
            }
            this.field1567 = new int[256];
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field1567[var11] = var11 * 1024;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field1567[var12 + 64] = var12 * 4 + 65280;
            }
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field1567[var13 + 128] = var13 * 262144 + 65535;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field1567[var14 + 192] = 16777215;
            }
            this.field1568 = new int[256];
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field1568[var15] = var15 * 4;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field1568[var16 + 64] = var16 * 262144 + 255;
            }
            for (int var17 = 0; var17 < 64; ++var17) {
                this.field1568[var17 + 128] = var17 * 1024 + 16711935;
            }
            for (int var18 = 0; var18 < 64; ++var18) {
                this.field1568[var18 + 192] = 16777215;
            }
            this.field1565 = new int[256];
            this.field1315 = new int[32768];
            this.field1316 = new int[32768];
            this.method472(-209, (Pix8) null);
            this.field1507 = new int[32768];
            this.field1508 = new int[32768];
            this.method13("Connecting to fileserver", -761, 10);
            if (!this.field1664) {
                this.field1529 = true;
                this.field1664 = true;
                this.method12(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method442(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field1615) {
                this.field1615 = false;
                this.field1574 = true;
            }
            int var3 = this.field1231[arg0];
            int var4 = this.field1232[arg0];
            int var5 = this.field1233[arg0];
            int var6 = this.field1234[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 357) {
                this.method451(var3, var4, 123, var6, 845);
            }
            if (var5 == 563) {
                this.field1259.method218(this.field1236, 216);
                this.field1259.method220(var6);
                this.field1259.method220(var3);
                this.field1259.method220(var4);
                this.field1259.method220(this.field1646);
                this.field1629 = 0;
                this.field1630 = var4;
                this.field1631 = var3;
                this.field1632 = 2;
                if (Component.field71[var4].field77 == this.field1226) {
                    this.field1632 = 1;
                }
                if (Component.field71[var4].field77 == this.field1345) {
                    this.field1632 = 3;
                }
            }
            if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                boolean var7 = this.method510(field1374.field448[0], 0, -35517, 0, 0, false, 2, field1374.field447[0], var3, 0, var4, 0);
                if (!var7) {
                    this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var3, 1, var4, 0);
                }
                this.field1498 = super.field31;
                this.field1499 = super.field32;
                this.field1501 = 2;
                this.field1500 = 0;
                if (var5 == 617) {
                    this.field1259.method218(this.field1236, 66);
                }
                if (var5 == 778) {
                    this.field1259.method218(this.field1236, 203);
                }
                if (var5 == 139) {
                    if ((var3 & 3) == 0) {
                        ++field1387;
                    }
                    if (field1387 >= 123) {
                        this.field1259.method218(this.field1236, 237);
                        this.field1259.method223(0);
                    }
                    this.field1259.method218(this.field1236, 21);
                }
                if (var5 == 224) {
                    field1376 += var4;
                    if (field1376 >= 75) {
                        this.field1259.method218(this.field1236, 184);
                        this.field1259.method219(19);
                    }
                    this.field1259.method218(this.field1236, 204);
                }
                if (var5 == 662) {
                    field1644 += this.field1321;
                    if (field1644 >= 118) {
                        this.field1259.method218(this.field1236, 122);
                        this.field1259.method223(0);
                    }
                    this.field1259.method218(this.field1236, 205);
                }
                this.field1259.method220(this.field1320 + var3);
                this.field1259.method220(this.field1321 + var4);
                this.field1259.method220(var6);
            }
            if (var5 == 625) {
                this.method451(var3, var4, 97, var6, 845);
            }
            if (var5 == 1071) {
                this.method451(var3, var4, 246, var6, 845);
            }
            if (var5 == 743) {
                ++field1377;
                if (field1377 >= 124) {
                    this.field1259.method218(this.field1236, 201);
                    this.field1259.method220(37954);
                }
                this.method451(var3, var4, 142, var6, 845);
            }
            if (var5 == 997 && !this.field1672) {
                this.field1259.method218(this.field1236, 239);
                this.field1259.method220(var4);
                this.field1672 = true;
            }
            if (var5 == 275) {
                PlayerEntity var9 = this.field1621[var6];
                if (var9 != null) {
                    this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var9.field447[0], 1, var9.field448[0], 0);
                    this.field1498 = super.field31;
                    this.field1499 = super.field32;
                    this.field1501 = 2;
                    this.field1500 = 0;
                    this.field1259.method218(this.field1236, 242);
                    this.field1259.method220(var6);
                    this.field1259.method220(this.field1428);
                    this.field1259.method220(this.field1426);
                    this.field1259.method220(this.field1427);
                }
            }
            if (var5 == 274) {
                Component var10 = Component.field71[var4];
                this.field1645 = 1;
                this.field1646 = var4;
                this.field1647 = var10.field131;
                this.field1425 = 0;
                this.field1327 = true;
                String var11 = var10.field129;
                if (var11.indexOf(" ") != -1) {
                    var11 = var11.substring(0, var11.indexOf(" "));
                }
                String var12 = var10.field129;
                if (var12.indexOf(" ") != -1) {
                    var12 = var12.substring(var12.indexOf(" ") + 1);
                }
                this.field1648 = var11 + " " + var10.field130 + " " + var12;
                if (this.field1647 == 16) {
                    this.field1327 = true;
                    this.field1438 = 3;
                    this.field1597 = true;
                }
            } else {
                if (var5 == 507 || var5 == 957) {
                    String var13 = this.field1511[arg0];
                    int var14 = var13.indexOf("@whi@");
                    if (var14 != -1) {
                        String var15 = var13.substring(var14 + 5).trim();
                        String var16 = JString.method304(JString.method301(JString.method300(var15), false), 789);
                        boolean var17 = false;
                        for (int var18 = 0; var18 < this.field1622; ++var18) {
                            PlayerEntity var19 = this.field1621[this.field1623[var18]];
                            if (var19 != null && var19.field460 != null && var19.field460.equalsIgnoreCase(var16)) {
                                this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var19.field447[0], 1, var19.field448[0], 0);
                                if (var5 == 507) {
                                    field1450 += var6;
                                    if (field1450 >= 66) {
                                        this.field1259.method218(this.field1236, 244);
                                        this.field1259.method219(154);
                                    }
                                    this.field1259.method218(this.field1236, 183);
                                }
                                if (var5 == 957) {
                                    ++field1461;
                                    if (field1461 >= 52) {
                                        this.field1259.method218(this.field1236, 206);
                                        this.field1259.method219(131);
                                    }
                                    this.field1259.method218(this.field1236, 230);
                                }
                                this.field1259.method220(this.field1623[var18]);
                                var17 = true;
                                break;
                            }
                        }
                        if (!var17) {
                            this.method519(true, 0, "Unable to find " + var16, "");
                        }
                    }
                }
                if (var5 == 435) {
                    this.field1259.method218(this.field1236, 100);
                    this.field1259.method220(var4);
                    Component var20 = Component.field71[var4];
                    if (var20.field86 != null && var20.field86[0][0] == 5) {
                        int var21 = var20.field86[0][1];
                        this.field1227[var21] = 1 - this.field1227[var21];
                        this.method453(0, var21);
                        this.field1327 = true;
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var22 = this.field1674[var6];
                    if (var22 != null) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var22.field447[0], 1, var22.field448[0], 0);
                        this.field1498 = super.field31;
                        this.field1499 = super.field32;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        if (var5 == 242) {
                            this.field1259.method218(this.field1236, 70);
                        }
                        if (var5 == 852) {
                            this.field1259.method218(this.field1236, 17);
                        }
                        if (var5 == 793) {
                            this.field1259.method218(this.field1236, 149);
                        }
                        if (var5 == 309) {
                            this.field1259.method218(this.field1236, 106);
                        }
                        if (var5 == 209) {
                            this.field1259.method218(this.field1236, 45);
                        }
                        this.field1259.method220(var6);
                    }
                }
                if (var5 == 524) {
                    String var23 = this.field1511[arg0];
                    int var24 = var23.indexOf("@whi@");
                    if (var24 != -1) {
                        if (this.field1226 == -1) {
                            this.method536(3);
                            this.field1361 = var23.substring(var24 + 5).trim();
                            this.field1471 = false;
                            for (int var25 = 0; var25 < Component.field71.length; ++var25) {
                                if (Component.field71[var25] != null && Component.field71[var25].field80 == 600) {
                                    this.field1657 = this.field1226 = Component.field71[var25].field77;
                                    break;
                                }
                            }
                        } else {
                            this.method519(true, 0, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var5 == 737) {
                    this.method536(3);
                }
                if (var5 == 398) {
                    this.field1259.method218(this.field1236, 241);
                    this.field1259.method220(var6);
                    this.field1259.method220(var3);
                    this.field1259.method220(var4);
                    this.field1259.method220(this.field1428);
                    this.field1259.method220(this.field1426);
                    this.field1259.method220(this.field1427);
                    this.field1629 = 0;
                    this.field1630 = var4;
                    this.field1631 = var3;
                    this.field1632 = 2;
                    if (Component.field71[var4].field77 == this.field1226) {
                        this.field1632 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1345) {
                        this.field1632 = 3;
                    }
                }
                if (var5 == 240) {
                    NpcEntity var26 = this.field1674[var6];
                    if (var26 != null) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var26.field447[0], 1, var26.field448[0], 0);
                        this.field1498 = super.field31;
                        this.field1499 = super.field32;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1259.method218(this.field1236, 127);
                        this.field1259.method220(var6);
                        this.field1259.method220(this.field1646);
                    }
                }
                if (var5 == 1714) {
                    NpcEntity var27 = this.field1674[var6];
                    if (var27 != null) {
                        NpcType var28 = var27.field455;
                        if (var28.field1032 != null) {
                            var28 = var28.method345((byte) 8);
                        }
                        if (var28 != null) {
                            String var29;
                            if (var28.field1008 != null) {
                                var29 = new String(var28.field1008);
                            } else {
                                var29 = "It's a " + var28.field1007 + ".";
                            }
                            this.method519(true, 0, var29, "");
                        }
                    }
                }
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 100) {
                        this.field1259.method218(this.field1236, 243);
                    }
                    if (var5 == 962) {
                        this.field1259.method218(this.field1236, 52);
                    }
                    if (var5 == 694) {
                        this.field1259.method218(this.field1236, 67);
                    }
                    if (var5 == 681) {
                        ++field1460;
                        if (field1460 >= 116) {
                            this.field1259.method218(this.field1236, 214);
                            this.field1259.method222(13018169);
                        }
                        this.field1259.method218(this.field1236, 155);
                    }
                    if (var5 == 795) {
                        this.field1259.method218(this.field1236, 195);
                    }
                    this.field1259.method220(var6);
                    this.field1259.method220(var3);
                    this.field1259.method220(var4);
                    this.field1629 = 0;
                    this.field1630 = var4;
                    this.field1631 = var3;
                    this.field1632 = 2;
                    if (Component.field71[var4].field77 == this.field1226) {
                        this.field1632 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1345) {
                        this.field1632 = 3;
                    }
                }
                if (var5 == 902) {
                    String var30 = this.field1511[arg0];
                    int var31 = var30.indexOf("@whi@");
                    if (var31 != -1) {
                        long var32 = JString.method300(var30.substring(var31 + 5).trim());
                        int var34 = -1;
                        for (int var35 = 0; var35 < this.field1346; ++var35) {
                            if (this.field1295[var35] == var32) {
                                var34 = var35;
                                break;
                            }
                        }
                        if (var34 != -1 && this.field1581[var34] > 0) {
                            this.field1574 = true;
                            this.field1615 = false;
                            this.field1613 = true;
                            this.field1545 = "";
                            this.field1257 = 3;
                            this.field1258 = this.field1295[var34];
                            this.field1313 = "Enter message to send to " + this.field1271[var34];
                        }
                    }
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var36 = this.field1621[var6];
                    if (var36 != null) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var36.field447[0], 1, var36.field448[0], 0);
                        this.field1498 = super.field31;
                        this.field1499 = super.field32;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        if (var5 == 185) {
                            this.field1259.method218(this.field1236, 54);
                        }
                        if (var5 == 387) {
                            field1450 += var6;
                            if (field1450 >= 66) {
                                this.field1259.method218(this.field1236, 244);
                                this.field1259.method219(154);
                            }
                            this.field1259.method218(this.field1236, 183);
                        }
                        if (var5 == 639) {
                            ++field1461;
                            if (field1461 >= 52) {
                                this.field1259.method218(this.field1236, 206);
                                this.field1259.method219(131);
                            }
                            this.field1259.method218(this.field1236, 230);
                        }
                        if (var5 == 499) {
                            this.field1259.method218(this.field1236, 147);
                        }
                        if (var5 == 27) {
                            this.field1259.method218(this.field1236, 27);
                        }
                        this.field1259.method220(var6);
                    }
                }
                if (var5 == 1328) {
                    ObjType var37 = ObjType.method348(var6);
                    Component var38 = Component.field71[var4];
                    String var39;
                    if (var38 != null && var38.field73[var3] >= 100000) {
                        var39 = var38.field73[var3] + " x " + var37.field1047;
                    } else if (var37.field1048 != null) {
                        var39 = new String(var37.field1048);
                    } else {
                        var39 = "It's a " + var37.field1047 + ".";
                    }
                    this.method519(true, 0, var39, "");
                }
                if (var5 == 718) {
                    if (!this.field1584) {
                        this.field1614.method88(super.field32 - 4, (byte) 3, super.field31 - 4);
                    } else {
                        this.field1614.method88(var4 - 4, (byte) 3, var3 - 4);
                    }
                }
                if (var5 == 131) {
                    PlayerEntity var40 = this.field1621[var6];
                    if (var40 != null) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var40.field447[0], 1, var40.field448[0], 0);
                        this.field1498 = super.field31;
                        this.field1499 = super.field32;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1259.method218(this.field1236, 218);
                        this.field1259.method220(var6);
                        this.field1259.method220(this.field1646);
                    }
                }
                if (var5 == 1152) {
                    ObjType var41 = ObjType.method348(var6);
                    String var42;
                    if (var41.field1048 != null) {
                        var42 = new String(var41.field1048);
                    } else {
                        var42 = "It's a " + var41.field1047 + ".";
                    }
                    this.method519(true, 0, var42, "");
                }
                if (var5 == 721) {
                    field1402 += var4;
                    if (field1402 >= 139) {
                        this.field1259.method218(this.field1236, 59);
                        this.field1259.method223(0);
                    }
                    this.method451(var3, var4, 139, var6, 845);
                }
                if (var5 == 1381) {
                    int var43 = var6 >> 14 & 32767;
                    LocType var44 = LocType.method330(var43);
                    String var45;
                    if (var44.field956 != null) {
                        var45 = new String(var44.field956);
                    } else {
                        var45 = "It's a " + var44.field955 + ".";
                    }
                    this.method519(true, 0, var45, "");
                }
                if (var5 == 370) {
                    boolean var46 = this.method510(field1374.field448[0], 0, -35517, 0, 0, false, 2, field1374.field447[0], var3, 0, var4, 0);
                    if (!var46) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var3, 1, var4, 0);
                    }
                    this.field1498 = super.field31;
                    this.field1499 = super.field32;
                    this.field1501 = 2;
                    this.field1500 = 0;
                    this.field1259.method218(this.field1236, 144);
                    this.field1259.method220(this.field1320 + var3);
                    this.field1259.method220(this.field1321 + var4);
                    this.field1259.method220(var6);
                    this.field1259.method220(this.field1646);
                }
                if (var5 == 231) {
                    Component var48 = Component.field71[var4];
                    boolean var49 = true;
                    if (var48.field80 > 0) {
                        var49 = this.method458(true, var48);
                    }
                    if (var49) {
                        this.field1259.method218(this.field1236, 100);
                        this.field1259.method220(var4);
                    }
                }
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var50 = this.field1511[arg0];
                    int var51 = var50.indexOf("@whi@");
                    if (var51 != -1) {
                        long var52 = JString.method300(var50.substring(var51 + 5).trim());
                        if (var5 == 605) {
                            this.method518(var52, true);
                        }
                        if (var5 == 47) {
                            this.method524(var52, true);
                        }
                        if (var5 == 513) {
                            this.method436(var52, 9);
                        }
                        if (var5 == 884) {
                            this.method468(var52, -825);
                        }
                    }
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 113) {
                        this.field1259.method218(this.field1236, 25);
                    }
                    if (var5 == 331) {
                        this.field1259.method218(this.field1236, 210);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1350;
                        }
                        if (field1350 >= 133) {
                            this.field1259.method218(this.field1236, 30);
                            this.field1259.method220(6118);
                        }
                        this.field1259.method218(this.field1236, 103);
                    }
                    if (var5 == 555) {
                        this.field1259.method218(this.field1236, 85);
                    }
                    if (var5 == 354) {
                        this.field1259.method218(this.field1236, 198);
                    }
                    this.field1259.method220(var6);
                    this.field1259.method220(var3);
                    this.field1259.method220(var4);
                    this.field1629 = 0;
                    this.field1630 = var4;
                    this.field1631 = var3;
                    this.field1632 = 2;
                    if (Component.field71[var4].field77 == this.field1226) {
                        this.field1632 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1345) {
                        this.field1632 = 3;
                    }
                }
                if (var5 == 829) {
                    NpcEntity var54 = this.field1674[var6];
                    if (var54 != null) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var54.field447[0], 1, var54.field448[0], 0);
                        this.field1498 = super.field31;
                        this.field1499 = super.field32;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1259.method218(this.field1236, 150);
                        this.field1259.method220(var6);
                        this.field1259.method220(this.field1428);
                        this.field1259.method220(this.field1426);
                        this.field1259.method220(this.field1427);
                    }
                }
                if (var5 == 899 && this.method451(var3, var4, 167, var6, 845)) {
                    this.field1259.method220(this.field1646);
                }
                if (var5 == 111) {
                    boolean var55 = this.method510(field1374.field448[0], 0, -35517, 0, 0, false, 2, field1374.field447[0], var3, 0, var4, 0);
                    if (!var55) {
                        this.method510(field1374.field448[0], 0, -35517, 0, 1, false, 2, field1374.field447[0], var3, 1, var4, 0);
                    }
                    this.field1498 = super.field31;
                    this.field1499 = super.field32;
                    this.field1501 = 2;
                    this.field1500 = 0;
                    this.field1259.method218(this.field1236, 176);
                    this.field1259.method220(this.field1320 + var3);
                    this.field1259.method220(this.field1321 + var4);
                    this.field1259.method220(var6);
                    this.field1259.method220(this.field1428);
                    this.field1259.method220(this.field1426);
                    this.field1259.method220(this.field1427);
                }
                if (var5 == 225) {
                    this.field1259.method218(this.field1236, 100);
                    this.field1259.method220(var4);
                    Component var57 = Component.field71[var4];
                    if (var57.field86 != null && var57.field86[0][0] == 5) {
                        int var58 = var57.field86[0][1];
                        if (this.field1227[var58] != var57.field88[0]) {
                            this.field1227[var58] = var57.field88[0];
                            this.method453(0, var58);
                            this.field1327 = true;
                        }
                    }
                }
                if (var5 == 102) {
                    this.field1425 = 1;
                    this.field1426 = var3;
                    this.field1427 = var4;
                    this.field1428 = var6;
                    this.field1429 = ObjType.method348(var6).field1047;
                    this.field1645 = 0;
                    this.field1327 = true;
                } else {
                    if (var5 == 810 && this.method451(var3, var4, 9, var6, 845)) {
                        this.field1259.method220(this.field1428);
                        this.field1259.method220(this.field1426);
                        this.field1259.method220(this.field1427);
                    }
                    this.field1425 = 0;
                    this.field1645 = 0;
                    if (!arg1) {
                        field1268 = !field1268;
                    }
                    this.field1327 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method443(int arg0, int arg1, Packet arg2) {
        arg2.method239(false);
        int var4 = arg2.method240(this.field1310, 8);
        if (var4 < this.field1675) {
            for (int var5 = var4; var5 < this.field1675; ++var5) {
                this.field1419[this.field1418++] = this.field1676[var5];
            }
        }
        if (var4 > this.field1675) {
            signlink.reporterror(this.field1654 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1675 = 0;
            if (arg0 <= 0) {
                this.field1307 = this.field1416.method295();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1676[var6];
                NpcEntity var8 = this.field1674[var7];
                int var9 = arg2.method240(this.field1310, 1);
                if (var9 == 0) {
                    this.field1676[this.field1675++] = var7;
                    var8.field442 = field1275;
                } else {
                    int var10 = arg2.method240(this.field1310, 2);
                    if (var10 == 0) {
                        this.field1676[this.field1675++] = var7;
                        var8.field442 = field1275;
                        this.field1625[this.field1624++] = var7;
                    } else if (var10 == 1) {
                        this.field1676[this.field1675++] = var7;
                        var8.field442 = field1275;
                        int var11 = arg2.method240(this.field1310, 3);
                        var8.method111(692, var11, false);
                        int var12 = arg2.method240(this.field1310, 1);
                        if (var12 == 1) {
                            this.field1625[this.field1624++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1676[this.field1675++] = var7;
                        var8.field442 = field1275;
                        int var13 = arg2.method240(this.field1310, 3);
                        var8.method111(692, var13, true);
                        int var14 = arg2.method240(this.field1310, 3);
                        var8.method111(692, var14, true);
                        int var15 = arg2.method240(this.field1310, 1);
                        if (var15 == 1) {
                            this.field1625[this.field1624++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1419[this.field1418++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method444(int arg0) {
        ++this.field1446;
        this.method474(true, (byte) 58);
        this.method433(true, (byte) 8);
        this.method474(false, (byte) 58);
        this.method433(false, (byte) 8);
        this.method473(-144);
        this.method438(true);
        if (!this.field1671) {
            int var2 = this.field1441;
            if (this.field1513 / 256 > var2) {
                var2 = this.field1513 / 256;
            }
            if (this.field1368[4] && this.field1445[4] + 128 > var2) {
                var2 = this.field1445[4] + 128;
            }
            int var3 = this.field1448 + this.field1442 & 2047;
            this.method437(var2, 2, this.field1650, var3, this.field1649, this.method513(this.field1592, this.field1546, field1374.field397, field1374.field398) - 50, var2 * 3 + 600);
        }
        int var4;
        if (!this.field1671) {
            var4 = this.method559(false);
        } else {
            var4 = this.method560((byte) 1);
        }
        int var5 = this.field1331;
        int var6 = this.field1332;
        int var7 = this.field1333;
        int var8 = this.field1334;
        int var9 = this.field1335;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1368[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field1472[var10] * 2 + 1) - (double) this.field1472[var10] + Math.sin((double) this.field1640[var10] / 100.0D * (double) this.field1496[var10]) * (double) this.field1445[var10]);
                if (var10 == 0) {
                    this.field1331 += var13;
                }
                if (var10 == 1) {
                    this.field1332 += var13;
                }
                if (var10 == 2) {
                    this.field1333 += var13;
                }
                if (var10 == 3) {
                    this.field1335 = this.field1335 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field1334 += var13;
                    if (this.field1334 < 128) {
                        this.field1334 = 128;
                    }
                    if (this.field1334 > 383) {
                        this.field1334 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field654;
        Model.field599 = true;
        Model.field602 = 0;
        if (arg0 != 7) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        Model.field600 = super.field24 - 4;
        Model.field601 = super.field25 - 4;
        Pix2D.method155(this.field1289);
        this.field1614.method89(128, this.field1333, var4, this.field1331, this.field1334, this.field1335, this.field1332);
        this.field1614.method64(false);
        this.method555(-901);
        this.method540((byte) 4);
        this.method464(false, var11);
        this.method548(false);
        this.field1453.method259(super.field16, 4, 4, (byte) 8);
        this.field1331 = var5;
        this.field1332 = var6;
        this.field1333 = var7;
        this.field1334 = var8;
        this.field1335 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method445(boolean arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1346; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1271[var3])) {
                    return true;
                }
            }
            if (!arg0) {
                this.method6();
            }
            return arg1.equalsIgnoreCase(field1374.field460);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        short var2 = 256;
        this.field1602 &= arg0;
        if (this.field1244 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1244 > 768) {
                    this.field1565[var3] = this.method532((byte) 0, this.field1567[var3], 1024 - this.field1244, this.field1566[var3]);
                } else if (this.field1244 > 256) {
                    this.field1565[var3] = this.field1567[var3];
                } else {
                    this.field1565[var3] = this.method532((byte) 0, this.field1566[var3], 256 - this.field1244, this.field1567[var3]);
                }
            }
        } else if (this.field1245 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1245 > 768) {
                    this.field1565[var4] = this.method532((byte) 0, this.field1568[var4], 1024 - this.field1245, this.field1566[var4]);
                } else if (this.field1245 > 256) {
                    this.field1565[var4] = this.field1568[var4];
                } else {
                    this.field1565[var4] = this.method532((byte) 0, this.field1566[var4], 256 - this.field1245, this.field1568[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1565[var5] = this.field1566[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1480.field750[var6] = this.field1351.field662[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1536[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1507[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1565[var26];
                    int var30 = this.field1480.field750[var8];
                    this.field1480.field750[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1480.method259(super.field16, 0, 0, (byte) 8);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1481.field750[var10] = this.field1352.field662[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1536[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1507[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1565[var18];
                    int var22 = this.field1481.field750[var16];
                    this.field1481.field750[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1481.method259(super.field16, 0, 637, (byte) 8);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLlb;I)V")
    private final void method447(boolean arg0, Packet arg1, int arg2) {
        this.field1418 = 0;
        this.field1624 = 0;
        this.method488(arg1, arg2, -33436);
        this.method552(0, arg1, arg2);
        this.method449(0, arg2, arg1);
        this.method471(arg1, arg2, true);
        if (arg0) {
            this.field1521 = !this.field1521;
        }
        for (int var4 = 0; var4 < this.field1418; ++var4) {
            int var6 = this.field1419[var4];
            if (field1275 != this.field1621[var6].field442) {
                this.field1621[var6] = null;
            }
        }
        if (arg1.field711 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field711 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1622; ++var5) {
                if (this.field1621[this.field1623[var5]] == null) {
                    signlink.reporterror(this.field1654 + " null entry in pl list - pos:" + var5 + " size:" + this.field1622);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method448(String arg0) throws IOException {
        if (!this.field1353) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1277 != null) {
                try {
                    this.field1277.close();
                } catch (Exception var4) {
                }
                this.field1277 = null;
            }
            this.field1277 = this.method545(43595);
            this.field1277.setSoTimeout(10000);
            InputStream var2 = this.field1277.getInputStream();
            OutputStream var3 = this.field1277.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    private final void method449(int arg0, int arg1, Packet arg2) {
        if (arg0 == 0) {
            while (arg2.field712 + 10 < arg1 * 8) {
                int var4 = arg2.method240(this.field1310, 11);
                if (var4 == 2047) {
                    break;
                }
                if (this.field1621[var4] == null) {
                    this.field1621[var4] = new PlayerEntity();
                    if (this.field1626[var4] != null) {
                        this.field1621[var4].method116(this.field1626[var4], true);
                    }
                }
                this.field1623[this.field1622++] = var4;
                PlayerEntity var5 = this.field1621[var4];
                var5.field442 = field1275;
                int var6 = arg2.method240(this.field1310, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method240(this.field1310, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg2.method240(this.field1310, 1);
                var5.method110(3, field1374.field448[0] + var7, var8 == 1, field1374.field447[0] + var6);
                int var9 = arg2.method240(this.field1310, 1);
                if (var9 == 1) {
                    this.field1625[this.field1624++] = var4;
                }
            }
            arg2.method241(this.field1554);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method450(boolean arg0) {
        try {
            if (this.field1370 != null) {
                this.field1370.method38();
            }
        } catch (Exception var3) {
        }
        this.field1370 = null;
        this.field1602 = false;
        this.field1278 = 0;
        this.field1654 = "";
        this.field1655 = "";
        this.method541(336);
        this.field1614.method50(880);
        if (arg0) {
            this.field1467 = this.field1534.method229();
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1314[var2].method359(25762);
        }
        System.gc();
        this.method434(0);
        this.field1667 = -1;
        this.field1575 = -1;
        this.field1447 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg3 >> 14 & 32767;
        int var7 = this.field1614.method80(this.field1546, arg0, arg1, arg3);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            int var10 = 71 / arg4;
            ++field1252;
            if (field1252 > 1086) {
                field1252 = 0;
                this.field1259.method218(this.field1236, 46);
                this.field1259.method219(0);
                int var11 = this.field1259.field711;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method220(16791);
                }
                this.field1259.method219(254);
                this.field1259.method220((int) (Math.random() * 65536.0D));
                this.field1259.method220(16128);
                this.field1259.method220(52610);
                this.field1259.method220((int) (Math.random() * 65536.0D));
                this.field1259.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method220(35025);
                }
                this.field1259.method220(46628);
                this.field1259.method219((int) (Math.random() * 256.0D));
                this.field1259.method228(-164, this.field1259.field711 - var11);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method510(field1374.field448[0], var9, -35517, 0, 0, false, 2, field1374.field447[0], arg0, 0, arg1, var8 + 1);
            } else {
                LocType var12 = LocType.method330(var6);
                int var13;
                int var14;
                if (var9 != 0 && var9 != 2) {
                    var13 = var12.field960;
                    var14 = var12.field959;
                } else {
                    var13 = var12.field959;
                    var14 = var12.field960;
                }
                int var15 = var12.field982;
                if (var9 != 0) {
                    var15 = (var15 >> 4 - var9) + (var15 << var9 & 15);
                }
                this.method510(field1374.field448[0], 0, -35517, var15, var13, false, 2, field1374.field447[0], arg0, var14, arg1, 0);
            }
            this.field1498 = super.field31;
            this.field1499 = super.field32;
            this.field1501 = 2;
            this.field1500 = 0;
            this.field1259.method218(this.field1236, arg2);
            this.field1259.method220(this.field1320 + arg0);
            this.field1259.method220(this.field1321 + arg1);
            this.field1259.method220(var6);
            return true;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 == 0) {
            while (true) {
                OnDemandRequest var2 = this.field1266.method281();
                if (var2 == null) {
                    return;
                }
                if (var2.field724 == 0) {
                    Model.method124(72, var2.field726, var2.field725);
                    if ((this.field1266.method277(724, var2.field725) & 98) != 0) {
                        this.field1327 = true;
                        if (this.field1345 != -1) {
                            this.field1574 = true;
                        }
                    }
                }
                if (var2.field724 == 1 && var2.field726 != null) {
                    AnimFrame.method45(var2.field726, 0);
                }
                if (var2.field724 == 2 && this.field1575 == var2.field725 && var2.field726 != null) {
                    this.method476(this.field1576, 0, var2.field726);
                }
                if (var2.field724 == 3 && this.field1288 == 1) {
                    for (int var3 = 0; var3 < this.field1375.length; ++var3) {
                        if (this.field1255[var3] == var2.field725) {
                            this.field1375[var3] = var2.field726;
                            if (var2.field726 == null) {
                                this.field1255[var3] = -1;
                            }
                            break;
                        }
                        if (this.field1256[var3] == var2.field725) {
                            this.field1431[var3] = var2.field726;
                            if (var2.field726 == null) {
                                this.field1256[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field724 == 93 && this.field1266.method276(var2.field725, -46678)) {
                    World.method17(this.field1266, false, new Packet(var2.field726, 58));
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method453(int arg0, int arg1) {
        int var3 = VarpType.field1181[arg1].field1189;
        if (arg0 != 0) {
            this.field1521 = !this.field1521;
        }
        if (var3 != 0) {
            int var4 = this.field1227[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method173(true, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method173(true, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method173(true, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method173(true, 0.6D);
                }
                ObjType.field1086.method103();
                this.field1364 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1415;
                if (var4 == 0) {
                    this.method431(0, this.field1415, -39072);
                    this.field1415 = true;
                }
                if (var4 == 1) {
                    this.method431(-400, this.field1415, -39072);
                    this.field1415 = true;
                }
                if (var4 == 2) {
                    this.method431(-800, this.field1415, -39072);
                    this.field1415 = true;
                }
                if (var4 == 3) {
                    this.method431(-1200, this.field1415, -39072);
                    this.field1415 = true;
                }
                if (var4 == 4) {
                    this.field1415 = false;
                }
                if (this.field1415 != var5 && !field1550) {
                    if (this.field1415) {
                        this.field1575 = this.field1667;
                        this.field1576 = true;
                        this.field1266.method279(2, this.field1575);
                    } else {
                        this.method434(0);
                    }
                    this.field1447 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1525 = true;
                    this.method496(0, this.field1354);
                }
                if (var4 == 1) {
                    this.field1525 = true;
                    this.method496(-400, this.field1354);
                }
                if (var4 == 2) {
                    this.field1525 = true;
                    this.method496(-800, this.field1354);
                }
                if (var4 == 3) {
                    this.field1525 = true;
                    this.method496(-1200, this.field1354);
                }
                if (var4 == 4) {
                    this.field1525 = false;
                }
            }
            if (var3 == 5) {
                this.field1430 = var4;
            }
            if (var3 == 6) {
                this.field1663 = var4;
            }
            if (var3 == 8) {
                this.field1291 = var4;
                this.field1574 = true;
            }
            if (var3 == 9) {
                this.field1610 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method454(int arg0) {
        for (int var2 = -1; var2 < this.field1622; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1620;
            } else {
                var6 = this.field1623[var2];
            }
            PlayerEntity var7 = this.field1621[var6];
            if (var7 != null && var7.field410 > 0) {
                --var7.field410;
                if (var7.field410 == 0) {
                    var7.field409 = null;
                }
            }
        }
        if (arg0 != 0) {
            field1360 = 276;
        }
        for (int var3 = 0; var3 < this.field1675; ++var3) {
            int var4 = this.field1676[var3];
            NpcEntity var5 = this.field1674[var4];
            if (var5 != null && var5.field410 > 0) {
                --var5.field410;
                if (var5.field410 == 0) {
                    var5.field409 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method455(byte arg0) {
        if (this.field1291 != 0) {
            int var2 = 0;
            if (arg0 == 1) {
                boolean var3 = false;
            } else {
                this.field1294 = null;
            }
            if (this.field1301 != 0) {
                var2 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1373[var4] != null) {
                    int var5 = this.field1371[var4];
                    String var6 = this.field1372[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1414 == 0 || this.field1414 == 1 && this.method445(true, var6))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field24 > 4 && super.field25 - 4 > var10 - 10 && super.field25 - 4 <= var10 + 3) {
                            int var11 = this.field1381.method204((byte) 5, "From:  " + var6 + this.field1373[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field24 < var11 + 4) {
                                if (this.field1432 >= 1) {
                                    this.field1511[this.field1390] = "Report abuse @whi@" + var6;
                                    this.field1233[this.field1390] = 2524;
                                    ++this.field1390;
                                }
                                this.field1511[this.field1390] = "Add ignore @whi@" + var6;
                                this.field1233[this.field1390] = 2047;
                                ++this.field1390;
                                this.field1511[this.field1390] = "Add friend @whi@" + var6;
                                this.field1233[this.field1390] = 2605;
                                ++this.field1390;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field1414 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public void method456(boolean arg0) {
        this.field1602 &= arg0;
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1497);
        if (this.field1266 != null) {
            System.out.println("Od-cycle:" + this.field1266.field851);
        }
        System.out.println("loop-cycle:" + field1275);
        System.out.println("draw-cycle:" + field1309);
        System.out.println("ptype:" + this.field1467);
        System.out.println("psize:" + this.field1466);
        if (this.field1370 != null) {
            this.field1370.method43(true);
        }
        super.field13 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        while (arg0 >= 0) {
            this.method6();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field19 != null) {
            return super.field19;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIIIIII)V")
    private final void method457(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1399.method248(); var12 != null; var12 = (LocSpawned) this.field1399.method250((byte) 8)) {
            if (var12.field729 == arg6 && var12.field731 == arg2 && var12.field732 == arg7 && var12.field730 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field729 = arg6;
            var11.field730 = arg0;
            var11.field731 = arg2;
            var11.field732 = arg7;
            this.method463(this.field1531, var11);
            this.field1399.method245(var11);
        }
        var11.field736 = arg3;
        var11.field738 = arg8;
        if (arg1 == 3) {
            var11.field737 = arg5;
            var11.field739 = arg9;
            var11.field740 = arg4;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)Z")
    public final boolean method458(boolean arg0, Component arg1) {
        int var3 = arg1.field80;
        if (!arg0) {
            throw new NullPointerException();
        } else {
            if (this.field1347 == 2) {
                if (var3 == 201) {
                    this.field1574 = true;
                    this.field1615 = false;
                    this.field1613 = true;
                    this.field1545 = "";
                    this.field1257 = 1;
                    this.field1313 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field1574 = true;
                    this.field1615 = false;
                    this.field1613 = true;
                    this.field1545 = "";
                    this.field1257 = 2;
                    this.field1313 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field1470 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field1574 = true;
                    this.field1615 = false;
                    this.field1613 = true;
                    this.field1545 = "";
                    this.field1257 = 4;
                    this.field1313 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field1574 = true;
                    this.field1615 = false;
                    this.field1613 = true;
                    this.field1545 = "";
                    this.field1257 = 5;
                    this.field1313 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field1494[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = IdkType.field1115 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= IdkType.field1115) {
                                    var6 = 0;
                                }
                            }
                            if (!IdkType.field1116[var6].field1122 && IdkType.field1116[var6].field1117 == var4 + (this.field1569 ? 0 : 7)) {
                                this.field1494[var4] = var6;
                                this.field1417 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field1530[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field1591[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field1591[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field1530[var7] = var9;
                    this.field1417 = true;
                }
                if (var3 == 324 && !this.field1569) {
                    this.field1569 = true;
                    this.method550((byte) 100);
                }
                if (var3 == 325 && this.field1569) {
                    this.field1569 = false;
                    this.method550((byte) 100);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field1471 = !this.field1471;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method536(3);
                        if (this.field1361.length() > 0) {
                            this.field1259.method218(this.field1236, 217);
                            this.field1259.method225(JString.method300(this.field1361), this.field1641);
                            this.field1259.method219(var3 - 601);
                            this.field1259.method219(this.field1471 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field1259.method218(this.field1236, 247);
                    this.field1259.method219(this.field1569 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field1259.method219(this.field1494[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field1259.method219(this.field1530[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method459(int arg0) {
        if (arg0 == 20686) {
            try {
                int var2 = field1374.field397 + this.field1282;
                int var3 = field1374.field398 + this.field1475;
                if (this.field1649 - var2 < -500 || this.field1649 - var2 > 500 || this.field1650 - var3 < -500 || this.field1650 - var3 > 500) {
                    this.field1649 = var2;
                    this.field1650 = var3;
                }
                if (this.field1649 != var2) {
                    this.field1649 += (var2 - this.field1649) / 16;
                }
                if (this.field1650 != var3) {
                    this.field1650 += (var3 - this.field1650) / 16;
                }
                if (super.field34[1] == 1) {
                    this.field1443 += (-24 - this.field1443) / 2;
                } else if (super.field34[2] == 1) {
                    this.field1443 += (24 - this.field1443) / 2;
                } else {
                    this.field1443 /= 2;
                }
                if (super.field34[3] == 1) {
                    this.field1444 += (12 - this.field1444) / 2;
                } else if (super.field34[4] == 1) {
                    this.field1444 += (-12 - this.field1444) / 2;
                } else {
                    this.field1444 /= 2;
                }
                this.field1442 = this.field1443 / 2 + this.field1442 & 2047;
                this.field1441 += this.field1444 / 2;
                if (this.field1441 < 128) {
                    this.field1441 = 128;
                }
                if (this.field1441 > 383) {
                    this.field1441 = 383;
                }
                int var4 = this.field1649 >> 7;
                int var5 = this.field1650 >> 7;
                int var6 = this.method513(this.field1592, this.field1546, this.field1649, this.field1650);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field1546;
                            if (var10 < 3 && (this.field1658[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field1249[var10][var8][var9];
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
                if (var12 > this.field1513) {
                    this.field1513 += (var12 - this.field1513) / 24;
                } else if (var12 < this.field1513) {
                    this.field1513 += (var12 - this.field1513) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field1374.field397 + "," + field1374.field398 + "," + this.field1649 + "," + this.field1650 + "," + this.field1324 + "," + this.field1325 + "," + this.field1320 + "," + this.field1321);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method460(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            String var2 = String.valueOf(arg0);
            for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            }
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method461(byte arg0) {
        if (arg0 != 24) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field30 == 1) {
            if (super.field31 >= 539 && super.field31 <= 573 && super.field32 >= 169 && super.field32 < 205 && this.field1600[0] != -1) {
                this.field1327 = true;
                this.field1438 = 0;
                this.field1597 = true;
            }
            if (super.field31 >= 569 && super.field31 <= 599 && super.field32 >= 168 && super.field32 < 205 && this.field1600[1] != -1) {
                this.field1327 = true;
                this.field1438 = 1;
                this.field1597 = true;
            }
            if (super.field31 >= 597 && super.field31 <= 627 && super.field32 >= 168 && super.field32 < 205 && this.field1600[2] != -1) {
                this.field1327 = true;
                this.field1438 = 2;
                this.field1597 = true;
            }
            if (super.field31 >= 625 && super.field31 <= 669 && super.field32 >= 168 && super.field32 < 203 && this.field1600[3] != -1) {
                this.field1327 = true;
                this.field1438 = 3;
                this.field1597 = true;
            }
            if (super.field31 >= 666 && super.field31 <= 696 && super.field32 >= 168 && super.field32 < 205 && this.field1600[4] != -1) {
                this.field1327 = true;
                this.field1438 = 4;
                this.field1597 = true;
            }
            if (super.field31 >= 694 && super.field31 <= 724 && super.field32 >= 168 && super.field32 < 205 && this.field1600[5] != -1) {
                this.field1327 = true;
                this.field1438 = 5;
                this.field1597 = true;
            }
            if (super.field31 >= 722 && super.field31 <= 756 && super.field32 >= 169 && super.field32 < 205 && this.field1600[6] != -1) {
                this.field1327 = true;
                this.field1438 = 6;
                this.field1597 = true;
            }
            if (super.field31 >= 540 && super.field31 <= 574 && super.field32 >= 466 && super.field32 < 502 && this.field1600[7] != -1) {
                this.field1327 = true;
                this.field1438 = 7;
                this.field1597 = true;
            }
            if (super.field31 >= 572 && super.field31 <= 602 && super.field32 >= 466 && super.field32 < 503 && this.field1600[8] != -1) {
                this.field1327 = true;
                this.field1438 = 8;
                this.field1597 = true;
            }
            if (super.field31 >= 599 && super.field31 <= 629 && super.field32 >= 466 && super.field32 < 503 && this.field1600[9] != -1) {
                this.field1327 = true;
                this.field1438 = 9;
                this.field1597 = true;
            }
            if (super.field31 >= 627 && super.field31 <= 671 && super.field32 >= 467 && super.field32 < 502 && this.field1600[10] != -1) {
                this.field1327 = true;
                this.field1438 = 10;
                this.field1597 = true;
            }
            if (super.field31 >= 669 && super.field31 <= 699 && super.field32 >= 466 && super.field32 < 503 && this.field1600[11] != -1) {
                this.field1327 = true;
                this.field1438 = 11;
                this.field1597 = true;
            }
            if (super.field31 >= 696 && super.field31 <= 726 && super.field32 >= 466 && super.field32 < 503 && this.field1600[12] != -1) {
                this.field1327 = true;
                this.field1438 = 12;
                this.field1597 = true;
            }
            if (super.field31 >= 724 && super.field31 <= 758 && super.field32 >= 466 && super.field32 < 502 && this.field1600[13] != -1) {
                this.field1327 = true;
                this.field1438 = 13;
                this.field1597 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Z")
    public final boolean method462(boolean arg0) {
        if (!arg0) {
            this.field1259.method219(224);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILnb;)V")
    private final void method463(int arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        while (arg0 >= 0) {
            this.field1467 = this.field1534.method229();
        }
        if (arg1.field730 == 0) {
            var3 = this.field1614.method76(arg1.field729, arg1.field731, arg1.field732);
        }
        if (arg1.field730 == 1) {
            var3 = this.field1614.method77(arg1.field729, arg1.field731, arg1.field732, (byte) -97);
        }
        if (arg1.field730 == 2) {
            var3 = this.field1614.method78(arg1.field729, arg1.field731, arg1.field732);
        }
        if (arg1.field730 == 3) {
            var3 = this.field1614.method79(arg1.field729, arg1.field731, arg1.field732);
        }
        if (var3 != 0) {
            int var7 = this.field1614.method80(arg1.field729, arg1.field731, arg1.field732, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field733 = var4;
        arg1.field735 = var5;
        arg1.field734 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method464(boolean arg0, int arg1) {
        if (arg0) {
            this.field1294 = null;
        }
        if (!field1550) {
            if (Pix3D.field653[17] >= arg1) {
                Pix8 var3 = Pix3D.field647[17];
                int var4 = var3.field679 * var3.field678 - 1;
                int var5 = this.field1348 * var3.field678 * 2;
                byte[] var6 = var3.field676;
                byte[] var7 = this.field1662;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field676 = var7;
                this.field1662 = var6;
                Pix3D.method171(this.field1495, 17);
            }
            if (Pix3D.field653[24] >= arg1) {
                Pix8 var9 = Pix3D.field647[24];
                int var10 = var9.field679 * var9.field678 - 1;
                int var11 = this.field1348 * var9.field678 * 2;
                byte[] var12 = var9.field676;
                byte[] var13 = this.field1662;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field676 = var13;
                this.field1662 = var12;
                Pix3D.method171(this.field1495, 24);
            }
            if (Pix3D.field653[34] >= arg1) {
                Pix8 var15 = Pix3D.field647[34];
                int var16 = var15.field679 * var15.field678 - 1;
                int var17 = this.field1348 * var15.field678 * 2;
                byte[] var18 = var15.field676;
                byte[] var19 = this.field1662;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field676 = var19;
                this.field1662 = var18;
                Pix3D.method171(this.field1495, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIBIILd;)V")
    public final void method465(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, Component arg8) {
        if (this.field1292) {
            this.field1487 = 32;
        } else {
            this.field1487 = 0;
        }
        this.field1292 = false;
        if (arg5 != -71) {
            this.field1633 = -284;
        }
        if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg7 && arg1 < arg7 + 16) {
            arg8.field91 -= this.field1601 * 4;
            if (arg2) {
                this.field1327 = true;
                return;
            }
        } else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg3 + arg7 - 16 && arg1 < arg3 + arg7) {
            arg8.field91 += this.field1601 * 4;
            if (arg2) {
                this.field1327 = true;
                return;
            }
        } else {
            if (arg0 < arg4 - this.field1487 || arg0 >= arg4 + 16 + this.field1487 || arg1 < arg7 + 16 || arg1 >= arg3 + arg7 - 16 || this.field1601 <= 0) {
                return;
            }
            int var10 = (arg3 - 32) * arg3 / arg6;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg7 - 16 - var10 / 2;
            int var12 = arg3 - 32 - var10;
            arg8.field91 = (arg6 - arg3) * var11 / var12;
            if (arg2) {
                this.field1327 = true;
            }
            this.field1292 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        if (!arg0) {
            if (field1550 && this.field1288 == 2 && World.field45 != this.field1546) {
                this.field1453.method258((byte) 4);
                this.field1381.method202("Loading - please wait.", this.field1307, 151, 0, 257);
                this.field1381.method202("Loading - please wait.", this.field1307, 150, 16777215, 256);
                this.field1453.method259(super.field16, 4, 4, (byte) 8);
                this.field1288 = 1;
                this.field1455 = System.currentTimeMillis();
            }
            if (this.field1288 == 1) {
                int var2 = this.method467((byte) 2);
                if (var2 != 0 && System.currentTimeMillis() - this.field1455 > 360000L) {
                    signlink.reporterror(this.field1654 + " glcfb " + this.field1583 + "," + var2 + "," + field1550 + "," + this.field1284[0] + "," + this.field1266.method280() + "," + this.field1546 + "," + this.field1324 + "," + this.field1325);
                    this.field1455 = System.currentTimeMillis();
                }
            }
            if (this.field1288 == 2 && this.field1546 != this.field1344) {
                this.field1344 = this.field1546;
                this.method514(this.field1546, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)I")
    public final int method467(byte arg0) {
        for (int var2 = 0; var2 < this.field1375.length; ++var2) {
            if (this.field1375[var2] == null && this.field1255[var2] != -1) {
                return -1;
            }
            if (this.field1431[var2] == null && this.field1256[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        for (int var6 = 0; var6 < this.field1375.length; ++var6) {
            byte[] var7 = this.field1431[var6];
            if (var7 != null) {
                int var8 = (this.field1254[var6] >> 8) * 64 - this.field1320;
                int var9 = (this.field1254[var6] & 255) * 64 - this.field1321;
                var3 &= World.method16(var8, false, var7, var9);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1228) {
            return -4;
        } else {
            this.field1288 = 2;
            World.field45 = this.field1546;
            this.method432((byte) 9);
            this.field1259.method218(this.field1236, 98);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method468(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1512; ++var4) {
                if (this.field1677[var4] == arg0) {
                    --this.field1512;
                    this.field1327 = true;
                    for (int var5 = var4; var5 < this.field1512; ++var5) {
                        this.field1677[var5] = this.field1677[var5 + 1];
                    }
                    this.field1259.method218(this.field1236, 180);
                    this.field1259.method225(arg0, this.field1641);
                    break;
                }
            }
            while (arg1 >= 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)Ljava/lang/String;")
    public final String method469(int arg0) {
        int var2 = 90 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field19 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method470(boolean arg0) {
        byte[] var2 = this.field1570.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1480.method258((byte) 4);
        var3.method184(field1463, 0, 0);
        this.field1481.method258((byte) 4);
        var3.method184(field1463, 0, -637);
        this.field1477.method258((byte) 4);
        var3.method184(field1463, 0, -128);
        this.field1478.method258((byte) 4);
        var3.method184(field1463, -371, -202);
        this.field1479.method258((byte) 4);
        var3.method184(field1463, -171, -202);
        this.field1482.method258((byte) 4);
        var3.method184(field1463, -265, 0);
        this.field1602 &= arg0;
        this.field1483.method258((byte) 4);
        var3.method184(field1463, -265, -562);
        this.field1484.method258((byte) 4);
        var3.method184(field1463, -171, -128);
        this.field1485.method258((byte) 4);
        var3.method184(field1463, -171, -562);
        int[] var4 = new int[var3.field663];
        for (int var5 = 0; var5 < var3.field664; ++var5) {
            for (int var10 = 0; var10 < var3.field663; ++var10) {
                var4[var10] = var3.field662[var3.field663 * var5 + (var3.field663 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field663; ++var11) {
                var3.field662[var3.field663 * var5 + var11] = var4[var11];
            }
        }
        this.field1480.method258((byte) 4);
        var3.method184(field1463, 0, 382);
        this.field1481.method258((byte) 4);
        var3.method184(field1463, 0, -255);
        this.field1477.method258((byte) 4);
        var3.method184(field1463, 0, 254);
        this.field1478.method258((byte) 4);
        var3.method184(field1463, -371, 180);
        this.field1479.method258((byte) 4);
        var3.method184(field1463, -171, 180);
        this.field1482.method258((byte) 4);
        var3.method184(field1463, -265, 382);
        this.field1483.method258((byte) 4);
        var3.method184(field1463, -265, -180);
        this.field1484.method258((byte) 4);
        var3.method184(field1463, -171, 254);
        this.field1485.method258((byte) 4);
        var3.method184(field1463, -171, -180);
        Pix32 var6 = new Pix32(this.field1570, "logo", 0);
        this.field1477.method258((byte) 4);
        var6.method186(true, 382 - var6.field663 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IZ)V")
    private final void method471(Packet arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field1624; ++var4) {
            int var5 = this.field1625[var4];
            PlayerEntity var6 = this.field1621[var5];
            int var7 = arg0.method229();
            if ((var7 & 128) == 128) {
                var7 += arg0.method229() << 8;
            }
            this.method556(var7, arg0, var6, var5, true);
        }
        if (!arg2) {
            this.field1259.method219(123);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method472(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1315.length; ++var4) {
            this.field1315[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1315[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1316[var16] = (this.field1315[var16 - 1] + this.field1315[var16 + 1] + this.field1315[var16 - 128] + this.field1315[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1315;
            this.field1315 = this.field1316;
            this.field1316 = var14;
        }
        while (arg0 >= 0) {
            this.method6();
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field679; ++var8) {
                for (int var9 = 0; var9 < arg1.field678; ++var9) {
                    if (arg1.field676[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field680;
                        int var11 = var8 + 16 + arg1.field681;
                        int var12 = (var11 << 7) + var10;
                        this.field1315[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method473(int arg0) {
        label88: while (true) {
            if (arg0 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label88;
                    }
                    ++var7;
                }
            }
            for (ProjectileEntity var2 = (ProjectileEntity) this.field1596.method248(); var2 != null; var2 = (ProjectileEntity) this.field1596.method250((byte) 8)) {
                if (this.field1546 == var2.field505 && field1275 <= var2.field511) {
                    if (field1275 >= var2.field510) {
                        if (var2.field514 > 0) {
                            NpcEntity var4 = this.field1674[var2.field514 - 1];
                            if (var4 != null && var4.field397 >= 0 && var4.field397 < 13312 && var4.field398 >= 0 && var4.field398 < 13312) {
                                var2.method120(var4.field398, field1275, this.method513(this.field1592, var2.field505, var4.field397, var4.field398) - var2.field509, (byte) 6, var4.field397);
                            }
                        }
                        if (var2.field514 < 0) {
                            int var5 = -var2.field514 - 1;
                            PlayerEntity var6;
                            if (this.field1680 == var5) {
                                var6 = field1374;
                            } else {
                                var6 = this.field1621[var5];
                            }
                            if (var6 != null && var6.field397 >= 0 && var6.field397 < 13312 && var6.field398 >= 0 && var6.field398 < 13312) {
                                var2.method120(var6.field398, field1275, this.method513(this.field1592, var2.field505, var6.field397, var6.field398) - var2.field509, (byte) 6, var6.field397);
                            }
                        }
                        var2.method121(this.field1348, false);
                        this.field1614.method61(60, (int) var2.field517, (int) var2.field516, (int) var2.field518, var2, var2.field524, false, this.field1546, false, -1);
                    }
                } else {
                    var2.method106();
                }
            }
            ++field1248;
            if (field1248 > 1174) {
                field1248 = 0;
                this.field1259.method218(this.field1236, 179);
                this.field1259.method219(0);
                int var3 = this.field1259.field711;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method220(11499);
                }
                this.field1259.method220(10548);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method219(139);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method219(94);
                }
                this.field1259.method220(51693);
                this.field1259.method219(16);
                this.field1259.method220(15036);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method219(65);
                }
                this.field1259.method219((int) (Math.random() * 256.0D));
                this.field1259.method220(22990);
                this.field1259.method228(-164, this.field1259.field711 - var3);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZB)V")
    public final void method474(boolean arg0, byte arg1) {
        if (field1374.field397 >> 7 == this.field1393 && field1374.field398 >> 7 == this.field1394) {
            this.field1393 = 0;
            ++field1617;
            if (field1617 > 122) {
                field1617 = 0;
                this.field1259.method218(this.field1236, 168);
                this.field1259.method219(62);
            }
        }
        int var3 = this.field1622;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1374;
                var6 = this.field1620 << 14;
            } else {
                var5 = this.field1621[this.field1623[var4]];
                var6 = this.field1623[var4] << 14;
            }
            if (var5 != null && var5.method113(false)) {
                var5.field480 = false;
                if ((field1550 && this.field1622 > 50 || this.field1622 > 200) && !arg0 && var5.field422 == var5.field402) {
                    var5.field480 = true;
                }
                int var7 = var5.field397 >> 7;
                int var8 = var5.field398 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field475 != null && field1275 >= var5.field470 && field1275 < var5.field471) {
                        var5.field480 = false;
                        var5.field469 = this.method513(this.field1592, this.field1546, var5.field397, var5.field398);
                        this.field1614.method62(var5.field478, var5.field469, var5.field476, var5.field477, var5.field479, 60, var6, var5.field398, var5, this.field1546, 4882, var5.field397, var5.field399);
                    } else {
                        if ((var5.field397 & 127) == 64 && (var5.field398 & 127) == 64) {
                            if (this.field1616[var7][var8] == this.field1446) {
                                continue;
                            }
                            this.field1616[var7][var8] = this.field1446;
                        }
                        var5.field469 = this.method513(this.field1592, this.field1546, var5.field397, var5.field398);
                        this.field1614.method61(60, var5.field398, var5.field397, var5.field469, var5, var5.field399, var5.field400, this.field1546, false, var6);
                    }
                }
            }
        }
        if (arg1 != 58) {
            this.field1294 = null;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        this.field1328 = 0;
        int var2 = (field1374.field397 >> 7) + this.field1320;
        int var3 = (field1374.field398 >> 7) + this.field1321;
        if (arg0) {
            field1268 = !field1268;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1328 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1328 = 1;
        }
        if (this.field1328 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1328 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)V")
    public final void method476(boolean arg0, int arg1, byte[] arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        this.field1466 += arg1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILlb;)V")
    private final void method477(int arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field712 + 21 < arg1 * 8) {
                int var4 = arg2.method240(this.field1310, 14);
                if (var4 != 16383) {
                    if (this.field1674[var4] == null) {
                        this.field1674[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1674[var4];
                    this.field1676[this.field1675++] = var4;
                    var5.field442 = field1275;
                    var5.field455 = NpcType.method341(arg2.method240(this.field1310, 12));
                    var5.field401 = var5.field455.field1009;
                    var5.field445 = var5.field455.field1031;
                    var5.field404 = var5.field455.field1013;
                    var5.field405 = var5.field455.field1014;
                    var5.field406 = var5.field455.field1015;
                    var5.field407 = var5.field455.field1016;
                    var5.field402 = var5.field455.field1012;
                    int var6 = arg2.method240(this.field1310, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method240(this.field1310, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method240(this.field1310, 1);
                    var5.method110(3, field1374.field448[0] + var7, var8 == 1, field1374.field447[0] + var6);
                    int var9 = arg2.method240(this.field1310, 1);
                    if (var9 == 1) {
                        this.field1625[this.field1624++] = var4;
                    }
                    continue;
                }
            }
            arg2.method241(this.field1554);
            if (arg0 <= 0) {
                this.field1467 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public static final void method478(byte arg0) {
        World3D.field285 = true;
        Pix3D.field634 = true;
        field1550 = true;
        if (arg0 == 0) {
            boolean var1 = false;
            World.field44 = true;
            LocType.field945 = true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method479(int arg0) {
        for (int var2 = 0; var2 < this.field1675; ++var2) {
            int var4 = this.field1676[var2];
            NpcEntity var5 = this.field1674[var4];
            if (var5 != null) {
                this.method480(var5.field455.field1009, var5, (byte) 6);
            }
        }
        int var3 = 74 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;B)V")
    public final void method480(int arg0, PathingEntity arg1, byte arg2) {
        if (arg1.field397 < 128 || arg1.field398 < 128 || arg1.field397 >= 13184 || arg1.field398 >= 13184) {
            arg1.field425 = -1;
            arg1.field430 = -1;
            arg1.field439 = 0;
            arg1.field440 = 0;
            arg1.field397 = arg1.field447[0] * 128 + arg1.field401 * 64;
            arg1.field398 = arg1.field448[0] * 128 + arg1.field401 * 64;
            arg1.method112(0);
        }
        if (field1374 == arg1 && (arg1.field397 < 1536 || arg1.field398 < 1536 || arg1.field397 >= 11776 || arg1.field398 >= 11776)) {
            arg1.field425 = -1;
            arg1.field430 = -1;
            arg1.field439 = 0;
            arg1.field440 = 0;
            arg1.field397 = arg1.field447[0] * 128 + arg1.field401 * 64;
            arg1.field398 = arg1.field448[0] * 128 + arg1.field401 * 64;
            arg1.method112(0);
        }
        if (arg1.field439 > field1275) {
            this.method481(0, arg1);
        } else if (arg1.field440 >= field1275) {
            this.method482(4131, arg1);
        } else {
            this.method483(arg1, false);
        }
        this.method484(arg1, -318);
        this.method485(arg1, 508);
        if (arg2 == 6) {
            boolean var4 = false;
        } else {
            field1360 = 80;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method481(int arg0, PathingEntity arg1) {
        this.field1466 += arg0;
        int var3 = arg1.field439 - field1275;
        int var4 = arg1.field435 * 128 + arg1.field401 * 64;
        int var5 = arg1.field437 * 128 + arg1.field401 * 64;
        arg1.field397 += (var4 - arg1.field397) / var3;
        arg1.field398 += (var5 - arg1.field398) / var3;
        arg1.field450 = 0;
        if (arg1.field441 == 0) {
            arg1.field444 = 1024;
        }
        if (arg1.field441 == 1) {
            arg1.field444 = 1536;
        }
        if (arg1.field441 == 2) {
            arg1.field444 = 0;
        }
        if (arg1.field441 == 3) {
            arg1.field444 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;)V")
    public final void method482(int arg0, PathingEntity arg1) {
        if (field1275 == arg1.field440 || arg1.field425 == -1 || arg1.field428 != 0 || arg1.field427 + 1 > SeqType.field1135[arg1.field425].method382(arg1.field426, 0)) {
            int var3 = arg1.field440 - arg1.field439;
            int var4 = field1275 - arg1.field439;
            int var5 = arg1.field435 * 128 + arg1.field401 * 64;
            int var6 = arg1.field437 * 128 + arg1.field401 * 64;
            int var7 = arg1.field436 * 128 + arg1.field401 * 64;
            int var8 = arg1.field438 * 128 + arg1.field401 * 64;
            arg1.field397 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field398 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field450 = 0;
        if (this.field1665 == arg0) {
            if (arg1.field441 == 0) {
                arg1.field444 = 1024;
            }
            if (arg1.field441 == 1) {
                arg1.field444 = 1536;
            }
            if (arg1.field441 == 2) {
                arg1.field444 = 0;
            }
            if (arg1.field441 == 3) {
                arg1.field444 = 512;
            }
            arg1.field399 = arg1.field444;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method483(PathingEntity arg0, boolean arg1) {
        arg0.field422 = arg0.field402;
        if (arg1) {
            this.field1259.method219(157);
        }
        if (arg0.field446 == 0) {
            arg0.field450 = 0;
        } else {
            if (arg0.field425 != -1 && arg0.field428 == 0) {
                SeqType var3 = SeqType.field1135[arg0.field425];
                if (arg0.field451 > 0 && var3.field1147 == 0) {
                    ++arg0.field450;
                    return;
                }
                if (arg0.field451 <= 0 && var3.field1148 == 0) {
                    ++arg0.field450;
                    return;
                }
            }
            int var4 = arg0.field397;
            int var5 = arg0.field398;
            int var6 = arg0.field447[arg0.field446 - 1] * 128 + arg0.field401 * 64;
            int var7 = arg0.field448[arg0.field446 - 1] * 128 + arg0.field401 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field444 = 1280;
                    } else if (var5 > var7) {
                        arg0.field444 = 1792;
                    } else {
                        arg0.field444 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field444 = 768;
                    } else if (var5 > var7) {
                        arg0.field444 = 256;
                    } else {
                        arg0.field444 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field444 = 1024;
                } else {
                    arg0.field444 = 0;
                }
                int var8 = arg0.field444 - arg0.field399 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field405;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field404;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field407;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field406;
                }
                if (var9 == -1) {
                    var9 = arg0.field404;
                }
                arg0.field422 = var9;
                int var10 = 4;
                if (arg0.field444 != arg0.field399 && arg0.field419 == -1 && arg0.field445 != 0) {
                    var10 = 2;
                }
                if (arg0.field446 > 2) {
                    var10 = 6;
                }
                if (arg0.field446 > 3) {
                    var10 = 8;
                }
                if (arg0.field450 > 0 && arg0.field446 > 1) {
                    var10 = 8;
                    --arg0.field450;
                }
                if (arg0.field449[arg0.field446 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field422 == arg0.field404 && arg0.field408 != -1) {
                    arg0.field422 = arg0.field408;
                }
                if (var4 < var6) {
                    arg0.field397 += var10;
                    if (arg0.field397 > var6) {
                        arg0.field397 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field397 -= var10;
                    if (arg0.field397 < var6) {
                        arg0.field397 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field398 += var10;
                    if (arg0.field398 > var7) {
                        arg0.field398 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field398 -= var10;
                    if (arg0.field398 < var7) {
                        arg0.field398 = var7;
                    }
                }
                if (arg0.field397 == var6 && arg0.field398 == var7) {
                    --arg0.field446;
                    if (arg0.field451 > 0) {
                        --arg0.field451;
                        return;
                    }
                }
            } else {
                arg0.field397 = var6;
                arg0.field398 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method484(PathingEntity arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1236 = this.field1416.method295();
        }
        if (arg0.field445 != 0) {
            if (arg0.field419 != -1 && arg0.field419 < 32768) {
                NpcEntity var3 = this.field1674[arg0.field419];
                if (var3 != null) {
                    int var4 = arg0.field397 - var3.field397;
                    int var5 = arg0.field398 - var3.field398;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field444 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field419 >= 32768) {
                int var6 = arg0.field419 - 32768;
                if (this.field1680 == var6) {
                    var6 = this.field1620;
                }
                PlayerEntity var7 = this.field1621[var6];
                if (var7 != null) {
                    int var8 = arg0.field397 - var7.field397;
                    int var9 = arg0.field398 - var7.field398;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field444 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field420 != 0 || arg0.field421 != 0) && (arg0.field446 == 0 || arg0.field450 > 0)) {
                int var10 = arg0.field397 - (arg0.field420 - this.field1320 - this.field1320) * 64;
                int var11 = arg0.field398 - (arg0.field421 - this.field1321 - this.field1321) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field444 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field420 = 0;
                arg0.field421 = 0;
            }
            int var12 = arg0.field444 - arg0.field399 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field445 && var12 <= 2048 - arg0.field445) {
                    if (var12 > 1024) {
                        arg0.field399 -= arg0.field445;
                    } else {
                        arg0.field399 += arg0.field445;
                    }
                } else {
                    arg0.field399 = arg0.field444;
                }
                arg0.field399 &= 2047;
                if (arg0.field422 == arg0.field402 && arg0.field444 != arg0.field399) {
                    if (arg0.field403 != -1) {
                        arg0.field422 = arg0.field403;
                        return;
                    }
                    arg0.field422 = arg0.field404;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method485(PathingEntity arg0, int arg1) {
        int var3 = 32 / arg1;
        arg0.field400 = false;
        if (arg0.field422 != -1) {
            SeqType var4 = SeqType.field1135[arg0.field422];
            ++arg0.field424;
            if (arg0.field423 < var4.field1136 && arg0.field424 > var4.method382(arg0.field423, 0)) {
                arg0.field424 = 0;
                ++arg0.field423;
            }
            if (arg0.field423 >= var4.field1136) {
                arg0.field424 = 0;
                arg0.field423 = 0;
            }
        }
        if (arg0.field430 != -1 && field1275 >= arg0.field433) {
            if (arg0.field431 < 0) {
                arg0.field431 = 0;
            }
            SeqType var5 = SpotAnimType.field1157[arg0.field430].field1161;
            ++arg0.field432;
            while (arg0.field431 < var5.field1136 && arg0.field432 > var5.method382(arg0.field431, 0)) {
                arg0.field432 -= var5.method382(arg0.field431, 0);
                ++arg0.field431;
            }
            if (arg0.field431 >= var5.field1136 && (arg0.field431 < 0 || arg0.field431 >= var5.field1136)) {
                arg0.field430 = -1;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 <= 1) {
            SeqType var6 = SeqType.field1135[arg0.field425];
            if (var6.field1147 == 1 && arg0.field451 > 0 && arg0.field439 <= field1275 && arg0.field440 < field1275) {
                arg0.field428 = 1;
                return;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 == 0) {
            SeqType var7 = SeqType.field1135[arg0.field425];
            ++arg0.field427;
            while (arg0.field426 < var7.field1136 && arg0.field427 > var7.method382(arg0.field426, 0)) {
                arg0.field427 -= var7.method382(arg0.field426, 0);
                ++arg0.field426;
            }
            if (arg0.field426 >= var7.field1136) {
                arg0.field426 -= var7.field1140;
                ++arg0.field429;
                if (arg0.field429 >= var7.field1146) {
                    arg0.field425 = -1;
                }
                if (arg0.field426 < 0 || arg0.field426 >= var7.field1136) {
                    arg0.field425 = -1;
                }
            }
            arg0.field400 = var7.field1142;
        }
        if (arg0.field428 > 0) {
            --arg0.field428;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method486(byte arg0) {
        if (this.field1364) {
            this.field1364 = false;
            this.field1216.method259(super.field16, 4, 0, (byte) 8);
            this.field1217.method259(super.field16, 357, 0, (byte) 8);
            this.field1218.method259(super.field16, 4, 722, (byte) 8);
            this.field1219.method259(super.field16, 205, 743, (byte) 8);
            this.field1220.method259(super.field16, 0, 0, (byte) 8);
            this.field1221.method259(super.field16, 4, 516, (byte) 8);
            this.field1222.method259(super.field16, 205, 516, (byte) 8);
            this.field1223.method259(super.field16, 357, 496, (byte) 8);
            this.field1224.method259(super.field16, 338, 0, (byte) 8);
            this.field1327 = true;
            this.field1574 = true;
            this.field1597 = true;
            this.field1639 = true;
            if (this.field1288 != 2) {
                this.field1453.method259(super.field16, 4, 4, (byte) 8);
                this.field1452.method259(super.field16, 4, 550, (byte) 8);
            }
        }
        if (this.field1288 == 2) {
            this.method444(this.field1627);
        }
        if (this.field1584 && this.field1433 == 1) {
            this.field1327 = true;
        }
        if (this.field1214 != -1) {
            boolean var2 = this.method517(0, this.field1348, this.field1214);
            if (var2) {
                this.field1327 = true;
            }
        }
        if (this.field1632 == 2) {
            this.field1327 = true;
        }
        if (this.field1422 == 2) {
            this.field1327 = true;
        }
        if (this.field1327) {
            this.method489(-14114);
            this.field1327 = false;
        }
        if (this.field1345 == -1) {
            this.field1341.field91 = this.field1246 - this.field1532 - 77;
            if (super.field24 > 448 && super.field24 < 560 && super.field25 > 332) {
                this.method465(super.field24 - 17, super.field25 - 357, false, 77, 463, (byte) -71, this.field1246, 0, this.field1341);
            }
            int var3 = this.field1246 - 77 - this.field1341.field91;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1246 - 77) {
                var3 = this.field1246 - 77;
            }
            if (this.field1532 != var3) {
                this.field1532 = var3;
                this.field1574 = true;
            }
        }
        if (this.field1345 != -1) {
            boolean var4 = this.method517(0, this.field1348, this.field1345);
            if (var4) {
                this.field1574 = true;
            }
        }
        if (this.field1632 == 3) {
            this.field1574 = true;
        }
        if (this.field1422 == 3) {
            this.field1574 = true;
        }
        if (this.field1337 != null) {
            this.field1574 = true;
        }
        if (this.field1584 && this.field1433 == 2) {
            this.field1574 = true;
        }
        if (this.field1574) {
            this.method557(8);
            this.field1574 = false;
        }
        if (this.field1288 == 2) {
            this.method501((byte) 39);
            this.field1452.method259(super.field16, 4, 550, (byte) 8);
        }
        if (this.field1439 != -1) {
            this.field1597 = true;
        }
        if (this.field1597) {
            if (this.field1439 != -1 && this.field1439 == this.field1438) {
                this.field1439 = -1;
                this.field1259.method218(this.field1236, 83);
                this.field1259.method219(this.field1438);
            }
            this.field1597 = false;
            this.field1539.method258((byte) 4);
            this.field1587.method199(true, 0, 0);
            if (this.field1214 == -1) {
                if (this.field1600[this.field1438] != -1) {
                    if (this.field1438 == 0) {
                        this.field1302.method199(true, 22, 10);
                    }
                    if (this.field1438 == 1) {
                        this.field1303.method199(true, 54, 8);
                    }
                    if (this.field1438 == 2) {
                        this.field1303.method199(true, 82, 8);
                    }
                    if (this.field1438 == 3) {
                        this.field1304.method199(true, 110, 8);
                    }
                    if (this.field1438 == 4) {
                        this.field1306.method199(true, 153, 8);
                    }
                    if (this.field1438 == 5) {
                        this.field1306.method199(true, 181, 8);
                    }
                    if (this.field1438 == 6) {
                        this.field1305.method199(true, 209, 9);
                    }
                }
                if (this.field1600[0] != -1 && (this.field1439 != 0 || field1275 % 20 < 10)) {
                    this.field1607[0].method199(true, 29, 13);
                }
                if (this.field1600[1] != -1 && (this.field1439 != 1 || field1275 % 20 < 10)) {
                    this.field1607[1].method199(true, 53, 11);
                }
                if (this.field1600[2] != -1 && (this.field1439 != 2 || field1275 % 20 < 10)) {
                    this.field1607[2].method199(true, 82, 11);
                }
                if (this.field1600[3] != -1 && (this.field1439 != 3 || field1275 % 20 < 10)) {
                    this.field1607[3].method199(true, 115, 12);
                }
                if (this.field1600[4] != -1 && (this.field1439 != 4 || field1275 % 20 < 10)) {
                    this.field1607[4].method199(true, 153, 13);
                }
                if (this.field1600[5] != -1 && (this.field1439 != 5 || field1275 % 20 < 10)) {
                    this.field1607[5].method199(true, 180, 11);
                }
                if (this.field1600[6] != -1 && (this.field1439 != 6 || field1275 % 20 < 10)) {
                    this.field1607[6].method199(true, 208, 13);
                }
            }
            this.field1539.method259(super.field16, 160, 516, (byte) 8);
            this.field1538.method258((byte) 4);
            this.field1586.method199(true, 0, 0);
            if (this.field1214 == -1) {
                if (this.field1600[this.field1438] != -1) {
                    if (this.field1438 == 7) {
                        this.field1238.method199(true, 42, 0);
                    }
                    if (this.field1438 == 8) {
                        this.field1239.method199(true, 74, 0);
                    }
                    if (this.field1438 == 9) {
                        this.field1239.method199(true, 102, 0);
                    }
                    if (this.field1438 == 10) {
                        this.field1240.method199(true, 130, 1);
                    }
                    if (this.field1438 == 11) {
                        this.field1242.method199(true, 173, 0);
                    }
                    if (this.field1438 == 12) {
                        this.field1242.method199(true, 201, 0);
                    }
                    if (this.field1438 == 13) {
                        this.field1241.method199(true, 229, 0);
                    }
                }
                if (this.field1600[8] != -1 && (this.field1439 != 8 || field1275 % 20 < 10)) {
                    this.field1607[7].method199(true, 74, 2);
                }
                if (this.field1600[9] != -1 && (this.field1439 != 9 || field1275 % 20 < 10)) {
                    this.field1607[8].method199(true, 102, 3);
                }
                if (this.field1600[10] != -1 && (this.field1439 != 10 || field1275 % 20 < 10)) {
                    this.field1607[9].method199(true, 137, 4);
                }
                if (this.field1600[11] != -1 && (this.field1439 != 11 || field1275 % 20 < 10)) {
                    this.field1607[10].method199(true, 174, 2);
                }
                if (this.field1600[12] != -1 && (this.field1439 != 12 || field1275 % 20 < 10)) {
                    this.field1607[11].method199(true, 201, 2);
                }
                if (this.field1600[13] != -1 && (this.field1439 != 13 || field1275 % 20 < 10)) {
                    this.field1607[12].method199(true, 226, 2);
                }
            }
            this.field1538.method259(super.field16, 466, 496, (byte) 8);
            this.field1453.method258((byte) 4);
        }
        if (this.field1639) {
            this.field1639 = false;
            this.field1537.method258((byte) 4);
            this.field1585.method199(true, 0, 0);
            this.field1381.method203(55, 16777215, "Public chat", (byte) 114, 28, true);
            if (this.field1598 == 0) {
                this.field1381.method203(55, 65280, "On", (byte) 114, 41, true);
            }
            if (this.field1598 == 1) {
                this.field1381.method203(55, 16776960, "Friends", (byte) 114, 41, true);
            }
            if (this.field1598 == 2) {
                this.field1381.method203(55, 16711680, "Off", (byte) 114, 41, true);
            }
            if (this.field1598 == 3) {
                this.field1381.method203(55, 65535, "Hide", (byte) 114, 41, true);
            }
            this.field1381.method203(184, 16777215, "Private chat", (byte) 114, 28, true);
            if (this.field1414 == 0) {
                this.field1381.method203(184, 65280, "On", (byte) 114, 41, true);
            }
            if (this.field1414 == 1) {
                this.field1381.method203(184, 16776960, "Friends", (byte) 114, 41, true);
            }
            if (this.field1414 == 2) {
                this.field1381.method203(184, 16711680, "Off", (byte) 114, 41, true);
            }
            this.field1381.method203(324, 16777215, "Trade/compete", (byte) 114, 28, true);
            if (this.field1528 == 0) {
                this.field1381.method203(324, 65280, "On", (byte) 114, 41, true);
            }
            if (this.field1528 == 1) {
                this.field1381.method203(324, 16776960, "Friends", (byte) 114, 41, true);
            }
            if (this.field1528 == 2) {
                this.field1381.method203(324, 16711680, "Off", (byte) 114, 41, true);
            }
            this.field1381.method203(458, 16777215, "Report abuse", (byte) 114, 33, true);
            this.field1537.method259(super.field16, 453, 0, (byte) 8);
            this.field1453.method258((byte) 4);
        }
        this.field1348 = 0;
        if (arg0 != 1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;II)V")
    public final void method487(int arg0, int arg1, Component arg2, int arg3, int arg4) {
        if (arg4 >= this.field1493 && arg4 <= this.field1493) {
            if (arg2.field78 == 0 && arg2.field93 != null) {
                if (!arg2.field92 || this.field1527 == arg2.field76 || this.field1290 == arg2.field76 || this.field1486 == arg2.field76) {
                    int var6 = Pix2D.field624;
                    int var7 = Pix2D.field622;
                    int var8 = Pix2D.field625;
                    int var9 = Pix2D.field623;
                    Pix2D.method154(false, arg0, arg1, arg2.field82 + arg0, arg2.field81 + arg1);
                    int var10 = arg2.field93.length;
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg2.field94[var11] + arg1;
                        int var13 = arg2.field95[var11] + arg0 - arg3;
                        Component var14 = Component.field71[arg2.field93[var11]];
                        int var15 = var14.field84 + var12;
                        int var16 = var14.field85 + var13;
                        if (var14.field80 > 0) {
                            this.method515((byte) 6, var14);
                        }
                        if (var14.field78 == 0) {
                            if (var14.field91 > var14.field90 - var14.field82) {
                                var14.field91 = var14.field90 - var14.field82;
                            }
                            if (var14.field91 < 0) {
                                var14.field91 = 0;
                            }
                            this.method487(var16, var15, var14, var14.field91, this.field1493);
                            if (var14.field90 > var14.field82) {
                                this.method528((byte) 2, var16, var14.field90, var14.field91, var14.field81 + var15, var14.field82);
                            }
                        } else if (var14.field78 != 1) {
                            if (var14.field78 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var14.field82; ++var18) {
                                    for (int var19 = 0; var19 < var14.field81; ++var19) {
                                        int var20 = (var14.field102 + 32) * var19 + var15;
                                        int var21 = (var14.field103 + 32) * var18 + var16;
                                        if (var17 < 20) {
                                            var20 += var14.field105[var17];
                                            var21 += var14.field106[var17];
                                        }
                                        if (var14.field72[var17] <= 0) {
                                            if (var14.field104 != null && var17 < 20) {
                                                Pix32 var30 = var14.field104[var17];
                                                if (var30 != null) {
                                                    var30.method186(true, var20, var21);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field72[var17] - 1;
                                            if (var20 > Pix2D.field624 - 32 && var20 < Pix2D.field625 && var21 > Pix2D.field622 - 32 && var21 < Pix2D.field623 || this.field1422 != 0 && this.field1421 == var17) {
                                                int var25 = 0;
                                                if (this.field1425 == 1 && this.field1426 == var17 && this.field1427 == var14.field76) {
                                                    var25 = 16777215;
                                                }
                                                Pix32 var26 = ObjType.method354(var24, var14.field73[var17], var25, true);
                                                if (var26 != null) {
                                                    if (this.field1422 != 0 && this.field1421 == var17 && this.field1420 == var14.field76) {
                                                        var22 = super.field24 - this.field1423;
                                                        var23 = super.field25 - this.field1424;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field1524 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method188(128, var20 + var22, var21 + var23, true);
                                                        if (var21 + var23 < Pix2D.field622 && arg2.field91 > 0) {
                                                            int var27 = (Pix2D.field622 - var21 - var23) * this.field1348 / 3;
                                                            if (var27 > this.field1348 * 10) {
                                                                var27 = this.field1348 * 10;
                                                            }
                                                            if (var27 > arg2.field91) {
                                                                var27 = arg2.field91;
                                                            }
                                                            arg2.field91 -= var27;
                                                            this.field1424 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > Pix2D.field623 && arg2.field91 < arg2.field90 - arg2.field82) {
                                                            int var28 = (var21 + var23 + 32 - Pix2D.field623) * this.field1348 / 3;
                                                            if (var28 > this.field1348 * 10) {
                                                                var28 = this.field1348 * 10;
                                                            }
                                                            if (var28 > arg2.field90 - arg2.field82 - arg2.field91) {
                                                                var28 = arg2.field90 - arg2.field82 - arg2.field91;
                                                            }
                                                            arg2.field91 += var28;
                                                            this.field1424 -= var28;
                                                        }
                                                    } else if (this.field1632 != 0 && this.field1631 == var17 && this.field1630 == var14.field76) {
                                                        var26.method188(128, var20, var21, true);
                                                    } else {
                                                        var26.method186(true, var20, var21);
                                                    }
                                                    if (var26.field667 == 33 || var14.field73[var17] != 1) {
                                                        int var29 = var14.field73[var17];
                                                        this.field1380.method206(method549(var29, 2), 1, 0, var21 + 10 + var23, var20 + 1 + var22);
                                                        this.field1380.method206(method549(var29, 2), 1, 16776960, var21 + 9 + var23, var20 + var22);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field78 == 3) {
                                boolean var31 = false;
                                if (this.field1486 == var14.field76 || this.field1290 == var14.field76 || this.field1527 == var14.field76) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method495((byte) 67, var14)) {
                                    var32 = var14.field115;
                                    if (var31 && var14.field117 != 0) {
                                        var32 = var14.field117;
                                    }
                                } else {
                                    var32 = var14.field114;
                                    if (var31 && var14.field116 != 0) {
                                        var32 = var14.field116;
                                    }
                                }
                                if (var14.field83 == 0) {
                                    if (var14.field108) {
                                        Pix2D.method157(var15, var14.field81, var32, false, var16, var14.field82);
                                    } else {
                                        Pix2D.method158(var14.field81, var16, var15, var14.field82, var32, -585);
                                    }
                                } else if (var14.field108) {
                                    Pix2D.method156(var16, var15, 256 - (var14.field83 & 255), 0, var32, var14.field81, var14.field82);
                                } else {
                                    Pix2D.method159((byte) 34, var32, var14.field81, var14.field82, var16, var15, 256 - (var14.field83 & 255));
                                }
                            } else if (var14.field78 == 4) {
                                PixFont var33 = var14.field111;
                                String var34 = var14.field112;
                                boolean var35 = false;
                                if (this.field1486 == var14.field76 || this.field1290 == var14.field76 || this.field1527 == var14.field76) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method495((byte) 67, var14)) {
                                    var36 = var14.field115;
                                    if (var35 && var14.field117 != 0) {
                                        var36 = var14.field117;
                                    }
                                    if (var14.field113.length() > 0) {
                                        var34 = var14.field113;
                                    }
                                } else {
                                    var36 = var14.field114;
                                    if (var35 && var14.field116 != 0) {
                                        var36 = var14.field116;
                                    }
                                }
                                if (var14.field79 == 6 && this.field1672) {
                                    var34 = "Please wait...";
                                    var36 = var14.field114;
                                }
                                if (Pix2D.field620 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field698 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method523(false, this.method535(var14, 4, 0)) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method523(false, this.method535(var14, 3, 0)) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method523(false, this.method535(var14, 2, 0)) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method523(false, this.method535(var14, 1, 0)) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method523(false, this.method535(var14, 0, 0)) + var34.substring(var38 + 2);
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
                                    if (var14.field109) {
                                        var33.method203(var14.field81 / 2 + var15, var36, var44, (byte) 114, var37, var14.field110);
                                    } else {
                                        var33.method210(var15, var36, var44, var14.field110, (byte) -108, var37);
                                    }
                                    var37 += var33.field698;
                                }
                            } else if (var14.field78 == 5) {
                                Pix32 var45;
                                if (this.method495((byte) 67, var14)) {
                                    var45 = var14.field119;
                                } else {
                                    var45 = var14.field118;
                                }
                                if (var45 != null) {
                                    var45.method186(true, var15, var16);
                                }
                            } else if (var14.field78 == 6) {
                                int var46 = Pix3D.field639;
                                int var47 = Pix3D.field640;
                                Pix3D.field639 = var14.field81 / 2 + var15;
                                Pix3D.field640 = var14.field82 / 2 + var16;
                                int var48 = Pix3D.field643[var14.field127] * var14.field126 >> 16;
                                int var49 = Pix3D.field644[var14.field127] * var14.field126 >> 16;
                                boolean var50 = this.method495((byte) 67, var14);
                                int var51;
                                if (var50) {
                                    var51 = var14.field125;
                                } else {
                                    var51 = var14.field124;
                                }
                                Model var52;
                                if (var51 == -1) {
                                    var52 = var14.method34(-1, var50, true, -1);
                                } else {
                                    SeqType var53 = SeqType.field1135[var51];
                                    var52 = var14.method34(var53.field1137[var14.field74], var50, true, var53.field1138[var14.field74]);
                                }
                                if (var52 != null) {
                                    var52.method146(0, var14.field128, 0, var14.field127, 0, var48, var49);
                                }
                                Pix3D.field639 = var46;
                                Pix3D.field640 = var47;
                            } else if (var14.field78 == 7) {
                                PixFont var54 = var14.field111;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field82; ++var56) {
                                    for (int var57 = 0; var57 < var14.field81; ++var57) {
                                        if (var14.field72[var55] > 0) {
                                            ObjType var58 = ObjType.method348(var14.field72[var55] - 1);
                                            String var59 = var58.field1047;
                                            if (var58.field1058 || var14.field73[var55] != 1) {
                                                var59 = var59 + " x" + method460(var14.field73[var55], 0);
                                            }
                                            int var60 = (var14.field102 + 115) * var57 + var15;
                                            int var61 = (var14.field103 + 12) * var56 + var16;
                                            if (var14.field109) {
                                                var54.method203(var14.field81 / 2 + var60, var14.field114, var59, (byte) 114, var61, var14.field110);
                                            } else {
                                                var54.method210(var60, var14.field114, var59, var14.field110, (byte) -108, var61);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                        }
                    }
                    Pix2D.method154(false, var7, var6, var9, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method488(Packet arg0, int arg1, int arg2) {
        if (arg2 == -33436) {
            arg0.method239(false);
            int var4 = arg0.method240(this.field1310, 1);
            if (var4 != 0) {
                int var5 = arg0.method240(this.field1310, 2);
                if (var5 == 0) {
                    this.field1625[this.field1624++] = this.field1620;
                } else if (var5 == 1) {
                    int var6 = arg0.method240(this.field1310, 3);
                    field1374.method111(692, var6, false);
                    int var7 = arg0.method240(this.field1310, 1);
                    if (var7 == 1) {
                        this.field1625[this.field1624++] = this.field1620;
                    }
                } else if (var5 == 2) {
                    int var8 = arg0.method240(this.field1310, 3);
                    field1374.method111(692, var8, true);
                    int var9 = arg0.method240(this.field1310, 3);
                    field1374.method111(692, var9, true);
                    int var10 = arg0.method240(this.field1310, 1);
                    if (var10 == 1) {
                        this.field1625[this.field1624++] = this.field1620;
                    }
                } else if (var5 == 3) {
                    this.field1546 = arg0.method240(this.field1310, 2);
                    int var11 = arg0.method240(this.field1310, 7);
                    int var12 = arg0.method240(this.field1310, 7);
                    int var13 = arg0.method240(this.field1310, 1);
                    field1374.method110(3, var12, var13 == 1, var11);
                    int var14 = arg0.method240(this.field1310, 1);
                    if (var14 == 1) {
                        this.field1625[this.field1624++] = this.field1620;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method489(int arg0) {
        if (this.field1573 != arg0) {
            this.field1467 = this.field1534.method229();
        }
        this.field1451.method258((byte) 4);
        Pix3D.field645 = this.field1318;
        this.field1515.method199(true, 0, 0);
        if (this.field1214 != -1) {
            this.method487(0, 0, Component.field71[this.field1214], 0, this.field1493);
        } else if (this.field1600[this.field1438] != -1) {
            this.method487(0, 0, Component.field71[this.field1600[this.field1438]], 0, this.field1493);
        }
        if (this.field1584 && this.field1433 == 1) {
            this.method512((byte) 110);
        }
        this.field1451.method259(super.field16, 205, 553, (byte) 8);
        this.field1453.method258((byte) 4);
        Pix3D.field645 = this.field1319;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method490(int arg0) {
        int var2 = this.field1382.method204((byte) 5, "Choose Option");
        for (int var3 = 0; var3 < this.field1390; ++var3) {
            int var11 = this.field1382.method204((byte) 5, this.field1511[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 < 5 || arg0 > 5) {
            this.field1467 = this.field1534.method229();
        }
        var2 += 8;
        int var4 = this.field1390 * 15 + 21;
        if (super.field31 > 4 && super.field32 > 4 && super.field31 < 516 && super.field32 < 338) {
            int var5 = super.field31 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field32 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1584 = true;
            this.field1433 = 0;
            this.field1434 = var5;
            this.field1435 = var6;
            this.field1436 = var2;
            this.field1437 = this.field1390 * 15 + 22;
        }
        if (super.field31 > 553 && super.field32 > 205 && super.field31 < 743 && super.field32 < 466) {
            int var7 = super.field31 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field32 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1584 = true;
            this.field1433 = 1;
            this.field1434 = var7;
            this.field1435 = var8;
            this.field1436 = var2;
            this.field1437 = this.field1390 * 15 + 22;
        }
        if (super.field31 > 17 && super.field32 > 357 && super.field31 < 496 && super.field32 < 453) {
            int var9 = super.field31 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field32 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1584 = true;
            this.field1433 = 2;
            this.field1434 = var9;
            this.field1435 = var10;
            this.field1436 = var2;
            this.field1437 = this.field1390 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLy;I)V")
    public final void method491(boolean arg0, PathingEntity arg1, int arg2) {
        if (!arg0) {
            this.field1467 = this.field1534.method229();
        }
        this.method492(arg1.field398, arg1.field397, 265, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method513(this.field1592, this.field1546, arg1, arg0) - arg3;
            int var6 = arg1 - this.field1331;
            int var7 = var5 - this.field1332;
            int var8 = 42 / arg2;
            int var9 = arg0 - this.field1333;
            int var10 = Model.field604[this.field1334];
            int var11 = Model.field605[this.field1334];
            int var12 = Model.field604[this.field1335];
            int var13 = Model.field605[this.field1335];
            int var14 = var6 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var11 - var10 * var15 >> 16;
            int var18 = var7 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field1605 = (var14 << 9) / var18 + Pix3D.field639;
                this.field1606 = (var17 << 9) / var18 + Pix3D.field640;
            } else {
                this.field1605 = -1;
                this.field1606 = -1;
            }
        } else {
            this.field1605 = -1;
            this.field1606 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method493(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field1373[var6] != null) {
                int var7 = this.field1371[var6];
                int var8 = 70 - var5 * 14 + this.field1532 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field1372[var6];
                boolean var10 = false;
                if (var9 != null && var9.startsWith("@cr1@")) {
                    var9 = var9.substring(5);
                    boolean var11 = true;
                }
                if (var9 != null && var9.startsWith("@cr2@")) {
                    var9 = var9.substring(5);
                    boolean var12 = true;
                }
                if (var7 == 0) {
                    ++var5;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1598 == 0 || this.field1598 == 1 && this.method445(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8 && !var9.equals(field1374.field460)) {
                        if (this.field1432 >= 1) {
                            this.field1511[this.field1390] = "Report abuse @whi@" + var9;
                            this.field1233[this.field1390] = 524;
                            ++this.field1390;
                        }
                        this.field1511[this.field1390] = "Add ignore @whi@" + var9;
                        this.field1233[this.field1390] = 47;
                        ++this.field1390;
                        this.field1511[this.field1390] = "Add friend @whi@" + var9;
                        this.field1233[this.field1390] = 605;
                        ++this.field1390;
                    }
                    ++var5;
                }
                if ((var7 == 3 || var7 == 7) && this.field1291 == 0 && (var7 == 7 || this.field1414 == 0 || this.field1414 == 1 && this.method445(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        if (this.field1432 >= 1) {
                            this.field1511[this.field1390] = "Report abuse @whi@" + var9;
                            this.field1233[this.field1390] = 524;
                            ++this.field1390;
                        }
                        this.field1511[this.field1390] = "Add ignore @whi@" + var9;
                        this.field1233[this.field1390] = 47;
                        ++this.field1390;
                        this.field1511[this.field1390] = "Add friend @whi@" + var9;
                        this.field1233[this.field1390] = 605;
                        ++this.field1390;
                    }
                    ++var5;
                }
                if (var7 == 4 && (this.field1528 == 0 || this.field1528 == 1 && this.method445(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field1511[this.field1390] = "Accept trade @whi@" + var9;
                        this.field1233[this.field1390] = 507;
                        ++this.field1390;
                    }
                    ++var5;
                }
                if ((var7 == 5 || var7 == 6) && this.field1291 == 0 && this.field1414 < 2) {
                    ++var5;
                }
                if (var7 == 8 && (this.field1528 == 0 || this.field1528 == 1 && this.method445(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field1511[this.field1390] = "Accept challenge @whi@" + var9;
                        this.field1233[this.field1390] = 957;
                        ++this.field1390;
                    }
                    ++var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.field1664 = false;
        while (this.field1312) {
            this.field1664 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1458 = null;
        this.field1459 = null;
        this.field1326 = null;
        this.field1565 = null;
        if (arg0 < 0 || arg0 > 0) {
            field1360 = 403;
        }
        this.field1566 = null;
        this.field1567 = null;
        this.field1568 = null;
        this.field1315 = null;
        this.field1316 = null;
        this.field1507 = null;
        this.field1508 = null;
        this.field1351 = null;
        this.field1352 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)Z")
    public final boolean method495(byte arg0, Component arg1) {
        if (arg1.field87 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field87.length; ++var3) {
                int var4 = this.method535(arg1, var3, 0);
                int var5 = arg1.field88[var3];
                if (arg1.field87[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field87[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field87[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (this.field1595 != arg0) {
                this.method6();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1364 = true;
        int var2 = 49 / arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method496(int arg0, boolean arg1) {
        signlink.wavevol = arg0;
        if (arg1) {
            this.field1467 = this.field1534.method229();
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method497(int arg0) {
        if (arg0 != 3) {
            this.field1259.method219(251);
        }
        for (int var2 = 0; var2 < this.field1503; ++var2) {
            if (this.field1311[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1273[var2] == this.field1577 && this.field1666[var2] == this.field1391) {
                        if (!this.method462(true)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(this.field1666[var2], this.field1273[var2], (byte) -34);
                        if (System.currentTimeMillis() + (long) (var4.field711 / 22) > (long) (this.field1653 / 22) + this.field1681) {
                            this.field1653 = var4.field711;
                            this.field1681 = System.currentTimeMillis();
                            if (this.method430(var4.field710, var4.field711, (byte) 7)) {
                                this.field1577 = this.field1273[var2];
                                this.field1391 = this.field1666[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1311[var2] != -5) {
                    this.field1311[var2] = -5;
                } else {
                    --this.field1503;
                    for (int var6 = var2; var6 < this.field1503; ++var6) {
                        this.field1273[var6] = this.field1273[var6 + 1];
                        this.field1666[var6] = this.field1666[var6 + 1];
                        this.field1311[var6] = this.field1311[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1311[var2]--;
            }
        }
        if (this.field1447 > 0) {
            this.field1447 -= 20;
            if (this.field1447 < 0) {
                this.field1447 = 0;
            }
            if (this.field1447 == 0 && this.field1415 && !field1550) {
                this.field1575 = this.field1667;
                this.field1576 = true;
                this.field1266.method279(2, this.field1575);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1370 != null) {
                this.field1370.method38();
            }
        } catch (Exception var2) {
        }
        this.field1370 = null;
        this.method434(0);
        if (this.field1378 != null) {
            this.field1378.field993 = false;
        }
        this.field1378 = null;
        this.field1266.method271();
        this.field1266 = null;
        this.field1259 = null;
        this.field1551 = null;
        this.field1534 = null;
        this.field1254 = null;
        this.field1375 = null;
        this.field1431 = null;
        this.field1255 = null;
        this.field1256 = null;
        this.field1249 = null;
        this.field1658 = null;
        this.field1614 = null;
        this.field1314 = null;
        this.field1502 = null;
        this.field1293 = null;
        this.field1464 = null;
        this.field1465 = null;
        this.field1662 = null;
        this.field1451 = null;
        this.field1452 = null;
        this.field1453 = null;
        this.field1454 = null;
        this.field1537 = null;
        this.field1538 = null;
        this.field1539 = null;
        this.field1216 = null;
        this.field1217 = null;
        this.field1218 = null;
        this.field1219 = null;
        this.field1220 = null;
        this.field1221 = null;
        this.field1222 = null;
        this.field1223 = null;
        this.field1224 = null;
        this.field1515 = null;
        this.field1516 = null;
        this.field1517 = null;
        this.field1585 = null;
        this.field1586 = null;
        this.field1587 = null;
        this.field1607 = null;
        this.field1302 = null;
        this.field1303 = null;
        this.field1304 = null;
        this.field1305 = null;
        this.field1306 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field1241 = null;
        this.field1242 = null;
        this.field1660 = null;
        this.field1379 = null;
        this.field1492 = null;
        this.field1659 = null;
        this.field1403 = null;
        this.field1404 = null;
        this.field1405 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1510 = null;
        this.field1230 = null;
        this.field1616 = null;
        this.field1621 = null;
        this.field1623 = null;
        this.field1625 = null;
        this.field1626 = null;
        this.field1419 = null;
        this.field1674 = null;
        this.field1676 = null;
        this.field1294 = null;
        if (arg0 != -48204) {
            this.field1289 = !this.field1289;
        }
        this.field1399 = null;
        this.field1596 = null;
        this.field1578 = null;
        this.field1231 = null;
        this.field1232 = null;
        this.field1233 = null;
        this.field1234 = null;
        this.field1511 = null;
        this.field1227 = null;
        this.field1358 = null;
        this.field1359 = null;
        this.field1488 = null;
        this.field1395 = null;
        this.field1271 = null;
        this.field1295 = null;
        this.field1581 = null;
        this.field1480 = null;
        this.field1481 = null;
        this.field1477 = null;
        this.field1478 = null;
        this.field1479 = null;
        this.field1482 = null;
        this.field1483 = null;
        this.field1484 = null;
        this.field1485 = null;
        this.method494(this.field1656);
        LocType.method329(0);
        NpcType.method340(0);
        ObjType.method347(0);
        FloType.field1100 = null;
        IdkType.field1116 = null;
        Component.field71 = null;
        UnkType.field1124 = null;
        SeqType.field1135 = null;
        SpotAnimType.field1157 = null;
        SpotAnimType.field1169 = null;
        VarpType.field1181 = null;
        super.field17 = null;
        PlayerEntity.field484 = null;
        Pix3D.method164(0);
        World3D.method49(0);
        Model.method122(0);
        AnimFrame.method46(0);
        System.gc();
        if (Linkable.field364) {
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method498(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.method6();
        }
        if (this.field1301 > 1) {
            --this.field1301;
        }
        if (this.field1470 > 0) {
            --this.field1470;
        }
        for (int var2 = 0; var2 < 5 && this.method435((byte) -67); ++var2) {
        }
        if (this.field1602) {
            Object var3 = this.field1378.field994;
            synchronized (this.field1378.field994) {
                if (!field1385) {
                    this.field1378.field995 = 0;
                } else if (super.field30 != 0 || this.field1378.field995 >= 40) {
                    this.field1259.method218(this.field1236, 94);
                    this.field1259.method219(0);
                    int var4 = this.field1259.field711;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1378.field995 && var4 - this.field1259.field711 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1378.field997[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1378.field996[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1378.field997[var6] == -1 && this.field1378.field996[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1397 == var8 && this.field1398 == var7) {
                            if (this.field1243 < 2047) {
                                ++this.field1243;
                            }
                        } else {
                            int var10 = var8 - this.field1397;
                            this.field1397 = var8;
                            int var11 = var7 - this.field1398;
                            this.field1398 = var7;
                            if (this.field1243 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1259.method220((this.field1243 << 12) + (var10 << 6) + var11);
                                this.field1243 = 0;
                            } else if (this.field1243 < 8) {
                                this.field1259.method222((this.field1243 << 19) + 8388608 + var9);
                                this.field1243 = 0;
                            } else {
                                this.field1259.method223((this.field1243 << 19) + -1073741824 + var9);
                                this.field1243 = 0;
                            }
                        }
                    }
                    this.field1259.method228(-164, this.field1259.field711 - var4);
                    if (var5 >= this.field1378.field995) {
                        this.field1378.field995 = 0;
                    } else {
                        this.field1378.field995 -= var5;
                        for (int var12 = 0; var12 < this.field1378.field995; ++var12) {
                            this.field1378.field996[var12] = this.field1378.field996[var5 + var12];
                            this.field1378.field997[var12] = this.field1378.field997[var5 + var12];
                        }
                    }
                }
            }
            if (super.field30 != 0) {
                long var13 = (super.field33 - this.field1553) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1553 = super.field33;
                int var15 = super.field32;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field31;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field30 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1259.method218(this.field1236, 238);
                this.field1259.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1651 > 0) {
                --this.field1651;
            }
            if (super.field34[1] == 1 || super.field34[2] == 1 || super.field34[3] == 1 || super.field34[4] == 1) {
                this.field1652 = true;
            }
            if (this.field1652 && this.field1651 <= 0) {
                this.field1651 = 20;
                this.field1652 = false;
                this.field1259.method218(this.field1236, 212);
                this.field1259.method220(this.field1441);
                this.field1259.method220(this.field1442);
            }
            if (super.field21 && !this.field1308) {
                this.field1308 = true;
                this.field1259.method218(this.field1236, 11);
                this.field1259.method219(1);
            }
            if (!super.field21 && this.field1308) {
                this.field1308 = false;
                this.field1259.method218(this.field1236, 11);
                this.field1259.method219(0);
            }
            this.method466(false);
            this.method561(0);
            this.method497(3);
            ++this.field1468;
            if (this.field1468 > 750) {
                this.method526((byte) 3);
            }
            this.method529(true);
            this.method479(960);
            this.method454(this.field1287);
            ++this.field1348;
            if (this.field1501 != 0) {
                this.field1500 += 20;
                if (this.field1500 >= 400) {
                    this.field1501 = 0;
                }
            }
            if (this.field1632 != 0) {
                ++this.field1629;
                if (this.field1629 >= 15) {
                    if (this.field1632 == 2) {
                        this.field1327 = true;
                    }
                    if (this.field1632 == 3) {
                        this.field1574 = true;
                    }
                    this.field1632 = 0;
                }
            }
            if (this.field1422 != 0) {
                ++this.field1524;
                if (super.field24 > this.field1423 + 5 || super.field24 < this.field1423 - 5 || super.field25 > this.field1424 + 5 || super.field25 < this.field1424 - 5) {
                    this.field1355 = true;
                }
                if (super.field23 == 0) {
                    if (this.field1422 == 2) {
                        this.field1327 = true;
                    }
                    if (this.field1422 == 3) {
                        this.field1574 = true;
                    }
                    this.field1422 = 0;
                    if (this.field1355 && this.field1524 >= 5) {
                        this.field1609 = -1;
                        this.method504((byte) 8);
                        if (this.field1609 == this.field1420 && this.field1608 != this.field1421) {
                            Component var20 = Component.field71[this.field1420];
                            byte var21 = 0;
                            if (this.field1610 == 1 && var20.field80 == 206) {
                                var21 = 1;
                            }
                            if (var20.field72[this.field1608] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field101) {
                                int var22 = this.field1421;
                                int var23 = this.field1608;
                                var20.field72[var23] = var20.field72[var22];
                                var20.field73[var23] = var20.field73[var22];
                                var20.field72[var22] = -1;
                                var20.field73[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1421;
                                int var25 = this.field1608;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24 - 1, false, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24 + 1, false, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1608, false, this.field1421);
                            }
                            this.field1259.method218(this.field1236, 126);
                            this.field1259.method220(this.field1420);
                            this.field1259.method220(this.field1421);
                            this.field1259.method220(this.field1608);
                            this.field1259.method219(var21);
                        }
                    } else if ((this.field1430 == 1 || this.method542(this.field1456, this.field1390 - 1)) && this.field1390 > 2) {
                        this.method490(5);
                    } else if (this.field1390 > 0) {
                        this.method442(this.field1390 - 1, true);
                    }
                    this.field1629 = 10;
                    super.field30 = 0;
                }
            }
            ++field1384;
            if (field1384 > 62) {
                field1384 = 0;
                this.field1259.method218(this.field1236, 87);
            }
            if (World3D.field319 != -1) {
                int var26 = World3D.field319;
                int var27 = World3D.field320;
                boolean var28 = this.method510(field1374.field448[0], 0, -35517, 0, 0, true, 0, field1374.field447[0], var26, 0, var27, 0);
                World3D.field319 = -1;
                if (var28) {
                    this.field1498 = super.field31;
                    this.field1499 = super.field32;
                    this.field1501 = 1;
                    this.field1500 = 0;
                }
            }
            if (super.field30 == 1 && this.field1337 != null) {
                this.field1337 = null;
                this.field1574 = true;
                super.field30 = 0;
            }
            this.method533(true);
            this.method547((byte) -95);
            this.method461((byte) 24);
            this.method499(this.field1628);
            if (super.field23 == 1 || super.field30 == 1) {
                ++this.field1601;
            }
            if (this.field1288 == 2) {
                this.method459(20686);
            }
            if (this.field1288 == 2 && this.field1671) {
                this.method543(false);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1496[var29]++;
            }
            this.method440(6);
            ++super.field22;
            if (super.field22 > 4500) {
                this.field1470 = 250;
                super.field22 -= 500;
                this.field1259.method218(this.field1236, 194);
            }
            ++this.field1462;
            if (this.field1462 > 500) {
                this.field1462 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1282 += this.field1283;
                }
                if ((var30 & 2) == 2) {
                    this.field1475 += this.field1476;
                }
                if ((var30 & 4) == 4) {
                    this.field1448 += this.field1449;
                }
            }
            if (this.field1282 < -50) {
                this.field1283 = 2;
            }
            if (this.field1282 > 50) {
                this.field1283 = -2;
            }
            if (this.field1475 < -55) {
                this.field1476 = 2;
            }
            if (this.field1475 > 55) {
                this.field1476 = -2;
            }
            if (this.field1448 < -40) {
                this.field1449 = 1;
            }
            if (this.field1448 > 40) {
                this.field1449 = -1;
            }
            ++this.field1363;
            if (this.field1363 > 500) {
                this.field1363 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1611 += this.field1612;
                }
                if ((var31 & 2) == 2) {
                    this.field1269 += this.field1270;
                }
            }
            if (this.field1611 < -60) {
                this.field1612 = 2;
            }
            if (this.field1611 > 60) {
                this.field1612 = -2;
            }
            if (this.field1269 < -20) {
                this.field1270 = 1;
            }
            if (this.field1269 > 10) {
                this.field1270 = -1;
            }
            ++this.field1469;
            if (this.field1469 > 50) {
                this.field1259.method218(this.field1236, 62);
            }
            try {
                if (this.field1370 != null && this.field1259.field711 > 0) {
                    this.field1370.method42((byte) 38, this.field1259.field710, 0, this.field1259.field711);
                    this.field1259.field711 = 0;
                    this.field1469 = 0;
                }
            } catch (IOException var33) {
                this.method526((byte) 3);
            } catch (Exception var34) {
                this.method450(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method499(boolean arg0) {
        this.field1602 &= arg0;
        if (super.field30 == 1) {
            if (super.field31 >= 6 && super.field31 <= 106 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1598 = (this.field1598 + 1) % 4;
                this.field1639 = true;
                this.field1574 = true;
                this.field1259.method218(this.field1236, 215);
                this.field1259.method219(this.field1598);
                this.field1259.method219(this.field1414);
                this.field1259.method219(this.field1528);
            }
            if (super.field31 >= 135 && super.field31 <= 235 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1414 = (this.field1414 + 1) % 3;
                this.field1639 = true;
                this.field1574 = true;
                this.field1259.method218(this.field1236, 215);
                this.field1259.method219(this.field1598);
                this.field1259.method219(this.field1414);
                this.field1259.method219(this.field1528);
            }
            if (super.field31 >= 273 && super.field31 <= 373 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1528 = (this.field1528 + 1) % 3;
                this.field1639 = true;
                this.field1574 = true;
                this.field1259.method218(this.field1236, 215);
                this.field1259.method219(this.field1598);
                this.field1259.method219(this.field1414);
                this.field1259.method219(this.field1528);
            }
            if (super.field31 >= 412 && super.field31 <= 512 && super.field32 >= 467 && super.field32 <= 499) {
                if (this.field1226 == -1) {
                    this.method536(3);
                    this.field1361 = "";
                    this.field1471 = false;
                    for (int var2 = 0; var2 < Component.field71.length; ++var2) {
                        if (Component.field71[var2] != null && Component.field71[var2].field80 == 600) {
                            this.field1657 = this.field1226 = Component.field71[var2].field77;
                            return;
                        }
                    }
                    return;
                }
                this.method519(true, 0, "Please close the interface you have open before using 'report abuse'", "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;IBI)V")
    public final void method500(Pix32 arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field1611 + this.field1442 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field604[var5];
            int var8 = Model.field605[var5];
            int var9 = var7 * 256 / (this.field1269 + 256);
            if (arg2 == 4) {
                boolean var10 = false;
            } else {
                this.field1307 = -141;
            }
            int var11 = var8 * 256 / (this.field1269 + 256);
            int var12 = arg1 * var11 + arg3 * var9 >> 16;
            int var13 = arg3 * var11 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method192(this.field1516, 83 - var13 - arg0.field668 / 2 - 4, var12 + 94 - arg0.field667 / 2 + 4, (byte) -63);
            } else {
                arg0.method186(true, var12 + 94 - arg0.field667 / 2 + 4, 83 - var13 - arg0.field668 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method501(byte arg0) {
        this.field1452.method258((byte) 4);
        if (this.field1401 == 2) {
            byte[] var2 = this.field1516.field676;
            int[] var3 = Pix2D.field619;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1660.method190(403, 0, 25, 0, this.field1509, 33, 25, this.field1594, 33, this.field1442, 256);
            this.field1453.method258((byte) 4);
        } else {
            int var6 = this.field1611 + this.field1442 & 2047;
            int var7 = field1374.field397 / 32 + 48;
            int var8 = 464 - field1374.field398 / 32;
            this.field1395.method190(403, 25, var8, 5, this.field1526, 146, var7, this.field1247, 151, var6, this.field1269 + 256);
            this.field1660.method190(403, 0, 25, 0, this.field1509, 33, 25, this.field1594, 33, this.field1442, 256);
            for (int var9 = 0; var9 < this.field1357; ++var9) {
                int var39 = this.field1358[var9] * 4 + 2 - field1374.field397 / 32;
                int var40 = this.field1359[var9] * 4 + 2 - field1374.field398 / 32;
                this.method500(this.field1488[var9], var39, (byte) 4, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    LinkList var36 = this.field1294[this.field1546][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field1374.field397 / 32;
                        int var38 = var35 * 4 + 2 - field1374.field398 / 32;
                        this.method500(this.field1403, var37, (byte) 4, var38);
                    }
                }
            }
            if (arg0 != 39) {
                this.field1521 = !this.field1521;
            }
            for (int var11 = 0; var11 < this.field1675; ++var11) {
                NpcEntity var31 = this.field1674[this.field1676[var11]];
                if (var31 != null && var31.method113(false)) {
                    NpcType var32 = var31.field455;
                    if (var32.field1032 != null) {
                        var32 = var32.method345((byte) 8);
                    }
                    if (var32 != null && var32.field1023) {
                        int var33 = var31.field397 / 32 - field1374.field397 / 32;
                        int var34 = var31.field398 / 32 - field1374.field398 / 32;
                        this.method500(this.field1404, var33, (byte) 4, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1622; ++var12) {
                PlayerEntity var23 = this.field1621[this.field1623[var12]];
                if (var23 != null && var23.method113(false)) {
                    int var24 = var23.field397 / 32 - field1374.field397 / 32;
                    int var25 = var23.field398 / 32 - field1374.field398 / 32;
                    boolean var26 = false;
                    long var27 = JString.method300(var23.field460);
                    for (int var29 = 0; var29 < this.field1346; ++var29) {
                        if (this.field1295[var29] == var27 && this.field1581[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field1374.field483 != 0 && var23.field483 != 0 && field1374.field483 == var23.field483) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method500(this.field1406, var24, (byte) 4, var25);
                    } else if (var30) {
                        this.method500(this.field1407, var24, (byte) 4, var25);
                    } else {
                        this.method500(this.field1405, var24, (byte) 4, var25);
                    }
                }
            }
            if (this.field1272 != 0 && field1275 % 20 < 10) {
                if (this.field1272 == 1 && this.field1682 >= 0 && this.field1682 < this.field1674.length) {
                    NpcEntity var13 = this.field1674[this.field1682];
                    if (var13 != null) {
                        int var14 = var13.field397 / 32 - field1374.field397 / 32;
                        int var15 = var13.field398 / 32 - field1374.field398 / 32;
                        this.method522((byte) -85, var15, this.field1505, var14);
                    }
                }
                if (this.field1272 == 2) {
                    int var16 = (this.field1408 - this.field1320) * 4 + 2 - field1374.field397 / 32;
                    int var17 = (this.field1409 - this.field1321) * 4 + 2 - field1374.field398 / 32;
                    this.method522((byte) -85, var17, this.field1505, var16);
                }
                if (this.field1272 == 10 && this.field1276 >= 0 && this.field1276 < this.field1621.length) {
                    PlayerEntity var18 = this.field1621[this.field1276];
                    if (var18 != null) {
                        int var19 = var18.field397 / 32 - field1374.field397 / 32;
                        int var20 = var18.field398 / 32 - field1374.field398 / 32;
                        this.method522((byte) -85, var20, this.field1505, var19);
                    }
                }
            }
            if (this.field1393 != 0) {
                int var21 = this.field1393 * 4 + 2 - field1374.field397 / 32;
                int var22 = this.field1394 * 4 + 2 - field1374.field398 / 32;
                this.method500(this.field1504, var21, (byte) 4, var22);
            }
            Pix2D.method157(97, 3, 16777215, false, 78, 3);
            this.field1453.method258((byte) 4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)Lxb;")
    public final Jagfile method502(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1284[0] != null) {
                var7 = this.field1284[0].method291(arg2, 913);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1342.reset();
            this.field1342.update(var7);
            int var9 = (int) this.field1342.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(true, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13("Requesting " + arg1, -761, arg5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method448(arg0 + arg4);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, 58);
                    var17.field711 = 3;
                    int var18 = var17.method233() + 6;
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
                            this.method13("Loading " + arg1 + " - " + var23 + "%", -761, arg5);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1284[0] != null) {
                            this.field1284[0].method292(6, arg2, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field1284[0] = null;
                    }
                    if (var7 != null) {
                        this.field1342.reset();
                        this.field1342.update(var7);
                        int var24 = (int) this.field1342.getValue();
                        if (arg4 != var24) {
                            var7 = null;
                            ++var11;
                            var12 = "Checksum error: " + var24;
                        }
                    }
                } catch (IOException var31) {
                    if (var12.equals("Unknown error")) {
                        var12 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var32) {
                    var12 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var33) {
                    var12 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var34) {
                    var12 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var26 = var8; var26 > 0; --var26) {
                        if (var11 >= 3) {
                            this.method13("Game updated - please reload page", -761, arg5);
                            var26 = 10;
                        } else {
                            this.method13(var12 + " - Retrying in " + var26, -761, arg5);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var28) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                    this.field1353 = !this.field1353;
                }
            }
            Jagfile var27 = new Jagfile(true, var7);
            if (arg3 != 1) {
                this.field1259.method219(175);
            }
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;IZ)V")
    public final void method503(Packet arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1367 = !this.field1367;
        }
        if (arg1 != 142 && arg1 != 237) {
            if (arg1 == 188) {
                int var4 = arg0.method229();
                int var5 = (var4 >> 4 & 7) + this.field1678;
                int var6 = (var4 & 7) + this.field1679;
                int var7 = arg0.method229();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1225[var8];
                int var11 = arg0.method231();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1249[this.field1546][var5][var6];
                    int var13 = this.field1249[this.field1546][var5 + 1][var6];
                    int var14 = this.field1249[this.field1546][var5 + 1][var6 + 1];
                    int var15 = this.field1249[this.field1546][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1614.method72((byte) -18, var6, this.field1546, var5);
                        if (var16 != null) {
                            int var17 = var16.field276 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field274 = new LocEntity(var11, var14, -530, var12, false, var9 + 4, var13, 2, var15, var17);
                                var16.field275 = new LocEntity(var11, var14, -530, var12, false, var9 + 1 & 3, var13, 2, var15, var17);
                            } else {
                                var16.field274 = new LocEntity(var11, var14, -530, var12, false, var9, var13, var8, var15, var17);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1614.method73(var5, var6, this.field1546, (byte) 0);
                        if (var18 != null) {
                            var18.field166 = new LocEntity(var11, var14, -530, var12, false, 0, var13, 4, var15, var18.field167 >> 14 & 32767);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1614.method74(var5, this.field1546, var6, true);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field259 = new LocEntity(var11, var14, -530, var12, false, var9, var13, var8, var15, var19.field267 >> 14 & 32767);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1614.method75(this.field1546, false, var6, var5);
                        if (var20 != null) {
                            var20.field198 = new LocEntity(var11, var14, -530, var12, false, var9, var13, 22, var15, var20.field199 >> 14 & 32767);
                        }
                    }
                }
            } else if (arg1 == 7) {
                int var21 = arg0.method229();
                int var22 = (var21 >> 4 & 7) + this.field1678;
                int var23 = (var21 & 7) + this.field1679;
                int var24 = arg0.method231();
                int var25 = arg0.method231();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field500 = var24;
                    var26.field501 = var25;
                    if (this.field1294[this.field1546][var22][var23] == null) {
                        this.field1294[this.field1546][var22][var23] = new LinkList(0);
                    }
                    this.field1294[this.field1546][var22][var23].method245(var26);
                    this.method516(var22, var23);
                }
            } else if (arg1 == 76) {
                int var27 = arg0.method229();
                int var28 = (var27 >> 4 & 7) + this.field1678;
                int var29 = (var27 & 7) + this.field1679;
                int var30 = arg0.method231();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1294[this.field1546][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250((byte) 8)) {
                            if ((var30 & 32767) == var32.field500) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method248() == null) {
                            this.field1294[this.field1546][var28][var29] = null;
                        }
                        this.method516(var28, var29);
                    }
                }
            } else if (arg1 == 192) {
                int var33 = arg0.method229();
                int var34 = (var33 >> 4 & 7) + this.field1678;
                int var35 = (var33 & 7) + this.field1679;
                int var36 = var34 + arg0.method230();
                int var37 = var35 + arg0.method230();
                int var38 = arg0.method232();
                int var39 = arg0.method231();
                int var40 = arg0.method229() * 4;
                int var41 = arg0.method229() * 4;
                int var42 = arg0.method231();
                int var43 = arg0.method231();
                int var44 = arg0.method229();
                int var45 = arg0.method229();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var39 != 65535) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(field1275 + var43, this.field1215, var46, var45, this.method513(this.field1592, this.field1546, var46, var47) - var40, this.field1546, var38, var44, var41, var39, var47, field1275 + var42);
                    var50.method120(var49, field1275 + var42, this.method513(this.field1592, this.field1546, var48, var49) - var41, (byte) 6, var48);
                    this.field1596.method245(var50);
                }
            } else if (arg1 == 45) {
                int var51 = arg0.method229();
                int var52 = (var51 >> 4 & 7) + this.field1678;
                int var53 = (var51 & 7) + this.field1679;
                int var54 = arg0.method231();
                int var55 = arg0.method229();
                int var56 = arg0.method231();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(var57, var54, this.method513(this.field1592, this.field1546, var57, var58) - var55, this.field1546, field1275, var58, var56, this.field1588);
                    this.field1578.method245(var59);
                }
            } else if (arg1 == 14) {
                int var60 = arg0.method229();
                int var61 = (var60 >> 4 & 7) + this.field1678;
                int var62 = (var60 & 7) + this.field1679;
                int var63 = arg0.method231();
                int var64 = arg0.method231();
                int var65 = arg0.method231();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1680 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field500 = var63;
                    var66.field501 = var64;
                    if (this.field1294[this.field1546][var61][var62] == null) {
                        this.field1294[this.field1546][var61][var62] = new LinkList(0);
                    }
                    this.field1294[this.field1546][var61][var62].method245(var66);
                    this.method516(var61, var62);
                }
            } else {
                if (arg1 == 35) {
                    int var67 = arg0.method229();
                    int var68 = (var67 >> 4 & 7) + this.field1678;
                    int var69 = (var67 & 7) + this.field1679;
                    int var70 = arg0.method229();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1225[var71];
                    int var74 = arg0.method231();
                    int var75 = arg0.method231();
                    int var76 = arg0.method231();
                    int var77 = arg0.method231();
                    byte var78 = arg0.method230();
                    byte var79 = arg0.method230();
                    byte var80 = arg0.method230();
                    byte var81 = arg0.method230();
                    PlayerEntity var82;
                    if (this.field1680 == var77) {
                        var82 = field1374;
                    } else {
                        var82 = this.field1621[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method330(var74);
                        int var84 = this.field1249[this.field1546][var68][var69];
                        int var85 = this.field1249[this.field1546][var68 + 1][var69];
                        int var86 = this.field1249[this.field1546][var68 + 1][var69 + 1];
                        int var87 = this.field1249[this.field1546][var68][var69 + 1];
                        Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method457(var73, (byte) 3, var68, -1, var76 + 1, 0, this.field1546, var69, 0, var75 + 1);
                            var82.field470 = field1275 + var75;
                            var82.field471 = field1275 + var76;
                            var82.field475 = var88;
                            int var89 = var83.field959;
                            int var90 = var83.field960;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field960;
                                var90 = var83.field959;
                            }
                            var82.field472 = var68 * 128 + var89 * 64;
                            var82.field474 = var69 * 128 + var90 * 64;
                            var82.field473 = this.method513(this.field1592, this.field1546, var82.field472, var82.field474);
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
                            var82.field476 = var68 + var78;
                            var82.field478 = var68 + var80;
                            var82.field477 = var69 + var79;
                            var82.field479 = var69 + var81;
                        }
                    }
                }
                if (arg1 != 197) {
                    if (arg1 == 19) {
                        int var101 = arg0.method229();
                        int var102 = (var101 >> 4 & 7) + this.field1678;
                        int var103 = (var101 & 7) + this.field1679;
                        int var104 = arg0.method231();
                        int var105 = arg0.method229();
                        int var106 = var105 >> 4 & 15;
                        int var107 = var105 & 7;
                        if (field1374.field447[0] >= var102 - var106 && field1374.field447[0] <= var102 + var106 && field1374.field448[0] >= var103 - var106 && field1374.field448[0] <= var103 + var106 && this.field1525 && !field1550 && this.field1503 < 50) {
                            this.field1273[this.field1503] = var104;
                            this.field1666[this.field1503] = var107;
                            this.field1311[this.field1503] = Wave.field908[var104];
                            ++this.field1503;
                            return;
                        }
                    }
                } else {
                    int var93 = arg0.method229();
                    int var94 = (var93 >> 4 & 7) + this.field1678;
                    int var95 = (var93 & 7) + this.field1679;
                    int var96 = arg0.method231();
                    int var97 = arg0.method231();
                    int var98 = arg0.method231();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1294[this.field1546][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250((byte) 8)) {
                                if ((var96 & 32767) == var100.field500 && var100.field501 == var97) {
                                    var100.field501 = var98;
                                    break;
                                }
                            }
                            this.method516(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var108 = arg0.method229();
            int var109 = (var108 >> 4 & 7) + this.field1678;
            int var110 = (var108 & 7) + this.field1679;
            int var111 = arg0.method229();
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = this.field1225[var112];
            int var115;
            if (arg1 == 237) {
                var115 = -1;
            } else {
                var115 = arg0.method231();
            }
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                this.method457(var114, (byte) 3, var109, var115, -1, var113, this.field1546, var110, var112, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method504(byte arg0) {
        if (arg0 != 8) {
            this.field1467 = -1;
        }
        if (this.field1422 == 0) {
            this.field1511[0] = "Cancel";
            this.field1233[0] = 1106;
            this.field1390 = 1;
            this.method455((byte) 1);
            this.field1229 = 0;
            if (super.field24 > 4 && super.field25 > 4 && super.field24 < 516 && super.field25 < 338) {
                if (this.field1226 != -1) {
                    this.method509(4, super.field24, super.field25, -47549, 0, Component.field71[this.field1226], 4);
                } else {
                    this.method558(492);
                }
            }
            if (this.field1527 != this.field1229) {
                this.field1527 = this.field1229;
            }
            this.field1229 = 0;
            if (super.field24 > 553 && super.field25 > 205 && super.field24 < 743 && super.field25 < 466) {
                if (this.field1214 != -1) {
                    this.method509(553, super.field24, super.field25, -47549, 0, Component.field71[this.field1214], 205);
                } else if (this.field1600[this.field1438] != -1) {
                    this.method509(553, super.field24, super.field25, -47549, 0, Component.field71[this.field1600[this.field1438]], 205);
                }
            }
            if (this.field1290 != this.field1229) {
                this.field1327 = true;
                this.field1290 = this.field1229;
            }
            this.field1229 = 0;
            if (super.field24 > 17 && super.field25 > 357 && super.field24 < 496 && super.field25 < 453) {
                if (this.field1345 != -1) {
                    this.method509(17, super.field24, super.field25, -47549, 0, Component.field71[this.field1345], 357);
                } else if (super.field25 < 434 && super.field24 < 426) {
                    this.method493(super.field25 - 357, 0, super.field24 - 17);
                }
            }
            if (this.field1345 != -1 && this.field1486 != this.field1229) {
                this.field1574 = true;
                this.field1486 = this.field1229;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1390 - 1; ++var3) {
                    if (this.field1233[var3] < 1000 && this.field1233[var3 + 1] > 1000) {
                        String var4 = this.field1511[var3];
                        this.field1511[var3] = this.field1511[var3 + 1];
                        this.field1511[var3 + 1] = var4;
                        int var5 = this.field1233[var3];
                        this.field1233[var3] = this.field1233[var3 + 1];
                        this.field1233[var3 + 1] = var5;
                        int var6 = this.field1231[var3];
                        this.field1231[var3] = this.field1231[var3 + 1];
                        this.field1231[var3 + 1] = var6;
                        int var7 = this.field1232[var3];
                        this.field1232[var3] = this.field1232[var3 + 1];
                        this.field1232[var3 + 1] = var7;
                        int var8 = this.field1234[var3];
                        this.field1234[var3] = this.field1234[var3 + 1];
                        this.field1234[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method505(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1507[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1507[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1508[var14] = (this.field1507[var14 - 1] + this.field1507[var14 + 1] + this.field1507[var14 - 128] + this.field1507[var14 + 128]) / 4;
            }
        }
        this.field1400 += 128;
        if (this.field1400 > this.field1315.length) {
            this.field1400 -= this.field1315.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method472(-209, this.field1326[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1508[var11 + 128] - this.field1315[this.field1400 + var11 & this.field1315.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1507[var11] = var12;
            }
        }
        if (arg0 > 0) {
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field1536[var8] = this.field1536[var8 + 1];
            }
            this.field1536[var2 - 1] = (int) (Math.sin((double) field1275 / 14.0D) * 16.0D + Math.sin((double) field1275 / 15.0D) * 14.0D + Math.sin((double) field1275 / 16.0D) * 12.0D);
            if (this.field1244 > 0) {
                this.field1244 -= 4;
            }
            if (this.field1245 > 0) {
                this.field1245 -= 4;
            }
            if (this.field1244 == 0 && this.field1245 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field1244 = 1024;
                }
                if (var9 == 1) {
                    this.field1245 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1466 += arg4;
        if (arg2 >= 1 && arg3 >= 1 && arg2 <= 102 && arg3 <= 102) {
            if (field1550 && this.field1546 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field1614.method76(arg1, arg2, arg3);
            }
            if (arg5 == 1) {
                var9 = this.field1614.method77(arg1, arg2, arg3, (byte) -97);
            }
            if (arg5 == 2) {
                var9 = this.field1614.method78(arg1, arg2, arg3);
            }
            if (arg5 == 3) {
                var9 = this.field1614.method79(arg1, arg2, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1614.method80(arg1, arg2, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field1614.method67(arg3, arg2, arg1, 408);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field961) {
                        this.field1314[arg1].method364(var17.field962, var16, false, arg3, var15, arg2);
                    }
                }
                if (arg5 == 1) {
                    this.field1614.method68(arg1, arg3, arg2, 0);
                }
                if (arg5 == 2) {
                    this.field1614.method69(this.field1521, arg3, arg2, arg1);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field959 + arg2 > 103 || var18.field959 + arg3 > 103 || var18.field960 + arg2 > 103 || var18.field960 + arg3 > 103) {
                        return;
                    }
                    if (var18.field961) {
                        this.field1314[arg1].method365(var18.field960, var18.field962, var18.field959, 0, var16, arg3, arg2);
                    }
                }
                if (arg5 == 3) {
                    this.field1614.method70(arg2, 171, arg3, arg1);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field961 && var19.field963) {
                        this.field1314[arg1].method367(arg2, 310, arg3);
                    }
                }
            }
            if (arg0 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field1658[1][arg2][arg3] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                World.method31(this.field1314[arg1], arg1, arg0, arg7, var20, this.field1249, (byte) -102, arg2, arg3, arg6, this.field1614);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method507(int arg0) {
        int var2 = 15 / arg0;
        if (this.field1278 == 0) {
            int var3 = super.field14 / 2 - 80;
            int var4 = super.field15 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field30 == 1 && super.field31 >= var3 - 75 && super.field31 <= var3 + 75 && super.field32 >= var15 - 20 && super.field32 <= var15 + 20) {
                this.field1278 = 3;
                this.field1543 = 0;
            }
            int var5 = super.field14 / 2 + 80;
            if (super.field30 == 1 && super.field31 >= var5 - 75 && super.field31 <= var5 + 75 && super.field32 >= var15 - 20 && super.field32 <= var15 + 20) {
                this.field1603 = "";
                this.field1604 = "Enter your username & password.";
                this.field1278 = 2;
                this.field1543 = 0;
            }
        } else if (this.field1278 == 2) {
            int var6 = super.field15 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field30 == 1 && super.field32 >= var17 - 15 && super.field32 < var17) {
                this.field1543 = 0;
            }
            var6 = var17 + 15;
            if (super.field30 == 1 && super.field32 >= var6 - 15 && super.field32 < var6) {
                this.field1543 = 1;
            }
            var6 += 15;
            int var7 = super.field14 / 2 - 80;
            int var8 = super.field15 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field30 == 1 && super.field31 >= var7 - 75 && super.field31 <= var7 + 75 && super.field32 >= var18 - 20 && super.field32 <= var18 + 20) {
                this.field1262 = 0;
                this.method553(this.field1654, this.field1655, false);
                if (this.field1602) {
                    return;
                }
            }
            int var9 = super.field14 / 2 + 80;
            if (super.field30 == 1 && super.field31 >= var9 - 75 && super.field31 <= var9 + 75 && super.field32 >= var18 - 20 && super.field32 <= var18 + 20) {
                this.field1278 = 0;
                this.field1654 = "";
                this.field1655 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method5((byte) -4);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field1330.length(); ++var12) {
                        if (var10 == field1330.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field1543 == 0) {
                        if (var10 == 8 && this.field1654.length() > 0) {
                            this.field1654 = this.field1654.substring(0, this.field1654.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field1543 = 1;
                        }
                        if (var11) {
                            this.field1654 = this.field1654 + (char) var10;
                        }
                        if (this.field1654.length() > 12) {
                            this.field1654 = this.field1654.substring(0, 12);
                        }
                    } else if (this.field1543 == 1) {
                        if (var10 == 8 && this.field1655.length() > 0) {
                            this.field1655 = this.field1655.substring(0, this.field1655.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field1543 = 0;
                        }
                        if (var11) {
                            this.field1655 = this.field1655 + (char) var10;
                        }
                        if (this.field1655.length() > 20) {
                            this.field1655 = this.field1655.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1278 == 3) {
                int var13 = super.field14 / 2;
                int var14 = super.field15 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field30 == 1 && super.field31 >= var13 - 75 && super.field31 <= var13 + 75 && super.field32 >= var19 - 20 && super.field32 <= var19 + 20) {
                    this.field1278 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLlb;)V")
    private final void method508(int arg0, boolean arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1624; ++var4) {
            int var5 = this.field1625[var4];
            NpcEntity var6 = this.field1674[var5];
            int var7 = arg2.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method229();
                int var9 = arg2.method229();
                var6.method114((byte) 2, var9, field1275, var8);
                var6.field416 = field1275 + 300;
                var6.field417 = arg2.method229();
                var6.field418 = arg2.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field425 == var10) {
                    var6.field429 = 0;
                }
                int var11 = arg2.method229();
                if (var6.field425 == var10 && var10 != -1) {
                    int var12 = SeqType.field1135[var10].field1149;
                    if (var12 == 1) {
                        var6.field426 = 0;
                        var6.field427 = 0;
                        var6.field428 = var11;
                        var6.field429 = 0;
                    }
                    if (var12 == 2) {
                        var6.field429 = 0;
                    }
                } else if (var10 == -1 || var6.field425 == -1 || SeqType.field1135[var10].field1143 >= SeqType.field1135[var6.field425].field1143) {
                    var6.field425 = var10;
                    var6.field426 = 0;
                    var6.field427 = 0;
                    var6.field428 = var11;
                    var6.field429 = 0;
                    var6.field451 = var6.field446;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field419 = arg2.method231();
                if (var6.field419 == 65535) {
                    var6.field419 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field409 = arg2.method236();
                var6.field410 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method229();
                int var14 = arg2.method229();
                var6.method114((byte) 2, var14, field1275, var13);
                var6.field416 = field1275 + 300;
                var6.field417 = arg2.method229();
                var6.field418 = arg2.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field455 = NpcType.method341(arg2.method231());
                var6.field401 = var6.field455.field1009;
                var6.field445 = var6.field455.field1031;
                var6.field404 = var6.field455.field1013;
                var6.field405 = var6.field455.field1014;
                var6.field406 = var6.field455.field1015;
                var6.field407 = var6.field455.field1016;
                var6.field402 = var6.field455.field1012;
            }
            if ((var7 & 64) == 64) {
                var6.field430 = arg2.method231();
                int var15 = arg2.method234();
                var6.field434 = var15 >> 16;
                var6.field433 = (var15 & 65535) + field1275;
                var6.field431 = 0;
                var6.field432 = 0;
                if (var6.field433 > field1275) {
                    var6.field431 = -1;
                }
                if (var6.field430 == 65535) {
                    var6.field430 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field420 = arg2.method231();
                var6.field421 = arg2.method231();
            }
        }
        this.field1602 &= arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIILd;I)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, Component arg5, int arg6) {
        if (arg3 == -47549) {
            if (arg5.field78 == 0 && arg5.field93 != null && !arg5.field92) {
                if (arg1 >= arg0 && arg2 >= arg6 && arg1 <= arg5.field81 + arg0 && arg2 <= arg5.field82 + arg6) {
                    int var8 = arg5.field93.length;
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg5.field94[var9] + arg0;
                        int var11 = arg5.field95[var9] + arg6 - arg4;
                        Component var12 = Component.field71[arg5.field93[var9]];
                        int var13 = var12.field84 + var10;
                        int var14 = var12.field85 + var11;
                        if ((var12.field89 >= 0 || var12.field116 != 0) && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                            if (var12.field89 >= 0) {
                                this.field1229 = var12.field89;
                            } else {
                                this.field1229 = var12.field76;
                            }
                        }
                        if (var12.field78 == 0) {
                            this.method509(var13, arg1, arg2, -47549, var12.field91, var12, var14);
                            if (var12.field90 > var12.field82) {
                                this.method465(arg1, arg2, true, var12.field82, var12.field81 + var13, (byte) -71, var12.field90, var14, var12);
                            }
                        } else {
                            if (var12.field79 == 1 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                boolean var15 = false;
                                if (var12.field80 != 0) {
                                    var15 = this.method525(var12, this.field1589);
                                }
                                if (!var15) {
                                    this.field1511[this.field1390] = var12.field132;
                                    this.field1233[this.field1390] = 231;
                                    this.field1232[this.field1390] = var12.field76;
                                    ++this.field1390;
                                }
                            }
                            if (var12.field79 == 2 && this.field1645 == 0 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                String var16 = var12.field129;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field1511[this.field1390] = var16 + " @gre@" + var12.field130;
                                this.field1233[this.field1390] = 274;
                                this.field1232[this.field1390] = var12.field76;
                                ++this.field1390;
                            }
                            if (var12.field79 == 3 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1511[this.field1390] = "Close";
                                this.field1233[this.field1390] = 737;
                                this.field1232[this.field1390] = var12.field76;
                                ++this.field1390;
                            }
                            if (var12.field79 == 4 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1511[this.field1390] = var12.field132;
                                this.field1233[this.field1390] = 435;
                                this.field1232[this.field1390] = var12.field76;
                                ++this.field1390;
                            }
                            if (var12.field79 == 5 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1511[this.field1390] = var12.field132;
                                this.field1233[this.field1390] = 225;
                                this.field1232[this.field1390] = var12.field76;
                                ++this.field1390;
                            }
                            if (var12.field79 == 6 && !this.field1672 && arg1 >= var13 && arg2 >= var14 && arg1 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1511[this.field1390] = var12.field132;
                                this.field1233[this.field1390] = 997;
                                this.field1232[this.field1390] = var12.field76;
                                ++this.field1390;
                            }
                            if (var12.field78 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var12.field82; ++var18) {
                                    for (int var19 = 0; var19 < var12.field81; ++var19) {
                                        int var20 = (var12.field102 + 32) * var19 + var13;
                                        int var21 = (var12.field103 + 32) * var18 + var14;
                                        if (var17 < 20) {
                                            var20 += var12.field105[var17];
                                            var21 += var12.field106[var17];
                                        }
                                        if (arg1 >= var20 && arg2 >= var21 && arg1 < var20 + 32 && arg2 < var21 + 32) {
                                            this.field1608 = var17;
                                            this.field1609 = var12.field76;
                                            if (var12.field72[var17] > 0) {
                                                ObjType var22 = ObjType.method348(var12.field72[var17] - 1);
                                                if (this.field1425 == 1 && var12.field99) {
                                                    if (this.field1427 != var12.field76 || this.field1426 != var17) {
                                                        this.field1511[this.field1390] = "Use " + this.field1429 + " with @lre@" + var22.field1047;
                                                        this.field1233[this.field1390] = 398;
                                                        this.field1234[this.field1390] = var22.field1045;
                                                        this.field1231[this.field1390] = var17;
                                                        this.field1232[this.field1390] = var12.field76;
                                                        ++this.field1390;
                                                    }
                                                } else if (this.field1645 == 1 && var12.field99) {
                                                    if ((this.field1647 & 16) == 16) {
                                                        this.field1511[this.field1390] = this.field1648 + " @lre@" + var22.field1047;
                                                        this.field1233[this.field1390] = 563;
                                                        this.field1234[this.field1390] = var22.field1045;
                                                        this.field1231[this.field1390] = var17;
                                                        this.field1232[this.field1390] = var12.field76;
                                                        ++this.field1390;
                                                    }
                                                } else {
                                                    if (var12.field99) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1062 != null && var22.field1062[var23] != null) {
                                                                this.field1511[this.field1390] = var22.field1062[var23] + " @lre@" + var22.field1047;
                                                                if (var23 == 3) {
                                                                    this.field1233[this.field1390] = 681;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field1233[this.field1390] = 100;
                                                                }
                                                                this.field1234[this.field1390] = var22.field1045;
                                                                this.field1231[this.field1390] = var17;
                                                                this.field1232[this.field1390] = var12.field76;
                                                                ++this.field1390;
                                                            } else if (var23 == 4) {
                                                                this.field1511[this.field1390] = "Drop @lre@" + var22.field1047;
                                                                this.field1233[this.field1390] = 100;
                                                                this.field1234[this.field1390] = var22.field1045;
                                                                this.field1231[this.field1390] = var17;
                                                                this.field1232[this.field1390] = var12.field76;
                                                                ++this.field1390;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field100) {
                                                        this.field1511[this.field1390] = "Use @lre@" + var22.field1047;
                                                        this.field1233[this.field1390] = 102;
                                                        this.field1234[this.field1390] = var22.field1045;
                                                        this.field1231[this.field1390] = var17;
                                                        this.field1232[this.field1390] = var12.field76;
                                                        ++this.field1390;
                                                    }
                                                    if (var12.field99 && var22.field1062 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1062[var24] != null) {
                                                                this.field1511[this.field1390] = var22.field1062[var24] + " @lre@" + var22.field1047;
                                                                if (var24 == 0) {
                                                                    this.field1233[this.field1390] = 694;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field1233[this.field1390] = 962;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field1233[this.field1390] = 795;
                                                                }
                                                                this.field1234[this.field1390] = var22.field1045;
                                                                this.field1231[this.field1390] = var17;
                                                                this.field1232[this.field1390] = var12.field76;
                                                                ++this.field1390;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field107 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field107[var25] != null) {
                                                                this.field1511[this.field1390] = var12.field107[var25] + " @lre@" + var22.field1047;
                                                                if (var25 == 0) {
                                                                    this.field1233[this.field1390] = 582;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field1233[this.field1390] = 113;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field1233[this.field1390] = 555;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field1233[this.field1390] = 331;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field1233[this.field1390] = 354;
                                                                }
                                                                this.field1234[this.field1390] = var22.field1045;
                                                                this.field1231[this.field1390] = var17;
                                                                this.field1232[this.field1390] = var12.field76;
                                                                ++this.field1390;
                                                            }
                                                        }
                                                    }
                                                    this.field1511[this.field1390] = "Examine @lre@" + var22.field1047;
                                                    this.field1233[this.field1390] = 1328;
                                                    this.field1234[this.field1390] = var22.field1045;
                                                    this.field1231[this.field1390] = var17;
                                                    this.field1232[this.field1390] = var12.field76;
                                                    ++this.field1390;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public final boolean method510(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1502[var15][var35] = 0;
                this.field1293[var15][var35] = 99999999;
            }
        }
        if (arg2 != -35517) {
            this.field1665 = this.field1416.method295();
        }
        int var16 = arg7;
        int var17 = arg0;
        this.field1502[arg7][arg0] = 99;
        this.field1293[arg7][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1464[var18] = arg7;
        int var36 = var18 + 1;
        this.field1465[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field1464.length;
        int[][] var22 = this.field1314[this.field1546].field1098;
        while (var36 != var19) {
            var16 = this.field1464[var19];
            var17 = this.field1465[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg10 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field1314[this.field1546].method368(arg1, arg10, arg8, (byte) -84, arg11 - 1, var17, var16)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field1314[this.field1546].method369(arg11 - 1, var17, arg10, arg8, -755, var16, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg9 != 0 && this.field1314[this.field1546].method370(arg9, arg8, (byte) -30, arg3, arg10, var16, var17, arg4)) {
                var20 = true;
                break;
            }
            int var34 = this.field1293[var16][var17] + 1;
            if (var16 > 0 && this.field1502[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1464[var36] = var16 - 1;
                this.field1465[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 - 1][var17] = 2;
                this.field1293[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1502[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1464[var36] = var16 + 1;
                this.field1465[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 + 1][var17] = 8;
                this.field1293[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1502[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1464[var36] = var16;
                this.field1465[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16][var17 - 1] = 1;
                this.field1293[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1502[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1464[var36] = var16;
                this.field1465[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16][var17 + 1] = 4;
                this.field1293[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1502[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1464[var36] = var16 - 1;
                this.field1465[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 - 1][var17 - 1] = 3;
                this.field1293[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1502[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1464[var36] = var16 + 1;
                this.field1465[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 + 1][var17 - 1] = 9;
                this.field1293[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1502[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1464[var36] = var16 - 1;
                this.field1465[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 - 1][var17 + 1] = 6;
                this.field1293[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1502[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1464[var36] = var16 + 1;
                this.field1465[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1502[var16 + 1][var17 + 1] = 12;
                this.field1293[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1593 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg10 - var24; var26 <= arg10 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1293[var25][var26] < var23) {
                                var23 = this.field1293[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1593 = 1;
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
        this.field1464[var27] = var16;
        int var37 = var27 + 1;
        this.field1465[var27] = var17;
        int var28;
        int var29 = var28 = this.field1502[var16][var17];
        while (arg7 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1464[var37] = var16;
                this.field1465[var37++] = var17;
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
            var29 = this.field1502[var16][var17];
        }
        if (var37 <= 0) {
            if (arg6 == 1) {
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
            int var31 = this.field1464[var37];
            int var32 = this.field1465[var37];
            if (arg6 == 0) {
                this.field1259.method218(this.field1236, 102);
                this.field1259.method219(var30 + var30 + 3);
            }
            if (arg6 == 1) {
                this.field1259.method218(this.field1236, 170);
                this.field1259.method219(var30 + var30 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field1259.method218(this.field1236, 15);
                this.field1259.method219(var30 + var30 + 3);
            }
            if (super.field34[5] == 1) {
                this.field1259.method219(1);
            } else {
                this.field1259.method219(0);
            }
            this.field1259.method220(this.field1320 + var31);
            this.field1259.method220(this.field1321 + var32);
            this.field1393 = this.field1464[0];
            this.field1394 = this.field1465[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1259.method219(this.field1464[var37] - var31);
                this.field1259.method219(this.field1465[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method511(String arg0) {
        System.out.println(arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        while (true) {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method512(byte arg0) {
        int var2 = this.field1434;
        int var3 = this.field1435;
        int var4 = this.field1436;
        int var5 = this.field1437;
        if (arg0 != 110) {
            this.field1289 = !this.field1289;
        }
        int var6 = 6116423;
        Pix2D.method157(var2, var4, var6, false, var3, var5);
        Pix2D.method157(var2 + 1, var4 - 2, 0, false, var3 + 1, 16);
        Pix2D.method158(var4 - 2, var3 + 18, var2 + 1, var5 - 19, 0, -585);
        this.field1382.method206("Choose Option", 1, var6, var3 + 14, var2 + 3);
        int var7 = super.field24;
        int var8 = super.field25;
        if (this.field1433 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1433 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1433 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1390; ++var9) {
            int var10 = (this.field1390 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1382.method210(var2 + 3, var11, this.field1511[var9], true, (byte) -108, var10);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)I")
    public final int method513(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field1658[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            if (arg0 != -93) {
                this.field1294 = null;
            }
            int var10 = (128 - var8) * this.field1249[var7][var5][var6] + this.field1249[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1249[var7][var5][var6 + 1] + this.field1249[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IZ)V")
    public final void method514(int arg0, boolean arg1) {
        int[] var3 = this.field1395.field662;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1658[arg0][var24][var6] & 24) == 0) {
                    this.field1614.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1658[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1614.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        if (arg1) {
            this.field1367 = !this.field1367;
        }
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1395.method181((byte) 4);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1658[arg0][var22][var9] & 24) == 0) {
                    this.method544(var22, 541, var8, var7, var9, arg0);
                }
                if (arg0 < 3 && (this.field1658[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method544(var22, 541, var8, var7, var9, arg0 + 1);
                }
            }
        }
        this.field1453.method258((byte) 4);
        this.field1357 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1614.method79(this.field1546, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method330(var13).field972;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1314[this.field1546].field1098;
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
                        this.field1488[this.field1357] = this.field1230[var14];
                        this.field1358[this.field1357] = var15;
                        this.field1359[this.field1357] = var16;
                        ++this.field1357;
                    }
                }
            }
        }
        ++field1396;
        if (field1396 > 112) {
            field1396 = 0;
            this.field1259.method218(this.field1236, 65);
            this.field1259.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLd;)V")
    public final void method515(byte arg0, Component arg1) {
        if (this.field1599 != arg0) {
            this.field1467 = this.field1534.method229();
        }
        int var3 = arg1.field80;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1346;
                if (this.field1347 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field112 = "";
                    arg1.field79 = 0;
                } else {
                    if (this.field1581[var3] == 0) {
                        arg1.field112 = "@red@Offline";
                    } else if (this.field1581[var3] == field1547) {
                        arg1.field112 = "@gre@World-" + (this.field1581[var3] - 9);
                    } else {
                        arg1.field112 = "@yel@World-" + (this.field1581[var3] - 9);
                    }
                    arg1.field79 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1346;
                if (this.field1347 != 2) {
                    var6 = 0;
                }
                arg1.field90 = var6 * 15 + 20;
                if (arg1.field90 <= arg1.field82) {
                    arg1.field90 = arg1.field82 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1347 == 0) {
                    arg1.field112 = "Loading ignore list";
                    arg1.field79 = 0;
                } else if (var3 == 1 && this.field1347 == 0) {
                    arg1.field112 = "Please wait...";
                    arg1.field79 = 0;
                } else {
                    int var7 = this.field1512;
                    if (this.field1347 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field112 = "";
                        arg1.field79 = 0;
                    } else {
                        arg1.field112 = JString.method304(JString.method301(this.field1677[var3], false), 789);
                        arg1.field79 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field90 = this.field1512 * 15 + 20;
                if (arg1.field90 <= arg1.field82) {
                    arg1.field90 = arg1.field82 + 1;
                }
            } else if (var3 == 327) {
                arg1.field127 = 150;
                arg1.field128 = (int) (Math.sin((double) field1275 / 40.0D) * 256.0D) & 2047;
                if (this.field1417) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field1494[var8];
                        if (var15 >= 0 && !IdkType.field1116[var15].method377(false)) {
                            return;
                        }
                    }
                    this.field1417 = false;
                    Model[] var9 = new Model[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field1494[var11];
                        if (var14 >= 0) {
                            var9[var10++] = IdkType.field1116[var14].method378(false);
                        }
                    }
                    Model var12 = new Model((byte) 2, var9, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field1530[var13] != 0) {
                            var12.method140(field1591[var13][0], field1591[var13][this.field1530[var13]]);
                            if (var13 == 1) {
                                var12.method140(field1669[0], field1669[this.field1530[var13]]);
                            }
                        }
                    }
                    var12.method133(false);
                    var12.method134(2, SeqType.field1135[field1374.field402].field1137[0]);
                    var12.method143(64, 850, -30, -50, -30, true);
                    arg1.field120 = 5;
                    arg1.field121 = 0;
                    Component.method36(0, 5, -3938, var12);
                }
            } else if (var3 == 324) {
                if (this.field1263 == null) {
                    this.field1263 = arg1.field118;
                    this.field1264 = arg1.field119;
                }
                if (this.field1569) {
                    arg1.field118 = this.field1264;
                } else {
                    arg1.field118 = this.field1263;
                }
            } else if (var3 == 325) {
                if (this.field1263 == null) {
                    this.field1263 = arg1.field118;
                    this.field1264 = arg1.field119;
                }
                if (this.field1569) {
                    arg1.field118 = this.field1263;
                } else {
                    arg1.field118 = this.field1264;
                }
            } else if (var3 == 600) {
                arg1.field112 = this.field1361;
                if (field1275 % 20 < 10) {
                    arg1.field112 = arg1.field112 + "|";
                } else {
                    arg1.field112 = arg1.field112 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1432 >= 1) {
                        if (this.field1471) {
                            arg1.field114 = 16711680;
                            arg1.field112 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field114 = 16777215;
                            arg1.field112 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field112 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1571 != 0) {
                        String var16;
                        if (this.field1643 == 0) {
                            var16 = "earlier today";
                        } else if (this.field1643 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field1643 + " days ago";
                        }
                        arg1.field112 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field112 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1523 == 0) {
                        arg1.field112 = "0 unread messages";
                        arg1.field114 = 16776960;
                    }
                    if (this.field1523 == 1) {
                        arg1.field112 = "1 unread message";
                        arg1.field114 = 65280;
                    }
                    if (this.field1523 > 1) {
                        arg1.field112 = this.field1523 + " unread messages";
                        arg1.field114 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1392 == 201) {
                        if (this.field1261 == 1) {
                            arg1.field112 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field112 = "";
                        }
                    } else if (this.field1392 == 200) {
                        arg1.field112 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field1392 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field1392 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field1392 + " days ago";
                        }
                        arg1.field112 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1392 == 201) {
                        if (this.field1261 == 1) {
                            arg1.field112 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field112 = "";
                        }
                    } else if (this.field1392 == 200) {
                        arg1.field112 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field112 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1392 == 201) {
                        if (this.field1261 == 1) {
                            arg1.field112 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field112 = "";
                        }
                    } else if (this.field1392 == 200) {
                        arg1.field112 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field112 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1347 == 0) {
            arg1.field112 = "Loading friend list";
            arg1.field79 = 0;
        } else if (var3 == 1 && this.field1347 == 1) {
            arg1.field112 = "Connecting to friendserver";
            arg1.field79 = 0;
        } else if (var3 == 2 && this.field1347 != 2) {
            arg1.field112 = "Please wait...";
            arg1.field79 = 0;
        } else {
            int var4 = this.field1346;
            if (this.field1347 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field112 = "";
                arg1.field79 = 0;
            } else {
                arg1.field112 = this.field1271[var3];
                arg1.field79 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method516(int arg0, int arg1) {
        LinkList var3 = this.field1294[this.field1546][arg0][arg1];
        if (var3 == null) {
            this.field1614.method71(this.field1546, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250((byte) 8)) {
                ObjType var11 = ObjType.method348(var6.field500);
                int var12 = var11.field1059;
                if (var11.field1058) {
                    var12 = (var6.field501 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(7, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250((byte) 8)) {
                if (var5.field500 != var9.field500 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field500 != var9.field500 && var7.field500 != var9.field500 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1614.method57(var5, var10, this.method513(this.field1592, this.field1546, arg0 * 128 + 64, arg1 * 128 + 64), var7, arg0, arg1, 280, this.field1546, var8);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(III)Z")
    public final boolean method517(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field71[arg2];
        for (int var6 = 0; var6 < var5.field93.length && var5.field93[var6] != -1; ++var6) {
            Component var7 = Component.field71[var5.field93[var6]];
            if (var7.field78 == 1) {
                var4 |= this.method517(0, arg1, var7.field76);
            }
            if (var7.field78 == 6 && (var7.field124 != -1 || var7.field125 != -1)) {
                boolean var8 = this.method495((byte) 67, var7);
                int var9;
                if (var8) {
                    var9 = var7.field125;
                } else {
                    var9 = var7.field124;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1135[var9];
                    var7.field75 += arg1;
                    while (var7.field75 > var10.method382(var7.field74, 0)) {
                        var7.field75 -= var10.method382(var7.field74, 0) + 1;
                        ++var7.field74;
                        if (var7.field74 >= var10.field1136) {
                            var7.field74 -= var10.field1140;
                            if (var7.field74 < 0 || var7.field74 >= var10.field1136) {
                                var7.field74 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field1369 = this.field1416.method295();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method518(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1346 >= 100 && this.field1579 != 1) {
                this.method519(true, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field1346 >= 200) {
                this.method519(true, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = JString.method304(JString.method301(arg0, false), 789);
                if (!arg1) {
                    this.field1467 = this.field1534.method229();
                }
                for (int var5 = 0; var5 < this.field1346; ++var5) {
                    if (this.field1295[var5] == arg0) {
                        this.method519(true, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1512; ++var6) {
                    if (this.field1677[var6] == arg0) {
                        this.method519(true, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field1374.field460)) {
                    this.field1271[this.field1346] = var4;
                    this.field1295[this.field1346] = arg0;
                    this.field1581[this.field1346] = 0;
                    ++this.field1346;
                    this.field1327 = true;
                    this.field1259.method218(this.field1236, 72);
                    this.field1259.method225(arg0, this.field1641);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
    public final void method519(boolean arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1336 != -1) {
            this.field1337 = arg2;
            super.field30 = 0;
        }
        if (this.field1345 == -1) {
            this.field1574 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1371[var5] = this.field1371[var5 - 1];
            this.field1372[var5] = this.field1372[var5 - 1];
            this.field1373[var5] = this.field1373[var5 - 1];
        }
        if (!arg0) {
            this.field1294 = null;
        }
        this.field1371[0] = arg1;
        this.field1372[0] = arg3;
        this.field1373[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public static final void method520(int arg0) {
        World3D.field285 = false;
        Pix3D.field634 = false;
        field1550 = false;
        World.field44 = false;
        if (arg0 >= 0) {
            field1268 = !field1268;
        }
        LocType.field945 = false;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    private final void method521(int arg0) {
        LocSpawned var2 = (LocSpawned) this.field1399.method248();
        if (arg0 != 6831) {
            this.field1467 = -1;
        }
        while (var2 != null) {
            if (var2.field740 == -1) {
                var2.field739 = 0;
                this.method463(this.field1531, var2);
            } else {
                var2.method106();
            }
            var2 = (LocSpawned) this.field1399.method250((byte) 8);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILib;I)V")
    public final void method522(byte arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 == -85) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field1611 + this.field1442 & 2047;
                int var7 = Model.field604[var6];
                int var8 = Model.field605[var6];
                int var9 = var7 * 256 / (this.field1269 + 256);
                int var10 = var8 * 256 / (this.field1269 + 256);
                int var11 = arg1 * var9 + arg3 * var10 >> 16;
                int var12 = arg1 * var10 - arg3 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field1365.method191(15, 15, 256, var15 + 94 + 4 - 10, 83 - var16 - 20, 20, -940, 20, var13);
            } else {
                this.method500(arg2, arg3, (byte) 4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method523(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JZ)V")
    public final void method524(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1512 >= 100) {
                this.method519(true, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = JString.method304(JString.method301(arg0, false), 789);
                for (int var5 = 0; var5 < this.field1512; ++var5) {
                    if (this.field1677[var5] == arg0) {
                        this.method519(true, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                if (!arg1) {
                    field1360 = this.field1416.method295();
                }
                for (int var6 = 0; var6 < this.field1346; ++var6) {
                    if (this.field1295[var6] == arg0) {
                        this.method519(true, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field1677[this.field1512++] = arg0;
                this.field1327 = true;
                this.field1259.method218(this.field1236, 131);
                this.field1259.method225(arg0, this.field1641);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method525(Component arg0, boolean arg1) {
        this.field1602 &= arg1;
        int var3 = arg0.field80;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1511[this.field1390] = "Remove @whi@" + arg0.field112;
                this.field1233[this.field1390] = 884;
                ++this.field1390;
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
            this.field1511[this.field1390] = "Remove @whi@" + this.field1271[var3];
            this.field1233[this.field1390] = 513;
            ++this.field1390;
            this.field1511[this.field1390] = "Message @whi@" + this.field1271[var3];
            this.field1233[this.field1390] = 902;
            ++this.field1390;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method526(byte arg0) {
        if (this.field1470 > 0) {
            this.method450(false);
        } else {
            this.field1453.method258((byte) 4);
            this.field1381.method202("Connection lost", this.field1307, 144, 0, 257);
            this.field1381.method202("Connection lost", this.field1307, 143, 16777215, 256);
            this.field1381.method202("Please wait - attempting to reestablish", this.field1307, 159, 0, 257);
            this.field1381.method202("Please wait - attempting to reestablish", this.field1307, 158, 16777215, 256);
            this.field1453.method259(super.field16, 4, 4, (byte) 8);
            this.field1401 = 0;
            this.field1393 = 0;
            ClientStream var2 = this.field1370;
            this.field1602 = false;
            if (arg0 == 3) {
                boolean var3 = false;
            } else {
                field1360 = this.field1416.method295();
            }
            this.field1262 = 0;
            this.method553(this.field1654, this.field1655, true);
            if (!this.field1602) {
                this.method450(false);
            }
            try {
                var2.method38();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 303);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1547 = Integer.parseInt(arg0[0]);
                field1548 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method478((byte) 0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method520(-394);
                }
                if (arg0[3].equals("free")) {
                    field1549 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1549 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(0, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILgc;)V")
    public final void method527(int arg0, boolean arg1, int arg2, int arg3, NpcType arg4) {
        if (this.field1390 < 400) {
            if (arg4.field1032 != null) {
                arg4 = arg4.method345((byte) 8);
            }
            if (arg4 != null) {
                String var6 = arg4.field1007;
                if (arg1) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                if (arg4.field1024 != 0) {
                    var6 = var6 + method439(field1374.field466, 1, arg4.field1024) + " (level-" + arg4.field1024 + ")";
                }
                if (this.field1425 == 1) {
                    this.field1511[this.field1390] = "Use " + this.field1429 + " with @yel@" + var6;
                    this.field1233[this.field1390] = 829;
                    this.field1234[this.field1390] = arg0;
                    this.field1231[this.field1390] = arg3;
                    this.field1232[this.field1390] = arg2;
                    ++this.field1390;
                } else {
                    if (this.field1645 == 1) {
                        if ((this.field1647 & 2) == 2) {
                            this.field1511[this.field1390] = this.field1648 + " @yel@" + var6;
                            this.field1233[this.field1390] = 240;
                            this.field1234[this.field1390] = arg0;
                            this.field1231[this.field1390] = arg3;
                            this.field1232[this.field1390] = arg2;
                            ++this.field1390;
                            return;
                        }
                    } else {
                        if (arg4.field1019 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg4.field1019[var8] != null && !arg4.field1019[var8].equalsIgnoreCase("attack")) {
                                    this.field1511[this.field1390] = arg4.field1019[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1233[this.field1390] = 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1233[this.field1390] = 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1233[this.field1390] = 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1233[this.field1390] = 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1233[this.field1390] = 793;
                                    }
                                    this.field1234[this.field1390] = arg0;
                                    this.field1231[this.field1390] = arg3;
                                    this.field1232[this.field1390] = arg2;
                                    ++this.field1390;
                                }
                            }
                        }
                        if (arg4.field1019 != null) {
                            for (int var9 = 4; var9 >= 0; --var9) {
                                if (arg4.field1019[var9] != null && arg4.field1019[var9].equalsIgnoreCase("attack")) {
                                    short var10 = 0;
                                    if (arg4.field1024 > field1374.field466) {
                                        var10 = 2000;
                                    }
                                    this.field1511[this.field1390] = arg4.field1019[var9] + " @yel@" + var6;
                                    if (var9 == 0) {
                                        this.field1233[this.field1390] = var10 + 242;
                                    }
                                    if (var9 == 1) {
                                        this.field1233[this.field1390] = var10 + 209;
                                    }
                                    if (var9 == 2) {
                                        this.field1233[this.field1390] = var10 + 309;
                                    }
                                    if (var9 == 3) {
                                        this.field1233[this.field1390] = var10 + 852;
                                    }
                                    if (var9 == 4) {
                                        this.field1233[this.field1390] = var10 + 793;
                                    }
                                    this.field1234[this.field1390] = arg0;
                                    this.field1231[this.field1390] = arg3;
                                    this.field1232[this.field1390] = arg2;
                                    ++this.field1390;
                                }
                            }
                        }
                        this.field1511[this.field1390] = "Examine @yel@" + var6;
                        this.field1233[this.field1390] = 1714;
                        this.field1234[this.field1390] = arg0;
                        this.field1231[this.field1390] = arg3;
                        this.field1232[this.field1390] = arg2;
                        ++this.field1390;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIII)V")
    public final void method528(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1490.method199(true, arg4, arg1);
        this.field1491.method199(true, arg4, arg1 + arg5 - 16);
        Pix2D.method157(arg4, 16, this.field1388, false, arg1 + 16, arg5 - 32);
        int var7 = (arg5 - 32) * arg5 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg3 / (arg2 - arg5);
        Pix2D.method157(arg4, 16, this.field1281, false, arg1 + 16 + var8, var7);
        if (arg0 != 2) {
            this.field1467 = -1;
        }
        Pix2D.method162(arg4, this.field1362, var7, arg1 + 16 + var8, 476);
        Pix2D.method162(arg4 + 1, this.field1362, var7, arg1 + 16 + var8, 476);
        Pix2D.method160(this.field1362, 16, false, arg4, arg1 + 16 + var8);
        Pix2D.method160(this.field1362, 16, false, arg4, arg1 + 17 + var8);
        Pix2D.method162(arg4 + 15, this.field1286, var7, arg1 + 16 + var8, 476);
        Pix2D.method162(arg4 + 14, this.field1286, var7 - 1, arg1 + 17 + var8, 476);
        Pix2D.method160(this.field1286, 16, false, arg4, arg1 + 15 + var8 + var7);
        Pix2D.method160(this.field1286, 15, false, arg4 + 1, arg1 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method529(boolean arg0) {
        if (arg0) {
            for (int var2 = -1; var2 < this.field1622; ++var2) {
                int var3;
                if (var2 == -1) {
                    var3 = this.field1620;
                } else {
                    var3 = this.field1623[var2];
                }
                PlayerEntity var4 = this.field1621[var3];
                if (var4 != null) {
                    this.method480(1, var4, (byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method530(int arg0) {
        if (this.field1291 != 0) {
            PixFont var2 = this.field1381;
            int var3 = 0;
            if (this.field1301 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1373[var4] != null) {
                    int var5 = this.field1371[var4];
                    String var6 = this.field1372[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1414 == 0 || this.field1414 == 1 && this.method445(true, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method206("From", 1, 0, var8, var9);
                        var2.method206("From", 1, 65535, var8 - 1, var9);
                        int var10 = var9 + var2.method204((byte) 5, "From ");
                        if (var7 == 1) {
                            this.field1237[0].method199(true, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1237[1].method199(true, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method206(var6 + ": " + this.field1373[var4], 1, 0, var8, var10);
                        var2.method206(var6 + ": " + this.field1373[var4], 1, 65535, var8 - 1, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1414 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method206(this.field1373[var4], 1, 0, var11, 4);
                        var2.method206(this.field1373[var4], 1, 65535, var11 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1414 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method206("To " + var6 + ": " + this.field1373[var4], 1, 0, var12, 4);
                        var2.method206("To " + var6 + ": " + this.field1373[var4], 1, 65535, var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 9734) {
                this.field1289 = !this.field1289;
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method531(int arg0) {
        Graphics var2 = this.method11(-914).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 == -21285) {
            this.method4(1, false);
            if (this.field1260) {
                this.field1664 = false;
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
            if (this.field1349) {
                this.field1664 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field1386) {
                this.field1664 = false;
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
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BIII)I")
    public final int method532(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (arg0 == 0) {
            boolean var6 = false;
        } else {
            this.field1259.method219(61);
        }
        return ((arg1 & 16711935) * arg2 + (arg3 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg2 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method533(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1422 == 0) {
            int var3 = super.field30;
            if (this.field1645 == 1 && super.field31 >= 516 && super.field32 >= 160 && super.field31 <= 765 && super.field32 <= 205) {
                var3 = 0;
            }
            if (this.field1584) {
                if (var3 != 1) {
                    int var4 = super.field24;
                    int var5 = super.field25;
                    if (this.field1433 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field1433 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field1433 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field1434 - 10 || var4 > this.field1436 + this.field1434 + 10 || var5 < this.field1435 - 10 || var5 > this.field1437 + this.field1435 + 10) {
                        this.field1584 = false;
                        if (this.field1433 == 1) {
                            this.field1327 = true;
                        }
                        if (this.field1433 == 2) {
                            this.field1574 = true;
                        }
                    }
                }
                if (var3 == 1) {
                    int var6 = this.field1434;
                    int var7 = this.field1435;
                    int var8 = this.field1436;
                    int var9 = super.field31;
                    int var10 = super.field32;
                    if (this.field1433 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field1433 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field1433 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1390; ++var12) {
                        int var13 = (this.field1390 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method442(var11, true);
                    }
                    this.field1584 = false;
                    if (this.field1433 == 1) {
                        this.field1327 = true;
                    }
                    if (this.field1433 == 2) {
                        this.field1574 = true;
                        return;
                    }
                }
            } else {
                if (var3 == 1 && this.field1390 > 0) {
                    int var14 = this.field1233[this.field1390 - 1];
                    if (var14 == 582 || var14 == 113 || var14 == 555 || var14 == 331 || var14 == 354 || var14 == 694 || var14 == 962 || var14 == 795 || var14 == 681 || var14 == 100 || var14 == 102 || var14 == 1328) {
                        int var15 = this.field1231[this.field1390 - 1];
                        int var16 = this.field1232[this.field1390 - 1];
                        Component var17 = Component.field71[var16];
                        if (var17.field98 || var17.field101) {
                            this.field1355 = false;
                            this.field1524 = 0;
                            this.field1420 = var16;
                            this.field1421 = var15;
                            this.field1422 = 2;
                            this.field1423 = super.field31;
                            this.field1424 = super.field32;
                            if (Component.field71[var16].field77 == this.field1226) {
                                this.field1422 = 1;
                            }
                            if (Component.field71[var16].field77 == this.field1345) {
                                this.field1422 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var3 == 1 && (this.field1430 == 1 || this.method542(this.field1456, this.field1390 - 1)) && this.field1390 > 2) {
                    var3 = 2;
                }
                if (var3 == 1 && this.field1390 > 0) {
                    this.method442(this.field1390 - 1, true);
                }
                if (var3 != 2 || this.field1390 <= 0) {
                    return;
                }
                this.method490(5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method534(boolean arg0) {
        if (arg0) {
            this.field1294 = null;
        }
        this.field1312 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1664) {
                ++this.field1497;
                this.method505(243);
                this.method505(243);
                this.method446(true);
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
        this.field1312 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;II)I")
    public final int method535(Component arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1310 = this.field1416.method295();
        }
        if (arg0.field86 != null && arg1 < arg0.field86.length) {
            try {
                int[] var4 = arg0.field86[arg1];
                int var5 = 0;
                int var6 = 0;
                byte var7 = 0;
                while (true) {
                    int var8 = var4[var6++];
                    int var9 = 0;
                    byte var10 = 0;
                    if (var8 == 0) {
                        return var5;
                    }
                    if (var8 == 1) {
                        var9 = this.field1274[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1582[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1473[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field71[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1039 && (!ObjType.method348(var12).field1060 || field1549)) {
                            for (int var13 = 0; var13 < var11.field72.length; ++var13) {
                                if (var12 + 1 == var11.field72[var13]) {
                                    var9 += var11.field73[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1227[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1506[this.field1582[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1227[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1374.field466;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1152; ++var14) {
                            if (Stats.field1154[var14]) {
                                var9 += this.field1582[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field71[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1039 && (!ObjType.method348(var16).field1060 || field1549)) {
                            for (int var17 = 0; var17 < var15.field72.length; ++var17) {
                                if (var15.field72[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1356;
                    }
                    if (var8 == 12) {
                        var9 = this.field1285;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1227[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1172[var20];
                        int var22 = var21.field1174;
                        int var23 = var21.field1175;
                        int var24 = var21.field1176;
                        int var25 = field1520[var24 - var23];
                        var9 = this.field1227[var22] >> var23 & var25;
                    }
                    if (var8 == 15) {
                        var10 = 1;
                    }
                    if (var8 == 16) {
                        var10 = 2;
                    }
                    if (var8 == 17) {
                        var10 = 3;
                    }
                    if (var8 == 18) {
                        var9 = (field1374.field397 >> 7) + this.field1320;
                    }
                    if (var8 == 19) {
                        var9 = (field1374.field398 >> 7) + this.field1321;
                    }
                    if (var8 == 20) {
                        var9 = var4[var6++];
                    }
                    if (var10 == 0) {
                        if (var7 == 0) {
                            var5 += var9;
                        }
                        if (var7 == 1) {
                            var5 -= var9;
                        }
                        if (var7 == 2 && var9 != 0) {
                            var5 /= var9;
                        }
                        if (var7 == 3) {
                            var5 *= var9;
                        }
                        var7 = 0;
                    } else {
                        var7 = var10;
                    }
                }
            } catch (Exception var26) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method536(int arg0) {
        if (arg0 == 3) {
            this.field1259.method218(this.field1236, 153);
            if (this.field1214 != -1) {
                this.field1214 = -1;
                this.field1327 = true;
                this.field1672 = false;
                this.field1597 = true;
            }
            if (this.field1345 != -1) {
                this.field1345 = -1;
                this.field1574 = true;
                this.field1672 = false;
            }
            this.field1226 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILab;III)V")
    public final void method537(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (field1374 != arg1) {
            if (this.field1390 < 400) {
                String var6;
                if (arg1.field467 == 0) {
                    var6 = arg1.field460 + method439(field1374.field466, 1, arg1.field466) + " (level-" + arg1.field466 + ")";
                } else {
                    var6 = arg1.field460 + " (skill-" + arg1.field467 + ")";
                }
                if (this.field1425 == 1) {
                    this.field1511[this.field1390] = "Use " + this.field1429 + " with @whi@" + var6;
                    this.field1233[this.field1390] = 275;
                    this.field1234[this.field1390] = arg0;
                    this.field1231[this.field1390] = arg3;
                    this.field1232[this.field1390] = arg2;
                    ++this.field1390;
                } else if (this.field1645 == 1) {
                    if ((this.field1647 & 8) == 8) {
                        this.field1511[this.field1390] = this.field1648 + " @whi@" + var6;
                        this.field1233[this.field1390] = 131;
                        this.field1234[this.field1390] = arg0;
                        this.field1231[this.field1390] = arg3;
                        this.field1232[this.field1390] = arg2;
                        ++this.field1390;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1279[var7] != null) {
                            this.field1511[this.field1390] = this.field1279[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1279[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field466 > field1374.field466) {
                                    var9 = 2000;
                                }
                                if (field1374.field483 != 0 && arg1.field483 != 0) {
                                    if (field1374.field483 == arg1.field483) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1280[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1233[this.field1390] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1233[this.field1390] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1233[this.field1390] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1233[this.field1390] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1233[this.field1390] = var9 + 185;
                            }
                            this.field1234[this.field1390] = arg0;
                            this.field1231[this.field1390] = arg3;
                            this.field1232[this.field1390] = arg2;
                            ++this.field1390;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1390; ++var8) {
                    if (this.field1233[var8] == 718) {
                        this.field1511[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                this.field1466 += arg4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method538(boolean arg0, int arg1) {
        this.method539((byte) 112);
        this.field1479.method258((byte) 4);
        this.field1458.method199(true, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg1 >= 0) {
            this.method6();
        }
        if (this.field1278 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1380.method203(var3 / 2, 7711145, this.field1266.field836, (byte) 114, var5, true);
            int var6 = var4 / 2 - 20;
            this.field1382.method203(var3 / 2, 16776960, "Welcome to RuneScape", (byte) 114, var6, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1459.method199(true, var7 - 73, var8 - 20);
            this.field1382.method203(var7, 16777215, "New User", (byte) 114, var8 + 5, true);
            int var9 = var3 / 2 + 80;
            this.field1459.method199(true, var9 - 73, var8 - 20);
            this.field1382.method203(var9, 16777215, "Existing User", (byte) 114, var8 + 5, true);
        }
        if (this.field1278 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1603.length() > 0) {
                this.field1382.method203(var3 / 2, 16776960, this.field1603, (byte) 114, var10 - 15, true);
                this.field1382.method203(var3 / 2, 16776960, this.field1604, (byte) 114, var10, true);
                var10 += 30;
            } else {
                this.field1382.method203(var3 / 2, 16776960, this.field1604, (byte) 114, var10 - 7, true);
                var10 += 30;
            }
            this.field1382.method210(var3 / 2 - 90, 16777215, "Username: " + this.field1654 + (this.field1543 == 0 & field1275 % 40 < 20 ? "@yel@|" : ""), true, (byte) -108, var10);
            var10 += 15;
            this.field1382.method210(var3 / 2 - 88, 16777215, "Password: " + JString.method305(this.field1655, false) + (this.field1543 == 1 & field1275 % 40 < 20 ? "@yel@|" : ""), true, (byte) -108, var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1459.method199(true, var11 - 73, var12 - 20);
                this.field1382.method203(var11, 16777215, "Login", (byte) 114, var12 + 5, true);
                int var13 = var3 / 2 + 80;
                this.field1459.method199(true, var13 - 73, var12 - 20);
                this.field1382.method203(var13, 16777215, "Cancel", (byte) 114, var12 + 5, true);
            }
        }
        if (this.field1278 == 3) {
            this.field1382.method203(var3 / 2, 16776960, "Create a free account", (byte) 114, var4 / 2 - 60, true);
            int var14 = var4 / 2 - 35;
            this.field1382.method203(var3 / 2, 16777215, "To create a new account you need to", (byte) 114, var14, true);
            int var18 = var14 + 15;
            this.field1382.method203(var3 / 2, 16777215, "go back to the main RuneScape webpage", (byte) 114, var18, true);
            int var19 = var18 + 15;
            this.field1382.method203(var3 / 2, 16777215, "and choose the red 'create account'", (byte) 114, var19, true);
            int var20 = var19 + 15;
            this.field1382.method203(var3 / 2, 16777215, "button at the top right of that page.", (byte) 114, var20, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1459.method199(true, var15 - 73, var16 - 20);
            this.field1382.method203(var15, 16777215, "Cancel", (byte) 114, var16 + 5, true);
        }
        this.field1479.method259(super.field16, 171, 202, (byte) 8);
        if (this.field1364) {
            this.field1364 = false;
            this.field1477.method259(super.field16, 0, 128, (byte) 8);
            this.field1478.method259(super.field16, 371, 202, (byte) 8);
            this.field1482.method259(super.field16, 265, 0, (byte) 8);
            this.field1483.method259(super.field16, 265, 562, (byte) 8);
            this.field1484.method259(super.field16, 171, 128, (byte) 8);
            this.field1485.method259(super.field16, 171, 562, (byte) 8);
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method539(byte arg0) {
        if (this.field1477 == null) {
            super.field17 = null;
            this.field1454 = null;
            this.field1452 = null;
            if (arg0 != 112) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field1451 = null;
            this.field1453 = null;
            this.field1537 = null;
            this.field1538 = null;
            this.field1539 = null;
            this.field1480 = new PixMap(128, 5, 265, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1481 = new PixMap(128, 5, 265, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1477 = new PixMap(509, 5, 171, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1478 = new PixMap(360, 5, 132, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1479 = new PixMap(360, 5, 200, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1482 = new PixMap(202, 5, 238, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1483 = new PixMap(203, 5, 238, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1484 = new PixMap(74, 5, 94, this.method11(-914));
            Pix2D.method155(this.field1289);
            this.field1485 = new PixMap(75, 5, 94, this.method11(-914));
            Pix2D.method155(this.field1289);
            if (this.field1570 != null) {
                this.method470(true);
                this.method441(-13665);
            }
            this.field1364 = true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method540(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1467 = -1;
        }
        if (this.field1272 == 2) {
            this.method492((this.field1409 - this.field1321 << 7) + this.field1412, (this.field1408 - this.field1320 << 7) + this.field1411, 265, this.field1410 * 2);
            if (this.field1605 > -1 && field1275 % 20 < 10) {
                this.field1492[2].method186(true, this.field1605 - 12, this.field1606 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method541(int arg0) {
        LocType.field989.method103();
        LocType.field990.method103();
        NpcType.field1035.method103();
        ObjType.field1085.method103();
        ObjType.field1086.method103();
        int var2 = 88 / arg0;
        PlayerEntity.field484.method103();
        SpotAnimType.field1169.method103();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Z")
    public final boolean method542(int arg0, int arg1) {
        this.field1466 += arg0;
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1233[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method543(boolean arg0) {
        int var2 = this.field1296 * 128 + 64;
        int var3 = this.field1297 * 128 + 64;
        int var4 = this.method513(this.field1592, this.field1546, var2, var3) - this.field1298;
        if (this.field1331 < var2) {
            this.field1331 += (var2 - this.field1331) * this.field1300 / 1000 + this.field1299;
            if (this.field1331 > var2) {
                this.field1331 = var2;
            }
        }
        if (this.field1331 > var2) {
            this.field1331 -= (this.field1331 - var2) * this.field1300 / 1000 + this.field1299;
            if (this.field1331 < var2) {
                this.field1331 = var2;
            }
        }
        if (this.field1332 < var4) {
            this.field1332 += (var4 - this.field1332) * this.field1300 / 1000 + this.field1299;
            if (this.field1332 > var4) {
                this.field1332 = var4;
            }
        }
        if (this.field1332 > var4) {
            this.field1332 -= (this.field1332 - var4) * this.field1300 / 1000 + this.field1299;
            if (this.field1332 < var4) {
                this.field1332 = var4;
            }
        }
        if (this.field1333 < var3) {
            this.field1333 += (var3 - this.field1333) * this.field1300 / 1000 + this.field1299;
            if (this.field1333 > var3) {
                this.field1333 = var3;
            }
        }
        if (this.field1333 > var3) {
            this.field1333 -= (this.field1333 - var3) * this.field1300 / 1000 + this.field1299;
            if (this.field1333 < var3) {
                this.field1333 = var3;
            }
        }
        int var5 = this.field1634 * 128 + 64;
        int var6 = this.field1635 * 128 + 64;
        int var7 = this.method513(this.field1592, this.field1546, var5, var6) - this.field1636;
        int var8 = var5 - this.field1331;
        int var9 = var7 - this.field1332;
        int var10 = var6 - this.field1333;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        if (arg0) {
            this.field1294 = null;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1334 < var12) {
            this.field1334 += (var12 - this.field1334) * this.field1638 / 1000 + this.field1637;
            if (this.field1334 > var12) {
                this.field1334 = var12;
            }
        }
        if (this.field1334 > var12) {
            this.field1334 -= (this.field1334 - var12) * this.field1638 / 1000 + this.field1637;
            if (this.field1334 < var12) {
                this.field1334 = var12;
            }
        }
        int var14 = var13 - this.field1335;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1335 += this.field1638 * var14 / 1000 + this.field1637;
            this.field1335 &= 2047;
        }
        if (var14 < 0) {
            this.field1335 -= -var14 * this.field1638 / 1000 + this.field1637;
            this.field1335 &= 2047;
        }
        int var15 = var13 - this.field1335;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1335 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1386 && !this.field1260 && !this.field1349) {
            ++field1309;
            if (arg0 < 0) {
                if (!this.field1602) {
                    this.method538(false, -810);
                } else {
                    this.method486(this.field1514);
                }
                this.field1601 = 0;
            }
        } else {
            this.method531(-21285);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1614.method76(arg5, arg0, arg4);
        if (var7 != 0) {
            int var8 = this.field1614.method80(arg5, arg0, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field1395.field662;
            int var13 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field973 != -1) {
                Pix8 var16 = this.field1510[var15.field973];
                if (var16 != null) {
                    int var17 = (var15.field959 * 4 - var16.field678) / 2;
                    int var18 = (var15.field960 * 4 - var16.field679) / 2;
                    var16.method199(true, arg0 * 4 + 48 + var17, (104 - arg4 - var15.field960) * 4 + 48 + var18);
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
        int var19 = this.field1614.method78(arg5, arg0, arg4);
        if (arg1 <= 0) {
            this.field1467 = this.field1534.method229();
        }
        if (var19 != 0) {
            int var20 = this.field1614.method80(arg5, arg0, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field973 != -1) {
                Pix8 var25 = this.field1510[var24.field973];
                if (var25 != null) {
                    int var26 = (var24.field959 * 4 - var25.field678) / 2;
                    int var27 = (var24.field960 * 4 - var25.field679) / 2;
                    var25.method199(true, arg0 * 4 + 48 + var26, (104 - arg4 - var24.field960) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1395.field662;
                int var30 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field1614.method79(arg5, arg0, arg4);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field973 != -1) {
                Pix8 var34 = this.field1510[var33.field973];
                if (var34 != null) {
                    int var35 = (var33.field959 * 4 - var34.field678) / 2;
                    int var36 = (var33.field960 * 4 - var34.field679) / 2;
                    var34.method199(true, arg0 * 4 + 48 + var35, (104 - arg4 - var33.field960) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method13(String arg0, int arg1, int arg2) {
        this.field1235 = arg2;
        this.field1518 = arg0;
        this.method539((byte) 112);
        if (this.field1570 == null) {
            super.method13(arg0, -761, arg2);
        } else {
            this.field1479.method258((byte) 4);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1382.method202("RuneScape is loading - please wait...", this.field1307, var5 / 2 - 26 - var6, 16777215, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(304, var7, var4 / 2 - 152, 34, 9179409, -585);
            Pix2D.method158(302, var7 + 1, var4 / 2 - 151, 32, 0, -585);
            Pix2D.method157(var4 / 2 - 150, arg2 * 3, 9179409, false, var7 + 2, 30);
            Pix2D.method157(arg2 * 3 + (var4 / 2 - 150), 300 - arg2 * 3, 0, false, var7 + 2, 30);
            while (arg1 >= 0) {
                this.field1467 = -1;
            }
            this.field1382.method202(arg0, this.field1307, var5 / 2 + 5 - var6, 16777215, var4 / 2);
            this.field1479.method259(super.field16, 171, 202, (byte) 8);
            if (this.field1364) {
                this.field1364 = false;
                if (!this.field1664) {
                    this.field1480.method259(super.field16, 0, 0, (byte) 8);
                    this.field1481.method259(super.field16, 0, 637, (byte) 8);
                }
                this.field1477.method259(super.field16, 0, 128, (byte) 8);
                this.field1478.method259(super.field16, 371, 202, (byte) 8);
                this.field1482.method259(super.field16, 265, 0, (byte) 8);
                this.field1483.method259(super.field16, 265, 562, (byte) 8);
                this.field1484.method259(super.field16, 171, 128, (byte) 8);
                this.field1485.method259(super.field16, 171, 562, (byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method545(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method546(int arg0) {
        if (this.field1390 >= 2 || this.field1425 != 0 || this.field1645 != 0) {
            String var2;
            if (this.field1425 == 1 && this.field1390 < 2) {
                var2 = "Use " + this.field1429 + " with...";
            } else if (this.field1645 == 1 && this.field1390 < 2) {
                var2 = this.field1648 + "...";
            } else {
                var2 = this.field1511[this.field1390 - 1];
            }
            if (this.field1390 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1390 - 2) + " more options";
            }
            this.field1382.method211(true, 15, 16777215, var2, field1275 / 1000, true, 4);
            int var3 = 38 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method547(byte arg0) {
        if (arg0 != -95) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1401 == 0) {
            if (super.field30 == 1) {
                int var3 = super.field31 - 25 - 550;
                int var4 = super.field32 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field1611 + this.field1442 & 2047;
                    int var6 = Pix3D.field643[var5];
                    int var7 = Pix3D.field644[var5];
                    int var8 = (this.field1269 + 256) * var6 >> 8;
                    int var9 = (this.field1269 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field1374.field397 + var10 >> 7;
                    int var13 = field1374.field398 - var11 >> 7;
                    boolean var14 = this.method510(field1374.field448[0], 0, -35517, 0, 0, true, 1, field1374.field447[0], var12, 0, var13, 0);
                    if (var14) {
                        this.field1259.method219(var3);
                        this.field1259.method219(var4);
                        this.field1259.method220(this.field1442);
                        this.field1259.method219(57);
                        this.field1259.method219(this.field1611);
                        this.field1259.method219(this.field1269);
                        this.field1259.method219(89);
                        this.field1259.method220(field1374.field397);
                        this.field1259.method220(field1374.field398);
                        this.field1259.method219(this.field1593);
                        this.field1259.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        this.method530(9734);
        if (!arg0) {
            if (this.field1501 == 1) {
                this.field1659[this.field1500 / 100].method186(true, this.field1498 - 8 - 4, this.field1499 - 8 - 4);
            }
            if (this.field1501 == 2) {
                this.field1659[this.field1500 / 100 + 4].method186(true, this.field1498 - 8 - 4, this.field1499 - 8 - 4);
                ++field1552;
                if (field1552 > 57) {
                    field1552 = 0;
                    this.field1259.method218(this.field1236, 19);
                }
            }
            if (this.field1668 != -1) {
                this.method517(0, this.field1348, this.field1668);
                this.method487(0, 0, Component.field71[this.field1668], 0, this.field1493);
            }
            if (this.field1226 != -1) {
                this.method517(0, this.field1348, this.field1226);
                this.method487(0, 0, Component.field71[this.field1226], 0, this.field1493);
            }
            this.method475(false);
            if (!this.field1584) {
                this.method504((byte) 8);
                this.method546(453);
            } else if (this.field1433 == 0) {
                this.method512((byte) 110);
            }
            if (this.field1489 == 1) {
                this.field1492[1].method186(true, 472, 296);
            }
            if (field1572) {
                short var2 = 507;
                byte var3 = 20;
                int var4 = 16776960;
                if (super.field12 < 15) {
                    var4 = 16711680;
                }
                this.field1381.method201(var3, var2, var4, "Fps:" + super.field12, 108);
                int var12 = var3 + 15;
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                int var7 = 16776960;
                if (var6 > 33554432 && field1550) {
                    int var8 = 16711680;
                }
                this.field1381.method201(var12, var2, 16776960, "Mem:" + var6 + "k", 108);
                var12 += 15;
            }
            if (this.field1301 != 0) {
                int var9 = this.field1301 / 50;
                int var10 = var9 / 60;
                int var11 = var9 % 60;
                if (var11 < 10) {
                    this.field1381.method206("System update in: " + var10 + ":0" + var11, 1, 16776960, 329, 4);
                } else {
                    this.field1381.method206("System update in: " + var10 + ":" + var11, 1, 16776960, 329, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method549(int arg0, int arg1) {
        if (arg1 >= 2 && arg1 <= 2) {
            if (arg0 < 100000) {
                return String.valueOf(arg0);
            } else {
                return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method550(byte arg0) {
        if (arg0 == 100) {
            this.field1417 = true;
            for (int var2 = 0; var2 < 7; ++var2) {
                this.field1494[var2] = -1;
                for (int var3 = 0; var3 < IdkType.field1115; ++var3) {
                    if (!IdkType.field1116[var3].field1122 && IdkType.field1116[var3].field1117 == var2 + (this.field1569 ? 0 : 7)) {
                        this.field1494[var2] = var3;
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method551(int arg0, int arg1) {
        Component var3 = Component.field71[arg1];
        for (int var4 = 0; var4 < var3.field93.length && var3.field93[var4] != -1; ++var4) {
            Component var5 = Component.field71[var3.field93[var4]];
            if (var5.field78 == 1) {
                this.method551(664, var5.field76);
            }
            var5.field74 = 0;
            var5.field75 = 0;
        }
        if (arg0 <= 0) {
            this.field1294 = null;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method552(int arg0, Packet arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method240(this.field1310, 8);
            if (var4 < this.field1622) {
                for (int var5 = var4; var5 < this.field1622; ++var5) {
                    this.field1419[this.field1418++] = this.field1623[var5];
                }
            }
            if (var4 > this.field1622) {
                signlink.reporterror(this.field1654 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field1622 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1623[var6];
                    PlayerEntity var8 = this.field1621[var7];
                    int var9 = arg1.method240(this.field1310, 1);
                    if (var9 == 0) {
                        this.field1623[this.field1622++] = var7;
                        var8.field442 = field1275;
                    } else {
                        int var10 = arg1.method240(this.field1310, 2);
                        if (var10 == 0) {
                            this.field1623[this.field1622++] = var7;
                            var8.field442 = field1275;
                            this.field1625[this.field1624++] = var7;
                        } else if (var10 == 1) {
                            this.field1623[this.field1622++] = var7;
                            var8.field442 = field1275;
                            int var11 = arg1.method240(this.field1310, 3);
                            var8.method111(692, var11, false);
                            int var12 = arg1.method240(this.field1310, 1);
                            if (var12 == 1) {
                                this.field1625[this.field1624++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1623[this.field1622++] = var7;
                            var8.field442 = field1275;
                            int var13 = arg1.method240(this.field1310, 3);
                            var8.method111(692, var13, true);
                            int var14 = arg1.method240(this.field1310, 3);
                            var8.method111(692, var14, true);
                            int var15 = arg1.method240(this.field1310, 1);
                            if (var15 == 1) {
                                this.field1625[this.field1624++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1419[this.field1418++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method553(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1603 = "";
                this.field1604 = "Connecting to server...";
                this.method538(true, -810);
            }
            this.field1370 = new ClientStream(this.method545(field1548 + 43594), this, false);
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1259.field711 = 0;
            this.field1259.method219(14);
            this.field1259.method219(var6);
            this.field1370.method42((byte) 38, this.field1259.field710, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1370.method39();
            }
            int var8 = this.field1370.method39();
            int var9 = var8;
            if (var8 == 0) {
                this.field1370.method41(this.field1534.field710, 0, 8);
                this.field1534.field711 = 0;
                this.field1583 = this.field1534.method235(this.field1590);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1583 >> 32), (int) this.field1583 };
                this.field1259.field711 = 0;
                this.field1259.method219(10);
                this.field1259.method223(var10[0]);
                this.field1259.method223(var10[1]);
                this.field1259.method223(var10[2]);
                this.field1259.method223(var10[3]);
                this.field1259.method223(signlink.uid);
                this.field1259.method226(arg0);
                this.field1259.method226(arg1);
                this.field1259.method244(field1533, -473, field1267);
                this.field1551.field711 = 0;
                if (arg2) {
                    this.field1551.method219(18);
                } else {
                    this.field1551.method219(16);
                }
                this.field1551.method219(this.field1259.field711 + 36 + 1 + 1 + 2);
                this.field1551.method219(255);
                this.field1551.method220(303);
                this.field1551.method219(field1550 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field1551.method223(this.field1343[var11]);
                }
                this.field1551.method227(this.field1259.field711, 0, this.field1259.field710, true);
                this.field1259.field715 = new Isaac(var10, true);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field1416 = new Isaac(var10, true);
                this.field1370.method42((byte) 38, this.field1551.field710, 0, this.field1551.field711);
                var8 = this.field1370.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method553(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1432 = this.field1370.method39();
                field1385 = this.field1370.method39() == 1;
                this.field1553 = 0L;
                this.field1243 = 0;
                this.field1378.field995 = 0;
                super.field21 = true;
                this.field1308 = true;
                this.field1602 = true;
                this.field1259.field711 = 0;
                this.field1534.field711 = 0;
                this.field1467 = -1;
                this.field1338 = -1;
                this.field1339 = -1;
                this.field1340 = -1;
                this.field1466 = 0;
                this.field1468 = 0;
                this.field1301 = 0;
                this.field1470 = 0;
                this.field1272 = 0;
                this.field1390 = 0;
                this.field1584 = false;
                super.field22 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field1373[var13] = null;
                }
                this.field1425 = 0;
                this.field1645 = 0;
                this.field1288 = 0;
                this.field1503 = 0;
                this.field1282 = (int) (Math.random() * 100.0D) - 50;
                this.field1475 = (int) (Math.random() * 110.0D) - 55;
                this.field1448 = (int) (Math.random() * 80.0D) - 40;
                this.field1611 = (int) (Math.random() * 120.0D) - 60;
                this.field1269 = (int) (Math.random() * 30.0D) - 20;
                this.field1442 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1401 = 0;
                this.field1344 = -1;
                this.field1393 = 0;
                this.field1394 = 0;
                this.field1622 = 0;
                this.field1675 = 0;
                for (int var14 = 0; var14 < this.field1619; ++var14) {
                    this.field1621[var14] = null;
                    this.field1626[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field1674[var15] = null;
                }
                field1374 = this.field1621[this.field1620] = new PlayerEntity();
                this.field1596.method252();
                this.field1578.method252();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field1294[var16][var17][var18] = null;
                        }
                    }
                }
                this.field1399 = new LinkList(0);
                this.field1347 = 0;
                this.field1346 = 0;
                this.field1336 = -1;
                this.field1345 = -1;
                this.field1226 = -1;
                this.field1214 = -1;
                this.field1668 = -1;
                this.field1672 = false;
                this.field1438 = 3;
                this.field1615 = false;
                this.field1584 = false;
                this.field1613 = false;
                this.field1337 = null;
                this.field1489 = 0;
                this.field1439 = -1;
                this.field1569 = true;
                this.method550((byte) 100);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1530[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field1279[var20] = null;
                    this.field1280[var20] = false;
                }
                field1402 = 0;
                field1377 = 0;
                field1644 = 0;
                field1461 = 0;
                field1450 = 0;
                field1350 = 0;
                field1387 = 0;
                field1376 = 0;
                field1460 = 0;
                field1366 = 0;
                this.method554(-682);
            } else if (var8 == 3) {
                this.field1603 = "";
                this.field1604 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1603 = "Your account has been disabled.";
                this.field1604 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1603 = "Your account is already logged in.";
                this.field1604 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1603 = "RuneScape has been updated!";
                this.field1604 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1603 = "This world is full.";
                this.field1604 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1603 = "Unable to connect.";
                this.field1604 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1603 = "Login limit exceeded.";
                this.field1604 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1603 = "Unable to connect.";
                this.field1604 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1604 = "Login server rejected session.";
                this.field1604 = "Please try again.";
            } else if (var8 == 12) {
                this.field1603 = "You need a members account to login to this world.";
                this.field1604 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1603 = "Could not complete login.";
                this.field1604 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1603 = "The server is being updated.";
                this.field1604 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1602 = true;
                this.field1259.field711 = 0;
                this.field1534.field711 = 0;
                this.field1467 = -1;
                this.field1338 = -1;
                this.field1339 = -1;
                this.field1340 = -1;
                this.field1466 = 0;
                this.field1468 = 0;
                this.field1301 = 0;
                this.field1390 = 0;
                this.field1584 = false;
                this.field1455 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1603 = "Login attempts exceeded.";
                this.field1604 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1603 = "You are standing in a members-only area.";
                this.field1604 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1603 = "Invalid loginserver requested";
                this.field1604 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field1262 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field1262;
                            this.method553(arg0, arg1, arg2);
                        } else {
                            this.field1603 = "No response from loginserver";
                            this.field1604 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field1603 = "No response from server";
                        this.field1604 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field1603 = "Unexpected server response";
                    this.field1604 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field1370.method39(); var21 >= 0; --var21) {
                    this.field1603 = "You have only just left another world";
                    this.field1604 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method538(true, -810);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method553(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field1603 = "";
            this.field1604 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (this.field1454 == null) {
            this.method494(this.field1656);
            super.field17 = null;
            this.field1477 = null;
            this.field1478 = null;
            this.field1479 = null;
            this.field1480 = null;
            this.field1481 = null;
            this.field1482 = null;
            this.field1483 = null;
            this.field1484 = null;
            this.field1485 = null;
            if (arg0 < 0) {
                this.field1454 = new PixMap(479, 5, 96, this.method11(-914));
                this.field1452 = new PixMap(172, 5, 156, this.method11(-914));
                Pix2D.method155(this.field1289);
                this.field1516.method199(true, 0, 0);
                this.field1451 = new PixMap(190, 5, 261, this.method11(-914));
                this.field1453 = new PixMap(512, 5, 334, this.method11(-914));
                Pix2D.method155(this.field1289);
                this.field1537 = new PixMap(496, 5, 50, this.method11(-914));
                this.field1538 = new PixMap(269, 5, 37, this.method11(-914));
                this.field1539 = new PixMap(249, 5, 45, this.method11(-914));
                this.field1364 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method555(int arg0) {
        this.field1555 = 0;
        for (int var2 = -1; var2 < this.field1675 + this.field1622; ++var2) {
            PathingEntity var19;
            if (var2 == -1) {
                var19 = field1374;
            } else if (var2 < this.field1622) {
                var19 = this.field1621[this.field1623[var2]];
            } else {
                var19 = this.field1674[this.field1676[var2 - this.field1622]];
            }
            if (var19 != null && var19.method113(false)) {
                if (var19 instanceof NpcEntity) {
                    NpcType var20 = ((NpcEntity) var19).field455;
                    if (var20.field1032 != null) {
                        var20 = var20.method345((byte) 8);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field1622) {
                    NpcType var24 = ((NpcEntity) var19).field455;
                    if (var24.field1030 >= 0 && var24.field1030 < this.field1492.length) {
                        this.method491(true, var19, var19.field443 + 15);
                        if (this.field1605 > -1) {
                            this.field1492[var24.field1030].method186(true, this.field1605 - 12, this.field1606 - 30);
                        }
                    }
                    if (this.field1272 == 1 && this.field1676[var2 - this.field1622] == this.field1682 && field1275 % 20 < 10) {
                        this.method491(true, var19, var19.field443 + 15);
                        if (this.field1605 > -1) {
                            this.field1492[2].method186(true, this.field1605 - 12, this.field1606 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    PlayerEntity var22 = (PlayerEntity) var19;
                    if (var22.field463 != 0) {
                        this.method491(true, var19, var19.field443 + 15);
                        if (this.field1605 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field463 & 1 << var23) != 0) {
                                    this.field1492[var23].method186(true, this.field1605 - 12, this.field1606 - var21);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1272 == 10 && this.field1623[var2] == this.field1276) {
                        this.method491(true, var19, var19.field443 + 15);
                        if (this.field1605 > -1) {
                            this.field1492[7].method186(true, this.field1605 - 12, this.field1606 - var21);
                        }
                    }
                }
                if (var19.field409 != null && (var2 >= this.field1622 || this.field1598 == 0 || this.field1598 == 3 || this.field1598 == 1 && this.method445(true, ((PlayerEntity) var19).field460))) {
                    this.method491(true, var19, var19.field443);
                    if (this.field1605 > -1 && this.field1555 < this.field1556) {
                        this.field1560[this.field1555] = this.field1382.method205((byte) -47, var19.field409) / 2;
                        this.field1559[this.field1555] = this.field1382.field698;
                        this.field1557[this.field1555] = this.field1605;
                        this.field1558[this.field1555] = this.field1606;
                        this.field1561[this.field1555] = var19.field411;
                        this.field1562[this.field1555] = var19.field412;
                        this.field1563[this.field1555] = var19.field410;
                        this.field1564[this.field1555++] = var19.field409;
                        if (this.field1663 == 0 && var19.field412 >= 1 && var19.field412 <= 3) {
                            this.field1559[this.field1555] += 10;
                            this.field1558[this.field1555] += 5;
                        }
                        if (this.field1663 == 0 && var19.field412 == 4) {
                            this.field1560[this.field1555] = 60;
                        }
                        if (this.field1663 == 0 && var19.field412 == 5) {
                            this.field1559[this.field1555] += 5;
                        }
                    }
                }
                if (var19.field416 > field1275) {
                    this.method491(true, var19, var19.field443 + 15);
                    if (this.field1605 > -1) {
                        int var25 = var19.field417 * 30 / var19.field418;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        Pix2D.method157(this.field1605 - 15, var25, 65280, false, this.field1606 - 3, 5);
                        Pix2D.method157(this.field1605 - 15 + var25, 30 - var25, 16711680, false, this.field1606 - 3, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field415[var26] > field1275) {
                        this.method491(true, var19, var19.field443 / 2);
                        if (this.field1605 > -1) {
                            if (var26 == 1) {
                                this.field1606 -= 20;
                            }
                            if (var26 == 2) {
                                this.field1605 -= 15;
                                this.field1606 -= 10;
                            }
                            if (var26 == 3) {
                                this.field1605 += 15;
                                this.field1606 -= 10;
                            }
                            this.field1379[var19.field414[var26]].method186(true, this.field1605 - 12, this.field1606 - 12);
                            this.field1380.method202(String.valueOf(var19.field413[var26]), this.field1307, this.field1606 + 4, 0, this.field1605);
                            this.field1380.method202(String.valueOf(var19.field413[var26]), this.field1307, this.field1606 + 3, 16777215, this.field1605 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1555; ++var3) {
            int var4 = this.field1557[var3];
            int var5 = this.field1558[var3];
            int var6 = this.field1560[var3];
            int var7 = this.field1559[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field1558[var18] - this.field1559[var18] && var5 - var7 < this.field1558[var18] + 2 && var4 - var6 < this.field1560[var18] + this.field1557[var18] && var4 + var6 > this.field1557[var18] - this.field1560[var18] && this.field1558[var18] - this.field1559[var18] < var5) {
                        var5 = this.field1558[var18] - this.field1559[var18];
                        var8 = true;
                    }
                }
            }
            this.field1605 = this.field1557[var3];
            this.field1606 = this.field1558[var3] = var5;
            String var9 = this.field1564[var3];
            if (this.field1663 == 0) {
                int var10 = 16776960;
                if (this.field1561[var3] < 6) {
                    var10 = this.field1389[this.field1561[var3]];
                }
                if (this.field1561[var3] == 6) {
                    var10 = this.field1446 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1561[var3] == 7) {
                    var10 = this.field1446 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1561[var3] == 8) {
                    var10 = this.field1446 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1561[var3] == 9) {
                    int var11 = 150 - this.field1563[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1561[var3] == 10) {
                    int var12 = 150 - this.field1563[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1561[var3] == 11) {
                    int var13 = 150 - this.field1563[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1562[var3] == 0) {
                    this.field1382.method202(var9, this.field1307, this.field1606 + 1, 0, this.field1605);
                    this.field1382.method202(var9, this.field1307, this.field1606, var10, this.field1605);
                }
                if (this.field1562[var3] == 1) {
                    this.field1382.method207(var9, 0, this.field1605, this.field1446, this.field1606 + 1, (byte) 0);
                    this.field1382.method207(var9, var10, this.field1605, this.field1446, this.field1606, (byte) 0);
                }
                if (this.field1562[var3] == 2) {
                    this.field1382.method208(this.field1446, var9, 0, false, this.field1606 + 1, this.field1605);
                    this.field1382.method208(this.field1446, var9, var10, false, this.field1606, this.field1605);
                }
                if (this.field1562[var3] == 3) {
                    this.field1382.method209(this.field1606 + 1, this.field1605, 150 - this.field1563[var3], this.field1457, 0, var9, this.field1446);
                    this.field1382.method209(this.field1606, this.field1605, 150 - this.field1563[var3], this.field1457, var10, var9, this.field1446);
                }
                if (this.field1562[var3] == 4) {
                    int var14 = this.field1382.method205((byte) -47, var9);
                    int var15 = (150 - this.field1563[var3]) * (var14 + 100) / 150;
                    Pix2D.method154(false, 0, this.field1605 - 50, 334, this.field1605 + 50);
                    this.field1382.method206(var9, 1, 0, this.field1606 + 1, this.field1605 + 50 - var15);
                    this.field1382.method206(var9, 1, var10, this.field1606, this.field1605 + 50 - var15);
                    Pix2D.method153(true);
                }
                if (this.field1562[var3] == 5) {
                    int var16 = 150 - this.field1563[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    Pix2D.method154(false, this.field1606 - this.field1382.field698 - 1, 0, this.field1606 + 5, 512);
                    this.field1382.method202(var9, this.field1307, this.field1606 + 1 + var17, 0, this.field1605);
                    this.field1382.method202(var9, this.field1307, this.field1606 + var17, var10, this.field1605);
                    Pix2D.method153(true);
                }
            } else {
                this.field1382.method202(var9, this.field1307, this.field1606 + 1, 0, this.field1605);
                this.field1382.method202(var9, this.field1307, this.field1606, 16776960, this.field1605);
            }
        }
        while (arg0 >= 0) {
            this.field1665 = -378;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;Lab;IZ)V")
    private final void method556(int arg0, Packet arg1, PlayerEntity arg2, int arg3, boolean arg4) {
        if (arg4) {
            if ((arg0 & 1) == 1) {
                int var6 = arg1.method229();
                byte[] var7 = new byte[var6];
                Packet var8 = new Packet(var7, 58);
                arg1.method238(0, var6, var7, false);
                this.field1626[arg3] = var8;
                arg2.method116(var8, true);
            }
            if ((arg0 & 2) == 2) {
                int var9 = arg1.method231();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (arg2.field425 == var9) {
                    arg2.field429 = 0;
                }
                int var10 = arg1.method229();
                if (arg2.field425 == var9 && var9 != -1) {
                    int var11 = SeqType.field1135[var9].field1149;
                    if (var11 == 1) {
                        arg2.field426 = 0;
                        arg2.field427 = 0;
                        arg2.field428 = var10;
                        arg2.field429 = 0;
                    }
                    if (var11 == 2) {
                        arg2.field429 = 0;
                    }
                } else if (var9 == -1 || arg2.field425 == -1 || SeqType.field1135[var9].field1143 >= SeqType.field1135[arg2.field425].field1143) {
                    arg2.field425 = var9;
                    arg2.field426 = 0;
                    arg2.field427 = 0;
                    arg2.field428 = var10;
                    arg2.field429 = 0;
                    arg2.field451 = arg2.field446;
                }
            }
            if ((arg0 & 4) == 4) {
                arg2.field419 = arg1.method231();
                if (arg2.field419 == 65535) {
                    arg2.field419 = -1;
                }
            }
            if ((arg0 & 8) == 8) {
                arg2.field409 = arg1.method236();
                if (arg2.field409.charAt(0) == '~') {
                    arg2.field409 = arg2.field409.substring(1);
                    this.method519(true, 2, arg2.field409, arg2.field460);
                } else if (field1374 == arg2) {
                    this.method519(true, 2, arg2.field409, arg2.field460);
                }
                arg2.field411 = 0;
                arg2.field412 = 0;
                arg2.field410 = 150;
            }
            if ((arg0 & 16) == 16) {
                int var12 = arg1.method229();
                int var13 = arg1.method229();
                arg2.method114((byte) 2, var13, field1275, var12);
                arg2.field416 = field1275 + 300;
                arg2.field417 = arg1.method229();
                arg2.field418 = arg1.method229();
            }
            if ((arg0 & 32) == 32) {
                arg2.field420 = arg1.method231();
                arg2.field421 = arg1.method231();
            }
            if ((arg0 & 64) == 64) {
                int var14 = arg1.method231();
                int var15 = arg1.method229();
                int var16 = arg1.method229();
                int var17 = arg1.field711;
                if (arg2.field460 != null && arg2.field461) {
                    long var18 = JString.method300(arg2.field460);
                    boolean var20 = false;
                    if (var15 <= 1) {
                        for (int var21 = 0; var21 < this.field1512; ++var21) {
                            if (this.field1677[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                    if (!var20 && this.field1328 == 0) {
                        try {
                            String var22 = WordPack.method306(arg1, var16, 0);
                            String var23 = WordFilter.method401((byte) 59, var22);
                            arg2.field409 = var23;
                            arg2.field411 = var14 >> 8;
                            arg2.field412 = var14 & 255;
                            arg2.field410 = 150;
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method519(true, 1, var23, "@cr1@" + arg2.field460);
                                } else {
                                    this.method519(true, 2, var23, arg2.field460);
                                }
                            } else {
                                this.method519(true, 1, var23, "@cr2@" + arg2.field460);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg1.field711 = var16 + var17;
            }
            if ((arg0 & 256) == 256) {
                arg2.field430 = arg1.method231();
                int var25 = arg1.method234();
                arg2.field434 = var25 >> 16;
                arg2.field433 = (var25 & 65535) + field1275;
                arg2.field431 = 0;
                arg2.field432 = 0;
                if (arg2.field433 > field1275) {
                    arg2.field431 = -1;
                }
                if (arg2.field430 == 65535) {
                    arg2.field430 = -1;
                }
            }
            if ((arg0 & 512) == 512) {
                arg2.field435 = arg1.method229();
                arg2.field437 = arg1.method229();
                arg2.field436 = arg1.method229();
                arg2.field438 = arg1.method229();
                arg2.field439 = arg1.method231() + field1275;
                arg2.field440 = arg1.method231() + field1275;
                arg2.field441 = arg1.method229();
                arg2.method112(0);
            }
            if ((arg0 & 1024) == 1024) {
                int var26 = arg1.method229();
                int var27 = arg1.method229();
                arg2.method114((byte) 2, var27, field1275, var26);
                arg2.field416 = field1275 + 300;
                arg2.field417 = arg1.method229();
                arg2.field418 = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method557(int arg0) {
        this.field1454.method258((byte) 4);
        Pix3D.field645 = this.field1317;
        this.field1517.method199(true, 0, 0);
        if (this.field1613) {
            this.field1382.method202(this.field1313, this.field1307, 40, 0, 239);
            this.field1382.method202(this.field1545 + "*", this.field1307, 60, 128, 239);
        } else if (this.field1615) {
            this.field1382.method202("Enter amount:", this.field1307, 40, 0, 239);
            this.field1382.method202(this.field1544 + "*", this.field1307, 60, 128, 239);
        } else if (this.field1337 != null) {
            this.field1382.method202(this.field1337, this.field1307, 40, 0, 239);
            this.field1382.method202("Click to continue", this.field1307, 60, 128, 239);
        } else if (this.field1345 != -1) {
            this.method487(0, 0, Component.field71[this.field1345], 0, this.field1493);
        } else if (this.field1336 != -1) {
            this.method487(0, 0, Component.field71[this.field1336], 0, this.field1493);
        } else {
            PixFont var2 = this.field1381;
            int var3 = 0;
            Pix2D.method154(false, 0, 0, 77, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1373[var4] != null) {
                    int var6 = this.field1371[var4];
                    int var7 = 70 - var3 * 14 + this.field1532;
                    String var8 = this.field1372[var4];
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
                            var2.method206(this.field1373[var4], 1, 0, var7, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1598 == 0 || this.field1598 == 1 && this.method445(true, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1237[0].method199(true, var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1237[1].method199(true, var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method206(var8 + ":", 1, 0, var7, var10);
                            int var11 = var10 + var2.method204((byte) 5, var8) + 8;
                            var2.method206(this.field1373[var4], 1, 255, var7, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1291 == 0 && (var6 == 7 || this.field1414 == 0 || this.field1414 == 1 && this.method445(true, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method206("From", 1, 0, var7, var12);
                            int var13 = var12 + var2.method204((byte) 5, "From ");
                            if (var9 == 1) {
                                this.field1237[0].method199(true, var13, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1237[1].method199(true, var13, var7 - 12);
                                var13 += 14;
                            }
                            var2.method206(var8 + ":", 1, 0, var7, var13);
                            int var14 = var13 + var2.method204((byte) 5, var8) + 8;
                            var2.method206(this.field1373[var4], 1, 8388608, var7, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1528 == 0 || this.field1528 == 1 && this.method445(true, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var8 + " " + this.field1373[var4], 1, 8388736, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1291 == 0 && this.field1414 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(this.field1373[var4], 1, 8388608, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1291 == 0 && this.field1414 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206("To " + var8 + ":", 1, 0, var7, 4);
                            var2.method206(this.field1373[var4], 1, 8388608, var7, 12 + var2.method204((byte) 5, "To " + var8));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1528 == 0 || this.field1528 == 1 && this.method445(true, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var8 + " " + this.field1373[var4], 1, 8270336, var7, 4);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method153(true);
            this.field1246 = var3 * 14 + 7;
            if (this.field1246 < 78) {
                this.field1246 = 78;
            }
            this.method528((byte) 2, 0, this.field1246, this.field1246 - this.field1532 - 77, 463, 77);
            String var5;
            if (field1374 != null && field1374.field460 != null) {
                var5 = field1374.field460;
            } else {
                var5 = JString.method304(this.field1654, 789);
            }
            var2.method206(var5 + ":", 1, 0, 90, 4);
            var2.method206(this.field1535 + "*", 1, 255, 90, 6 + var2.method204((byte) 5, var5 + ": "));
            Pix2D.method160(0, 479, false, 0, 77);
        }
        if (this.field1584 && this.field1433 == 2) {
            this.method512((byte) 110);
        }
        this.field1454.method259(super.field16, 357, 17, (byte) 8);
        this.field1453.method258((byte) 4);
        if (arg0 < 8 || arg0 > 8) {
            this.field1656 = this.field1416.method295();
        }
        Pix3D.field645 = this.field1319;
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1425 == 0 && this.field1645 == 0) {
            this.field1511[this.field1390] = "Walk here";
            this.field1233[this.field1390] = 718;
            this.field1231[this.field1390] = super.field24;
            this.field1232[this.field1390] = super.field25;
            ++this.field1390;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < Model.field602; ++var4) {
            int var5 = Model.field603[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field1614.method80(this.field1546, var6, var7, var5) >= 0) {
                    LocType var10 = LocType.method330(var9);
                    if (var10.field986 != null) {
                        var10 = var10.method338(this.field1661);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field1425 == 1) {
                        this.field1511[this.field1390] = "Use " + this.field1429 + " with @cya@" + var10.field955;
                        this.field1233[this.field1390] = 810;
                        this.field1234[this.field1390] = var5;
                        this.field1231[this.field1390] = var6;
                        this.field1232[this.field1390] = var7;
                        ++this.field1390;
                    } else if (this.field1645 == 1) {
                        if ((this.field1647 & 4) == 4) {
                            this.field1511[this.field1390] = this.field1648 + " @cya@" + var10.field955;
                            this.field1233[this.field1390] = 899;
                            this.field1234[this.field1390] = var5;
                            this.field1231[this.field1390] = var6;
                            this.field1232[this.field1390] = var7;
                            ++this.field1390;
                        }
                    } else {
                        if (var10.field971 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field971[var11] != null) {
                                    this.field1511[this.field1390] = var10.field971[var11] + " @cya@" + var10.field955;
                                    if (var11 == 0) {
                                        this.field1233[this.field1390] = 625;
                                    }
                                    if (var11 == 1) {
                                        this.field1233[this.field1390] = 721;
                                    }
                                    if (var11 == 2) {
                                        this.field1233[this.field1390] = 743;
                                    }
                                    if (var11 == 3) {
                                        this.field1233[this.field1390] = 357;
                                    }
                                    if (var11 == 4) {
                                        this.field1233[this.field1390] = 1071;
                                    }
                                    this.field1234[this.field1390] = var5;
                                    this.field1231[this.field1390] = var6;
                                    this.field1232[this.field1390] = var7;
                                    ++this.field1390;
                                }
                            }
                        }
                        this.field1511[this.field1390] = "Examine @cya@" + var10.field955;
                        this.field1233[this.field1390] = 1381;
                        this.field1234[this.field1390] = var10.field952 << 14;
                        this.field1231[this.field1390] = var6;
                        this.field1232[this.field1390] = var7;
                        ++this.field1390;
                    }
                }
                if (var8 == 1) {
                    NpcEntity var12 = this.field1674[var9];
                    if (var12.field455.field1009 == 1 && (var12.field397 & 127) == 64 && (var12.field398 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field1675; ++var13) {
                            NpcEntity var16 = this.field1674[this.field1676[var13]];
                            if (var16 != null && var12 != var16 && var16.field455.field1009 == 1 && var12.field397 == var16.field397 && var12.field398 == var16.field398) {
                                this.method527(this.field1676[var13], false, var7, var6, var16.field455);
                            }
                        }
                        for (int var14 = 0; var14 < this.field1622; ++var14) {
                            PlayerEntity var15 = this.field1621[this.field1623[var14]];
                            if (var15 != null && var12.field397 == var15.field397 && var12.field398 == var15.field398) {
                                this.method537(this.field1623[var14], var15, var7, var6, this.field1519);
                            }
                        }
                    }
                    this.method527(var9, false, var7, var6, var12.field455);
                }
                if (var8 == 0) {
                    PlayerEntity var17 = this.field1621[var9];
                    if ((var17.field397 & 127) == 64 && (var17.field398 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field1675; ++var18) {
                            NpcEntity var21 = this.field1674[this.field1676[var18]];
                            if (var21 != null && var21.field455.field1009 == 1 && var17.field397 == var21.field397 && var17.field398 == var21.field398) {
                                this.method527(this.field1676[var18], false, var7, var6, var21.field455);
                            }
                        }
                        for (int var19 = 0; var19 < this.field1622; ++var19) {
                            PlayerEntity var20 = this.field1621[this.field1623[var19]];
                            if (var20 != null && var17 != var20 && var17.field397 == var20.field397 && var17.field398 == var20.field398) {
                                this.method537(this.field1623[var19], var20, var7, var6, this.field1519);
                            }
                        }
                    }
                    this.method537(var9, var17, var7, var6, this.field1519);
                }
                if (var8 == 3) {
                    LinkList var22 = this.field1294[this.field1546][var6][var7];
                    if (var22 != null) {
                        for (ObjStackEntity var23 = (ObjStackEntity) var22.method249(true); var23 != null; var23 = (ObjStackEntity) var22.method251((byte) 1)) {
                            ObjType var24 = ObjType.method348(var23.field500);
                            if (this.field1425 == 1) {
                                this.field1511[this.field1390] = "Use " + this.field1429 + " with @lre@" + var24.field1047;
                                this.field1233[this.field1390] = 111;
                                this.field1234[this.field1390] = var23.field500;
                                this.field1231[this.field1390] = var6;
                                this.field1232[this.field1390] = var7;
                                ++this.field1390;
                            } else if (this.field1645 == 1) {
                                if ((this.field1647 & 1) == 1) {
                                    this.field1511[this.field1390] = this.field1648 + " @lre@" + var24.field1047;
                                    this.field1233[this.field1390] = 370;
                                    this.field1234[this.field1390] = var23.field500;
                                    this.field1231[this.field1390] = var6;
                                    this.field1232[this.field1390] = var7;
                                    ++this.field1390;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1061 != null && var24.field1061[var25] != null) {
                                        this.field1511[this.field1390] = var24.field1061[var25] + " @lre@" + var24.field1047;
                                        if (var25 == 0) {
                                            this.field1233[this.field1390] = 139;
                                        }
                                        if (var25 == 1) {
                                            this.field1233[this.field1390] = 778;
                                        }
                                        if (var25 == 2) {
                                            this.field1233[this.field1390] = 617;
                                        }
                                        if (var25 == 3) {
                                            this.field1233[this.field1390] = 224;
                                        }
                                        if (var25 == 4) {
                                            this.field1233[this.field1390] = 662;
                                        }
                                        this.field1234[this.field1390] = var23.field500;
                                        this.field1231[this.field1390] = var6;
                                        this.field1232[this.field1390] = var7;
                                        ++this.field1390;
                                    } else if (var25 == 2) {
                                        this.field1511[this.field1390] = "Take @lre@" + var24.field1047;
                                        this.field1233[this.field1390] = 617;
                                        this.field1234[this.field1390] = var23.field500;
                                        this.field1231[this.field1390] = var6;
                                        this.field1232[this.field1390] = var7;
                                        ++this.field1390;
                                    }
                                }
                                this.field1511[this.field1390] = "Examine @lre@" + var24.field1047;
                                this.field1233[this.field1390] = 1152;
                                this.field1234[this.field1390] = var23.field500;
                                this.field1231[this.field1390] = var6;
                                this.field1232[this.field1390] = var7;
                                ++this.field1390;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)I")
    public final int method559(boolean arg0) {
        int var2 = 3;
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1334 < 310) {
            int var4 = this.field1331 >> 7;
            int var5 = this.field1333 >> 7;
            int var6 = field1374.field397 >> 7;
            int var7 = field1374.field398 >> 7;
            if ((this.field1658[this.field1546][var4][var5] & 4) != 0) {
                var2 = this.field1546;
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
                    if ((this.field1658[this.field1546][var4][var5] & 4) != 0) {
                        var2 = this.field1546;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field1658[this.field1546][var4][var5] & 4) != 0) {
                            var2 = this.field1546;
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
                    if ((this.field1658[this.field1546][var4][var5] & 4) != 0) {
                        var2 = this.field1546;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1658[this.field1546][var4][var5] & 4) != 0) {
                            var2 = this.field1546;
                        }
                    }
                }
            }
        }
        if ((this.field1658[this.field1546][field1374.field397 >> 7][field1374.field398 >> 7] & 4) != 0) {
            var2 = this.field1546;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)I")
    public final int method560(byte arg0) {
        int var2 = this.method513(this.field1592, this.field1546, this.field1331, this.field1333);
        if (arg0 != 1) {
            this.field1590 = this.field1416.method295();
        }
        return var2 - this.field1332 < 800 && (this.field1658[this.field1546][this.field1331 >> 7][this.field1333 >> 7] & 4) != 0 ? this.field1546 : 3;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (!this.field1386 && !this.field1260 && !this.field1349) {
            ++field1275;
            if (this.field1474 != arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field1602) {
                this.method507(80);
            } else {
                this.method498(this.field1580);
            }
            this.method452(0);
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    private final void method561(int arg0) {
        if (arg0 != 0) {
            this.field1554 = this.field1416.method295();
        }
        if (this.field1288 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1399.method248(); var2 != null; var2 = (LocSpawned) this.field1399.method250((byte) 8)) {
                if (var2.field740 > 0) {
                    --var2.field740;
                }
                if (var2.field740 == 0) {
                    if (var2.field733 < 0 || World.method30(var2.field735, 8, var2.field733)) {
                        this.method506(var2.field733, var2.field729, var2.field731, var2.field732, 0, var2.field730, var2.field735, var2.field734);
                        var2.method106();
                    }
                } else {
                    if (var2.field739 > 0) {
                        --var2.field739;
                    }
                    if (var2.field739 == 0 && var2.field731 >= 1 && var2.field732 >= 1 && var2.field731 <= 102 && var2.field732 <= 102 && (var2.field736 < 0 || World.method30(var2.field738, 8, var2.field736))) {
                        this.method506(var2.field736, var2.field729, var2.field731, var2.field732, 0, var2.field730, var2.field738, var2.field737);
                        var2.field739 = -1;
                        if (var2.field736 == var2.field733 && var2.field733 == -1) {
                            var2.method106();
                        } else if (var2.field736 == var2.field733 && var2.field737 == var2.field734 && var2.field738 == var2.field735) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public final void method562(byte arg0) {
        int var2 = 5;
        this.field1343[8] = 0;
        int var3 = 0;
        if (arg0 == 51) {
            while (this.field1343[8] == 0) {
                String var4 = "Unknown problem";
                this.method13("Connecting to web server", -761, 20);
                try {
                    DataInputStream var5 = this.method448("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 303);
                    Packet var6 = new Packet(new byte[40], 58);
                    var5.readFully(var6.field710, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field1343[var7] = var6.method234();
                    }
                    int var8 = var6.method234();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field1343[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field1343[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field1343[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field1343[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field1343[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field1343[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method13("Game updated - please reload page", -761, 10);
                            var11 = 10;
                        } else {
                            this.method13(var4 + " - Will retry in " + var11 + " secs.", -761, 10);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var12) {
                        }
                    }
                    var2 *= 2;
                    if (var2 > 60) {
                        var2 = 60;
                    }
                    this.field1353 = !this.field1353;
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
            field1506[var1] = var0 / 4;
        }
        field1520 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1520[var3] = var2 - 1;
            var2 += var2;
        }
        field1533 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1547 = 10;
        field1549 = true;
        field1591 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1669 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
